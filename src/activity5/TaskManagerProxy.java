package activity5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class TaskManagerProxy implements InvocationHandler{
	Object obj;
	public TaskManagerProxy(Object obj) {
		this.obj = obj;
	}	
	public static Object createProxy(Object object){
		return Proxy.newProxyInstance(object.getClass().getClassLoader(), 
				object.getClass().getInterfaces(), new TaskManagerProxy(object));
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) {

		Object result = null;
		try {
			System.out.println("Checking task list before " +  method.getName() + " method call....");
			result = method.invoke(obj, args);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		System.out.println("Checking task list after " +  method.getName() + " method call....");	
		return result;
	}
}


package activity3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassSpy3 {
	public static void main(String[] args) {
		String className = "activity3.Paragraph";
		try {
			Class cls = Class.forName(className);
			Object obj = cls.newInstance();
			Method addMethod = cls.getMethod("add", new Class[]{String.class});
			addMethod.invoke(obj, new Object[]{"Bu"});
			addMethod.invoke(obj, new Object[]{"gun"});
			addMethod.invoke(obj, new Object[]{"hava"});
			addMethod.invoke(obj, new Object[]{"guzel."});
			Method showMethod = cls.getMethod("show", null);
			showMethod.invoke(obj, null);			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} 		
	}
}

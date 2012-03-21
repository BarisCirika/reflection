package activity4;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassSpy4 {
	public static void main(String[] args) {
		String className = "activity4.Square";
		try {
			Class cls = Class.forName(className);
			Object obj = cls.newInstance();
			Field f = cls.getDeclaredField("side");
			f.setAccessible(true);
			f.set(obj, new Integer(8));			
			Method addMethod = cls.getMethod("area", null);
			Double value = (Double) addMethod.invoke(obj, null);
			System.out.println("Area:" +  value.doubleValue());
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
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
	}
}

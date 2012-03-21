package activity2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassSpy2 {
	public static void main(String[] args) {
		String className = "activity2.Student";
		String cn = ".Users.DjSuLh.Desktop.JavaWorkspace.chat.src.Client.java";
		try {
			Class cls = Class.forName(className);
			Class[] types = new Class[3];
			types[0] = Integer.TYPE;
			types[1] = String.class;
			types[2] = String.class;			
			Constructor c  = cls.getConstructor(types);			
			Object[] objects = new Object[3];
			objects[0] = new Integer(1);
			objects[1] = "John";
			objects[2] = "Smith";
			Student student = (Student)c.newInstance(objects);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}		
	}
}

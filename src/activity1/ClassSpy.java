package activity1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ClassSpy {
	
	public static void main(String[] args) {
		//String className = JOptionPane.showInputDialog("Enter class name:");
		try {
			Class cls = Class.forName("java.util.List");
			System.out.println("Class Name: " + cls.getCanonicalName());
			System.out.println("**************************************");
			System.out.println("Class Modifier: " + Modifier.toString(cls.getModifiers()));
			System.out.println("**************************************");		
			Type[] interfaces = cls.getInterfaces();
			System.out.println("Implementing Interfaces:");
			if(interfaces != null){
				for(Type t:interfaces)
					System.out.println(t.toString());
			}else{
				System.out.println("No interfaces implemented");
			}
			System.out.println("**************************************");		

			System.out.println("Superclasses:");
			Class superclasses = cls.getSuperclass();
			List<Class> classes = new ArrayList<Class>();
			if (superclasses != null){
				while(superclasses != null){
					classes.add(superclasses);
					superclasses = superclasses.getSuperclass();
				}
				for (Class c: classes) {
					System.out.println(c.getCanonicalName());
				}
			}else{
				System.out.println("There is no superclass");
			}
			System.out.println("**************************************");		

			Method[] methods = cls.getDeclaredMethods();
			System.out.println("There are " + methods.length + " methods.");
			for (int i = 1; i <= methods.length ; i++) {
				Method m = methods[i-1];
				System.out.println("Method " + i + " is " + m.getName());				
				System.out.println("Method " + i + " has " + 
						Modifier.toString(m.getModifiers()) + " as modifiers ");				
				System.out.println("Method " + i + " has " + m.getReturnType() + " as return type");				
				System.out.println("Method " + i + " has " + m.getParameterTypes().length + " parameters.");				
			}
			System.out.println("**************************************");
			Field[] fields = cls.getDeclaredFields();
			System.out.println("There are " + fields.length + " fields.");
			for (int i = 1; i <= fields.length ; i++) {
				Field f = fields[i-1];
				System.out.println("Field " + i + " is " + f.getName());	
				System.out.println("Field " + i + " has type " + f.getType());	
			}
			System.out.println("**************************************");


		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}


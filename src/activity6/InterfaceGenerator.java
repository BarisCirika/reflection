package activity6;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class InterfaceGenerator {
	
	private String content="";
	
	
	public InterfaceGenerator(String className) {
		String classDisplayName;
		try {
			Class cls = Class.forName(className);
			classDisplayName = cls.getSimpleName();
			content += "public interface " + classDisplayName + "Interface { \n\n";
			Method[] methods = cls.getDeclaredMethods();
			for(Method m: methods){
				Class returnType = m.getReturnType();
				if (m.getModifiers() == Modifier.PUBLIC){
					content += "\tpublic " + returnType.getSimpleName() + " " + m.getName();
					Class[] parameters = m.getParameterTypes();
					if(parameters == null){
						content += "();";
					}else{
						content +="(";
						int i = 0;
						for (Class c: parameters) {
							if (i == parameters.length-1){
								content += c.getSimpleName() + " args"+i;
							}else{
								content += c.getSimpleName() + " args"+i +" , ";								
							}
							i++;
						}
						content += "); \n";
					}
				
				}
				
			}
			content +="\n }";
			System.out.println(content);
			writeToFile(classDisplayName+"Interface.java", content);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void writeToFile(String fileName, String content) {
		PrintWriter out = null;
		try {
			out = new PrintWriter(new FileWriter(fileName));
			out.println(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			out.close();
		}
		
	}

	public static void main(String[] args) {
		InterfaceGenerator generator = new InterfaceGenerator("activity6.Sample");
	}
}

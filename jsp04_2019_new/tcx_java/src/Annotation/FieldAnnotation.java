package Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class FieldAnnotation {
	@MyAnnotation(id = 01)
	private int myField;
	
	@MyAnnotation(id = 02, name = "Method Annotation")
	private void MyMethod(String age)
	{
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class<?> aClass = FieldAnnotation.class;
		
		Field field = aClass.getDeclaredField("myField");
		Annotation fieldAnn = field.getAnnotation(MyAnnotation.class);
		MyAnnotation fieldAnnItem = (MyAnnotation)fieldAnn;
		System.out.println(fieldAnnItem.id());
		System.out.println("-----------------------------");
		Method method = aClass.getDeclaredMethod("MyMethod", String.class);
		Annotation methodAnn = method.getAnnotation(MyAnnotation.class);
		MyAnnotation methodAnnItem = (MyAnnotation)methodAnn;
		System.out.println(methodAnnItem.id());
		System.out.println(methodAnnItem.name());	
	}

}

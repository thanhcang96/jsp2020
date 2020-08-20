package Annotation;

import java.lang.annotation.Annotation;
@MyAnnotation(id = 01, name = "ntc")
public class MainAnnotation {
	
	public static void main(String[] args)
	{
		Class<?> aClass = MainAnnotation.class;
		Annotation ann = aClass.getAnnotation(MyAnnotation.class);
		MyAnnotation MyAnn = (MyAnnotation)ann;
		System.out.println(MyAnn.id());
		System.out.println(MyAnn.name());
	}
}

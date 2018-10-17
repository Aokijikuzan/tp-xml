package spring.tp_xml;

import javax.naming.Context;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("/xmlFile/applicationContext.xml");
		System.out.println("context loaded!");
		System.out.println("--------------------");
		MyObject objA=(MyObject)context.getBean("myObject1");
		MyObject obj=(MyObject)context.getBean("myObject2");
		System.out.println("Object"+objA);
		System.out.println("--------------------");
		System.out.println(objA.getName() +"->"+obj.getParent().getName());
	}

}

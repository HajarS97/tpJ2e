package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import packageMetier.IMetier;

public class PresentationSpringXml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		IMetier metier = ctx.getBean(IMetier.class);
		System.out.println("Spring Xml");
		System.out.println(metier.calcul());
		
	}
}

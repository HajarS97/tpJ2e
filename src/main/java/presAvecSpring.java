import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import packageMetier.IMetier;

public class presAvecSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext("ext","packageMetier");
		IMetier metier = ctx.getBean(IMetier.class);
		System.out.println("Spring Annotation");
		System.out.println(metier.calcul());
	}

}

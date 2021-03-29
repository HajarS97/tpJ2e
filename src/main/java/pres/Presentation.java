package pres;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;
import packageDao.DaoImp;
import packageDao.IDao;
import packageMetier.IMetier;
import packageMetier.MetierImpl;

public class Presentation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Injection des dépendances par instanciation statique 
		/*		
 		DaoImp dao = new DaoImp(); 		
		MetierImpl metier = new MetierImpl();
		metier.setDao(dao);
		System.out.println(metier.calcul());
		*/
		
		//Scanner s = new Scanner(new File("config.txt"));
		
	 	Scanner s = new Scanner(new File("config.txt"));
		String daoClassName = s.nextLine();
		Class cDao = Class.forName(daoClassName);
		IDao dao = (IDao) cDao.newInstance();
		//System.out.println(dao.getData());
		
		String metierClassName = s.nextLine();
		Class cMetier = Class.forName(metierClassName);
		IMetier metier = (IMetier) cMetier.newInstance(); 
		Method m = cMetier.getMethod("setDao", IDao.class);
		m.invoke(metier, dao);
		System.out.println(metier.calcul());	 
		
	
	 }

}

package ext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import packageDao.IDao;
@Repository 
public class DaoImp2 implements IDao  {

	@Override
	public double getData() {
		// TODO Auto-generated method stub
		
		System.out.println("version web service");
		double data=12;
		return data;
	}

}

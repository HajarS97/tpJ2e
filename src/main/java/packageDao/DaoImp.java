package packageDao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository(value="dao")
public class DaoImp implements IDao {

	@Override
	public double getData() {
		// TODO Auto-generated method stub
		System.out.println("Version base de donnees");
		double temp = 23;		
		return temp;
	}

	
}

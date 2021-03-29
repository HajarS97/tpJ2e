package packageMetier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import packageDao.IDao;
@Service("metier")
public class MetierImpl implements IMetier {
	// couplage faible
	
	@Autowired 
	private IDao dao;
	@Override
	public double calcul() {
		double  t = dao.getData(); 
		double res = t*Math.PI; 
		return res;
	}
	//Pour injecter dans la variable dao un objet d'une classe qui  implemente IDao
	public void setDao(IDao dao) {
		this.dao = dao;
	}

}

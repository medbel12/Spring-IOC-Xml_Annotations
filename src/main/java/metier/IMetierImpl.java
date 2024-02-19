package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service("metier")
public class IMetierImpl implements IMetier{

    @Autowired
    private IDao dao;
    @Override
    public double calcul() {
        double temp = dao.getData();
        double res = temp*110/Math.cos(temp*Math.PI);
        return res;
    }

    public IMetierImpl( IDao dao) {
        this.dao = dao;
    }

    //public IMetierImpl() {}

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

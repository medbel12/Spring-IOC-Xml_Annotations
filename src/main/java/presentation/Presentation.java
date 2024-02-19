package presentation;

import dao.DaoImpl;
import metier.IMetierImpl;

public class Presentation {
    public static void main(String[] args) {
        /*
        Injection des dependances
        par instanciation statique => new
         */
        DaoImpl dao = new DaoImpl();
        IMetierImpl metier = new IMetierImpl(dao);
        System.out.println("Resultat= "+ metier.calcul());
    }
}

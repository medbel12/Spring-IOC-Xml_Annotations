package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws Exception {
        // Crée un scanner pour lire à partir du fichier "config.txt"
        Scanner scanner = new Scanner(new File("config.txt"));

        // Lit le nom de la classe DAO à partir du fichier de configuration
        String daoClassName = scanner.nextLine();
        // Charge la classe DAO en mémoire
        Class cDao = Class.forName(daoClassName);
        // Instancie la classe DAO
        IDao dao = (IDao) cDao.newInstance();

        // Lit le nom de la classe métier à partir du fichier de configuration
        String metierClassName = scanner.nextLine();
        // Charge la classe métier en mémoire
        Class cMetier = Class.forName(metierClassName);
        // Instancie la classe métier
        IMetier metier = (IMetier) cMetier.newInstance();

        // Récupère la méthode "setDao" de la classe métier
        Method method = cMetier.getMethod("setDao", IDao.class);
        // Appelle la méthode "setDao" avec l'instance de DAO en tant qu'argument
        method.invoke(metier, dao);

        // Appelle la méthode "calcul" de la classe métier et affiche le résultat
        System.out.println("Resultat= " + metier.calcul());
    }
}

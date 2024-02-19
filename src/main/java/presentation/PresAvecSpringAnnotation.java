package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresAvecSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("extention", "metier","dao2");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Resultat= "+ metier.calcul());
    }
}

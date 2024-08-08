import service.Service;
import utility.UtilityClass;

import java.util.ArrayList;
import java.util.List;
import domain.DomainClass;


public class Main {
    public static void main(String[] args) {

       List<String> list = new ArrayList<>();
       list.add("ea");


        DomainClass domainClass = new DomainClass();
        UtilityClass utilityClass = new UtilityClass(domainClass);
        Service service = new Service(domainClass,utilityClass);
        System.out.println("Main hello!");
        domainClass.domainClassHello();
        utilityClass.utilityHello();
        service.serviceHello();

        list.get(0);
    }
}
package service;

import domain.DomainClass;
import utility.UtilityClass;

public class Service {
    DomainClass domain;
    UtilityClass utilityClass;

    public Service(DomainClass domain, UtilityClass utilityClass) {
        this.domain = domain;
        this.utilityClass = utilityClass;
    }

    public void serviceHello(){
        System.out.println("Service hello!");
    }
}

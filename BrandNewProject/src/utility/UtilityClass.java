package utility;

import domain.DomainClass;

public class UtilityClass {
    DomainClass domainClass;

    public UtilityClass(DomainClass domainClass) {
        this.domainClass = domainClass;
    }
    public void utilityHello(){
        System.out.println("Utility hello!");
    }
}

package archive.Singleton;

public class Singleton {

    private static Singleton singleton;

    public static final int X;

    static{
        X = 2;
    }

    public static Singleton createSingleton(){


        if(singleton == null)        {
            singleton = new Singleton();
            System.out.println("Create new singleton");
        } else {
            System.out.println("Class exist!");
        }
        return singleton;
    }

    private Singleton(){


    }
}

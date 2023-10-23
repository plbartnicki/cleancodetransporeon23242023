package bigclasses;

public class Service {

   private final  IA ia;

    public Service(IA ia) {
        this.ia = ia;
    }


    public  void start() {
        ia.g2();
    }

    public  void funA() {
        ia.f1();
    }
}

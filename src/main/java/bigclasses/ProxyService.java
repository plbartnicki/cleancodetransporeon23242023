package bigclasses;

public class ProxyService implements IA {
    private IAf iAf = new Af();
    private IAg iAg = new Ag();

    @Override
    public void f1() {
        iAf.f1();
    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }

    @Override
    public void fn() {

    }

    @Override
    public void g1() {
        iAg.g1();
    }

    @Override
    public void g2() {

    }

    @Override
    public void gn() {

    }
}

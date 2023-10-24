package cyclic.before;

public class X {
    private Y y;

    public X(Y y) {
        this.y = y;
        y.g();
    }

    public void f() {

    }
}

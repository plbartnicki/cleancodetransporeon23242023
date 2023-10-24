package cyclic.before;

public class Y {
    private X x;

    public Y(X x) {
        this.x = x;
        x.f();
    }

    public void g() {

    }
}

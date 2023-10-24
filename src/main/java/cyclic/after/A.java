package cyclic.after;

public class A
{
    private B b;

    public A()
    {
        System.out.println("Creating A");
    }

    public void setB(B b) {
        this.b = b;
    }

    public static void main(String[] args)
    {
        A a = new A();
        B b = new B(a);

        a.setB(b);
    }
}

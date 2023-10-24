package cyclic.after2;

public class A
{
    private B b;

    public A()
    {
        System.out.println("Creating A");
        b = new B(this);
    }

    public static void main(String[] args)
    {
        A a = new A();

    }
}

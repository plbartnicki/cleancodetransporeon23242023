package redundantcode.before;

public class F extends E
{
	private void h() {
		System.out.println("some logic of h");
	}

	public void start() {
		h();
		System.out.println("some logic of F.start");
		fn1();
	}
}

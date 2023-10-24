package redundantcode.before;

import static commons.AlgHelper.f;

public class BService
{



	public void start(double a, double b, double T[]) {
		double res = f(a, b, T);
		System.out.println(String.format("some logic from BService with %f", res));
	}
}

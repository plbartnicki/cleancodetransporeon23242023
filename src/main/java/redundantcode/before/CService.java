package redundantcode.before;

import commons.AlgHelper;

import static commons.AlgHelper.f;

public class CService
{
	public void start(double a, double b, double T[]) {
		double res = f(a, b, T);
		System.out.println(String.format("some logic from CService with %f", res));
	}
}

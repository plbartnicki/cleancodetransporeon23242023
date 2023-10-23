package taxes.afterrefactor;

public class TaxEn implements ITax {

	public double count(double value) {
		return 0.3*value;
	}

}

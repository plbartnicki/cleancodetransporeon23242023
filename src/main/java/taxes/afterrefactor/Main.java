package taxes.afterrefactor;

import taxes.beforerefactor.IncorrectArgumentException;
import taxes.beforerefactor.TaxType;

public class Main {

	public static void main(String[] args) throws IncorrectArgumentException {
		TaxComputeService c = new TaxComputeService();
		c.setTaxType(TaxType.PL);
		System.out.println(c.computeTax(100));
	}
}

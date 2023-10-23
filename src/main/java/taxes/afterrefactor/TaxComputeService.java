package taxes.afterrefactor;

import taxes.beforerefactor.IncorrectArgumentException;
import taxes.beforerefactor.TaxType;

import java.util.Optional;

public class TaxComputeService
{

	private Optional<ITax> tax;  //jest to referencja na strategię - sposób konkretnego obliczenia

	public void setTaxType(TaxType taxType) {
		switch (taxType) {
			case PL -> tax = Optional.of(new TaxPL());
			case EN -> tax = Optional.of(new TaxEn());
		}
	}

	public double computeTax(double v) throws IncorrectArgumentException {
		if(tax.isPresent()) {
			return tax.get().count(v);
		}

		throw new IncorrectArgumentException("The strategy has not been set");
	}


}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ChainOfResponsibility
{
    public class MinusExecutor : OperationExecutor
    {
        public override double Compute(String expression, Double result)
        {
            String[] parts = expression.Split(' ');   //- 3 -> ["-", "3"]
            if (parts[0].Equals("-"))
            {
                result -= Double.Parse(parts[1]);

                return result;
            }

            if (nextOperation != null)
            {
                return nextOperation.Compute(expression, result);
            }

            return 0;  //z tego wynika że nextOperation == null czyli nie mozemy obsluzyc danego żądania
        }
    }
}

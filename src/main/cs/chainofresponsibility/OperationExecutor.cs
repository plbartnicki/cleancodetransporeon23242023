using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ChainOfResponsibility
{
    public abstract class OperationExecutor
    {
        protected OperationExecutor nextOperation = null;

        public void SetNextOperation(OperationExecutor nextOperation)
        {
            this.nextOperation = nextOperation; 
        }

        /* + 2,- 3,- 1,+ 5 */
        public abstract Double Compute(String expression, Double result);
    }
}

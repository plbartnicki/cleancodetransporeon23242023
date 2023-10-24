

using ChainOfResponsibility;
using System.Linq.Expressions;

namespace chainOfResponsibility
{
    public class Program
    {
        public static void Main()
        {
            String[] expressions = { "+ 2", "- 1", "+ 3", "- 5"};
            //wynik = -1

            Double result = 0;
            OperationExecutor sumExecutor = new SumExecutor();
            OperationExecutor minusExecutor = new MinusExecutor();

            sumExecutor.SetNextOperation(minusExecutor);

            //sumExecutor -> minusExecutor -> null

            //pierwszym elementem łańcucha jest sumExecutor, a jego następnikiem jest minusExecutor

            foreach (String expression in expressions)
            {
                result = sumExecutor.Compute(expression, result);
            }

            Console.WriteLine(result);

        }
    }
}

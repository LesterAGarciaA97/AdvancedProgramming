using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab0204_garcia_aquino_1003115
{
    class Program
    {

        static bool IsOdd(int n)
        {
            if (n == 0)
                return false;

            if (IsEven(n - 1))
                return true;
            else
                return false;
        }

        static bool IsEven (int m)
        {
            if (m == 0)
                return true;

            if (IsOdd(m - 1))
                return true;
            else
                return false;
        }

        static int Multiplication (int []Operation , int Numbers)
        {
            if (Numbers == 0)
                return(Operation[0]);
            else
                return ();
                       
        }
        static void Main(string[] args)
        {
            Console.WriteLine(IsOdd(7));
            Console.WriteLine(IsOdd(2));
            Console.WriteLine(IsOdd(8));

            Console.WriteLine(IsOdd(7));
            Console.WriteLine(IsOdd(2));
            Console.WriteLine(IsOdd(8));

            Console.ReadKey();
        }
    }
}

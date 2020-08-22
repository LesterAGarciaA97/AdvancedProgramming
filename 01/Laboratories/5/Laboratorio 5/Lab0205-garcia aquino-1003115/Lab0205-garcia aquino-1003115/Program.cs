using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Lab0205_garcia_aquino_1003115;

namespace Lab0205_garcia_aquino_1003115
{
    class Program
    {

        static int Precedence(string sign)
        {
            return sign == "*" ? 10 : 1;
        }

        static bool ShouldPop(string Peek, string Pivot)
        {
            return Precedence(Peek) > Precedence(Pivot);
        }
        static void Main(string[] args)
        {
            Stack PostFix = new Stack();
            Stack Symbol = new Stack();

            string Input = "";
            int i = 0;
            string Pivot = "";

            Console.WriteLine("Ingrese Expresión");
            Input = Console.ReadLine();

            while (i < Input.Length)
            {
                Pivot = Input[i].ToString();

                if (Pivot == "+" || Pivot == "*") //Agregar división y resta y sacar resultado de la expresión completa y menos unario (-U)
                {
                    while ((! Symbol.isEmpty()) && (ShouldPop(Symbol.peek(),Pivot)))
                    {
                        PostFix.push(Symbol.pop());
                    }

                    Symbol.push(Pivot);
                }
                else //Is number
                {
                    PostFix.push(Pivot);
                }

                i++;
            }

            //Empties the symbol stack
            while (!Symbol.isEmpty())
            {
                PostFix.push(Symbol.pop());
            }

            Console.WriteLine(PostFix.ToString());
            Console.ReadKey();
        }
    }
}

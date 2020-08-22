using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab0203_garcia_aquino_1003115
{
    class Program
    {

        public const int ARRAY_SIZE = 10;
        public const int LIST_SIZE = 1000;
        static void Main(string[] args)
        {
           
           LinearQueue[] linear = new LinearQueue[ARRAY_SIZE];
           Random r = new Random();
           int number = 0;
           int i = 0;

           while (i < ARRAY_SIZE * LIST_SIZE)
           {
               number = r.Next(0, 10);
               linear[number].Queue(number);
           }

            for (int j=0;  j<ARRAY_SIZE; j++)
            {
                Console.WriteLine(linear[j].Count);
            }

            Console.ReadKey();
        }
    }
}

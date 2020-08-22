using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab0203_garcia_aquino_1003115
{
    class Program
    {

        public const int ARRAY_SIZE = 10;
        public const int LIST_SIZE = 1000;
        public const int LOWER_LIMIT = 0;
        public const int UPPER_LIMIT = 10;

        /// <summary>
        /// Initialize each element in the array. Since each element is a LinearQueue, it must be created using the 'New' operation.
        ///     ex: LinearQueue aList = new LinearQueue(5); //creates a queue of 5 elements. 
        /// </summary>
        /// <param name="linear">An array of LinearQueue</param>
        static void initializeArray(LinearQueue[] linear)
        {
            for (int i = 0; i < linear.Length; i++)
            {
                linear[i] = new LinearQueue(LIST_SIZE);
            }
        }

        /// <summary>
        /// Writes to console the size of each LinearQueue in the array.
        /// </summary>
        /// <param name="linear">An array of LinearQueue</param>
        static void printSizes(LinearQueue[] linear)
        {
            for (int j = 0; j < ARRAY_SIZE; j++)
            {
                Console.WriteLine(linear[j].Count);
            }
        }

        /// <summary>
        /// Fill each Queue in the array with random data.
        /// </summary>
        /// <param name="linear">An array of LinearQueue</param>
        /// <returns>The average time to perform the QUEUE operation</returns>
        static Double fillArrayWithRandomData(LinearQueue[] linear)
        {
            // Variables used to generate random data.
            Random r = new Random();
            int number = 0;

            // Used to calculate the time that thakes to queue and dequeue.
            DateTime start = new DateTime();    // the time before the operation starts.
            DateTime end = new DateTime();      // the time after the operation ends.
            Double operationDuration = 0;       // the specific time in milliseconds.
            TimeSpan span = new TimeSpan();     // used to convert from DateTime to milliseconds

            // We want a lot random data so we calculate and insert many random numbers. 
            // An amount of ARRAY_SIZE * LIST_SIZE iterations. 
            for (int i = 0; i < ARRAY_SIZE * LIST_SIZE; i++)
            {
                number = r.Next(LOWER_LIMIT, UPPER_LIMIT);          // Obtains a random number between 0 and 9. This number is also used to select a position in the array.

                start = DateTime.Now;           // Calculates the exact time before an insert is performed.
                linear[number].Queue(number);   // Performs the insert
                end = DateTime.Now;             // Calculates the exact time when the operation ends.

                span = end - start;             // Obtains the time difference in milliseconds 
                operationDuration += span.TotalMilliseconds;    // Sums each duration so we can perform the average
            }

            return operationDuration / (ARRAY_SIZE * LIST_SIZE);// Calculates the average time.
        }

        /// <summary>
        /// Removes every element from each QUEUE in the array.
        /// </summary>
        /// <param name="linear"></param>
        /// <returns>The average time to perform the DEQUEUE operation</returns>
        static double emptyArray(LinearQueue[] linear)
        {
            // ******* as in the fillArrayWithRandomData method *******
            // Used to calculate the time that thakes to queue and dequeue.
            DateTime start = new DateTime();    // the time before the operation starts.
            DateTime end = new DateTime();      // the time after the operation ends.
            Double operationDuration = 0;       // the specific time in milliseconds.
            TimeSpan span = new TimeSpan();     // used to convert from DateTime to milliseconds

            for (int i = 0; i < ARRAY_SIZE; i++)    // For each element in the array
            {
                while (linear[i].Count > 0)         // Repeat ultil the Queue is empty
                {
                    start = DateTime.Now;           // Calculates the exact time before the operation is performed.
                    linear[i].Dequeue();            // Removes from the queue
                    end = DateTime.Now;             // Calculates the exact time when the operation ends.

                    span = end - start;             // Obtains the time difference in milliseconds 
                    operationDuration += span.TotalMilliseconds;    // Sums each duration so we can perform the average
                }
            }

            return operationDuration / (ARRAY_SIZE * LIST_SIZE);    // Calculates the average time.
        }


        static void Main(string[] args)
        {

            LinearQueue[] linear = new LinearQueue[ARRAY_SIZE];         // An array with elements of LinearQueue
            initializeArray(linear);                                    // Initialize the array with empty lists



            Double averageQueueTime = fillArrayWithRandomData(linear);  // Calculates the average time to queue the random data

            printSizes(linear);                                         // Shows the size of each element in the array

            Console.WriteLine("---------------------------------------------");
            Console.WriteLine("Tiempo promedio de QUEUE = " + averageQueueTime);
            Console.WriteLine("---------------------------------------------");




            Double averageRemoveTime = emptyArray(linear);              // Calculates the average time to dequeue all the data

            printSizes(linear);                                         // Shows the size of each element in the array. Should be 0

            Console.WriteLine("---------------");
            Console.WriteLine("Tiempo promedio de DEQUEUE = " + averageRemoveTime);
            Console.WriteLine("---------------");

            Console.ReadKey();
        }
    }
}

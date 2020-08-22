using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab0203_garcia_aquino_1003115
{
    class LinearQueue
    {
        private int[] elements;

        private int count;

        public int Count
        {
            get { return count; }
        }

        public LinearQueue(int size)
        {
            count = 0;
            elements = new int[size];
        }

        public bool Queue(int newElement)
        {
            if (count < elements.Length)
            {
                elements[count++] = newElement;
                return true;
            }
            return false;
        }

        public int Dequeue()
        {
            if (count == 0)
                return -1;

            int t = elements[0];

            for (int i = 0; i < count - 1; i++)
            {
                elements[i] = elements[i + 1];
                elements[i + 1] = 0;
            }
            count--;
            return t;
        }
    }
}

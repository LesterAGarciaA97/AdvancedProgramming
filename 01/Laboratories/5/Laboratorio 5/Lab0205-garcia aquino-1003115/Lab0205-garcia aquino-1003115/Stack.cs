using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab0205_garcia_aquino_1003115
{
    class Stack
    {
        public const int MAX_ITEM_COUNT = 100;
        private string[] item = new string[MAX_ITEM_COUNT];
        public int count;

        public bool push(string value)
        {
            if (count >= MAX_ITEM_COUNT)
                return false;
            item[count++] = value;
            return true;
        }

        public string pop()
        {
            if (count <= 0)
                return null;

            return item[--count];
        }

        public string peek()
        {
            if (count <= 0)
                return null;

            return item[count - 1];
        }

        public override string ToString()
        {
            String result = "";
            for (int i = 0; i < count; i++)
            {
                result += item[i].ToString();
            }
            return result;
        }

        public bool isEmpty()
        {
            return count == 0;
        }
    }
}

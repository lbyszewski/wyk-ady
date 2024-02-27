using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    public class Program
    {
        static void Main(string[] args)
        {
            for (int i = 1; i <= 4; i++) { 

                Console.WriteLine(i); 
                Console.WriteLine();

                for (int j = 0; j <9; j++) {

                    Console.Write(j);


                }
            }

            Console.ReadKey();
        }
    }
}

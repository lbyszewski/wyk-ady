using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace WinFormsApp1
{
    public class Somthing
    {


        public void show()
        {
            Console.WriteLine("oto moja pierwsza wiadomsc");
        }




        public static void Mainn(string[] args)
        {
            // output 

            Console.WriteLine("wprowadz zmienna a:  ");

            // input 

            int a = Convert.ToInt32(Console.ReadLine());


            Console.WriteLine("wprowadz zmienna b: ");

            int b = Convert.ToInt32(Console.ReadLine());


            if(a <=0 || b<=0) {
                Console.WriteLine("nie mozna wykonac dzialania");
            } else
            {
                int result = a * b;
                Console.WriteLine("wynik dzialania dwoch liczb" + result);
            }



            int sum = 0;

            for(int i = 4; i <= 40; i++)
            {
                sum += i;
            }

            Console.WriteLine("suma liczb z petli wynosi: " + sum);

            int j = 0;
            while(j<40) {

                j++;
            }


           

        }
    }
}

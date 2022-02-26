using System;

namespace projekt
{
    class Program
    {
        static void Main(string[] args)
        {
            Double a, b, c, x=0, y=0, z=0;

            Console.WriteLine("Program oblicza uklad 3 rownan.");
            Console.WriteLine("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            a:
            try
            {
                Console.WriteLine("Podaj wspolczynnik a :");
                a = Double.Parse(Console.ReadLine());
                Console.WriteLine("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
            catch(System.FormatException)
            {
                Console.WriteLine("Nie podano liczby!");
                goto a;
            }
            b:
            try
            {

                Console.WriteLine("Podaj wspolczynnik b :");
                b = Double.Parse(Console.ReadLine());
                Console.WriteLine("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
            catch
            {
                Console.WriteLine("Nie podano liczby!");
                goto b;
            }
            c:
            try
            {
                Console.WriteLine("Podaj wspolczynnik c :");
                c = Double.Parse(Console.ReadLine());
                Console.WriteLine("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
            catch (System.FormatException)
            {
                Console.WriteLine("Nie podano liczby!");
                goto c;
            }

            x = (10 - (b * y) - (c * z)) / a;
            y = (20 - (a * x) - (c * z)) / b;
            z = (30 - (a * x) - (b * y)) / c;
            

            Console.WriteLine($"Wspolczyninnik x wynosi {x}");
            Console.WriteLine($"Wspolczyninnik y wynosi {y}");
            Console.WriteLine($"Wspolczyninnik z wynosi {z}");
            Console.WriteLine("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            Console.ReadKey(true);
            
        }
        
    }
}
 
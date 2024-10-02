using System;

namespace DivisionApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter the first number:");
            string input1 = Console.ReadLine();
            Console.WriteLine("Enter the second number:");
            string input2 = Console.ReadLine();

            try
            {
                int num1 = Convert.ToInt32(input1);
                int num2 = Convert.ToInt32(input2);
                int result = Divide(num1, num2);
                Console.WriteLine($"The result of the division is: {result}");
            }
            catch (FormatException)
            {
                Console.WriteLine("Error: One or both inputs are not valid integers.");
            }
            catch (DivideByZeroException)
            {
                Console.WriteLine("Error: Division by zero is not allowed.");
            }
            catch (OverflowException)
            {
                Console.WriteLine("Error: One or both numbers are too large.");
            }
            catch (Exception ex)
            {
                Console.WriteLine($"An unexpected error occurred: {ex.Message}");
            }
        }

        static int Divide(int a, int b)
        {
            return a / b;
        }
    }
}

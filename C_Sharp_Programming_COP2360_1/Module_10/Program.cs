using System;

public class Program
{
    public static void Main(string[] args)
    {
        // Creating instances of Subcontractor
        Subcontractor subcontractor1 = new Subcontractor("Alice", 101, DateTime.Now, 1, 25.00);
        Subcontractor subcontractor2 = new Subcontractor("Bob", 102, DateTime.Now, 2, 30.00);

        // Display information and compute pay
        Console.WriteLine($"Subcontractor: {subcontractor1.GetContractorName()}, Shift: {subcontractor1.GetShift()}, Pay for 40 hours: {subcontractor1.ComputePay(40)}");
        Console.WriteLine($"Subcontractor: {subcontractor2.GetContractorName()}, Shift: {subcontractor2.GetShift()}, Pay for 40 hours: {subcontractor2.ComputePay(40)}");
    }
}

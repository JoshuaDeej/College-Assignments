public class Customer
{
    public string FirstName { get; set; }
    public string LastName { get; set; }

    public int PhoneNumber { get; set; }

    public Customer(string firstName, string lastName, int phoneNumber)
    {
        FirstName = firstName;
        LastName = lastName;
        PhoneNumber = phoneNumber;
    }

    public void DisplayName()
    {
        Console.WriteLine($"Name: {FirstName} {LastName}");
    }
    public void DisplayPhoneNumber()
    {
        Console.WriteLine($"Phone Number: {PhoneNumber}");
    }
}

// Issue class inheriting from Customer
public class Case : Customer
{
    public int CaseId { get; set; }

    public Case(string firstName, string lastName, int phoneNumber, int caseId)
        : base(firstName, lastName, phoneNumber)
    {
        CaseId = caseId;
    }

    public void DisplayCaseInfo()
    {
        DisplayName();
        DisplayPhoneNumber();
        Console.WriteLine($"Case ID: {CaseId}");
    }
}

// Main program
class Program
{
    static void Main(string[] args)
    {
        // Create an instance of Case
        Case customer = new Case("John", "Doe", 1111111111, 123456);
        customer.DisplayCaseInfo();
    }
}

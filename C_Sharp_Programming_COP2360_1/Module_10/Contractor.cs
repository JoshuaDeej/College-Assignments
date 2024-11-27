using System;

public class Contractor
{
    private string contractorName;
    private int contractorNumber;
    private DateTime contractorStartDate;

    // Default constructor
    public Contractor() { }

    // Parameterized constructor
    public Contractor(string name, int number, DateTime startDate)
    {
        contractorName = name;
        contractorNumber = number;
        contractorStartDate = startDate;
    }

    // Accessor methods (getters)
    public string GetContractorName() { return contractorName; }
    public int GetContractorNumber() { return contractorNumber; }
    public DateTime GetContractorStartDate() { return contractorStartDate; }

    // Mutator methods (setters)
    public void SetContractorName(string name) { contractorName = name; }
    public void SetContractorNumber(int number) { contractorNumber = number; }
    public void SetContractorStartDate(DateTime startDate) { contractorStartDate = startDate; }
}

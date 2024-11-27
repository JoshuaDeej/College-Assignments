public class Subcontractor : Contractor
{
    private int shift; // 1 for day shift, 2 for night shift
    private double hourlyPayRate;

    // Default constructor
    public Subcontractor() { }

    // Parameterized constructor
    public Subcontractor(string name, int number, DateTime startDate, int shift, double payRate)
        : base(name, number, startDate)
    {
        this.shift = shift;
        hourlyPayRate = payRate;
    }

    // Accessor methods (getters)
    public int GetShift() { return shift; }
    public double GetHourlyPayRate() { return hourlyPayRate; }

    // Mutator methods (setters)
    public void SetShift(int shift) { this.shift = shift; }
    public void SetHourlyPayRate(double payRate) { hourlyPayRate = payRate; }

    // Method to compute pay
    public float ComputePay(float hoursWorked)
    {
        double pay = hourlyPayRate * hoursWorked;
        if (shift == 2) // Night shift
        {
            pay *= 1.03; // Apply 3% shift differential
        }
        return (float)pay;
    }
}

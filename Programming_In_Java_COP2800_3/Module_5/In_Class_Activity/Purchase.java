package Programming_In_Java_COP2800_3.Module_5.In_Class_Activity;

public class Purchase {
    private String invoiceNumber;
    private double saleAmount;
    private double salesTax;

    // Set method for invoice number
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    // Set method for sale amount
    public void setSaleAmount(double saleAmount) {
        this.saleAmount = saleAmount;
        this.salesTax = saleAmount * 0.05; // Calculate sales tax as 5% of sale amount
    }

    // Display method to show purchase details
    public void display() {
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Sale Amount: $" + saleAmount);
        System.out.println("Sales Tax: $" + salesTax);
    }

    public static void main(String[] args) {
        Purchase purchase = new Purchase();
        purchase.setInvoiceNumber("INV12345");
        purchase.setSaleAmount(100.00);
        purchase.display();
    }
}

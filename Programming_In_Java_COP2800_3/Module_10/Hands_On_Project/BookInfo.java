package Programming_In_Java_COP2800_3.Module_10.Hands_On_Project;

public abstract class BookInfo {
    private String title;
    private double price;

    public BookInfo(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void setPrice();
}

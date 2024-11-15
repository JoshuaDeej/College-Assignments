package Programming_In_Java_COP2800_3.Module_10.Hands_On_Project;

public class NonFiction extends BookInfo {

    public NonFiction(String title) {
        super(title);
        setPrice();
    }

    @Override
    public void setPrice() {
        setPrice(37.99);
    }
}

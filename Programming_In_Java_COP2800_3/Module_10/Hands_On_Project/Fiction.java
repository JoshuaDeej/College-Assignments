package Programming_In_Java_COP2800_3.Module_10.Hands_On_Project;

public class Fiction extends BookInfo {

    public Fiction(String title) {
        super(title);
        setPrice();
    }

    @Override
    public void setPrice() {
        setPrice(24.99);
    }
}

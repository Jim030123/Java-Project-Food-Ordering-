public class Meal extends Food {
    private String type = "Meal";

    Meal(String ID, String name, double price, String type) {
        super(ID, name, price);
        type = this.type;
        
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

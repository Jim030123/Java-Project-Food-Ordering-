public class Beverage extends Food {
    private String type = "Beverage";

    Beverage(String ID, String name, double price, String type){
        super(ID, name, price);   
        this.type =type;
    }
    
    
public String getType() {
    return type;
}

public void setType(String type) {
    this.type = type;
}


   
    
}

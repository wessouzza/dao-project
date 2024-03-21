import java.util.Date;

import db.DB;
import model.entities.Department;
import model.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        Department dp01 = new Department(1, "Armas");
        Seller sell01 = new Seller(1, "Juca", "juju@gmail.com", new Date(), 6000.0, dp01);
   
        System.out.println(sell01);
    }
}

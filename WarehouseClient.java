import javax.naming.*;
import java.rmi.*;

public class WarehouseClient {
public static void main(String[] args) {
try {
    
Context context = new InitialContext();
String url = "rmi://localhost/central_warehouse";
Warehouse warehouse = (Warehouse) context.lookup(url);
String product = "Blackwell Toaster";
double price = warehouse.getPrice(product);
System.out.println("Product: " + product);
System.out.println("Price: $" + price);
} catch (Exception e) {
e.printStackTrace();
}
}
}
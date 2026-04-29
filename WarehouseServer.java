import javax.naming.*;
import java.rmi.*;

public class WarehouseServer {
public static void main(String[] args) {
try {
System.out.println("Starting RMI Server...");
WarehouseImpl warehouse = new WarehouseImpl();
Context context = new InitialContext();
context.bind("rmi:central_warehouse", warehouse);
System.out.println("Server is ready...");
} catch (Exception e) {
e.printStackTrace();
}
}
}
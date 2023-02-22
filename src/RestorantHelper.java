import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*Add products in list and then remove*/
public class RestorantHelper {

    public static void main(String[] args) throws IOException {
      Set <String> products = new HashSet<>();
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please invite products to buy: ");
      while(true){
          String product = reader.readLine();
          if(product.equals("finish")){
              break;
          }
          products.add(product);
      }
      while(!products.isEmpty()){
          System.out.println("Left to buy: ");
          for (String product : products){
              System.out.println(product);
          }
          System.out.println("Please wright product to remove: ");
          String product = reader.readLine();
          if(products.contains(product)) {
              products.remove(product);
          } else {
              System.out.println("No this product in the list");
          }

      }
        System.out.println("Congratulations you buy all products");



    }

}

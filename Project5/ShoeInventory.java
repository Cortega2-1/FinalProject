import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a description of class ShoeInventory here.
 *
 * @author Carlos Ortega
 * @version 04-15-2022
 */
public class ShoeInventory
{
      public static void main(String[] args) throws IOException 
      {
        Shoes FavoriteShoe = new Shoes();
        FavoriteShoe.setBrand("Gucci");
        FavoriteShoe.setColor("White");
        FavoriteShoe.setSize(11.0);
        FavoriteShoe.setPrice(500.0);
        
        Shoes SecondShoe = new Shoes("NB", "Pink", 11.0, 175.0);
        System.out.println("Shoe Information: " + SecondShoe);
        
        //Read ShoeCollection File
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("ShoeCollection.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                // split the line by whitespaces
                String parts[] = line.split("\\s+");

                Shoes x = new Shoes(parts[0], parts[1], Double.parseDouble(parts[2]), Double.parseDouble(parts[3]));
                System.out.println("Shoe Information: " + x);
            }

            reader.close();
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }

    }
}
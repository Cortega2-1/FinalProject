import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * ShoeInventory reads an input file and outputs the shoe information 
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
        
        //Check if shoe equals my size (true)
        System.out.println(FavoriteShoe.equalSize());
        
        Shoes smallShoe = new Shoes("Nike", "Purple", 5.5, 65.0);
        
        //Check if shoe equals my size (false)
        System.out.println(smallShoe.equalSize());
        
        Shoes SecondShoe = new Shoes("NB", "Pink", 11.0, 175.0);
        System.out.println("Shoe Information: " + SecondShoe);
        
        //Read ShoeCollection File
        BufferedReader reader;
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the name of the text file: ");
            String filename = input.nextLine();
            reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) 
            {
                String parts[] = line.split("\\s+");
                Shoes newList = new Shoes(parts[0], parts[1], Double.parseDouble(parts[2]), Double.parseDouble(parts[3]));
                System.out.println("Shoe Information: " + newList);
            }
            reader.close();
        } 
        catch (FileNotFoundException e) 
        {
           
           System.err.println("File not found. Fix spelling errors."); 
           System.err.println("Make sure file is created.");
        }
    }
}
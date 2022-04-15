
/**
 * Write a description of class Shoes here.
 *
 * @author Carlos Ortega
 * @version 04-15-2022
 */
public class Shoes
{
    private String brand;
    private int size;
    private String color;
    private double price;
    
    public Shoes()
    {
      this.brand = "";
      this.size = -1;
      this.color = "";
      this.price = -1;
    }
    public Shoes(String brand, int size, String color, double price)
    {
      this.brand = brand;
      this.size = size;
      this.color = color;
      this.price = price;
    }
    public String getBrand()
    {
        return this.brand;
    }
    public int getSize()
    {
        return this.size;
    }
    public String getColor()
    {
        return this.color;
    }
    public double getPrice()
    {
        return this.price;
    }
    public void setBrand(String b)
    {
       this.brand = b; 
    }
    public void setSize(int s)
    {
      this.size = s;  
    }
    public void setColor(String c)
    {
        this.color = c;
    }
    public void setPrice(double p)
    {
        this.price = p;
    }
    public String toString()
    {
      String s = this.brand + "," + this.size + "," + this.color + "," + this.price;
      return s;
    }
}

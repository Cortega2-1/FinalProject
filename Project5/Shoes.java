
/**
 * Write a description of class Shoes here.
 *
 * @author Carlos Ortega
 * @version 04-15-2022
 */
public class Shoes
{
    private String brand;
    private String color;
    private double size;
    private double price;
    
    public Shoes()
    {
      this.brand = "";
      this.size = -1;
      this.color = "";
      this.price = -1;
    }
    public Shoes(String brand, String color, double size, double price)
    {
      this.brand = brand;
      this.color = color;
      this.size = size;
      this.price = price;
    }
    public String getBrand()
    {
        return this.brand;
    }
     public String getColor()
    {
        return this.color;
    }
    public double getSize()
    {
        return this.size;
    }
    public double getPrice()
    {
        return this.price;
    }
    public void setBrand(String b)
    {
       this.brand = b; 
    }
    public void setColor(String c)
    {
        this.color = c;
    }
    public void setSize(double s)
    {
      this.size = s;  
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

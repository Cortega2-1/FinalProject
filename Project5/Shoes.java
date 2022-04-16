
/**
 * Shoes create objects that create a brand, color, size and price.
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
    /**
     * 
     * @param brand
     * @param color
     * @param size
     * @param price
     */
    public Shoes(String brand, String color, double size, double price)
    {
      this.brand = brand;
      this.color = color;
      this.size = size;
      this.price = price;
    }
    /*
     * @return brand
     */
    public String getBrand()
    {
        return this.brand;
    }
    /*
     * @return color
     */
    public String getColor()
    {
        return this.color;
    }
    /*
     * @return size
     */
    public double getSize()
    {
        return this.size;
    }
    /*
     * @return price
     */
    public double getPrice()
    {
        return this.price;
    }
    /*
     * @param brand
     */
    public void setBrand(String b)
    {
       this.brand = b; 
    }
    /*
     * @param color 
     */
    public void setColor(String c)
    {
        this.color = c;
    }
    /*
     * @param size
     */
    public void setSize(double s)
    {
      this.size = s;  
    }
    /*
     * @param price
     */
    public void setPrice(double p)
    {
        this.price = p;
    }
    /*
     * @return boolean
     */
    public boolean equalSize()
    {
        if(this.size == 11.0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    /*
     * @return shoe
     */
    public String toString()
    {
      String s = this.brand + "," + this.size + "," + this.color + "," + this.price;
      return s;
    }
}

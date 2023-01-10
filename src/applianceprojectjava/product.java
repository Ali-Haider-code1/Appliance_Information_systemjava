
package applianceprojectjava;

/**  @author Ali Haider */

class Product {
    private int id;
    private String name;
    private float price;
    private String addDate; 
    private byte[] picture;
    private String quantity; 

    
    public Product(int pid, String pname, float pprice, String pAddDate, byte[] pimg,String quantity)
    {
        this.id = pid;
        this.name = pname;
        this.price = pprice;
        this.addDate = pAddDate;
        this.picture = pimg;
        this.quantity=quantity;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public float getPrice()
    {
        return price;
    }
    
    public String getAddDate()
    {
        return  addDate;
    }
    public String getquantity()
    {
        return  quantity;
    }
    
    public byte[] getImage()
    {
        return picture;
    }
    
}

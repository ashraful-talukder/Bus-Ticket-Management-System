package busticket;
public class common {
 
    public String staffid;
    public String staffname;
    public String staffposition;
    public String address;
    public float salary;
    public int    mobileno;
    public byte[] Image;
    public common(String staffid,String staffname,String staffposition,String address,float salary,int mobileno ,byte[] Image)
    {
        this.staffid=staffid;
        this.staffname=staffname;
        this.staffposition=staffposition;
        this.address=address;
        this.salary=salary;
        this.mobileno=mobileno;
        
        
        this.Image=Image;
      
    }
    
    public String getstaffid()
    {
        return staffid;
    }
    
    public String getstaffname()
    {
        return staffname;
    }
    
    public String getstaffposition()
    {
        return staffposition;
    }
    
    public float getsalary()
    {
        return salary;
    }
      public int getmobileno()
    {
        return mobileno;
    }
      public String getaddress()
    {
        return address;
    }
    public byte[] getImage()
    {
        return Image;
    }
}

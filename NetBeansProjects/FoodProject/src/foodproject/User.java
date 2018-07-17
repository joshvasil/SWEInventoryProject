/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodproject;

/**
 *
 * @author joshvasil
 */
class User {
     private int productid, quantity, ordernumber;
    private String productname, location;
    
    public User(int ordernumber, String productname, int productid, int quantity, String location)
    {
        this.ordernumber=ordernumber;
        this.productname=productname;
        this.productid=productid;
        this.quantity=quantity;
        this.location=location;
        
    }
    
    public int getordernumber(){
        return ordernumber;
    }
    public String getproductname(){
        return productname;
    }
    public int getproductid(){
        return productid;
    }
    public int getquantity(){
        return quantity;
    }
    public String getlocation(){
        return location;
    }
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candy.fabric;

/**
 *
 * @author Moni
 */
public class Product {
 
   

    public String getName() {
        return Name;
    }

    private void setName(String Name) {
        this.Name = Name;
    }

    public String getID() {
        return ProID;
    }

    private void setID(String ProID) {
        this.ProID = ProID;
    }

    public String getCost() {
        return Cost;
    }

    private void setCost(String Cost) {
        this.Cost = Cost;
    }
    
    public String getCurAmount() {
        return CurAmount;
    }

    private void setCurAmount(String CurAmount) {
        this.CurAmount = CurAmount;
    }
    
     public String getDefinition() {
        return def;
    }

    private void setDefinition(String def) {
        this.def = def;
    }
    
    
    
    
    private void setProduct(String ProID,String Name, String Cost, String CurAmount)
    {
        setID(ProID);  
        setName(Name);
        setCost(Cost);           
        setCurAmount(CurAmount);
    //    setDefinition(def);
        
    }
      public Product(String ProID,String Name, String Cost,  String CurAmount){
                 setProduct(ProID, Name, Cost,  CurAmount);
   }
   
   
 
   private String Name;
   private String ProID;
   private String def;
   private String Cost;
   private String CurAmount;

    void addProduct() {
          DatabaseConnection databaseConnection = new DatabaseConnection();
        String query = "INSERT INTO Product ( ID, Name, Cost, CurAmount) VALUES ( '"+ProID+"', '"+Name+"', '"+Cost+"', '"+CurAmount+"')";
        databaseConnection.storeData(query);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}


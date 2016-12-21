/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candy.fabric;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ContainerClass {
    
    public ContainerClass(){
        DatabaseConnection databaseConnection = new DatabaseConnection();
        String query = "SELECT valOne, valTwo, valThree From ColorInfo WHERE ID =1";
        ResultSet resultSet = databaseConnection.getData(query);
        try {
            
             int tempValOne =59;
                int tempValTwo=63 ;
                int tempValThree=66;
                
            while (resultSet.next()) {
                 tempValOne = resultSet.getInt("valOne");
                 tempValTwo = resultSet.getInt("valTwo");
                 tempValThree = resultSet.getInt("valThree");
                
            }
            valOne=tempValOne;
            valTwo=tempValTwo;
            valThree=tempValThree;
       
        } catch (SQLException ex) {
            Logger.getLogger(ContainerClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
        }
    }
    
    public static void changeColorWithClass(String colorString){
        if(colorString.equals("Gold")){
            valOne=204;
            valTwo=204;
            valThree=0;
        }
       else if(colorString.equals("Platinum")){
        
             valOne=59;
            valTwo=63;
            valThree=66;
        }else if(colorString.equals("Silver")){
           valOne=204;
            valTwo=204;
            valThree=204; 
        }
        
        DatabaseConnection dabaConnection = new DatabaseConnection();
        String query = "UPDATE ColorInfo Set valOne='"+valOne+"', valTwo='"+valTwo+"',valThree='"+valThree+"' WHERE ID=1";
       
        dabaConnection.updateData(query);
    }
    
    
    public static int valOne=0;
    public static int valTwo=0;
    public static int valThree=0;
    public static int valOneButton=0;
    public static int valTwoButton=0;
    
}

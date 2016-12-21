/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candy.fabric;





import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class DatabaseConnection
{
    //private String databaseName="//D://Development//workspace//GUITesting//Contact.accdb";
     
    private String databaseName="//DatabaseFile.accdb";

    private Connection connection;  // use to establish database connection
    private Statement statement;	// use to execute SQL query statements
    private ResultSet resultSet;	// use to get the result set

    public DatabaseConnection()
    {
            connectToDB();
    }
	
	public DatabaseConnection(String databaseName)
    {
        setDatabaseName(databaseName);
    }
    
    private void setDatabaseName(String databaseName)
    {
        this.databaseName=databaseName;
    }
    public String getDatabaseName()
    {
        return databaseName;
    }
    
    //DATABASE SECTION
	
	public Statement getStatement()
    {
        return statement;
    }
	
    private void connectToDB()
    {
        try{
            //System.out.println("LOADING DRIVERS FOR JDBC:ODBC BRIDGE");
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            
        	System.out.println("\nConnecting to Database : "+databaseName+"\n");
        	connection=DriverManager.getConnection("jdbc:ucanaccess:"+databaseName);
			statement = connection.createStatement();
				
		      
        }
       
        catch(SQLException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
        
       
    }

    public ResultSet getData(String query) 
    {
    	try{
    		connectToDB();
    		resultSet = statement.executeQuery(query);
    	}
    	catch(SQLException e)
    	{
    		System.out.println(e);
    	}
    	finally
    	{
    		try{
    			if(statement!=null)
    			{
    				connection.close();
    			}
    		}
    		catch(SQLException se)
    		{
    		}
    	      
    		try
    		{
    			if(connection!=null)
    			{
    				connection.close();
    			}
    		}
    		catch(SQLException se)
    		{
    			se.printStackTrace();
    		}
    	}	
		System.out.println("Retrieving data .........\n");

    	return this.resultSet;
     }
    
    public void storeData(String query) 
    {
    	try
		{
    		connectToDB();
			//query = "INSERT INTO Contacts (FirstName, LastName) VALUES ( 'Ali', вЂ�Murod' )";
			statement.executeUpdate(query);
			System.out.println("Data stored successfully .........\n");
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
    }
    
    
    public void updateData(String query) 
    {
    	try
		{			
    		connectToDB();
			int resultCheck = statement.executeUpdate(query);
			
			if(resultCheck!=0)
			{
				System.out.println("Data updated successfully .........\n");
			}
			else
				System.out.println("Record not found .....");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
    }    
    
    
    public void deleteData(String query) 
    {
    	try
		{
    		connectToDB();
			int resultCheck = statement.executeUpdate(query);
			System.out.println("Data deleted successfully .........\n");
			
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
    }    
    
   
}

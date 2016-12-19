/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candy.fabric;

/**
 *
 * @author Acer-Aspire
 */
public class Stuff {
    public Stuff( Person personObj, String emailAddress,String id){
        setPersonObj(personObj);
        setEmailAddress(emailAddress);
        setID(id);
        
    }
    public String getEmailAddress() {
        return emailAddress;
    }

    private void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getID() {
        return id;
    }

    private void setID(String id) {
        this.id = id;
    }
    public void addStuff(){
      //  System.out.print(personObj.dateOfBirth.toString());
        DatabaseConnection databaseConnection = new DatabaseConnection();
        String query = "INSERT INTO StuffTable (StuffID, FirstName, LastName, PassportNumber,DateofBirth, EmailAddress) VALUES('"+id+"','"+personObj.getFirstName()+"','"+personObj.getLastName()+"','"+personObj.getPassportNumber()+"','"+personObj.dateOfBirth.toString()+"','"+emailAddress+"')";
        databaseConnection.storeData(query);
        
    }
    public Stuff(String emailAddress, String ID){
        setEmailAddress(emailAddress);
        setID(ID);
    }
    private String emailAddress;
    private String id;
private Person personObj;

    public Person getPersonObj() {
        return personObj;
    }

    private void setPersonObj(Person personObj) {
        this.personObj = personObj;
    }
    
}

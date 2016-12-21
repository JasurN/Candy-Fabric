/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candy.fabric;



public class Person {

    public DateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    private void setDateOfBirth(DateOfBirth dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    private void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
   
             public Person(String firstName, String lastName, String passportNumber, DateOfBirth dateOfBirth){
                 setFirstName(firstName);
                 setLastName(lastName);
                 setPassportNumber(passportNumber);
                 setDateOfBirth(dateOfBirth);
   }
   
    DateOfBirth dateOfBirth;
   private String firstName;
   private String lastName;
   private String passportNumber;
   
  
}

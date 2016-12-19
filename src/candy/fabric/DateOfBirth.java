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
public class DateOfBirth {

    public int getYear() {
        return year;
    }
    
 
    private void setYear(int year) {
        if(year>0&& year<2100){
        this.year = year;
        }
        else{
            this.year = 1;
        }
    }

    public int getMonth() {
        return month;
    }

    private void setMonth(int month) {
        if(month>0&& month<13){
        this.month = month;
        }
        else{
            this.month = 1;
        }
        
    }

    public int getDay() {
        return day;
    }

    private void setDay(int day) {
        if(day>0&& day<32){
        this.day = day;
        }
        else{
            this.day = 1;
        }
    }
    public void setDate(String date)
        {
            try {
                 setDay(Integer.parseInt(String.valueOf(date.charAt(0))+String.valueOf(date.charAt(1))));
		setMonth(Integer.parseInt(String.valueOf(date.charAt(2))+String.valueOf(date.charAt(3))));
		setYear(Integer.parseInt(String.valueOf(date.charAt(4))+String.valueOf(date.charAt(5))+String.valueOf(date.charAt(6))+String.valueOf(date.charAt(7))));
            } catch (Exception e) {
           System.out.println("You have entered wrong date of Birth\nPlease Re-Enter");
           
            }
           
        }
    

    public DateOfBirth(int day, int month, int year){
        setDay(day);
        setMonth(month);   
        setYear(year);
    }
    public DateOfBirth(){
        this(1,1,1);
    }
    public DateOfBirth(String date){
        setDate(date);
    }

    public String toString()
	{
		return String.valueOf(day)+String.valueOf(month)+String.valueOf(year);
	}
private    int year;
private int month;
private int day;

}

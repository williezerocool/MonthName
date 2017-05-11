/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monthname;

/**
 *
 * @author kendrabooker
 */
public class MonthName {

    
   
    public static void main(String[] args) {
       
      System.out.println( month_name(1) );
      System.out.println( month_name(2) );
      System.out.println( month_name(3) );
      System.out.println( month_name(4) );
      System.out.println( month_name(5) );
      System.out.println( month_name(6) );
      System.out.println( month_name(7) );
      System.out.println( month_name(8) );
      System.out.println( month_name(9) );
      System.out.println( month_name(10) );
      System.out.println( month_name(11) );
      System.out.println( month_name(12) );
      System.out.println( month_name(111) );
        
    }
    
       
    public static String month_name(int month){
           String Jan, Feb, Mar, Apr, May, Jun, Jul, Aug,Sep, Oct, Nov, Dec, err;
           err = "error";
          
       switch(month){
            case 1: {
               Jan = "January";
               return  Jan;
            }
            case 2:{
                Feb = "Febuary";
               return  Feb;
            }
            case 3:{
                Mar = "March";
               return  Mar;
            }
            case 4:{
                Apr = "April";
               return  Apr;
            }
            case 5:{
                May = "May";
               return  May;
            }
            case 6:{
                Jun = "June";
               return  Jun;
            }
            case 7:{
                Jul = "July";
               return  Jul;
            }
            case 8:{
                Aug = "August";
               return  Aug;
            }
            case 9:{
                Sep = "September";
               return  Sep;
            }
            case 10:{
                Oct = "October";
               return  Oct;
            }
            case 11:{
                Nov = "November";
               return  Nov;
            }
            case 12:{
                Dec = "December";
               return  Dec;
            }
            default:{
            
                return err;
            }
         
        }
                
       
            
        
    }
    
    
}

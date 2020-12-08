/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankControl;

import Appartment.Apartment2;
import File.BinaryFile;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author osamamahmud
 */
public class CashPayment{
    
    String email;
    //int price;
    double amount; 
    int appartmentID;
     ArrayList<Apartment2> temp3=new ArrayList<>();
      BinaryFile b= new BinaryFile();
      
      
   public CashPayment()
     {
        this.amount=0.0;    
      
      }
    public void setemail(String email)
{
this.email=email;

}
    
  public void setAmount(double amount)
    {
       this.amount=amount;
        
    } 
  
  public void setappartmentID(int appartmentID)
  {
      this.appartmentID=appartmentID;
  
  }
  
  public int getappartmentID()
  {
      return this.appartmentID;
     
  }
  public double getAmount()
    {
        return this.amount;
    }
  public String getemail()
         {
            return this.email;
            
         }
  public void paymentdetails()
  {
  JOptionPane.showMessageDialog(null,"the Amount : "+getAmount()+"the AppartmentID "+getappartmentID());
     
  }
     public String tostring()
     {
       return String.format("the price for your Appartment:%d\n: the Appartment ID is:%d\n: please check your Email Address for the invoices:%s \n   ",getAmount(),getappartmentID(),getemail());
     }
     
     
     public int checkAppartment(long AppartmentID)
         {
               int j=0;
     try{
            temp3=b. open_read(temp3, "AppartmentRent");
        }
          catch(NullPointerException | IndexOutOfBoundsException e){
                 JOptionPane.showMessageDialog(null,"Not Found");
        }   
     for(int h=0;h<temp3.size();h++)
     if(temp3.get(h).getID()==AppartmentID){
         j=1;
         setAmount(temp3.get(h).getPrice());
                //setCheckApartment(h);
         break;
     }
     if(j==1)
         return 1;
     else
         return 0;
                
         }
   public void cash( )
     { int check=0;
     check=checkAppartment(getappartmentID());
    if(check==1)
     {
       paymentdetails();
     }
         else
        JOptionPane.showMessageDialog(null,"the ID Not Correct");
     }

    public void payMethod() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

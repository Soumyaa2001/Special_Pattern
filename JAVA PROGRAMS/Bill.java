import java.util.*;

class Bill {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the units of electricity consumed : ");
        int units = sc.nextInt(); 
        double bill;
        if (units <= 50)
	{
            bill = units * 0.50;
      
        }
        else if (units <= 150)
	{
            bill = 50 * 0.50 + (units - 50) * 0.75;
        }
      
        else
	{
            bill = 50 * 0.50 + 100 * 0.75 + (units - 150) * 1.20;
        }
        
        System.out.println("The Electricity Bill is "+bill);
        
    }
    
}


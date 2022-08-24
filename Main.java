import java.util.*;

class Customer{
    int customerId;
    int accountBalance;
    void Customer(int customerId){
        this.customerId=customerId;
        this.accountBalance=0;
    }
    void Customer(Customer customer){
        this.customerId=customer.customerId;
        this.accountBalance=customer.accountBalance;
    }
    void deposit(int money){
        this.accountBalance+=money;
    }
    void withDraw(int money){
        if(money>accountBalance){
            System.out.println("Not enough Money");
        }else{
            accountBalance-=money;
        }
    }
    int balanceCheck(){
        return accountBalance;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    ArrayList<Customer> cars = new ArrayList<Customer>();
	    int c=1;
	    while(true){
	        System.out.println("1.create a bank account\n2.add money\n3.withdraw money\n4.checkBalance\n5.break");
	        int n;
	        n=Integer.parseInt(s.next());
	        if(n==1){
	            Customer cus= new Customer();
	            cus.customerId=c;
	            c+=1;
	            cars.add(cus);
	        }else if(n==2){
	            System.out.println("enter the customerId");
	            int s2=Integer.parseInt(s.next());
	            Customer c1;
	            int check=0;
	            for(int i=0;i<cars.size();i++){
	                if(cars.get(i).customerId==s2){
	                    System.out.println("enter the amount you need to be added");
        	            int amount=Integer.parseInt(s.next());
        	            cars.get(i).deposit(amount);
	                    check=1;
	                    break;
	                }
	            }
	            if(check==0){
	                System.out.println("No such Customer Exists");
	                continue;
	            }
	            
	        }else if(n==3){
	            System.out.println("enter the customerId");
	            int s2=Integer.parseInt(s.next());
	            Customer c1;
	            int check=0;
	            for(int i=0;i<cars.size();i++){
	                if(cars.get(i).customerId==s2){
	                    System.out.println("enter the amount you need to be deducted");
        	            int amount=Integer.parseInt(s.next());
        	            cars.get(i).withDraw(amount);
        	            check=1;
	                    break;
	                }
	            }
	            if(check==0){
	                System.out.println("No such Customer Exists");
	                continue;
	            }
	        }else if(n==4){
	            System.out.println("enter the customerId");
	            int s2=Integer.parseInt(s.next());
	            Customer c1;
	            int check=0;
	            for(int i=0;i<cars.size();i++){
	                if(cars.get(i).customerId==s2){
	                    System.out.println(cars.get(i).balanceCheck());
	                    check=1;
	                    break;
	                }
	            }
	            if(check==0){
	                System.out.println("No such Customer Exists");
	                continue;
	            }
	            
	        }else{
	            break;
	        }
	    }
		System.out.println("Hello World");
	}
}

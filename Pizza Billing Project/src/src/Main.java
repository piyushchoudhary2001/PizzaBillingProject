import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Welcome to AccioJob Pizza Hub \n");
        System.out.print("Do you want to Enjoy our Pizza. \n if Yes the press 1 or press 0 for No \n");
        Scanner sc=new Scanner(System.in);
        int Option=sc.nextInt();
        if(Option==0)
        {
            System.out.println("Thanks For Visiting us. Please Come Again");
        }else {
            System.out.println("How Many Pizza you want to order");
            int NumberPizza= sc.nextInt();
            ArrayList<Pizza> PizzaOrder=new ArrayList<>();
            for(int i=0;i<NumberPizza;i++)
            {
                System.out.println("Are Looking for a Non-veg Pizza? if Yes, Press 1 or Press 0 for Veg");
                int isVeg=sc.nextInt();
                Boolean Veg=false;
                if(isVeg==0)
                {
                    Veg=true;
                }
                System.out.println("What Size you prefer? Press \n0:Small\n1:Medium\n2:Large");
                int size=sc.nextInt();

                Pizza pizza=new Pizza(Veg,size);
                System.out.println("Do you want to Add ExtraToppings? Yes:1 or No:0");
                int extraTopping=sc.nextInt();
                if(extraTopping==1)
                {
                    pizza.addExtraTopings();
                }
                System.out.println("Do you want to Add ExtraCheese? Yes:1 or No:0");
                int extraCheese=sc.nextInt();
                if(extraCheese==1)
                {
                    pizza.addExtraCheese();
                }
                System.out.println("Do you want a takeaway bag? Yes:1 or No:0");
                int Bag=sc.nextInt();
                if(Bag==1)
                {
                    pizza.addTakeAway();
                }
                PizzaOrder.add(pizza);
            }
            String TotalBill="";
            int Total=0;
            for(int i=0;i<NumberPizza;i++)
            {
                Pizza localPizza=PizzaOrder.get(i);
                TotalBill+=localPizza.getBill();
                Total+=localPizza.getTotal();

            }
            TotalBill+="Your Grand Total for your order is "+Total+"/-"+"\n";
            System.out.print(TotalBill+"Press 1:Confirm your order\n0:for Cancelling");
            int orderStatus=sc.nextInt();
            if(orderStatus==1)
            {
                System.out.println("Your order have been placed");
            }else{
System.out.print("You have cancelled your order");

        }
}
    }
}
public class BankSimulator{
   public static void main(String[] args){
      Line l = new Line();
      for(int i = 0; i < 10; i++){
         int customerNumber = (int)(5*Math.random())+1;
         int tellerNumber = (int)(4*Math.random())+1;
         int totalCustomers = 1;
         int tellersLeft = tellerNumber;
         while(totalCustomers <= customerNumber){
            Customer c = new Customer(totalCustomers);
            l.addCustomer(c);
            System.out.println("Customer " + totalCustomers + " joins the line");
            totalCustomers++;
            for(int t = 0; t < tellersLeft; t++){
               if(l.isEmpty()){
                  System.out.println("Teller waiting");
               }
               else{
                  System.out.print(l.nextCustomer());
                  System.out.println(" is being served");
                  tellersLeft--;
               }
            }
         }
      }
      while(!l.isEmpty()){
         System.out.print(l.nextCustomer());
         System.out.println(" is being served");
      }
      System.out.println("Bank is closed.");
   }
}
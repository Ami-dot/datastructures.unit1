// //name: Amiti Ganguly    date:9/11
// 
// // import java.text.DecimalFormat;
// // 
// // public class SmartCard 
// // {
// //    // instantiate the constants
// //    public final static DecimalFormat df = new DecimalFormat("$0.00");
// //    public final static double MIN_FARE = 0.5;
// //    // declare the private fields
// //     private double balance;
// //     private String FormattedBalance;
// //     private boolean IsBoarded;
// //     private Station BoardedAt;
// //    
// //    // write the one-arg constructor
// //    public SmartCard(int fare) {
// //            this.ownerName = ownerName;
// //            this.balance = 0.0;
// //        }
// // 
// // 
// //    // write four getter methods  
// //    public double getBalance() {
// //         return balance;
// //     }
// //     
// //    public String getFormattedBalance() {
// //         return FormattedBalance;
// //     }
// // 
// //    public boolean getIsBoarded() {
// //         return IsBoarded;
// //     }
// //     
// //    public Station getBoardedAt() {
// //         return BoardedAt;
// //     }
// // 
// //    
// //     
// //    // write the instance methods as described in the handout
// //   public void board(Station s){
// //      if (double balance < MIN_FARE){
// //          System.out.println("Insufficient funds to board. Please add more money.")
// //            }
// //            
// //      System.out.println("Error: already boarded?!")
// //    
// //      }
// //       
// //     
// // 
// // } 
// 
// //name: Amiti Ganguly    date:9/11
// import java.text.DecimalFormat;
// 
// public class SmartCard{
// 
//    //    public SmartCard(double initialBalance) {
// //        this.balance = initialBalance;
// //        this.isBoarded = false;
// //        this.boardedAt = null;
// //    }
// // 
//     // instantiate the constants
//     
//     public final static DecimalFormat df = new DecimalFormat("$0.00");
//     public final static double MIN_FARE = 0.50;
// 
//     // declare the private fields
//     private double balance;
//     private boolean isBoarded;
//     private Station boardedAt;
// 
//    
//     public SmartCard(double initialBalance){
//         this.balance = initialBalance;
//         this.isBoarded = false;
//         this.boardedAt = null;
//     }
// 
//     
//     public double getBalance(){
//         return balance;
//     }
// 
//     public String getFormattedBalance(){
//         return df.format(balance);
//     }
// 
//     public boolean getIsBoarded(){
//         return isBoarded;
//     }
// 
//     public Station getBoardedAt(){
//         return boardedAt;
//     }
// 
//     
//     public void board(Station s){
//         if (isBoarded){
//             System.out.println("Error: already boarded?!");
//             return;
//         }
// 
//         if (balance < MIN_FARE){
//             System.out.println("Insufficient funds to board. Please add more money.");
//             return;
//         }
// 
//         
//         boardedAt = s;
//         isBoarded = true;
//     }
//     
//     public double cost(Station s) {
//         if (!isBoarded) {
//             return 0.0; 
//         }
// 
//         return 0.0; 
//     }
// 
//     public void exit(Station s){
//         if (!isBoarded) {
//             System.out.println("Error: Did not board?!");
//             return;
//         }
// 
//         double tripCost = cost(s);
// 
//         if (balance < tripCost){
//             System.out.println("Insufficient funds to exit. Please add more money.");
//             return;
//         }
// 
//         
//         balance -= tripCost;
// 
//         
//         isBoarded = false;
//         boardedAt = null;
// 
//         
//         System.out.println("From " + boardedAt.getName() + " to " + s.getName() + " costs " + df.format(tripCost) +
//                            ". SmartCard has " + df.format(balance));
//     }
// 
//     public void addMoney(double amount){
//         balance += amount;
//         System.out.println(df.format(amount) + " added. Your new balance is " + df.format(balance));
//     }
// }
// 
// 

//name: amiti ganguly date:9/11
import java.text.DecimalFormat;

public class SmartCard {
// instantiate the constants
    public final static DecimalFormat df = new DecimalFormat("$0.00");
    public final static double MIN_FARE = 0.50;
    
// declare the private fields
    private double balance;
    private boolean isBoarded;
    private Station boardedAt;
    
 // write the one-arg constructor
    public SmartCard(double initialBalance) {
        this.balance = initialBalance;
        this.isBoarded = false;
        this.boardedAt = null;
    }
// write four getter methods
    public double getBalance() {
        return balance;
    }

    public String getFormattedBalance() {
        return df.format(balance);
    }

    public boolean getIsBoarded() {
        return isBoarded;
    }

    public Station getBoardedAt() {
        return boardedAt;
    }

    public void board(Station s) {
        if (isBoarded) {
            System.out.println("Error: already boarded?!");
            return;
        }

        if (balance < MIN_FARE) {
            System.out.println("Insufficient funds to board. Please add more money.");
            return;
        }

        
        boardedAt = s;
        isBoarded = true;
    }

    public double cost(Station s) {
        if (!isBoarded) {
            return 0.0;
        }

        

        return 0.0; 
    }

    public void exit(Station s) {
        if (!isBoarded) {
            System.out.println("Error: Did not board?!");
            return;
        }

        double tripCost = cost(s);

        if (balance < tripCost) {
            System.out.println("Insufficient funds to exit. Please add more money.");
            return;
        }

        balance -= tripCost;
        isBoarded = false;
        boardedAt = null;

        System.out.println("From " + boardedAt.getName() + " to " + s.getName() + " costs " + df.format(tripCost) +
                           ". SmartCard has " + df.format(balance));
    }

    public void addMoney(double amount) {
        balance += amount;
        System.out.println(df.format(amount) + " added. Your new balance is " + df.format(balance));
    }

    public void updateFields(Station newBoardedAt, boolean newIsBoarded) {
        this.boardedAt = newBoardedAt;
        this.isBoarded = newIsBoarded;
    }
}


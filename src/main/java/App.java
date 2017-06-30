import java.io.Console;
import java.util.List;
import java.util.ArrayList;


public class App {

  public static void main(String[] args)
  {
    Console myConsole = System.console();

    EventPlanning birthday = new EventPlanning(25,"grand", "soft drinks", "Rock", "Magic Shoes");
    EventPlanning wedding = new EventPlanning(100,"grand", "soft drinks", "Pop", "Wand");

    List<EventPlanning> allPlans = new ArrayList<EventPlanning>();
       allPlans.add(birthday);
       allPlans.add(wedding);

       boolean programRun = true;

       while (programRun) {

         System.out.println("-----------------EVENT PLANNERS-----------");
         System.out.println("Welcome!! You can choose any one of the options: All Events , Create Events, Exit");
        //  System.out.println("1. If you would like to look at existing plans enter: plan");
        //  System.out.println("2. If you would like to create your own plan enter: create");
        //  System.out.println("3. If you would like to enter a coupon/discount code enter: discount");
        //  System.out.println("4. If you would like to see current promotions enter: promotions");
        //  System.out.println("5. If you would like to leave enter: exit.");
         String userInput = myconsole.readLine();


         if (userInput.equals("All Events")) {
           for (EventPlanning plan : allPlans ) {
             System.out.println("----------Available Plan--------------");
             System.out.println("Event Size: " + plan.getEventSize());
             System.out.println("Foods Available: " + plan.getFoodTypes());
             System.out.println("Beverages Available: " + plan.getBeverageTypes());
             System.out.println("Music Bands Available: " + plan.getMusicBandTypes());
             System.out.println("Decorations Type: " + plan.getAccessoriesAvailable());
             System.out.println("Total Cost: " + plan.totalCost());
             System.out.println(" ");
           }
         } else if(userInput.equals("Create Events")) {
           System.out.println("How many will attend the event?");
           int userEventSize = Integer.parseInt(myconsole.readLine());
           System.out.println("Is it grand or simple event?");
           String userFoodType = myconsole.readLine();
           System.out.println("What type of beverages u need? soft drinks or hot drinks");
           String userBeverageType = myconsole.readLine();
           System.out.println("What music band u like? Rock, Pop");
           String userMusicBandType = myconsole.readLine();
           System.out.println("What accessories u need? Magic Shoes, Wand");
           String userAccessories = myconsole.readLine();
           EventPlanning userPlan = new EventPlanning(userEventSize, userFoodType, userBeverageType, userMusicBandType, userAccessories);
           allPlans.add(userPlan);
           System.out.println(" ");

           System.out.println("-------Here is your Event Plan for today!!!---------");
           System.out.println("Event Size: " + plan.getEventSize());
           System.out.println("Foods Available: " + plan.getFoodTypes());
           System.out.println("Beverages Available: " + plan.getBeverageTypes());
           System.out.println("Music Bands Available: " + plan.getMusicBandTypes());
           System.out.println("Decorations Type: " + plan.getAccessoriesAvailable());
           System.out.println("Total Cost: " + plan.totalCost());

         } else if(userInput.equals("exit")){
           programRun = false;
         }
       } //while loop end
     }
}

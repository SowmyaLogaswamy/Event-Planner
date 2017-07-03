import java.io.Console;
import java.util.List;
import java.util.ArrayList;
public class App {
  public static void main(String[] args) {
    Console myconsole = System.console();
    EventPlanning birthday = new EventPlanning(25,"grand", "soft drinks", "Rock", "Magic Shoes");
    EventPlanning wedding = new EventPlanning(100,"grand", "soft drinks", "Pop", "Wand");
    List<EventPlanning> allPlans = new ArrayList<EventPlanning>();
    allPlans.add(birthday);
    allPlans.add(wedding);
    boolean programRun = true;
    while (programRun) {
      System.out.println("-----------------EVENT PLANNERS-----------");
      System.out.println("Welcome!! You can choose any one of the options: All Events , Create Events, Exit");
      String userInput = myconsole.readLine();
      if (userInput.equals("All Events")) {
         System.out.println("----------Available Event--------------");
         for (EventPlanning eventplan : allPlans ) {
           System.out.println("Event Size: " + eventplan.getEventSize());
           System.out.println("Foods Available: " + String.valueOf(eventplan.getFoodTypes()));
           System.out.println("Beverages Available: " + String.valueOf(eventplan.getBeverageTypes()));
           System.out.println("Music Bands Available: " + String.valueOf(eventplan.getMusicBandTypes()));
           System.out.println("Decorations Type: " + String.valueOf(eventplan.getAccessoriesAvailable()));
           System.out.println("Total Cost: " + String.valueOf(eventplan.totalCost()));
           System.out.println("-------------------------------------");
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
         System.out.println("Event Size: " + String.valueOf(userPlan.getEventSize()));
         System.out.println("Foods Available: " + String.valueOf(userPlan.getFoodTypes()));
         System.out.println("Beverages Available: " + String.valueOf(userPlan.getBeverageTypes()));
         System.out.println("Music Bands Available: " + String.valueOf(userPlan.getMusicBandTypes()));
         System.out.println("Decorations Type: " + String.valueOf(userPlan.getAccessoriesAvailable()));
         System.out.println("Total Cost: " + String.valueOf(userPlan.totalCost()));
       } else if(userInput.equals("Exit")) {
         programRun = false;
       } else {
         System.out.println("Sorry,we dont recognize");
       }
     }
   }
 }

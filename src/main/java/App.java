import models.Event;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {

        Event event = new Event();

        ArrayList<Event> allEvents = new ArrayList<Event>();
        allEvents.add(event);

        boolean programRunning = true;
        while (programRunning) {

            try {
                System.out.println("Welcome to Java Event Planning. Please type one of the following options: all events, custom event, or exit");

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                String navigationChoice = bufferedReader.readLine().toLowerCase();

                if (navigationChoice.equals("all events")) {
                    for (Event individualEvent : allEvents) {
                        System.out.println("----------------");
                        System.out.println(individualEvent.getPerson() + "people.");
                        System.out.println("With " + individualEvent.getMeal());
                        System.out.println("And " + individualEvent.getDrink());
                        System.out.println("While enjoying the " + individualEvent.getShow());
                        System.out.println("----------------");
                    }

                } else if (navigationChoice.equals("custom event")) {

                            System.out.println("Great, Let's get started on your Event! First, how many people will be attending?");
                            Integer userEventPerson = Integer.parseInt(bufferedReader.readLine());
                            event.setPerson(userEventPerson);

                            System.out.println("OK, and what type of food should there be: Steak or Seafood");
                            boolean selectFood = true;
                            while (selectFood) {
                                String userEventMeal = bufferedReader.readLine().toLowerCase();
                                if (userEventMeal.equals("steak") || userEventMeal.equals("seafood")) {
                                    event.setMeal(userEventMeal);
                                    event.setPriceOfMeal();
                                    selectFood = false;

                                } else {
                                    System.out.println("Please type one of the items listed.");
                                }

                            }
                            System.out.println("Awesome! What type of drinks should there be: Beer or Wine");
                            boolean selectDrink = true;
                            while (selectDrink) {
                                String userEventDrink = bufferedReader.readLine().toLowerCase();
                                if (userEventDrink.equals("beer") || userEventDrink.equals("wine")) {
                                    event.setDrink(userEventDrink);
                                    event.setPriceOfDrink();
                                    selectDrink = false;

                                } else {
                                    System.out.println("Please type one of the items listed.");
                                }
                            }

                            System.out.println("And what type of entertainment should there be: DJ or Concert");
                            boolean selectShow = true;
                            while (selectShow) {
                                String userEventShow = bufferedReader.readLine().toLowerCase();
                                if (userEventShow.equals("dj") || userEventShow.equals("concert")) {
                                    event.setShow(userEventShow);
                                    event.setPriceOfShow();
                                    selectShow = false;

                                } else  {
                                    System.out.println("Please type one of the items listed.");

                                }
                            }

                            event.setCalcAll();
                            int eventPrice = event.getCalcAll();


                            System.out.println("Holiday Discount: Enter SUMMERFUN to take $50 off your purchase! Or Enter: PARTYDJ to receive a free DJ show with your purchase!");
                            String deal = bufferedReader.readLine().toLowerCase();

                            if (deal.equals("summerfun")) {
                                System.out.println("----------------");
                                System.out.println("All Right! Your purchase has been adjusted!");
                                int eventDeal = (event.getCalcAll() - 50);
                                System.out.println("Your new total is $" + eventDeal);
//                                programRunning = false;

                            } else if (deal.equals("partydj")) {
                                System.out.println("----------------");
                                System.out.println("All Right! Your purchase has been adjusted!");
                                int eventDeal = (event.getCalcAll() - (event.getPriceOfShow()));
                                System.out.println("Your new total is $" + eventDeal);
//                                programRunning = false;

                            } else {
                                System.out.println("----------------");
                                System.out.println("What, you don't like savings?");
                                System.out.println("Your total is: " + event.getCalcAll());
//                                programRunning = false;
                            }


                            Event userEvent = new Event();
                            allEvents.add(userEvent);

                } else if (navigationChoice.equals("exit")){
                    System.out.println("Goodbye!");
                    programRunning = false;
                } else {
                    System.out.println("I'm sorry, we don't recognize your input");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

import models.Event;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Event event = new Event(10, "fish", "beer", "metallica");

        ArrayList<Event> allEvents = new ArrayList<Event>();
        allEvents.add(event);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        boolean programRunning = true;

        while (programRunning) {
            System.out.println("Welcome to Java Event Planning. Please select one of the following options: All Events, Search Price, Add Event, or Exit");

            try {

                String navigationChoice = bufferedReader.readLine();

                if (navigationChoice.equals("All Events")) {
                    for (Event individualEvent : allEvents) {
                        System.out.println("----------------");
                        System.out.println(individualEvent.getPerson());
                        System.out.println(individualEvent.getMeal());
                        System.out.println(individualEvent.getDrink());
                        System.out.println(individualEvent.getShow());
//                        System.out.println(individualEvent.getPrice());
                    }
//                } else if (navigationChoice.equals("Search Price")) {
//                    System.out.println("What is your total budget for this Event?");
//                    String stringUserMaxBudget = bufferedReader.readLine();
//                    int userMaxBudget = Integer.parseInt(stringUserMaxBudget);
//                    System.out.println("Great, here are some options in your price range:");
//                    for (Event individualEvent : allEvents) {
//                        if (individualEvent.budget(userMaxBudget)) {
//                            System.out.println("----------------");
//                            System.out.println(individualEvent.getPerson());
//                            System.out.println(individualEvent.getMeal());
//                            System.out.println(individualEvent.getDrink());
//                            System.out.println(individualEvent.getShow());
////                            System.out.println(individualEvent.getPrice());
//                        }
//                    }
                } else if (navigationChoice.equals("Add Event")) {
                    System.out.println("Great, Let's get started on your Event! First, how many people will be attending?");
                    int userEventPerson = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("OK, and what type of food should there be?");
                    String userEventMeal = bufferedReader.readLine();
                    System.out.println("Awesome! What type of drinks should there be?");
                    String userEventDrink = bufferedReader.readLine();
                    System.out.println("And what type of entertainment should there be?");
                    String userEventShow = bufferedReader.readLine();
                    System.out.println("Finally, what will it cost?");
                    int userEventPrice = Integer.parseInt(bufferedReader.readLine());
                    Event userEvent = new Event(userEventPerson, userEventMeal, userEventDrink, userEventShow);
                    allEvents.add(userEvent);
                    System.out.println("This Event sounds great!");
                    System.out.println("----------------");
                    System.out.println(userEvent.getPerson());
                    System.out.println(userEvent.getMeal());
                    System.out.println(userEvent.getDrink());
                    System.out.println(userEvent.getShow());
//                    System.out.println(userEvent.getPrice());
                } else if (navigationChoice.equals("Exit")){
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

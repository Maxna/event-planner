import models.Event;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Event event = new Event(10, "Steak", "Beer", "DJ");

        List<Event> allEvents = new ArrayList<Event>();
        allEvents.add(event);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        boolean programRunning = true;

        while (programRunning) {
            System.out.println("Welcome to Java Event Planning. Please select one of the following options: All Events, Custom Event, Add Event, or Exit");

            try {

                String navigationChoice = bufferedReader.readLine();

                if (navigationChoice.equals("All Events")) {
                    for (Event individualEvent : allEvents) {
                        System.out.println("----------------");
                        System.out.println(individualEvent.getPerson());
                        System.out.println(individualEvent.getMeal());
                        System.out.println(individualEvent.getDrink());
                        System.out.println(individualEvent.getShow());
                        System.out.println("$" + individualEvent.calcAll());
                        System.out.println("----------------");
                    }
                } else if (navigationChoice.equals("Custom Event")) {
                    System.out.println("Great, Let's get started on your Event! First, how many people will be attending?");
                    int userEventPerson = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("OK, and what type of food should there be?");
                    String userEventMeal = bufferedReader.readLine();
                    System.out.println("Awesome! What type of drinks should there be?");
                    String userEventDrink = bufferedReader.readLine();
                    System.out.println("And what type of entertainment should there be?");
                    String userEventShow = bufferedReader.readLine();

                    Event userEvent = new Event(userEventPerson, userEventMeal, userEventDrink, userEventShow);
                    allEvents.add(userEvent);

                    System.out.println("This Event sounds great!");
                    System.out.println("----------------");
                    System.out.println(userEvent.getPerson());
                    System.out.println(userEvent.getMeal());
                    System.out.println(userEvent.getDrink());
                    System.out.println(userEvent.getShow());
                    System.out.println("$" + userEvent.calcAll());
                    System.out.println("----------------");

                } else if (navigationChoice.equals("Add Event")) {
                    System.out.println("What is your total budget for this Event?");
                    String stringUserMaxBudget = bufferedReader.readLine();
                    System.out.println("Great, Let's get started on your Event! First, how many people will be attending?");
                    int userEventPerson = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("OK, and what type of food should there be?");
                    String userEventMeal = bufferedReader.readLine();
                    System.out.println("Awesome! What type of drinks should there be?");
                    String userEventDrink = bufferedReader.readLine();
                    System.out.println("And what type of entertainment should there be?");
                    String userEventShow = bufferedReader.readLine();

                    Event userEvent = new Event(userEventPerson, userEventMeal, userEventDrink, userEventShow);
                    allEvents.add(userEvent);

                    System.out.println("This Event sounds great!");
                    System.out.println("----------------");
                    System.out.println(stringUserMaxBudget);
                    System.out.println(userEvent.getPerson());
                    System.out.println(userEvent.getMeal());
                    System.out.println(userEvent.getDrink());
                    System.out.println(userEvent.getShow());
                    System.out.println("$"+userEvent.calcAll());
                    System.out.println("----------------");
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

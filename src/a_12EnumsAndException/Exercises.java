package a_12EnumsAndException;

import java.util.Scanner;

public class Exercises {
    /**
     * Enum of the day of the weeks
     */
    public enum WeekDays {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

        /**
         * @param i number of the day
         * @return the day that corresponds to that number
         */
        public static WeekDays getDay(int i) {
            //We iterate trow all of the values of our enum
            for (WeekDays weekDays : WeekDays.values()) {
                //We check if the index of our enum coincides with the number they sent
                //hte number plus one because enums ordinals start in 0
                if (weekDays.ordinal() == i + 1) {
                    return weekDays; // when we find the match we return it
                }
            }
            //If the number doesn't coincide with any of the values, then is not a day
            return null;
        }

        /**
         * @return different than weekend, if its not the weekend is a weekday
         * if its a weekday it returns true
         */
        public boolean isWeekDay() {
            return !isWeekend();
        }

        /**
         * Sunday ordinal is 0; saturday ordinal is 6;
         *
         * @return true if the day is weekend
         */
        public boolean isWeekend() {
            return this.ordinal() == 0 || this.ordinal() == 6;
        }

    }

    /**
     * Enum system options
     */
    public enum Options {
        SAVE, LOAD, EXIT
    }

    /**
     * Enum of arithmetic operations
     */
    enum Operator {
        SUM, SUBTRACT, MULTIPLIES, DIVIDER
    }

    /**
     * @param x        first number
     * @param y        second number
     * @param operator one of our enums Operator: sum, subtract, multiplies and divider
     * @throws IllegalArgumentException if y is 0 and they are using the divider operator iit will throw an error
     *                                  due too the fact that you cannot divide by zero
     */
    public static void calculate(double x, double y, Operator operator) throws IllegalArgumentException {
        //Given our operator we choose an action
        switch (operator) {
            //We print the sum of the two numbers
            case SUM -> System.out.println(x + y);
            //We print the subtraction of the two numbers
            case SUBTRACT -> System.out.println(x - y);
            //We print the multiplication the two numbers
            case MULTIPLIES -> System.out.println(x * y);
            //We print the division of two numbers
            case DIVIDER -> {
                //We throw an exception if they try to divide by zero
                if (y == 0) throw new IllegalArgumentException("Black hole! Can't divide by 0!");
                System.out.println(x / y);
            }
            default -> System.out.print("Undefined operation!");
        }
    }

    public static void main(String[] args) {
        //Test of our enums

        //enums Operator
        calculate(12, 6, Operator.SUM);
        calculate(12, 6, Operator.SUBTRACT);
        calculate(12, 6, Operator.MULTIPLIES);
        calculate(12, 6, Operator.DIVIDER);
        //We try to divide by zero to test our error
        try {
            calculate(12, 0, Operator.DIVIDER);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        } finally {
            System.out.println(" -Alberto");
        }

        //enums WeekDays
        //We get the values of our enum and we iterate throw each of them
        for (WeekDays dia : WeekDays.values()) {
            //We will print .getParty for every Weekend day and .addBrain for every workday in our enum
            if (dia.isWeekend()) {
                System.out.println(dia + " .getParty()");
            } else if (dia.isWeekDay()) {
                System.out.println(dia + " .addBrain()");
            }
        }
        //We check our getDay method it prints the day that corresponds to the number 3
        System.out.println(WeekDays.getDay(3));

        //enum Options

        //We create an scanner so we can ask the user to insert a command
        Scanner scanner = new Scanner(System.in);
        //It will continue till we choose the option EXIT that will make the program stop
        while (true) {
            //We ask the user for a command
            System.out.println("Insert a command:");
            //We sent clean our command and option
            String command = "";
            Options op = null;
            //We put it inside a while so it keeps asking for a command till we have a valid one
            while (command.equals("")) {
                //We put it inside a try-catch to avoid crashing the application in case the user inputs and invalid argument
                try {
                    //We read what the user input and we save it into a variable
                    command = scanner.nextLine();
                    // we cast the command to uppercase, then we cast it to Option and finally we save it into our Option op
                    op = Options.valueOf(command.toUpperCase());
                } catch (IllegalArgumentException e) {
                    //if what we have above doesnt work it ask the user to put a command again
                    System.out.println("Invalid command, try again: ");
                    //We set out command to null, making sure the while loops once again
                    command = "";
                }
            }
            //Once we have a valid Option we insert it into our switch
            switch (op) {
                //If it was exit we print the end and end the program
                case EXIT -> {
                    System.out.println("The end!");
                    System.exit(0);
                    System.out.println("This will never run!");
                }
                //If it was save we print saving
                case SAVE -> System.out.println("Saving...");
                //If it was load we print loading
                case LOAD -> System.out.println("Loading...");

            }
        }
    }
}


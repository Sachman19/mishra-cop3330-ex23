/*
 *  UCF COP3330 Summer 2021 Assignment 23 Solution
 *  Copyright 2021 Sachin Mishra
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String answer;
        System.out.print("Is the car silent when you turn the key? ");
        answer = input.nextLine();
        if(test(answer)){
            System.out.print("Are the battery terminals corrupted? ");
            answer = input.nextLine();
            if(test(answer)){
                System.out.print("Clean terminals and try again.");
            }
            else{
                System.out.print("Replace Cables and try again.");
            }
        }
        else{
            System.out.print("Does the car make a slicking noise? ");
            answer = input.nextLine();
            if(test(answer)){
                System.out.print("Replace the battery.");
            }
            else{
                System.out.print("Does the car crank up but fail to start? ");
                answer = input.nextLine();
                if(test(answer)){
                    System.out.print("Check spark plug connections.");
                }
                else{
                    System.out.print("Does the engine start up then die? ");
                    answer = input.nextLine();
                    if(test(answer)){
                        System.out.print("Does the engine start up then die? ");
                        answer = input.nextLine();
                        if(test(answer)) {
                            System.out.print("Does your car have a fuel injection? ");
                            answer = input.nextLine();
                            if(test(answer)) {
                                System.out.print("Get it in for service.");
                            }
                            else{
                                System.out.print("Check to ensure your choke is opening and closing.");
                            }
                        }
                        else{
                            System.out.print("Check spark plug connections.");
                        }
                    }
                    else{
                        System.out.print("Stop it. Get some help.");
                    }
                }
            }
        }
        System.exit(0);


    }

    public static boolean test(String answer){
        return answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y");
    }
}
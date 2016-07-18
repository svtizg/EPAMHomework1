package com.epam.spb.lection2;

import java.util.Scanner;

/**
 * Created by SV-PC on 07.07.2016.
 */
public class RunExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input="";

        do{
            System.out.println("Enter a value of 1-15 to run ...");
            System.out.println("--1:  ArgumentsExample");
            System.out.println("--2:  AutoPack");
            System.out.println("--3:  BigExample");
            System.out.println("--4:  BitOperations");
            System.out.println("--5:  CharsTest");
            System.out.println("--6:  ClassExample");
            System.out.println("--7:  CoverClasses");
            System.out.println("--8:  DataTypes");
            System.out.println("--9:  Import");
            System.out.println("--10: InstanceOf");
            System.out.println("--11: LogicOperations");
            System.out.println("--12: Main");
            System.out.println("--13: Operators");
            System.out.println("--14: StringTransformation");
            System.out.println("--15: UnaryOperators");
            System.out.println("Enter 'quit' for completion.");
            System.out.println();

            input = scanner.next();

            switch (input){
                case "1":
                    ArgumentsExample.main(args);
                    break;
                case "2":
                    AutoPack.main(args);
                    break;
                case "3":
                    BigExample.main(args);
                    break;
                case "4":
                    BitOperations.main(args);
                    break;
                case "5":
                    CharsTest.main(args);
                    break;
                case "6":
                    ClassExample.main(args);
                    break;
                case "7":
                    CoverClasses.main(args);
                    break;
                case "8":
                    DataTypes.main(args);
                    break;
                case "9":
                    Import.main(args);
                    break;
                case "10":
                    InstanceOf.main(args);
                    break;
                case "11":
                    LogicOperations.main(args);
                    break;
                case "12":
                    Main.main(args);
                    break;
                case "13":
                    Operators.main(args);
                    break;
                case "14":
                    StringTransformation.main(args);
                    break;
                case "15":
                    UnaryOperators.main(args);
                    break;
                case "quit":
                    System.out.println("Run completed");
                    break;
                default:
                    System.out.println("Error in input. Please try again...");
            }
            System.out.println();

        } while (!input.equals("quit"));


    }
}

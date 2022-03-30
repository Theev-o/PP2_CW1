package com.michal.kuc;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Random rnd = new Random();
    static Scanner scn = new Scanner(System.in);
    static ArrayList<IFigure> figures = new ArrayList<>();

    public static void main(String[] args) {
        Figure fig = new Figure();
        int choice;

        System.out.print("Welcome. How many random shapes would you like to generate?\n>> ");
        while (true) {
            choice = scn.nextInt();
            if (choice < 99 && choice > 0) {
                System.out.println("Generating " + choice + " random figures...");
                break;
            } else {
                System.out.println("You must choose a number between 1 and 98. Please try again.");
            }
        }
        for (int i = 0; i < choice; i++) {
            figures.add(fig.create(rnd.nextInt(3)));
        }
        while (choice != 99) {
            System.out.println("\nDone. Displaying figure list...");
            displayFigList();
            System.out.print("""
                    ===============================
                    What would you like to do next?
                    1. Display figure
                    2. Remove figure
                    3. Add figure
                    4. Scale figure
                    99. Exit program
                    >>\040""");
            choice = scn.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Which figure would you like to display?\n>> ");
                    choice = scn.nextInt();
                    if (choice - 1 <= figures.size() && choice > 0) {
                        IFigure shape = figures.get(choice - 1);
                        System.out.println(shape.toString() + " has a circumference of " +
                                String.format("%.2f", shape.circumference()) + " and an area of " +
                                String.format("%.2f", shape.area()) + ".");
                    } else {
                        System.out.println("Shape with given index does not exist. Please try again.");
                    }
                }
                case 2 -> {
                    System.out.print("Which figure would you like to remove?\n>> ");
                    choice = scn.nextInt();
                    if (choice - 1 <= figures.size() && choice > 0) {
                        figures.remove(choice - 1);
                    } else {
                        System.out.println("Shape with given index does not exist. Please try again.");
                    }
                }
                case 3 -> {
                    System.out.println("""
                            What kind of figure would you like to add?
                            1. Square
                            2. Rectangle
                            3. Circle
                            >>\040""");
                    choice = scn.nextInt();
                    if (choice > 0 && choice < 4) {
                        figures.add(fig.create(choice - 1));
                    } else {
                        System.out.println("That wasn't a valid option. Please try again.");
                    }
                }
                case 4 -> {
                    System.out.print("Which figure would you like to scale?\n>> ");
                    choice = scn.nextInt();
                    if (choice - 1 <= figures.size() && choice > 0) {
                        IFigure shape = figures.get(choice - 1);
                        System.out.print("""
                                Upscale or downscale? (doubles or halves the area)
                                1. Upscale
                                2. Downscale
                                >>\040""");
                        choice = scn.nextInt();
                        switch (choice) {
                            case 1:
                                shape.scaleUp();
                                break;
                            case 2:
                                shape.scaleDown();
                            default:
                                System.out.println("That wasn't a valid option. Please try again.");
                        }

                    } else {
                        System.out.println("Shape with given index does not exist. Please try again.");
                    }
                }
                case 99 -> System.out.println("Exiting...");
                default -> System.out.println("That wasn't a valid option. Try again.");
            }

        }

    }

    static void displayFigList() {
        int i = 0;
        if (figures.size() != 0) {
            for (IFigure shape : figures) {
                System.out.println(++i + ": " + shape.toString());
            }
        } else {
            System.out.println("No figures to display.");
        }
    }
}

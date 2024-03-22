import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static ArrayList<String> list = new ArrayList<String>();
    public static Scanner scan = new Scanner(System.in);
    public static boolean done = false;
    public static void main(String[] args) {

        String option = "";
        list.addAll(Arrays.asList("Mr. Boolean", "Nick Beres", "Sub 5 minute mile", "LCL Victory", "Physics", "Books", "Math", "ReallyLongString", "Gamestop", "Barnes and Noble"));
        while (!done) {

            option = InputHelper.getRegExString(scan, "Options: \nA – Add an item to the list \nD – Delete an item from the list \nP – Print the list \nQ – Quit the program", "[AaDdPpQq]");
            if (option.equalsIgnoreCase("A")) {
                add();
            } else if (option.equalsIgnoreCase("D")) {
                delete();
            } else if (option.equalsIgnoreCase("P")) {
                print();
            } else if (option.equalsIgnoreCase("Q")) {
                quit();
            }
        }
    }

    public static void add() {
        String bruh = InputHelper.getNonZeroLenString(scan, "ADD SOMETHING AND DO IT QUICK");
        list.add(bruh);
    }

    public static void delete(){
        int index = InputHelper.getRangedInt(scan, "ENTER AN INDEX BEFORE I LOSE MY PATIENCE", 0, list.size());
        list.remove(index);
    }

    public static void print(){
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " - " + list.get(i));
        }
    }

    public static void quit(){
        done = InputHelper.getYNConfirm(scan, "Are you sure you want to quit? [Y/N]");
    }
}
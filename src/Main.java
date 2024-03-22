import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static ArrayList<String> list = new ArrayList<String>();
    public static Scanner scan = new Scanner(System.in);
    public static boolean done = false;
    public static void main(String[] args) {

        String option = "";
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
        String s = InputHelper.getNonZeroLenString(scan, "Add something to the list");
        list.add(s);
    }

    public static void delete(){
        int index = InputHelper.getRangedInt(scan, "Enter an index", 0, list.size());
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
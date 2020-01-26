package ProgPodstawowe_1_10_metods;

import java.util.Scanner;

public class MinutesToYears {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe minut:");
        int minutes = input.nextInt();

        // Number of minutes in a year
        int year = minutes / 525600;
        if (year>0)
            minutes=minutes-(525600*year);
        int day = minutes / 1440;
        if (day>0)
            minutes=minutes-(1440*day);
        int remainingMinutes = day % 525600;


        System.out.println(minutes + " minutes is " + year + " years and "  +  remainingMinutes + " days ");

    }

}

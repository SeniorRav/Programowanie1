package ProgPodstawowe_1_10_metods;

public class Palindrome {


    public static boolean isPalindrome(int number){
        int reversNumber = 0;
        int checkNumber = number;
        boolean isNegative = false;

        if(checkNumber<0)
        {
            checkNumber *= -1; //checkNumber = checkNumber * -1
            isNegative = true;
        }

        while(checkNumber > 0){
            reversNumber = reversNumber *10 + checkNumber%10;
            checkNumber /= 10;
        }
    if (isNegative)
        reversNumber *= -1;

        return (reversNumber == number);

    }


}

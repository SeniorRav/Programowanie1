package ProgPodstawowe_1_10_metods;

public class GetLargestPrime {


    public static void main(String[] args) {
        System.out.println("Large prime divisor for 21 is "+ getLargePrimeDivisor(21));

    }

    public static int getLargePrimeDivisor (int number){
        int checkNumber = number;
        int checkPrime;
        if(checkNumber < 0) return -1;

        while(checkNumber > 0 ){
            if(number % checkNumber == 0){
                checkPrime = 2;
                while(checkPrime <= checkNumber){
                    if(checkNumber % checkPrime == 0) break;
                    checkPrime++;
                }
                if(checkPrime==checkNumber)
                    return checkNumber;
            }

            checkNumber --;


        }

        return -1;
    }
}

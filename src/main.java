import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int numberChosen = readNumber();

        int[] firstAndSecondNumber = getFirstAndSecoundNumber(numberChosen);

        int thirdNumber = getThirdNumber(firstAndSecondNumber);

        int lastNumber = getLastNumber(firstAndSecondNumber);

        boolean isValid = isValidNumbers(sumValuesOfArray(firstAndSecondNumber), lastNumber, numberChosen);

        if(isValid){
            printFirstAndSecondNumber(firstAndSecondNumber);
            printThirdNumber(thirdNumber, numberChosen);
            printLastNumber(lastNumber);
        } else System.out.println("null");

    }

    private static boolean isValidNumbers(int num1Andnum2, int num4, int numberChosen) {

        if(num1Andnum2 + num4 == 21 && num4 < numberChosen ){
            return true;
        }
        return false;
    }

    private static int getThirdNumber(int[] firstAndSecondNumber) {
        int thirdNumber = 0;
        if(firstAndSecondNumber.length <= 2){
            return thirdNumber;
        } else return firstAndSecondNumber[2];
    }

    private static void printLastNumber(int number4) {
        System.out.println(number4);
    }

    private static int getLastNumber(int[] firstAndSecondNumber) {
        int sumValuesFirstNumbers = sumValuesOfArray(firstAndSecondNumber);
        return (21 - sumValuesFirstNumbers);
    }

    private static int sumValuesOfArray(int[] firstAndSecondNumber) {
        int sum = 0;
        for(int i = 0; i < firstAndSecondNumber.length; i++){
            sum = sum +  firstAndSecondNumber[i];
        }

        return sum;
    }

    private static void printThirdNumber(Integer thirdNumber, int numberChosen) {
        if(thirdNumber != numberChosen) {
            System.out.print(thirdNumber + " ");
        }
    }

    private static int[] getFirstAndSecoundNumber(int numberChosen) {
        int firstAndSecondNumber = 0;

        for( int i = 1; i <= 3; i++) {
            if(firstAndSecondNumber < 21 && firstAndSecondNumber + numberChosen<= 21) {
                firstAndSecondNumber = numberChosen * i;
            }
        }

        int vezes = firstAndSecondNumber/numberChosen;
        int[] numbers = new int[vezes];
        for(int i = 0; i < vezes; i++){
            numbers[i] = numberChosen;
        }

        return numbers;
    }

    private static void printFirstAndSecondNumber(int[] firstNumbers) {

        for(int i = 0; i < firstNumbers.length; i++){
            System.out.print(firstNumbers[i] + " ");
        }

    }

    private static int readNumber() {
        Scanner sc = new Scanner(System.in);
        int numChosen = 0;

        do{
            System.out.println("Digite um numero de 5 a 9");
            numChosen = sc.nextInt();
        }
        while(numChosen < 5 || numChosen > 9);

        return numChosen;
    }
}

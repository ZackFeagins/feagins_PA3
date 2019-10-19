import java.util.Scanner;
import java.security.SecureRandom;
import java.text.DecimalFormat;

public class feagins_p1 {
    private static double randomNumDouble(int length, int bound) {
        int[] numArray = new int[length];
        int randomNumDouble = 0;
        SecureRandom secRandom = new SecureRandom();
        for (int i = 0; i < length; i++) {
            numArray[i] = secRandom.nextInt(bound);
            double randomNumDoubleTemp = 0;
            randomNumDoubleTemp = (numArray[i] * Math.pow(10, i));
            randomNumDouble += randomNumDoubleTemp;
            //System.out.println(numArray[i] + " " + randomNumDoubleTemp + " " + " " + randomNumDouble);
        }
        return randomNumDouble;
    }
        private static int randomNumInt(int length2, int bound2) {      //broken
            int[] numArray2 = new int[length2];
            int randomNumInt = 0;
            SecureRandom secRandom2 = new SecureRandom();
            for (int i = 0; i < length2; i++) {
                int randomNumIntTemp;
                numArray2[i] = secRandom2.nextInt(bound2);
                randomNumIntTemp = (int) (numArray2[i] * Math.pow(10, i));
                randomNumInt += randomNumIntTemp;
            }
            return randomNumInt;
    }
    public static double newQuestion(int difficulty, int d) {
        double a = randomNumDouble(difficulty, 10);
        double b = randomNumDouble(difficulty, 10);
        if (d == 5) {
            d = randomNumInt(1, 4);
            d += 1;
        }
        if (d == 1) {
            double answer = a + b;
            System.out.print("How much is ");
            System.out.printf("%.0f", a);
            System.out.print(" plus ");
            System.out.printf("%.0f", b);
            System.out.println("?");
            return answer;
        }
        if (d == 2) {
            double answer = a * b;
            System.out.print("How much is ");
            System.out.printf("%.0f", a);
            System.out.print(" times ");
            System.out.printf("%.0f", b);
            System.out.println("?");
            return answer;
        }
        if (d == 3) {
            double answer = a - b;
            System.out.print("How much is ");
            System.out.printf("%.0f", a);
            System.out.print(" minus ");
            System.out.printf("%.0f", b);
            System.out.println("?");
            return answer;
        }
        if (d == 4) {
            double answer;
            if (b == 0) {
                answer = b / a;
            }
            else {
                answer = a / b;
            }
            System.out.print("How much is ");
            System.out.printf("%.0f", a);
            System.out.print(" divided by ");
            System.out.printf("%.0f", b);
            System.out.println("?");
            return answer;
        }
        else {
            return 0;
        }
    }
        public static void correctResponse () {
            int c = randomNumInt(1, 4);
            switch (c) {
                case 0:
                    System.out.println("Very good!");
                    break;
                case 1:
                    System.out.println("Excellent!");
                    break;
                case 2:
                    System.out.println("Nice work!");
                    break;
                case 3:
                    System.out.println("Keep up the good work!");
                    break;
            }
        }
        public static void wrongResponse () {
            int c = randomNumInt(1, 4);
            switch (c) {
                case 0:
                    System.out.println("No. Please try again.");
                    break;
                case 1:
                    System.out.println("Wrong. Try once more.");
                    break;
                case 2:
                    System.out.println("Don't give up!");
                    break;
                case 3:
                    System.out.println("no. Keep trying.");
                    break;
            }
        }

        public static void main (String[]args){
            Scanner scnr = new Scanner(System.in);
            char more;
            do {
                double kidAnswer = 0;
                double answer = 0;
                double numCorrect = 0;
                int difficulty;
                int d;
                System.out.println("What difficulty would you like? 1-4");
                difficulty = scnr.nextInt();
                System.out.println("What type of problem would you like?");
                System.out.println("1. Addition");
                System.out.println("2. Multiplication");
                System.out.println("3. Subtraction");
                System.out.println("4. Division (Will be rounded to two decimal places.)");
                System.out.println("5. Random");
                d = scnr.nextInt();
                for (int j = 0; j < 10; j++) {
                    answer = newQuestion(difficulty, d);
                    System.out.println(answer);
                    DecimalFormat df = new DecimalFormat("##.00");
                    answer = Double.valueOf(df.format(answer));
                    System.out.println(answer);
                    kidAnswer = scnr.nextDouble();
                    if (kidAnswer == answer) {
                        numCorrect += 1;
                        correctResponse();
                    } else {
                        wrongResponse();
                    }
                }
                double percentCorrect = numCorrect / 10.0;
                double numWrong = 10 - numCorrect;
                System.out.printf("%.0f", numCorrect);
                System.out.println(" correct");
                System.out.printf("%.0f", numWrong);
                System.out.println(" incorrect");
                //System.out.println("percentCorrect:" + percentCorrect);
                if (percentCorrect >= .75) {
                    System.out.println("Congratulations, you are ready to go to the next level!");
                } else {
                    System.out.println("Please ask your teacher for extra help.");
                }
                System.out.println("Would you like to reset? y/n");
                more = 'n';
                more = scnr.next().charAt(0);

            } while (more == 'y');
        }

    }
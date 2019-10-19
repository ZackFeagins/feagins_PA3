public class Application {
    public static void main(String[] args) {
        SavingsAccount saver1, saver2;
        saver1 = new SavingsAccount(2000.00);
        saver2 = new SavingsAccount(3000.00);
        SavingsAccount.modifyInterestRate(.04);

        System.out.println("\tSaver1 Year 1 at 4%");
        System.out.println("");
        for (int i = 0; i <= 11; i++) {
            saver1.calculateMonthlyInterest();
            System.out.print("Month: " + (i + 1) + "\t$");
            System.out.printf("%.2f", saver1.getSavingsBalance());
            System.out.println("");
        }
        System.out.println("");
        System.out.println("\tSaver2 Year 1 at 4%");
        System.out.println("");
        for (int i = 0; i <= 11; i++) {
            saver2.calculateMonthlyInterest();
            System.out.print("Month: " + (i + 1) + "\t$");
            System.out.printf("%.2f", saver2.getSavingsBalance());
            System.out.println("");
        }
        SavingsAccount.modifyInterestRate(.5);
        saver1.calculateMonthlyInterest();
        System.out.println("");
        System.out.println("\tSaver1 Year 2 at 5%");
        System.out.println("");
        System.out.print("Month: 1\t$");
        System.out.printf("%.2f", saver1.getSavingsBalance());
        System.out.println("");
        saver2.calculateMonthlyInterest();
        System.out.println("");
        System.out.println("\tSaver2 Year 2 at 5%");
        System.out.println("");
        System.out.print("Month: 1\t$");
        System.out.printf("%.2f", saver2.getSavingsBalance());
    }
}

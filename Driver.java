import java.util.*;
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userChoice;
        int numerator, denominator;
        Fraction f1, f2;

        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Compare\n6. Show decimal value\n7. Random\n8. Quit");
        userChoice = input.nextInt();
        while (userChoice != 8) {
            switch (userChoice) {
                case 1:
                System.out.print("Enter the first fraction's numerator: ");
                numerator = input.nextInt();
                System.out.print("Enter the first fraction's denominator: ");
                denominator = input.nextInt();
                if (denominator == 0) {
                    System.out.println("Denominator invalid");
                    break;
                }
                f1 = new Fraction(numerator,denominator);

                System.out.print("Enter the second fraction's numerator: ");
                numerator = input.nextInt();
                System.out.print("Enter the second fraction's denominator: ");
                denominator = input.nextInt();
                if (denominator == 0) {
                    System.out.println("Denominator invalid");
                    break;
                }
                f2 = new Fraction(numerator,denominator);

                System.out.println(f1.add(f2));
                break;

                case 2:
                System.out.print("Enter the first fraction's numerator: ");
                numerator = input.nextInt();
                System.out.print("Enter the first fraction's denominator: ");
                denominator = input.nextInt();
                if (denominator == 0) {
                    System.out.println("Denominator invalid");
                    break;
                }
                f1 = new Fraction(numerator,denominator);

                System.out.print("Enter the second fraction's numerator: ");
                numerator = input.nextInt();
                System.out.print("Enter the second fraction's denominator: ");
                denominator = input.nextInt();
                if (denominator == 0) {
                    System.out.println("Denominator invalid");
                    break;
                }
                f2 = new Fraction(numerator,denominator);

                System.out.println(f1.subtract(f2));
                break;

                case 3:
                System.out.print("Enter the first fraction's numerator: ");
                numerator = input.nextInt();
                System.out.print("Enter the first fraction's denominator: ");
                denominator = input.nextInt();
                if (denominator == 0) {
                    System.out.println("Denominator invalid");
                    break;
                }
                f1 = new Fraction(numerator,denominator);

                System.out.print("Enter the second fraction's numerator: ");
                numerator = input.nextInt();
                System.out.print("Enter the second fraction's denominator: ");
                denominator = input.nextInt();
                if (denominator == 0) {
                    System.out.println("Denominator invalid");
                    break;
                }
                f2 = new Fraction(numerator,denominator);

                System.out.println(f1.multiply(f2));
                break;

                case 4:
                System.out.print("Enter the first fraction's numerator: ");
                numerator = input.nextInt();
                System.out.print("Enter the first fraction's denominator: ");
                denominator = input.nextInt();
                if (denominator == 0) {
                    System.out.println("Denominator invalid");
                    break;
                }
                f1 = new Fraction(numerator,denominator);

                System.out.print("Enter the second fraction's numerator: ");
                numerator = input.nextInt();
                System.out.print("Enter the second fraction's denominator: ");
                denominator = input.nextInt();
                if (denominator == 0) {
                    System.out.println("Denominator invalid");
                    break;
                }
                f2 = new Fraction(numerator,denominator);

                System.out.println(f1.divide(f2));
                break;

                case 5:
                System.out.print("Enter the first fraction's numerator: ");
                numerator = input.nextInt();
                System.out.print("Enter the first fraction's denominator: ");
                denominator = input.nextInt();
                if (denominator == 0) {
                    System.out.println("Denominator invalid");
                    break;
                }
                f1 = new Fraction(numerator,denominator);

                System.out.print("Enter the second fraction's numerator: ");
                numerator = input.nextInt();
                System.out.print("Enter the second fraction's denominator: ");
                denominator = input.nextInt();
                if (denominator == 0) {
                    System.out.println("Denominator invalid");
                    break;
                }
                f2 = new Fraction(numerator,denominator);

                switch (f1.compareTo(f2)) {
                    case 1:
                    System.out.println(f1.toString() + " is greater than " + f2.toString());
                    break;
                    case -1:
                    System.out.println(f1.toString() + " is less than " + f2.toString());
                    break;
                    case 0:
                    System.out.println(f1.toString() + " is equal " + f2.toString());
                    break;
                }
                break;

                case 6:
                System.out.print("Enter the fraction's numerator: ");
                numerator = input.nextInt();
                System.out.print("Enter the fraction's denominator: ");
                denominator = input.nextInt();
                if (denominator == 0) {
                    System.out.println("Denominator invalid");
                    break;
                }
                f1 = new Fraction(numerator,denominator);
                System.out.println(f1.toString() + " is equal to " + f1.decimalValue());
                break;

                case 7:
                f1 = Fraction.randomFraction();
                System.out.println(f1.toString());
                break;

                case 8:
                System.out.println("Goodbye");
                break;

                default:
                System.out.println("Invalid choice");
                break;
            }
            System.out.print("\nNext choice: ");
            userChoice = input.nextInt();
            System.out.println();
        }
    }
}

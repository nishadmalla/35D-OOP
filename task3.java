package task.week3;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Program to find the maximum between three numbers
        System.out.println("Enter three numbers:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int max = (number1 > number2 && number1 > number3) ? number1 : (number2 > number3) ? number2 : number3;
        System.out.println("Maximum number is: " + max);

        // 2. Program to check whether a number is negative, positive, or zero
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }

        // 3. Program to check whether a number is divisible by 5 and 11 or not
        System.out.print("Enter a number: ");
        int numberDiv = scanner.nextInt();
        if (numberDiv % 5 == 0 && numberDiv % 11 == 0) {
            System.out.println(numberDiv + " is divisible by both 5 and 11");
        } else {
            System.out.println(numberDiv + " is not divisible by both 5 and 11");
        }

        // 4. Program to check whether a number is even or odd
        System.out.print("Enter a number: ");
        int numberEvenOdd = scanner.nextInt();
        if (numberEvenOdd % 2 == 0) {
            System.out.println(numberEvenOdd + " is even");
        } else {
            System.out.println(numberEvenOdd + " is odd");
        }

        // 5. Program to check whether a year is a leap year or not
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeapYear) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        // 6. Program to input any alphabet and check whether it is vowel or consonant
        System.out.print("Enter an alphabet: ");
        char alphabet = scanner.next().charAt(0);
        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' ||
            alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U') {
            System.out.println("It is a vowel");
        } else {
            System.out.println("It is a consonant");
        }

        // 1. 
        System.out.print("Enter student's grade (A, B, C, D, or F): ");
        char grade = scanner.next().charAt(0);
        double gpa;
        switch (grade) {
            case 'A':
                gpa = 4.0;
                break;
            case 'B':
                gpa = 3.0;
                break;
            case 'C':
                gpa = 2.0;
                break;
            case 'D':
                gpa = 1.0;
                break;
            case 'F':
                gpa = 0.0;
                break;
            default:
                System.out.println("Invalid grade entered!");
                return;
        }
        System.out.println("GPA: " + gpa);

        // 2. 
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator entered!");
                return;
        }
        System.out.println("Result: " + result);

        // 3. 
        System.out.print("Enter month (1 to 12): ");
        int month = scanner.nextInt();
        String season;
        switch (month) {
            case 1:
            case 2:
            case 3:
                season = "Winter";
                break;
            case 4:
            case 5:
            case 6:
                season = "Spring";
                break;
            case 7:
            case 8:
            case 9:
                season = "Summer";
                break;
            case 10:
            case 11:
            case 12:
                season = "Fall";
                break;
            default:
                season = "Invalid month entered!";
        }
        System.out.println("Season: " + season);

        // 4. 
        System.out.println("Choose a shape to calculate its area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();
        double area;
        switch (choice) {
            case 1:
                System.out.print("Enter radius of the circle: ");
                double radius = scanner.nextDouble();
                area = Math.PI * radius * radius;
                System.out.println("Area of the circle: " + area);
                break;
            case 2:
                System.out.print("Enter length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width of the rectangle: ");
                double width = scanner.nextDouble();
                area = length * width;
                System.out.println("Area of the rectangle: " + area);
                break;
            case 3:
                System.out.print("Enter side of the square: ");
                double side = scanner.nextDouble();
                area = side * side;
                System.out.println("Area of the square: " + area);
                break;
            case 4:
                System.out.print("Enter base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height of the triangle: ");
                double height = scanner.nextDouble();
                area = 0.5 * base * height;
                System.out.println("Area of the triangle: " + area);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}

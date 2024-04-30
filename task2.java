package task.Week2;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. 
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        String result = (age >= 18) ? "You can vote!" : "You cannot vote yet.";
        System.out.println(result);
        
        // 2. 
        System.out.print("Enter principle amount: ");
        double principle = scanner.nextDouble();
        System.out.print("Enter time (in years): ");
        double time = scanner.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = scanner.nextDouble();
        double simpleInterest = (principle * time * rate) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
        
        // 3. 
        System.out.print("Enter base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of the triangle: ");
        double height = scanner.nextDouble();
        double triangleArea = 0.5 * base * height;
        System.out.println("Area of the triangle: " + triangleArea);
        
        System.out.print("Enter side of the cube: ");
        double side = scanner.nextDouble();
        double cubeVolume = side * side * side;
        System.out.println("Volume of the cube: " + cubeVolume);
        
        System.out.print("Enter length of the cuboid: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of the cuboid: ");
        double width = scanner.nextDouble();
        System.out.print("Enter height of the cuboid: ");
        double heightCuboid = scanner.nextDouble();
        double cuboidVolume = length * width * heightCuboid;
        System.out.println("Volume of the cuboid: " + cuboidVolume);
        
        // 4. 
        String result2 = (age >= 18) ? "You can vote!" : "You cannot vote yet.";
        System.out.println(result2);
        
        // 5. 
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        int product = num1 * num2;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        
        // 6. 
        int sum2 = num1 + num2;
        int product2 = num1 * num2;
        double division = (double) sum2 / product2;
        System.out.println("Division of sum and product: " + division);
        
        // 7. 
        System.out.print("Enter your name: ");
        scanner.nextLine(); // Consume the newline
        String name = scanner.nextLine();
        System.out.print("Enter your roll number: ");
        String rollNumber = scanner.nextLine();
        System.out.print("Enter your field of interest: ");
        String interest = scanner.nextLine();
        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber + ". My field of interest is " + interest + ".");
        
        // 8. 
        System.out.print("Enter side of the square: ");
        double sideSquare = scanner.nextDouble();
        double areaSquare = sideSquare * sideSquare;
        double perimeterSquare = 4 * sideSquare;
        double simpleInterestSquare = (sideSquare * sideSquare * 10) / 100; 
        double triangleAreaSquare = 0.5 * sideSquare * sideSquare;
        double cubeVolumeSquare = sideSquare * sideSquare * sideSquare;
        double cuboidVolumeSquare = sideSquare * sideSquare * sideSquare * 2; 
        System.out.println("Area of square: " + areaSquare);
        System.out.println("Perimeter of square: " + perimeterSquare);
        System.out.println("Simple Interest: " + simpleInterestSquare);
        System.out.println("Area of triangle: " + triangleAreaSquare);
        System.out.println("Volume of cube: " + cubeVolumeSquare);
        System.out.println("Volume of cuboid: " + cuboidVolumeSquare);
        
        // 9. 
        System.out.print("Enter length of rectangle: ");
        double lengthRect = scanner.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadthRect = scanner.nextDouble();
        double areaRect = lengthRect * breadthRect;
        int areaRectInt = (int) areaRect;
        System.out.println("Area of rectangle (type casted to int): " + areaRectInt);
        
        // 10.
        System.out.print("Enter marks for subject 1: ");
        int subject1 = scanner.nextInt();
        System.out.print("Enter marks for subject 2: ");
        int subject2 = scanner.nextInt();
        System.out.print("Enter marks for subject 3: ");
        int subject3 = scanner.nextInt();
        System.out.print("Enter marks for subject 4: ");
        int subject4 = scanner.nextInt();
        int totalMarks = subject1 + subject2 + subject3 + subject4;
        double percentage = (totalMarks / 400.0) * 100;
        String resultFinal = (percentage >= 70) ? "First Class" : (percentage >= 60) ? "Upper Second Class" : (percentage >= 50) ? "Second Class" : (percentage >= 40) ? "Third Class" : "Fail";
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + resultFinal);
        
        scanner.close();
    }
}


import java.util.Scanner;

public class UserInterface {
    private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        printAverageOfPoints();
        printAverageOfPassing();
        printpassPercentage();
        printGradeDistribution();
    }

    public void readPoints() {
        while (true) {
            int points = Integer.valueOf(scanner.nextLine());
            if (points == -1) {
                break;
            }
            if (points >= 0 && points <= 100) {
                this.register.addGradeBasedOnPoints(points);
            }
        }
    }

    public void printGradeDistribution() {
        int grade = 5;
        System.out.println("Grade distribution");
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade -= 1;
        }

    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }

    public void printAverageOfPoints() {
        System.out.println("Point average (all): " + this.register.averageOfPoints());
    }

    public void printAverageOfPassing() {
        if (this.register.averageOfPassing() == -1) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + this.register.averageOfPassing());
        }
    }

    public void printpassPercentage() {
        System.out.println("Pass percentage: " + this.register.passPercentage());
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double costPerKM = 2.2;
        int startCost = 10;
        double targetDistance;
        double totalCost;
        System.out.print("Enter target distance: ");
        targetDistance = input.nextDouble();
        totalCost = (costPerKM * targetDistance);
        totalCost += startCost;
        totalCost = (totalCost < 20) ? 20 : totalCost;
        System.out.print("Total cost: " + totalCost);
        totalCost = input.nextDouble();




    }
}
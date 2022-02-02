package machine;

import java.util.Scanner;

public class ProjectStageTwo {

    private final Scanner scanner = new Scanner(System.in);

    public void stageTwo() {
        System.out.println("Write how many cups of coffee you will need:");
        int cupsOfCoffee = scanner.nextInt();
        final int coffeeWater = 200;
        final int coffeeMilk = 50;
        final int coffeeBeans = 15;

        System.out.println("For " + cupsOfCoffee + " you will need:");
        System.out.println(cupsOfCoffee * coffeeWater + " ml of water");
        System.out.println(cupsOfCoffee * coffeeMilk + " ml of milk");
        System.out.println(cupsOfCoffee * coffeeBeans + " g of coffee beans");
    }
}

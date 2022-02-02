package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        ProjectStageOne projectStageOne = new ProjectStageOne();
//        projectStageOne.stageOne(); // uncomment line 10 and 11 to run Stage 1 of the project

//        ProjectStageTwo projectStageTwo = new ProjectStageTwo();
//        projectStageTwo.stageTwo(); // uncomment line 13 and 14 to run Stage 2 of the project

//        ProjectStageThree projectStageThree = new ProjectStageThree();
//        projectStageThree.stageThree(); // uncomment line 16 and 17 to run Stage 3 of the project

//        ProjectStageFour projectStageFour = new ProjectStageFour();
//        projectStageFour.stageFour(); // uncomment line 19 and 20 to run Stage 4 of the project

//        ProjectStageFive projectStageFive = new ProjectStageFive();
//        projectStageFive.stageFive(); // uncomment line 22 and 23 to run Stage 5 of the project

        ProjectStageSixFinal projectStageSixFinal = new ProjectStageSixFinal(400, 540, 120, 9, 550);
        projectStageSixFinal.start();

        while (projectStageSixFinal.getState() != State.SHUTDOWN) {
            projectStageSixFinal.processInput(scanner.next());
        } // final stage starts from line 26 and ends up here

    }
}


package performancelab;

import performancelab.clean.CleanAlcoholCalculation;
import performancelab.unclean.UncleanAlcoholCalculation;

public class App {
    public static void main(String[] args) {
        System.out.println("Starting the competition performance: CLEAN vs UNCLEAN code:");
        System.out.println("We used an arbitrary wine alcoholic level calculation to perform the test.");
        System.out.println();
        System.out.println();

        long cleanStart, cleanEnd, unCleanStart, unCleanEnd;


        System.out.println("Performing the test one single time: ");

        System.out.println("CLEAN: ----------------------");
        cleanStart = System.currentTimeMillis();
        performCleanTest(true);
        cleanEnd = System.currentTimeMillis();
        System.out.println("CLEAN total processing duration in milliseconds: " + (cleanEnd - cleanStart));

        System.out.println();

        System.out.println("UNCLEAN: --------------------");
        unCleanStart = System.currentTimeMillis();
        performUncleanTest(true);
        unCleanEnd = System.currentTimeMillis();
        System.out.println("UNCLEAN total processing duration in milliseconds: " + (unCleanEnd - unCleanStart));

        System.out.println();
        System.out.println();
        System.out.println("Performing the test fifth thousand times: ");

        System.out.println("CLEAN: ----------------------");
        cleanStart = System.currentTimeMillis();
        for(int c = 0;c<50000;c++){
            performCleanTest(false);
        }
        cleanEnd = System.currentTimeMillis();
        System.out.println("CLEAN total processing duration in milliseconds: " + (cleanEnd - cleanStart));

        System.out.println();

        System.out.println("UNCLEAN: --------------------");
        unCleanStart = System.currentTimeMillis();
        for(int c = 0;c<50000;c++){
            performUncleanTest(false);
        }
        unCleanEnd = System.currentTimeMillis();
        System.out.println("CLEAN total processing duration in milliseconds: " + (unCleanEnd - unCleanStart));


    }

    static void performCleanTest(boolean showResult){
        CleanAlcoholCalculation cleanAlcoholCalculation = new CleanAlcoholCalculation();
        cleanAlcoholCalculation.calculate(showResult);
    }

    static void performUncleanTest(boolean showResult){
        UncleanAlcoholCalculation uncleanAlcoholCalculation = new UncleanAlcoholCalculation();
        uncleanAlcoholCalculation.calculate(showResult);
    }

}

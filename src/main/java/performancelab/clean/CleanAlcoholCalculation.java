package performancelab.clean;

public class CleanAlcoholCalculation {

    public void calculate(boolean showResult){

        Wine theWine1 = WineFactory.create(WineType.RED);
        Wine theWine2 = WineFactory.create(WineType.WHITE);
        Wine theWine3 = WineFactory.create(WineType.GREEN);

        assert theWine1 != null;
        double wineAlcohol1 = theWine1.getAlcoholLevel(2);
        assert theWine2 != null;
        double wineAlcohol2 = theWine2.getAlcoholLevel(2);
        assert theWine3 != null;
        double wineAlcohol3 = theWine3.getAlcoholLevel(2);

        if(showResult){
            System.out.println("CLEAN   Wine 1 alcohol level is: " + wineAlcohol1);
            System.out.println("CLEAN   Wine 2 alcohol level is: " + wineAlcohol2);
            System.out.println("CLEAN   Wine 3 alcohol level is: " + wineAlcohol3);
        }
    }

}

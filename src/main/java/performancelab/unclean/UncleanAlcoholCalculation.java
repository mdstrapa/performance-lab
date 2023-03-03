package performancelab.unclean;

public class UncleanAlcoholCalculation {

    public void calculate(boolean showResult){
        double wineAlcohol1 = getAlcoholLevel("RED",2);
        double wineAlcohol2 = getAlcoholLevel("WHITE",2);;
        double wineAlcohol3 = getAlcoholLevel("GREEN",2);;

        if(showResult){
            System.out.println("UNCLEAN Wine 1 alcohol level is: " + wineAlcohol1);
            System.out.println("UNCLEAN Wine 2 alcohol level is: " + wineAlcohol2);
            System.out.println("UNCLEAN Wine 3 alcohol level is: " + wineAlcohol3);
        }
    }

    double getAlcoholLevel(String wineType,int grapeAcidLevel){
        if(wineType.equals("RED")) return (grapeAcidLevel * 2 / 0.7);
        else if (wineType.equals("WHITE")) return (grapeAcidLevel * 3 / 0.89);
        else return (grapeAcidLevel * 2.1 / 0.66);
    }

}

package performancelab.clean;

public class WineFactory {
    public static Wine create(WineType wineType ){
        switch (wineType){
            case RED:
                return new RedWine();
            case WHITE:
                return new WhiteWine();
            case GREEN:
                return new GreenWine();
        }
        return null;
    }
}

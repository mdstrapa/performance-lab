package performancelab.clean;

public class WhiteWine extends Wine{
    @Override
    public double getAlcoholLevel(int grapeAcidLevel) {
        return (grapeAcidLevel * 3 / 0.89);
    }
}

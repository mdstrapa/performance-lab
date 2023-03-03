package performancelab.clean;

public class GreenWine extends Wine{
    @Override
    public double getAlcoholLevel(int grapeAcidLevel) {
        return (grapeAcidLevel * 2.1 / 0.66);
    }
}

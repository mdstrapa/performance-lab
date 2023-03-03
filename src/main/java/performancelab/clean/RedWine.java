package performancelab.clean;

public class RedWine extends Wine {
    @Override
    public double getAlcoholLevel(int grapeAcidLevel) {
        return (grapeAcidLevel * 2 / 0.7);
    }
}

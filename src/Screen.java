public class Screen {

    private final double diagonal;
    private final int weight;
    private final ScreenType screenType;

    public Screen(double diagonal, int weight, ScreenType screenType) {
        this.diagonal = diagonal;
        this.weight = weight;
        this.screenType = screenType;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public int getWeight() {
        return weight;
    }

    public ScreenType getScreenType() {
        return screenType;
    }

    public String toString() {
        return "Экран: "
                + "диагональ экрана " + diagonal
                + ", тип экрана " + screenType;
    }
}
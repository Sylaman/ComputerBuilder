public class Keyboard {

    private final String type;
    private final boolean isBackLight;
    private final int weight;

    public Keyboard(String type, boolean isBackLight, int weight) {
        this.type = type;
        this.isBackLight = isBackLight;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public boolean isBackLight() {
        return isBackLight;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        if (isBackLight) {
            return "Клавиатура: "
                    + "тип " + type
                    + ", наличие подстветки: да";
        } else {
            return "Клавиатура: "
                    + "тип " + type
                    + ", наличие подстветки: нет";
        }
    }
}
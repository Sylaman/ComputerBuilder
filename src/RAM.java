public class RAM {

    private final int memoryCapacity;
    private final int weight;
    private final String type;

    public RAM(int memoryCapacity, int weight, String type) {
        this.memoryCapacity = memoryCapacity;
        this.weight = weight;
        this.type = type;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return "Оперативная память: "
                + "объем памяти " + getMemoryCapacity()
                + ", тип " + getType();
    }
}
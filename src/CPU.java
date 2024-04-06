public class CPU {

    private final int frequency;
    private final int coreNumber;
    private final int weight;
    private final String producer;

    public CPU(int frequency, int coreNumber, int weight, String producer) {
        this.frequency = frequency;
        this.coreNumber = coreNumber;
        this.weight = weight;
        this.producer = producer;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getCoreNumber() {
        return coreNumber;
    }

    public int getWeight() {
        return weight;
    }

    public String getProducer() {
        return producer;
    }

    public String toString() {
        return "Процессор: "
                + "частота " + frequency
                + ", количество ядер " + coreNumber
                + ", производитель " + producer;
    }
}
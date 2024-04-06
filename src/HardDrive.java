public class HardDrive {

    private final int storageCapacity;
    private final int weight;
    private final HardDriveType hardDriveType;

    public HardDrive(int storageCapacity, int weight, HardDriveType hardDriveType) {
        this.storageCapacity = storageCapacity;
        this.weight = weight;
        this.hardDriveType = hardDriveType;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public int getWeight() {
        return weight;
    }

    public HardDriveType getHardDriveType() {
        return hardDriveType;
    }

    public String toString() {
        return "Жесткий диск: "
                + "объем жесткого диска " + storageCapacity
                + ", тип " + hardDriveType;
    }
}
public class Computer {

    private CPU cpu;
    private RAM ram;
    private HardDrive hardDrive;
    private Screen screen;
    private Keyboard keyboard;
    private final String vendor;
    private final String name;
    private int totalWeight;

    public Computer(String vendor, String name, Keyboard keyboard, Screen screen, HardDrive hardDrive, RAM ram, CPU cpu) {
        this.vendor = vendor;
        this.name = name;
        this.keyboard = keyboard;
        this.screen = screen;
        this.hardDrive = hardDrive;
        this.ram = ram;
        this.cpu = cpu;
    }

    public int calculateTotalWeight() {
        totalWeight = totalWeight + cpu.getWeight() + ram.getWeight() + hardDrive.getWeight() + screen.getWeight() +
                keyboard.getWeight();
        return totalWeight;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public CPU getCpu() {
        return cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public Screen getScreen() {
        return screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Название: " + getName() + "\n"
                + "Продавец " + getVendor() + "\n"
                + cpu.toString() + "\n"
                + ram.toString() + "\n"
                + hardDrive.toString() + "\n"
                + screen.toString() + "\n"
                + keyboard.toString() + "\n"
                + "Вес: " + calculateTotalWeight() + " грамм";
    }
}
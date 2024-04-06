public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Ситилинк", "Acer Nitro 5",
                new Keyboard("механическая", true, 600),
                new Screen(18.7, 2050, ScreenType.IPS),
                new HardDrive(4000, 850, HardDriveType.SSD),
                new RAM(8000, 700, "DDR4"),
                new CPU(7000, 8, 1000, "INTEL"));

        System.out.println(computer1);
    }
}
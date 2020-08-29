public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1204);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
           int megaBytes = kiloBytes/1024;
           int remainingKiloBytes = kiloBytes % 1024;
           int XX = kiloBytes;
           int YY = megaBytes;
           int ZZ = remainingKiloBytes;
            System.out.println(XX + " KB = " + YY + " MB and " + ZZ + " KB");
        }
    }

}

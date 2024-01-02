package Jawab_2;

/**
 *
 * @author mr.sun
 */

// Main.java
public class Main {
    public static void main(String[] args) {
        // Membuat objek Manager, Developer, dan Designer
        Manager manager = new Manager("ANDI");
        Developer developer = new Developer("ARIF");
        Designer designer = new Designer("BUDI");

        // Memanggil metode work() pada setiap objek
        manager.work();
        developer.work();
        designer.work();
    }
}

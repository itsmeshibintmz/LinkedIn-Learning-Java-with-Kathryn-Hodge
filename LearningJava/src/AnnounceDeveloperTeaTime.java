import java.util.Scanner;

public class AnnounceDeveloperTeaTime {

    public static void announceDeveloperTeaTime() {
        System.out.println("Wating for developer Tea Time...");
        System.out.println("Type in a random word and press Enter to start developer tea Time...");
        Scanner input =  new Scanner(System.in);
        input.next();
        System.out.println("It's developer Tea Time!");
        input.close();
    }
    public static void main(String[] args) {
        announceDeveloperTeaTime();
    }
}

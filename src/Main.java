// Press Shift
// twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int myMiles = service.calculate(13000);
        System.out.println("Мои мили: " + myMiles);
    }
}
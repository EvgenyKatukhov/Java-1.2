public class Main {
    public static void main(String[] args) {
        MilesService service = new MilesService();
        int result = service.calculate(1000, 100);
        System.out.println("На вашем счете с учетом бонуса " + result);
    }
}




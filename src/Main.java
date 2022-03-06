public class Main {
    public static void main(String[] args) {
        Bonus service = new Bonus();
        int result = service.calculate(1000, 100);
        System.out.println("На вашем счете с учетом бонуса " + result);
    }
}




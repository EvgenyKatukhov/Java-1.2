public class Main {
    public static void main(String[] args) {
        Bonus service = new Bonus();
        int result = service.calculate(1000, 100);
        System.out.println("На вашем счете с учетом бонуса " + result);
    }
     public int calculate(int increase, int fix) {
        if (increase >= 1000) {
            int bonus = increase / 100;
            int ent = fix + bonus + increase;
            System.out.println("На вашем счету " + fix);
            System.out.println("Вы пополнили счет на " + increase);
            return ent;
        } else {
            int ent = fix + increase;
            System.out.println("Ваш счет равен " + ent);
            return ent;
        }

    }





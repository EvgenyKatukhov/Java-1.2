public class MilesService {
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
}




//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        int age = 17;
        if (age >= 18) {
            System.out.println("Он совершеннолетний.");
        } else {
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать.");
        }
        int temperature = 4;
        if (temperature >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки.");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку.");
        }
        int speed = 55;
        if (speed > 60) {
            System.out.println("Придётся заплатить штраф.");
        } else {
            System.out.println("Можно ездить спокойно.");
        }
        int agePerson = 18;
        if (agePerson >= 2 && agePerson <= 6) {
            System.out.println("Если возраст человека " + agePerson + " , то ему нужно ходить в детский сад.");
        }
        if (agePerson >= 7 && agePerson <= 17) {
            System.out.println("Если возраст человека " + agePerson + " , то ему нужно ходить в школу.");
        }
        if (agePerson >= 18 && agePerson <= 24) {
            System.out.println("Если возраст человека " + agePerson + " , то его место в университете.");
        }
        if (agePerson > 24) {
            System.out.println("Если возраст человека " + agePerson + " , то ему пора ходить на работу.");
        }
        int ageChild = 13;
        if (ageChild < 5) {
            System.out.println("Если возраст ребёнка " + ageChild + " , то он не может кататься на аттракционе.");
        } else if (ageChild > 5 && ageChild < 14) {
            System.out.println("Если возраст ребёнка " + ageChild + " , то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println("Если возраст ребёнка " + ageChild + " , то он может кататься без сопровождения взрослого.");
        }
        int carriageCapacity = 102;
        int seatsInTheCarriage = 60;
        int people = 80;
        if (people < 60) {
            System.out.println("Есть сидячие места.");
        } else if (people < 102 && people > 60) {
            System.out.println("Есть только стоячие места.");
        } else {
            System.out.println("Вагон забит полностью.");
        }
        int one = 10;
        int two = 15;
        int three = 19;
        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }






















    }
}
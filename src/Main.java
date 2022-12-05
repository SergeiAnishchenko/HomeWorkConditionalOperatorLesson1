public class Main {
    public static void main(String[] args) {

        task1();
        System.out.println(" ");
        task2();
        System.out.println(" ");
        task3();
        System.out.println(" ");
        task4();
        System.out.println(" ");
        task5();
        System.out.println(" ");
        task6();
        System.out.println(" ");
        task7();

    }

    private static void task1() {
        System.out.println("Задача 1");
        int age = 23;
        if (age > 18) {
            System.out.println("Если возраст человека равен " + age + ",то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age +
                    " он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    private static void task2() {
        System.out.println("Задача 2");
        int temperature = 2;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
    }

    private static void task3() {
        System.out.println("Задача 3");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ",то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ",то можно ездить спокойно.");
        }

    }

    private static void task4() {
        System.out.println("Задача 4");
        int age = 3;
        if (age > 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно ходить в детский сад.");
        } else if (age > 6 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно ходить в школу.");
        } else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно ходить в университет.");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно ходить на работу.");
        }
    }

    private static void task5() {
        System.out.println("Задача 5");
        int childAge = 3;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge +
                    ",то ему нельзя кататься на аттракционе.");
        } else if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge +
                    ",то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else if (childAge >= 14) {
            System.out.println("Если возраст ребенка равен " + childAge +
                    ",то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
    }

    private static void task6() {
        System.out.println("Задача 6");
        int totalCountOfSeats = 102;
        int countOfSedentarySeats = 60;
        int countOfStandingSeats = totalCountOfSeats - countOfSedentarySeats;
        int countOfSedentaryPassengers = 60;
        int countOfStandingPassengers = 41;
        if (countOfSedentaryPassengers < countOfSedentarySeats || countOfStandingPassengers < countOfStandingSeats) {
            System.out.println("В вагоне есть место.");
        } else System.out.println("Вагон полностью забит.");
    }

    private static void task7() {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число " + one + " является наибольшим из трех чисел.");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " является наибольшим из трех чисел.");
        } else if (three > one && three > two) {
            System.out.println("Число " + three + " является наибольшим из трех чисел.");
        }
    }

}
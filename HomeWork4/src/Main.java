public class Main {
    public static void main(String[] args) {
        //Task 1
        int age = 25;
    if (age >= 18) {
        System.out.println("Задача 1.\nЕсли возраст человека равен " + age + " годам, то он совершеннолетний.");
    } else {
        System.out.println("\nЗадача 1.\nЕсли возраст человека равен " + age + " годам, то он не достиг совершеннолетия.");
    }

    //Task 2
        int temperature = 18;
    if (temperature >= 5) {
        System.out.println("\nЗадача 2.\nНа улице " + temperature + " градусов. Можно идти без шапки.");
    } else {
        System.out.println("\nЗадача 2.\nНа улице " + temperature + " градусов. Нужно надеть шапку.");
    }

    //Task 3
        int speed = 77;
    if (speed <= 60) {
        System.out.println("\nЗадача 3.\nЕсли скорость " + speed + " км/ч то можно ездить спокойно.");
    } else {
        System.out.println("\nЗадача 3.\nЕсли скорость " + speed + " км/ч то придётся заплатить штраф.");
    }

    //Task 4 (Переменная возраста указана в задаче 1)
        if (age >= 2 && age <= 6) {
            System.out.println("\nЗадача 4.\nЕсли возраст человека равен " + age + " годам, то ему нужно ходить в детский сад.");
        } if (age >= 7 && age <= 17) {
            System.out.println("\nЗадача 4.\nЕсли возраст человека равен " + age + " годам, то ему нужно ходить в школу.");
        } if (age >= 18 && age <= 24) {
            System.out.println("\nЗадача 4.\nЕсли возраст человека равен " + age + " годам, то ему нужно ходить в университет.");
        } if (age >= 25) {
            System.out.println("\nЗадача 4.\nЕсли возраст человека равен " + age + " годам, то ему нужно ходить на завод до конца своих дней.");
        }

        //Task 5 (Переменная возраста указана в задаче 1)
        if (age < 5) {
            System.out.println("\nЗадача 5.\nЕсли возраст ребёнка равен " + age + " годам, то ему нельзя кататься на аттракционах.");
        } if (age >= 5 && age < 14) {
            System.out.println("\nЗадача 5.\nЕсли возраст ребёнка равен \" + age + \" годам, то ему можно кататься на аттракционах только в сопровождении взрослых.");
        } if (age > 14) {
            System.out.println("\nЗадача 5.\nЕсли возраст ребёнка равен " + age + " годам, то ему можно кататься на аттракционах без сопровождения.");
        }
            //Если возраст ребёнка равен 25 годам, то ему нужно ходить на завод до конца своих дней, какие аттракционы?

            //Task 6
            int seat = 23;
            if (seat > 0 && seat <= 102) {
                System.out.println("\nЗадача 6\nВ вагоне есть для вас место.");
                if (seat > 0 && seat <= 60) {
                    System.out.println("Сидячее.");
                } else {
                    System.out.println("Стоячее.");
                }
            } else {
                System.out.println("\nЗадача 6\nВ вагоне нет места для вас или вы указали некорректный номер.");
            }

            //Task 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("\nЗадача 7.\nНаибольшее число - " + one);
        }
        if (two > one && two > three) {
            System.out.println("\nЗадача 7.\nНаибольшее число - " + two);
        }
        if (three > one && three > two) {
            System.out.println("\nЗадача 7.\nНаибольшее число - " + three);
        }
    }
}

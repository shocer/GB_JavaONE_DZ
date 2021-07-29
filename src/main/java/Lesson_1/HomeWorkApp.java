package Lesson_1;

public class HomeWorkApp {

    public static void main(String[] args) {
        System.out.println("");
        printThreeWords();

        checkSumSign(10, -15);

        printColor(101);

        compareNumbers(15,15);

    }

    // Первое задание. Вывести три строчки со словами
    public static void printThreeWords() { // Первое задание. Вывести три строчки со словами
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Второе зпдпние. метод принимает два значения, суммирует их, сравнивает и выдает результат сравнения с 0.
    public static void checkSumSign(int a, int b) {

        int sum=a+b;

        if (sum<0) {
            System.out.println("Сумма отрицательная");
        }
        else {
            System.out.println("Cумма положительная");
        }

    }
    // Третье задание. В зависимости от исходного значеия вывести
    public static void printColor(int a) {
        int value =a;

        if (value<0 || value==0) {
            System.out.println("Красный");
        }
        else if(value>0 && value<101){
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {

        if (a>=b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }


}

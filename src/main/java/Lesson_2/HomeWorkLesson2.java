package Lesson_2;

public class HomeWorkLesson2 {

    public static void main(String[] args) {
        String s="test";
        int n = 5;
        CopyStringNTimes (s,n);

        for (int i=1;i<2021;i++){
            System.out.println("Год "+i+" високосный "+ IsLeapYear(i));
        }

    }


    public static boolean ChekSumOfInts (int a, int b) {
        int sum=a+b;
        if (sum>=10 && sum<=20) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void checkSign(int a) {

        if (a<0) {
            System.out.println("Число отрицательное");
        }
        else {
            System.out.println("Число положительное");
        }
    }

    public static boolean checkSignBool(int a) {

        if (a<0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void CopyStringNTimes (String str,int n) {
        if (n>0) {
            System.out.println(str);
            System.out.println(n);
            CopyStringNTimes(str, n - 1);
        }
        /**   Вариант через цикл
         *         for (int i=0; i<n;i++){
         *             System.out.println(str);
         *             //System.out.println(i);
         *         }
         */
    }

    public static boolean IsLeapYear (int y) {
        if(y%400==0){
            return true;
        } else if(y%100==0){
            return false;
        }else if (y%4==0) {
            return true;
        }else {
            return false;
        }

    }


}

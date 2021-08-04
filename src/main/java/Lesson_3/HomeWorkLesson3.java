package Lesson_3;
import java.util.Arrays;
import java.util.Random;

public class HomeWorkLesson3 {
    public static void main(String[] args) {


        /// Задание 1.
        System.out.println("Задание 1.");
        int [] arr = new int[10];   //Задается массив и все эллемнты масива забиваются случайными значениями в промежутке о 0 до 1
        for (int i = 0; i<10;i++){
            arr[i]= (int) (Math.random()*2);
            //System.out.println(arr[i]);
        }

        System.out.println(Arrays.toString(arr));


/**
        for (int i = 0; i<arr.length;i++){  // в цикле происходит инверсия значений
            if( arr[i] ==0) {
                arr[i]=1;
            }else {
                arr[i]=0;
            }
        }
*/
        ArrInverse(arr);        //тоже самое просто в методе

        System.out.println(Arrays.toString(arr));




        /// Задание 2.
        System.out.println("Задание 2.");

        int [] hundred = new int[100];  /// создается массив и забивается заначениями по прядку.
        for (int i = 0; i<10;i++){
            hundred[i]= i+1;
        }
        System.out.println(Arrays.toString(hundred));

        System.out.println();

        /// Задание 3.
        System.out.println("Задание 3.");

        int [] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};         //Задается массив
        System.out.println(Arrays.toString(numbers));

        for(int i = 0; i<numbers.length;i++){   /// каждый элемент массива сравнивается с 6 и если значение меньше то значение умножается на 2.
            if (numbers[i]<6){
                numbers[i]=numbers[i]*2;
            }
        }
        System.out.println(Arrays.toString(numbers));


        // Задание 4.   Создается массив 10х10, затем забивается 0 при помощи метода из пятого задания.
        System.out.println("Задание 4.");


        int [][] matrix = new int[10][10];
        for (int i=0; i<matrix.length;i++){
            FillRandomArr(matrix[i],10);
        }
        //System.out.println(matrix.length);
        for (int i=0;i<matrix[0].length;i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();

        for (int i=0;i<matrix[0].length;i++) { /// В цикле, гланая и побочная диагоноли забиваются 1.
            matrix[i][i]=1;
            matrix[i][(matrix.length-1)-i]=1;
        }

        for (int i=0;i<matrix[0].length;i++) {
        System.out.println(Arrays.toString(matrix[i]));
        }



        /// Задание 5.
        System.out.println("Задание 5.");

        int [] Ar= FillArr(10,10);
        System.out.println(Arrays.toString(Ar));



        /// Задание 6.
        System.out.println("Задание 6.");

        int [] kvadtatiki= new int[100];
        FillRandomArr(kvadtatiki,100);

        int max=kvadtatiki[0];
        int min=kvadtatiki[0];

        for (int i=0;i<kvadtatiki.length;i++) {
            if (max<kvadtatiki[i]) {
                max=kvadtatiki[i];
            }
            if (min>kvadtatiki[i]) {
                min=kvadtatiki[i];
            }
        }
        System.out.println("Минимальное значение в масиве ="+min);
        System.out.println("Максимальное значение в масиве ="+max);


        /// Задание 7.
        System.out.println("Задание 7.");



        /// Задание 8.
        System.out.println("Задание 8.");

        int [] LinAr =new int[5];
        FillRandomArr(LinAr,9);
        System.out.println(Arrays.toString(LinAr));

        int shift= -3;
        shift= shift %5;
        System.out.println(shift);
        System.out.println();

        SingleShiftArr(LinAr);
        System.out.println(LinAr);












    }

    public static void ArrInverse (int a[]) {
        for (int i=0;i< a.length;i++) {
            if(a[i]<=0) {
                a[i]=1;
            }
            else {
                a[i]=0;
            }
        }

    }


    public static int[] FillArr (int len, int initialValue){
        int [] arr = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void FillRandomArr (int a[], int Max) {          //вспомогательный метод
        for (int i = 0; i< a.length; i++){
            a[i]=(int) (Math.random()*(Max+1));
        }
    }
    /**
    public static void ShiftArr (int b[], int shift) {
        shift= shift % b.length;
        if (shift<0){
            shift=b.length-shift;
        }
        do {
            SingleShiftArr(b[]);
            shift--;
        }while (shift>0);

        }
    }
    */
    public static void SingleShiftArr (int a[]) {
        int a1=0;
        a1=a[a.length-1];
        for (int j=a.length-1; j >0; j--) {
            a[j]=a[j-1];
        }
        a[0]=a1;

        System.out.println(Arrays.toString(a));

    }

}


//Дано целое число num. Необходимо написать программу, которая выводит на экран таблицу умножения num  до 10. Например, если num=3 то вывод должен быть таким:
//        3*1=3
//        3*2=6
//        3*3=9
//        -----
//        3*9=27
//        3*10=30

public class Main {
    public static void main(String[] args) {

        int num=3;
        int mult=1;
        while (mult<=10){
            System.out.printf("%d * %2d = %d%n", num, mult, num*mult);
            mult+=1;

        }

        System.out.println("__________________________________________________");

//Дано целое число num. Необходимо написать программу, которая считает, сколько разрядов в этом числе. Например:
//           	3 -> 1
//           	343 -> 3
//           	98761 -> 5

        int num1=1723;
        int dig=1;
        int div=10;

        if (num1 / div < 1){
            System.out.println(num1 + " -> " + (dig));
        } else {

            while (num1 / div >= 1) {

                div = div * 10;
                dig = dig + 1;
            }
            System.out.println(num1 + " -> " + (dig));
        }
    }
}
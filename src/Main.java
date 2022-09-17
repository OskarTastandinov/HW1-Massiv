import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
        task1();
        task2();
        task3();
        task4();

    }
    public static void task1(){
        int[] weight = new int[12];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = weight.length;i > 0; i--) {
            System.out.print(i + ", ");

        }
    }
    public static void task2(){
        System.out.println();
        double[] weight = {1.57,7.654,9.986};
        for (double i = weight.length; i > 0; i--) {
            System.out.print(i + ", ");
        }
    }
    public static void task3(){
        System.out.println();
        int[] summ = new int [10];
        for (int i = summ.length; i > 0; i--) {
            System.out.print(i + ", ");

        }

    }
    public static void task4() {
        System.out.println();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0;i < arr.length; i++){
            if(i % 2 != 0) {
                i = (i + 1);
                System.out.print(i + " ");
            }

        }


    }

}

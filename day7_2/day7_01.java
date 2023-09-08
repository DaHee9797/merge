package day7_2;

public class day7_01 {
    public static void main(String[] args) {

        for (int i = 0; i < 9; i++) {
            System.out.print(i + " ");

            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < 5; i++)
        {
            for(int j = 10; j >0; j--)
            {
                System.out.println((i+j) + " " + (i-j));
            }
        }


    }
}

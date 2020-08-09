import java.util.Scanner;

public class TutorialOne {

    public static String One(int a ){

        String Output="";

        switch (a){
            case 1:
                Output = "One";
                break;
            case 2:
                Output = "Two";
                break;
            case 3:
                Output = "Three";
                break;
            case 4:
                Output = "Four";
                break;
            case 5:
                Output = "Five";
                break;
            case 6:
                Output = "Six";
                break;
            case 7:
                Output = "Seven";
                break;
            case 8:
                Output = "Eight";
                break;
            case 9:
                Output = "Nine";
                break;
            case 0:
                Output = "Zero";
                break;
            default:
                System.out.println("输入错误");


        }

        return Output;
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("请输入数字：");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            System.out.println(One(a));
        }
    }

}

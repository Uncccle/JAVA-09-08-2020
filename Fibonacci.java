public class Fibonacci {

    public static int caculate(int a){

        int x = 0;

        if (a == 0){
            x = 0;
        }else if (a == 1){
            x = 1;
        }else {
            x = caculate(a - 1) + caculate(a - 2);
        }

        return x;

    }

    public static void main(String[] args) {
//        System.out.println(caculate(0));
//        System.out.println(caculate(1));
        System.out.println(caculate(10));
    }
}

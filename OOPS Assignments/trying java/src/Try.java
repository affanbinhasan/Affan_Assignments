
public class Try {

    public static void main(String[] args) {
        int x =371;
        //System.out.println(getarm(x));

        for(int i = 100; i < 999;i++){
            System.out.println(getarm(i));
        }
       
    }
    public static String getarm(int n){
        int num, rem, result = 0;

        num = n;

        while (num != 0)
        {
            rem = num % 10;
            result += Math.pow(rem, 3);
            num /= 10;
        }

        if(result == n)
            return "It is an Armstrong number.";
        else
            return "It is not an Armstrong number.";
    }
}
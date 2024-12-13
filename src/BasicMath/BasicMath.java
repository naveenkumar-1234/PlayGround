package BasicMath;

public class BasicMath {
    public static int countDigit(int num){
        int count=0;
        while(num>0){
            num/=10;
            count++;
        }
        return count++;
    }
    public static int reverseNumber(int num){
        String str="";
        while(num>0){
            str+=num%10;
            num/=10;
        }
        return Integer.parseInt(str);
    }
    public static boolean checkPalindrome(int num){

        return false;
    }
    public static void main(String[] args) {
//        System.out.println(countDigit(532433));
//        System.out.println(reverseNumber(12345678));
          System.out.println(checkPalindrome(12321));
    }
}

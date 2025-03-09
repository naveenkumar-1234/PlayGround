package zoho;

public class SumOfNumbersInString {
    public static int sumOfNumbersInString(String str){
       int sum = 0 , num = 0;

       for(int i = 0 ; i < str.length() ; i++){
           char ch = str.charAt(i);
           if( ch >= 48 && ch <= 57 ){
               num = (num * 10) + (ch - '0');
           }else if(ch > 57){
               sum += num;
               num = 0;
           }
       }
       sum += num;
       return sum;
    }

    public static void main(String[] args) {
        String str = "1ab40b34";
        System.out.println(sumOfNumbersInString(str));
    }
}

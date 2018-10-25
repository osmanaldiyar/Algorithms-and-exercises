package armstrongnumber;

public class ArmstrongNumber {

    public static void main(String[] args) {
        armstrongNumber(153);
        armstrongNumber(22);
    }

    public static void armstrongNumber(int n){

        String s = n + "";
        char[] chars = s.toCharArray();
        int[] digits = new int[chars.length];

        int sum = 0;

        for(int i = 0;i < chars.length;i++){
            digits[i] = Character.getNumericValue(chars[i]);
            digits[i] = digits[i]*digits[i]*digits[i];
            sum += digits[i];
        }

        if(sum == n){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not armstrong number");
        }

    }

}

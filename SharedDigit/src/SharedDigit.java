public class SharedDigit {

    public static boolean hasSharedDigit(int a, int b){
        int lefta=a/10;
        int righta=a%10;
        int leftb= b/10;
        int rightb =b%10;
        if (((a < 10) || (a > 99)) ||((b < 10) || (b > 99))){
            return false;

        } return (lefta ==leftb || lefta==rightb || righta == leftb || righta ==rightb);

        }
        }

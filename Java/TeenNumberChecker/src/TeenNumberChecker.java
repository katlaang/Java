public class TeenNumberChecker {
    public static boolean hasTeen(int firstParam, int secondParam, int thirdParam){
        if ((firstParam >=13 && firstParam <=19) || (secondParam >=13 && secondParam <=19) || (thirdParam >=13 && thirdParam <=19)){
            return true;
        }return false;
    }
    public static boolean isTeen(int parameter){
        if (parameter >= 13 && parameter <=19 ){
            return true;
        }return false;
    }
}

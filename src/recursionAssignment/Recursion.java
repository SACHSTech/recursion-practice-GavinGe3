package recursionAssignment;

public class Recursion{

    public static int count7(int n){
        int intSevenCount = 0;

        if (n < 7){
            return 0;
        }
        else{
            return n%10/7    + count7(n/10);
            
        }
    }

    public static int countHi(String n){
        if (n.equals("")){
            return 0;
        }
        else{

            if (n.length() > 1 && n.substring(0,2).equals("hi")){
                return 1 + countHi(n.substring(1));
            }
            else if (n.length() > 1 && n.substring(0,2) != ("hi")){
                return 0 + countHi(n.substring(1));
            }
            else{
                return 0;
            }
            }
        }
    


    public static String changePi(String n){
        if (n.length() < 2){
            return n;
        }
        else if (n.substring(0,2).equals("pi")){
            return "3.14" + changePi(n.substring(2));
        }

        else{
            return n.substring(0,1) + changePi(n.substring(1));
        }
        }
    

    public static String pairStar(String n){
        if (n.length() < 2){
            return n;
        }
        else if (n.length() > 1 && n.substring(0,1).equals(n.substring(1,2))){
            return n.substring(0,1) + "*" + pairStar(n.substring(1));
        }
        else {
            return n.substring(0,1) + pairStar(n.substring(1));
        }
    }

    public static String stringClean(String n){
        if (n.length() < 2){
            return n;
        }
        else if (n.substring(0,1).equals(n.substring(1,2))){
            return stringClean(n.substring(1));
        }
        else{
            return n.substring(0,1) + stringClean(n.substring(1));
        }
    }


    public static boolean strCopy(String n, String x, int j){
        if (j == 0){
            return true;
        }
        else if (n.length() > 0 && n.length() >= x.length() && n.substring(0, x.length()).equals(x)) {
            return strCopy(n.substring(1),x,j-1);
        }
        else if (n.length() > 0 && n.length() >= x.length() && !n.substring(0, x.length()).equals(x)){
            return strCopy(n.substring(1),x,j);
        }
        else{
            return false;
        }
    }
}


    


/**Made my HackedAndVerified ...problem number 1 on SuperB's event held on 25/8/2022 */

class bouncy{
    //Function to check if number is a increasing number
    public static boolean INum(int num){
        boolean flag = true;
        int dig1 = num % 10;
        int dig2 = 0;
        num /= 10;
        while(num >= 1){
            dig2 = num % 10;
            if(dig2 > dig1)
                flag = false;
            dig1 = dig2;
            num /= 10;
        }
        return flag;

    }
    //Function to check if number is a increasing number
    public static boolean DNum(int num){
        boolean flag = true;
        int dig1 = num % 10;
        int dig2 = 0;
        num /= 10;
        while(num >= 1){
            dig2 = num % 10;
            if(dig2 < dig1)
                flag = false;
            dig1 = dig2;
            num /= 10;
        }
        return flag;
    }
    //Main method to check where the proportion hits 99%...
    public static void main(String[] args) {
        int i, BouncyCnt ;
        for(i = 101;i <= 100000;i++){
            BouncyCnt = 0;
            for(int j = 1;j<=i;j++){
            if(!INum(j) && !DNum(j)){
                BouncyCnt++;
            }
        }
        double perc = (BouncyCnt/i)*100;
        if(perc == 99.0){
            System.out.println("The proportion of bouncy numbers becomes 99 at..." + i);
            break;
        }
        }
        System.out.println("Program has ended");
        }
    }

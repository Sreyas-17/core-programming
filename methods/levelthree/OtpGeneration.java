import java.util.*;
public class OtpGeneration {
    static void generatingOtp(){
        int[] randomNumbers=new int[6];
        int i=0;
        Random random =new Random();
        while (i<6){
            randomNumbers[i]=random.nextInt(100000,999999);
            i++;
        }
        Set<Integer> randomSet=new HashSet<>();
        System.out.print("The randomly generated number for OTP is: \n");
        for(int num:randomNumbers) {
            randomSet.add(num);
            System.out.println(num);
        }
        if(randomSet.size()==6){
            System.out.println("All generated numbers are unique");
        }
        else{
            System.out.println("All generated numbers are not unique");
        }
    }
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    generatingOtp();
    }
}

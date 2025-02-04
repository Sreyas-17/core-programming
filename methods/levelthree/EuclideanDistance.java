import java.util.Scanner;

public class EuclideanDistance {
    static void findEuclideanDistance(int x1,int y1,int x2,int y2){
        int distance=(int)Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("The Euclidean distance is :" +distance);
    }
    static int[] findYInterceptAndSlope(int x1,int y1,int x2,int y2){
        int slope=(y2-y1)/(x2-x1);
        int yIntercept=y1-slope*x1;
        return new int[]{slope,yIntercept};
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the x1, y1, x2 and y2: ");
        int x1=input.nextInt();
        int y1=input.nextInt();
        int x2=input.nextInt();
        int y2=input.nextInt();
        findEuclideanDistance(x1, y1, x2, y2);
        int[] yInterceptAndSlope=findYInterceptAndSlope(x1, y1, x2, y2);
        System.out.println("The y intercept is "+yInterceptAndSlope[1]+" and the slope is "+yInterceptAndSlope[0]);
        input.close();
    }
}

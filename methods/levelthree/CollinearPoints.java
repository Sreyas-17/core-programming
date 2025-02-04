import java.util.Scanner;

public class CollinearPoints {
    static void findCollinearUsingSlope(int x1,int y1,int x2,int y2,int x3,int y3){
        int SlopeAB=(y2-y1)/(x2-x1);
        int SlopeAC=(y3-y1)/(x3-x1);
        int SlopeBC=(y3-y2)/(x3-x2);
        if(SlopeAB==SlopeAC && SlopeAC==SlopeBC){
            System.out.println("The points are collinear using slope");
        }
        else{
            System.out.println("The points are not collinear using slope");
        }
    }

    static void findCollinearUsingAreaOfTriangle(int x1,int y1,int x2,int y2,int x3,int y3) {
        int areaOfTriangle= (int) (0.5*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2)));
        if(areaOfTriangle==0){
            System.out.println("The points are collinear using area of triangle");
        }
        else{
            System.out.println("The points are not collinear using area of triangle");
        }
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three points: ");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int x3=sc.nextInt();
        int y3=sc.nextInt();
        findCollinearUsingSlope(x1,y1,x2,y2,x3,y3);
        findCollinearUsingAreaOfTriangle(x1,y1,x2,y2,x3,y3);
    }
}

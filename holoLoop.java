import java.util.*;
public class holoLoop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height : ");
        int n = sc.nextInt();
        int spaceprint = n;
        int starprint = n+1;
        int end = 0;

        int spaceprint2 = -1;
        int starprint2 = -1;

        for(int i=1; i>0; i++){
            if( end >= n && end < 2*n){
                if( i <= spaceprint2 ){
                    System.out.print("  ");
                } else if ( i > spaceprint2 && i <= starprint2){
                    System.out.print("* ");
                } else if ( i > starprint2 ) {
                    i = 0;
                    System.out.println();
                    spaceprint2 ++;
                    starprint2 --;
                    end ++;
                }
            } else if ( end == 2*n ) {
                return;
            } else {
                if( i <= spaceprint ){
                    System.out.print("  ");
                } else if( i > spaceprint && i <= starprint ) {
                    System.out.print("* ");
                } else if( i > starprint ){
                    System.out.println();
                    i = 0;
                    spaceprint2 = spaceprint + 1;
                    starprint2 = starprint - 1;
                    starprint ++;
                    spaceprint --;
                    end ++;
                }
            }
        }
    }
}
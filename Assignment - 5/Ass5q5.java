import java.util.*;
public class Ass5q5{
    public static void main(String[] args) {
        int c=0;

        for (int i=1;i<=3;i++){
            for (int j=1;j<=3;j++){
                for (int k=1;k<=3;k++){
                    if (i!=j && j!=k && i!=k){
                        System.out.println("" + i + j + k);
                        c++;
                    }
                }
            }
        }

        System.out.println("Total count is: " + c);
    }
}

public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava method = new BasicJava();
        method.Print1to255();

        System.out.println("-------------------------------------");
        method.PrintOdd1to255();

        System.out.println("-------------------------------------");
        method.sum0to255();

        System.out.println("-------------------------------------");
        int [] arr= {1,3,5,7,9,13};
        method.Iterating(arr);

        System.out.println("-------------------------------------");
        int[] newarr = {-5, -3, -7};
        System.out.println(method.FindMax(newarr));

        System.out.println("-------------------------------------");
        int[] newarr1 = { 2, 10, 3 };
        System.out.println( method.FindAvrg(newarr));
        
        System.out.println("-------------------------------------");
        int[] arraynew = {1, 3, 5, 7};
        int y = 3;
        System.out.println(" values in the array that are greater than "+y+ " :"+method.GreaterThanY(arraynew,y));

        System.out.println("-------------------------------------");
        int [] newArr= {1, 5, 10, -2} ;
        method.EliminateNegNum(newArr);  

        System.out.println("-------------------------------------");
        int[] arrnew = {1, 5, 10, -2};
        System.out.println( method.MaxMinandAverage(arrnew));
        
        System.out.println("-------------------------------------");
        int [] nwarr= { 1, 5, 10, 7, -2};
        method.ShiftingValues(nwarr);

    }

}

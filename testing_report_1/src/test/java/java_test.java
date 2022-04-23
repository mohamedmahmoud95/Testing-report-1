import static org.junit.Assert.*;
import org.junit.Test;

import java.awt.*;
import java.sql.Array;


public class java_test {
    @Test
//    public void test(){
//        int arr[]= new int[5];
//        arr[0]=-1;
//        arr[1]=0;
//        arr[2]=25;
//        arr[3]=200;
//        arr[4]=201;
//        report calculator = new report();
//        //assertEquals(8,simple_calculator.add(4,4));
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                for (int k = 0; k < arr.length; k++) {
////                    System.out.print(arr[i]+" ");
////                    System.out.print(arr[j]+" ");
////                    System.out.print(arr[k]+" ");
////                  System.out.println(simple_calculator.maximum(arr[i],arr[j],arr[k]));
//
//                    assertEquals(report.getTestedMaximum(arr[i],arr[j],arr[k]),report.maximum(arr[i],arr[j],arr[k]));
//                }
//            }
//        }
//
//
//    }

//   public void testProblem1(){
//        int input[]= new int[7];
//        input[0]=-1;
//        input[1]=0;
//        input[2]=1;
//        input[3]=2;
//        input[4]=6;
//        input[5]=100;
//        input[6]=101;
//
//        String[] output = new String[7];
//        output[0]=null;
//        output[1]=null;
//        output[2]="NO";
//        output[3]="NO";
//        output[4]="YES";
//        output[5]="YES";
//        output[6]=null;
//
//        for (int i = 0; i < input.length; i++) {
//            assertEquals(output[i],report.returnIsItSeparableOrNotForProblem1(input[i]));
//        }
//
//   }
   public void testProblem2(){
        //[-1,1,100,101] with integer numbers of test cases [-101,-100,50,100,101]

       int input[];
       input = new int[] {-1,1,100,101};

       for (int i = 0; i <input.length ; i++) {
           assertEquals(input[i],report.isInEquilibriumForProblem2(input[i]));
       }

     }
}
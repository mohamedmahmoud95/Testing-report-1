import java.util.Random;

public class report {
//    public static int add(int x, int y){
//        return x+y;
//    }
//    public static Object getTestedMaximum(int x,int y, int z){
//        if (x<0 || x>200 || y<0 || y>200 || z<0 || z>200){
//            return null;
//
//        }else{
//            int temp= Math.max(x,y);
//            temp = Math.max(temp, z);
//            return temp;
//
//        }
//    }





//
//    public static Object maximum(int x,int y, int z){
//        if (x<0 || x>200 || y<0 || y>200 || z<0 || z>200){
//            return null;
//
//        }else{
//            int temp;
//            if(x>y){
//                temp=x;
//                if(temp>z){
//                    return temp;
//                }else{
//                    return z;
//                }
//            }else{
//                temp = y;
//                if(temp>z){
//                    return temp;
//                }else{
//                    return z;
//                }
//
//
//            }
//
//
//        }
//    }

    static String returnIsItSeparableOrNotForProblem1(int w)
    {
        if(w<=0 || w>100) return null;
        if(w%2==0 && w>2){
            return "YES";
        }else{
            return "NO";
        }
    }


    static String isInEquilibriumForProblem2(int n){
        if(n>100 || n<1){
            return null;
        }
        //int[][][] arrayOfForces = new int[n][n][n] ;
        int[][] arrayOfForces = new int[n][3];
        Random rand = new Random(); //instance of random class
        int low = -100;
        int high = 100;
        for (int i = 0; i <arrayOfForces.length ; i++) {
             arrayOfForces[i][0] = rand.nextInt(high - low) + low;
            arrayOfForces[i][1] = rand.nextInt(high - low) + low;
            arrayOfForces[i][2] = rand.nextInt(high - low) + low;
        }
        int x,y,z;
        x=y=z=0;

        for (int i = 0; i <n; i++) {
            if ( arrayOfForces[i][0]>100 ||arrayOfForces[i][0]>-100 || arrayOfForces[i][1]>100 ||arrayOfForces[i][1]>-100 || arrayOfForces[i][2]>100 ||arrayOfForces[i][2]>-100) {
return null;
            }
            x+=    arrayOfForces[i][0];
            y+=   arrayOfForces[i][1];
            z+=  arrayOfForces[i][2];
        }
        if (x !=0 || y!=0 || z!=0) {
            return "NO";
        }else{
            return "YES";
        }
    }

}

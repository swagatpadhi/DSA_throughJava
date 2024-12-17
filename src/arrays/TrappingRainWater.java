package arrays;
import java.util.*;

public class TrappingRainWater {
    public static void findAuxilaryArrays(int[] height) {
        //left max heights array
        int[] lmh = new int[height.length];
        lmh[0] = height[0];
        for(int i = 1; i < height.length; i++) {
            lmh[i] = Math.max(height[i], lmh[i-1]);
        }
        //print lmh
        //System.out.println(Arrays.toString(lmh));

        //right max height array
        int[] rmh = new int[height.length];
        rmh[height.length-1] = height[height.length-1];
        for(int i = height.length-2; i >= 0; i--) {
            rmh[i] = Math.max(height[i], rmh[i+1]);
        }

        //print rmh
        //System.out.println(Arrays.toString(rmh));
        int currTrappedWater = 0;
        int totalTrappedWater = 0;
        for(int i = 0; i < height.length; i++) {
            //current trapped water=(water level - height)*width;
            currTrappedWater = ((Math.min(rmh[i], lmh[i]))-height[i])*1;
            totalTrappedWater += currTrappedWater;
        }
        System.out.println("Total Trapped Water: "+totalTrappedWater);
    }
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        findAuxilaryArrays(height);
    }
}

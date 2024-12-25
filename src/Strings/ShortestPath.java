package Strings;
import java.util.*;
public class ShortestPath {
    public static void main(String[] args) {
        String dest = "WNEENESENNN";
        findShortestPath(dest);
    }

    private static void findShortestPath(String dest) {
        int xCoord = 0;
        int yCoord = 0;
        for(int i = 0; i < dest.length(); i++) {
            char direction = dest.charAt(i);
            if(direction == 'W') {
                xCoord -= 1;
            }
            else if(direction == 'E') {
                xCoord += 1;
            }
            else if(direction == 'N') {
                yCoord += 1;
            }
            else {
                yCoord -= 1;
            }
        }
        System.out.println("Source: (0,0)");
        System.out.println("Destination: ("+xCoord+","+yCoord+")");
        System.out.println("Shortest Path = "+ Math.sqrt(Math.pow(xCoord,2)+Math.pow(yCoord,2)));
    }
}

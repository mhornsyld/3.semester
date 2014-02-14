package group_01_3sem;

import java.util.Random;

/**
 *
 * @author Morten Hornsyld
 */
public class Group_01_3sem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(new Random().nextInt(2)%1 == 1)
        {
            System.out.println("YEAH!!!");
        }
        else
        {
            System.out.println("NO!!!");
        }
    }
    
}

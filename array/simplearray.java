package array;

public class simplearray {

    /**
     * Arrays contain variables (elements) of the same type
     * Arrays are referenced by name
     * Elements of an array are referenced by index
     */        
    public static void main(String[] args) {                        
        int[] levels = new int[4];  //declare empty array of size 4
        //assign values
        levels[0] = 90;  
        levels[1] = 80;
        levels[2] = 70;
        levels[3] = 50;
        
        //statement to declare/assign values to array
        String[] classes = {"A", "B", "C", "D"};
        
        System.out.printf("#\tClass\tScore\n");
        System.out.printf("-------------------------\n");
        
        //for loops for enumerating array
        for (int i = 0; i < levels.length; i++)
        {
            System.out.printf("%d\t%s\t%d\n", i, classes[i], levels[i]);
        }

        int total = 0;
        for (int i = 0; i < levels.length; i++)
        {
            total += levels[i];
        }
        System.out.printf("Average level across all classes: %d\n", total/levels.length);
    }
}
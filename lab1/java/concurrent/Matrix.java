import java.util.Random;

public class Matrix implements Runnable{

    public int size;

    public Matrix(int size){
    	this.size = size;
    }    

    public static int[][] generateMatrix(int size) {
        Random random = new Random();
	int[][] matrix = new int[size][size];
        
	for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(29500 - 250 + 1) + 250;
            }
        }

        return matrix;
    }

    public static int Min(int[][] matrix) {
        int smallest = Integer.MAX_VALUE;

        for (int[] row : matrix) {
            for (int element : row) {
                if (element < smallest) {
                    smallest = element;
                }
            }
        }

        return smallest;
    }

    public static int Max(int[][] matrix) {
        int largest = Integer.MIN_VALUE;

        for (int[] row : matrix) {
            for (int element : row) {
                if (element > largest) {
                    largest = element;
                }
            }
        }

        return largest;
    }
   @Override
   public void run(){
  	int[][] shareMatrix = generateMatrix(size);
	System.out.printf("Max value: %d\n", Matrix.Max(shareMatrix));
        System.out.printf("Min value: %d\n", Matrix.Min(shareMatrix));
   }
}

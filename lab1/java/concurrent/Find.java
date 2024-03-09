public class Find{

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Use: java Main <size>");
            System.exit(1);
        }
        try {
	   
            int size = Integer.parseInt(args[0]);
	  
	    Thread tMatrix = new Thread(new Matrix(size), "t-matrix");
	    
            tMatrix.start();
	    tMatrix.join();         
            
        } catch (NumberFormatException e) {
            System.out.println("The size of the matrix must be an integer.");
            System.exit(1);
        } catch (InterruptedException e) {
	    System.out.prinln(e);
	}
    }
}

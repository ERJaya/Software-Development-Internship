public class NumberPatern {
    static void TrianglePattern(int rows) {
        for (int i = 1; i <=rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
      
        }
       
    }
    static void ReverseTriangle(int rows){
        for (int i = rows; i >=1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void squarePattern(int rows){
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int rows=5;
        System.out.println("Triangle Pattern :");
        TrianglePattern(rows);

        System.out.println("Reverse Triangle pattern :");
        ReverseTriangle(rows);

        System.out.println("Square Pattern :");
        squarePattern(rows);
    }
}

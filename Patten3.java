public class Patten3 {
    public static void main(String[] args) {
        System.out.println("Arsh Patel");

        //revers pyramid
        int n=4;
        for (int i = n; i>=1; i--){
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

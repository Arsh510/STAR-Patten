public class patten2 {
    public static void main(String[] args) {
        System.out.println("Arsh Patel");

        //Half Pyramid 
        int n = 4;
        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

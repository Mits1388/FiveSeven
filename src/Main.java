public class Main {
    public static void main(String[] args) {
        int c = 1;

        while (c <= 100) {
            if(c % 7 == 0 && c % 5 == 0) {
                System.out.println("fiveseven");
            }else{
                if(c % 5 == 0){
                    System.out.println("five");
                }else if(c % 7 == 0){
                    System.out.println("seven");
                }else {
                    System.out.println(c);
                }
            }
            c++;
        }
    }
}



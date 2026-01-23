
public class forloop {
    public static void main(String[] args) {
        int start;
        // while(start <= 1000){
        //     System.out.println(start);
        //     start++;
        // }
        for(start = 0; start <= 50; start++){
            var b = start%3;
            var f = start%5;
            // var z = start%5 && start%3;
            if (f == 0 && b == 0){
                System.out.println("FIZZbuzz");
            }else if (f == 0){
                System.out.println("FIZZ");
            }else if(b == 0){
                System.out.println("buzz");
            } else {
                System.out.println(start);
            }
        }
    }
}

public class Methods2 {
    public int subNumber(int a, int b){
        int sub = a - b;
        return sub;
    }
    public int subNumber(int a, int b, int c){
        int sub = a + b + c;
        return sub;
    }
    public static void main(String[] args) {
        Methods mi = new Methods();
        System.out.println(mi.subNumber(4,2,2));
    }
}
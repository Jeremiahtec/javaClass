public class Honda {
static void summ(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }

    public int num(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        summ(1, 1);
        Honda m = new Honda();
        System.out.println(m.num(2, 2));
    }
}

public class Hello {
    public static void main(String[] args) {
        int sum =0,count =10;
        for (int i=1;i<=count;i++) {
            sum += i;
        }
        System.out.println("Sum:"+sum);
        double avg = (double) sum/count;
        System.out.println("Average:"+avg);
    }
}


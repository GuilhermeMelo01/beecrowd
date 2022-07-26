public class FindDivisor {
    public long numberOfDivisors(int n) {
        int count=0;
        for(int i = 1; i < n+1; i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        FindDivisor fd = new FindDivisor();
        System.out.println(fd.numberOfDivisors(30));
    }
}

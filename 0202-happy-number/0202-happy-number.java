class Solution {
    static int sumofsq(int n){
        int sum=0;
        while(n!=0){
            int d=n%10;
            sum+=d*d;
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(true){
            n=sumofsq(n);
            if(n==1){
                return true;
            }
            if(set.contains(n)){
                return false;
            }
            set.add(n);
        }
    }
}
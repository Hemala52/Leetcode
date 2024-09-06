class Solution {
    public int maxNumberOfBalloons(String text) {
     HashMap<Character,Integer> hm= new HashMap<>();
     for(char ch:text.toCharArray()){
        hm.put(ch,hm.getOrDefault(ch,0)+1);
     }
     int b=hm.getOrDefault('b',0);
     int a=hm.getOrDefault('a',0);
     int l=hm.getOrDefault('l',0)/2;
     int o=hm.getOrDefault('o',0)/2;
     int n=hm.getOrDefault('n',0);
     return Math.min(b,Math.min(a,Math.min(l,Math.min(o,n))));
    }
}
package Bytlandian_Coin;

import java.util.HashMap;
import java.util.Map;

public class Bytelandian_Coin {

    static Map<Integer, Integer> cache = new HashMap<>();

    static int byteCoin(int n){
        if(n<=1) return n;
        if(cache.containsKey(n)) return cache.get(n);
        //System.out.println(n);
        for(int i=0;i<=n;i++){
            
            cache.put(i,Math.max(i,byteCoin(i/2)+byteCoin(i/3)+byteCoin(i/4)));
        }
        

        return cache.get(n);
    }

    public static void main(String[] args) {
        
        System.out.println(byteCoin(24));

    }
}

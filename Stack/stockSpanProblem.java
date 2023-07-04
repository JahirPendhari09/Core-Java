package Stack;

import java.util.*;

public class stockSpanProblem {
    public static void StockSpan(int Stock[], int Span []){
        Stack<Integer> temp = new Stack<>();
        Span[0] = 1;
        temp.push(0);
        for(int i=1; i<Stock.length; i++){
            int curr = Stock[i];
            while(!temp.isEmpty()&& curr>Stock[temp.peek()]){
                temp.pop();
            }
            if(!temp.isEmpty()){
                int prevHigh = temp.peek();
                Span[i] = i-prevHigh;
            }else{
                Span[i]= i+1;
            }
            temp.push(i);
        }
       
        
    }
    public static void main (String args []){
       int Stock [] = {100, 60 ,70 ,65 ,80 ,85};
       int Span [] = new int [Stock.length];
       StockSpan(Stock,Span );
       for(int i=0; i<Span.length; i++){
          System.out.print(Span[i]+" ");
       }
    }
}

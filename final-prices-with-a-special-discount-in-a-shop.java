class Solution {
    public int[] finalPrices(int[] prices) {

       int len = prices.length;
       int [] arr = new int[len];
       int j;

    for( int i = 0 ; i < len ; i++ ){
      for( j = i+1 ; j < len ; j++ ){
         if(prices[j] <= prices[i]){
           arr[i] = prices[i] - prices[j];
           break; 
        } 
      } 
       if(j == len){
        arr[i] = prices[i];
      }
    }
   return arr;
    }
}
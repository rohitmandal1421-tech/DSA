class Solution {
    public int fib(int n) {

if(n<2){
    return n;
}
return fib(n-1) + fib(n-2);









       
    }

}
//  if(n<=1){
//             return n;
//         }
//         int prev0=0;
//         int prev1=1;

//         for(int i=2; i<=n; i++){
//             int temp = prev1 + prev0;
//             prev0 = prev1;
//             prev1 = temp;
//         }
//         return prev1;
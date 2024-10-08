public class Solution {

    public int minSwaps(String s) {

        int balanceCounter = 0;
        int swapNeeded = 0;

        for (char c : s.toCharArray()) {
            if (c == '[') {
                balanceCounter++;
            } else {
                balanceCounter--;
            }
            if (balanceCounter < 0) {
                swapNeeded++;
                balanceCounter += 2;
            }
        }
        return swapNeeded;
    }
}

/*
 * class Solution {
 * public int minSwaps(String s) {
 * 
 * // keep track of unmatched opening brackets
 * Stack<Integer> stack=new Stack<>();
 * 
 * for(char c: s.toCharArray()){
 * if(c=='['){
 * stack.push(1);
 * }else{
 * if(!stack.isEmpty()){
 * stack.pop();
 * }else{
 * stack.push(-1);
 * }
 * }
 * }
 * int unmatched=stack.size();
 * return unmatched/2;
 * }
 * }
 */

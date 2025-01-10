class Solution {
    public String convertToTitle(int columnNumber) {

       StringBuilder columnTitle=new StringBuilder(); 

while(columnNumber>0){
   columnNumber--;
   char letter=(char) ('A' +(columnNumber%26));
   columnTitle.append(letter);
   columnNumber/=26;
}
return columnTitle.reverse().toString();
        
    }
}
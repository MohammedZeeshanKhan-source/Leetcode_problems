class Solution {
    public String decodeString(String s) {
        Deque<Integer> countStack = new ArrayDeque<>();
        Deque<StringBuilder> stringStack = new ArrayDeque<>();
        int number =0;
        StringBuilder curr = new StringBuilder();

        for(char ch : s.toCharArray()){
            //case 1
            if(Character.isDigit(ch)){
                number = number*10 + (ch - '0');
            }
            //case 2
            else if( ch== '['){
                countStack.push(number);
                stringStack.push(curr);
                //new value se initialise ferse
                number =0;
                curr = new StringBuilder();

            }
            //case 3
            else if( ch == ']'){
               int repeatcount = countStack.pop();
               
               StringBuilder prev = stringStack.pop();

               //ab hum prev me reapeat count time curr ko append krne wale hai
               for(int i =1; i<=repeatcount; i++){
                prev.append(curr);
               }
               //sabse important line
               curr = prev;
            }

            //case 4
            else{
                     curr.append(ch);
            }

        }
        return curr.toString();
    }
}
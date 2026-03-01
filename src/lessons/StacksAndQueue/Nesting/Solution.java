package lessons.StacksAndQueue.Nesting;

import java.util.*;

public class Solution {
    public int solution(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<S.length(); i++) {
            char ch = S.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return 0;
                }

                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            return 0;
        }

        return 1;
    }
}
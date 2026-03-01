package lessons.StacksAndQueue.Brackets;

import java.util.*;

public class Solution {
    public int solution(String S) {
        Set<Character> left = new HashSet<>(Arrays.asList('(', '[', '{'));
        Deque<Character> stack = new ArrayDeque<>();

        for(int i=0; i<S.length(); i++) {
            char ch = S.charAt(i);
            if (left.contains(ch)) {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return 0;
                }

                switch(ch) {
                    case ')':
                        if (stack.peek() != '(') {
                            return 0;
                        }
                        break;
                    case ']':
                        if (stack.peek() != '[') {
                            return 0;
                        }
                        break;
                    case '}':
                        if (stack.peek() != '{') {
                            return 0;
                        }
                        break;
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

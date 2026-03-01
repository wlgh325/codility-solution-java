A string S consisting of N characters is called properly nested if:

S is empty;
S has the form "(U)
content_copy
" where U is a properly nested string;
S has the form "VW
content_copy
" where V and W are properly nested strings.
For example, string "(()(())())
content_copy
" is properly nested but string "())
content_copy
" isn't.

Write a function:

class Solution { public int solution(String S); }
content_copy

that, given a string S consisting of N characters, returns 1 if string S is properly nested and 0 otherwise.

For example, given S = "(()(())())
content_copy
", the function should return 1 and given S = "())
content_copy
", the function should return 0, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..1,000,000];
string S is made only of the characters '(
content_copy
' and/or ')
content_copy
'.
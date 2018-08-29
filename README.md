# scramblies

## Task 1

    Complete the function (scramble str1 str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false
    
    Notes:
    Only lower case letters will be used (a-z). No punctuation or digits will be included.
    Performance needs to be considered
    
    Examples:
    (scramble? “rekqodlw” ”world') ==> true
    (scramble? “cedewaraaossoqqyt” ”codewars”) ==> true
    (scramble? “katas”  “steak”) ==> false
    
The examples given look a lot like midje test definitions so lets use that.

The solution given is not restricted here to the range of lower case letters. This could be done by checking the parameters passed in to scramble? However the solution seems to work ok for sequences in general (not thoroughly tested). Keeping it this way and restricting the input in the api or the ui might be a generally more useful solution.

Performance wise this solution is fine for natural language word games where the word lengths are limited. If this is the intended use, optimisation is unlikely to be useful. If this is not the intended use (perhaps it is to be used for comparing much larger strings) it may be possible to speed things up by not counting characters for every character in the first string, just those that are present in the second string. The extra complexity would not justify implementing this without good reason. 

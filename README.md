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

The project uses [Midje](https://github.com/marick/Midje/).

## How to run the tests

`lein midje` will run all tests.

`lein midje namespace.*` will run only tests beginning with "namespace.".

`lein midje :autotest` will run all the tests indefinitely. It sets up a
watcher on the code files. If they change, only the relevant tests will be
run again.

# Java Fundamentals

## Take/Skip Rope

### Description

    Write a program that reads a string and skips through it, extracting a hidden message. The algorithm you 
    have to implement is as follows: Let's take the string "skipTest_String044170" as an example. 
    Take every digit from the string and store it somewhere. After that, remove all the digits from the string.
    After this operation, you should have two lists of items: the numbers list and the non-numbers list: 
    •	Numbers list: [0, 4, 4, 1, 7, 0] 
    •	Non-numbers: [s, k, i, p, T, e, s, t, _, S, t, r, i, n, g] After that, take every digit in the numbers 
    list and split it up into a take list and a skip list, depending on whether the digit is in an even or an odd index:
    •	Numbers list: [0, 4, 4, 1, 7, 0] 
    •	Take list: [0, 4, 7] 
    •	Skip list: [4, 1, 0] 
    Afterward, iterate over both of the lists and skip {skipCount} characters from the non-numbers list, then
    take {takeCount} characters and store it in a result string. Note that the skipped characters are summed up as they go. 
    The process would look like this on the aforementioned non-numbers list: Example: "skipTest_String"
    1.	Take 0 characters -> Taken: "", skip 4 characters  Skipped: "skip" -> Result: "" 
    2.	Take 4 characters -> Taken: "Test", skip 1 characters  Skipped: "_" -> Result: "Test" 
    3.	Take 7 characters -> Taken: "String", skip 0 characters  Skipped: "" -> Result: "TestString"
    After that, just print the result string on the console. 

#### Input

The encrypted message is a string.

#### Output

The decrypted message is a string.

#### Constraints

- The count of digits in the input string will always be even.
- The encrypted message will contain any printable ASCII character.
# Java Fundamentals

## Exam 4

### Description
#### Ex1 
    Yet again, you have forgotten your password. Naturally, it's not the first time this has happened. Actually,
    you got so tired of it that you decided to help yourself with an intelligent solution. Write a password reset program
    that performs a series of commands upon a predefined string. First, you will receive a string, and afterward,
    until the command "Done" is given, you will be receiving strings with commands split by a single space. 
    The commands will be the following: 
    •	"TakeOdd" 
        o	 Takes only the characters at odd indices and concatenates them to obtain the new raw password and then prints it. 
    •	"Cut {index} {length}" 
        o	Gets the substring with the given length starting from the given index from the password and removes 
            its first occurrence, then prints the password on the console. 
        o	The given index and the length will always be valid. 
    •	"Substitute {substring} {substitute}" 
        o	If the raw password contains the given substring, replace all of its occurrences with the substitute text 
        given and print the result. 
        o	If it doesn't, prints "Nothing to replace!". 

    Input
    •	You will be receiving strings until the "Done" command is given. 

    Output 
    •	After the "Done" command is received, print:
        o	"Your password is: {password}" 

    Constraints 
    •	The indexes from the "Cut {index} {length}" command will always be valid.

#### Ex2
    Your first task is to determine if the given sequence of characters is a valid barcode or not. Each 
    line must not contain anything else but a valid barcode. A barcode is valid when: 
    •	It is surrounded by a "@" followed by one or more "#" 
    •	It is at least 6 characters long (without the surrounding "@" or "#") 
    •	It starts with a capital letter 
    •	It contains only letters (lower and upper case) and digits 
    •	It ends with a capital letter Examples of valid barcodes: 
        @###Che46sE@##, @#FreshFisH@#, @###Brea0D@###, @##Che46sE@## 
    Examples of invalid barcodes: ##InvaliDiteM##, @InvalidIteM@, @#Invalid_IteM@# 
    Next, you have to determine the product group of the item from the barcode. The product group is obtained 
    by concatenating all the digits found in the barcode. If there are no digits present in the barcode, the 
    default product group is "00".
    Examples: 
    @#FreshFisH@# -> product group: 00 
    @###Brea0D@### -> product group: 0 
    @##Che4s6E@## -> product group: 46 

    Input 
    On the first line, you will be given an integer n – the count of barcodes that you will be receiving next.
    On the following n lines, you will receive different strings. Output For each barcode that you process, you 
    need to print a message. If the barcode is invalid:
    •	"Invalid barcode" If the barcode is valid: 
    •	"Product group: {product group}"

#### Ex3
    You got your hands on the most recent update on the best MMORPG of all time – Heroes of Code and Logic. 
    You want to play it all day long! So cancel all other arrangements and create your party! On the first 
    line of the standard input, you will receive an integer n – the number of heroes that you can choose for 
    your party. On the next n lines, the heroes themselves will follow with their hit points and mana points 
    separated by a single space in the following format:
    "{hero name} {HP} {MP}" 
    -	HP stands for hit points and MP for mana points 
    -	a hero can have a maximum of 100 HP and 200 MP 
    After you have successfully picked your heroes, you can start playing the game. You will be receiving 
    different commands, each on a new line, separated by " – ", until the "End" command is given. There are 
    several actions that the heroes can perform: 
    "CastSpell – {hero name} – {MP needed} – {spell name}" 
        •	If the hero has the required MP, he casts the spell, thus reducing his MP. Print this message: 
            o	"{hero name} has successfully cast {spell name} and now has {mana points left} MP!" 
        •	If the hero is unable to cast the spell print: 
            o	"{hero name} does not have enough MP to cast {spell name}!" 
    "TakeDamage – {hero name} – {damage} – {attacker}" 
        •	Reduce the hero HP by the given damage amount. If the hero is still alive (his HP is greater than 0) print:
            o	"{hero name} was hit for {damage} HP by {attacker} and now has {current HP} HP left!" 
        •	If the hero has died, remove him from your party and print: 
            o	"{hero name} has been killed by {attacker}!" 
    "Recharge – {hero name} – {amount}" 
        •	The hero increases his MP. If it brings the MP of the hero above the maximum value (200), MP is increased to 200. 
        (the MP can't go over the maximum value). 
        •	 Print the following message: 
            o	"{hero name} recharged for {amount recovered} MP!" 
    "Heal – {hero name} – {amount}" 
        •	The hero increases his HP. If a command is given that would bring the HP of the hero above the maximum
        value (100), HP is increased to 100 (the HP can't go over the maximum value). 
        •	 Print the following message: 
            o	"{hero name} healed for {amount recovered} HP!" 

    Input 
    •	On the first line of the standard input, you will receive an integer n. 
    •	On the following n lines, the heroes themselves will follow with their hit points and mana points 
        separated by a space in the following format. 
    •	You will be receiving different commands, each on a new line, separated by " – ", until the "End" command is given. 

    Output 
    •	Print all members of your party who are still alive, in the following format (their HP/MP need to be indented 2 spaces): 
        "{hero name} HP: {current HP} MP: {current MP}"
# Java OOP

## Border Control

### Description
    It’s the future, you’re the ruler of a totalitarian dystopian society inhabited by citizens and robots, 
    since you’re afraid of rebellions you decide to implement strict control of who enters your city.
    Your soldiers check the Ids of everyone who enters and leaves. You will receive from the console an 
    unknown amount of lines until the command "End" is received, on each line, there will be the information 
    for either a citizen or a robot who tries to enter your city in the format "{name} {age} {id}" for 
    citizens and "{model} {id}" for robots. After the end command on the next line, you will receive a single 
    number representing the last digits of fake ids, all citizens or robots whose Id ends with the specified 
    digits must be detained. The output of your program should consist of all detained Ids each on a separate
    line (the order of printing doesn’t matter). 

    Robot
    -	id: String 
    -	model: String 
    +	Robot(String, String) 
    +	getId(): String
    +	getModel(): String 
    
    Citizen
    -	name: String 
    -	age: int 
    -	id: String
    +	Citizen(String, int, String) 
    +	getName(): String 
    +	getAge(): int 
    +	getId(): String 

    <<Interface>> Identifiable
    +	getId(): String
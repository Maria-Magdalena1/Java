# Java OOP

## Black Box Integer

### Description
    You are helping a buddy of yours who is still in the OOP Basics course - his name is John. He is rather slow 
    and made a class with all private members. Your tasks are to instantiate an object from his class (always with start value 0)
    and then invoke the different methods it has. Your restriction is to not change anything in the class itself (consider it a black box).
    You can look at his class but don't touch anything! The class itself is called BlackBoxInt. It is a wrapper for the int primitive. 
    
#### Input 
    The input will consist of lines in the form: 
    "{command name}_{value}" 
    Input will always be valid and in the format described, so there is no need to check it explicitly. You stop receiving input when you 
    encounter the command "END". 

#### Output 
    Each command (except the "END" one) should print the current value of innerValue of the BlackBoxInt object you instantiated. 
    Don't cheat by overriding toString in the class - you must get the value from the private field.
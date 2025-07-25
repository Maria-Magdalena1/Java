# Java Fundamentals

## Snowwhite

### Description
    Snow White loves her dwarfs, but there are so many, and she doesn't know how to order them.
    Does she order them by name? Or by the color of their hat? Or by physics? She can't decide,
    so it's up to you to write a program that does it for her. You will be receiving several 
    input lines which contain data about dwarfs in the following format: 
    "{dwarfName} <:> {dwarfHatColor} <:> {dwarfPhysics}"
    The dwarfName and the dwarfHatColor are strings. The dwarfPhysics is an integer. You must 
    store the dwarfs in your program. There are several rules, though:
    •	If 2 dwarfs have the same name but different hat colors, they should be considered different dwarfs,
    and you should store both of them. 
    •	If 2 dwarfs have the same name and the same hat color, store the one with the higher physics.
    When you receive the command "Once upon a time", the input ends. You must order the dwarfs by physics in
    descending order and then by the total count of dwarfs with the same hat color in descending order.
    Then you must print them all. 

#### Input 
- The input will consist of several input lines containing dwarf data in the format specified above.
- The input ends when you receive the command "Once upon a time". 

#### Output 
- As output, you must print the dwarfs ordered as specified above. 
- The output format is: "({hatColor}) {name} <-> {physics}".
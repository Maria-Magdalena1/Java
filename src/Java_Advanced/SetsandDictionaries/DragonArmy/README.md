# Java Advanced

## Dragon Army

### Description
    Heroes III is the best game ever. Everyone loves it, and everyone plays it all the time. John is not an exclusion
    from this rule. His favorite units in the game are all types of dragons – black, red, gold, azure, etc… He likes 
    them so much that he gives them names and keeps logs of their stats: damage, health, and armor. The process of
    aggregating all the data is quite tedious, so he would like to have a program doing it. Since he is no programmer, 
    it's your task to help him. You need to categorize dragons by their type. For each dragon, identified by name, 
    keep information about his stats. Type is preserved as in the input order, but dragons are sorted alphabetically by
    name. For each type, you should also print the average damage, health, and armor of the dragons. For each dragon,
    print his stats. There may be missing stats in the input, though. If a stat is missing, you should assign its default
    values. Default values are as follows: health - 250, damage - 45, and armor - 10. Missing stat will be marked by null.
    The input is in the following format "{type} {name} {damage} {health} {armor}". Any of the integers may be assigned 
    a null value. If the same dragon is added a second time, the new stats should overwrite the previous ones. 
    Two dragons are considered equal if they match by both name and type.

#### Input 
    •	On the first line, you are given the number N -> the number of dragons to follow. 
    •	On the next N lines, you are given input in the above-described format. There will be a single space separating each element. 

#### Output
    •	Print the aggregated data on the console. 
    •	For each type, print average stats of its dragons in format "{Type}::({damage}/{health}/{armor})". 
    •	Damage, health, and armor should be rounded to two digits after the decimal separator.
    •	For each dragon, print its stats in format "-{Name} -> damage: {damage}, health: {health}, armor: {armor}".
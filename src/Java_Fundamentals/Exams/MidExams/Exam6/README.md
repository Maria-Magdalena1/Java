# Java Fundamentals

## Exam 6

### Description
#### Ex1 
    Pirates are invading the sea, and you're tasked to help them plunder Create a program that checks if target 
    plunder is reached. First, you will receive how many days the pirating lasts. Then you will receive how 
    much the pirates plunder for a day. Last you will receive the expected plunder at the end. Calculate how much
    plunder the pirates manage to gather. Each day they gather the plunder. Keep in mind that they attack more 
    ships every third day and add additional plunder to their total gain, which is 50% of the daily plunder. 
    Every fifth day the pirates encounter a warship, and after the battle, they lose 30% of their total plunder.
    If the gained plunder is more or equal to the target, print the following: 
    "Ahoy! {totalPlunder} plunder gained." 
    If the gained plunder is less than the target. Calculate the percentage left and print the following: 
    "Collected only {percentage}% of the plunder." Both numbers should be formatted to the 2nd decimal place. 

    Input 
    •	On the 1st line, you will receive the days of the plunder – an integer number in the range [0…100000].
    •	On the 2nd line, you will receive the daily plunder – an integer number in the range [0…50]. 
    •	On the 3rd line, you will receive the expected plunder – a real number in the range [0.0…10000.0]. 

    Output 
    •	 In the end, print whether the plunder was successful or not, following the format described above.

#### Ex2
    The pirates need to carry a treasure chest safely back to the ship, looting along the way. Create a program that 
    manages the state of the treasure chest along the way. On the first line, you will receive the initial 
    loot of the treasure chest, which is a string of items separated by a "|". "{loot1}|{loot2}|{loot3} … {lootn}" 
    The following lines represent commands until "Yohoho!" which ends the treasure hunt: 
    •	"Loot {item1} {item2}…{itemn}": 
        o	Pick up treasure loot along the way. Insert the items at the beginning of the chest. 
        o	If an item is already contained, don't insert it. 
    •	"Drop {index}": 
        o	Remove the loot at the given position and add it at the end of the treasure chest. 
        o	If the index is invalid, skip the command. 
    •	"Steal {count}": 
        o	Someone steals the last count of loot items. If there are fewer items than the given count, remove as many as there are. 
        o	Print the stolen items separated by ", ": "{item1}, {item2}, {item3} … {itemn}" 
    In the end, output the average treasure gain, which is the sum of all treasure items' length divided by the count of all items 
    inside the chest formatted to the second decimal point: "Average treasure gain: {averageGain} pirate credits." If the chest is empty,
    print the following message: "Failed treasure hunt." 

    Input 
    •	On the 1st line, you are going to receive the initial treasure chest (loot separated by "|").
    •	On the following lines, until "Yohoho!", you will be receiving commands. 

    Output 
    •	Print the output in the format described above.

#### Ex3
    The pirates encounter a huge Man-O-War at sea. Create a program that tracks the battle and either chooses 
    a winner or prints a stalemate. On the first line, you will receive the status of the pirate ship, which 
    is a string representing integer sections separated by ">". On the second line, you will receive the same
    type of status, but for the warship: "{section1}>{section2}>{section3}… {sectionn}" On the third line,
    you will receive the maximum health capacity a section of the ship can reach. The following lines represent 
    commands until "Retire": 
    •	"Fire {index} {damage}" - the pirate ship attacks the warship with the given damage at that section. 
        Check if the index is valid and if not, skip the command. If the section breaks (health <= 0) the warship sinks, 
        print the following and stop the program: "You won! The enemy ship has sunken." 
    •	"Defend {startIndex} {endIndex} {damage}" - the warship attacks the pirate ship with the given damage at that range (indexes are inclusive). 
        Check if both indexes are valid and if not, skip the command. If the section breaks (health <= 0) the pirate ship sinks, print the following 
        and stop the program: "You lost! The pirate ship has sunken." 
    •	"Repair {index} {health}" - the crew repairs a section of the pirate ship with the given health. Check if the index is valid and if not, 
        skip the command. The health of the section cannot exceed the maximum health capacity. 
    •	"Status" - prints the count of all sections of the pirate ship that need repair soon, which are all sections that are lower than 20% 
        of the maximum health capacity. Print the following: "{count} sections need repair." In the end, if a stalemate occurs, print the 
        status of both ships, which is the sum of their individual sections, in the following format: 
        "Pirate ship status: {pirateShipSum} Warship status: {warshipSum}" 

    Input 
    •	On the 1st line, you are going to receive the status of the pirate ship (integers separated by '>'). 
    •	On the 2nd line, you are going to receive the status of the warship. 
    •	On the 3rd line, you will receive the maximum health a section of a ship can reach. 
    •	On the following lines, until "Retire", you will be receiving commands.
# Java Fundamentals

## Judge

### Description
    You know the Judge system, right?! Your job is to create a program similar to the Judge system. You will receive several input lines
    in the following format: 
    "{username} -> {contest} -> {points}"
    The constestName and username are strings. The given points will be an integer number. You need to keep track of every contest and 
    individual statistics of every user. You should check if such a contest already exists, and if not, add it, otherwise, check if the 
    current user is participating in the contest. If he is participating, take the higher score, otherwise, just add it. Also, you need to
    keep individual statistics for each user - the total points of all contests. You should end your program when you receive the command 
    "no more time". At that point, you should print each contest in order of input. For each contest, print the participants ordered by points
    in descending order and then by name in ascending order. After that, you should print individual statistics for every participant ordered
    by total points in descending order and then by alphabetical order. 

#### Input / Constraints 
- The input comes in the form of commands in the format specified above.
- Username and contest name always will be one word.
- Points will be an integer in the range [0, 1000]. 
- There will be no invalid input lines. 
- If all sorting criteria fail, the order should be by order of input. 
- The input ends when you receive the command "no more time". 

#### Output
- The output format for the contests is: "{constestName}: {participants.Count} participants {position}. {username} <::> {points}" 
- After you print all contests, print the individual statistics for every participant. 
- The output format is: 
- "Individual standings: 
- {position}. {username} -> {totalPoints}"
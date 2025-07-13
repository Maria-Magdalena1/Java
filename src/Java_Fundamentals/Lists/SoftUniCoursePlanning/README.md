# Java Fundamentals

## SoftUni Course Planning

### Description

    You are tasked to help plan the next Programming Fundamentals course by keeping track 
    of the lessons that will be included in the course, as well as all the exercises for the lessons.
    On the first input line, you will receive the initial schedule of lessons and exercises that will
    be part of the next course, separated by a comma and space ", ". But before the course starts, there
    are some changes to be made. Until you receive "course start", you will be given some commands to 
    modify the course schedule. The possible commands are:
    •	Add:{lessonTitle} - add the lesson to the end of the schedule, if it does not exist 
    •	Insert:{lessonTitle}:{index} - insert the lesson to the given index, if it does not exist
    •	Remove:{lessonTitle} - remove the lesson, if it exists 
    •	Swap:{lessonTitle}:{lessonTitle} - change the place of the two lessons, if they exist 
    •	Exercise:{lessonTitle} - add Exercise in the schedule right after the lesson index, 
    if the lesson exists and there is no exercise already, in the following format: "{lessonTitle}-Exercise". 
    If the lesson doesn't exist, add the lesson at the end of the course schedule, followed by the Exercise.
    
    Each time you Swap or Remove a lesson, you should do the same with the Exercises, if there are any, which follow the lessons.

#### Input

- On the first line -the initial schedule lessons -strings, separated by comma and space ", ".
- Until "course start", you will receive commands in the format described above.

#### Output

Print the whole course schedule, each lesson on a new line with its number(index) in the schedule: "{lesson
index}.{lessonTitle}"
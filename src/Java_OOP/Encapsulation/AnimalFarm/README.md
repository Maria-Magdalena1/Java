# Java OOP

## Animal Farm

### Description
    You should be familiar with encapsulation already. For this problem, you’ll need to create a class called Chicken. 
    Chicken should contain several fields, a constructor, and several methods. Your task is to encapsulate or hide 
    anything that is not intended to be viewed or modified from outside the class.
    -	name: String 
    -	age: int 
    +	Chicken(String, int) 
    -	setName(String) : void 
    -	setAge (int): void 
    +	productPerDay (): double 
    +	toString(): Override 
    -	calculateProductPerDay() : double
    Chicken lives for 15 years. Chicken has a name for sure, at least 1 symbol long. Chicken producing eggs: 
    •	First 6 years it produces 2 eggs per day [0 - 5]. 
    •	Next 6 years it produces 1 egg per day [6 - 11]. 
    •	And after that, it produces 0.75 eggs per day.


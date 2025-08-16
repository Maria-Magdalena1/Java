# Java OOP

## Shopping Spree

### Description
    Create two classes: class Person and class Product. Each person should have a name, money, and a bag of products. 
    Each product should have a name and cost. The name cannot be an empty string. Be careful about white space in the name. 
    Money and cost cannot be a negative number.

    Person                                  Product
    -	name: String                        -	name: String  
    -	money:  double                      -	cost: double
    -	products:  List<Product>            + 	Product (String,  double)
    + 	Person (String,  double)            -	setCost (double): void
    -	setName (String): void              -	setName (String): void
    -	setMoney (double): void             +	getName(): String
    +	buyProduct (Product): void          +	getCost (): double
    +	getName(): String        

    Create a program in which each command corresponds to a person buying a product. If the person can afford a product 
    add it to his bag. If a person doesn't have enough money, throw new llegalArgumentException (class Person, buyProduct() method )
    with the following message: 
    "{Person name} can't afford {Product name}" 
    In the first two lines, you are given all people and all products. After all, purchases print every person in the order 
    of appearance and all products that he has bought also in order of appearance. If nothing is bought, print: 
    "{Person name} - Nothing bought". 
    Read commands till you find the line with the "END" command. In case of invalid input throw new llegalArgumentException 
    (class Person, setMoney() method) with message: 
    "Money cannot be negative") or empty name: throw new llegalArgumentException (class Person,Product setName() method) with message: 
    "Name cannot be empty") break the program with an appropriate message.
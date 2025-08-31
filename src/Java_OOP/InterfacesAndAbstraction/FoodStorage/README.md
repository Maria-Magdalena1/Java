# Java OOP

## Food Shortage

### Description
    Your totalitarian dystopian society suffers a shortage of food, so many rebels appear. Extend the code
    from your previous (Problem 2. Multiple Implementation) tasks with new functionality to solve this task.
    Define a class Rebel which has a name, age, and group (String), names are unique - 
    there will never be 2 Rebels/Citizens or a Rebel and Citizen with the same name. Define an interface Buyer 
    which defines the methods buyFood() and a getFood(). Implement the Buyer interface in the Citizen and Rebel 
    class, both Rebels and Citizens start with 0 food, when a Rebel buys food his food increases by 5, when a 
    Citizen buys food his food increases by 10. On the first line of the input you will receive 
    an integer N - the number of people, on each of the next N lines you will receive information in one of the 
    following formats "{name} {age} {id} {birthdate}" for a Citizen 
    or "{name} {age}{group}" for a Rebel. 
    After the N lines, until the command "End" is received, you will receive names of people who bought food,
    each on a new line. Note that not all names may be valid, in the case of an incorrect name - nothing should 
    happen. On the only line of output, you should print the total amount of food purchased. 
    <<Interface>>                       <<Interface>>                   <<Interface>>
    Buyer                               Identifiable                    Person
    +	buyFood(): void                 +	getId(): String             +	getName(): String
    +	getFood(): int                                                  +	getAge(): int


     Citizen                                        Rebel
    -	name: String                                -	name: String
    -	age: int                                    -	age: int
    -	id: String                                  -	group: String
    -	birthDate: String                           -	food: int
    -	food: int                                   +	Rebel(String, int, String)
    +	Citizen(String, int, String, String)        +	getName(): String
    +	getName(): String                           +	getAge(): int
    +	getAge(): int                               +	getGroup(): String
    +	getId(): String                             +	getFood(): in
    +	getFood(): int                              +	buyFood(): void
    +	buyFood(): void 
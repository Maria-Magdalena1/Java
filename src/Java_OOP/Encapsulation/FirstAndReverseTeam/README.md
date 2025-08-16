# Java OOP

## First and Reverse Team

### Description
    Create a Team class. Add to this team all people you read. All people younger than 40 go on the first team, 
    others go on the reverse team. At the end print first and reserve team sizes. The class should have private fields for: 
    •	name: String 
    •	firstTeam: List<Person> 
    •	reserveTeam: List<Person> 
    The class should have constructors:
    •	Team(String name) 
    The class should also have private method for setName and public methods for: 
    •	getName(): String 
    •	addPlayer(Person person): void 
    •	getFirstTeam(): List<Person> (Collections.unmodifiableList) 
    •	getReserveTeam(): List<Person> (Collections.unmodifiableList)
# Java OOP

## Military Elite

### Description
    Create the following class hierarchy: 
    •	SoldierImpl – general class for soldiers, holding id (int), first name, and last name 
        o	PrivateImpl – lowest base soldier type, holding the field salary(double) 
            	LieutenantGeneralImpl – holds a set of PrivatesImpl under his command 
                -	public void addPrivate(Private priv) 
            	SpecialisedSoldierImpl – general class for all specialized soldiers – holds the corps of the soldier. 
            The corps can only be one of the following: "Airforces" or "Marines" (Enumeration) 
                -	EngineerImpl – holds a set of repairs. A repair holds a part name and hours worked (int) 
                    o	public void addRepair(Repair repair) 
                    o	public Collection<Repair> getRepairs() 

                -	CommandoImpl – holds a set of missions. A mission holds a code name and a state 
                (Enumeration: "inProgress" or "finished"). A mission can be finished through the method completeMission() 
                    o	public void addMission(Mission mission) 
                    o	public Collection<Mission> getMissions() 
        o	SpyImpl – holds the code number of the spy. 
    Extract interfaces for each class. (e.g. Soldier, Private, LieutenantGeneral, etc.) The interfaces should hold their public 
    get methods (e.g. Soldier should hold getId, getFirstName, and getLastName). Each class should implement 
    its respective interface. Validate the input where necessary (corps, mission state) - input should match exactly one of the required 
    values, otherwise, it should be treated as invalid. In the case of invalid corps, the entire line should be skipped, in the case of 
    an invalid mission state, only the mission should be skipped. You will receive from the console an unknown amount of lines containing 
    information about soldiers until the command "End" is received. The information will be in one of the following formats: 

    •	Private: "Private {id} {firstName} {lastName} {salary}" 
    •	LieutenantGeneral: "LieutenantGeneral {id} {firstName} {lastName} {salary} {private1Id} {private2Id} … {privateNId}" where privateXId 
    will always be an Id of a private already received through the input 
    •	Engineer: "Engineer {id} {firstName} {lastName} {salary} {corps} {repair1Part} {repair1Hours} … {repairNPart} {repairNHours}" where repairXPart 
    is the name of a repaired part and repairXHours the hours it took to repair it (the two parameters will always come paired) 
    •	Commando: "Commando {id} {firstName} {lastName} {salary} {corps} {mission1CodeName}  {mission1state} … {missionNCodeName} {missionNstate}" a missions code name,
    description and state will always come together 
    •	Spy: "Spy {id} {firstName} {lastName} {codeNumber}" 

    Define proper constructors. Avoid code duplication through abstraction. Override toString() in all classes to print detailed information about the object. 
    Privates: "Name: {firstName} {lastName} Id: {id} Salary: {salary}" 

    Spy: "Name: {firstName} {lastName} Id: {id} Code Number: {codeNumber}" 

    LieutenantGeneral: "Name: {firstName} {lastName} Id: {id} Salary: {salary} 
    Privates: {private1 ToString()} {private2 ToString()} … {privateN ToString()}" 
    
    Note: privates must be sorted by id in descending order. 

    Engineer: "Name: {firstName} {lastName} Id: {id} 
    Salary: {salary} 
    Corps: {corps} 
    Repairs: 
        {repair1 ToString()} {repair2 ToString()} … {repairN ToString()}" 

    Commando: "Name: {firstName} {lastName} Id: {id} 
    Salary: {salary} 
    Corps: {corps} 
    Missions: 
        {mission1 ToString()} {mission2 ToString()} … {missionN ToString()}" 

    Repair: "Part Name: {partName} Hours Worked: {hoursWorked}" 

    Mission: "Code Name: {codeName} State: {state}" 

    NOTE: Salary should be printed and rounded to two decimal places after the separator.
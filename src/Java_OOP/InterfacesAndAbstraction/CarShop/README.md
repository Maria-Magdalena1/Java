# Java OOP

## Car Shop

### Description
    Build hierarchy from classes and interfaces for this UML diagram: 
    <<inteface>>                        <<Serializable>> 
    <<Car>>                            
    +TIRES: Integer                      Seat
    +getModel(): String                 +toString(): String
    +getColor(): String 
    +getHorsePower(): Integer 
    +countryProduced(): String 

    Your hierarchy has to be used with this code. 
    public static void main(String[] args) {
        Car seat = new Seat("Leon", "gray", 110, "Spain");
        System.out.println(String.format( 
            "%s is %s color and have %s horse power",
            seat.getModel(), 
            seat.getColor(), 
            seat.getHorsePower())); 
        System.out.println(seat.toString()); 
    }


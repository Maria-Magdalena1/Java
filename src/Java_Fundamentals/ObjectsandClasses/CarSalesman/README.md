# Java Fundamentals

## Car Salesman

### Description
    Define two classes Car and Engine. A Car has a model, engine, weight, and color. 
    An Engine has a model, power, displacement, and efficiency. A Car's weight and color and its Engine's displacements
    and efficiency are optional. On the first line, you will read a number N which will specify how many lines of
    engines you will receive, on each of the next N lines, you will receive information about an Engine in the following 
    format "{Model} {Power} {Displacement} {Efficiency}".
    After the lines with engines, on the next line, you will receive a number M – specifying the number of Cars that will
    follow, on each of the next M lines, information about a Car will follow in the following format
    "{Model} {Engine} {Weight} {Color}", where the engine in the format will be the model of an existing Engine. 
    When creating the object for a Car, you should keep a reference to the real engine in it, instead of just the engine's
    model, note that the optional properties might be missing from the formats. Your task is to print each car 
    (in the order you received them) and its information in the format defined below, if any of the optional fields have
    not been given, print "n/a" in its place instead:
    "{CarModel}: 
        {EngineModel}: 
            Power: {EnginePower}
            Displacement: {EngineDisplacement} 
            Efficiency: {EngineEfficiency} 
        Weight: {CarWeight} 
        Color: {CarColor}"


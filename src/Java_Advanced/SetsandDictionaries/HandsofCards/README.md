# Java Advanced

## Hands of Cards

### Description
    You are given a sequence of people and what cards he draws from the deck for every person. The input will be 
    separate lines in the format: "{personName}: {PT, PT, PT,… PT}" Where P (2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A) 
    is the power of the card and T (S, H, D, C) is the type. The input ends when a "JOKER" is drawn. The name can 
    contain any ASCII symbol except ":". The input will always be valid, and in the format described, there is no
    need to check it. A single person cannot have more than one card with the same power and type. If he draws such
    a card, he discards it. The people are playing with multiple decks. Each card has a value that is calculated by
    the power multiplied by the type. Powers 2 to 10 have the same value, and J to A is 11 to 14. Types are mapped
    to multipliers the following way (S -> 4, H-> 3, D -> 2, C -> 1). Finally, print out the total value each player 
    has in his hand in the format: "{personName}: {value}"
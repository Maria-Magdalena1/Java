# Java Advanced

## Crossfire

### Description
    You will receive two integers, which represent the dimensions of a matrix. Then, you must fill the matrix 
    with increasing integers starting from 1, and continuing on every row, like this: 
    first row: 1, 2, 3, …, n 
    second row: n + 1, n + 2, n + 3, …, n + n 
    third row: 2 * n + 1, 2 * n + 2, …, 2 * n + n 
    You will also receive several commands in the form of 3 integers separated by a space. Those 3 integers will
    represent a row in the matrix, a column, and a radius. You must then destroy the cells, which correspond to those
    arguments cross-like. Destroying a cell means that that cell becomes completely nonexistent in the matrix.
    Destroying cells cross-like means that you form a cross figure with a center point - equal to the cell with
    coordinates – the given row and column, and lines with length equal to the given radius. 
    See the examples for more info. The input ends when you receive the command "Nuke it from orbit".
    When that happens, you must print what has remained from the initial matrix. 

#### Input 
- On the first line, you will receive the dimensions of the matrix. You must then fill the matrix according to those dimensions.
- On the next several lines, you will receive 3 integers separated by a single space representing the row, col, and radius. 
It would help if you then destroyed cells according to those coordinates.
- When you receive the command "Nuke it from orbit" the input ends. 

#### Output 
- The output is simple. You must print what is left from the matrix. 
- Every row must be printed on a new line, and every column of a row - be separated by a space.
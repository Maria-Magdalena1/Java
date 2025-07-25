# Java Advanced

## Population Counter

### Description
    So many people! It's hard to count them all. But that's your job as a statistician. You get raw data for a given city,
    and you need to aggregate it. On each input line, you'll be given data in the format: "city|country|population". 
    There will be no redundant whitespaces anywhere in the input. Aggregate the data by country and by city and print it 
    on the console. For each country, print its total population and on separate lines the data for each of its cities.
    Countries should be ordered by their total population in descending order, and within each country, the cities should
    be ordered by the same criterion. If two countries/cities have the same population, keep them in the order in which
    they were entered.

#### Input
- The input data should be read from the console.
- It consists of a variable number of lines and ends when the command "report" is received. 
- The input data will always be valid and in the format described. There is no need to check it explicitly.

#### Output 
- The output should be printed on the console.
- Print the aggregated data for each country and city in the format shown below.
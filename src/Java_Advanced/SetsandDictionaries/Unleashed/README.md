# Java Advanced

## Unleashed

### Description
    Admit it – the СРЪБСКО is your favorite sort of music. You never miss a concert, and you have become quite
    the geek concerning everything involved with СРЪБСКО. You can't decide between all the singers you know 
    who your favorite one is. One way to find out is to keep a statistic of how much money their concerts make.
    Write a program that does all the boring calculations for you. On each input line you’ll be given data in format:
    "{singer} @{venue} {ticketsPrice} {ticketsCount}". There will be no redundant whitespaces anywhere in the input. 
    Aggregate the data by venue and by the singer. For each venue, print the singer and the total amount of money his/her 
    concerts have made on a separate line. Venues should be kept in the same order they were entered, the singers should
    be sorted by how much money they have made in descending order. If two singers have made the same amount of money, 
    keep them in the order in which they were entered. Keep in mind that if a line is in incorrect format, it should be 
    skipped, and its data should not be added to the output. Each of the four tokens must be separated by a space,
    everything else is invalid. The venue should be denoted with @ in front of it, such as @Sunny Beach SKIP THOSE:
    Ceca@Belgrade125 12378, Ceca @Belgrade12312 123 The singer and town name may consist of one to three words. 

#### Input 
- The input data should be read from the console.
- It consists of a variable number of lines and ends when the command "End" is received. 
- The input data will always be valid and in the format described. There is no need to check it explicitly.

#### Output 
- The output should be printed on the console.
- Print the aggregated data for each venue and singer in the below format. 
- Format for singer lines is "# {singer} -> {total money}".
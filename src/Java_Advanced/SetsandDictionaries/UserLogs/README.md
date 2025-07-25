# Java Advanced

## User Logs

### Description
    Marian is a famous system administrator. The person to overcome the security of his servers has not yet been born.
    However, there is a new type of threat where users flood the server with messages that are hard to be detected since
    they change their IP address all the time. Well, Marian is a system administrator and is not so into programming.
    Therefore, he needs a skillful programmer to track the user logs of his servers. You are the chosen one to help him! 
    You are given an input in the format: "IP={IP.Address} message={A&sample&message} user={username}" Your task is to 
    parse the IP and the username from the input, and for every user, you have to display every IP from which the
    corresponding user has sent a message and the count of the messages sent with the corresponding IP. In the output,
    the usernames must be sorted alphabetically, while their IP addresses should be displayed in the order of their first
    appearance. The output should be in the following format: "username: {IP} => {count}, {IP} => {count}." 
    For example, given the following input - IP=192.23.30.40 message='Hello&derps.' user=destroyer, you have to 
    get the username destroyer and the IP 192.23.30.40 and display it in the following format: "destroyer: 192.23.30.40 => 1. "
    The username destroyer has sent a message from IP 192.23.30.40 once. Check the examples below. They will further clarify
    the assignment. 

#### Input 
    The input comes from the console as a varying number of lines. You have to parse every command until the command that 
    follows is "end". The input will be in the format displayed above. There is no need to check it explicitly.

#### Output 
    For every user found, you have to display each log in the format: The IP addresses must be split with a comma,
    and each line of IP addresses must end with a dot.

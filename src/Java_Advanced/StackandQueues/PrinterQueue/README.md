# Java Advanced

## Printer Queue

### Description
    The printer queue is a simple way to control the order of files sent to a printer device.
    We know that a single printer can be shared between multiple devices. So to preserve the 
    order of the files sent, we can use a queue. Write a program which takes filenames until 
    the "print" command is received. Then as output, print the filenames in the order of printing.
    Some of the tasks may be canceled. If you receive "cancel" you have to remove the first file to
    be printed. If there is no current file to be printed, print "Printer is on standby".

# Java Advanced

## Browser History Upgrade

### Description
    Extend "Browser History" with a "forward" instruction, which visits URLs that were navigated 
    away from by "back". Each forward instruction visits the next most recent such URL. If normal 
    navigation happens, all potential forward URLs are removed until a new back instruction is given 
    if the forward instruction can't be executed, print "no next URLs".
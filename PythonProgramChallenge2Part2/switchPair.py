def switch_pairs(switch): 
    otherString = list(switch) # have each letter moved into an array instead of a string
    i = 0 # new integer = 0

    while i < len(switch)-2: 
        otherString[i],otherString[i+1] = otherString[i+1],otherString[i] # switch the pair as asked
        i += 2
    switch = "".join(otherString) # put the array back together 
    return switch



print(switch_pairs("example")) # it prints out "xemalpe"
print(switch_pairs("hello there")) # it prints out "ehll ohtree"
print(switch_pairs("homework")) # it prints out “ohemowkr"

def count(list, set):
    dictionary = {}  
    for nums in set: # loop and find occurences 
        count = 0 

        for num2 in list: # loop and find the count of occurences 
            if num2 == nums: 
                count += 1

            dictionary[nums] = count # add nums to dictionary 

    return dictionary # return the number of occurences 
    
x = [4, -2, 3, 9, 4, 17, 5, 29, 14, 87, 4, -2, 100] 
y = [-2, 4, 29]
print(count(x, y)) # prints out {4: 3, 29: 1, -2: 2}
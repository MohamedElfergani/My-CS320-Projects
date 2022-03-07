def is_reverse(firstWord,secondWord):
    # if the length of both words is equal to 0 then return true
    if ((len(firstWord) == 0) & (len(secondWord) == 0)):
       return True
    #if the len of both words is not the same return false
    if len(firstWord) != len(secondWord):
       return False
    # get the lower case of both words
    first = firstWord[0].lower()
    second = secondWord[-1].lower()
    if first == second:
       return is_reverse(firstWord[1:], secondWord[:-1])
    #else return false
    else:
       return False
  
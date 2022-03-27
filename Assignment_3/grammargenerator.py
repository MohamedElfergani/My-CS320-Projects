import random


def getInput(input):
    inputFile = input("What is the name of the grammar file? ")
    with open(inputFile) as f:
        lines = f.readlines()
    return lines


def otherThings():
    lines = getInput(input)
    y = []
    dictionary = {"": ""}
    for line in lines:
        line.rstrip()
        x = line.split("::=")
        y.append(x[0])
        dictionary[x[0]] = x[1].split('|')

    while True:
        print("Available symbols to generate are:")
        y.sort()
        ret = "["
        for i in range(len(lines)):
            ret = ret + y[i]
            if (i < (len(lines) - 1)):
                ret = ret + ', '
        ret = ret + "]"
        print(ret)

        my_symbol = input("What do you want to generate (Enter to quit)? ")

        if my_symbol == '':
            break
        number_of_times = input("How many do you want me to generate? ")
        number_of_times = int(number_of_times)
        if my_symbol in dictionary:
            helper(dictionary.get(my_symbol), number_of_times, dictionary)


def helper(list, number, dictionary):
    sub = ""
    rng = random.choice(list)
    p = rng.split(' ')
    if (number > 0):
        if len(p) > 1:
            helper_2(p, dictionary)
        if len(p) == 1:
            print(p[0].replace('\n', ''))
            helper(list, number - 1, dictionary)
        if (rng in dictionary) and len(p) == 1:
            # case where the item if referring to another case
            helper_2([rng], dictionary)
        if (rng in dictionary) and len(p) == 1:
            # if it is indeed a simple case of just an item
            sub = sub + rng
            print(sub)
            print(sub[0].replace('\n', ''))
            helper(list, number - 1, dictionary)  # recursive call
        print(sub)
    else:
        print("")


def helper_2(list, dictionary):
    # for cases where list contains further selection
    if len(list) > 1:
        for I in list:
            if (I in dictionary):
                helper(dictionary[I], 1, dictionary)

    if len(list) == 1:
        helper(dictionary[list[0]], 1, dictionary)

otherThings()

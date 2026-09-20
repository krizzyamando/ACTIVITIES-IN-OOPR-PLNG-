print("ACTIVITY 5")
def last_word(word1, word2, word3):
    if word1 > word2:
        if word1 > word3:
            return word1
        else:
            return word3
    else:
        if word2 > word3:
            return word2
        else:
            return word3


word1 = input("Enter word 1: ")
word2 = input("Enter word 2: ")
word3 = input("Enter word 3: ")

print("The last word alphabetically is:", last_word(word1, word2, word3))



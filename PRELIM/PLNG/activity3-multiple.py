print("ACTIVITY THREE")

user_input = input("Enter a multiple of 5 between 1 and 100: ")
number = int(user_input)

if 1 <= number <= 100 and number % 5 == 0:
    print("Valid number! Thank you.")
else:
    print("Invalid choice. Please follow the 1-100 and multiple of 5 rules.")
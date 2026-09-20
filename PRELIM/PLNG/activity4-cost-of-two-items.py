print("ACTIVITY 4")
item1 = float(input("Enter the cost of item 1: "))
item2 = float(input("Enter the cost of item 2: "))

total = item1 + item2

payment = float(input("Enter your payment: "))

if payment < total:
    owe = total - payment
    print("You still owe:", owe)
else:
    change = payment - total
    print("Thank you for your payment!")
    print("Your change is:", change)



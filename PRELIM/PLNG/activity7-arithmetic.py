# Activity 2 - Arithmetic Operations Calculator

while True:

    print("\nARITHMETIC CALCULATOR")
    print("1. Addition       2. Subtraction    3. Multiplication")
    print("4. Division       5. Modulus        6. Increment")
    print("7. Decrement")

  
    operation = input("\nSelect an arithmetic operation: ")

    if operation not in ["1", "2", "3", "4", "5", "6", "7"]:
        print("Invalid menu option. Please select a number from 1 to 7.")

        while True:
            choice = input("Do you want to continue? (YES/NO): ").strip().upper()
            if choice in ["YES", "NO"]:
                break
            print("Invalid choice. Please enter YES or NO.")
            
        if choice == "NO":
            print("Program terminated. Thank you!")
            break
        continue

    if operation in ["1", "2", "3", "4", "5"]:
        x = float(input("Enter the value of x: "))
        y = float(input("Enter the value of y: "))
        print(f"\nVariable Values: x = {x}, y = {y}")

        if operation == "1":
            result = x + y
            print(f"Addition: x + y = {result}")
        elif operation == "2":
            result = x - y
            print(f"Subtraction: x - y = {result}")
        elif operation == "3":
            result = x * y
            print(f"Multiplication: x * y = {result}")
        elif operation == "4":
            if y == 0:
                print("Error: Division by zero is not allowed.")
            else:
                result = x / y
                print(f"Division: x / y = {result}")
        elif operation == "5":
            if y == 0:
                print("Error: Modulus by zero is not allowed.")
            else:
                result = x % y
                print(f"Modulus: x % y = {result}")


    elif operation == "6":
        x = float(input("Enter the value of x: "))
        print(f"\nVariable Values: x = {x}")
        x += 1
        print(f"Increment: x + 1 = {x}")


    elif operation == "7":
        x = float(input("Enter the value of x: "))
        print(f"\nVariable Values: x = {x}")
        x -= 1
        print(f"Decrement: x - 1 = {x}")


    while True:
        choice = input("\nDo you want to continue? (YES/NO): ").strip().upper()
        if choice in ["YES", "NO"]:
            break
        print("Invalid choice. Please enter YES or NO.")

    if choice == "NO":
        print("Program terminated. Thank you!")
        break

# Activity 1 - Student Grade Calculator
while True: 
    
    java_score = float(input("Java Programming Score: "))
    c_score = float(input("C Programming Score: "))
    database_score = float(input("Database Handling Score: "))
    
   
    average = (java_score + c_score + database_score) / 3
    
    
    if average >= 90:
        grade = "A"
    elif average >= 80:
        grade = "B"
    elif average >= 75:
        grade = "C"
    else:
        grade = "F"
        
   
    print(f"Average: {average:.2f}")
    print(f"Grade: {grade}\n")
    
    
    while True:
        choice = input("Do you want to continue? (YES/NO): ").strip().upper()
        
        if choice == "NO":
            print("Program terminated. Thank you!")
            exit() 
        elif choice == "YES":
            break 
        else:
            print("Invalid choice. Please enter YES or NO.")

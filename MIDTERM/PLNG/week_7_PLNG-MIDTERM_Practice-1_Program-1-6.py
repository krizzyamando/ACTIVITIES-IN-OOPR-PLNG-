def program_1():
    print("\n----------     Program 1       ----------")
    arr = []
    print("Enter 10 real numbers (positive or negative):")
    for i in range(10):
        val = float(input(f"Element {i+1}: "))
        arr.append(val)
    
    # Task 1: Find sum and average of positive numbers
    pos_sum = 0
    pos_count = 0
    for num in arr:
        if num > 0:
            pos_sum += num
            pos_count += 1
    pos_avg = pos_sum / pos_count if pos_count > 0 else 0
    print(f"Sum of positive numbers: {pos_sum}")
    print(f"Average of positive numbers: {pos_avg}")

    # Task 2: Count negative numbers
    neg_count = 0
    for num in arr:
        if num < 0:
            neg_count += 1
    print(f"Count of negative numbers: {neg_count}")

    # Task 3: Find the minimum value
    if len(arr) > 0:
        min_val = arr[0]
        for num in arr:
            if num < min_val:
                min_val = num
        print(f"Minimum value of the array: {min_val}")


def program_2():
    print("\n----------     Program 2       ----------")
    arr = []
    print("Enter 8 integer numbers:")
    for i in range(8):
        val = int(input(f"Element {i+1}: "))
        arr.append(val)
        
    # Remove duplicates while preserving original order
    unique_arr = []
    for num in arr:
        if num not in unique_arr:
            unique_arr.append(num)
    print(f"Array after removing duplicates: {unique_arr}")
    
    # Extract second smallest and second largest elements
    sorted_unique = sorted(unique_arr)
    if len(sorted_unique) >= 2:
        print(f"Second smallest element: {sorted_unique[1]}")
        print(f"Second largest element: {sorted_unique[-2]}")
    else:
        print("Not enough unique elements to find second largest/smallest values.")


def program_3():
    print("\nOUTPUT")
    user_input = input("Enter Data in Array: ")
    arr = [int(x) for x in user_input.split()]
    print("Stored Data in Array:", " ".join(map(str, arr)))
    
    pos = int(input("Enter poss. of Element to Delete: "))
    
    # Delete element at 0-indexed position
    if 0 <= pos < len(arr):
        del arr[pos]
        print("New data in Array:", " ".join(map(str, arr)))
    else:
        print("Invalid position.")


def program_4():
    print("\nOUTPUT:")
    size = int(input("Enter Size of Array : "))
    user_input = input(f"Enter any {size} elements in Array: ")
    arr = [int(x) for x in user_input.split()][:size]
    
    # Split into even and odd collections
    evens = [x for x in arr if x % 2 == 0]
    odds = [x for x in arr if x % 2 != 0]
    
    print("Even Elements:", " ".join(map(str, evens)))
    print("Odd Elements:", " ".join(map(str, odds)))


def program_5():
    print("\nOUTPUT :")
    # Print character triangle pattern
    print("*")
    print("*A*")
    print("*A*A*")
    print("*A*A*A*")


def program_6():
    print("\n----------     Program 6       ----------")
    # Get interactive user inputs for custom salary evaluation
    basic_salary = float(input("Enter Basic Salary ($): "))
    da_percentage = float(input("Enter DA Percentage (e.g., 12 for 12%): "))
    hra = float(input("Enter HRA ($): "))
    ta = float(input("Enter TA ($): "))
    others = float(input("Enter Others Allowance ($): "))
    pf_percentage = float(input("Enter PF Percentage (e.g., 14 for 14%): "))
    it_percentage = float(input("Enter IT Percentage (e.g., 15 for 15%): "))
    
    # Calculate components dynamically based on inputs
    da = (da_percentage / 100) * basic_salary
    pf = (pf_percentage / 100) * basic_salary
    it = (it_percentage / 100) * basic_salary
    
    # Calculate net earnings after deductions
    net_salary = basic_salary + da + hra + ta + others - (pf + it)
    
    # Informative Breakdown Output
    print("\n--- Salary Calculation Breakdown ---")
    print(f"Basic Salary : ${basic_salary:,.2f}")
    print(f"DA ({da_percentage}%)    : ${da:,.2f}")
    print(f"HRA          : ${hra:,.2f}")
    print(f"TA           : ${ta:,.2f}")
    print(f"Others       : ${others:,.2f}")
    print("-" * 36)
    print(f"PF Cut ({pf_percentage}%) : ${pf:,.2f}")
    print(f"IT Cut ({it_percentage}%) : ${it:,.2f}")
    print("-" * 36)
    print(f"Net Salary   = ${net_salary:,.2f}")


def main():
    while True:
        print("\nFINAL OUTPUT :")
        print("Choose the program you want to run")
        print("Program #1")
        print("Program #2")
        print("Program #3")
        print("Program #4")
        print("Program #5")
        print("Program #6")
        
        choice = input("Enter your choice (1-6): ").strip()
        
        if choice == '1':
            program_1()
        elif choice == '2':
            program_2()
        elif choice == '3':
            program_3()
        elif choice == '4':
            program_4()
        elif choice == '5':
            program_5()
        elif choice == '6':
            program_6()
        else:
            print("Invalid selection. Please choose between 1 and 6.")
            
        cont = input("\nDo you want to continue ? Y/N: ").strip().upper()
        if cont != 'Y':
            print("Thank You.")
            break

if __name__ == "__main__":
    main()

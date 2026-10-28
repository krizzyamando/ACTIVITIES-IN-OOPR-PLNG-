# ==========================================
# WEEK 9   LAB ACTIVITY 4
# ==========================================
class Date:
    """Structure to store the date (year, month and date as its members)"""
    def __init__(self, year: int, month: int, day: int):
        self.year = year
        self.month = month
        self.day = day

    def __str__(self):
        return f"{self.day}/{self.month}/{self.year}"


class Patient:
    """Base class to store patient information"""
    def __init__(self, name: str, admission_date: Date, disease: str, discharge_date: Date):
        self.name = name
        self.admission_date = admission_date
        self.disease = disease
        self.discharge_date = discharge_date

    def display(self):
        print(f"Name of the patient: {self.name}")
        print(f"Date of admission: {self.admission_date}")
        print(f"Disease: {self.disease}")
        print(f"Date of discharge: {self.discharge_date}")


class PediatricPatient(Patient):
    """Derived class to store the age and filter pediatric records"""
    def __init__(self, name: str, admission_date: Date, disease: str, discharge_date: Date, age: int):
        super().__init__(name, admission_date, disease, discharge_date)
        self.age = age

    def display(self):
        super().display()
        print(f"Age: {self.age}")


# ==========================================
# PROGRAM 3 
# ==========================================
class Professor:
    def __init__(self, name: str, salary: float):
        self.name = name
        self.salary = salary


class Deans(Professor):
    def __init__(self, name: str, salary: float, department: str):
        super().__init__(name, salary)
        self.department = department

    def __str__(self):
        return (f"Status\n"
                f"Rank: Dean\n"
                f"Name: {self.name}\n"
                f"Department: {self.department}\n"
                f"Salary: {self.salary}")


class Executive(Deans):
    def __init__(self, name: str, salary: float, department: str):
        super().__init__(name, salary, department)

    def __str__(self):
        return (f"Status\n"
                f"Rank: Executive\n"
                f"Name: {self.name}\n"
                f"Department: {self.department}\n"
                f"Salary: {self.salary}")



def run_program_1():
    print("\n--- Running Program 1: Account Balance System ---")
    print("Welcome!")
    balance = int(input("Enter your balance:\n"))
    
    print("Select an option:")
    print("1. Withdraw Amount")
    print("2. Deposit Amount")
    print("3. Exit")
    
    print("How much amount you want to withdraw from your account?")
    withdraw = int(input("Amount:\n"))
    balance -= withdraw
    print(f"Your new balance is: {balance}")
    
    print("How much amount you want to deposit in your account?")
    deposit = int(input("Amount:\n"))
    balance += deposit
    print(f"Your new balance is: {balance}")
    
    print("Thank you for using the system!")


def run_program_2():
    print("\n--- Running Program 2: Hospital Database ---")
    patients_db = []
    
    while True:
        print("\n1. Insert New Patient-")
        print("2. Display all Patient")
        print("3. Display pediatric patient")
        print("4. Exit")
        
        choice = input("Enter choice: ").strip()
        
        if choice == "1":
            name = input("1. Name of the patient: ")
            
            print("2. Date of admission:")
            d = int(input("   Enter Date: "))
            m = int(input("   Enter Month: "))
            y = int(input("   Enter Year: "))
            adm_date = Date(y, m, d)
            
            disease = input("3. Disease: ")
            
            print("4. Date of discharge:")
            d_dis = int(input("   Enter Date: "))
            m_dis = int(input("   Enter Month: "))
            y_dis = int(input("   Enter Year: "))
            dis_date = Date(y_dis, m_dis, d_dis)
            
            age = int(input("5. Age: "))
            
            patient = PediatricPatient(name, adm_date, disease, dis_date, age)
            patients_db.append(patient)
            
        elif choice == "2":
            print("\n--- All Patients ---")
            if not patients_db:
                print("No records found.")
            for p in patients_db:
                p.display()
                print("-" * 20)
                
        elif choice == "3":
            print("\n--- Pediatric Patients (< 12 Years) ---")
            pediatric_found = False
            for p in patients_db:
                if p.age < 12:
                    p.display()
                    print("-" * 20)
                    pediatric_found = True
            if not pediatric_found:
                print("No pediatric records found.")
                    
        elif choice == "4":
            print("Exiting Hospital System.")
            break


def run_program_3():
    print("\n--- Running Program 3: Academic Hierarchy Test ---")
    dean = Deans("John Cena", 32000, "English")
    print(dean)
    
    print() # Break space
    
    exec_staff = Executive("Ronald McDonald", 42000, "Computer Science")
    print(exec_staff)



if __name__ == "__main__":
    while True:
        print("\n----------   Program 1-3   ----------")
      
        print("1. Program 1 (Account System)")
        print("2. Program 2 (Hospital Database)")
        print("3. Program 3 (Professor Hierarchy)")
        print("4. Close Assignment Application")
        print("------------------------------------------")
        
        main_choice = input("Select a program to execute (1-4): ").strip()
        
        if main_choice == "1":
            run_program_1()
        elif main_choice == "2":
            run_program_2()
        elif main_choice == "3":
            run_program_3()
        elif main_choice == "4":
            print("\nShutting down assignment loader. Goodbye!")
            break
        else:
            print("[Error] Invalid entry. Please enter a value between 1 and 4.")

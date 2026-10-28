class Book:
  
    def __init__(self, title, author, price):
        self.title = title
        self.author = author
        self.price = price

    def __str__(self):
        return f"Book: {self.title} | Author: {self.author}\nPrice: PHP {self.price:.2f}"


class EBook(Book):
    def __init__(self, title, author, price, file_size_mb):
        super().__init__(title, author, price)
        self.file_size_mb = file_size_mb

    def __str__(self):
        return f"EBook | {super().__str__()}\nFile size: {self.file_size_mb}MB"


def main():
    
    print("----------     Program 1     ----------");
    books = [
        Book("Python Basics", "Maria Santos", 450),
        EBook("Learning OOP", "Ana Cruz", 300, 5),
        EBook("Python Projects", "Juan Reyes", 550, 8),
    ]
    for book in books:
        print(book)
        print()


if __name__ == "__main__":
    main()

  
class Vehicle:
    def __init__(self, brand, daily_rate):
        self.brand = brand
        self.daily_rate = daily_rate

    def calculate_rental(self, days):
        return self.daily_rate * days

    def __str__(self):
        return f"Brand: {self.brand} | Daily rate: PHP {self.daily_rate:.2f}"


class Car(Vehicle):
    def __init__(self, brand, daily_rate, seat_capacity):
        super().__init__(brand, daily_rate)
        self.seat_capacity = seat_capacity

    def __str__(self):
        return f"Car: {self.brand} | Daily rate: PHP {self.daily_rate:.2f} | Seats: {self.seat_capacity}"


class Motorcycle(Vehicle):
    def __init__(self, brand, daily_rate, engine_capacity_cc):
        super().__init__(brand, daily_rate)
        self.engine_capacity_cc = engine_capacity_cc

    def __str__(self):
        return f"Motorcycle: {self.brand} | Daily rate: PHP {self.daily_rate:.2f} | Engine: {self.engine_capacity_cc} cc"


# Create instances and calculate rental charges
if __name__ == "__main__":
    
    print("----------     Program 2     ----------");
    # Create one Car and one Motorcycle object
    car = Car("Toyota", 1500.00, 5)
    motorcycle = Motorcycle("Honda", 500.00, 150)
    
    days = 3

    # Display Car details and rental charge
    print(car)
    print(f"Rental charge for {days} days: PHP {car.calculate_rental(days):.2f}\n")

    # Display Motorcycle details and rental charge
    print(motorcycle)
    print(f"Rental charge for {days} days: PHP {motorcycle.calculate_rental(days):.2f}")

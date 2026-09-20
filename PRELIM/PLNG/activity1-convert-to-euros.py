# ACTIVITY ONE - Convert the prices to Euros
exchange_rate = 0.87

price1 = float(input("Enter the price of product 1 in USD: "))
price2 = float(input("Enter the price of product 2 in USD: "))
price3 = float(input("Enter the price of product 3 in USD: "))
price4 = float(input("Enter the price of product 4 in USD: "))
price5 = float(input("Enter the price of product 5 in USD: "))
price6 = float(input("Enter the price of product 6 in USD: "))

print (f"Product 1: {price1 * exchange_rate:.2f}")
print (f"Product 2: {price2 * exchange_rate:.2f}")
print (f"Product 3: {price3 * exchange_rate:.2f}")
print (f"Product 4: {price4 * exchange_rate:.2f}")
print (f"Product 5: {price5 * exchange_rate:.2f}")
print (f"Product 6: {price6 * exchange_rate:.2f}")



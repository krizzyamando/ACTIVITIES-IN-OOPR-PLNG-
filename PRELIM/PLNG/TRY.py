txt = "Hello, World!"
print (txt[5:7].upper())
print (txt.upper())
name = "Python"
print ("I Love Python")

print (10>9)
print (10==9)
print (10<9)
print (bool("Hello"))
print (bool(0))
print (" ")

a = 15
b = 4
print (a % b)
print (a // b) 
print (a ** b)
a += 10 
print ("Find the value of a: ", a)
print (" ")

list = ["apple", "banana", "cherry"]
print(list)

list = ["apple", "banana", "cherry", "apple", "cherry"]
print(list)

list = ["apple", "banana", "cherry"]
list.append("orange")
print(list)
print (" ")

list = ["apple", "banana", "cherry"]
list.insert(1, "Maksuda Sultana")
print(list)

list = ["apple", "Maksuda Sultana", "cherry"]
list.remove("Maksuda Sultana")
print(list)

print("")

list = ["apple", "banana", "cherry"]
list.pop(1)
print(list)

print("")

list = ["apple", "banana", "cherry"]
del list[0]
print(list)

print("")

list = ["apple", "banana", "cherry"]
for i  in  list:
    print(i)

colors = ["red", "greeen", "blue"]
print(colors[0])
colors[1]= "blue"
colors.append("purple")
del colors [0]
print(colors)

print("")

tuple = ["apple", "banana", "cherry"]
print(tuple[-1])
tuple = ["apple", "banana", "cherry", "orange", "kiwi", "lemon", "mango"]
print(tuple[2:5])

print("")

a = 200
b = 33
if b>a:
    print("b is greater than a")
elif a==b:
    print("a and b are euqal")
else:
    print("a is greater than b")

print("")

age = 20
if age < 13:
    print("child")
elif age < 18:
    print("teenager")
else:
    print("Adult")

print("")



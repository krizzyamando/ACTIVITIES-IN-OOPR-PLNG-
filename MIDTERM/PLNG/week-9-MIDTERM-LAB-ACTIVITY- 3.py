# Task 1: Create a bytes object by encoding the message using UTF-8
print("----------       PROGRAM 1       ----------")
message = "Hello Python"
bytes_obj = message.encode('utf-8')
print(f"1. Bytes object: {bytes_obj}")

# Task 2: Convert the bytes object back to a string
str_back = bytes_obj.decode('utf-8')
print(f"2. Bytes to string: {str_back}")

# Task 3: Convert the bytes object to a hexadecimal string
hex_str = bytes_obj.hex()
print(f"3. Bytes to hex: {hex_str}")

# Task 4: Convert the hexadecimal string back to bytes
bytes_from_hex = bytes.fromhex(hex_str)
print(f"4. Hex to bytes: {bytes_from_hex}")

# Task 5: Create a new bytearray object directly from the string "Hello Python"
bytearray_direct = bytearray(message, 'utf-8')
print(f"5. New bytearray: {bytearray_direct}")

# Task 6: Convert the bytes object from Task 1 into a separate bytearray
bytearray_from_bytes = bytearray(bytes_obj)
print(f"6. Bytes to bytearray: {bytearray_from_bytes}")

# Task 7: Slice the original bytes object to extract "Python"
sliced_bytes = bytes_obj[6:]
print(f"7. Sliced bytes: {sliced_bytes}")

# Task 8: Modify the first character from 'H' to 'h', then decode it
# ASCII value for lowercase 'h' is 104
bytearray_from_bytes[0] = 104
modified_message = bytearray_from_bytes.decode('utf-8')
print(f"8. Modified message: {modified_message}")
print()
print("----------       PROGRAM 2       ----------")
# Task 1: Initialize string literals
first_name = "Maria"
last_name = "Santos"
print(f"First name: {first_name}")
print(f"Last name: {last_name}")

# Task 2: Concatenate strings
full_name = first_name + " " + last_name
print(f"Full name: {full_name}")

# Task 3: Access characters
print(f"First character: {full_name[0]}")
print(f"Last character: {full_name[-1]}")

# Task 4: Demonstrate immutability
try:
    first_name[0] = "D"
except TypeError:
    print("Strings are immutable; individual characters cannot be changed directly.")

# Task 5: Create a new string
new_name = "D" + first_name[1:]
print(f"New name: {new_name}")
print(f"Original name: {first_name}")

# Task 6: Traverse a string
print("Characters in the full name:")
for char in full_name:
    print(char)

# Task 7: Slice a string
sliced_first = full_name[0:5]
sliced_last = full_name[6:]
print(f"Sliced first name: {sliced_first}")
print(f"Sliced last name: {sliced_last}")

# Task 8: Search for a character
search_char = input("Enter one character to search: ")

# Validate one character input
if len(search_char) == 1:
    if search_char in full_name:
        index = full_name.find(search_char)
        print(f"Character found at index: {index}")
        
        # Prints the required explanation note about the traversal blank line
        print('The blank line between a and S is the space in "Maria Santos".')
    else:
        print("Character not found.")
else:
    print("Please enter exactly one character.")

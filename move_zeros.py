def move_zeros_to_left(A):
    lengthA = len(A)
    read_index = lengthA - 1
    write_index = lengthA - 1
    
    while (read_index >= 0):
        if A[read_index] != 0:
            A[write_index] = A[read_index]
            write_index -= 1
        read_index -= 1
    
    while (write_index >= 0):
        A[write_index] = 0
        write_index -= 1

numbers = [1, 10, 20, 0, 59, 63, 0, 88, 0]
print("Original Array: ", numbers)
move_zeros_to_left(numbers)
print("After moving zeros to the left: ", numbers)

# Original Array:  [1, 10, 20, 0, 59, 63, 0, 88, 0]
# After moving zeros to the left:  [0, 0, 0, 1, 10, 20, 59, 63, 88]

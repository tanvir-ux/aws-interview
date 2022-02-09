let move_zeros_to_left = function(A) {
    if(A.length < 1) return;
    
    let lengthA = A.length;
    let read_index = lengthA - 1;
    let write_index = lengthA - 1;

    while(read_index >= 0) {
        if(A[read_index] !== 0) {
            A[write_index] = A[read_index];
            write_index--;
        }
        read_index--;
    }
    while(write_index >= 0) {
        A[write_index] = 0;
        write_index--;
    }
};
let numbers = [1, 10, 20, 0, 59, 63, 0, 88, 0];
console.log("Original Array: " + numbers);
move_zeros_to_left(numbers);
console.log("After moving zeros to the left: " + numbers);

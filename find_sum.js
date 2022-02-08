let find_sum_of_pairs = function(A, target) {
    let found_values = new Set();
    for(let a in A) {
        if(found_values.has(target - A[a])) {
            return true;
        }
        found_values.add(A[a]);
    }
    return false;
}
let numbers = [5,7,1,2,8,4,3];
let test = [3,20,1,2,7];

for(i=0;i<test.length;i++) {
    let output = find_sum_of_pairs(numbers, test[i]);
    console.log("find_sum_of_pairs (numbers, " + test[i] + " ) = " + output);
}
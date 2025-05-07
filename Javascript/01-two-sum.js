/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {

    //My thoughts
    //1. the loop should run while the sum is not == target;
    //2. ignore number that is bigger than the target?;
    //3. can i remove the index for search?


    // Brute force answer:
    // Thinking in a straightline.
    for (let i = 0; i < nums.length; i++) {
        let num1 = nums[i];
        for (let j = i + 1; j < nums.length; j++) {
            let num2 = nums[j]
            let total = num1 + num2;
            if (total == target) {
                return [i, j];
            }
        }
    }

    //refractor answer:
    for (let i = 0; i < nums.length; i++) {
        let num1 = nums[i];
        let num2 = target - num1;
        // Made a mistake of not limiting the index of the search to start after i. 
        let index = nums.indexOf(num2, i + 1);

        // Made a mistake of not thinking about what if the number is not found. 
        if (index !== -1) {
            return [i, index];
        }

    }



    // not sure how a map works need to read. 
    let map = new Map();

    for (let i = 0; i < nums.length; i++) {
        let num2 = target - nums[i];
        if (map.has(num2)) {
            return [map.get(num2), i];
        }
        map.set(nums[i], i);
    }

};


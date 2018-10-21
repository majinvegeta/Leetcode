/* Approach 1
 Hamming distance is equal to the number of corresponding bits that are different in the bitwise representation
 of the two integers. Hence, taking XOR and counting the number of set bits would give us the answer. To count
 the bits, we just loop through the bits of the integer.*/

int hammingDistance(int x, int y){
    int z = x^y , count=0;
    while(z>0){
        count+=(z&1);   // (z & 1) will be 1 if the last bit set, else 0.
        z>>=1;      // right shifting divides by two.
    }
}

/* Approach 2 - Brian's Algorithm
   If we take a number and subtract 1 from it, all zeroes up until the first 1 are set to 1, and the 1
   is set to 0. Now if we do n = n & (n-1) , the 1st 1 is unset. We continue doing that until the number
   becomes 0, hence giving us the count of 1's. Generally more efficient, as the number of iterations
   is equal to the number of 1's. In the worst case, where all the 1's are set, time complexity is O(log(N)).
   Example -> 1101000 - 1 = 1100111. 1101000 & 1100111 = 1100000
*/

int hammingDistance(int x,int y){
    int z = x^y,count=0;
    while(z>0){
        z = z & (z-1);
        count++;
    }
    return count;
}

/* Applications - The term n & (n-1) can be used to check if the number is a power of 2. 
   All powers of 2 are of the form 100000.....0. Hence, if the number is a power of 2,
   the value of n & (n-1) will be 0.
*/

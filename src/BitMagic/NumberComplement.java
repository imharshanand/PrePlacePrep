package BitMagic;

public class NumberComplement {}
/*
    public int findComplement(int num)
    {
        int bitlength = (int)(Math.log(num)/Math.log(2)) + 1;
        int mask = (1<<bitlength) - 1;
        return num ^ mask;
    }

Link:   https://leetcode.com/problems/number-complement/
Q:      Given a positive integer num, output its complement number.
        The complement strategy is to flip the bits of its binary representation.
Eg:     Input: num = 5
        Output: 2
        Explanation: The binary representation of 5 is 101 (no leading zero bits),
        and its complement is 010. So you need to output 2.

 */

/**
 * Create and test a method called `getAntiDiagonalAvg` that takes a multidimensional array
 * which represents a quadratic matrix, as a parameter and retruns the average of the numbers in the anti diagonal.
 *  - use only basic control flow statements, like 'for', 'if', etc.
 *  - do not use built-in methods like 'filter', 'forEach', 'map', etc.
 *  - write test for 2 different scenarios (test file: getAntiDiagonalAvg.spec.ts)
 *
 * Example cases:
 * 
 * [[1, 2, 3],
 * [3, 4, 6],
 * [5, 2, 5]] 
 * Should return 4, because (3 + 4 + 5) / 3 = 4. 
 *
 * [[3, 5, 11, -2],
 *  [3, 1, 7, 4],
 *  [5, 0, 2, 9],
 *  [21, 7, 8, 2]]
 * Should return 6.5, because (-2 + 7 + 0 + 21) / 4 = 6.5.
 */

'use strict';

/********************************
 * Do not modify the code below *
 ********************************/
export default getAntiDiagonalAvg;

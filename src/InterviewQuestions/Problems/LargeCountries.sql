# https://leetcode.com/problems/big-countries/description/
SELECT name, area, population
FROM World
WHERE area > 3000000 OR population > 25000000;
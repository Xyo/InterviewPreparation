// https://leetcode.com/problems/reverse-integer/

func reverse(x int) int {
    if x >= math.MaxInt32 || x <= math.MinInt32 {
        return 0
    }
    
    isNeg := false
    if x < 0 {
        isNeg = true
        x = x*-1
    }
    
    xstr := strconv.Itoa(x)
    returnVal, err := strconv.Atoi(reverseString(xstr))
    if err != nil {
        return 0
    }
    
    if isNeg {
        returnVal = returnVal*-1
    }
    
    if returnVal >= math.MaxInt32 || returnVal <= math.MinInt32 {
        return 0
    } else {
        return returnVal
    }
}

func reverseString(x string) (result string) {
    for _, c := range x {
        result = string(c) + result;
    }
    return
}

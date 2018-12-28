// https://leetcode.com/problems/palindrome-number/

func isPalindrome(x int) bool {
    if x < 0 {
        return false
    }
    strValue := strconv.Itoa(x)
    reversedStr := reverseString(strValue)
    reversedNum, err := strconv.Atoi(reversedStr)
    if err != nil {
        return false
    }
    return (x == reversedNum)
}

func reverseString(str string) (returnVal string) {
    for _, c := range str {
        returnVal = string(c) + returnVal;
    }
    return
}

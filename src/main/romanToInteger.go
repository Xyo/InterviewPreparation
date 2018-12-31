// https://leetcode.com/problems/roman-to-integer/

func romanToInt(s string) int {
    numTotal := 0
    m := make(map[string]int)
    m["I"] = 1
    m["V"] = 5
    m["X"] = 10
    m["L"] = 50
    m["C"] = 100
    m["D"] = 500
    m["M"] = 1000
    
    for position, c := range s {
        currentChar := string(c)
        numeralValue := m[currentChar] 

        if (position+1) == len(s) || !isSubtractionScenario(currentChar, s[position+1]) {
            numTotal += numeralValue
        } else {
            numTotal -= numeralValue
        }
    }
    return numTotal
}

func isSubtractionScenario(currentString string, nextRune byte) bool {
    nextString := string(nextRune)
    switch currentString {
        case "I":
            return nextString == "V" || nextString == "X"
            
        case "X":
            return nextString == "L" || nextString == "C"
        
        case "C":
            return nextString == "D" || nextString == "M" 
            
        default:
            return false
    }
}


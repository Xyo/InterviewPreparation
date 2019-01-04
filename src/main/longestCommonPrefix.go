func longestCommonPrefix(strs []string) string {
    commonPrefix := ""
    if len(strs) == 0 {
        return commonPrefix
    }
    
    for index, c := range strs[0] {
        if commonToAll(strs, c, index) {
            commonPrefix += string(c)
        } else {
            break
        }
    }
    return commonPrefix
}
   
func commonToAll(strs []string, c rune, index int) bool {
    for _, w := range strs {
        if index >= len(w) || string(w[index]) != string(c) {
            return false
        }
    }
    return true
}

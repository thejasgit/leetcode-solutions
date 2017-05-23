import "strings"

func romanToInt(s string) int {
    
    
    romanletter := map[string]int{
        "I" : 1,
        "V" : 5,
        "X" : 10,
        "L" : 50,
        "C" : 100,
        "D" : 500,
        "M" : 1000,
    }
    
    s = strings.ToUpper(s)
    res := 0
    
    for i:=0; i< len(s)-1; i++{
        ch := string(s[i])
        if romanletter[string(s[i])]<romanletter[string(s[i+1])]{
            
            res -= romanletter[ch]
        } else {
            res += romanletter[ch]
        }
    }
    
    res += romanletter[string(s[len(s)-1])]
    
    return res
    
    
}
import "fmt"

func longestCommonPrefix(strs []string) string {
    
    //Base conditions
    if len(strs)==0{
    return ""
    }
    if len(strs)==1{
    return strs[0]
    }
    
    
    //find the smallest string
    minlen:=len(strs[0])
    str := strs[0]
    for _,s:= range strs{
        
        fmt.Println(s)
       if(len(s)<minlen){
        minlen = len(s)
        str = s
        }
    }
    
    if minlen==0 {
        return str;
    }
 
   //compare the smallest string with other strings
    flag:=false
    for i:=0; i<len(str); i++ {

        for _,t := range(strs) {
            if str[i]!=t[i] {
                flag = true
            }
        }
        if flag{
            return str[:i]
        }
        
    }
    
    return str
    
}
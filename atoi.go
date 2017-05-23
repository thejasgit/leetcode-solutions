import "strings"
import "fmt"
func myAtoi(str string) int {
    
    str = strings.TrimSpace(str)
    sign:=1
    i:=0
    if len(str) == 0{
        return 0
    }
    if  str[:1] == "-"{
    sign = -1
    i = 1
  } else if str[:1] == "+"{
       sign = 1
    i = 1
      
  } 
    res:=0
    fmt.Println(sign)
    
    for i<len(str){
        
        if(strings.ContainsAny(string(str[i]),"0123456789")){
        res = res*10+ int(str[i]) - int('0')
        fmt.Println(res)
        }else {
            break
        }
        
        if res*sign > 2147483647{
        return  2147483647
    }else if res*sign < -2147483648{
        return -2147483648
    }
         i++;
        }
    
    
    
   return res * sign 
}
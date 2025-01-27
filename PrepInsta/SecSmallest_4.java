import java.util.Scanner;
import java.util.*;
public class SecSmallest_4 {
    static int secSmallest(int arr[],int n){
        int smallest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<smallest)
            smallest=arr[i];
        }
        int sec_smallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]!=smallest && arr[i]<sec_smallest)
            sec_smallest=arr[i];
        }
        return sec_smallest;
    }
    public static void main(String args[]){
        int arr[]={12,13,1,10,34,10};
        int n=arr.length;
        System.out.print(secSmallest(arr,n));
    }
    
}
/**
 * Here is the tracing of the code execution shown in a column format for better understanding:

### Input Array: `{12, 13, 1, 10, 34, 10}`

#### **Step 1: Finding the Smallest Element**

| Index | Array Element | Current Smallest | Condition Check  | Update to Smallest |
|-------|---------------|------------------|------------------|--------------------|
| 0     | 12            | 12               | No               | No                 |
| 1     | 13            | 12               | No               | No                 |
| 2     | 1             | 12               | Yes (1 < 12)     | Yes, `smallest = 1`|
| 3     | 10            | 1                | No               | No                 |
| 4     | 34            | 1                | No               | No                 |
| 5     | 10            | 1                | No               | No                 |

- Final `smallest = 1`.

#### **Step 2: Finding the Second Smallest Element**

| Index | Array Element | Current Second Smallest | Condition Check                | Update to Second Smallest  |
|-------|---------------|-------------------------|--------------------------------|----------------------------|
| 0     | 12            | `Integer.MAX_VALUE`      | Yes (12 != 1 and 12 < max)     | Yes, `sec_smallest = 12`   |
| 1     | 13            | 12                      | No                             | No                         |
| 2     | 1             | 12                      | No (1 == smallest)             | No                         |
| 3     | 10            | 12                      | Yes (10 != 1 and 10 < 12)      | Yes, `sec_smallest = 10`   |
| 4     | 34            | 10                      | No                             | No                         |
| 5     | 10            | 10                      | No                             | No                         |

- Final `sec_smallest = 10`.

#### **Final Output**
- The second smallest element is `10`, which is printed.

### Output:
```
10
```
 */
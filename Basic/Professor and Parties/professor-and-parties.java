//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.PartyType(a, n));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {

    public static String PartyType( long a[], int n)
    {
        
        HashSet<Long> hs = new HashSet<>();
        HashMap<Long, Integer> hm = new HashMap<>();
        
        for(int i=0; i<n; i++){
            hs.add(a[i]);
       /*  if(hm.containsKey(a[i])){
             hm.put(a[i], hm.get(a[i]+1));
             
         }else {hm.put(a[i],1);
         }*/
        }
        /*
        
        for(Map.Entry< Long, Integer>e:hm.entrySet()){
            
             if(e.getValue()>1) return "BOYS";
            
        }
        */
        
        if(hs.size()<n) return "BOYS";
      /*  for(int i=0; i<n; i++){
            if(hm.get(a[i])>1 && hm.containsKey(a[i])) return "BOYS";
          //  else return "GIRLS";
            
        }*/
        // Your code goes here
        return "GIRLS";
    }
}
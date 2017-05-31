import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        int test;
        BufferedReader bf=new BufferedReader (new InputStreamReader (System.in));
        test=Integer.parseInt(bf.readLine());
        while(test-- >0){
        String str=bf.readLine();
        char[] ch=str.toCharArray();
        int len=str.length();
        int s=0,m=0;
        for(int i=0;i<len;i++){
            if(ch[i] =='s')
                s++;
            if(ch[i] =='m')
                m++;
        }
       
        for(int i=0;i<len;i++){
            if(i<len-1){
             if( ch[i]=='m' && ch[i+1]=='s')
                 s--;
            }
            else if(i!=0){
             if(ch[i]=='m' && ch[i-1]=='s')
                s--;
            }
        }
        if(s<0)
            s=0;
        
        if(m<s)
            System.out.println("snakes");
        else if(m>s)
            System.out.println("mongoose");
        else if(m==s)
            System.out.println("tie");
        
            }
    }
}


Input:
4
sm
ssm
sms
ssmmmssss

Output:

mongooses
tie
tie
snakes


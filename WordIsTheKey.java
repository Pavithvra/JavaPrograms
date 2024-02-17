import java.util.Scanner;

/*
Question #3: Word is the key
One programming language has the following keywords that cannot be used as identifiers:

break, case, continue, default, defer, else, for, func, goto, if, map, range, return, struct, type, var

Write a program to find if the given word is a keyword or not

Input #1:

defer

Output:

defer is a keyword

Input #2:

While
 */
public class WordIsTheKey {
    public static void main (String [] args){
        Scanner sc =new Scanner(System.in);
        String str [] ={"break", "case", "continue", "default", "defer", "else", "for", "func", "goto", "if", "map",
                "range", "return", "struct", "type", "var"};
        String input = sc.next();
        int temp=0;
        for(int i=0;i<16;i++){
            if(input.equals(str[i])){
                temp =1;
                break;
            }
            else{
            }
        }
        if(temp ==1){
            System.out.print(input +" is a Keyword");
        }
        else {
            System.out.print(input +" is not a Keyword");
        }

    }
}

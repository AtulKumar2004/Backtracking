public class hwkeypad {
    public static void keypad(String digits,String arr[],int i,String ans){
        // base case
        if(ans.length()==digits.length()){
            System.out.println(ans);
            return;
        }
        // recursion
        for(int j=0;j<arr[i].length();j++){
            keypad(digits, arr, i+1, ans+arr[i].charAt(j));
        }
    }        
    public static void main(String[] args) {
        String digits="234";
        String arr[]=new String[digits.length()];
        for(int i=0;i<digits.length();i++){
            if(digits.charAt(i)=='2'){
                arr[i]="abc";
            }
            else if(digits.charAt(i)=='3'){
                arr[i]="def";
            }
            else if(digits.charAt(i)=='4'){
                arr[i]="ghi";
            }
            else if(digits.charAt(i)=='5'){
                arr[i]="jkl";
            }
            else if(digits.charAt(i)=='6'){
                arr[i]="mno";
            }
            else if(digits.charAt(i)=='7'){
                arr[i]="pqrs";
            }
            else if(digits.charAt(i)=='8'){
                arr[i]="tuv";
            }
            else if(digits.charAt(i)=='9'){
                arr[i]="wxyz";
            }
        }
        keypad(digits,arr, 0,"");
    }
}
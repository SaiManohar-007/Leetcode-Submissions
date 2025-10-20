class Solution {
    public int[] plusOne(int[] digits) {
        
        if(digits[digits.length-1]!=9){
            digits[digits.length-1]++;
            return digits;
        }
        boolean all9=true;
        for(int i=0;i<digits.length;i++){
            if(digits[i]!=9){
                all9=false;
                break;
            }
        }
        int[] arr=new int[digits.length+1];
        int connine=0;
        if(all9){
            arr[0]=1;
            return arr;
        }
        else{
            for(int i=digits.length-1;i>=0;i--){
                if(digits[i]==9){
                    connine++;
                }
                else break;
            }
        }
        for(int i=digits.length-1;i>=digits.length-connine;i--){
            digits[i]=0;
        }
        digits[digits.length-connine-1]++;
       
        return digits;
    }
}
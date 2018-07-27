public static boolean isPalindrome(String str){
    StringBuilder sb = new StringBuilder(str);
    String rev = sb.reverse().toString();
    if (str.equalsIgnoreCase(rev)) {return true;}
    else{return false;}
        
}
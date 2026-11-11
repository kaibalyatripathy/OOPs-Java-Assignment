class Q4{
	public void isPalindrome(String s){
		String rev=new StringBuilder(s).reverse().toString();
		String msg=s.equals(rev)? "Palindrome" : "Not Palindrome";
		System.out.println("The String is "+msg);
	}
	public static void main(String[] args){
		Q4 obj=new Q4();
		obj.isPalindrome("AbbA");
	}
}
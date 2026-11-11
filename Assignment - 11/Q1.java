class Q1{
	public void compare(String s1, String s2){
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)>s2.charAt(i)){
				System.out.println(s1+" is greater than "+s2);
				return;
			}
			else if(s1.charAt(i)<s2.charAt(i)){
				System.out.println(s1+" is less than "+s2);
				return;
			}
		}
		System.out.println(s1+" is equal to "+s2);
		return;
	}
	public static void main(String[] args){
		Q1 obj=new Q1();
		obj.compare("Abc","Abd");
	}
}
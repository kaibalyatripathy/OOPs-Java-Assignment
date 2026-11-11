class Q2{
	public void compare(String s1, String s2){
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)!=s2.charAt(i)){
				System.out.println(s1+" is not equal to "+s2);
				return;
			}
		}
		System.out.println(s1+" is equal to "+s2);
		return;
	}
	public static void main(String[] args){
		Q2 obj=new Q2();
		obj.compare("Abd","Abd");
	}
}
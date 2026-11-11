class Q3{
	public void show(String s){
		for (int i = 0; i < s.length(); i++)
            System.out.println(s.charAt(i) + " = " + i);
	}
	public static void main(String[] args){
		Q3 obj=new Q3();
		obj.show("aabccc");
	}
}
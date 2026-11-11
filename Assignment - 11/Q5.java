class Q5{
	public void find(String s){
		int mx=0,mx2=0;
		int[] freq=new int[26];

		for(int i=0;i<s.length();i++)
			freq[s.charAt(i)-'a']++;

		for(int i=0;i<26;i++){
			if(freq[i]>freq[mx]){
				mx2=mx;
				mx=i;
			}else if(freq[i]>mx2){
				mx2=i;
			}
		}
		System.out.println("2nd most frequent character is: "+(char)('a'+mx2));
			
	}
	public static void main(String[] args){
		Q5 obj=new Q5();
		obj.find("aaabbcccc");
	}
}
package allerp;

public class PangramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Abcdefghijklmnopqrstuvwxyz";

		String s2="";

		for(int i=0;i<s1.length();i++)

		{
			if(s1.charAt(i)!=' ')
				s2+=s1.charAt(i);
		}

		System.out.println(s2);

		s2=s2.toLowerCase();

		String s="";

		for(int i=0;i<s2.length();i++)
		{
			int cnt=0;

			for(int j=0;j<s2.length();j++)
			{

				if(s2.charAt(i)==s2.charAt(j))
					cnt++;
			}

			if(cnt==1)
				s+=s2.charAt(i);

		}
		int len=s.length();


		if(len==26)
			System.out.println("This is pangram string ");
		else
			System.out.println("This is not  pangram string ");

	}

}

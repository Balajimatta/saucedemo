package basic;

	class Amsterdam {
		//Total words in ur string
		//Occurence of each words
		public int countAm(String s) {
			String str = s.toLowerCase();
//			
			int cnt = 0;
			String a[] = str.split(" ");
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
				if (a[i].equals("is")) {
					cnt = cnt + 1;
				}
				//System.out.println(i+"--"+a[i]);
			
			}
			return cnt;
		}
	}

public class string {

	
			public static void main(String[] args) {
				
				Amsterdam a1 = new Amsterdam();
				//int count =a1.countAm(s);
				int count =a1.countAm("I learn java from EB. Java is most popular programming language. Java is platfoem independent. Java is secure");
				System.out.println(count);
				//System.out.println("Print Count :"+count);


			}


		
	}



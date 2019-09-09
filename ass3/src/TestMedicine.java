import java.util.*;
public class TestMedicine {

	public static void main(String[] args) {
		Medicine m1[]=new Medicine[10];
		Random rand=new Random();
		int randNo;
		for(int i=0;i<m1.length;i++){
			m1[i]=new Medicine();
			m1[i].displayLabel();

			randNo=rand.nextInt((3 - 1) + 1) + 1 ;
			if(randNo==1)
				m1[i]=new Tablet();
			else if(randNo==2)
					m1[i]=new Syrup();
				else if(randNo==3)
					m1[i]=new Ointment();
			m1[i].displayLabel();

		}
	}

}

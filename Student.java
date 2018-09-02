package class_daily;

class Mark {
	int Frst_Lnag_Mark, Eng_Mark, Math_Mark , Scn_Mark, SociaL_Scn_Mark;
	
	
}	

public class Student {
	public static void main (String[] args)
	{
	Mark S1 = new Mark ();
	Mark S2 = new Mark ();
	Mark S3 = new Mark ();
	Mark S4 = new Mark ();
	Mark S5 = new Mark ();
	S1.Frst_Lnag_Mark = 70; 
	S1.Eng_Mark = 80;
	S1.Math_Mark = 100; 
	S1.Scn_Mark = 150;
	S1.SociaL_Scn_Mark = 95;
	
	S2.Frst_Lnag_Mark = 70; 
	S2.Eng_Mark = 80;
	S2.Math_Mark = 90; 
	S2.Scn_Mark = 150;
	S2.SociaL_Scn_Mark = 95;
	
	S3.Frst_Lnag_Mark = 70; 
	S3.Eng_Mark = 80;
	S3.Math_Mark = 85; 
	S3.Scn_Mark = 150;
	S3.SociaL_Scn_Mark = 95;
	
	S4.Frst_Lnag_Mark = 70; 
	S4.Eng_Mark = 80;
	S4.Math_Mark = 70; 
	S4.Scn_Mark = 150;
	S4.SociaL_Scn_Mark = 95;
	
	S5.Frst_Lnag_Mark = 70; 
	S5.Eng_Mark = 80;
	S5.Math_Mark = 100; 
	S5.Scn_Mark = 150;
	S5.SociaL_Scn_Mark = 95;
	
/*	int Hold [][] = new int[5][5];
	for (int i = 0; i<5;itt)
	{
		for (int j = 0; j++ ; J++)
		{
			
		}
			
	} */
	
	Mark Math[] = new Mark [5];
	Math[0] = S1;
	Math[1] = S2;
	Math[2] = S3;
	Math[3] = S3;
	Math[4] = S5;
	
	for ( int i=0; i < 5; i ++)
	{
		System.out.println(Math[i].Eng_Mark);
	}	
	}		
	}	

import java.util.Scanner;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Vector;


public class MedicReport
{
	public static void main(String[] args)
	{
		try
		{
			Scanner inp=new Scanner(new File("InputSC.txt"));
			String exp,gen,ag,exp1,stu,typ;
			int umur;
			Vector<Doctor> doctor=new Vector<Doctor>();
			ExpertList[] expertlist=ExpertList.values();
			int i=0;
			while(inp.hasNext())
			{
				exp=inp.next();
				exp1=exp.toUpperCase();

				gen=inp.next();
				ag=inp.next();
				umur=Integer.parseInt(ag);
				for(ExpertList expert:expertlist)
				{
					if(exp1.equals(expert.toString()))
					{
						stu=expert.getStudy();
						typ=expert.getTypes();
						doctor.addElement(new Doctor(gen,umur,stu,typ));
					}
				}
			}inp.close();

			String format="%-6s %-8s %-5s %-10s %-35s\n";
			String format1="%-5s %-5s %-35s %7.2f %8s %15.2f\n";
			String format2="%-10s %-10s %-10s \n";

			System.out.println("Types of Doctors");
			for(ExpertList expert:expertlist)
			{
				System.out.printf(format2,expert,expert.getStudy(),expert.getTypes());
			}
			System.out.println();
			System.out.println("               MEDIC REPORT");
			System.out.printf(format,"Case","Gender","Age","Study","Types");
			for(int j=0;j<doctor.size();j++)
			{

				if(((Doctor)doctor.get(j)).getGender().equals("M"))
				{
					System.out.printf(format,(j+1),"Male",((Doctor)doctor.get(j)).getAge(),((Doctor)doctor.get(j)).getStudy(),((Doctor)doctor.get(j)).getTypes());
				}
				else
				{
					System.out.printf(format,(j+1),"Female",((Doctor)doctor.get(j)).getAge(),((Doctor)doctor.get(j)).getStudy(),((Doctor)doctor.get(j)).getTypes());
				}
			}
			System.out.println();
			int ALLERGISTS=0,ANESTHSIOLOGISTS=0,CARDIOLOGISTS=0,COLON=0;
			for(int k=0; k<doctor.size();k++)
			{
				if(((Doctor)doctor.get(k)).getTypes().equals("ALLERGISTS"))
				{
					ALLERGISTS+=1;
				}
				else if(((Doctor)doctor.get(k)).getTypes().equals("ANESTHSIOLOGISTS"))
				{
					ANESTHSIOLOGISTS+=1;
				}
				else if(((Doctor)doctor.get(k)).getTypes().equals("CARDIOLOGISTS"))
				{
					CARDIOLOGISTS+=1;
				}
				else
				{
					COLON+=1;
				}
			}
			System.out.println("Total of Allergists = "+ALLERGISTS);
			System.out.println("Total of Anesthsiologists = "+ANESTHSIOLOGISTS);
			System.out.println("Total of Cardiologist = "+CARDIOLOGISTS);
			System.out.println("Total of Colon = "+COLON);
			System.out.println("Total Experts = "+(ALLERGISTS+ANESTHSIOLOGISTS+CARDIOLOGISTS+COLON));


		}

		catch (FileNotFoundException e)
		{

			System.out.println("An error occurred.");
		    e.printStackTrace();
   		}
	}
}

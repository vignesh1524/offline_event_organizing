import java.util.*;
import java.io.*;
class newproject1{

	void enter(String ams[]){
	
		System.out.println("which college details you want to enter:");
		
		for(int ins=0;ins<ams.length;ins++){
			System.out.println((ins+1)+"."+ams[ins]);
		}
		
		System.out.print("please enter your choice:");
		Scanner is = new Scanner(System.in);
		int choice=is.nextInt();
		
		switch(choice){
			
			case 1: 
				System.out.println("*********************************");
			        System.out.println("*****welcome to CBIT college*****");
				System.out.println("*********************************");
				
				while(true)
				{
				System.out.println("enter the name of the event:");
				String cn;
				cn=is.next();
				cn=cn+is.nextLine();
	
				System.out.println("enter the date of the event");
				String z;
				z=is.next();
				z +=is.nextLine();

				System.out.println("details of the organizer(name:contact)");
				String o;
				o=is.next();
				o=o+is.nextLine();
				
				try{

					FileOutputStream fout=new FileOutputStream("cbit.txt");
					
					String y="\nname of the event:";
					byte ya[]=y.getBytes();
					byte b[]=cn.getBytes();
					
					String e="\ndate of the event:";
					byte ea[]=e.getBytes();
					byte c[]=z.getBytes();
					
					String or="\ndetails of organizer";
					byte org[]=or.getBytes();
					byte d[]=o.getBytes();
					
					fout.write(ya);
					fout.write(b);
					fout.write(ea);
					fout.write(c);
					fout.write(org);
					fout.write(d);
					fout.close();	
					
				}		
				
				catch(FileNotFoundException e){
					
					System.out.println("create a new file");
				}
				
				catch(IOException k){
					
					System.out.println(k);
				}
				
				System.out.println("press 1 to add more events");
				int add1=is.nextInt();
				
				if(add1!=1){
					break;
				}
				else
				{
					continue;
				}

				}
				
				System.out.println("successfully entered:");
				break;
			
			case 2:
				System.out.println("********************************");
				System.out.println("*****welcome to VNR college*****");
				System.out.println("********************************");
				
				while(true){
					
					System.out.print("enter the name of the event:");
					String ev;
					ev=is.next();
					ev=ev+is.nextLine();
					
					System.out.print("date of the event:");
					String dv;
					dv=is.next();
					dv=dv+is.nextLine();
					
					System.out.println("details of the organizer(name:contact)");
					String vorg;
					vorg=is.next();
					vorg=vorg+is.nextLine();
				try{
					FileOutputStream fout = new FileOutputStream("vnr.txt");
					
					String v1="\nname of the event:";
					byte vn1[]=v1.getBytes();
					byte evb1[]=ev.getBytes();
					
					String v2="\ndate of the event:";
					byte vn2[]=v2.getBytes();
					byte evb2[]=dv.getBytes();
					
					String v3="\ndetails of the organizer(name:contact)";
					byte vn3[]=v3.getBytes();
					byte evb3[]=vorg.getBytes();
					
					fout.write(vn1);
					fout.write(evb1);
					fout.write(vn2);
					fout.write(evb2);
					fout.write(vn3);
					fout.write(evb3);
					fout.close();
				
				}
				
				catch(FileNotFoundException e){
					
					System.out.println("create a new file");
				}
				
				catch(IOException ie){
					
					System.out.println(ie);
				}
				
				System.out.print("press 1 to add more events:");
				int add2=is.nextInt();
				
				if(add2!=1){
					break;
				}
				else{
					continue;
				}
				}
				
				System.out.println("successfully entered :");
		        	
				break;
			
			case 3:
				System.out.println("**********************************");
				System.out.println("*****welcome to SNIST college*****");
				System.out.println("**********************************");
				
				while(true){
					
					System.out.println("enter the name of the event:");
					String es;
					es=is.next();
					es=es+is.nextLine();
					
					System.out.println("enter the date of the event:");
					String ds;
					ds=is.next();
					ds=ds+is.nextLine();
					
					System.out.println("enter details of organizer(name:contact)");
					String os;
					os=is.next();
					os=os+is.nextLine();

					try{
					
					      FileOutputStream fout=new FileOutputStream("snist.txt");
						
					        String snist1="\nname of the event:";
						byte bs1[]=snist1.getBytes();
						byte es1[]=es.getBytes();
						
						String snist2="\ndate of the event:";
						byte bs2[]=snist2.getBytes();
						byte ds1[]=ds.getBytes();
						
						String snist3="\ndetails of organizer(name:contact)";
						byte bs3[]=snist3.getBytes();
						byte os1[]=os.getBytes();
						
						fout.write(bs1);
						fout.write(es1);
						fout.write(bs2);
						fout.write(ds1);
						fout.write(bs3);
						fout.write(os1);
						fout.close();
					
					}
				      
					catch(FileNotFoundException exe1){
						
						System.out.println("create a new file");
					}

					catch(IOException exe2){
						
						System.out.println(exe2);
					}
					
					System.out.print("press 1 to add more events:");
					int add3=is.nextInt();
					
					if(add3!=1){
						break;
					}
					else{
						continue;
					}

				}

				System.out.println("successfully entered:");
				
				break;

			case 4:
				System.out.println("*********************************");
				System.out.println("*****welcome to MGIT college*****");
				System.out.println("*********************************");
				
				while(true){
					
					System.out.println("enter the name of the event:");
					String em;
					em=is.next();
					em=em+is.nextLine();
					
					System.out.println("enter the date of the event:");
					String dm;
					dm=is.next();
					dm=dm+is.nextLine();
					
					System.out.println("enter details of organizer(name:contact)");
					String om;
					om=is.next();
					om=om+is.nextLine();

					try
					{
						FileOutputStream fout=new FileOutputStream("mgit.txt");
						String mgit1="\nname of the event:";
						byte bm1[]=mgit1.getBytes();
						byte em1[]=em.getBytes();
						
						String mgit2="\ndate of th event:";
						byte bm2[]=mgit2.getBytes();
						byte dm1[]=dm.getBytes();
						
						String mgit3="\ndetails of organizer(name:contact)";
						byte bm3[]=mgit3.getBytes();
						byte om1[]=om.getBytes();

						fout.write(bm1);
						fout.write(em1);
						fout.write(bm2);
						fout.write(dm1);
						fout.write(bm3);
						fout.write(om1);
						fout.close();
					}
					
					catch(FileNotFoundException fnf)
					{
						System.out.println("create a new file");
					}
					
					catch(IOException ioe)
					{
						System.out.println(ioe);
					}
					
					System.out.print("press 1 to add more events:");
					int add4=is.nextInt();
					
					if(add4!=1){
						break;
					}
					else{
						continue;
					}
				}
				System.out.println("entered successfully:");
				
				break;

			case 5:
				System.out.println("*********************************");
				System.out.println("***** welcome to OU college *****");
				System.out.println("*********************************");
				
				while(true){
					
					System.out.println("enter the name of the event:");
					String oue;
					oue=is.next();
					oue=oue+is.nextLine();
					
					System.out.println("enter the date of the event:");
					String oud;
					oud=is.next();
					oud=oud+is.nextLine();
					
					System.out.println("enter details of organizer(name:contact)");
					String ouo;
					ouo=is.next();
					ouo=ouo+is.nextLine();
					
					try{
						FileOutputStream fout=new FileOutputStream("ou.txt");
						
						String ou1="\nname of the event:";
						byte oub1[]=ou1.getBytes();
						byte oub2[]=oue.getBytes();
						
						String ou2="\ndate of the event:";
						byte oub3[]=ou2.getBytes();
						byte oub4[]=oud.getBytes();
						
						String ou3="\ndetails of organizer(name:contact)";
						byte oub5[]=ou3.getBytes();
						byte oub6[]=ouo.getBytes();

						fout.write(oub1);
						fout.write(oub2);
						fout.write(oub3);
						fout.write(oub4);
						fout.write(oub5);
						fout.write(oub6);
						fout.close();
						
					}
					catch(FileNotFoundException not1){
						
						System.out.println("create a new file");
					}
					catch(IOException not2){
						
						System.out.println(not2);
					}

					System.out.println("press 1 to add more events:");
					int ad=is.nextInt();
					if(ad!=1){
						break;
					}
					else{
						continue;
					}
				}
				
				System.out.println("successfully entered:");
				break;
			       
			case 6:
				System.out.println("**********************************");
				System.out.println("*****welcome to JNTUH college*****");
				System.out.println("**********************************");
				
				while(true){
					
					System.out.println("enter the name of the event:");
					String jntue;
					jntue=is.next();
					jntue+=is.nextLine();

					System.out.println("enter the date of the event:");
					String jntud;
					jntud=is.next();
					jntud+=is.nextLine();

					System.out.println("enter details of organizer(name:contact)");
					String jntuo;
					jntuo=is.next();
					jntuo+=is.nextLine();

					try{
						FileOutputStream fout=new FileOutputStream("jntuh.txt");
						String jntu1="\nname of the event:";
						byte j1[]=jntu1.getBytes();
						byte j2[]=jntue.getBytes();

						String jntu2="\ndate of the event:";
						byte j3[]=jntu2.getBytes();
						byte j4[]=jntud.getBytes();

						String jntu3="\ndetails of organizer(name:contact)";
						byte j5[]=jntu3.getBytes();
						byte j6[]=jntuo.getBytes();

						fout.write(j1);
						fout.write(j2);
						fout.write(j3);
						fout.write(j4);
						fout.write(j5);
						fout.write(j6);
						fout.close();
					}
					catch(FileNotFoundException jf1){
					
						System.out.println("create a new file");
					
					}
					catch(IOException jf2){
					
						System.out.println(jf2);
					
					}
				
					System.out.println("press 1 to add more events:");
					int ad6=is.nextInt();
					if(ad6!=1){
						break;
					}
					
					else{
						continue;
					}
				}
				System.out.println("successfully entered:");
			
				
				break;       

			default:
				System.out.println("please check the college you entered");
		}
	}

}
class newproject2{

	void know(){
		Scanner input=new Scanner(System.in);
		System.out.println("***welcome to online college event organisation***");
		System.out.println("which college events do u want to know :");
		System.out.println("\n1.CBIT\n2.VNR\n3.SNIST\n4.MGIT\n5.OU\n6.JNTUH");
		System.out.print("please enter your choice:");
		int opt=input.nextInt();
		
		switch(opt){
			
			case 1:
				try
				{
					FileInputStream fin=new FileInputStream("cbit.txt");
					int i1=0;
					
					while((i1=fin.read())!=-1)
					{
						System.out.print((char)i1);
					}
					
					fin.close();
				}
				
				catch(FileNotFoundException exc1){
					
					System.out.println("create a new file");
				
				}
				
				catch(IOException exc2){
					
					System.out.println(exc2);
				
				}

				break;
			
			case 2:
				try
				{
					FileInputStream fin = new FileInputStream("vnr.txt");
					int j1=0;
					
					while((j1=fin.read())!=-1){
						System.out.print((char)j1);
					}
					
					fin.close();
				}
				
				catch(FileNotFoundException exc3)
				{
					System.out.println("create a new file");
				}
				
				catch(IOException exc4)
				{
					System.out.println(exc4);
				}

				break;
			
			case 3:
				try
				{
				
					FileInputStream fin=new FileInputStream("snist.txt");
					int fs=0;

					while((fs=fin.read())!=-1){
						System.out.print((char)fs);
					}
					fin.close();
				}
				catch(FileNotFoundException exe5)
				{
					System.out.println("create a new file");
				}

				catch(IOException exe6)
				{
					System.out.println(exe6);
				}
				
				break;

			case 4:
				try
				{
					
					FileInputStream fin=new FileInputStream("mgit.txt");
					int fm=0;

					while((fm=fin.read())!=-1){
						System.out.print((char)fm);
					}
					fin.close();
				}
				catch(FileNotFoundException exc7)
				{
					System.out.println("create a new file!!");
				}
				
				catch(IOException exc8)
				{
					System.out.println(exc8);
				}
		
				break;

			case 5: 
				try
				{
					FileInputStream fin=new FileInputStream("ou.txt");
					int fo=0;

					while((fo=fin.read())!=-1){
						
						System.out.print((char)fo);
					
					}
					fin.close();
				}

				catch(FileNotFoundException of1)
				{
					System.out.println("create a new file!!");
				}

				catch(IOException of2)
				{
					System.out.println(of2);
				}
	
				break;

			case 6:
			
				try{
					FileInputStream fin=new FileInputStream("jntuh.txt");
					int fj=0;
					
					while((fj=fin.read())!=-1){
					
						System.out.print((char)fj);
					
					}
					fin.close();
				}

				catch(FileNotFoundException jf6)
				{
					System.out.println("create a new file!!");
				}

				catch(IOException jf7)
				{
					System.out.println(jf7);
				}

				break;

		}
	}
	}
class orgclass{
	public static void main(String args[]){

		System.out.println("**********welcome to online college events organisation*********");
		System.out.println("NOTICE!! only the registered colleges are allowed to use");
		
		while(true){
		
			System.out.println("\n1.Enter the college events:\n2.Know the college events:\n3.Help\n4.Quit");
			System.out.print("\nenter your choice:");
			Scanner in=new Scanner(System.in);
			int ch=in.nextInt();
			
			String[] s={"cbit","vnr","snist","mgit","ou","jntu"};
			String c;

			int m=0,i,j,m1=0;
	
			newproject1 p=new newproject1();
			newproject2 q=new newproject2();
			switch(ch){
				
				case 1:
					System.out.println("please enter your college code:");
		      			c=in.next(); 
		       			
					for(i=0;i<s.length;i++){
		      				
					if(s[i].compareTo(c)==0)
		       			{     													
						m=1;
		       				break;
		       			}
		       			}
		       			
					if(m==1)
		       			{		
						p.enter(s);
					}
		       			
					else{

					System.out.println("enter a valid college");
					System.out.println("do you want to add your college??");
					System.out.println("press 1 to add your college: ");

					int press=in.nextInt();
					try{
						String st[]=new String[s.length+1];						
						for(int g=0;g<s.length;g++)
						{
							st[g]=s[g];
				                }
						
						if(press==1)
						{
							System.out.println("enter your college");
							String sc=in.next();
							st[s.length]=sc;
							p.enter(st);
						}	
						
						else
						{
							System.out.println("enter a valid college");
						}			
				
						}
			
					catch(ArrayIndexOutOfBoundsException eme)
						{
							System.out.println(eme);
						}

					}

		       			break;
				
				case 2:
					System.out.println("please enter your college:");
		       			String c1;
					c1=in.next();
					
					for(j=0;j<s.length;j++){
						
						if(s[j].compareTo(c1)==0){
							m1=1;
							break;
						}
						}
						
						if(m1==1)
						{
							q.know();
						}
						
						else
						{
							System.out.println("enter a valid college");
						}
					break;

				case 3:
					System.out.println(" !* !* !* !* !*  HELP  !*!* !* !* !* ");
					System.out.println("**FOLLOWING ARE THE STEPS FOR PROCESS**");
					System.out.println("STEP-1:These are the registered colleges (with college codes)");
					System.out.println("  -CHAITANYA BHARATHI INSTITUTE OF TECHNOLOGY      ( cbit  )");
					System.out.println("  -VNR VIGNAN JYOTHI                               ( vnr   )");
					System.out.println("  -SREE NIDHI INSTITUTE OF SCIENCE AND TECHNOLOGY  ( snist )");
					System.out.println("  -MAHATHMA GANDHI INSTITUTE OF TECHNOLOGY         ( mgit  )");
					System.out.println("  -OSMANIA UNIVERSITY                              ( ou    )");
					System.out.println("  -JAWAHARLAL NEHRU TECHNICAL UNIVERSITY           ( jntu  )");
					System.out.println("STEP-2:Select your choice to enter the events or know the events(only currently running events)");
					
					System.out.println("STEP-3:If the user belongs to one among the registered colleges then enter the respective college code when required");

					System.out.println("STEP-4:Continue the remaining process as required");

					break;
				case 4:
					System.exit(0);
					break;
				}
			
			System.out.println("type yes to continue");
			String y;
			String ys="yes";
			y=in.next();
			
			if(y.compareTo(ys)==0)
			{
				continue;
			}
			
			else
			{
				System.out.println("* * THANK-YOU FOR YOUR SUPPORT * *");
				System.out.println(" * * * * *  MEET AGAIN  * * * * * ");
				break;
			}
		}
	}
}

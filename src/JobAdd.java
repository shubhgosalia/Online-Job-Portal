import java.util.Scanner;
import java.util.Vector;

public class JobAdd
{
    String c_name,j_role,j_desc;
    int m_app,m_copy;
    float m_exp;

     JobAdd() {}

    public JobAdd(String comp_name,String job_role,String job_desc,float min_exp,int max_app,int max_copy)
    {
        c_name = comp_name;
        j_role = job_role;
        j_desc = job_desc;
        m_exp = min_exp;
        m_app = max_app;
        m_copy=max_copy;
    }

     static Vector<JobAdd>v= new Vector<JobAdd>();

     public void add()
    {
        int l=1;
        System.out.printf("Welcome to the Job Add Section\n");
          System.out.printf("-------------------------------\n");

           Scanner sc=new Scanner(System.in);
           int n;
           System.out.printf("No. of Job Posting(s) you would like to add:");
           n=sc.nextInt();
           System.out.printf("\n");
           for(int i=0;i<n;i++)
           {
               System.out.printf("%d.)\n",l);
               l++;
               System.out.printf("Company Name:");
                 String comp_name=sc.next();
                 comp_name=comp_name+sc.nextLine();
                 System.out.printf("Job Role:");
                 String job_role=sc.next();
                 job_role=job_role+sc.nextLine();
                 System.out.printf("Job Description:");
                 String job_desc=sc.next();
                 job_desc=job_desc+sc.nextLine();
                 System.out.printf("Minimum Experience Required(in yrs):");
                 float min_exp=sc.nextFloat();
                 System.out.printf("Maximum number of Applications Accepted:");
                 int max_app=sc.nextInt();
                 int max_copy=max_app;
                 JobAdd jad=new JobAdd(comp_name,job_role,job_desc,min_exp,max_app,max_copy);
                 v.add(jad);
                 System.out.printf("-----------------------------------------------\n");

           }
                  System.out.printf("Job Posting(s) successfully added!");
                  System.out.printf("\n\n");

    }
}

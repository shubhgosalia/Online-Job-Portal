import java.util.Enumeration;
import java.util.Vector;

public class JobDisplay extends JobApply
{
    public void display()
      {
          int k=1;
          System.out.printf("Welcome to the Jobs Display Section:\n");
           System.out.printf("-------------------------------------\n");
           if(v.isEmpty())
           {
               System.out.printf("Oops!,there's no Job Posting out there to display!");
               System.out.printf("\n\n");
           }
           else
           {
                Vector<JobAdd>vr=sort(v);
               Enumeration<JobAdd>e=vr.elements();
                while(e.hasMoreElements())
                {
                      JobAdd ja=e.nextElement();
                      System.out.printf("%d.)\n",k);
                      k++;
                    System.out.printf("Company Name:%s\n",ja.c_name);
                    System.out.printf("Job Role:%s\n",ja.j_role);
                    System.out.printf("Job Description:%s\n",ja.j_desc);
                    System.out.printf("Minimum Experience Required(in yrs):%.1f\n",ja.m_exp);
                    System.out.printf("Maximum number of Applications Accepted:%d\n",
                            ja.m_copy);
                    if(ja.m_copy==ja.m_app)
                    {
                        System.out.printf("No. of Application(s) Registered/Received till date:NONE");
                        System.out.printf("\n");
                        System.out.printf("---------------------------------------------------------\n");
                    }
                    else if(ja.m_app==0 || ja.m_app<0)
                    {
                        System.out.printf("No. of Application(s) Registered/Received " +
                                "till date:%d\n",ja.m_copy- ja.m_app);
                        System.out.printf("Note:No longer Accepting Applications,already filled!\n");
                        System.out.printf("-----------------------------------------------\n");

                    }
                    else if(ja.m_app>0)
                    {
                         System.out.printf("No. of Application(s) Registered/Received " +
                                 "till date:%d\n",ja.m_copy- ja.m_app);
                         System.out.printf("No. of Application(s) yet to be filled:%d\n", ja.m_app);
                         System.out.printf("-----------------------------------------------\n");
                    }

                }                System.out.printf("Job Posting(s) Displayed successfully!\n");
                                 System.out.printf("\n");

           }
      }
           public static Vector<JobAdd> sort(Vector<JobAdd>vt)
           {
                  for(int i=0;i<vt.size();i++)
                  {
                       for(int j=i+1;j<vt.size();j++)
                       {
                            if(vt.elementAt(i).m_exp>vt.elementAt(j).m_exp)
                            {
                                JobAdd jab1=vt.elementAt(i);
                                JobAdd jab2=vt.elementAt(j);
                                vt.setElementAt(jab1,j);
                                vt.setElementAt(jab2,i);
                            }
                       }
                  }
                               return vt;
           }

}




import java.util.Scanner;

public class JobSearch extends JobAdd
{
        public void search()
        {
                Scanner sc=new Scanner(System.in);
            if(v.isEmpty())
            {
                    System.out.printf("Oops!,there's no Job Posting to search!\n\n");
            }
             else
              {
                    int op = 0;

                    do {
                         System.out.printf("Welcome to the Job Search Section\n");
                         System.out.printf("----------------------------------\n");
                         System.out.printf(" 1.Search Jobs by Company\n 2.Search Jobs by Job Role\n " +
                                    "3.Search Jobs by Experience Req.\n 4.Exit\n\n");
                            System.out.printf("Enter your choice:");
                            op = sc.nextInt();
                            switch (op) {
                                    case 1: {
                                            company();
                                            break;
                                    }
                                    case 2: {
                                            job_role();
                                            break;
                                    }
                                    case 3: {
                                            job_exp();
                                            break;
                                    }
                                    case 4: {
                                            System.out.printf("Successfully Exited!\n\n");
                                            break;
                                    }
                                    default: {
                                            System.out.printf("Please select a valid choice!\n\n");
                                    }
                            }

                    } while (op != 4);
              }
        }

        static void company()
        {
                 int p=1;
                 Scanner sc=new Scanner(System.in);
                 int flag=1;
                 System.out.printf("Enter Company Name:");
                 String cname=sc.next();
                 cname=cname+sc.nextLine();
                 System.out.printf("\n");
                 for(int j=0;j<v.size();j++)
                 {
                           if(cname.equalsIgnoreCase(v.elementAt(j).c_name))
                           {

                                   JobAdd temp=v.get(j);
                                   System.out.printf("%d.)\n",p);
                                   p++;
                                   System.out.printf("Company Name:%s\n",temp.c_name);
                                   System.out.printf("Job Role:%s\n",temp.j_role);
                                   System.out.printf("Job Description:%s\n",temp.j_desc);
                                   System.out.printf("Minimum Experience Required(in yrs):%.1f\n",temp.m_exp);
                                   System.out.printf("Maximum number of Applications Accepted:%d\n",
                                           temp.m_copy);
                                   if(temp.m_app>0)
                                   {
                                          System.out.printf("Application Status:Open\n");
                                   }
                                   else
                                   {
                                          System.out.printf("Application Status:Filled\n");
                                   }
                                   System.out.printf("-----------------------------------------------\n");
                                   flag=0;
                           }
                 }
                      if(flag==1)
                      {
                                System.out.printf("Oops!,no such Job(s) found!");
                      }
                      else
                      {
                               System.out.printf("Your Job Search was successful!");
                      }
                System.out.printf("\n\n");
        }

        static void job_role()
        {
                int q=1;
                Scanner sc=new Scanner(System.in);
                int flag=1;
                System.out.printf("Enter Job Role:");
                String j_role=sc.next();
                j_role=j_role+sc.nextLine();
                for(int j=0;j<v.size();j++)
                {
                        if(j_role.equalsIgnoreCase(v.elementAt(j).j_role))
                        {
                                JobAdd temp=v.get(j);
                                System.out.printf("%d.)\n",q);
                                q++;
                                System.out.printf("Company Name:%s\n",temp.c_name);
                                System.out.printf("Job Role:%s\n",temp.j_role);
                                System.out.printf("Job Description:%s\n",
                                        temp.j_desc);
                                System.out.printf("Minimum Experience Required(in yrs):%.1f\n",temp.m_exp);
                                System.out.printf("Maximum number of Applications Accepted:%d\n",temp.m_copy);
                             if(temp.m_app>0)
                            {
                                System.out.printf("Application Status:Open\n");
                            }
                            else
                            {
                                System.out.printf("Application Status:Filled\n");
                            }

                            System.out.printf("-----------------------------------------------\n");
                                flag=0;
                        }
                }
                if(flag==1)
                {
                        System.out.printf("Oops!,no such Job(s) found!");
                }
                else
                {
                        System.out.printf("Your Job Search was successful!");
                }
                System.out.printf("\n\n");

        }

        static void job_exp()
        {
                int r=1;
                Scanner sc=new Scanner(System.in);
                int flag=1;
                System.out.printf("Enter Minimum Job Experience:");
                float j_exp=sc.nextFloat();
                System.out.printf("\n");
                for(int j=0;j<v.size();j++)
                {
                        if(j_exp==v.elementAt(j).m_exp)
                        {
                                JobAdd temp=v.get(j);
                                System.out.printf("%d.)\n",r);
                                r++;
                                System.out.printf("Company Name:%s\n",temp.c_name);
                                System.out.printf("Job Role:%s\n",temp.j_role);
                                System.out.printf("Job Description:%s\n",
                                        temp.j_desc);
                                System.out.printf("Minimum Experience Required(in yrs):%.1f\n",temp.m_exp);
                                System.out.printf("Maximum number of Applications Accepted:%d\n",temp.m_copy);
                            if(temp.m_app>0)
                            {
                                System.out.printf("Application Status:Open\n");
                            }
                            else
                            {
                                System.out.printf("Application Status:Filled\n");
                            }

                            System.out.printf("-----------------------------------------------\n");
                                flag=0;
                        }
                }
                if(flag==1)
                {
                        System.out.printf("Oops!,no such Job(s) found!");
                }
                else
                {
                        System.out.printf("Your Job Search was successful!");
                }
                System.out.printf("\n\n");

        }

}

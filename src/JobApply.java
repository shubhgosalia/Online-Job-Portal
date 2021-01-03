import java.util.Scanner;
import java.util.Vector;

class InvalidAgeException extends Exception
{
     InvalidAgeException(String s)
     {
         super(s);
     }
}

public class JobApply extends JobAdd
{
    int count=0;
    String app_name,app_qua;
    int app_age;
    float app_exp;

    JobApply() {}

    public JobApply(String name,String qua,int age,float exp_apply)
    {
        app_name=name;
        app_qua=qua;
        app_age=age;
        app_exp=exp_apply;

    }
    static Vector<JobApply>jr=new Vector<JobApply>();


    public void user_details()
    {
        Scanner sc =new Scanner(System.in);
        System.out.printf("Welcome to the Job Apply Section\n");
        System.out.printf("---------------------------------\n");
        System.out.printf("No. of Applicant(s) who want to apply:");
        int app_no=sc.nextInt();
        System.out.printf("\n");
        if(v.isEmpty())
        {
            System.out.printf("Oops!,there's no Job Posting out there to apply!");
            System.out.printf("\n\n");
        }
        else {
            for (int k = 0; k < app_no; k++) {
                System.out.printf("Applicant %d Details:\n", k + 1);
                System.out.printf("-----------------------\n\n");
                System.out.printf("User Details\n");
                System.out.printf("--------------\n");
                System.out.printf("Applicant Name:");
                String name = sc.next();
                name=name+sc.nextLine();
                System.out.printf("Applicant Qualification(Bachelors,Masters or PhD):");
                String qua = sc.next();
                qua=qua+sc.nextLine();
                try
                {
                    System.out.printf("Applicant Age(min 22):");
                    int age = sc.nextInt();
                    if(age<22)
                    {
                        throw new InvalidAgeException("Oops!,you are not eligible to apply!");
                    }
                    else {
                        System.out.printf("\n");
                        System.out.printf("Job Application Details:\n");
                        System.out.printf("-------------------------\n");
                        System.out.printf("Company to apply for:");
                        String comp_apply = sc.next();
                        comp_apply = comp_apply + sc.nextLine();
                        int ct = 0, c = 0;
                        int arr[] = new int[50];
                        for (int i = 0; i < v.size(); i++) {
                            if (comp_apply.equalsIgnoreCase(v.elementAt(i).c_name)) {
                                arr[c] = i;
                                c++;
                                ct++;
                            }

                        }
                        if (ct >= 1) {
                            int bt = 0, d = 0;
                            int brr[] = new int[50];
                            System.out.printf("Job Role to apply for:");
                            String role_apply = sc.next();
                            role_apply = role_apply + sc.nextLine();
                            for (int a = 0; a < c; a++) {
                                if (role_apply.equalsIgnoreCase(v.elementAt(arr[a]).j_role)) {
                                    brr[d] = arr[a];
                                    d++;
                                    bt++;
                                }
                            }

                            if (bt >= 1) {
                                int e = 0, dt = 0;
                                int crr[] = new int[50];
                                System.out.printf("Your Job Experience(in yrs):");
                                float exp_apply = sc.nextFloat();
                                sc.nextLine();
                                for (int j = 0; j < d; j++) {
                                    if (exp_apply >= v.elementAt(brr[j]).m_exp) {
                                        crr[e] = brr[j];
                                        e++;
                                        dt++;
                                    }
                                }
                                if (dt >= 1) {
                                    int et = 0, t = 0;
                                    for (int p = 0; p < e; p++) {
                                        if (v.elementAt(crr[p]).m_app > 0) {
                                            v.elementAt(crr[p]).m_app = v.elementAt(crr[p]).m_app - 1;
                                            et++;
                                            t++;
                                        }

                                    }
                                    if (et >= 1) {
                                        System.out.printf("Congratulations,you have successfully " +
                                                "applied for " +
                                                "%d open Job Posting(s) that matched your search and " +
                                                "eligibility criteria!", t);
                                        JobApply ja = new JobApply(name, qua, age, exp_apply);
                                        jr.add(ja);
                                        count++;
                                        JobRecord.count(count);
                                    } else {
                                        System.out.printf("Oops!,the job(s) you're " +
                                                "looking for has already expired!Do check out later!");

                                    }
                                } else {
                                    System.out.printf("Oops!,you aren't eligible to apply for the " +
                                            "given company" +
                                            " and job role!Do check out later");

                                }
                            } else {
                                System.out.printf("Oops!,no such Job Role found for this company!" +
                                        " Do check out later!" +
                                        "");

                            }
                        } else {
                            System.out.printf("Oops!,no Job Posting for this company!Do check out later!");

                        }
                    }
                }
                   catch(InvalidAgeException m)
                {
                           m.printStackTrace();
                }

                System.out.printf("\n\n");

            }
        }
    }
}

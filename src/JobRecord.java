public class JobRecord extends JobApply
{
     static int app_count;
     static void count(int c)
     {
           app_count=c;
     }
      public void user_details()
      {
            System.out.printf("Welcome to Job Record Analytics\n");
            System.out.printf("---------------------------------\n");
            if(jr.isEmpty())
            {
                System.out.printf("Oops!,there are no Job Application(s) to provide " +
                        "Applicant Analysis!\n\n");
            }
            else
            {
                System.out.printf("Qualification Analytics:\n");
                System.out.printf("-------------------------\n");
                String str1 = "Bachelors";
                int q = 0;
                for (int i = 0; i < app_count; i++) {
                    if (str1.equalsIgnoreCase(jr.elementAt(i).app_qua)) {
                        q++;
                    }
                }

                float qua_bachelors = ((float) q / app_count) * 100;
                System.out.printf("Percentage of Applicants with Bachelor's " +
                        "Qualification:%.2f", qua_bachelors);
                System.out.printf("%%");
                System.out.printf("\n");
                String str2 = "Masters";
                int m = 0;
                for (int i = 0; i < app_count; i++) {
                    if (str2.equalsIgnoreCase(jr.elementAt(i).app_qua)) {
                        m++;
                    }
                }
                float qua_masters = ((float) m / app_count) * 100;
                System.out.printf("Percentage of Applicants with Master's Qualification:%.2f", qua_masters);
                System.out.printf("%%");
                System.out.printf("\n");
                String str3 = "PhD";
                int d = 0;
                for (int i = 0; i < app_count; i++) {
                    if (str3.equalsIgnoreCase(jr.elementAt(i).app_qua)) {
                        d++;
                    }
                }
                float qua_phd = ((float) d / app_count) * 100;
                System.out.printf("Percentage of Applicants with PhD Qualification:%.2f", qua_phd);
                System.out.printf("%%");
                System.out.printf("\n\n");
                System.out.printf("Age Group Analytics:\n");
                System.out.printf("-------------------------\n");
                int s = 0, t = 0, u = 0, v = 0;
                for (int j = 0; j < app_count; j++) {
                    if (jr.elementAt(j).app_age >= 22 && jr.elementAt(j).app_age < 25) {
                        s++;
                    } else if (jr.elementAt(j).app_age >= 25 && jr.elementAt(j).app_age < 30) {
                        t++;
                    } else if (jr.elementAt(j).app_age >= 30 && jr.elementAt(j).app_age < 40) {
                        u++;
                    } else {
                        v++;
                    }
                }
                float age_set1 = ((float) s / app_count) * 100;
                float age_set2 = ((float) t / app_count) * 100;
                float age_set3 = ((float) u / app_count) * 100;
                float age_set4 = ((float) v / app_count) * 100;

                System.out.printf("Percentage of Applicants between 22-25 years of age:%.2f%%\n", age_set1);
                System.out.printf("Percentage of Applicants between 25-30 years of age:%.2f%%\n", age_set2);
                System.out.printf("Percentage of Applicants between 30-40 years of age:%.2f%%\n", age_set3);
                System.out.printf("Percentage of Applicants more than 40 years of age:%.2f%%\n", age_set4);
                System.out.printf("\n");
                System.out.printf("Job Experience Analytics:\n");
                System.out.printf("-------------------------\n");
                int a = 0, b = 0, c = 0, f = 0;
                for (int i = 0; i < app_count; i++) {
                    if (jr.elementAt(i).app_exp == 0) {
                        a++;
                    } else if (jr.elementAt(i).app_exp >= 1 && jr.elementAt(i).app_exp <= 2) {
                        b++;
                    } else if (jr.elementAt(i).app_exp >= 3 && jr.elementAt(i).app_exp <= 6) {
                        c++;
                    } else {
                        f++;
                    }

                }
                float exp_cat1 = ((float) a / app_count) * 100;
                float exp_cat2 = ((float) b / app_count) * 100;
                float exp_cat3 = ((float) c / app_count) * 100;
                float exp_cat4 = ((float) f / app_count) * 100;

                System.out.printf("Percentage of Fresher Applicants(no exp):%.2f%%\n", exp_cat1);
                System.out.printf("Percentage of Entry Level Applicants(1-2 yrs of exp):%.2f%%\n",
                        exp_cat2);
                System.out.printf("Percentage of Mid Level Applicants(3-6 yrs of exp):%.2f%%\n", exp_cat3);
                System.out.printf("Percentage of Senior Level Applicants(6+ yrs of exp):%.2f%%\n", exp_cat4);
                System.out.printf("Successful Analysis!\n\n");
            }
      }
              public static void main(String args[])
              {
                      JobRecord jre=new JobRecord();
                      jre.user_details();

              }
}




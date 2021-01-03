import java.util.Scanner;

public class JobUpdate extends JobAdd {
    public void update() {
        Scanner sc = new Scanner(System.in);
        if (v.isEmpty()) {
            System.out.printf("Oops!,there's no Job Posting to update!\n\n");
        } else {
            int opt = 0;
            do {
                System.out.printf("Welcome to the Job Update Section\n");
                System.out.printf("----------------------------------\n");
                System.out.printf("Note:In case the Job Detail to be updated is the same in two " +
                        "or more postings with the\npreviously read entities also being same," +
                        "then the older posting would be considered!" +
                        " \n\n");
                System.out.printf(" 1.Update Job Role\n 2.Update Job Description\n 3.Update Min. Job Experience\n" +
                        " 4.Update Max. no. Job Applications\n 5.Exit\n\n");
                System.out.printf("What would you like to update?\n");
                System.out.printf("Enter your choice:");
                opt = sc.nextInt();
                switch (opt) {
                    case 1: {
                        update_role();
                        break;
                    }
                    case 2: {
                        update_desc();
                        break;
                    }
                    case 3: {
                        update_exp();
                        break;
                    }
                    case 4: {
                        update_apply();
                        break;
                    }
                    case 5: {
                        System.out.printf("Successfully Exited!\n\n");
                        break;
                    }
                    default: {
                        System.out.printf("Please select a valid choice!\n\n");
                    }
                }
            } while (opt != 5);
        }


    }

    static void update_role() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Company Name whose Job Role you would like to update:");
        String co_name = sc.next();
        co_name = co_name + sc.nextLine();
        int up[] = new int[50];
        int p = 0, c = 0;
        for (int i = 0; i < v.size(); i++) {
            if (co_name.equalsIgnoreCase(v.elementAt(i).c_name)) {
                up[c] = i;
                c++;
                p++;
            }

        }
        if (p >= 1) {
            System.out.printf("Enter old Job Role of that company:");
            String old_role = sc.next();
            old_role = old_role + sc.nextLine();
            int q = 0;
            loop:
            for (int k = 0; k < c; k++) {
                if (old_role.equalsIgnoreCase(v.elementAt(up[k]).j_role)) {
                    System.out.printf("Enter new Job Role:");
                    String new_role = sc.next();
                    new_role = new_role + sc.nextLine();
                    v.elementAt(up[k]).j_role = new_role;
                    q++;
                    break loop;
                }
            }
            if (q == 0) {
                System.out.printf("Oops!,no such Job Role found!" +
                        "Do check out once posted!");
            } else {
                System.out.printf("Job Role updated successfully!");
            }


        } else {
            System.out.printf("Oops!,no Job Posting for this company!Do check out once " +
                    "posted!");
        }

        System.out.printf("\n\n");
    }

    static void update_desc() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Company Name whose Job Description you would like to update:");
        String co_name = sc.next();
        co_name = co_name + sc.nextLine();
        int up[] = new int[50];
        int p = 0, c = 0;
        for (int i = 0; i < v.size(); i++) {
            if (co_name.equalsIgnoreCase(v.elementAt(i).c_name)) {
                up[c] = i;
                c++;
                p++;
            }

        }
        if (p >= 1) {
            System.out.printf("Enter Job Role of that company:");
            String job_role = sc.next();
            job_role = job_role + sc.nextLine();
            int bp[] = new int[50];
            int q = 0, d = 0;
            for (int k = 0; k < c; k++) {
                if (job_role.equalsIgnoreCase(v.elementAt(up[k]).j_role)) {
                    bp[d] = up[k];
                    d++;
                    q++;
                }
            }
            if (q >= 1) {
                System.out.printf("Enter old Job Description of that company:");
                String old_desc = sc.next();
                old_desc = old_desc + sc.nextLine();
                int s = 0;
                loop:
                for (int k = 0; k < d; k++) {
                    if (old_desc.equalsIgnoreCase(v.elementAt(bp[k]).j_desc)) {
                        System.out.printf("Enter new Job Description:");
                        String new_desc = sc.next();
                        new_desc = new_desc + sc.nextLine();
                        v.elementAt(bp[k]).j_desc = new_desc;
                        s++;
                        break loop;
                    }
                }
                if (s == 0) {
                    System.out.printf("Oops!,no such Job Description found!" +
                            "Do check out once posted!");
                } else {
                    System.out.printf("Job Description updated successfully!");
                }

            } else {
                System.out.printf("Oops!,no such Job Role found!!" +
                        "Do check out once posted!");
            }

        } else {
            System.out.printf("Oops!,no Job Posting for this company!Do check out once " +
                    "posted!");
        }

        System.out.printf("\n\n");

    }

    static void update_exp() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Company Name whose Min. Job Experience you would like to update:");
        String co_name = sc.next();
        co_name = co_name + sc.nextLine();
        int up[] = new int[50];
        int p = 0, c = 0;
        for (int i = 0; i < v.size(); i++) {
            if (co_name.equalsIgnoreCase(v.elementAt(i).c_name)) {
                up[c] = i;
                c++;
                p++;
            }

        }
        if (p >= 1) {
            System.out.printf("Enter Job Role of that company:");
            String job_role = sc.next();
            job_role = job_role + sc.nextLine();
            int bp[] = new int[50];
            int q = 0, d = 0;
            for (int k = 0; k < c; k++) {
                if (job_role.equalsIgnoreCase(v.elementAt(up[k]).j_role)) {
                    bp[d] = up[k];
                    d++;
                    q++;
                }
            }
            if (q >= 1) {
                System.out.printf("Enter Job Description of that company:");
                String job_desc = sc.next();
                job_desc = job_desc + sc.nextLine();
                int ap[] = new int[50];
                int e = 0, t = 0;
                for (int k = 0; k < d; k++) {
                    if (job_desc.equalsIgnoreCase(v.elementAt(bp[k]).j_desc)) {
                        ap[e] = bp[k];
                        e++;
                        t++;
                    }
                }

                if (t >= 1) {
                    System.out.printf("Enter old Min. Job Experience of that company:");
                    float old_exp = sc.nextFloat();
                    int m = 0;
                    loop:
                    for (int k = 0; k < e; k++) {
                        if (old_exp == v.elementAt(ap[k]).m_exp) {
                            System.out.printf("Enter new Min. Job Experience:");
                            float new_exp = sc.nextFloat();
                            v.elementAt(ap[k]).m_exp = new_exp;
                            m++;
                            break loop;
                        }
                    }
                    if (m == 0) {
                        System.out.printf("Oops!,no such Min. Job Experience found!" +
                                "Do check out once posted!");

                    } else {
                        System.out.printf("Min. Job Experience updated successfully!");

                    }

                } else {
                    System.out.printf("Oops!,no such Job Description found!" +
                            "Do check out once posted!");
                }

            } else {
                System.out.printf("Oops!,no such Job Role found!" +
                        "Do check out once posted!");
            }

        } else {
            System.out.printf("Oops!,no Job Posting for this company!Do check out once " +
                    "posted!");
        }

        System.out.printf("\n\n");


    }

      static void update_apply()
      {
          Scanner sc = new Scanner(System.in);
          System.out.printf("Enter Company Name whose Max. no. of Job Applications you would like to update:");
          String co_name = sc.next();
          co_name = co_name + sc.nextLine();
          int up[] = new int[50];
          int p = 0, c = 0;
          for (int i = 0; i < v.size(); i++) {
              if (co_name.equalsIgnoreCase(v.elementAt(i).c_name)) {
                  up[c] = i;
                  c++;
                  p++;
              }

          }
          if (p >= 1) {
              System.out.printf("Enter Job Role of that company:");
              String job_role = sc.next();
              job_role = job_role + sc.nextLine();
              int bp[] = new int[50];
              int q = 0, d = 0;
              for (int k = 0; k < c; k++) {
                  if (job_role.equalsIgnoreCase(v.elementAt(up[k]).j_role)) {
                      bp[d] = up[k];
                      d++;
                      q++;
                  }
              }
              if (q >= 1) {
                  System.out.printf("Enter Job Description of that company:");
                  String job_desc = sc.next();
                  job_desc = job_desc + sc.nextLine();
                  int ap[] = new int[50];
                  int e = 0, t = 0;
                  for (int k = 0; k < d; k++) {
                      if (job_desc.equalsIgnoreCase(v.elementAt(bp[k]).j_desc)) {
                          ap[e] = bp[k];
                          e++;
                          t++;
                      }
                  }

                  if (t >= 1) {
                      System.out.printf("Enter Min. Job Experience of that company:");
                      float job_exp = sc.nextFloat();
                      int mp[]=new int[50];
                      int b=0,r=0;
                      for (int k = 0; k < e; k++) {
                          if (job_exp == v.elementAt(ap[k]).m_exp)
                          {
                                  mp[b]=ap[k];
                                  b++;
                                  r++;
                          }
                      }
                         if(r>=1)
                         {
                             System.out.printf("Enter old Max no. of Job Applications of that company:");
                             int old_app = sc.nextInt();
                             int m = 0;
                             loop:
                             for (int k = 0; k < b; k++) {
                                 if (old_app == v.elementAt(mp[k]).m_copy) {
                                      System.out.printf("Enter new Max no. of Job Applications:");
                                     int new_app = sc.nextInt();
                                     v.elementAt(mp[k]).m_app=v.elementAt(mp[k]).m_app+(new_app-v.elementAt(mp[k]).m_copy);
                                     v.elementAt(mp[k]).m_copy = new_app;
                                     m++;
                                     break loop;
                                 }
                             }
                                  if(m==0)
                                  {
                                      System.out.printf("Oops!,no such Max no. Job Applications found!" +
                                              "Do check out once posted!");

                                  }
                                  else
                                  {
                                      System.out.printf("Max. no. of Job Applications updated successfully!");

                                  }

                         }
                         else
                         {
                             System.out.printf("Oops!,no such Min. Job Experience found!" +
                                     "Do check out once posted!");
                         }

                  } else {
                      System.out.printf("Oops!,no such Job Description found!" +
                              "Do check out once posted!");
                  }

              } else {
                  System.out.printf("Oops!,no such Job Role found!" +
                          "Do check out once posted!");
              }

          } else {
              System.out.printf("Oops!,no Job Posting for this company!Do check out once " +
                      "posted!");
          }

          System.out.printf("\n\n");


      }
}





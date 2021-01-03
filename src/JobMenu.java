import java.util.Scanner;

public class JobMenu {
     public static void main(String args[])
     {
         int choice;
         Scanner sc=new Scanner(System.in);
         JobAdd ja=new JobAdd();
         JobApply jap=new JobApply();
         JobDisplay jd=new JobDisplay();
         JobRecord jr=new JobRecord();
         JobSearch js=new JobSearch();
         JobUpdate ju=new JobUpdate();
         do
         {
             System.out.printf("Welcome to the Online Job Portal\n");
             System.out.printf("----------------------------------\n");
             System.out.printf(" 1.Add a Job\n 2.Apply for a Job\n 3.Search for a Job\n 4.Display All Jobs\n" +
                     " 5.Update a Job\n " + "6.Job Record Analytics\n 7.Exit\n\n");
             System.out.printf("Enter your choice:");
             choice=sc.nextInt();
                switch(choice)
                {
                    case 1:
                    {
                        ja.add();
                        break;
                    }
                    case 2:
                    {
                        jap.user_details();

                        break;
                    }
                    case 3:
                    {
                         js.search();
                         break;
                    }
                    case 4:
                    {
                        jd.display();
                        break;
                    }
                    case 5:
                    {
                        ju.update();
                        break;
                    }
                    case 6:
                    {
                        JobRecord.main(null);
                        break;
                    }
                    case 7:
                    {
                         System.out.printf("Successfully Exited!");
                         break;
                    }
                    default:
                    {
                         System.out.printf("Please select a valid choice!\n\n");
                    }
                }

         }while(choice!=7);

     }
}




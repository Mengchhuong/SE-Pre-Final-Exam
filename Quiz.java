import java.util.Scanner;
import java.util.ArrayList;
import java.util.*; 

public class Quiz {

    Scanner sc = new Scanner(System.in);
    ArrayList<String> quiz = new ArrayList<String>();
    
    int Id=0;

    public void displayMenu(){
        System.out.println("1. Add more question");
        System.out.println("2. Update Question");
        System.out.println("3. Delete questions and answers");
        System.out.println("4. Exit the program");
    }
    
    public void addQuestion(){
        System.out.print("Add question here: ");
        String question = sc.nextLine();
        Id++;
        quiz.add(question);
        System.out.print("how many answers do you want to add for this question: ");
        int maxAns= Integer.parseInt(sc.nextLine());
        if(maxAns>4){
            System.out.println("\nPlease input answer less than 4.");
        }
        else if(maxAns<2){
            System.out.println("\nPlease input answer more than 2");
        }
        else{
            for(int i=1 ;i<=maxAns;i++){
                System.out.print("Answer "+i+": " );
                String answer = sc.nextLine();
                quiz.add(answer);
            }
        }
        System.out.print("Pls, input a correct answer:");
        String correctAns = sc.nextLine();
    }

    public void updateQuestion(){
        System.out.print("Update question by input index here: ");
        int index = Integer.parseInt(sc.nextLine());

        System.out.print("Pls, input new question: ");
        String newQuestion = sc.nextLine();
        quiz.set(index,newQuestion);
    }

    public void deleteQesAns(){
        System.out.print("Input index of question or answer that u want to delete: ");
        int deleter = Integer.parseInt(sc.nextLine());
        quiz.remove(deleter);
    }

    public void listarray(){
        for(String qu:quiz){
            System.out.println(Id+ " " +qu);
        }
    }
}

class renderProgram{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Quiz q = new Quiz();

        while(true){
            q.displayMenu();
            System.out.print("Enter your choice: ");
            Integer choice = Integer.parseInt(sc.nextLine());

            if(choice==1){
                q.addQuestion();
            }
            else if(choice==2){
                q.updateQuestion();
            }
            else if(choice==3){
                q.deleteQesAns();
            }
            else if (choice==4){
                break;
            }
            else{
                q.listarray();
            }
        }
    }
}

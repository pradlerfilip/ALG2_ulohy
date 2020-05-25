/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestApp;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author filip
 */
public class Quiz implements QuizInterface {
        Scanner sc = new Scanner(System.in);   
        
        String name;
        ArrayList<Question> questions = new ArrayList<Question>();
        
        
        
        
        public Quiz (String name)
        {
            this.name=name;
        }
        
        
        public Quiz (String name, ArrayList<Question> questions)
        {
            this.name=name;
            this.questions=questions;
        }
        
        
        
        public int getNOfQuestions(){
            return questions.size();
        }
        
        
        public void CreateQuiz(String name)
        {
            Quiz quiz = new Quiz(name);
            File quizFile = new File("C:\\Users\\MyName\\"+name+".txt");
        }
        
        
        public void AddQuestion()
        {
            System.out.println("Zadej nazev otazky");
            String task=sc.next();
            System.out.println("Zadej obtiznost");
            String difficulty=sc.next();
            System.out.println("Zadej pocet odpovedi");
            int nOfQuestions = sc.nextInt();
            ArrayList<String> answers = new ArrayList<String>();
            for(int i=0;i<nOfQuestions;i++)
            {
                System.out.println("Zadej odpoved");
                String answer=sc.next();
                answers.add(answer);
            }
            System.out.println("Zadej za kolik bodu bude spravna odpoved");
            int nOfPoints=sc.nextInt();
            Question question = new Question(task,difficulty,answers,nOfPoints); 
            questions.add(question);
        }
        
       public void ImportQuiz(){
         String[] pathnames;
         File f = new File("C:/Users/filip/Documents/NetBeansProjects/Pradler_ALG2_sem_Obchod/src/Data");
         pathnames = f.list();
         for(String pathname : pathnames){
             System.out.println(pathname);
         }
         System.out.println("Zadej nazev kvizu");
           String nameOfFile=sc.next();
        
           
       }
       
       public void RunQuiz()
       {
        
       }
}

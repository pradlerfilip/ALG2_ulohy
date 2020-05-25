/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestApp;

import java.util.ArrayList;

/**
 *
 * @author filip
 */
public class Question {
    
        private String task;
        private String difficulty;
        private ArrayList<String> answers = new ArrayList<String>();
        private int nOfPoints;
        
        
        
        public Question(String task,String difficulty, ArrayList<String> answers, int nOfPoints)
        {
            this.task=task;
            this.difficulty=difficulty;
            this.answers=answers;
            this.nOfPoints=nOfPoints;
        }
    
}

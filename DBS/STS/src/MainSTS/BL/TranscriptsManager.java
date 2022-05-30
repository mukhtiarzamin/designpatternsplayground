/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainSTS.BL;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mukhtiar
 */
public class TranscriptsManager {
    private final String TRANSCRIPT_FILE_NAME = "Transcripts.txt";
    public ArrayList<Transcript> getTranscripts() {
        ArrayList<Transcript> transcriptList = new ArrayList<Transcript>();
        Transcript objTranscript;
        String[] lineParts;
        try {
                File myObj = new File(TRANSCRIPT_FILE_NAME);
                if(myObj.exists()){
                    Scanner myReader = new Scanner(myObj);
                    while (myReader.hasNextLine()) {
                      String lineData = myReader.nextLine();
                      lineParts = lineData.split("!");
                      objTranscript = new Transcript();
                      objTranscript.Course = lineParts[0];
                      objTranscript.GPA = Float.parseFloat(lineParts[1]);
                      objTranscript.StudentId = lineParts[2];
                      transcriptList.add(objTranscript);
                    }
                    myReader.close();
                }
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
              }
        return transcriptList;
    }

    public String AddTranscriptInFile(String course, String gpa, String studentId) {
        try {
                File myObj;
                myObj = new File(TRANSCRIPT_FILE_NAME);
                StudentsManager.CreateFileIfNotExist(myObj);

                FileWriter myWriter = new FileWriter(TRANSCRIPT_FILE_NAME, true);
                myWriter.append(course+"!"+gpa+"!"+studentId+"\r\n");
                myWriter.close();
                return null;
            } catch (IOException e) {
                return e.getMessage();
        }
    }

    public int getNumberOfStudentsFor(String course) {
        int numberOfStudents = 0;
        String[] lineParts;
        try {
                File myObj = new File(TRANSCRIPT_FILE_NAME);
                if(myObj.exists()){
                    Scanner myReader = new Scanner(myObj);
                    while (myReader.hasNextLine()) {
                      String lineData = myReader.nextLine();
                      lineParts = lineData.split("!");
                      if(course.equals(lineParts[0]))
                          numberOfStudents++;                      
                    }
                    myReader.close();
                }
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
              }
        return numberOfStudents;
    }
    
    public float getAvgGPAFor(String course) {
        int numberOfStudents = 0;
        float gpaSum=0;
        String[] lineParts;
        try {
                File myObj = new File(TRANSCRIPT_FILE_NAME);
                if(myObj.exists()){
                    Scanner myReader = new Scanner(myObj);
                    while (myReader.hasNextLine()) {
                      String lineData = myReader.nextLine();
                      lineParts = lineData.split("!");
                      if(course.equals(lineParts[0]))
                          numberOfStudents++; 
                          gpaSum += Float.parseFloat(lineParts[1]);
                    }
                    myReader.close();
                }
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
              }
        return numberOfStudents > 0 ? gpaSum/numberOfStudents : 0;
    }
}

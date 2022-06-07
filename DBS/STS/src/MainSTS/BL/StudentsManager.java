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
public class StudentsManager {

    private final String STUDENTS_FILE_NAME = "Students.txt";
    public String AddStudentInFile(String id, String Name) 
    {
        try {
                File myObj;
                myObj = new File(STUDENTS_FILE_NAME);
                this.CreateFileIfNotExist(myObj);

                FileWriter myWriter = new FileWriter(STUDENTS_FILE_NAME, true);
                myWriter.append(id+"!"+Name+"\r\n");
                myWriter.close();
                return null;
            } catch (IOException e) {
                return e.getMessage();
        }
    }


    public static void CreateFileIfNotExist(File myObj) {
        try {
      if (!myObj.exists()) {
        myObj.createNewFile();
      } 
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }

    public ArrayList<Student> getStudents() 
    {
        ArrayList<Student> studentList = new ArrayList<Student>();
        Student objStudent;
        String[] lineParts;
        try {
                File myObj = new File(STUDENTS_FILE_NAME);
                if(myObj.exists()){
                    Scanner myReader = new Scanner(myObj);
                    while (myReader.hasNextLine()) {
                      String lineData = myReader.nextLine();
                      lineParts = lineData.split("!");
                      objStudent = new Student();
                      objStudent.Id = lineParts[0];
                      objStudent.Name = lineParts[1];
                      studentList.add(objStudent);
                    }
                    myReader.close();
                }
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
              }
        return studentList;
    }    

    public ArrayList<Student> deleteStudent(String studentId) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        Student objStudent;
        String[] lineParts;
        try {
                File myObj = new File(STUDENTS_FILE_NAME);
                if(myObj.exists()){
                    Scanner myReader = new Scanner(myObj);
                    while (myReader.hasNextLine()) {
                      String lineData = myReader.nextLine();
                      lineParts = lineData.split("!");
                      objStudent = new Student();
                      objStudent.Id = lineParts[0];
                      objStudent.Name = lineParts[1];
                      if(!studentId.equals(lineParts[0]))
                      {
                        studentList.add(objStudent);
                      }
                    }
                    myReader.close();
                }
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
              }
        WriteToFileAgain(studentList);
        return studentList;
        
    }

    private void WriteToFileAgain(ArrayList<Student> studentList) {
        try {
                File myObj;
                myObj = new File(STUDENTS_FILE_NAME);
                
                FileWriter myWriter = new FileWriter(STUDENTS_FILE_NAME);//Creating in new Mode
                for(Student std : studentList){
                myWriter.append(std.Id+"!"+std.Name+"\r\n");
                }                
                myWriter.close();
            } catch (IOException e) {                
        }
    }

    
}

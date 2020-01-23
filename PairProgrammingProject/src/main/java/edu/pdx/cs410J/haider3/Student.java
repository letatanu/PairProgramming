package edu.pdx.cs410J.haider3;

import edu.pdx.cs410J.lang.Human;

import java.util.ArrayList;
                                                                                    
/**                                                                                 
 * This class is represents a <code>Student</code>.                                 
 */                                                                                 
public class Student extends Human {

  String studentName;
  ArrayList<String> studentClasses = new ArrayList<String>();

  private final double gpa;
  private final String gender;
  /**                                                                               
   * Creates a new <code>Student</code>                                             
   *                                                                                
   * @param name                                                                    
   *        The PairProgrammingProject's name                                                      
   * @param classes                                                                 
   *        The names of the classes the PairProgrammingProject is taking.  A PairProgrammingProject              
   *        may take zero or more classes.                                          
   * @param gpa                                                                     
   *        The PairProgrammingProject's grade point average                                       
   * @param gender                                                                  
   *        The PairProgrammingProject's gender ("male" or "female", or "other", case insensitive)
   */
  
  public Student(String name, ArrayList<String> classes, double gpa, String gender) throws IllegalArgumentException{
    super(name);
    studentName = name;
    this.studentClasses = classes;
    if (gpa < 0 || gpa > 4)
    {
      throw new IllegalArgumentException(" 0 <= GPA <= 4 ");
      exit(1);
    }
    gpa = gpa;
    gender = gender;
  }

  /**                                                                               
   * All students say "This class is too much work"
   */
  @Override
  public String says() {
    return "This class is too much work";
  }
                                                                                    
  /**                                                                               
   * Returns a <code>String</code> that describes this                              
   * <code>Student</code>.                                                          
   */                                                                               
  public String toString() {
    String courses = "";
    for(String clss: this.studentClasses) {
      courses  += clss + "; ";
    }
    String description = "Student: "+ studentName + " with gpa " + gpa +
                             " gender "+ gender + "courses: \n" + courses;
    return description;
  }

  /**
   * Main program that parses the command line, creates a
   * <code>Student</code>, and prints a description of the PairProgrammingProject to
   * standard out by invoking its <code>toString</code> method.
   */
  public static void main(String[] args) {
    if (args.length < 3) {
      System.err.println("The number of arguments need to be at least 3");
      System.exit(1);
    }
    String name = args[0];
    double gpa = Double.parseDouble(args[1]);
    String gender = args[2];
    String classes = args[3];
    List<String> al = new ArrayList<String>();
    al = Arrays.asList(classes.split(" "));
  }
}
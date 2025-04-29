package com.cloudframe.app.cfsort04.file.records;

/**
*  The class InputStudent is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/


import com.cloudframe.app.cfsort04.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class InputStudent extends InputStudentSerialized {
   

						private char[] studentNameI = Field.fillLowValue(25);
	
	/**
	* Constructor for InputStudent
	**/
    public InputStudent() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of studentNameI
	 *	@return studentNameI
	 */
   public char[] getStudentNameI() throws CFException{
     if (isStudentNameIModified()) { 
        studentNameI = refreshStudentNameI();
     }
   		return studentNameI;
   }

  
	/**
	*  set variable studentNameI
	*  Corresponding COBOL Variable is STUDENT-NAME-I
	*  @param value
	**/
   public void setStudentNameI(char[] value) {
      studentNameI = checkStudentNameIConstraints(value);
      serializeStudentNameI(studentNameI);
   } 

     /**
	 * 	Update StudentNameI 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStudentNameI(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStudentNameI,studentNameI.length);
   	
   }
   
   public void setStudentNameI(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStudentNameI,studentNameI.length);
   	
   }
   
     /**
	 * 	Update StudentNameI 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStudentNameI(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStudentNameI+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StudentNameI with another Field
	 *	@param value
	 */
   public void setStudentNameI(Field source) {
       replace(source,0,source.length(),beginStudentNameI,STUDENT_NAME_I_LEN);
   	
   }  
   
     /**
	 * 	Update StudentNameI 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStudentNameI(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStudentNameI,STUDENT_NAME_I_LEN);
   	
   }
   
     /**
	 * 	Update StudentNameI 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStudentNameI(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStudentNameI+targetIndex,targetLen);
    
   }

	
	
	

		public static int getInputStudentFieldLength() {
			return INPUT_STUDENT_LENGTH;
		}

}
  

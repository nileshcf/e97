package com.cloudframe.app.cfsort06.file.records;

/**
*  The class OutputStudent is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:51. using version 5.0.0.256
**/


import com.cloudframe.app.cfsort06.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class OutputStudent extends OutputStudentSerialized {
   

						private char[] studentNameO = Field.fillLowValue(25);
	
	/**
	* Constructor for OutputStudent
	**/
    public OutputStudent() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of studentNameO
	 *	@return studentNameO
	 */
   public char[] getStudentNameO() throws CFException{
     if (isStudentNameOModified()) { 
        studentNameO = refreshStudentNameO();
     }
   		return studentNameO;
   }

  
	/**
	*  set variable studentNameO
	*  Corresponding COBOL Variable is STUDENT-NAME-O
	*  @param value
	**/
   public void setStudentNameO(char[] value) {
      studentNameO = checkStudentNameOConstraints(value);
      serializeStudentNameO(studentNameO);
   } 

     /**
	 * 	Update StudentNameO 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStudentNameO(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStudentNameO,studentNameO.length);
   	
   }
   
   public void setStudentNameO(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStudentNameO,studentNameO.length);
   	
   }
   
     /**
	 * 	Update StudentNameO 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStudentNameO(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStudentNameO+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StudentNameO with another Field
	 *	@param value
	 */
   public void setStudentNameO(Field source) {
       replace(source,0,source.length(),beginStudentNameO,STUDENT_NAME_O_LEN);
   	
   }  
   
     /**
	 * 	Update StudentNameO 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStudentNameO(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStudentNameO,STUDENT_NAME_O_LEN);
   	
   }
   
     /**
	 * 	Update StudentNameO 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStudentNameO(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStudentNameO+targetIndex,targetLen);
    
   }

	
	
	

		public static int getOutputStudentFieldLength() {
			return OUTPUT_STUDENT_LENGTH;
		}

}
  

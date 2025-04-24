package com.cloudframe.app.cfsort05.file.records;

/**
*  The class OutputStudent is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:29. using version 5.0.0.254
**/


import com.cloudframe.app.cfsort05.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class OutputStudent extends OutputStudentSerialized { 
   

								private long studentIdO;

						private char[] studentNameO = Field.fillLowValue(25);
				private StudentNameORedefined studentNameORedefined = new StudentNameORedefined();
	
	/**
	* Constructor for OutputStudent
	**/
    public OutputStudent() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			studentNameORedefined.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of studentIdO
	 *	@return studentIdO
	 */
	public long getStudentIdO() throws CFException {
       if (isStudentIdOModified()) { 
           studentIdO = refreshStudentIdO();
        }
   		return studentIdO;
	}
	

	
	   
	/**
	 * 	Update StudentIdO with the passed value
	 *  Corresponding COBOL Variable is STUDENT-ID-O
	 *	@param number
	 */
	public void setStudentIdO(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    studentIdO = checkStudentIdOMaxLimit(number); 
		serializeStudentIdO(studentIdO);
	}
	

	/**
	 * 	Update StudentIdO with the passed value
	 *	@param value (String or char[])
	 */
	public void setStudentIdO(char[] value) throws CFException {
		 studentIdO = serializeStudentIdO(value);
	}
	/**
	 * 	Update StudentIdO with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStudentIdOString(char[] value) throws CFException {
		 setStudentIdO(value);
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
	/**
	 *	Returns the value of studentNameORedefined
	 *	@return studentNameORedefined
	 */   
	 public StudentNameORedefined getStudentNameORedefined() {
   	return studentNameORedefined;
   }
   /**
	* 	Update StudentNameORedefined with the passed value
	*   Corresponding COBOL Variable is STUDENT-NAME-O-REDEFINED
	*	@param value
	*/
   public void setStudentNameORedefined(char[] value) {
      studentNameORedefined.setString(value); 
   }   
    
     /**
	 * 	Update StudentNameORedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setStudentNameORedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,studentNameORedefined.begin,studentNameORedefined.length());
   }
   
     /**
	 * 	Update StudentNameORedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStudentNameORedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,studentNameORedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update StudentNameORedefined with another Field
	 *	@param value
	 */
   public void setStudentNameORedefined(Field source) {
   	replace(source,0,source.length(),studentNameORedefined.begin,studentNameORedefined.length());
   }  
   
     /**
	 * 	Update StudentNameORedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setStudentNameORedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,studentNameORedefined.begin,studentNameORedefined.length());
   }
   
     /**
	 * 	Update StudentNameORedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStudentNameORedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,studentNameORedefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getOutputStudentFieldLength() {
			return OUTPUT_STUDENT_LENGTH;
		}

}
  

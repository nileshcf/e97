package com.cloudframe.app.cfsort06.file.records;

/**
*  The class InputStudent is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/


import com.cloudframe.app.cfsort06.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class InputStudent extends InputStudentSerialized {
   

								private long studentIdI;

						private char[] studentNameI = Field.fillLowValue(25);
				private StudentNameIRedefined studentNameIRedefined = new StudentNameIRedefined();
	
	/**
	* Constructor for InputStudent
	**/
    public InputStudent() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			studentNameIRedefined.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of studentIdI
	 *	@return studentIdI
	 */
	public long getStudentIdI() throws CFException {
       if (isStudentIdIModified()) { 
           studentIdI = refreshStudentIdI();
        }
   		return studentIdI;
	}
	

	
	   
	/**
	 * 	Update StudentIdI with the passed value
	 *  Corresponding COBOL Variable is STUDENT-ID-I
	 *	@param number
	 */
	public void setStudentIdI(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    studentIdI = checkStudentIdIMaxLimit(number); 
		serializeStudentIdI(studentIdI);
	}
	

	/**
	 * 	Update StudentIdI with the passed value
	 *	@param value (String or char[])
	 */
	public void setStudentIdI(char[] value) throws CFException {
		 studentIdI = serializeStudentIdI(value);
	}
	/**
	 * 	Update StudentIdI with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStudentIdIString(char[] value) throws CFException {
		 setStudentIdI(value);
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
	/**
	 *	Returns the value of studentNameIRedefined
	 *	@return studentNameIRedefined
	 */   
	 public StudentNameIRedefined getStudentNameIRedefined() {
   	return studentNameIRedefined;
   }
   /**
	* 	Update StudentNameIRedefined with the passed value
	*   Corresponding COBOL Variable is STUDENT-NAME-I-REDEFINED
	*	@param value
	*/
   public void setStudentNameIRedefined(char[] value) {
      studentNameIRedefined.setString(value); 
   }   
    
     /**
	 * 	Update StudentNameIRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setStudentNameIRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,studentNameIRedefined.begin,studentNameIRedefined.length());
   }
   
     /**
	 * 	Update StudentNameIRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStudentNameIRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,studentNameIRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update StudentNameIRedefined with another Field
	 *	@param value
	 */
   public void setStudentNameIRedefined(Field source) {
   	replace(source,0,source.length(),studentNameIRedefined.begin,studentNameIRedefined.length());
   }  
   
     /**
	 * 	Update StudentNameIRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setStudentNameIRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,studentNameIRedefined.begin,studentNameIRedefined.length());
   }
   
     /**
	 * 	Update StudentNameIRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStudentNameIRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,studentNameIRedefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getInputStudentFieldLength() {
			return INPUT_STUDENT_LENGTH;
		}

}
  

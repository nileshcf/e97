package com.cloudframe.app.cfsort04.file.records;

/**
*  The class WorkStudent is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/


import com.cloudframe.app.cfsort04.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WorkStudent extends WorkStudentSerialized {
   

								private long studentIdW;

						private char[] studentNameW = Field.fillLowValue(25);
	
	/**
	* Constructor for WorkStudent
	**/
    public WorkStudent() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of studentIdW
	 *	@return studentIdW
	 */
	public long getStudentIdW() throws CFException {
       if (isStudentIdWModified()) { 
           studentIdW = refreshStudentIdW();
        }
   		return studentIdW;
	}
	

	
	   
	/**
	 * 	Update StudentIdW with the passed value
	 *  Corresponding COBOL Variable is STUDENT-ID-W
	 *	@param number
	 */
	public void setStudentIdW(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    studentIdW = checkStudentIdWMaxLimit(number); 
		serializeStudentIdW(studentIdW);
	}
	

	/**
	 * 	Update StudentIdW with the passed value
	 *	@param value (String or char[])
	 */
	public void setStudentIdW(char[] value) throws CFException {
		 studentIdW = serializeStudentIdW(value);
	}
	/**
	 * 	Update StudentIdW with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStudentIdWString(char[] value) throws CFException {
		 setStudentIdW(value);
	}
	/**
	 *	Returns the value of studentNameW
	 *	@return studentNameW
	 */
   public char[] getStudentNameW() throws CFException{
     if (isStudentNameWModified()) { 
        studentNameW = refreshStudentNameW();
     }
   		return studentNameW;
   }

  
	/**
	*  set variable studentNameW
	*  Corresponding COBOL Variable is STUDENT-NAME-W
	*  @param value
	**/
   public void setStudentNameW(char[] value) {
      studentNameW = checkStudentNameWConstraints(value);
      serializeStudentNameW(studentNameW);
   } 

     /**
	 * 	Update StudentNameW 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStudentNameW(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStudentNameW,studentNameW.length);
   	
   }
   
   public void setStudentNameW(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStudentNameW,studentNameW.length);
   	
   }
   
     /**
	 * 	Update StudentNameW 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStudentNameW(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStudentNameW+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StudentNameW with another Field
	 *	@param value
	 */
   public void setStudentNameW(Field source) {
       replace(source,0,source.length(),beginStudentNameW,STUDENT_NAME_W_LEN);
   	
   }  
   
     /**
	 * 	Update StudentNameW 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStudentNameW(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStudentNameW,STUDENT_NAME_W_LEN);
   	
   }
   
     /**
	 * 	Update StudentNameW 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStudentNameW(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStudentNameW+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWorkStudentFieldLength() {
			return WORK_STUDENT_LENGTH;
		}

}
  

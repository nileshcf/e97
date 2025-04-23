package com.cloudframe.app.cfsort01.file.records;

/**
*  The class WorkStudent is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/


import com.cloudframe.app.cfsort01.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;


public class WorkStudent extends WorkStudentSerialized {
   

								private long studentIdW;
	
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

	
	
	

		public static int getWorkStudentFieldLength() {
			return WORK_STUDENT_LENGTH;
		}

}
  

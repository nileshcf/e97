package com.cloudframe.app.cfsort02.file.records;

/**
*  The class StudentNameIRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/


import com.cloudframe.app.cfsort02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class StudentNameIRedefined extends StudentNameIRedefinedSerialized { 
   

								private int studentSeqNo01;
	
	/**
	* Constructor for StudentNameIRedefined
	**/
    public StudentNameIRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for StudentNameIRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StudentNameIRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of studentSeqNo01
	 *	@return studentSeqNo01
	 */
	public int getStudentSeqNo01() throws CFException {
       if (isStudentSeqNo01Modified()) { 
           studentSeqNo01 = refreshStudentSeqNo01();
        }
   		return studentSeqNo01;
	}
	

	
	   
	/**
	 * 	Update StudentSeqNo01 with the passed value
	 *  Corresponding COBOL Variable is STUDENT-SEQ-NO
	 *	@param number
	 */
	public void setStudentSeqNo01(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    studentSeqNo01 = checkStudentSeqNo01MaxLimit(number); 
		serializeStudentSeqNo01(studentSeqNo01);
	}
	

	public void setStudentSeqNo01(long number) {
	    number = checkStudentSeqNo01MaxLimit(number); // Truncate if value is beyond +/- Max range
		setStudentSeqNo01((int)number);
	}
	
	/**
	 * 	Update StudentSeqNo01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setStudentSeqNo01(char[] value) throws CFException {
		 studentSeqNo01 = serializeStudentSeqNo01(value);
	}
	/**
	 * 	Update StudentSeqNo01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStudentSeqNo01String(char[] value) throws CFException {
		 setStudentSeqNo01(value);
	}

	
	
	

		public static int getStudentNameIRedefinedFieldLength() {
			return STUDENT_NAME_IREDEFINED_LENGTH;
		}

}
  

package com.cloudframe.app.cfsort05.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/


import com.cloudframe.app.cfsort05.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

								private short noMoreRecordsSw;

								private short studentSeqNo;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setNoMoreRecordsSw((short)0);
								setStudentSeqNo((short)0);
    }


 

	/**
	 *	Returns the value of noMoreRecordsSw
	 *	@return noMoreRecordsSw
	 */
	public short getNoMoreRecordsSw() throws CFException {
   		return noMoreRecordsSw;
	}
	
	/**
	 * 	Update NoMoreRecordsSw with the passed value
	 *  Corresponding COBOL Variable is WS-NO-MORE-RECORDS-SW
	 *	@param number
	 */
	public void setNoMoreRecordsSw(short number) {
	     // Truncate if the number is beyond +/- Max range
	    noMoreRecordsSw = checkNoMoreRecordsSwMaxLimit(number); 
	}

	public void setNoMoreRecordsSw(int number) {
	    number = checkNoMoreRecordsSwMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNoMoreRecordsSw((short)number);
	}
	public void setNoMoreRecordsSw(long number) {
	    number = checkNoMoreRecordsSwMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNoMoreRecordsSw((short)number);
	}
	

	
	/**
	 *	Test condition 1 for isNoMoreRecords()
	 *	@return  Returns true if isNoMoreRecords() is 1
	 */
   public boolean isNoMoreRecords() throws CFException {
      return (  getNoMoreRecordsSw()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setNoMoreRecordsTrue() {  			
    	setNoMoreRecordsSw( (short)1);
   	}
	/**
	 *	Returns the value of studentSeqNo
	 *	@return studentSeqNo
	 */
	public short getStudentSeqNo() throws CFException {
   		return studentSeqNo;
	}
	
	/**
	 * 	Update StudentSeqNo with the passed value
	 *  Corresponding COBOL Variable is WS-STUDENT-SEQ-NO
	 *	@param number
	 */
	public void setStudentSeqNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    studentSeqNo = checkStudentSeqNoMaxLimit(number); 
	}

	public void setStudentSeqNo(int number) {
	    number = checkStudentSeqNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setStudentSeqNo((short)number);
	}
	public void setStudentSeqNo(long number) {
	    number = checkStudentSeqNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setStudentSeqNo((short)number);
	}
	


	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  

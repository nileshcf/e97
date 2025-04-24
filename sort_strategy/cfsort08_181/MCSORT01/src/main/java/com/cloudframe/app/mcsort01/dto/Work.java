package com.cloudframe.app.mcsort01.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.mcsort01.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized { 
   

						private char[] sortInStatus = Field.fillLowValue(2);

						private char[] sortOutStatus = Field.fillLowValue(2);

								private long sortInRecLen;

								private long sortOutRecLen;

								private long sortRdw;

						private char[] eofFlag = Field.fillLowValue(1);

						private char[] noRecords = Field.fillLowValue(1);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sortInStatus
	 *	@return sortInStatus
	 */
   public char[] getSortInStatus() throws CFException{
   		return sortInStatus;
   }

  
	/**
	*  set variable sortInStatus
	*  Corresponding COBOL Variable is WS-SORT-IN-STATUS
	*  @param value
	**/
   public void setSortInStatus(char[] value) {
       value = checkSortInStatusConstraints(value);
       arraycopy(value,0,sortInStatus,0,value.length);
   } 
	public void setSortInStatus(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sortInStatus,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sortOutStatus
	 *	@return sortOutStatus
	 */
   public char[] getSortOutStatus() throws CFException{
   		return sortOutStatus;
   }

  
	/**
	*  set variable sortOutStatus
	*  Corresponding COBOL Variable is WS-SORT-OUT-STATUS
	*  @param value
	**/
   public void setSortOutStatus(char[] value) {
       value = checkSortOutStatusConstraints(value);
       arraycopy(value,0,sortOutStatus,0,value.length);
   } 
	public void setSortOutStatus(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sortOutStatus,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sortInRecLen
	 *	@return sortInRecLen
	 */
	public long getSortInRecLen() throws CFException {
   		return sortInRecLen;
	}
	
	/**
	 * 	Update SortInRecLen with the passed value
	 *  Corresponding COBOL Variable is WS-SORT-IN-REC-LEN
	 *	@param number
	 */
	public void setSortInRecLen(long number) {
	     // Truncate if the number is beyond +/- Max range
	    sortInRecLen = checkSortInRecLenMaxLimit(number); 
	}


	/**
	 *	Returns the value of sortOutRecLen
	 *	@return sortOutRecLen
	 */
	public long getSortOutRecLen() throws CFException {
   		return sortOutRecLen;
	}
	
	/**
	 * 	Update SortOutRecLen with the passed value
	 *  Corresponding COBOL Variable is WS-SORT-OUT-REC-LEN
	 *	@param number
	 */
	public void setSortOutRecLen(long number) {
	     // Truncate if the number is beyond +/- Max range
	    sortOutRecLen = checkSortOutRecLenMaxLimit(number); 
	}


	/**
	 *	Returns the value of sortRdw
	 *	@return sortRdw
	 */
	public long getSortRdw() throws CFException {
   		return sortRdw;
	}
	
	/**
	 * 	Update SortRdw with the passed value
	 *  Corresponding COBOL Variable is SORT-RDW
	 *	@param number
	 */
	public void setSortRdw(long number) {
	     // Truncate if the number is beyond +/- Max range
	    sortRdw = checkSortRdwMaxLimit(number); 
	}


	/**
	 *	Returns the value of eofFlag
	 *	@return eofFlag
	 */
   public char[] getEofFlag() throws CFException{
   		return eofFlag;
   }

  
	/**
	*  set variable eofFlag
	*  Corresponding COBOL Variable is EOF-FLAG
	*  @param value
	**/
   public void setEofFlag(char[] value) {
       value = checkEofFlagConstraints(value);
       arraycopy(value,0,eofFlag,0,value.length);
   } 
	public void setEofFlag(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,eofFlag,0,beginIndex + endIndex);
   }
	char[] eofInput88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEofInput()
	 *	@return  Returns true if isEofInput() is "Y"
	 */
   public boolean isEofInput() throws CFException {
      return (  compareChars( getEofFlag() , eofInput88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEofInputTrue() {  			
    	setEofFlag( eofInput88Value);
   	}
	/**
	 *	Returns the value of noRecords
	 *	@return noRecords
	 */
   public char[] getNoRecords() throws CFException{
   		return noRecords;
   }

  
	/**
	*  set variable noRecords
	*  Corresponding COBOL Variable is NO-RECORDS
	*  @param value
	**/
   public void setNoRecords(char[] value) {
       value = checkNoRecordsConstraints(value);
       arraycopy(value,0,noRecords,0,value.length);
   } 
	public void setNoRecords(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,noRecords,0,beginIndex + endIndex);
   }
	char[] recordsEnded88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isRecordsEnded()
	 *	@return  Returns true if isRecordsEnded() is "Y"
	 */
   public boolean isRecordsEnded() throws CFException {
      return (  compareChars( getNoRecords() , recordsEnded88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setRecordsEndedTrue() {  			
    	setNoRecords( recordsEnded88Value);
   	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  

package com.cloudframe.app.mcsort02.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:55. using version 5.0.0.254
**/


import com.cloudframe.app.mcsort02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] sys002Status = Field.fillLowValue(2);

						private char[] sys004Status = Field.fillLowValue(2);

						private char[] sys005Status = Field.fillLowValue(2);

						private char[] sortOutStatus = Field.fillLowValue(2);

								private long ipmRdw410;

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
	 *	Returns the value of sys002Status
	 *	@return sys002Status
	 */
   public char[] getSys002Status() throws CFException{
   		return sys002Status;
   }

  
	/**
	*  set variable sys002Status
	*  Corresponding COBOL Variable is WS-SYS002-STATUS
	*  @param value
	**/
   public void setSys002Status(char[] value) {
       value = checkSys002StatusConstraints(value);
       arraycopy(value,0,sys002Status,0,value.length);
   } 
	public void setSys002Status(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys002Status,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sys004Status
	 *	@return sys004Status
	 */
   public char[] getSys004Status() throws CFException{
   		return sys004Status;
   }

  
	/**
	*  set variable sys004Status
	*  Corresponding COBOL Variable is WS-SYS004-STATUS
	*  @param value
	**/
   public void setSys004Status(char[] value) {
       value = checkSys004StatusConstraints(value);
       arraycopy(value,0,sys004Status,0,value.length);
   } 
	public void setSys004Status(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys004Status,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sys005Status
	 *	@return sys005Status
	 */
   public char[] getSys005Status() throws CFException{
   		return sys005Status;
   }

  
	/**
	*  set variable sys005Status
	*  Corresponding COBOL Variable is WS-SYS005-STATUS
	*  @param value
	**/
   public void setSys005Status(char[] value) {
       value = checkSys005StatusConstraints(value);
       arraycopy(value,0,sys005Status,0,value.length);
   } 
	public void setSys005Status(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys005Status,0,beginIndex + endIndex);
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
	 *	Returns the value of ipmRdw410
	 *	@return ipmRdw410
	 */
	public long getIpmRdw410() throws CFException {
   		return ipmRdw410;
	}
	
	/**
	 * 	Update IpmRdw410 with the passed value
	 *  Corresponding COBOL Variable is 410-IPM-RDW
	 *	@param number
	 */
	public void setIpmRdw410(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ipmRdw410 = checkIpmRdw410MaxLimit(number); 
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
  

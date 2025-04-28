package com.cloudframe.app.tmsmmcpy.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:54. using version 5.0.0.256
**/


import com.cloudframe.app.tmsmmcpy.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized { 
   

								private int smmRecordsRead;

						private char[] endSw = new char[1];

						private char[] smmEofSw = new char[1];

						private char[] sortEofSw = new char[1];

								private long invalidSmmCnt;

								private long writeSmmCnt;

								private long smmDupCnt;

								private long depDupKey;

						private char[] smmKeyHold = new char[100];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setSmmRecordsRead(0);
								setEndSw(fillLowValue(1));
								setSmmEofSw(("N").toCharArray());
								setSortEofSw(("N").toCharArray());
								setInvalidSmmCnt(0L);
								setWriteSmmCnt(0L);
								setSmmDupCnt(0L);
								setDepDupKey(0L);
								setSmmKeyHold(pad(100," ".toCharArray(),' ',RIGHT_PAD));
    }


 

	public int getSmmRecordsRead() throws CFException {
        if (isSmmRecordsReadModified()) { 
           smmRecordsRead = refreshSmmRecordsRead();
        }
   		return smmRecordsRead;
	}
	
	/**
	 * 	Update SmmRecordsRead with the passed value
	 *  Corresponding COBOL Variable is WS-SMM-RECORDS-READ
	 *	@param number
	 */
	public void setSmmRecordsRead(int number) {
			smmRecordsRead = checkSmmRecordsReadMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSmmRecordsRead(smmRecordsRead);
	}


	public void setSmmRecordsRead(long number) {
	    number = checkSmmRecordsReadMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSmmRecordsRead((int)number);
	}
	
	/**
	 *	Returns the value of endSw
	 *	@return endSw
	 */
   public char[] getEndSw() throws CFException{
   		return endSw;
   }

  
	/**
	*  set variable endSw
	*  Corresponding COBOL Variable is WS-END-SW
	*  @param value
	**/
   public void setEndSw(char[] value) {
       value = checkEndSwConstraints(value);
       arraycopy(value,0,endSw,0,value.length);
   } 
	public void setEndSw(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,endSw,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of smmEofSw
	 *	@return smmEofSw
	 */
   public char[] getSmmEofSw() throws CFException{
   		return smmEofSw;
   }

  
	/**
	*  set variable smmEofSw
	*  Corresponding COBOL Variable is WS-SMM-EOF-SW
	*  @param value
	**/
   public void setSmmEofSw(char[] value) {
       value = checkSmmEofSwConstraints(value);
       arraycopy(value,0,smmEofSw,0,value.length);
   } 
	public void setSmmEofSw(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,smmEofSw,0,beginIndex + endIndex);
   }
	char[] smmNotEof88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isSmmNotEof()
	 *	@return  Returns true if isSmmNotEof() is "N"
	 */
   public boolean isSmmNotEof() throws CFException {
      return (  compareChars( getSmmEofSw() , smmNotEof88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setSmmNotEofTrue() {  			
    	setSmmEofSw( smmNotEof88Value);
   	}
	char[] smmEof88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isSmmEof()
	 *	@return  Returns true if isSmmEof() is "Y"
	 */
   public boolean isSmmEof() throws CFException {
      return (  compareChars( getSmmEofSw() , smmEof88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setSmmEofTrue() {  			
    	setSmmEofSw( smmEof88Value);
   	}
	/**
	 *	Returns the value of sortEofSw
	 *	@return sortEofSw
	 */
   public char[] getSortEofSw() throws CFException{
   		return sortEofSw;
   }

  
	/**
	*  set variable sortEofSw
	*  Corresponding COBOL Variable is WS-SORT-EOF-SW
	*  @param value
	**/
   public void setSortEofSw(char[] value) {
       value = checkSortEofSwConstraints(value);
       arraycopy(value,0,sortEofSw,0,value.length);
   } 
	public void setSortEofSw(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sortEofSw,0,beginIndex + endIndex);
   }
	char[] sortNotEof88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isSortNotEof()
	 *	@return  Returns true if isSortNotEof() is "N"
	 */
   public boolean isSortNotEof() throws CFException {
      return (  compareChars( getSortEofSw() , sortNotEof88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setSortNotEofTrue() {  			
    	setSortEofSw( sortNotEof88Value);
   	}
	char[] sortEof88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isSortEof()
	 *	@return  Returns true if isSortEof() is "Y"
	 */
   public boolean isSortEof() throws CFException {
      return (  compareChars( getSortEofSw() , sortEof88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setSortEofTrue() {  			
    	setSortEofSw( sortEof88Value);
   	}
	public long getInvalidSmmCnt() throws CFException {
        if (isInvalidSmmCntModified()) { 
           invalidSmmCnt = refreshInvalidSmmCnt();
        }
   		return invalidSmmCnt;
	}
	
	/**
	 * 	Update InvalidSmmCnt with the passed value
	 *  Corresponding COBOL Variable is WS-INVALID-SMM-CNT
	 *	@param number
	 */
	public void setInvalidSmmCnt(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			invalidSmmCnt = checkInvalidSmmCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeInvalidSmmCnt(invalidSmmCnt);
	}


	public long getWriteSmmCnt() throws CFException {
        if (isWriteSmmCntModified()) { 
           writeSmmCnt = refreshWriteSmmCnt();
        }
   		return writeSmmCnt;
	}
	
	/**
	 * 	Update WriteSmmCnt with the passed value
	 *  Corresponding COBOL Variable is WS-WRITE-SMM-CNT
	 *	@param number
	 */
	public void setWriteSmmCnt(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			writeSmmCnt = checkWriteSmmCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeWriteSmmCnt(writeSmmCnt);
	}


	public long getSmmDupCnt() throws CFException {
        if (isSmmDupCntModified()) { 
           smmDupCnt = refreshSmmDupCnt();
        }
   		return smmDupCnt;
	}
	
	/**
	 * 	Update SmmDupCnt with the passed value
	 *  Corresponding COBOL Variable is WS-SMM-DUP-CNT
	 *	@param number
	 */
	public void setSmmDupCnt(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			smmDupCnt = checkSmmDupCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSmmDupCnt(smmDupCnt);
	}


	/**
	 *	Returns the value of depDupKey
	 *	@return depDupKey
	 */
	public long getDepDupKey() throws CFException {
       if (isDepDupKeyModified()) { 
           depDupKey = refreshDepDupKey();
        }
   		return depDupKey;
	}
	

	
	   
	/**
	 * 	Update DepDupKey with the passed value
	 *  Corresponding COBOL Variable is WS-DEP-DUP-KEY
	 *	@param number
	 */
	public void setDepDupKey(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    depDupKey = checkDepDupKeyMaxLimit(number); 
		serializeDepDupKey(depDupKey);
	}
	

	/**
	 * 	Update DepDupKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setDepDupKey(char[] value) throws CFException {
		 depDupKey = serializeDepDupKey(value);
	}
	/**
	 * 	Update DepDupKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDepDupKeyString(char[] value) throws CFException {
		 setDepDupKey(value);
	}
	/**
	 *	Returns the value of smmKeyHold
	 *	@return smmKeyHold
	 */
   public char[] getSmmKeyHold() throws CFException{
   		return smmKeyHold;
   }

  
	/**
	*  set variable smmKeyHold
	*  Corresponding COBOL Variable is WS-SMM-KEY-HOLD
	*  @param value
	**/
   public void setSmmKeyHold(char[] value) {
       value = checkSmmKeyHoldConstraints(value);
       arraycopy(value,0,smmKeyHold,0,value.length);
   } 
	public void setSmmKeyHold(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,smmKeyHold,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  

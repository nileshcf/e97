package com.cloudframe.app.callvp77.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:16. using version 5.0.0.257
**/


import com.cloudframe.app.callvp77.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

								private int inputStatus;

								private int outputStatus;

								private short eofFlag;

						private char[] vp776a0001 = new char[8];

								private int inSrtCnt;

								private int noItemsTobeSorted;

								private int j;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setVp776a0001(("VP776A00").toCharArray());
								setInSrtCnt(0);
								setNoItemsTobeSorted(0);
								setJ(0);
    }


 

	/**
	 *	Returns the value of inputStatus
	 *	@return inputStatus
	 */
	public int getInputStatus() throws CFException {
       if (isInputStatusModified()) { 
           inputStatus = refreshInputStatus();
        }
   		return inputStatus;
	}
	

	
	   
	/**
	 * 	Update InputStatus with the passed value
	 *  Corresponding COBOL Variable is INPUT-STATUS
	 *	@param number
	 */
	public void setInputStatus(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    inputStatus = checkInputStatusMaxLimit(number); 
		serializeInputStatus(inputStatus);
	}
	

	public void setInputStatus(long number) {
	    number = checkInputStatusMaxLimit(number); // Truncate if value is beyond +/- Max range
		setInputStatus((int)number);
	}
	
	/**
	 * 	Update InputStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setInputStatus(char[] value) throws CFException {
		 inputStatus = serializeInputStatus(value);
	}
	/**
	 * 	Update InputStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInputStatusString(char[] value) throws CFException {
		 setInputStatus(value);
	}
	/**
	 *	Returns the value of outputStatus
	 *	@return outputStatus
	 */
	public int getOutputStatus() throws CFException {
       if (isOutputStatusModified()) { 
           outputStatus = refreshOutputStatus();
        }
   		return outputStatus;
	}
	

	
	   
	/**
	 * 	Update OutputStatus with the passed value
	 *  Corresponding COBOL Variable is OUTPUT-STATUS
	 *	@param number
	 */
	public void setOutputStatus(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    outputStatus = checkOutputStatusMaxLimit(number); 
		serializeOutputStatus(outputStatus);
	}
	

	public void setOutputStatus(long number) {
	    number = checkOutputStatusMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOutputStatus((int)number);
	}
	
	/**
	 * 	Update OutputStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutputStatus(char[] value) throws CFException {
		 outputStatus = serializeOutputStatus(value);
	}
	/**
	 * 	Update OutputStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutputStatusString(char[] value) throws CFException {
		 setOutputStatus(value);
	}
	/**
	 *	Returns the value of eofFlag
	 *	@return eofFlag
	 */
	public short getEofFlag() throws CFException {
   		return eofFlag;
	}
	
	/**
	 * 	Update EofFlag with the passed value
	 *  Corresponding COBOL Variable is WS-EOF-FLAG
	 *	@param number
	 */
	public void setEofFlag(short number) {
	     // Truncate if the number is beyond +/- Max range
	    eofFlag = checkEofFlagMaxLimit(number); 
	}

	public void setEofFlag(int number) {
	    number = checkEofFlagMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEofFlag((short)number);
	}
	public void setEofFlag(long number) {
	    number = checkEofFlagMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEofFlag((short)number);
	}
	

	
	/**
	 *	Test condition 1 for isNoMoreRecords()
	 *	@return  Returns true if isNoMoreRecords() is 1
	 */
   public boolean isNoMoreRecords() throws CFException {
      return (  getEofFlag()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setNoMoreRecordsTrue() {  			
    	setEofFlag( (short)1);
   	}
	/**
	 *	Returns the value of vp776a0001
	 *	@return vp776a0001
	 */
   public char[] getVp776a0001() throws CFException{
   		return vp776a0001;
   }

  
	/**
	*  set variable vp776a0001
	*  Corresponding COBOL Variable is VP776A00
	*  @param value
	**/
   public void setVp776a0001(char[] value) {
       value = checkVp776a0001Constraints(value);
       arraycopy(value,0,vp776a0001,0,value.length);
   } 
	public void setVp776a0001(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,vp776a0001,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of inSrtCnt
	 *	@return inSrtCnt
	 */
	public int getInSrtCnt() throws CFException {
       if (isInSrtCntModified()) { 
           inSrtCnt = refreshInSrtCnt();
        }
   		return inSrtCnt;
	}
	

	
	   
	/**
	 * 	Update InSrtCnt with the passed value
	 *  Corresponding COBOL Variable is IN-SRT-CNT
	 *	@param number
	 */
	public void setInSrtCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    inSrtCnt = checkInSrtCntMaxLimit(number); 
		serializeInSrtCnt(inSrtCnt);
	}
	

	public void setInSrtCnt(long number) {
	    number = checkInSrtCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setInSrtCnt((int)number);
	}
	
	/**
	 * 	Update InSrtCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setInSrtCnt(char[] value) throws CFException {
		 inSrtCnt = serializeInSrtCnt(value);
	}
	/**
	 * 	Update InSrtCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInSrtCntString(char[] value) throws CFException {
		 setInSrtCnt(value);
	}
	/**
	 *	Returns the value of noItemsTobeSorted
	 *	@return noItemsTobeSorted
	 */
	public int getNoItemsTobeSorted() throws CFException {
       if (isNoItemsTobeSortedModified()) { 
           noItemsTobeSorted = refreshNoItemsTobeSorted();
        }
   		return noItemsTobeSorted;
	}
	

	
	   
	/**
	 * 	Update NoItemsTobeSorted with the passed value
	 *  Corresponding COBOL Variable is NO-ITEMS-TOBE-SORTED
	 *	@param number
	 */
	public void setNoItemsTobeSorted(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    noItemsTobeSorted = checkNoItemsTobeSortedMaxLimit(number); 
		serializeNoItemsTobeSorted(noItemsTobeSorted);
	}
	

	public void setNoItemsTobeSorted(long number) {
	    number = checkNoItemsTobeSortedMaxLimit(number); // Truncate if value is beyond +/- Max range
		setNoItemsTobeSorted((int)number);
	}
	
	/**
	 * 	Update NoItemsTobeSorted with the passed value
	 *	@param value (String or char[])
	 */
	public void setNoItemsTobeSorted(char[] value) throws CFException {
		 noItemsTobeSorted = serializeNoItemsTobeSorted(value);
	}
	/**
	 * 	Update NoItemsTobeSorted with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNoItemsTobeSortedString(char[] value) throws CFException {
		 setNoItemsTobeSorted(value);
	}
	/**
	 *	Returns the value of j
	 *	@return j
	 */
	public int getJ() throws CFException {
       if (isJModified()) { 
           j = refreshJ();
        }
   		return j;
	}
	

	
	   
	/**
	 * 	Update J with the passed value
	 *  Corresponding COBOL Variable is J
	 *	@param number
	 */
	public void setJ(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    j = checkJMaxLimit(number); 
		serializeJ(j);
	}
	

	public void setJ(long number) {
	    number = checkJMaxLimit(number); // Truncate if value is beyond +/- Max range
		setJ((int)number);
	}
	
	/**
	 * 	Update J with the passed value
	 *	@param value (String or char[])
	 */
	public void setJ(char[] value) throws CFException {
		 j = serializeJ(value);
	}
	/**
	 * 	Update J with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setJString(char[] value) throws CFException {
		 setJ(value);
	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  

package com.cloudframe.app.tstcdpag.dto;

/**
*  The class MiscData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:00. using version 5.0.0.254
**/


import com.cloudframe.app.tstcdpag.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class MiscData extends MiscDataSerialized {
   

								private int inputStatus;

								private int outputStatus;

								private long recLenIn;

								private short eofFlag;
	
	/**
	* Constructor for MiscData
	**/
    public MiscData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
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
	 *	Returns the value of recLenIn
	 *	@return recLenIn
	 */
	public long getRecLenIn() throws CFException {
        if (isRecLenInModified()) { 
           recLenIn = refreshRecLenIn();
        }
   		return recLenIn;
	}
	
	/**
	 * 	Update RecLenIn with the passed value
	 *  Corresponding COBOL Variable is WS-REC-LEN-IN
	 *	@param number
	 */
	public void setRecLenIn(long number) {
	     // Truncate if the number is beyond +/- Max range
	    recLenIn = checkRecLenInMaxLimit(number); 
		serializeRecLenIn(recLenIn);
	}


	/**
	 *	Returns the value of eofFlag
	 *	@return eofFlag
	 */
	public short getEofFlag() throws CFException {
        if (isEofFlagModified()) { 
           eofFlag = refreshEofFlag();
        }
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
		serializeEofFlag(eofFlag);
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
	 * 	initializes MiscData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setInputStatus(0);
                     setOutputStatus(0);
                     setRecLenIn(0);
         	setEofFlag((short)0);
   }

		public static int getMiscDataFieldLength() {
			return MISC_DATA_LENGTH;
		}

}
  

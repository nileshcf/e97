package com.cloudframe.app.ip661020.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/


import com.cloudframe.app.ip661020.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized { 
   

						private char[] isInputFileOpen100 = new char[1];

						private char[] terminatingMessage600 = new char[30];

								private short abendCode900;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsInputFileOpen100(("N").toCharArray());
								setTerminatingMessage600(("IP661020 TERMINATED ABNORMALLY").toCharArray());
    }


 

	/**
	 *	Returns the value of isInputFileOpen100
	 *	@return isInputFileOpen100
	 */
   public char[] getIsInputFileOpen100() throws CFException{
   		return isInputFileOpen100;
   }

  
	/**
	*  set variable isInputFileOpen100
	*  Corresponding COBOL Variable is 100-IS-INPUT-FILE-OPEN
	*  @param value
	**/
   public void setIsInputFileOpen100(char[] value) {
       value = checkIsInputFileOpen100Constraints(value);
       arraycopy(value,0,isInputFileOpen100,0,value.length);
   } 
	public void setIsInputFileOpen100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isInputFileOpen100,0,beginIndex + endIndex);
   }
	char[] inputFileIsOpen10088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isInputFileIsOpen100()
	 *	@return  Returns true if isInputFileIsOpen100() is "Y"
	 */
   public boolean isInputFileIsOpen100() throws CFException {
      return (  compareChars( getIsInputFileOpen100() , inputFileIsOpen10088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setInputFileIsOpen100True() {  			
    	setIsInputFileOpen100( inputFileIsOpen10088Value);
   	}
	char[] inputFileIsClosed10088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isInputFileIsClosed100()
	 *	@return  Returns true if isInputFileIsClosed100() is "N"
	 */
   public boolean isInputFileIsClosed100() throws CFException {
      return (  compareChars( getIsInputFileOpen100() , inputFileIsClosed10088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setInputFileIsClosed100True() {  			
    	setIsInputFileOpen100( inputFileIsClosed10088Value);
   	}
	/**
	 *	Returns the value of terminatingMessage600
	 *	@return terminatingMessage600
	 */
   public char[] getTerminatingMessage600() throws CFException{
   		return terminatingMessage600;
   }

  
	/**
	*  set variable terminatingMessage600
	*  Corresponding COBOL Variable is 600-TERMINATING-MESSAGE
	*  @param value
	**/
   public void setTerminatingMessage600(char[] value) {
       value = checkTerminatingMessage600Constraints(value);
       arraycopy(value,0,terminatingMessage600,0,value.length);
   } 
	public void setTerminatingMessage600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,terminatingMessage600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
	public short getAbendCode900() throws CFException {
   		return abendCode900;
	}
	
	/**
	 * 	Update AbendCode900 with the passed value
	 *  Corresponding COBOL Variable is 900-ABEND-CODE
	 *	@param number
	 */
	public void setAbendCode900(short number) {
	     // Truncate if the number is beyond +/- Max range
	    abendCode900 = checkAbendCode900MaxLimit(number); 
	}

	public void setAbendCode900(int number) {
	    number = checkAbendCode900MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAbendCode900((short)number);
	}
	public void setAbendCode900(long number) {
	    number = checkAbendCode900MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAbendCode900((short)number);
	}
	


	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  

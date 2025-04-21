package com.cloudframe.app.callfd01.file.records;

/**
*  The class InputKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/


import com.cloudframe.app.callfd01.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class InputKey extends InputKeySerialized { 
   


								private long inputSeq;
	
	/**
	* Constructor for InputKey
	**/
    public InputKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for InputKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public InputKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of inputSeq
	 *	@return inputSeq
	 */
	public long getInputSeq() throws CFException {
       if (isInputSeqModified()) { 
           inputSeq = refreshInputSeq();
        }
   		return inputSeq;
	}
	

	
	   
	/**
	 * 	Update InputSeq with the passed value
	 *  Corresponding COBOL Variable is INPUT-SEQ
	 *	@param number
	 */
	public void setInputSeq(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    inputSeq = checkInputSeqMaxLimit(number); 
		serializeInputSeq(inputSeq);
	}
	

	/**
	 * 	Update InputSeq with the passed value
	 *	@param value (String or char[])
	 */
	public void setInputSeq(char[] value) throws CFException {
		 inputSeq = serializeInputSeq(value);
	}
	/**
	 * 	Update InputSeq with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInputSeqString(char[] value) throws CFException {
		 setInputSeq(value);
	}

	
	
	

		public static int getInputKeyFieldLength() {
			return INPUT_KEY_LENGTH;
		}

}
  

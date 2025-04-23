package com.cloudframe.app.vsammon4.dto;

/**
*  The class KeyreadData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:23. using version 5.0.0.254
**/


import com.cloudframe.app.vsammon4.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class KeyreadData extends KeyreadDataSerialized { 
   

								private long kKey;
	
	/**
	* Constructor for KeyreadData
	**/
    public KeyreadData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for KeyreadData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyreadData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of kKey
	 *	@return kKey
	 */
	public long getKKey() throws CFException {
       if (isKKeyModified()) { 
           kKey = refreshKKey();
        }
   		return kKey;
	}
	

	
	   
	/**
	 * 	Update KKey with the passed value
	 *  Corresponding COBOL Variable is WS-K-KEY
	 *	@param number
	 */
	public void setKKey(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    kKey = checkKKeyMaxLimit(number); 
		serializeKKey(kKey);
	}
	

	/**
	 * 	Update KKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setKKey(char[] value) throws CFException {
		 kKey = serializeKKey(value);
	}
	/**
	 * 	Update KKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setKKeyString(char[] value) throws CFException {
		 setKKey(value);
	}

	
	
	

		public static int getKeyreadDataFieldLength() {
			return KEYREAD_DATA_LENGTH;
		}

}
  

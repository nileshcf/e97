package com.cloudframe.app.vsammon4.dto;

/**
*  The class DeleteData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:19. using version 5.0.0.257
**/


import com.cloudframe.app.vsammon4.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DeleteData extends DeleteDataSerialized { 
   

								private long dKey;
	
	/**
	* Constructor for DeleteData
	**/
    public DeleteData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DeleteData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DeleteData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of dKey
	 *	@return dKey
	 */
	public long getDKey() throws CFException {
       if (isDKeyModified()) { 
           dKey = refreshDKey();
        }
   		return dKey;
	}
	

	
	   
	/**
	 * 	Update DKey with the passed value
	 *  Corresponding COBOL Variable is WS-D-KEY
	 *	@param number
	 */
	public void setDKey(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dKey = checkDKeyMaxLimit(number); 
		serializeDKey(dKey);
	}
	

	/**
	 * 	Update DKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setDKey(char[] value) throws CFException {
		 dKey = serializeDKey(value);
	}
	/**
	 * 	Update DKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDKeyString(char[] value) throws CFException {
		 setDKey(value);
	}

	
	
	

		public static int getDeleteDataFieldLength() {
			return DELETE_DATA_LENGTH;
		}

}
  

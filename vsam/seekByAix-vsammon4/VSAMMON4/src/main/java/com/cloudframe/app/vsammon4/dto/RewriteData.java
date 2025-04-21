package com.cloudframe.app.vsammon4.dto;

/**
*  The class RewriteData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:57. using version 5.0.0.256
**/


import com.cloudframe.app.vsammon4.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RewriteData extends RewriteDataSerialized { 
   

								private long rwKey;

								private long rwTaskNo;

								private long rwReqSize;

								private int rwDataLen;
	
	/**
	* Constructor for RewriteData
	**/
    public RewriteData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RewriteData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RewriteData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rwKey
	 *	@return rwKey
	 */
	public long getRwKey() throws CFException {
       if (isRwKeyModified()) { 
           rwKey = refreshRwKey();
        }
   		return rwKey;
	}
	

	
	   
	/**
	 * 	Update RwKey with the passed value
	 *  Corresponding COBOL Variable is WS-RW-KEY
	 *	@param number
	 */
	public void setRwKey(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    rwKey = checkRwKeyMaxLimit(number); 
		serializeRwKey(rwKey);
	}
	

	/**
	 * 	Update RwKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setRwKey(char[] value) throws CFException {
		 rwKey = serializeRwKey(value);
	}
	/**
	 * 	Update RwKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRwKeyString(char[] value) throws CFException {
		 setRwKey(value);
	}
	/**
	 *	Returns the value of rwTaskNo
	 *	@return rwTaskNo
	 */
	public long getRwTaskNo() throws CFException {
       if (isRwTaskNoModified()) { 
           rwTaskNo = refreshRwTaskNo();
        }
   		return rwTaskNo;
	}
	

	
	   
	/**
	 * 	Update RwTaskNo with the passed value
	 *  Corresponding COBOL Variable is WS-RW-TASK-NO
	 *	@param number
	 */
	public void setRwTaskNo(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    rwTaskNo = checkRwTaskNoMaxLimit(number); 
		serializeRwTaskNo(rwTaskNo);
	}
	

	/**
	 * 	Update RwTaskNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setRwTaskNo(char[] value) throws CFException {
		 rwTaskNo = serializeRwTaskNo(value);
	}
	/**
	 * 	Update RwTaskNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRwTaskNoString(char[] value) throws CFException {
		 setRwTaskNo(value);
	}
	/**
	 *	Returns the value of rwReqSize
	 *	@return rwReqSize
	 */
	public long getRwReqSize() throws CFException {
       if (isRwReqSizeModified()) { 
           rwReqSize = refreshRwReqSize();
        }
   		return rwReqSize;
	}
	

	
	   
	/**
	 * 	Update RwReqSize with the passed value
	 *  Corresponding COBOL Variable is WS-RW-REQ-SIZE
	 *	@param number
	 */
	public void setRwReqSize(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    rwReqSize = checkRwReqSizeMaxLimit(number); 
		serializeRwReqSize(rwReqSize);
	}
	

	/**
	 * 	Update RwReqSize with the passed value
	 *	@param value (String or char[])
	 */
	public void setRwReqSize(char[] value) throws CFException {
		 rwReqSize = serializeRwReqSize(value);
	}
	/**
	 * 	Update RwReqSize with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRwReqSizeString(char[] value) throws CFException {
		 setRwReqSize(value);
	}
	/**
	 *	Returns the value of rwDataLen
	 *	@return rwDataLen
	 */
	public int getRwDataLen() throws CFException {
       if (isRwDataLenModified()) { 
           rwDataLen = refreshRwDataLen();
        }
   		return rwDataLen;
	}
	

	
	   
	/**
	 * 	Update RwDataLen with the passed value
	 *  Corresponding COBOL Variable is WS-RW-DATA-LEN
	 *	@param number
	 */
	public void setRwDataLen(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rwDataLen = checkRwDataLenMaxLimit(number); 
		serializeRwDataLen(rwDataLen);
	}
	

	public void setRwDataLen(long number) {
	    number = checkRwDataLenMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRwDataLen((int)number);
	}
	
	/**
	 * 	Update RwDataLen with the passed value
	 *	@param value (String or char[])
	 */
	public void setRwDataLen(char[] value) throws CFException {
		 rwDataLen = serializeRwDataLen(value);
	}
	/**
	 * 	Update RwDataLen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRwDataLenString(char[] value) throws CFException {
		 setRwDataLen(value);
	}

	
	
	

		public static int getRewriteDataFieldLength() {
			return REWRITE_DATA_LENGTH;
		}

}
  

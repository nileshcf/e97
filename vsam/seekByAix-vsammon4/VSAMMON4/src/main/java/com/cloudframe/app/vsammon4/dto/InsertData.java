package com.cloudframe.app.vsammon4.dto;

/**
*  The class InsertData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:19. using version 5.0.0.257
**/


import com.cloudframe.app.vsammon4.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class InsertData extends InsertDataSerialized { 
   

								private long iInsertKey;

								private long iTaskNo;

								private long iReqSize;

								private int iDataLen;
	
	/**
	* Constructor for InsertData
	**/
    public InsertData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for InsertData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public InsertData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of iInsertKey
	 *	@return iInsertKey
	 */
	public long getIInsertKey() throws CFException {
       if (isIInsertKeyModified()) { 
           iInsertKey = refreshIInsertKey();
        }
   		return iInsertKey;
	}
	

	
	   
	/**
	 * 	Update IInsertKey with the passed value
	 *  Corresponding COBOL Variable is WS-I-INSERT-KEY
	 *	@param number
	 */
	public void setIInsertKey(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    iInsertKey = checkIInsertKeyMaxLimit(number); 
		serializeIInsertKey(iInsertKey);
	}
	

	/**
	 * 	Update IInsertKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setIInsertKey(char[] value) throws CFException {
		 iInsertKey = serializeIInsertKey(value);
	}
	/**
	 * 	Update IInsertKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIInsertKeyString(char[] value) throws CFException {
		 setIInsertKey(value);
	}
	/**
	 *	Returns the value of iTaskNo
	 *	@return iTaskNo
	 */
	public long getITaskNo() throws CFException {
       if (isITaskNoModified()) { 
           iTaskNo = refreshITaskNo();
        }
   		return iTaskNo;
	}
	

	
	   
	/**
	 * 	Update ITaskNo with the passed value
	 *  Corresponding COBOL Variable is WS-I-TASK-NO
	 *	@param number
	 */
	public void setITaskNo(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    iTaskNo = checkITaskNoMaxLimit(number); 
		serializeITaskNo(iTaskNo);
	}
	

	/**
	 * 	Update ITaskNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setITaskNo(char[] value) throws CFException {
		 iTaskNo = serializeITaskNo(value);
	}
	/**
	 * 	Update ITaskNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setITaskNoString(char[] value) throws CFException {
		 setITaskNo(value);
	}
	/**
	 *	Returns the value of iReqSize
	 *	@return iReqSize
	 */
	public long getIReqSize() throws CFException {
       if (isIReqSizeModified()) { 
           iReqSize = refreshIReqSize();
        }
   		return iReqSize;
	}
	

	
	   
	/**
	 * 	Update IReqSize with the passed value
	 *  Corresponding COBOL Variable is WS-I-REQ-SIZE
	 *	@param number
	 */
	public void setIReqSize(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    iReqSize = checkIReqSizeMaxLimit(number); 
		serializeIReqSize(iReqSize);
	}
	

	/**
	 * 	Update IReqSize with the passed value
	 *	@param value (String or char[])
	 */
	public void setIReqSize(char[] value) throws CFException {
		 iReqSize = serializeIReqSize(value);
	}
	/**
	 * 	Update IReqSize with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIReqSizeString(char[] value) throws CFException {
		 setIReqSize(value);
	}
	/**
	 *	Returns the value of iDataLen
	 *	@return iDataLen
	 */
	public int getIDataLen() throws CFException {
       if (isIDataLenModified()) { 
           iDataLen = refreshIDataLen();
        }
   		return iDataLen;
	}
	

	
	   
	/**
	 * 	Update IDataLen with the passed value
	 *  Corresponding COBOL Variable is WS-I-DATA-LEN
	 *	@param number
	 */
	public void setIDataLen(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    iDataLen = checkIDataLenMaxLimit(number); 
		serializeIDataLen(iDataLen);
	}
	

	public void setIDataLen(long number) {
	    number = checkIDataLenMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIDataLen((int)number);
	}
	
	/**
	 * 	Update IDataLen with the passed value
	 *	@param value (String or char[])
	 */
	public void setIDataLen(char[] value) throws CFException {
		 iDataLen = serializeIDataLen(value);
	}
	/**
	 * 	Update IDataLen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIDataLenString(char[] value) throws CFException {
		 setIDataLen(value);
	}

	
	
	

		public static int getInsertDataFieldLength() {
			return INSERT_DATA_LENGTH;
		}

}
  

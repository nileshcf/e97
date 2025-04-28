package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip69931OutputFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip69931OutputFields extends Ip69931OutputFieldsSerialized { 
   

						private char[] ip69931DatabaseId = Field.fillLowValue(18);

						private char[] ip69931CollectionId = Field.fillLowValue(18);

								private short ip69931WherePaProcessedSw;

								private short ip69931ResponseStatus;

						private char[] ip69931ErrorMsg = Field.fillLowValue(80);
	
	/**
	* Constructor for Ip69931OutputFields
	**/
    public Ip69931OutputFields() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip69931OutputFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip69931OutputFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip69931DatabaseId
	 *	@return ip69931DatabaseId
	 */
   public char[] getIp69931DatabaseId() throws CFException{
     if (isIp69931DatabaseIdModified()) { 
        ip69931DatabaseId = refreshIp69931DatabaseId();
     }
   		return ip69931DatabaseId;
   }

  
	/**
	*  set variable ip69931DatabaseId
	*  Corresponding COBOL Variable is IP69931-DATABASE-ID
	*  @param value
	**/
   public void setIp69931DatabaseId(char[] value) {
      ip69931DatabaseId = checkIp69931DatabaseIdConstraints(value);
      serializeIp69931DatabaseId(ip69931DatabaseId);
   } 

     /**
	 * 	Update Ip69931DatabaseId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp69931DatabaseId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp69931DatabaseId,ip69931DatabaseId.length);
   	
   }
   
   public void setIp69931DatabaseId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp69931DatabaseId,ip69931DatabaseId.length);
   	
   }
   
     /**
	 * 	Update Ip69931DatabaseId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69931DatabaseId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp69931DatabaseId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip69931DatabaseId with another Field
	 *	@param value
	 */
   public void setIp69931DatabaseId(Field source) {
       replace(source,0,source.length(),beginIp69931DatabaseId,IP_69931_DATABASE_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip69931DatabaseId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp69931DatabaseId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp69931DatabaseId,IP_69931_DATABASE_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip69931DatabaseId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69931DatabaseId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp69931DatabaseId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip69931CollectionId
	 *	@return ip69931CollectionId
	 */
   public char[] getIp69931CollectionId() throws CFException{
     if (isIp69931CollectionIdModified()) { 
        ip69931CollectionId = refreshIp69931CollectionId();
     }
   		return ip69931CollectionId;
   }

  
	/**
	*  set variable ip69931CollectionId
	*  Corresponding COBOL Variable is IP69931-COLLECTION-ID
	*  @param value
	**/
   public void setIp69931CollectionId(char[] value) {
      ip69931CollectionId = checkIp69931CollectionIdConstraints(value);
      serializeIp69931CollectionId(ip69931CollectionId);
   } 

     /**
	 * 	Update Ip69931CollectionId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp69931CollectionId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp69931CollectionId,ip69931CollectionId.length);
   	
   }
   
   public void setIp69931CollectionId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp69931CollectionId,ip69931CollectionId.length);
   	
   }
   
     /**
	 * 	Update Ip69931CollectionId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69931CollectionId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp69931CollectionId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip69931CollectionId with another Field
	 *	@param value
	 */
   public void setIp69931CollectionId(Field source) {
       replace(source,0,source.length(),beginIp69931CollectionId,IP_69931_COLLECTION_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip69931CollectionId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp69931CollectionId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp69931CollectionId,IP_69931_COLLECTION_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip69931CollectionId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69931CollectionId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp69931CollectionId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip69931WherePaProcessedSw
	 *	@return ip69931WherePaProcessedSw
	 */
	public short getIp69931WherePaProcessedSw() throws CFException {
       if (isIp69931WherePaProcessedSwModified()) { 
           ip69931WherePaProcessedSw = refreshIp69931WherePaProcessedSw();
        }
   		return ip69931WherePaProcessedSw;
	}
	

    /**
	 *	Returns the String value of ip69931WherePaProcessedSw
	 *	@return ip69931WherePaProcessedSw
	 */
	public char[]  getIp69931WherePaProcessedSwActualString() {
	    String value = String.valueOf(ip69931WherePaProcessedSw).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Ip69931WherePaProcessedSw with the passed value
	 *  Corresponding COBOL Variable is IP69931-WHERE-PA-PROCESSED-SW
	 *	@param number
	 */
	public void setIp69931WherePaProcessedSw(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip69931WherePaProcessedSw = checkIp69931WherePaProcessedSwMaxLimit(number); 
		serializeIp69931WherePaProcessedSw(ip69931WherePaProcessedSw);
	}
	
	public void setIp69931WherePaProcessedSw(int number) {
	    number = checkIp69931WherePaProcessedSwMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp69931WherePaProcessedSw((short)number);
	}
	public void setIp69931WherePaProcessedSw(long number) {
	    number = checkIp69931WherePaProcessedSwMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp69931WherePaProcessedSw((short)number);
	}
	

	/**
	 * 	Update Ip69931WherePaProcessedSw with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp69931WherePaProcessedSw(char[] value) throws CFException {
		 ip69931WherePaProcessedSw = serializeIp69931WherePaProcessedSw(value);
	}
	/**
	 * 	Update Ip69931WherePaProcessedSw with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp69931WherePaProcessedSwString(char[] value) throws CFException {
		 setIp69931WherePaProcessedSw(value);
	}
	
	/**
	 *	Test condition 0 for isIp69931PaProcessLocally88()
	 *	@return  Returns true if isIp69931PaProcessLocally88() is 0
	 */
   public boolean isIp69931PaProcessLocally88() throws CFException {
      return (  getIp69931WherePaProcessedSw()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setIp69931PaProcessLocally88True() {  			
    	setIp69931WherePaProcessedSw( (short)0);
   	}
	
	/**
	 *	Test condition 1 for isIp69931PaProcesRemotely88()
	 *	@return  Returns true if isIp69931PaProcesRemotely88() is 1
	 */
   public boolean isIp69931PaProcesRemotely88() throws CFException {
      return (  getIp69931WherePaProcessedSw()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setIp69931PaProcesRemotely88True() {  			
    	setIp69931WherePaProcessedSw( (short)1);
   	}
	
	/**
	 *	Test condition 2 for isIp69931PaProcesRegionaly88()
	 *	@return  Returns true if isIp69931PaProcesRegionaly88() is 2
	 */
   public boolean isIp69931PaProcesRegionaly88() throws CFException {
      return (  getIp69931WherePaProcessedSw()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setIp69931PaProcesRegionaly88True() {  			
    	setIp69931WherePaProcessedSw( (short)2);
   	}
	
	/**
	 *	Test condition 99 for isIp69931PaProcessUnknown88()
	 *	@return  Returns true if isIp69931PaProcessUnknown88() is 99
	 */
   public boolean isIp69931PaProcessUnknown88() throws CFException {
      return (  getIp69931WherePaProcessedSw()  ==  99  );
   }


	/**
	*  set values 99
	*/
   	public void setIp69931PaProcessUnknown88True() {  			
    	setIp69931WherePaProcessedSw( (short)99);
   	}
	/**
	 *	Returns the value of ip69931ResponseStatus
	 *	@return ip69931ResponseStatus
	 */
	public short getIp69931ResponseStatus() throws CFException {
       if (isIp69931ResponseStatusModified()) { 
           ip69931ResponseStatus = refreshIp69931ResponseStatus();
        }
   		return ip69931ResponseStatus;
	}
	

    /**
	 *	Returns the String value of ip69931ResponseStatus
	 *	@return ip69931ResponseStatus
	 */
	public char[]  getIp69931ResponseStatusActualString() {
	    String value = String.valueOf(ip69931ResponseStatus).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Ip69931ResponseStatus with the passed value
	 *  Corresponding COBOL Variable is IP69931-RESPONSE-STATUS
	 *	@param number
	 */
	public void setIp69931ResponseStatus(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip69931ResponseStatus = checkIp69931ResponseStatusMaxLimit(number); 
		serializeIp69931ResponseStatus(ip69931ResponseStatus);
	}
	
	public void setIp69931ResponseStatus(int number) {
	    number = checkIp69931ResponseStatusMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp69931ResponseStatus((short)number);
	}
	public void setIp69931ResponseStatus(long number) {
	    number = checkIp69931ResponseStatusMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp69931ResponseStatus((short)number);
	}
	

	/**
	 * 	Update Ip69931ResponseStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp69931ResponseStatus(char[] value) throws CFException {
		 ip69931ResponseStatus = serializeIp69931ResponseStatus(value);
	}
	/**
	 * 	Update Ip69931ResponseStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp69931ResponseStatusString(char[] value) throws CFException {
		 setIp69931ResponseStatus(value);
	}
	
	/**
	 *	Test condition 0 for isIp69931RequestSuccessful88()
	 *	@return  Returns true if isIp69931RequestSuccessful88() is 0
	 */
   public boolean isIp69931RequestSuccessful88() throws CFException {
      return (  getIp69931ResponseStatus()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setIp69931RequestSuccessful88True() {  			
    	setIp69931ResponseStatus( (short)0);
   	}
	
	/**
	 *	Test condition 1 for isIp69931RequestFailed88()
	 *	@return  Returns true if isIp69931RequestFailed88() is 1
	 */
   public boolean isIp69931RequestFailed88() throws CFException {
      return (  getIp69931ResponseStatus()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setIp69931RequestFailed88True() {  			
    	setIp69931ResponseStatus( (short)1);
   	}
	/**
	 *	Returns the value of ip69931ErrorMsg
	 *	@return ip69931ErrorMsg
	 */
   public char[] getIp69931ErrorMsg() throws CFException{
     if (isIp69931ErrorMsgModified()) { 
        ip69931ErrorMsg = refreshIp69931ErrorMsg();
     }
   		return ip69931ErrorMsg;
   }

  
	/**
	*  set variable ip69931ErrorMsg
	*  Corresponding COBOL Variable is IP69931-ERROR-MSG
	*  @param value
	**/
   public void setIp69931ErrorMsg(char[] value) {
      ip69931ErrorMsg = checkIp69931ErrorMsgConstraints(value);
      serializeIp69931ErrorMsg(ip69931ErrorMsg);
   } 

     /**
	 * 	Update Ip69931ErrorMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp69931ErrorMsg(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp69931ErrorMsg,ip69931ErrorMsg.length);
   	
   }
   
   public void setIp69931ErrorMsg(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp69931ErrorMsg,ip69931ErrorMsg.length);
   	
   }
   
     /**
	 * 	Update Ip69931ErrorMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ErrorMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp69931ErrorMsg+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip69931ErrorMsg with another Field
	 *	@param value
	 */
   public void setIp69931ErrorMsg(Field source) {
       replace(source,0,source.length(),beginIp69931ErrorMsg,IP_69931_ERROR_MSG_LEN);
   	
   }  
   
     /**
	 * 	Update Ip69931ErrorMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp69931ErrorMsg(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp69931ErrorMsg,IP_69931_ERROR_MSG_LEN);
   	
   }
   
     /**
	 * 	Update Ip69931ErrorMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69931ErrorMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp69931ErrorMsg+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip69931OutputFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp69931DatabaseId(CONSTANTS.SPACE_18);
         setIp69931CollectionId(CONSTANTS.SPACE_18);
         	setIp69931WherePaProcessedSw((short)0);
         	setIp69931ResponseStatus((short)0);
         setIp69931ErrorMsg(CONSTANTS.SPACE_80);
   }

		public static int getIp69931OutputFieldsFieldLength() {
			return IP_69931_OUTPUT_FIELDS_LENGTH;
		}

}
  

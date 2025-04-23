package com.cloudframe.app.ar640010.dto;

/**
*  The class ResponseMessage1000Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ResponseMessage1000Redefined extends ResponseMessage1000RedefinedSerialized { 
   

								private int responseEndptId1000;

								private short responseCyclNum1000;

						private char[] responseGftDsn1000 = Field.fillLowValue(44);
	
	/**
	* Constructor for ResponseMessage1000Redefined
	**/
    public ResponseMessage1000Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ResponseMessage1000Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ResponseMessage1000Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public int getResponseEndptId1000() throws CFException {
        if (isResponseEndptId1000Modified()) { 
           responseEndptId1000 = refreshResponseEndptId1000();
        }
   		return responseEndptId1000;
	}
	
	/**
	 * 	Update ResponseEndptId1000 with the passed value
	 *  Corresponding COBOL Variable is 1000-RESPONSE-ENDPT-ID
	 *	@param number
	 */
	public void setResponseEndptId1000(int number) {
			responseEndptId1000 = checkResponseEndptId1000MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeResponseEndptId1000(responseEndptId1000);
	}


	public void setResponseEndptId1000(long number) {
	    number = checkResponseEndptId1000MaxLimit(number); // Truncate if value is beyond +/- Max range
		setResponseEndptId1000((int)number);
	}
	
	public short getResponseCyclNum1000() throws CFException {
        if (isResponseCyclNum1000Modified()) { 
           responseCyclNum1000 = refreshResponseCyclNum1000();
        }
   		return responseCyclNum1000;
	}
	
	/**
	 * 	Update ResponseCyclNum1000 with the passed value
	 *  Corresponding COBOL Variable is 1000-RESPONSE-CYCL-NUM
	 *	@param number
	 */
	public void setResponseCyclNum1000(short number) {
			responseCyclNum1000 = checkResponseCyclNum1000MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeResponseCyclNum1000(responseCyclNum1000);
	}

	public void setResponseCyclNum1000(int number) {
	    number = checkResponseCyclNum1000MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setResponseCyclNum1000((short)number);
	}
	public void setResponseCyclNum1000(long number) {
	    number = checkResponseCyclNum1000MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setResponseCyclNum1000((short)number);
	}
	

	/**
	 *	Returns the value of responseGftDsn1000
	 *	@return responseGftDsn1000
	 */
   public char[] getResponseGftDsn1000() throws CFException{
     if (isResponseGftDsn1000Modified()) { 
        responseGftDsn1000 = refreshResponseGftDsn1000();
     }
   		return responseGftDsn1000;
   }

  
	/**
	*  set variable responseGftDsn1000
	*  Corresponding COBOL Variable is 1000-RESPONSE-GFT-DSN
	*  @param value
	**/
   public void setResponseGftDsn1000(char[] value) {
      responseGftDsn1000 = checkResponseGftDsn1000Constraints(value);
      serializeResponseGftDsn1000(responseGftDsn1000);
   } 

     /**
	 * 	Update ResponseGftDsn1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResponseGftDsn1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResponseGftDsn1000,responseGftDsn1000.length);
   	
   }
   
   public void setResponseGftDsn1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResponseGftDsn1000,responseGftDsn1000.length);
   	
   }
   
     /**
	 * 	Update ResponseGftDsn1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResponseGftDsn1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResponseGftDsn1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResponseGftDsn1000 with another Field
	 *	@param value
	 */
   public void setResponseGftDsn1000(Field source) {
       replace(source,0,source.length(),beginResponseGftDsn1000,RESPONSE_GFT_DSN_1000_LEN);
   	
   }  
   
     /**
	 * 	Update ResponseGftDsn1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResponseGftDsn1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResponseGftDsn1000,RESPONSE_GFT_DSN_1000_LEN);
   	
   }
   
     /**
	 * 	Update ResponseGftDsn1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResponseGftDsn1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResponseGftDsn1000+targetIndex,targetLen);
    
   }

	
	
	

		public static int getResponseMessage1000RedefinedFieldLength() {
			return RESPONSE_MESSAGE_1000_REDEFINED_LENGTH;
		}

}
  

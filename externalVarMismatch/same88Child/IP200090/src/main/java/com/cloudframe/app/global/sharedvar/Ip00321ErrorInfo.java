package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00321ErrorInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip00321ErrorInfo extends Ip00321ErrorInfoSerialized { 
   

								private int ip00321ErrorMsgSevCd;

								private int ip00321ErrorNumber;

								private int ip00321ErrorMessageNumber;

						private char[] ip00321IpmFieldType = Field.fillLowValue(1);

								private long ip00321IpmFieldNumber;

								private long ip00321IpmSubfieldNumber;
	
	/**
	* Constructor for Ip00321ErrorInfo
	**/
    public Ip00321ErrorInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00321ErrorInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00321ErrorInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00321ErrorMsgSevCd
	 *	@return ip00321ErrorMsgSevCd
	 */
	public int getIp00321ErrorMsgSevCd() throws CFException {
       if (isIp00321ErrorMsgSevCdModified()) { 
           ip00321ErrorMsgSevCd = refreshIp00321ErrorMsgSevCd();
        }
   		return ip00321ErrorMsgSevCd;
	}
	

	
	   
	/**
	 * 	Update Ip00321ErrorMsgSevCd with the passed value
	 *  Corresponding COBOL Variable is IP00321-ERROR-MSG-SEV-CD
	 *	@param number
	 */
	public void setIp00321ErrorMsgSevCd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00321ErrorMsgSevCd = checkIp00321ErrorMsgSevCdMaxLimit(number); 
		serializeIp00321ErrorMsgSevCd(ip00321ErrorMsgSevCd);
	}
	

	public void setIp00321ErrorMsgSevCd(long number) {
	    number = checkIp00321ErrorMsgSevCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00321ErrorMsgSevCd((int)number);
	}
	
	/**
	 * 	Update Ip00321ErrorMsgSevCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00321ErrorMsgSevCd(char[] value) throws CFException {
		 ip00321ErrorMsgSevCd = serializeIp00321ErrorMsgSevCd(value);
	}
	/**
	 * 	Update Ip00321ErrorMsgSevCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00321ErrorMsgSevCdString(char[] value) throws CFException {
		 setIp00321ErrorMsgSevCd(value);
	}
	/**
	 *	Returns the value of ip00321ErrorNumber
	 *	@return ip00321ErrorNumber
	 */
	public int getIp00321ErrorNumber() throws CFException {
       if (isIp00321ErrorNumberModified()) { 
           ip00321ErrorNumber = refreshIp00321ErrorNumber();
        }
   		return ip00321ErrorNumber;
	}
	

	
	   
	/**
	 * 	Update Ip00321ErrorNumber with the passed value
	 *  Corresponding COBOL Variable is IP00321-ERROR-NUMBER
	 *	@param number
	 */
	public void setIp00321ErrorNumber(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00321ErrorNumber = checkIp00321ErrorNumberMaxLimit(number); 
		serializeIp00321ErrorNumber(ip00321ErrorNumber);
	}
	

	public void setIp00321ErrorNumber(long number) {
	    number = checkIp00321ErrorNumberMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00321ErrorNumber((int)number);
	}
	
	/**
	 * 	Update Ip00321ErrorNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00321ErrorNumber(char[] value) throws CFException {
		 ip00321ErrorNumber = serializeIp00321ErrorNumber(value);
	}
	/**
	 * 	Update Ip00321ErrorNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00321ErrorNumberString(char[] value) throws CFException {
		 setIp00321ErrorNumber(value);
	}
	/**
	 *	Returns the value of ip00321ErrorMessageNumber
	 *	@return ip00321ErrorMessageNumber
	 */
	public int getIp00321ErrorMessageNumber() throws CFException {
       if (isIp00321ErrorMessageNumberModified()) { 
           ip00321ErrorMessageNumber = refreshIp00321ErrorMessageNumber();
        }
   		return ip00321ErrorMessageNumber;
	}
	

	
	   
	/**
	 * 	Update Ip00321ErrorMessageNumber with the passed value
	 *  Corresponding COBOL Variable is IP00321-ERROR-MESSAGE-NUMBER
	 *	@param number
	 */
	public void setIp00321ErrorMessageNumber(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00321ErrorMessageNumber = checkIp00321ErrorMessageNumberMaxLimit(number); 
		serializeIp00321ErrorMessageNumber(ip00321ErrorMessageNumber);
	}
	

	public void setIp00321ErrorMessageNumber(long number) {
	    number = checkIp00321ErrorMessageNumberMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00321ErrorMessageNumber((int)number);
	}
	
	/**
	 * 	Update Ip00321ErrorMessageNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00321ErrorMessageNumber(char[] value) throws CFException {
		 ip00321ErrorMessageNumber = serializeIp00321ErrorMessageNumber(value);
	}
	/**
	 * 	Update Ip00321ErrorMessageNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00321ErrorMessageNumberString(char[] value) throws CFException {
		 setIp00321ErrorMessageNumber(value);
	}
	/**
	 *	Returns the value of ip00321IpmFieldType
	 *	@return ip00321IpmFieldType
	 */
   public char[] getIp00321IpmFieldType() throws CFException{
     if (isIp00321IpmFieldTypeModified()) { 
        ip00321IpmFieldType = refreshIp00321IpmFieldType();
     }
   		return ip00321IpmFieldType;
   }

  
	/**
	*  set variable ip00321IpmFieldType
	*  Corresponding COBOL Variable is IP00321-IPM-FIELD-TYPE
	*  @param value
	**/
   public void setIp00321IpmFieldType(char[] value) {
      ip00321IpmFieldType = checkIp00321IpmFieldTypeConstraints(value);
      serializeIp00321IpmFieldType(ip00321IpmFieldType);
   } 

     /**
	 * 	Update Ip00321IpmFieldType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00321IpmFieldType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00321IpmFieldType,ip00321IpmFieldType.length);
   	
   }
   
   public void setIp00321IpmFieldType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00321IpmFieldType,ip00321IpmFieldType.length);
   	
   }
   
     /**
	 * 	Update Ip00321IpmFieldType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00321IpmFieldType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00321IpmFieldType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00321IpmFieldType with another Field
	 *	@param value
	 */
   public void setIp00321IpmFieldType(Field source) {
       replace(source,0,source.length(),beginIp00321IpmFieldType,IP_00321_IPM_FIELD_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00321IpmFieldType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00321IpmFieldType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00321IpmFieldType,IP_00321_IPM_FIELD_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Ip00321IpmFieldType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00321IpmFieldType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00321IpmFieldType+targetIndex,targetLen);
    
   }
	char[] ip00321MMti8888Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isIp00321MMti88()
	 *	@return  Returns true if isIp00321MMti88() is "1"
	 */
   public boolean isIp00321MMti88() throws CFException {
      return (  compareChars( getIp00321IpmFieldType() , ip00321MMti8888Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setIp00321MMti88True() {  			
    	setIp00321IpmFieldType( ip00321MMti8888Value);
   	}
	char[] ip00321DDataElement8888Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isIp00321DDataElement88()
	 *	@return  Returns true if isIp00321DDataElement88() is "2"
	 */
   public boolean isIp00321DDataElement88() throws CFException {
      return (  compareChars( getIp00321IpmFieldType() , ip00321DDataElement8888Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setIp00321DDataElement88True() {  			
    	setIp00321IpmFieldType( ip00321DDataElement8888Value);
   	}
	char[] ip00321PPds8888Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isIp00321PPds88()
	 *	@return  Returns true if isIp00321PPds88() is "3"
	 */
   public boolean isIp00321PPds88() throws CFException {
      return (  compareChars( getIp00321IpmFieldType() , ip00321PPds8888Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setIp00321PPds88True() {  			
    	setIp00321IpmFieldType( ip00321PPds8888Value);
   	}
	/**
	 *	Returns the value of ip00321IpmFieldNumber
	 *	@return ip00321IpmFieldNumber
	 */
	public long getIp00321IpmFieldNumber() throws CFException {
        if (isIp00321IpmFieldNumberModified()) { 
           ip00321IpmFieldNumber = refreshIp00321IpmFieldNumber();
        }
   		return ip00321IpmFieldNumber;
	}
	
	/**
	 * 	Update Ip00321IpmFieldNumber with the passed value
	 *  Corresponding COBOL Variable is IP00321-IPM-FIELD-NUMBER
	 *	@param number
	 */
	public void setIp00321IpmFieldNumber(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip00321IpmFieldNumber = checkIp00321IpmFieldNumberMaxLimit(number); 
		serializeIp00321IpmFieldNumber(ip00321IpmFieldNumber);
	}


	/**
	 *	Returns the value of ip00321IpmSubfieldNumber
	 *	@return ip00321IpmSubfieldNumber
	 */
	public long getIp00321IpmSubfieldNumber() throws CFException {
        if (isIp00321IpmSubfieldNumberModified()) { 
           ip00321IpmSubfieldNumber = refreshIp00321IpmSubfieldNumber();
        }
   		return ip00321IpmSubfieldNumber;
	}
	
	/**
	 * 	Update Ip00321IpmSubfieldNumber with the passed value
	 *  Corresponding COBOL Variable is IP00321-IPM-SUBFIELD-NUMBER
	 *	@param number
	 */
	public void setIp00321IpmSubfieldNumber(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip00321IpmSubfieldNumber = checkIp00321IpmSubfieldNumberMaxLimit(number); 
		serializeIp00321IpmSubfieldNumber(ip00321IpmSubfieldNumber);
	}



	
	
	
	/**
	 * 	initializes Ip00321ErrorInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp00321ErrorMsgSevCd(0);
                     setIp00321ErrorNumber(0);
                     setIp00321ErrorMessageNumber(0);
         setIp00321IpmFieldType(CONSTANTS.SPACE);
                     setIp00321IpmFieldNumber(0);
                     setIp00321IpmSubfieldNumber(0);
   }

		public static int getIp00321ErrorInfoFieldLength() {
			return IP_00321_ERROR_INFO_LENGTH;
		}

}
  

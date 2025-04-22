package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip2ooo1ErrorInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip2ooo1ErrorInfo extends Ip2ooo1ErrorInfoSerialized { 
   
				private Ip2ooo1ErrorIndex ip2ooo1ErrorIndex = new Ip2ooo1ErrorIndex();

								private int ip2ooo1ErrorMsgNumber;

						private char[] ip2ooo1IpmFieldType = Field.fillLowValue(1);

								private long ip2ooo1IpmFieldNumber;

								private long ip2ooo1IpmSubfldNumber;
	
	/**
	* Constructor for Ip2ooo1ErrorInfo
	**/
    public Ip2ooo1ErrorInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip2ooo1ErrorInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip2ooo1ErrorInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip2ooo1ErrorIndex.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ip2ooo1ErrorIndex
	 *	@return ip2ooo1ErrorIndex
	 */   
	 public Ip2ooo1ErrorIndex getIp2ooo1ErrorIndex() {
   	return ip2ooo1ErrorIndex;
   }
   /**
	* 	Update Ip2ooo1ErrorIndex with the passed value
	*   Corresponding COBOL Variable is IP2OOO1-ERROR-INDEX
	*	@param value
	*/
   public void setIp2ooo1ErrorIndex(char[] value) {
      ip2ooo1ErrorIndex.setString(value); 
   }   
    
     /**
	 * 	Update Ip2ooo1ErrorIndex 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp2ooo1ErrorIndex(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip2ooo1ErrorIndex.begin,ip2ooo1ErrorIndex.length());
   }
   
     /**
	 * 	Update Ip2ooo1ErrorIndex 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp2ooo1ErrorIndex(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip2ooo1ErrorIndex.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip2ooo1ErrorIndex with another Field
	 *	@param value
	 */
   public void setIp2ooo1ErrorIndex(Field source) {
   	replace(source,0,source.length(),ip2ooo1ErrorIndex.begin,ip2ooo1ErrorIndex.length());
   }  
   
     /**
	 * 	Update Ip2ooo1ErrorIndex 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp2ooo1ErrorIndex(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip2ooo1ErrorIndex.begin,ip2ooo1ErrorIndex.length());
   }
   
     /**
	 * 	Update Ip2ooo1ErrorIndex 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp2ooo1ErrorIndex(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip2ooo1ErrorIndex.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip2ooo1ErrorMsgNumber
	 *	@return ip2ooo1ErrorMsgNumber
	 */
	public int getIp2ooo1ErrorMsgNumber() throws CFException {
       if (isIp2ooo1ErrorMsgNumberModified()) { 
           ip2ooo1ErrorMsgNumber = refreshIp2ooo1ErrorMsgNumber();
        }
   		return ip2ooo1ErrorMsgNumber;
	}
	

	
	   
	/**
	 * 	Update Ip2ooo1ErrorMsgNumber with the passed value
	 *  Corresponding COBOL Variable is IP2OOO1-ERROR-MSG-NUMBER
	 *	@param number
	 */
	public void setIp2ooo1ErrorMsgNumber(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip2ooo1ErrorMsgNumber = checkIp2ooo1ErrorMsgNumberMaxLimit(number); 
		serializeIp2ooo1ErrorMsgNumber(ip2ooo1ErrorMsgNumber);
	}
	

	public void setIp2ooo1ErrorMsgNumber(long number) {
	    number = checkIp2ooo1ErrorMsgNumberMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp2ooo1ErrorMsgNumber((int)number);
	}
	
	/**
	 * 	Update Ip2ooo1ErrorMsgNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp2ooo1ErrorMsgNumber(char[] value) throws CFException {
		 ip2ooo1ErrorMsgNumber = serializeIp2ooo1ErrorMsgNumber(value);
	}
	/**
	 * 	Update Ip2ooo1ErrorMsgNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp2ooo1ErrorMsgNumberString(char[] value) throws CFException {
		 setIp2ooo1ErrorMsgNumber(value);
	}
	/**
	 *	Returns the value of ip2ooo1IpmFieldType
	 *	@return ip2ooo1IpmFieldType
	 */
   public char[] getIp2ooo1IpmFieldType() throws CFException{
     if (isIp2ooo1IpmFieldTypeModified()) { 
        ip2ooo1IpmFieldType = refreshIp2ooo1IpmFieldType();
     }
   		return ip2ooo1IpmFieldType;
   }

  
	/**
	*  set variable ip2ooo1IpmFieldType
	*  Corresponding COBOL Variable is IP2OOO1-IPM-FIELD-TYPE
	*  @param value
	**/
   public void setIp2ooo1IpmFieldType(char[] value) {
      ip2ooo1IpmFieldType = checkIp2ooo1IpmFieldTypeConstraints(value);
      serializeIp2ooo1IpmFieldType(ip2ooo1IpmFieldType);
   } 

     /**
	 * 	Update Ip2ooo1IpmFieldType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp2ooo1IpmFieldType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp2ooo1IpmFieldType,ip2ooo1IpmFieldType.length);
   	
   }
   
   public void setIp2ooo1IpmFieldType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp2ooo1IpmFieldType,ip2ooo1IpmFieldType.length);
   	
   }
   
     /**
	 * 	Update Ip2ooo1IpmFieldType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp2ooo1IpmFieldType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp2ooo1IpmFieldType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip2ooo1IpmFieldType with another Field
	 *	@param value
	 */
   public void setIp2ooo1IpmFieldType(Field source) {
       replace(source,0,source.length(),beginIp2ooo1IpmFieldType,IP_2OOO_1_IPM_FIELD_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip2ooo1IpmFieldType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp2ooo1IpmFieldType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp2ooo1IpmFieldType,IP_2OOO_1_IPM_FIELD_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Ip2ooo1IpmFieldType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp2ooo1IpmFieldType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp2ooo1IpmFieldType+targetIndex,targetLen);
    
   }
	char[] ip2ooo1MMti8888Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isIp2ooo1MMti88()
	 *	@return  Returns true if isIp2ooo1MMti88() is "1"
	 */
   public boolean isIp2ooo1MMti88() throws CFException {
      return (  compareChars( getIp2ooo1IpmFieldType() , ip2ooo1MMti8888Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setIp2ooo1MMti88True() {  			
    	setIp2ooo1IpmFieldType( ip2ooo1MMti8888Value);
   	}
	char[] ip2ooo1DDataElement8888Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isIp2ooo1DDataElement88()
	 *	@return  Returns true if isIp2ooo1DDataElement88() is "2"
	 */
   public boolean isIp2ooo1DDataElement88() throws CFException {
      return (  compareChars( getIp2ooo1IpmFieldType() , ip2ooo1DDataElement8888Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setIp2ooo1DDataElement88True() {  			
    	setIp2ooo1IpmFieldType( ip2ooo1DDataElement8888Value);
   	}
	char[] ip2ooo1PPds8888Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isIp2ooo1PPds88()
	 *	@return  Returns true if isIp2ooo1PPds88() is "3"
	 */
   public boolean isIp2ooo1PPds88() throws CFException {
      return (  compareChars( getIp2ooo1IpmFieldType() , ip2ooo1PPds8888Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setIp2ooo1PPds88True() {  			
    	setIp2ooo1IpmFieldType( ip2ooo1PPds8888Value);
   	}
	/**
	 *	Returns the value of ip2ooo1IpmFieldNumber
	 *	@return ip2ooo1IpmFieldNumber
	 */
	public long getIp2ooo1IpmFieldNumber() throws CFException {
        if (isIp2ooo1IpmFieldNumberModified()) { 
           ip2ooo1IpmFieldNumber = refreshIp2ooo1IpmFieldNumber();
        }
   		return ip2ooo1IpmFieldNumber;
	}
	
	/**
	 * 	Update Ip2ooo1IpmFieldNumber with the passed value
	 *  Corresponding COBOL Variable is IP2OOO1-IPM-FIELD-NUMBER
	 *	@param number
	 */
	public void setIp2ooo1IpmFieldNumber(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip2ooo1IpmFieldNumber = checkIp2ooo1IpmFieldNumberMaxLimit(number); 
		serializeIp2ooo1IpmFieldNumber(ip2ooo1IpmFieldNumber);
	}


	/**
	 *	Returns the value of ip2ooo1IpmSubfldNumber
	 *	@return ip2ooo1IpmSubfldNumber
	 */
	public long getIp2ooo1IpmSubfldNumber() throws CFException {
        if (isIp2ooo1IpmSubfldNumberModified()) { 
           ip2ooo1IpmSubfldNumber = refreshIp2ooo1IpmSubfldNumber();
        }
   		return ip2ooo1IpmSubfldNumber;
	}
	
	/**
	 * 	Update Ip2ooo1IpmSubfldNumber with the passed value
	 *  Corresponding COBOL Variable is IP2OOO1-IPM-SUBFLD-NUMBER
	 *	@param number
	 */
	public void setIp2ooo1IpmSubfldNumber(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip2ooo1IpmSubfldNumber = checkIp2ooo1IpmSubfldNumberMaxLimit(number); 
		serializeIp2ooo1IpmSubfldNumber(ip2ooo1IpmSubfldNumber);
	}



	
	
	
	/**
	 * 	initializes Ip2ooo1ErrorInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip2ooo1ErrorIndex.initialize();
     
                     setIp2ooo1ErrorMsgNumber(0);
         setIp2ooo1IpmFieldType(CONSTANTS.SPACE);
                     setIp2ooo1IpmFieldNumber(0);
                     setIp2ooo1IpmSubfldNumber(0);
   }

		public static int getIp2ooo1ErrorInfoFieldLength() {
			return IP_2OOO_1_ERROR_INFO_LENGTH;
		}

}
  

package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip30331ErrorInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:21. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip30331ErrorInfo extends Ip30331ErrorInfoSerialized { 
   
				private Ip30331ErrorIndex ip30331ErrorIndex = new Ip30331ErrorIndex();

								private int ip30331ErrorMsgNumber;
	
	/**
	* Constructor for Ip30331ErrorInfo
	**/
    public Ip30331ErrorInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip30331ErrorInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip30331ErrorInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip30331ErrorIndex.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ip30331ErrorIndex
	 *	@return ip30331ErrorIndex
	 */   
	 public Ip30331ErrorIndex getIp30331ErrorIndex() {
   	return ip30331ErrorIndex;
   }
   /**
	* 	Update Ip30331ErrorIndex with the passed value
	*   Corresponding COBOL Variable is IP30331-ERROR-INDEX
	*	@param value
	*/
   public void setIp30331ErrorIndex(char[] value) {
      ip30331ErrorIndex.setString(value); 
   }   
    
     /**
	 * 	Update Ip30331ErrorIndex 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp30331ErrorIndex(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip30331ErrorIndex.begin,ip30331ErrorIndex.length());
   }
   
     /**
	 * 	Update Ip30331ErrorIndex 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp30331ErrorIndex(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip30331ErrorIndex.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip30331ErrorIndex with another Field
	 *	@param value
	 */
   public void setIp30331ErrorIndex(Field source) {
   	replace(source,0,source.length(),ip30331ErrorIndex.begin,ip30331ErrorIndex.length());
   }  
   
     /**
	 * 	Update Ip30331ErrorIndex 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp30331ErrorIndex(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip30331ErrorIndex.begin,ip30331ErrorIndex.length());
   }
   
     /**
	 * 	Update Ip30331ErrorIndex 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp30331ErrorIndex(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip30331ErrorIndex.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip30331ErrorMsgNumber
	 *	@return ip30331ErrorMsgNumber
	 */
	public int getIp30331ErrorMsgNumber() throws CFException {
       if (isIp30331ErrorMsgNumberModified()) { 
           ip30331ErrorMsgNumber = refreshIp30331ErrorMsgNumber();
        }
   		return ip30331ErrorMsgNumber;
	}
	

	
	   
	/**
	 * 	Update Ip30331ErrorMsgNumber with the passed value
	 *  Corresponding COBOL Variable is IP30331-ERROR-MSG-NUMBER
	 *	@param number
	 */
	public void setIp30331ErrorMsgNumber(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip30331ErrorMsgNumber = checkIp30331ErrorMsgNumberMaxLimit(number); 
		serializeIp30331ErrorMsgNumber(ip30331ErrorMsgNumber);
	}
	

	public void setIp30331ErrorMsgNumber(long number) {
	    number = checkIp30331ErrorMsgNumberMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp30331ErrorMsgNumber((int)number);
	}
	
	/**
	 * 	Update Ip30331ErrorMsgNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp30331ErrorMsgNumber(char[] value) throws CFException {
		 ip30331ErrorMsgNumber = serializeIp30331ErrorMsgNumber(value);
	}
	/**
	 * 	Update Ip30331ErrorMsgNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp30331ErrorMsgNumberString(char[] value) throws CFException {
		 setIp30331ErrorMsgNumber(value);
	}

	
	
	
	/**
	 * 	initializes Ip30331ErrorInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip30331ErrorIndex.initialize();
     
                     setIp30331ErrorMsgNumber(0);
   }

		public static int getIp30331ErrorInfoFieldLength() {
			return IP_30331_ERROR_INFO_LENGTH;
		}

}
  

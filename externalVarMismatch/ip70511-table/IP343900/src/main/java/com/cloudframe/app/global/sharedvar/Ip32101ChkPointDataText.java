package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip32101ChkPointDataText is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:25. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip32101ChkPointDataText extends Ip32101ChkPointDataTextSerialized { 
   

								private short ip32101ChkPointDataTxtLen;

						private char[] ip32101ChkPointDataTxtTxt = Field.fillLowValue(254);
	
	/**
	* Constructor for Ip32101ChkPointDataText
	**/
    public Ip32101ChkPointDataText() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip32101ChkPointDataText. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip32101ChkPointDataText(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip32101ChkPointDataTxtLen
	 *	@return ip32101ChkPointDataTxtLen
	 */
	public short getIp32101ChkPointDataTxtLen() throws CFException {
        if (isIp32101ChkPointDataTxtLenModified()) { 
           ip32101ChkPointDataTxtLen = refreshIp32101ChkPointDataTxtLen();
        }
   		return ip32101ChkPointDataTxtLen;
	}
	
	/**
	 * 	Update Ip32101ChkPointDataTxtLen with the passed value
	 *  Corresponding COBOL Variable is IP32101-CHK-POINT-DATA-TXT-LEN
	 *	@param number
	 */
	public void setIp32101ChkPointDataTxtLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip32101ChkPointDataTxtLen = checkIp32101ChkPointDataTxtLenMaxLimit(number); 
		serializeIp32101ChkPointDataTxtLen(ip32101ChkPointDataTxtLen);
	}

	public void setIp32101ChkPointDataTxtLen(int number) {
	    number = checkIp32101ChkPointDataTxtLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp32101ChkPointDataTxtLen((short)number);
	}
	public void setIp32101ChkPointDataTxtLen(long number) {
	    number = checkIp32101ChkPointDataTxtLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp32101ChkPointDataTxtLen((short)number);
	}
	

	/**
	 *	Returns the value of ip32101ChkPointDataTxtTxt
	 *	@return ip32101ChkPointDataTxtTxt
	 */
   public char[] getIp32101ChkPointDataTxtTxt() throws CFException{
     if (isIp32101ChkPointDataTxtTxtModified()) { 
        ip32101ChkPointDataTxtTxt = refreshIp32101ChkPointDataTxtTxt();
     }
   		return ip32101ChkPointDataTxtTxt;
   }

  
	/**
	*  set variable ip32101ChkPointDataTxtTxt
	*  Corresponding COBOL Variable is IP32101-CHK-POINT-DATA-TXT-TXT
	*  @param value
	**/
   public void setIp32101ChkPointDataTxtTxt(char[] value) {
      ip32101ChkPointDataTxtTxt = checkIp32101ChkPointDataTxtTxtConstraints(value);
      serializeIp32101ChkPointDataTxtTxt(ip32101ChkPointDataTxtTxt);
   } 

     /**
	 * 	Update Ip32101ChkPointDataTxtTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp32101ChkPointDataTxtTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp32101ChkPointDataTxtTxt,ip32101ChkPointDataTxtTxt.length);
   	
   }
   
   public void setIp32101ChkPointDataTxtTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101ChkPointDataTxtTxt,ip32101ChkPointDataTxtTxt.length);
   	
   }
   
     /**
	 * 	Update Ip32101ChkPointDataTxtTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp32101ChkPointDataTxtTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101ChkPointDataTxtTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip32101ChkPointDataTxtTxt with another Field
	 *	@param value
	 */
   public void setIp32101ChkPointDataTxtTxt(Field source) {
       replace(source,0,source.length(),beginIp32101ChkPointDataTxtTxt,IP_32101_CHK_POINT_DATA_TXT_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip32101ChkPointDataTxtTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp32101ChkPointDataTxtTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp32101ChkPointDataTxtTxt,IP_32101_CHK_POINT_DATA_TXT_TXT_LEN);
   	
   }
   
     /**
	 * 	Update Ip32101ChkPointDataTxtTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp32101ChkPointDataTxtTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101ChkPointDataTxtTxt+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip32101ChkPointDataText
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp32101ChkPointDataTxtLen((short)0);
         setIp32101ChkPointDataTxtTxt(CONSTANTS.SPACE_254);
   }

		public static int getIp32101ChkPointDataTextFieldLength() {
			return IP_32101_CHK_POINT_DATA_TEXT_LENGTH;
		}

}
  

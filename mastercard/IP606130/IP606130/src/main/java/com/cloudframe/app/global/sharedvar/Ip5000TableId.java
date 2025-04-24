package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip5000TableId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip5000TableId extends Ip5000TableIdSerialized { 
   


						private char[] ip5000TableNo = Field.fillLowValue(4);

								private int ip5000TableNo9;

	
	/**
	* Constructor for Ip5000TableId
	**/
    public Ip5000TableId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip5000TableId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip5000TableId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip5000TableNo
	 *	@return ip5000TableNo
	 */
   public char[] getIp5000TableNo() throws CFException{
     if (isIp5000TableNoModified()) { 
        ip5000TableNo = refreshIp5000TableNo();
     }
   		return ip5000TableNo;
   }

  
	/**
	*  set variable ip5000TableNo
	*  Corresponding COBOL Variable is IP5000-TABLE-NO
	*  @param value
	**/
   public void setIp5000TableNo(char[] value) {
      ip5000TableNo = checkIp5000TableNoConstraints(value);
      serializeIp5000TableNo(ip5000TableNo);
   } 

     /**
	 * 	Update Ip5000TableNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp5000TableNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp5000TableNo,ip5000TableNo.length);
   	
   }
   
   public void setIp5000TableNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp5000TableNo,ip5000TableNo.length);
   	
   }
   
     /**
	 * 	Update Ip5000TableNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp5000TableNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp5000TableNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip5000TableNo with another Field
	 *	@param value
	 */
   public void setIp5000TableNo(Field source) {
       replace(source,0,source.length(),beginIp5000TableNo,IP_5000_TABLE_NO_LEN);
   	
   }  
   
     /**
	 * 	Update Ip5000TableNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp5000TableNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp5000TableNo,IP_5000_TABLE_NO_LEN);
   	
   }
   
     /**
	 * 	Update Ip5000TableNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp5000TableNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp5000TableNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip5000TableNo9
	 *	@return ip5000TableNo9
	 */
	public int getIp5000TableNo9() throws CFException {
       if (isIp5000TableNo9Modified()) { 
           ip5000TableNo9 = refreshIp5000TableNo9();
        }
   		return ip5000TableNo9;
	}
	

	
	   
	/**
	 * 	Update Ip5000TableNo9 with the passed value
	 *  Corresponding COBOL Variable is IP5000-TABLE-NO-9
	 *	@param number
	 */
	public void setIp5000TableNo9(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip5000TableNo9 = checkIp5000TableNo9MaxLimit(number); 
		serializeIp5000TableNo9(ip5000TableNo9);
	}
	

	public void setIp5000TableNo9(long number) {
	    number = checkIp5000TableNo9MaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp5000TableNo9((int)number);
	}
	
	/**
	 * 	Update Ip5000TableNo9 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp5000TableNo9(char[] value) throws CFException {
		 ip5000TableNo9 = serializeIp5000TableNo9(value);
	}
	/**
	 * 	Update Ip5000TableNo9 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp5000TableNo9String(char[] value) throws CFException {
		 setIp5000TableNo9(value);
	}

	
	
	
	/**
	 * 	initializes Ip5000TableId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp5000TableNo(CONSTANTS.SPACE_4);
   }

		public static int getIp5000TableIdFieldLength() {
			return IP_5000_TABLE_ID_LENGTH;
		}

}
  

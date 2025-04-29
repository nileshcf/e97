package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0040TableId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip0040TableId extends Ip0040TableIdSerialized { 
   


						private char[] ip0040TableNo = Field.fillLowValue(4);

	
	/**
	* Constructor for Ip0040TableId
	**/
    public Ip0040TableId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0040TableId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040TableId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip0040TableNo
	 *	@return ip0040TableNo
	 */
   public char[] getIp0040TableNo() throws CFException{
     if (isIp0040TableNoModified()) { 
        ip0040TableNo = refreshIp0040TableNo();
     }
   		return ip0040TableNo;
   }

  
	/**
	*  set variable ip0040TableNo
	*  Corresponding COBOL Variable is IP0040-TABLE-NO
	*  @param value
	**/
   public void setIp0040TableNo(char[] value) {
      ip0040TableNo = checkIp0040TableNoConstraints(value);
      serializeIp0040TableNo(ip0040TableNo);
   } 

     /**
	 * 	Update Ip0040TableNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040TableNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040TableNo,ip0040TableNo.length);
   	
   }
   
   public void setIp0040TableNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040TableNo,ip0040TableNo.length);
   	
   }
   
     /**
	 * 	Update Ip0040TableNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040TableNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040TableNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040TableNo with another Field
	 *	@param value
	 */
   public void setIp0040TableNo(Field source) {
       replace(source,0,source.length(),beginIp0040TableNo,IP_0040_TABLE_NO_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040TableNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040TableNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040TableNo,IP_0040_TABLE_NO_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040TableNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040TableNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040TableNo+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip0040TableId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp0040TableNo(CONSTANTS.SPACE_4);
   }

		public static int getIp0040TableIdFieldLength() {
			return IP_0040_TABLE_ID_LENGTH;
		}

}
  

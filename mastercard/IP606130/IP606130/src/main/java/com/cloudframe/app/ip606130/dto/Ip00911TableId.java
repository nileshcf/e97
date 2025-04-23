package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip00911TableId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip00911TableId extends Ip00911TableIdSerialized { 
   


						private char[] ip00911TableNo = Field.fillLowValue(4);

	
	/**
	* Constructor for Ip00911TableId
	**/
    public Ip00911TableId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00911TableId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00911TableId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00911TableNo
	 *	@return ip00911TableNo
	 */
   public char[] getIp00911TableNo() throws CFException{
     if (isIp00911TableNoModified()) { 
        ip00911TableNo = refreshIp00911TableNo();
     }
   		return ip00911TableNo;
   }

  
	/**
	*  set variable ip00911TableNo
	*  Corresponding COBOL Variable is IP00911-TABLE-NO
	*  @param value
	**/
   public void setIp00911TableNo(char[] value) {
      ip00911TableNo = checkIp00911TableNoConstraints(value);
      serializeIp00911TableNo(ip00911TableNo);
   } 

     /**
	 * 	Update Ip00911TableNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00911TableNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00911TableNo,ip00911TableNo.length);
   	
   }
   
   public void setIp00911TableNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00911TableNo,ip00911TableNo.length);
   	
   }
   
     /**
	 * 	Update Ip00911TableNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00911TableNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00911TableNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00911TableNo with another Field
	 *	@param value
	 */
   public void setIp00911TableNo(Field source) {
       replace(source,0,source.length(),beginIp00911TableNo,IP_00911_TABLE_NO_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00911TableNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00911TableNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00911TableNo,IP_00911_TABLE_NO_LEN);
   	
   }
   
     /**
	 * 	Update Ip00911TableNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00911TableNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00911TableNo+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip00911TableId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00911TableNo(CONSTANTS.SPACE_4);
   }

		public static int getIp00911TableIdFieldLength() {
			return IP_00911_TABLE_ID_LENGTH;
		}

}
  

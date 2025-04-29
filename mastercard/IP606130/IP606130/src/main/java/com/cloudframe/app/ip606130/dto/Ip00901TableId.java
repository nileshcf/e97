package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip00901TableId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip00901TableId extends Ip00901TableIdSerialized { 
   


						private char[] ip00901TableNo = Field.fillLowValue(4);

	
	/**
	* Constructor for Ip00901TableId
	**/
    public Ip00901TableId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00901TableId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00901TableId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00901TableNo
	 *	@return ip00901TableNo
	 */
   public char[] getIp00901TableNo() throws CFException{
     if (isIp00901TableNoModified()) { 
        ip00901TableNo = refreshIp00901TableNo();
     }
   		return ip00901TableNo;
   }

  
	/**
	*  set variable ip00901TableNo
	*  Corresponding COBOL Variable is IP00901-TABLE-NO
	*  @param value
	**/
   public void setIp00901TableNo(char[] value) {
      ip00901TableNo = checkIp00901TableNoConstraints(value);
      serializeIp00901TableNo(ip00901TableNo);
   } 

     /**
	 * 	Update Ip00901TableNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00901TableNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00901TableNo,ip00901TableNo.length);
   	
   }
   
   public void setIp00901TableNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901TableNo,ip00901TableNo.length);
   	
   }
   
     /**
	 * 	Update Ip00901TableNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00901TableNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901TableNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00901TableNo with another Field
	 *	@param value
	 */
   public void setIp00901TableNo(Field source) {
       replace(source,0,source.length(),beginIp00901TableNo,IP_00901_TABLE_NO_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00901TableNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00901TableNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00901TableNo,IP_00901_TABLE_NO_LEN);
   	
   }
   
     /**
	 * 	Update Ip00901TableNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00901TableNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901TableNo+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip00901TableId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00901TableNo(CONSTANTS.SPACE_4);
   }

		public static int getIp00901TableIdFieldLength() {
			return IP_00901_TABLE_ID_LENGTH;
		}

}
  

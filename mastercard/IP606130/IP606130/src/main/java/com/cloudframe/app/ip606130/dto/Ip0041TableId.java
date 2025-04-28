package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0041TableId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip0041TableId extends Ip0041TableIdSerialized { 
   


						private char[] ip0041TableNo = Field.fillLowValue(4);

	
	/**
	* Constructor for Ip0041TableId
	**/
    public Ip0041TableId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0041TableId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0041TableId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip0041TableNo
	 *	@return ip0041TableNo
	 */
   public char[] getIp0041TableNo() throws CFException{
     if (isIp0041TableNoModified()) { 
        ip0041TableNo = refreshIp0041TableNo();
     }
   		return ip0041TableNo;
   }

  
	/**
	*  set variable ip0041TableNo
	*  Corresponding COBOL Variable is IP0041-TABLE-NO
	*  @param value
	**/
   public void setIp0041TableNo(char[] value) {
      ip0041TableNo = checkIp0041TableNoConstraints(value);
      serializeIp0041TableNo(ip0041TableNo);
   } 

     /**
	 * 	Update Ip0041TableNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0041TableNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0041TableNo,ip0041TableNo.length);
   	
   }
   
   public void setIp0041TableNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041TableNo,ip0041TableNo.length);
   	
   }
   
     /**
	 * 	Update Ip0041TableNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0041TableNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041TableNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0041TableNo with another Field
	 *	@param value
	 */
   public void setIp0041TableNo(Field source) {
       replace(source,0,source.length(),beginIp0041TableNo,IP_0041_TABLE_NO_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0041TableNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0041TableNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0041TableNo,IP_0041_TABLE_NO_LEN);
   	
   }
   
     /**
	 * 	Update Ip0041TableNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0041TableNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041TableNo+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip0041TableId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp0041TableNo(CONSTANTS.SPACE_4);
   }

		public static int getIp0041TableIdFieldLength() {
			return IP_0041_TABLE_ID_LENGTH;
		}

}
  

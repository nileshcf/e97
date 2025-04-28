package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip500041TableId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip500041TableId extends Ip500041TableIdSerialized { 
   


						private char[] ip500041TableNo = Field.fillLowValue(4);

						private char[] ip500041TableVersion = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip500041TableId
	**/
    public Ip500041TableId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip500041TableId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip500041TableId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip500041TableNo
	 *	@return ip500041TableNo
	 */
   public char[] getIp500041TableNo() throws CFException{
     if (isIp500041TableNoModified()) { 
        ip500041TableNo = refreshIp500041TableNo();
     }
   		return ip500041TableNo;
   }

  
	/**
	*  set variable ip500041TableNo
	*  Corresponding COBOL Variable is IP500041-TABLE-NO
	*  @param value
	**/
   public void setIp500041TableNo(char[] value) {
      ip500041TableNo = checkIp500041TableNoConstraints(value);
      serializeIp500041TableNo(ip500041TableNo);
   } 

     /**
	 * 	Update Ip500041TableNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp500041TableNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp500041TableNo,ip500041TableNo.length);
   	
   }
   
   public void setIp500041TableNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp500041TableNo,ip500041TableNo.length);
   	
   }
   
     /**
	 * 	Update Ip500041TableNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp500041TableNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp500041TableNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip500041TableNo with another Field
	 *	@param value
	 */
   public void setIp500041TableNo(Field source) {
       replace(source,0,source.length(),beginIp500041TableNo,IP_500041_TABLE_NO_LEN);
   	
   }  
   
     /**
	 * 	Update Ip500041TableNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp500041TableNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp500041TableNo,IP_500041_TABLE_NO_LEN);
   	
   }
   
     /**
	 * 	Update Ip500041TableNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp500041TableNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp500041TableNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip500041TableVersion
	 *	@return ip500041TableVersion
	 */
   public char[] getIp500041TableVersion() throws CFException{
     if (isIp500041TableVersionModified()) { 
        ip500041TableVersion = refreshIp500041TableVersion();
     }
   		return ip500041TableVersion;
   }

  
	/**
	*  set variable ip500041TableVersion
	*  Corresponding COBOL Variable is IP500041-TABLE-VERSION
	*  @param value
	**/
   public void setIp500041TableVersion(char[] value) {
      ip500041TableVersion = checkIp500041TableVersionConstraints(value);
      serializeIp500041TableVersion(ip500041TableVersion);
   } 

     /**
	 * 	Update Ip500041TableVersion 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp500041TableVersion(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp500041TableVersion,ip500041TableVersion.length);
   	
   }
   
   public void setIp500041TableVersion(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp500041TableVersion,ip500041TableVersion.length);
   	
   }
   
     /**
	 * 	Update Ip500041TableVersion 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp500041TableVersion(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp500041TableVersion+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip500041TableVersion with another Field
	 *	@param value
	 */
   public void setIp500041TableVersion(Field source) {
       replace(source,0,source.length(),beginIp500041TableVersion,IP_500041_TABLE_VERSION_LEN);
   	
   }  
   
     /**
	 * 	Update Ip500041TableVersion 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp500041TableVersion(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp500041TableVersion,IP_500041_TABLE_VERSION_LEN);
   	
   }
   
     /**
	 * 	Update Ip500041TableVersion 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp500041TableVersion(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp500041TableVersion+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip500041TableId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp500041TableNo(CONSTANTS.SPACE_4);
         setIp500041TableVersion(CONSTANTS.SPACE_2);
   }

		public static int getIp500041TableIdFieldLength() {
			return IP_500041_TABLE_ID_LENGTH;
		}

}
  

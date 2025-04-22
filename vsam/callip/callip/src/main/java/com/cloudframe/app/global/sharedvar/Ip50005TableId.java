package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50005TableId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:07. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip50005TableId extends Ip50005TableIdSerialized { 
   


						private char[] ip50005TableNo = Field.fillLowValue(4);

						private char[] ip50005TableVersion = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip50005TableId
	**/
    public Ip50005TableId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip50005TableId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50005TableId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip50005TableNo
	 *	@return ip50005TableNo
	 */
   public char[] getIp50005TableNo() throws CFException{
     if (isIp50005TableNoModified()) { 
        ip50005TableNo = refreshIp50005TableNo();
     }
   		return ip50005TableNo;
   }

  
	/**
	*  set variable ip50005TableNo
	*  Corresponding COBOL Variable is IP50005-TABLE-NO
	*  @param value
	**/
   public void setIp50005TableNo(char[] value) {
      ip50005TableNo = checkIp50005TableNoConstraints(value);
      serializeIp50005TableNo(ip50005TableNo);
   } 

     /**
	 * 	Update Ip50005TableNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50005TableNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50005TableNo,ip50005TableNo.length);
   	
   }
   
   public void setIp50005TableNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005TableNo,ip50005TableNo.length);
   	
   }
   
     /**
	 * 	Update Ip50005TableNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005TableNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005TableNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50005TableNo with another Field
	 *	@param value
	 */
   public void setIp50005TableNo(Field source) {
       replace(source,0,source.length(),beginIp50005TableNo,IP_50005_TABLE_NO_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50005TableNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50005TableNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50005TableNo,IP_50005_TABLE_NO_LEN);
   	
   }
   
     /**
	 * 	Update Ip50005TableNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005TableNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005TableNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50005TableVersion
	 *	@return ip50005TableVersion
	 */
   public char[] getIp50005TableVersion() throws CFException{
     if (isIp50005TableVersionModified()) { 
        ip50005TableVersion = refreshIp50005TableVersion();
     }
   		return ip50005TableVersion;
   }

  
	/**
	*  set variable ip50005TableVersion
	*  Corresponding COBOL Variable is IP50005-TABLE-VERSION
	*  @param value
	**/
   public void setIp50005TableVersion(char[] value) {
      ip50005TableVersion = checkIp50005TableVersionConstraints(value);
      serializeIp50005TableVersion(ip50005TableVersion);
   } 

     /**
	 * 	Update Ip50005TableVersion 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50005TableVersion(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50005TableVersion,ip50005TableVersion.length);
   	
   }
   
   public void setIp50005TableVersion(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005TableVersion,ip50005TableVersion.length);
   	
   }
   
     /**
	 * 	Update Ip50005TableVersion 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005TableVersion(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005TableVersion+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50005TableVersion with another Field
	 *	@param value
	 */
   public void setIp50005TableVersion(Field source) {
       replace(source,0,source.length(),beginIp50005TableVersion,IP_50005_TABLE_VERSION_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50005TableVersion 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50005TableVersion(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50005TableVersion,IP_50005_TABLE_VERSION_LEN);
   	
   }
   
     /**
	 * 	Update Ip50005TableVersion 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005TableVersion(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005TableVersion+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip50005TableId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50005TableNo(CONSTANTS.SPACE_4);
         setIp50005TableVersion(CONSTANTS.SPACE_2);
   }

		public static int getIp50005TableIdFieldLength() {
			return IP_50005_TABLE_ID_LENGTH;
		}

}
  

package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50004iTableId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip50004iTableId extends Ip50004iTableIdSerialized { 
   


						private char[] ip50004iTableNo = Field.fillLowValue(4);

						private char[] ip50004iTableVersion = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip50004iTableId
	**/
    public Ip50004iTableId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip50004iTableId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50004iTableId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip50004iTableNo
	 *	@return ip50004iTableNo
	 */
   public char[] getIp50004iTableNo() throws CFException{
     if (isIp50004iTableNoModified()) { 
        ip50004iTableNo = refreshIp50004iTableNo();
     }
   		return ip50004iTableNo;
   }

  
	/**
	*  set variable ip50004iTableNo
	*  Corresponding COBOL Variable is IP50004I-TABLE-NO
	*  @param value
	**/
   public void setIp50004iTableNo(char[] value) {
      ip50004iTableNo = checkIp50004iTableNoConstraints(value);
      serializeIp50004iTableNo(ip50004iTableNo);
   } 

     /**
	 * 	Update Ip50004iTableNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50004iTableNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50004iTableNo,ip50004iTableNo.length);
   	
   }
   
   public void setIp50004iTableNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50004iTableNo,ip50004iTableNo.length);
   	
   }
   
     /**
	 * 	Update Ip50004iTableNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iTableNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50004iTableNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50004iTableNo with another Field
	 *	@param value
	 */
   public void setIp50004iTableNo(Field source) {
       replace(source,0,source.length(),beginIp50004iTableNo,IP_50004I_TABLE_NO_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50004iTableNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50004iTableNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50004iTableNo,IP_50004I_TABLE_NO_LEN);
   	
   }
   
     /**
	 * 	Update Ip50004iTableNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iTableNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50004iTableNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50004iTableVersion
	 *	@return ip50004iTableVersion
	 */
   public char[] getIp50004iTableVersion() throws CFException{
     if (isIp50004iTableVersionModified()) { 
        ip50004iTableVersion = refreshIp50004iTableVersion();
     }
   		return ip50004iTableVersion;
   }

  
	/**
	*  set variable ip50004iTableVersion
	*  Corresponding COBOL Variable is IP50004I-TABLE-VERSION
	*  @param value
	**/
   public void setIp50004iTableVersion(char[] value) {
      ip50004iTableVersion = checkIp50004iTableVersionConstraints(value);
      serializeIp50004iTableVersion(ip50004iTableVersion);
   } 

     /**
	 * 	Update Ip50004iTableVersion 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50004iTableVersion(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50004iTableVersion,ip50004iTableVersion.length);
   	
   }
   
   public void setIp50004iTableVersion(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50004iTableVersion,ip50004iTableVersion.length);
   	
   }
   
     /**
	 * 	Update Ip50004iTableVersion 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iTableVersion(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50004iTableVersion+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50004iTableVersion with another Field
	 *	@param value
	 */
   public void setIp50004iTableVersion(Field source) {
       replace(source,0,source.length(),beginIp50004iTableVersion,IP_50004I_TABLE_VERSION_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50004iTableVersion 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50004iTableVersion(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50004iTableVersion,IP_50004I_TABLE_VERSION_LEN);
   	
   }
   
     /**
	 * 	Update Ip50004iTableVersion 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iTableVersion(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50004iTableVersion+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip50004iTableId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50004iTableNo(CONSTANTS.SPACE_4);
         setIp50004iTableVersion(CONSTANTS.SPACE_2);
   }

		public static int getIp50004iTableIdFieldLength() {
			return IP_50004I_TABLE_ID_LENGTH;
		}

}
  

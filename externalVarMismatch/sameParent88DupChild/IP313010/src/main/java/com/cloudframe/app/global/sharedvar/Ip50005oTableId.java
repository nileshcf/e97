package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50005oTableId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip50005oTableId extends Ip50005oTableIdSerialized { 
   


						private char[] ip50005oTableNo = Field.fillLowValue(4);

						private char[] ip50005oTableVersion = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip50005oTableId
	**/
    public Ip50005oTableId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip50005oTableId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50005oTableId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip50005oTableNo
	 *	@return ip50005oTableNo
	 */
   public char[] getIp50005oTableNo() throws CFException{
     if (isIp50005oTableNoModified()) { 
        ip50005oTableNo = refreshIp50005oTableNo();
     }
   		return ip50005oTableNo;
   }

  
	/**
	*  set variable ip50005oTableNo
	*  Corresponding COBOL Variable is IP50005O-TABLE-NO
	*  @param value
	**/
   public void setIp50005oTableNo(char[] value) {
      ip50005oTableNo = checkIp50005oTableNoConstraints(value);
      serializeIp50005oTableNo(ip50005oTableNo);
   } 

     /**
	 * 	Update Ip50005oTableNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50005oTableNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50005oTableNo,ip50005oTableNo.length);
   	
   }
   
   public void setIp50005oTableNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005oTableNo,ip50005oTableNo.length);
   	
   }
   
     /**
	 * 	Update Ip50005oTableNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oTableNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005oTableNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50005oTableNo with another Field
	 *	@param value
	 */
   public void setIp50005oTableNo(Field source) {
       replace(source,0,source.length(),beginIp50005oTableNo,IP_50005O_TABLE_NO_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50005oTableNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50005oTableNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50005oTableNo,IP_50005O_TABLE_NO_LEN);
   	
   }
   
     /**
	 * 	Update Ip50005oTableNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oTableNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005oTableNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50005oTableVersion
	 *	@return ip50005oTableVersion
	 */
   public char[] getIp50005oTableVersion() throws CFException{
     if (isIp50005oTableVersionModified()) { 
        ip50005oTableVersion = refreshIp50005oTableVersion();
     }
   		return ip50005oTableVersion;
   }

  
	/**
	*  set variable ip50005oTableVersion
	*  Corresponding COBOL Variable is IP50005O-TABLE-VERSION
	*  @param value
	**/
   public void setIp50005oTableVersion(char[] value) {
      ip50005oTableVersion = checkIp50005oTableVersionConstraints(value);
      serializeIp50005oTableVersion(ip50005oTableVersion);
   } 

     /**
	 * 	Update Ip50005oTableVersion 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50005oTableVersion(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50005oTableVersion,ip50005oTableVersion.length);
   	
   }
   
   public void setIp50005oTableVersion(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005oTableVersion,ip50005oTableVersion.length);
   	
   }
   
     /**
	 * 	Update Ip50005oTableVersion 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oTableVersion(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005oTableVersion+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50005oTableVersion with another Field
	 *	@param value
	 */
   public void setIp50005oTableVersion(Field source) {
       replace(source,0,source.length(),beginIp50005oTableVersion,IP_50005O_TABLE_VERSION_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50005oTableVersion 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50005oTableVersion(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50005oTableVersion,IP_50005O_TABLE_VERSION_LEN);
   	
   }
   
     /**
	 * 	Update Ip50005oTableVersion 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oTableVersion(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005oTableVersion+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip50005oTableId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50005oTableNo(CONSTANTS.SPACE_4);
         setIp50005oTableVersion(CONSTANTS.SPACE_2);
   }

		public static int getIp50005oTableIdFieldLength() {
			return IP_50005O_TABLE_ID_LENGTH;
		}

}
  

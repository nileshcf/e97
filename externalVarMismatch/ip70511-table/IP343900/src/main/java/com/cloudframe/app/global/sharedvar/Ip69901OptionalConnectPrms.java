package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip69901OptionalConnectPrms is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@GlobalDto
public class Ip69901OptionalConnectPrms extends Ip69901OptionalConnectPrmsSerialized { 
   

						private char[] ip69901DatabaseId = Field.fillLowValue(18);

						private char[] ip69901CollectionId = Field.fillLowValue(18);
	
	/**
	* Constructor for Ip69901OptionalConnectPrms
	**/
    public Ip69901OptionalConnectPrms() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip69901DatabaseId
	 *	@return ip69901DatabaseId
	 */
   public char[] getIp69901DatabaseId() throws CFException{
     if (isIp69901DatabaseIdModified()) { 
        ip69901DatabaseId = refreshIp69901DatabaseId();
     }
   		return ip69901DatabaseId;
   }

  
	/**
	*  set variable ip69901DatabaseId
	*  Corresponding COBOL Variable is IP69901-DATABASE-ID
	*  @param value
	**/
   public void setIp69901DatabaseId(char[] value) {
      ip69901DatabaseId = checkIp69901DatabaseIdConstraints(value);
      serializeIp69901DatabaseId(ip69901DatabaseId);
   } 

     /**
	 * 	Update Ip69901DatabaseId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp69901DatabaseId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp69901DatabaseId,ip69901DatabaseId.length);
   	
   }
   
   public void setIp69901DatabaseId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp69901DatabaseId,ip69901DatabaseId.length);
   	
   }
   
     /**
	 * 	Update Ip69901DatabaseId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69901DatabaseId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp69901DatabaseId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip69901DatabaseId with another Field
	 *	@param value
	 */
   public void setIp69901DatabaseId(Field source) {
       replace(source,0,source.length(),beginIp69901DatabaseId,IP_69901_DATABASE_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip69901DatabaseId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp69901DatabaseId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp69901DatabaseId,IP_69901_DATABASE_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip69901DatabaseId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69901DatabaseId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp69901DatabaseId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip69901CollectionId
	 *	@return ip69901CollectionId
	 */
   public char[] getIp69901CollectionId() throws CFException{
     if (isIp69901CollectionIdModified()) { 
        ip69901CollectionId = refreshIp69901CollectionId();
     }
   		return ip69901CollectionId;
   }

  
	/**
	*  set variable ip69901CollectionId
	*  Corresponding COBOL Variable is IP69901-COLLECTION-ID
	*  @param value
	**/
   public void setIp69901CollectionId(char[] value) {
      ip69901CollectionId = checkIp69901CollectionIdConstraints(value);
      serializeIp69901CollectionId(ip69901CollectionId);
   } 

     /**
	 * 	Update Ip69901CollectionId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp69901CollectionId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp69901CollectionId,ip69901CollectionId.length);
   	
   }
   
   public void setIp69901CollectionId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp69901CollectionId,ip69901CollectionId.length);
   	
   }
   
     /**
	 * 	Update Ip69901CollectionId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69901CollectionId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp69901CollectionId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip69901CollectionId with another Field
	 *	@param value
	 */
   public void setIp69901CollectionId(Field source) {
       replace(source,0,source.length(),beginIp69901CollectionId,IP_69901_COLLECTION_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip69901CollectionId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp69901CollectionId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp69901CollectionId,IP_69901_COLLECTION_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip69901CollectionId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69901CollectionId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp69901CollectionId+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip69901OptionalConnectPrms
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp69901DatabaseId(CONSTANTS.SPACE_18);
         setIp69901CollectionId(CONSTANTS.SPACE_18);
   }

		public static int getIp69901OptionalConnectPrmsFieldLength() {
			return IP_69901_OPTIONAL_CONNECT_PRMS_LENGTH;
		}

}
  

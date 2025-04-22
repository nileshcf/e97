package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02044PaEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:15. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip02044PaEntry extends Ip02044PaEntrySerialized { 
   

						private char[] ip02044PrcssAgrmtId = Field.fillLowValue(11);

						private char[] ip02044MdsEndpntId = Field.fillLowValue(7);
	
	/**
	* Constructor for Ip02044PaEntry
	**/
    public Ip02044PaEntry() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip02044PaEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02044PaEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip02044PrcssAgrmtId
	 *	@return ip02044PrcssAgrmtId
	 */
   public char[] getIp02044PrcssAgrmtId() throws CFException{
     if (isIp02044PrcssAgrmtIdModified()) { 
        ip02044PrcssAgrmtId = refreshIp02044PrcssAgrmtId();
     }
   		return ip02044PrcssAgrmtId;
   }

  
	/**
	*  set variable ip02044PrcssAgrmtId
	*  Corresponding COBOL Variable is IP02044-PRCSS-AGRMT-ID
	*  @param value
	**/
   public void setIp02044PrcssAgrmtId(char[] value) {
      ip02044PrcssAgrmtId = checkIp02044PrcssAgrmtIdConstraints(value);
      serializeIp02044PrcssAgrmtId(ip02044PrcssAgrmtId);
   } 

     /**
	 * 	Update Ip02044PrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02044PrcssAgrmtId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02044PrcssAgrmtId,ip02044PrcssAgrmtId.length);
   	
   }
   
   public void setIp02044PrcssAgrmtId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02044PrcssAgrmtId,ip02044PrcssAgrmtId.length);
   	
   }
   
     /**
	 * 	Update Ip02044PrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02044PrcssAgrmtId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02044PrcssAgrmtId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02044PrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp02044PrcssAgrmtId(Field source) {
       replace(source,0,source.length(),beginIp02044PrcssAgrmtId,IP_02044_PRCSS_AGRMT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02044PrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02044PrcssAgrmtId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02044PrcssAgrmtId,IP_02044_PRCSS_AGRMT_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip02044PrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02044PrcssAgrmtId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02044PrcssAgrmtId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02044MdsEndpntId
	 *	@return ip02044MdsEndpntId
	 */
   public char[] getIp02044MdsEndpntId() throws CFException{
     if (isIp02044MdsEndpntIdModified()) { 
        ip02044MdsEndpntId = refreshIp02044MdsEndpntId();
     }
   		return ip02044MdsEndpntId;
   }

  
	/**
	*  set variable ip02044MdsEndpntId
	*  Corresponding COBOL Variable is IP02044-MDS-ENDPNT-ID
	*  @param value
	**/
   public void setIp02044MdsEndpntId(char[] value) {
      ip02044MdsEndpntId = checkIp02044MdsEndpntIdConstraints(value);
      serializeIp02044MdsEndpntId(ip02044MdsEndpntId);
   } 

     /**
	 * 	Update Ip02044MdsEndpntId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02044MdsEndpntId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02044MdsEndpntId,ip02044MdsEndpntId.length);
   	
   }
   
   public void setIp02044MdsEndpntId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02044MdsEndpntId,ip02044MdsEndpntId.length);
   	
   }
   
     /**
	 * 	Update Ip02044MdsEndpntId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02044MdsEndpntId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02044MdsEndpntId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02044MdsEndpntId with another Field
	 *	@param value
	 */
   public void setIp02044MdsEndpntId(Field source) {
       replace(source,0,source.length(),beginIp02044MdsEndpntId,IP_02044_MDS_ENDPNT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02044MdsEndpntId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02044MdsEndpntId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02044MdsEndpntId,IP_02044_MDS_ENDPNT_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip02044MdsEndpntId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02044MdsEndpntId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02044MdsEndpntId+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip02044PaEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02044PrcssAgrmtId(CONSTANTS.SPACE_11);
         setIp02044MdsEndpntId(CONSTANTS.SPACE_7);
   }

		public static int getIp02044PaEntryFieldLength() {
			return IP_02044_PA_ENTRY_LENGTH;
		}

}
  

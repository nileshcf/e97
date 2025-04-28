package com.cloudframe.app.ip829010.dto;

/**
*  The class FnsPayloadFnsDataFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FnsPayloadFnsDataFields extends FnsPayloadFnsDataFieldsSerialized { 
   
				private FnsPayloadFacDataKey fnsPayloadFacDataKey = new FnsPayloadFacDataKey();
				private FnsPayloadFacData fnsPayloadFacData = new FnsPayloadFacData();
	
	/**
	* Constructor for FnsPayloadFnsDataFields
	**/
    public FnsPayloadFnsDataFields() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FnsPayloadFnsDataFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPayloadFnsDataFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			fnsPayloadFacDataKey.setParent(this,getStartOffset() + 0);
	       			fnsPayloadFacData.setParent(this,getStartOffset() + 25);
    } 

	/**
	 *	Returns the value of fnsPayloadFacDataKey
	 *	@return fnsPayloadFacDataKey
	 */   
	 public FnsPayloadFacDataKey getFnsPayloadFacDataKey() {
   	return fnsPayloadFacDataKey;
   }
   /**
	* 	Update FnsPayloadFacDataKey with the passed value
	*   Corresponding COBOL Variable is FNS-PAYLOAD-FAC-DATA-KEY
	*	@param value
	*/
   public void setFnsPayloadFacDataKey(char[] value) {
      fnsPayloadFacDataKey.setString(value); 
   }   
    
     /**
	 * 	Update FnsPayloadFacDataKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadFacDataKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fnsPayloadFacDataKey.begin,fnsPayloadFacDataKey.length());
   }
   
     /**
	 * 	Update FnsPayloadFacDataKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadFacDataKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fnsPayloadFacDataKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FnsPayloadFacDataKey with another Field
	 *	@param value
	 */
   public void setFnsPayloadFacDataKey(Field source) {
   	replace(source,0,source.length(),fnsPayloadFacDataKey.begin,fnsPayloadFacDataKey.length());
   }  
   
     /**
	 * 	Update FnsPayloadFacDataKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadFacDataKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fnsPayloadFacDataKey.begin,fnsPayloadFacDataKey.length());
   }
   
     /**
	 * 	Update FnsPayloadFacDataKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadFacDataKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fnsPayloadFacDataKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of fnsPayloadFacData
	 *	@return fnsPayloadFacData
	 */   
	 public FnsPayloadFacData getFnsPayloadFacData() {
   	return fnsPayloadFacData;
   }
   /**
	* 	Update FnsPayloadFacData with the passed value
	*   Corresponding COBOL Variable is FNS-PAYLOAD-FAC-DATA
	*	@param value
	*/
   public void setFnsPayloadFacData(char[] value) {
      fnsPayloadFacData.setString(value); 
   }   
    
     /**
	 * 	Update FnsPayloadFacData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadFacData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fnsPayloadFacData.begin,fnsPayloadFacData.length());
   }
   
     /**
	 * 	Update FnsPayloadFacData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadFacData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fnsPayloadFacData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FnsPayloadFacData with another Field
	 *	@param value
	 */
   public void setFnsPayloadFacData(Field source) {
   	replace(source,0,source.length(),fnsPayloadFacData.begin,fnsPayloadFacData.length());
   }  
   
     /**
	 * 	Update FnsPayloadFacData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadFacData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fnsPayloadFacData.begin,fnsPayloadFacData.length());
   }
   
     /**
	 * 	Update FnsPayloadFacData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadFacData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fnsPayloadFacData.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes FnsPayloadFnsDataFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          fnsPayloadFacDataKey.initialize();
     
          fnsPayloadFacData.initialize();
     
   }

		public static int getFnsPayloadFnsDataFieldsFieldLength() {
			return FNS_PAYLOAD_FNS_DATA_FIELDS_LENGTH;
		}

}
  

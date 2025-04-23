package com.cloudframe.app.ip829010.dto;

/**
*  The class Ip82921FnsDataFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip82921FnsDataFields extends Ip82921FnsDataFieldsSerialized { 
   
				private Ip82921FacDataKey ip82921FacDataKey = new Ip82921FacDataKey();
				private Ip82921FacData ip82921FacData = new Ip82921FacData();
	
	/**
	* Constructor for Ip82921FnsDataFields
	**/
    public Ip82921FnsDataFields() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip82921FnsDataFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip82921FnsDataFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip82921FacDataKey.setParent(this,getStartOffset() + 0);
	       			ip82921FacData.setParent(this,getStartOffset() + 25);
    } 

	/**
	 *	Returns the value of ip82921FacDataKey
	 *	@return ip82921FacDataKey
	 */   
	 public Ip82921FacDataKey getIp82921FacDataKey() {
   	return ip82921FacDataKey;
   }
   /**
	* 	Update Ip82921FacDataKey with the passed value
	*   Corresponding COBOL Variable is IP82921-FAC-DATA-KEY
	*	@param value
	*/
   public void setIp82921FacDataKey(char[] value) {
      ip82921FacDataKey.setString(value); 
   }   
    
     /**
	 * 	Update Ip82921FacDataKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp82921FacDataKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip82921FacDataKey.begin,ip82921FacDataKey.length());
   }
   
     /**
	 * 	Update Ip82921FacDataKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921FacDataKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip82921FacDataKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip82921FacDataKey with another Field
	 *	@param value
	 */
   public void setIp82921FacDataKey(Field source) {
   	replace(source,0,source.length(),ip82921FacDataKey.begin,ip82921FacDataKey.length());
   }  
   
     /**
	 * 	Update Ip82921FacDataKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp82921FacDataKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip82921FacDataKey.begin,ip82921FacDataKey.length());
   }
   
     /**
	 * 	Update Ip82921FacDataKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921FacDataKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip82921FacDataKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip82921FacData
	 *	@return ip82921FacData
	 */   
	 public Ip82921FacData getIp82921FacData() {
   	return ip82921FacData;
   }
   /**
	* 	Update Ip82921FacData with the passed value
	*   Corresponding COBOL Variable is IP82921-FAC-DATA
	*	@param value
	*/
   public void setIp82921FacData(char[] value) {
      ip82921FacData.setString(value); 
   }   
    
     /**
	 * 	Update Ip82921FacData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp82921FacData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip82921FacData.begin,ip82921FacData.length());
   }
   
     /**
	 * 	Update Ip82921FacData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921FacData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip82921FacData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip82921FacData with another Field
	 *	@param value
	 */
   public void setIp82921FacData(Field source) {
   	replace(source,0,source.length(),ip82921FacData.begin,ip82921FacData.length());
   }  
   
     /**
	 * 	Update Ip82921FacData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp82921FacData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip82921FacData.begin,ip82921FacData.length());
   }
   
     /**
	 * 	Update Ip82921FacData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921FacData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip82921FacData.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip82921FnsDataFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip82921FacDataKey.initialize();
     
          ip82921FacData.initialize();
     
   }

		public static int getIp82921FnsDataFieldsFieldLength() {
			return IP_82921_FNS_DATA_FIELDS_LENGTH;
		}

}
  

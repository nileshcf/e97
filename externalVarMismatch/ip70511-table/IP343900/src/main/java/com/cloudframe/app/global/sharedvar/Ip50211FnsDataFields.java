package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50211FnsDataFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip50211FnsDataFields extends Ip50211FnsDataFieldsSerialized { 
   
				private Ip50211FacDataKey ip50211FacDataKey = new Ip50211FacDataKey();
				private Ip50211FacData ip50211FacData = new Ip50211FacData();
	
	/**
	* Constructor for Ip50211FnsDataFields
	**/
    public Ip50211FnsDataFields() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip50211FnsDataFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50211FnsDataFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip50211FacDataKey.setParent(this,getStartOffset() + 0);
	       			ip50211FacData.setParent(this,getStartOffset() + 25);
    } 

	/**
	 *	Returns the value of ip50211FacDataKey
	 *	@return ip50211FacDataKey
	 */   
	 public Ip50211FacDataKey getIp50211FacDataKey() {
   	return ip50211FacDataKey;
   }
   /**
	* 	Update Ip50211FacDataKey with the passed value
	*   Corresponding COBOL Variable is IP50211-FAC-DATA-KEY
	*	@param value
	*/
   public void setIp50211FacDataKey(char[] value) {
      ip50211FacDataKey.setString(value); 
   }   
    
     /**
	 * 	Update Ip50211FacDataKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50211FacDataKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50211FacDataKey.begin,ip50211FacDataKey.length());
   }
   
     /**
	 * 	Update Ip50211FacDataKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50211FacDataKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50211FacDataKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip50211FacDataKey with another Field
	 *	@param value
	 */
   public void setIp50211FacDataKey(Field source) {
   	replace(source,0,source.length(),ip50211FacDataKey.begin,ip50211FacDataKey.length());
   }  
   
     /**
	 * 	Update Ip50211FacDataKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50211FacDataKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50211FacDataKey.begin,ip50211FacDataKey.length());
   }
   
     /**
	 * 	Update Ip50211FacDataKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50211FacDataKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50211FacDataKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip50211FacData
	 *	@return ip50211FacData
	 */   
	 public Ip50211FacData getIp50211FacData() {
   	return ip50211FacData;
   }
   /**
	* 	Update Ip50211FacData with the passed value
	*   Corresponding COBOL Variable is IP50211-FAC-DATA
	*	@param value
	*/
   public void setIp50211FacData(char[] value) {
      ip50211FacData.setString(value); 
   }   
    
     /**
	 * 	Update Ip50211FacData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50211FacData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50211FacData.begin,ip50211FacData.length());
   }
   
     /**
	 * 	Update Ip50211FacData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50211FacData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50211FacData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip50211FacData with another Field
	 *	@param value
	 */
   public void setIp50211FacData(Field source) {
   	replace(source,0,source.length(),ip50211FacData.begin,ip50211FacData.length());
   }  
   
     /**
	 * 	Update Ip50211FacData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50211FacData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50211FacData.begin,ip50211FacData.length());
   }
   
     /**
	 * 	Update Ip50211FacData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50211FacData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50211FacData.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip50211FnsDataFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip50211FacDataKey.initialize();
     
          ip50211FacData.initialize();
     
   }

		public static int getIp50211FnsDataFieldsFieldLength() {
			return IP_50211_FNS_DATA_FIELDS_LENGTH;
		}

}
  

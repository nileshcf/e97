package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0040PreEditFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip0040PreEditFields extends Ip0040PreEditFieldsSerialized { 
   
				private Ip0040TableDataKey ip0040TableDataKey = new Ip0040TableDataKey();
				private Ip0040TableDataFields ip0040TableDataFields = new Ip0040TableDataFields();
	
	/**
	* Constructor for Ip0040PreEditFields
	**/
    public Ip0040PreEditFields() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0040PreEditFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040PreEditFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip0040TableDataKey.setParent(this,getStartOffset() + 0);
	       			ip0040TableDataFields.setParent(this,getStartOffset() + 22);
    } 

	/**
	 *	Returns the value of ip0040TableDataKey
	 *	@return ip0040TableDataKey
	 */   
	 public Ip0040TableDataKey getIp0040TableDataKey() {
   	return ip0040TableDataKey;
   }
   /**
	* 	Update Ip0040TableDataKey with the passed value
	*   Corresponding COBOL Variable is IP0040-TABLE-DATA-KEY
	*	@param value
	*/
   public void setIp0040TableDataKey(char[] value) {
      ip0040TableDataKey.setString(value); 
   }   
    
     /**
	 * 	Update Ip0040TableDataKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp0040TableDataKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040TableDataKey.begin,ip0040TableDataKey.length());
   }
   
     /**
	 * 	Update Ip0040TableDataKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040TableDataKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040TableDataKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip0040TableDataKey with another Field
	 *	@param value
	 */
   public void setIp0040TableDataKey(Field source) {
   	replace(source,0,source.length(),ip0040TableDataKey.begin,ip0040TableDataKey.length());
   }  
   
     /**
	 * 	Update Ip0040TableDataKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp0040TableDataKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040TableDataKey.begin,ip0040TableDataKey.length());
   }
   
     /**
	 * 	Update Ip0040TableDataKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040TableDataKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040TableDataKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip0040TableDataFields
	 *	@return ip0040TableDataFields
	 */   
	 public Ip0040TableDataFields getIp0040TableDataFields() {
   	return ip0040TableDataFields;
   }
   /**
	* 	Update Ip0040TableDataFields with the passed value
	*   Corresponding COBOL Variable is IP0040-TABLE-DATA-FIELDS
	*	@param value
	*/
   public void setIp0040TableDataFields(char[] value) {
      ip0040TableDataFields.setString(value); 
   }   
    
     /**
	 * 	Update Ip0040TableDataFields 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp0040TableDataFields(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040TableDataFields.begin,ip0040TableDataFields.length());
   }
   
     /**
	 * 	Update Ip0040TableDataFields 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040TableDataFields(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040TableDataFields.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip0040TableDataFields with another Field
	 *	@param value
	 */
   public void setIp0040TableDataFields(Field source) {
   	replace(source,0,source.length(),ip0040TableDataFields.begin,ip0040TableDataFields.length());
   }  
   
     /**
	 * 	Update Ip0040TableDataFields 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp0040TableDataFields(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040TableDataFields.begin,ip0040TableDataFields.length());
   }
   
     /**
	 * 	Update Ip0040TableDataFields 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040TableDataFields(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040TableDataFields.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip0040PreEditFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip0040TableDataKey.initialize();
     
          ip0040TableDataFields.initialize();
     
   }

		public static int getIp0040PreEditFieldsFieldLength() {
			return IP_0040_PRE_EDIT_FIELDS_LENGTH;
		}

}
  

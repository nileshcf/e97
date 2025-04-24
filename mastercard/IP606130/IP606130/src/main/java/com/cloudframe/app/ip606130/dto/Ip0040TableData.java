package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0040TableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip0040TableData extends Ip0040TableDataSerialized { 
   
				private Ip0040PreEditFields ip0040PreEditFields = new Ip0040PreEditFields();
				private Ip0040CentralSiteFields ip0040CentralSiteFields = new Ip0040CentralSiteFields();
	
	/**
	* Constructor for Ip0040TableData
	**/
    public Ip0040TableData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0040TableData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040TableData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip0040PreEditFields.setParent(this,getStartOffset() + 0);
	       			ip0040CentralSiteFields.setParent(this,getStartOffset() + 173);
    } 

	/**
	 *	Returns the value of ip0040PreEditFields
	 *	@return ip0040PreEditFields
	 */   
	 public Ip0040PreEditFields getIp0040PreEditFields() {
   	return ip0040PreEditFields;
   }
   /**
	* 	Update Ip0040PreEditFields with the passed value
	*   Corresponding COBOL Variable is IP0040-PRE-EDIT-FIELDS
	*	@param value
	*/
   public void setIp0040PreEditFields(char[] value) {
      ip0040PreEditFields.setString(value); 
   }   
    
     /**
	 * 	Update Ip0040PreEditFields 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp0040PreEditFields(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040PreEditFields.begin,ip0040PreEditFields.length());
   }
   
     /**
	 * 	Update Ip0040PreEditFields 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040PreEditFields(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040PreEditFields.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip0040PreEditFields with another Field
	 *	@param value
	 */
   public void setIp0040PreEditFields(Field source) {
   	replace(source,0,source.length(),ip0040PreEditFields.begin,ip0040PreEditFields.length());
   }  
   
     /**
	 * 	Update Ip0040PreEditFields 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp0040PreEditFields(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040PreEditFields.begin,ip0040PreEditFields.length());
   }
   
     /**
	 * 	Update Ip0040PreEditFields 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040PreEditFields(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040PreEditFields.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip0040CentralSiteFields
	 *	@return ip0040CentralSiteFields
	 */   
	 public Ip0040CentralSiteFields getIp0040CentralSiteFields() {
   	return ip0040CentralSiteFields;
   }
   /**
	* 	Update Ip0040CentralSiteFields with the passed value
	*   Corresponding COBOL Variable is IP0040-CENTRAL-SITE-FIELDS
	*	@param value
	*/
   public void setIp0040CentralSiteFields(char[] value) {
      ip0040CentralSiteFields.setString(value); 
   }   
    
     /**
	 * 	Update Ip0040CentralSiteFields 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp0040CentralSiteFields(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040CentralSiteFields.begin,ip0040CentralSiteFields.length());
   }
   
     /**
	 * 	Update Ip0040CentralSiteFields 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040CentralSiteFields(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040CentralSiteFields.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip0040CentralSiteFields with another Field
	 *	@param value
	 */
   public void setIp0040CentralSiteFields(Field source) {
   	replace(source,0,source.length(),ip0040CentralSiteFields.begin,ip0040CentralSiteFields.length());
   }  
   
     /**
	 * 	Update Ip0040CentralSiteFields 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp0040CentralSiteFields(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040CentralSiteFields.begin,ip0040CentralSiteFields.length());
   }
   
     /**
	 * 	Update Ip0040CentralSiteFields 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040CentralSiteFields(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040CentralSiteFields.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip0040TableData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip0040PreEditFields.initialize();
     
          ip0040CentralSiteFields.initialize();
     
   }

		public static int getIp0040TableDataFieldLength() {
			return IP_0040_TABLE_DATA_LENGTH;
		}

}
  

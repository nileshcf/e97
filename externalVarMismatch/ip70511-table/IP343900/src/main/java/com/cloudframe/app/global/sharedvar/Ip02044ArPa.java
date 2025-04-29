package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02044ArPa is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip02044ArPa")

public class Ip02044ArPa extends Ip02044ArPaSerialized  implements InitializingBean {
   
				private Ip02044TableDataKey ip02044TableDataKey = new Ip02044TableDataKey();
				private Ip02044TableDataFields ip02044TableDataFields = new Ip02044TableDataFields();
	
	/**
	* Constructor for Ip02044ArPa
	**/
    public Ip02044ArPa() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip02044TableDataKey.setParent(this,getStartOffset() + 0);
	       			ip02044TableDataFields.setParent(this,getStartOffset() + 19);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip02044TableDataKey
	 *	@return ip02044TableDataKey
	 */   
	 public Ip02044TableDataKey getIp02044TableDataKey() {
   	return ip02044TableDataKey;
   }
   /**
	* 	Update Ip02044TableDataKey with the passed value
	*   Corresponding COBOL Variable is IP02044-TABLE-DATA-KEY
	*	@param value
	*/
   public void setIp02044TableDataKey(char[] value) {
      ip02044TableDataKey.setString(value); 
   }   
    
     /**
	 * 	Update Ip02044TableDataKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp02044TableDataKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02044TableDataKey.begin,ip02044TableDataKey.length());
   }
   
     /**
	 * 	Update Ip02044TableDataKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02044TableDataKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02044TableDataKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip02044TableDataKey with another Field
	 *	@param value
	 */
   public void setIp02044TableDataKey(Field source) {
   	replace(source,0,source.length(),ip02044TableDataKey.begin,ip02044TableDataKey.length());
   }  
   
     /**
	 * 	Update Ip02044TableDataKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp02044TableDataKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02044TableDataKey.begin,ip02044TableDataKey.length());
   }
   
     /**
	 * 	Update Ip02044TableDataKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02044TableDataKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02044TableDataKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip02044TableDataFields
	 *	@return ip02044TableDataFields
	 */   
	 public Ip02044TableDataFields getIp02044TableDataFields() {
   	return ip02044TableDataFields;
   }
   /**
	* 	Update Ip02044TableDataFields with the passed value
	*   Corresponding COBOL Variable is IP02044-TABLE-DATA-FIELDS
	*	@param value
	*/
   public void setIp02044TableDataFields(char[] value) {
      ip02044TableDataFields.setString(value); 
   }   
    
     /**
	 * 	Update Ip02044TableDataFields 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp02044TableDataFields(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02044TableDataFields.begin,ip02044TableDataFields.length());
   }
   
     /**
	 * 	Update Ip02044TableDataFields 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02044TableDataFields(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02044TableDataFields.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip02044TableDataFields with another Field
	 *	@param value
	 */
   public void setIp02044TableDataFields(Field source) {
   	replace(source,0,source.length(),ip02044TableDataFields.begin,ip02044TableDataFields.length());
   }  
   
     /**
	 * 	Update Ip02044TableDataFields 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp02044TableDataFields(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02044TableDataFields.begin,ip02044TableDataFields.length());
   }
   
     /**
	 * 	Update Ip02044TableDataFields 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02044TableDataFields(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02044TableDataFields.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip02044ArPa
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip02044TableDataKey.initialize();
     
          ip02044TableDataFields.initialize();
     
   }

		public static int getIp02044ArPaFieldLength() {
			return IP_02044_AR_PA_LENGTH;
		}

}
  

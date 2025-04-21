package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip69931Linkage is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:10. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip69931Linkage")

public class Ip69931Linkage extends Ip69931LinkageSerialized  implements InitializingBean {
   
				private Ip69931InputFields ip69931InputFields = new Ip69931InputFields();
				private Ip69931OutputFields ip69931OutputFields = new Ip69931OutputFields();
	
	/**
	* Constructor for Ip69931Linkage
	**/
    public Ip69931Linkage() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip69931InputFields.setParent(this,getStartOffset() + 0);
	       			ip69931OutputFields.setParent(this,getStartOffset() + 14);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip69931InputFields
	 *	@return ip69931InputFields
	 */   
	 public Ip69931InputFields getIp69931InputFields() {
   	return ip69931InputFields;
   }
   /**
	* 	Update Ip69931InputFields with the passed value
	*   Corresponding COBOL Variable is IP69931-INPUT-FIELDS
	*	@param value
	*/
   public void setIp69931InputFields(char[] value) {
      ip69931InputFields.setString(value); 
   }   
    
     /**
	 * 	Update Ip69931InputFields 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp69931InputFields(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip69931InputFields.begin,ip69931InputFields.length());
   }
   
     /**
	 * 	Update Ip69931InputFields 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69931InputFields(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip69931InputFields.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip69931InputFields with another Field
	 *	@param value
	 */
   public void setIp69931InputFields(Field source) {
   	replace(source,0,source.length(),ip69931InputFields.begin,ip69931InputFields.length());
   }  
   
     /**
	 * 	Update Ip69931InputFields 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp69931InputFields(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip69931InputFields.begin,ip69931InputFields.length());
   }
   
     /**
	 * 	Update Ip69931InputFields 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69931InputFields(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip69931InputFields.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip69931OutputFields
	 *	@return ip69931OutputFields
	 */   
	 public Ip69931OutputFields getIp69931OutputFields() {
   	return ip69931OutputFields;
   }
   /**
	* 	Update Ip69931OutputFields with the passed value
	*   Corresponding COBOL Variable is IP69931-OUTPUT-FIELDS
	*	@param value
	*/
   public void setIp69931OutputFields(char[] value) {
      ip69931OutputFields.setString(value); 
   }   
    
     /**
	 * 	Update Ip69931OutputFields 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp69931OutputFields(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip69931OutputFields.begin,ip69931OutputFields.length());
   }
   
     /**
	 * 	Update Ip69931OutputFields 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp69931OutputFields(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip69931OutputFields.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip69931OutputFields with another Field
	 *	@param value
	 */
   public void setIp69931OutputFields(Field source) {
   	replace(source,0,source.length(),ip69931OutputFields.begin,ip69931OutputFields.length());
   }  
   
     /**
	 * 	Update Ip69931OutputFields 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp69931OutputFields(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip69931OutputFields.begin,ip69931OutputFields.length());
   }
   
     /**
	 * 	Update Ip69931OutputFields 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp69931OutputFields(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip69931OutputFields.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip69931Linkage
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip69931InputFields.initialize();
     
          ip69931OutputFields.initialize();
     
   }

		public static int getIp69931LinkageFieldLength() {
			return IP_69931_LINKAGE_LENGTH;
		}

}
  

package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014PrcssAgrmtTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:15. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip02014PrcssAgrmtTable")

public class Ip02014PrcssAgrmtTable extends Ip02014PrcssAgrmtTableSerialized  implements InitializingBean {
   
				private Ip02014TableDataKey ip02014TableDataKey = new Ip02014TableDataKey();
				private Ip02014TableDataFields ip02014TableDataFields = new Ip02014TableDataFields();
	
	/**
	* Constructor for Ip02014PrcssAgrmtTable
	**/
    public Ip02014PrcssAgrmtTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip02014TableDataKey.setParent(this,getStartOffset() + 0);
	       			ip02014TableDataFields.setParent(this,getStartOffset() + 11);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip02014TableDataKey
	 *	@return ip02014TableDataKey
	 */   
	 public Ip02014TableDataKey getIp02014TableDataKey() {
   	return ip02014TableDataKey;
   }
   /**
	* 	Update Ip02014TableDataKey with the passed value
	*   Corresponding COBOL Variable is IP02014-TABLE-DATA-KEY
	*	@param value
	*/
   public void setIp02014TableDataKey(char[] value) {
      ip02014TableDataKey.setString(value); 
   }   
    
     /**
	 * 	Update Ip02014TableDataKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp02014TableDataKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02014TableDataKey.begin,ip02014TableDataKey.length());
   }
   
     /**
	 * 	Update Ip02014TableDataKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014TableDataKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02014TableDataKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip02014TableDataKey with another Field
	 *	@param value
	 */
   public void setIp02014TableDataKey(Field source) {
   	replace(source,0,source.length(),ip02014TableDataKey.begin,ip02014TableDataKey.length());
   }  
   
     /**
	 * 	Update Ip02014TableDataKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp02014TableDataKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02014TableDataKey.begin,ip02014TableDataKey.length());
   }
   
     /**
	 * 	Update Ip02014TableDataKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014TableDataKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02014TableDataKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip02014TableDataFields
	 *	@return ip02014TableDataFields
	 */   
	 public Ip02014TableDataFields getIp02014TableDataFields() {
   	return ip02014TableDataFields;
   }
   /**
	* 	Update Ip02014TableDataFields with the passed value
	*   Corresponding COBOL Variable is IP02014-TABLE-DATA-FIELDS
	*	@param value
	*/
   public void setIp02014TableDataFields(char[] value) {
      ip02014TableDataFields.setString(value); 
   }   
    
     /**
	 * 	Update Ip02014TableDataFields 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp02014TableDataFields(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02014TableDataFields.begin,ip02014TableDataFields.length());
   }
   
     /**
	 * 	Update Ip02014TableDataFields 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014TableDataFields(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02014TableDataFields.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip02014TableDataFields with another Field
	 *	@param value
	 */
   public void setIp02014TableDataFields(Field source) {
   	replace(source,0,source.length(),ip02014TableDataFields.begin,ip02014TableDataFields.length());
   }  
   
     /**
	 * 	Update Ip02014TableDataFields 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp02014TableDataFields(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02014TableDataFields.begin,ip02014TableDataFields.length());
   }
   
     /**
	 * 	Update Ip02014TableDataFields 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014TableDataFields(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02014TableDataFields.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip02014PrcssAgrmtTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip02014TableDataKey.initialize();
     
          ip02014TableDataFields.initialize();
     
   }

		public static int getIp02014PrcssAgrmtTableFieldLength() {
			return IP_02014_PRCSS_AGRMT_TABLE_LENGTH;
		}

}
  

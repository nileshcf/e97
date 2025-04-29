package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014lPrcssAgrmtTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip02014lPrcssAgrmtTable")

public class Ip02014lPrcssAgrmtTable extends Ip02014lPrcssAgrmtTableSerialized  implements InitializingBean {
   
				private Ip02014lTableDataKey ip02014lTableDataKey = new Ip02014lTableDataKey();
				private Ip02014lTableDataFields ip02014lTableDataFields = new Ip02014lTableDataFields();
	
	/**
	* Constructor for Ip02014lPrcssAgrmtTable
	**/
    public Ip02014lPrcssAgrmtTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip02014lTableDataKey.setParent(this,getStartOffset() + 0);
	       			ip02014lTableDataFields.setParent(this,getStartOffset() + 11);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip02014lTableDataKey
	 *	@return ip02014lTableDataKey
	 */   
	 public Ip02014lTableDataKey getIp02014lTableDataKey() {
   	return ip02014lTableDataKey;
   }
   /**
	* 	Update Ip02014lTableDataKey with the passed value
	*   Corresponding COBOL Variable is IP02014L-TABLE-DATA-KEY
	*	@param value
	*/
   public void setIp02014lTableDataKey(char[] value) {
      ip02014lTableDataKey.setString(value); 
   }   
    
     /**
	 * 	Update Ip02014lTableDataKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp02014lTableDataKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02014lTableDataKey.begin,ip02014lTableDataKey.length());
   }
   
     /**
	 * 	Update Ip02014lTableDataKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lTableDataKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02014lTableDataKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip02014lTableDataKey with another Field
	 *	@param value
	 */
   public void setIp02014lTableDataKey(Field source) {
   	replace(source,0,source.length(),ip02014lTableDataKey.begin,ip02014lTableDataKey.length());
   }  
   
     /**
	 * 	Update Ip02014lTableDataKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp02014lTableDataKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02014lTableDataKey.begin,ip02014lTableDataKey.length());
   }
   
     /**
	 * 	Update Ip02014lTableDataKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lTableDataKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02014lTableDataKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip02014lTableDataFields
	 *	@return ip02014lTableDataFields
	 */   
	 public Ip02014lTableDataFields getIp02014lTableDataFields() {
   	return ip02014lTableDataFields;
   }
   /**
	* 	Update Ip02014lTableDataFields with the passed value
	*   Corresponding COBOL Variable is IP02014L-TABLE-DATA-FIELDS
	*	@param value
	*/
   public void setIp02014lTableDataFields(char[] value) {
      ip02014lTableDataFields.setString(value); 
   }   
    
     /**
	 * 	Update Ip02014lTableDataFields 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp02014lTableDataFields(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02014lTableDataFields.begin,ip02014lTableDataFields.length());
   }
   
     /**
	 * 	Update Ip02014lTableDataFields 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lTableDataFields(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02014lTableDataFields.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip02014lTableDataFields with another Field
	 *	@param value
	 */
   public void setIp02014lTableDataFields(Field source) {
   	replace(source,0,source.length(),ip02014lTableDataFields.begin,ip02014lTableDataFields.length());
   }  
   
     /**
	 * 	Update Ip02014lTableDataFields 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp02014lTableDataFields(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02014lTableDataFields.begin,ip02014lTableDataFields.length());
   }
   
     /**
	 * 	Update Ip02014lTableDataFields 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lTableDataFields(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02014lTableDataFields.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip02014lPrcssAgrmtTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip02014lTableDataKey.initialize();
     
          ip02014lTableDataFields.initialize();
     
   }

		public static int getIp02014lPrcssAgrmtTableFieldLength() {
			return IP_02014L_PRCSS_AGRMT_TABLE_LENGTH;
		}

}
  

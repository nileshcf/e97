package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014wPrcssAgrmtTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip02014wPrcssAgrmtTable extends Ip02014wPrcssAgrmtTableSerialized { 
   
				private Ip02014wTableDataKey ip02014wTableDataKey = new Ip02014wTableDataKey();
				private Ip02014wTableDataFields ip02014wTableDataFields = new Ip02014wTableDataFields();
	
	/**
	* Constructor for Ip02014wPrcssAgrmtTable
	**/
    public Ip02014wPrcssAgrmtTable() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip02014wPrcssAgrmtTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014wPrcssAgrmtTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip02014wTableDataKey.setParent(this,getStartOffset() + 0);
	       			ip02014wTableDataFields.setParent(this,getStartOffset() + 11);
    } 

	/**
	 *	Returns the value of ip02014wTableDataKey
	 *	@return ip02014wTableDataKey
	 */   
	 public Ip02014wTableDataKey getIp02014wTableDataKey() {
   	return ip02014wTableDataKey;
   }
   /**
	* 	Update Ip02014wTableDataKey with the passed value
	*   Corresponding COBOL Variable is IP02014W-TABLE-DATA-KEY
	*	@param value
	*/
   public void setIp02014wTableDataKey(char[] value) {
      ip02014wTableDataKey.setString(value); 
   }   
    
     /**
	 * 	Update Ip02014wTableDataKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp02014wTableDataKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02014wTableDataKey.begin,ip02014wTableDataKey.length());
   }
   
     /**
	 * 	Update Ip02014wTableDataKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wTableDataKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02014wTableDataKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip02014wTableDataKey with another Field
	 *	@param value
	 */
   public void setIp02014wTableDataKey(Field source) {
   	replace(source,0,source.length(),ip02014wTableDataKey.begin,ip02014wTableDataKey.length());
   }  
   
     /**
	 * 	Update Ip02014wTableDataKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp02014wTableDataKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02014wTableDataKey.begin,ip02014wTableDataKey.length());
   }
   
     /**
	 * 	Update Ip02014wTableDataKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wTableDataKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02014wTableDataKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip02014wTableDataFields
	 *	@return ip02014wTableDataFields
	 */   
	 public Ip02014wTableDataFields getIp02014wTableDataFields() {
   	return ip02014wTableDataFields;
   }
   /**
	* 	Update Ip02014wTableDataFields with the passed value
	*   Corresponding COBOL Variable is IP02014W-TABLE-DATA-FIELDS
	*	@param value
	*/
   public void setIp02014wTableDataFields(char[] value) {
      ip02014wTableDataFields.setString(value); 
   }   
    
     /**
	 * 	Update Ip02014wTableDataFields 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp02014wTableDataFields(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02014wTableDataFields.begin,ip02014wTableDataFields.length());
   }
   
     /**
	 * 	Update Ip02014wTableDataFields 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wTableDataFields(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02014wTableDataFields.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip02014wTableDataFields with another Field
	 *	@param value
	 */
   public void setIp02014wTableDataFields(Field source) {
   	replace(source,0,source.length(),ip02014wTableDataFields.begin,ip02014wTableDataFields.length());
   }  
   
     /**
	 * 	Update Ip02014wTableDataFields 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp02014wTableDataFields(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02014wTableDataFields.begin,ip02014wTableDataFields.length());
   }
   
     /**
	 * 	Update Ip02014wTableDataFields 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wTableDataFields(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02014wTableDataFields.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip02014wPrcssAgrmtTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip02014wTableDataKey.initialize();
     
          ip02014wTableDataFields.initialize();
     
   }

		public static int getIp02014wPrcssAgrmtTableFieldLength() {
			return IP_02014W_PRCSS_AGRMT_TABLE_LENGTH;
		}

}
  

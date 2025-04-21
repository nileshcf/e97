package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip90354TableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip90354TableData extends Ip90354TableDataSerialized { 
   
				private Ip90354TableDataKey ip90354TableDataKey = new Ip90354TableDataKey();
	
	/**
	* Constructor for Ip90354TableData
	**/
    public Ip90354TableData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip90354TableData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip90354TableData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip90354TableDataKey.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ip90354TableDataKey
	 *	@return ip90354TableDataKey
	 */   
	 public Ip90354TableDataKey getIp90354TableDataKey() {
   	return ip90354TableDataKey;
   }
   /**
	* 	Update Ip90354TableDataKey with the passed value
	*   Corresponding COBOL Variable is IP90354-TABLE-DATA-KEY
	*	@param value
	*/
   public void setIp90354TableDataKey(char[] value) {
      ip90354TableDataKey.setString(value); 
   }   
    
     /**
	 * 	Update Ip90354TableDataKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp90354TableDataKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip90354TableDataKey.begin,ip90354TableDataKey.length());
   }
   
     /**
	 * 	Update Ip90354TableDataKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp90354TableDataKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip90354TableDataKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip90354TableDataKey with another Field
	 *	@param value
	 */
   public void setIp90354TableDataKey(Field source) {
   	replace(source,0,source.length(),ip90354TableDataKey.begin,ip90354TableDataKey.length());
   }  
   
     /**
	 * 	Update Ip90354TableDataKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp90354TableDataKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip90354TableDataKey.begin,ip90354TableDataKey.length());
   }
   
     /**
	 * 	Update Ip90354TableDataKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp90354TableDataKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip90354TableDataKey.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getIp90354TableDataFieldLength() {
			return IP_90354_TABLE_DATA_LENGTH;
		}

}
  

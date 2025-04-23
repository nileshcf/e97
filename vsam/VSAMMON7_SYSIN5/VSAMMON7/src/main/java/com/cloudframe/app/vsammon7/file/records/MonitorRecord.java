package com.cloudframe.app.vsammon7.file.records;

/**
*  The class MonitorRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:57. using version 5.0.0.254
**/


import com.cloudframe.app.vsammon7.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MonitorRecord extends MonitorRecordSerialized {
   
				private MonPriKey monPriKey = new MonPriKey();
	
	/**
	* Constructor for MonitorRecord
	**/
    public MonitorRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			monPriKey.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of monPriKey
	 *	@return monPriKey
	 */   
	 public MonPriKey getMonPriKey() {
   	return monPriKey;
   }
   /**
	* 	Update MonPriKey with the passed value
	*   Corresponding COBOL Variable is MON-PRI-KEY
	*	@param value
	*/
   public void setMonPriKey(char[] value) {
      monPriKey.setString(value); 
   }   
    
     /**
	 * 	Update MonPriKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMonPriKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,monPriKey.begin,monPriKey.length());
   }
   
     /**
	 * 	Update MonPriKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonPriKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,monPriKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MonPriKey with another Field
	 *	@param value
	 */
   public void setMonPriKey(Field source) {
   	replace(source,0,source.length(),monPriKey.begin,monPriKey.length());
   }  
   
     /**
	 * 	Update MonPriKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMonPriKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,monPriKey.begin,monPriKey.length());
   }
   
     /**
	 * 	Update MonPriKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonPriKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,monPriKey.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getMonitorRecordFieldLength() {
			return MONITOR_RECORD_LENGTH;
		}

}
  

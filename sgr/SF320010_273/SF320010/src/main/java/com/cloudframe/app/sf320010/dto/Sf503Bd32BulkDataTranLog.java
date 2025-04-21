package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503Bd32BulkDataTranLog is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf503Bd32BulkDataTranLog extends Sf503Bd32BulkDataTranLogSerialized { 
   
				private Sf503Bd32BulkId sf503Bd32BulkId = new Sf503Bd32BulkId();
	
	/**
	* Constructor for Sf503Bd32BulkDataTranLog
	**/
    public Sf503Bd32BulkDataTranLog() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf503Bd32BulkDataTranLog. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503Bd32BulkDataTranLog(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			sf503Bd32BulkId.setParent(this,getStartOffset() + 1);
    } 

	/**
	 *	Returns the value of sf503Bd32BulkId
	 *	@return sf503Bd32BulkId
	 */   
	 public Sf503Bd32BulkId getSf503Bd32BulkId() {
   	return sf503Bd32BulkId;
   }
   /**
	* 	Update Sf503Bd32BulkId with the passed value
	*   Corresponding COBOL Variable is SF503-BD32-BULK-ID
	*	@param value
	*/
   public void setSf503Bd32BulkId(char[] value) {
      sf503Bd32BulkId.setString(value); 
   }   
    
     /**
	 * 	Update Sf503Bd32BulkId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf503Bd32BulkId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503Bd32BulkId.begin,sf503Bd32BulkId.length());
   }
   
     /**
	 * 	Update Sf503Bd32BulkId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503Bd32BulkId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503Bd32BulkId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf503Bd32BulkId with another Field
	 *	@param value
	 */
   public void setSf503Bd32BulkId(Field source) {
   	replace(source,0,source.length(),sf503Bd32BulkId.begin,sf503Bd32BulkId.length());
   }  
   
     /**
	 * 	Update Sf503Bd32BulkId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf503Bd32BulkId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503Bd32BulkId.begin,sf503Bd32BulkId.length());
   }
   
     /**
	 * 	Update Sf503Bd32BulkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503Bd32BulkId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503Bd32BulkId.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSf503Bd32BulkDataTranLogFieldLength() {
			return SF_503_BD_32_BULK_DATA_TRAN_LOG_LENGTH;
		}

}
  

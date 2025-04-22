package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RlhzaRcCycleData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RlhzaRcCycleData extends RlhzaRcCycleDataSerialized {
   
				private RlhzaGenericRecord rlhzaGenericRecord = new RlhzaGenericRecord();
				private RlhzaDtlRecord rlhzaDtlRecord = new RlhzaDtlRecord();
				private RlhzaHdrRecord rlhzaHdrRecord = new RlhzaHdrRecord();
				private RlhzaTlrRecord rlhzaTlrRecord = new RlhzaTlrRecord();
	
	/**
	* Constructor for RlhzaRcCycleData
	**/
    public RlhzaRcCycleData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			rlhzaGenericRecord.setParent(this,getStartOffset() + 0);
	       			rlhzaDtlRecord.setParent(this,getStartOffset() + 0);
	       			rlhzaHdrRecord.setParent(this,getStartOffset() + 0);
	       			rlhzaTlrRecord.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of rlhzaGenericRecord
	 *	@return rlhzaGenericRecord
	 */   
	 public RlhzaGenericRecord getRlhzaGenericRecord() {
   	return rlhzaGenericRecord;
   }
   /**
	* 	Update RlhzaGenericRecord with the passed value
	*   Corresponding COBOL Variable is RLHZA-GENERIC-RECORD
	*	@param value
	*/
   public void setRlhzaGenericRecord(char[] value) {
      rlhzaGenericRecord.setString(value); 
   }   
    
     /**
	 * 	Update RlhzaGenericRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlhzaGenericRecord(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlhzaGenericRecord.begin,rlhzaGenericRecord.length());
   }
   
     /**
	 * 	Update RlhzaGenericRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlhzaGenericRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlhzaGenericRecord.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RlhzaGenericRecord with another Field
	 *	@param value
	 */
   public void setRlhzaGenericRecord(Field source) {
   	replace(source,0,source.length(),rlhzaGenericRecord.begin,rlhzaGenericRecord.length());
   }  
   
     /**
	 * 	Update RlhzaGenericRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlhzaGenericRecord(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlhzaGenericRecord.begin,rlhzaGenericRecord.length());
   }
   
     /**
	 * 	Update RlhzaGenericRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlhzaGenericRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlhzaGenericRecord.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rlhzaDtlRecord
	 *	@return rlhzaDtlRecord
	 */   
	 public RlhzaDtlRecord getRlhzaDtlRecord() {
   	return rlhzaDtlRecord;
   }
   /**
	* 	Update RlhzaDtlRecord with the passed value
	*   Corresponding COBOL Variable is RLHZA-DTL-RECORD
	*	@param value
	*/
   public void setRlhzaDtlRecord(char[] value) {
      rlhzaDtlRecord.setString(value); 
   }   
    
     /**
	 * 	Update RlhzaDtlRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlhzaDtlRecord(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlhzaDtlRecord.begin,rlhzaDtlRecord.length());
   }
   
     /**
	 * 	Update RlhzaDtlRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlhzaDtlRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlhzaDtlRecord.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RlhzaDtlRecord with another Field
	 *	@param value
	 */
   public void setRlhzaDtlRecord(Field source) {
   	replace(source,0,source.length(),rlhzaDtlRecord.begin,rlhzaDtlRecord.length());
   }  
   
     /**
	 * 	Update RlhzaDtlRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlhzaDtlRecord(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlhzaDtlRecord.begin,rlhzaDtlRecord.length());
   }
   
     /**
	 * 	Update RlhzaDtlRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlhzaDtlRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlhzaDtlRecord.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rlhzaHdrRecord
	 *	@return rlhzaHdrRecord
	 */   
	 public RlhzaHdrRecord getRlhzaHdrRecord() {
   	return rlhzaHdrRecord;
   }
   /**
	* 	Update RlhzaHdrRecord with the passed value
	*   Corresponding COBOL Variable is RLHZA-HDR-RECORD
	*	@param value
	*/
   public void setRlhzaHdrRecord(char[] value) {
      rlhzaHdrRecord.setString(value); 
   }   
    
     /**
	 * 	Update RlhzaHdrRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlhzaHdrRecord(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlhzaHdrRecord.begin,rlhzaHdrRecord.length());
   }
   
     /**
	 * 	Update RlhzaHdrRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlhzaHdrRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlhzaHdrRecord.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RlhzaHdrRecord with another Field
	 *	@param value
	 */
   public void setRlhzaHdrRecord(Field source) {
   	replace(source,0,source.length(),rlhzaHdrRecord.begin,rlhzaHdrRecord.length());
   }  
   
     /**
	 * 	Update RlhzaHdrRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlhzaHdrRecord(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlhzaHdrRecord.begin,rlhzaHdrRecord.length());
   }
   
     /**
	 * 	Update RlhzaHdrRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlhzaHdrRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlhzaHdrRecord.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rlhzaTlrRecord
	 *	@return rlhzaTlrRecord
	 */   
	 public RlhzaTlrRecord getRlhzaTlrRecord() {
   	return rlhzaTlrRecord;
   }
   /**
	* 	Update RlhzaTlrRecord with the passed value
	*   Corresponding COBOL Variable is RLHZA-TLR-RECORD
	*	@param value
	*/
   public void setRlhzaTlrRecord(char[] value) {
      rlhzaTlrRecord.setString(value); 
   }   
    
     /**
	 * 	Update RlhzaTlrRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlhzaTlrRecord(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlhzaTlrRecord.begin,rlhzaTlrRecord.length());
   }
   
     /**
	 * 	Update RlhzaTlrRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlhzaTlrRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlhzaTlrRecord.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RlhzaTlrRecord with another Field
	 *	@param value
	 */
   public void setRlhzaTlrRecord(Field source) {
   	replace(source,0,source.length(),rlhzaTlrRecord.begin,rlhzaTlrRecord.length());
   }  
   
     /**
	 * 	Update RlhzaTlrRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlhzaTlrRecord(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlhzaTlrRecord.begin,rlhzaTlrRecord.length());
   }
   
     /**
	 * 	Update RlhzaTlrRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlhzaTlrRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlhzaTlrRecord.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getRlhzaRcCycleDataFieldLength() {
			return RLHZA_RC_CYCLE_DATA_LENGTH;
		}

}
  

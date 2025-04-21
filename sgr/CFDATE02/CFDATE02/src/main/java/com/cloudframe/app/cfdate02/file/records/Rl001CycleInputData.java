package com.cloudframe.app.cfdate02.file.records;

/**
*  The class Rl001CycleInputData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Rl001CycleInputData extends Rl001CycleInputDataSerialized {
   
				private Rl001DtlRecord rl001DtlRecord = new Rl001DtlRecord();
				private Rl001HdrRecord rl001HdrRecord = new Rl001HdrRecord();
				private Rl001TlrRecord rl001TlrRecord = new Rl001TlrRecord();
	
	/**
	* Constructor for Rl001CycleInputData
	**/
    public Rl001CycleInputData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			rl001DtlRecord.setParent(this,getStartOffset() + 0);
	       			rl001HdrRecord.setParent(this,getStartOffset() + 0);
	       			rl001TlrRecord.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of rl001DtlRecord
	 *	@return rl001DtlRecord
	 */   
	 public Rl001DtlRecord getRl001DtlRecord() {
   	return rl001DtlRecord;
   }
   /**
	* 	Update Rl001DtlRecord with the passed value
	*   Corresponding COBOL Variable is RL001-DTL-RECORD
	*	@param value
	*/
   public void setRl001DtlRecord(char[] value) {
      rl001DtlRecord.setString(value); 
   }   
    
     /**
	 * 	Update Rl001DtlRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRl001DtlRecord(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rl001DtlRecord.begin,rl001DtlRecord.length());
   }
   
     /**
	 * 	Update Rl001DtlRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRl001DtlRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rl001DtlRecord.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Rl001DtlRecord with another Field
	 *	@param value
	 */
   public void setRl001DtlRecord(Field source) {
   	replace(source,0,source.length(),rl001DtlRecord.begin,rl001DtlRecord.length());
   }  
   
     /**
	 * 	Update Rl001DtlRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRl001DtlRecord(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rl001DtlRecord.begin,rl001DtlRecord.length());
   }
   
     /**
	 * 	Update Rl001DtlRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRl001DtlRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rl001DtlRecord.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rl001HdrRecord
	 *	@return rl001HdrRecord
	 */   
	 public Rl001HdrRecord getRl001HdrRecord() {
   	return rl001HdrRecord;
   }
   /**
	* 	Update Rl001HdrRecord with the passed value
	*   Corresponding COBOL Variable is RL001-HDR-RECORD
	*	@param value
	*/
   public void setRl001HdrRecord(char[] value) {
      rl001HdrRecord.setString(value); 
   }   
    
     /**
	 * 	Update Rl001HdrRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRl001HdrRecord(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rl001HdrRecord.begin,rl001HdrRecord.length());
   }
   
     /**
	 * 	Update Rl001HdrRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRl001HdrRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rl001HdrRecord.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Rl001HdrRecord with another Field
	 *	@param value
	 */
   public void setRl001HdrRecord(Field source) {
   	replace(source,0,source.length(),rl001HdrRecord.begin,rl001HdrRecord.length());
   }  
   
     /**
	 * 	Update Rl001HdrRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRl001HdrRecord(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rl001HdrRecord.begin,rl001HdrRecord.length());
   }
   
     /**
	 * 	Update Rl001HdrRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRl001HdrRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rl001HdrRecord.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rl001TlrRecord
	 *	@return rl001TlrRecord
	 */   
	 public Rl001TlrRecord getRl001TlrRecord() {
   	return rl001TlrRecord;
   }
   /**
	* 	Update Rl001TlrRecord with the passed value
	*   Corresponding COBOL Variable is RL001-TLR-RECORD
	*	@param value
	*/
   public void setRl001TlrRecord(char[] value) {
      rl001TlrRecord.setString(value); 
   }   
    
     /**
	 * 	Update Rl001TlrRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRl001TlrRecord(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rl001TlrRecord.begin,rl001TlrRecord.length());
   }
   
     /**
	 * 	Update Rl001TlrRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRl001TlrRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rl001TlrRecord.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Rl001TlrRecord with another Field
	 *	@param value
	 */
   public void setRl001TlrRecord(Field source) {
   	replace(source,0,source.length(),rl001TlrRecord.begin,rl001TlrRecord.length());
   }  
   
     /**
	 * 	Update Rl001TlrRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRl001TlrRecord(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rl001TlrRecord.begin,rl001TlrRecord.length());
   }
   
     /**
	 * 	Update Rl001TlrRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRl001TlrRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rl001TlrRecord.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getRl001CycleInputDataFieldLength() {
			return RL_001_CYCLE_INPUT_DATA_LENGTH;
		}

}
  

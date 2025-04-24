package com.cloudframe.app.init1.dto;

/**
*  The class Rl001CycleInputData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Rl001CycleInputData extends Rl001CycleInputDataSerialized { 
   
				private Rl001DtlRecord rl001DtlRecord = new Rl001DtlRecord();

						private char[] rl001HdrRecord = Field.fillLowValue(700);

						private char[] rl001TlrRecord = Field.fillLowValue(700);
	
	/**
	* Constructor for Rl001CycleInputData
	**/
    public Rl001CycleInputData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			rl001DtlRecord.setParent(this,getStartOffset() + 0);
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
   public char[] getRl001HdrRecord() throws CFException{
     if (isRl001HdrRecordModified()) { 
        rl001HdrRecord = refreshRl001HdrRecord();
     }
   		return rl001HdrRecord;
   }

  
	/**
	*  set variable rl001HdrRecord
	*  Corresponding COBOL Variable is RL001-HDR-RECORD
	*  @param value
	**/
   public void setRl001HdrRecord(char[] value) {
      rl001HdrRecord = checkRl001HdrRecordConstraints(value);
      serializeRl001HdrRecord(rl001HdrRecord);
   } 

     /**
	 * 	Update Rl001HdrRecord 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRl001HdrRecord(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRl001HdrRecord,rl001HdrRecord.length);
   	
   }
   
   public void setRl001HdrRecord(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRl001HdrRecord,rl001HdrRecord.length);
   	
   }
   
     /**
	 * 	Update Rl001HdrRecord 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRl001HdrRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRl001HdrRecord+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rl001HdrRecord with another Field
	 *	@param value
	 */
   public void setRl001HdrRecord(Field source) {
       replace(source,0,source.length(),beginRl001HdrRecord,RL_001_HDR_RECORD_LEN);
   	
   }  
   
     /**
	 * 	Update Rl001HdrRecord 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRl001HdrRecord(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRl001HdrRecord,RL_001_HDR_RECORD_LEN);
   	
   }
   
     /**
	 * 	Update Rl001HdrRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRl001HdrRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRl001HdrRecord+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rl001TlrRecord
	 *	@return rl001TlrRecord
	 */
   public char[] getRl001TlrRecord() throws CFException{
     if (isRl001TlrRecordModified()) { 
        rl001TlrRecord = refreshRl001TlrRecord();
     }
   		return rl001TlrRecord;
   }

  
	/**
	*  set variable rl001TlrRecord
	*  Corresponding COBOL Variable is RL001-TLR-RECORD
	*  @param value
	**/
   public void setRl001TlrRecord(char[] value) {
      rl001TlrRecord = checkRl001TlrRecordConstraints(value);
      serializeRl001TlrRecord(rl001TlrRecord);
   } 

     /**
	 * 	Update Rl001TlrRecord 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRl001TlrRecord(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRl001TlrRecord,rl001TlrRecord.length);
   	
   }
   
   public void setRl001TlrRecord(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRl001TlrRecord,rl001TlrRecord.length);
   	
   }
   
     /**
	 * 	Update Rl001TlrRecord 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRl001TlrRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRl001TlrRecord+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rl001TlrRecord with another Field
	 *	@param value
	 */
   public void setRl001TlrRecord(Field source) {
       replace(source,0,source.length(),beginRl001TlrRecord,RL_001_TLR_RECORD_LEN);
   	
   }  
   
     /**
	 * 	Update Rl001TlrRecord 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRl001TlrRecord(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRl001TlrRecord,RL_001_TLR_RECORD_LEN);
   	
   }
   
     /**
	 * 	Update Rl001TlrRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRl001TlrRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRl001TlrRecord+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRl001CycleInputDataFieldLength() {
			return RL_001_CYCLE_INPUT_DATA_LENGTH;
		}

}
  

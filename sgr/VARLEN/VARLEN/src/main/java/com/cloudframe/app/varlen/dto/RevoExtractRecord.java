package com.cloudframe.app.varlen.dto;

/**
*  The class RevoExtractRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/


import com.cloudframe.app.varlen.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RevoExtractRecord extends RevoExtractRecordSerialized {
   

						private char[] revoFixedPartOfRecord = Field.fillLowValue(674);
				private RevoHeaderRecord revoHeaderRecord = new RevoHeaderRecord();
				private RevoDetailRecord revoDetailRecord = new RevoDetailRecord();
				private RevoTrailerRecord revoTrailerRecord = new RevoTrailerRecord();
	
	/**
	* Constructor for RevoExtractRecord
	**/
    public RevoExtractRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			revoHeaderRecord.setParent(this,getStartOffset() + 2);
	       			revoDetailRecord.setParent(this,getStartOffset() + 2);
	       			revoTrailerRecord.setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of revoFixedPartOfRecord
	 *	@return revoFixedPartOfRecord
	 */
   public char[] getRevoFixedPartOfRecord() throws CFException{
     if (isRevoFixedPartOfRecordModified()) { 
        revoFixedPartOfRecord = refreshRevoFixedPartOfRecord();
     }
   		return revoFixedPartOfRecord;
   }

  
	/**
	*  set variable revoFixedPartOfRecord
	*  Corresponding COBOL Variable is REVO-FIXED-PART-OF-RECORD
	*  @param value
	**/
   public void setRevoFixedPartOfRecord(char[] value) {
      revoFixedPartOfRecord = checkRevoFixedPartOfRecordConstraints(value);
      serializeRevoFixedPartOfRecord(revoFixedPartOfRecord);
   } 

     /**
	 * 	Update RevoFixedPartOfRecord 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRevoFixedPartOfRecord(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRevoFixedPartOfRecord,revoFixedPartOfRecord.length);
   	
   }
   
   public void setRevoFixedPartOfRecord(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRevoFixedPartOfRecord,revoFixedPartOfRecord.length);
   	
   }
   
     /**
	 * 	Update RevoFixedPartOfRecord 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRevoFixedPartOfRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRevoFixedPartOfRecord+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RevoFixedPartOfRecord with another Field
	 *	@param value
	 */
   public void setRevoFixedPartOfRecord(Field source) {
       replace(source,0,source.length(),beginRevoFixedPartOfRecord,REVO_FIXED_PART_OF_RECORD_LEN);
   	
   }  
   
     /**
	 * 	Update RevoFixedPartOfRecord 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRevoFixedPartOfRecord(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRevoFixedPartOfRecord,REVO_FIXED_PART_OF_RECORD_LEN);
   	
   }
   
     /**
	 * 	Update RevoFixedPartOfRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRevoFixedPartOfRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRevoFixedPartOfRecord+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of revoHeaderRecord
	 *	@return revoHeaderRecord
	 */   
	 public RevoHeaderRecord getRevoHeaderRecord() {
   	return revoHeaderRecord;
   }
   /**
	* 	Update RevoHeaderRecord with the passed value
	*   Corresponding COBOL Variable is REVO-HEADER-RECORD
	*	@param value
	*/
   public void setRevoHeaderRecord(char[] value) {
      revoHeaderRecord.setString(value); 
   }   
    
     /**
	 * 	Update RevoHeaderRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRevoHeaderRecord(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,revoHeaderRecord.begin,revoHeaderRecord.length());
   }
   
     /**
	 * 	Update RevoHeaderRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRevoHeaderRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,revoHeaderRecord.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RevoHeaderRecord with another Field
	 *	@param value
	 */
   public void setRevoHeaderRecord(Field source) {
   	replace(source,0,source.length(),revoHeaderRecord.begin,revoHeaderRecord.length());
   }  
   
     /**
	 * 	Update RevoHeaderRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRevoHeaderRecord(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,revoHeaderRecord.begin,revoHeaderRecord.length());
   }
   
     /**
	 * 	Update RevoHeaderRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRevoHeaderRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,revoHeaderRecord.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of revoDetailRecord
	 *	@return revoDetailRecord
	 */   
	 public RevoDetailRecord getRevoDetailRecord() {
   	return revoDetailRecord;
   }
   /**
	* 	Update RevoDetailRecord with the passed value
	*   Corresponding COBOL Variable is REVO-DETAIL-RECORD
	*	@param value
	*/
   public void setRevoDetailRecord(char[] value) {
      revoDetailRecord.setString(value); 
   }   
    
     /**
	 * 	Update RevoDetailRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRevoDetailRecord(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,revoDetailRecord.begin,revoDetailRecord.length());
   }
   
     /**
	 * 	Update RevoDetailRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRevoDetailRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,revoDetailRecord.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RevoDetailRecord with another Field
	 *	@param value
	 */
   public void setRevoDetailRecord(Field source) {
   	replace(source,0,source.length(),revoDetailRecord.begin,revoDetailRecord.length());
   }  
   
     /**
	 * 	Update RevoDetailRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRevoDetailRecord(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,revoDetailRecord.begin,revoDetailRecord.length());
   }
   
     /**
	 * 	Update RevoDetailRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRevoDetailRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,revoDetailRecord.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of revoTrailerRecord
	 *	@return revoTrailerRecord
	 */   
	 public RevoTrailerRecord getRevoTrailerRecord() {
   	return revoTrailerRecord;
   }
   /**
	* 	Update RevoTrailerRecord with the passed value
	*   Corresponding COBOL Variable is REVO-TRAILER-RECORD
	*	@param value
	*/
   public void setRevoTrailerRecord(char[] value) {
      revoTrailerRecord.setString(value); 
   }   
    
     /**
	 * 	Update RevoTrailerRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRevoTrailerRecord(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,revoTrailerRecord.begin,revoTrailerRecord.length());
   }
   
     /**
	 * 	Update RevoTrailerRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRevoTrailerRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,revoTrailerRecord.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RevoTrailerRecord with another Field
	 *	@param value
	 */
   public void setRevoTrailerRecord(Field source) {
   	replace(source,0,source.length(),revoTrailerRecord.begin,revoTrailerRecord.length());
   }  
   
     /**
	 * 	Update RevoTrailerRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRevoTrailerRecord(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,revoTrailerRecord.begin,revoTrailerRecord.length());
   }
   
     /**
	 * 	Update RevoTrailerRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRevoTrailerRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,revoTrailerRecord.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getRevoExtractRecordFieldLength() {
			return REVO_EXTRACT_RECORD_LENGTH;
		}

}
  

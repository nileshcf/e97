package com.cloudframe.app.varlen.dto;

/**
*  The class Revo3ExtractRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:10. using version 5.0.0.256
**/


import com.cloudframe.app.varlen.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Revo3ExtractRecord extends Revo3ExtractRecordSerialized {
   

						private char[] revo3FixedPartOfRecord = Field.fillLowValue(32);
				private Revo3HeaderRecord revo3HeaderRecord = new Revo3HeaderRecord();
				private Revo3DetailRecord revo3DetailRecord = new Revo3DetailRecord();
				private Revo3TrailerRecord revo3TrailerRecord = new Revo3TrailerRecord();
	
	/**
	* Constructor for Revo3ExtractRecord
	**/
    public Revo3ExtractRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			revo3HeaderRecord.setParent(this,getStartOffset() + 2);
	       			revo3DetailRecord.setParent(this,getStartOffset() + 2);
	       			revo3TrailerRecord.setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of revo3FixedPartOfRecord
	 *	@return revo3FixedPartOfRecord
	 */
   public char[] getRevo3FixedPartOfRecord() throws CFException{
     if (isRevo3FixedPartOfRecordModified()) { 
        revo3FixedPartOfRecord = refreshRevo3FixedPartOfRecord();
     }
   		return revo3FixedPartOfRecord;
   }

  
	/**
	*  set variable revo3FixedPartOfRecord
	*  Corresponding COBOL Variable is REVO3-FIXED-PART-OF-RECORD
	*  @param value
	**/
   public void setRevo3FixedPartOfRecord(char[] value) {
      revo3FixedPartOfRecord = checkRevo3FixedPartOfRecordConstraints(value);
      serializeRevo3FixedPartOfRecord(revo3FixedPartOfRecord);
   } 

     /**
	 * 	Update Revo3FixedPartOfRecord 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRevo3FixedPartOfRecord(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRevo3FixedPartOfRecord,revo3FixedPartOfRecord.length);
   	
   }
   
   public void setRevo3FixedPartOfRecord(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRevo3FixedPartOfRecord,revo3FixedPartOfRecord.length);
   	
   }
   
     /**
	 * 	Update Revo3FixedPartOfRecord 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRevo3FixedPartOfRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRevo3FixedPartOfRecord+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Revo3FixedPartOfRecord with another Field
	 *	@param value
	 */
   public void setRevo3FixedPartOfRecord(Field source) {
       replace(source,0,source.length(),beginRevo3FixedPartOfRecord,REVO_3_FIXED_PART_OF_RECORD_LEN);
   	
   }  
   
     /**
	 * 	Update Revo3FixedPartOfRecord 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRevo3FixedPartOfRecord(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRevo3FixedPartOfRecord,REVO_3_FIXED_PART_OF_RECORD_LEN);
   	
   }
   
     /**
	 * 	Update Revo3FixedPartOfRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRevo3FixedPartOfRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRevo3FixedPartOfRecord+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of revo3HeaderRecord
	 *	@return revo3HeaderRecord
	 */   
	 public Revo3HeaderRecord getRevo3HeaderRecord() {
   	return revo3HeaderRecord;
   }
   /**
	* 	Update Revo3HeaderRecord with the passed value
	*   Corresponding COBOL Variable is REVO3-HEADER-RECORD
	*	@param value
	*/
   public void setRevo3HeaderRecord(char[] value) {
      revo3HeaderRecord.setString(value); 
   }   
    
     /**
	 * 	Update Revo3HeaderRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRevo3HeaderRecord(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,revo3HeaderRecord.begin,revo3HeaderRecord.length());
   }
   
     /**
	 * 	Update Revo3HeaderRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRevo3HeaderRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,revo3HeaderRecord.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Revo3HeaderRecord with another Field
	 *	@param value
	 */
   public void setRevo3HeaderRecord(Field source) {
   	replace(source,0,source.length(),revo3HeaderRecord.begin,revo3HeaderRecord.length());
   }  
   
     /**
	 * 	Update Revo3HeaderRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRevo3HeaderRecord(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,revo3HeaderRecord.begin,revo3HeaderRecord.length());
   }
   
     /**
	 * 	Update Revo3HeaderRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRevo3HeaderRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,revo3HeaderRecord.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of revo3DetailRecord
	 *	@return revo3DetailRecord
	 */   
	 public Revo3DetailRecord getRevo3DetailRecord() {
   	return revo3DetailRecord;
   }
   /**
	* 	Update Revo3DetailRecord with the passed value
	*   Corresponding COBOL Variable is REVO3-DETAIL-RECORD
	*	@param value
	*/
   public void setRevo3DetailRecord(char[] value) {
      revo3DetailRecord.setString(value); 
   }   
    
     /**
	 * 	Update Revo3DetailRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRevo3DetailRecord(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,revo3DetailRecord.begin,revo3DetailRecord.length());
   }
   
     /**
	 * 	Update Revo3DetailRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRevo3DetailRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,revo3DetailRecord.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Revo3DetailRecord with another Field
	 *	@param value
	 */
   public void setRevo3DetailRecord(Field source) {
   	replace(source,0,source.length(),revo3DetailRecord.begin,revo3DetailRecord.length());
   }  
   
     /**
	 * 	Update Revo3DetailRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRevo3DetailRecord(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,revo3DetailRecord.begin,revo3DetailRecord.length());
   }
   
     /**
	 * 	Update Revo3DetailRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRevo3DetailRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,revo3DetailRecord.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of revo3TrailerRecord
	 *	@return revo3TrailerRecord
	 */   
	 public Revo3TrailerRecord getRevo3TrailerRecord() {
   	return revo3TrailerRecord;
   }
   /**
	* 	Update Revo3TrailerRecord with the passed value
	*   Corresponding COBOL Variable is REVO3-TRAILER-RECORD
	*	@param value
	*/
   public void setRevo3TrailerRecord(char[] value) {
      revo3TrailerRecord.setString(value); 
   }   
    
     /**
	 * 	Update Revo3TrailerRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRevo3TrailerRecord(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,revo3TrailerRecord.begin,revo3TrailerRecord.length());
   }
   
     /**
	 * 	Update Revo3TrailerRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRevo3TrailerRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,revo3TrailerRecord.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Revo3TrailerRecord with another Field
	 *	@param value
	 */
   public void setRevo3TrailerRecord(Field source) {
   	replace(source,0,source.length(),revo3TrailerRecord.begin,revo3TrailerRecord.length());
   }  
   
     /**
	 * 	Update Revo3TrailerRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRevo3TrailerRecord(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,revo3TrailerRecord.begin,revo3TrailerRecord.length());
   }
   
     /**
	 * 	Update Revo3TrailerRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRevo3TrailerRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,revo3TrailerRecord.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getRevo3ExtractRecordFieldLength() {
			return REVO_3_EXTRACT_RECORD_LENGTH;
		}

}
  

package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf501LogRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf501LogRecord extends Sf501LogRecordSerialized { 
   

						private char[] sf501Record = Field.fillLowValue(8000);
				private Sf501RecordRedefined sf501RecordRedefined = new Sf501RecordRedefined();
				private Sf5019Record sf5019Record = new Sf5019Record();

						private char[] sf501RRecord = Field.fillLowValue(8000);
				private Sf501IRecord sf501IRecord = new Sf501IRecord();
				private Sf501PRecord sf501PRecord = new Sf501PRecord();
				private Sf501NRecord sf501NRecord = new Sf501NRecord();
	
	/**
	* Constructor for Sf501LogRecord
	**/
    public Sf501LogRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			sf501RecordRedefined.setParent(this,getStartOffset() + 0);
	       			sf5019Record.setParent(this,getStartOffset() + 0);
	       			sf501IRecord.setParent(this,getStartOffset() + 0);
	       			sf501PRecord.setParent(this,getStartOffset() + 0);
	       			sf501NRecord.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sf501Record
	 *	@return sf501Record
	 */
   public char[] getSf501Record() throws CFException{
     if (isSf501RecordModified()) { 
        sf501Record = refreshSf501Record();
     }
   		return sf501Record;
   }

  
	/**
	*  set variable sf501Record
	*  Corresponding COBOL Variable is SF501-RECORD
	*  @param value
	**/
   public void setSf501Record(char[] value) {
      sf501Record = checkSf501RecordConstraints(value);
      serializeSf501Record(sf501Record);
   } 

     /**
	 * 	Update Sf501Record 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf501Record(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf501Record,sf501Record.length);
   	
   }
   
   public void setSf501Record(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf501Record,sf501Record.length);
   	
   }
   
     /**
	 * 	Update Sf501Record 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501Record(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501Record+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf501Record with another Field
	 *	@param value
	 */
   public void setSf501Record(Field source) {
       replace(source,0,source.length(),beginSf501Record,SF_501_RECORD_LEN);
   	
   }  
   
     /**
	 * 	Update Sf501Record 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf501Record(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf501Record,SF_501_RECORD_LEN);
   	
   }
   
     /**
	 * 	Update Sf501Record 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501Record(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501Record+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf501RecordRedefined
	 *	@return sf501RecordRedefined
	 */   
	 public Sf501RecordRedefined getSf501RecordRedefined() {
   	return sf501RecordRedefined;
   }
   /**
	* 	Update Sf501RecordRedefined with the passed value
	*   Corresponding COBOL Variable is SF501-RECORD-REDEFINED
	*	@param value
	*/
   public void setSf501RecordRedefined(char[] value) {
      sf501RecordRedefined.setString(value); 
   }   
    
     /**
	 * 	Update Sf501RecordRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf501RecordRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf501RecordRedefined.begin,sf501RecordRedefined.length());
   }
   
     /**
	 * 	Update Sf501RecordRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501RecordRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf501RecordRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf501RecordRedefined with another Field
	 *	@param value
	 */
   public void setSf501RecordRedefined(Field source) {
   	replace(source,0,source.length(),sf501RecordRedefined.begin,sf501RecordRedefined.length());
   }  
   
     /**
	 * 	Update Sf501RecordRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf501RecordRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf501RecordRedefined.begin,sf501RecordRedefined.length());
   }
   
     /**
	 * 	Update Sf501RecordRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501RecordRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf501RecordRedefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf5019Record
	 *	@return sf5019Record
	 */   
	 public Sf5019Record getSf5019Record() {
   	return sf5019Record;
   }
   /**
	* 	Update Sf5019Record with the passed value
	*   Corresponding COBOL Variable is SF501-9-RECORD
	*	@param value
	*/
   public void setSf5019Record(char[] value) {
      sf5019Record.setString(value); 
   }   
    
     /**
	 * 	Update Sf5019Record 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf5019Record(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf5019Record.begin,sf5019Record.length());
   }
   
     /**
	 * 	Update Sf5019Record 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf5019Record(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf5019Record.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf5019Record with another Field
	 *	@param value
	 */
   public void setSf5019Record(Field source) {
   	replace(source,0,source.length(),sf5019Record.begin,sf5019Record.length());
   }  
   
     /**
	 * 	Update Sf5019Record 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf5019Record(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf5019Record.begin,sf5019Record.length());
   }
   
     /**
	 * 	Update Sf5019Record 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf5019Record(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf5019Record.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf501RRecord
	 *	@return sf501RRecord
	 */
   public char[] getSf501RRecord() throws CFException{
     if (isSf501RRecordModified()) { 
        sf501RRecord = refreshSf501RRecord();
     }
   		return sf501RRecord;
   }

  
	/**
	*  set variable sf501RRecord
	*  Corresponding COBOL Variable is SF501-R-RECORD
	*  @param value
	**/
   public void setSf501RRecord(char[] value) {
      sf501RRecord = checkSf501RRecordConstraints(value);
      serializeSf501RRecord(sf501RRecord);
   } 

     /**
	 * 	Update Sf501RRecord 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf501RRecord(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf501RRecord,sf501RRecord.length);
   	
   }
   
   public void setSf501RRecord(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf501RRecord,sf501RRecord.length);
   	
   }
   
     /**
	 * 	Update Sf501RRecord 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501RRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501RRecord+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf501RRecord with another Field
	 *	@param value
	 */
   public void setSf501RRecord(Field source) {
       replace(source,0,source.length(),beginSf501RRecord,SF_501_RRECORD_LEN);
   	
   }  
   
     /**
	 * 	Update Sf501RRecord 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf501RRecord(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf501RRecord,SF_501_RRECORD_LEN);
   	
   }
   
     /**
	 * 	Update Sf501RRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501RRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501RRecord+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf501IRecord
	 *	@return sf501IRecord
	 */   
	 public Sf501IRecord getSf501IRecord() {
   	return sf501IRecord;
   }
   /**
	* 	Update Sf501IRecord with the passed value
	*   Corresponding COBOL Variable is SF501-I-RECORD
	*	@param value
	*/
   public void setSf501IRecord(char[] value) {
      sf501IRecord.setString(value); 
   }   
    
     /**
	 * 	Update Sf501IRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf501IRecord(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf501IRecord.begin,sf501IRecord.length());
   }
   
     /**
	 * 	Update Sf501IRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501IRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf501IRecord.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf501IRecord with another Field
	 *	@param value
	 */
   public void setSf501IRecord(Field source) {
   	replace(source,0,source.length(),sf501IRecord.begin,sf501IRecord.length());
   }  
   
     /**
	 * 	Update Sf501IRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf501IRecord(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf501IRecord.begin,sf501IRecord.length());
   }
   
     /**
	 * 	Update Sf501IRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501IRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf501IRecord.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf501PRecord
	 *	@return sf501PRecord
	 */   
	 public Sf501PRecord getSf501PRecord() {
   	return sf501PRecord;
   }
   /**
	* 	Update Sf501PRecord with the passed value
	*   Corresponding COBOL Variable is SF501-P-RECORD
	*	@param value
	*/
   public void setSf501PRecord(char[] value) {
      sf501PRecord.setString(value); 
   }   
    
     /**
	 * 	Update Sf501PRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf501PRecord(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf501PRecord.begin,sf501PRecord.length());
   }
   
     /**
	 * 	Update Sf501PRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501PRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf501PRecord.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf501PRecord with another Field
	 *	@param value
	 */
   public void setSf501PRecord(Field source) {
   	replace(source,0,source.length(),sf501PRecord.begin,sf501PRecord.length());
   }  
   
     /**
	 * 	Update Sf501PRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf501PRecord(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf501PRecord.begin,sf501PRecord.length());
   }
   
     /**
	 * 	Update Sf501PRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501PRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf501PRecord.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf501NRecord
	 *	@return sf501NRecord
	 */   
	 public Sf501NRecord getSf501NRecord() {
   	return sf501NRecord;
   }
   /**
	* 	Update Sf501NRecord with the passed value
	*   Corresponding COBOL Variable is SF501-N-RECORD
	*	@param value
	*/
   public void setSf501NRecord(char[] value) {
      sf501NRecord.setString(value); 
   }   
    
     /**
	 * 	Update Sf501NRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf501NRecord(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf501NRecord.begin,sf501NRecord.length());
   }
   
     /**
	 * 	Update Sf501NRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501NRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf501NRecord.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf501NRecord with another Field
	 *	@param value
	 */
   public void setSf501NRecord(Field source) {
   	replace(source,0,source.length(),sf501NRecord.begin,sf501NRecord.length());
   }  
   
     /**
	 * 	Update Sf501NRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf501NRecord(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf501NRecord.begin,sf501NRecord.length());
   }
   
     /**
	 * 	Update Sf501NRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501NRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf501NRecord.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSf501LogRecordFieldLength() {
			return SF_501_LOG_RECORD_LENGTH;
		}

}
  

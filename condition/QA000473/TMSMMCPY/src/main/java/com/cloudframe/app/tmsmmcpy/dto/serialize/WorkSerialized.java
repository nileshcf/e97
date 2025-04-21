package com.cloudframe.app.tmsmmcpy.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 25;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSmmRecordsRead;
            protected  int beginInvalidSmmCnt;
            protected  int beginWriteSmmCnt;
            protected  int beginSmmDupCnt;
            protected  int beginDepDupKey;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSmmRecordsRead = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
             beginInvalidSmmCnt = getStartOffset() + 5;	// set offset for serialization
  
             beginWriteSmmCnt = getStartOffset() + 10;	// set offset for serialization
  
             beginSmmDupCnt = getStartOffset() + 15;	// set offset for serialization
  
             beginDepDupKey = getStartOffset() + 20;	// set offset for serialization
  
  
	   /*  end of offset */
	}
        int localSmmRecordsReadCounter = -1;
        public boolean isSmmRecordsReadModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSmmRecordsReadCounter != sharedCounter;
           localSmmRecordsReadCounter = sharedCounter; return hasModified; 
        }
	    public boolean smmRecordsReadIsNumeric() {
	      return decimalIsNumeric(beginSmmRecordsRead,SMM_RECORDS_READ_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SMM_RECORDS_READ_LEN = 5;
  	/**
	 * 	serializeSmmRecordsRead
	 */
	protected void serializeSmmRecordsRead(int smmRecordsRead) {
		   putDecimal(beginSmmRecordsRead,smmRecordsRead,SMM_RECORDS_READ_LEN,true);
   }
   

   protected int checkSmmRecordsReadMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshSmmRecordsRead is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSmmRecordsRead() throws CFException {	
   	try { 
		 return (getIntDecimal(beginSmmRecordsRead,SMM_RECORDS_READ_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("smmRecordsRead", beginSmmRecordsRead,SMM_RECORDS_READ_LEN);
     }
   	}
     int localEndSwCounter = -1;
     public boolean isEndSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEndSwCounter != sharedCounter;
         localEndSwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkEndSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSmmEofSwCounter = -1;
     public boolean isSmmEofSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmEofSwCounter != sharedCounter;
         localSmmEofSwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSmmEofSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSortEofSwCounter = -1;
     public boolean isSortEofSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSortEofSwCounter != sharedCounter;
         localSortEofSwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSortEofSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
        int localInvalidSmmCntCounter = -1;
        public boolean isInvalidSmmCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localInvalidSmmCntCounter != sharedCounter;
           localInvalidSmmCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean invalidSmmCntIsNumeric() {
	      return decimalIsNumeric(beginInvalidSmmCnt,INVALID_SMM_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int INVALID_SMM_CNT_LEN = 5;
  	/**
	 * 	serializeInvalidSmmCnt
	 */
	protected void serializeInvalidSmmCnt(long invalidSmmCnt) {
		   putDecimal(beginInvalidSmmCnt,invalidSmmCnt,INVALID_SMM_CNT_LEN,false);
   }
   

   protected long checkInvalidSmmCntMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1G /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshInvalidSmmCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshInvalidSmmCnt() throws CFException {	
   	try { 
		 return (getLongDecimal(beginInvalidSmmCnt,INVALID_SMM_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("invalidSmmCnt", beginInvalidSmmCnt,INVALID_SMM_CNT_LEN);
     }
   	}
        int localWriteSmmCntCounter = -1;
        public boolean isWriteSmmCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWriteSmmCntCounter != sharedCounter;
           localWriteSmmCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean writeSmmCntIsNumeric() {
	      return decimalIsNumeric(beginWriteSmmCnt,WRITE_SMM_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int WRITE_SMM_CNT_LEN = 5;
  	/**
	 * 	serializeWriteSmmCnt
	 */
	protected void serializeWriteSmmCnt(long writeSmmCnt) {
		   putDecimal(beginWriteSmmCnt,writeSmmCnt,WRITE_SMM_CNT_LEN,false);
   }
   

   protected long checkWriteSmmCntMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1G /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshWriteSmmCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshWriteSmmCnt() throws CFException {	
   	try { 
		 return (getLongDecimal(beginWriteSmmCnt,WRITE_SMM_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("writeSmmCnt", beginWriteSmmCnt,WRITE_SMM_CNT_LEN);
     }
   	}
        int localSmmDupCntCounter = -1;
        public boolean isSmmDupCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSmmDupCntCounter != sharedCounter;
           localSmmDupCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean smmDupCntIsNumeric() {
	      return decimalIsNumeric(beginSmmDupCnt,SMM_DUP_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SMM_DUP_CNT_LEN = 5;
  	/**
	 * 	serializeSmmDupCnt
	 */
	protected void serializeSmmDupCnt(long smmDupCnt) {
		   putDecimal(beginSmmDupCnt,smmDupCnt,SMM_DUP_CNT_LEN,false);
   }
   

   protected long checkSmmDupCntMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1G /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshSmmDupCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSmmDupCnt() throws CFException {	
   	try { 
		 return (getLongDecimal(beginSmmDupCnt,SMM_DUP_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("smmDupCnt", beginSmmDupCnt,SMM_DUP_CNT_LEN);
     }
   	}
     int localDepDupKeyCounter = -1;
     public boolean isDepDupKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDepDupKeyCounter != sharedCounter;
         localDepDupKeyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of depDupKey
	 *	@return depDupKey
	 */
	public char[]  getDepDupKeyString() {
	     return getCharArray(beginDepDupKey,DEP_DUP_KEY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean depDupKeyIsNumeric() {
	    return isNumeric(beginDepDupKey
	                    ,beginDepDupKey + DEP_DUP_KEY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DEP_DUP_KEY_LEN = 5;
  	/**
	 * serializeDepDupKey
	 */
	protected void serializeDepDupKey(long depDupKey) {
		 putNumber(beginDepDupKey,depDupKey,DEP_DUP_KEY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDepDupKeyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDepDupKey
	 */
   	protected  long serializeDepDupKey(char[] value) {
	    long  depDupKey;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    depDupKey = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginDepDupKey
		       ,5
		      );
		 localDepDupKeyCounter = shareString.getSerializedField().getModifiedCounter();
		return  depDupKey;
    }

   protected long checkDepDupKeyMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDepDupKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDepDupKey() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDepDupKey
			                 ,DEP_DUP_KEY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("depDupKey", beginDepDupKey,DEP_DUP_KEY_LEN);
    }
   	}
     int localSmmKeyHoldCounter = -1;
     public boolean isSmmKeyHoldModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmKeyHoldCounter != sharedCounter;
         localSmmKeyHoldCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSmmKeyHoldConstraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }




}
  

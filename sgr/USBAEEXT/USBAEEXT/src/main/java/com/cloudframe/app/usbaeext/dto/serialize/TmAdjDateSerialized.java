package com.cloudframe.app.usbaeext.dto.serialize;

/**
*  The class TmAdjDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TmAdjDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TmAdjDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TM_ADJ_DATE_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTmAdjDateMm;
            protected  int beginTmAdjDateDd;
            protected  int beginTmAdjDateYyyy;
	
	/**
	* Constructor for TmAdjDateSerialized
	**/
    public TmAdjDateSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TmAdjDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TM_ADJ_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTmAdjDateMm = getStartOffset() + 0;	// set offset for serialization
  
             beginTmAdjDateDd = getStartOffset() + 3;	// set offset for serialization
  
             beginTmAdjDateYyyy = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTmAdjDateMmCounter = -1;
     public boolean isTmAdjDateMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjDateMmCounter != sharedCounter;
         localTmAdjDateMmCounter = sharedCounter; return hasModified;
     }
	protected static final int TM_ADJ_DATE_MM_LEN = 2;
	/**
	 * 	serialize this TmAdjDateMm
	 */
   protected void serializeTmAdjDateMm(char[] tmAdjDateMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tmAdjDateMm,0,getStringValue(),beginTmAdjDateMm,TM_ADJ_DATE_MM_LEN);
       localTmAdjDateMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTmAdjDateMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTmAdjDateMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTmAdjDateMm() {	 
   		return (substring(getStringValue(),beginTmAdjDateMm,beginTmAdjDateMm + TM_ADJ_DATE_MM_LEN));
   	}
     int localTmAdjDateDdCounter = -1;
     public boolean isTmAdjDateDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjDateDdCounter != sharedCounter;
         localTmAdjDateDdCounter = sharedCounter; return hasModified;
     }
	protected static final int TM_ADJ_DATE_DD_LEN = 2;
	/**
	 * 	serialize this TmAdjDateDd
	 */
   protected void serializeTmAdjDateDd(char[] tmAdjDateDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tmAdjDateDd,0,getStringValue(),beginTmAdjDateDd,TM_ADJ_DATE_DD_LEN);
       localTmAdjDateDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTmAdjDateDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTmAdjDateDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTmAdjDateDd() {	 
   		return (substring(getStringValue(),beginTmAdjDateDd,beginTmAdjDateDd + TM_ADJ_DATE_DD_LEN));
   	}
     int localTmAdjDateYyyyCounter = -1;
     public boolean isTmAdjDateYyyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjDateYyyyCounter != sharedCounter;
         localTmAdjDateYyyyCounter = sharedCounter; return hasModified;
     }
	protected static final int TM_ADJ_DATE_YYYY_LEN = 4;
	/**
	 * 	serialize this TmAdjDateYyyy
	 */
   protected void serializeTmAdjDateYyyy(char[] tmAdjDateYyyy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tmAdjDateYyyy,0,getStringValue(),beginTmAdjDateYyyy,TM_ADJ_DATE_YYYY_LEN);
       localTmAdjDateYyyyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTmAdjDateYyyyConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshTmAdjDateYyyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTmAdjDateYyyy() {	 
   		return (substring(getStringValue(),beginTmAdjDateYyyy,beginTmAdjDateYyyy + TM_ADJ_DATE_YYYY_LEN));
   	}




}
  

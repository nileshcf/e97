package com.cloudframe.app.ip606130.file.records.serialize;

/**
*  The class SortRec1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SortRec1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SortRec1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SORT_REC_1_LENGTH = 32752;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSort1TableId;
            protected  int beginSort1Key;
            protected  int beginSort1TableEffDate;
            protected  int beginSort1ActionCode;
            protected  int beginSort1TableData;
	
	/**
	* Constructor for SortRec1Serialized
	**/
    public SortRec1Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SortRec1Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SortRec1Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SortRec1Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SortRec1Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SortRec1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SORT_REC_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSort1TableId = getStartOffset() + 0;	// set offset for serialization
  
             beginSort1Key = getStartOffset() + 8;	// set offset for serialization
  
             beginSort1TableEffDate = getStartOffset() + 107;	// set offset for serialization
  
             beginSort1ActionCode = getStartOffset() + 117;	// set offset for serialization
  
             beginSort1TableData = getStartOffset() + 118;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSort1TableIdCounter = -1;
     public boolean isSort1TableIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSort1TableIdCounter != sharedCounter;
         localSort1TableIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SORT_1_TABLE_ID_LEN = 8;
	/**
	 * 	serialize this Sort1TableId
	 */
   protected void serializeSort1TableId(char[] sort1TableId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sort1TableId,0,getStringValue(),beginSort1TableId,SORT_1_TABLE_ID_LEN);
       localSort1TableIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSort1TableIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSort1TableId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSort1TableId() {	 
   		return (substring(getStringValue(),beginSort1TableId,beginSort1TableId + SORT_1_TABLE_ID_LEN));
   	}
     int localSort1KeyCounter = -1;
     public boolean isSort1KeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSort1KeyCounter != sharedCounter;
         localSort1KeyCounter = sharedCounter; return hasModified;
     }
	protected static final int SORT_1_KEY_LEN = 99;
	/**
	 * 	serialize this Sort1Key
	 */
   protected void serializeSort1Key(char[] sort1Key) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sort1Key,0,getStringValue(),beginSort1Key,SORT_1_KEY_LEN);
       localSort1KeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSort1KeyConstraints(char[] value) {
   			return super.checkConstraints(value , 99 ,false, false);
   }
    /**
	 *	refreshSort1Key is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSort1Key() {	 
   		return (substring(getStringValue(),beginSort1Key,beginSort1Key + SORT_1_KEY_LEN));
   	}
     int localSort1TableEffDateCounter = -1;
     public boolean isSort1TableEffDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSort1TableEffDateCounter != sharedCounter;
         localSort1TableEffDateCounter = sharedCounter; return hasModified;
     }
	protected static final int SORT_1_TABLE_EFF_DATE_LEN = 10;
	/**
	 * 	serialize this Sort1TableEffDate
	 */
   protected void serializeSort1TableEffDate(char[] sort1TableEffDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sort1TableEffDate,0,getStringValue(),beginSort1TableEffDate,SORT_1_TABLE_EFF_DATE_LEN);
       localSort1TableEffDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSort1TableEffDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshSort1TableEffDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSort1TableEffDate() {	 
   		return (substring(getStringValue(),beginSort1TableEffDate,beginSort1TableEffDate + SORT_1_TABLE_EFF_DATE_LEN));
   	}
     int localSort1ActionCodeCounter = -1;
     public boolean isSort1ActionCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSort1ActionCodeCounter != sharedCounter;
         localSort1ActionCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int SORT_1_ACTION_CODE_LEN = 1;
	/**
	 * 	serialize this Sort1ActionCode
	 */
   protected void serializeSort1ActionCode(char[] sort1ActionCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sort1ActionCode,0,getStringValue(),beginSort1ActionCode,SORT_1_ACTION_CODE_LEN);
       localSort1ActionCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSort1ActionCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSort1ActionCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSort1ActionCode() {	 
   		return (substring(getStringValue(),beginSort1ActionCode,beginSort1ActionCode + SORT_1_ACTION_CODE_LEN));
   	}
     int localSort1TableDataCounter = -1;
     public boolean isSort1TableDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSort1TableDataCounter != sharedCounter;
         localSort1TableDataCounter = sharedCounter; return hasModified;
     }
	protected static final int SORT_1_TABLE_DATA_LEN = 32634;
	/**
	 * 	serialize this Sort1TableData
	 */
   protected void serializeSort1TableData(char[] sort1TableData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sort1TableData,0,getStringValue(),beginSort1TableData,SORT_1_TABLE_DATA_LEN);
       localSort1TableDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSort1TableDataConstraints(char[] value) {
   			return super.checkConstraints(value , 32634 ,false, false);
   }
    /**
	 *	refreshSort1TableData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSort1TableData() {	 
   		return (substring(getStringValue(),beginSort1TableData,beginSort1TableData + SORT_1_TABLE_DATA_LEN));
   	}




}
  

package com.cloudframe.app.mcsort02.file.records.serialize;

/**
*  The class SortRec5Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SortRec5Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SortRec5Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SORT_REC_5_LENGTH = 27986;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSort5TableId;
            protected  int beginSort5Key;
            protected  int beginSort5TableEffDate;
	
	/**
	* Constructor for SortRec5Serialized
	**/
    public SortRec5Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SortRec5Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SortRec5Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SortRec5Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SortRec5Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SortRec5Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SORT_REC_5_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSort5TableId = getStartOffset() + 0;	// set offset for serialization
  
             beginSort5Key = getStartOffset() + 8;	// set offset for serialization
  
             beginSort5TableEffDate = getStartOffset() + 107;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSort5TableIdCounter = -1;
     public boolean isSort5TableIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSort5TableIdCounter != sharedCounter;
         localSort5TableIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SORT_5_TABLE_ID_LEN = 8;
	/**
	 * 	serialize this Sort5TableId
	 */
   protected void serializeSort5TableId(char[] sort5TableId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sort5TableId,0,getStringValue(),beginSort5TableId,SORT_5_TABLE_ID_LEN);
       localSort5TableIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSort5TableIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSort5TableId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSort5TableId() {	 
   		return (substring(getStringValue(),beginSort5TableId,beginSort5TableId + SORT_5_TABLE_ID_LEN));
   	}
     int localSort5KeyCounter = -1;
     public boolean isSort5KeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSort5KeyCounter != sharedCounter;
         localSort5KeyCounter = sharedCounter; return hasModified;
     }
	protected static final int SORT_5_KEY_LEN = 99;
	/**
	 * 	serialize this Sort5Key
	 */
   protected void serializeSort5Key(char[] sort5Key) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sort5Key,0,getStringValue(),beginSort5Key,SORT_5_KEY_LEN);
       localSort5KeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSort5KeyConstraints(char[] value) {
   			return super.checkConstraints(value , 99 ,false, false);
   }
    /**
	 *	refreshSort5Key is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSort5Key() {	 
   		return (substring(getStringValue(),beginSort5Key,beginSort5Key + SORT_5_KEY_LEN));
   	}
     int localSort5TableEffDateCounter = -1;
     public boolean isSort5TableEffDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSort5TableEffDateCounter != sharedCounter;
         localSort5TableEffDateCounter = sharedCounter; return hasModified;
     }
	protected static final int SORT_5_TABLE_EFF_DATE_LEN = 10;
	/**
	 * 	serialize this Sort5TableEffDate
	 */
   protected void serializeSort5TableEffDate(char[] sort5TableEffDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sort5TableEffDate,0,getStringValue(),beginSort5TableEffDate,SORT_5_TABLE_EFF_DATE_LEN);
       localSort5TableEffDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSort5TableEffDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshSort5TableEffDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSort5TableEffDate() {	 
   		return (substring(getStringValue(),beginSort5TableEffDate,beginSort5TableEffDate + SORT_5_TABLE_EFF_DATE_LEN));
   	}




}
  

package com.cloudframe.app.mcsort02.file.records.serialize;

/**
*  The class SortRec4Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:55. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SortRec4Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SortRec4Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SORT_REC_4_LENGTH = 27986;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSort4TableId;
            protected  int beginSort4Key;
            protected  int beginSort4TableEffDate;
	
	/**
	* Constructor for SortRec4Serialized
	**/
    public SortRec4Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SortRec4Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SortRec4Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SortRec4Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SortRec4Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SortRec4Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SORT_REC_4_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSort4TableId = getStartOffset() + 0;	// set offset for serialization
  
             beginSort4Key = getStartOffset() + 8;	// set offset for serialization
  
             beginSort4TableEffDate = getStartOffset() + 107;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSort4TableIdCounter = -1;
     public boolean isSort4TableIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSort4TableIdCounter != sharedCounter;
         localSort4TableIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SORT_4_TABLE_ID_LEN = 8;
	/**
	 * 	serialize this Sort4TableId
	 */
   protected void serializeSort4TableId(char[] sort4TableId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sort4TableId,0,getStringValue(),beginSort4TableId,SORT_4_TABLE_ID_LEN);
       localSort4TableIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSort4TableIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSort4TableId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSort4TableId() {	 
   		return (substring(getStringValue(),beginSort4TableId,beginSort4TableId + SORT_4_TABLE_ID_LEN));
   	}
     int localSort4KeyCounter = -1;
     public boolean isSort4KeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSort4KeyCounter != sharedCounter;
         localSort4KeyCounter = sharedCounter; return hasModified;
     }
	protected static final int SORT_4_KEY_LEN = 99;
	/**
	 * 	serialize this Sort4Key
	 */
   protected void serializeSort4Key(char[] sort4Key) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sort4Key,0,getStringValue(),beginSort4Key,SORT_4_KEY_LEN);
       localSort4KeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSort4KeyConstraints(char[] value) {
   			return super.checkConstraints(value , 99 ,false, false);
   }
    /**
	 *	refreshSort4Key is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSort4Key() {	 
   		return (substring(getStringValue(),beginSort4Key,beginSort4Key + SORT_4_KEY_LEN));
   	}
     int localSort4TableEffDateCounter = -1;
     public boolean isSort4TableEffDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSort4TableEffDateCounter != sharedCounter;
         localSort4TableEffDateCounter = sharedCounter; return hasModified;
     }
	protected static final int SORT_4_TABLE_EFF_DATE_LEN = 10;
	/**
	 * 	serialize this Sort4TableEffDate
	 */
   protected void serializeSort4TableEffDate(char[] sort4TableEffDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sort4TableEffDate,0,getStringValue(),beginSort4TableEffDate,SORT_4_TABLE_EFF_DATE_LEN);
       localSort4TableEffDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSort4TableEffDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshSort4TableEffDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSort4TableEffDate() {	 
   		return (substring(getStringValue(),beginSort4TableEffDate,beginSort4TableEffDate + SORT_4_TABLE_EFF_DATE_LEN));
   	}




}
  

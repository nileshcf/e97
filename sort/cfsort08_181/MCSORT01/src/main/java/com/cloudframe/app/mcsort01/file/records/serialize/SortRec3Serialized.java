package com.cloudframe.app.mcsort01.file.records.serialize;

/**
*  The class SortRec3Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SortRec3Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SortRec3Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SORT_REC_3_LENGTH = 27986;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSort3TableData;
	
	/**
	* Constructor for SortRec3Serialized
	**/
    public SortRec3Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SortRec3Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SortRec3Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SortRec3Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SortRec3Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SortRec3Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SORT_REC_3_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSort3TableData = getStartOffset() + 121;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSort3TableDataCounter = -1;
     public boolean isSort3TableDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSort3TableDataCounter != sharedCounter;
         localSort3TableDataCounter = sharedCounter; return hasModified;
     }
	protected static final int SORT_3_TABLE_DATA_LEN = 27865;
	/**
	 * 	serialize this Sort3TableData
	 */
   protected void serializeSort3TableData(char[] sort3TableData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sort3TableData,0,getStringValue(),beginSort3TableData,SORT_3_TABLE_DATA_LEN);
       localSort3TableDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSort3TableDataConstraints(char[] value) {
   			return super.checkConstraints(value , 27865 ,false, false);
   }
    /**
	 *	refreshSort3TableData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSort3TableData() {	 
   		return (substring(getStringValue(),beginSort3TableData,beginSort3TableData + SORT_3_TABLE_DATA_LEN));
   	}




}
  

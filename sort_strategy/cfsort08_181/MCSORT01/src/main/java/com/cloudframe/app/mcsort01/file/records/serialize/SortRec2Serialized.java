package com.cloudframe.app.mcsort01.file.records.serialize;

/**
*  The class SortRec2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:54. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SortRec2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SortRec2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SORT_REC_2_LENGTH = 27986;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSort2TableData;
	
	/**
	* Constructor for SortRec2Serialized
	**/
    public SortRec2Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SortRec2Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SortRec2Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SortRec2Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SortRec2Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SortRec2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SORT_REC_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSort2TableData = getStartOffset() + 22;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSort2TableDataCounter = -1;
     public boolean isSort2TableDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSort2TableDataCounter != sharedCounter;
         localSort2TableDataCounter = sharedCounter; return hasModified;
     }
	protected static final int SORT_2_TABLE_DATA_LEN = 27964;
	/**
	 * 	serialize this Sort2TableData
	 */
   protected void serializeSort2TableData(char[] sort2TableData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sort2TableData,0,getStringValue(),beginSort2TableData,SORT_2_TABLE_DATA_LEN);
       localSort2TableDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSort2TableDataConstraints(char[] value) {
   			return super.checkConstraints(value , 27964 ,false, false);
   }
    /**
	 *	refreshSort2TableData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSort2TableData() {	 
   		return (substring(getStringValue(),beginSort2TableData,beginSort2TableData + SORT_2_TABLE_DATA_LEN));
   	}




}
  

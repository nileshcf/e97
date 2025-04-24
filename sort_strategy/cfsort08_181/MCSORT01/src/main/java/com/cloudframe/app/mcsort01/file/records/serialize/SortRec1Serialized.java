package com.cloudframe.app.mcsort01.file.records.serialize;

/**
*  The class SortRec1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SortRec1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SortRec1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SORT_REC_1_LENGTH = 27986;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSortTableData;
	
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
             beginSortTableData = getStartOffset() + 121;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSortTableDataCounter = -1;
     public boolean isSortTableDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSortTableDataCounter != sharedCounter;
         localSortTableDataCounter = sharedCounter; return hasModified;
     }
	protected static final int SORT_TABLE_DATA_LEN = 27865;
	/**
	 * 	serialize this SortTableData
	 */
   protected void serializeSortTableData(char[] sortTableData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sortTableData,0,getStringValue(),beginSortTableData,SORT_TABLE_DATA_LEN);
       localSortTableDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSortTableDataConstraints(char[] value) {
   			return super.checkConstraints(value , 27865 ,false, false);
   }
    /**
	 *	refreshSortTableData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSortTableData() {	 
   		return (substring(getStringValue(),beginSortTableData,beginSortTableData + SORT_TABLE_DATA_LEN));
   	}




}
  

package com.cloudframe.app.ms00d363.file.records.serialize;

/**
*  The class SwchSortField300010Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SwchSortField300010Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SwchSortField300010Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SWCH_SORT_FIELD_300010_LENGTH = 107;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSwchDbCrInd300010;
	
	/**
	* Constructor for SwchSortField300010Serialized
	**/
    public SwchSortField300010Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SwchSortField300010Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SwchSortField300010Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SwchSortField300010Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SwchSortField300010Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SwchSortField300010Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SWCH_SORT_FIELD_300010_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginSwchDbCrInd300010 = getStartOffset() + 106;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSwchDbCrInd300010Counter = -1;
     public boolean isSwchDbCrInd300010Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSwchDbCrInd300010Counter != sharedCounter;
         localSwchDbCrInd300010Counter = sharedCounter; return hasModified;
     }
	protected static final int SWCH_DB_CR_IND_300010_LEN = 1;
	/**
	 * 	serialize this SwchDbCrInd300010
	 */
   protected void serializeSwchDbCrInd300010(char[] swchDbCrInd300010) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(swchDbCrInd300010,0,getStringValue(),beginSwchDbCrInd300010,SWCH_DB_CR_IND_300010_LEN);
       localSwchDbCrInd300010Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSwchDbCrInd300010Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSwchDbCrInd300010 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSwchDbCrInd300010() {	 
   		return (substring(getStringValue(),beginSwchDbCrInd300010,beginSwchDbCrInd300010 + SWCH_DB_CR_IND_300010_LEN));
   	}




}
  

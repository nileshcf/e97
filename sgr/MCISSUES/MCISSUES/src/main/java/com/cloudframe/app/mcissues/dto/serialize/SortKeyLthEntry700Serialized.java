package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class SortKeyLthEntry700Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SortKeyLthEntry700Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SortKeyLthEntry700Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SORT_KEY_LTH_ENTRY_700_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTableId700;
	
	/**
	* Constructor for SortKeyLthEntry700Serialized
	**/
    public SortKeyLthEntry700Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SortKeyLthEntry700Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SortKeyLthEntry700Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SortKeyLthEntry700Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SortKeyLthEntry700Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SortKeyLthEntry700Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SORT_KEY_LTH_ENTRY_700_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTableId700 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTableId700Counter = -1;
     public boolean isTableId700Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTableId700Counter != sharedCounter;
         localTableId700Counter = sharedCounter; return hasModified;
     }
	protected static final int TABLE_ID_700_LEN = 8;
	/**
	 * 	serialize this TableId700
	 */
   protected void serializeTableId700(char[] tableId700) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tableId700,0,getStringValue(),beginTableId700,TABLE_ID_700_LEN);
       localTableId700Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTableId700Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshTableId700 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTableId700() {	 
   		return (substring(getStringValue(),beginTableId700,beginTableId700 + TABLE_ID_700_LEN));
   	}




}
  

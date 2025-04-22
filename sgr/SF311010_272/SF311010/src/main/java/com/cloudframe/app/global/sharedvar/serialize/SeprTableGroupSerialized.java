package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class SeprTableGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SeprTableGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SeprTableGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SEPR_TABLE_GROUP_LENGTH = 600;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSeprTable;
	
	/**
	* Constructor for SeprTableGroupSerialized
	**/
    public SeprTableGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in SeprTableGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SEPR_TABLE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSeprTable = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localSeprTableCounter = -1;
     public boolean isSeprTableModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeprTableCounter != sharedCounter;
         localSeprTableCounter = sharedCounter; return hasModified;
     }
	protected static final int SEPR_TABLE_LEN = 600;
	/**
	 * 	serialize this SeprTable
	 */
   protected void serializeSeprTable(char[] seprTable) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(seprTable,0,getStringValue(),beginSeprTable,SEPR_TABLE_LEN);
       localSeprTableCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSeprTableConstraints(char[] value) {
   			return super.checkConstraints(value , 600 ,false, false);
   }
    /**
	 *	refreshSeprTable is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSeprTable() {	 
   		return (substring(getStringValue(),beginSeprTable,beginSeprTable + SEPR_TABLE_LEN));
   	}




}
  

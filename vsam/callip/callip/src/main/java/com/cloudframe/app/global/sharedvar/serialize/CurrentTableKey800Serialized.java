package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class CurrentTableKey800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CurrentTableKey800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CurrentTableKey800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CURRENT_TABLE_KEY_800_LENGTH = 18;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCurrentTableId800;
            protected  int beginCurrentEffectiveDate800;
	
	/**
	* Constructor for CurrentTableKey800Serialized
	**/
    public CurrentTableKey800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CurrentTableKey800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CURRENT_TABLE_KEY_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCurrentTableId800 = getStartOffset() + 0;	// set offset for serialization
  
             beginCurrentEffectiveDate800 = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCurrentTableId800Counter = -1;
     public boolean isCurrentTableId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrentTableId800Counter != sharedCounter;
         localCurrentTableId800Counter = sharedCounter; return hasModified;
     }
	protected static final int CURRENT_TABLE_ID_800_LEN = 8;
	/**
	 * 	serialize this CurrentTableId800
	 */
   protected void serializeCurrentTableId800(char[] currentTableId800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currentTableId800,0,getStringValue(),beginCurrentTableId800,CURRENT_TABLE_ID_800_LEN);
       localCurrentTableId800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrentTableId800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshCurrentTableId800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrentTableId800() {	 
   		return (substring(getStringValue(),beginCurrentTableId800,beginCurrentTableId800 + CURRENT_TABLE_ID_800_LEN));
   	}
     int localCurrentEffectiveDate800Counter = -1;
     public boolean isCurrentEffectiveDate800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrentEffectiveDate800Counter != sharedCounter;
         localCurrentEffectiveDate800Counter = sharedCounter; return hasModified;
     }
	protected static final int CURRENT_EFFECTIVE_DATE_800_LEN = 10;
	/**
	 * 	serialize this CurrentEffectiveDate800
	 */
   protected void serializeCurrentEffectiveDate800(char[] currentEffectiveDate800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currentEffectiveDate800,0,getStringValue(),beginCurrentEffectiveDate800,CURRENT_EFFECTIVE_DATE_800_LEN);
       localCurrentEffectiveDate800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrentEffectiveDate800Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCurrentEffectiveDate800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrentEffectiveDate800() {	 
   		return (substring(getStringValue(),beginCurrentEffectiveDate800,beginCurrentEffectiveDate800 + CURRENT_EFFECTIVE_DATE_800_LEN));
   	}




}
  

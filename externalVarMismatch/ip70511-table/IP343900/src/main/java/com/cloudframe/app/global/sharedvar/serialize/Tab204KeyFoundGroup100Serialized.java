package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Tab204KeyFoundGroup100Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Tab204KeyFoundGroup100Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Tab204KeyFoundGroup100Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TAB_204_KEY_FOUND_GROUP_100_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTab204KeyFound100;
	
	/**
	* Constructor for Tab204KeyFoundGroup100Serialized
	**/
    public Tab204KeyFoundGroup100Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Tab204KeyFoundGroup100Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TAB_204_KEY_FOUND_GROUP_100_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTab204KeyFound100 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTab204KeyFound100Counter = -1;
     public boolean isTab204KeyFound100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTab204KeyFound100Counter != sharedCounter;
         localTab204KeyFound100Counter = sharedCounter; return hasModified;
     }
	protected static final int TAB_204_KEY_FOUND_100_LEN = 1;
	/**
	 * 	serialize this Tab204KeyFound100
	 */
   protected void serializeTab204KeyFound100(char[] tab204KeyFound100) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tab204KeyFound100,0,getStringValue(),beginTab204KeyFound100,TAB_204_KEY_FOUND_100_LEN);
       localTab204KeyFound100Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTab204KeyFound100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTab204KeyFound100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTab204KeyFound100() {	 
   		return (substring(getStringValue(),beginTab204KeyFound100,beginTab204KeyFound100 + TAB_204_KEY_FOUND_100_LEN));
   	}




}
  

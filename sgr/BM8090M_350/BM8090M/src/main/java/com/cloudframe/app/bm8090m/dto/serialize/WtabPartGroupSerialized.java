package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WtabPartGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WtabPartGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WtabPartGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WTAB_PART_GROUP_LENGTH = 100;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWtabPart;
	
	/**
	* Constructor for WtabPartGroupSerialized
	**/
    public WtabPartGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WtabPartGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WTAB_PART_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWtabPart = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWtabPartCounter = -1;
     public boolean isWtabPartModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWtabPartCounter != sharedCounter;
         localWtabPartCounter = sharedCounter; return hasModified;
     }
	protected static final int WTAB_PART_LEN = 100;
	/**
	 * 	serialize this WtabPart
	 */
   protected void serializeWtabPart(char[] wtabPart) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wtabPart,0,getStringValue(),beginWtabPart,WTAB_PART_LEN);
       localWtabPartCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWtabPartConstraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
    /**
	 *	refreshWtabPart is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWtabPart() {	 
   		return (substring(getStringValue(),beginWtabPart,beginWtabPart + WTAB_PART_LEN));
   	}




}
  

package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class De48DataGroup500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class De48DataGroup500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(De48DataGroup500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DE_48_DATA_GROUP_500_LENGTH = 999;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDe48Data500;
	
	/**
	* Constructor for De48DataGroup500Serialized
	**/
    public De48DataGroup500Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in De48DataGroup500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DE_48_DATA_GROUP_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDe48Data500 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDe48Data500Counter = -1;
     public boolean isDe48Data500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe48Data500Counter != sharedCounter;
         localDe48Data500Counter = sharedCounter; return hasModified;
     }
	protected static final int DE_48_DATA_500_LEN = 999;
	/**
	 * 	serialize this De48Data500
	 */
   protected void serializeDe48Data500(char[] de48Data500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(de48Data500,0,getStringValue(),beginDe48Data500,DE_48_DATA_500_LEN);
       localDe48Data500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDe48Data500Constraints(char[] value) {
   			return super.checkConstraints(value , 999 ,false, false);
   }
    /**
	 *	refreshDe48Data500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDe48Data500() {	 
   		return (substring(getStringValue(),beginDe48Data500,beginDe48Data500 + DE_48_DATA_500_LEN));
   	}




}
  

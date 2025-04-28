package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class De120DataGroup500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class De120DataGroup500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(De120DataGroup500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DE_120_DATA_GROUP_500_LENGTH = 999;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDe120Data500;
	
	/**
	* Constructor for De120DataGroup500Serialized
	**/
    public De120DataGroup500Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in De120DataGroup500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DE_120_DATA_GROUP_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDe120Data500 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDe120Data500Counter = -1;
     public boolean isDe120Data500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe120Data500Counter != sharedCounter;
         localDe120Data500Counter = sharedCounter; return hasModified;
     }
	protected static final int DE_120_DATA_500_LEN = 999;
	/**
	 * 	serialize this De120Data500
	 */
   protected void serializeDe120Data500(char[] de120Data500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(de120Data500,0,getStringValue(),beginDe120Data500,DE_120_DATA_500_LEN);
       localDe120Data500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDe120Data500Constraints(char[] value) {
   			return super.checkConstraints(value , 999 ,false, false);
   }
    /**
	 *	refreshDe120Data500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDe120Data500() {	 
   		return (substring(getStringValue(),beginDe120Data500,beginDe120Data500 + DE_120_DATA_500_LEN));
   	}




}
  

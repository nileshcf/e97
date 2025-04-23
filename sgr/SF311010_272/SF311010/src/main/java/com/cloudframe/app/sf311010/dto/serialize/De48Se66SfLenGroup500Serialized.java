package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class De48Se66SfLenGroup500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class De48Se66SfLenGroup500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(De48Se66SfLenGroup500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DE_48_SE_66_SF_LEN_GROUP_500_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDe48Se66SfLen500;
	
	/**
	* Constructor for De48Se66SfLenGroup500Serialized
	**/
    public De48Se66SfLenGroup500Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in De48Se66SfLenGroup500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DE_48_SE_66_SF_LEN_GROUP_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDe48Se66SfLen500 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDe48Se66SfLen500Counter = -1;
     public boolean isDe48Se66SfLen500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe48Se66SfLen500Counter != sharedCounter;
         localDe48Se66SfLen500Counter = sharedCounter; return hasModified;
     }
	protected static final int DE_48_SE_66_SF_LEN_500_LEN = 2;
	/**
	 * 	serialize this De48Se66SfLen500
	 */
   protected void serializeDe48Se66SfLen500(char[] de48Se66SfLen500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(de48Se66SfLen500,0,getStringValue(),beginDe48Se66SfLen500,DE_48_SE_66_SF_LEN_500_LEN);
       localDe48Se66SfLen500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDe48Se66SfLen500Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDe48Se66SfLen500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDe48Se66SfLen500() {	 
   		return (substring(getStringValue(),beginDe48Se66SfLen500,beginDe48Se66SfLen500 + DE_48_SE_66_SF_LEN_500_LEN));
   	}




}
  

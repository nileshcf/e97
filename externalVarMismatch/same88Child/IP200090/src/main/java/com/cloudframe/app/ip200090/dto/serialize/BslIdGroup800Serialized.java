package com.cloudframe.app.ip200090.dto.serialize;

/**
*  The class BslIdGroup800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BslIdGroup800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BslIdGroup800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BSL_ID_GROUP_800_LENGTH = 7;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBslIdR800;
	
	/**
	* Constructor for BslIdGroup800Serialized
	**/
    public BslIdGroup800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BslIdGroup800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BSL_ID_GROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginBslIdR800 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBslIdR800Counter = -1;
     public boolean isBslIdR800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBslIdR800Counter != sharedCounter;
         localBslIdR800Counter = sharedCounter; return hasModified;
     }
	protected static final int BSL_ID_R_800_LEN = 7;
	/**
	 * 	serialize this BslIdR800
	 */
   protected void serializeBslIdR800(char[] bslIdR800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bslIdR800,0,getStringValue(),beginBslIdR800,BSL_ID_R_800_LEN);
       localBslIdR800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBslIdR800Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshBslIdR800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBslIdR800() {	 
   		return (substring(getStringValue(),beginBslIdR800,beginBslIdR800 + BSL_ID_R_800_LEN));
   	}




}
  

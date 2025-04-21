package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class DtlRecord4800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtlRecord4800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtlRecord4800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DTL_RECORD_4800_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDtlLast800;
	
	/**
	* Constructor for DtlRecord4800Serialized
	**/
    public DtlRecord4800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtlRecord4800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DTL_RECORD_4800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDtlLast800 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDtlLast800Counter = -1;
     public boolean isDtlLast800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDtlLast800Counter != sharedCounter;
         localDtlLast800Counter = sharedCounter; return hasModified;
     }
	protected static final int DTL_LAST_800_LEN = 1;
	/**
	 * 	serialize this DtlLast800
	 */
   protected void serializeDtlLast800(char[] dtlLast800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dtlLast800,0,getStringValue(),beginDtlLast800,DTL_LAST_800_LEN);
       localDtlLast800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDtlLast800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDtlLast800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDtlLast800() {	 
   		return (substring(getStringValue(),beginDtlLast800,beginDtlLast800 + DTL_LAST_800_LEN));
   	}




}
  

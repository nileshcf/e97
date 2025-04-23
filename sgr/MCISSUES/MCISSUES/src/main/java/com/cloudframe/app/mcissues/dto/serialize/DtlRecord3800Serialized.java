package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class DtlRecord3800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtlRecord3800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtlRecord3800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DTL_RECORD_3800_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDtlCount800;
	
	/**
	* Constructor for DtlRecord3800Serialized
	**/
    public DtlRecord3800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtlRecord3800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DTL_RECORD_3800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDtlCount800 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDtlCount800Counter = -1;
     public boolean isDtlCount800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDtlCount800Counter != sharedCounter;
         localDtlCount800Counter = sharedCounter; return hasModified;
     }
	protected static final int DTL_COUNT_800_LEN = 10;
	/**
	 * 	serialize this DtlCount800
	 */
   protected void serializeDtlCount800(char[] dtlCount800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dtlCount800,0,getStringValue(),beginDtlCount800,DTL_COUNT_800_LEN);
       localDtlCount800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDtlCount800Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDtlCount800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDtlCount800() {	 
   		return (substring(getStringValue(),beginDtlCount800,beginDtlCount800 + DTL_COUNT_800_LEN));
   	}




}
  

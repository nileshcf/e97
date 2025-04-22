package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class DtlCnt800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtlCnt800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtlCnt800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DTL_CNT_800_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDtlCntA800;
	
	/**
	* Constructor for DtlCnt800Serialized
	**/
    public DtlCnt800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtlCnt800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DTL_CNT_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDtlCntA800 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDtlCntA800Counter = -1;
     public boolean isDtlCntA800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDtlCntA800Counter != sharedCounter;
         localDtlCntA800Counter = sharedCounter; return hasModified;
     }
	protected static final int DTL_CNT_A_800_LEN = 10;
	/**
	 * 	serialize this DtlCntA800
	 */
   protected void serializeDtlCntA800(char[] dtlCntA800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dtlCntA800,0,getStringValue(),beginDtlCntA800,DTL_CNT_A_800_LEN);
       localDtlCntA800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDtlCntA800Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDtlCntA800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDtlCntA800() {	 
   		return (substring(getStringValue(),beginDtlCntA800,beginDtlCntA800 + DTL_CNT_A_800_LEN));
   	}




}
  

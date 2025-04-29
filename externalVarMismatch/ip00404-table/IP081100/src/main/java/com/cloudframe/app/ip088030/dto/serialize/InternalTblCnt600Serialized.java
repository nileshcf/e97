package com.cloudframe.app.ip088030.dto.serialize;

/**
*  The class InternalTblCnt600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class InternalTblCnt600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(InternalTblCnt600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int INTERNAL_TBL_CNT_600_LENGTH = 43;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIchgFeeCnt600;
	
	/**
	* Constructor for InternalTblCnt600Serialized
	**/
    public InternalTblCnt600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in InternalTblCnt600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(INTERNAL_TBL_CNT_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIchgFeeCnt600 = getStartOffset() + 32;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIchgFeeCnt600Counter = -1;
     public boolean isIchgFeeCnt600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIchgFeeCnt600Counter != sharedCounter;
         localIchgFeeCnt600Counter = sharedCounter; return hasModified;
     }
	protected static final int ICHG_FEE_CNT_600_LEN = 11;
	/**
	 * 	serialize this IchgFeeCnt600
	 */
   protected void serializeIchgFeeCnt600(char[] ichgFeeCnt600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ichgFeeCnt600,0,getStringValue(),beginIchgFeeCnt600,ICHG_FEE_CNT_600_LEN);
       localIchgFeeCnt600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIchgFeeCnt600Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshIchgFeeCnt600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIchgFeeCnt600() {	 
   		return (substring(getStringValue(),beginIchgFeeCnt600,beginIchgFeeCnt600 + ICHG_FEE_CNT_600_LEN));
   	}




}
  

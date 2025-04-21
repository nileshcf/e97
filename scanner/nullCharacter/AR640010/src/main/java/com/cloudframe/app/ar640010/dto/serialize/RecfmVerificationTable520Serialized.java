package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class RecfmVerificationTable520Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RecfmVerificationTable520Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RecfmVerificationTable520Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RECFM_VERIFICATION_TABLE_520_LENGTH = 27;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRecfmTblMax520;
            protected  int beginRecfmArray520;
	
	/**
	* Constructor for RecfmVerificationTable520Serialized
	**/
    public RecfmVerificationTable520Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RecfmVerificationTable520Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RECFM_VERIFICATION_TABLE_520_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRecfmTblMax520 = getStartOffset() + 0;	// set offset for serialization
  
             beginRecfmArray520 = getStartOffset() + 2;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localRecfmTblMax520Counter = -1;
         public boolean isRecfmTblMax520Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRecfmTblMax520Counter != sharedCounter;
            localRecfmTblMax520Counter = sharedCounter; return hasModified; 
         }
   protected static final int RECFM_TBL_MAX_520_LEN = 2;
  	/**
	 * serializeRecfmTblMax520
	 */
	protected void serializeRecfmTblMax520(short recfmTblMax520) {
           replaceValue( //  save the value as string
                   getBinaryString( recfmTblMax520,RECFM_TBL_MAX_520_LEN)
                  ,beginRecfmTblMax520
                  ,RECFM_TBL_MAX_520_LEN
                 );
            localRecfmTblMax520Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkRecfmTblMax520MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshRecfmTblMax520 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshRecfmTblMax520() {	 
			return (getShort(beginRecfmTblMax520));
   	}
     int localRecfmArray520Counter = -1;
     public boolean isRecfmArray520Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecfmArray520Counter != sharedCounter;
         localRecfmArray520Counter = sharedCounter; return hasModified;
     }
	protected static final int RECFM_ARRAY_520_LEN = 25;
	/**
	 * 	serialize this RecfmArray520
	 */
   protected void serializeRecfmArray520(char[] recfmArray520) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(recfmArray520,0,getStringValue(),beginRecfmArray520,RECFM_ARRAY_520_LEN);
       localRecfmArray520Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRecfmArray520Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshRecfmArray520 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRecfmArray520() {	 
   		return (substring(getStringValue(),beginRecfmArray520,beginRecfmArray520 + RECFM_ARRAY_520_LEN));
   	}




}
  

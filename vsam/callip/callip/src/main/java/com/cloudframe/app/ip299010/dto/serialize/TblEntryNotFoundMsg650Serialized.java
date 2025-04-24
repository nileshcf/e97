package com.cloudframe.app.ip299010.dto.serialize;

/**
*  The class TblEntryNotFoundMsg650Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TblEntryNotFoundMsg650Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TblEntryNotFoundMsg650Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TBL_ENTRY_NOT_FOUND_MSG_650_LENGTH = 82;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTableId650;
            protected  int beginEffDtTm650;
	
	/**
	* Constructor for TblEntryNotFoundMsg650Serialized
	**/
    public TblEntryNotFoundMsg650Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TblEntryNotFoundMsg650Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TBL_ENTRY_NOT_FOUND_MSG_650_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginTableId650 = getStartOffset() + 9;	// set offset for serialization
  
  
             beginEffDtTm650 = getStartOffset() + 47;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localTableId650Counter = -1;
     public boolean isTableId650Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTableId650Counter != sharedCounter;
         localTableId650Counter = sharedCounter; return hasModified;
     }
	protected static final int TABLE_ID_650_LEN = 8;
	/**
	 * 	serialize this TableId650
	 */
   protected void serializeTableId650(char[] tableId650) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tableId650,0,getStringValue(),beginTableId650,TABLE_ID_650_LEN);
       localTableId650Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTableId650Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshTableId650 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTableId650() {	 
   		return (substring(getStringValue(),beginTableId650,beginTableId650 + TABLE_ID_650_LEN));
   	}
     int localEffDtTm650Counter = -1;
     public boolean isEffDtTm650Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEffDtTm650Counter != sharedCounter;
         localEffDtTm650Counter = sharedCounter; return hasModified;
     }
	protected static final int EFF_DT_TM_650_LEN = 10;
	/**
	 * 	serialize this EffDtTm650
	 */
   protected void serializeEffDtTm650(char[] effDtTm650) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(effDtTm650,0,getStringValue(),beginEffDtTm650,EFF_DT_TM_650_LEN);
       localEffDtTm650Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEffDtTm650Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshEffDtTm650 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEffDtTm650() {	 
   		return (substring(getStringValue(),beginEffDtTm650,beginEffDtTm650 + EFF_DT_TM_650_LEN));
   	}




}
  

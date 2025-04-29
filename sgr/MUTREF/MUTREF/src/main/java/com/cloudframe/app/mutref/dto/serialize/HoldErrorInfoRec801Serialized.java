package com.cloudframe.app.mutref.dto.serialize;

/**
*  The class HoldErrorInfoRec801Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HoldErrorInfoRec801Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HoldErrorInfoRec801Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HOLD_ERROR_INFO_REC_801_LENGTH = 25;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHoldCardAcceptor801;
            protected  int beginVar;
	
	/**
	* Constructor for HoldErrorInfoRec801Serialized
	**/
    public HoldErrorInfoRec801Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HoldErrorInfoRec801Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HOLD_ERROR_INFO_REC_801_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHoldCardAcceptor801 = getStartOffset() + 0;	// set offset for serialization
  
             beginVar = getStartOffset() + 15;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHoldCardAcceptor801Counter = -1;
     public boolean isHoldCardAcceptor801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHoldCardAcceptor801Counter != sharedCounter;
         localHoldCardAcceptor801Counter = sharedCounter; return hasModified;
     }
	protected static final int HOLD_CARD_ACCEPTOR_801_LEN = 15;
	/**
	 * 	serialize this HoldCardAcceptor801
	 */
   protected void serializeHoldCardAcceptor801(char[] holdCardAcceptor801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(holdCardAcceptor801,0,getStringValue(),beginHoldCardAcceptor801,HOLD_CARD_ACCEPTOR_801_LEN);
       localHoldCardAcceptor801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHoldCardAcceptor801Constraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshHoldCardAcceptor801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHoldCardAcceptor801() {	 
   		return (substring(getStringValue(),beginHoldCardAcceptor801,beginHoldCardAcceptor801 + HOLD_CARD_ACCEPTOR_801_LEN));
   	}
     int localVarCounter = -1;
     public boolean isVarModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVarCounter != sharedCounter;
         localVarCounter = sharedCounter; return hasModified;
     }
	protected static final int VAR_LEN = 10;
	/**
	 * 	serialize this Var
	 */
   protected void serializeVar(char[] var) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(var,0,getStringValue(),beginVar,VAR_LEN);
       localVarCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkVarConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshVar is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshVar() {	 
   		return (substring(getStringValue(),beginVar,beginVar + VAR_LEN));
   	}




}
  

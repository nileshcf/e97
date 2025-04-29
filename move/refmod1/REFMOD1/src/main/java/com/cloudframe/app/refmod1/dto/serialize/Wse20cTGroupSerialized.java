package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class Wse20cTGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse20cTGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse20cTGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_20C_TGROUP_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse20cT;
            protected  int beginWse20cTR;
	
	/**
	* Constructor for Wse20cTGroupSerialized
	**/
    public Wse20cTGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse20cTGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_20C_TGROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse20cT = getStartOffset() + 0;	// set offset for serialization
  
             beginWse20cTR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse20cTCounter = -1;
     public boolean isWse20cTModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse20cTCounter != sharedCounter;
         localWse20cTCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_20C_T_LEN = 60;
	/**
	 * 	serialize this Wse20cT
	 */
   protected void serializeWse20cT(char[] wse20cT) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse20cT,0,getStringValue(),beginWse20cT,WSE_20C_T_LEN);
       localWse20cTCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse20cTConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse20cT is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse20cT() {	 
   		return (substring(getStringValue(),beginWse20cT,beginWse20cT + WSE_20C_T_LEN));
   	}
     int localWse20cTRCounter = -1;
     public boolean isWse20cTRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse20cTRCounter != sharedCounter;
         localWse20cTRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_20C_TR_LEN = 60;
	/**
	 * 	serialize this Wse20cTR
	 */
   protected void serializeWse20cTR(char[] wse20cTR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse20cTR,0,getStringValue(),beginWse20cTR,WSE_20C_TR_LEN);
       localWse20cTRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse20cTRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse20cTR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse20cTR() {	 
   		return (substring(getStringValue(),beginWse20cTR,beginWse20cTR + WSE_20C_TR_LEN));
   	}




}
  

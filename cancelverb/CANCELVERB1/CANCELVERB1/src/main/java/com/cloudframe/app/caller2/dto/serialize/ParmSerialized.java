package com.cloudframe.app.caller2.dto.serialize;

/**
*  The class ParmSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:09. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ParmSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ParmSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PARM_LENGTH = 21;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLku00MthlyChgInd;
            protected  int beginLku00BlPerToDt;
            protected  int beginLku00BlPerFromDt;
	
	/**
	* Constructor for ParmSerialized
	**/
    public ParmSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ParmSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PARM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLku00MthlyChgInd = getStartOffset() + 0;	// set offset for serialization
  
             beginLku00BlPerToDt = getStartOffset() + 1;	// set offset for serialization
  
             beginLku00BlPerFromDt = getStartOffset() + 11;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localLku00MthlyChgIndCounter = -1;
     public boolean isLku00MthlyChgIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLku00MthlyChgIndCounter != sharedCounter;
         localLku00MthlyChgIndCounter = sharedCounter; return hasModified;
     }
	protected static final int LKU_00_MTHLY_CHG_IND_LEN = 1;
	/**
	 * 	serialize this Lku00MthlyChgInd
	 */
   protected void serializeLku00MthlyChgInd(char[] lku00MthlyChgInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lku00MthlyChgInd,0,getStringValue(),beginLku00MthlyChgInd,LKU_00_MTHLY_CHG_IND_LEN);
       localLku00MthlyChgIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLku00MthlyChgIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshLku00MthlyChgInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLku00MthlyChgInd() {	 
   		return (substring(getStringValue(),beginLku00MthlyChgInd,beginLku00MthlyChgInd + LKU_00_MTHLY_CHG_IND_LEN));
   	}
     int localLku00BlPerToDtCounter = -1;
     public boolean isLku00BlPerToDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLku00BlPerToDtCounter != sharedCounter;
         localLku00BlPerToDtCounter = sharedCounter; return hasModified;
     }
	protected static final int LKU_00_BL_PER_TO_DT_LEN = 10;
	/**
	 * 	serialize this Lku00BlPerToDt
	 */
   protected void serializeLku00BlPerToDt(char[] lku00BlPerToDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lku00BlPerToDt,0,getStringValue(),beginLku00BlPerToDt,LKU_00_BL_PER_TO_DT_LEN);
       localLku00BlPerToDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLku00BlPerToDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshLku00BlPerToDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLku00BlPerToDt() {	 
   		return (substring(getStringValue(),beginLku00BlPerToDt,beginLku00BlPerToDt + LKU_00_BL_PER_TO_DT_LEN));
   	}
     int localLku00BlPerFromDtCounter = -1;
     public boolean isLku00BlPerFromDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLku00BlPerFromDtCounter != sharedCounter;
         localLku00BlPerFromDtCounter = sharedCounter; return hasModified;
     }
	protected static final int LKU_00_BL_PER_FROM_DT_LEN = 10;
	/**
	 * 	serialize this Lku00BlPerFromDt
	 */
   protected void serializeLku00BlPerFromDt(char[] lku00BlPerFromDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lku00BlPerFromDt,0,getStringValue(),beginLku00BlPerFromDt,LKU_00_BL_PER_FROM_DT_LEN);
       localLku00BlPerFromDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLku00BlPerFromDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshLku00BlPerFromDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLku00BlPerFromDt() {	 
   		return (substring(getStringValue(),beginLku00BlPerFromDt,beginLku00BlPerFromDt + LKU_00_BL_PER_FROM_DT_LEN));
   	}




}
  

package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class FnsPayloadCloseDtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FnsPayloadCloseDtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FnsPayloadCloseDtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FNS_PAYLOAD_CLOSE_DT_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFnsPayloadClosedCcyy;
            protected  int beginFnsPayloadFiller1;
            protected  int beginFnsPayloadClosedMm;
            protected  int beginFnsPayloadFiller2;
            protected  int beginFnsPayloadClosedDd;
	
	/**
	* Constructor for FnsPayloadCloseDtSerialized
	**/
    public FnsPayloadCloseDtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FnsPayloadCloseDtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPayloadCloseDtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FnsPayloadCloseDtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,182); // serialize this field at offset 182 by default 
    }
    
	/**
	* sets parent for this FnsPayloadCloseDtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 182 by default
    }    
	/**
	* initializes the field in FnsPayloadCloseDtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FNS_PAYLOAD_CLOSE_DT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFnsPayloadClosedCcyy = getStartOffset() + 0;	// set offset for serialization
  
             beginFnsPayloadFiller1 = getStartOffset() + 4;	// set offset for serialization
  
             beginFnsPayloadClosedMm = getStartOffset() + 5;	// set offset for serialization
  
             beginFnsPayloadFiller2 = getStartOffset() + 7;	// set offset for serialization
  
             beginFnsPayloadClosedDd = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFnsPayloadClosedCcyyCounter = -1;
     public boolean isFnsPayloadClosedCcyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadClosedCcyyCounter != sharedCounter;
         localFnsPayloadClosedCcyyCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PAYLOAD_CLOSED_CCYY_LEN = 4;
	/**
	 * 	serialize this FnsPayloadClosedCcyy
	 */
   protected void serializeFnsPayloadClosedCcyy(char[] fnsPayloadClosedCcyy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPayloadClosedCcyy,0,getStringValue(),beginFnsPayloadClosedCcyy,FNS_PAYLOAD_CLOSED_CCYY_LEN);
       localFnsPayloadClosedCcyyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPayloadClosedCcyyConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshFnsPayloadClosedCcyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPayloadClosedCcyy() {	 
   		return (substring(getStringValue(),beginFnsPayloadClosedCcyy,beginFnsPayloadClosedCcyy + FNS_PAYLOAD_CLOSED_CCYY_LEN));
   	}
     int localFnsPayloadFiller1Counter = -1;
     public boolean isFnsPayloadFiller1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadFiller1Counter != sharedCounter;
         localFnsPayloadFiller1Counter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PAYLOAD_FILLER_1_LEN = 1;
	/**
	 * 	serialize this FnsPayloadFiller1
	 */
   protected void serializeFnsPayloadFiller1(char[] fnsPayloadFiller1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPayloadFiller1,0,getStringValue(),beginFnsPayloadFiller1,FNS_PAYLOAD_FILLER_1_LEN);
       localFnsPayloadFiller1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPayloadFiller1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFnsPayloadFiller1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPayloadFiller1() {	 
   		return (substring(getStringValue(),beginFnsPayloadFiller1,beginFnsPayloadFiller1 + FNS_PAYLOAD_FILLER_1_LEN));
   	}
     int localFnsPayloadClosedMmCounter = -1;
     public boolean isFnsPayloadClosedMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadClosedMmCounter != sharedCounter;
         localFnsPayloadClosedMmCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PAYLOAD_CLOSED_MM_LEN = 2;
	/**
	 * 	serialize this FnsPayloadClosedMm
	 */
   protected void serializeFnsPayloadClosedMm(char[] fnsPayloadClosedMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPayloadClosedMm,0,getStringValue(),beginFnsPayloadClosedMm,FNS_PAYLOAD_CLOSED_MM_LEN);
       localFnsPayloadClosedMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPayloadClosedMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFnsPayloadClosedMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPayloadClosedMm() {	 
   		return (substring(getStringValue(),beginFnsPayloadClosedMm,beginFnsPayloadClosedMm + FNS_PAYLOAD_CLOSED_MM_LEN));
   	}
     int localFnsPayloadFiller2Counter = -1;
     public boolean isFnsPayloadFiller2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadFiller2Counter != sharedCounter;
         localFnsPayloadFiller2Counter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PAYLOAD_FILLER_2_LEN = 1;
	/**
	 * 	serialize this FnsPayloadFiller2
	 */
   protected void serializeFnsPayloadFiller2(char[] fnsPayloadFiller2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPayloadFiller2,0,getStringValue(),beginFnsPayloadFiller2,FNS_PAYLOAD_FILLER_2_LEN);
       localFnsPayloadFiller2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPayloadFiller2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFnsPayloadFiller2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPayloadFiller2() {	 
   		return (substring(getStringValue(),beginFnsPayloadFiller2,beginFnsPayloadFiller2 + FNS_PAYLOAD_FILLER_2_LEN));
   	}
     int localFnsPayloadClosedDdCounter = -1;
     public boolean isFnsPayloadClosedDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadClosedDdCounter != sharedCounter;
         localFnsPayloadClosedDdCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PAYLOAD_CLOSED_DD_LEN = 2;
	/**
	 * 	serialize this FnsPayloadClosedDd
	 */
   protected void serializeFnsPayloadClosedDd(char[] fnsPayloadClosedDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPayloadClosedDd,0,getStringValue(),beginFnsPayloadClosedDd,FNS_PAYLOAD_CLOSED_DD_LEN);
       localFnsPayloadClosedDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPayloadClosedDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFnsPayloadClosedDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPayloadClosedDd() {	 
   		return (substring(getStringValue(),beginFnsPayloadClosedDd,beginFnsPayloadClosedDd + FNS_PAYLOAD_CLOSED_DD_LEN));
   	}




}
  

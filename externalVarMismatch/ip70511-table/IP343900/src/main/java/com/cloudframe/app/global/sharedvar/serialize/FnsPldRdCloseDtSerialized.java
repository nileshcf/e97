package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class FnsPldRdCloseDtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FnsPldRdCloseDtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FnsPldRdCloseDtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FNS_PLD_RD_CLOSE_DT_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFnsPldRdClosedCcyy;
            protected  int beginFnsPldRdFiller1;
            protected  int beginFnsPldRdClosedMm;
            protected  int beginFnsPldRdFiller2;
            protected  int beginFnsPldRdClosedDd;
	
	/**
	* Constructor for FnsPldRdCloseDtSerialized
	**/
    public FnsPldRdCloseDtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FnsPldRdCloseDtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPldRdCloseDtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FnsPldRdCloseDtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,182); // serialize this field at offset 182 by default 
    }
    
	/**
	* sets parent for this FnsPldRdCloseDtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 182 by default
    }    
	/**
	* initializes the field in FnsPldRdCloseDtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FNS_PLD_RD_CLOSE_DT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFnsPldRdClosedCcyy = getStartOffset() + 0;	// set offset for serialization
  
             beginFnsPldRdFiller1 = getStartOffset() + 4;	// set offset for serialization
  
             beginFnsPldRdClosedMm = getStartOffset() + 5;	// set offset for serialization
  
             beginFnsPldRdFiller2 = getStartOffset() + 7;	// set offset for serialization
  
             beginFnsPldRdClosedDd = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFnsPldRdClosedCcyyCounter = -1;
     public boolean isFnsPldRdClosedCcyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdClosedCcyyCounter != sharedCounter;
         localFnsPldRdClosedCcyyCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PLD_RD_CLOSED_CCYY_LEN = 4;
	/**
	 * 	serialize this FnsPldRdClosedCcyy
	 */
   protected void serializeFnsPldRdClosedCcyy(char[] fnsPldRdClosedCcyy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPldRdClosedCcyy,0,getStringValue(),beginFnsPldRdClosedCcyy,FNS_PLD_RD_CLOSED_CCYY_LEN);
       localFnsPldRdClosedCcyyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPldRdClosedCcyyConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshFnsPldRdClosedCcyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPldRdClosedCcyy() {	 
   		return (substring(getStringValue(),beginFnsPldRdClosedCcyy,beginFnsPldRdClosedCcyy + FNS_PLD_RD_CLOSED_CCYY_LEN));
   	}
     int localFnsPldRdFiller1Counter = -1;
     public boolean isFnsPldRdFiller1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdFiller1Counter != sharedCounter;
         localFnsPldRdFiller1Counter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PLD_RD_FILLER_1_LEN = 1;
	/**
	 * 	serialize this FnsPldRdFiller1
	 */
   protected void serializeFnsPldRdFiller1(char[] fnsPldRdFiller1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPldRdFiller1,0,getStringValue(),beginFnsPldRdFiller1,FNS_PLD_RD_FILLER_1_LEN);
       localFnsPldRdFiller1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPldRdFiller1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFnsPldRdFiller1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPldRdFiller1() {	 
   		return (substring(getStringValue(),beginFnsPldRdFiller1,beginFnsPldRdFiller1 + FNS_PLD_RD_FILLER_1_LEN));
   	}
     int localFnsPldRdClosedMmCounter = -1;
     public boolean isFnsPldRdClosedMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdClosedMmCounter != sharedCounter;
         localFnsPldRdClosedMmCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PLD_RD_CLOSED_MM_LEN = 2;
	/**
	 * 	serialize this FnsPldRdClosedMm
	 */
   protected void serializeFnsPldRdClosedMm(char[] fnsPldRdClosedMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPldRdClosedMm,0,getStringValue(),beginFnsPldRdClosedMm,FNS_PLD_RD_CLOSED_MM_LEN);
       localFnsPldRdClosedMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPldRdClosedMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFnsPldRdClosedMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPldRdClosedMm() {	 
   		return (substring(getStringValue(),beginFnsPldRdClosedMm,beginFnsPldRdClosedMm + FNS_PLD_RD_CLOSED_MM_LEN));
   	}
     int localFnsPldRdFiller2Counter = -1;
     public boolean isFnsPldRdFiller2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdFiller2Counter != sharedCounter;
         localFnsPldRdFiller2Counter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PLD_RD_FILLER_2_LEN = 1;
	/**
	 * 	serialize this FnsPldRdFiller2
	 */
   protected void serializeFnsPldRdFiller2(char[] fnsPldRdFiller2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPldRdFiller2,0,getStringValue(),beginFnsPldRdFiller2,FNS_PLD_RD_FILLER_2_LEN);
       localFnsPldRdFiller2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPldRdFiller2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFnsPldRdFiller2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPldRdFiller2() {	 
   		return (substring(getStringValue(),beginFnsPldRdFiller2,beginFnsPldRdFiller2 + FNS_PLD_RD_FILLER_2_LEN));
   	}
     int localFnsPldRdClosedDdCounter = -1;
     public boolean isFnsPldRdClosedDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdClosedDdCounter != sharedCounter;
         localFnsPldRdClosedDdCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PLD_RD_CLOSED_DD_LEN = 2;
	/**
	 * 	serialize this FnsPldRdClosedDd
	 */
   protected void serializeFnsPldRdClosedDd(char[] fnsPldRdClosedDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPldRdClosedDd,0,getStringValue(),beginFnsPldRdClosedDd,FNS_PLD_RD_CLOSED_DD_LEN);
       localFnsPldRdClosedDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPldRdClosedDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFnsPldRdClosedDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPldRdClosedDd() {	 
   		return (substring(getStringValue(),beginFnsPldRdClosedDd,beginFnsPldRdClosedDd + FNS_PLD_RD_CLOSED_DD_LEN));
   	}




}
  

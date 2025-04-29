package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnTimeValidInputSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnTimeValidInputSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnTimeValidInputSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_TIME_VALID_INPUT_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnTimeValidHh;
            protected  int beginCmnTimeValidSep1;
            protected  int beginCmnTimeValidMm;
            protected  int beginCmnTimeValidSep2;
            protected  int beginCmnTimeValidSs;
	
	/**
	* Constructor for CmnTimeValidInputSerialized
	**/
    public CmnTimeValidInputSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnTimeValidInputSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeValidInputSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnTimeValidInputSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1024); // serialize this field at offset 1024 by default 
    }
    
	/**
	* sets parent for this CmnTimeValidInputSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1024 by default
    }    
	/**
	* initializes the field in CmnTimeValidInputSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_TIME_VALID_INPUT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnTimeValidHh = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnTimeValidSep1 = getStartOffset() + 2;	// set offset for serialization
  
             beginCmnTimeValidMm = getStartOffset() + 3;	// set offset for serialization
  
             beginCmnTimeValidSep2 = getStartOffset() + 5;	// set offset for serialization
  
             beginCmnTimeValidSs = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnTimeValidHhCounter = -1;
     public boolean isCmnTimeValidHhModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeValidHhCounter != sharedCounter;
         localCmnTimeValidHhCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_TIME_VALID_HH_LEN = 2;
	/**
	 * 	serialize this CmnTimeValidHh
	 */
   protected void serializeCmnTimeValidHh(char[] cmnTimeValidHh) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnTimeValidHh,0,getStringValue(),beginCmnTimeValidHh,CMN_TIME_VALID_HH_LEN);
       localCmnTimeValidHhCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnTimeValidHhConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCmnTimeValidHh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnTimeValidHh() {	 
   		return (substring(getStringValue(),beginCmnTimeValidHh,beginCmnTimeValidHh + CMN_TIME_VALID_HH_LEN));
   	}
     int localCmnTimeValidSep1Counter = -1;
     public boolean isCmnTimeValidSep1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeValidSep1Counter != sharedCounter;
         localCmnTimeValidSep1Counter = sharedCounter; return hasModified;
     }
	protected static final int CMN_TIME_VALID_SEP_1_LEN = 1;
	/**
	 * 	serialize this CmnTimeValidSep1
	 */
   protected void serializeCmnTimeValidSep1(char[] cmnTimeValidSep1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnTimeValidSep1,0,getStringValue(),beginCmnTimeValidSep1,CMN_TIME_VALID_SEP_1_LEN);
       localCmnTimeValidSep1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnTimeValidSep1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCmnTimeValidSep1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnTimeValidSep1() {	 
   		return (substring(getStringValue(),beginCmnTimeValidSep1,beginCmnTimeValidSep1 + CMN_TIME_VALID_SEP_1_LEN));
   	}
     int localCmnTimeValidMmCounter = -1;
     public boolean isCmnTimeValidMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeValidMmCounter != sharedCounter;
         localCmnTimeValidMmCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_TIME_VALID_MM_LEN = 2;
	/**
	 * 	serialize this CmnTimeValidMm
	 */
   protected void serializeCmnTimeValidMm(char[] cmnTimeValidMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnTimeValidMm,0,getStringValue(),beginCmnTimeValidMm,CMN_TIME_VALID_MM_LEN);
       localCmnTimeValidMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnTimeValidMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCmnTimeValidMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnTimeValidMm() {	 
   		return (substring(getStringValue(),beginCmnTimeValidMm,beginCmnTimeValidMm + CMN_TIME_VALID_MM_LEN));
   	}
     int localCmnTimeValidSep2Counter = -1;
     public boolean isCmnTimeValidSep2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeValidSep2Counter != sharedCounter;
         localCmnTimeValidSep2Counter = sharedCounter; return hasModified;
     }
	protected static final int CMN_TIME_VALID_SEP_2_LEN = 1;
	/**
	 * 	serialize this CmnTimeValidSep2
	 */
   protected void serializeCmnTimeValidSep2(char[] cmnTimeValidSep2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnTimeValidSep2,0,getStringValue(),beginCmnTimeValidSep2,CMN_TIME_VALID_SEP_2_LEN);
       localCmnTimeValidSep2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnTimeValidSep2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCmnTimeValidSep2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnTimeValidSep2() {	 
   		return (substring(getStringValue(),beginCmnTimeValidSep2,beginCmnTimeValidSep2 + CMN_TIME_VALID_SEP_2_LEN));
   	}
     int localCmnTimeValidSsCounter = -1;
     public boolean isCmnTimeValidSsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeValidSsCounter != sharedCounter;
         localCmnTimeValidSsCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_TIME_VALID_SS_LEN = 2;
	/**
	 * 	serialize this CmnTimeValidSs
	 */
   protected void serializeCmnTimeValidSs(char[] cmnTimeValidSs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnTimeValidSs,0,getStringValue(),beginCmnTimeValidSs,CMN_TIME_VALID_SS_LEN);
       localCmnTimeValidSsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnTimeValidSsConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCmnTimeValidSs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnTimeValidSs() {	 
   		return (substring(getStringValue(),beginCmnTimeValidSs,beginCmnTimeValidSs + CMN_TIME_VALID_SS_LEN));
   	}




}
  

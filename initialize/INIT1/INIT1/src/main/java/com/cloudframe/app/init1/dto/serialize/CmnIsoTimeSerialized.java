package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnIsoTimeSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnIsoTimeSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnIsoTimeSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_ISO_TIME_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnIsoTimeHh;
            protected  int beginCmnIsoTimeSep1;
            protected  int beginCmnIsoTimeMm;
            protected  int beginCmnIsoTimeSep101;
            protected  int beginCmnIsoTimeSs;
	
	/**
	* Constructor for CmnIsoTimeSerialized
	**/
    public CmnIsoTimeSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnIsoTimeSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnIsoTimeSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnIsoTimeSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1025); // serialize this field at offset 1025 by default 
    }
    
	/**
	* sets parent for this CmnIsoTimeSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1025 by default
    }    
	/**
	* initializes the field in CmnIsoTimeSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_ISO_TIME_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnIsoTimeHh = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnIsoTimeSep1 = getStartOffset() + 2;	// set offset for serialization
  
             beginCmnIsoTimeMm = getStartOffset() + 3;	// set offset for serialization
  
             beginCmnIsoTimeSep101 = getStartOffset() + 5;	// set offset for serialization
  
             beginCmnIsoTimeSs = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnIsoTimeHhCounter = -1;
     public boolean isCmnIsoTimeHhModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnIsoTimeHhCounter != sharedCounter;
         localCmnIsoTimeHhCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_ISO_TIME_HH_LEN = 2;
	/**
	 * 	serialize this CmnIsoTimeHh
	 */
   protected void serializeCmnIsoTimeHh(char[] cmnIsoTimeHh) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnIsoTimeHh,0,getStringValue(),beginCmnIsoTimeHh,CMN_ISO_TIME_HH_LEN);
       localCmnIsoTimeHhCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnIsoTimeHhConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCmnIsoTimeHh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnIsoTimeHh() {	 
   		return (substring(getStringValue(),beginCmnIsoTimeHh,beginCmnIsoTimeHh + CMN_ISO_TIME_HH_LEN));
   	}
     int localCmnIsoTimeSep1Counter = -1;
     public boolean isCmnIsoTimeSep1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnIsoTimeSep1Counter != sharedCounter;
         localCmnIsoTimeSep1Counter = sharedCounter; return hasModified;
     }
	protected static final int CMN_ISO_TIME_SEP_1_LEN = 1;
	/**
	 * 	serialize this CmnIsoTimeSep1
	 */
   protected void serializeCmnIsoTimeSep1(char[] cmnIsoTimeSep1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnIsoTimeSep1,0,getStringValue(),beginCmnIsoTimeSep1,CMN_ISO_TIME_SEP_1_LEN);
       localCmnIsoTimeSep1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnIsoTimeSep1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCmnIsoTimeSep1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnIsoTimeSep1() {	 
   		return (substring(getStringValue(),beginCmnIsoTimeSep1,beginCmnIsoTimeSep1 + CMN_ISO_TIME_SEP_1_LEN));
   	}
     int localCmnIsoTimeMmCounter = -1;
     public boolean isCmnIsoTimeMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnIsoTimeMmCounter != sharedCounter;
         localCmnIsoTimeMmCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_ISO_TIME_MM_LEN = 2;
	/**
	 * 	serialize this CmnIsoTimeMm
	 */
   protected void serializeCmnIsoTimeMm(char[] cmnIsoTimeMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnIsoTimeMm,0,getStringValue(),beginCmnIsoTimeMm,CMN_ISO_TIME_MM_LEN);
       localCmnIsoTimeMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnIsoTimeMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCmnIsoTimeMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnIsoTimeMm() {	 
   		return (substring(getStringValue(),beginCmnIsoTimeMm,beginCmnIsoTimeMm + CMN_ISO_TIME_MM_LEN));
   	}
     int localCmnIsoTimeSep101Counter = -1;
     public boolean isCmnIsoTimeSep101Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnIsoTimeSep101Counter != sharedCounter;
         localCmnIsoTimeSep101Counter = sharedCounter; return hasModified;
     }
	protected static final int CMN_ISO_TIME_SEP_101_LEN = 1;
	/**
	 * 	serialize this CmnIsoTimeSep101
	 */
   protected void serializeCmnIsoTimeSep101(char[] cmnIsoTimeSep101) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnIsoTimeSep101,0,getStringValue(),beginCmnIsoTimeSep101,CMN_ISO_TIME_SEP_101_LEN);
       localCmnIsoTimeSep101Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnIsoTimeSep101Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCmnIsoTimeSep101 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnIsoTimeSep101() {	 
   		return (substring(getStringValue(),beginCmnIsoTimeSep101,beginCmnIsoTimeSep101 + CMN_ISO_TIME_SEP_101_LEN));
   	}
     int localCmnIsoTimeSsCounter = -1;
     public boolean isCmnIsoTimeSsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnIsoTimeSsCounter != sharedCounter;
         localCmnIsoTimeSsCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_ISO_TIME_SS_LEN = 2;
	/**
	 * 	serialize this CmnIsoTimeSs
	 */
   protected void serializeCmnIsoTimeSs(char[] cmnIsoTimeSs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnIsoTimeSs,0,getStringValue(),beginCmnIsoTimeSs,CMN_ISO_TIME_SS_LEN);
       localCmnIsoTimeSsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnIsoTimeSsConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCmnIsoTimeSs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnIsoTimeSs() {	 
   		return (substring(getStringValue(),beginCmnIsoTimeSs,beginCmnIsoTimeSs + CMN_ISO_TIME_SS_LEN));
   	}




}
  

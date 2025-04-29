package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnJisTimeSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnJisTimeSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnJisTimeSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_JIS_TIME_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnJisTimeHh;
            protected  int beginCmnJisTimeSep1;
            protected  int beginCmnJisTimeMm;
            protected  int beginCmnJisTimeSep101;
            protected  int beginCmnJisTimeSs;
	
	/**
	* Constructor for CmnJisTimeSerialized
	**/
    public CmnJisTimeSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnJisTimeSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnJisTimeSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnJisTimeSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1033); // serialize this field at offset 1033 by default 
    }
    
	/**
	* sets parent for this CmnJisTimeSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1033 by default
    }    
	/**
	* initializes the field in CmnJisTimeSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_JIS_TIME_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnJisTimeHh = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnJisTimeSep1 = getStartOffset() + 2;	// set offset for serialization
  
             beginCmnJisTimeMm = getStartOffset() + 3;	// set offset for serialization
  
             beginCmnJisTimeSep101 = getStartOffset() + 5;	// set offset for serialization
  
             beginCmnJisTimeSs = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnJisTimeHhCounter = -1;
     public boolean isCmnJisTimeHhModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnJisTimeHhCounter != sharedCounter;
         localCmnJisTimeHhCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_JIS_TIME_HH_LEN = 2;
	/**
	 * 	serialize this CmnJisTimeHh
	 */
   protected void serializeCmnJisTimeHh(char[] cmnJisTimeHh) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnJisTimeHh,0,getStringValue(),beginCmnJisTimeHh,CMN_JIS_TIME_HH_LEN);
       localCmnJisTimeHhCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnJisTimeHhConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCmnJisTimeHh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnJisTimeHh() {	 
   		return (substring(getStringValue(),beginCmnJisTimeHh,beginCmnJisTimeHh + CMN_JIS_TIME_HH_LEN));
   	}
     int localCmnJisTimeSep1Counter = -1;
     public boolean isCmnJisTimeSep1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnJisTimeSep1Counter != sharedCounter;
         localCmnJisTimeSep1Counter = sharedCounter; return hasModified;
     }
	protected static final int CMN_JIS_TIME_SEP_1_LEN = 1;
	/**
	 * 	serialize this CmnJisTimeSep1
	 */
   protected void serializeCmnJisTimeSep1(char[] cmnJisTimeSep1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnJisTimeSep1,0,getStringValue(),beginCmnJisTimeSep1,CMN_JIS_TIME_SEP_1_LEN);
       localCmnJisTimeSep1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnJisTimeSep1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCmnJisTimeSep1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnJisTimeSep1() {	 
   		return (substring(getStringValue(),beginCmnJisTimeSep1,beginCmnJisTimeSep1 + CMN_JIS_TIME_SEP_1_LEN));
   	}
     int localCmnJisTimeMmCounter = -1;
     public boolean isCmnJisTimeMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnJisTimeMmCounter != sharedCounter;
         localCmnJisTimeMmCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_JIS_TIME_MM_LEN = 2;
	/**
	 * 	serialize this CmnJisTimeMm
	 */
   protected void serializeCmnJisTimeMm(char[] cmnJisTimeMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnJisTimeMm,0,getStringValue(),beginCmnJisTimeMm,CMN_JIS_TIME_MM_LEN);
       localCmnJisTimeMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnJisTimeMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCmnJisTimeMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnJisTimeMm() {	 
   		return (substring(getStringValue(),beginCmnJisTimeMm,beginCmnJisTimeMm + CMN_JIS_TIME_MM_LEN));
   	}
     int localCmnJisTimeSep101Counter = -1;
     public boolean isCmnJisTimeSep101Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnJisTimeSep101Counter != sharedCounter;
         localCmnJisTimeSep101Counter = sharedCounter; return hasModified;
     }
	protected static final int CMN_JIS_TIME_SEP_101_LEN = 1;
	/**
	 * 	serialize this CmnJisTimeSep101
	 */
   protected void serializeCmnJisTimeSep101(char[] cmnJisTimeSep101) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnJisTimeSep101,0,getStringValue(),beginCmnJisTimeSep101,CMN_JIS_TIME_SEP_101_LEN);
       localCmnJisTimeSep101Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnJisTimeSep101Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCmnJisTimeSep101 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnJisTimeSep101() {	 
   		return (substring(getStringValue(),beginCmnJisTimeSep101,beginCmnJisTimeSep101 + CMN_JIS_TIME_SEP_101_LEN));
   	}
     int localCmnJisTimeSsCounter = -1;
     public boolean isCmnJisTimeSsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnJisTimeSsCounter != sharedCounter;
         localCmnJisTimeSsCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_JIS_TIME_SS_LEN = 2;
	/**
	 * 	serialize this CmnJisTimeSs
	 */
   protected void serializeCmnJisTimeSs(char[] cmnJisTimeSs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnJisTimeSs,0,getStringValue(),beginCmnJisTimeSs,CMN_JIS_TIME_SS_LEN);
       localCmnJisTimeSsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnJisTimeSsConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCmnJisTimeSs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnJisTimeSs() {	 
   		return (substring(getStringValue(),beginCmnJisTimeSs,beginCmnJisTimeSs + CMN_JIS_TIME_SS_LEN));
   	}




}
  

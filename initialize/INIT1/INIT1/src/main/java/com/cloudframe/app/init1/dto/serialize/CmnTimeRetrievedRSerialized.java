package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnTimeRetrievedRSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnTimeRetrievedRSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnTimeRetrievedRSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_TIME_RETRIEVED_R_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnTimeRetHh;
            protected  int beginCmnTimeRetSep1;
            protected  int beginCmnTimeRetMm;
            protected  int beginCmnTimeRetSep2;
            protected  int beginCmnTimeRetSs;
	
	/**
	* Constructor for CmnTimeRetrievedRSerialized
	**/
    public CmnTimeRetrievedRSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnTimeRetrievedRSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeRetrievedRSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnTimeRetrievedRSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1035); // serialize this field at offset 1035 by default 
    }
    
	/**
	* sets parent for this CmnTimeRetrievedRSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1035 by default
    }    
	/**
	* initializes the field in CmnTimeRetrievedRSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_TIME_RETRIEVED_R_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnTimeRetHh = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnTimeRetSep1 = getStartOffset() + 2;	// set offset for serialization
  
             beginCmnTimeRetMm = getStartOffset() + 3;	// set offset for serialization
  
             beginCmnTimeRetSep2 = getStartOffset() + 5;	// set offset for serialization
  
             beginCmnTimeRetSs = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnTimeRetHhCounter = -1;
     public boolean isCmnTimeRetHhModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeRetHhCounter != sharedCounter;
         localCmnTimeRetHhCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_TIME_RET_HH_LEN = 2;
	/**
	 * 	serialize this CmnTimeRetHh
	 */
   protected void serializeCmnTimeRetHh(char[] cmnTimeRetHh) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnTimeRetHh,0,getStringValue(),beginCmnTimeRetHh,CMN_TIME_RET_HH_LEN);
       localCmnTimeRetHhCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnTimeRetHhConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCmnTimeRetHh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnTimeRetHh() {	 
   		return (substring(getStringValue(),beginCmnTimeRetHh,beginCmnTimeRetHh + CMN_TIME_RET_HH_LEN));
   	}
     int localCmnTimeRetSep1Counter = -1;
     public boolean isCmnTimeRetSep1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeRetSep1Counter != sharedCounter;
         localCmnTimeRetSep1Counter = sharedCounter; return hasModified;
     }
	protected static final int CMN_TIME_RET_SEP_1_LEN = 1;
	/**
	 * 	serialize this CmnTimeRetSep1
	 */
   protected void serializeCmnTimeRetSep1(char[] cmnTimeRetSep1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnTimeRetSep1,0,getStringValue(),beginCmnTimeRetSep1,CMN_TIME_RET_SEP_1_LEN);
       localCmnTimeRetSep1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnTimeRetSep1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCmnTimeRetSep1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnTimeRetSep1() {	 
   		return (substring(getStringValue(),beginCmnTimeRetSep1,beginCmnTimeRetSep1 + CMN_TIME_RET_SEP_1_LEN));
   	}
     int localCmnTimeRetMmCounter = -1;
     public boolean isCmnTimeRetMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeRetMmCounter != sharedCounter;
         localCmnTimeRetMmCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_TIME_RET_MM_LEN = 2;
	/**
	 * 	serialize this CmnTimeRetMm
	 */
   protected void serializeCmnTimeRetMm(char[] cmnTimeRetMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnTimeRetMm,0,getStringValue(),beginCmnTimeRetMm,CMN_TIME_RET_MM_LEN);
       localCmnTimeRetMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnTimeRetMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCmnTimeRetMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnTimeRetMm() {	 
   		return (substring(getStringValue(),beginCmnTimeRetMm,beginCmnTimeRetMm + CMN_TIME_RET_MM_LEN));
   	}
     int localCmnTimeRetSep2Counter = -1;
     public boolean isCmnTimeRetSep2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeRetSep2Counter != sharedCounter;
         localCmnTimeRetSep2Counter = sharedCounter; return hasModified;
     }
	protected static final int CMN_TIME_RET_SEP_2_LEN = 1;
	/**
	 * 	serialize this CmnTimeRetSep2
	 */
   protected void serializeCmnTimeRetSep2(char[] cmnTimeRetSep2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnTimeRetSep2,0,getStringValue(),beginCmnTimeRetSep2,CMN_TIME_RET_SEP_2_LEN);
       localCmnTimeRetSep2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnTimeRetSep2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCmnTimeRetSep2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnTimeRetSep2() {	 
   		return (substring(getStringValue(),beginCmnTimeRetSep2,beginCmnTimeRetSep2 + CMN_TIME_RET_SEP_2_LEN));
   	}
     int localCmnTimeRetSsCounter = -1;
     public boolean isCmnTimeRetSsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeRetSsCounter != sharedCounter;
         localCmnTimeRetSsCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_TIME_RET_SS_LEN = 2;
	/**
	 * 	serialize this CmnTimeRetSs
	 */
   protected void serializeCmnTimeRetSs(char[] cmnTimeRetSs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnTimeRetSs,0,getStringValue(),beginCmnTimeRetSs,CMN_TIME_RET_SS_LEN);
       localCmnTimeRetSsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnTimeRetSsConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCmnTimeRetSs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnTimeRetSs() {	 
   		return (substring(getStringValue(),beginCmnTimeRetSs,beginCmnTimeRetSs + CMN_TIME_RET_SS_LEN));
   	}




}
  

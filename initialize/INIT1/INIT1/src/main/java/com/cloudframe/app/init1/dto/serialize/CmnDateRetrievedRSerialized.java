package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnDateRetrievedRSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnDateRetrievedRSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnDateRetrievedRSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_DATE_RETRIEVED_R_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnDateRetMm;
            protected  int beginCmnDateRetSep1;
            protected  int beginCmnDateRetDd;
            protected  int beginCmnDateRetSep2;
	
	/**
	* Constructor for CmnDateRetrievedRSerialized
	**/
    public CmnDateRetrievedRSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnDateRetrievedRSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateRetrievedRSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnDateRetrievedRSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1025); // serialize this field at offset 1025 by default 
    }
    
	/**
	* sets parent for this CmnDateRetrievedRSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1025 by default
    }    
	/**
	* initializes the field in CmnDateRetrievedRSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_DATE_RETRIEVED_R_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnDateRetMm = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnDateRetSep1 = getStartOffset() + 2;	// set offset for serialization
  
             beginCmnDateRetDd = getStartOffset() + 3;	// set offset for serialization
  
             beginCmnDateRetSep2 = getStartOffset() + 5;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localCmnDateRetMmCounter = -1;
     public boolean isCmnDateRetMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateRetMmCounter != sharedCounter;
         localCmnDateRetMmCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_RET_MM_LEN = 2;
	/**
	 * 	serialize this CmnDateRetMm
	 */
   protected void serializeCmnDateRetMm(char[] cmnDateRetMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateRetMm,0,getStringValue(),beginCmnDateRetMm,CMN_DATE_RET_MM_LEN);
       localCmnDateRetMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateRetMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCmnDateRetMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateRetMm() {	 
   		return (substring(getStringValue(),beginCmnDateRetMm,beginCmnDateRetMm + CMN_DATE_RET_MM_LEN));
   	}
     int localCmnDateRetSep1Counter = -1;
     public boolean isCmnDateRetSep1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateRetSep1Counter != sharedCounter;
         localCmnDateRetSep1Counter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_RET_SEP_1_LEN = 1;
	/**
	 * 	serialize this CmnDateRetSep1
	 */
   protected void serializeCmnDateRetSep1(char[] cmnDateRetSep1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateRetSep1,0,getStringValue(),beginCmnDateRetSep1,CMN_DATE_RET_SEP_1_LEN);
       localCmnDateRetSep1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateRetSep1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCmnDateRetSep1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateRetSep1() {	 
   		return (substring(getStringValue(),beginCmnDateRetSep1,beginCmnDateRetSep1 + CMN_DATE_RET_SEP_1_LEN));
   	}
     int localCmnDateRetDdCounter = -1;
     public boolean isCmnDateRetDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateRetDdCounter != sharedCounter;
         localCmnDateRetDdCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_RET_DD_LEN = 2;
	/**
	 * 	serialize this CmnDateRetDd
	 */
   protected void serializeCmnDateRetDd(char[] cmnDateRetDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateRetDd,0,getStringValue(),beginCmnDateRetDd,CMN_DATE_RET_DD_LEN);
       localCmnDateRetDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateRetDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCmnDateRetDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateRetDd() {	 
   		return (substring(getStringValue(),beginCmnDateRetDd,beginCmnDateRetDd + CMN_DATE_RET_DD_LEN));
   	}
     int localCmnDateRetSep2Counter = -1;
     public boolean isCmnDateRetSep2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateRetSep2Counter != sharedCounter;
         localCmnDateRetSep2Counter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_RET_SEP_2_LEN = 1;
	/**
	 * 	serialize this CmnDateRetSep2
	 */
   protected void serializeCmnDateRetSep2(char[] cmnDateRetSep2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateRetSep2,0,getStringValue(),beginCmnDateRetSep2,CMN_DATE_RET_SEP_2_LEN);
       localCmnDateRetSep2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateRetSep2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCmnDateRetSep2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateRetSep2() {	 
   		return (substring(getStringValue(),beginCmnDateRetSep2,beginCmnDateRetSep2 + CMN_DATE_RET_SEP_2_LEN));
   	}




}
  

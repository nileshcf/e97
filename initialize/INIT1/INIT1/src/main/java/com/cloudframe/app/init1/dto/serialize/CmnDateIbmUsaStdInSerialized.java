package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnDateIbmUsaStdInSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnDateIbmUsaStdInSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnDateIbmUsaStdInSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_DATE_IBM_USA_STD_IN_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnDateIbmUsaStdInMm;
            protected  int beginCmnDateIbmUsaStdInSep1;
            protected  int beginCmnDateIbmUsaStdInDd;
            protected  int beginCmnDateIbmUsaStdInSep101;
            protected  int beginCmnDateIbmUsaStdInCcyy;
	
	/**
	* Constructor for CmnDateIbmUsaStdInSerialized
	**/
    public CmnDateIbmUsaStdInSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnDateIbmUsaStdInSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateIbmUsaStdInSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnDateIbmUsaStdInSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1025); // serialize this field at offset 1025 by default 
    }
    
	/**
	* sets parent for this CmnDateIbmUsaStdInSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1025 by default
    }    
	/**
	* initializes the field in CmnDateIbmUsaStdInSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_DATE_IBM_USA_STD_IN_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnDateIbmUsaStdInMm = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnDateIbmUsaStdInSep1 = getStartOffset() + 2;	// set offset for serialization
  
             beginCmnDateIbmUsaStdInDd = getStartOffset() + 3;	// set offset for serialization
  
             beginCmnDateIbmUsaStdInSep101 = getStartOffset() + 5;	// set offset for serialization
  
             beginCmnDateIbmUsaStdInCcyy = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnDateIbmUsaStdInMmCounter = -1;
     public boolean isCmnDateIbmUsaStdInMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateIbmUsaStdInMmCounter != sharedCounter;
         localCmnDateIbmUsaStdInMmCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_IBM_USA_STD_IN_MM_LEN = 2;
	/**
	 * 	serialize this CmnDateIbmUsaStdInMm
	 */
   protected void serializeCmnDateIbmUsaStdInMm(char[] cmnDateIbmUsaStdInMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateIbmUsaStdInMm,0,getStringValue(),beginCmnDateIbmUsaStdInMm,CMN_DATE_IBM_USA_STD_IN_MM_LEN);
       localCmnDateIbmUsaStdInMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateIbmUsaStdInMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCmnDateIbmUsaStdInMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateIbmUsaStdInMm() {	 
   		return (substring(getStringValue(),beginCmnDateIbmUsaStdInMm,beginCmnDateIbmUsaStdInMm + CMN_DATE_IBM_USA_STD_IN_MM_LEN));
   	}
     int localCmnDateIbmUsaStdInSep1Counter = -1;
     public boolean isCmnDateIbmUsaStdInSep1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateIbmUsaStdInSep1Counter != sharedCounter;
         localCmnDateIbmUsaStdInSep1Counter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_IBM_USA_STD_IN_SEP_1_LEN = 1;
	/**
	 * 	serialize this CmnDateIbmUsaStdInSep1
	 */
   protected void serializeCmnDateIbmUsaStdInSep1(char[] cmnDateIbmUsaStdInSep1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateIbmUsaStdInSep1,0,getStringValue(),beginCmnDateIbmUsaStdInSep1,CMN_DATE_IBM_USA_STD_IN_SEP_1_LEN);
       localCmnDateIbmUsaStdInSep1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateIbmUsaStdInSep1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCmnDateIbmUsaStdInSep1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateIbmUsaStdInSep1() {	 
   		return (substring(getStringValue(),beginCmnDateIbmUsaStdInSep1,beginCmnDateIbmUsaStdInSep1 + CMN_DATE_IBM_USA_STD_IN_SEP_1_LEN));
   	}
     int localCmnDateIbmUsaStdInDdCounter = -1;
     public boolean isCmnDateIbmUsaStdInDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateIbmUsaStdInDdCounter != sharedCounter;
         localCmnDateIbmUsaStdInDdCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_IBM_USA_STD_IN_DD_LEN = 2;
	/**
	 * 	serialize this CmnDateIbmUsaStdInDd
	 */
   protected void serializeCmnDateIbmUsaStdInDd(char[] cmnDateIbmUsaStdInDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateIbmUsaStdInDd,0,getStringValue(),beginCmnDateIbmUsaStdInDd,CMN_DATE_IBM_USA_STD_IN_DD_LEN);
       localCmnDateIbmUsaStdInDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateIbmUsaStdInDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCmnDateIbmUsaStdInDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateIbmUsaStdInDd() {	 
   		return (substring(getStringValue(),beginCmnDateIbmUsaStdInDd,beginCmnDateIbmUsaStdInDd + CMN_DATE_IBM_USA_STD_IN_DD_LEN));
   	}
     int localCmnDateIbmUsaStdInSep101Counter = -1;
     public boolean isCmnDateIbmUsaStdInSep101Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateIbmUsaStdInSep101Counter != sharedCounter;
         localCmnDateIbmUsaStdInSep101Counter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_IBM_USA_STD_IN_SEP_101_LEN = 1;
	/**
	 * 	serialize this CmnDateIbmUsaStdInSep101
	 */
   protected void serializeCmnDateIbmUsaStdInSep101(char[] cmnDateIbmUsaStdInSep101) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateIbmUsaStdInSep101,0,getStringValue(),beginCmnDateIbmUsaStdInSep101,CMN_DATE_IBM_USA_STD_IN_SEP_101_LEN);
       localCmnDateIbmUsaStdInSep101Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateIbmUsaStdInSep101Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCmnDateIbmUsaStdInSep101 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateIbmUsaStdInSep101() {	 
   		return (substring(getStringValue(),beginCmnDateIbmUsaStdInSep101,beginCmnDateIbmUsaStdInSep101 + CMN_DATE_IBM_USA_STD_IN_SEP_101_LEN));
   	}
     int localCmnDateIbmUsaStdInCcyyCounter = -1;
     public boolean isCmnDateIbmUsaStdInCcyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateIbmUsaStdInCcyyCounter != sharedCounter;
         localCmnDateIbmUsaStdInCcyyCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_IBM_USA_STD_IN_CCYY_LEN = 4;
	/**
	 * 	serialize this CmnDateIbmUsaStdInCcyy
	 */
   protected void serializeCmnDateIbmUsaStdInCcyy(char[] cmnDateIbmUsaStdInCcyy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateIbmUsaStdInCcyy,0,getStringValue(),beginCmnDateIbmUsaStdInCcyy,CMN_DATE_IBM_USA_STD_IN_CCYY_LEN);
       localCmnDateIbmUsaStdInCcyyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateIbmUsaStdInCcyyConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshCmnDateIbmUsaStdInCcyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateIbmUsaStdInCcyy() {	 
   		return (substring(getStringValue(),beginCmnDateIbmUsaStdInCcyy,beginCmnDateIbmUsaStdInCcyy + CMN_DATE_IBM_USA_STD_IN_CCYY_LEN));
   	}




}
  

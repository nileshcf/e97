package com.cloudframe.app.cpsc4.dto.serialize;

/**
*  The class DriftDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:43. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DriftDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DriftDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DRIFT_DATA_LENGTH = 28;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMdlDriftBandTyCd;
            protected  int beginMdlDriftTyCd;
            protected  int beginAllocTrgtFromPct;
            protected  int beginAllocTrgtToPct;
            protected  int beginMinDriftPct;
            protected  int beginMaxDriftPct;
	
	/**
	* Constructor for DriftDataSerialized
	**/
    public DriftDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DriftDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DriftDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DriftDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this DriftDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in DriftDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DRIFT_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMdlDriftBandTyCd = getStartOffset() + 0;	// set offset for serialization
  
  
             beginMdlDriftTyCd = getStartOffset() + 2;	// set offset for serialization
  
  
             beginAllocTrgtFromPct = getStartOffset() + 4;	// set offset for serialization
  
  
             beginAllocTrgtToPct = getStartOffset() + 8;	// set offset for serialization
  
  
             beginMinDriftPct = getStartOffset() + 12;	// set offset for serialization
  
  
             beginMaxDriftPct = getStartOffset() + 20;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localMdlDriftBandTyCdCounter = -1;
     public boolean isMdlDriftBandTyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMdlDriftBandTyCdCounter != sharedCounter;
         localMdlDriftBandTyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int MDL_DRIFT_BAND_TY_CD_LEN = 1;
	/**
	 * 	serialize this MdlDriftBandTyCd
	 */
   protected void serializeMdlDriftBandTyCd(char[] mdlDriftBandTyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mdlDriftBandTyCd,0,getStringValue(),beginMdlDriftBandTyCd,MDL_DRIFT_BAND_TY_CD_LEN);
       localMdlDriftBandTyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMdlDriftBandTyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMdlDriftBandTyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMdlDriftBandTyCd() {	 
   		return (substring(getStringValue(),beginMdlDriftBandTyCd,beginMdlDriftBandTyCd + MDL_DRIFT_BAND_TY_CD_LEN));
   	}
     int localMdlDriftTyCdCounter = -1;
     public boolean isMdlDriftTyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMdlDriftTyCdCounter != sharedCounter;
         localMdlDriftTyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int MDL_DRIFT_TY_CD_LEN = 1;
	/**
	 * 	serialize this MdlDriftTyCd
	 */
   protected void serializeMdlDriftTyCd(char[] mdlDriftTyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mdlDriftTyCd,0,getStringValue(),beginMdlDriftTyCd,MDL_DRIFT_TY_CD_LEN);
       localMdlDriftTyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMdlDriftTyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMdlDriftTyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMdlDriftTyCd() {	 
   		return (substring(getStringValue(),beginMdlDriftTyCd,beginMdlDriftTyCd + MDL_DRIFT_TY_CD_LEN));
   	}
     int localAllocTrgtFromPctCounter = -1;
     public boolean isAllocTrgtFromPctModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAllocTrgtFromPctCounter != sharedCounter;
         localAllocTrgtFromPctCounter = sharedCounter; return hasModified;
     }
	protected static final int ALLOC_TRGT_FROM_PCT_LEN = 3;
	/**
	 * 	serialize this AllocTrgtFromPct
	 */
   protected void serializeAllocTrgtFromPct(char[] allocTrgtFromPct) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(allocTrgtFromPct,0,getStringValue(),beginAllocTrgtFromPct,ALLOC_TRGT_FROM_PCT_LEN);
       localAllocTrgtFromPctCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAllocTrgtFromPctConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshAllocTrgtFromPct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAllocTrgtFromPct() {	 
   		return (substring(getStringValue(),beginAllocTrgtFromPct,beginAllocTrgtFromPct + ALLOC_TRGT_FROM_PCT_LEN));
   	}
     int localAllocTrgtToPctCounter = -1;
     public boolean isAllocTrgtToPctModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAllocTrgtToPctCounter != sharedCounter;
         localAllocTrgtToPctCounter = sharedCounter; return hasModified;
     }
	protected static final int ALLOC_TRGT_TO_PCT_LEN = 3;
	/**
	 * 	serialize this AllocTrgtToPct
	 */
   protected void serializeAllocTrgtToPct(char[] allocTrgtToPct) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(allocTrgtToPct,0,getStringValue(),beginAllocTrgtToPct,ALLOC_TRGT_TO_PCT_LEN);
       localAllocTrgtToPctCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAllocTrgtToPctConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshAllocTrgtToPct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAllocTrgtToPct() {	 
   		return (substring(getStringValue(),beginAllocTrgtToPct,beginAllocTrgtToPct + ALLOC_TRGT_TO_PCT_LEN));
   	}
     int localMinDriftPctCounter = -1;
     public boolean isMinDriftPctModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMinDriftPctCounter != sharedCounter;
         localMinDriftPctCounter = sharedCounter; return hasModified;
     }
	protected static final int MIN_DRIFT_PCT_LEN = 7;
	/**
	 * 	serialize this MinDriftPct
	 */
   protected void serializeMinDriftPct(char[] minDriftPct) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(minDriftPct,0,getStringValue(),beginMinDriftPct,MIN_DRIFT_PCT_LEN);
       localMinDriftPctCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMinDriftPctConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshMinDriftPct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMinDriftPct() {	 
   		return (substring(getStringValue(),beginMinDriftPct,beginMinDriftPct + MIN_DRIFT_PCT_LEN));
   	}
     int localMaxDriftPctCounter = -1;
     public boolean isMaxDriftPctModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMaxDriftPctCounter != sharedCounter;
         localMaxDriftPctCounter = sharedCounter; return hasModified;
     }
	protected static final int MAX_DRIFT_PCT_LEN = 7;
	/**
	 * 	serialize this MaxDriftPct
	 */
   protected void serializeMaxDriftPct(char[] maxDriftPct) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(maxDriftPct,0,getStringValue(),beginMaxDriftPct,MAX_DRIFT_PCT_LEN);
       localMaxDriftPctCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMaxDriftPctConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshMaxDriftPct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMaxDriftPct() {	 
   		return (substring(getStringValue(),beginMaxDriftPct,beginMaxDriftPct + MAX_DRIFT_PCT_LEN));
   	}




}
  

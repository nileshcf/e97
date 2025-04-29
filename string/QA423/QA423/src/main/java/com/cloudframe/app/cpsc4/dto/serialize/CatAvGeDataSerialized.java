package com.cloudframe.app.cpsc4.dto.serialize;

/**
*  The class CatAvGeDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CatAvGeDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CatAvGeDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CAT_AV_GE_DATA_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginInvstObjCd;
            protected  int beginInvstPct;
            protected  int beginMinTrgtDriftPct;
            protected  int beginMaxTrgtDriftPct;
	
	/**
	* Constructor for CatAvGeDataSerialized
	**/
    public CatAvGeDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CatAvGeDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CatAvGeDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CatAvGeDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this CatAvGeDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in CatAvGeDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CAT_AV_GE_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginInvstObjCd = getStartOffset() + 0;	// set offset for serialization
  
  
             beginInvstPct = getStartOffset() + 2;	// set offset for serialization
  
  
             beginMinTrgtDriftPct = getStartOffset() + 6;	// set offset for serialization
  
  
             beginMaxTrgtDriftPct = getStartOffset() + 13;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localInvstObjCdCounter = -1;
     public boolean isInvstObjCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInvstObjCdCounter != sharedCounter;
         localInvstObjCdCounter = sharedCounter; return hasModified;
     }
	protected static final int INVST_OBJ_CD_LEN = 1;
	/**
	 * 	serialize this InvstObjCd
	 */
   protected void serializeInvstObjCd(char[] invstObjCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(invstObjCd,0,getStringValue(),beginInvstObjCd,INVST_OBJ_CD_LEN);
       localInvstObjCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInvstObjCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshInvstObjCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInvstObjCd() {	 
   		return (substring(getStringValue(),beginInvstObjCd,beginInvstObjCd + INVST_OBJ_CD_LEN));
   	}
     int localInvstPctCounter = -1;
     public boolean isInvstPctModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInvstPctCounter != sharedCounter;
         localInvstPctCounter = sharedCounter; return hasModified;
     }
	protected static final int INVST_PCT_LEN = 3;
	/**
	 * 	serialize this InvstPct
	 */
   protected void serializeInvstPct(char[] invstPct) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(invstPct,0,getStringValue(),beginInvstPct,INVST_PCT_LEN);
       localInvstPctCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInvstPctConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshInvstPct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInvstPct() {	 
   		return (substring(getStringValue(),beginInvstPct,beginInvstPct + INVST_PCT_LEN));
   	}
     int localMinTrgtDriftPctCounter = -1;
     public boolean isMinTrgtDriftPctModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMinTrgtDriftPctCounter != sharedCounter;
         localMinTrgtDriftPctCounter = sharedCounter; return hasModified;
     }
	protected static final int MIN_TRGT_DRIFT_PCT_LEN = 6;
	/**
	 * 	serialize this MinTrgtDriftPct
	 */
   protected void serializeMinTrgtDriftPct(char[] minTrgtDriftPct) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(minTrgtDriftPct,0,getStringValue(),beginMinTrgtDriftPct,MIN_TRGT_DRIFT_PCT_LEN);
       localMinTrgtDriftPctCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMinTrgtDriftPctConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshMinTrgtDriftPct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMinTrgtDriftPct() {	 
   		return (substring(getStringValue(),beginMinTrgtDriftPct,beginMinTrgtDriftPct + MIN_TRGT_DRIFT_PCT_LEN));
   	}
     int localMaxTrgtDriftPctCounter = -1;
     public boolean isMaxTrgtDriftPctModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMaxTrgtDriftPctCounter != sharedCounter;
         localMaxTrgtDriftPctCounter = sharedCounter; return hasModified;
     }
	protected static final int MAX_TRGT_DRIFT_PCT_LEN = 6;
	/**
	 * 	serialize this MaxTrgtDriftPct
	 */
   protected void serializeMaxTrgtDriftPct(char[] maxTrgtDriftPct) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(maxTrgtDriftPct,0,getStringValue(),beginMaxTrgtDriftPct,MAX_TRGT_DRIFT_PCT_LEN);
       localMaxTrgtDriftPctCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMaxTrgtDriftPctConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshMaxTrgtDriftPct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMaxTrgtDriftPct() {	 
   		return (substring(getStringValue(),beginMaxTrgtDriftPct,beginMaxTrgtDriftPct + MAX_TRGT_DRIFT_PCT_LEN));
   	}




}
  

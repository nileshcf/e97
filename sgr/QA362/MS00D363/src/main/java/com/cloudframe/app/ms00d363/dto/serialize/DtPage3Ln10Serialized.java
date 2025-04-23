package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage3Ln10Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage3Ln10Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage3Ln10Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_3_LN_10_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt310Cc;
            protected  int beginDt310Ica;
            protected  int beginDt310GcmacqNetAmt;
            protected  int beginDt310GcmacqInd;
            protected  int beginDt310GcmacqFeeAmt;
            protected  int beginDt310GcmacqFeeInd;
            protected  int beginDt310GcmissNetAmt;
            protected  int beginDt310GcmissInd;
            protected  int beginDt310GcmissFeeAmt;
            protected  int beginDt310GcmissFeeInd;
	
	/**
	* Constructor for DtPage3Ln10Serialized
	**/
    public DtPage3Ln10Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage3Ln10Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_3_LN_10_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt310Cc = getStartOffset() + 0;	// set offset for serialization
  
  
  
             beginDt310Ica = getStartOffset() + 14;	// set offset for serialization
  
  
             beginDt310GcmacqNetAmt = getStartOffset() + 24;	// set offset for serialization
  
             beginDt310GcmacqInd = getStartOffset() + 42;	// set offset for serialization
  
  
             beginDt310GcmacqFeeAmt = getStartOffset() + 45;	// set offset for serialization
  
             beginDt310GcmacqFeeInd = getStartOffset() + 61;	// set offset for serialization
  
             beginDt310GcmissNetAmt = getStartOffset() + 63;	// set offset for serialization
  
             beginDt310GcmissInd = getStartOffset() + 81;	// set offset for serialization
  
  
             beginDt310GcmissFeeAmt = getStartOffset() + 85;	// set offset for serialization
  
             beginDt310GcmissFeeInd = getStartOffset() + 101;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt310CcCounter = -1;
     public boolean isDt310CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt310CcCounter != sharedCounter;
         localDt310CcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_310_CC_LEN = 1;
	/**
	 * 	serialize this Dt310Cc
	 */
   protected void serializeDt310Cc(char[] dt310Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt310Cc,0,getStringValue(),beginDt310Cc,DT_310_CC_LEN);
       localDt310CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt310CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt310Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt310Cc() {	 
   		return (substring(getStringValue(),beginDt310Cc,beginDt310Cc + DT_310_CC_LEN));
   	}
     int localDt310IcaCounter = -1;
     public boolean isDt310IcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt310IcaCounter != sharedCounter;
         localDt310IcaCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_310_ICA_LEN = 6;
	/**
	 * 	serialize this Dt310Ica
	 */
   protected void serializeDt310Ica(char[] dt310Ica) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt310Ica,0,getStringValue(),beginDt310Ica,DT_310_ICA_LEN);
       localDt310IcaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt310IcaConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshDt310Ica is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt310Ica() {	 
   		return (substring(getStringValue(),beginDt310Ica,beginDt310Ica + DT_310_ICA_LEN));
   	}
     int localDt310GcmacqNetAmtCounter = -1;
     public boolean isDt310GcmacqNetAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt310GcmacqNetAmtCounter != sharedCounter;
         localDt310GcmacqNetAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_310_GCMACQ_NET_AMT_LEN = 18;
	/**
	 * 	serialize this Dt310GcmacqNetAmt
	 */
   protected void serializeDt310GcmacqNetAmt(char[] dt310GcmacqNetAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt310GcmacqNetAmt,0,getStringValue(),beginDt310GcmacqNetAmt,DT_310_GCMACQ_NET_AMT_LEN);
       localDt310GcmacqNetAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt310GcmacqNetAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt310GcmacqNetAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt310GcmacqNetAmt() {	 
   		return (substring(getStringValue(),beginDt310GcmacqNetAmt,beginDt310GcmacqNetAmt + DT_310_GCMACQ_NET_AMT_LEN));
   	}
     int localDt310GcmacqIndCounter = -1;
     public boolean isDt310GcmacqIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt310GcmacqIndCounter != sharedCounter;
         localDt310GcmacqIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_310_GCMACQ_IND_LEN = 2;
	/**
	 * 	serialize this Dt310GcmacqInd
	 */
   protected void serializeDt310GcmacqInd(char[] dt310GcmacqInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt310GcmacqInd,0,getStringValue(),beginDt310GcmacqInd,DT_310_GCMACQ_IND_LEN);
       localDt310GcmacqIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt310GcmacqIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt310GcmacqInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt310GcmacqInd() {	 
   		return (substring(getStringValue(),beginDt310GcmacqInd,beginDt310GcmacqInd + DT_310_GCMACQ_IND_LEN));
   	}
     int localDt310GcmacqFeeAmtCounter = -1;
     public boolean isDt310GcmacqFeeAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt310GcmacqFeeAmtCounter != sharedCounter;
         localDt310GcmacqFeeAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_310_GCMACQ_FEE_AMT_LEN = 16;
	/**
	 * 	serialize this Dt310GcmacqFeeAmt
	 */
   protected void serializeDt310GcmacqFeeAmt(char[] dt310GcmacqFeeAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt310GcmacqFeeAmt,0,getStringValue(),beginDt310GcmacqFeeAmt,DT_310_GCMACQ_FEE_AMT_LEN);
       localDt310GcmacqFeeAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt310GcmacqFeeAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshDt310GcmacqFeeAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt310GcmacqFeeAmt() {	 
   		return (substring(getStringValue(),beginDt310GcmacqFeeAmt,beginDt310GcmacqFeeAmt + DT_310_GCMACQ_FEE_AMT_LEN));
   	}
     int localDt310GcmacqFeeIndCounter = -1;
     public boolean isDt310GcmacqFeeIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt310GcmacqFeeIndCounter != sharedCounter;
         localDt310GcmacqFeeIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_310_GCMACQ_FEE_IND_LEN = 2;
	/**
	 * 	serialize this Dt310GcmacqFeeInd
	 */
   protected void serializeDt310GcmacqFeeInd(char[] dt310GcmacqFeeInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt310GcmacqFeeInd,0,getStringValue(),beginDt310GcmacqFeeInd,DT_310_GCMACQ_FEE_IND_LEN);
       localDt310GcmacqFeeIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt310GcmacqFeeIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt310GcmacqFeeInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt310GcmacqFeeInd() {	 
   		return (substring(getStringValue(),beginDt310GcmacqFeeInd,beginDt310GcmacqFeeInd + DT_310_GCMACQ_FEE_IND_LEN));
   	}
     int localDt310GcmissNetAmtCounter = -1;
     public boolean isDt310GcmissNetAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt310GcmissNetAmtCounter != sharedCounter;
         localDt310GcmissNetAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_310_GCMISS_NET_AMT_LEN = 18;
	/**
	 * 	serialize this Dt310GcmissNetAmt
	 */
   protected void serializeDt310GcmissNetAmt(char[] dt310GcmissNetAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt310GcmissNetAmt,0,getStringValue(),beginDt310GcmissNetAmt,DT_310_GCMISS_NET_AMT_LEN);
       localDt310GcmissNetAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt310GcmissNetAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt310GcmissNetAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt310GcmissNetAmt() {	 
   		return (substring(getStringValue(),beginDt310GcmissNetAmt,beginDt310GcmissNetAmt + DT_310_GCMISS_NET_AMT_LEN));
   	}
     int localDt310GcmissIndCounter = -1;
     public boolean isDt310GcmissIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt310GcmissIndCounter != sharedCounter;
         localDt310GcmissIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_310_GCMISS_IND_LEN = 2;
	/**
	 * 	serialize this Dt310GcmissInd
	 */
   protected void serializeDt310GcmissInd(char[] dt310GcmissInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt310GcmissInd,0,getStringValue(),beginDt310GcmissInd,DT_310_GCMISS_IND_LEN);
       localDt310GcmissIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt310GcmissIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt310GcmissInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt310GcmissInd() {	 
   		return (substring(getStringValue(),beginDt310GcmissInd,beginDt310GcmissInd + DT_310_GCMISS_IND_LEN));
   	}
     int localDt310GcmissFeeAmtCounter = -1;
     public boolean isDt310GcmissFeeAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt310GcmissFeeAmtCounter != sharedCounter;
         localDt310GcmissFeeAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_310_GCMISS_FEE_AMT_LEN = 16;
	/**
	 * 	serialize this Dt310GcmissFeeAmt
	 */
   protected void serializeDt310GcmissFeeAmt(char[] dt310GcmissFeeAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt310GcmissFeeAmt,0,getStringValue(),beginDt310GcmissFeeAmt,DT_310_GCMISS_FEE_AMT_LEN);
       localDt310GcmissFeeAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt310GcmissFeeAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshDt310GcmissFeeAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt310GcmissFeeAmt() {	 
   		return (substring(getStringValue(),beginDt310GcmissFeeAmt,beginDt310GcmissFeeAmt + DT_310_GCMISS_FEE_AMT_LEN));
   	}
     int localDt310GcmissFeeIndCounter = -1;
     public boolean isDt310GcmissFeeIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt310GcmissFeeIndCounter != sharedCounter;
         localDt310GcmissFeeIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_310_GCMISS_FEE_IND_LEN = 2;
	/**
	 * 	serialize this Dt310GcmissFeeInd
	 */
   protected void serializeDt310GcmissFeeInd(char[] dt310GcmissFeeInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt310GcmissFeeInd,0,getStringValue(),beginDt310GcmissFeeInd,DT_310_GCMISS_FEE_IND_LEN);
       localDt310GcmissFeeIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt310GcmissFeeIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt310GcmissFeeInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt310GcmissFeeInd() {	 
   		return (substring(getStringValue(),beginDt310GcmissFeeInd,beginDt310GcmissFeeInd + DT_310_GCMISS_FEE_IND_LEN));
   	}




}
  

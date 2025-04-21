package com.cloudframe.app.cpsc4.dto.serialize;

/**
*  The class RsrchDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RsrchDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RsrchDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RSRCH_DATA_LENGTH = 36;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCusipOrSmaId;
            protected  int beginFiller1Ws;
            protected  int beginProdInvstObjCd;
            protected  int beginFiller2Ws;
            protected  int beginProdInvstAllocPct;
            protected  int beginFiller3Ws;
            protected  int beginProdMinTrgtDriftPct;
            protected  int beginFiller4Ws;
            protected  int beginProdMaxTrgtDriftPct;
            protected  int beginFiller5Ws;
	
	/**
	* Constructor for RsrchDataSerialized
	**/
    public RsrchDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RsrchDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RsrchDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RsrchDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this RsrchDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in RsrchDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RSRCH_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCusipOrSmaId = getStartOffset() + 0;	// set offset for serialization
  
             beginFiller1Ws = getStartOffset() + 9;	// set offset for serialization
  
             beginProdInvstObjCd = getStartOffset() + 10;	// set offset for serialization
  
             beginFiller2Ws = getStartOffset() + 11;	// set offset for serialization
  
             beginProdInvstAllocPct = getStartOffset() + 12;	// set offset for serialization
  
             beginFiller3Ws = getStartOffset() + 19;	// set offset for serialization
  
             beginProdMinTrgtDriftPct = getStartOffset() + 20;	// set offset for serialization
  
             beginFiller4Ws = getStartOffset() + 27;	// set offset for serialization
  
             beginProdMaxTrgtDriftPct = getStartOffset() + 28;	// set offset for serialization
  
             beginFiller5Ws = getStartOffset() + 35;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCusipOrSmaIdCounter = -1;
     public boolean isCusipOrSmaIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCusipOrSmaIdCounter != sharedCounter;
         localCusipOrSmaIdCounter = sharedCounter; return hasModified;
     }
	protected static final int CUSIP_OR_SMA_ID_LEN = 9;
	/**
	 * 	serialize this CusipOrSmaId
	 */
   protected void serializeCusipOrSmaId(char[] cusipOrSmaId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cusipOrSmaId,0,getStringValue(),beginCusipOrSmaId,CUSIP_OR_SMA_ID_LEN);
       localCusipOrSmaIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCusipOrSmaIdConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshCusipOrSmaId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCusipOrSmaId() {	 
   		return (substring(getStringValue(),beginCusipOrSmaId,beginCusipOrSmaId + CUSIP_OR_SMA_ID_LEN));
   	}
     int localFiller1WsCounter = -1;
     public boolean isFiller1WsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller1WsCounter != sharedCounter;
         localFiller1WsCounter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_1_WS_LEN = 1;
	/**
	 * 	serialize this Filler1Ws
	 */
   protected void serializeFiller1Ws(char[] filler1Ws) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler1Ws,0,getStringValue(),beginFiller1Ws,FILLER_1_WS_LEN);
       localFiller1WsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller1WsConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFiller1Ws is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller1Ws() {	 
   		return (substring(getStringValue(),beginFiller1Ws,beginFiller1Ws + FILLER_1_WS_LEN));
   	}
     int localProdInvstObjCdCounter = -1;
     public boolean isProdInvstObjCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProdInvstObjCdCounter != sharedCounter;
         localProdInvstObjCdCounter = sharedCounter; return hasModified;
     }
	protected static final int PROD_INVST_OBJ_CD_LEN = 1;
	/**
	 * 	serialize this ProdInvstObjCd
	 */
   protected void serializeProdInvstObjCd(char[] prodInvstObjCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prodInvstObjCd,0,getStringValue(),beginProdInvstObjCd,PROD_INVST_OBJ_CD_LEN);
       localProdInvstObjCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkProdInvstObjCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshProdInvstObjCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshProdInvstObjCd() {	 
   		return (substring(getStringValue(),beginProdInvstObjCd,beginProdInvstObjCd + PROD_INVST_OBJ_CD_LEN));
   	}
     int localFiller2WsCounter = -1;
     public boolean isFiller2WsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller2WsCounter != sharedCounter;
         localFiller2WsCounter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_2_WS_LEN = 1;
	/**
	 * 	serialize this Filler2Ws
	 */
   protected void serializeFiller2Ws(char[] filler2Ws) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler2Ws,0,getStringValue(),beginFiller2Ws,FILLER_2_WS_LEN);
       localFiller2WsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller2WsConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFiller2Ws is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller2Ws() {	 
   		return (substring(getStringValue(),beginFiller2Ws,beginFiller2Ws + FILLER_2_WS_LEN));
   	}
     int localProdInvstAllocPctCounter = -1;
     public boolean isProdInvstAllocPctModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProdInvstAllocPctCounter != sharedCounter;
         localProdInvstAllocPctCounter = sharedCounter; return hasModified;
     }
	protected static final int PROD_INVST_ALLOC_PCT_LEN = 7;
	/**
	 * 	serialize this ProdInvstAllocPct
	 */
   protected void serializeProdInvstAllocPct(char[] prodInvstAllocPct) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prodInvstAllocPct,0,getStringValue(),beginProdInvstAllocPct,PROD_INVST_ALLOC_PCT_LEN);
       localProdInvstAllocPctCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkProdInvstAllocPctConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshProdInvstAllocPct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshProdInvstAllocPct() {	 
   		return (substring(getStringValue(),beginProdInvstAllocPct,beginProdInvstAllocPct + PROD_INVST_ALLOC_PCT_LEN));
   	}
     int localFiller3WsCounter = -1;
     public boolean isFiller3WsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller3WsCounter != sharedCounter;
         localFiller3WsCounter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_3_WS_LEN = 1;
	/**
	 * 	serialize this Filler3Ws
	 */
   protected void serializeFiller3Ws(char[] filler3Ws) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler3Ws,0,getStringValue(),beginFiller3Ws,FILLER_3_WS_LEN);
       localFiller3WsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller3WsConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFiller3Ws is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller3Ws() {	 
   		return (substring(getStringValue(),beginFiller3Ws,beginFiller3Ws + FILLER_3_WS_LEN));
   	}
     int localProdMinTrgtDriftPctCounter = -1;
     public boolean isProdMinTrgtDriftPctModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProdMinTrgtDriftPctCounter != sharedCounter;
         localProdMinTrgtDriftPctCounter = sharedCounter; return hasModified;
     }
	protected static final int PROD_MIN_TRGT_DRIFT_PCT_LEN = 7;
	/**
	 * 	serialize this ProdMinTrgtDriftPct
	 */
   protected void serializeProdMinTrgtDriftPct(char[] prodMinTrgtDriftPct) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prodMinTrgtDriftPct,0,getStringValue(),beginProdMinTrgtDriftPct,PROD_MIN_TRGT_DRIFT_PCT_LEN);
       localProdMinTrgtDriftPctCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkProdMinTrgtDriftPctConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshProdMinTrgtDriftPct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshProdMinTrgtDriftPct() {	 
   		return (substring(getStringValue(),beginProdMinTrgtDriftPct,beginProdMinTrgtDriftPct + PROD_MIN_TRGT_DRIFT_PCT_LEN));
   	}
     int localFiller4WsCounter = -1;
     public boolean isFiller4WsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller4WsCounter != sharedCounter;
         localFiller4WsCounter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_4_WS_LEN = 1;
	/**
	 * 	serialize this Filler4Ws
	 */
   protected void serializeFiller4Ws(char[] filler4Ws) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler4Ws,0,getStringValue(),beginFiller4Ws,FILLER_4_WS_LEN);
       localFiller4WsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller4WsConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFiller4Ws is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller4Ws() {	 
   		return (substring(getStringValue(),beginFiller4Ws,beginFiller4Ws + FILLER_4_WS_LEN));
   	}
     int localProdMaxTrgtDriftPctCounter = -1;
     public boolean isProdMaxTrgtDriftPctModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProdMaxTrgtDriftPctCounter != sharedCounter;
         localProdMaxTrgtDriftPctCounter = sharedCounter; return hasModified;
     }
	protected static final int PROD_MAX_TRGT_DRIFT_PCT_LEN = 7;
	/**
	 * 	serialize this ProdMaxTrgtDriftPct
	 */
   protected void serializeProdMaxTrgtDriftPct(char[] prodMaxTrgtDriftPct) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prodMaxTrgtDriftPct,0,getStringValue(),beginProdMaxTrgtDriftPct,PROD_MAX_TRGT_DRIFT_PCT_LEN);
       localProdMaxTrgtDriftPctCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkProdMaxTrgtDriftPctConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshProdMaxTrgtDriftPct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshProdMaxTrgtDriftPct() {	 
   		return (substring(getStringValue(),beginProdMaxTrgtDriftPct,beginProdMaxTrgtDriftPct + PROD_MAX_TRGT_DRIFT_PCT_LEN));
   	}
     int localFiller5WsCounter = -1;
     public boolean isFiller5WsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller5WsCounter != sharedCounter;
         localFiller5WsCounter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_5_WS_LEN = 1;
	/**
	 * 	serialize this Filler5Ws
	 */
   protected void serializeFiller5Ws(char[] filler5Ws) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler5Ws,0,getStringValue(),beginFiller5Ws,FILLER_5_WS_LEN);
       localFiller5WsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller5WsConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFiller5Ws is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller5Ws() {	 
   		return (substring(getStringValue(),beginFiller5Ws,beginFiller5Ws + FILLER_5_WS_LEN));
   	}




}
  

package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WvExtrDetailsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WvExtrDetailsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WvExtrDetailsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WV_EXTR_DETAILS_LENGTH = 624;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWvExtrParcel;
            protected  int beginWvExtrCounterparty;
            protected  int beginWvExtrOwner;
            protected  int beginWvExtrLoadDateFrom;
            protected  int beginWvExtrLoadDateTo;
            protected  int beginWvExtrDiscDateFrom;
            protected  int beginWvExtrDiscDateTo;
            protected  int beginWvExtrSettlementDate;
            protected  int beginWvExtrSettlementOride;
            protected  int beginWvExtrBlDate;
            protected  int beginWvExtrDcDate;
            protected  int beginWvExtrLatestPriceDate;
            protected  int beginWvExtrOperator;
            protected  int beginWvExtrUnitCode;
            protected  int beginWvExtrSettleTerms1;
            protected  int beginWvExtrSettleTerms2;
            protected  int beginWvExtrEarlyLate;
            protected  int beginWvExtrInvoiced;
            protected  int beginWvExtrBuySell;
            protected  int beginWvExtrGrade;
            protected  int beginWvExtrTerms;
            protected  int beginWvExtrVessel;
            protected  int beginWvExtrLdgNorDate;
            protected  int beginWvExtrLdgNorTime;
            protected  int beginWvExtrDchNorDate;
            protected  int beginWvExtrDchNorTime;
            protected  int beginWvExtrSapDocCode;
            protected  int beginWvExtrSetlCurr;
            protected  int beginWvExtrLcStatus;
            protected  int beginWvExtrSancStatus;
            protected  int beginWvExtrCalcWork;
            protected  int beginWvExtrStiFlag;
            protected  int beginWvExtrMethod;
            protected  int beginWvExtrPrclNote;
            protected  int beginWvExtrSendToGsap;
            protected  int beginWvExtrLinkedFrom;
            protected  int beginWvExtrSecToShell;
            protected  int beginWvExtrInvoiceQty;
            protected  int beginWvExtrInvoiceUnit;
            protected  int beginWvExtrLloydsNum;
            protected  int beginWvExtrFrmlName;
            protected  int beginWvExtrFrmlVers;
            protected  int beginWvExtrLoadPort;
            protected  int beginWvExtrDiscPort;
	
	/**
	* Constructor for WvExtrDetailsSerialized
	**/
    public WvExtrDetailsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WvExtrDetailsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrDetailsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WvExtrDetailsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this WvExtrDetailsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in WvExtrDetailsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WV_EXTR_DETAILS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWvExtrParcel = getStartOffset() + 0;	// set offset for serialization
  
  
             beginWvExtrCounterparty = getStartOffset() + 9;	// set offset for serialization
  
  
             beginWvExtrOwner = getStartOffset() + 19;	// set offset for serialization
  
  
             beginWvExtrLoadDateFrom = getStartOffset() + 29;	// set offset for serialization
  
  
             beginWvExtrLoadDateTo = getStartOffset() + 40;	// set offset for serialization
  
  
             beginWvExtrDiscDateFrom = getStartOffset() + 51;	// set offset for serialization
  
  
             beginWvExtrDiscDateTo = getStartOffset() + 62;	// set offset for serialization
  
  
             beginWvExtrSettlementDate = getStartOffset() + 73;	// set offset for serialization
  
  
             beginWvExtrSettlementOride = getStartOffset() + 84;	// set offset for serialization
  
  
  
  
             beginWvExtrBlDate = getStartOffset() + 99;	// set offset for serialization
  
  
             beginWvExtrDcDate = getStartOffset() + 110;	// set offset for serialization
  
  
             beginWvExtrLatestPriceDate = getStartOffset() + 121;	// set offset for serialization
  
  
             beginWvExtrOperator = getStartOffset() + 132;	// set offset for serialization
  
  
  
  
             beginWvExtrUnitCode = getStartOffset() + 152;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
             beginWvExtrSettleTerms1 = getStartOffset() + 212;	// set offset for serialization
  
  
             beginWvExtrSettleTerms2 = getStartOffset() + 219;	// set offset for serialization
  
  
             beginWvExtrEarlyLate = getStartOffset() + 226;	// set offset for serialization
  
  
             beginWvExtrInvoiced = getStartOffset() + 228;	// set offset for serialization
  
  
             beginWvExtrBuySell = getStartOffset() + 230;	// set offset for serialization
  
  
             beginWvExtrGrade = getStartOffset() + 232;	// set offset for serialization
  
  
             beginWvExtrTerms = getStartOffset() + 238;	// set offset for serialization
  
  
             beginWvExtrVessel = getStartOffset() + 244;	// set offset for serialization
  
  
             beginWvExtrLdgNorDate = getStartOffset() + 320;	// set offset for serialization
  
  
             beginWvExtrLdgNorTime = getStartOffset() + 331;	// set offset for serialization
  
  
             beginWvExtrDchNorDate = getStartOffset() + 337;	// set offset for serialization
  
  
             beginWvExtrDchNorTime = getStartOffset() + 348;	// set offset for serialization
  
  
             beginWvExtrSapDocCode = getStartOffset() + 354;	// set offset for serialization
  
  
             beginWvExtrSetlCurr = getStartOffset() + 365;	// set offset for serialization
  
  
             beginWvExtrLcStatus = getStartOffset() + 369;	// set offset for serialization
  
  
             beginWvExtrSancStatus = getStartOffset() + 371;	// set offset for serialization
  
  
             beginWvExtrCalcWork = getStartOffset() + 375;	// set offset for serialization
  
  
  
  
  
  
             beginWvExtrStiFlag = getStartOffset() + 403;	// set offset for serialization
  
  
             beginWvExtrMethod = getStartOffset() + 405;	// set offset for serialization
  
  
             beginWvExtrPrclNote = getStartOffset() + 408;	// set offset for serialization
  
  
             beginWvExtrSendToGsap = getStartOffset() + 410;	// set offset for serialization
  
  
             beginWvExtrLinkedFrom = getStartOffset() + 412;	// set offset for serialization
  
  
             beginWvExtrSecToShell = getStartOffset() + 423;	// set offset for serialization
  
  
             beginWvExtrInvoiceQty = getStartOffset() + 429;	// set offset for serialization
  
  
             beginWvExtrInvoiceUnit = getStartOffset() + 442;	// set offset for serialization
  
  
             beginWvExtrLloydsNum = getStartOffset() + 446;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginWvExtrFrmlName = getStartOffset() + 584;	// set offset for serialization
  
  
             beginWvExtrFrmlVers = getStartOffset() + 600;	// set offset for serialization
  
  
             beginWvExtrLoadPort = getStartOffset() + 603;	// set offset for serialization
  
  
             beginWvExtrDiscPort = getStartOffset() + 614;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWvExtrParcelCounter = -1;
     public boolean isWvExtrParcelModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrParcelCounter != sharedCounter;
         localWvExtrParcelCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_PARCEL_LEN = 8;
	/**
	 * 	serialize this WvExtrParcel
	 */
   protected void serializeWvExtrParcel(char[] wvExtrParcel) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrParcel,0,getStringValue(),beginWvExtrParcel,WV_EXTR_PARCEL_LEN);
       localWvExtrParcelCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrParcelConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshWvExtrParcel is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrParcel() {	 
   		return (substring(getStringValue(),beginWvExtrParcel,beginWvExtrParcel + WV_EXTR_PARCEL_LEN));
   	}
     int localWvExtrCounterpartyCounter = -1;
     public boolean isWvExtrCounterpartyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrCounterpartyCounter != sharedCounter;
         localWvExtrCounterpartyCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_COUNTERPARTY_LEN = 9;
	/**
	 * 	serialize this WvExtrCounterparty
	 */
   protected void serializeWvExtrCounterparty(char[] wvExtrCounterparty) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrCounterparty,0,getStringValue(),beginWvExtrCounterparty,WV_EXTR_COUNTERPARTY_LEN);
       localWvExtrCounterpartyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrCounterpartyConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshWvExtrCounterparty is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrCounterparty() {	 
   		return (substring(getStringValue(),beginWvExtrCounterparty,beginWvExtrCounterparty + WV_EXTR_COUNTERPARTY_LEN));
   	}
     int localWvExtrOwnerCounter = -1;
     public boolean isWvExtrOwnerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrOwnerCounter != sharedCounter;
         localWvExtrOwnerCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_OWNER_LEN = 9;
	/**
	 * 	serialize this WvExtrOwner
	 */
   protected void serializeWvExtrOwner(char[] wvExtrOwner) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrOwner,0,getStringValue(),beginWvExtrOwner,WV_EXTR_OWNER_LEN);
       localWvExtrOwnerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrOwnerConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshWvExtrOwner is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrOwner() {	 
   		return (substring(getStringValue(),beginWvExtrOwner,beginWvExtrOwner + WV_EXTR_OWNER_LEN));
   	}
     int localWvExtrLoadDateFromCounter = -1;
     public boolean isWvExtrLoadDateFromModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrLoadDateFromCounter != sharedCounter;
         localWvExtrLoadDateFromCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_LOAD_DATE_FROM_LEN = 10;
	/**
	 * 	serialize this WvExtrLoadDateFrom
	 */
   protected void serializeWvExtrLoadDateFrom(char[] wvExtrLoadDateFrom) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrLoadDateFrom,0,getStringValue(),beginWvExtrLoadDateFrom,WV_EXTR_LOAD_DATE_FROM_LEN);
       localWvExtrLoadDateFromCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrLoadDateFromConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWvExtrLoadDateFrom is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrLoadDateFrom() {	 
   		return (substring(getStringValue(),beginWvExtrLoadDateFrom,beginWvExtrLoadDateFrom + WV_EXTR_LOAD_DATE_FROM_LEN));
   	}
     int localWvExtrLoadDateToCounter = -1;
     public boolean isWvExtrLoadDateToModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrLoadDateToCounter != sharedCounter;
         localWvExtrLoadDateToCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_LOAD_DATE_TO_LEN = 10;
	/**
	 * 	serialize this WvExtrLoadDateTo
	 */
   protected void serializeWvExtrLoadDateTo(char[] wvExtrLoadDateTo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrLoadDateTo,0,getStringValue(),beginWvExtrLoadDateTo,WV_EXTR_LOAD_DATE_TO_LEN);
       localWvExtrLoadDateToCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrLoadDateToConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWvExtrLoadDateTo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrLoadDateTo() {	 
   		return (substring(getStringValue(),beginWvExtrLoadDateTo,beginWvExtrLoadDateTo + WV_EXTR_LOAD_DATE_TO_LEN));
   	}
     int localWvExtrDiscDateFromCounter = -1;
     public boolean isWvExtrDiscDateFromModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrDiscDateFromCounter != sharedCounter;
         localWvExtrDiscDateFromCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_DISC_DATE_FROM_LEN = 10;
	/**
	 * 	serialize this WvExtrDiscDateFrom
	 */
   protected void serializeWvExtrDiscDateFrom(char[] wvExtrDiscDateFrom) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrDiscDateFrom,0,getStringValue(),beginWvExtrDiscDateFrom,WV_EXTR_DISC_DATE_FROM_LEN);
       localWvExtrDiscDateFromCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrDiscDateFromConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWvExtrDiscDateFrom is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrDiscDateFrom() {	 
   		return (substring(getStringValue(),beginWvExtrDiscDateFrom,beginWvExtrDiscDateFrom + WV_EXTR_DISC_DATE_FROM_LEN));
   	}
     int localWvExtrDiscDateToCounter = -1;
     public boolean isWvExtrDiscDateToModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrDiscDateToCounter != sharedCounter;
         localWvExtrDiscDateToCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_DISC_DATE_TO_LEN = 10;
	/**
	 * 	serialize this WvExtrDiscDateTo
	 */
   protected void serializeWvExtrDiscDateTo(char[] wvExtrDiscDateTo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrDiscDateTo,0,getStringValue(),beginWvExtrDiscDateTo,WV_EXTR_DISC_DATE_TO_LEN);
       localWvExtrDiscDateToCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrDiscDateToConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWvExtrDiscDateTo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrDiscDateTo() {	 
   		return (substring(getStringValue(),beginWvExtrDiscDateTo,beginWvExtrDiscDateTo + WV_EXTR_DISC_DATE_TO_LEN));
   	}
     int localWvExtrSettlementDateCounter = -1;
     public boolean isWvExtrSettlementDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrSettlementDateCounter != sharedCounter;
         localWvExtrSettlementDateCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_SETTLEMENT_DATE_LEN = 10;
	/**
	 * 	serialize this WvExtrSettlementDate
	 */
   protected void serializeWvExtrSettlementDate(char[] wvExtrSettlementDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrSettlementDate,0,getStringValue(),beginWvExtrSettlementDate,WV_EXTR_SETTLEMENT_DATE_LEN);
       localWvExtrSettlementDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrSettlementDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWvExtrSettlementDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrSettlementDate() {	 
   		return (substring(getStringValue(),beginWvExtrSettlementDate,beginWvExtrSettlementDate + WV_EXTR_SETTLEMENT_DATE_LEN));
   	}
     int localWvExtrSettlementOrideCounter = -1;
     public boolean isWvExtrSettlementOrideModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrSettlementOrideCounter != sharedCounter;
         localWvExtrSettlementOrideCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_SETTLEMENT_ORIDE_LEN = 1;
	/**
	 * 	serialize this WvExtrSettlementOride
	 */
   protected void serializeWvExtrSettlementOride(char[] wvExtrSettlementOride) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrSettlementOride,0,getStringValue(),beginWvExtrSettlementOride,WV_EXTR_SETTLEMENT_ORIDE_LEN);
       localWvExtrSettlementOrideCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrSettlementOrideConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWvExtrSettlementOride is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrSettlementOride() {	 
   		return (substring(getStringValue(),beginWvExtrSettlementOride,beginWvExtrSettlementOride + WV_EXTR_SETTLEMENT_ORIDE_LEN));
   	}
     int localWvExtrBlDateCounter = -1;
     public boolean isWvExtrBlDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrBlDateCounter != sharedCounter;
         localWvExtrBlDateCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_BL_DATE_LEN = 10;
	/**
	 * 	serialize this WvExtrBlDate
	 */
   protected void serializeWvExtrBlDate(char[] wvExtrBlDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrBlDate,0,getStringValue(),beginWvExtrBlDate,WV_EXTR_BL_DATE_LEN);
       localWvExtrBlDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrBlDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWvExtrBlDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrBlDate() {	 
   		return (substring(getStringValue(),beginWvExtrBlDate,beginWvExtrBlDate + WV_EXTR_BL_DATE_LEN));
   	}
     int localWvExtrDcDateCounter = -1;
     public boolean isWvExtrDcDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrDcDateCounter != sharedCounter;
         localWvExtrDcDateCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_DC_DATE_LEN = 10;
	/**
	 * 	serialize this WvExtrDcDate
	 */
   protected void serializeWvExtrDcDate(char[] wvExtrDcDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrDcDate,0,getStringValue(),beginWvExtrDcDate,WV_EXTR_DC_DATE_LEN);
       localWvExtrDcDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrDcDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWvExtrDcDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrDcDate() {	 
   		return (substring(getStringValue(),beginWvExtrDcDate,beginWvExtrDcDate + WV_EXTR_DC_DATE_LEN));
   	}
     int localWvExtrLatestPriceDateCounter = -1;
     public boolean isWvExtrLatestPriceDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrLatestPriceDateCounter != sharedCounter;
         localWvExtrLatestPriceDateCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_LATEST_PRICE_DATE_LEN = 10;
	/**
	 * 	serialize this WvExtrLatestPriceDate
	 */
   protected void serializeWvExtrLatestPriceDate(char[] wvExtrLatestPriceDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrLatestPriceDate,0,getStringValue(),beginWvExtrLatestPriceDate,WV_EXTR_LATEST_PRICE_DATE_LEN);
       localWvExtrLatestPriceDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrLatestPriceDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWvExtrLatestPriceDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrLatestPriceDate() {	 
   		return (substring(getStringValue(),beginWvExtrLatestPriceDate,beginWvExtrLatestPriceDate + WV_EXTR_LATEST_PRICE_DATE_LEN));
   	}
     int localWvExtrOperatorCounter = -1;
     public boolean isWvExtrOperatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrOperatorCounter != sharedCounter;
         localWvExtrOperatorCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_OPERATOR_LEN = 9;
	/**
	 * 	serialize this WvExtrOperator
	 */
   protected void serializeWvExtrOperator(char[] wvExtrOperator) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrOperator,0,getStringValue(),beginWvExtrOperator,WV_EXTR_OPERATOR_LEN);
       localWvExtrOperatorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrOperatorConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshWvExtrOperator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrOperator() {	 
   		return (substring(getStringValue(),beginWvExtrOperator,beginWvExtrOperator + WV_EXTR_OPERATOR_LEN));
   	}
     int localWvExtrUnitCodeCounter = -1;
     public boolean isWvExtrUnitCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrUnitCodeCounter != sharedCounter;
         localWvExtrUnitCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_UNIT_CODE_LEN = 3;
	/**
	 * 	serialize this WvExtrUnitCode
	 */
   protected void serializeWvExtrUnitCode(char[] wvExtrUnitCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrUnitCode,0,getStringValue(),beginWvExtrUnitCode,WV_EXTR_UNIT_CODE_LEN);
       localWvExtrUnitCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrUnitCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshWvExtrUnitCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrUnitCode() {	 
   		return (substring(getStringValue(),beginWvExtrUnitCode,beginWvExtrUnitCode + WV_EXTR_UNIT_CODE_LEN));
   	}
     int localWvExtrSettleTerms1Counter = -1;
     public boolean isWvExtrSettleTerms1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrSettleTerms1Counter != sharedCounter;
         localWvExtrSettleTerms1Counter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_SETTLE_TERMS_1_LEN = 6;
	/**
	 * 	serialize this WvExtrSettleTerms1
	 */
   protected void serializeWvExtrSettleTerms1(char[] wvExtrSettleTerms1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrSettleTerms1,0,getStringValue(),beginWvExtrSettleTerms1,WV_EXTR_SETTLE_TERMS_1_LEN);
       localWvExtrSettleTerms1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrSettleTerms1Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshWvExtrSettleTerms1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrSettleTerms1() {	 
   		return (substring(getStringValue(),beginWvExtrSettleTerms1,beginWvExtrSettleTerms1 + WV_EXTR_SETTLE_TERMS_1_LEN));
   	}
     int localWvExtrSettleTerms2Counter = -1;
     public boolean isWvExtrSettleTerms2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrSettleTerms2Counter != sharedCounter;
         localWvExtrSettleTerms2Counter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_SETTLE_TERMS_2_LEN = 6;
	/**
	 * 	serialize this WvExtrSettleTerms2
	 */
   protected void serializeWvExtrSettleTerms2(char[] wvExtrSettleTerms2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrSettleTerms2,0,getStringValue(),beginWvExtrSettleTerms2,WV_EXTR_SETTLE_TERMS_2_LEN);
       localWvExtrSettleTerms2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrSettleTerms2Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshWvExtrSettleTerms2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrSettleTerms2() {	 
   		return (substring(getStringValue(),beginWvExtrSettleTerms2,beginWvExtrSettleTerms2 + WV_EXTR_SETTLE_TERMS_2_LEN));
   	}
     int localWvExtrEarlyLateCounter = -1;
     public boolean isWvExtrEarlyLateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrEarlyLateCounter != sharedCounter;
         localWvExtrEarlyLateCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_EARLY_LATE_LEN = 1;
	/**
	 * 	serialize this WvExtrEarlyLate
	 */
   protected void serializeWvExtrEarlyLate(char[] wvExtrEarlyLate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrEarlyLate,0,getStringValue(),beginWvExtrEarlyLate,WV_EXTR_EARLY_LATE_LEN);
       localWvExtrEarlyLateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrEarlyLateConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWvExtrEarlyLate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrEarlyLate() {	 
   		return (substring(getStringValue(),beginWvExtrEarlyLate,beginWvExtrEarlyLate + WV_EXTR_EARLY_LATE_LEN));
   	}
     int localWvExtrInvoicedCounter = -1;
     public boolean isWvExtrInvoicedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrInvoicedCounter != sharedCounter;
         localWvExtrInvoicedCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_INVOICED_LEN = 1;
	/**
	 * 	serialize this WvExtrInvoiced
	 */
   protected void serializeWvExtrInvoiced(char[] wvExtrInvoiced) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrInvoiced,0,getStringValue(),beginWvExtrInvoiced,WV_EXTR_INVOICED_LEN);
       localWvExtrInvoicedCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrInvoicedConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWvExtrInvoiced is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrInvoiced() {	 
   		return (substring(getStringValue(),beginWvExtrInvoiced,beginWvExtrInvoiced + WV_EXTR_INVOICED_LEN));
   	}
     int localWvExtrBuySellCounter = -1;
     public boolean isWvExtrBuySellModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrBuySellCounter != sharedCounter;
         localWvExtrBuySellCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_BUY_SELL_LEN = 1;
	/**
	 * 	serialize this WvExtrBuySell
	 */
   protected void serializeWvExtrBuySell(char[] wvExtrBuySell) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrBuySell,0,getStringValue(),beginWvExtrBuySell,WV_EXTR_BUY_SELL_LEN);
       localWvExtrBuySellCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrBuySellConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWvExtrBuySell is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrBuySell() {	 
   		return (substring(getStringValue(),beginWvExtrBuySell,beginWvExtrBuySell + WV_EXTR_BUY_SELL_LEN));
   	}
     int localWvExtrGradeCounter = -1;
     public boolean isWvExtrGradeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrGradeCounter != sharedCounter;
         localWvExtrGradeCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_GRADE_LEN = 5;
	/**
	 * 	serialize this WvExtrGrade
	 */
   protected void serializeWvExtrGrade(char[] wvExtrGrade) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrGrade,0,getStringValue(),beginWvExtrGrade,WV_EXTR_GRADE_LEN);
       localWvExtrGradeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrGradeConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshWvExtrGrade is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrGrade() {	 
   		return (substring(getStringValue(),beginWvExtrGrade,beginWvExtrGrade + WV_EXTR_GRADE_LEN));
   	}
     int localWvExtrTermsCounter = -1;
     public boolean isWvExtrTermsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrTermsCounter != sharedCounter;
         localWvExtrTermsCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_TERMS_LEN = 5;
	/**
	 * 	serialize this WvExtrTerms
	 */
   protected void serializeWvExtrTerms(char[] wvExtrTerms) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrTerms,0,getStringValue(),beginWvExtrTerms,WV_EXTR_TERMS_LEN);
       localWvExtrTermsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrTermsConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshWvExtrTerms is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrTerms() {	 
   		return (substring(getStringValue(),beginWvExtrTerms,beginWvExtrTerms + WV_EXTR_TERMS_LEN));
   	}
     int localWvExtrVesselCounter = -1;
     public boolean isWvExtrVesselModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrVesselCounter != sharedCounter;
         localWvExtrVesselCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_VESSEL_LEN = 75;
	/**
	 * 	serialize this WvExtrVessel
	 */
   protected void serializeWvExtrVessel(char[] wvExtrVessel) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrVessel,0,getStringValue(),beginWvExtrVessel,WV_EXTR_VESSEL_LEN);
       localWvExtrVesselCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrVesselConstraints(char[] value) {
   			return super.checkConstraints(value , 75 ,false, false);
   }
    /**
	 *	refreshWvExtrVessel is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrVessel() {	 
   		return (substring(getStringValue(),beginWvExtrVessel,beginWvExtrVessel + WV_EXTR_VESSEL_LEN));
   	}
     int localWvExtrLdgNorDateCounter = -1;
     public boolean isWvExtrLdgNorDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrLdgNorDateCounter != sharedCounter;
         localWvExtrLdgNorDateCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_LDG_NOR_DATE_LEN = 10;
	/**
	 * 	serialize this WvExtrLdgNorDate
	 */
   protected void serializeWvExtrLdgNorDate(char[] wvExtrLdgNorDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrLdgNorDate,0,getStringValue(),beginWvExtrLdgNorDate,WV_EXTR_LDG_NOR_DATE_LEN);
       localWvExtrLdgNorDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrLdgNorDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWvExtrLdgNorDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrLdgNorDate() {	 
   		return (substring(getStringValue(),beginWvExtrLdgNorDate,beginWvExtrLdgNorDate + WV_EXTR_LDG_NOR_DATE_LEN));
   	}
     int localWvExtrLdgNorTimeCounter = -1;
     public boolean isWvExtrLdgNorTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrLdgNorTimeCounter != sharedCounter;
         localWvExtrLdgNorTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_LDG_NOR_TIME_LEN = 5;
	/**
	 * 	serialize this WvExtrLdgNorTime
	 */
   protected void serializeWvExtrLdgNorTime(char[] wvExtrLdgNorTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrLdgNorTime,0,getStringValue(),beginWvExtrLdgNorTime,WV_EXTR_LDG_NOR_TIME_LEN);
       localWvExtrLdgNorTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrLdgNorTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshWvExtrLdgNorTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrLdgNorTime() {	 
   		return (substring(getStringValue(),beginWvExtrLdgNorTime,beginWvExtrLdgNorTime + WV_EXTR_LDG_NOR_TIME_LEN));
   	}
     int localWvExtrDchNorDateCounter = -1;
     public boolean isWvExtrDchNorDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrDchNorDateCounter != sharedCounter;
         localWvExtrDchNorDateCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_DCH_NOR_DATE_LEN = 10;
	/**
	 * 	serialize this WvExtrDchNorDate
	 */
   protected void serializeWvExtrDchNorDate(char[] wvExtrDchNorDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrDchNorDate,0,getStringValue(),beginWvExtrDchNorDate,WV_EXTR_DCH_NOR_DATE_LEN);
       localWvExtrDchNorDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrDchNorDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWvExtrDchNorDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrDchNorDate() {	 
   		return (substring(getStringValue(),beginWvExtrDchNorDate,beginWvExtrDchNorDate + WV_EXTR_DCH_NOR_DATE_LEN));
   	}
     int localWvExtrDchNorTimeCounter = -1;
     public boolean isWvExtrDchNorTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrDchNorTimeCounter != sharedCounter;
         localWvExtrDchNorTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_DCH_NOR_TIME_LEN = 5;
	/**
	 * 	serialize this WvExtrDchNorTime
	 */
   protected void serializeWvExtrDchNorTime(char[] wvExtrDchNorTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrDchNorTime,0,getStringValue(),beginWvExtrDchNorTime,WV_EXTR_DCH_NOR_TIME_LEN);
       localWvExtrDchNorTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrDchNorTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshWvExtrDchNorTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrDchNorTime() {	 
   		return (substring(getStringValue(),beginWvExtrDchNorTime,beginWvExtrDchNorTime + WV_EXTR_DCH_NOR_TIME_LEN));
   	}
     int localWvExtrSapDocCodeCounter = -1;
     public boolean isWvExtrSapDocCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrSapDocCodeCounter != sharedCounter;
         localWvExtrSapDocCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_SAP_DOC_CODE_LEN = 10;
	/**
	 * 	serialize this WvExtrSapDocCode
	 */
   protected void serializeWvExtrSapDocCode(char[] wvExtrSapDocCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrSapDocCode,0,getStringValue(),beginWvExtrSapDocCode,WV_EXTR_SAP_DOC_CODE_LEN);
       localWvExtrSapDocCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrSapDocCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWvExtrSapDocCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrSapDocCode() {	 
   		return (substring(getStringValue(),beginWvExtrSapDocCode,beginWvExtrSapDocCode + WV_EXTR_SAP_DOC_CODE_LEN));
   	}
     int localWvExtrSetlCurrCounter = -1;
     public boolean isWvExtrSetlCurrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrSetlCurrCounter != sharedCounter;
         localWvExtrSetlCurrCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_SETL_CURR_LEN = 3;
	/**
	 * 	serialize this WvExtrSetlCurr
	 */
   protected void serializeWvExtrSetlCurr(char[] wvExtrSetlCurr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrSetlCurr,0,getStringValue(),beginWvExtrSetlCurr,WV_EXTR_SETL_CURR_LEN);
       localWvExtrSetlCurrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrSetlCurrConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshWvExtrSetlCurr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrSetlCurr() {	 
   		return (substring(getStringValue(),beginWvExtrSetlCurr,beginWvExtrSetlCurr + WV_EXTR_SETL_CURR_LEN));
   	}
     int localWvExtrLcStatusCounter = -1;
     public boolean isWvExtrLcStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrLcStatusCounter != sharedCounter;
         localWvExtrLcStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_LC_STATUS_LEN = 1;
	/**
	 * 	serialize this WvExtrLcStatus
	 */
   protected void serializeWvExtrLcStatus(char[] wvExtrLcStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrLcStatus,0,getStringValue(),beginWvExtrLcStatus,WV_EXTR_LC_STATUS_LEN);
       localWvExtrLcStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrLcStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWvExtrLcStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrLcStatus() {	 
   		return (substring(getStringValue(),beginWvExtrLcStatus,beginWvExtrLcStatus + WV_EXTR_LC_STATUS_LEN));
   	}
     int localWvExtrSancStatusCounter = -1;
     public boolean isWvExtrSancStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrSancStatusCounter != sharedCounter;
         localWvExtrSancStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_SANC_STATUS_LEN = 3;
	/**
	 * 	serialize this WvExtrSancStatus
	 */
   protected void serializeWvExtrSancStatus(char[] wvExtrSancStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrSancStatus,0,getStringValue(),beginWvExtrSancStatus,WV_EXTR_SANC_STATUS_LEN);
       localWvExtrSancStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrSancStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshWvExtrSancStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrSancStatus() {	 
   		return (substring(getStringValue(),beginWvExtrSancStatus,beginWvExtrSancStatus + WV_EXTR_SANC_STATUS_LEN));
   	}
     int localWvExtrCalcWorkCounter = -1;
     public boolean isWvExtrCalcWorkModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrCalcWorkCounter != sharedCounter;
         localWvExtrCalcWorkCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_CALC_WORK_LEN = 1;
	/**
	 * 	serialize this WvExtrCalcWork
	 */
   protected void serializeWvExtrCalcWork(char[] wvExtrCalcWork) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrCalcWork,0,getStringValue(),beginWvExtrCalcWork,WV_EXTR_CALC_WORK_LEN);
       localWvExtrCalcWorkCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrCalcWorkConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWvExtrCalcWork is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrCalcWork() {	 
   		return (substring(getStringValue(),beginWvExtrCalcWork,beginWvExtrCalcWork + WV_EXTR_CALC_WORK_LEN));
   	}
     int localWvExtrStiFlagCounter = -1;
     public boolean isWvExtrStiFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrStiFlagCounter != sharedCounter;
         localWvExtrStiFlagCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_STI_FLAG_LEN = 1;
	/**
	 * 	serialize this WvExtrStiFlag
	 */
   protected void serializeWvExtrStiFlag(char[] wvExtrStiFlag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrStiFlag,0,getStringValue(),beginWvExtrStiFlag,WV_EXTR_STI_FLAG_LEN);
       localWvExtrStiFlagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrStiFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWvExtrStiFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrStiFlag() {	 
   		return (substring(getStringValue(),beginWvExtrStiFlag,beginWvExtrStiFlag + WV_EXTR_STI_FLAG_LEN));
   	}
     int localWvExtrMethodCounter = -1;
     public boolean isWvExtrMethodModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrMethodCounter != sharedCounter;
         localWvExtrMethodCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_METHOD_LEN = 2;
	/**
	 * 	serialize this WvExtrMethod
	 */
   protected void serializeWvExtrMethod(char[] wvExtrMethod) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrMethod,0,getStringValue(),beginWvExtrMethod,WV_EXTR_METHOD_LEN);
       localWvExtrMethodCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrMethodConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshWvExtrMethod is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrMethod() {	 
   		return (substring(getStringValue(),beginWvExtrMethod,beginWvExtrMethod + WV_EXTR_METHOD_LEN));
   	}
     int localWvExtrPrclNoteCounter = -1;
     public boolean isWvExtrPrclNoteModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrPrclNoteCounter != sharedCounter;
         localWvExtrPrclNoteCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_PRCL_NOTE_LEN = 1;
	/**
	 * 	serialize this WvExtrPrclNote
	 */
   protected void serializeWvExtrPrclNote(char[] wvExtrPrclNote) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrPrclNote,0,getStringValue(),beginWvExtrPrclNote,WV_EXTR_PRCL_NOTE_LEN);
       localWvExtrPrclNoteCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrPrclNoteConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWvExtrPrclNote is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrPrclNote() {	 
   		return (substring(getStringValue(),beginWvExtrPrclNote,beginWvExtrPrclNote + WV_EXTR_PRCL_NOTE_LEN));
   	}
     int localWvExtrSendToGsapCounter = -1;
     public boolean isWvExtrSendToGsapModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrSendToGsapCounter != sharedCounter;
         localWvExtrSendToGsapCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_SEND_TO_GSAP_LEN = 1;
	/**
	 * 	serialize this WvExtrSendToGsap
	 */
   protected void serializeWvExtrSendToGsap(char[] wvExtrSendToGsap) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrSendToGsap,0,getStringValue(),beginWvExtrSendToGsap,WV_EXTR_SEND_TO_GSAP_LEN);
       localWvExtrSendToGsapCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrSendToGsapConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWvExtrSendToGsap is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrSendToGsap() {	 
   		return (substring(getStringValue(),beginWvExtrSendToGsap,beginWvExtrSendToGsap + WV_EXTR_SEND_TO_GSAP_LEN));
   	}
     int localWvExtrLinkedFromCounter = -1;
     public boolean isWvExtrLinkedFromModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrLinkedFromCounter != sharedCounter;
         localWvExtrLinkedFromCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_LINKED_FROM_LEN = 10;
	/**
	 * 	serialize this WvExtrLinkedFrom
	 */
   protected void serializeWvExtrLinkedFrom(char[] wvExtrLinkedFrom) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrLinkedFrom,0,getStringValue(),beginWvExtrLinkedFrom,WV_EXTR_LINKED_FROM_LEN);
       localWvExtrLinkedFromCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrLinkedFromConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWvExtrLinkedFrom is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrLinkedFrom() {	 
   		return (substring(getStringValue(),beginWvExtrLinkedFrom,beginWvExtrLinkedFrom + WV_EXTR_LINKED_FROM_LEN));
   	}
     int localWvExtrSecToShellCounter = -1;
     public boolean isWvExtrSecToShellModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrSecToShellCounter != sharedCounter;
         localWvExtrSecToShellCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_SEC_TO_SHELL_LEN = 5;
	/**
	 * 	serialize this WvExtrSecToShell
	 */
   protected void serializeWvExtrSecToShell(char[] wvExtrSecToShell) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrSecToShell,0,getStringValue(),beginWvExtrSecToShell,WV_EXTR_SEC_TO_SHELL_LEN);
       localWvExtrSecToShellCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrSecToShellConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshWvExtrSecToShell is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrSecToShell() {	 
   		return (substring(getStringValue(),beginWvExtrSecToShell,beginWvExtrSecToShell + WV_EXTR_SEC_TO_SHELL_LEN));
   	}
     int localWvExtrInvoiceQtyCounter = -1;
     public boolean isWvExtrInvoiceQtyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrInvoiceQtyCounter != sharedCounter;
         localWvExtrInvoiceQtyCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_INVOICE_QTY_LEN = 12;
	/**
	 * 	serialize this WvExtrInvoiceQty
	 */
   protected void serializeWvExtrInvoiceQty(char[] wvExtrInvoiceQty) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrInvoiceQty,0,getStringValue(),beginWvExtrInvoiceQty,WV_EXTR_INVOICE_QTY_LEN);
       localWvExtrInvoiceQtyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrInvoiceQtyConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshWvExtrInvoiceQty is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrInvoiceQty() {	 
   		return (substring(getStringValue(),beginWvExtrInvoiceQty,beginWvExtrInvoiceQty + WV_EXTR_INVOICE_QTY_LEN));
   	}
     int localWvExtrInvoiceUnitCounter = -1;
     public boolean isWvExtrInvoiceUnitModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrInvoiceUnitCounter != sharedCounter;
         localWvExtrInvoiceUnitCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_INVOICE_UNIT_LEN = 3;
	/**
	 * 	serialize this WvExtrInvoiceUnit
	 */
   protected void serializeWvExtrInvoiceUnit(char[] wvExtrInvoiceUnit) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrInvoiceUnit,0,getStringValue(),beginWvExtrInvoiceUnit,WV_EXTR_INVOICE_UNIT_LEN);
       localWvExtrInvoiceUnitCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrInvoiceUnitConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshWvExtrInvoiceUnit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrInvoiceUnit() {	 
   		return (substring(getStringValue(),beginWvExtrInvoiceUnit,beginWvExtrInvoiceUnit + WV_EXTR_INVOICE_UNIT_LEN));
   	}
     int localWvExtrLloydsNumCounter = -1;
     public boolean isWvExtrLloydsNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrLloydsNumCounter != sharedCounter;
         localWvExtrLloydsNumCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_LLOYDS_NUM_LEN = 7;
	/**
	 * 	serialize this WvExtrLloydsNum
	 */
   protected void serializeWvExtrLloydsNum(char[] wvExtrLloydsNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrLloydsNum,0,getStringValue(),beginWvExtrLloydsNum,WV_EXTR_LLOYDS_NUM_LEN);
       localWvExtrLloydsNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrLloydsNumConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshWvExtrLloydsNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrLloydsNum() {	 
   		return (substring(getStringValue(),beginWvExtrLloydsNum,beginWvExtrLloydsNum + WV_EXTR_LLOYDS_NUM_LEN));
   	}
     int localWvExtrFrmlNameCounter = -1;
     public boolean isWvExtrFrmlNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrFrmlNameCounter != sharedCounter;
         localWvExtrFrmlNameCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_FRML_NAME_LEN = 15;
	/**
	 * 	serialize this WvExtrFrmlName
	 */
   protected void serializeWvExtrFrmlName(char[] wvExtrFrmlName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrFrmlName,0,getStringValue(),beginWvExtrFrmlName,WV_EXTR_FRML_NAME_LEN);
       localWvExtrFrmlNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrFrmlNameConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshWvExtrFrmlName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrFrmlName() {	 
   		return (substring(getStringValue(),beginWvExtrFrmlName,beginWvExtrFrmlName + WV_EXTR_FRML_NAME_LEN));
   	}
     int localWvExtrFrmlVersCounter = -1;
     public boolean isWvExtrFrmlVersModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrFrmlVersCounter != sharedCounter;
         localWvExtrFrmlVersCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_FRML_VERS_LEN = 2;
	/**
	 * 	serialize this WvExtrFrmlVers
	 */
   protected void serializeWvExtrFrmlVers(char[] wvExtrFrmlVers) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrFrmlVers,0,getStringValue(),beginWvExtrFrmlVers,WV_EXTR_FRML_VERS_LEN);
       localWvExtrFrmlVersCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrFrmlVersConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, true);
   }
    /**
	 *	refreshWvExtrFrmlVers is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrFrmlVers() {	 
   		return (substring(getStringValue(),beginWvExtrFrmlVers,beginWvExtrFrmlVers + WV_EXTR_FRML_VERS_LEN));
   	}
     int localWvExtrLoadPortCounter = -1;
     public boolean isWvExtrLoadPortModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrLoadPortCounter != sharedCounter;
         localWvExtrLoadPortCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_LOAD_PORT_LEN = 10;
	/**
	 * 	serialize this WvExtrLoadPort
	 */
   protected void serializeWvExtrLoadPort(char[] wvExtrLoadPort) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrLoadPort,0,getStringValue(),beginWvExtrLoadPort,WV_EXTR_LOAD_PORT_LEN);
       localWvExtrLoadPortCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrLoadPortConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWvExtrLoadPort is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrLoadPort() {	 
   		return (substring(getStringValue(),beginWvExtrLoadPort,beginWvExtrLoadPort + WV_EXTR_LOAD_PORT_LEN));
   	}
     int localWvExtrDiscPortCounter = -1;
     public boolean isWvExtrDiscPortModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrDiscPortCounter != sharedCounter;
         localWvExtrDiscPortCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_DISC_PORT_LEN = 10;
	/**
	 * 	serialize this WvExtrDiscPort
	 */
   protected void serializeWvExtrDiscPort(char[] wvExtrDiscPort) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrDiscPort,0,getStringValue(),beginWvExtrDiscPort,WV_EXTR_DISC_PORT_LEN);
       localWvExtrDiscPortCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrDiscPortConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWvExtrDiscPort is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrDiscPort() {	 
   		return (substring(getStringValue(),beginWvExtrDiscPort,beginWvExtrDiscPort + WV_EXTR_DISC_PORT_LEN));
   	}




}
  

package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class DclvbsscrdtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:18. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class DclvbsscrdtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DclvbsscrdtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLVBSSCRDT_LENGTH = 207;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginYieldBidPct;
            protected  int beginPutNtcMinDyQty;
            protected  int beginPutNtcMaxDyQty;
	
	/**
	* Constructor for DclvbsscrdtSerialized
	**/
    public DclvbsscrdtSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DclvbsscrdtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLVBSSCRDT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginYieldBidPct = getStartOffset() + 84;	// set offset for serialization
  
             beginPutNtcMinDyQty = getStartOffset() + 115;	// set offset for serialization
  
             beginPutNtcMaxDyQty = getStartOffset() + 117;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localYieldBidPctCounter = -1;
     public boolean isYieldBidPctModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localYieldBidPctCounter != sharedCounter;
         localYieldBidPctCounter = sharedCounter; return hasModified;          
     }
	/**
	 * 	serialize this YieldBidPct
	 */
   protected void serializeYieldBidPct(BigDecimal yieldBidPct) {	
		shareString.getSerializedField().incrementCounter();
	 	putComp2(beginYieldBidPct, yieldBidPct);
		localYieldBidPctCounter = shareString.getSerializedField().getModifiedCounter();
   }
     /**
	 *	refreshYieldBidPct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serilization as well
	 */ 
   	protected BigDecimal refreshYieldBidPct() {
	 	return getComp2(beginYieldBidPct);
	}
        int localPutNtcMinDyQtyCounter = -1;
        public boolean isPutNtcMinDyQtyModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPutNtcMinDyQtyCounter != sharedCounter;
           localPutNtcMinDyQtyCounter = sharedCounter; return hasModified; 
        }
	    public boolean putNtcMinDyQtyIsNumeric() {
	      return decimalIsNumeric(beginPutNtcMinDyQty,PUT_NTC_MIN_DY_QTY_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int PUT_NTC_MIN_DY_QTY_LEN = 2;
  	/**
	 * 	serializePutNtcMinDyQty
	 */
	protected void serializePutNtcMinDyQty(short putNtcMinDyQty) {
		   putDecimal(beginPutNtcMinDyQty,putNtcMinDyQty,PUT_NTC_MIN_DY_QTY_LEN,true);
   }
   

   protected short checkPutNtcMinDyQtyMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshPutNtcMinDyQty is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshPutNtcMinDyQty() throws CFException {	
   	try { 
		 return (getShortDecimal(beginPutNtcMinDyQty,PUT_NTC_MIN_DY_QTY_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("putNtcMinDyQty", beginPutNtcMinDyQty,PUT_NTC_MIN_DY_QTY_LEN);
     }
   	}
        int localPutNtcMaxDyQtyCounter = -1;
        public boolean isPutNtcMaxDyQtyModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPutNtcMaxDyQtyCounter != sharedCounter;
           localPutNtcMaxDyQtyCounter = sharedCounter; return hasModified; 
        }
	    public boolean putNtcMaxDyQtyIsNumeric() {
	      return decimalIsNumeric(beginPutNtcMaxDyQty,PUT_NTC_MAX_DY_QTY_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int PUT_NTC_MAX_DY_QTY_LEN = 2;
  	/**
	 * 	serializePutNtcMaxDyQty
	 */
	protected void serializePutNtcMaxDyQty(short putNtcMaxDyQty) {
		   putDecimal(beginPutNtcMaxDyQty,putNtcMaxDyQty,PUT_NTC_MAX_DY_QTY_LEN,true);
   }
   

   protected short checkPutNtcMaxDyQtyMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshPutNtcMaxDyQty is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshPutNtcMaxDyQty() throws CFException {	
   	try { 
		 return (getShortDecimal(beginPutNtcMaxDyQty,PUT_NTC_MAX_DY_QTY_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("putNtcMaxDyQty", beginPutNtcMaxDyQty,PUT_NTC_MAX_DY_QTY_LEN);
     }
   	}




}
  

package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class DetailText600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DetailText600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DetailText600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DETAIL_TEXT_600_LENGTH = 99;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPanAlias600;
            protected  int beginDonationLimt600;
            protected  int beginCalcDonationAmt600;
            protected  int beginBultDonationAmt600;
	
	/**
	* Constructor for DetailText600Serialized
	**/
    public DetailText600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DetailText600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DETAIL_TEXT_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPanAlias600 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginDonationLimt600 = getStartOffset() + 41;	// set offset for serialization
  
  
             beginCalcDonationAmt600 = getStartOffset() + 65;	// set offset for serialization
  
  
             beginBultDonationAmt600 = getStartOffset() + 84;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPanAlias600Counter = -1;
     public boolean isPanAlias600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPanAlias600Counter != sharedCounter;
         localPanAlias600Counter = sharedCounter; return hasModified;
     }
	protected static final int PAN_ALIAS_600_LEN = 36;
	/**
	 * 	serialize this PanAlias600
	 */
   protected void serializePanAlias600(char[] panAlias600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(panAlias600,0,getStringValue(),beginPanAlias600,PAN_ALIAS_600_LEN);
       localPanAlias600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPanAlias600Constraints(char[] value) {
   			return super.checkConstraints(value , 36 ,false, false);
   }
    /**
	 *	refreshPanAlias600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPanAlias600() {	 
   		return (substring(getStringValue(),beginPanAlias600,beginPanAlias600 + PAN_ALIAS_600_LEN));
   	}
     int localDonationLimt600Counter = -1;
     public boolean isDonationLimt600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDonationLimt600Counter != sharedCounter;
         localDonationLimt600Counter = sharedCounter; return hasModified;
     }
	protected static final int DONATION_LIMT_600_LEN = 10;
	/**
	 * 	serialize this DonationLimt600
	 */
   protected void serializeDonationLimt600(char[] donationLimt600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(donationLimt600,0,getStringValue(),beginDonationLimt600,DONATION_LIMT_600_LEN);
       localDonationLimt600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDonationLimt600Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDonationLimt600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDonationLimt600() {	 
   		return (substring(getStringValue(),beginDonationLimt600,beginDonationLimt600 + DONATION_LIMT_600_LEN));
   	}
     int localCalcDonationAmt600Counter = -1;
     public boolean isCalcDonationAmt600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCalcDonationAmt600Counter != sharedCounter;
         localCalcDonationAmt600Counter = sharedCounter; return hasModified;
     }
	protected static final int CALC_DONATION_AMT_600_LEN = 10;
	/**
	 * 	serialize this CalcDonationAmt600
	 */
   protected void serializeCalcDonationAmt600(char[] calcDonationAmt600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(calcDonationAmt600,0,getStringValue(),beginCalcDonationAmt600,CALC_DONATION_AMT_600_LEN);
       localCalcDonationAmt600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCalcDonationAmt600Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCalcDonationAmt600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCalcDonationAmt600() {	 
   		return (substring(getStringValue(),beginCalcDonationAmt600,beginCalcDonationAmt600 + CALC_DONATION_AMT_600_LEN));
   	}
     int localBultDonationAmt600Counter = -1;
     public boolean isBultDonationAmt600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBultDonationAmt600Counter != sharedCounter;
         localBultDonationAmt600Counter = sharedCounter; return hasModified;
     }
	protected static final int BULT_DONATION_AMT_600_LEN = 15;
	/**
	 * 	serialize this BultDonationAmt600
	 */
   protected void serializeBultDonationAmt600(char[] bultDonationAmt600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bultDonationAmt600,0,getStringValue(),beginBultDonationAmt600,BULT_DONATION_AMT_600_LEN);
       localBultDonationAmt600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBultDonationAmt600Constraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshBultDonationAmt600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBultDonationAmt600() {	 
   		return (substring(getStringValue(),beginBultDonationAmt600,beginBultDonationAmt600 + BULT_DONATION_AMT_600_LEN));
   	}




}
  

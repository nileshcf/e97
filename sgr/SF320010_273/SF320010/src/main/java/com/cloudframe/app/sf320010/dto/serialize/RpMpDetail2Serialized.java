package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpMpDetail2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpMpDetail2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpMpDetail2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_MP_DETAIL_2_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpMpCc2;
            protected  int beginRpMpIssFloorLim2Retail;
            protected  int beginRpMpIssFloorLim2Travel;
            protected  int beginRpMpIssFloorLim2Cash;
            protected  int beginRpMpPosRetailLimit;
            protected  int beginRpMpPosTravelLimit;
            protected  int beginRpMpPosCashLimit;
            protected  int beginRpMpXCodeLimit;
	
	/**
	* Constructor for RpMpDetail2Serialized
	**/
    public RpMpDetail2Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpMpDetail2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_MP_DETAIL_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRpMpCc2 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginRpMpIssFloorLim2Retail = getStartOffset() + 11;	// set offset for serialization
  
  
             beginRpMpIssFloorLim2Travel = getStartOffset() + 27;	// set offset for serialization
  
  
             beginRpMpIssFloorLim2Cash = getStartOffset() + 46;	// set offset for serialization
  
  
             beginRpMpPosRetailLimit = getStartOffset() + 68;	// set offset for serialization
  
  
             beginRpMpPosTravelLimit = getStartOffset() + 88;	// set offset for serialization
  
  
             beginRpMpPosCashLimit = getStartOffset() + 109;	// set offset for serialization
  
  
             beginRpMpXCodeLimit = getStartOffset() + 129;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRpMpCc2Counter = -1;
     public boolean isRpMpCc2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpCc2Counter != sharedCounter;
         localRpMpCc2Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_CC_2_LEN = 1;
	/**
	 * 	serialize this RpMpCc2
	 */
   protected void serializeRpMpCc2(char[] rpMpCc2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpCc2,0,getStringValue(),beginRpMpCc2,RP_MP_CC_2_LEN);
       localRpMpCc2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpCc2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpMpCc2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpCc2() {	 
   		return (substring(getStringValue(),beginRpMpCc2,beginRpMpCc2 + RP_MP_CC_2_LEN));
   	}
     int localRpMpIssFloorLim2RetailCounter = -1;
     public boolean isRpMpIssFloorLim2RetailModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpIssFloorLim2RetailCounter != sharedCounter;
         localRpMpIssFloorLim2RetailCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_ISS_FLOOR_LIM_2_RETAIL_LEN = 4;
	/**
	 * 	serialize this RpMpIssFloorLim2Retail
	 */
   protected void serializeRpMpIssFloorLim2Retail(char[] rpMpIssFloorLim2Retail) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpIssFloorLim2Retail,0,getStringValue(),beginRpMpIssFloorLim2Retail,RP_MP_ISS_FLOOR_LIM_2_RETAIL_LEN);
       localRpMpIssFloorLim2RetailCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpIssFloorLim2RetailConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpIssFloorLim2Retail is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpIssFloorLim2Retail() {	 
   		return (substring(getStringValue(),beginRpMpIssFloorLim2Retail,beginRpMpIssFloorLim2Retail + RP_MP_ISS_FLOOR_LIM_2_RETAIL_LEN));
   	}
     int localRpMpIssFloorLim2TravelCounter = -1;
     public boolean isRpMpIssFloorLim2TravelModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpIssFloorLim2TravelCounter != sharedCounter;
         localRpMpIssFloorLim2TravelCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_ISS_FLOOR_LIM_2_TRAVEL_LEN = 4;
	/**
	 * 	serialize this RpMpIssFloorLim2Travel
	 */
   protected void serializeRpMpIssFloorLim2Travel(char[] rpMpIssFloorLim2Travel) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpIssFloorLim2Travel,0,getStringValue(),beginRpMpIssFloorLim2Travel,RP_MP_ISS_FLOOR_LIM_2_TRAVEL_LEN);
       localRpMpIssFloorLim2TravelCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpIssFloorLim2TravelConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpIssFloorLim2Travel is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpIssFloorLim2Travel() {	 
   		return (substring(getStringValue(),beginRpMpIssFloorLim2Travel,beginRpMpIssFloorLim2Travel + RP_MP_ISS_FLOOR_LIM_2_TRAVEL_LEN));
   	}
     int localRpMpIssFloorLim2CashCounter = -1;
     public boolean isRpMpIssFloorLim2CashModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpIssFloorLim2CashCounter != sharedCounter;
         localRpMpIssFloorLim2CashCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_ISS_FLOOR_LIM_2_CASH_LEN = 4;
	/**
	 * 	serialize this RpMpIssFloorLim2Cash
	 */
   protected void serializeRpMpIssFloorLim2Cash(char[] rpMpIssFloorLim2Cash) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpIssFloorLim2Cash,0,getStringValue(),beginRpMpIssFloorLim2Cash,RP_MP_ISS_FLOOR_LIM_2_CASH_LEN);
       localRpMpIssFloorLim2CashCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpIssFloorLim2CashConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpIssFloorLim2Cash is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpIssFloorLim2Cash() {	 
   		return (substring(getStringValue(),beginRpMpIssFloorLim2Cash,beginRpMpIssFloorLim2Cash + RP_MP_ISS_FLOOR_LIM_2_CASH_LEN));
   	}
     int localRpMpPosRetailLimitCounter = -1;
     public boolean isRpMpPosRetailLimitModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpPosRetailLimitCounter != sharedCounter;
         localRpMpPosRetailLimitCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_POS_RETAIL_LIMIT_LEN = 4;
	/**
	 * 	serialize this RpMpPosRetailLimit
	 */
   protected void serializeRpMpPosRetailLimit(char[] rpMpPosRetailLimit) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpPosRetailLimit,0,getStringValue(),beginRpMpPosRetailLimit,RP_MP_POS_RETAIL_LIMIT_LEN);
       localRpMpPosRetailLimitCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpPosRetailLimitConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpPosRetailLimit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpPosRetailLimit() {	 
   		return (substring(getStringValue(),beginRpMpPosRetailLimit,beginRpMpPosRetailLimit + RP_MP_POS_RETAIL_LIMIT_LEN));
   	}
     int localRpMpPosTravelLimitCounter = -1;
     public boolean isRpMpPosTravelLimitModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpPosTravelLimitCounter != sharedCounter;
         localRpMpPosTravelLimitCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_POS_TRAVEL_LIMIT_LEN = 4;
	/**
	 * 	serialize this RpMpPosTravelLimit
	 */
   protected void serializeRpMpPosTravelLimit(char[] rpMpPosTravelLimit) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpPosTravelLimit,0,getStringValue(),beginRpMpPosTravelLimit,RP_MP_POS_TRAVEL_LIMIT_LEN);
       localRpMpPosTravelLimitCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpPosTravelLimitConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpPosTravelLimit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpPosTravelLimit() {	 
   		return (substring(getStringValue(),beginRpMpPosTravelLimit,beginRpMpPosTravelLimit + RP_MP_POS_TRAVEL_LIMIT_LEN));
   	}
     int localRpMpPosCashLimitCounter = -1;
     public boolean isRpMpPosCashLimitModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpPosCashLimitCounter != sharedCounter;
         localRpMpPosCashLimitCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_POS_CASH_LIMIT_LEN = 4;
	/**
	 * 	serialize this RpMpPosCashLimit
	 */
   protected void serializeRpMpPosCashLimit(char[] rpMpPosCashLimit) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpPosCashLimit,0,getStringValue(),beginRpMpPosCashLimit,RP_MP_POS_CASH_LIMIT_LEN);
       localRpMpPosCashLimitCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpPosCashLimitConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpPosCashLimit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpPosCashLimit() {	 
   		return (substring(getStringValue(),beginRpMpPosCashLimit,beginRpMpPosCashLimit + RP_MP_POS_CASH_LIMIT_LEN));
   	}
     int localRpMpXCodeLimitCounter = -1;
     public boolean isRpMpXCodeLimitModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpXCodeLimitCounter != sharedCounter;
         localRpMpXCodeLimitCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_XCODE_LIMIT_LEN = 4;
	/**
	 * 	serialize this RpMpXCodeLimit
	 */
   protected void serializeRpMpXCodeLimit(char[] rpMpXCodeLimit) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpXCodeLimit,0,getStringValue(),beginRpMpXCodeLimit,RP_MP_XCODE_LIMIT_LEN);
       localRpMpXCodeLimitCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpXCodeLimitConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpXCodeLimit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpXCodeLimit() {	 
   		return (substring(getStringValue(),beginRpMpXCodeLimit,beginRpMpXCodeLimit + RP_MP_XCODE_LIMIT_LEN));
   	}




}
  

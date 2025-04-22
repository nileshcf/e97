package com.cloudframe.app.ip088030.dto.serialize;

/**
*  The class HoldVariables800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HoldVariables800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HoldVariables800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HOLD_VARIABLES_800_LENGTH = 30;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFundPan800;
            protected  int beginMccCode800;
            protected  int beginProdId800;
            protected  int beginFundProdId800;
            protected  int beginMccCodeX800;
            protected  int beginMaid800;
	
	/**
	* Constructor for HoldVariables800Serialized
	**/
    public HoldVariables800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HoldVariables800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HOLD_VARIABLES_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFundPan800 = getStartOffset() + 0;	// set offset for serialization
  
             beginMccCode800 = getStartOffset() + 10;	// set offset for serialization
  
             beginProdId800 = getStartOffset() + 14;	// set offset for serialization
  
             beginFundProdId800 = getStartOffset() + 17;	// set offset for serialization
  
             beginMccCodeX800 = getStartOffset() + 20;	// set offset for serialization
  
             beginMaid800 = getStartOffset() + 24;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFundPan800Counter = -1;
     public boolean isFundPan800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFundPan800Counter != sharedCounter;
         localFundPan800Counter = sharedCounter; return hasModified;
     }
	protected static final int FUND_PAN_800_LEN = 10;
	/**
	 * 	serialize this FundPan800
	 */
   protected void serializeFundPan800(char[] fundPan800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fundPan800,0,getStringValue(),beginFundPan800,FUND_PAN_800_LEN);
       localFundPan800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFundPan800Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshFundPan800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFundPan800() {	 
   		return (substring(getStringValue(),beginFundPan800,beginFundPan800 + FUND_PAN_800_LEN));
   	}
     int localMccCode800Counter = -1;
     public boolean isMccCode800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMccCode800Counter != sharedCounter;
         localMccCode800Counter = sharedCounter; return hasModified;
     }
	protected static final int MCC_CODE_800_LEN = 4;
	/**
	 * 	serialize this MccCode800
	 */
   protected void serializeMccCode800(char[] mccCode800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mccCode800,0,getStringValue(),beginMccCode800,MCC_CODE_800_LEN);
       localMccCode800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMccCode800Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshMccCode800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMccCode800() {	 
   		return (substring(getStringValue(),beginMccCode800,beginMccCode800 + MCC_CODE_800_LEN));
   	}
     int localProdId800Counter = -1;
     public boolean isProdId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProdId800Counter != sharedCounter;
         localProdId800Counter = sharedCounter; return hasModified;
     }
	protected static final int PROD_ID_800_LEN = 3;
	/**
	 * 	serialize this ProdId800
	 */
   protected void serializeProdId800(char[] prodId800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prodId800,0,getStringValue(),beginProdId800,PROD_ID_800_LEN);
       localProdId800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkProdId800Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshProdId800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshProdId800() {	 
   		return (substring(getStringValue(),beginProdId800,beginProdId800 + PROD_ID_800_LEN));
   	}
     int localFundProdId800Counter = -1;
     public boolean isFundProdId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFundProdId800Counter != sharedCounter;
         localFundProdId800Counter = sharedCounter; return hasModified;
     }
	protected static final int FUND_PROD_ID_800_LEN = 3;
	/**
	 * 	serialize this FundProdId800
	 */
   protected void serializeFundProdId800(char[] fundProdId800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fundProdId800,0,getStringValue(),beginFundProdId800,FUND_PROD_ID_800_LEN);
       localFundProdId800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFundProdId800Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshFundProdId800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFundProdId800() {	 
   		return (substring(getStringValue(),beginFundProdId800,beginFundProdId800 + FUND_PROD_ID_800_LEN));
   	}
     int localMccCodeX800Counter = -1;
     public boolean isMccCodeX800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMccCodeX800Counter != sharedCounter;
         localMccCodeX800Counter = sharedCounter; return hasModified;
     }
	protected static final int MCC_CODE_X_800_LEN = 4;
	/**
	 * 	serialize this MccCodeX800
	 */
   protected void serializeMccCodeX800(char[] mccCodeX800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mccCodeX800,0,getStringValue(),beginMccCodeX800,MCC_CODE_X_800_LEN);
       localMccCodeX800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMccCodeX800Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshMccCodeX800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMccCodeX800() {	 
   		return (substring(getStringValue(),beginMccCodeX800,beginMccCodeX800 + MCC_CODE_X_800_LEN));
   	}
     int localMaid800Counter = -1;
     public boolean isMaid800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMaid800Counter != sharedCounter;
         localMaid800Counter = sharedCounter; return hasModified;
     }
	protected static final int MAID_800_LEN = 6;
	/**
	 * 	serialize this Maid800
	 */
   protected void serializeMaid800(char[] maid800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(maid800,0,getStringValue(),beginMaid800,MAID_800_LEN);
       localMaid800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMaid800Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshMaid800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMaid800() {	 
   		return (substring(getStringValue(),beginMaid800,beginMaid800 + MAID_800_LEN));
   	}




}
  

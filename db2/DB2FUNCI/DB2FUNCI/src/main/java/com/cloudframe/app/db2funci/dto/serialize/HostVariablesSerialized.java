package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class HostVariablesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HostVariablesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HostVariablesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HOST_VARIABLES_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPositionFoundSw;
            protected  int beginPriceLoadedTodaySw;
            protected  int beginRetailPositionSw;
            protected  int beginAlternatePriceSw;
            protected  int beginActiveOverrideSw;
            protected  int beginRapAppCdAllowedSw;
            protected  int beginRemAppCdAllowedSw;
            protected  int beginRtlAppCdAllowedSw;
	
	/**
	* Constructor for HostVariablesSerialized
	**/
    public HostVariablesSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HostVariablesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HOST_VARIABLES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPositionFoundSw = getStartOffset() + 0;	// set offset for serialization
  
             beginPriceLoadedTodaySw = getStartOffset() + 1;	// set offset for serialization
  
             beginRetailPositionSw = getStartOffset() + 2;	// set offset for serialization
  
             beginAlternatePriceSw = getStartOffset() + 3;	// set offset for serialization
  
             beginActiveOverrideSw = getStartOffset() + 4;	// set offset for serialization
  
             beginRapAppCdAllowedSw = getStartOffset() + 5;	// set offset for serialization
  
             beginRemAppCdAllowedSw = getStartOffset() + 6;	// set offset for serialization
  
             beginRtlAppCdAllowedSw = getStartOffset() + 7;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPositionFoundSwCounter = -1;
     public boolean isPositionFoundSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPositionFoundSwCounter != sharedCounter;
         localPositionFoundSwCounter = sharedCounter; return hasModified;
     }
	protected static final int POSITION_FOUND_SW_LEN = 1;
	/**
	 * 	serialize this PositionFoundSw
	 */
   protected void serializePositionFoundSw(char[] positionFoundSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(positionFoundSw,0,getStringValue(),beginPositionFoundSw,POSITION_FOUND_SW_LEN);
       localPositionFoundSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPositionFoundSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshPositionFoundSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPositionFoundSw() {	 
   		return (substring(getStringValue(),beginPositionFoundSw,beginPositionFoundSw + POSITION_FOUND_SW_LEN));
   	}
     int localPriceLoadedTodaySwCounter = -1;
     public boolean isPriceLoadedTodaySwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPriceLoadedTodaySwCounter != sharedCounter;
         localPriceLoadedTodaySwCounter = sharedCounter; return hasModified;
     }
	protected static final int PRICE_LOADED_TODAY_SW_LEN = 1;
	/**
	 * 	serialize this PriceLoadedTodaySw
	 */
   protected void serializePriceLoadedTodaySw(char[] priceLoadedTodaySw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(priceLoadedTodaySw,0,getStringValue(),beginPriceLoadedTodaySw,PRICE_LOADED_TODAY_SW_LEN);
       localPriceLoadedTodaySwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPriceLoadedTodaySwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshPriceLoadedTodaySw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPriceLoadedTodaySw() {	 
   		return (substring(getStringValue(),beginPriceLoadedTodaySw,beginPriceLoadedTodaySw + PRICE_LOADED_TODAY_SW_LEN));
   	}
     int localRetailPositionSwCounter = -1;
     public boolean isRetailPositionSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRetailPositionSwCounter != sharedCounter;
         localRetailPositionSwCounter = sharedCounter; return hasModified;
     }
	protected static final int RETAIL_POSITION_SW_LEN = 1;
	/**
	 * 	serialize this RetailPositionSw
	 */
   protected void serializeRetailPositionSw(char[] retailPositionSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(retailPositionSw,0,getStringValue(),beginRetailPositionSw,RETAIL_POSITION_SW_LEN);
       localRetailPositionSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRetailPositionSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRetailPositionSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRetailPositionSw() {	 
   		return (substring(getStringValue(),beginRetailPositionSw,beginRetailPositionSw + RETAIL_POSITION_SW_LEN));
   	}
     int localAlternatePriceSwCounter = -1;
     public boolean isAlternatePriceSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAlternatePriceSwCounter != sharedCounter;
         localAlternatePriceSwCounter = sharedCounter; return hasModified;
     }
	protected static final int ALTERNATE_PRICE_SW_LEN = 1;
	/**
	 * 	serialize this AlternatePriceSw
	 */
   protected void serializeAlternatePriceSw(char[] alternatePriceSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(alternatePriceSw,0,getStringValue(),beginAlternatePriceSw,ALTERNATE_PRICE_SW_LEN);
       localAlternatePriceSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAlternatePriceSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshAlternatePriceSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAlternatePriceSw() {	 
   		return (substring(getStringValue(),beginAlternatePriceSw,beginAlternatePriceSw + ALTERNATE_PRICE_SW_LEN));
   	}
     int localActiveOverrideSwCounter = -1;
     public boolean isActiveOverrideSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localActiveOverrideSwCounter != sharedCounter;
         localActiveOverrideSwCounter = sharedCounter; return hasModified;
     }
	protected static final int ACTIVE_OVERRIDE_SW_LEN = 1;
	/**
	 * 	serialize this ActiveOverrideSw
	 */
   protected void serializeActiveOverrideSw(char[] activeOverrideSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(activeOverrideSw,0,getStringValue(),beginActiveOverrideSw,ACTIVE_OVERRIDE_SW_LEN);
       localActiveOverrideSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkActiveOverrideSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshActiveOverrideSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshActiveOverrideSw() {	 
   		return (substring(getStringValue(),beginActiveOverrideSw,beginActiveOverrideSw + ACTIVE_OVERRIDE_SW_LEN));
   	}
     int localRapAppCdAllowedSwCounter = -1;
     public boolean isRapAppCdAllowedSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRapAppCdAllowedSwCounter != sharedCounter;
         localRapAppCdAllowedSwCounter = sharedCounter; return hasModified;
     }
	protected static final int RAP_APP_CD_ALLOWED_SW_LEN = 1;
	/**
	 * 	serialize this RapAppCdAllowedSw
	 */
   protected void serializeRapAppCdAllowedSw(char[] rapAppCdAllowedSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rapAppCdAllowedSw,0,getStringValue(),beginRapAppCdAllowedSw,RAP_APP_CD_ALLOWED_SW_LEN);
       localRapAppCdAllowedSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRapAppCdAllowedSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRapAppCdAllowedSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRapAppCdAllowedSw() {	 
   		return (substring(getStringValue(),beginRapAppCdAllowedSw,beginRapAppCdAllowedSw + RAP_APP_CD_ALLOWED_SW_LEN));
   	}
     int localRemAppCdAllowedSwCounter = -1;
     public boolean isRemAppCdAllowedSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRemAppCdAllowedSwCounter != sharedCounter;
         localRemAppCdAllowedSwCounter = sharedCounter; return hasModified;
     }
	protected static final int REM_APP_CD_ALLOWED_SW_LEN = 1;
	/**
	 * 	serialize this RemAppCdAllowedSw
	 */
   protected void serializeRemAppCdAllowedSw(char[] remAppCdAllowedSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(remAppCdAllowedSw,0,getStringValue(),beginRemAppCdAllowedSw,REM_APP_CD_ALLOWED_SW_LEN);
       localRemAppCdAllowedSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRemAppCdAllowedSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRemAppCdAllowedSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRemAppCdAllowedSw() {	 
   		return (substring(getStringValue(),beginRemAppCdAllowedSw,beginRemAppCdAllowedSw + REM_APP_CD_ALLOWED_SW_LEN));
   	}
     int localRtlAppCdAllowedSwCounter = -1;
     public boolean isRtlAppCdAllowedSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRtlAppCdAllowedSwCounter != sharedCounter;
         localRtlAppCdAllowedSwCounter = sharedCounter; return hasModified;
     }
	protected static final int RTL_APP_CD_ALLOWED_SW_LEN = 1;
	/**
	 * 	serialize this RtlAppCdAllowedSw
	 */
   protected void serializeRtlAppCdAllowedSw(char[] rtlAppCdAllowedSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rtlAppCdAllowedSw,0,getStringValue(),beginRtlAppCdAllowedSw,RTL_APP_CD_ALLOWED_SW_LEN);
       localRtlAppCdAllowedSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRtlAppCdAllowedSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRtlAppCdAllowedSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRtlAppCdAllowedSw() {	 
   		return (substring(getStringValue(),beginRtlAppCdAllowedSw,beginRtlAppCdAllowedSw + RTL_APP_CD_ALLOWED_SW_LEN));
   	}




}
  

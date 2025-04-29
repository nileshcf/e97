package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class DclvcrrexrtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:25. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class DclvcrrexrtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DclvcrrexrtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLVCRREXRT_LENGTH = 22;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCurrencyCd;
            protected  int beginExchangeRateAmt;
	
	/**
	* Constructor for DclvcrrexrtSerialized
	**/
    public DclvcrrexrtSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DclvcrrexrtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLVCRREXRT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCurrencyCd = getStartOffset() + 0;	// set offset for serialization
  
             beginExchangeRateAmt = getStartOffset() + 14;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCurrencyCdCounter = -1;
     public boolean isCurrencyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrencyCdCounter != sharedCounter;
         localCurrencyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int CURRENCY_CD_LEN = 2;
	/**
	 * 	serialize this CurrencyCd
	 */
   protected void serializeCurrencyCd(char[] currencyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currencyCd,0,getStringValue(),beginCurrencyCd,CURRENCY_CD_LEN);
       localCurrencyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrencyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCurrencyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrencyCd() {	 
   		return (substring(getStringValue(),beginCurrencyCd,beginCurrencyCd + CURRENCY_CD_LEN));
   	}
     int localExchangeRateAmtCounter = -1;
     public boolean isExchangeRateAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExchangeRateAmtCounter != sharedCounter;
         localExchangeRateAmtCounter = sharedCounter; return hasModified;          
     }
	/**
	 * 	serialize this ExchangeRateAmt
	 */
   protected void serializeExchangeRateAmt(BigDecimal exchangeRateAmt) {	
		shareString.getSerializedField().incrementCounter();
	 	putComp2(beginExchangeRateAmt, exchangeRateAmt);
		localExchangeRateAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
     /**
	 *	refreshExchangeRateAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serilization as well
	 */ 
   	protected BigDecimal refreshExchangeRateAmt() {
	 	return getComp2(beginExchangeRateAmt);
	}




}
  

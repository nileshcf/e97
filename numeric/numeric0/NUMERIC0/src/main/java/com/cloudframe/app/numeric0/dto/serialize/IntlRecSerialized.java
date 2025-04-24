package com.cloudframe.app.numeric0.dto.serialize;

/**
*  The class IntlRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:28. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class IntlRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IntlRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int INTL_REC_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIntlRateAmount;
	
	/**
	* Constructor for IntlRecSerialized
	**/
    public IntlRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in IntlRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(INTL_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIntlRateAmount = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localIntlRateAmountCounter = -1;
        public boolean isIntlRateAmountModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localIntlRateAmountCounter != sharedCounter;
           localIntlRateAmountCounter = sharedCounter; return hasModified; 
        }
	    public boolean intlRateAmountIsNumeric() {
	      return decimalIsNumeric(beginIntlRateAmount,INTL_RATE_AMOUNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] intlRateAmountString() {
            return getPackedString(beginIntlRateAmount,INTL_RATE_AMOUNT_LEN);
         }
   protected static final int INTL_RATE_AMOUNT_LEN = 8;
   protected static final int INTL_RATE_AMOUNT_SCALE = 11;
  	/**
	 * 	serializeIntlRateAmount
	 */
	protected void serializeIntlRateAmount(BigDecimal intlRateAmount) {
		   putDecimal(beginIntlRateAmount,intlRateAmount,INTL_RATE_AMOUNT_LEN,INTL_RATE_AMOUNT_SCALE,true);
		 localIntlRateAmountCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkIntlRateAmountMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,11/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshIntlRateAmount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshIntlRateAmount() throws CFException {	
   	try { 
		 return (getDecimal(beginIntlRateAmount,INTL_RATE_AMOUNT_LEN,INTL_RATE_AMOUNT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("intlRateAmount", beginIntlRateAmount,INTL_RATE_AMOUNT_LEN);
     }
   	}




}
  

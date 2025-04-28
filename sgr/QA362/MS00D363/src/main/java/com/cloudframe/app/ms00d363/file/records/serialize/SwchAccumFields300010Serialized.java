package com.cloudframe.app.ms00d363.file.records.serialize;

/**
*  The class SwchAccumFields300010Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class SwchAccumFields300010Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SwchAccumFields300010Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SWCH_ACCUM_FIELDS_300010_LENGTH = 39;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSwchPaymentPartyAmt300010;
	
	/**
	* Constructor for SwchAccumFields300010Serialized
	**/
    public SwchAccumFields300010Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SwchAccumFields300010Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SwchAccumFields300010Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SwchAccumFields300010Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,107); // serialize this field at offset 107 by default 
    }
    
	/**
	* sets parent for this SwchAccumFields300010Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 107 by default
    }    
	/**
	* initializes the field in SwchAccumFields300010Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SWCH_ACCUM_FIELDS_300010_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSwchPaymentPartyAmt300010 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localSwchPaymentPartyAmt300010Counter = -1;
        public boolean isSwchPaymentPartyAmt300010Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSwchPaymentPartyAmt300010Counter != sharedCounter;
           localSwchPaymentPartyAmt300010Counter = sharedCounter; return hasModified; 
        }
	    public boolean swchPaymentPartyAmt300010IsNumeric() {
	      return decimalIsNumeric(beginSwchPaymentPartyAmt300010,SWCH_PAYMENT_PARTY_AMT_300010_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] swchPaymentPartyAmt300010String() {
            return getPackedString(beginSwchPaymentPartyAmt300010,SWCH_PAYMENT_PARTY_AMT_300010_LEN);
         }
   protected static final int SWCH_PAYMENT_PARTY_AMT_300010_LEN = 11;
   protected static final int SWCH_PAYMENT_PARTY_AMT_300010_SCALE = 5;
  	/**
	 * 	serializeSwchPaymentPartyAmt300010
	 */
	protected void serializeSwchPaymentPartyAmt300010(BigDecimal swchPaymentPartyAmt300010) {
		   putDecimal(beginSwchPaymentPartyAmt300010,swchPaymentPartyAmt300010,SWCH_PAYMENT_PARTY_AMT_300010_LEN,SWCH_PAYMENT_PARTY_AMT_300010_SCALE,false);
		 localSwchPaymentPartyAmt300010Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSwchPaymentPartyAmt300010MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,5/*scale*/,20/*precision*/);
   }
     /**
	 *	refreshSwchPaymentPartyAmt300010 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSwchPaymentPartyAmt300010() throws CFException {	
   	try { 
		 return (getDecimal(beginSwchPaymentPartyAmt300010,SWCH_PAYMENT_PARTY_AMT_300010_LEN,SWCH_PAYMENT_PARTY_AMT_300010_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("swchPaymentPartyAmt300010", beginSwchPaymentPartyAmt300010,SWCH_PAYMENT_PARTY_AMT_300010_LEN);
     }
   	}




}
  

package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class TransactionAmt100860Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class TransactionAmt100860Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TransactionAmt100860Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TRANSACTION_AMT_100860_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTranAmt100d860;
	
	/**
	* Constructor for TransactionAmt100860Serialized
	**/
    public TransactionAmt100860Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TransactionAmt100860Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TransactionAmt100860Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TransactionAmt100860Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,363); // serialize this field at offset 363 by default 
    }
    
	/**
	* sets parent for this TransactionAmt100860Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 363 by default
    }    
	/**
	* initializes the field in TransactionAmt100860Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TRANSACTION_AMT_100860_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTranAmt100d860 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTranAmt100d860Counter = -1;
     
     public boolean isTranAmt100d860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTranAmt100d860Counter != sharedCounter;
         localTranAmt100d860Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tranAmt100d860
	 *	@return tranAmt100d860
	 */
	public char[]  getTranAmt100d860String() {
	    return getCharArray(beginTranAmt100d860,TRAN_AMT_100D_860_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranAmt100d860IsNumeric() {
		    return isNumeric(beginTranAmt100d860
	                    ,beginTranAmt100d860 + TRAN_AMT_100D_860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TRAN_AMT_100D_860_LEN = 12;
  protected  static final int TRAN_AMT_100D_860_SCALE = 2;

   protected BigDecimal checkTranAmt100d860MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeTranAmt100d860
	 */
	protected void serializeTranAmt100d860(BigDecimal tranAmt100d860) {
	       putNumber(beginTranAmt100d860,tranAmt100d860,TRAN_AMT_100D_860_LEN,TRAN_AMT_100D_860_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTranAmt100d860Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTranAmt100d860
	 */
   	protected  BigDecimal serializeTranAmt100d860(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginTranAmt100d860
		       ,12
		      );		 localTranAmt100d860Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TRAN_AMT_100D_860_LEN,TRAN_AMT_100D_860_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tranAmt100d860", beginTranAmt100d860,TRAN_AMT_100D_860_LEN);
    	}
    }
    /**
	 *	refreshTranAmt100d860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTranAmt100d860() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTranAmt100d860
			            ,TRAN_AMT_100D_860_LEN
			            ,TRAN_AMT_100D_860_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tranAmt100d860", beginTranAmt100d860,TRAN_AMT_100D_860_LEN);
    }
   	}




}
  

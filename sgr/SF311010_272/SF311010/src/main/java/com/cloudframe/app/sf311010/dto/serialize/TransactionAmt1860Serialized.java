package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class TransactionAmt1860Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class TransactionAmt1860Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TransactionAmt1860Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TRANSACTION_AMT_1860_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTransactionAmt860;
	
	/**
	* Constructor for TransactionAmt1860Serialized
	**/
    public TransactionAmt1860Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TransactionAmt1860Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TransactionAmt1860Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TransactionAmt1860Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,25); // serialize this field at offset 25 by default 
    }
    
	/**
	* sets parent for this TransactionAmt1860Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 25 by default
    }    
	/**
	* initializes the field in TransactionAmt1860Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TRANSACTION_AMT_1860_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTransactionAmt860 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTransactionAmt860Counter = -1;
     
     public boolean isTransactionAmt860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTransactionAmt860Counter != sharedCounter;
         localTransactionAmt860Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of transactionAmt860
	 *	@return transactionAmt860
	 */
	public char[]  getTransactionAmt860String() {
	    return getCharArray(beginTransactionAmt860,TRANSACTION_AMT_860_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean transactionAmt860IsNumeric() {
		    return isNumeric(beginTransactionAmt860
	                    ,beginTransactionAmt860 + TRANSACTION_AMT_860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TRANSACTION_AMT_860_LEN = 12;
  protected  static final int TRANSACTION_AMT_860_SCALE = 2;

   protected BigDecimal checkTransactionAmt860MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeTransactionAmt860
	 */
	protected void serializeTransactionAmt860(BigDecimal transactionAmt860) {
	       putNumber(beginTransactionAmt860,transactionAmt860,TRANSACTION_AMT_860_LEN,TRANSACTION_AMT_860_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTransactionAmt860Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTransactionAmt860
	 */
   	protected  BigDecimal serializeTransactionAmt860(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginTransactionAmt860
		       ,12
		      );		 localTransactionAmt860Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TRANSACTION_AMT_860_LEN,TRANSACTION_AMT_860_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("transactionAmt860", beginTransactionAmt860,TRANSACTION_AMT_860_LEN);
    	}
    }
    /**
	 *	refreshTransactionAmt860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTransactionAmt860() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTransactionAmt860
			            ,TRANSACTION_AMT_860_LEN
			            ,TRANSACTION_AMT_860_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("transactionAmt860", beginTransactionAmt860,TRANSACTION_AMT_860_LEN);
    }
   	}




}
  

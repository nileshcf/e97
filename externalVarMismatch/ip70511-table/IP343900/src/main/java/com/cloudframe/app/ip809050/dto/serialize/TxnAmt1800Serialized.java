package com.cloudframe.app.ip809050.dto.serialize;

/**
*  The class TxnAmt1800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TxnAmt1800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TxnAmt1800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TXN_AMT_1800_LENGTH = 13;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTxnAmt800;
            protected  int beginTxnAmtDec800;
	
	/**
	* Constructor for TxnAmt1800Serialized
	**/
    public TxnAmt1800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TxnAmt1800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TxnAmt1800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TxnAmt1800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,358); // serialize this field at offset 358 by default 
    }
    
	/**
	* sets parent for this TxnAmt1800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 358 by default
    }    
	/**
	* initializes the field in TxnAmt1800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TXN_AMT_1800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTxnAmt800 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginTxnAmtDec800 = getStartOffset() + 11;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTxnAmt800Counter = -1;
     public boolean isTxnAmt800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTxnAmt800Counter != sharedCounter;
         localTxnAmt800Counter = sharedCounter; return hasModified;
     }
	protected static final int TXN_AMT_800_LEN = 10;
	/**
	 * 	serialize this TxnAmt800
	 */
   protected void serializeTxnAmt800(char[] txnAmt800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(txnAmt800,0,getStringValue(),beginTxnAmt800,TXN_AMT_800_LEN);
       localTxnAmt800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTxnAmt800Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTxnAmt800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTxnAmt800() {	 
   		return (substring(getStringValue(),beginTxnAmt800,beginTxnAmt800 + TXN_AMT_800_LEN));
   	}
     int localTxnAmtDec800Counter = -1;
     public boolean isTxnAmtDec800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTxnAmtDec800Counter != sharedCounter;
         localTxnAmtDec800Counter = sharedCounter; return hasModified;
     }
	protected static final int TXN_AMT_DEC_800_LEN = 2;
	/**
	 * 	serialize this TxnAmtDec800
	 */
   protected void serializeTxnAmtDec800(char[] txnAmtDec800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(txnAmtDec800,0,getStringValue(),beginTxnAmtDec800,TXN_AMT_DEC_800_LEN);
       localTxnAmtDec800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTxnAmtDec800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTxnAmtDec800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTxnAmtDec800() {	 
   		return (substring(getStringValue(),beginTxnAmtDec800,beginTxnAmtDec800 + TXN_AMT_DEC_800_LEN));
   	}




}
  

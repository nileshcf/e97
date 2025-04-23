package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage3Ln1aSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage3Ln1aSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage3Ln1aSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_3_LN_1A_LENGTH = 135;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt31aCc;
            protected  int beginDt31aSerNo;
            protected  int beginDt31aCreditAmt;
            protected  int beginDt31aDebitAmt;
            protected  int beginDt31aNetAmt;
            protected  int beginDt31aInd;
	
	/**
	* Constructor for DtPage3Ln1aSerialized
	**/
    public DtPage3Ln1aSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage3Ln1aSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_3_LN_1A_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt31aCc = getStartOffset() + 0;	// set offset for serialization
  
  
             beginDt31aSerNo = getStartOffset() + 3;	// set offset for serialization
  
  
             beginDt31aCreditAmt = getStartOffset() + 18;	// set offset for serialization
  
  
  
  
             beginDt31aDebitAmt = getStartOffset() + 48;	// set offset for serialization
  
  
  
  
             beginDt31aNetAmt = getStartOffset() + 76;	// set offset for serialization
  
  
             beginDt31aInd = getStartOffset() + 97;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt31aCcCounter = -1;
     public boolean isDt31aCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt31aCcCounter != sharedCounter;
         localDt31aCcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_31A_CC_LEN = 1;
	/**
	 * 	serialize this Dt31aCc
	 */
   protected void serializeDt31aCc(char[] dt31aCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt31aCc,0,getStringValue(),beginDt31aCc,DT_31A_CC_LEN);
       localDt31aCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt31aCcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt31aCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt31aCc() {	 
   		return (substring(getStringValue(),beginDt31aCc,beginDt31aCc + DT_31A_CC_LEN));
   	}
     int localDt31aSerNoCounter = -1;
     public boolean isDt31aSerNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt31aSerNoCounter != sharedCounter;
         localDt31aSerNoCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_31A_SER_NO_LEN = 2;
	/**
	 * 	serialize this Dt31aSerNo
	 */
   protected void serializeDt31aSerNo(char[] dt31aSerNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt31aSerNo,0,getStringValue(),beginDt31aSerNo,DT_31A_SER_NO_LEN);
       localDt31aSerNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt31aSerNoConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt31aSerNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt31aSerNo() {	 
   		return (substring(getStringValue(),beginDt31aSerNo,beginDt31aSerNo + DT_31A_SER_NO_LEN));
   	}
     int localDt31aCreditAmtCounter = -1;
     public boolean isDt31aCreditAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt31aCreditAmtCounter != sharedCounter;
         localDt31aCreditAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_31A_CREDIT_AMT_LEN = 20;
	/**
	 * 	serialize this Dt31aCreditAmt
	 */
   protected void serializeDt31aCreditAmt(char[] dt31aCreditAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt31aCreditAmt,0,getStringValue(),beginDt31aCreditAmt,DT_31A_CREDIT_AMT_LEN);
       localDt31aCreditAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt31aCreditAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshDt31aCreditAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt31aCreditAmt() {	 
   		return (substring(getStringValue(),beginDt31aCreditAmt,beginDt31aCreditAmt + DT_31A_CREDIT_AMT_LEN));
   	}
     int localDt31aDebitAmtCounter = -1;
     public boolean isDt31aDebitAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt31aDebitAmtCounter != sharedCounter;
         localDt31aDebitAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_31A_DEBIT_AMT_LEN = 20;
	/**
	 * 	serialize this Dt31aDebitAmt
	 */
   protected void serializeDt31aDebitAmt(char[] dt31aDebitAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt31aDebitAmt,0,getStringValue(),beginDt31aDebitAmt,DT_31A_DEBIT_AMT_LEN);
       localDt31aDebitAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt31aDebitAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshDt31aDebitAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt31aDebitAmt() {	 
   		return (substring(getStringValue(),beginDt31aDebitAmt,beginDt31aDebitAmt + DT_31A_DEBIT_AMT_LEN));
   	}
     int localDt31aNetAmtCounter = -1;
     public boolean isDt31aNetAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt31aNetAmtCounter != sharedCounter;
         localDt31aNetAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_31A_NET_AMT_LEN = 20;
	/**
	 * 	serialize this Dt31aNetAmt
	 */
   protected void serializeDt31aNetAmt(char[] dt31aNetAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt31aNetAmt,0,getStringValue(),beginDt31aNetAmt,DT_31A_NET_AMT_LEN);
       localDt31aNetAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt31aNetAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshDt31aNetAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt31aNetAmt() {	 
   		return (substring(getStringValue(),beginDt31aNetAmt,beginDt31aNetAmt + DT_31A_NET_AMT_LEN));
   	}
     int localDt31aIndCounter = -1;
     public boolean isDt31aIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt31aIndCounter != sharedCounter;
         localDt31aIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_31A_IND_LEN = 1;
	/**
	 * 	serialize this Dt31aInd
	 */
   protected void serializeDt31aInd(char[] dt31aInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt31aInd,0,getStringValue(),beginDt31aInd,DT_31A_IND_LEN);
       localDt31aIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt31aIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt31aInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt31aInd() {	 
   		return (substring(getStringValue(),beginDt31aInd,beginDt31aInd + DT_31A_IND_LEN));
   	}




}
  

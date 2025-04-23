package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage3Ln2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage3Ln2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage3Ln2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_3_LN_2_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt32Cc;
            protected  int beginDt32AcqexpDbAmt;
            protected  int beginDt32AcqexpCrAmt;
            protected  int beginDt32AcqexpNetAmt;
            protected  int beginDt32AcqexpInd;
	
	/**
	* Constructor for DtPage3Ln2Serialized
	**/
    public DtPage3Ln2Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage3Ln2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_3_LN_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt32Cc = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
             beginDt32AcqexpDbAmt = getStartOffset() + 34;	// set offset for serialization
  
  
             beginDt32AcqexpCrAmt = getStartOffset() + 65;	// set offset for serialization
  
  
             beginDt32AcqexpNetAmt = getStartOffset() + 93;	// set offset for serialization
  
  
             beginDt32AcqexpInd = getStartOffset() + 117;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt32CcCounter = -1;
     public boolean isDt32CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt32CcCounter != sharedCounter;
         localDt32CcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_32_CC_LEN = 1;
	/**
	 * 	serialize this Dt32Cc
	 */
   protected void serializeDt32Cc(char[] dt32Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt32Cc,0,getStringValue(),beginDt32Cc,DT_32_CC_LEN);
       localDt32CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt32CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt32Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt32Cc() {	 
   		return (substring(getStringValue(),beginDt32Cc,beginDt32Cc + DT_32_CC_LEN));
   	}
     int localDt32AcqexpDbAmtCounter = -1;
     public boolean isDt32AcqexpDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt32AcqexpDbAmtCounter != sharedCounter;
         localDt32AcqexpDbAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_32_ACQEXP_DB_AMT_LEN = 18;
	/**
	 * 	serialize this Dt32AcqexpDbAmt
	 */
   protected void serializeDt32AcqexpDbAmt(char[] dt32AcqexpDbAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt32AcqexpDbAmt,0,getStringValue(),beginDt32AcqexpDbAmt,DT_32_ACQEXP_DB_AMT_LEN);
       localDt32AcqexpDbAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt32AcqexpDbAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt32AcqexpDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt32AcqexpDbAmt() {	 
   		return (substring(getStringValue(),beginDt32AcqexpDbAmt,beginDt32AcqexpDbAmt + DT_32_ACQEXP_DB_AMT_LEN));
   	}
     int localDt32AcqexpCrAmtCounter = -1;
     public boolean isDt32AcqexpCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt32AcqexpCrAmtCounter != sharedCounter;
         localDt32AcqexpCrAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_32_ACQEXP_CR_AMT_LEN = 18;
	/**
	 * 	serialize this Dt32AcqexpCrAmt
	 */
   protected void serializeDt32AcqexpCrAmt(char[] dt32AcqexpCrAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt32AcqexpCrAmt,0,getStringValue(),beginDt32AcqexpCrAmt,DT_32_ACQEXP_CR_AMT_LEN);
       localDt32AcqexpCrAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt32AcqexpCrAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt32AcqexpCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt32AcqexpCrAmt() {	 
   		return (substring(getStringValue(),beginDt32AcqexpCrAmt,beginDt32AcqexpCrAmt + DT_32_ACQEXP_CR_AMT_LEN));
   	}
     int localDt32AcqexpNetAmtCounter = -1;
     public boolean isDt32AcqexpNetAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt32AcqexpNetAmtCounter != sharedCounter;
         localDt32AcqexpNetAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_32_ACQEXP_NET_AMT_LEN = 18;
	/**
	 * 	serialize this Dt32AcqexpNetAmt
	 */
   protected void serializeDt32AcqexpNetAmt(char[] dt32AcqexpNetAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt32AcqexpNetAmt,0,getStringValue(),beginDt32AcqexpNetAmt,DT_32_ACQEXP_NET_AMT_LEN);
       localDt32AcqexpNetAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt32AcqexpNetAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt32AcqexpNetAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt32AcqexpNetAmt() {	 
   		return (substring(getStringValue(),beginDt32AcqexpNetAmt,beginDt32AcqexpNetAmt + DT_32_ACQEXP_NET_AMT_LEN));
   	}
     int localDt32AcqexpIndCounter = -1;
     public boolean isDt32AcqexpIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt32AcqexpIndCounter != sharedCounter;
         localDt32AcqexpIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_32_ACQEXP_IND_LEN = 2;
	/**
	 * 	serialize this Dt32AcqexpInd
	 */
   protected void serializeDt32AcqexpInd(char[] dt32AcqexpInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt32AcqexpInd,0,getStringValue(),beginDt32AcqexpInd,DT_32_ACQEXP_IND_LEN);
       localDt32AcqexpIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt32AcqexpIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt32AcqexpInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt32AcqexpInd() {	 
   		return (substring(getStringValue(),beginDt32AcqexpInd,beginDt32AcqexpInd + DT_32_ACQEXP_IND_LEN));
   	}




}
  

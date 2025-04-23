package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage3Ln3Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage3Ln3Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage3Ln3Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_3_LN_3_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt33Cc;
            protected  int beginDt33AcqintDbAmt;
            protected  int beginDt33AcqintCrAmt;
            protected  int beginDt33AcqintNetAmt;
            protected  int beginDt33AcqintInd;
	
	/**
	* Constructor for DtPage3Ln3Serialized
	**/
    public DtPage3Ln3Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage3Ln3Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_3_LN_3_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt33Cc = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
             beginDt33AcqintDbAmt = getStartOffset() + 36;	// set offset for serialization
  
  
             beginDt33AcqintCrAmt = getStartOffset() + 67;	// set offset for serialization
  
  
             beginDt33AcqintNetAmt = getStartOffset() + 95;	// set offset for serialization
  
  
             beginDt33AcqintInd = getStartOffset() + 117;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt33CcCounter = -1;
     public boolean isDt33CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt33CcCounter != sharedCounter;
         localDt33CcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_33_CC_LEN = 1;
	/**
	 * 	serialize this Dt33Cc
	 */
   protected void serializeDt33Cc(char[] dt33Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt33Cc,0,getStringValue(),beginDt33Cc,DT_33_CC_LEN);
       localDt33CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt33CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt33Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt33Cc() {	 
   		return (substring(getStringValue(),beginDt33Cc,beginDt33Cc + DT_33_CC_LEN));
   	}
     int localDt33AcqintDbAmtCounter = -1;
     public boolean isDt33AcqintDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt33AcqintDbAmtCounter != sharedCounter;
         localDt33AcqintDbAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_33_ACQINT_DB_AMT_LEN = 20;
	/**
	 * 	serialize this Dt33AcqintDbAmt
	 */
   protected void serializeDt33AcqintDbAmt(char[] dt33AcqintDbAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt33AcqintDbAmt,0,getStringValue(),beginDt33AcqintDbAmt,DT_33_ACQINT_DB_AMT_LEN);
       localDt33AcqintDbAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt33AcqintDbAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshDt33AcqintDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt33AcqintDbAmt() {	 
   		return (substring(getStringValue(),beginDt33AcqintDbAmt,beginDt33AcqintDbAmt + DT_33_ACQINT_DB_AMT_LEN));
   	}
     int localDt33AcqintCrAmtCounter = -1;
     public boolean isDt33AcqintCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt33AcqintCrAmtCounter != sharedCounter;
         localDt33AcqintCrAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_33_ACQINT_CR_AMT_LEN = 20;
	/**
	 * 	serialize this Dt33AcqintCrAmt
	 */
   protected void serializeDt33AcqintCrAmt(char[] dt33AcqintCrAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt33AcqintCrAmt,0,getStringValue(),beginDt33AcqintCrAmt,DT_33_ACQINT_CR_AMT_LEN);
       localDt33AcqintCrAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt33AcqintCrAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshDt33AcqintCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt33AcqintCrAmt() {	 
   		return (substring(getStringValue(),beginDt33AcqintCrAmt,beginDt33AcqintCrAmt + DT_33_ACQINT_CR_AMT_LEN));
   	}
     int localDt33AcqintNetAmtCounter = -1;
     public boolean isDt33AcqintNetAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt33AcqintNetAmtCounter != sharedCounter;
         localDt33AcqintNetAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_33_ACQINT_NET_AMT_LEN = 20;
	/**
	 * 	serialize this Dt33AcqintNetAmt
	 */
   protected void serializeDt33AcqintNetAmt(char[] dt33AcqintNetAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt33AcqintNetAmt,0,getStringValue(),beginDt33AcqintNetAmt,DT_33_ACQINT_NET_AMT_LEN);
       localDt33AcqintNetAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt33AcqintNetAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshDt33AcqintNetAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt33AcqintNetAmt() {	 
   		return (substring(getStringValue(),beginDt33AcqintNetAmt,beginDt33AcqintNetAmt + DT_33_ACQINT_NET_AMT_LEN));
   	}
     int localDt33AcqintIndCounter = -1;
     public boolean isDt33AcqintIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt33AcqintIndCounter != sharedCounter;
         localDt33AcqintIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_33_ACQINT_IND_LEN = 2;
	/**
	 * 	serialize this Dt33AcqintInd
	 */
   protected void serializeDt33AcqintInd(char[] dt33AcqintInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt33AcqintInd,0,getStringValue(),beginDt33AcqintInd,DT_33_ACQINT_IND_LEN);
       localDt33AcqintIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt33AcqintIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt33AcqintInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt33AcqintInd() {	 
   		return (substring(getStringValue(),beginDt33AcqintInd,beginDt33AcqintInd + DT_33_ACQINT_IND_LEN));
   	}




}
  

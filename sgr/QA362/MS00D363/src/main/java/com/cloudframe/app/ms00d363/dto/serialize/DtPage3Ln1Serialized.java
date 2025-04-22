package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage3Ln1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage3Ln1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage3Ln1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_3_LN_1_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt31Cc;
            protected  int beginDt31AcqtrnDbAmt;
            protected  int beginDt31AcqtrnCrAmt;
            protected  int beginDt31AcqtrnNetAmt;
            protected  int beginDt31AcqtrnInd;
	
	/**
	* Constructor for DtPage3Ln1Serialized
	**/
    public DtPage3Ln1Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage3Ln1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_3_LN_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt31Cc = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
             beginDt31AcqtrnDbAmt = getStartOffset() + 34;	// set offset for serialization
  
  
             beginDt31AcqtrnCrAmt = getStartOffset() + 65;	// set offset for serialization
  
  
             beginDt31AcqtrnNetAmt = getStartOffset() + 93;	// set offset for serialization
  
  
             beginDt31AcqtrnInd = getStartOffset() + 117;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt31CcCounter = -1;
     public boolean isDt31CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt31CcCounter != sharedCounter;
         localDt31CcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_31_CC_LEN = 1;
	/**
	 * 	serialize this Dt31Cc
	 */
   protected void serializeDt31Cc(char[] dt31Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt31Cc,0,getStringValue(),beginDt31Cc,DT_31_CC_LEN);
       localDt31CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt31CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt31Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt31Cc() {	 
   		return (substring(getStringValue(),beginDt31Cc,beginDt31Cc + DT_31_CC_LEN));
   	}
     int localDt31AcqtrnDbAmtCounter = -1;
     public boolean isDt31AcqtrnDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt31AcqtrnDbAmtCounter != sharedCounter;
         localDt31AcqtrnDbAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_31_ACQTRN_DB_AMT_LEN = 18;
	/**
	 * 	serialize this Dt31AcqtrnDbAmt
	 */
   protected void serializeDt31AcqtrnDbAmt(char[] dt31AcqtrnDbAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt31AcqtrnDbAmt,0,getStringValue(),beginDt31AcqtrnDbAmt,DT_31_ACQTRN_DB_AMT_LEN);
       localDt31AcqtrnDbAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt31AcqtrnDbAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt31AcqtrnDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt31AcqtrnDbAmt() {	 
   		return (substring(getStringValue(),beginDt31AcqtrnDbAmt,beginDt31AcqtrnDbAmt + DT_31_ACQTRN_DB_AMT_LEN));
   	}
     int localDt31AcqtrnCrAmtCounter = -1;
     public boolean isDt31AcqtrnCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt31AcqtrnCrAmtCounter != sharedCounter;
         localDt31AcqtrnCrAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_31_ACQTRN_CR_AMT_LEN = 18;
	/**
	 * 	serialize this Dt31AcqtrnCrAmt
	 */
   protected void serializeDt31AcqtrnCrAmt(char[] dt31AcqtrnCrAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt31AcqtrnCrAmt,0,getStringValue(),beginDt31AcqtrnCrAmt,DT_31_ACQTRN_CR_AMT_LEN);
       localDt31AcqtrnCrAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt31AcqtrnCrAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt31AcqtrnCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt31AcqtrnCrAmt() {	 
   		return (substring(getStringValue(),beginDt31AcqtrnCrAmt,beginDt31AcqtrnCrAmt + DT_31_ACQTRN_CR_AMT_LEN));
   	}
     int localDt31AcqtrnNetAmtCounter = -1;
     public boolean isDt31AcqtrnNetAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt31AcqtrnNetAmtCounter != sharedCounter;
         localDt31AcqtrnNetAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_31_ACQTRN_NET_AMT_LEN = 18;
	/**
	 * 	serialize this Dt31AcqtrnNetAmt
	 */
   protected void serializeDt31AcqtrnNetAmt(char[] dt31AcqtrnNetAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt31AcqtrnNetAmt,0,getStringValue(),beginDt31AcqtrnNetAmt,DT_31_ACQTRN_NET_AMT_LEN);
       localDt31AcqtrnNetAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt31AcqtrnNetAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt31AcqtrnNetAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt31AcqtrnNetAmt() {	 
   		return (substring(getStringValue(),beginDt31AcqtrnNetAmt,beginDt31AcqtrnNetAmt + DT_31_ACQTRN_NET_AMT_LEN));
   	}
     int localDt31AcqtrnIndCounter = -1;
     public boolean isDt31AcqtrnIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt31AcqtrnIndCounter != sharedCounter;
         localDt31AcqtrnIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_31_ACQTRN_IND_LEN = 2;
	/**
	 * 	serialize this Dt31AcqtrnInd
	 */
   protected void serializeDt31AcqtrnInd(char[] dt31AcqtrnInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt31AcqtrnInd,0,getStringValue(),beginDt31AcqtrnInd,DT_31_ACQTRN_IND_LEN);
       localDt31AcqtrnIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt31AcqtrnIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt31AcqtrnInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt31AcqtrnInd() {	 
   		return (substring(getStringValue(),beginDt31AcqtrnInd,beginDt31AcqtrnInd + DT_31_ACQTRN_IND_LEN));
   	}




}
  

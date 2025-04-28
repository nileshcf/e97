package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage3Ln5Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage3Ln5Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage3Ln5Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_3_LN_5_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt35Cc;
            protected  int beginDt35IsstrnDbAmt;
            protected  int beginDt35IsstrnCrAmt;
            protected  int beginDt35IsstrnNetAmt;
            protected  int beginDt35IsstrnInd;
	
	/**
	* Constructor for DtPage3Ln5Serialized
	**/
    public DtPage3Ln5Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage3Ln5Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_3_LN_5_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt35Cc = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
             beginDt35IsstrnDbAmt = getStartOffset() + 34;	// set offset for serialization
  
  
             beginDt35IsstrnCrAmt = getStartOffset() + 65;	// set offset for serialization
  
  
             beginDt35IsstrnNetAmt = getStartOffset() + 93;	// set offset for serialization
  
  
             beginDt35IsstrnInd = getStartOffset() + 117;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt35CcCounter = -1;
     public boolean isDt35CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt35CcCounter != sharedCounter;
         localDt35CcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_35_CC_LEN = 1;
	/**
	 * 	serialize this Dt35Cc
	 */
   protected void serializeDt35Cc(char[] dt35Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt35Cc,0,getStringValue(),beginDt35Cc,DT_35_CC_LEN);
       localDt35CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt35CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt35Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt35Cc() {	 
   		return (substring(getStringValue(),beginDt35Cc,beginDt35Cc + DT_35_CC_LEN));
   	}
     int localDt35IsstrnDbAmtCounter = -1;
     public boolean isDt35IsstrnDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt35IsstrnDbAmtCounter != sharedCounter;
         localDt35IsstrnDbAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_35_ISSTRN_DB_AMT_LEN = 18;
	/**
	 * 	serialize this Dt35IsstrnDbAmt
	 */
   protected void serializeDt35IsstrnDbAmt(char[] dt35IsstrnDbAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt35IsstrnDbAmt,0,getStringValue(),beginDt35IsstrnDbAmt,DT_35_ISSTRN_DB_AMT_LEN);
       localDt35IsstrnDbAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt35IsstrnDbAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt35IsstrnDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt35IsstrnDbAmt() {	 
   		return (substring(getStringValue(),beginDt35IsstrnDbAmt,beginDt35IsstrnDbAmt + DT_35_ISSTRN_DB_AMT_LEN));
   	}
     int localDt35IsstrnCrAmtCounter = -1;
     public boolean isDt35IsstrnCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt35IsstrnCrAmtCounter != sharedCounter;
         localDt35IsstrnCrAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_35_ISSTRN_CR_AMT_LEN = 18;
	/**
	 * 	serialize this Dt35IsstrnCrAmt
	 */
   protected void serializeDt35IsstrnCrAmt(char[] dt35IsstrnCrAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt35IsstrnCrAmt,0,getStringValue(),beginDt35IsstrnCrAmt,DT_35_ISSTRN_CR_AMT_LEN);
       localDt35IsstrnCrAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt35IsstrnCrAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt35IsstrnCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt35IsstrnCrAmt() {	 
   		return (substring(getStringValue(),beginDt35IsstrnCrAmt,beginDt35IsstrnCrAmt + DT_35_ISSTRN_CR_AMT_LEN));
   	}
     int localDt35IsstrnNetAmtCounter = -1;
     public boolean isDt35IsstrnNetAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt35IsstrnNetAmtCounter != sharedCounter;
         localDt35IsstrnNetAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_35_ISSTRN_NET_AMT_LEN = 18;
	/**
	 * 	serialize this Dt35IsstrnNetAmt
	 */
   protected void serializeDt35IsstrnNetAmt(char[] dt35IsstrnNetAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt35IsstrnNetAmt,0,getStringValue(),beginDt35IsstrnNetAmt,DT_35_ISSTRN_NET_AMT_LEN);
       localDt35IsstrnNetAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt35IsstrnNetAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt35IsstrnNetAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt35IsstrnNetAmt() {	 
   		return (substring(getStringValue(),beginDt35IsstrnNetAmt,beginDt35IsstrnNetAmt + DT_35_ISSTRN_NET_AMT_LEN));
   	}
     int localDt35IsstrnIndCounter = -1;
     public boolean isDt35IsstrnIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt35IsstrnIndCounter != sharedCounter;
         localDt35IsstrnIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_35_ISSTRN_IND_LEN = 2;
	/**
	 * 	serialize this Dt35IsstrnInd
	 */
   protected void serializeDt35IsstrnInd(char[] dt35IsstrnInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt35IsstrnInd,0,getStringValue(),beginDt35IsstrnInd,DT_35_ISSTRN_IND_LEN);
       localDt35IsstrnIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt35IsstrnIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt35IsstrnInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt35IsstrnInd() {	 
   		return (substring(getStringValue(),beginDt35IsstrnInd,beginDt35IsstrnInd + DT_35_ISSTRN_IND_LEN));
   	}




}
  

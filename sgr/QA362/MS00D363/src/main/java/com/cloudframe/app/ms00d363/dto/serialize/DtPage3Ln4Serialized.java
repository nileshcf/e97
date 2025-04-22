package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage3Ln4Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage3Ln4Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage3Ln4Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_3_LN_4_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt34Cc;
            protected  int beginDt34AcqtotDbAmt;
            protected  int beginDt34AcqtotCrAmt;
            protected  int beginDt34AcqtotNetAmt;
            protected  int beginDt34AcqtotInd;
	
	/**
	* Constructor for DtPage3Ln4Serialized
	**/
    public DtPage3Ln4Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage3Ln4Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_3_LN_4_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt34Cc = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
             beginDt34AcqtotDbAmt = getStartOffset() + 32;	// set offset for serialization
  
  
             beginDt34AcqtotCrAmt = getStartOffset() + 63;	// set offset for serialization
  
  
             beginDt34AcqtotNetAmt = getStartOffset() + 91;	// set offset for serialization
  
  
             beginDt34AcqtotInd = getStartOffset() + 117;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt34CcCounter = -1;
     public boolean isDt34CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt34CcCounter != sharedCounter;
         localDt34CcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_34_CC_LEN = 1;
	/**
	 * 	serialize this Dt34Cc
	 */
   protected void serializeDt34Cc(char[] dt34Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt34Cc,0,getStringValue(),beginDt34Cc,DT_34_CC_LEN);
       localDt34CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt34CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt34Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt34Cc() {	 
   		return (substring(getStringValue(),beginDt34Cc,beginDt34Cc + DT_34_CC_LEN));
   	}
     int localDt34AcqtotDbAmtCounter = -1;
     public boolean isDt34AcqtotDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt34AcqtotDbAmtCounter != sharedCounter;
         localDt34AcqtotDbAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_34_ACQTOT_DB_AMT_LEN = 24;
	/**
	 * 	serialize this Dt34AcqtotDbAmt
	 */
   protected void serializeDt34AcqtotDbAmt(char[] dt34AcqtotDbAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt34AcqtotDbAmt,0,getStringValue(),beginDt34AcqtotDbAmt,DT_34_ACQTOT_DB_AMT_LEN);
       localDt34AcqtotDbAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt34AcqtotDbAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
    /**
	 *	refreshDt34AcqtotDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt34AcqtotDbAmt() {	 
   		return (substring(getStringValue(),beginDt34AcqtotDbAmt,beginDt34AcqtotDbAmt + DT_34_ACQTOT_DB_AMT_LEN));
   	}
     int localDt34AcqtotCrAmtCounter = -1;
     public boolean isDt34AcqtotCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt34AcqtotCrAmtCounter != sharedCounter;
         localDt34AcqtotCrAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_34_ACQTOT_CR_AMT_LEN = 24;
	/**
	 * 	serialize this Dt34AcqtotCrAmt
	 */
   protected void serializeDt34AcqtotCrAmt(char[] dt34AcqtotCrAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt34AcqtotCrAmt,0,getStringValue(),beginDt34AcqtotCrAmt,DT_34_ACQTOT_CR_AMT_LEN);
       localDt34AcqtotCrAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt34AcqtotCrAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
    /**
	 *	refreshDt34AcqtotCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt34AcqtotCrAmt() {	 
   		return (substring(getStringValue(),beginDt34AcqtotCrAmt,beginDt34AcqtotCrAmt + DT_34_ACQTOT_CR_AMT_LEN));
   	}
     int localDt34AcqtotNetAmtCounter = -1;
     public boolean isDt34AcqtotNetAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt34AcqtotNetAmtCounter != sharedCounter;
         localDt34AcqtotNetAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_34_ACQTOT_NET_AMT_LEN = 24;
	/**
	 * 	serialize this Dt34AcqtotNetAmt
	 */
   protected void serializeDt34AcqtotNetAmt(char[] dt34AcqtotNetAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt34AcqtotNetAmt,0,getStringValue(),beginDt34AcqtotNetAmt,DT_34_ACQTOT_NET_AMT_LEN);
       localDt34AcqtotNetAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt34AcqtotNetAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
    /**
	 *	refreshDt34AcqtotNetAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt34AcqtotNetAmt() {	 
   		return (substring(getStringValue(),beginDt34AcqtotNetAmt,beginDt34AcqtotNetAmt + DT_34_ACQTOT_NET_AMT_LEN));
   	}
     int localDt34AcqtotIndCounter = -1;
     public boolean isDt34AcqtotIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt34AcqtotIndCounter != sharedCounter;
         localDt34AcqtotIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_34_ACQTOT_IND_LEN = 2;
	/**
	 * 	serialize this Dt34AcqtotInd
	 */
   protected void serializeDt34AcqtotInd(char[] dt34AcqtotInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt34AcqtotInd,0,getStringValue(),beginDt34AcqtotInd,DT_34_ACQTOT_IND_LEN);
       localDt34AcqtotIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt34AcqtotIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt34AcqtotInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt34AcqtotInd() {	 
   		return (substring(getStringValue(),beginDt34AcqtotInd,beginDt34AcqtotInd + DT_34_ACQTOT_IND_LEN));
   	}




}
  

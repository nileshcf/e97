package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage2Ln6Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage2Ln6Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage2Ln6Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_2_LN_6_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt26Cc;
            protected  int beginDt26FeeDbAmt;
            protected  int beginDt26FeeCrAmt;
	
	/**
	* Constructor for DtPage2Ln6Serialized
	**/
    public DtPage2Ln6Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage2Ln6Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_2_LN_6_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt26Cc = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
  
             beginDt26FeeDbAmt = getStartOffset() + 47;	// set offset for serialization
  
  
  
  
             beginDt26FeeCrAmt = getStartOffset() + 86;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt26CcCounter = -1;
     public boolean isDt26CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt26CcCounter != sharedCounter;
         localDt26CcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_26_CC_LEN = 1;
	/**
	 * 	serialize this Dt26Cc
	 */
   protected void serializeDt26Cc(char[] dt26Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt26Cc,0,getStringValue(),beginDt26Cc,DT_26_CC_LEN);
       localDt26CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt26CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt26Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt26Cc() {	 
   		return (substring(getStringValue(),beginDt26Cc,beginDt26Cc + DT_26_CC_LEN));
   	}
     int localDt26FeeDbAmtCounter = -1;
     public boolean isDt26FeeDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt26FeeDbAmtCounter != sharedCounter;
         localDt26FeeDbAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_26_FEE_DB_AMT_LEN = 20;
	/**
	 * 	serialize this Dt26FeeDbAmt
	 */
   protected void serializeDt26FeeDbAmt(char[] dt26FeeDbAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt26FeeDbAmt,0,getStringValue(),beginDt26FeeDbAmt,DT_26_FEE_DB_AMT_LEN);
       localDt26FeeDbAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt26FeeDbAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshDt26FeeDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt26FeeDbAmt() {	 
   		return (substring(getStringValue(),beginDt26FeeDbAmt,beginDt26FeeDbAmt + DT_26_FEE_DB_AMT_LEN));
   	}
     int localDt26FeeCrAmtCounter = -1;
     public boolean isDt26FeeCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt26FeeCrAmtCounter != sharedCounter;
         localDt26FeeCrAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_26_FEE_CR_AMT_LEN = 20;
	/**
	 * 	serialize this Dt26FeeCrAmt
	 */
   protected void serializeDt26FeeCrAmt(char[] dt26FeeCrAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt26FeeCrAmt,0,getStringValue(),beginDt26FeeCrAmt,DT_26_FEE_CR_AMT_LEN);
       localDt26FeeCrAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt26FeeCrAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshDt26FeeCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt26FeeCrAmt() {	 
   		return (substring(getStringValue(),beginDt26FeeCrAmt,beginDt26FeeCrAmt + DT_26_FEE_CR_AMT_LEN));
   	}




}
  

package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage2Ln5Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage2Ln5Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage2Ln5Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_2_LN_5_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt25Cc;
            protected  int beginDt25TfnDbAmt;
            protected  int beginDt25TfnCrAmt;
	
	/**
	* Constructor for DtPage2Ln5Serialized
	**/
    public DtPage2Ln5Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage2Ln5Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_2_LN_5_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt25Cc = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
  
             beginDt25TfnDbAmt = getStartOffset() + 45;	// set offset for serialization
  
  
  
  
             beginDt25TfnCrAmt = getStartOffset() + 84;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt25CcCounter = -1;
     public boolean isDt25CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt25CcCounter != sharedCounter;
         localDt25CcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_25_CC_LEN = 1;
	/**
	 * 	serialize this Dt25Cc
	 */
   protected void serializeDt25Cc(char[] dt25Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt25Cc,0,getStringValue(),beginDt25Cc,DT_25_CC_LEN);
       localDt25CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt25CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt25Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt25Cc() {	 
   		return (substring(getStringValue(),beginDt25Cc,beginDt25Cc + DT_25_CC_LEN));
   	}
     int localDt25TfnDbAmtCounter = -1;
     public boolean isDt25TfnDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt25TfnDbAmtCounter != sharedCounter;
         localDt25TfnDbAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_25_TFN_DB_AMT_LEN = 18;
	/**
	 * 	serialize this Dt25TfnDbAmt
	 */
   protected void serializeDt25TfnDbAmt(char[] dt25TfnDbAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt25TfnDbAmt,0,getStringValue(),beginDt25TfnDbAmt,DT_25_TFN_DB_AMT_LEN);
       localDt25TfnDbAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt25TfnDbAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt25TfnDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt25TfnDbAmt() {	 
   		return (substring(getStringValue(),beginDt25TfnDbAmt,beginDt25TfnDbAmt + DT_25_TFN_DB_AMT_LEN));
   	}
     int localDt25TfnCrAmtCounter = -1;
     public boolean isDt25TfnCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt25TfnCrAmtCounter != sharedCounter;
         localDt25TfnCrAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_25_TFN_CR_AMT_LEN = 18;
	/**
	 * 	serialize this Dt25TfnCrAmt
	 */
   protected void serializeDt25TfnCrAmt(char[] dt25TfnCrAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt25TfnCrAmt,0,getStringValue(),beginDt25TfnCrAmt,DT_25_TFN_CR_AMT_LEN);
       localDt25TfnCrAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt25TfnCrAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt25TfnCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt25TfnCrAmt() {	 
   		return (substring(getStringValue(),beginDt25TfnCrAmt,beginDt25TfnCrAmt + DT_25_TFN_CR_AMT_LEN));
   	}




}
  

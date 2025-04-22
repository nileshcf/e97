package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage3Ln2aSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage3Ln2aSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage3Ln2aSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_3_LN_2A_LENGTH = 128;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt32aCc;
            protected  int beginDt32aTotalAmt;
            protected  int beginDt32aInd;
	
	/**
	* Constructor for DtPage3Ln2aSerialized
	**/
    public DtPage3Ln2aSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage3Ln2aSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_3_LN_2A_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt32aCc = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
             beginDt32aTotalAmt = getStartOffset() + 74;	// set offset for serialization
  
  
             beginDt32aInd = getStartOffset() + 97;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt32aCcCounter = -1;
     public boolean isDt32aCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt32aCcCounter != sharedCounter;
         localDt32aCcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_32A_CC_LEN = 1;
	/**
	 * 	serialize this Dt32aCc
	 */
   protected void serializeDt32aCc(char[] dt32aCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt32aCc,0,getStringValue(),beginDt32aCc,DT_32A_CC_LEN);
       localDt32aCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt32aCcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt32aCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt32aCc() {	 
   		return (substring(getStringValue(),beginDt32aCc,beginDt32aCc + DT_32A_CC_LEN));
   	}
     int localDt32aTotalAmtCounter = -1;
     public boolean isDt32aTotalAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt32aTotalAmtCounter != sharedCounter;
         localDt32aTotalAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_32A_TOTAL_AMT_LEN = 22;
	/**
	 * 	serialize this Dt32aTotalAmt
	 */
   protected void serializeDt32aTotalAmt(char[] dt32aTotalAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt32aTotalAmt,0,getStringValue(),beginDt32aTotalAmt,DT_32A_TOTAL_AMT_LEN);
       localDt32aTotalAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt32aTotalAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 22 ,false, false);
   }
    /**
	 *	refreshDt32aTotalAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt32aTotalAmt() {	 
   		return (substring(getStringValue(),beginDt32aTotalAmt,beginDt32aTotalAmt + DT_32A_TOTAL_AMT_LEN));
   	}
     int localDt32aIndCounter = -1;
     public boolean isDt32aIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt32aIndCounter != sharedCounter;
         localDt32aIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_32A_IND_LEN = 1;
	/**
	 * 	serialize this Dt32aInd
	 */
   protected void serializeDt32aInd(char[] dt32aInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt32aInd,0,getStringValue(),beginDt32aInd,DT_32A_IND_LEN);
       localDt32aIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt32aIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt32aInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt32aInd() {	 
   		return (substring(getStringValue(),beginDt32aInd,beginDt32aInd + DT_32A_IND_LEN));
   	}




}
  

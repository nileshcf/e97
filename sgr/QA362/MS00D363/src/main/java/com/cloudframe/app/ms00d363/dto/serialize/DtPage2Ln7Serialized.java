package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage2Ln7Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage2Ln7Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage2Ln7Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_2_LN_7_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt27Cc;
            protected  int beginDt27IntDbAmt;
            protected  int beginDt27IntCrAmt;
	
	/**
	* Constructor for DtPage2Ln7Serialized
	**/
    public DtPage2Ln7Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage2Ln7Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_2_LN_7_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt27Cc = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
             beginDt27IntDbAmt = getStartOffset() + 43;	// set offset for serialization
  
  
  
             beginDt27IntCrAmt = getStartOffset() + 82;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt27CcCounter = -1;
     public boolean isDt27CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt27CcCounter != sharedCounter;
         localDt27CcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_27_CC_LEN = 1;
	/**
	 * 	serialize this Dt27Cc
	 */
   protected void serializeDt27Cc(char[] dt27Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt27Cc,0,getStringValue(),beginDt27Cc,DT_27_CC_LEN);
       localDt27CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt27CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt27Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt27Cc() {	 
   		return (substring(getStringValue(),beginDt27Cc,beginDt27Cc + DT_27_CC_LEN));
   	}
     int localDt27IntDbAmtCounter = -1;
     public boolean isDt27IntDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt27IntDbAmtCounter != sharedCounter;
         localDt27IntDbAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_27_INT_DB_AMT_LEN = 24;
	/**
	 * 	serialize this Dt27IntDbAmt
	 */
   protected void serializeDt27IntDbAmt(char[] dt27IntDbAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt27IntDbAmt,0,getStringValue(),beginDt27IntDbAmt,DT_27_INT_DB_AMT_LEN);
       localDt27IntDbAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt27IntDbAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
    /**
	 *	refreshDt27IntDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt27IntDbAmt() {	 
   		return (substring(getStringValue(),beginDt27IntDbAmt,beginDt27IntDbAmt + DT_27_INT_DB_AMT_LEN));
   	}
     int localDt27IntCrAmtCounter = -1;
     public boolean isDt27IntCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt27IntCrAmtCounter != sharedCounter;
         localDt27IntCrAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_27_INT_CR_AMT_LEN = 24;
	/**
	 * 	serialize this Dt27IntCrAmt
	 */
   protected void serializeDt27IntCrAmt(char[] dt27IntCrAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt27IntCrAmt,0,getStringValue(),beginDt27IntCrAmt,DT_27_INT_CR_AMT_LEN);
       localDt27IntCrAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt27IntCrAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
    /**
	 *	refreshDt27IntCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt27IntCrAmt() {	 
   		return (substring(getStringValue(),beginDt27IntCrAmt,beginDt27IntCrAmt + DT_27_INT_CR_AMT_LEN));
   	}




}
  

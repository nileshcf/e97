package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage2Ln5bSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage2Ln5bSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage2Ln5bSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_2_LN_5B_LENGTH = 136;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt25bCc;
            protected  int beginDt25bRevDbAmt;
            protected  int beginDt25bRevCrAmt;
	
	/**
	* Constructor for DtPage2Ln5bSerialized
	**/
    public DtPage2Ln5bSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage2Ln5bSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_2_LN_5B_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt25bCc = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
             beginDt25bRevDbAmt = getStartOffset() + 48;	// set offset for serialization
  
  
  
             beginDt25bRevCrAmt = getStartOffset() + 87;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt25bCcCounter = -1;
     public boolean isDt25bCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt25bCcCounter != sharedCounter;
         localDt25bCcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_25B_CC_LEN = 1;
	/**
	 * 	serialize this Dt25bCc
	 */
   protected void serializeDt25bCc(char[] dt25bCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt25bCc,0,getStringValue(),beginDt25bCc,DT_25B_CC_LEN);
       localDt25bCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt25bCcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt25bCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt25bCc() {	 
   		return (substring(getStringValue(),beginDt25bCc,beginDt25bCc + DT_25B_CC_LEN));
   	}
     int localDt25bRevDbAmtCounter = -1;
     public boolean isDt25bRevDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt25bRevDbAmtCounter != sharedCounter;
         localDt25bRevDbAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_25B_REV_DB_AMT_LEN = 18;
	/**
	 * 	serialize this Dt25bRevDbAmt
	 */
   protected void serializeDt25bRevDbAmt(char[] dt25bRevDbAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt25bRevDbAmt,0,getStringValue(),beginDt25bRevDbAmt,DT_25B_REV_DB_AMT_LEN);
       localDt25bRevDbAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt25bRevDbAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt25bRevDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt25bRevDbAmt() {	 
   		return (substring(getStringValue(),beginDt25bRevDbAmt,beginDt25bRevDbAmt + DT_25B_REV_DB_AMT_LEN));
   	}
     int localDt25bRevCrAmtCounter = -1;
     public boolean isDt25bRevCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt25bRevCrAmtCounter != sharedCounter;
         localDt25bRevCrAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_25B_REV_CR_AMT_LEN = 18;
	/**
	 * 	serialize this Dt25bRevCrAmt
	 */
   protected void serializeDt25bRevCrAmt(char[] dt25bRevCrAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt25bRevCrAmt,0,getStringValue(),beginDt25bRevCrAmt,DT_25B_REV_CR_AMT_LEN);
       localDt25bRevCrAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt25bRevCrAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt25bRevCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt25bRevCrAmt() {	 
   		return (substring(getStringValue(),beginDt25bRevCrAmt,beginDt25bRevCrAmt + DT_25B_REV_CR_AMT_LEN));
   	}




}
  

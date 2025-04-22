package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage2Ln8bSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage2Ln8bSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage2Ln8bSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_2_LN_8B_LENGTH = 131;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt28bCc;
            protected  int beginDt28bIccrDbAmt;
            protected  int beginDt28bIccrCrAmt;
	
	/**
	* Constructor for DtPage2Ln8bSerialized
	**/
    public DtPage2Ln8bSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage2Ln8bSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_2_LN_8B_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt28bCc = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
  
             beginDt28bIccrDbAmt = getStartOffset() + 45;	// set offset for serialization
  
  
  
  
             beginDt28bIccrCrAmt = getStartOffset() + 84;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt28bCcCounter = -1;
     public boolean isDt28bCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt28bCcCounter != sharedCounter;
         localDt28bCcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_28B_CC_LEN = 1;
	/**
	 * 	serialize this Dt28bCc
	 */
   protected void serializeDt28bCc(char[] dt28bCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt28bCc,0,getStringValue(),beginDt28bCc,DT_28B_CC_LEN);
       localDt28bCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt28bCcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt28bCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt28bCc() {	 
   		return (substring(getStringValue(),beginDt28bCc,beginDt28bCc + DT_28B_CC_LEN));
   	}
     int localDt28bIccrDbAmtCounter = -1;
     public boolean isDt28bIccrDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt28bIccrDbAmtCounter != sharedCounter;
         localDt28bIccrDbAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_28B_ICCR_DB_AMT_LEN = 18;
	/**
	 * 	serialize this Dt28bIccrDbAmt
	 */
   protected void serializeDt28bIccrDbAmt(char[] dt28bIccrDbAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt28bIccrDbAmt,0,getStringValue(),beginDt28bIccrDbAmt,DT_28B_ICCR_DB_AMT_LEN);
       localDt28bIccrDbAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt28bIccrDbAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt28bIccrDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt28bIccrDbAmt() {	 
   		return (substring(getStringValue(),beginDt28bIccrDbAmt,beginDt28bIccrDbAmt + DT_28B_ICCR_DB_AMT_LEN));
   	}
     int localDt28bIccrCrAmtCounter = -1;
     public boolean isDt28bIccrCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt28bIccrCrAmtCounter != sharedCounter;
         localDt28bIccrCrAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_28B_ICCR_CR_AMT_LEN = 18;
	/**
	 * 	serialize this Dt28bIccrCrAmt
	 */
   protected void serializeDt28bIccrCrAmt(char[] dt28bIccrCrAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt28bIccrCrAmt,0,getStringValue(),beginDt28bIccrCrAmt,DT_28B_ICCR_CR_AMT_LEN);
       localDt28bIccrCrAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt28bIccrCrAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt28bIccrCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt28bIccrCrAmt() {	 
   		return (substring(getStringValue(),beginDt28bIccrCrAmt,beginDt28bIccrCrAmt + DT_28B_ICCR_CR_AMT_LEN));
   	}




}
  

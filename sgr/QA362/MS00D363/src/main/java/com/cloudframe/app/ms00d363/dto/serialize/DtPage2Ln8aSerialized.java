package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage2Ln8aSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage2Ln8aSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage2Ln8aSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_2_LN_8A_LENGTH = 131;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt28aCc;
            protected  int beginDt28aCcaDbAmt;
            protected  int beginDt28aCcaCrAmt;
	
	/**
	* Constructor for DtPage2Ln8aSerialized
	**/
    public DtPage2Ln8aSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage2Ln8aSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_2_LN_8A_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt28aCc = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
  
             beginDt28aCcaDbAmt = getStartOffset() + 45;	// set offset for serialization
  
  
  
  
             beginDt28aCcaCrAmt = getStartOffset() + 84;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt28aCcCounter = -1;
     public boolean isDt28aCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt28aCcCounter != sharedCounter;
         localDt28aCcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_28A_CC_LEN = 1;
	/**
	 * 	serialize this Dt28aCc
	 */
   protected void serializeDt28aCc(char[] dt28aCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt28aCc,0,getStringValue(),beginDt28aCc,DT_28A_CC_LEN);
       localDt28aCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt28aCcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt28aCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt28aCc() {	 
   		return (substring(getStringValue(),beginDt28aCc,beginDt28aCc + DT_28A_CC_LEN));
   	}
     int localDt28aCcaDbAmtCounter = -1;
     public boolean isDt28aCcaDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt28aCcaDbAmtCounter != sharedCounter;
         localDt28aCcaDbAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_28A_CCA_DB_AMT_LEN = 18;
	/**
	 * 	serialize this Dt28aCcaDbAmt
	 */
   protected void serializeDt28aCcaDbAmt(char[] dt28aCcaDbAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt28aCcaDbAmt,0,getStringValue(),beginDt28aCcaDbAmt,DT_28A_CCA_DB_AMT_LEN);
       localDt28aCcaDbAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt28aCcaDbAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt28aCcaDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt28aCcaDbAmt() {	 
   		return (substring(getStringValue(),beginDt28aCcaDbAmt,beginDt28aCcaDbAmt + DT_28A_CCA_DB_AMT_LEN));
   	}
     int localDt28aCcaCrAmtCounter = -1;
     public boolean isDt28aCcaCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt28aCcaCrAmtCounter != sharedCounter;
         localDt28aCcaCrAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_28A_CCA_CR_AMT_LEN = 18;
	/**
	 * 	serialize this Dt28aCcaCrAmt
	 */
   protected void serializeDt28aCcaCrAmt(char[] dt28aCcaCrAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt28aCcaCrAmt,0,getStringValue(),beginDt28aCcaCrAmt,DT_28A_CCA_CR_AMT_LEN);
       localDt28aCcaCrAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt28aCcaCrAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt28aCcaCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt28aCcaCrAmt() {	 
   		return (substring(getStringValue(),beginDt28aCcaCrAmt,beginDt28aCcaCrAmt + DT_28A_CCA_CR_AMT_LEN));
   	}




}
  

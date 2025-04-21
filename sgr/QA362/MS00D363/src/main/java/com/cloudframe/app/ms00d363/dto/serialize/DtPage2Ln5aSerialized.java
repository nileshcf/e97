package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage2Ln5aSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage2Ln5aSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage2Ln5aSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_2_LN_5A_LENGTH = 136;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt25aCc;
            protected  int beginDt25aR09DbAmt;
            protected  int beginDt25aR09CrAmt;
	
	/**
	* Constructor for DtPage2Ln5aSerialized
	**/
    public DtPage2Ln5aSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage2Ln5aSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_2_LN_5A_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt25aCc = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
             beginDt25aR09DbAmt = getStartOffset() + 48;	// set offset for serialization
  
  
  
             beginDt25aR09CrAmt = getStartOffset() + 87;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt25aCcCounter = -1;
     public boolean isDt25aCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt25aCcCounter != sharedCounter;
         localDt25aCcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_25A_CC_LEN = 1;
	/**
	 * 	serialize this Dt25aCc
	 */
   protected void serializeDt25aCc(char[] dt25aCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt25aCc,0,getStringValue(),beginDt25aCc,DT_25A_CC_LEN);
       localDt25aCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt25aCcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt25aCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt25aCc() {	 
   		return (substring(getStringValue(),beginDt25aCc,beginDt25aCc + DT_25A_CC_LEN));
   	}
     int localDt25aR09DbAmtCounter = -1;
     public boolean isDt25aR09DbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt25aR09DbAmtCounter != sharedCounter;
         localDt25aR09DbAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_25A_R_09_DB_AMT_LEN = 18;
	/**
	 * 	serialize this Dt25aR09DbAmt
	 */
   protected void serializeDt25aR09DbAmt(char[] dt25aR09DbAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt25aR09DbAmt,0,getStringValue(),beginDt25aR09DbAmt,DT_25A_R_09_DB_AMT_LEN);
       localDt25aR09DbAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt25aR09DbAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt25aR09DbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt25aR09DbAmt() {	 
   		return (substring(getStringValue(),beginDt25aR09DbAmt,beginDt25aR09DbAmt + DT_25A_R_09_DB_AMT_LEN));
   	}
     int localDt25aR09CrAmtCounter = -1;
     public boolean isDt25aR09CrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt25aR09CrAmtCounter != sharedCounter;
         localDt25aR09CrAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_25A_R_09_CR_AMT_LEN = 18;
	/**
	 * 	serialize this Dt25aR09CrAmt
	 */
   protected void serializeDt25aR09CrAmt(char[] dt25aR09CrAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt25aR09CrAmt,0,getStringValue(),beginDt25aR09CrAmt,DT_25A_R_09_CR_AMT_LEN);
       localDt25aR09CrAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt25aR09CrAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt25aR09CrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt25aR09CrAmt() {	 
   		return (substring(getStringValue(),beginDt25aR09CrAmt,beginDt25aR09CrAmt + DT_25A_R_09_CR_AMT_LEN));
   	}




}
  

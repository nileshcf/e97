package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage2Ln8Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage2Ln8Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage2Ln8Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_2_LN_8_LENGTH = 131;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt28Cc;
            protected  int beginDt28AtmDbNbr;
            protected  int beginDt28AtmDbAmt;
            protected  int beginDt28AtmCrNbr;
            protected  int beginDt28AtmCrAmt;
	
	/**
	* Constructor for DtPage2Ln8Serialized
	**/
    public DtPage2Ln8Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage2Ln8Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_2_LN_8_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt28Cc = getStartOffset() + 0;	// set offset for serialization
  
  
  
             beginDt28AtmDbNbr = getStartOffset() + 28;	// set offset for serialization
  
  
             beginDt28AtmDbAmt = getStartOffset() + 45;	// set offset for serialization
  
  
             beginDt28AtmCrNbr = getStartOffset() + 67;	// set offset for serialization
  
  
             beginDt28AtmCrAmt = getStartOffset() + 84;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt28CcCounter = -1;
     public boolean isDt28CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt28CcCounter != sharedCounter;
         localDt28CcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_28_CC_LEN = 1;
	/**
	 * 	serialize this Dt28Cc
	 */
   protected void serializeDt28Cc(char[] dt28Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt28Cc,0,getStringValue(),beginDt28Cc,DT_28_CC_LEN);
       localDt28CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt28CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt28Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt28Cc() {	 
   		return (substring(getStringValue(),beginDt28Cc,beginDt28Cc + DT_28_CC_LEN));
   	}
     int localDt28AtmDbNbrCounter = -1;
     public boolean isDt28AtmDbNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt28AtmDbNbrCounter != sharedCounter;
         localDt28AtmDbNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_28_ATM_DB_NBR_LEN = 15;
	/**
	 * 	serialize this Dt28AtmDbNbr
	 */
   protected void serializeDt28AtmDbNbr(char[] dt28AtmDbNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt28AtmDbNbr,0,getStringValue(),beginDt28AtmDbNbr,DT_28_ATM_DB_NBR_LEN);
       localDt28AtmDbNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt28AtmDbNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshDt28AtmDbNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt28AtmDbNbr() {	 
   		return (substring(getStringValue(),beginDt28AtmDbNbr,beginDt28AtmDbNbr + DT_28_ATM_DB_NBR_LEN));
   	}
     int localDt28AtmDbAmtCounter = -1;
     public boolean isDt28AtmDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt28AtmDbAmtCounter != sharedCounter;
         localDt28AtmDbAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_28_ATM_DB_AMT_LEN = 18;
	/**
	 * 	serialize this Dt28AtmDbAmt
	 */
   protected void serializeDt28AtmDbAmt(char[] dt28AtmDbAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt28AtmDbAmt,0,getStringValue(),beginDt28AtmDbAmt,DT_28_ATM_DB_AMT_LEN);
       localDt28AtmDbAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt28AtmDbAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt28AtmDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt28AtmDbAmt() {	 
   		return (substring(getStringValue(),beginDt28AtmDbAmt,beginDt28AtmDbAmt + DT_28_ATM_DB_AMT_LEN));
   	}
     int localDt28AtmCrNbrCounter = -1;
     public boolean isDt28AtmCrNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt28AtmCrNbrCounter != sharedCounter;
         localDt28AtmCrNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_28_ATM_CR_NBR_LEN = 15;
	/**
	 * 	serialize this Dt28AtmCrNbr
	 */
   protected void serializeDt28AtmCrNbr(char[] dt28AtmCrNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt28AtmCrNbr,0,getStringValue(),beginDt28AtmCrNbr,DT_28_ATM_CR_NBR_LEN);
       localDt28AtmCrNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt28AtmCrNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshDt28AtmCrNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt28AtmCrNbr() {	 
   		return (substring(getStringValue(),beginDt28AtmCrNbr,beginDt28AtmCrNbr + DT_28_ATM_CR_NBR_LEN));
   	}
     int localDt28AtmCrAmtCounter = -1;
     public boolean isDt28AtmCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt28AtmCrAmtCounter != sharedCounter;
         localDt28AtmCrAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_28_ATM_CR_AMT_LEN = 18;
	/**
	 * 	serialize this Dt28AtmCrAmt
	 */
   protected void serializeDt28AtmCrAmt(char[] dt28AtmCrAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt28AtmCrAmt,0,getStringValue(),beginDt28AtmCrAmt,DT_28_ATM_CR_AMT_LEN);
       localDt28AtmCrAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt28AtmCrAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt28AtmCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt28AtmCrAmt() {	 
   		return (substring(getStringValue(),beginDt28AtmCrAmt,beginDt28AtmCrAmt + DT_28_ATM_CR_AMT_LEN));
   	}




}
  

package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage2Ln8ccSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage2Ln8ccSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage2Ln8ccSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_2_LN_8CC_LENGTH = 131;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt28ccCc;
            protected  int beginDt28ccPosDbNbr;
            protected  int beginDt28ccPosDbAmt;
            protected  int beginDt28ccPosCrNbr;
            protected  int beginDt28ccPosCrAmt;
	
	/**
	* Constructor for DtPage2Ln8ccSerialized
	**/
    public DtPage2Ln8ccSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage2Ln8ccSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_2_LN_8CC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt28ccCc = getStartOffset() + 0;	// set offset for serialization
  
  
  
             beginDt28ccPosDbNbr = getStartOffset() + 28;	// set offset for serialization
  
  
             beginDt28ccPosDbAmt = getStartOffset() + 45;	// set offset for serialization
  
  
             beginDt28ccPosCrNbr = getStartOffset() + 67;	// set offset for serialization
  
  
             beginDt28ccPosCrAmt = getStartOffset() + 84;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt28ccCcCounter = -1;
     public boolean isDt28ccCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt28ccCcCounter != sharedCounter;
         localDt28ccCcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_28CC_CC_LEN = 1;
	/**
	 * 	serialize this Dt28ccCc
	 */
   protected void serializeDt28ccCc(char[] dt28ccCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt28ccCc,0,getStringValue(),beginDt28ccCc,DT_28CC_CC_LEN);
       localDt28ccCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt28ccCcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt28ccCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt28ccCc() {	 
   		return (substring(getStringValue(),beginDt28ccCc,beginDt28ccCc + DT_28CC_CC_LEN));
   	}
     int localDt28ccPosDbNbrCounter = -1;
     public boolean isDt28ccPosDbNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt28ccPosDbNbrCounter != sharedCounter;
         localDt28ccPosDbNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_28CC_POS_DB_NBR_LEN = 15;
	/**
	 * 	serialize this Dt28ccPosDbNbr
	 */
   protected void serializeDt28ccPosDbNbr(char[] dt28ccPosDbNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt28ccPosDbNbr,0,getStringValue(),beginDt28ccPosDbNbr,DT_28CC_POS_DB_NBR_LEN);
       localDt28ccPosDbNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt28ccPosDbNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshDt28ccPosDbNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt28ccPosDbNbr() {	 
   		return (substring(getStringValue(),beginDt28ccPosDbNbr,beginDt28ccPosDbNbr + DT_28CC_POS_DB_NBR_LEN));
   	}
     int localDt28ccPosDbAmtCounter = -1;
     public boolean isDt28ccPosDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt28ccPosDbAmtCounter != sharedCounter;
         localDt28ccPosDbAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_28CC_POS_DB_AMT_LEN = 18;
	/**
	 * 	serialize this Dt28ccPosDbAmt
	 */
   protected void serializeDt28ccPosDbAmt(char[] dt28ccPosDbAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt28ccPosDbAmt,0,getStringValue(),beginDt28ccPosDbAmt,DT_28CC_POS_DB_AMT_LEN);
       localDt28ccPosDbAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt28ccPosDbAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt28ccPosDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt28ccPosDbAmt() {	 
   		return (substring(getStringValue(),beginDt28ccPosDbAmt,beginDt28ccPosDbAmt + DT_28CC_POS_DB_AMT_LEN));
   	}
     int localDt28ccPosCrNbrCounter = -1;
     public boolean isDt28ccPosCrNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt28ccPosCrNbrCounter != sharedCounter;
         localDt28ccPosCrNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_28CC_POS_CR_NBR_LEN = 15;
	/**
	 * 	serialize this Dt28ccPosCrNbr
	 */
   protected void serializeDt28ccPosCrNbr(char[] dt28ccPosCrNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt28ccPosCrNbr,0,getStringValue(),beginDt28ccPosCrNbr,DT_28CC_POS_CR_NBR_LEN);
       localDt28ccPosCrNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt28ccPosCrNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshDt28ccPosCrNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt28ccPosCrNbr() {	 
   		return (substring(getStringValue(),beginDt28ccPosCrNbr,beginDt28ccPosCrNbr + DT_28CC_POS_CR_NBR_LEN));
   	}
     int localDt28ccPosCrAmtCounter = -1;
     public boolean isDt28ccPosCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt28ccPosCrAmtCounter != sharedCounter;
         localDt28ccPosCrAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_28CC_POS_CR_AMT_LEN = 18;
	/**
	 * 	serialize this Dt28ccPosCrAmt
	 */
   protected void serializeDt28ccPosCrAmt(char[] dt28ccPosCrAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt28ccPosCrAmt,0,getStringValue(),beginDt28ccPosCrAmt,DT_28CC_POS_CR_AMT_LEN);
       localDt28ccPosCrAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt28ccPosCrAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt28ccPosCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt28ccPosCrAmt() {	 
   		return (substring(getStringValue(),beginDt28ccPosCrAmt,beginDt28ccPosCrAmt + DT_28CC_POS_CR_AMT_LEN));
   	}




}
  

package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage2Ln8aaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage2Ln8aaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage2Ln8aaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_2_LN_8AA_LENGTH = 131;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt28aaCc;
            protected  int beginDt28aaPosDbNbr;
            protected  int beginDt28aaPosDbAmt;
            protected  int beginDt28aaPosCrNbr;
            protected  int beginDt28aaPosCrAmt;
	
	/**
	* Constructor for DtPage2Ln8aaSerialized
	**/
    public DtPage2Ln8aaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage2Ln8aaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_2_LN_8AA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt28aaCc = getStartOffset() + 0;	// set offset for serialization
  
  
  
             beginDt28aaPosDbNbr = getStartOffset() + 28;	// set offset for serialization
  
  
             beginDt28aaPosDbAmt = getStartOffset() + 45;	// set offset for serialization
  
  
             beginDt28aaPosCrNbr = getStartOffset() + 67;	// set offset for serialization
  
  
             beginDt28aaPosCrAmt = getStartOffset() + 84;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt28aaCcCounter = -1;
     public boolean isDt28aaCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt28aaCcCounter != sharedCounter;
         localDt28aaCcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_28AA_CC_LEN = 1;
	/**
	 * 	serialize this Dt28aaCc
	 */
   protected void serializeDt28aaCc(char[] dt28aaCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt28aaCc,0,getStringValue(),beginDt28aaCc,DT_28AA_CC_LEN);
       localDt28aaCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt28aaCcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt28aaCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt28aaCc() {	 
   		return (substring(getStringValue(),beginDt28aaCc,beginDt28aaCc + DT_28AA_CC_LEN));
   	}
     int localDt28aaPosDbNbrCounter = -1;
     public boolean isDt28aaPosDbNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt28aaPosDbNbrCounter != sharedCounter;
         localDt28aaPosDbNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_28AA_POS_DB_NBR_LEN = 15;
	/**
	 * 	serialize this Dt28aaPosDbNbr
	 */
   protected void serializeDt28aaPosDbNbr(char[] dt28aaPosDbNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt28aaPosDbNbr,0,getStringValue(),beginDt28aaPosDbNbr,DT_28AA_POS_DB_NBR_LEN);
       localDt28aaPosDbNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt28aaPosDbNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshDt28aaPosDbNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt28aaPosDbNbr() {	 
   		return (substring(getStringValue(),beginDt28aaPosDbNbr,beginDt28aaPosDbNbr + DT_28AA_POS_DB_NBR_LEN));
   	}
     int localDt28aaPosDbAmtCounter = -1;
     public boolean isDt28aaPosDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt28aaPosDbAmtCounter != sharedCounter;
         localDt28aaPosDbAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_28AA_POS_DB_AMT_LEN = 18;
	/**
	 * 	serialize this Dt28aaPosDbAmt
	 */
   protected void serializeDt28aaPosDbAmt(char[] dt28aaPosDbAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt28aaPosDbAmt,0,getStringValue(),beginDt28aaPosDbAmt,DT_28AA_POS_DB_AMT_LEN);
       localDt28aaPosDbAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt28aaPosDbAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt28aaPosDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt28aaPosDbAmt() {	 
   		return (substring(getStringValue(),beginDt28aaPosDbAmt,beginDt28aaPosDbAmt + DT_28AA_POS_DB_AMT_LEN));
   	}
     int localDt28aaPosCrNbrCounter = -1;
     public boolean isDt28aaPosCrNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt28aaPosCrNbrCounter != sharedCounter;
         localDt28aaPosCrNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_28AA_POS_CR_NBR_LEN = 15;
	/**
	 * 	serialize this Dt28aaPosCrNbr
	 */
   protected void serializeDt28aaPosCrNbr(char[] dt28aaPosCrNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt28aaPosCrNbr,0,getStringValue(),beginDt28aaPosCrNbr,DT_28AA_POS_CR_NBR_LEN);
       localDt28aaPosCrNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt28aaPosCrNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshDt28aaPosCrNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt28aaPosCrNbr() {	 
   		return (substring(getStringValue(),beginDt28aaPosCrNbr,beginDt28aaPosCrNbr + DT_28AA_POS_CR_NBR_LEN));
   	}
     int localDt28aaPosCrAmtCounter = -1;
     public boolean isDt28aaPosCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt28aaPosCrAmtCounter != sharedCounter;
         localDt28aaPosCrAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_28AA_POS_CR_AMT_LEN = 18;
	/**
	 * 	serialize this Dt28aaPosCrAmt
	 */
   protected void serializeDt28aaPosCrAmt(char[] dt28aaPosCrAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt28aaPosCrAmt,0,getStringValue(),beginDt28aaPosCrAmt,DT_28AA_POS_CR_AMT_LEN);
       localDt28aaPosCrAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt28aaPosCrAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt28aaPosCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt28aaPosCrAmt() {	 
   		return (substring(getStringValue(),beginDt28aaPosCrAmt,beginDt28aaPosCrAmt + DT_28AA_POS_CR_AMT_LEN));
   	}




}
  

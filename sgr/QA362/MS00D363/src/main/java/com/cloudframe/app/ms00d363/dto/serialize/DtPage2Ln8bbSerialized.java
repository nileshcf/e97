package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage2Ln8bbSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage2Ln8bbSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage2Ln8bbSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_2_LN_8BB_LENGTH = 131;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt28bbCc;
            protected  int beginDt28bbAtmDbNbr;
            protected  int beginDt28bbAtmDbAmt;
            protected  int beginDt28bbAtmCrNbr;
            protected  int beginDt28bbAtmCrAmt;
	
	/**
	* Constructor for DtPage2Ln8bbSerialized
	**/
    public DtPage2Ln8bbSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage2Ln8bbSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_2_LN_8BB_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt28bbCc = getStartOffset() + 0;	// set offset for serialization
  
  
  
             beginDt28bbAtmDbNbr = getStartOffset() + 28;	// set offset for serialization
  
  
             beginDt28bbAtmDbAmt = getStartOffset() + 45;	// set offset for serialization
  
  
             beginDt28bbAtmCrNbr = getStartOffset() + 67;	// set offset for serialization
  
  
             beginDt28bbAtmCrAmt = getStartOffset() + 84;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt28bbCcCounter = -1;
     public boolean isDt28bbCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt28bbCcCounter != sharedCounter;
         localDt28bbCcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_28BB_CC_LEN = 1;
	/**
	 * 	serialize this Dt28bbCc
	 */
   protected void serializeDt28bbCc(char[] dt28bbCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt28bbCc,0,getStringValue(),beginDt28bbCc,DT_28BB_CC_LEN);
       localDt28bbCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt28bbCcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt28bbCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt28bbCc() {	 
   		return (substring(getStringValue(),beginDt28bbCc,beginDt28bbCc + DT_28BB_CC_LEN));
   	}
     int localDt28bbAtmDbNbrCounter = -1;
     public boolean isDt28bbAtmDbNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt28bbAtmDbNbrCounter != sharedCounter;
         localDt28bbAtmDbNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_28BB_ATM_DB_NBR_LEN = 15;
	/**
	 * 	serialize this Dt28bbAtmDbNbr
	 */
   protected void serializeDt28bbAtmDbNbr(char[] dt28bbAtmDbNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt28bbAtmDbNbr,0,getStringValue(),beginDt28bbAtmDbNbr,DT_28BB_ATM_DB_NBR_LEN);
       localDt28bbAtmDbNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt28bbAtmDbNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshDt28bbAtmDbNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt28bbAtmDbNbr() {	 
   		return (substring(getStringValue(),beginDt28bbAtmDbNbr,beginDt28bbAtmDbNbr + DT_28BB_ATM_DB_NBR_LEN));
   	}
     int localDt28bbAtmDbAmtCounter = -1;
     public boolean isDt28bbAtmDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt28bbAtmDbAmtCounter != sharedCounter;
         localDt28bbAtmDbAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_28BB_ATM_DB_AMT_LEN = 18;
	/**
	 * 	serialize this Dt28bbAtmDbAmt
	 */
   protected void serializeDt28bbAtmDbAmt(char[] dt28bbAtmDbAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt28bbAtmDbAmt,0,getStringValue(),beginDt28bbAtmDbAmt,DT_28BB_ATM_DB_AMT_LEN);
       localDt28bbAtmDbAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt28bbAtmDbAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt28bbAtmDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt28bbAtmDbAmt() {	 
   		return (substring(getStringValue(),beginDt28bbAtmDbAmt,beginDt28bbAtmDbAmt + DT_28BB_ATM_DB_AMT_LEN));
   	}
     int localDt28bbAtmCrNbrCounter = -1;
     public boolean isDt28bbAtmCrNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt28bbAtmCrNbrCounter != sharedCounter;
         localDt28bbAtmCrNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_28BB_ATM_CR_NBR_LEN = 15;
	/**
	 * 	serialize this Dt28bbAtmCrNbr
	 */
   protected void serializeDt28bbAtmCrNbr(char[] dt28bbAtmCrNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt28bbAtmCrNbr,0,getStringValue(),beginDt28bbAtmCrNbr,DT_28BB_ATM_CR_NBR_LEN);
       localDt28bbAtmCrNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt28bbAtmCrNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshDt28bbAtmCrNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt28bbAtmCrNbr() {	 
   		return (substring(getStringValue(),beginDt28bbAtmCrNbr,beginDt28bbAtmCrNbr + DT_28BB_ATM_CR_NBR_LEN));
   	}
     int localDt28bbAtmCrAmtCounter = -1;
     public boolean isDt28bbAtmCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt28bbAtmCrAmtCounter != sharedCounter;
         localDt28bbAtmCrAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_28BB_ATM_CR_AMT_LEN = 18;
	/**
	 * 	serialize this Dt28bbAtmCrAmt
	 */
   protected void serializeDt28bbAtmCrAmt(char[] dt28bbAtmCrAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt28bbAtmCrAmt,0,getStringValue(),beginDt28bbAtmCrAmt,DT_28BB_ATM_CR_AMT_LEN);
       localDt28bbAtmCrAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt28bbAtmCrAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt28bbAtmCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt28bbAtmCrAmt() {	 
   		return (substring(getStringValue(),beginDt28bbAtmCrAmt,beginDt28bbAtmCrAmt + DT_28BB_ATM_CR_AMT_LEN));
   	}




}
  

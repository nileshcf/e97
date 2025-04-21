package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage2Ln1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage2Ln1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage2Ln1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_2_LN_1_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt21Cc;
            protected  int beginDt21FinDbNbr;
            protected  int beginDt21FinDbAmt;
            protected  int beginDt21FinCrNbr;
            protected  int beginDt21FinCrAmt;
	
	/**
	* Constructor for DtPage2Ln1Serialized
	**/
    public DtPage2Ln1Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage2Ln1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_2_LN_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt21Cc = getStartOffset() + 0;	// set offset for serialization
  
  
  
             beginDt21FinDbNbr = getStartOffset() + 28;	// set offset for serialization
  
  
             beginDt21FinDbAmt = getStartOffset() + 45;	// set offset for serialization
  
  
             beginDt21FinCrNbr = getStartOffset() + 67;	// set offset for serialization
  
  
             beginDt21FinCrAmt = getStartOffset() + 84;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt21CcCounter = -1;
     public boolean isDt21CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt21CcCounter != sharedCounter;
         localDt21CcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_21_CC_LEN = 1;
	/**
	 * 	serialize this Dt21Cc
	 */
   protected void serializeDt21Cc(char[] dt21Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt21Cc,0,getStringValue(),beginDt21Cc,DT_21_CC_LEN);
       localDt21CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt21CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt21Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt21Cc() {	 
   		return (substring(getStringValue(),beginDt21Cc,beginDt21Cc + DT_21_CC_LEN));
   	}
     int localDt21FinDbNbrCounter = -1;
     public boolean isDt21FinDbNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt21FinDbNbrCounter != sharedCounter;
         localDt21FinDbNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_21_FIN_DB_NBR_LEN = 15;
	/**
	 * 	serialize this Dt21FinDbNbr
	 */
   protected void serializeDt21FinDbNbr(char[] dt21FinDbNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt21FinDbNbr,0,getStringValue(),beginDt21FinDbNbr,DT_21_FIN_DB_NBR_LEN);
       localDt21FinDbNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt21FinDbNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshDt21FinDbNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt21FinDbNbr() {	 
   		return (substring(getStringValue(),beginDt21FinDbNbr,beginDt21FinDbNbr + DT_21_FIN_DB_NBR_LEN));
   	}
     int localDt21FinDbAmtCounter = -1;
     public boolean isDt21FinDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt21FinDbAmtCounter != sharedCounter;
         localDt21FinDbAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_21_FIN_DB_AMT_LEN = 18;
	/**
	 * 	serialize this Dt21FinDbAmt
	 */
   protected void serializeDt21FinDbAmt(char[] dt21FinDbAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt21FinDbAmt,0,getStringValue(),beginDt21FinDbAmt,DT_21_FIN_DB_AMT_LEN);
       localDt21FinDbAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt21FinDbAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt21FinDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt21FinDbAmt() {	 
   		return (substring(getStringValue(),beginDt21FinDbAmt,beginDt21FinDbAmt + DT_21_FIN_DB_AMT_LEN));
   	}
     int localDt21FinCrNbrCounter = -1;
     public boolean isDt21FinCrNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt21FinCrNbrCounter != sharedCounter;
         localDt21FinCrNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_21_FIN_CR_NBR_LEN = 15;
	/**
	 * 	serialize this Dt21FinCrNbr
	 */
   protected void serializeDt21FinCrNbr(char[] dt21FinCrNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt21FinCrNbr,0,getStringValue(),beginDt21FinCrNbr,DT_21_FIN_CR_NBR_LEN);
       localDt21FinCrNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt21FinCrNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshDt21FinCrNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt21FinCrNbr() {	 
   		return (substring(getStringValue(),beginDt21FinCrNbr,beginDt21FinCrNbr + DT_21_FIN_CR_NBR_LEN));
   	}
     int localDt21FinCrAmtCounter = -1;
     public boolean isDt21FinCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt21FinCrAmtCounter != sharedCounter;
         localDt21FinCrAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_21_FIN_CR_AMT_LEN = 18;
	/**
	 * 	serialize this Dt21FinCrAmt
	 */
   protected void serializeDt21FinCrAmt(char[] dt21FinCrAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt21FinCrAmt,0,getStringValue(),beginDt21FinCrAmt,DT_21_FIN_CR_AMT_LEN);
       localDt21FinCrAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt21FinCrAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt21FinCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt21FinCrAmt() {	 
   		return (substring(getStringValue(),beginDt21FinCrAmt,beginDt21FinCrAmt + DT_21_FIN_CR_AMT_LEN));
   	}




}
  

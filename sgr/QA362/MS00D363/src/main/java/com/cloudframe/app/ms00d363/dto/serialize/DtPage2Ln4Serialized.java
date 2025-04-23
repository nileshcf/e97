package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage2Ln4Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage2Ln4Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage2Ln4Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_2_LN_4_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt24Cc;
            protected  int beginDt24TrvDbNbr;
            protected  int beginDt24TrvDbAmt;
            protected  int beginDt24TrvCrNbr;
            protected  int beginDt24TrvCrAmt;
	
	/**
	* Constructor for DtPage2Ln4Serialized
	**/
    public DtPage2Ln4Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage2Ln4Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_2_LN_4_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt24Cc = getStartOffset() + 0;	// set offset for serialization
  
  
  
             beginDt24TrvDbNbr = getStartOffset() + 28;	// set offset for serialization
  
  
             beginDt24TrvDbAmt = getStartOffset() + 45;	// set offset for serialization
  
  
             beginDt24TrvCrNbr = getStartOffset() + 67;	// set offset for serialization
  
  
             beginDt24TrvCrAmt = getStartOffset() + 84;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt24CcCounter = -1;
     public boolean isDt24CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt24CcCounter != sharedCounter;
         localDt24CcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_24_CC_LEN = 1;
	/**
	 * 	serialize this Dt24Cc
	 */
   protected void serializeDt24Cc(char[] dt24Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt24Cc,0,getStringValue(),beginDt24Cc,DT_24_CC_LEN);
       localDt24CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt24CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt24Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt24Cc() {	 
   		return (substring(getStringValue(),beginDt24Cc,beginDt24Cc + DT_24_CC_LEN));
   	}
     int localDt24TrvDbNbrCounter = -1;
     public boolean isDt24TrvDbNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt24TrvDbNbrCounter != sharedCounter;
         localDt24TrvDbNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_24_TRV_DB_NBR_LEN = 15;
	/**
	 * 	serialize this Dt24TrvDbNbr
	 */
   protected void serializeDt24TrvDbNbr(char[] dt24TrvDbNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt24TrvDbNbr,0,getStringValue(),beginDt24TrvDbNbr,DT_24_TRV_DB_NBR_LEN);
       localDt24TrvDbNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt24TrvDbNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshDt24TrvDbNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt24TrvDbNbr() {	 
   		return (substring(getStringValue(),beginDt24TrvDbNbr,beginDt24TrvDbNbr + DT_24_TRV_DB_NBR_LEN));
   	}
     int localDt24TrvDbAmtCounter = -1;
     public boolean isDt24TrvDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt24TrvDbAmtCounter != sharedCounter;
         localDt24TrvDbAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_24_TRV_DB_AMT_LEN = 18;
	/**
	 * 	serialize this Dt24TrvDbAmt
	 */
   protected void serializeDt24TrvDbAmt(char[] dt24TrvDbAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt24TrvDbAmt,0,getStringValue(),beginDt24TrvDbAmt,DT_24_TRV_DB_AMT_LEN);
       localDt24TrvDbAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt24TrvDbAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt24TrvDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt24TrvDbAmt() {	 
   		return (substring(getStringValue(),beginDt24TrvDbAmt,beginDt24TrvDbAmt + DT_24_TRV_DB_AMT_LEN));
   	}
     int localDt24TrvCrNbrCounter = -1;
     public boolean isDt24TrvCrNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt24TrvCrNbrCounter != sharedCounter;
         localDt24TrvCrNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_24_TRV_CR_NBR_LEN = 15;
	/**
	 * 	serialize this Dt24TrvCrNbr
	 */
   protected void serializeDt24TrvCrNbr(char[] dt24TrvCrNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt24TrvCrNbr,0,getStringValue(),beginDt24TrvCrNbr,DT_24_TRV_CR_NBR_LEN);
       localDt24TrvCrNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt24TrvCrNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshDt24TrvCrNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt24TrvCrNbr() {	 
   		return (substring(getStringValue(),beginDt24TrvCrNbr,beginDt24TrvCrNbr + DT_24_TRV_CR_NBR_LEN));
   	}
     int localDt24TrvCrAmtCounter = -1;
     public boolean isDt24TrvCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt24TrvCrAmtCounter != sharedCounter;
         localDt24TrvCrAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_24_TRV_CR_AMT_LEN = 18;
	/**
	 * 	serialize this Dt24TrvCrAmt
	 */
   protected void serializeDt24TrvCrAmt(char[] dt24TrvCrAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt24TrvCrAmt,0,getStringValue(),beginDt24TrvCrAmt,DT_24_TRV_CR_AMT_LEN);
       localDt24TrvCrAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt24TrvCrAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt24TrvCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt24TrvCrAmt() {	 
   		return (substring(getStringValue(),beginDt24TrvCrAmt,beginDt24TrvCrAmt + DT_24_TRV_CR_AMT_LEN));
   	}




}
  

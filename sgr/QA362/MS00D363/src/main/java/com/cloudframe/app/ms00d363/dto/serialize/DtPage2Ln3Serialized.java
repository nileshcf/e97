package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage2Ln3Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage2Ln3Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage2Ln3Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_2_LN_3_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt23Cc;
            protected  int beginDt23RevDbNbr;
            protected  int beginDt23RevDbAmt;
            protected  int beginDt23RevCrNbr;
            protected  int beginDt23RevCrAmt;
	
	/**
	* Constructor for DtPage2Ln3Serialized
	**/
    public DtPage2Ln3Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage2Ln3Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_2_LN_3_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt23Cc = getStartOffset() + 0;	// set offset for serialization
  
  
  
             beginDt23RevDbNbr = getStartOffset() + 28;	// set offset for serialization
  
  
             beginDt23RevDbAmt = getStartOffset() + 45;	// set offset for serialization
  
  
             beginDt23RevCrNbr = getStartOffset() + 67;	// set offset for serialization
  
  
             beginDt23RevCrAmt = getStartOffset() + 84;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt23CcCounter = -1;
     public boolean isDt23CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt23CcCounter != sharedCounter;
         localDt23CcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_23_CC_LEN = 1;
	/**
	 * 	serialize this Dt23Cc
	 */
   protected void serializeDt23Cc(char[] dt23Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt23Cc,0,getStringValue(),beginDt23Cc,DT_23_CC_LEN);
       localDt23CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt23CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt23Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt23Cc() {	 
   		return (substring(getStringValue(),beginDt23Cc,beginDt23Cc + DT_23_CC_LEN));
   	}
     int localDt23RevDbNbrCounter = -1;
     public boolean isDt23RevDbNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt23RevDbNbrCounter != sharedCounter;
         localDt23RevDbNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_23_REV_DB_NBR_LEN = 15;
	/**
	 * 	serialize this Dt23RevDbNbr
	 */
   protected void serializeDt23RevDbNbr(char[] dt23RevDbNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt23RevDbNbr,0,getStringValue(),beginDt23RevDbNbr,DT_23_REV_DB_NBR_LEN);
       localDt23RevDbNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt23RevDbNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshDt23RevDbNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt23RevDbNbr() {	 
   		return (substring(getStringValue(),beginDt23RevDbNbr,beginDt23RevDbNbr + DT_23_REV_DB_NBR_LEN));
   	}
     int localDt23RevDbAmtCounter = -1;
     public boolean isDt23RevDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt23RevDbAmtCounter != sharedCounter;
         localDt23RevDbAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_23_REV_DB_AMT_LEN = 18;
	/**
	 * 	serialize this Dt23RevDbAmt
	 */
   protected void serializeDt23RevDbAmt(char[] dt23RevDbAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt23RevDbAmt,0,getStringValue(),beginDt23RevDbAmt,DT_23_REV_DB_AMT_LEN);
       localDt23RevDbAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt23RevDbAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt23RevDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt23RevDbAmt() {	 
   		return (substring(getStringValue(),beginDt23RevDbAmt,beginDt23RevDbAmt + DT_23_REV_DB_AMT_LEN));
   	}
     int localDt23RevCrNbrCounter = -1;
     public boolean isDt23RevCrNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt23RevCrNbrCounter != sharedCounter;
         localDt23RevCrNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_23_REV_CR_NBR_LEN = 15;
	/**
	 * 	serialize this Dt23RevCrNbr
	 */
   protected void serializeDt23RevCrNbr(char[] dt23RevCrNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt23RevCrNbr,0,getStringValue(),beginDt23RevCrNbr,DT_23_REV_CR_NBR_LEN);
       localDt23RevCrNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt23RevCrNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshDt23RevCrNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt23RevCrNbr() {	 
   		return (substring(getStringValue(),beginDt23RevCrNbr,beginDt23RevCrNbr + DT_23_REV_CR_NBR_LEN));
   	}
     int localDt23RevCrAmtCounter = -1;
     public boolean isDt23RevCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt23RevCrAmtCounter != sharedCounter;
         localDt23RevCrAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_23_REV_CR_AMT_LEN = 18;
	/**
	 * 	serialize this Dt23RevCrAmt
	 */
   protected void serializeDt23RevCrAmt(char[] dt23RevCrAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt23RevCrAmt,0,getStringValue(),beginDt23RevCrAmt,DT_23_REV_CR_AMT_LEN);
       localDt23RevCrAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt23RevCrAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt23RevCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt23RevCrAmt() {	 
   		return (substring(getStringValue(),beginDt23RevCrAmt,beginDt23RevCrAmt + DT_23_REV_CR_AMT_LEN));
   	}




}
  

package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage2Ln2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage2Ln2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage2Ln2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_2_LN_2_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt22Cc;
            protected  int beginDt22R09DbNbr;
            protected  int beginDt22R09DbAmt;
            protected  int beginDt22R09CrNbr;
            protected  int beginDt22R09CrAmt;
	
	/**
	* Constructor for DtPage2Ln2Serialized
	**/
    public DtPage2Ln2Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage2Ln2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_2_LN_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt22Cc = getStartOffset() + 0;	// set offset for serialization
  
  
  
             beginDt22R09DbNbr = getStartOffset() + 28;	// set offset for serialization
  
  
             beginDt22R09DbAmt = getStartOffset() + 45;	// set offset for serialization
  
  
             beginDt22R09CrNbr = getStartOffset() + 67;	// set offset for serialization
  
  
             beginDt22R09CrAmt = getStartOffset() + 84;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt22CcCounter = -1;
     public boolean isDt22CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt22CcCounter != sharedCounter;
         localDt22CcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_22_CC_LEN = 1;
	/**
	 * 	serialize this Dt22Cc
	 */
   protected void serializeDt22Cc(char[] dt22Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt22Cc,0,getStringValue(),beginDt22Cc,DT_22_CC_LEN);
       localDt22CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt22CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt22Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt22Cc() {	 
   		return (substring(getStringValue(),beginDt22Cc,beginDt22Cc + DT_22_CC_LEN));
   	}
     int localDt22R09DbNbrCounter = -1;
     public boolean isDt22R09DbNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt22R09DbNbrCounter != sharedCounter;
         localDt22R09DbNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_22_R_09_DB_NBR_LEN = 15;
	/**
	 * 	serialize this Dt22R09DbNbr
	 */
   protected void serializeDt22R09DbNbr(char[] dt22R09DbNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt22R09DbNbr,0,getStringValue(),beginDt22R09DbNbr,DT_22_R_09_DB_NBR_LEN);
       localDt22R09DbNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt22R09DbNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshDt22R09DbNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt22R09DbNbr() {	 
   		return (substring(getStringValue(),beginDt22R09DbNbr,beginDt22R09DbNbr + DT_22_R_09_DB_NBR_LEN));
   	}
     int localDt22R09DbAmtCounter = -1;
     public boolean isDt22R09DbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt22R09DbAmtCounter != sharedCounter;
         localDt22R09DbAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_22_R_09_DB_AMT_LEN = 18;
	/**
	 * 	serialize this Dt22R09DbAmt
	 */
   protected void serializeDt22R09DbAmt(char[] dt22R09DbAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt22R09DbAmt,0,getStringValue(),beginDt22R09DbAmt,DT_22_R_09_DB_AMT_LEN);
       localDt22R09DbAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt22R09DbAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt22R09DbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt22R09DbAmt() {	 
   		return (substring(getStringValue(),beginDt22R09DbAmt,beginDt22R09DbAmt + DT_22_R_09_DB_AMT_LEN));
   	}
     int localDt22R09CrNbrCounter = -1;
     public boolean isDt22R09CrNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt22R09CrNbrCounter != sharedCounter;
         localDt22R09CrNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_22_R_09_CR_NBR_LEN = 15;
	/**
	 * 	serialize this Dt22R09CrNbr
	 */
   protected void serializeDt22R09CrNbr(char[] dt22R09CrNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt22R09CrNbr,0,getStringValue(),beginDt22R09CrNbr,DT_22_R_09_CR_NBR_LEN);
       localDt22R09CrNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt22R09CrNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshDt22R09CrNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt22R09CrNbr() {	 
   		return (substring(getStringValue(),beginDt22R09CrNbr,beginDt22R09CrNbr + DT_22_R_09_CR_NBR_LEN));
   	}
     int localDt22R09CrAmtCounter = -1;
     public boolean isDt22R09CrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt22R09CrAmtCounter != sharedCounter;
         localDt22R09CrAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_22_R_09_CR_AMT_LEN = 18;
	/**
	 * 	serialize this Dt22R09CrAmt
	 */
   protected void serializeDt22R09CrAmt(char[] dt22R09CrAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt22R09CrAmt,0,getStringValue(),beginDt22R09CrAmt,DT_22_R_09_CR_AMT_LEN);
       localDt22R09CrAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt22R09CrAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt22R09CrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt22R09CrAmt() {	 
   		return (substring(getStringValue(),beginDt22R09CrAmt,beginDt22R09CrAmt + DT_22_R_09_CR_AMT_LEN));
   	}




}
  

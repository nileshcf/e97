package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage3Ln6Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage3Ln6Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage3Ln6Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_3_LN_6_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt36Cc;
            protected  int beginDt36IssexpDbAmt;
            protected  int beginDt36IssexpCrAmt;
            protected  int beginFilllr;
            protected  int beginDt36IssexpNetAmt;
            protected  int beginDt36IssexpInd;
	
	/**
	* Constructor for DtPage3Ln6Serialized
	**/
    public DtPage3Ln6Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage3Ln6Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_3_LN_6_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt36Cc = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
             beginDt36IssexpDbAmt = getStartOffset() + 34;	// set offset for serialization
  
  
             beginDt36IssexpCrAmt = getStartOffset() + 65;	// set offset for serialization
  
             beginFilllr = getStartOffset() + 83;	// set offset for serialization
  
             beginDt36IssexpNetAmt = getStartOffset() + 93;	// set offset for serialization
  
  
             beginDt36IssexpInd = getStartOffset() + 117;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt36CcCounter = -1;
     public boolean isDt36CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt36CcCounter != sharedCounter;
         localDt36CcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_36_CC_LEN = 1;
	/**
	 * 	serialize this Dt36Cc
	 */
   protected void serializeDt36Cc(char[] dt36Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt36Cc,0,getStringValue(),beginDt36Cc,DT_36_CC_LEN);
       localDt36CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt36CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt36Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt36Cc() {	 
   		return (substring(getStringValue(),beginDt36Cc,beginDt36Cc + DT_36_CC_LEN));
   	}
     int localDt36IssexpDbAmtCounter = -1;
     public boolean isDt36IssexpDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt36IssexpDbAmtCounter != sharedCounter;
         localDt36IssexpDbAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_36_ISSEXP_DB_AMT_LEN = 18;
	/**
	 * 	serialize this Dt36IssexpDbAmt
	 */
   protected void serializeDt36IssexpDbAmt(char[] dt36IssexpDbAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt36IssexpDbAmt,0,getStringValue(),beginDt36IssexpDbAmt,DT_36_ISSEXP_DB_AMT_LEN);
       localDt36IssexpDbAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt36IssexpDbAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt36IssexpDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt36IssexpDbAmt() {	 
   		return (substring(getStringValue(),beginDt36IssexpDbAmt,beginDt36IssexpDbAmt + DT_36_ISSEXP_DB_AMT_LEN));
   	}
     int localDt36IssexpCrAmtCounter = -1;
     public boolean isDt36IssexpCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt36IssexpCrAmtCounter != sharedCounter;
         localDt36IssexpCrAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_36_ISSEXP_CR_AMT_LEN = 18;
	/**
	 * 	serialize this Dt36IssexpCrAmt
	 */
   protected void serializeDt36IssexpCrAmt(char[] dt36IssexpCrAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt36IssexpCrAmt,0,getStringValue(),beginDt36IssexpCrAmt,DT_36_ISSEXP_CR_AMT_LEN);
       localDt36IssexpCrAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt36IssexpCrAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt36IssexpCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt36IssexpCrAmt() {	 
   		return (substring(getStringValue(),beginDt36IssexpCrAmt,beginDt36IssexpCrAmt + DT_36_ISSEXP_CR_AMT_LEN));
   	}
     int localFilllrCounter = -1;
     public boolean isFilllrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFilllrCounter != sharedCounter;
         localFilllrCounter = sharedCounter; return hasModified;
     }
	protected static final int FILLLR_LEN = 10;
	/**
	 * 	serialize this Filllr
	 */
   protected void serializeFilllr(char[] filllr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filllr,0,getStringValue(),beginFilllr,FILLLR_LEN);
       localFilllrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFilllrConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshFilllr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFilllr() {	 
   		return (substring(getStringValue(),beginFilllr,beginFilllr + FILLLR_LEN));
   	}
     int localDt36IssexpNetAmtCounter = -1;
     public boolean isDt36IssexpNetAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt36IssexpNetAmtCounter != sharedCounter;
         localDt36IssexpNetAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_36_ISSEXP_NET_AMT_LEN = 18;
	/**
	 * 	serialize this Dt36IssexpNetAmt
	 */
   protected void serializeDt36IssexpNetAmt(char[] dt36IssexpNetAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt36IssexpNetAmt,0,getStringValue(),beginDt36IssexpNetAmt,DT_36_ISSEXP_NET_AMT_LEN);
       localDt36IssexpNetAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt36IssexpNetAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt36IssexpNetAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt36IssexpNetAmt() {	 
   		return (substring(getStringValue(),beginDt36IssexpNetAmt,beginDt36IssexpNetAmt + DT_36_ISSEXP_NET_AMT_LEN));
   	}
     int localDt36IssexpIndCounter = -1;
     public boolean isDt36IssexpIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt36IssexpIndCounter != sharedCounter;
         localDt36IssexpIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_36_ISSEXP_IND_LEN = 2;
	/**
	 * 	serialize this Dt36IssexpInd
	 */
   protected void serializeDt36IssexpInd(char[] dt36IssexpInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt36IssexpInd,0,getStringValue(),beginDt36IssexpInd,DT_36_ISSEXP_IND_LEN);
       localDt36IssexpIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt36IssexpIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt36IssexpInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt36IssexpInd() {	 
   		return (substring(getStringValue(),beginDt36IssexpInd,beginDt36IssexpInd + DT_36_ISSEXP_IND_LEN));
   	}




}
  

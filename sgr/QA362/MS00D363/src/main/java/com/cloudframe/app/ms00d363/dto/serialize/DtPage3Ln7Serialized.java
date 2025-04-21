package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage3Ln7Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage3Ln7Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage3Ln7Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_3_LN_7_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt37Cc;
            protected  int beginDt37IssintDbAmt;
            protected  int beginDt37IssintCrAmt;
            protected  int beginDt37IssintNetAmt;
            protected  int beginDt37IssintInd;
	
	/**
	* Constructor for DtPage3Ln7Serialized
	**/
    public DtPage3Ln7Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage3Ln7Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_3_LN_7_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt37Cc = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
             beginDt37IssintDbAmt = getStartOffset() + 36;	// set offset for serialization
  
  
             beginDt37IssintCrAmt = getStartOffset() + 67;	// set offset for serialization
  
  
             beginDt37IssintNetAmt = getStartOffset() + 95;	// set offset for serialization
  
  
             beginDt37IssintInd = getStartOffset() + 117;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt37CcCounter = -1;
     public boolean isDt37CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt37CcCounter != sharedCounter;
         localDt37CcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_37_CC_LEN = 1;
	/**
	 * 	serialize this Dt37Cc
	 */
   protected void serializeDt37Cc(char[] dt37Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt37Cc,0,getStringValue(),beginDt37Cc,DT_37_CC_LEN);
       localDt37CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt37CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt37Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt37Cc() {	 
   		return (substring(getStringValue(),beginDt37Cc,beginDt37Cc + DT_37_CC_LEN));
   	}
     int localDt37IssintDbAmtCounter = -1;
     public boolean isDt37IssintDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt37IssintDbAmtCounter != sharedCounter;
         localDt37IssintDbAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_37_ISSINT_DB_AMT_LEN = 20;
	/**
	 * 	serialize this Dt37IssintDbAmt
	 */
   protected void serializeDt37IssintDbAmt(char[] dt37IssintDbAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt37IssintDbAmt,0,getStringValue(),beginDt37IssintDbAmt,DT_37_ISSINT_DB_AMT_LEN);
       localDt37IssintDbAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt37IssintDbAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshDt37IssintDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt37IssintDbAmt() {	 
   		return (substring(getStringValue(),beginDt37IssintDbAmt,beginDt37IssintDbAmt + DT_37_ISSINT_DB_AMT_LEN));
   	}
     int localDt37IssintCrAmtCounter = -1;
     public boolean isDt37IssintCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt37IssintCrAmtCounter != sharedCounter;
         localDt37IssintCrAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_37_ISSINT_CR_AMT_LEN = 20;
	/**
	 * 	serialize this Dt37IssintCrAmt
	 */
   protected void serializeDt37IssintCrAmt(char[] dt37IssintCrAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt37IssintCrAmt,0,getStringValue(),beginDt37IssintCrAmt,DT_37_ISSINT_CR_AMT_LEN);
       localDt37IssintCrAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt37IssintCrAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshDt37IssintCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt37IssintCrAmt() {	 
   		return (substring(getStringValue(),beginDt37IssintCrAmt,beginDt37IssintCrAmt + DT_37_ISSINT_CR_AMT_LEN));
   	}
     int localDt37IssintNetAmtCounter = -1;
     public boolean isDt37IssintNetAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt37IssintNetAmtCounter != sharedCounter;
         localDt37IssintNetAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_37_ISSINT_NET_AMT_LEN = 20;
	/**
	 * 	serialize this Dt37IssintNetAmt
	 */
   protected void serializeDt37IssintNetAmt(char[] dt37IssintNetAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt37IssintNetAmt,0,getStringValue(),beginDt37IssintNetAmt,DT_37_ISSINT_NET_AMT_LEN);
       localDt37IssintNetAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt37IssintNetAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshDt37IssintNetAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt37IssintNetAmt() {	 
   		return (substring(getStringValue(),beginDt37IssintNetAmt,beginDt37IssintNetAmt + DT_37_ISSINT_NET_AMT_LEN));
   	}
     int localDt37IssintIndCounter = -1;
     public boolean isDt37IssintIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt37IssintIndCounter != sharedCounter;
         localDt37IssintIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_37_ISSINT_IND_LEN = 2;
	/**
	 * 	serialize this Dt37IssintInd
	 */
   protected void serializeDt37IssintInd(char[] dt37IssintInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt37IssintInd,0,getStringValue(),beginDt37IssintInd,DT_37_ISSINT_IND_LEN);
       localDt37IssintIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt37IssintIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt37IssintInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt37IssintInd() {	 
   		return (substring(getStringValue(),beginDt37IssintInd,beginDt37IssintInd + DT_37_ISSINT_IND_LEN));
   	}




}
  

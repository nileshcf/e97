package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage3Ln9aSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage3Ln9aSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage3Ln9aSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_3_LN_9A_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt39aCc;
            protected  int beginDt39aSsc;
            protected  int beginDt39aTottotNetAmt;
            protected  int beginDt39aTottotInd;
	
	/**
	* Constructor for DtPage3Ln9aSerialized
	**/
    public DtPage3Ln9aSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage3Ln9aSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_3_LN_9A_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt39aCc = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
  
             beginDt39aSsc = getStartOffset() + 31;	// set offset for serialization
  
  
  
  
  
  
             beginDt39aTottotNetAmt = getStartOffset() + 93;	// set offset for serialization
  
  
             beginDt39aTottotInd = getStartOffset() + 117;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt39aCcCounter = -1;
     public boolean isDt39aCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt39aCcCounter != sharedCounter;
         localDt39aCcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_39A_CC_LEN = 1;
	/**
	 * 	serialize this Dt39aCc
	 */
   protected void serializeDt39aCc(char[] dt39aCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt39aCc,0,getStringValue(),beginDt39aCc,DT_39A_CC_LEN);
       localDt39aCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt39aCcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt39aCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt39aCc() {	 
   		return (substring(getStringValue(),beginDt39aCc,beginDt39aCc + DT_39A_CC_LEN));
   	}
     int localDt39aSscCounter = -1;
     public boolean isDt39aSscModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt39aSscCounter != sharedCounter;
         localDt39aSscCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_39A_SSC_LEN = 3;
	/**
	 * 	serialize this Dt39aSsc
	 */
   protected void serializeDt39aSsc(char[] dt39aSsc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt39aSsc,0,getStringValue(),beginDt39aSsc,DT_39A_SSC_LEN);
       localDt39aSscCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt39aSscConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshDt39aSsc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt39aSsc() {	 
   		return (substring(getStringValue(),beginDt39aSsc,beginDt39aSsc + DT_39A_SSC_LEN));
   	}
     int localDt39aTottotNetAmtCounter = -1;
     public boolean isDt39aTottotNetAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt39aTottotNetAmtCounter != sharedCounter;
         localDt39aTottotNetAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_39A_TOTTOT_NET_AMT_LEN = 18;
	/**
	 * 	serialize this Dt39aTottotNetAmt
	 */
   protected void serializeDt39aTottotNetAmt(char[] dt39aTottotNetAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt39aTottotNetAmt,0,getStringValue(),beginDt39aTottotNetAmt,DT_39A_TOTTOT_NET_AMT_LEN);
       localDt39aTottotNetAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt39aTottotNetAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt39aTottotNetAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt39aTottotNetAmt() {	 
   		return (substring(getStringValue(),beginDt39aTottotNetAmt,beginDt39aTottotNetAmt + DT_39A_TOTTOT_NET_AMT_LEN));
   	}
     int localDt39aTottotIndCounter = -1;
     public boolean isDt39aTottotIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt39aTottotIndCounter != sharedCounter;
         localDt39aTottotIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_39A_TOTTOT_IND_LEN = 2;
	/**
	 * 	serialize this Dt39aTottotInd
	 */
   protected void serializeDt39aTottotInd(char[] dt39aTottotInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt39aTottotInd,0,getStringValue(),beginDt39aTottotInd,DT_39A_TOTTOT_IND_LEN);
       localDt39aTottotIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt39aTottotIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt39aTottotInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt39aTottotInd() {	 
   		return (substring(getStringValue(),beginDt39aTottotInd,beginDt39aTottotInd + DT_39A_TOTTOT_IND_LEN));
   	}




}
  

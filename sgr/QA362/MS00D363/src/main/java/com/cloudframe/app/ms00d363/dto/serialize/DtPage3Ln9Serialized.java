package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage3Ln9Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage3Ln9Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage3Ln9Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_3_LN_9_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt39Cc;
            protected  int beginDt39AchtotNetAmt;
            protected  int beginDt39AchtotInd;
	
	/**
	* Constructor for DtPage3Ln9Serialized
	**/
    public DtPage3Ln9Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage3Ln9Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_3_LN_9_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt39Cc = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
  
  
  
  
             beginDt39AchtotNetAmt = getStartOffset() + 93;	// set offset for serialization
  
  
             beginDt39AchtotInd = getStartOffset() + 117;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt39CcCounter = -1;
     public boolean isDt39CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt39CcCounter != sharedCounter;
         localDt39CcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_39_CC_LEN = 1;
	/**
	 * 	serialize this Dt39Cc
	 */
   protected void serializeDt39Cc(char[] dt39Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt39Cc,0,getStringValue(),beginDt39Cc,DT_39_CC_LEN);
       localDt39CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt39CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt39Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt39Cc() {	 
   		return (substring(getStringValue(),beginDt39Cc,beginDt39Cc + DT_39_CC_LEN));
   	}
     int localDt39AchtotNetAmtCounter = -1;
     public boolean isDt39AchtotNetAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt39AchtotNetAmtCounter != sharedCounter;
         localDt39AchtotNetAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_39_ACHTOT_NET_AMT_LEN = 18;
	/**
	 * 	serialize this Dt39AchtotNetAmt
	 */
   protected void serializeDt39AchtotNetAmt(char[] dt39AchtotNetAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt39AchtotNetAmt,0,getStringValue(),beginDt39AchtotNetAmt,DT_39_ACHTOT_NET_AMT_LEN);
       localDt39AchtotNetAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt39AchtotNetAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt39AchtotNetAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt39AchtotNetAmt() {	 
   		return (substring(getStringValue(),beginDt39AchtotNetAmt,beginDt39AchtotNetAmt + DT_39_ACHTOT_NET_AMT_LEN));
   	}
     int localDt39AchtotIndCounter = -1;
     public boolean isDt39AchtotIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt39AchtotIndCounter != sharedCounter;
         localDt39AchtotIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_39_ACHTOT_IND_LEN = 2;
	/**
	 * 	serialize this Dt39AchtotInd
	 */
   protected void serializeDt39AchtotInd(char[] dt39AchtotInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt39AchtotInd,0,getStringValue(),beginDt39AchtotInd,DT_39_ACHTOT_IND_LEN);
       localDt39AchtotIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt39AchtotIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt39AchtotInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt39AchtotInd() {	 
   		return (substring(getStringValue(),beginDt39AchtotInd,beginDt39AchtotInd + DT_39_ACHTOT_IND_LEN));
   	}




}
  

package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage3Ln8Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage3Ln8Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage3Ln8Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_3_LN_8_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt38Cc;
            protected  int beginDt38IsstotDbAmt;
            protected  int beginDt38IsstotCrAmt;
            protected  int beginDt38IsstotNetAmt;
            protected  int beginDt38IsstotInd;
	
	/**
	* Constructor for DtPage3Ln8Serialized
	**/
    public DtPage3Ln8Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage3Ln8Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_3_LN_8_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt38Cc = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
             beginDt38IsstotDbAmt = getStartOffset() + 32;	// set offset for serialization
  
  
             beginDt38IsstotCrAmt = getStartOffset() + 63;	// set offset for serialization
  
  
             beginDt38IsstotNetAmt = getStartOffset() + 91;	// set offset for serialization
  
  
             beginDt38IsstotInd = getStartOffset() + 117;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt38CcCounter = -1;
     public boolean isDt38CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt38CcCounter != sharedCounter;
         localDt38CcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_38_CC_LEN = 1;
	/**
	 * 	serialize this Dt38Cc
	 */
   protected void serializeDt38Cc(char[] dt38Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt38Cc,0,getStringValue(),beginDt38Cc,DT_38_CC_LEN);
       localDt38CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt38CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt38Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt38Cc() {	 
   		return (substring(getStringValue(),beginDt38Cc,beginDt38Cc + DT_38_CC_LEN));
   	}
     int localDt38IsstotDbAmtCounter = -1;
     public boolean isDt38IsstotDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt38IsstotDbAmtCounter != sharedCounter;
         localDt38IsstotDbAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_38_ISSTOT_DB_AMT_LEN = 24;
	/**
	 * 	serialize this Dt38IsstotDbAmt
	 */
   protected void serializeDt38IsstotDbAmt(char[] dt38IsstotDbAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt38IsstotDbAmt,0,getStringValue(),beginDt38IsstotDbAmt,DT_38_ISSTOT_DB_AMT_LEN);
       localDt38IsstotDbAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt38IsstotDbAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
    /**
	 *	refreshDt38IsstotDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt38IsstotDbAmt() {	 
   		return (substring(getStringValue(),beginDt38IsstotDbAmt,beginDt38IsstotDbAmt + DT_38_ISSTOT_DB_AMT_LEN));
   	}
     int localDt38IsstotCrAmtCounter = -1;
     public boolean isDt38IsstotCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt38IsstotCrAmtCounter != sharedCounter;
         localDt38IsstotCrAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_38_ISSTOT_CR_AMT_LEN = 24;
	/**
	 * 	serialize this Dt38IsstotCrAmt
	 */
   protected void serializeDt38IsstotCrAmt(char[] dt38IsstotCrAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt38IsstotCrAmt,0,getStringValue(),beginDt38IsstotCrAmt,DT_38_ISSTOT_CR_AMT_LEN);
       localDt38IsstotCrAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt38IsstotCrAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
    /**
	 *	refreshDt38IsstotCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt38IsstotCrAmt() {	 
   		return (substring(getStringValue(),beginDt38IsstotCrAmt,beginDt38IsstotCrAmt + DT_38_ISSTOT_CR_AMT_LEN));
   	}
     int localDt38IsstotNetAmtCounter = -1;
     public boolean isDt38IsstotNetAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt38IsstotNetAmtCounter != sharedCounter;
         localDt38IsstotNetAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_38_ISSTOT_NET_AMT_LEN = 24;
	/**
	 * 	serialize this Dt38IsstotNetAmt
	 */
   protected void serializeDt38IsstotNetAmt(char[] dt38IsstotNetAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt38IsstotNetAmt,0,getStringValue(),beginDt38IsstotNetAmt,DT_38_ISSTOT_NET_AMT_LEN);
       localDt38IsstotNetAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt38IsstotNetAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
    /**
	 *	refreshDt38IsstotNetAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt38IsstotNetAmt() {	 
   		return (substring(getStringValue(),beginDt38IsstotNetAmt,beginDt38IsstotNetAmt + DT_38_ISSTOT_NET_AMT_LEN));
   	}
     int localDt38IsstotIndCounter = -1;
     public boolean isDt38IsstotIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt38IsstotIndCounter != sharedCounter;
         localDt38IsstotIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_38_ISSTOT_IND_LEN = 2;
	/**
	 * 	serialize this Dt38IsstotInd
	 */
   protected void serializeDt38IsstotInd(char[] dt38IsstotInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt38IsstotInd,0,getStringValue(),beginDt38IsstotInd,DT_38_ISSTOT_IND_LEN);
       localDt38IsstotIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt38IsstotIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt38IsstotInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt38IsstotInd() {	 
   		return (substring(getStringValue(),beginDt38IsstotInd,beginDt38IsstotInd + DT_38_ISSTOT_IND_LEN));
   	}




}
  

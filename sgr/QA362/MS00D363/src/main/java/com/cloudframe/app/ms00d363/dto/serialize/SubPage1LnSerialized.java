package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class SubPage1LnSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SubPage1LnSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SubPage1LnSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SUB_PAGE_1_LN_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSub1Cc;
            protected  int beginSub1Desc;
            protected  int beginSub1FinNbr;
            protected  int beginSub1FinNbrDen;
            protected  int beginSub1FinAmt;
            protected  int beginSub1FinAmtInd;
            protected  int beginSub1FinFeeNbr;
            protected  int beginSub1PctFeeNbr;
            protected  int beginSub1NfinFeeNbr;
            protected  int beginSub1NbilFeeNbr;
            protected  int beginSub1FeeAmtNet;
            protected  int beginSub1FeeAmtInd;
	
	/**
	* Constructor for SubPage1LnSerialized
	**/
    public SubPage1LnSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SubPage1LnSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SUB_PAGE_1_LN_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSub1Cc = getStartOffset() + 0;	// set offset for serialization
  
  
             beginSub1Desc = getStartOffset() + 4;	// set offset for serialization
  
             beginSub1FinNbr = getStartOffset() + 20;	// set offset for serialization
  
  
             beginSub1FinNbrDen = getStartOffset() + 32;	// set offset for serialization
  
  
             beginSub1FinAmt = getStartOffset() + 42;	// set offset for serialization
  
             beginSub1FinAmtInd = getStartOffset() + 60;	// set offset for serialization
  
  
             beginSub1FinFeeNbr = getStartOffset() + 63;	// set offset for serialization
  
  
             beginSub1PctFeeNbr = getStartOffset() + 73;	// set offset for serialization
  
  
             beginSub1NfinFeeNbr = getStartOffset() + 83;	// set offset for serialization
  
  
             beginSub1NbilFeeNbr = getStartOffset() + 93;	// set offset for serialization
  
  
             beginSub1FeeAmtNet = getStartOffset() + 106;	// set offset for serialization
  
             beginSub1FeeAmtInd = getStartOffset() + 126;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localSub1CcCounter = -1;
     public boolean isSub1CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSub1CcCounter != sharedCounter;
         localSub1CcCounter = sharedCounter; return hasModified;
     }
	protected static final int SUB_1_CC_LEN = 1;
	/**
	 * 	serialize this Sub1Cc
	 */
   protected void serializeSub1Cc(char[] sub1Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sub1Cc,0,getStringValue(),beginSub1Cc,SUB_1_CC_LEN);
       localSub1CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSub1CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSub1Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSub1Cc() {	 
   		return (substring(getStringValue(),beginSub1Cc,beginSub1Cc + SUB_1_CC_LEN));
   	}
     int localSub1DescCounter = -1;
     public boolean isSub1DescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSub1DescCounter != sharedCounter;
         localSub1DescCounter = sharedCounter; return hasModified;
     }
	protected static final int SUB_1_DESC_LEN = 16;
	/**
	 * 	serialize this Sub1Desc
	 */
   protected void serializeSub1Desc(char[] sub1Desc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sub1Desc,0,getStringValue(),beginSub1Desc,SUB_1_DESC_LEN);
       localSub1DescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSub1DescConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshSub1Desc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSub1Desc() {	 
   		return (substring(getStringValue(),beginSub1Desc,beginSub1Desc + SUB_1_DESC_LEN));
   	}
     int localSub1FinNbrCounter = -1;
     public boolean isSub1FinNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSub1FinNbrCounter != sharedCounter;
         localSub1FinNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int SUB_1_FIN_NBR_LEN = 11;
	/**
	 * 	serialize this Sub1FinNbr
	 */
   protected void serializeSub1FinNbr(char[] sub1FinNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sub1FinNbr,0,getStringValue(),beginSub1FinNbr,SUB_1_FIN_NBR_LEN);
       localSub1FinNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSub1FinNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshSub1FinNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSub1FinNbr() {	 
   		return (substring(getStringValue(),beginSub1FinNbr,beginSub1FinNbr + SUB_1_FIN_NBR_LEN));
   	}
     int localSub1FinNbrDenCounter = -1;
     public boolean isSub1FinNbrDenModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSub1FinNbrDenCounter != sharedCounter;
         localSub1FinNbrDenCounter = sharedCounter; return hasModified;
     }
	protected static final int SUB_1_FIN_NBR_DEN_LEN = 9;
	/**
	 * 	serialize this Sub1FinNbrDen
	 */
   protected void serializeSub1FinNbrDen(char[] sub1FinNbrDen) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sub1FinNbrDen,0,getStringValue(),beginSub1FinNbrDen,SUB_1_FIN_NBR_DEN_LEN);
       localSub1FinNbrDenCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSub1FinNbrDenConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshSub1FinNbrDen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSub1FinNbrDen() {	 
   		return (substring(getStringValue(),beginSub1FinNbrDen,beginSub1FinNbrDen + SUB_1_FIN_NBR_DEN_LEN));
   	}
     int localSub1FinAmtCounter = -1;
     public boolean isSub1FinAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSub1FinAmtCounter != sharedCounter;
         localSub1FinAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int SUB_1_FIN_AMT_LEN = 18;
	/**
	 * 	serialize this Sub1FinAmt
	 */
   protected void serializeSub1FinAmt(char[] sub1FinAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sub1FinAmt,0,getStringValue(),beginSub1FinAmt,SUB_1_FIN_AMT_LEN);
       localSub1FinAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSub1FinAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshSub1FinAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSub1FinAmt() {	 
   		return (substring(getStringValue(),beginSub1FinAmt,beginSub1FinAmt + SUB_1_FIN_AMT_LEN));
   	}
     int localSub1FinAmtIndCounter = -1;
     public boolean isSub1FinAmtIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSub1FinAmtIndCounter != sharedCounter;
         localSub1FinAmtIndCounter = sharedCounter; return hasModified;
     }
	protected static final int SUB_1_FIN_AMT_IND_LEN = 2;
	/**
	 * 	serialize this Sub1FinAmtInd
	 */
   protected void serializeSub1FinAmtInd(char[] sub1FinAmtInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sub1FinAmtInd,0,getStringValue(),beginSub1FinAmtInd,SUB_1_FIN_AMT_IND_LEN);
       localSub1FinAmtIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSub1FinAmtIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSub1FinAmtInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSub1FinAmtInd() {	 
   		return (substring(getStringValue(),beginSub1FinAmtInd,beginSub1FinAmtInd + SUB_1_FIN_AMT_IND_LEN));
   	}
     int localSub1FinFeeNbrCounter = -1;
     public boolean isSub1FinFeeNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSub1FinFeeNbrCounter != sharedCounter;
         localSub1FinFeeNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int SUB_1_FIN_FEE_NBR_LEN = 9;
	/**
	 * 	serialize this Sub1FinFeeNbr
	 */
   protected void serializeSub1FinFeeNbr(char[] sub1FinFeeNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sub1FinFeeNbr,0,getStringValue(),beginSub1FinFeeNbr,SUB_1_FIN_FEE_NBR_LEN);
       localSub1FinFeeNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSub1FinFeeNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshSub1FinFeeNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSub1FinFeeNbr() {	 
   		return (substring(getStringValue(),beginSub1FinFeeNbr,beginSub1FinFeeNbr + SUB_1_FIN_FEE_NBR_LEN));
   	}
     int localSub1PctFeeNbrCounter = -1;
     public boolean isSub1PctFeeNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSub1PctFeeNbrCounter != sharedCounter;
         localSub1PctFeeNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int SUB_1_PCT_FEE_NBR_LEN = 9;
	/**
	 * 	serialize this Sub1PctFeeNbr
	 */
   protected void serializeSub1PctFeeNbr(char[] sub1PctFeeNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sub1PctFeeNbr,0,getStringValue(),beginSub1PctFeeNbr,SUB_1_PCT_FEE_NBR_LEN);
       localSub1PctFeeNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSub1PctFeeNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshSub1PctFeeNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSub1PctFeeNbr() {	 
   		return (substring(getStringValue(),beginSub1PctFeeNbr,beginSub1PctFeeNbr + SUB_1_PCT_FEE_NBR_LEN));
   	}
     int localSub1NfinFeeNbrCounter = -1;
     public boolean isSub1NfinFeeNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSub1NfinFeeNbrCounter != sharedCounter;
         localSub1NfinFeeNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int SUB_1_NFIN_FEE_NBR_LEN = 9;
	/**
	 * 	serialize this Sub1NfinFeeNbr
	 */
   protected void serializeSub1NfinFeeNbr(char[] sub1NfinFeeNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sub1NfinFeeNbr,0,getStringValue(),beginSub1NfinFeeNbr,SUB_1_NFIN_FEE_NBR_LEN);
       localSub1NfinFeeNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSub1NfinFeeNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshSub1NfinFeeNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSub1NfinFeeNbr() {	 
   		return (substring(getStringValue(),beginSub1NfinFeeNbr,beginSub1NfinFeeNbr + SUB_1_NFIN_FEE_NBR_LEN));
   	}
     int localSub1NbilFeeNbrCounter = -1;
     public boolean isSub1NbilFeeNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSub1NbilFeeNbrCounter != sharedCounter;
         localSub1NbilFeeNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int SUB_1_NBIL_FEE_NBR_LEN = 9;
	/**
	 * 	serialize this Sub1NbilFeeNbr
	 */
   protected void serializeSub1NbilFeeNbr(char[] sub1NbilFeeNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sub1NbilFeeNbr,0,getStringValue(),beginSub1NbilFeeNbr,SUB_1_NBIL_FEE_NBR_LEN);
       localSub1NbilFeeNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSub1NbilFeeNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshSub1NbilFeeNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSub1NbilFeeNbr() {	 
   		return (substring(getStringValue(),beginSub1NbilFeeNbr,beginSub1NbilFeeNbr + SUB_1_NBIL_FEE_NBR_LEN));
   	}
     int localSub1FeeAmtNetCounter = -1;
     public boolean isSub1FeeAmtNetModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSub1FeeAmtNetCounter != sharedCounter;
         localSub1FeeAmtNetCounter = sharedCounter; return hasModified;
     }
	protected static final int SUB_1_FEE_AMT_NET_LEN = 20;
	/**
	 * 	serialize this Sub1FeeAmtNet
	 */
   protected void serializeSub1FeeAmtNet(char[] sub1FeeAmtNet) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sub1FeeAmtNet,0,getStringValue(),beginSub1FeeAmtNet,SUB_1_FEE_AMT_NET_LEN);
       localSub1FeeAmtNetCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSub1FeeAmtNetConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshSub1FeeAmtNet is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSub1FeeAmtNet() {	 
   		return (substring(getStringValue(),beginSub1FeeAmtNet,beginSub1FeeAmtNet + SUB_1_FEE_AMT_NET_LEN));
   	}
     int localSub1FeeAmtIndCounter = -1;
     public boolean isSub1FeeAmtIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSub1FeeAmtIndCounter != sharedCounter;
         localSub1FeeAmtIndCounter = sharedCounter; return hasModified;
     }
	protected static final int SUB_1_FEE_AMT_IND_LEN = 2;
	/**
	 * 	serialize this Sub1FeeAmtInd
	 */
   protected void serializeSub1FeeAmtInd(char[] sub1FeeAmtInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sub1FeeAmtInd,0,getStringValue(),beginSub1FeeAmtInd,SUB_1_FEE_AMT_IND_LEN);
       localSub1FeeAmtIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSub1FeeAmtIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSub1FeeAmtInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSub1FeeAmtInd() {	 
   		return (substring(getStringValue(),beginSub1FeeAmtInd,beginSub1FeeAmtInd + SUB_1_FEE_AMT_IND_LEN));
   	}




}
  

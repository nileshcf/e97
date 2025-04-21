package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class TotPage1LnSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TotPage1LnSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TotPage1LnSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TOT_PAGE_1_LN_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTot1Cc;
            protected  int beginTot1Desc;
            protected  int beginTot1FinNbr;
            protected  int beginTot1FinNbrDen;
            protected  int beginTot1FinAmt;
            protected  int beginTot1FinAmtInd;
            protected  int beginTot1FinFeeNbr;
            protected  int beginTot1PctFeeNbr;
            protected  int beginTot1NfinFeeNbr;
            protected  int beginTot1NbilFeeNbr;
            protected  int beginTot1FeeAmtNet;
            protected  int beginTot1FeeAmtInd;
	
	/**
	* Constructor for TotPage1LnSerialized
	**/
    public TotPage1LnSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TotPage1LnSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TOT_PAGE_1_LN_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTot1Cc = getStartOffset() + 0;	// set offset for serialization
  
  
             beginTot1Desc = getStartOffset() + 4;	// set offset for serialization
  
             beginTot1FinNbr = getStartOffset() + 20;	// set offset for serialization
  
  
             beginTot1FinNbrDen = getStartOffset() + 32;	// set offset for serialization
  
  
             beginTot1FinAmt = getStartOffset() + 42;	// set offset for serialization
  
             beginTot1FinAmtInd = getStartOffset() + 60;	// set offset for serialization
  
  
             beginTot1FinFeeNbr = getStartOffset() + 63;	// set offset for serialization
  
  
             beginTot1PctFeeNbr = getStartOffset() + 73;	// set offset for serialization
  
  
             beginTot1NfinFeeNbr = getStartOffset() + 83;	// set offset for serialization
  
  
             beginTot1NbilFeeNbr = getStartOffset() + 93;	// set offset for serialization
  
  
             beginTot1FeeAmtNet = getStartOffset() + 106;	// set offset for serialization
  
             beginTot1FeeAmtInd = getStartOffset() + 126;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localTot1CcCounter = -1;
     public boolean isTot1CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTot1CcCounter != sharedCounter;
         localTot1CcCounter = sharedCounter; return hasModified;
     }
	protected static final int TOT_1_CC_LEN = 1;
	/**
	 * 	serialize this Tot1Cc
	 */
   protected void serializeTot1Cc(char[] tot1Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tot1Cc,0,getStringValue(),beginTot1Cc,TOT_1_CC_LEN);
       localTot1CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTot1CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTot1Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTot1Cc() {	 
   		return (substring(getStringValue(),beginTot1Cc,beginTot1Cc + TOT_1_CC_LEN));
   	}
     int localTot1DescCounter = -1;
     public boolean isTot1DescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTot1DescCounter != sharedCounter;
         localTot1DescCounter = sharedCounter; return hasModified;
     }
	protected static final int TOT_1_DESC_LEN = 16;
	/**
	 * 	serialize this Tot1Desc
	 */
   protected void serializeTot1Desc(char[] tot1Desc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tot1Desc,0,getStringValue(),beginTot1Desc,TOT_1_DESC_LEN);
       localTot1DescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTot1DescConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshTot1Desc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTot1Desc() {	 
   		return (substring(getStringValue(),beginTot1Desc,beginTot1Desc + TOT_1_DESC_LEN));
   	}
     int localTot1FinNbrCounter = -1;
     public boolean isTot1FinNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTot1FinNbrCounter != sharedCounter;
         localTot1FinNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int TOT_1_FIN_NBR_LEN = 11;
	/**
	 * 	serialize this Tot1FinNbr
	 */
   protected void serializeTot1FinNbr(char[] tot1FinNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tot1FinNbr,0,getStringValue(),beginTot1FinNbr,TOT_1_FIN_NBR_LEN);
       localTot1FinNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTot1FinNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshTot1FinNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTot1FinNbr() {	 
   		return (substring(getStringValue(),beginTot1FinNbr,beginTot1FinNbr + TOT_1_FIN_NBR_LEN));
   	}
     int localTot1FinNbrDenCounter = -1;
     public boolean isTot1FinNbrDenModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTot1FinNbrDenCounter != sharedCounter;
         localTot1FinNbrDenCounter = sharedCounter; return hasModified;
     }
	protected static final int TOT_1_FIN_NBR_DEN_LEN = 9;
	/**
	 * 	serialize this Tot1FinNbrDen
	 */
   protected void serializeTot1FinNbrDen(char[] tot1FinNbrDen) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tot1FinNbrDen,0,getStringValue(),beginTot1FinNbrDen,TOT_1_FIN_NBR_DEN_LEN);
       localTot1FinNbrDenCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTot1FinNbrDenConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshTot1FinNbrDen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTot1FinNbrDen() {	 
   		return (substring(getStringValue(),beginTot1FinNbrDen,beginTot1FinNbrDen + TOT_1_FIN_NBR_DEN_LEN));
   	}
     int localTot1FinAmtCounter = -1;
     public boolean isTot1FinAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTot1FinAmtCounter != sharedCounter;
         localTot1FinAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int TOT_1_FIN_AMT_LEN = 18;
	/**
	 * 	serialize this Tot1FinAmt
	 */
   protected void serializeTot1FinAmt(char[] tot1FinAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tot1FinAmt,0,getStringValue(),beginTot1FinAmt,TOT_1_FIN_AMT_LEN);
       localTot1FinAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTot1FinAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshTot1FinAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTot1FinAmt() {	 
   		return (substring(getStringValue(),beginTot1FinAmt,beginTot1FinAmt + TOT_1_FIN_AMT_LEN));
   	}
     int localTot1FinAmtIndCounter = -1;
     public boolean isTot1FinAmtIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTot1FinAmtIndCounter != sharedCounter;
         localTot1FinAmtIndCounter = sharedCounter; return hasModified;
     }
	protected static final int TOT_1_FIN_AMT_IND_LEN = 2;
	/**
	 * 	serialize this Tot1FinAmtInd
	 */
   protected void serializeTot1FinAmtInd(char[] tot1FinAmtInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tot1FinAmtInd,0,getStringValue(),beginTot1FinAmtInd,TOT_1_FIN_AMT_IND_LEN);
       localTot1FinAmtIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTot1FinAmtIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTot1FinAmtInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTot1FinAmtInd() {	 
   		return (substring(getStringValue(),beginTot1FinAmtInd,beginTot1FinAmtInd + TOT_1_FIN_AMT_IND_LEN));
   	}
     int localTot1FinFeeNbrCounter = -1;
     public boolean isTot1FinFeeNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTot1FinFeeNbrCounter != sharedCounter;
         localTot1FinFeeNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int TOT_1_FIN_FEE_NBR_LEN = 9;
	/**
	 * 	serialize this Tot1FinFeeNbr
	 */
   protected void serializeTot1FinFeeNbr(char[] tot1FinFeeNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tot1FinFeeNbr,0,getStringValue(),beginTot1FinFeeNbr,TOT_1_FIN_FEE_NBR_LEN);
       localTot1FinFeeNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTot1FinFeeNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshTot1FinFeeNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTot1FinFeeNbr() {	 
   		return (substring(getStringValue(),beginTot1FinFeeNbr,beginTot1FinFeeNbr + TOT_1_FIN_FEE_NBR_LEN));
   	}
     int localTot1PctFeeNbrCounter = -1;
     public boolean isTot1PctFeeNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTot1PctFeeNbrCounter != sharedCounter;
         localTot1PctFeeNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int TOT_1_PCT_FEE_NBR_LEN = 9;
	/**
	 * 	serialize this Tot1PctFeeNbr
	 */
   protected void serializeTot1PctFeeNbr(char[] tot1PctFeeNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tot1PctFeeNbr,0,getStringValue(),beginTot1PctFeeNbr,TOT_1_PCT_FEE_NBR_LEN);
       localTot1PctFeeNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTot1PctFeeNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshTot1PctFeeNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTot1PctFeeNbr() {	 
   		return (substring(getStringValue(),beginTot1PctFeeNbr,beginTot1PctFeeNbr + TOT_1_PCT_FEE_NBR_LEN));
   	}
     int localTot1NfinFeeNbrCounter = -1;
     public boolean isTot1NfinFeeNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTot1NfinFeeNbrCounter != sharedCounter;
         localTot1NfinFeeNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int TOT_1_NFIN_FEE_NBR_LEN = 9;
	/**
	 * 	serialize this Tot1NfinFeeNbr
	 */
   protected void serializeTot1NfinFeeNbr(char[] tot1NfinFeeNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tot1NfinFeeNbr,0,getStringValue(),beginTot1NfinFeeNbr,TOT_1_NFIN_FEE_NBR_LEN);
       localTot1NfinFeeNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTot1NfinFeeNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshTot1NfinFeeNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTot1NfinFeeNbr() {	 
   		return (substring(getStringValue(),beginTot1NfinFeeNbr,beginTot1NfinFeeNbr + TOT_1_NFIN_FEE_NBR_LEN));
   	}
     int localTot1NbilFeeNbrCounter = -1;
     public boolean isTot1NbilFeeNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTot1NbilFeeNbrCounter != sharedCounter;
         localTot1NbilFeeNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int TOT_1_NBIL_FEE_NBR_LEN = 9;
	/**
	 * 	serialize this Tot1NbilFeeNbr
	 */
   protected void serializeTot1NbilFeeNbr(char[] tot1NbilFeeNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tot1NbilFeeNbr,0,getStringValue(),beginTot1NbilFeeNbr,TOT_1_NBIL_FEE_NBR_LEN);
       localTot1NbilFeeNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTot1NbilFeeNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshTot1NbilFeeNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTot1NbilFeeNbr() {	 
   		return (substring(getStringValue(),beginTot1NbilFeeNbr,beginTot1NbilFeeNbr + TOT_1_NBIL_FEE_NBR_LEN));
   	}
     int localTot1FeeAmtNetCounter = -1;
     public boolean isTot1FeeAmtNetModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTot1FeeAmtNetCounter != sharedCounter;
         localTot1FeeAmtNetCounter = sharedCounter; return hasModified;
     }
	protected static final int TOT_1_FEE_AMT_NET_LEN = 20;
	/**
	 * 	serialize this Tot1FeeAmtNet
	 */
   protected void serializeTot1FeeAmtNet(char[] tot1FeeAmtNet) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tot1FeeAmtNet,0,getStringValue(),beginTot1FeeAmtNet,TOT_1_FEE_AMT_NET_LEN);
       localTot1FeeAmtNetCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTot1FeeAmtNetConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshTot1FeeAmtNet is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTot1FeeAmtNet() {	 
   		return (substring(getStringValue(),beginTot1FeeAmtNet,beginTot1FeeAmtNet + TOT_1_FEE_AMT_NET_LEN));
   	}
     int localTot1FeeAmtIndCounter = -1;
     public boolean isTot1FeeAmtIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTot1FeeAmtIndCounter != sharedCounter;
         localTot1FeeAmtIndCounter = sharedCounter; return hasModified;
     }
	protected static final int TOT_1_FEE_AMT_IND_LEN = 2;
	/**
	 * 	serialize this Tot1FeeAmtInd
	 */
   protected void serializeTot1FeeAmtInd(char[] tot1FeeAmtInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tot1FeeAmtInd,0,getStringValue(),beginTot1FeeAmtInd,TOT_1_FEE_AMT_IND_LEN);
       localTot1FeeAmtIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTot1FeeAmtIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTot1FeeAmtInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTot1FeeAmtInd() {	 
   		return (substring(getStringValue(),beginTot1FeeAmtInd,beginTot1FeeAmtInd + TOT_1_FEE_AMT_IND_LEN));
   	}




}
  

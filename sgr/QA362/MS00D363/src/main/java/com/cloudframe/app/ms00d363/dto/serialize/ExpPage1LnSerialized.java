package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class ExpPage1LnSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ExpPage1LnSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ExpPage1LnSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EXP_PAGE_1_LN_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginExp1Cc;
            protected  int beginExp1Desc;
            protected  int beginExp1FinNbr;
            protected  int beginExp1FinNbrDen;
            protected  int beginExp1FinAmt;
            protected  int beginExp1FinAmtInd;
            protected  int beginExp1FinFeeNbr;
            protected  int beginExp1PctFeeNbr;
            protected  int beginExp1NfinFeeNbr;
            protected  int beginExp1NbilFeeNbr;
            protected  int beginExp1FeeAmtNet;
            protected  int beginExp1FeeAmtInd;
	
	/**
	* Constructor for ExpPage1LnSerialized
	**/
    public ExpPage1LnSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ExpPage1LnSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EXP_PAGE_1_LN_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginExp1Cc = getStartOffset() + 0;	// set offset for serialization
  
  
             beginExp1Desc = getStartOffset() + 4;	// set offset for serialization
  
             beginExp1FinNbr = getStartOffset() + 22;	// set offset for serialization
  
  
             beginExp1FinNbrDen = getStartOffset() + 32;	// set offset for serialization
  
  
             beginExp1FinAmt = getStartOffset() + 42;	// set offset for serialization
  
             beginExp1FinAmtInd = getStartOffset() + 60;	// set offset for serialization
  
  
             beginExp1FinFeeNbr = getStartOffset() + 63;	// set offset for serialization
  
  
             beginExp1PctFeeNbr = getStartOffset() + 73;	// set offset for serialization
  
  
             beginExp1NfinFeeNbr = getStartOffset() + 83;	// set offset for serialization
  
  
             beginExp1NbilFeeNbr = getStartOffset() + 93;	// set offset for serialization
  
  
             beginExp1FeeAmtNet = getStartOffset() + 110;	// set offset for serialization
  
             beginExp1FeeAmtInd = getStartOffset() + 126;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localExp1CcCounter = -1;
     public boolean isExp1CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExp1CcCounter != sharedCounter;
         localExp1CcCounter = sharedCounter; return hasModified;
     }
	protected static final int EXP_1_CC_LEN = 1;
	/**
	 * 	serialize this Exp1Cc
	 */
   protected void serializeExp1Cc(char[] exp1Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(exp1Cc,0,getStringValue(),beginExp1Cc,EXP_1_CC_LEN);
       localExp1CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExp1CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshExp1Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExp1Cc() {	 
   		return (substring(getStringValue(),beginExp1Cc,beginExp1Cc + EXP_1_CC_LEN));
   	}
     int localExp1DescCounter = -1;
     public boolean isExp1DescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExp1DescCounter != sharedCounter;
         localExp1DescCounter = sharedCounter; return hasModified;
     }
	protected static final int EXP_1_DESC_LEN = 18;
	/**
	 * 	serialize this Exp1Desc
	 */
   protected void serializeExp1Desc(char[] exp1Desc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(exp1Desc,0,getStringValue(),beginExp1Desc,EXP_1_DESC_LEN);
       localExp1DescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExp1DescConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshExp1Desc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExp1Desc() {	 
   		return (substring(getStringValue(),beginExp1Desc,beginExp1Desc + EXP_1_DESC_LEN));
   	}
     int localExp1FinNbrCounter = -1;
     public boolean isExp1FinNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExp1FinNbrCounter != sharedCounter;
         localExp1FinNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int EXP_1_FIN_NBR_LEN = 9;
	/**
	 * 	serialize this Exp1FinNbr
	 */
   protected void serializeExp1FinNbr(char[] exp1FinNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(exp1FinNbr,0,getStringValue(),beginExp1FinNbr,EXP_1_FIN_NBR_LEN);
       localExp1FinNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExp1FinNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshExp1FinNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExp1FinNbr() {	 
   		return (substring(getStringValue(),beginExp1FinNbr,beginExp1FinNbr + EXP_1_FIN_NBR_LEN));
   	}
     int localExp1FinNbrDenCounter = -1;
     public boolean isExp1FinNbrDenModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExp1FinNbrDenCounter != sharedCounter;
         localExp1FinNbrDenCounter = sharedCounter; return hasModified;
     }
	protected static final int EXP_1_FIN_NBR_DEN_LEN = 9;
	/**
	 * 	serialize this Exp1FinNbrDen
	 */
   protected void serializeExp1FinNbrDen(char[] exp1FinNbrDen) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(exp1FinNbrDen,0,getStringValue(),beginExp1FinNbrDen,EXP_1_FIN_NBR_DEN_LEN);
       localExp1FinNbrDenCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExp1FinNbrDenConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshExp1FinNbrDen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExp1FinNbrDen() {	 
   		return (substring(getStringValue(),beginExp1FinNbrDen,beginExp1FinNbrDen + EXP_1_FIN_NBR_DEN_LEN));
   	}
     int localExp1FinAmtCounter = -1;
     public boolean isExp1FinAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExp1FinAmtCounter != sharedCounter;
         localExp1FinAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int EXP_1_FIN_AMT_LEN = 18;
	/**
	 * 	serialize this Exp1FinAmt
	 */
   protected void serializeExp1FinAmt(char[] exp1FinAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(exp1FinAmt,0,getStringValue(),beginExp1FinAmt,EXP_1_FIN_AMT_LEN);
       localExp1FinAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExp1FinAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshExp1FinAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExp1FinAmt() {	 
   		return (substring(getStringValue(),beginExp1FinAmt,beginExp1FinAmt + EXP_1_FIN_AMT_LEN));
   	}
     int localExp1FinAmtIndCounter = -1;
     public boolean isExp1FinAmtIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExp1FinAmtIndCounter != sharedCounter;
         localExp1FinAmtIndCounter = sharedCounter; return hasModified;
     }
	protected static final int EXP_1_FIN_AMT_IND_LEN = 2;
	/**
	 * 	serialize this Exp1FinAmtInd
	 */
   protected void serializeExp1FinAmtInd(char[] exp1FinAmtInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(exp1FinAmtInd,0,getStringValue(),beginExp1FinAmtInd,EXP_1_FIN_AMT_IND_LEN);
       localExp1FinAmtIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExp1FinAmtIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshExp1FinAmtInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExp1FinAmtInd() {	 
   		return (substring(getStringValue(),beginExp1FinAmtInd,beginExp1FinAmtInd + EXP_1_FIN_AMT_IND_LEN));
   	}
     int localExp1FinFeeNbrCounter = -1;
     public boolean isExp1FinFeeNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExp1FinFeeNbrCounter != sharedCounter;
         localExp1FinFeeNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int EXP_1_FIN_FEE_NBR_LEN = 9;
	/**
	 * 	serialize this Exp1FinFeeNbr
	 */
   protected void serializeExp1FinFeeNbr(char[] exp1FinFeeNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(exp1FinFeeNbr,0,getStringValue(),beginExp1FinFeeNbr,EXP_1_FIN_FEE_NBR_LEN);
       localExp1FinFeeNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExp1FinFeeNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshExp1FinFeeNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExp1FinFeeNbr() {	 
   		return (substring(getStringValue(),beginExp1FinFeeNbr,beginExp1FinFeeNbr + EXP_1_FIN_FEE_NBR_LEN));
   	}
     int localExp1PctFeeNbrCounter = -1;
     public boolean isExp1PctFeeNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExp1PctFeeNbrCounter != sharedCounter;
         localExp1PctFeeNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int EXP_1_PCT_FEE_NBR_LEN = 9;
	/**
	 * 	serialize this Exp1PctFeeNbr
	 */
   protected void serializeExp1PctFeeNbr(char[] exp1PctFeeNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(exp1PctFeeNbr,0,getStringValue(),beginExp1PctFeeNbr,EXP_1_PCT_FEE_NBR_LEN);
       localExp1PctFeeNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExp1PctFeeNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshExp1PctFeeNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExp1PctFeeNbr() {	 
   		return (substring(getStringValue(),beginExp1PctFeeNbr,beginExp1PctFeeNbr + EXP_1_PCT_FEE_NBR_LEN));
   	}
     int localExp1NfinFeeNbrCounter = -1;
     public boolean isExp1NfinFeeNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExp1NfinFeeNbrCounter != sharedCounter;
         localExp1NfinFeeNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int EXP_1_NFIN_FEE_NBR_LEN = 9;
	/**
	 * 	serialize this Exp1NfinFeeNbr
	 */
   protected void serializeExp1NfinFeeNbr(char[] exp1NfinFeeNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(exp1NfinFeeNbr,0,getStringValue(),beginExp1NfinFeeNbr,EXP_1_NFIN_FEE_NBR_LEN);
       localExp1NfinFeeNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExp1NfinFeeNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshExp1NfinFeeNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExp1NfinFeeNbr() {	 
   		return (substring(getStringValue(),beginExp1NfinFeeNbr,beginExp1NfinFeeNbr + EXP_1_NFIN_FEE_NBR_LEN));
   	}
     int localExp1NbilFeeNbrCounter = -1;
     public boolean isExp1NbilFeeNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExp1NbilFeeNbrCounter != sharedCounter;
         localExp1NbilFeeNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int EXP_1_NBIL_FEE_NBR_LEN = 9;
	/**
	 * 	serialize this Exp1NbilFeeNbr
	 */
   protected void serializeExp1NbilFeeNbr(char[] exp1NbilFeeNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(exp1NbilFeeNbr,0,getStringValue(),beginExp1NbilFeeNbr,EXP_1_NBIL_FEE_NBR_LEN);
       localExp1NbilFeeNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExp1NbilFeeNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshExp1NbilFeeNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExp1NbilFeeNbr() {	 
   		return (substring(getStringValue(),beginExp1NbilFeeNbr,beginExp1NbilFeeNbr + EXP_1_NBIL_FEE_NBR_LEN));
   	}
     int localExp1FeeAmtNetCounter = -1;
     public boolean isExp1FeeAmtNetModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExp1FeeAmtNetCounter != sharedCounter;
         localExp1FeeAmtNetCounter = sharedCounter; return hasModified;
     }
	protected static final int EXP_1_FEE_AMT_NET_LEN = 16;
	/**
	 * 	serialize this Exp1FeeAmtNet
	 */
   protected void serializeExp1FeeAmtNet(char[] exp1FeeAmtNet) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(exp1FeeAmtNet,0,getStringValue(),beginExp1FeeAmtNet,EXP_1_FEE_AMT_NET_LEN);
       localExp1FeeAmtNetCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExp1FeeAmtNetConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshExp1FeeAmtNet is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExp1FeeAmtNet() {	 
   		return (substring(getStringValue(),beginExp1FeeAmtNet,beginExp1FeeAmtNet + EXP_1_FEE_AMT_NET_LEN));
   	}
     int localExp1FeeAmtIndCounter = -1;
     public boolean isExp1FeeAmtIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExp1FeeAmtIndCounter != sharedCounter;
         localExp1FeeAmtIndCounter = sharedCounter; return hasModified;
     }
	protected static final int EXP_1_FEE_AMT_IND_LEN = 2;
	/**
	 * 	serialize this Exp1FeeAmtInd
	 */
   protected void serializeExp1FeeAmtInd(char[] exp1FeeAmtInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(exp1FeeAmtInd,0,getStringValue(),beginExp1FeeAmtInd,EXP_1_FEE_AMT_IND_LEN);
       localExp1FeeAmtIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExp1FeeAmtIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshExp1FeeAmtInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExp1FeeAmtInd() {	 
   		return (substring(getStringValue(),beginExp1FeeAmtInd,beginExp1FeeAmtInd + EXP_1_FEE_AMT_IND_LEN));
   	}




}
  

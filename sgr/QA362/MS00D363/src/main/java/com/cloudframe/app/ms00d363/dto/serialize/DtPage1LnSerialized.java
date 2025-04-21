package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage1LnSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage1LnSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage1LnSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_1_LN_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt1Cc;
            protected  int beginDt1Desc;
            protected  int beginDt1FinNbr;
            protected  int beginDt1FinNbrDen;
            protected  int beginDt1FinAmt;
            protected  int beginDt1FinAmtInd;
            protected  int beginDt1FinFeeNbr;
            protected  int beginDt1PctFeeNbr;
            protected  int beginDt1NfinFeeNbr;
            protected  int beginDt1NbilFeeNbr;
            protected  int beginDt1FeeAmtNet;
            protected  int beginDt1FeeAmtInd;
	
	/**
	* Constructor for DtPage1LnSerialized
	**/
    public DtPage1LnSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage1LnSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_1_LN_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt1Cc = getStartOffset() + 0;	// set offset for serialization
  
  
             beginDt1Desc = getStartOffset() + 4;	// set offset for serialization
  
             beginDt1FinNbr = getStartOffset() + 22;	// set offset for serialization
  
  
             beginDt1FinNbrDen = getStartOffset() + 32;	// set offset for serialization
  
  
             beginDt1FinAmt = getStartOffset() + 42;	// set offset for serialization
  
             beginDt1FinAmtInd = getStartOffset() + 60;	// set offset for serialization
  
  
             beginDt1FinFeeNbr = getStartOffset() + 63;	// set offset for serialization
  
  
             beginDt1PctFeeNbr = getStartOffset() + 73;	// set offset for serialization
  
  
             beginDt1NfinFeeNbr = getStartOffset() + 83;	// set offset for serialization
  
  
             beginDt1NbilFeeNbr = getStartOffset() + 93;	// set offset for serialization
  
  
             beginDt1FeeAmtNet = getStartOffset() + 106;	// set offset for serialization
  
             beginDt1FeeAmtInd = getStartOffset() + 126;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt1CcCounter = -1;
     public boolean isDt1CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1CcCounter != sharedCounter;
         localDt1CcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CC_LEN = 1;
	/**
	 * 	serialize this Dt1Cc
	 */
   protected void serializeDt1Cc(char[] dt1Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1Cc,0,getStringValue(),beginDt1Cc,DT_1_CC_LEN);
       localDt1CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1Cc() {	 
   		return (substring(getStringValue(),beginDt1Cc,beginDt1Cc + DT_1_CC_LEN));
   	}
     int localDt1DescCounter = -1;
     public boolean isDt1DescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1DescCounter != sharedCounter;
         localDt1DescCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_DESC_LEN = 18;
	/**
	 * 	serialize this Dt1Desc
	 */
   protected void serializeDt1Desc(char[] dt1Desc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1Desc,0,getStringValue(),beginDt1Desc,DT_1_DESC_LEN);
       localDt1DescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1DescConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt1Desc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1Desc() {	 
   		return (substring(getStringValue(),beginDt1Desc,beginDt1Desc + DT_1_DESC_LEN));
   	}
     int localDt1FinNbrCounter = -1;
     public boolean isDt1FinNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1FinNbrCounter != sharedCounter;
         localDt1FinNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_FIN_NBR_LEN = 9;
	/**
	 * 	serialize this Dt1FinNbr
	 */
   protected void serializeDt1FinNbr(char[] dt1FinNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1FinNbr,0,getStringValue(),beginDt1FinNbr,DT_1_FIN_NBR_LEN);
       localDt1FinNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1FinNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshDt1FinNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1FinNbr() {	 
   		return (substring(getStringValue(),beginDt1FinNbr,beginDt1FinNbr + DT_1_FIN_NBR_LEN));
   	}
     int localDt1FinNbrDenCounter = -1;
     public boolean isDt1FinNbrDenModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1FinNbrDenCounter != sharedCounter;
         localDt1FinNbrDenCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_FIN_NBR_DEN_LEN = 9;
	/**
	 * 	serialize this Dt1FinNbrDen
	 */
   protected void serializeDt1FinNbrDen(char[] dt1FinNbrDen) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1FinNbrDen,0,getStringValue(),beginDt1FinNbrDen,DT_1_FIN_NBR_DEN_LEN);
       localDt1FinNbrDenCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1FinNbrDenConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshDt1FinNbrDen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1FinNbrDen() {	 
   		return (substring(getStringValue(),beginDt1FinNbrDen,beginDt1FinNbrDen + DT_1_FIN_NBR_DEN_LEN));
   	}
     int localDt1FinAmtCounter = -1;
     public boolean isDt1FinAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1FinAmtCounter != sharedCounter;
         localDt1FinAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_FIN_AMT_LEN = 18;
	/**
	 * 	serialize this Dt1FinAmt
	 */
   protected void serializeDt1FinAmt(char[] dt1FinAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1FinAmt,0,getStringValue(),beginDt1FinAmt,DT_1_FIN_AMT_LEN);
       localDt1FinAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1FinAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDt1FinAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1FinAmt() {	 
   		return (substring(getStringValue(),beginDt1FinAmt,beginDt1FinAmt + DT_1_FIN_AMT_LEN));
   	}
     int localDt1FinAmtIndCounter = -1;
     public boolean isDt1FinAmtIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1FinAmtIndCounter != sharedCounter;
         localDt1FinAmtIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_FIN_AMT_IND_LEN = 2;
	/**
	 * 	serialize this Dt1FinAmtInd
	 */
   protected void serializeDt1FinAmtInd(char[] dt1FinAmtInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1FinAmtInd,0,getStringValue(),beginDt1FinAmtInd,DT_1_FIN_AMT_IND_LEN);
       localDt1FinAmtIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1FinAmtIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt1FinAmtInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1FinAmtInd() {	 
   		return (substring(getStringValue(),beginDt1FinAmtInd,beginDt1FinAmtInd + DT_1_FIN_AMT_IND_LEN));
   	}
     int localDt1FinFeeNbrCounter = -1;
     public boolean isDt1FinFeeNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1FinFeeNbrCounter != sharedCounter;
         localDt1FinFeeNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_FIN_FEE_NBR_LEN = 9;
	/**
	 * 	serialize this Dt1FinFeeNbr
	 */
   protected void serializeDt1FinFeeNbr(char[] dt1FinFeeNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1FinFeeNbr,0,getStringValue(),beginDt1FinFeeNbr,DT_1_FIN_FEE_NBR_LEN);
       localDt1FinFeeNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1FinFeeNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshDt1FinFeeNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1FinFeeNbr() {	 
   		return (substring(getStringValue(),beginDt1FinFeeNbr,beginDt1FinFeeNbr + DT_1_FIN_FEE_NBR_LEN));
   	}
     int localDt1PctFeeNbrCounter = -1;
     public boolean isDt1PctFeeNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1PctFeeNbrCounter != sharedCounter;
         localDt1PctFeeNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_PCT_FEE_NBR_LEN = 9;
	/**
	 * 	serialize this Dt1PctFeeNbr
	 */
   protected void serializeDt1PctFeeNbr(char[] dt1PctFeeNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1PctFeeNbr,0,getStringValue(),beginDt1PctFeeNbr,DT_1_PCT_FEE_NBR_LEN);
       localDt1PctFeeNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1PctFeeNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshDt1PctFeeNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1PctFeeNbr() {	 
   		return (substring(getStringValue(),beginDt1PctFeeNbr,beginDt1PctFeeNbr + DT_1_PCT_FEE_NBR_LEN));
   	}
     int localDt1NfinFeeNbrCounter = -1;
     public boolean isDt1NfinFeeNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1NfinFeeNbrCounter != sharedCounter;
         localDt1NfinFeeNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_NFIN_FEE_NBR_LEN = 9;
	/**
	 * 	serialize this Dt1NfinFeeNbr
	 */
   protected void serializeDt1NfinFeeNbr(char[] dt1NfinFeeNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1NfinFeeNbr,0,getStringValue(),beginDt1NfinFeeNbr,DT_1_NFIN_FEE_NBR_LEN);
       localDt1NfinFeeNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1NfinFeeNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshDt1NfinFeeNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1NfinFeeNbr() {	 
   		return (substring(getStringValue(),beginDt1NfinFeeNbr,beginDt1NfinFeeNbr + DT_1_NFIN_FEE_NBR_LEN));
   	}
     int localDt1NbilFeeNbrCounter = -1;
     public boolean isDt1NbilFeeNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1NbilFeeNbrCounter != sharedCounter;
         localDt1NbilFeeNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_NBIL_FEE_NBR_LEN = 9;
	/**
	 * 	serialize this Dt1NbilFeeNbr
	 */
   protected void serializeDt1NbilFeeNbr(char[] dt1NbilFeeNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1NbilFeeNbr,0,getStringValue(),beginDt1NbilFeeNbr,DT_1_NBIL_FEE_NBR_LEN);
       localDt1NbilFeeNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1NbilFeeNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshDt1NbilFeeNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1NbilFeeNbr() {	 
   		return (substring(getStringValue(),beginDt1NbilFeeNbr,beginDt1NbilFeeNbr + DT_1_NBIL_FEE_NBR_LEN));
   	}
     int localDt1FeeAmtNetCounter = -1;
     public boolean isDt1FeeAmtNetModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1FeeAmtNetCounter != sharedCounter;
         localDt1FeeAmtNetCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_FEE_AMT_NET_LEN = 20;
	/**
	 * 	serialize this Dt1FeeAmtNet
	 */
   protected void serializeDt1FeeAmtNet(char[] dt1FeeAmtNet) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1FeeAmtNet,0,getStringValue(),beginDt1FeeAmtNet,DT_1_FEE_AMT_NET_LEN);
       localDt1FeeAmtNetCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1FeeAmtNetConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshDt1FeeAmtNet is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1FeeAmtNet() {	 
   		return (substring(getStringValue(),beginDt1FeeAmtNet,beginDt1FeeAmtNet + DT_1_FEE_AMT_NET_LEN));
   	}
     int localDt1FeeAmtIndCounter = -1;
     public boolean isDt1FeeAmtIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1FeeAmtIndCounter != sharedCounter;
         localDt1FeeAmtIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_FEE_AMT_IND_LEN = 2;
	/**
	 * 	serialize this Dt1FeeAmtInd
	 */
   protected void serializeDt1FeeAmtInd(char[] dt1FeeAmtInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1FeeAmtInd,0,getStringValue(),beginDt1FeeAmtInd,DT_1_FEE_AMT_IND_LEN);
       localDt1FeeAmtIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1FeeAmtIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt1FeeAmtInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1FeeAmtInd() {	 
   		return (substring(getStringValue(),beginDt1FeeAmtInd,beginDt1FeeAmtInd + DT_1_FEE_AMT_IND_LEN));
   	}




}
  

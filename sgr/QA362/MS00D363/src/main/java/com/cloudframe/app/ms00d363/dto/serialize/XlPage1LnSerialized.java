package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class XlPage1LnSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class XlPage1LnSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(XlPage1LnSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int XL_PAGE_1_LN_LENGTH = 498;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginXl1ProcId;
            protected  int beginXl1InstId;
            protected  int beginXl1Currency;
            protected  int beginXl1SettIca;
            protected  int beginXl1Ssc;
            protected  int beginXl1Isis;
            protected  int beginXl1ProdDesc;
            protected  int beginXl1AcqIss;
            protected  int beginXl1Desc;
            protected  int beginXl1FinNbr;
            protected  int beginXl1FinNbrDen;
            protected  int beginXl1FinAmt;
            protected  int beginXl1FinAmtInd;
            protected  int beginXl1FinFeeNbr;
            protected  int beginXl1PctFeeNbr;
            protected  int beginXl1NfinFeeNbr;
            protected  int beginXl1NbilFeeNbr;
            protected  int beginXl1FeeAmtDb;
            protected  int beginXl1FeeAmtCr;
            protected  int beginXl1BinId;
            protected  int beginXl1GcmsSamAchInd;
	
	/**
	* Constructor for XlPage1LnSerialized
	**/
    public XlPage1LnSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in XlPage1LnSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(XL_PAGE_1_LN_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginXl1ProcId = getStartOffset() + 1;	// set offset for serialization
  
  
             beginXl1InstId = getStartOffset() + 12;	// set offset for serialization
  
  
             beginXl1Currency = getStartOffset() + 23;	// set offset for serialization
  
  
             beginXl1SettIca = getStartOffset() + 27;	// set offset for serialization
  
  
             beginXl1Ssc = getStartOffset() + 34;	// set offset for serialization
  
  
             beginXl1Isis = getStartOffset() + 38;	// set offset for serialization
  
  
             beginXl1ProdDesc = getStartOffset() + 43;	// set offset for serialization
  
  
             beginXl1AcqIss = getStartOffset() + 69;	// set offset for serialization
  
  
             beginXl1Desc = getStartOffset() + 79;	// set offset for serialization
  
  
             beginXl1FinNbr = getStartOffset() + 97;	// set offset for serialization
  
  
             beginXl1FinNbrDen = getStartOffset() + 108;	// set offset for serialization
  
  
             beginXl1FinAmt = getStartOffset() + 118;	// set offset for serialization
  
             beginXl1FinAmtInd = getStartOffset() + 136;	// set offset for serialization
  
  
             beginXl1FinFeeNbr = getStartOffset() + 139;	// set offset for serialization
  
  
             beginXl1PctFeeNbr = getStartOffset() + 149;	// set offset for serialization
  
  
             beginXl1NfinFeeNbr = getStartOffset() + 159;	// set offset for serialization
  
  
             beginXl1NbilFeeNbr = getStartOffset() + 168;	// set offset for serialization
  
  
             beginXl1FeeAmtDb = getStartOffset() + 177;	// set offset for serialization
  
  
             beginXl1FeeAmtCr = getStartOffset() + 194;	// set offset for serialization
  
  
             beginXl1BinId = getStartOffset() + 211;	// set offset for serialization
  
  
             beginXl1GcmsSamAchInd = getStartOffset() + 223;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localXl1ProcIdCounter = -1;
     public boolean isXl1ProcIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXl1ProcIdCounter != sharedCounter;
         localXl1ProcIdCounter = sharedCounter; return hasModified;
     }
	protected static final int XL_1_PROC_ID_LEN = 10;
	/**
	 * 	serialize this Xl1ProcId
	 */
   protected void serializeXl1ProcId(char[] xl1ProcId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xl1ProcId,0,getStringValue(),beginXl1ProcId,XL_1_PROC_ID_LEN);
       localXl1ProcIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXl1ProcIdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshXl1ProcId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXl1ProcId() {	 
   		return (substring(getStringValue(),beginXl1ProcId,beginXl1ProcId + XL_1_PROC_ID_LEN));
   	}
     int localXl1InstIdCounter = -1;
     public boolean isXl1InstIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXl1InstIdCounter != sharedCounter;
         localXl1InstIdCounter = sharedCounter; return hasModified;
     }
	protected static final int XL_1_INST_ID_LEN = 10;
	/**
	 * 	serialize this Xl1InstId
	 */
   protected void serializeXl1InstId(char[] xl1InstId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xl1InstId,0,getStringValue(),beginXl1InstId,XL_1_INST_ID_LEN);
       localXl1InstIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXl1InstIdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshXl1InstId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXl1InstId() {	 
   		return (substring(getStringValue(),beginXl1InstId,beginXl1InstId + XL_1_INST_ID_LEN));
   	}
     int localXl1CurrencyCounter = -1;
     public boolean isXl1CurrencyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXl1CurrencyCounter != sharedCounter;
         localXl1CurrencyCounter = sharedCounter; return hasModified;
     }
	protected static final int XL_1_CURRENCY_LEN = 3;
	/**
	 * 	serialize this Xl1Currency
	 */
   protected void serializeXl1Currency(char[] xl1Currency) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xl1Currency,0,getStringValue(),beginXl1Currency,XL_1_CURRENCY_LEN);
       localXl1CurrencyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXl1CurrencyConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshXl1Currency is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXl1Currency() {	 
   		return (substring(getStringValue(),beginXl1Currency,beginXl1Currency + XL_1_CURRENCY_LEN));
   	}
     int localXl1SettIcaCounter = -1;
     public boolean isXl1SettIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXl1SettIcaCounter != sharedCounter;
         localXl1SettIcaCounter = sharedCounter; return hasModified;
     }
	protected static final int XL_1_SETT_ICA_LEN = 6;
	/**
	 * 	serialize this Xl1SettIca
	 */
   protected void serializeXl1SettIca(char[] xl1SettIca) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xl1SettIca,0,getStringValue(),beginXl1SettIca,XL_1_SETT_ICA_LEN);
       localXl1SettIcaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXl1SettIcaConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshXl1SettIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXl1SettIca() {	 
   		return (substring(getStringValue(),beginXl1SettIca,beginXl1SettIca + XL_1_SETT_ICA_LEN));
   	}
     int localXl1SscCounter = -1;
     public boolean isXl1SscModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXl1SscCounter != sharedCounter;
         localXl1SscCounter = sharedCounter; return hasModified;
     }
	protected static final int XL_1_SSC_LEN = 3;
	/**
	 * 	serialize this Xl1Ssc
	 */
   protected void serializeXl1Ssc(char[] xl1Ssc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xl1Ssc,0,getStringValue(),beginXl1Ssc,XL_1_SSC_LEN);
       localXl1SscCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXl1SscConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshXl1Ssc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXl1Ssc() {	 
   		return (substring(getStringValue(),beginXl1Ssc,beginXl1Ssc + XL_1_SSC_LEN));
   	}
     int localXl1IsisCounter = -1;
     public boolean isXl1IsisModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXl1IsisCounter != sharedCounter;
         localXl1IsisCounter = sharedCounter; return hasModified;
     }
	protected static final int XL_1_ISIS_LEN = 4;
	/**
	 * 	serialize this Xl1Isis
	 */
   protected void serializeXl1Isis(char[] xl1Isis) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xl1Isis,0,getStringValue(),beginXl1Isis,XL_1_ISIS_LEN);
       localXl1IsisCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXl1IsisConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshXl1Isis is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXl1Isis() {	 
   		return (substring(getStringValue(),beginXl1Isis,beginXl1Isis + XL_1_ISIS_LEN));
   	}
     int localXl1ProdDescCounter = -1;
     public boolean isXl1ProdDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXl1ProdDescCounter != sharedCounter;
         localXl1ProdDescCounter = sharedCounter; return hasModified;
     }
	protected static final int XL_1_PROD_DESC_LEN = 25;
	/**
	 * 	serialize this Xl1ProdDesc
	 */
   protected void serializeXl1ProdDesc(char[] xl1ProdDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xl1ProdDesc,0,getStringValue(),beginXl1ProdDesc,XL_1_PROD_DESC_LEN);
       localXl1ProdDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXl1ProdDescConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshXl1ProdDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXl1ProdDesc() {	 
   		return (substring(getStringValue(),beginXl1ProdDesc,beginXl1ProdDesc + XL_1_PROD_DESC_LEN));
   	}
     int localXl1AcqIssCounter = -1;
     public boolean isXl1AcqIssModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXl1AcqIssCounter != sharedCounter;
         localXl1AcqIssCounter = sharedCounter; return hasModified;
     }
	protected static final int XL_1_ACQ_ISS_LEN = 9;
	/**
	 * 	serialize this Xl1AcqIss
	 */
   protected void serializeXl1AcqIss(char[] xl1AcqIss) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xl1AcqIss,0,getStringValue(),beginXl1AcqIss,XL_1_ACQ_ISS_LEN);
       localXl1AcqIssCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXl1AcqIssConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshXl1AcqIss is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXl1AcqIss() {	 
   		return (substring(getStringValue(),beginXl1AcqIss,beginXl1AcqIss + XL_1_ACQ_ISS_LEN));
   	}
     int localXl1DescCounter = -1;
     public boolean isXl1DescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXl1DescCounter != sharedCounter;
         localXl1DescCounter = sharedCounter; return hasModified;
     }
	protected static final int XL_1_DESC_LEN = 17;
	/**
	 * 	serialize this Xl1Desc
	 */
   protected void serializeXl1Desc(char[] xl1Desc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xl1Desc,0,getStringValue(),beginXl1Desc,XL_1_DESC_LEN);
       localXl1DescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXl1DescConstraints(char[] value) {
   			return super.checkConstraints(value , 17 ,false, false);
   }
    /**
	 *	refreshXl1Desc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXl1Desc() {	 
   		return (substring(getStringValue(),beginXl1Desc,beginXl1Desc + XL_1_DESC_LEN));
   	}
     int localXl1FinNbrCounter = -1;
     public boolean isXl1FinNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXl1FinNbrCounter != sharedCounter;
         localXl1FinNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int XL_1_FIN_NBR_LEN = 10;
	/**
	 * 	serialize this Xl1FinNbr
	 */
   protected void serializeXl1FinNbr(char[] xl1FinNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xl1FinNbr,0,getStringValue(),beginXl1FinNbr,XL_1_FIN_NBR_LEN);
       localXl1FinNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXl1FinNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshXl1FinNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXl1FinNbr() {	 
   		return (substring(getStringValue(),beginXl1FinNbr,beginXl1FinNbr + XL_1_FIN_NBR_LEN));
   	}
     int localXl1FinNbrDenCounter = -1;
     public boolean isXl1FinNbrDenModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXl1FinNbrDenCounter != sharedCounter;
         localXl1FinNbrDenCounter = sharedCounter; return hasModified;
     }
	protected static final int XL_1_FIN_NBR_DEN_LEN = 9;
	/**
	 * 	serialize this Xl1FinNbrDen
	 */
   protected void serializeXl1FinNbrDen(char[] xl1FinNbrDen) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xl1FinNbrDen,0,getStringValue(),beginXl1FinNbrDen,XL_1_FIN_NBR_DEN_LEN);
       localXl1FinNbrDenCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXl1FinNbrDenConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshXl1FinNbrDen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXl1FinNbrDen() {	 
   		return (substring(getStringValue(),beginXl1FinNbrDen,beginXl1FinNbrDen + XL_1_FIN_NBR_DEN_LEN));
   	}
     int localXl1FinAmtCounter = -1;
     public boolean isXl1FinAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXl1FinAmtCounter != sharedCounter;
         localXl1FinAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int XL_1_FIN_AMT_LEN = 18;
	/**
	 * 	serialize this Xl1FinAmt
	 */
   protected void serializeXl1FinAmt(char[] xl1FinAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xl1FinAmt,0,getStringValue(),beginXl1FinAmt,XL_1_FIN_AMT_LEN);
       localXl1FinAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXl1FinAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshXl1FinAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXl1FinAmt() {	 
   		return (substring(getStringValue(),beginXl1FinAmt,beginXl1FinAmt + XL_1_FIN_AMT_LEN));
   	}
     int localXl1FinAmtIndCounter = -1;
     public boolean isXl1FinAmtIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXl1FinAmtIndCounter != sharedCounter;
         localXl1FinAmtIndCounter = sharedCounter; return hasModified;
     }
	protected static final int XL_1_FIN_AMT_IND_LEN = 2;
	/**
	 * 	serialize this Xl1FinAmtInd
	 */
   protected void serializeXl1FinAmtInd(char[] xl1FinAmtInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xl1FinAmtInd,0,getStringValue(),beginXl1FinAmtInd,XL_1_FIN_AMT_IND_LEN);
       localXl1FinAmtIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXl1FinAmtIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshXl1FinAmtInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXl1FinAmtInd() {	 
   		return (substring(getStringValue(),beginXl1FinAmtInd,beginXl1FinAmtInd + XL_1_FIN_AMT_IND_LEN));
   	}
     int localXl1FinFeeNbrCounter = -1;
     public boolean isXl1FinFeeNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXl1FinFeeNbrCounter != sharedCounter;
         localXl1FinFeeNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int XL_1_FIN_FEE_NBR_LEN = 9;
	/**
	 * 	serialize this Xl1FinFeeNbr
	 */
   protected void serializeXl1FinFeeNbr(char[] xl1FinFeeNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xl1FinFeeNbr,0,getStringValue(),beginXl1FinFeeNbr,XL_1_FIN_FEE_NBR_LEN);
       localXl1FinFeeNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXl1FinFeeNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshXl1FinFeeNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXl1FinFeeNbr() {	 
   		return (substring(getStringValue(),beginXl1FinFeeNbr,beginXl1FinFeeNbr + XL_1_FIN_FEE_NBR_LEN));
   	}
     int localXl1PctFeeNbrCounter = -1;
     public boolean isXl1PctFeeNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXl1PctFeeNbrCounter != sharedCounter;
         localXl1PctFeeNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int XL_1_PCT_FEE_NBR_LEN = 9;
	/**
	 * 	serialize this Xl1PctFeeNbr
	 */
   protected void serializeXl1PctFeeNbr(char[] xl1PctFeeNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xl1PctFeeNbr,0,getStringValue(),beginXl1PctFeeNbr,XL_1_PCT_FEE_NBR_LEN);
       localXl1PctFeeNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXl1PctFeeNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshXl1PctFeeNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXl1PctFeeNbr() {	 
   		return (substring(getStringValue(),beginXl1PctFeeNbr,beginXl1PctFeeNbr + XL_1_PCT_FEE_NBR_LEN));
   	}
     int localXl1NfinFeeNbrCounter = -1;
     public boolean isXl1NfinFeeNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXl1NfinFeeNbrCounter != sharedCounter;
         localXl1NfinFeeNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int XL_1_NFIN_FEE_NBR_LEN = 8;
	/**
	 * 	serialize this Xl1NfinFeeNbr
	 */
   protected void serializeXl1NfinFeeNbr(char[] xl1NfinFeeNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xl1NfinFeeNbr,0,getStringValue(),beginXl1NfinFeeNbr,XL_1_NFIN_FEE_NBR_LEN);
       localXl1NfinFeeNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXl1NfinFeeNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshXl1NfinFeeNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXl1NfinFeeNbr() {	 
   		return (substring(getStringValue(),beginXl1NfinFeeNbr,beginXl1NfinFeeNbr + XL_1_NFIN_FEE_NBR_LEN));
   	}
     int localXl1NbilFeeNbrCounter = -1;
     public boolean isXl1NbilFeeNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXl1NbilFeeNbrCounter != sharedCounter;
         localXl1NbilFeeNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int XL_1_NBIL_FEE_NBR_LEN = 8;
	/**
	 * 	serialize this Xl1NbilFeeNbr
	 */
   protected void serializeXl1NbilFeeNbr(char[] xl1NbilFeeNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xl1NbilFeeNbr,0,getStringValue(),beginXl1NbilFeeNbr,XL_1_NBIL_FEE_NBR_LEN);
       localXl1NbilFeeNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXl1NbilFeeNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshXl1NbilFeeNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXl1NbilFeeNbr() {	 
   		return (substring(getStringValue(),beginXl1NbilFeeNbr,beginXl1NbilFeeNbr + XL_1_NBIL_FEE_NBR_LEN));
   	}
     int localXl1FeeAmtDbCounter = -1;
     public boolean isXl1FeeAmtDbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXl1FeeAmtDbCounter != sharedCounter;
         localXl1FeeAmtDbCounter = sharedCounter; return hasModified;
     }
	protected static final int XL_1_FEE_AMT_DB_LEN = 16;
	/**
	 * 	serialize this Xl1FeeAmtDb
	 */
   protected void serializeXl1FeeAmtDb(char[] xl1FeeAmtDb) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xl1FeeAmtDb,0,getStringValue(),beginXl1FeeAmtDb,XL_1_FEE_AMT_DB_LEN);
       localXl1FeeAmtDbCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXl1FeeAmtDbConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshXl1FeeAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXl1FeeAmtDb() {	 
   		return (substring(getStringValue(),beginXl1FeeAmtDb,beginXl1FeeAmtDb + XL_1_FEE_AMT_DB_LEN));
   	}
     int localXl1FeeAmtCrCounter = -1;
     public boolean isXl1FeeAmtCrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXl1FeeAmtCrCounter != sharedCounter;
         localXl1FeeAmtCrCounter = sharedCounter; return hasModified;
     }
	protected static final int XL_1_FEE_AMT_CR_LEN = 16;
	/**
	 * 	serialize this Xl1FeeAmtCr
	 */
   protected void serializeXl1FeeAmtCr(char[] xl1FeeAmtCr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xl1FeeAmtCr,0,getStringValue(),beginXl1FeeAmtCr,XL_1_FEE_AMT_CR_LEN);
       localXl1FeeAmtCrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXl1FeeAmtCrConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshXl1FeeAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXl1FeeAmtCr() {	 
   		return (substring(getStringValue(),beginXl1FeeAmtCr,beginXl1FeeAmtCr + XL_1_FEE_AMT_CR_LEN));
   	}
     int localXl1BinIdCounter = -1;
     public boolean isXl1BinIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXl1BinIdCounter != sharedCounter;
         localXl1BinIdCounter = sharedCounter; return hasModified;
     }
	protected static final int XL_1_BIN_ID_LEN = 11;
	/**
	 * 	serialize this Xl1BinId
	 */
   protected void serializeXl1BinId(char[] xl1BinId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xl1BinId,0,getStringValue(),beginXl1BinId,XL_1_BIN_ID_LEN);
       localXl1BinIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXl1BinIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshXl1BinId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXl1BinId() {	 
   		return (substring(getStringValue(),beginXl1BinId,beginXl1BinId + XL_1_BIN_ID_LEN));
   	}
     int localXl1GcmsSamAchIndCounter = -1;
     public boolean isXl1GcmsSamAchIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXl1GcmsSamAchIndCounter != sharedCounter;
         localXl1GcmsSamAchIndCounter = sharedCounter; return hasModified;
     }
	protected static final int XL_1_GCMS_SAM_ACH_IND_LEN = 4;
	/**
	 * 	serialize this Xl1GcmsSamAchInd
	 */
   protected void serializeXl1GcmsSamAchInd(char[] xl1GcmsSamAchInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xl1GcmsSamAchInd,0,getStringValue(),beginXl1GcmsSamAchInd,XL_1_GCMS_SAM_ACH_IND_LEN);
       localXl1GcmsSamAchIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXl1GcmsSamAchIndConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshXl1GcmsSamAchInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXl1GcmsSamAchInd() {	 
   		return (substring(getStringValue(),beginXl1GcmsSamAchInd,beginXl1GcmsSamAchInd + XL_1_GCMS_SAM_ACH_IND_LEN));
   	}




}
  

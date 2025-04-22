package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class Bdms01BondBasicExpDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01BondBasicExpDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01BondBasicExpDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_BOND_BASIC_EXP_DATA_LENGTH = 157;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01ScrtyAdpBaseNbr;
            protected  int beginBdms01PuttableInd;
            protected  int beginBdms01AbsInd;
            protected  int beginBdms01TypeAbsCd;
            protected  int beginBdms01CbndPassThruInd;
            protected  int beginBdms01UseOfPrcdCd;
            protected  int beginBdms01OtrEnhcmtCmpyNm;
            protected  int beginBdms01OtrEnhcmtTypeCd;
            protected  int beginBdms01SttlmDt;
            protected  int beginBdms01SttlmInd;
            protected  int beginBdms01OtrTaxExmptCd;
            protected  int beginBdms01RmktTermInd;
            protected  int beginBdms01FrgnSvrgnDbInd;
            protected  int beginBdms01ClMkWhlInd;
            protected  int beginBdms01InsCd;
            protected  int beginBdms01InsFtidCd;
            protected  int beginBdms01RrbInd;
            protected  int beginBdms01IssSttsCd;
            protected  int beginBdms01EomRuleCd;
            protected  int beginBdms01CouponTypeCd;
            protected  int beginBdms01OffrDocDlvryCd;
            protected  int beginBdms01SidMudNbr;
            protected  int beginBdms01MuniSrsDescTxt;
            protected  int beginBdms01SupissTypeCd;
	
	/**
	* Constructor for Bdms01BondBasicExpDataSerialized
	**/
    public Bdms01BondBasicExpDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01BondBasicExpDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01BondBasicExpDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01BondBasicExpDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3873); // serialize this field at offset 3873 by default 
    }
    
	/**
	* sets parent for this Bdms01BondBasicExpDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3873 by default
    }    
	/**
	* initializes the field in Bdms01BondBasicExpDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_BOND_BASIC_EXP_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01ScrtyAdpBaseNbr = getStartOffset() + 0;	// set offset for serialization
  
             beginBdms01PuttableInd = getStartOffset() + 7;	// set offset for serialization
  
             beginBdms01AbsInd = getStartOffset() + 8;	// set offset for serialization
  
             beginBdms01TypeAbsCd = getStartOffset() + 9;	// set offset for serialization
  
             beginBdms01CbndPassThruInd = getStartOffset() + 11;	// set offset for serialization
  
             beginBdms01UseOfPrcdCd = getStartOffset() + 12;	// set offset for serialization
  
             beginBdms01OtrEnhcmtCmpyNm = getStartOffset() + 14;	// set offset for serialization
  
             beginBdms01OtrEnhcmtTypeCd = getStartOffset() + 64;	// set offset for serialization
  
             beginBdms01SttlmDt = getStartOffset() + 66;	// set offset for serialization
  
             beginBdms01SttlmInd = getStartOffset() + 76;	// set offset for serialization
  
             beginBdms01OtrTaxExmptCd = getStartOffset() + 77;	// set offset for serialization
  
             beginBdms01RmktTermInd = getStartOffset() + 78;	// set offset for serialization
  
             beginBdms01FrgnSvrgnDbInd = getStartOffset() + 79;	// set offset for serialization
  
             beginBdms01ClMkWhlInd = getStartOffset() + 80;	// set offset for serialization
  
             beginBdms01InsCd = getStartOffset() + 81;	// set offset for serialization
  
             beginBdms01InsFtidCd = getStartOffset() + 86;	// set offset for serialization
  
             beginBdms01RrbInd = getStartOffset() + 88;	// set offset for serialization
  
             beginBdms01IssSttsCd = getStartOffset() + 89;	// set offset for serialization
  
             beginBdms01EomRuleCd = getStartOffset() + 90;	// set offset for serialization
  
             beginBdms01CouponTypeCd = getStartOffset() + 91;	// set offset for serialization
  
             beginBdms01OffrDocDlvryCd = getStartOffset() + 92;	// set offset for serialization
  
             beginBdms01SidMudNbr = getStartOffset() + 93;	// set offset for serialization
  
             beginBdms01MuniSrsDescTxt = getStartOffset() + 100;	// set offset for serialization
  
             beginBdms01SupissTypeCd = getStartOffset() + 120;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBdms01ScrtyAdpBaseNbrCounter = -1;
     public boolean isBdms01ScrtyAdpBaseNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ScrtyAdpBaseNbrCounter != sharedCounter;
         localBdms01ScrtyAdpBaseNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SCRTY_ADP_BASE_NBR_LEN = 7;
	/**
	 * 	serialize this Bdms01ScrtyAdpBaseNbr
	 */
   protected void serializeBdms01ScrtyAdpBaseNbr(char[] bdms01ScrtyAdpBaseNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01ScrtyAdpBaseNbr,0,getStringValue(),beginBdms01ScrtyAdpBaseNbr,BDMS_01_SCRTY_ADP_BASE_NBR_LEN);
       localBdms01ScrtyAdpBaseNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01ScrtyAdpBaseNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshBdms01ScrtyAdpBaseNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01ScrtyAdpBaseNbr() {	 
   		return (substring(getStringValue(),beginBdms01ScrtyAdpBaseNbr,beginBdms01ScrtyAdpBaseNbr + BDMS_01_SCRTY_ADP_BASE_NBR_LEN));
   	}
     int localBdms01PuttableIndCounter = -1;
     public boolean isBdms01PuttableIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PuttableIndCounter != sharedCounter;
         localBdms01PuttableIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PUTTABLE_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01PuttableInd
	 */
   protected void serializeBdms01PuttableInd(char[] bdms01PuttableInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PuttableInd,0,getStringValue(),beginBdms01PuttableInd,BDMS_01_PUTTABLE_IND_LEN);
       localBdms01PuttableIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PuttableIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01PuttableInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PuttableInd() {	 
   		return (substring(getStringValue(),beginBdms01PuttableInd,beginBdms01PuttableInd + BDMS_01_PUTTABLE_IND_LEN));
   	}
     int localBdms01AbsIndCounter = -1;
     public boolean isBdms01AbsIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01AbsIndCounter != sharedCounter;
         localBdms01AbsIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_ABS_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01AbsInd
	 */
   protected void serializeBdms01AbsInd(char[] bdms01AbsInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01AbsInd,0,getStringValue(),beginBdms01AbsInd,BDMS_01_ABS_IND_LEN);
       localBdms01AbsIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01AbsIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01AbsInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01AbsInd() {	 
   		return (substring(getStringValue(),beginBdms01AbsInd,beginBdms01AbsInd + BDMS_01_ABS_IND_LEN));
   	}
     int localBdms01TypeAbsCdCounter = -1;
     public boolean isBdms01TypeAbsCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TypeAbsCdCounter != sharedCounter;
         localBdms01TypeAbsCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_TYPE_ABS_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01TypeAbsCd
	 */
   protected void serializeBdms01TypeAbsCd(char[] bdms01TypeAbsCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01TypeAbsCd,0,getStringValue(),beginBdms01TypeAbsCd,BDMS_01_TYPE_ABS_CD_LEN);
       localBdms01TypeAbsCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01TypeAbsCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01TypeAbsCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01TypeAbsCd() {	 
   		return (substring(getStringValue(),beginBdms01TypeAbsCd,beginBdms01TypeAbsCd + BDMS_01_TYPE_ABS_CD_LEN));
   	}
     int localBdms01CbndPassThruIndCounter = -1;
     public boolean isBdms01CbndPassThruIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CbndPassThruIndCounter != sharedCounter;
         localBdms01CbndPassThruIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CBND_PASS_THRU_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01CbndPassThruInd
	 */
   protected void serializeBdms01CbndPassThruInd(char[] bdms01CbndPassThruInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CbndPassThruInd,0,getStringValue(),beginBdms01CbndPassThruInd,BDMS_01_CBND_PASS_THRU_IND_LEN);
       localBdms01CbndPassThruIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CbndPassThruIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01CbndPassThruInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CbndPassThruInd() {	 
   		return (substring(getStringValue(),beginBdms01CbndPassThruInd,beginBdms01CbndPassThruInd + BDMS_01_CBND_PASS_THRU_IND_LEN));
   	}
     int localBdms01UseOfPrcdCdCounter = -1;
     public boolean isBdms01UseOfPrcdCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01UseOfPrcdCdCounter != sharedCounter;
         localBdms01UseOfPrcdCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_USE_OF_PRCD_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01UseOfPrcdCd
	 */
   protected void serializeBdms01UseOfPrcdCd(char[] bdms01UseOfPrcdCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01UseOfPrcdCd,0,getStringValue(),beginBdms01UseOfPrcdCd,BDMS_01_USE_OF_PRCD_CD_LEN);
       localBdms01UseOfPrcdCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01UseOfPrcdCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01UseOfPrcdCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01UseOfPrcdCd() {	 
   		return (substring(getStringValue(),beginBdms01UseOfPrcdCd,beginBdms01UseOfPrcdCd + BDMS_01_USE_OF_PRCD_CD_LEN));
   	}
     int localBdms01OtrEnhcmtCmpyNmCounter = -1;
     public boolean isBdms01OtrEnhcmtCmpyNmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OtrEnhcmtCmpyNmCounter != sharedCounter;
         localBdms01OtrEnhcmtCmpyNmCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_OTR_ENHCMT_CMPY_NM_LEN = 50;
	/**
	 * 	serialize this Bdms01OtrEnhcmtCmpyNm
	 */
   protected void serializeBdms01OtrEnhcmtCmpyNm(char[] bdms01OtrEnhcmtCmpyNm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01OtrEnhcmtCmpyNm,0,getStringValue(),beginBdms01OtrEnhcmtCmpyNm,BDMS_01_OTR_ENHCMT_CMPY_NM_LEN);
       localBdms01OtrEnhcmtCmpyNmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01OtrEnhcmtCmpyNmConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
    /**
	 *	refreshBdms01OtrEnhcmtCmpyNm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01OtrEnhcmtCmpyNm() {	 
   		return (substring(getStringValue(),beginBdms01OtrEnhcmtCmpyNm,beginBdms01OtrEnhcmtCmpyNm + BDMS_01_OTR_ENHCMT_CMPY_NM_LEN));
   	}
     int localBdms01OtrEnhcmtTypeCdCounter = -1;
     public boolean isBdms01OtrEnhcmtTypeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OtrEnhcmtTypeCdCounter != sharedCounter;
         localBdms01OtrEnhcmtTypeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_OTR_ENHCMT_TYPE_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01OtrEnhcmtTypeCd
	 */
   protected void serializeBdms01OtrEnhcmtTypeCd(char[] bdms01OtrEnhcmtTypeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01OtrEnhcmtTypeCd,0,getStringValue(),beginBdms01OtrEnhcmtTypeCd,BDMS_01_OTR_ENHCMT_TYPE_CD_LEN);
       localBdms01OtrEnhcmtTypeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01OtrEnhcmtTypeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01OtrEnhcmtTypeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01OtrEnhcmtTypeCd() {	 
   		return (substring(getStringValue(),beginBdms01OtrEnhcmtTypeCd,beginBdms01OtrEnhcmtTypeCd + BDMS_01_OTR_ENHCMT_TYPE_CD_LEN));
   	}
     int localBdms01SttlmDtCounter = -1;
     public boolean isBdms01SttlmDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SttlmDtCounter != sharedCounter;
         localBdms01SttlmDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_STTLM_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01SttlmDt
	 */
   protected void serializeBdms01SttlmDt(char[] bdms01SttlmDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SttlmDt,0,getStringValue(),beginBdms01SttlmDt,BDMS_01_STTLM_DT_LEN);
       localBdms01SttlmDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SttlmDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01SttlmDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SttlmDt() {	 
   		return (substring(getStringValue(),beginBdms01SttlmDt,beginBdms01SttlmDt + BDMS_01_STTLM_DT_LEN));
   	}
     int localBdms01SttlmIndCounter = -1;
     public boolean isBdms01SttlmIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SttlmIndCounter != sharedCounter;
         localBdms01SttlmIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_STTLM_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01SttlmInd
	 */
   protected void serializeBdms01SttlmInd(char[] bdms01SttlmInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SttlmInd,0,getStringValue(),beginBdms01SttlmInd,BDMS_01_STTLM_IND_LEN);
       localBdms01SttlmIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SttlmIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01SttlmInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SttlmInd() {	 
   		return (substring(getStringValue(),beginBdms01SttlmInd,beginBdms01SttlmInd + BDMS_01_STTLM_IND_LEN));
   	}
     int localBdms01OtrTaxExmptCdCounter = -1;
     public boolean isBdms01OtrTaxExmptCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OtrTaxExmptCdCounter != sharedCounter;
         localBdms01OtrTaxExmptCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_OTR_TAX_EXMPT_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01OtrTaxExmptCd
	 */
   protected void serializeBdms01OtrTaxExmptCd(char[] bdms01OtrTaxExmptCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01OtrTaxExmptCd,0,getStringValue(),beginBdms01OtrTaxExmptCd,BDMS_01_OTR_TAX_EXMPT_CD_LEN);
       localBdms01OtrTaxExmptCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01OtrTaxExmptCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01OtrTaxExmptCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01OtrTaxExmptCd() {	 
   		return (substring(getStringValue(),beginBdms01OtrTaxExmptCd,beginBdms01OtrTaxExmptCd + BDMS_01_OTR_TAX_EXMPT_CD_LEN));
   	}
     int localBdms01RmktTermIndCounter = -1;
     public boolean isBdms01RmktTermIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01RmktTermIndCounter != sharedCounter;
         localBdms01RmktTermIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_RMKT_TERM_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01RmktTermInd
	 */
   protected void serializeBdms01RmktTermInd(char[] bdms01RmktTermInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01RmktTermInd,0,getStringValue(),beginBdms01RmktTermInd,BDMS_01_RMKT_TERM_IND_LEN);
       localBdms01RmktTermIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01RmktTermIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01RmktTermInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01RmktTermInd() {	 
   		return (substring(getStringValue(),beginBdms01RmktTermInd,beginBdms01RmktTermInd + BDMS_01_RMKT_TERM_IND_LEN));
   	}
     int localBdms01FrgnSvrgnDbIndCounter = -1;
     public boolean isBdms01FrgnSvrgnDbIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01FrgnSvrgnDbIndCounter != sharedCounter;
         localBdms01FrgnSvrgnDbIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FRGN_SVRGN_DB_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01FrgnSvrgnDbInd
	 */
   protected void serializeBdms01FrgnSvrgnDbInd(char[] bdms01FrgnSvrgnDbInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01FrgnSvrgnDbInd,0,getStringValue(),beginBdms01FrgnSvrgnDbInd,BDMS_01_FRGN_SVRGN_DB_IND_LEN);
       localBdms01FrgnSvrgnDbIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01FrgnSvrgnDbIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01FrgnSvrgnDbInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01FrgnSvrgnDbInd() {	 
   		return (substring(getStringValue(),beginBdms01FrgnSvrgnDbInd,beginBdms01FrgnSvrgnDbInd + BDMS_01_FRGN_SVRGN_DB_IND_LEN));
   	}
     int localBdms01ClMkWhlIndCounter = -1;
     public boolean isBdms01ClMkWhlIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ClMkWhlIndCounter != sharedCounter;
         localBdms01ClMkWhlIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CL_MK_WHL_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01ClMkWhlInd
	 */
   protected void serializeBdms01ClMkWhlInd(char[] bdms01ClMkWhlInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01ClMkWhlInd,0,getStringValue(),beginBdms01ClMkWhlInd,BDMS_01_CL_MK_WHL_IND_LEN);
       localBdms01ClMkWhlIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01ClMkWhlIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01ClMkWhlInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01ClMkWhlInd() {	 
   		return (substring(getStringValue(),beginBdms01ClMkWhlInd,beginBdms01ClMkWhlInd + BDMS_01_CL_MK_WHL_IND_LEN));
   	}
     int localBdms01InsCdCounter = -1;
     public boolean isBdms01InsCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01InsCdCounter != sharedCounter;
         localBdms01InsCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_INS_CD_LEN = 5;
	/**
	 * 	serialize this Bdms01InsCd
	 */
   protected void serializeBdms01InsCd(char[] bdms01InsCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01InsCd,0,getStringValue(),beginBdms01InsCd,BDMS_01_INS_CD_LEN);
       localBdms01InsCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01InsCdConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshBdms01InsCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01InsCd() {	 
   		return (substring(getStringValue(),beginBdms01InsCd,beginBdms01InsCd + BDMS_01_INS_CD_LEN));
   	}
     int localBdms01InsFtidCdCounter = -1;
     public boolean isBdms01InsFtidCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01InsFtidCdCounter != sharedCounter;
         localBdms01InsFtidCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_INS_FTID_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01InsFtidCd
	 */
   protected void serializeBdms01InsFtidCd(char[] bdms01InsFtidCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01InsFtidCd,0,getStringValue(),beginBdms01InsFtidCd,BDMS_01_INS_FTID_CD_LEN);
       localBdms01InsFtidCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01InsFtidCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01InsFtidCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01InsFtidCd() {	 
   		return (substring(getStringValue(),beginBdms01InsFtidCd,beginBdms01InsFtidCd + BDMS_01_INS_FTID_CD_LEN));
   	}
     int localBdms01RrbIndCounter = -1;
     public boolean isBdms01RrbIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01RrbIndCounter != sharedCounter;
         localBdms01RrbIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_RRB_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01RrbInd
	 */
   protected void serializeBdms01RrbInd(char[] bdms01RrbInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01RrbInd,0,getStringValue(),beginBdms01RrbInd,BDMS_01_RRB_IND_LEN);
       localBdms01RrbIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01RrbIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01RrbInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01RrbInd() {	 
   		return (substring(getStringValue(),beginBdms01RrbInd,beginBdms01RrbInd + BDMS_01_RRB_IND_LEN));
   	}
     int localBdms01IssSttsCdCounter = -1;
     public boolean isBdms01IssSttsCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01IssSttsCdCounter != sharedCounter;
         localBdms01IssSttsCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_ISS_STTS_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01IssSttsCd
	 */
   protected void serializeBdms01IssSttsCd(char[] bdms01IssSttsCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01IssSttsCd,0,getStringValue(),beginBdms01IssSttsCd,BDMS_01_ISS_STTS_CD_LEN);
       localBdms01IssSttsCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01IssSttsCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01IssSttsCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01IssSttsCd() {	 
   		return (substring(getStringValue(),beginBdms01IssSttsCd,beginBdms01IssSttsCd + BDMS_01_ISS_STTS_CD_LEN));
   	}
     int localBdms01EomRuleCdCounter = -1;
     public boolean isBdms01EomRuleCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01EomRuleCdCounter != sharedCounter;
         localBdms01EomRuleCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_EOM_RULE_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01EomRuleCd
	 */
   protected void serializeBdms01EomRuleCd(char[] bdms01EomRuleCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01EomRuleCd,0,getStringValue(),beginBdms01EomRuleCd,BDMS_01_EOM_RULE_CD_LEN);
       localBdms01EomRuleCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01EomRuleCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01EomRuleCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01EomRuleCd() {	 
   		return (substring(getStringValue(),beginBdms01EomRuleCd,beginBdms01EomRuleCd + BDMS_01_EOM_RULE_CD_LEN));
   	}
     int localBdms01CouponTypeCdCounter = -1;
     public boolean isBdms01CouponTypeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CouponTypeCdCounter != sharedCounter;
         localBdms01CouponTypeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_COUPON_TYPE_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01CouponTypeCd
	 */
   protected void serializeBdms01CouponTypeCd(char[] bdms01CouponTypeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CouponTypeCd,0,getStringValue(),beginBdms01CouponTypeCd,BDMS_01_COUPON_TYPE_CD_LEN);
       localBdms01CouponTypeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CouponTypeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01CouponTypeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CouponTypeCd() {	 
   		return (substring(getStringValue(),beginBdms01CouponTypeCd,beginBdms01CouponTypeCd + BDMS_01_COUPON_TYPE_CD_LEN));
   	}
     int localBdms01OffrDocDlvryCdCounter = -1;
     public boolean isBdms01OffrDocDlvryCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OffrDocDlvryCdCounter != sharedCounter;
         localBdms01OffrDocDlvryCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_OFFR_DOC_DLVRY_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01OffrDocDlvryCd
	 */
   protected void serializeBdms01OffrDocDlvryCd(char[] bdms01OffrDocDlvryCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01OffrDocDlvryCd,0,getStringValue(),beginBdms01OffrDocDlvryCd,BDMS_01_OFFR_DOC_DLVRY_CD_LEN);
       localBdms01OffrDocDlvryCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01OffrDocDlvryCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01OffrDocDlvryCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01OffrDocDlvryCd() {	 
   		return (substring(getStringValue(),beginBdms01OffrDocDlvryCd,beginBdms01OffrDocDlvryCd + BDMS_01_OFFR_DOC_DLVRY_CD_LEN));
   	}
     int localBdms01SidMudNbrCounter = -1;
     public boolean isBdms01SidMudNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SidMudNbrCounter != sharedCounter;
         localBdms01SidMudNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SID_MUD_NBR_LEN = 7;
	/**
	 * 	serialize this Bdms01SidMudNbr
	 */
   protected void serializeBdms01SidMudNbr(char[] bdms01SidMudNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SidMudNbr,0,getStringValue(),beginBdms01SidMudNbr,BDMS_01_SID_MUD_NBR_LEN);
       localBdms01SidMudNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SidMudNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshBdms01SidMudNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SidMudNbr() {	 
   		return (substring(getStringValue(),beginBdms01SidMudNbr,beginBdms01SidMudNbr + BDMS_01_SID_MUD_NBR_LEN));
   	}
     int localBdms01MuniSrsDescTxtCounter = -1;
     public boolean isBdms01MuniSrsDescTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01MuniSrsDescTxtCounter != sharedCounter;
         localBdms01MuniSrsDescTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_MUNI_SRS_DESC_TXT_LEN = 20;
	/**
	 * 	serialize this Bdms01MuniSrsDescTxt
	 */
   protected void serializeBdms01MuniSrsDescTxt(char[] bdms01MuniSrsDescTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01MuniSrsDescTxt,0,getStringValue(),beginBdms01MuniSrsDescTxt,BDMS_01_MUNI_SRS_DESC_TXT_LEN);
       localBdms01MuniSrsDescTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01MuniSrsDescTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBdms01MuniSrsDescTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01MuniSrsDescTxt() {	 
   		return (substring(getStringValue(),beginBdms01MuniSrsDescTxt,beginBdms01MuniSrsDescTxt + BDMS_01_MUNI_SRS_DESC_TXT_LEN));
   	}
     int localBdms01SupissTypeCdCounter = -1;
     public boolean isBdms01SupissTypeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SupissTypeCdCounter != sharedCounter;
         localBdms01SupissTypeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SUPISS_TYPE_CD_LEN = 5;
	/**
	 * 	serialize this Bdms01SupissTypeCd
	 */
   protected void serializeBdms01SupissTypeCd(char[] bdms01SupissTypeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SupissTypeCd,0,getStringValue(),beginBdms01SupissTypeCd,BDMS_01_SUPISS_TYPE_CD_LEN);
       localBdms01SupissTypeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SupissTypeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshBdms01SupissTypeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SupissTypeCd() {	 
   		return (substring(getStringValue(),beginBdms01SupissTypeCd,beginBdms01SupissTypeCd + BDMS_01_SUPISS_TYPE_CD_LEN));
   	}




}
  

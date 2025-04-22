package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class DclvmstranbSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class DclvmstranbSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DclvmstranbSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLVMSTRANB_LENGTH = 179;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSecurityAdpNbr;
            protected  int beginTrmlCd;
            protected  int beginTranCd;
            protected  int beginAddedTmstp;
            protected  int beginDoNotUseDt;
            protected  int beginSrceSetupSecCd;
            protected  int beginSecurityIdaCd;
            protected  int beginTypeSecurityCd;
            protected  int beginCntryIssueCd;
            protected  int beginCntryOrgnCd;
            protected  int beginClientNbr;
            protected  int beginDescSecTxt;
            protected  int beginMcgillCd;
            protected  int beginCusipCntraNbr;
            protected  int beginClassInd;
            protected  int beginSymblTrdsAsCd;
            protected  int beginSymblTrdsWhiCd;
            protected  int beginSecLckdInd;
	
	/**
	* Constructor for DclvmstranbSerialized
	**/
    public DclvmstranbSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DclvmstranbSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLVMSTRANB_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSecurityAdpNbr = getStartOffset() + 0;	// set offset for serialization
  
             beginTrmlCd = getStartOffset() + 7;	// set offset for serialization
  
             beginTranCd = getStartOffset() + 15;	// set offset for serialization
  
             beginAddedTmstp = getStartOffset() + 23;	// set offset for serialization
  
             beginDoNotUseDt = getStartOffset() + 49;	// set offset for serialization
  
             beginSrceSetupSecCd = getStartOffset() + 59;	// set offset for serialization
  
             beginSecurityIdaCd = getStartOffset() + 61;	// set offset for serialization
  
             beginTypeSecurityCd = getStartOffset() + 65;	// set offset for serialization
  
             beginCntryIssueCd = getStartOffset() + 68;	// set offset for serialization
  
             beginCntryOrgnCd = getStartOffset() + 70;	// set offset for serialization
  
             beginClientNbr = getStartOffset() + 72;	// set offset for serialization
  
             beginDescSecTxt = getStartOffset() + 76;	// set offset for serialization
  
             beginMcgillCd = getStartOffset() + 106;	// set offset for serialization
  
             beginCusipCntraNbr = getStartOffset() + 109;	// set offset for serialization
  
             beginClassInd = getStartOffset() + 117;	// set offset for serialization
  
             beginSymblTrdsAsCd = getStartOffset() + 118;	// set offset for serialization
  
             beginSymblTrdsWhiCd = getStartOffset() + 138;	// set offset for serialization
  
             beginSecLckdInd = getStartOffset() + 158;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSecurityAdpNbrCounter = -1;
     public boolean isSecurityAdpNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSecurityAdpNbrCounter != sharedCounter;
         localSecurityAdpNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int SECURITY_ADP_NBR_LEN = 7;
	/**
	 * 	serialize this SecurityAdpNbr
	 */
   protected void serializeSecurityAdpNbr(char[] securityAdpNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(securityAdpNbr,0,getStringValue(),beginSecurityAdpNbr,SECURITY_ADP_NBR_LEN);
       localSecurityAdpNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSecurityAdpNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshSecurityAdpNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSecurityAdpNbr() {	 
   		return (substring(getStringValue(),beginSecurityAdpNbr,beginSecurityAdpNbr + SECURITY_ADP_NBR_LEN));
   	}
     int localTrmlCdCounter = -1;
     public boolean isTrmlCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTrmlCdCounter != sharedCounter;
         localTrmlCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TRML_CD_LEN = 8;
	/**
	 * 	serialize this TrmlCd
	 */
   protected void serializeTrmlCd(char[] trmlCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(trmlCd,0,getStringValue(),beginTrmlCd,TRML_CD_LEN);
       localTrmlCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTrmlCdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshTrmlCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTrmlCd() {	 
   		return (substring(getStringValue(),beginTrmlCd,beginTrmlCd + TRML_CD_LEN));
   	}
     int localTranCdCounter = -1;
     public boolean isTranCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTranCdCounter != sharedCounter;
         localTranCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TRAN_CD_LEN = 8;
	/**
	 * 	serialize this TranCd
	 */
   protected void serializeTranCd(char[] tranCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tranCd,0,getStringValue(),beginTranCd,TRAN_CD_LEN);
       localTranCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTranCdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshTranCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTranCd() {	 
   		return (substring(getStringValue(),beginTranCd,beginTranCd + TRAN_CD_LEN));
   	}
     int localAddedTmstpCounter = -1;
     public boolean isAddedTmstpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAddedTmstpCounter != sharedCounter;
         localAddedTmstpCounter = sharedCounter; return hasModified;
     }
	protected static final int ADDED_TMSTP_LEN = 26;
	/**
	 * 	serialize this AddedTmstp
	 */
   protected void serializeAddedTmstp(char[] addedTmstp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(addedTmstp,0,getStringValue(),beginAddedTmstp,ADDED_TMSTP_LEN);
       localAddedTmstpCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAddedTmstpConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshAddedTmstp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAddedTmstp() {	 
   		return (substring(getStringValue(),beginAddedTmstp,beginAddedTmstp + ADDED_TMSTP_LEN));
   	}
     int localDoNotUseDtCounter = -1;
     public boolean isDoNotUseDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDoNotUseDtCounter != sharedCounter;
         localDoNotUseDtCounter = sharedCounter; return hasModified;
     }
	protected static final int DO_NOT_USE_DT_LEN = 10;
	/**
	 * 	serialize this DoNotUseDt
	 */
   protected void serializeDoNotUseDt(char[] doNotUseDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(doNotUseDt,0,getStringValue(),beginDoNotUseDt,DO_NOT_USE_DT_LEN);
       localDoNotUseDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDoNotUseDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDoNotUseDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDoNotUseDt() {	 
   		return (substring(getStringValue(),beginDoNotUseDt,beginDoNotUseDt + DO_NOT_USE_DT_LEN));
   	}
     int localSrceSetupSecCdCounter = -1;
     public boolean isSrceSetupSecCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrceSetupSecCdCounter != sharedCounter;
         localSrceSetupSecCdCounter = sharedCounter; return hasModified;
     }
	protected static final int SRCE_SETUP_SEC_CD_LEN = 2;
	/**
	 * 	serialize this SrceSetupSecCd
	 */
   protected void serializeSrceSetupSecCd(char[] srceSetupSecCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(srceSetupSecCd,0,getStringValue(),beginSrceSetupSecCd,SRCE_SETUP_SEC_CD_LEN);
       localSrceSetupSecCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSrceSetupSecCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSrceSetupSecCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSrceSetupSecCd() {	 
   		return (substring(getStringValue(),beginSrceSetupSecCd,beginSrceSetupSecCd + SRCE_SETUP_SEC_CD_LEN));
   	}
     int localSecurityIdaCdCounter = -1;
     public boolean isSecurityIdaCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSecurityIdaCdCounter != sharedCounter;
         localSecurityIdaCdCounter = sharedCounter; return hasModified;
     }
	protected static final int SECURITY_IDA_CD_LEN = 4;
	/**
	 * 	serialize this SecurityIdaCd
	 */
   protected void serializeSecurityIdaCd(char[] securityIdaCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(securityIdaCd,0,getStringValue(),beginSecurityIdaCd,SECURITY_IDA_CD_LEN);
       localSecurityIdaCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSecurityIdaCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSecurityIdaCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSecurityIdaCd() {	 
   		return (substring(getStringValue(),beginSecurityIdaCd,beginSecurityIdaCd + SECURITY_IDA_CD_LEN));
   	}
     int localTypeSecurityCdCounter = -1;
     public boolean isTypeSecurityCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTypeSecurityCdCounter != sharedCounter;
         localTypeSecurityCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TYPE_SECURITY_CD_LEN = 3;
	/**
	 * 	serialize this TypeSecurityCd
	 */
   protected void serializeTypeSecurityCd(char[] typeSecurityCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(typeSecurityCd,0,getStringValue(),beginTypeSecurityCd,TYPE_SECURITY_CD_LEN);
       localTypeSecurityCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTypeSecurityCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshTypeSecurityCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTypeSecurityCd() {	 
   		return (substring(getStringValue(),beginTypeSecurityCd,beginTypeSecurityCd + TYPE_SECURITY_CD_LEN));
   	}
     int localCntryIssueCdCounter = -1;
     public boolean isCntryIssueCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCntryIssueCdCounter != sharedCounter;
         localCntryIssueCdCounter = sharedCounter; return hasModified;
     }
	protected static final int CNTRY_ISSUE_CD_LEN = 2;
	/**
	 * 	serialize this CntryIssueCd
	 */
   protected void serializeCntryIssueCd(char[] cntryIssueCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cntryIssueCd,0,getStringValue(),beginCntryIssueCd,CNTRY_ISSUE_CD_LEN);
       localCntryIssueCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCntryIssueCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCntryIssueCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCntryIssueCd() {	 
   		return (substring(getStringValue(),beginCntryIssueCd,beginCntryIssueCd + CNTRY_ISSUE_CD_LEN));
   	}
     int localCntryOrgnCdCounter = -1;
     public boolean isCntryOrgnCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCntryOrgnCdCounter != sharedCounter;
         localCntryOrgnCdCounter = sharedCounter; return hasModified;
     }
	protected static final int CNTRY_ORGN_CD_LEN = 2;
	/**
	 * 	serialize this CntryOrgnCd
	 */
   protected void serializeCntryOrgnCd(char[] cntryOrgnCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cntryOrgnCd,0,getStringValue(),beginCntryOrgnCd,CNTRY_ORGN_CD_LEN);
       localCntryOrgnCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCntryOrgnCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCntryOrgnCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCntryOrgnCd() {	 
   		return (substring(getStringValue(),beginCntryOrgnCd,beginCntryOrgnCd + CNTRY_ORGN_CD_LEN));
   	}
     int localClientNbrCounter = -1;
     public boolean isClientNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClientNbrCounter != sharedCounter;
         localClientNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int CLIENT_NBR_LEN = 4;
	/**
	 * 	serialize this ClientNbr
	 */
   protected void serializeClientNbr(char[] clientNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(clientNbr,0,getStringValue(),beginClientNbr,CLIENT_NBR_LEN);
       localClientNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkClientNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshClientNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshClientNbr() {	 
   		return (substring(getStringValue(),beginClientNbr,beginClientNbr + CLIENT_NBR_LEN));
   	}
     int localDescSecTxtCounter = -1;
     public boolean isDescSecTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDescSecTxtCounter != sharedCounter;
         localDescSecTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int DESC_SEC_TXT_LEN = 30;
	/**
	 * 	serialize this DescSecTxt
	 */
   protected void serializeDescSecTxt(char[] descSecTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(descSecTxt,0,getStringValue(),beginDescSecTxt,DESC_SEC_TXT_LEN);
       localDescSecTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDescSecTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshDescSecTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDescSecTxt() {	 
   		return (substring(getStringValue(),beginDescSecTxt,beginDescSecTxt + DESC_SEC_TXT_LEN));
   	}
        int localMcgillCdCounter = -1;
        public boolean isMcgillCdModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localMcgillCdCounter != sharedCounter;
           localMcgillCdCounter = sharedCounter; return hasModified; 
        }
	    public boolean mcgillCdIsNumeric() {
	      return decimalIsNumeric(beginMcgillCd,MCGILL_CD_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int MCGILL_CD_LEN = 3;
  	/**
	 * 	serializeMcgillCd
	 */
	protected void serializeMcgillCd(int mcgillCd) {
		   putDecimal(beginMcgillCd,mcgillCd,MCGILL_CD_LEN,true);
   }
   

   protected int checkMcgillCdMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100K /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshMcgillCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMcgillCd() throws CFException {	
   	try { 
		 return (getIntDecimal(beginMcgillCd,MCGILL_CD_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("mcgillCd", beginMcgillCd,MCGILL_CD_LEN);
     }
   	}
     int localCusipCntraNbrCounter = -1;
     public boolean isCusipCntraNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCusipCntraNbrCounter != sharedCounter;
         localCusipCntraNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int CUSIP_CNTRA_NBR_LEN = 8;
	/**
	 * 	serialize this CusipCntraNbr
	 */
   protected void serializeCusipCntraNbr(char[] cusipCntraNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cusipCntraNbr,0,getStringValue(),beginCusipCntraNbr,CUSIP_CNTRA_NBR_LEN);
       localCusipCntraNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCusipCntraNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshCusipCntraNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCusipCntraNbr() {	 
   		return (substring(getStringValue(),beginCusipCntraNbr,beginCusipCntraNbr + CUSIP_CNTRA_NBR_LEN));
   	}
     int localClassIndCounter = -1;
     public boolean isClassIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClassIndCounter != sharedCounter;
         localClassIndCounter = sharedCounter; return hasModified;
     }
	protected static final int CLASS_IND_LEN = 1;
	/**
	 * 	serialize this ClassInd
	 */
   protected void serializeClassInd(char[] classInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(classInd,0,getStringValue(),beginClassInd,CLASS_IND_LEN);
       localClassIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkClassIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshClassInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshClassInd() {	 
   		return (substring(getStringValue(),beginClassInd,beginClassInd + CLASS_IND_LEN));
   	}
     int localSymblTrdsAsCdCounter = -1;
     public boolean isSymblTrdsAsCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSymblTrdsAsCdCounter != sharedCounter;
         localSymblTrdsAsCdCounter = sharedCounter; return hasModified;
     }
	protected static final int SYMBL_TRDS_AS_CD_LEN = 20;
	/**
	 * 	serialize this SymblTrdsAsCd
	 */
   protected void serializeSymblTrdsAsCd(char[] symblTrdsAsCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(symblTrdsAsCd,0,getStringValue(),beginSymblTrdsAsCd,SYMBL_TRDS_AS_CD_LEN);
       localSymblTrdsAsCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSymblTrdsAsCdConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshSymblTrdsAsCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSymblTrdsAsCd() {	 
   		return (substring(getStringValue(),beginSymblTrdsAsCd,beginSymblTrdsAsCd + SYMBL_TRDS_AS_CD_LEN));
   	}
     int localSymblTrdsWhiCdCounter = -1;
     public boolean isSymblTrdsWhiCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSymblTrdsWhiCdCounter != sharedCounter;
         localSymblTrdsWhiCdCounter = sharedCounter; return hasModified;
     }
	protected static final int SYMBL_TRDS_WHI_CD_LEN = 20;
	/**
	 * 	serialize this SymblTrdsWhiCd
	 */
   protected void serializeSymblTrdsWhiCd(char[] symblTrdsWhiCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(symblTrdsWhiCd,0,getStringValue(),beginSymblTrdsWhiCd,SYMBL_TRDS_WHI_CD_LEN);
       localSymblTrdsWhiCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSymblTrdsWhiCdConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshSymblTrdsWhiCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSymblTrdsWhiCd() {	 
   		return (substring(getStringValue(),beginSymblTrdsWhiCd,beginSymblTrdsWhiCd + SYMBL_TRDS_WHI_CD_LEN));
   	}
     int localSecLckdIndCounter = -1;
     public boolean isSecLckdIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSecLckdIndCounter != sharedCounter;
         localSecLckdIndCounter = sharedCounter; return hasModified;
     }
	protected static final int SEC_LCKD_IND_LEN = 1;
	/**
	 * 	serialize this SecLckdInd
	 */
   protected void serializeSecLckdInd(char[] secLckdInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(secLckdInd,0,getStringValue(),beginSecLckdInd,SEC_LCKD_IND_LEN);
       localSecLckdIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSecLckdIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSecLckdInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSecLckdInd() {	 
   		return (substring(getStringValue(),beginSecLckdInd,beginSecLckdInd + SEC_LCKD_IND_LEN));
   	}




}
  

package com.cloudframe.app.cpsc4.dto.serialize;

/**
*  The class S0v3DtlMdlDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class S0v3DtlMdlDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(S0v3DtlMdlDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int S_0V_3_DTL_MDL_DATA_LENGTH = 167;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAdvsryMdlId;
            protected  int beginMdlTmpltTyCd;
            protected  int beginAcctSvcTyCd;
            protected  int beginAdvsryRsrchTyCd;
            protected  int beginPortObjCd;
            protected  int beginMinInvstAmt;
            protected  int beginBegEffDate;
            protected  int beginClsNewMnyInd;
            protected  int beginRebalAtmptCnt;
            protected  int beginAdvsryMdlNa;
            protected  int beginAdvsrySubAdviseCd;
            protected  int beginTaxSnstvInd;
            protected  int beginMdlSerTyCd;
            protected  int beginAdvsryMdlVerCd;
            protected  int beginAdvsryMdlBnchmkCd;
            protected  int beginMdlThresTyCd;
            protected  int beginEndEffDa;
            protected  int beginAdvsryMdlTyCd;
	
	/**
	* Constructor for S0v3DtlMdlDataSerialized
	**/
    public S0v3DtlMdlDataSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in S0v3DtlMdlDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(S_0V_3_DTL_MDL_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAdvsryMdlId = getStartOffset() + 0;	// set offset for serialization
  
  
             beginMdlTmpltTyCd = getStartOffset() + 7;	// set offset for serialization
  
  
             beginAcctSvcTyCd = getStartOffset() + 11;	// set offset for serialization
  
  
             beginAdvsryRsrchTyCd = getStartOffset() + 14;	// set offset for serialization
  
  
             beginPortObjCd = getStartOffset() + 16;	// set offset for serialization
  
  
             beginMinInvstAmt = getStartOffset() + 19;	// set offset for serialization
  
  
             beginBegEffDate = getStartOffset() + 30;	// set offset for serialization
  
  
             beginClsNewMnyInd = getStartOffset() + 41;	// set offset for serialization
  
  
             beginRebalAtmptCnt = getStartOffset() + 43;	// set offset for serialization
  
  
             beginAdvsryMdlNa = getStartOffset() + 48;	// set offset for serialization
  
  
             beginAdvsrySubAdviseCd = getStartOffset() + 129;	// set offset for serialization
  
  
             beginTaxSnstvInd = getStartOffset() + 131;	// set offset for serialization
  
  
             beginMdlSerTyCd = getStartOffset() + 133;	// set offset for serialization
  
  
             beginAdvsryMdlVerCd = getStartOffset() + 138;	// set offset for serialization
  
  
             beginAdvsryMdlBnchmkCd = getStartOffset() + 144;	// set offset for serialization
  
  
             beginMdlThresTyCd = getStartOffset() + 150;	// set offset for serialization
  
  
             beginEndEffDa = getStartOffset() + 152;	// set offset for serialization
  
  
             beginAdvsryMdlTyCd = getStartOffset() + 163;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localAdvsryMdlIdCounter = -1;
     public boolean isAdvsryMdlIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAdvsryMdlIdCounter != sharedCounter;
         localAdvsryMdlIdCounter = sharedCounter; return hasModified;
     }
	protected static final int ADVSRY_MDL_ID_LEN = 6;
	/**
	 * 	serialize this AdvsryMdlId
	 */
   protected void serializeAdvsryMdlId(char[] advsryMdlId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(advsryMdlId,0,getStringValue(),beginAdvsryMdlId,ADVSRY_MDL_ID_LEN);
       localAdvsryMdlIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAdvsryMdlIdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshAdvsryMdlId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAdvsryMdlId() {	 
   		return (substring(getStringValue(),beginAdvsryMdlId,beginAdvsryMdlId + ADVSRY_MDL_ID_LEN));
   	}
     int localMdlTmpltTyCdCounter = -1;
     public boolean isMdlTmpltTyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMdlTmpltTyCdCounter != sharedCounter;
         localMdlTmpltTyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int MDL_TMPLT_TY_CD_LEN = 3;
	/**
	 * 	serialize this MdlTmpltTyCd
	 */
   protected void serializeMdlTmpltTyCd(char[] mdlTmpltTyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mdlTmpltTyCd,0,getStringValue(),beginMdlTmpltTyCd,MDL_TMPLT_TY_CD_LEN);
       localMdlTmpltTyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMdlTmpltTyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshMdlTmpltTyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMdlTmpltTyCd() {	 
   		return (substring(getStringValue(),beginMdlTmpltTyCd,beginMdlTmpltTyCd + MDL_TMPLT_TY_CD_LEN));
   	}
     int localAcctSvcTyCdCounter = -1;
     public boolean isAcctSvcTyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAcctSvcTyCdCounter != sharedCounter;
         localAcctSvcTyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int ACCT_SVC_TY_CD_LEN = 2;
	/**
	 * 	serialize this AcctSvcTyCd
	 */
   protected void serializeAcctSvcTyCd(char[] acctSvcTyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(acctSvcTyCd,0,getStringValue(),beginAcctSvcTyCd,ACCT_SVC_TY_CD_LEN);
       localAcctSvcTyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAcctSvcTyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshAcctSvcTyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAcctSvcTyCd() {	 
   		return (substring(getStringValue(),beginAcctSvcTyCd,beginAcctSvcTyCd + ACCT_SVC_TY_CD_LEN));
   	}
     int localAdvsryRsrchTyCdCounter = -1;
     public boolean isAdvsryRsrchTyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAdvsryRsrchTyCdCounter != sharedCounter;
         localAdvsryRsrchTyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int ADVSRY_RSRCH_TY_CD_LEN = 1;
	/**
	 * 	serialize this AdvsryRsrchTyCd
	 */
   protected void serializeAdvsryRsrchTyCd(char[] advsryRsrchTyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(advsryRsrchTyCd,0,getStringValue(),beginAdvsryRsrchTyCd,ADVSRY_RSRCH_TY_CD_LEN);
       localAdvsryRsrchTyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAdvsryRsrchTyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshAdvsryRsrchTyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAdvsryRsrchTyCd() {	 
   		return (substring(getStringValue(),beginAdvsryRsrchTyCd,beginAdvsryRsrchTyCd + ADVSRY_RSRCH_TY_CD_LEN));
   	}
     int localPortObjCdCounter = -1;
     public boolean isPortObjCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPortObjCdCounter != sharedCounter;
         localPortObjCdCounter = sharedCounter; return hasModified;
     }
	protected static final int PORT_OBJ_CD_LEN = 2;
	/**
	 * 	serialize this PortObjCd
	 */
   protected void serializePortObjCd(char[] portObjCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(portObjCd,0,getStringValue(),beginPortObjCd,PORT_OBJ_CD_LEN);
       localPortObjCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPortObjCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshPortObjCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPortObjCd() {	 
   		return (substring(getStringValue(),beginPortObjCd,beginPortObjCd + PORT_OBJ_CD_LEN));
   	}
     int localMinInvstAmtCounter = -1;
     public boolean isMinInvstAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMinInvstAmtCounter != sharedCounter;
         localMinInvstAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of minInvstAmt
	 *	@return minInvstAmt
	 */
	public char[]  getMinInvstAmtString() {
	     return getCharArray(beginMinInvstAmt,MIN_INVST_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean minInvstAmtIsNumeric() {
	    return isNumeric(beginMinInvstAmt
	                    ,beginMinInvstAmt + MIN_INVST_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MIN_INVST_AMT_LEN = 10;
  	/**
	 * serializeMinInvstAmt
	 */
	protected void serializeMinInvstAmt(long minInvstAmt) {
		 putNumber(beginMinInvstAmt,minInvstAmt,MIN_INVST_AMT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMinInvstAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMinInvstAmt
	 */
   	protected  long serializeMinInvstAmt(char[] value) {
	    long  minInvstAmt;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    minInvstAmt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginMinInvstAmt
		       ,10
		      );
		 localMinInvstAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  minInvstAmt;
    }

   protected long checkMinInvstAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMinInvstAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMinInvstAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMinInvstAmt
			                 ,MIN_INVST_AMT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("minInvstAmt", beginMinInvstAmt,MIN_INVST_AMT_LEN);
    }
   	}
     int localBegEffDateCounter = -1;
     public boolean isBegEffDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBegEffDateCounter != sharedCounter;
         localBegEffDateCounter = sharedCounter; return hasModified;
     }
	protected static final int BEG_EFF_DATE_LEN = 10;
	/**
	 * 	serialize this BegEffDate
	 */
   protected void serializeBegEffDate(char[] begEffDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(begEffDate,0,getStringValue(),beginBegEffDate,BEG_EFF_DATE_LEN);
       localBegEffDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBegEffDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBegEffDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBegEffDate() {	 
   		return (substring(getStringValue(),beginBegEffDate,beginBegEffDate + BEG_EFF_DATE_LEN));
   	}
     int localClsNewMnyIndCounter = -1;
     public boolean isClsNewMnyIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClsNewMnyIndCounter != sharedCounter;
         localClsNewMnyIndCounter = sharedCounter; return hasModified;
     }
	protected static final int CLS_NEW_MNY_IND_LEN = 1;
	/**
	 * 	serialize this ClsNewMnyInd
	 */
   protected void serializeClsNewMnyInd(char[] clsNewMnyInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(clsNewMnyInd,0,getStringValue(),beginClsNewMnyInd,CLS_NEW_MNY_IND_LEN);
       localClsNewMnyIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkClsNewMnyIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshClsNewMnyInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshClsNewMnyInd() {	 
   		return (substring(getStringValue(),beginClsNewMnyInd,beginClsNewMnyInd + CLS_NEW_MNY_IND_LEN));
   	}
     int localRebalAtmptCntCounter = -1;
     public boolean isRebalAtmptCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRebalAtmptCntCounter != sharedCounter;
         localRebalAtmptCntCounter = sharedCounter; return hasModified;
     }
	protected static final int REBAL_ATMPT_CNT_LEN = 4;
	/**
	 * 	serialize this RebalAtmptCnt
	 */
   protected void serializeRebalAtmptCnt(char[] rebalAtmptCnt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rebalAtmptCnt,0,getStringValue(),beginRebalAtmptCnt,REBAL_ATMPT_CNT_LEN);
       localRebalAtmptCntCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRebalAtmptCntConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRebalAtmptCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRebalAtmptCnt() {	 
   		return (substring(getStringValue(),beginRebalAtmptCnt,beginRebalAtmptCnt + REBAL_ATMPT_CNT_LEN));
   	}
     int localAdvsryMdlNaCounter = -1;
     public boolean isAdvsryMdlNaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAdvsryMdlNaCounter != sharedCounter;
         localAdvsryMdlNaCounter = sharedCounter; return hasModified;
     }
	protected static final int ADVSRY_MDL_NA_LEN = 80;
	/**
	 * 	serialize this AdvsryMdlNa
	 */
   protected void serializeAdvsryMdlNa(char[] advsryMdlNa) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(advsryMdlNa,0,getStringValue(),beginAdvsryMdlNa,ADVSRY_MDL_NA_LEN);
       localAdvsryMdlNaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAdvsryMdlNaConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshAdvsryMdlNa is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAdvsryMdlNa() {	 
   		return (substring(getStringValue(),beginAdvsryMdlNa,beginAdvsryMdlNa + ADVSRY_MDL_NA_LEN));
   	}
     int localAdvsrySubAdviseCdCounter = -1;
     public boolean isAdvsrySubAdviseCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAdvsrySubAdviseCdCounter != sharedCounter;
         localAdvsrySubAdviseCdCounter = sharedCounter; return hasModified;
     }
	protected static final int ADVSRY_SUB_ADVISE_CD_LEN = 1;
	/**
	 * 	serialize this AdvsrySubAdviseCd
	 */
   protected void serializeAdvsrySubAdviseCd(char[] advsrySubAdviseCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(advsrySubAdviseCd,0,getStringValue(),beginAdvsrySubAdviseCd,ADVSRY_SUB_ADVISE_CD_LEN);
       localAdvsrySubAdviseCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAdvsrySubAdviseCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshAdvsrySubAdviseCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAdvsrySubAdviseCd() {	 
   		return (substring(getStringValue(),beginAdvsrySubAdviseCd,beginAdvsrySubAdviseCd + ADVSRY_SUB_ADVISE_CD_LEN));
   	}
     int localTaxSnstvIndCounter = -1;
     public boolean isTaxSnstvIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaxSnstvIndCounter != sharedCounter;
         localTaxSnstvIndCounter = sharedCounter; return hasModified;
     }
	protected static final int TAX_SNSTV_IND_LEN = 1;
	/**
	 * 	serialize this TaxSnstvInd
	 */
   protected void serializeTaxSnstvInd(char[] taxSnstvInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taxSnstvInd,0,getStringValue(),beginTaxSnstvInd,TAX_SNSTV_IND_LEN);
       localTaxSnstvIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaxSnstvIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTaxSnstvInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaxSnstvInd() {	 
   		return (substring(getStringValue(),beginTaxSnstvInd,beginTaxSnstvInd + TAX_SNSTV_IND_LEN));
   	}
     int localMdlSerTyCdCounter = -1;
     public boolean isMdlSerTyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMdlSerTyCdCounter != sharedCounter;
         localMdlSerTyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int MDL_SER_TY_CD_LEN = 4;
	/**
	 * 	serialize this MdlSerTyCd
	 */
   protected void serializeMdlSerTyCd(char[] mdlSerTyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mdlSerTyCd,0,getStringValue(),beginMdlSerTyCd,MDL_SER_TY_CD_LEN);
       localMdlSerTyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMdlSerTyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshMdlSerTyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMdlSerTyCd() {	 
   		return (substring(getStringValue(),beginMdlSerTyCd,beginMdlSerTyCd + MDL_SER_TY_CD_LEN));
   	}
     int localAdvsryMdlVerCdCounter = -1;
     public boolean isAdvsryMdlVerCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAdvsryMdlVerCdCounter != sharedCounter;
         localAdvsryMdlVerCdCounter = sharedCounter; return hasModified;
     }
	protected static final int ADVSRY_MDL_VER_CD_LEN = 5;
	/**
	 * 	serialize this AdvsryMdlVerCd
	 */
   protected void serializeAdvsryMdlVerCd(char[] advsryMdlVerCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(advsryMdlVerCd,0,getStringValue(),beginAdvsryMdlVerCd,ADVSRY_MDL_VER_CD_LEN);
       localAdvsryMdlVerCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAdvsryMdlVerCdConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshAdvsryMdlVerCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAdvsryMdlVerCd() {	 
   		return (substring(getStringValue(),beginAdvsryMdlVerCd,beginAdvsryMdlVerCd + ADVSRY_MDL_VER_CD_LEN));
   	}
     int localAdvsryMdlBnchmkCdCounter = -1;
     public boolean isAdvsryMdlBnchmkCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAdvsryMdlBnchmkCdCounter != sharedCounter;
         localAdvsryMdlBnchmkCdCounter = sharedCounter; return hasModified;
     }
	protected static final int ADVSRY_MDL_BNCHMK_CD_LEN = 5;
	/**
	 * 	serialize this AdvsryMdlBnchmkCd
	 */
   protected void serializeAdvsryMdlBnchmkCd(char[] advsryMdlBnchmkCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(advsryMdlBnchmkCd,0,getStringValue(),beginAdvsryMdlBnchmkCd,ADVSRY_MDL_BNCHMK_CD_LEN);
       localAdvsryMdlBnchmkCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAdvsryMdlBnchmkCdConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshAdvsryMdlBnchmkCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAdvsryMdlBnchmkCd() {	 
   		return (substring(getStringValue(),beginAdvsryMdlBnchmkCd,beginAdvsryMdlBnchmkCd + ADVSRY_MDL_BNCHMK_CD_LEN));
   	}
     int localMdlThresTyCdCounter = -1;
     public boolean isMdlThresTyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMdlThresTyCdCounter != sharedCounter;
         localMdlThresTyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int MDL_THRES_TY_CD_LEN = 1;
	/**
	 * 	serialize this MdlThresTyCd
	 */
   protected void serializeMdlThresTyCd(char[] mdlThresTyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mdlThresTyCd,0,getStringValue(),beginMdlThresTyCd,MDL_THRES_TY_CD_LEN);
       localMdlThresTyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMdlThresTyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMdlThresTyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMdlThresTyCd() {	 
   		return (substring(getStringValue(),beginMdlThresTyCd,beginMdlThresTyCd + MDL_THRES_TY_CD_LEN));
   	}
     int localEndEffDaCounter = -1;
     public boolean isEndEffDaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEndEffDaCounter != sharedCounter;
         localEndEffDaCounter = sharedCounter; return hasModified;
     }
	protected static final int END_EFF_DA_LEN = 10;
	/**
	 * 	serialize this EndEffDa
	 */
   protected void serializeEndEffDa(char[] endEffDa) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(endEffDa,0,getStringValue(),beginEndEffDa,END_EFF_DA_LEN);
       localEndEffDaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEndEffDaConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshEndEffDa is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEndEffDa() {	 
   		return (substring(getStringValue(),beginEndEffDa,beginEndEffDa + END_EFF_DA_LEN));
   	}
     int localAdvsryMdlTyCdCounter = -1;
     public boolean isAdvsryMdlTyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAdvsryMdlTyCdCounter != sharedCounter;
         localAdvsryMdlTyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int ADVSRY_MDL_TY_CD_LEN = 3;
	/**
	 * 	serialize this AdvsryMdlTyCd
	 */
   protected void serializeAdvsryMdlTyCd(char[] advsryMdlTyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(advsryMdlTyCd,0,getStringValue(),beginAdvsryMdlTyCd,ADVSRY_MDL_TY_CD_LEN);
       localAdvsryMdlTyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAdvsryMdlTyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshAdvsryMdlTyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAdvsryMdlTyCd() {	 
   		return (substring(getStringValue(),beginAdvsryMdlTyCd,beginAdvsryMdlTyCd + ADVSRY_MDL_TY_CD_LEN));
   	}




}
  

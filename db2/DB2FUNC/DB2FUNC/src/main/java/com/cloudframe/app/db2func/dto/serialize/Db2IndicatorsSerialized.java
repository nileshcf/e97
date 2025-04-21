package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class Db2IndicatorsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Db2IndicatorsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Db2IndicatorsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DB_2_INDICATORS_LENGTH = 174;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDoNotUseDtNull;
            protected  int beginSAdpOldNbrNull;
            protected  int beginClientNbrNull;
            protected  int beginMcgillCdNull;
            protected  int beginSicCdNull;
            protected  int beginIssueDtNull;
            protected  int beginCLegacyNull;
            protected  int beginRedenomDtNull;
            protected  int beginOatsNasdaqCdNull;
            protected  int beginCloseIpoDtNull;
            protected  int beginPaymentDtNull;
            protected  int beginExdividendDtNull;
            protected  int beginCurrencyCdNull;
            protected  int beginMProxyDtNull;
            protected  int beginRProxyDtNull;
            protected  int beginExpirationDtNull;
            protected  int beginExpirationAmtNull;
            protected  int beginFIncmDebtCdNull;
            protected  int beginCallDtNull;
            protected  int beginCallAmtNull;
            protected  int beginDvdndAnnlAmtNull;
            protected  int beginDvdndAnnlPctNull;
            protected  int beginSAdpRstrNbrNull;
            protected  int beginUtsCanadianCdNull;
            protected  int beginTIndexOptCdNull;
            protected  int beginCLegacyCdNull;
            protected  int beginMaturityDtNull;
            protected  int beginCouponFirstDtNull;
            protected  int beginRecordHldEstDtNull;
            protected  int beginAccrueIntDtNull;
            protected  int beginCmrlBondCdNull;
            protected  int beginTypeGovtCdNull;
            protected  int beginStateCdNull;
            protected  int beginGovtBackCdNull;
            protected  int beginTypePaperCdNull;
            protected  int beginPayInterestDtNull;
            protected  int beginEvltnBondCdNull;
            protected  int beginCallTypeCdNull;
            protected  int beginTypeMuniCdNull;
            protected  int beginTypePutCdNull;
            protected  int beginFFrqncCdNull;
            protected  int beginRPartialCdNull;
            protected  int beginSBondCdNull;
            protected  int beginDIssuePctNull;
            protected  int beginVCurrentAmtNull;
            protected  int beginOidDtNull;
            protected  int beginCvrsnExptnDtNull;
            protected  int beginCusipCntraNbrNull;
            protected  int beginAstBckdCdNull;
            protected  int beginSymblTrdsAsCdNull;
            protected  int beginSymblTrdsWhiNull;
            protected  int beginNaicsCdNull;
            protected  int beginDlvrblFctrPctNull;
            protected  int beginYieldBidNull;
            protected  int beginMnmmDnmntAmtNull;
            protected  int beginClNoticeDaysNull;
            protected  int beginTaxWitholdRtNull;
            protected  int beginTaxCreditRtNull;
            protected  int beginCvrsnRtNull;
            protected  int beginCvrsnPrcAmtNull;
            protected  int beginCvrsnExpDtNull;
            protected  int beginScrtyAdpNull;
            protected  int beginPutStrtDtNull;
            protected  int beginPutEndDtNull;
            protected  int beginPutNtcMinNull;
            protected  int beginPutNtcMaxNull;
            protected  int beginPutTmngCdNull;
            protected  int beginCallTmngCdNull;
            protected  int beginRegShoElgblDtNull;
            protected  int beginSttlmDtNull;
            protected  int beginOptionMaturityDtNull;
            protected  int beginRegShoInelgblNull;
            protected  int beginPutFreqCdNull;
            protected  int beginFrstVrblRstDtNull;
            protected  int beginRstFreqCdNull;
            protected  int beginCall2TmngCdNull;
            protected  int beginUndlSymblTrdsNull;
            protected  int beginUndPrimeExchNull;
            protected  int beginUndPrimeSymbolNull;
            protected  int beginUndCanadaExchNull;
            protected  int beginUndCanadaSymbolNull;
            protected  int beginUndlCusipNull;
            protected  int beginUndlIsinNull;
            protected  int beginUndlSedolNull;
            protected  int beginUndlCommonCdNull;
            protected  int beginUndlCinsNull;
            protected  int beginMtrlMdfdDtNull;
	
	/**
	* Constructor for Db2IndicatorsSerialized
	**/
    public Db2IndicatorsSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Db2IndicatorsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DB_2_INDICATORS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDoNotUseDtNull = getStartOffset() + 0;	// set offset for serialization
  
             beginSAdpOldNbrNull = getStartOffset() + 2;	// set offset for serialization
  
             beginClientNbrNull = getStartOffset() + 4;	// set offset for serialization
  
             beginMcgillCdNull = getStartOffset() + 6;	// set offset for serialization
  
             beginSicCdNull = getStartOffset() + 8;	// set offset for serialization
  
             beginIssueDtNull = getStartOffset() + 10;	// set offset for serialization
  
             beginCLegacyNull = getStartOffset() + 12;	// set offset for serialization
  
             beginRedenomDtNull = getStartOffset() + 14;	// set offset for serialization
  
             beginOatsNasdaqCdNull = getStartOffset() + 16;	// set offset for serialization
  
             beginCloseIpoDtNull = getStartOffset() + 18;	// set offset for serialization
  
             beginPaymentDtNull = getStartOffset() + 20;	// set offset for serialization
  
             beginExdividendDtNull = getStartOffset() + 22;	// set offset for serialization
  
             beginCurrencyCdNull = getStartOffset() + 24;	// set offset for serialization
  
             beginMProxyDtNull = getStartOffset() + 26;	// set offset for serialization
  
             beginRProxyDtNull = getStartOffset() + 28;	// set offset for serialization
  
             beginExpirationDtNull = getStartOffset() + 30;	// set offset for serialization
  
             beginExpirationAmtNull = getStartOffset() + 32;	// set offset for serialization
  
             beginFIncmDebtCdNull = getStartOffset() + 34;	// set offset for serialization
  
             beginCallDtNull = getStartOffset() + 36;	// set offset for serialization
  
             beginCallAmtNull = getStartOffset() + 38;	// set offset for serialization
  
             beginDvdndAnnlAmtNull = getStartOffset() + 40;	// set offset for serialization
  
             beginDvdndAnnlPctNull = getStartOffset() + 42;	// set offset for serialization
  
             beginSAdpRstrNbrNull = getStartOffset() + 44;	// set offset for serialization
  
             beginUtsCanadianCdNull = getStartOffset() + 46;	// set offset for serialization
  
             beginTIndexOptCdNull = getStartOffset() + 48;	// set offset for serialization
  
             beginCLegacyCdNull = getStartOffset() + 50;	// set offset for serialization
  
             beginMaturityDtNull = getStartOffset() + 52;	// set offset for serialization
  
             beginCouponFirstDtNull = getStartOffset() + 54;	// set offset for serialization
  
             beginRecordHldEstDtNull = getStartOffset() + 56;	// set offset for serialization
  
             beginAccrueIntDtNull = getStartOffset() + 58;	// set offset for serialization
  
             beginCmrlBondCdNull = getStartOffset() + 60;	// set offset for serialization
  
             beginTypeGovtCdNull = getStartOffset() + 62;	// set offset for serialization
  
             beginStateCdNull = getStartOffset() + 64;	// set offset for serialization
  
             beginGovtBackCdNull = getStartOffset() + 66;	// set offset for serialization
  
             beginTypePaperCdNull = getStartOffset() + 68;	// set offset for serialization
  
             beginPayInterestDtNull = getStartOffset() + 70;	// set offset for serialization
  
             beginEvltnBondCdNull = getStartOffset() + 72;	// set offset for serialization
  
             beginCallTypeCdNull = getStartOffset() + 74;	// set offset for serialization
  
             beginTypeMuniCdNull = getStartOffset() + 76;	// set offset for serialization
  
             beginTypePutCdNull = getStartOffset() + 78;	// set offset for serialization
  
             beginFFrqncCdNull = getStartOffset() + 80;	// set offset for serialization
  
             beginRPartialCdNull = getStartOffset() + 82;	// set offset for serialization
  
             beginSBondCdNull = getStartOffset() + 84;	// set offset for serialization
  
             beginDIssuePctNull = getStartOffset() + 86;	// set offset for serialization
  
             beginVCurrentAmtNull = getStartOffset() + 88;	// set offset for serialization
  
             beginOidDtNull = getStartOffset() + 90;	// set offset for serialization
  
             beginCvrsnExptnDtNull = getStartOffset() + 92;	// set offset for serialization
  
             beginCusipCntraNbrNull = getStartOffset() + 94;	// set offset for serialization
  
             beginAstBckdCdNull = getStartOffset() + 96;	// set offset for serialization
  
             beginSymblTrdsAsCdNull = getStartOffset() + 98;	// set offset for serialization
  
             beginSymblTrdsWhiNull = getStartOffset() + 100;	// set offset for serialization
  
             beginNaicsCdNull = getStartOffset() + 102;	// set offset for serialization
  
             beginDlvrblFctrPctNull = getStartOffset() + 104;	// set offset for serialization
  
             beginYieldBidNull = getStartOffset() + 106;	// set offset for serialization
  
             beginMnmmDnmntAmtNull = getStartOffset() + 108;	// set offset for serialization
  
             beginClNoticeDaysNull = getStartOffset() + 110;	// set offset for serialization
  
             beginTaxWitholdRtNull = getStartOffset() + 112;	// set offset for serialization
  
             beginTaxCreditRtNull = getStartOffset() + 114;	// set offset for serialization
  
             beginCvrsnRtNull = getStartOffset() + 116;	// set offset for serialization
  
             beginCvrsnPrcAmtNull = getStartOffset() + 118;	// set offset for serialization
  
             beginCvrsnExpDtNull = getStartOffset() + 120;	// set offset for serialization
  
             beginScrtyAdpNull = getStartOffset() + 122;	// set offset for serialization
  
             beginPutStrtDtNull = getStartOffset() + 124;	// set offset for serialization
  
             beginPutEndDtNull = getStartOffset() + 126;	// set offset for serialization
  
             beginPutNtcMinNull = getStartOffset() + 128;	// set offset for serialization
  
             beginPutNtcMaxNull = getStartOffset() + 130;	// set offset for serialization
  
             beginPutTmngCdNull = getStartOffset() + 132;	// set offset for serialization
  
             beginCallTmngCdNull = getStartOffset() + 134;	// set offset for serialization
  
             beginRegShoElgblDtNull = getStartOffset() + 136;	// set offset for serialization
  
             beginSttlmDtNull = getStartOffset() + 138;	// set offset for serialization
  
             beginOptionMaturityDtNull = getStartOffset() + 140;	// set offset for serialization
  
             beginRegShoInelgblNull = getStartOffset() + 142;	// set offset for serialization
  
             beginPutFreqCdNull = getStartOffset() + 144;	// set offset for serialization
  
             beginFrstVrblRstDtNull = getStartOffset() + 146;	// set offset for serialization
  
             beginRstFreqCdNull = getStartOffset() + 148;	// set offset for serialization
  
             beginCall2TmngCdNull = getStartOffset() + 150;	// set offset for serialization
  
             beginUndlSymblTrdsNull = getStartOffset() + 152;	// set offset for serialization
  
             beginUndPrimeExchNull = getStartOffset() + 154;	// set offset for serialization
  
             beginUndPrimeSymbolNull = getStartOffset() + 156;	// set offset for serialization
  
             beginUndCanadaExchNull = getStartOffset() + 158;	// set offset for serialization
  
             beginUndCanadaSymbolNull = getStartOffset() + 160;	// set offset for serialization
  
             beginUndlCusipNull = getStartOffset() + 162;	// set offset for serialization
  
             beginUndlIsinNull = getStartOffset() + 164;	// set offset for serialization
  
             beginUndlSedolNull = getStartOffset() + 166;	// set offset for serialization
  
             beginUndlCommonCdNull = getStartOffset() + 168;	// set offset for serialization
  
             beginUndlCinsNull = getStartOffset() + 170;	// set offset for serialization
  
             beginMtrlMdfdDtNull = getStartOffset() + 172;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localDoNotUseDtNullCounter = -1;
         public boolean isDoNotUseDtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDoNotUseDtNullCounter != sharedCounter;
            localDoNotUseDtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int DO_NOT_USE_DT_NULL_LEN = 2;
  	/**
	 * serializeDoNotUseDtNull
	 */
	protected void serializeDoNotUseDtNull(short doNotUseDtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( doNotUseDtNull,DO_NOT_USE_DT_NULL_LEN)
                  ,beginDoNotUseDtNull
                  ,DO_NOT_USE_DT_NULL_LEN
                 );
            localDoNotUseDtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkDoNotUseDtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshDoNotUseDtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshDoNotUseDtNull() {	 
			return (getShort(beginDoNotUseDtNull));
   	}
         int localSAdpOldNbrNullCounter = -1;
         public boolean isSAdpOldNbrNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSAdpOldNbrNullCounter != sharedCounter;
            localSAdpOldNbrNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int S_ADP_OLD_NBR_NULL_LEN = 2;
  	/**
	 * serializeSAdpOldNbrNull
	 */
	protected void serializeSAdpOldNbrNull(short sAdpOldNbrNull) {
           replaceValue( //  save the value as string
                   getBinaryString( sAdpOldNbrNull,S_ADP_OLD_NBR_NULL_LEN)
                  ,beginSAdpOldNbrNull
                  ,S_ADP_OLD_NBR_NULL_LEN
                 );
            localSAdpOldNbrNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSAdpOldNbrNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSAdpOldNbrNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSAdpOldNbrNull() {	 
			return (getShort(beginSAdpOldNbrNull));
   	}
         int localClientNbrNullCounter = -1;
         public boolean isClientNbrNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localClientNbrNullCounter != sharedCounter;
            localClientNbrNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int CLIENT_NBR_NULL_LEN = 2;
  	/**
	 * serializeClientNbrNull
	 */
	protected void serializeClientNbrNull(short clientNbrNull) {
           replaceValue( //  save the value as string
                   getBinaryString( clientNbrNull,CLIENT_NBR_NULL_LEN)
                  ,beginClientNbrNull
                  ,CLIENT_NBR_NULL_LEN
                 );
            localClientNbrNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkClientNbrNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshClientNbrNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshClientNbrNull() {	 
			return (getShort(beginClientNbrNull));
   	}
         int localMcgillCdNullCounter = -1;
         public boolean isMcgillCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMcgillCdNullCounter != sharedCounter;
            localMcgillCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int MCGILL_CD_NULL_LEN = 2;
  	/**
	 * serializeMcgillCdNull
	 */
	protected void serializeMcgillCdNull(short mcgillCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( mcgillCdNull,MCGILL_CD_NULL_LEN)
                  ,beginMcgillCdNull
                  ,MCGILL_CD_NULL_LEN
                 );
            localMcgillCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkMcgillCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshMcgillCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMcgillCdNull() {	 
			return (getShort(beginMcgillCdNull));
   	}
         int localSicCdNullCounter = -1;
         public boolean isSicCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSicCdNullCounter != sharedCounter;
            localSicCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int SIC_CD_NULL_LEN = 2;
  	/**
	 * serializeSicCdNull
	 */
	protected void serializeSicCdNull(short sicCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( sicCdNull,SIC_CD_NULL_LEN)
                  ,beginSicCdNull
                  ,SIC_CD_NULL_LEN
                 );
            localSicCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSicCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSicCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSicCdNull() {	 
			return (getShort(beginSicCdNull));
   	}
         int localIssueDtNullCounter = -1;
         public boolean isIssueDtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIssueDtNullCounter != sharedCounter;
            localIssueDtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int ISSUE_DT_NULL_LEN = 2;
  	/**
	 * serializeIssueDtNull
	 */
	protected void serializeIssueDtNull(short issueDtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( issueDtNull,ISSUE_DT_NULL_LEN)
                  ,beginIssueDtNull
                  ,ISSUE_DT_NULL_LEN
                 );
            localIssueDtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIssueDtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIssueDtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIssueDtNull() {	 
			return (getShort(beginIssueDtNull));
   	}
         int localCLegacyNullCounter = -1;
         public boolean isCLegacyNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCLegacyNullCounter != sharedCounter;
            localCLegacyNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int C_LEGACY_NULL_LEN = 2;
  	/**
	 * serializeCLegacyNull
	 */
	protected void serializeCLegacyNull(short cLegacyNull) {
           replaceValue( //  save the value as string
                   getBinaryString( cLegacyNull,C_LEGACY_NULL_LEN)
                  ,beginCLegacyNull
                  ,C_LEGACY_NULL_LEN
                 );
            localCLegacyNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkCLegacyNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCLegacyNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCLegacyNull() {	 
			return (getShort(beginCLegacyNull));
   	}
         int localRedenomDtNullCounter = -1;
         public boolean isRedenomDtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRedenomDtNullCounter != sharedCounter;
            localRedenomDtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int REDENOM_DT_NULL_LEN = 2;
  	/**
	 * serializeRedenomDtNull
	 */
	protected void serializeRedenomDtNull(short redenomDtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( redenomDtNull,REDENOM_DT_NULL_LEN)
                  ,beginRedenomDtNull
                  ,REDENOM_DT_NULL_LEN
                 );
            localRedenomDtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkRedenomDtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshRedenomDtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshRedenomDtNull() {	 
			return (getShort(beginRedenomDtNull));
   	}
         int localOatsNasdaqCdNullCounter = -1;
         public boolean isOatsNasdaqCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localOatsNasdaqCdNullCounter != sharedCounter;
            localOatsNasdaqCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int OATS_NASDAQ_CD_NULL_LEN = 2;
  	/**
	 * serializeOatsNasdaqCdNull
	 */
	protected void serializeOatsNasdaqCdNull(short oatsNasdaqCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( oatsNasdaqCdNull,OATS_NASDAQ_CD_NULL_LEN)
                  ,beginOatsNasdaqCdNull
                  ,OATS_NASDAQ_CD_NULL_LEN
                 );
            localOatsNasdaqCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkOatsNasdaqCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshOatsNasdaqCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshOatsNasdaqCdNull() {	 
			return (getShort(beginOatsNasdaqCdNull));
   	}
         int localCloseIpoDtNullCounter = -1;
         public boolean isCloseIpoDtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCloseIpoDtNullCounter != sharedCounter;
            localCloseIpoDtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int CLOSE_IPO_DT_NULL_LEN = 2;
  	/**
	 * serializeCloseIpoDtNull
	 */
	protected void serializeCloseIpoDtNull(short closeIpoDtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( closeIpoDtNull,CLOSE_IPO_DT_NULL_LEN)
                  ,beginCloseIpoDtNull
                  ,CLOSE_IPO_DT_NULL_LEN
                 );
            localCloseIpoDtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkCloseIpoDtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCloseIpoDtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCloseIpoDtNull() {	 
			return (getShort(beginCloseIpoDtNull));
   	}
         int localPaymentDtNullCounter = -1;
         public boolean isPaymentDtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPaymentDtNullCounter != sharedCounter;
            localPaymentDtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int PAYMENT_DT_NULL_LEN = 2;
  	/**
	 * serializePaymentDtNull
	 */
	protected void serializePaymentDtNull(short paymentDtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( paymentDtNull,PAYMENT_DT_NULL_LEN)
                  ,beginPaymentDtNull
                  ,PAYMENT_DT_NULL_LEN
                 );
            localPaymentDtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkPaymentDtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshPaymentDtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshPaymentDtNull() {	 
			return (getShort(beginPaymentDtNull));
   	}
         int localExdividendDtNullCounter = -1;
         public boolean isExdividendDtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localExdividendDtNullCounter != sharedCounter;
            localExdividendDtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int EXDIVIDEND_DT_NULL_LEN = 2;
  	/**
	 * serializeExdividendDtNull
	 */
	protected void serializeExdividendDtNull(short exdividendDtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( exdividendDtNull,EXDIVIDEND_DT_NULL_LEN)
                  ,beginExdividendDtNull
                  ,EXDIVIDEND_DT_NULL_LEN
                 );
            localExdividendDtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkExdividendDtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshExdividendDtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshExdividendDtNull() {	 
			return (getShort(beginExdividendDtNull));
   	}
         int localCurrencyCdNullCounter = -1;
         public boolean isCurrencyCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCurrencyCdNullCounter != sharedCounter;
            localCurrencyCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int CURRENCY_CD_NULL_LEN = 2;
  	/**
	 * serializeCurrencyCdNull
	 */
	protected void serializeCurrencyCdNull(short currencyCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( currencyCdNull,CURRENCY_CD_NULL_LEN)
                  ,beginCurrencyCdNull
                  ,CURRENCY_CD_NULL_LEN
                 );
            localCurrencyCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkCurrencyCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCurrencyCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCurrencyCdNull() {	 
			return (getShort(beginCurrencyCdNull));
   	}
         int localMProxyDtNullCounter = -1;
         public boolean isMProxyDtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMProxyDtNullCounter != sharedCounter;
            localMProxyDtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int M_PROXY_DT_NULL_LEN = 2;
  	/**
	 * serializeMProxyDtNull
	 */
	protected void serializeMProxyDtNull(short mProxyDtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( mProxyDtNull,M_PROXY_DT_NULL_LEN)
                  ,beginMProxyDtNull
                  ,M_PROXY_DT_NULL_LEN
                 );
            localMProxyDtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkMProxyDtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshMProxyDtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMProxyDtNull() {	 
			return (getShort(beginMProxyDtNull));
   	}
         int localRProxyDtNullCounter = -1;
         public boolean isRProxyDtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRProxyDtNullCounter != sharedCounter;
            localRProxyDtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int R_PROXY_DT_NULL_LEN = 2;
  	/**
	 * serializeRProxyDtNull
	 */
	protected void serializeRProxyDtNull(short rProxyDtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( rProxyDtNull,R_PROXY_DT_NULL_LEN)
                  ,beginRProxyDtNull
                  ,R_PROXY_DT_NULL_LEN
                 );
            localRProxyDtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkRProxyDtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshRProxyDtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshRProxyDtNull() {	 
			return (getShort(beginRProxyDtNull));
   	}
         int localExpirationDtNullCounter = -1;
         public boolean isExpirationDtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localExpirationDtNullCounter != sharedCounter;
            localExpirationDtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int EXPIRATION_DT_NULL_LEN = 2;
  	/**
	 * serializeExpirationDtNull
	 */
	protected void serializeExpirationDtNull(short expirationDtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( expirationDtNull,EXPIRATION_DT_NULL_LEN)
                  ,beginExpirationDtNull
                  ,EXPIRATION_DT_NULL_LEN
                 );
            localExpirationDtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkExpirationDtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshExpirationDtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshExpirationDtNull() {	 
			return (getShort(beginExpirationDtNull));
   	}
         int localExpirationAmtNullCounter = -1;
         public boolean isExpirationAmtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localExpirationAmtNullCounter != sharedCounter;
            localExpirationAmtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int EXPIRATION_AMT_NULL_LEN = 2;
  	/**
	 * serializeExpirationAmtNull
	 */
	protected void serializeExpirationAmtNull(short expirationAmtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( expirationAmtNull,EXPIRATION_AMT_NULL_LEN)
                  ,beginExpirationAmtNull
                  ,EXPIRATION_AMT_NULL_LEN
                 );
            localExpirationAmtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkExpirationAmtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshExpirationAmtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshExpirationAmtNull() {	 
			return (getShort(beginExpirationAmtNull));
   	}
         int localFIncmDebtCdNullCounter = -1;
         public boolean isFIncmDebtCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFIncmDebtCdNullCounter != sharedCounter;
            localFIncmDebtCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int F_INCM_DEBT_CD_NULL_LEN = 2;
  	/**
	 * serializeFIncmDebtCdNull
	 */
	protected void serializeFIncmDebtCdNull(short fIncmDebtCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( fIncmDebtCdNull,F_INCM_DEBT_CD_NULL_LEN)
                  ,beginFIncmDebtCdNull
                  ,F_INCM_DEBT_CD_NULL_LEN
                 );
            localFIncmDebtCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkFIncmDebtCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshFIncmDebtCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshFIncmDebtCdNull() {	 
			return (getShort(beginFIncmDebtCdNull));
   	}
         int localCallDtNullCounter = -1;
         public boolean isCallDtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCallDtNullCounter != sharedCounter;
            localCallDtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int CALL_DT_NULL_LEN = 2;
  	/**
	 * serializeCallDtNull
	 */
	protected void serializeCallDtNull(short callDtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( callDtNull,CALL_DT_NULL_LEN)
                  ,beginCallDtNull
                  ,CALL_DT_NULL_LEN
                 );
            localCallDtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkCallDtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCallDtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCallDtNull() {	 
			return (getShort(beginCallDtNull));
   	}
         int localCallAmtNullCounter = -1;
         public boolean isCallAmtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCallAmtNullCounter != sharedCounter;
            localCallAmtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int CALL_AMT_NULL_LEN = 2;
  	/**
	 * serializeCallAmtNull
	 */
	protected void serializeCallAmtNull(short callAmtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( callAmtNull,CALL_AMT_NULL_LEN)
                  ,beginCallAmtNull
                  ,CALL_AMT_NULL_LEN
                 );
            localCallAmtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkCallAmtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCallAmtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCallAmtNull() {	 
			return (getShort(beginCallAmtNull));
   	}
         int localDvdndAnnlAmtNullCounter = -1;
         public boolean isDvdndAnnlAmtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDvdndAnnlAmtNullCounter != sharedCounter;
            localDvdndAnnlAmtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int DVDND_ANNL_AMT_NULL_LEN = 2;
  	/**
	 * serializeDvdndAnnlAmtNull
	 */
	protected void serializeDvdndAnnlAmtNull(short dvdndAnnlAmtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( dvdndAnnlAmtNull,DVDND_ANNL_AMT_NULL_LEN)
                  ,beginDvdndAnnlAmtNull
                  ,DVDND_ANNL_AMT_NULL_LEN
                 );
            localDvdndAnnlAmtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkDvdndAnnlAmtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshDvdndAnnlAmtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshDvdndAnnlAmtNull() {	 
			return (getShort(beginDvdndAnnlAmtNull));
   	}
         int localDvdndAnnlPctNullCounter = -1;
         public boolean isDvdndAnnlPctNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDvdndAnnlPctNullCounter != sharedCounter;
            localDvdndAnnlPctNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int DVDND_ANNL_PCT_NULL_LEN = 2;
  	/**
	 * serializeDvdndAnnlPctNull
	 */
	protected void serializeDvdndAnnlPctNull(short dvdndAnnlPctNull) {
           replaceValue( //  save the value as string
                   getBinaryString( dvdndAnnlPctNull,DVDND_ANNL_PCT_NULL_LEN)
                  ,beginDvdndAnnlPctNull
                  ,DVDND_ANNL_PCT_NULL_LEN
                 );
            localDvdndAnnlPctNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkDvdndAnnlPctNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshDvdndAnnlPctNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshDvdndAnnlPctNull() {	 
			return (getShort(beginDvdndAnnlPctNull));
   	}
         int localSAdpRstrNbrNullCounter = -1;
         public boolean isSAdpRstrNbrNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSAdpRstrNbrNullCounter != sharedCounter;
            localSAdpRstrNbrNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int S_ADP_RSTR_NBR_NULL_LEN = 2;
  	/**
	 * serializeSAdpRstrNbrNull
	 */
	protected void serializeSAdpRstrNbrNull(short sAdpRstrNbrNull) {
           replaceValue( //  save the value as string
                   getBinaryString( sAdpRstrNbrNull,S_ADP_RSTR_NBR_NULL_LEN)
                  ,beginSAdpRstrNbrNull
                  ,S_ADP_RSTR_NBR_NULL_LEN
                 );
            localSAdpRstrNbrNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSAdpRstrNbrNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSAdpRstrNbrNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSAdpRstrNbrNull() {	 
			return (getShort(beginSAdpRstrNbrNull));
   	}
         int localUtsCanadianCdNullCounter = -1;
         public boolean isUtsCanadianCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUtsCanadianCdNullCounter != sharedCounter;
            localUtsCanadianCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int UTS_CANADIAN_CD_NULL_LEN = 2;
  	/**
	 * serializeUtsCanadianCdNull
	 */
	protected void serializeUtsCanadianCdNull(short utsCanadianCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( utsCanadianCdNull,UTS_CANADIAN_CD_NULL_LEN)
                  ,beginUtsCanadianCdNull
                  ,UTS_CANADIAN_CD_NULL_LEN
                 );
            localUtsCanadianCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkUtsCanadianCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshUtsCanadianCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshUtsCanadianCdNull() {	 
			return (getShort(beginUtsCanadianCdNull));
   	}
         int localTIndexOptCdNullCounter = -1;
         public boolean isTIndexOptCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTIndexOptCdNullCounter != sharedCounter;
            localTIndexOptCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int T_INDEX_OPT_CD_NULL_LEN = 2;
  	/**
	 * serializeTIndexOptCdNull
	 */
	protected void serializeTIndexOptCdNull(short tIndexOptCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( tIndexOptCdNull,T_INDEX_OPT_CD_NULL_LEN)
                  ,beginTIndexOptCdNull
                  ,T_INDEX_OPT_CD_NULL_LEN
                 );
            localTIndexOptCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTIndexOptCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTIndexOptCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTIndexOptCdNull() {	 
			return (getShort(beginTIndexOptCdNull));
   	}
         int localCLegacyCdNullCounter = -1;
         public boolean isCLegacyCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCLegacyCdNullCounter != sharedCounter;
            localCLegacyCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int C_LEGACY_CD_NULL_LEN = 2;
  	/**
	 * serializeCLegacyCdNull
	 */
	protected void serializeCLegacyCdNull(short cLegacyCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( cLegacyCdNull,C_LEGACY_CD_NULL_LEN)
                  ,beginCLegacyCdNull
                  ,C_LEGACY_CD_NULL_LEN
                 );
            localCLegacyCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkCLegacyCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCLegacyCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCLegacyCdNull() {	 
			return (getShort(beginCLegacyCdNull));
   	}
         int localMaturityDtNullCounter = -1;
         public boolean isMaturityDtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMaturityDtNullCounter != sharedCounter;
            localMaturityDtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int MATURITY_DT_NULL_LEN = 2;
  	/**
	 * serializeMaturityDtNull
	 */
	protected void serializeMaturityDtNull(short maturityDtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( maturityDtNull,MATURITY_DT_NULL_LEN)
                  ,beginMaturityDtNull
                  ,MATURITY_DT_NULL_LEN
                 );
            localMaturityDtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkMaturityDtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshMaturityDtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMaturityDtNull() {	 
			return (getShort(beginMaturityDtNull));
   	}
         int localCouponFirstDtNullCounter = -1;
         public boolean isCouponFirstDtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCouponFirstDtNullCounter != sharedCounter;
            localCouponFirstDtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int COUPON_FIRST_DT_NULL_LEN = 2;
  	/**
	 * serializeCouponFirstDtNull
	 */
	protected void serializeCouponFirstDtNull(short couponFirstDtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( couponFirstDtNull,COUPON_FIRST_DT_NULL_LEN)
                  ,beginCouponFirstDtNull
                  ,COUPON_FIRST_DT_NULL_LEN
                 );
            localCouponFirstDtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkCouponFirstDtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCouponFirstDtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCouponFirstDtNull() {	 
			return (getShort(beginCouponFirstDtNull));
   	}
         int localRecordHldEstDtNullCounter = -1;
         public boolean isRecordHldEstDtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRecordHldEstDtNullCounter != sharedCounter;
            localRecordHldEstDtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int RECORD_HLD_EST_DT_NULL_LEN = 2;
  	/**
	 * serializeRecordHldEstDtNull
	 */
	protected void serializeRecordHldEstDtNull(short recordHldEstDtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( recordHldEstDtNull,RECORD_HLD_EST_DT_NULL_LEN)
                  ,beginRecordHldEstDtNull
                  ,RECORD_HLD_EST_DT_NULL_LEN
                 );
            localRecordHldEstDtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkRecordHldEstDtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshRecordHldEstDtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshRecordHldEstDtNull() {	 
			return (getShort(beginRecordHldEstDtNull));
   	}
         int localAccrueIntDtNullCounter = -1;
         public boolean isAccrueIntDtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAccrueIntDtNullCounter != sharedCounter;
            localAccrueIntDtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int ACCRUE_INT_DT_NULL_LEN = 2;
  	/**
	 * serializeAccrueIntDtNull
	 */
	protected void serializeAccrueIntDtNull(short accrueIntDtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( accrueIntDtNull,ACCRUE_INT_DT_NULL_LEN)
                  ,beginAccrueIntDtNull
                  ,ACCRUE_INT_DT_NULL_LEN
                 );
            localAccrueIntDtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkAccrueIntDtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshAccrueIntDtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshAccrueIntDtNull() {	 
			return (getShort(beginAccrueIntDtNull));
   	}
         int localCmrlBondCdNullCounter = -1;
         public boolean isCmrlBondCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCmrlBondCdNullCounter != sharedCounter;
            localCmrlBondCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int CMRL_BOND_CD_NULL_LEN = 2;
  	/**
	 * serializeCmrlBondCdNull
	 */
	protected void serializeCmrlBondCdNull(short cmrlBondCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( cmrlBondCdNull,CMRL_BOND_CD_NULL_LEN)
                  ,beginCmrlBondCdNull
                  ,CMRL_BOND_CD_NULL_LEN
                 );
            localCmrlBondCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkCmrlBondCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCmrlBondCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCmrlBondCdNull() {	 
			return (getShort(beginCmrlBondCdNull));
   	}
         int localTypeGovtCdNullCounter = -1;
         public boolean isTypeGovtCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTypeGovtCdNullCounter != sharedCounter;
            localTypeGovtCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int TYPE_GOVT_CD_NULL_LEN = 2;
  	/**
	 * serializeTypeGovtCdNull
	 */
	protected void serializeTypeGovtCdNull(short typeGovtCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( typeGovtCdNull,TYPE_GOVT_CD_NULL_LEN)
                  ,beginTypeGovtCdNull
                  ,TYPE_GOVT_CD_NULL_LEN
                 );
            localTypeGovtCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTypeGovtCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTypeGovtCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTypeGovtCdNull() {	 
			return (getShort(beginTypeGovtCdNull));
   	}
         int localStateCdNullCounter = -1;
         public boolean isStateCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localStateCdNullCounter != sharedCounter;
            localStateCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int STATE_CD_NULL_LEN = 2;
  	/**
	 * serializeStateCdNull
	 */
	protected void serializeStateCdNull(short stateCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( stateCdNull,STATE_CD_NULL_LEN)
                  ,beginStateCdNull
                  ,STATE_CD_NULL_LEN
                 );
            localStateCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkStateCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshStateCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshStateCdNull() {	 
			return (getShort(beginStateCdNull));
   	}
         int localGovtBackCdNullCounter = -1;
         public boolean isGovtBackCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localGovtBackCdNullCounter != sharedCounter;
            localGovtBackCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int GOVT_BACK_CD_NULL_LEN = 2;
  	/**
	 * serializeGovtBackCdNull
	 */
	protected void serializeGovtBackCdNull(short govtBackCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( govtBackCdNull,GOVT_BACK_CD_NULL_LEN)
                  ,beginGovtBackCdNull
                  ,GOVT_BACK_CD_NULL_LEN
                 );
            localGovtBackCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkGovtBackCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshGovtBackCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshGovtBackCdNull() {	 
			return (getShort(beginGovtBackCdNull));
   	}
         int localTypePaperCdNullCounter = -1;
         public boolean isTypePaperCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTypePaperCdNullCounter != sharedCounter;
            localTypePaperCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int TYPE_PAPER_CD_NULL_LEN = 2;
  	/**
	 * serializeTypePaperCdNull
	 */
	protected void serializeTypePaperCdNull(short typePaperCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( typePaperCdNull,TYPE_PAPER_CD_NULL_LEN)
                  ,beginTypePaperCdNull
                  ,TYPE_PAPER_CD_NULL_LEN
                 );
            localTypePaperCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTypePaperCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTypePaperCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTypePaperCdNull() {	 
			return (getShort(beginTypePaperCdNull));
   	}
         int localPayInterestDtNullCounter = -1;
         public boolean isPayInterestDtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPayInterestDtNullCounter != sharedCounter;
            localPayInterestDtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int PAY_INTEREST_DT_NULL_LEN = 2;
  	/**
	 * serializePayInterestDtNull
	 */
	protected void serializePayInterestDtNull(short payInterestDtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( payInterestDtNull,PAY_INTEREST_DT_NULL_LEN)
                  ,beginPayInterestDtNull
                  ,PAY_INTEREST_DT_NULL_LEN
                 );
            localPayInterestDtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkPayInterestDtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshPayInterestDtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshPayInterestDtNull() {	 
			return (getShort(beginPayInterestDtNull));
   	}
         int localEvltnBondCdNullCounter = -1;
         public boolean isEvltnBondCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEvltnBondCdNullCounter != sharedCounter;
            localEvltnBondCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int EVLTN_BOND_CD_NULL_LEN = 2;
  	/**
	 * serializeEvltnBondCdNull
	 */
	protected void serializeEvltnBondCdNull(short evltnBondCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( evltnBondCdNull,EVLTN_BOND_CD_NULL_LEN)
                  ,beginEvltnBondCdNull
                  ,EVLTN_BOND_CD_NULL_LEN
                 );
            localEvltnBondCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkEvltnBondCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshEvltnBondCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshEvltnBondCdNull() {	 
			return (getShort(beginEvltnBondCdNull));
   	}
         int localCallTypeCdNullCounter = -1;
         public boolean isCallTypeCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCallTypeCdNullCounter != sharedCounter;
            localCallTypeCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int CALL_TYPE_CD_NULL_LEN = 2;
  	/**
	 * serializeCallTypeCdNull
	 */
	protected void serializeCallTypeCdNull(short callTypeCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( callTypeCdNull,CALL_TYPE_CD_NULL_LEN)
                  ,beginCallTypeCdNull
                  ,CALL_TYPE_CD_NULL_LEN
                 );
            localCallTypeCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkCallTypeCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCallTypeCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCallTypeCdNull() {	 
			return (getShort(beginCallTypeCdNull));
   	}
         int localTypeMuniCdNullCounter = -1;
         public boolean isTypeMuniCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTypeMuniCdNullCounter != sharedCounter;
            localTypeMuniCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int TYPE_MUNI_CD_NULL_LEN = 2;
  	/**
	 * serializeTypeMuniCdNull
	 */
	protected void serializeTypeMuniCdNull(short typeMuniCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( typeMuniCdNull,TYPE_MUNI_CD_NULL_LEN)
                  ,beginTypeMuniCdNull
                  ,TYPE_MUNI_CD_NULL_LEN
                 );
            localTypeMuniCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTypeMuniCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTypeMuniCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTypeMuniCdNull() {	 
			return (getShort(beginTypeMuniCdNull));
   	}
         int localTypePutCdNullCounter = -1;
         public boolean isTypePutCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTypePutCdNullCounter != sharedCounter;
            localTypePutCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int TYPE_PUT_CD_NULL_LEN = 2;
  	/**
	 * serializeTypePutCdNull
	 */
	protected void serializeTypePutCdNull(short typePutCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( typePutCdNull,TYPE_PUT_CD_NULL_LEN)
                  ,beginTypePutCdNull
                  ,TYPE_PUT_CD_NULL_LEN
                 );
            localTypePutCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTypePutCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTypePutCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTypePutCdNull() {	 
			return (getShort(beginTypePutCdNull));
   	}
         int localFFrqncCdNullCounter = -1;
         public boolean isFFrqncCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFFrqncCdNullCounter != sharedCounter;
            localFFrqncCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int F_FRQNC_CD_NULL_LEN = 2;
  	/**
	 * serializeFFrqncCdNull
	 */
	protected void serializeFFrqncCdNull(short fFrqncCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( fFrqncCdNull,F_FRQNC_CD_NULL_LEN)
                  ,beginFFrqncCdNull
                  ,F_FRQNC_CD_NULL_LEN
                 );
            localFFrqncCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkFFrqncCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshFFrqncCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshFFrqncCdNull() {	 
			return (getShort(beginFFrqncCdNull));
   	}
         int localRPartialCdNullCounter = -1;
         public boolean isRPartialCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRPartialCdNullCounter != sharedCounter;
            localRPartialCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int R_PARTIAL_CD_NULL_LEN = 2;
  	/**
	 * serializeRPartialCdNull
	 */
	protected void serializeRPartialCdNull(short rPartialCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( rPartialCdNull,R_PARTIAL_CD_NULL_LEN)
                  ,beginRPartialCdNull
                  ,R_PARTIAL_CD_NULL_LEN
                 );
            localRPartialCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkRPartialCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshRPartialCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshRPartialCdNull() {	 
			return (getShort(beginRPartialCdNull));
   	}
         int localSBondCdNullCounter = -1;
         public boolean isSBondCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSBondCdNullCounter != sharedCounter;
            localSBondCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int S_BOND_CD_NULL_LEN = 2;
  	/**
	 * serializeSBondCdNull
	 */
	protected void serializeSBondCdNull(short sBondCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( sBondCdNull,S_BOND_CD_NULL_LEN)
                  ,beginSBondCdNull
                  ,S_BOND_CD_NULL_LEN
                 );
            localSBondCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSBondCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSBondCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSBondCdNull() {	 
			return (getShort(beginSBondCdNull));
   	}
         int localDIssuePctNullCounter = -1;
         public boolean isDIssuePctNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDIssuePctNullCounter != sharedCounter;
            localDIssuePctNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int D_ISSUE_PCT_NULL_LEN = 2;
  	/**
	 * serializeDIssuePctNull
	 */
	protected void serializeDIssuePctNull(short dIssuePctNull) {
           replaceValue( //  save the value as string
                   getBinaryString( dIssuePctNull,D_ISSUE_PCT_NULL_LEN)
                  ,beginDIssuePctNull
                  ,D_ISSUE_PCT_NULL_LEN
                 );
            localDIssuePctNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkDIssuePctNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshDIssuePctNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshDIssuePctNull() {	 
			return (getShort(beginDIssuePctNull));
   	}
         int localVCurrentAmtNullCounter = -1;
         public boolean isVCurrentAmtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localVCurrentAmtNullCounter != sharedCounter;
            localVCurrentAmtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int V_CURRENT_AMT_NULL_LEN = 2;
  	/**
	 * serializeVCurrentAmtNull
	 */
	protected void serializeVCurrentAmtNull(short vCurrentAmtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( vCurrentAmtNull,V_CURRENT_AMT_NULL_LEN)
                  ,beginVCurrentAmtNull
                  ,V_CURRENT_AMT_NULL_LEN
                 );
            localVCurrentAmtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkVCurrentAmtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshVCurrentAmtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshVCurrentAmtNull() {	 
			return (getShort(beginVCurrentAmtNull));
   	}
         int localOidDtNullCounter = -1;
         public boolean isOidDtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localOidDtNullCounter != sharedCounter;
            localOidDtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int OID_DT_NULL_LEN = 2;
  	/**
	 * serializeOidDtNull
	 */
	protected void serializeOidDtNull(short oidDtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( oidDtNull,OID_DT_NULL_LEN)
                  ,beginOidDtNull
                  ,OID_DT_NULL_LEN
                 );
            localOidDtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkOidDtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshOidDtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshOidDtNull() {	 
			return (getShort(beginOidDtNull));
   	}
         int localCvrsnExptnDtNullCounter = -1;
         public boolean isCvrsnExptnDtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCvrsnExptnDtNullCounter != sharedCounter;
            localCvrsnExptnDtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int CVRSN_EXPTN_DT_NULL_LEN = 2;
  	/**
	 * serializeCvrsnExptnDtNull
	 */
	protected void serializeCvrsnExptnDtNull(short cvrsnExptnDtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( cvrsnExptnDtNull,CVRSN_EXPTN_DT_NULL_LEN)
                  ,beginCvrsnExptnDtNull
                  ,CVRSN_EXPTN_DT_NULL_LEN
                 );
            localCvrsnExptnDtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkCvrsnExptnDtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCvrsnExptnDtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCvrsnExptnDtNull() {	 
			return (getShort(beginCvrsnExptnDtNull));
   	}
         int localCusipCntraNbrNullCounter = -1;
         public boolean isCusipCntraNbrNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCusipCntraNbrNullCounter != sharedCounter;
            localCusipCntraNbrNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int CUSIP_CNTRA_NBR_NULL_LEN = 2;
  	/**
	 * serializeCusipCntraNbrNull
	 */
	protected void serializeCusipCntraNbrNull(short cusipCntraNbrNull) {
           replaceValue( //  save the value as string
                   getBinaryString( cusipCntraNbrNull,CUSIP_CNTRA_NBR_NULL_LEN)
                  ,beginCusipCntraNbrNull
                  ,CUSIP_CNTRA_NBR_NULL_LEN
                 );
            localCusipCntraNbrNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkCusipCntraNbrNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCusipCntraNbrNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCusipCntraNbrNull() {	 
			return (getShort(beginCusipCntraNbrNull));
   	}
         int localAstBckdCdNullCounter = -1;
         public boolean isAstBckdCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAstBckdCdNullCounter != sharedCounter;
            localAstBckdCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int AST_BCKD_CD_NULL_LEN = 2;
  	/**
	 * serializeAstBckdCdNull
	 */
	protected void serializeAstBckdCdNull(short astBckdCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( astBckdCdNull,AST_BCKD_CD_NULL_LEN)
                  ,beginAstBckdCdNull
                  ,AST_BCKD_CD_NULL_LEN
                 );
            localAstBckdCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkAstBckdCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshAstBckdCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshAstBckdCdNull() {	 
			return (getShort(beginAstBckdCdNull));
   	}
         int localSymblTrdsAsCdNullCounter = -1;
         public boolean isSymblTrdsAsCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSymblTrdsAsCdNullCounter != sharedCounter;
            localSymblTrdsAsCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int SYMBL_TRDS_AS_CD_NULL_LEN = 2;
  	/**
	 * serializeSymblTrdsAsCdNull
	 */
	protected void serializeSymblTrdsAsCdNull(short symblTrdsAsCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( symblTrdsAsCdNull,SYMBL_TRDS_AS_CD_NULL_LEN)
                  ,beginSymblTrdsAsCdNull
                  ,SYMBL_TRDS_AS_CD_NULL_LEN
                 );
            localSymblTrdsAsCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSymblTrdsAsCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSymblTrdsAsCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSymblTrdsAsCdNull() {	 
			return (getShort(beginSymblTrdsAsCdNull));
   	}
         int localSymblTrdsWhiNullCounter = -1;
         public boolean isSymblTrdsWhiNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSymblTrdsWhiNullCounter != sharedCounter;
            localSymblTrdsWhiNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int SYMBL_TRDS_WHI_NULL_LEN = 2;
  	/**
	 * serializeSymblTrdsWhiNull
	 */
	protected void serializeSymblTrdsWhiNull(short symblTrdsWhiNull) {
           replaceValue( //  save the value as string
                   getBinaryString( symblTrdsWhiNull,SYMBL_TRDS_WHI_NULL_LEN)
                  ,beginSymblTrdsWhiNull
                  ,SYMBL_TRDS_WHI_NULL_LEN
                 );
            localSymblTrdsWhiNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSymblTrdsWhiNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSymblTrdsWhiNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSymblTrdsWhiNull() {	 
			return (getShort(beginSymblTrdsWhiNull));
   	}
         int localNaicsCdNullCounter = -1;
         public boolean isNaicsCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNaicsCdNullCounter != sharedCounter;
            localNaicsCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int NAICS_CD_NULL_LEN = 2;
  	/**
	 * serializeNaicsCdNull
	 */
	protected void serializeNaicsCdNull(short naicsCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( naicsCdNull,NAICS_CD_NULL_LEN)
                  ,beginNaicsCdNull
                  ,NAICS_CD_NULL_LEN
                 );
            localNaicsCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkNaicsCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshNaicsCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshNaicsCdNull() {	 
			return (getShort(beginNaicsCdNull));
   	}
         int localDlvrblFctrPctNullCounter = -1;
         public boolean isDlvrblFctrPctNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDlvrblFctrPctNullCounter != sharedCounter;
            localDlvrblFctrPctNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int DLVRBL_FCTR_PCT_NULL_LEN = 2;
  	/**
	 * serializeDlvrblFctrPctNull
	 */
	protected void serializeDlvrblFctrPctNull(short dlvrblFctrPctNull) {
           replaceValue( //  save the value as string
                   getBinaryString( dlvrblFctrPctNull,DLVRBL_FCTR_PCT_NULL_LEN)
                  ,beginDlvrblFctrPctNull
                  ,DLVRBL_FCTR_PCT_NULL_LEN
                 );
            localDlvrblFctrPctNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkDlvrblFctrPctNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshDlvrblFctrPctNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshDlvrblFctrPctNull() {	 
			return (getShort(beginDlvrblFctrPctNull));
   	}
         int localYieldBidNullCounter = -1;
         public boolean isYieldBidNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localYieldBidNullCounter != sharedCounter;
            localYieldBidNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int YIELD_BID_NULL_LEN = 2;
  	/**
	 * serializeYieldBidNull
	 */
	protected void serializeYieldBidNull(short yieldBidNull) {
           replaceValue( //  save the value as string
                   getBinaryString( yieldBidNull,YIELD_BID_NULL_LEN)
                  ,beginYieldBidNull
                  ,YIELD_BID_NULL_LEN
                 );
            localYieldBidNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkYieldBidNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshYieldBidNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshYieldBidNull() {	 
			return (getShort(beginYieldBidNull));
   	}
         int localMnmmDnmntAmtNullCounter = -1;
         public boolean isMnmmDnmntAmtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMnmmDnmntAmtNullCounter != sharedCounter;
            localMnmmDnmntAmtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int MNMM_DNMNT_AMT_NULL_LEN = 2;
  	/**
	 * serializeMnmmDnmntAmtNull
	 */
	protected void serializeMnmmDnmntAmtNull(short mnmmDnmntAmtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( mnmmDnmntAmtNull,MNMM_DNMNT_AMT_NULL_LEN)
                  ,beginMnmmDnmntAmtNull
                  ,MNMM_DNMNT_AMT_NULL_LEN
                 );
            localMnmmDnmntAmtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkMnmmDnmntAmtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshMnmmDnmntAmtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMnmmDnmntAmtNull() {	 
			return (getShort(beginMnmmDnmntAmtNull));
   	}
         int localClNoticeDaysNullCounter = -1;
         public boolean isClNoticeDaysNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localClNoticeDaysNullCounter != sharedCounter;
            localClNoticeDaysNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int CL_NOTICE_DAYS_NULL_LEN = 2;
  	/**
	 * serializeClNoticeDaysNull
	 */
	protected void serializeClNoticeDaysNull(short clNoticeDaysNull) {
           replaceValue( //  save the value as string
                   getBinaryString( clNoticeDaysNull,CL_NOTICE_DAYS_NULL_LEN)
                  ,beginClNoticeDaysNull
                  ,CL_NOTICE_DAYS_NULL_LEN
                 );
            localClNoticeDaysNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkClNoticeDaysNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshClNoticeDaysNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshClNoticeDaysNull() {	 
			return (getShort(beginClNoticeDaysNull));
   	}
         int localTaxWitholdRtNullCounter = -1;
         public boolean isTaxWitholdRtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaxWitholdRtNullCounter != sharedCounter;
            localTaxWitholdRtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int TAX_WITHOLD_RT_NULL_LEN = 2;
  	/**
	 * serializeTaxWitholdRtNull
	 */
	protected void serializeTaxWitholdRtNull(short taxWitholdRtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( taxWitholdRtNull,TAX_WITHOLD_RT_NULL_LEN)
                  ,beginTaxWitholdRtNull
                  ,TAX_WITHOLD_RT_NULL_LEN
                 );
            localTaxWitholdRtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaxWitholdRtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaxWitholdRtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaxWitholdRtNull() {	 
			return (getShort(beginTaxWitholdRtNull));
   	}
         int localTaxCreditRtNullCounter = -1;
         public boolean isTaxCreditRtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaxCreditRtNullCounter != sharedCounter;
            localTaxCreditRtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int TAX_CREDIT_RT_NULL_LEN = 2;
  	/**
	 * serializeTaxCreditRtNull
	 */
	protected void serializeTaxCreditRtNull(short taxCreditRtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( taxCreditRtNull,TAX_CREDIT_RT_NULL_LEN)
                  ,beginTaxCreditRtNull
                  ,TAX_CREDIT_RT_NULL_LEN
                 );
            localTaxCreditRtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaxCreditRtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaxCreditRtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaxCreditRtNull() {	 
			return (getShort(beginTaxCreditRtNull));
   	}
         int localCvrsnRtNullCounter = -1;
         public boolean isCvrsnRtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCvrsnRtNullCounter != sharedCounter;
            localCvrsnRtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int CVRSN_RT_NULL_LEN = 2;
  	/**
	 * serializeCvrsnRtNull
	 */
	protected void serializeCvrsnRtNull(short cvrsnRtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( cvrsnRtNull,CVRSN_RT_NULL_LEN)
                  ,beginCvrsnRtNull
                  ,CVRSN_RT_NULL_LEN
                 );
            localCvrsnRtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkCvrsnRtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCvrsnRtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCvrsnRtNull() {	 
			return (getShort(beginCvrsnRtNull));
   	}
         int localCvrsnPrcAmtNullCounter = -1;
         public boolean isCvrsnPrcAmtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCvrsnPrcAmtNullCounter != sharedCounter;
            localCvrsnPrcAmtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int CVRSN_PRC_AMT_NULL_LEN = 2;
  	/**
	 * serializeCvrsnPrcAmtNull
	 */
	protected void serializeCvrsnPrcAmtNull(short cvrsnPrcAmtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( cvrsnPrcAmtNull,CVRSN_PRC_AMT_NULL_LEN)
                  ,beginCvrsnPrcAmtNull
                  ,CVRSN_PRC_AMT_NULL_LEN
                 );
            localCvrsnPrcAmtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkCvrsnPrcAmtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCvrsnPrcAmtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCvrsnPrcAmtNull() {	 
			return (getShort(beginCvrsnPrcAmtNull));
   	}
         int localCvrsnExpDtNullCounter = -1;
         public boolean isCvrsnExpDtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCvrsnExpDtNullCounter != sharedCounter;
            localCvrsnExpDtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int CVRSN_EXP_DT_NULL_LEN = 2;
  	/**
	 * serializeCvrsnExpDtNull
	 */
	protected void serializeCvrsnExpDtNull(short cvrsnExpDtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( cvrsnExpDtNull,CVRSN_EXP_DT_NULL_LEN)
                  ,beginCvrsnExpDtNull
                  ,CVRSN_EXP_DT_NULL_LEN
                 );
            localCvrsnExpDtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkCvrsnExpDtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCvrsnExpDtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCvrsnExpDtNull() {	 
			return (getShort(beginCvrsnExpDtNull));
   	}
         int localScrtyAdpNullCounter = -1;
         public boolean isScrtyAdpNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localScrtyAdpNullCounter != sharedCounter;
            localScrtyAdpNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int SCRTY_ADP_NULL_LEN = 2;
  	/**
	 * serializeScrtyAdpNull
	 */
	protected void serializeScrtyAdpNull(short scrtyAdpNull) {
           replaceValue( //  save the value as string
                   getBinaryString( scrtyAdpNull,SCRTY_ADP_NULL_LEN)
                  ,beginScrtyAdpNull
                  ,SCRTY_ADP_NULL_LEN
                 );
            localScrtyAdpNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkScrtyAdpNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshScrtyAdpNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshScrtyAdpNull() {	 
			return (getShort(beginScrtyAdpNull));
   	}
         int localPutStrtDtNullCounter = -1;
         public boolean isPutStrtDtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPutStrtDtNullCounter != sharedCounter;
            localPutStrtDtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int PUT_STRT_DT_NULL_LEN = 2;
  	/**
	 * serializePutStrtDtNull
	 */
	protected void serializePutStrtDtNull(short putStrtDtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( putStrtDtNull,PUT_STRT_DT_NULL_LEN)
                  ,beginPutStrtDtNull
                  ,PUT_STRT_DT_NULL_LEN
                 );
            localPutStrtDtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkPutStrtDtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshPutStrtDtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshPutStrtDtNull() {	 
			return (getShort(beginPutStrtDtNull));
   	}
         int localPutEndDtNullCounter = -1;
         public boolean isPutEndDtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPutEndDtNullCounter != sharedCounter;
            localPutEndDtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int PUT_END_DT_NULL_LEN = 2;
  	/**
	 * serializePutEndDtNull
	 */
	protected void serializePutEndDtNull(short putEndDtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( putEndDtNull,PUT_END_DT_NULL_LEN)
                  ,beginPutEndDtNull
                  ,PUT_END_DT_NULL_LEN
                 );
            localPutEndDtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkPutEndDtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshPutEndDtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshPutEndDtNull() {	 
			return (getShort(beginPutEndDtNull));
   	}
         int localPutNtcMinNullCounter = -1;
         public boolean isPutNtcMinNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPutNtcMinNullCounter != sharedCounter;
            localPutNtcMinNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int PUT_NTC_MIN_NULL_LEN = 2;
  	/**
	 * serializePutNtcMinNull
	 */
	protected void serializePutNtcMinNull(short putNtcMinNull) {
           replaceValue( //  save the value as string
                   getBinaryString( putNtcMinNull,PUT_NTC_MIN_NULL_LEN)
                  ,beginPutNtcMinNull
                  ,PUT_NTC_MIN_NULL_LEN
                 );
            localPutNtcMinNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkPutNtcMinNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshPutNtcMinNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshPutNtcMinNull() {	 
			return (getShort(beginPutNtcMinNull));
   	}
         int localPutNtcMaxNullCounter = -1;
         public boolean isPutNtcMaxNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPutNtcMaxNullCounter != sharedCounter;
            localPutNtcMaxNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int PUT_NTC_MAX_NULL_LEN = 2;
  	/**
	 * serializePutNtcMaxNull
	 */
	protected void serializePutNtcMaxNull(short putNtcMaxNull) {
           replaceValue( //  save the value as string
                   getBinaryString( putNtcMaxNull,PUT_NTC_MAX_NULL_LEN)
                  ,beginPutNtcMaxNull
                  ,PUT_NTC_MAX_NULL_LEN
                 );
            localPutNtcMaxNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkPutNtcMaxNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshPutNtcMaxNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshPutNtcMaxNull() {	 
			return (getShort(beginPutNtcMaxNull));
   	}
         int localPutTmngCdNullCounter = -1;
         public boolean isPutTmngCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPutTmngCdNullCounter != sharedCounter;
            localPutTmngCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int PUT_TMNG_CD_NULL_LEN = 2;
  	/**
	 * serializePutTmngCdNull
	 */
	protected void serializePutTmngCdNull(short putTmngCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( putTmngCdNull,PUT_TMNG_CD_NULL_LEN)
                  ,beginPutTmngCdNull
                  ,PUT_TMNG_CD_NULL_LEN
                 );
            localPutTmngCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkPutTmngCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshPutTmngCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshPutTmngCdNull() {	 
			return (getShort(beginPutTmngCdNull));
   	}
         int localCallTmngCdNullCounter = -1;
         public boolean isCallTmngCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCallTmngCdNullCounter != sharedCounter;
            localCallTmngCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int CALL_TMNG_CD_NULL_LEN = 2;
  	/**
	 * serializeCallTmngCdNull
	 */
	protected void serializeCallTmngCdNull(short callTmngCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( callTmngCdNull,CALL_TMNG_CD_NULL_LEN)
                  ,beginCallTmngCdNull
                  ,CALL_TMNG_CD_NULL_LEN
                 );
            localCallTmngCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkCallTmngCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCallTmngCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCallTmngCdNull() {	 
			return (getShort(beginCallTmngCdNull));
   	}
         int localRegShoElgblDtNullCounter = -1;
         public boolean isRegShoElgblDtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRegShoElgblDtNullCounter != sharedCounter;
            localRegShoElgblDtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int REG_SHO_ELGBL_DT_NULL_LEN = 2;
  	/**
	 * serializeRegShoElgblDtNull
	 */
	protected void serializeRegShoElgblDtNull(short regShoElgblDtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( regShoElgblDtNull,REG_SHO_ELGBL_DT_NULL_LEN)
                  ,beginRegShoElgblDtNull
                  ,REG_SHO_ELGBL_DT_NULL_LEN
                 );
            localRegShoElgblDtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkRegShoElgblDtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshRegShoElgblDtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshRegShoElgblDtNull() {	 
			return (getShort(beginRegShoElgblDtNull));
   	}
         int localSttlmDtNullCounter = -1;
         public boolean isSttlmDtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSttlmDtNullCounter != sharedCounter;
            localSttlmDtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int STTLM_DT_NULL_LEN = 2;
  	/**
	 * serializeSttlmDtNull
	 */
	protected void serializeSttlmDtNull(short sttlmDtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( sttlmDtNull,STTLM_DT_NULL_LEN)
                  ,beginSttlmDtNull
                  ,STTLM_DT_NULL_LEN
                 );
            localSttlmDtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSttlmDtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSttlmDtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSttlmDtNull() {	 
			return (getShort(beginSttlmDtNull));
   	}
         int localOptionMaturityDtNullCounter = -1;
         public boolean isOptionMaturityDtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localOptionMaturityDtNullCounter != sharedCounter;
            localOptionMaturityDtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int OPTION_MATURITY_DT_NULL_LEN = 2;
  	/**
	 * serializeOptionMaturityDtNull
	 */
	protected void serializeOptionMaturityDtNull(short optionMaturityDtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( optionMaturityDtNull,OPTION_MATURITY_DT_NULL_LEN)
                  ,beginOptionMaturityDtNull
                  ,OPTION_MATURITY_DT_NULL_LEN
                 );
            localOptionMaturityDtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkOptionMaturityDtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshOptionMaturityDtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshOptionMaturityDtNull() {	 
			return (getShort(beginOptionMaturityDtNull));
   	}
         int localRegShoInelgblNullCounter = -1;
         public boolean isRegShoInelgblNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRegShoInelgblNullCounter != sharedCounter;
            localRegShoInelgblNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int REG_SHO_INELGBL_NULL_LEN = 2;
  	/**
	 * serializeRegShoInelgblNull
	 */
	protected void serializeRegShoInelgblNull(short regShoInelgblNull) {
           replaceValue( //  save the value as string
                   getBinaryString( regShoInelgblNull,REG_SHO_INELGBL_NULL_LEN)
                  ,beginRegShoInelgblNull
                  ,REG_SHO_INELGBL_NULL_LEN
                 );
            localRegShoInelgblNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkRegShoInelgblNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshRegShoInelgblNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshRegShoInelgblNull() {	 
			return (getShort(beginRegShoInelgblNull));
   	}
         int localPutFreqCdNullCounter = -1;
         public boolean isPutFreqCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPutFreqCdNullCounter != sharedCounter;
            localPutFreqCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int PUT_FREQ_CD_NULL_LEN = 2;
  	/**
	 * serializePutFreqCdNull
	 */
	protected void serializePutFreqCdNull(short putFreqCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( putFreqCdNull,PUT_FREQ_CD_NULL_LEN)
                  ,beginPutFreqCdNull
                  ,PUT_FREQ_CD_NULL_LEN
                 );
            localPutFreqCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkPutFreqCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshPutFreqCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshPutFreqCdNull() {	 
			return (getShort(beginPutFreqCdNull));
   	}
         int localFrstVrblRstDtNullCounter = -1;
         public boolean isFrstVrblRstDtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFrstVrblRstDtNullCounter != sharedCounter;
            localFrstVrblRstDtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int FRST_VRBL_RST_DT_NULL_LEN = 2;
  	/**
	 * serializeFrstVrblRstDtNull
	 */
	protected void serializeFrstVrblRstDtNull(short frstVrblRstDtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( frstVrblRstDtNull,FRST_VRBL_RST_DT_NULL_LEN)
                  ,beginFrstVrblRstDtNull
                  ,FRST_VRBL_RST_DT_NULL_LEN
                 );
            localFrstVrblRstDtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkFrstVrblRstDtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshFrstVrblRstDtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshFrstVrblRstDtNull() {	 
			return (getShort(beginFrstVrblRstDtNull));
   	}
         int localRstFreqCdNullCounter = -1;
         public boolean isRstFreqCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRstFreqCdNullCounter != sharedCounter;
            localRstFreqCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int RST_FREQ_CD_NULL_LEN = 2;
  	/**
	 * serializeRstFreqCdNull
	 */
	protected void serializeRstFreqCdNull(short rstFreqCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( rstFreqCdNull,RST_FREQ_CD_NULL_LEN)
                  ,beginRstFreqCdNull
                  ,RST_FREQ_CD_NULL_LEN
                 );
            localRstFreqCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkRstFreqCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshRstFreqCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshRstFreqCdNull() {	 
			return (getShort(beginRstFreqCdNull));
   	}
         int localCall2TmngCdNullCounter = -1;
         public boolean isCall2TmngCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCall2TmngCdNullCounter != sharedCounter;
            localCall2TmngCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int CALL_2_TMNG_CD_NULL_LEN = 2;
  	/**
	 * serializeCall2TmngCdNull
	 */
	protected void serializeCall2TmngCdNull(short call2TmngCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( call2TmngCdNull,CALL_2_TMNG_CD_NULL_LEN)
                  ,beginCall2TmngCdNull
                  ,CALL_2_TMNG_CD_NULL_LEN
                 );
            localCall2TmngCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkCall2TmngCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCall2TmngCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCall2TmngCdNull() {	 
			return (getShort(beginCall2TmngCdNull));
   	}
         int localUndlSymblTrdsNullCounter = -1;
         public boolean isUndlSymblTrdsNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUndlSymblTrdsNullCounter != sharedCounter;
            localUndlSymblTrdsNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int UNDL_SYMBL_TRDS_NULL_LEN = 2;
  	/**
	 * serializeUndlSymblTrdsNull
	 */
	protected void serializeUndlSymblTrdsNull(short undlSymblTrdsNull) {
           replaceValue( //  save the value as string
                   getBinaryString( undlSymblTrdsNull,UNDL_SYMBL_TRDS_NULL_LEN)
                  ,beginUndlSymblTrdsNull
                  ,UNDL_SYMBL_TRDS_NULL_LEN
                 );
            localUndlSymblTrdsNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkUndlSymblTrdsNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshUndlSymblTrdsNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshUndlSymblTrdsNull() {	 
			return (getShort(beginUndlSymblTrdsNull));
   	}
         int localUndPrimeExchNullCounter = -1;
         public boolean isUndPrimeExchNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUndPrimeExchNullCounter != sharedCounter;
            localUndPrimeExchNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int UND_PRIME_EXCH_NULL_LEN = 2;
  	/**
	 * serializeUndPrimeExchNull
	 */
	protected void serializeUndPrimeExchNull(short undPrimeExchNull) {
           replaceValue( //  save the value as string
                   getBinaryString( undPrimeExchNull,UND_PRIME_EXCH_NULL_LEN)
                  ,beginUndPrimeExchNull
                  ,UND_PRIME_EXCH_NULL_LEN
                 );
            localUndPrimeExchNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkUndPrimeExchNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshUndPrimeExchNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshUndPrimeExchNull() {	 
			return (getShort(beginUndPrimeExchNull));
   	}
         int localUndPrimeSymbolNullCounter = -1;
         public boolean isUndPrimeSymbolNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUndPrimeSymbolNullCounter != sharedCounter;
            localUndPrimeSymbolNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int UND_PRIME_SYMBOL_NULL_LEN = 2;
  	/**
	 * serializeUndPrimeSymbolNull
	 */
	protected void serializeUndPrimeSymbolNull(short undPrimeSymbolNull) {
           replaceValue( //  save the value as string
                   getBinaryString( undPrimeSymbolNull,UND_PRIME_SYMBOL_NULL_LEN)
                  ,beginUndPrimeSymbolNull
                  ,UND_PRIME_SYMBOL_NULL_LEN
                 );
            localUndPrimeSymbolNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkUndPrimeSymbolNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshUndPrimeSymbolNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshUndPrimeSymbolNull() {	 
			return (getShort(beginUndPrimeSymbolNull));
   	}
         int localUndCanadaExchNullCounter = -1;
         public boolean isUndCanadaExchNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUndCanadaExchNullCounter != sharedCounter;
            localUndCanadaExchNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int UND_CANADA_EXCH_NULL_LEN = 2;
  	/**
	 * serializeUndCanadaExchNull
	 */
	protected void serializeUndCanadaExchNull(short undCanadaExchNull) {
           replaceValue( //  save the value as string
                   getBinaryString( undCanadaExchNull,UND_CANADA_EXCH_NULL_LEN)
                  ,beginUndCanadaExchNull
                  ,UND_CANADA_EXCH_NULL_LEN
                 );
            localUndCanadaExchNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkUndCanadaExchNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshUndCanadaExchNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshUndCanadaExchNull() {	 
			return (getShort(beginUndCanadaExchNull));
   	}
         int localUndCanadaSymbolNullCounter = -1;
         public boolean isUndCanadaSymbolNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUndCanadaSymbolNullCounter != sharedCounter;
            localUndCanadaSymbolNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int UND_CANADA_SYMBOL_NULL_LEN = 2;
  	/**
	 * serializeUndCanadaSymbolNull
	 */
	protected void serializeUndCanadaSymbolNull(short undCanadaSymbolNull) {
           replaceValue( //  save the value as string
                   getBinaryString( undCanadaSymbolNull,UND_CANADA_SYMBOL_NULL_LEN)
                  ,beginUndCanadaSymbolNull
                  ,UND_CANADA_SYMBOL_NULL_LEN
                 );
            localUndCanadaSymbolNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkUndCanadaSymbolNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshUndCanadaSymbolNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshUndCanadaSymbolNull() {	 
			return (getShort(beginUndCanadaSymbolNull));
   	}
         int localUndlCusipNullCounter = -1;
         public boolean isUndlCusipNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUndlCusipNullCounter != sharedCounter;
            localUndlCusipNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int UNDL_CUSIP_NULL_LEN = 2;
  	/**
	 * serializeUndlCusipNull
	 */
	protected void serializeUndlCusipNull(short undlCusipNull) {
           replaceValue( //  save the value as string
                   getBinaryString( undlCusipNull,UNDL_CUSIP_NULL_LEN)
                  ,beginUndlCusipNull
                  ,UNDL_CUSIP_NULL_LEN
                 );
            localUndlCusipNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkUndlCusipNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshUndlCusipNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshUndlCusipNull() {	 
			return (getShort(beginUndlCusipNull));
   	}
         int localUndlIsinNullCounter = -1;
         public boolean isUndlIsinNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUndlIsinNullCounter != sharedCounter;
            localUndlIsinNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int UNDL_ISIN_NULL_LEN = 2;
  	/**
	 * serializeUndlIsinNull
	 */
	protected void serializeUndlIsinNull(short undlIsinNull) {
           replaceValue( //  save the value as string
                   getBinaryString( undlIsinNull,UNDL_ISIN_NULL_LEN)
                  ,beginUndlIsinNull
                  ,UNDL_ISIN_NULL_LEN
                 );
            localUndlIsinNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkUndlIsinNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshUndlIsinNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshUndlIsinNull() {	 
			return (getShort(beginUndlIsinNull));
   	}
         int localUndlSedolNullCounter = -1;
         public boolean isUndlSedolNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUndlSedolNullCounter != sharedCounter;
            localUndlSedolNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int UNDL_SEDOL_NULL_LEN = 2;
  	/**
	 * serializeUndlSedolNull
	 */
	protected void serializeUndlSedolNull(short undlSedolNull) {
           replaceValue( //  save the value as string
                   getBinaryString( undlSedolNull,UNDL_SEDOL_NULL_LEN)
                  ,beginUndlSedolNull
                  ,UNDL_SEDOL_NULL_LEN
                 );
            localUndlSedolNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkUndlSedolNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshUndlSedolNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshUndlSedolNull() {	 
			return (getShort(beginUndlSedolNull));
   	}
         int localUndlCommonCdNullCounter = -1;
         public boolean isUndlCommonCdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUndlCommonCdNullCounter != sharedCounter;
            localUndlCommonCdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int UNDL_COMMON_CD_NULL_LEN = 2;
  	/**
	 * serializeUndlCommonCdNull
	 */
	protected void serializeUndlCommonCdNull(short undlCommonCdNull) {
           replaceValue( //  save the value as string
                   getBinaryString( undlCommonCdNull,UNDL_COMMON_CD_NULL_LEN)
                  ,beginUndlCommonCdNull
                  ,UNDL_COMMON_CD_NULL_LEN
                 );
            localUndlCommonCdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkUndlCommonCdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshUndlCommonCdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshUndlCommonCdNull() {	 
			return (getShort(beginUndlCommonCdNull));
   	}
         int localUndlCinsNullCounter = -1;
         public boolean isUndlCinsNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUndlCinsNullCounter != sharedCounter;
            localUndlCinsNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int UNDL_CINS_NULL_LEN = 2;
  	/**
	 * serializeUndlCinsNull
	 */
	protected void serializeUndlCinsNull(short undlCinsNull) {
           replaceValue( //  save the value as string
                   getBinaryString( undlCinsNull,UNDL_CINS_NULL_LEN)
                  ,beginUndlCinsNull
                  ,UNDL_CINS_NULL_LEN
                 );
            localUndlCinsNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkUndlCinsNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshUndlCinsNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshUndlCinsNull() {	 
			return (getShort(beginUndlCinsNull));
   	}
         int localMtrlMdfdDtNullCounter = -1;
         public boolean isMtrlMdfdDtNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMtrlMdfdDtNullCounter != sharedCounter;
            localMtrlMdfdDtNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int MTRL_MDFD_DT_NULL_LEN = 2;
  	/**
	 * serializeMtrlMdfdDtNull
	 */
	protected void serializeMtrlMdfdDtNull(short mtrlMdfdDtNull) {
           replaceValue( //  save the value as string
                   getBinaryString( mtrlMdfdDtNull,MTRL_MDFD_DT_NULL_LEN)
                  ,beginMtrlMdfdDtNull
                  ,MTRL_MDFD_DT_NULL_LEN
                 );
            localMtrlMdfdDtNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkMtrlMdfdDtNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshMtrlMdfdDtNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMtrlMdfdDtNull() {	 
			return (getShort(beginMtrlMdfdDtNull));
   	}




}
  

package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class TarafxaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class TarafxaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TarafxaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TARAFXA_LENGTH = 1163;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTarafxaMcMnfrmFileNam;
            protected  int beginTarafxaCyclNum;
            protected  int beginTarafxaBusPrtnrId;
            protected  int beginTarafxaEndptId;
            protected  int beginTarafxaXferMthdCd;
            protected  int beginTarafxaAvailTs;
            protected  int beginTarafxaBulkId;
            protected  int beginTarafxaStatCd;
            protected  int beginTarafxaSndRcvPrmsnCd;
            protected  int beginTarafxaMcibdioParmTxt;
            protected  int beginTarafxaPrtyNum;
            protected  int beginTarafxaArchLocTxt;
            protected  int beginTarafxaSvrFileStatCd;
            protected  int beginTarafxaLstStatTs;
            protected  int beginTarafxaXferFileSzNum;
            protected  int beginTarafxaTmsXferdCnt;
            protected  int beginTarafxaXferRecCnt;
            protected  int beginTarafxaXferRqstTs;
            protected  int beginTarafxaXferStrtTs;
            protected  int beginTarafxaXferStopTs;
            protected  int beginTarafxaXferRdyTs;
            protected  int beginTarafxaXferCondCd;
            protected  int beginTarafxaXferStatTxt;
            protected  int beginTarafxaXferPrcssId;
            protected  int beginTarafxaOrgXferPrcsId;
            protected  int beginTarafxaTrgrCondCd;
            protected  int beginTarafxaTrgrStatTxt;
            protected  int beginTarafxaOrgLocNam;
            protected  int beginTarafxaLstUpdtUserId;
            protected  int beginTarafxaLstUpdtTs;
            protected  int beginTarafxaTrgrActNam;
            protected  int beginTarafxaPrvMnfrmFileNam;
            protected  int beginTarafxaPrvCyclNum;
            protected  int beginTarafxaPrvBusPrtnrId;
            protected  int beginTarafxaPrvEndptId;
            protected  int beginTarafxaPrvAvailTs;
            protected  int beginTarafxaNxtMnfrmFileNam;
            protected  int beginTarafxaNxtCyclNum;
            protected  int beginTarafxaNxtBusPrtnrId;
            protected  int beginTarafxaNxtEndptId;
            protected  int beginTarafxaNxtAvailTs;
            protected  int beginTarafxaApplExitJobNam;
            protected  int beginTarafxaApplExitTs;
            protected  int beginTarafxaCsMipId;
            protected  int beginTarafxaRmMipId;
            protected  int beginTarafxaApplExitNam;
            protected  int beginTarafxaTapeCmpltdSw;
            protected  int beginTarafxaTapeMultVolSw;
            protected  int beginTarafxaApplPrcssngDt;
            protected  int beginTarafxaTransitionalDsn;
            protected  int beginTarafxaSourceHubId;
            protected  int beginTarafxaOwningHubId;
            protected  int beginTarafxaStatRefId;
            protected  int beginTarafxaSrcLocEntNam;
            protected  int beginTarafxaSrcTaskNam;
            protected  int beginTarafxaSrcTaskId;
            protected  int beginTarafxaSrcTaskStrtTs;
            protected  int beginTarafxaSrcTaskStopTs;
            protected  int beginTarafxaTrgtLocEntNam;
            protected  int beginTarafxaTrgtTaskNam;
            protected  int beginTarafxaTrgtTaskId;
            protected  int beginTarafxaTrgtTaskStrtTs;
            protected  int beginTarafxaTrgtTaskStopTs;
	
	/**
	* Constructor for TarafxaSerialized
	**/
    public TarafxaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TarafxaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TARAFXA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTarafxaMcMnfrmFileNam = getStartOffset() + 0;	// set offset for serialization
  
             beginTarafxaCyclNum = getStartOffset() + 44;	// set offset for serialization
  
             beginTarafxaBusPrtnrId = getStartOffset() + 46;	// set offset for serialization
  
             beginTarafxaEndptId = getStartOffset() + 52;	// set offset for serialization
  
             beginTarafxaXferMthdCd = getStartOffset() + 59;	// set offset for serialization
  
             beginTarafxaAvailTs = getStartOffset() + 60;	// set offset for serialization
  
             beginTarafxaBulkId = getStartOffset() + 86;	// set offset for serialization
  
             beginTarafxaStatCd = getStartOffset() + 90;	// set offset for serialization
  
             beginTarafxaSndRcvPrmsnCd = getStartOffset() + 91;	// set offset for serialization
  
             beginTarafxaMcibdioParmTxt = getStartOffset() + 92;	// set offset for serialization
  
             beginTarafxaPrtyNum = getStartOffset() + 142;	// set offset for serialization
  
             beginTarafxaArchLocTxt = getStartOffset() + 144;	// set offset for serialization
  
             beginTarafxaSvrFileStatCd = getStartOffset() + 188;	// set offset for serialization
  
             beginTarafxaLstStatTs = getStartOffset() + 189;	// set offset for serialization
  
             beginTarafxaXferFileSzNum = getStartOffset() + 215;	// set offset for serialization
  
             beginTarafxaTmsXferdCnt = getStartOffset() + 222;	// set offset for serialization
  
             beginTarafxaXferRecCnt = getStartOffset() + 225;	// set offset for serialization
  
             beginTarafxaXferRqstTs = getStartOffset() + 232;	// set offset for serialization
  
             beginTarafxaXferStrtTs = getStartOffset() + 258;	// set offset for serialization
  
             beginTarafxaXferStopTs = getStartOffset() + 284;	// set offset for serialization
  
             beginTarafxaXferRdyTs = getStartOffset() + 310;	// set offset for serialization
  
             beginTarafxaXferCondCd = getStartOffset() + 336;	// set offset for serialization
  
             beginTarafxaXferStatTxt = getStartOffset() + 345;	// set offset for serialization
  
             beginTarafxaXferPrcssId = getStartOffset() + 354;	// set offset for serialization
  
             beginTarafxaOrgXferPrcsId = getStartOffset() + 361;	// set offset for serialization
  
             beginTarafxaTrgrCondCd = getStartOffset() + 368;	// set offset for serialization
  
             beginTarafxaTrgrStatTxt = getStartOffset() + 369;	// set offset for serialization
  
             beginTarafxaOrgLocNam = getStartOffset() + 378;	// set offset for serialization
  
             beginTarafxaLstUpdtUserId = getStartOffset() + 394;	// set offset for serialization
  
             beginTarafxaLstUpdtTs = getStartOffset() + 403;	// set offset for serialization
  
             beginTarafxaTrgrActNam = getStartOffset() + 429;	// set offset for serialization
  
             beginTarafxaPrvMnfrmFileNam = getStartOffset() + 437;	// set offset for serialization
  
             beginTarafxaPrvCyclNum = getStartOffset() + 481;	// set offset for serialization
  
             beginTarafxaPrvBusPrtnrId = getStartOffset() + 483;	// set offset for serialization
  
             beginTarafxaPrvEndptId = getStartOffset() + 489;	// set offset for serialization
  
             beginTarafxaPrvAvailTs = getStartOffset() + 496;	// set offset for serialization
  
             beginTarafxaNxtMnfrmFileNam = getStartOffset() + 522;	// set offset for serialization
  
             beginTarafxaNxtCyclNum = getStartOffset() + 566;	// set offset for serialization
  
             beginTarafxaNxtBusPrtnrId = getStartOffset() + 568;	// set offset for serialization
  
             beginTarafxaNxtEndptId = getStartOffset() + 574;	// set offset for serialization
  
             beginTarafxaNxtAvailTs = getStartOffset() + 581;	// set offset for serialization
  
             beginTarafxaApplExitJobNam = getStartOffset() + 607;	// set offset for serialization
  
             beginTarafxaApplExitTs = getStartOffset() + 615;	// set offset for serialization
  
             beginTarafxaCsMipId = getStartOffset() + 641;	// set offset for serialization
  
             beginTarafxaRmMipId = getStartOffset() + 644;	// set offset for serialization
  
             beginTarafxaApplExitNam = getStartOffset() + 647;	// set offset for serialization
  
             beginTarafxaTapeCmpltdSw = getStartOffset() + 655;	// set offset for serialization
  
             beginTarafxaTapeMultVolSw = getStartOffset() + 656;	// set offset for serialization
  
             beginTarafxaApplPrcssngDt = getStartOffset() + 657;	// set offset for serialization
  
             beginTarafxaTransitionalDsn = getStartOffset() + 667;	// set offset for serialization
  
             beginTarafxaSourceHubId = getStartOffset() + 711;	// set offset for serialization
  
             beginTarafxaOwningHubId = getStartOffset() + 719;	// set offset for serialization
  
             beginTarafxaStatRefId = getStartOffset() + 727;	// set offset for serialization
  
             beginTarafxaSrcLocEntNam = getStartOffset() + 731;	// set offset for serialization
  
             beginTarafxaSrcTaskNam = getStartOffset() + 741;	// set offset for serialization
  
             beginTarafxaSrcTaskId = getStartOffset() + 751;	// set offset for serialization
  
  
             beginTarafxaSrcTaskStrtTs = getStartOffset() + 830;	// set offset for serialization
  
             beginTarafxaSrcTaskStopTs = getStartOffset() + 856;	// set offset for serialization
  
             beginTarafxaTrgtLocEntNam = getStartOffset() + 882;	// set offset for serialization
  
             beginTarafxaTrgtTaskNam = getStartOffset() + 892;	// set offset for serialization
  
             beginTarafxaTrgtTaskId = getStartOffset() + 902;	// set offset for serialization
  
  
             beginTarafxaTrgtTaskStrtTs = getStartOffset() + 981;	// set offset for serialization
  
             beginTarafxaTrgtTaskStopTs = getStartOffset() + 1007;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localTarafxaMcMnfrmFileNamCounter = -1;
     public boolean isTarafxaMcMnfrmFileNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaMcMnfrmFileNamCounter != sharedCounter;
         localTarafxaMcMnfrmFileNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_MC_MNFRM_FILE_NAM_LEN = 44;
	/**
	 * 	serialize this TarafxaMcMnfrmFileNam
	 */
   protected void serializeTarafxaMcMnfrmFileNam(char[] tarafxaMcMnfrmFileNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaMcMnfrmFileNam,0,getStringValue(),beginTarafxaMcMnfrmFileNam,TARAFXA_MC_MNFRM_FILE_NAM_LEN);
       localTarafxaMcMnfrmFileNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaMcMnfrmFileNamConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshTarafxaMcMnfrmFileNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaMcMnfrmFileNam() {	 
   		return (substring(getStringValue(),beginTarafxaMcMnfrmFileNam,beginTarafxaMcMnfrmFileNam + TARAFXA_MC_MNFRM_FILE_NAM_LEN));
   	}
        int localTarafxaCyclNumCounter = -1;
        public boolean isTarafxaCyclNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTarafxaCyclNumCounter != sharedCounter;
           localTarafxaCyclNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean tarafxaCyclNumIsNumeric() {
	      return decimalIsNumeric(beginTarafxaCyclNum,TARAFXA_CYCL_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAFXA_CYCL_NUM_LEN = 2;
  	/**
	 * 	serializeTarafxaCyclNum
	 */
	protected void serializeTarafxaCyclNum(short tarafxaCyclNum) {
		   putDecimal(beginTarafxaCyclNum,tarafxaCyclNum,TARAFXA_CYCL_NUM_LEN,true);
   }
   

   protected short checkTarafxaCyclNumMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshTarafxaCyclNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaCyclNum() throws CFException {	
   	try { 
		 return (getShortDecimal(beginTarafxaCyclNum,TARAFXA_CYCL_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tarafxaCyclNum", beginTarafxaCyclNum,TARAFXA_CYCL_NUM_LEN);
     }
   	}
     int localTarafxaBusPrtnrIdCounter = -1;
     public boolean isTarafxaBusPrtnrIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaBusPrtnrIdCounter != sharedCounter;
         localTarafxaBusPrtnrIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_BUS_PRTNR_ID_LEN = 6;
	/**
	 * 	serialize this TarafxaBusPrtnrId
	 */
   protected void serializeTarafxaBusPrtnrId(char[] tarafxaBusPrtnrId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaBusPrtnrId,0,getStringValue(),beginTarafxaBusPrtnrId,TARAFXA_BUS_PRTNR_ID_LEN);
       localTarafxaBusPrtnrIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaBusPrtnrIdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTarafxaBusPrtnrId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaBusPrtnrId() {	 
   		return (substring(getStringValue(),beginTarafxaBusPrtnrId,beginTarafxaBusPrtnrId + TARAFXA_BUS_PRTNR_ID_LEN));
   	}
     int localTarafxaEndptIdCounter = -1;
     public boolean isTarafxaEndptIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaEndptIdCounter != sharedCounter;
         localTarafxaEndptIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_ENDPT_ID_LEN = 7;
	/**
	 * 	serialize this TarafxaEndptId
	 */
   protected void serializeTarafxaEndptId(char[] tarafxaEndptId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaEndptId,0,getStringValue(),beginTarafxaEndptId,TARAFXA_ENDPT_ID_LEN);
       localTarafxaEndptIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaEndptIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTarafxaEndptId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaEndptId() {	 
   		return (substring(getStringValue(),beginTarafxaEndptId,beginTarafxaEndptId + TARAFXA_ENDPT_ID_LEN));
   	}
     int localTarafxaXferMthdCdCounter = -1;
     public boolean isTarafxaXferMthdCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaXferMthdCdCounter != sharedCounter;
         localTarafxaXferMthdCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_XFER_MTHD_CD_LEN = 1;
	/**
	 * 	serialize this TarafxaXferMthdCd
	 */
   protected void serializeTarafxaXferMthdCd(char[] tarafxaXferMthdCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaXferMthdCd,0,getStringValue(),beginTarafxaXferMthdCd,TARAFXA_XFER_MTHD_CD_LEN);
       localTarafxaXferMthdCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaXferMthdCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTarafxaXferMthdCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaXferMthdCd() {	 
   		return (substring(getStringValue(),beginTarafxaXferMthdCd,beginTarafxaXferMthdCd + TARAFXA_XFER_MTHD_CD_LEN));
   	}
     int localTarafxaAvailTsCounter = -1;
     public boolean isTarafxaAvailTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaAvailTsCounter != sharedCounter;
         localTarafxaAvailTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_AVAIL_TS_LEN = 26;
	/**
	 * 	serialize this TarafxaAvailTs
	 */
   protected void serializeTarafxaAvailTs(char[] tarafxaAvailTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaAvailTs,0,getStringValue(),beginTarafxaAvailTs,TARAFXA_AVAIL_TS_LEN);
       localTarafxaAvailTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaAvailTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxaAvailTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaAvailTs() {	 
   		return (substring(getStringValue(),beginTarafxaAvailTs,beginTarafxaAvailTs + TARAFXA_AVAIL_TS_LEN));
   	}
     int localTarafxaBulkIdCounter = -1;
     public boolean isTarafxaBulkIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaBulkIdCounter != sharedCounter;
         localTarafxaBulkIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_BULK_ID_LEN = 4;
	/**
	 * 	serialize this TarafxaBulkId
	 */
   protected void serializeTarafxaBulkId(char[] tarafxaBulkId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaBulkId,0,getStringValue(),beginTarafxaBulkId,TARAFXA_BULK_ID_LEN);
       localTarafxaBulkIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaBulkIdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshTarafxaBulkId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaBulkId() {	 
   		return (substring(getStringValue(),beginTarafxaBulkId,beginTarafxaBulkId + TARAFXA_BULK_ID_LEN));
   	}
     int localTarafxaStatCdCounter = -1;
     public boolean isTarafxaStatCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaStatCdCounter != sharedCounter;
         localTarafxaStatCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_STAT_CD_LEN = 1;
	/**
	 * 	serialize this TarafxaStatCd
	 */
   protected void serializeTarafxaStatCd(char[] tarafxaStatCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaStatCd,0,getStringValue(),beginTarafxaStatCd,TARAFXA_STAT_CD_LEN);
       localTarafxaStatCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaStatCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTarafxaStatCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaStatCd() {	 
   		return (substring(getStringValue(),beginTarafxaStatCd,beginTarafxaStatCd + TARAFXA_STAT_CD_LEN));
   	}
     int localTarafxaSndRcvPrmsnCdCounter = -1;
     public boolean isTarafxaSndRcvPrmsnCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaSndRcvPrmsnCdCounter != sharedCounter;
         localTarafxaSndRcvPrmsnCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_SND_RCV_PRMSN_CD_LEN = 1;
	/**
	 * 	serialize this TarafxaSndRcvPrmsnCd
	 */
   protected void serializeTarafxaSndRcvPrmsnCd(char[] tarafxaSndRcvPrmsnCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaSndRcvPrmsnCd,0,getStringValue(),beginTarafxaSndRcvPrmsnCd,TARAFXA_SND_RCV_PRMSN_CD_LEN);
       localTarafxaSndRcvPrmsnCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaSndRcvPrmsnCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTarafxaSndRcvPrmsnCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaSndRcvPrmsnCd() {	 
   		return (substring(getStringValue(),beginTarafxaSndRcvPrmsnCd,beginTarafxaSndRcvPrmsnCd + TARAFXA_SND_RCV_PRMSN_CD_LEN));
   	}
     int localTarafxaMcibdioParmTxtCounter = -1;
     public boolean isTarafxaMcibdioParmTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaMcibdioParmTxtCounter != sharedCounter;
         localTarafxaMcibdioParmTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_MCIBDIO_PARM_TXT_LEN = 50;
	/**
	 * 	serialize this TarafxaMcibdioParmTxt
	 */
   protected void serializeTarafxaMcibdioParmTxt(char[] tarafxaMcibdioParmTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaMcibdioParmTxt,0,getStringValue(),beginTarafxaMcibdioParmTxt,TARAFXA_MCIBDIO_PARM_TXT_LEN);
       localTarafxaMcibdioParmTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaMcibdioParmTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
    /**
	 *	refreshTarafxaMcibdioParmTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaMcibdioParmTxt() {	 
   		return (substring(getStringValue(),beginTarafxaMcibdioParmTxt,beginTarafxaMcibdioParmTxt + TARAFXA_MCIBDIO_PARM_TXT_LEN));
   	}
        int localTarafxaPrtyNumCounter = -1;
        public boolean isTarafxaPrtyNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTarafxaPrtyNumCounter != sharedCounter;
           localTarafxaPrtyNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean tarafxaPrtyNumIsNumeric() {
	      return decimalIsNumeric(beginTarafxaPrtyNum,TARAFXA_PRTY_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAFXA_PRTY_NUM_LEN = 2;
  	/**
	 * 	serializeTarafxaPrtyNum
	 */
	protected void serializeTarafxaPrtyNum(short tarafxaPrtyNum) {
		   putDecimal(beginTarafxaPrtyNum,tarafxaPrtyNum,TARAFXA_PRTY_NUM_LEN,true);
   }
   

   protected short checkTarafxaPrtyNumMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshTarafxaPrtyNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaPrtyNum() throws CFException {	
   	try { 
		 return (getShortDecimal(beginTarafxaPrtyNum,TARAFXA_PRTY_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tarafxaPrtyNum", beginTarafxaPrtyNum,TARAFXA_PRTY_NUM_LEN);
     }
   	}
     int localTarafxaArchLocTxtCounter = -1;
     public boolean isTarafxaArchLocTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaArchLocTxtCounter != sharedCounter;
         localTarafxaArchLocTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_ARCH_LOC_TXT_LEN = 44;
	/**
	 * 	serialize this TarafxaArchLocTxt
	 */
   protected void serializeTarafxaArchLocTxt(char[] tarafxaArchLocTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaArchLocTxt,0,getStringValue(),beginTarafxaArchLocTxt,TARAFXA_ARCH_LOC_TXT_LEN);
       localTarafxaArchLocTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaArchLocTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshTarafxaArchLocTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaArchLocTxt() {	 
   		return (substring(getStringValue(),beginTarafxaArchLocTxt,beginTarafxaArchLocTxt + TARAFXA_ARCH_LOC_TXT_LEN));
   	}
     int localTarafxaSvrFileStatCdCounter = -1;
     public boolean isTarafxaSvrFileStatCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaSvrFileStatCdCounter != sharedCounter;
         localTarafxaSvrFileStatCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_SVR_FILE_STAT_CD_LEN = 1;
	/**
	 * 	serialize this TarafxaSvrFileStatCd
	 */
   protected void serializeTarafxaSvrFileStatCd(char[] tarafxaSvrFileStatCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaSvrFileStatCd,0,getStringValue(),beginTarafxaSvrFileStatCd,TARAFXA_SVR_FILE_STAT_CD_LEN);
       localTarafxaSvrFileStatCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaSvrFileStatCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTarafxaSvrFileStatCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaSvrFileStatCd() {	 
   		return (substring(getStringValue(),beginTarafxaSvrFileStatCd,beginTarafxaSvrFileStatCd + TARAFXA_SVR_FILE_STAT_CD_LEN));
   	}
     int localTarafxaLstStatTsCounter = -1;
     public boolean isTarafxaLstStatTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaLstStatTsCounter != sharedCounter;
         localTarafxaLstStatTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_LST_STAT_TS_LEN = 26;
	/**
	 * 	serialize this TarafxaLstStatTs
	 */
   protected void serializeTarafxaLstStatTs(char[] tarafxaLstStatTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaLstStatTs,0,getStringValue(),beginTarafxaLstStatTs,TARAFXA_LST_STAT_TS_LEN);
       localTarafxaLstStatTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaLstStatTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxaLstStatTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaLstStatTs() {	 
   		return (substring(getStringValue(),beginTarafxaLstStatTs,beginTarafxaLstStatTs + TARAFXA_LST_STAT_TS_LEN));
   	}
        int localTarafxaXferFileSzNumCounter = -1;
        public boolean isTarafxaXferFileSzNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTarafxaXferFileSzNumCounter != sharedCounter;
           localTarafxaXferFileSzNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean tarafxaXferFileSzNumIsNumeric() {
	      return decimalIsNumeric(beginTarafxaXferFileSzNum,TARAFXA_XFER_FILE_SZ_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAFXA_XFER_FILE_SZ_NUM_LEN = 7;
  	/**
	 * 	serializeTarafxaXferFileSzNum
	 */
	protected void serializeTarafxaXferFileSzNum(long tarafxaXferFileSzNum) {
		   putDecimal(beginTarafxaXferFileSzNum,tarafxaXferFileSzNum,TARAFXA_XFER_FILE_SZ_NUM_LEN,true);
   }
   

   protected long checkTarafxaXferFileSzNumMaxLimit(long number) {
        return checkMaxLimit(number , MAX_10T /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTarafxaXferFileSzNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTarafxaXferFileSzNum() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTarafxaXferFileSzNum,TARAFXA_XFER_FILE_SZ_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tarafxaXferFileSzNum", beginTarafxaXferFileSzNum,TARAFXA_XFER_FILE_SZ_NUM_LEN);
     }
   	}
        int localTarafxaTmsXferdCntCounter = -1;
        public boolean isTarafxaTmsXferdCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTarafxaTmsXferdCntCounter != sharedCounter;
           localTarafxaTmsXferdCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean tarafxaTmsXferdCntIsNumeric() {
	      return decimalIsNumeric(beginTarafxaTmsXferdCnt,TARAFXA_TMS_XFERD_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAFXA_TMS_XFERD_CNT_LEN = 3;
  	/**
	 * 	serializeTarafxaTmsXferdCnt
	 */
	protected void serializeTarafxaTmsXferdCnt(int tarafxaTmsXferdCnt) {
		   putDecimal(beginTarafxaTmsXferdCnt,tarafxaTmsXferdCnt,TARAFXA_TMS_XFERD_CNT_LEN,true);
   }
   

   protected int checkTarafxaTmsXferdCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100K /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTarafxaTmsXferdCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTarafxaTmsXferdCnt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTarafxaTmsXferdCnt,TARAFXA_TMS_XFERD_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tarafxaTmsXferdCnt", beginTarafxaTmsXferdCnt,TARAFXA_TMS_XFERD_CNT_LEN);
     }
   	}
        int localTarafxaXferRecCntCounter = -1;
        public boolean isTarafxaXferRecCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTarafxaXferRecCntCounter != sharedCounter;
           localTarafxaXferRecCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean tarafxaXferRecCntIsNumeric() {
	      return decimalIsNumeric(beginTarafxaXferRecCnt,TARAFXA_XFER_REC_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAFXA_XFER_REC_CNT_LEN = 7;
  	/**
	 * 	serializeTarafxaXferRecCnt
	 */
	protected void serializeTarafxaXferRecCnt(long tarafxaXferRecCnt) {
		   putDecimal(beginTarafxaXferRecCnt,tarafxaXferRecCnt,TARAFXA_XFER_REC_CNT_LEN,true);
   }
   

   protected long checkTarafxaXferRecCntMaxLimit(long number) {
        return checkMaxLimit(number , MAX_10T /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTarafxaXferRecCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTarafxaXferRecCnt() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTarafxaXferRecCnt,TARAFXA_XFER_REC_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tarafxaXferRecCnt", beginTarafxaXferRecCnt,TARAFXA_XFER_REC_CNT_LEN);
     }
   	}
     int localTarafxaXferRqstTsCounter = -1;
     public boolean isTarafxaXferRqstTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaXferRqstTsCounter != sharedCounter;
         localTarafxaXferRqstTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_XFER_RQST_TS_LEN = 26;
	/**
	 * 	serialize this TarafxaXferRqstTs
	 */
   protected void serializeTarafxaXferRqstTs(char[] tarafxaXferRqstTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaXferRqstTs,0,getStringValue(),beginTarafxaXferRqstTs,TARAFXA_XFER_RQST_TS_LEN);
       localTarafxaXferRqstTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaXferRqstTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxaXferRqstTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaXferRqstTs() {	 
   		return (substring(getStringValue(),beginTarafxaXferRqstTs,beginTarafxaXferRqstTs + TARAFXA_XFER_RQST_TS_LEN));
   	}
     int localTarafxaXferStrtTsCounter = -1;
     public boolean isTarafxaXferStrtTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaXferStrtTsCounter != sharedCounter;
         localTarafxaXferStrtTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_XFER_STRT_TS_LEN = 26;
	/**
	 * 	serialize this TarafxaXferStrtTs
	 */
   protected void serializeTarafxaXferStrtTs(char[] tarafxaXferStrtTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaXferStrtTs,0,getStringValue(),beginTarafxaXferStrtTs,TARAFXA_XFER_STRT_TS_LEN);
       localTarafxaXferStrtTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaXferStrtTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxaXferStrtTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaXferStrtTs() {	 
   		return (substring(getStringValue(),beginTarafxaXferStrtTs,beginTarafxaXferStrtTs + TARAFXA_XFER_STRT_TS_LEN));
   	}
     int localTarafxaXferStopTsCounter = -1;
     public boolean isTarafxaXferStopTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaXferStopTsCounter != sharedCounter;
         localTarafxaXferStopTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_XFER_STOP_TS_LEN = 26;
	/**
	 * 	serialize this TarafxaXferStopTs
	 */
   protected void serializeTarafxaXferStopTs(char[] tarafxaXferStopTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaXferStopTs,0,getStringValue(),beginTarafxaXferStopTs,TARAFXA_XFER_STOP_TS_LEN);
       localTarafxaXferStopTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaXferStopTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxaXferStopTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaXferStopTs() {	 
   		return (substring(getStringValue(),beginTarafxaXferStopTs,beginTarafxaXferStopTs + TARAFXA_XFER_STOP_TS_LEN));
   	}
     int localTarafxaXferRdyTsCounter = -1;
     public boolean isTarafxaXferRdyTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaXferRdyTsCounter != sharedCounter;
         localTarafxaXferRdyTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_XFER_RDY_TS_LEN = 26;
	/**
	 * 	serialize this TarafxaXferRdyTs
	 */
   protected void serializeTarafxaXferRdyTs(char[] tarafxaXferRdyTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaXferRdyTs,0,getStringValue(),beginTarafxaXferRdyTs,TARAFXA_XFER_RDY_TS_LEN);
       localTarafxaXferRdyTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaXferRdyTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxaXferRdyTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaXferRdyTs() {	 
   		return (substring(getStringValue(),beginTarafxaXferRdyTs,beginTarafxaXferRdyTs + TARAFXA_XFER_RDY_TS_LEN));
   	}
     int localTarafxaXferCondCdCounter = -1;
     public boolean isTarafxaXferCondCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaXferCondCdCounter != sharedCounter;
         localTarafxaXferCondCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_XFER_COND_CD_LEN = 9;
	/**
	 * 	serialize this TarafxaXferCondCd
	 */
   protected void serializeTarafxaXferCondCd(char[] tarafxaXferCondCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaXferCondCd,0,getStringValue(),beginTarafxaXferCondCd,TARAFXA_XFER_COND_CD_LEN);
       localTarafxaXferCondCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaXferCondCdConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshTarafxaXferCondCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaXferCondCd() {	 
   		return (substring(getStringValue(),beginTarafxaXferCondCd,beginTarafxaXferCondCd + TARAFXA_XFER_COND_CD_LEN));
   	}
     int localTarafxaXferStatTxtCounter = -1;
     public boolean isTarafxaXferStatTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaXferStatTxtCounter != sharedCounter;
         localTarafxaXferStatTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_XFER_STAT_TXT_LEN = 9;
	/**
	 * 	serialize this TarafxaXferStatTxt
	 */
   protected void serializeTarafxaXferStatTxt(char[] tarafxaXferStatTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaXferStatTxt,0,getStringValue(),beginTarafxaXferStatTxt,TARAFXA_XFER_STAT_TXT_LEN);
       localTarafxaXferStatTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaXferStatTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshTarafxaXferStatTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaXferStatTxt() {	 
   		return (substring(getStringValue(),beginTarafxaXferStatTxt,beginTarafxaXferStatTxt + TARAFXA_XFER_STAT_TXT_LEN));
   	}
        int localTarafxaXferPrcssIdCounter = -1;
        public boolean isTarafxaXferPrcssIdModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTarafxaXferPrcssIdCounter != sharedCounter;
           localTarafxaXferPrcssIdCounter = sharedCounter; return hasModified; 
        }
	    public boolean tarafxaXferPrcssIdIsNumeric() {
	      return decimalIsNumeric(beginTarafxaXferPrcssId,TARAFXA_XFER_PRCSS_ID_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAFXA_XFER_PRCSS_ID_LEN = 7;
  	/**
	 * 	serializeTarafxaXferPrcssId
	 */
	protected void serializeTarafxaXferPrcssId(long tarafxaXferPrcssId) {
		   putDecimal(beginTarafxaXferPrcssId,tarafxaXferPrcssId,TARAFXA_XFER_PRCSS_ID_LEN,true);
   }
   

   protected long checkTarafxaXferPrcssIdMaxLimit(long number) {
        return checkMaxLimit(number , MAX_10T /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTarafxaXferPrcssId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTarafxaXferPrcssId() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTarafxaXferPrcssId,TARAFXA_XFER_PRCSS_ID_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tarafxaXferPrcssId", beginTarafxaXferPrcssId,TARAFXA_XFER_PRCSS_ID_LEN);
     }
   	}
        int localTarafxaOrgXferPrcsIdCounter = -1;
        public boolean isTarafxaOrgXferPrcsIdModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTarafxaOrgXferPrcsIdCounter != sharedCounter;
           localTarafxaOrgXferPrcsIdCounter = sharedCounter; return hasModified; 
        }
	    public boolean tarafxaOrgXferPrcsIdIsNumeric() {
	      return decimalIsNumeric(beginTarafxaOrgXferPrcsId,TARAFXA_ORG_XFER_PRCS_ID_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAFXA_ORG_XFER_PRCS_ID_LEN = 7;
  	/**
	 * 	serializeTarafxaOrgXferPrcsId
	 */
	protected void serializeTarafxaOrgXferPrcsId(long tarafxaOrgXferPrcsId) {
		   putDecimal(beginTarafxaOrgXferPrcsId,tarafxaOrgXferPrcsId,TARAFXA_ORG_XFER_PRCS_ID_LEN,true);
   }
   

   protected long checkTarafxaOrgXferPrcsIdMaxLimit(long number) {
        return checkMaxLimit(number , MAX_10T /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTarafxaOrgXferPrcsId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTarafxaOrgXferPrcsId() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTarafxaOrgXferPrcsId,TARAFXA_ORG_XFER_PRCS_ID_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tarafxaOrgXferPrcsId", beginTarafxaOrgXferPrcsId,TARAFXA_ORG_XFER_PRCS_ID_LEN);
     }
   	}
     int localTarafxaTrgrCondCdCounter = -1;
     public boolean isTarafxaTrgrCondCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaTrgrCondCdCounter != sharedCounter;
         localTarafxaTrgrCondCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_TRGR_COND_CD_LEN = 1;
	/**
	 * 	serialize this TarafxaTrgrCondCd
	 */
   protected void serializeTarafxaTrgrCondCd(char[] tarafxaTrgrCondCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaTrgrCondCd,0,getStringValue(),beginTarafxaTrgrCondCd,TARAFXA_TRGR_COND_CD_LEN);
       localTarafxaTrgrCondCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaTrgrCondCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTarafxaTrgrCondCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaTrgrCondCd() {	 
   		return (substring(getStringValue(),beginTarafxaTrgrCondCd,beginTarafxaTrgrCondCd + TARAFXA_TRGR_COND_CD_LEN));
   	}
     int localTarafxaTrgrStatTxtCounter = -1;
     public boolean isTarafxaTrgrStatTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaTrgrStatTxtCounter != sharedCounter;
         localTarafxaTrgrStatTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_TRGR_STAT_TXT_LEN = 9;
	/**
	 * 	serialize this TarafxaTrgrStatTxt
	 */
   protected void serializeTarafxaTrgrStatTxt(char[] tarafxaTrgrStatTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaTrgrStatTxt,0,getStringValue(),beginTarafxaTrgrStatTxt,TARAFXA_TRGR_STAT_TXT_LEN);
       localTarafxaTrgrStatTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaTrgrStatTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshTarafxaTrgrStatTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaTrgrStatTxt() {	 
   		return (substring(getStringValue(),beginTarafxaTrgrStatTxt,beginTarafxaTrgrStatTxt + TARAFXA_TRGR_STAT_TXT_LEN));
   	}
     int localTarafxaOrgLocNamCounter = -1;
     public boolean isTarafxaOrgLocNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaOrgLocNamCounter != sharedCounter;
         localTarafxaOrgLocNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_ORG_LOC_NAM_LEN = 16;
	/**
	 * 	serialize this TarafxaOrgLocNam
	 */
   protected void serializeTarafxaOrgLocNam(char[] tarafxaOrgLocNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaOrgLocNam,0,getStringValue(),beginTarafxaOrgLocNam,TARAFXA_ORG_LOC_NAM_LEN);
       localTarafxaOrgLocNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaOrgLocNamConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshTarafxaOrgLocNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaOrgLocNam() {	 
   		return (substring(getStringValue(),beginTarafxaOrgLocNam,beginTarafxaOrgLocNam + TARAFXA_ORG_LOC_NAM_LEN));
   	}
     int localTarafxaLstUpdtUserIdCounter = -1;
     public boolean isTarafxaLstUpdtUserIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaLstUpdtUserIdCounter != sharedCounter;
         localTarafxaLstUpdtUserIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_LST_UPDT_USER_ID_LEN = 9;
	/**
	 * 	serialize this TarafxaLstUpdtUserId
	 */
   protected void serializeTarafxaLstUpdtUserId(char[] tarafxaLstUpdtUserId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaLstUpdtUserId,0,getStringValue(),beginTarafxaLstUpdtUserId,TARAFXA_LST_UPDT_USER_ID_LEN);
       localTarafxaLstUpdtUserIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaLstUpdtUserIdConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshTarafxaLstUpdtUserId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaLstUpdtUserId() {	 
   		return (substring(getStringValue(),beginTarafxaLstUpdtUserId,beginTarafxaLstUpdtUserId + TARAFXA_LST_UPDT_USER_ID_LEN));
   	}
     int localTarafxaLstUpdtTsCounter = -1;
     public boolean isTarafxaLstUpdtTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaLstUpdtTsCounter != sharedCounter;
         localTarafxaLstUpdtTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_LST_UPDT_TS_LEN = 26;
	/**
	 * 	serialize this TarafxaLstUpdtTs
	 */
   protected void serializeTarafxaLstUpdtTs(char[] tarafxaLstUpdtTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaLstUpdtTs,0,getStringValue(),beginTarafxaLstUpdtTs,TARAFXA_LST_UPDT_TS_LEN);
       localTarafxaLstUpdtTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaLstUpdtTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxaLstUpdtTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaLstUpdtTs() {	 
   		return (substring(getStringValue(),beginTarafxaLstUpdtTs,beginTarafxaLstUpdtTs + TARAFXA_LST_UPDT_TS_LEN));
   	}
     int localTarafxaTrgrActNamCounter = -1;
     public boolean isTarafxaTrgrActNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaTrgrActNamCounter != sharedCounter;
         localTarafxaTrgrActNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_TRGR_ACT_NAM_LEN = 8;
	/**
	 * 	serialize this TarafxaTrgrActNam
	 */
   protected void serializeTarafxaTrgrActNam(char[] tarafxaTrgrActNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaTrgrActNam,0,getStringValue(),beginTarafxaTrgrActNam,TARAFXA_TRGR_ACT_NAM_LEN);
       localTarafxaTrgrActNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaTrgrActNamConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshTarafxaTrgrActNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaTrgrActNam() {	 
   		return (substring(getStringValue(),beginTarafxaTrgrActNam,beginTarafxaTrgrActNam + TARAFXA_TRGR_ACT_NAM_LEN));
   	}
     int localTarafxaPrvMnfrmFileNamCounter = -1;
     public boolean isTarafxaPrvMnfrmFileNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaPrvMnfrmFileNamCounter != sharedCounter;
         localTarafxaPrvMnfrmFileNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_PRV_MNFRM_FILE_NAM_LEN = 44;
	/**
	 * 	serialize this TarafxaPrvMnfrmFileNam
	 */
   protected void serializeTarafxaPrvMnfrmFileNam(char[] tarafxaPrvMnfrmFileNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaPrvMnfrmFileNam,0,getStringValue(),beginTarafxaPrvMnfrmFileNam,TARAFXA_PRV_MNFRM_FILE_NAM_LEN);
       localTarafxaPrvMnfrmFileNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaPrvMnfrmFileNamConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshTarafxaPrvMnfrmFileNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaPrvMnfrmFileNam() {	 
   		return (substring(getStringValue(),beginTarafxaPrvMnfrmFileNam,beginTarafxaPrvMnfrmFileNam + TARAFXA_PRV_MNFRM_FILE_NAM_LEN));
   	}
        int localTarafxaPrvCyclNumCounter = -1;
        public boolean isTarafxaPrvCyclNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTarafxaPrvCyclNumCounter != sharedCounter;
           localTarafxaPrvCyclNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean tarafxaPrvCyclNumIsNumeric() {
	      return decimalIsNumeric(beginTarafxaPrvCyclNum,TARAFXA_PRV_CYCL_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAFXA_PRV_CYCL_NUM_LEN = 2;
  	/**
	 * 	serializeTarafxaPrvCyclNum
	 */
	protected void serializeTarafxaPrvCyclNum(short tarafxaPrvCyclNum) {
		   putDecimal(beginTarafxaPrvCyclNum,tarafxaPrvCyclNum,TARAFXA_PRV_CYCL_NUM_LEN,true);
   }
   

   protected short checkTarafxaPrvCyclNumMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshTarafxaPrvCyclNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaPrvCyclNum() throws CFException {	
   	try { 
		 return (getShortDecimal(beginTarafxaPrvCyclNum,TARAFXA_PRV_CYCL_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tarafxaPrvCyclNum", beginTarafxaPrvCyclNum,TARAFXA_PRV_CYCL_NUM_LEN);
     }
   	}
     int localTarafxaPrvBusPrtnrIdCounter = -1;
     public boolean isTarafxaPrvBusPrtnrIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaPrvBusPrtnrIdCounter != sharedCounter;
         localTarafxaPrvBusPrtnrIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_PRV_BUS_PRTNR_ID_LEN = 6;
	/**
	 * 	serialize this TarafxaPrvBusPrtnrId
	 */
   protected void serializeTarafxaPrvBusPrtnrId(char[] tarafxaPrvBusPrtnrId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaPrvBusPrtnrId,0,getStringValue(),beginTarafxaPrvBusPrtnrId,TARAFXA_PRV_BUS_PRTNR_ID_LEN);
       localTarafxaPrvBusPrtnrIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaPrvBusPrtnrIdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTarafxaPrvBusPrtnrId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaPrvBusPrtnrId() {	 
   		return (substring(getStringValue(),beginTarafxaPrvBusPrtnrId,beginTarafxaPrvBusPrtnrId + TARAFXA_PRV_BUS_PRTNR_ID_LEN));
   	}
     int localTarafxaPrvEndptIdCounter = -1;
     public boolean isTarafxaPrvEndptIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaPrvEndptIdCounter != sharedCounter;
         localTarafxaPrvEndptIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_PRV_ENDPT_ID_LEN = 7;
	/**
	 * 	serialize this TarafxaPrvEndptId
	 */
   protected void serializeTarafxaPrvEndptId(char[] tarafxaPrvEndptId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaPrvEndptId,0,getStringValue(),beginTarafxaPrvEndptId,TARAFXA_PRV_ENDPT_ID_LEN);
       localTarafxaPrvEndptIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaPrvEndptIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTarafxaPrvEndptId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaPrvEndptId() {	 
   		return (substring(getStringValue(),beginTarafxaPrvEndptId,beginTarafxaPrvEndptId + TARAFXA_PRV_ENDPT_ID_LEN));
   	}
     int localTarafxaPrvAvailTsCounter = -1;
     public boolean isTarafxaPrvAvailTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaPrvAvailTsCounter != sharedCounter;
         localTarafxaPrvAvailTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_PRV_AVAIL_TS_LEN = 26;
	/**
	 * 	serialize this TarafxaPrvAvailTs
	 */
   protected void serializeTarafxaPrvAvailTs(char[] tarafxaPrvAvailTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaPrvAvailTs,0,getStringValue(),beginTarafxaPrvAvailTs,TARAFXA_PRV_AVAIL_TS_LEN);
       localTarafxaPrvAvailTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaPrvAvailTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxaPrvAvailTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaPrvAvailTs() {	 
   		return (substring(getStringValue(),beginTarafxaPrvAvailTs,beginTarafxaPrvAvailTs + TARAFXA_PRV_AVAIL_TS_LEN));
   	}
     int localTarafxaNxtMnfrmFileNamCounter = -1;
     public boolean isTarafxaNxtMnfrmFileNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaNxtMnfrmFileNamCounter != sharedCounter;
         localTarafxaNxtMnfrmFileNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_NXT_MNFRM_FILE_NAM_LEN = 44;
	/**
	 * 	serialize this TarafxaNxtMnfrmFileNam
	 */
   protected void serializeTarafxaNxtMnfrmFileNam(char[] tarafxaNxtMnfrmFileNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaNxtMnfrmFileNam,0,getStringValue(),beginTarafxaNxtMnfrmFileNam,TARAFXA_NXT_MNFRM_FILE_NAM_LEN);
       localTarafxaNxtMnfrmFileNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaNxtMnfrmFileNamConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshTarafxaNxtMnfrmFileNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaNxtMnfrmFileNam() {	 
   		return (substring(getStringValue(),beginTarafxaNxtMnfrmFileNam,beginTarafxaNxtMnfrmFileNam + TARAFXA_NXT_MNFRM_FILE_NAM_LEN));
   	}
        int localTarafxaNxtCyclNumCounter = -1;
        public boolean isTarafxaNxtCyclNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTarafxaNxtCyclNumCounter != sharedCounter;
           localTarafxaNxtCyclNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean tarafxaNxtCyclNumIsNumeric() {
	      return decimalIsNumeric(beginTarafxaNxtCyclNum,TARAFXA_NXT_CYCL_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAFXA_NXT_CYCL_NUM_LEN = 2;
  	/**
	 * 	serializeTarafxaNxtCyclNum
	 */
	protected void serializeTarafxaNxtCyclNum(short tarafxaNxtCyclNum) {
		   putDecimal(beginTarafxaNxtCyclNum,tarafxaNxtCyclNum,TARAFXA_NXT_CYCL_NUM_LEN,true);
   }
   

   protected short checkTarafxaNxtCyclNumMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshTarafxaNxtCyclNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaNxtCyclNum() throws CFException {	
   	try { 
		 return (getShortDecimal(beginTarafxaNxtCyclNum,TARAFXA_NXT_CYCL_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tarafxaNxtCyclNum", beginTarafxaNxtCyclNum,TARAFXA_NXT_CYCL_NUM_LEN);
     }
   	}
     int localTarafxaNxtBusPrtnrIdCounter = -1;
     public boolean isTarafxaNxtBusPrtnrIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaNxtBusPrtnrIdCounter != sharedCounter;
         localTarafxaNxtBusPrtnrIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_NXT_BUS_PRTNR_ID_LEN = 6;
	/**
	 * 	serialize this TarafxaNxtBusPrtnrId
	 */
   protected void serializeTarafxaNxtBusPrtnrId(char[] tarafxaNxtBusPrtnrId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaNxtBusPrtnrId,0,getStringValue(),beginTarafxaNxtBusPrtnrId,TARAFXA_NXT_BUS_PRTNR_ID_LEN);
       localTarafxaNxtBusPrtnrIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaNxtBusPrtnrIdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTarafxaNxtBusPrtnrId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaNxtBusPrtnrId() {	 
   		return (substring(getStringValue(),beginTarafxaNxtBusPrtnrId,beginTarafxaNxtBusPrtnrId + TARAFXA_NXT_BUS_PRTNR_ID_LEN));
   	}
     int localTarafxaNxtEndptIdCounter = -1;
     public boolean isTarafxaNxtEndptIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaNxtEndptIdCounter != sharedCounter;
         localTarafxaNxtEndptIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_NXT_ENDPT_ID_LEN = 7;
	/**
	 * 	serialize this TarafxaNxtEndptId
	 */
   protected void serializeTarafxaNxtEndptId(char[] tarafxaNxtEndptId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaNxtEndptId,0,getStringValue(),beginTarafxaNxtEndptId,TARAFXA_NXT_ENDPT_ID_LEN);
       localTarafxaNxtEndptIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaNxtEndptIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTarafxaNxtEndptId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaNxtEndptId() {	 
   		return (substring(getStringValue(),beginTarafxaNxtEndptId,beginTarafxaNxtEndptId + TARAFXA_NXT_ENDPT_ID_LEN));
   	}
     int localTarafxaNxtAvailTsCounter = -1;
     public boolean isTarafxaNxtAvailTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaNxtAvailTsCounter != sharedCounter;
         localTarafxaNxtAvailTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_NXT_AVAIL_TS_LEN = 26;
	/**
	 * 	serialize this TarafxaNxtAvailTs
	 */
   protected void serializeTarafxaNxtAvailTs(char[] tarafxaNxtAvailTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaNxtAvailTs,0,getStringValue(),beginTarafxaNxtAvailTs,TARAFXA_NXT_AVAIL_TS_LEN);
       localTarafxaNxtAvailTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaNxtAvailTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxaNxtAvailTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaNxtAvailTs() {	 
   		return (substring(getStringValue(),beginTarafxaNxtAvailTs,beginTarafxaNxtAvailTs + TARAFXA_NXT_AVAIL_TS_LEN));
   	}
     int localTarafxaApplExitJobNamCounter = -1;
     public boolean isTarafxaApplExitJobNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaApplExitJobNamCounter != sharedCounter;
         localTarafxaApplExitJobNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_APPL_EXIT_JOB_NAM_LEN = 8;
	/**
	 * 	serialize this TarafxaApplExitJobNam
	 */
   protected void serializeTarafxaApplExitJobNam(char[] tarafxaApplExitJobNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaApplExitJobNam,0,getStringValue(),beginTarafxaApplExitJobNam,TARAFXA_APPL_EXIT_JOB_NAM_LEN);
       localTarafxaApplExitJobNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaApplExitJobNamConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshTarafxaApplExitJobNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaApplExitJobNam() {	 
   		return (substring(getStringValue(),beginTarafxaApplExitJobNam,beginTarafxaApplExitJobNam + TARAFXA_APPL_EXIT_JOB_NAM_LEN));
   	}
     int localTarafxaApplExitTsCounter = -1;
     public boolean isTarafxaApplExitTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaApplExitTsCounter != sharedCounter;
         localTarafxaApplExitTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_APPL_EXIT_TS_LEN = 26;
	/**
	 * 	serialize this TarafxaApplExitTs
	 */
   protected void serializeTarafxaApplExitTs(char[] tarafxaApplExitTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaApplExitTs,0,getStringValue(),beginTarafxaApplExitTs,TARAFXA_APPL_EXIT_TS_LEN);
       localTarafxaApplExitTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaApplExitTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxaApplExitTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaApplExitTs() {	 
   		return (substring(getStringValue(),beginTarafxaApplExitTs,beginTarafxaApplExitTs + TARAFXA_APPL_EXIT_TS_LEN));
   	}
     int localTarafxaCsMipIdCounter = -1;
     public boolean isTarafxaCsMipIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaCsMipIdCounter != sharedCounter;
         localTarafxaCsMipIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_CS_MIP_ID_LEN = 3;
	/**
	 * 	serialize this TarafxaCsMipId
	 */
   protected void serializeTarafxaCsMipId(char[] tarafxaCsMipId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaCsMipId,0,getStringValue(),beginTarafxaCsMipId,TARAFXA_CS_MIP_ID_LEN);
       localTarafxaCsMipIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaCsMipIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshTarafxaCsMipId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaCsMipId() {	 
   		return (substring(getStringValue(),beginTarafxaCsMipId,beginTarafxaCsMipId + TARAFXA_CS_MIP_ID_LEN));
   	}
     int localTarafxaRmMipIdCounter = -1;
     public boolean isTarafxaRmMipIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaRmMipIdCounter != sharedCounter;
         localTarafxaRmMipIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_RM_MIP_ID_LEN = 3;
	/**
	 * 	serialize this TarafxaRmMipId
	 */
   protected void serializeTarafxaRmMipId(char[] tarafxaRmMipId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaRmMipId,0,getStringValue(),beginTarafxaRmMipId,TARAFXA_RM_MIP_ID_LEN);
       localTarafxaRmMipIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaRmMipIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshTarafxaRmMipId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaRmMipId() {	 
   		return (substring(getStringValue(),beginTarafxaRmMipId,beginTarafxaRmMipId + TARAFXA_RM_MIP_ID_LEN));
   	}
     int localTarafxaApplExitNamCounter = -1;
     public boolean isTarafxaApplExitNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaApplExitNamCounter != sharedCounter;
         localTarafxaApplExitNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_APPL_EXIT_NAM_LEN = 8;
	/**
	 * 	serialize this TarafxaApplExitNam
	 */
   protected void serializeTarafxaApplExitNam(char[] tarafxaApplExitNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaApplExitNam,0,getStringValue(),beginTarafxaApplExitNam,TARAFXA_APPL_EXIT_NAM_LEN);
       localTarafxaApplExitNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaApplExitNamConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshTarafxaApplExitNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaApplExitNam() {	 
   		return (substring(getStringValue(),beginTarafxaApplExitNam,beginTarafxaApplExitNam + TARAFXA_APPL_EXIT_NAM_LEN));
   	}
     int localTarafxaTapeCmpltdSwCounter = -1;
     public boolean isTarafxaTapeCmpltdSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaTapeCmpltdSwCounter != sharedCounter;
         localTarafxaTapeCmpltdSwCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_TAPE_CMPLTD_SW_LEN = 1;
	/**
	 * 	serialize this TarafxaTapeCmpltdSw
	 */
   protected void serializeTarafxaTapeCmpltdSw(char[] tarafxaTapeCmpltdSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaTapeCmpltdSw,0,getStringValue(),beginTarafxaTapeCmpltdSw,TARAFXA_TAPE_CMPLTD_SW_LEN);
       localTarafxaTapeCmpltdSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaTapeCmpltdSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTarafxaTapeCmpltdSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaTapeCmpltdSw() {	 
   		return (substring(getStringValue(),beginTarafxaTapeCmpltdSw,beginTarafxaTapeCmpltdSw + TARAFXA_TAPE_CMPLTD_SW_LEN));
   	}
     int localTarafxaTapeMultVolSwCounter = -1;
     public boolean isTarafxaTapeMultVolSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaTapeMultVolSwCounter != sharedCounter;
         localTarafxaTapeMultVolSwCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_TAPE_MULT_VOL_SW_LEN = 1;
	/**
	 * 	serialize this TarafxaTapeMultVolSw
	 */
   protected void serializeTarafxaTapeMultVolSw(char[] tarafxaTapeMultVolSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaTapeMultVolSw,0,getStringValue(),beginTarafxaTapeMultVolSw,TARAFXA_TAPE_MULT_VOL_SW_LEN);
       localTarafxaTapeMultVolSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaTapeMultVolSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTarafxaTapeMultVolSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaTapeMultVolSw() {	 
   		return (substring(getStringValue(),beginTarafxaTapeMultVolSw,beginTarafxaTapeMultVolSw + TARAFXA_TAPE_MULT_VOL_SW_LEN));
   	}
     int localTarafxaApplPrcssngDtCounter = -1;
     public boolean isTarafxaApplPrcssngDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaApplPrcssngDtCounter != sharedCounter;
         localTarafxaApplPrcssngDtCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_APPL_PRCSSNG_DT_LEN = 10;
	/**
	 * 	serialize this TarafxaApplPrcssngDt
	 */
   protected void serializeTarafxaApplPrcssngDt(char[] tarafxaApplPrcssngDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaApplPrcssngDt,0,getStringValue(),beginTarafxaApplPrcssngDt,TARAFXA_APPL_PRCSSNG_DT_LEN);
       localTarafxaApplPrcssngDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaApplPrcssngDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTarafxaApplPrcssngDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaApplPrcssngDt() {	 
   		return (substring(getStringValue(),beginTarafxaApplPrcssngDt,beginTarafxaApplPrcssngDt + TARAFXA_APPL_PRCSSNG_DT_LEN));
   	}
     int localTarafxaTransitionalDsnCounter = -1;
     public boolean isTarafxaTransitionalDsnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaTransitionalDsnCounter != sharedCounter;
         localTarafxaTransitionalDsnCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_TRANSITIONAL_DSN_LEN = 44;
	/**
	 * 	serialize this TarafxaTransitionalDsn
	 */
   protected void serializeTarafxaTransitionalDsn(char[] tarafxaTransitionalDsn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaTransitionalDsn,0,getStringValue(),beginTarafxaTransitionalDsn,TARAFXA_TRANSITIONAL_DSN_LEN);
       localTarafxaTransitionalDsnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaTransitionalDsnConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshTarafxaTransitionalDsn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaTransitionalDsn() {	 
   		return (substring(getStringValue(),beginTarafxaTransitionalDsn,beginTarafxaTransitionalDsn + TARAFXA_TRANSITIONAL_DSN_LEN));
   	}
     int localTarafxaSourceHubIdCounter = -1;
     public boolean isTarafxaSourceHubIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaSourceHubIdCounter != sharedCounter;
         localTarafxaSourceHubIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_SOURCE_HUB_ID_LEN = 8;
	/**
	 * 	serialize this TarafxaSourceHubId
	 */
   protected void serializeTarafxaSourceHubId(char[] tarafxaSourceHubId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaSourceHubId,0,getStringValue(),beginTarafxaSourceHubId,TARAFXA_SOURCE_HUB_ID_LEN);
       localTarafxaSourceHubIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaSourceHubIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshTarafxaSourceHubId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaSourceHubId() {	 
   		return (substring(getStringValue(),beginTarafxaSourceHubId,beginTarafxaSourceHubId + TARAFXA_SOURCE_HUB_ID_LEN));
   	}
     int localTarafxaOwningHubIdCounter = -1;
     public boolean isTarafxaOwningHubIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaOwningHubIdCounter != sharedCounter;
         localTarafxaOwningHubIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_OWNING_HUB_ID_LEN = 8;
	/**
	 * 	serialize this TarafxaOwningHubId
	 */
   protected void serializeTarafxaOwningHubId(char[] tarafxaOwningHubId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaOwningHubId,0,getStringValue(),beginTarafxaOwningHubId,TARAFXA_OWNING_HUB_ID_LEN);
       localTarafxaOwningHubIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaOwningHubIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshTarafxaOwningHubId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaOwningHubId() {	 
   		return (substring(getStringValue(),beginTarafxaOwningHubId,beginTarafxaOwningHubId + TARAFXA_OWNING_HUB_ID_LEN));
   	}
     int localTarafxaStatRefIdCounter = -1;
     public boolean isTarafxaStatRefIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaStatRefIdCounter != sharedCounter;
         localTarafxaStatRefIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_STAT_REF_ID_LEN = 4;
	/**
	 * 	serialize this TarafxaStatRefId
	 */
   protected void serializeTarafxaStatRefId(char[] tarafxaStatRefId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaStatRefId,0,getStringValue(),beginTarafxaStatRefId,TARAFXA_STAT_REF_ID_LEN);
       localTarafxaStatRefIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaStatRefIdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshTarafxaStatRefId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaStatRefId() {	 
   		return (substring(getStringValue(),beginTarafxaStatRefId,beginTarafxaStatRefId + TARAFXA_STAT_REF_ID_LEN));
   	}
     int localTarafxaSrcLocEntNamCounter = -1;
     public boolean isTarafxaSrcLocEntNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaSrcLocEntNamCounter != sharedCounter;
         localTarafxaSrcLocEntNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_SRC_LOC_ENT_NAM_LEN = 10;
	/**
	 * 	serialize this TarafxaSrcLocEntNam
	 */
   protected void serializeTarafxaSrcLocEntNam(char[] tarafxaSrcLocEntNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaSrcLocEntNam,0,getStringValue(),beginTarafxaSrcLocEntNam,TARAFXA_SRC_LOC_ENT_NAM_LEN);
       localTarafxaSrcLocEntNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaSrcLocEntNamConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTarafxaSrcLocEntNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaSrcLocEntNam() {	 
   		return (substring(getStringValue(),beginTarafxaSrcLocEntNam,beginTarafxaSrcLocEntNam + TARAFXA_SRC_LOC_ENT_NAM_LEN));
   	}
     int localTarafxaSrcTaskNamCounter = -1;
     public boolean isTarafxaSrcTaskNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaSrcTaskNamCounter != sharedCounter;
         localTarafxaSrcTaskNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_SRC_TASK_NAM_LEN = 10;
	/**
	 * 	serialize this TarafxaSrcTaskNam
	 */
   protected void serializeTarafxaSrcTaskNam(char[] tarafxaSrcTaskNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaSrcTaskNam,0,getStringValue(),beginTarafxaSrcTaskNam,TARAFXA_SRC_TASK_NAM_LEN);
       localTarafxaSrcTaskNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaSrcTaskNamConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTarafxaSrcTaskNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaSrcTaskNam() {	 
   		return (substring(getStringValue(),beginTarafxaSrcTaskNam,beginTarafxaSrcTaskNam + TARAFXA_SRC_TASK_NAM_LEN));
   	}
     int localTarafxaSrcTaskIdCounter = -1;
     public boolean isTarafxaSrcTaskIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaSrcTaskIdCounter != sharedCounter;
         localTarafxaSrcTaskIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_SRC_TASK_ID_LEN = 13;
	/**
	 * 	serialize this TarafxaSrcTaskId
	 */
   protected void serializeTarafxaSrcTaskId(char[] tarafxaSrcTaskId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaSrcTaskId,0,getStringValue(),beginTarafxaSrcTaskId,TARAFXA_SRC_TASK_ID_LEN);
       localTarafxaSrcTaskIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaSrcTaskIdConstraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
    /**
	 *	refreshTarafxaSrcTaskId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaSrcTaskId() {	 
   		return (substring(getStringValue(),beginTarafxaSrcTaskId,beginTarafxaSrcTaskId + TARAFXA_SRC_TASK_ID_LEN));
   	}
     int localTarafxaSrcTaskStrtTsCounter = -1;
     public boolean isTarafxaSrcTaskStrtTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaSrcTaskStrtTsCounter != sharedCounter;
         localTarafxaSrcTaskStrtTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_SRC_TASK_STRT_TS_LEN = 26;
	/**
	 * 	serialize this TarafxaSrcTaskStrtTs
	 */
   protected void serializeTarafxaSrcTaskStrtTs(char[] tarafxaSrcTaskStrtTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaSrcTaskStrtTs,0,getStringValue(),beginTarafxaSrcTaskStrtTs,TARAFXA_SRC_TASK_STRT_TS_LEN);
       localTarafxaSrcTaskStrtTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaSrcTaskStrtTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxaSrcTaskStrtTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaSrcTaskStrtTs() {	 
   		return (substring(getStringValue(),beginTarafxaSrcTaskStrtTs,beginTarafxaSrcTaskStrtTs + TARAFXA_SRC_TASK_STRT_TS_LEN));
   	}
     int localTarafxaSrcTaskStopTsCounter = -1;
     public boolean isTarafxaSrcTaskStopTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaSrcTaskStopTsCounter != sharedCounter;
         localTarafxaSrcTaskStopTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_SRC_TASK_STOP_TS_LEN = 26;
	/**
	 * 	serialize this TarafxaSrcTaskStopTs
	 */
   protected void serializeTarafxaSrcTaskStopTs(char[] tarafxaSrcTaskStopTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaSrcTaskStopTs,0,getStringValue(),beginTarafxaSrcTaskStopTs,TARAFXA_SRC_TASK_STOP_TS_LEN);
       localTarafxaSrcTaskStopTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaSrcTaskStopTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxaSrcTaskStopTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaSrcTaskStopTs() {	 
   		return (substring(getStringValue(),beginTarafxaSrcTaskStopTs,beginTarafxaSrcTaskStopTs + TARAFXA_SRC_TASK_STOP_TS_LEN));
   	}
     int localTarafxaTrgtLocEntNamCounter = -1;
     public boolean isTarafxaTrgtLocEntNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaTrgtLocEntNamCounter != sharedCounter;
         localTarafxaTrgtLocEntNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_TRGT_LOC_ENT_NAM_LEN = 10;
	/**
	 * 	serialize this TarafxaTrgtLocEntNam
	 */
   protected void serializeTarafxaTrgtLocEntNam(char[] tarafxaTrgtLocEntNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaTrgtLocEntNam,0,getStringValue(),beginTarafxaTrgtLocEntNam,TARAFXA_TRGT_LOC_ENT_NAM_LEN);
       localTarafxaTrgtLocEntNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaTrgtLocEntNamConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTarafxaTrgtLocEntNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaTrgtLocEntNam() {	 
   		return (substring(getStringValue(),beginTarafxaTrgtLocEntNam,beginTarafxaTrgtLocEntNam + TARAFXA_TRGT_LOC_ENT_NAM_LEN));
   	}
     int localTarafxaTrgtTaskNamCounter = -1;
     public boolean isTarafxaTrgtTaskNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaTrgtTaskNamCounter != sharedCounter;
         localTarafxaTrgtTaskNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_TRGT_TASK_NAM_LEN = 10;
	/**
	 * 	serialize this TarafxaTrgtTaskNam
	 */
   protected void serializeTarafxaTrgtTaskNam(char[] tarafxaTrgtTaskNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaTrgtTaskNam,0,getStringValue(),beginTarafxaTrgtTaskNam,TARAFXA_TRGT_TASK_NAM_LEN);
       localTarafxaTrgtTaskNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaTrgtTaskNamConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTarafxaTrgtTaskNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaTrgtTaskNam() {	 
   		return (substring(getStringValue(),beginTarafxaTrgtTaskNam,beginTarafxaTrgtTaskNam + TARAFXA_TRGT_TASK_NAM_LEN));
   	}
     int localTarafxaTrgtTaskIdCounter = -1;
     public boolean isTarafxaTrgtTaskIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaTrgtTaskIdCounter != sharedCounter;
         localTarafxaTrgtTaskIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_TRGT_TASK_ID_LEN = 13;
	/**
	 * 	serialize this TarafxaTrgtTaskId
	 */
   protected void serializeTarafxaTrgtTaskId(char[] tarafxaTrgtTaskId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaTrgtTaskId,0,getStringValue(),beginTarafxaTrgtTaskId,TARAFXA_TRGT_TASK_ID_LEN);
       localTarafxaTrgtTaskIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaTrgtTaskIdConstraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
    /**
	 *	refreshTarafxaTrgtTaskId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaTrgtTaskId() {	 
   		return (substring(getStringValue(),beginTarafxaTrgtTaskId,beginTarafxaTrgtTaskId + TARAFXA_TRGT_TASK_ID_LEN));
   	}
     int localTarafxaTrgtTaskStrtTsCounter = -1;
     public boolean isTarafxaTrgtTaskStrtTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaTrgtTaskStrtTsCounter != sharedCounter;
         localTarafxaTrgtTaskStrtTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_TRGT_TASK_STRT_TS_LEN = 26;
	/**
	 * 	serialize this TarafxaTrgtTaskStrtTs
	 */
   protected void serializeTarafxaTrgtTaskStrtTs(char[] tarafxaTrgtTaskStrtTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaTrgtTaskStrtTs,0,getStringValue(),beginTarafxaTrgtTaskStrtTs,TARAFXA_TRGT_TASK_STRT_TS_LEN);
       localTarafxaTrgtTaskStrtTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaTrgtTaskStrtTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxaTrgtTaskStrtTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaTrgtTaskStrtTs() {	 
   		return (substring(getStringValue(),beginTarafxaTrgtTaskStrtTs,beginTarafxaTrgtTaskStrtTs + TARAFXA_TRGT_TASK_STRT_TS_LEN));
   	}
     int localTarafxaTrgtTaskStopTsCounter = -1;
     public boolean isTarafxaTrgtTaskStopTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaTrgtTaskStopTsCounter != sharedCounter;
         localTarafxaTrgtTaskStopTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_TRGT_TASK_STOP_TS_LEN = 26;
	/**
	 * 	serialize this TarafxaTrgtTaskStopTs
	 */
   protected void serializeTarafxaTrgtTaskStopTs(char[] tarafxaTrgtTaskStopTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaTrgtTaskStopTs,0,getStringValue(),beginTarafxaTrgtTaskStopTs,TARAFXA_TRGT_TASK_STOP_TS_LEN);
       localTarafxaTrgtTaskStopTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaTrgtTaskStopTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxaTrgtTaskStopTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaTrgtTaskStopTs() {	 
   		return (substring(getStringValue(),beginTarafxaTrgtTaskStopTs,beginTarafxaTrgtTaskStopTs + TARAFXA_TRGT_TASK_STOP_TS_LEN));
   	}




}
  

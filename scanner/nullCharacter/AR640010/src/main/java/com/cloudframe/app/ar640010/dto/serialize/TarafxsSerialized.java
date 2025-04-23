package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class TarafxsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class TarafxsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TarafxsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TARAFXS_LENGTH = 1163;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTarafxsMcMnfrmFileNam;
            protected  int beginTarafxsCyclNum;
            protected  int beginTarafxsBusPrtnrId;
            protected  int beginTarafxsEndptId;
            protected  int beginTarafxsXferMthdCd;
            protected  int beginTarafxsAvailTs;
            protected  int beginTarafxsBulkId;
            protected  int beginTarafxsStatCd;
            protected  int beginTarafxsSndRcvPrmsnCd;
            protected  int beginTarafxsMcibdioParmTxt;
            protected  int beginTarafxsPrtyNum;
            protected  int beginTarafxsArchLocTxt;
            protected  int beginTarafxsSvrFileStatCd;
            protected  int beginTarafxsLstStatTs;
            protected  int beginTarafxsXferFileSzNum;
            protected  int beginTarafxsTmsXferdCnt;
            protected  int beginTarafxsXferRecCnt;
            protected  int beginTarafxsXferRqstTs;
            protected  int beginTarafxsXferStrtTs;
            protected  int beginTarafxsXferStopTs;
            protected  int beginTarafxsXferRdyTs;
            protected  int beginTarafxsXferCondCd;
            protected  int beginTarafxsXferStatTxt;
            protected  int beginTarafxsXferPrcssId;
            protected  int beginTarafxsOrgXferPrcsId;
            protected  int beginTarafxsTrgrCondCd;
            protected  int beginTarafxsTrgrStatTxt;
            protected  int beginTarafxsOrgLocNam;
            protected  int beginTarafxsLstUpdtUserId;
            protected  int beginTarafxsLstUpdtTs;
            protected  int beginTarafxsTrgrActNam;
            protected  int beginTarafxsPrvMnfrmFileNam;
            protected  int beginTarafxsPrvCyclNum;
            protected  int beginTarafxsPrvBusPrtnrId;
            protected  int beginTarafxsPrvEndptId;
            protected  int beginTarafxsPrvAvailTs;
            protected  int beginTarafxsNxtMnfrmFileNam;
            protected  int beginTarafxsNxtCyclNum;
            protected  int beginTarafxsNxtBusPrtnrId;
            protected  int beginTarafxsNxtEndptId;
            protected  int beginTarafxsNxtAvailTs;
            protected  int beginTarafxsApplExitJobNam;
            protected  int beginTarafxsApplExitTs;
            protected  int beginTarafxsCsMipId;
            protected  int beginTarafxsRmMipId;
            protected  int beginTarafxsApplExitNam;
            protected  int beginTarafxsTapeCmpltdSw;
            protected  int beginTarafxsTapeMultVolSw;
            protected  int beginTarafxsApplPrcssngDt;
            protected  int beginTarafxsTransitionalDsn;
            protected  int beginTarafxsSourceHubId;
            protected  int beginTarafxsOwningHubId;
            protected  int beginTarafxsStatRefId;
            protected  int beginTarafxsSrcLocEntNam;
            protected  int beginTarafxsSrcTaskNam;
            protected  int beginTarafxsSrcTaskId;
            protected  int beginTarafxsSrcTaskStrtTs;
            protected  int beginTarafxsSrcTaskStopTs;
            protected  int beginTarafxsTrgtLocEntNam;
            protected  int beginTarafxsTrgtTaskNam;
            protected  int beginTarafxsTrgtTaskId;
            protected  int beginTarafxsTrgtTaskStrtTs;
            protected  int beginTarafxsTrgtTaskStopTs;
	
	/**
	* Constructor for TarafxsSerialized
	**/
    public TarafxsSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TarafxsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TARAFXS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTarafxsMcMnfrmFileNam = getStartOffset() + 0;	// set offset for serialization
  
             beginTarafxsCyclNum = getStartOffset() + 44;	// set offset for serialization
  
             beginTarafxsBusPrtnrId = getStartOffset() + 46;	// set offset for serialization
  
             beginTarafxsEndptId = getStartOffset() + 52;	// set offset for serialization
  
             beginTarafxsXferMthdCd = getStartOffset() + 59;	// set offset for serialization
  
             beginTarafxsAvailTs = getStartOffset() + 60;	// set offset for serialization
  
             beginTarafxsBulkId = getStartOffset() + 86;	// set offset for serialization
  
             beginTarafxsStatCd = getStartOffset() + 90;	// set offset for serialization
  
             beginTarafxsSndRcvPrmsnCd = getStartOffset() + 91;	// set offset for serialization
  
             beginTarafxsMcibdioParmTxt = getStartOffset() + 92;	// set offset for serialization
  
             beginTarafxsPrtyNum = getStartOffset() + 142;	// set offset for serialization
  
             beginTarafxsArchLocTxt = getStartOffset() + 144;	// set offset for serialization
  
             beginTarafxsSvrFileStatCd = getStartOffset() + 188;	// set offset for serialization
  
             beginTarafxsLstStatTs = getStartOffset() + 189;	// set offset for serialization
  
             beginTarafxsXferFileSzNum = getStartOffset() + 215;	// set offset for serialization
  
             beginTarafxsTmsXferdCnt = getStartOffset() + 222;	// set offset for serialization
  
             beginTarafxsXferRecCnt = getStartOffset() + 225;	// set offset for serialization
  
             beginTarafxsXferRqstTs = getStartOffset() + 232;	// set offset for serialization
  
             beginTarafxsXferStrtTs = getStartOffset() + 258;	// set offset for serialization
  
             beginTarafxsXferStopTs = getStartOffset() + 284;	// set offset for serialization
  
             beginTarafxsXferRdyTs = getStartOffset() + 310;	// set offset for serialization
  
             beginTarafxsXferCondCd = getStartOffset() + 336;	// set offset for serialization
  
             beginTarafxsXferStatTxt = getStartOffset() + 345;	// set offset for serialization
  
             beginTarafxsXferPrcssId = getStartOffset() + 354;	// set offset for serialization
  
             beginTarafxsOrgXferPrcsId = getStartOffset() + 361;	// set offset for serialization
  
             beginTarafxsTrgrCondCd = getStartOffset() + 368;	// set offset for serialization
  
             beginTarafxsTrgrStatTxt = getStartOffset() + 369;	// set offset for serialization
  
             beginTarafxsOrgLocNam = getStartOffset() + 378;	// set offset for serialization
  
             beginTarafxsLstUpdtUserId = getStartOffset() + 394;	// set offset for serialization
  
             beginTarafxsLstUpdtTs = getStartOffset() + 403;	// set offset for serialization
  
             beginTarafxsTrgrActNam = getStartOffset() + 429;	// set offset for serialization
  
             beginTarafxsPrvMnfrmFileNam = getStartOffset() + 437;	// set offset for serialization
  
             beginTarafxsPrvCyclNum = getStartOffset() + 481;	// set offset for serialization
  
             beginTarafxsPrvBusPrtnrId = getStartOffset() + 483;	// set offset for serialization
  
             beginTarafxsPrvEndptId = getStartOffset() + 489;	// set offset for serialization
  
             beginTarafxsPrvAvailTs = getStartOffset() + 496;	// set offset for serialization
  
             beginTarafxsNxtMnfrmFileNam = getStartOffset() + 522;	// set offset for serialization
  
             beginTarafxsNxtCyclNum = getStartOffset() + 566;	// set offset for serialization
  
             beginTarafxsNxtBusPrtnrId = getStartOffset() + 568;	// set offset for serialization
  
             beginTarafxsNxtEndptId = getStartOffset() + 574;	// set offset for serialization
  
             beginTarafxsNxtAvailTs = getStartOffset() + 581;	// set offset for serialization
  
             beginTarafxsApplExitJobNam = getStartOffset() + 607;	// set offset for serialization
  
             beginTarafxsApplExitTs = getStartOffset() + 615;	// set offset for serialization
  
             beginTarafxsCsMipId = getStartOffset() + 641;	// set offset for serialization
  
             beginTarafxsRmMipId = getStartOffset() + 644;	// set offset for serialization
  
             beginTarafxsApplExitNam = getStartOffset() + 647;	// set offset for serialization
  
             beginTarafxsTapeCmpltdSw = getStartOffset() + 655;	// set offset for serialization
  
             beginTarafxsTapeMultVolSw = getStartOffset() + 656;	// set offset for serialization
  
             beginTarafxsApplPrcssngDt = getStartOffset() + 657;	// set offset for serialization
  
             beginTarafxsTransitionalDsn = getStartOffset() + 667;	// set offset for serialization
  
             beginTarafxsSourceHubId = getStartOffset() + 711;	// set offset for serialization
  
             beginTarafxsOwningHubId = getStartOffset() + 719;	// set offset for serialization
  
             beginTarafxsStatRefId = getStartOffset() + 727;	// set offset for serialization
  
             beginTarafxsSrcLocEntNam = getStartOffset() + 731;	// set offset for serialization
  
             beginTarafxsSrcTaskNam = getStartOffset() + 741;	// set offset for serialization
  
             beginTarafxsSrcTaskId = getStartOffset() + 751;	// set offset for serialization
  
  
             beginTarafxsSrcTaskStrtTs = getStartOffset() + 830;	// set offset for serialization
  
             beginTarafxsSrcTaskStopTs = getStartOffset() + 856;	// set offset for serialization
  
             beginTarafxsTrgtLocEntNam = getStartOffset() + 882;	// set offset for serialization
  
             beginTarafxsTrgtTaskNam = getStartOffset() + 892;	// set offset for serialization
  
             beginTarafxsTrgtTaskId = getStartOffset() + 902;	// set offset for serialization
  
  
             beginTarafxsTrgtTaskStrtTs = getStartOffset() + 981;	// set offset for serialization
  
             beginTarafxsTrgtTaskStopTs = getStartOffset() + 1007;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localTarafxsMcMnfrmFileNamCounter = -1;
     public boolean isTarafxsMcMnfrmFileNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsMcMnfrmFileNamCounter != sharedCounter;
         localTarafxsMcMnfrmFileNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_MC_MNFRM_FILE_NAM_LEN = 44;
	/**
	 * 	serialize this TarafxsMcMnfrmFileNam
	 */
   protected void serializeTarafxsMcMnfrmFileNam(char[] tarafxsMcMnfrmFileNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsMcMnfrmFileNam,0,getStringValue(),beginTarafxsMcMnfrmFileNam,TARAFXS_MC_MNFRM_FILE_NAM_LEN);
       localTarafxsMcMnfrmFileNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsMcMnfrmFileNamConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshTarafxsMcMnfrmFileNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsMcMnfrmFileNam() {	 
   		return (substring(getStringValue(),beginTarafxsMcMnfrmFileNam,beginTarafxsMcMnfrmFileNam + TARAFXS_MC_MNFRM_FILE_NAM_LEN));
   	}
        int localTarafxsCyclNumCounter = -1;
        public boolean isTarafxsCyclNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTarafxsCyclNumCounter != sharedCounter;
           localTarafxsCyclNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean tarafxsCyclNumIsNumeric() {
	      return decimalIsNumeric(beginTarafxsCyclNum,TARAFXS_CYCL_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAFXS_CYCL_NUM_LEN = 2;
  	/**
	 * 	serializeTarafxsCyclNum
	 */
	protected void serializeTarafxsCyclNum(short tarafxsCyclNum) {
		   putDecimal(beginTarafxsCyclNum,tarafxsCyclNum,TARAFXS_CYCL_NUM_LEN,true);
   }
   

   protected short checkTarafxsCyclNumMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshTarafxsCyclNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsCyclNum() throws CFException {	
   	try { 
		 return (getShortDecimal(beginTarafxsCyclNum,TARAFXS_CYCL_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tarafxsCyclNum", beginTarafxsCyclNum,TARAFXS_CYCL_NUM_LEN);
     }
   	}
     int localTarafxsBusPrtnrIdCounter = -1;
     public boolean isTarafxsBusPrtnrIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsBusPrtnrIdCounter != sharedCounter;
         localTarafxsBusPrtnrIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_BUS_PRTNR_ID_LEN = 6;
	/**
	 * 	serialize this TarafxsBusPrtnrId
	 */
   protected void serializeTarafxsBusPrtnrId(char[] tarafxsBusPrtnrId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsBusPrtnrId,0,getStringValue(),beginTarafxsBusPrtnrId,TARAFXS_BUS_PRTNR_ID_LEN);
       localTarafxsBusPrtnrIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsBusPrtnrIdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTarafxsBusPrtnrId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsBusPrtnrId() {	 
   		return (substring(getStringValue(),beginTarafxsBusPrtnrId,beginTarafxsBusPrtnrId + TARAFXS_BUS_PRTNR_ID_LEN));
   	}
     int localTarafxsEndptIdCounter = -1;
     public boolean isTarafxsEndptIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsEndptIdCounter != sharedCounter;
         localTarafxsEndptIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_ENDPT_ID_LEN = 7;
	/**
	 * 	serialize this TarafxsEndptId
	 */
   protected void serializeTarafxsEndptId(char[] tarafxsEndptId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsEndptId,0,getStringValue(),beginTarafxsEndptId,TARAFXS_ENDPT_ID_LEN);
       localTarafxsEndptIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsEndptIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTarafxsEndptId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsEndptId() {	 
   		return (substring(getStringValue(),beginTarafxsEndptId,beginTarafxsEndptId + TARAFXS_ENDPT_ID_LEN));
   	}
     int localTarafxsXferMthdCdCounter = -1;
     public boolean isTarafxsXferMthdCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsXferMthdCdCounter != sharedCounter;
         localTarafxsXferMthdCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_XFER_MTHD_CD_LEN = 1;
	/**
	 * 	serialize this TarafxsXferMthdCd
	 */
   protected void serializeTarafxsXferMthdCd(char[] tarafxsXferMthdCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsXferMthdCd,0,getStringValue(),beginTarafxsXferMthdCd,TARAFXS_XFER_MTHD_CD_LEN);
       localTarafxsXferMthdCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsXferMthdCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTarafxsXferMthdCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsXferMthdCd() {	 
   		return (substring(getStringValue(),beginTarafxsXferMthdCd,beginTarafxsXferMthdCd + TARAFXS_XFER_MTHD_CD_LEN));
   	}
     int localTarafxsAvailTsCounter = -1;
     public boolean isTarafxsAvailTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsAvailTsCounter != sharedCounter;
         localTarafxsAvailTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_AVAIL_TS_LEN = 26;
	/**
	 * 	serialize this TarafxsAvailTs
	 */
   protected void serializeTarafxsAvailTs(char[] tarafxsAvailTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsAvailTs,0,getStringValue(),beginTarafxsAvailTs,TARAFXS_AVAIL_TS_LEN);
       localTarafxsAvailTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsAvailTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxsAvailTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsAvailTs() {	 
   		return (substring(getStringValue(),beginTarafxsAvailTs,beginTarafxsAvailTs + TARAFXS_AVAIL_TS_LEN));
   	}
     int localTarafxsBulkIdCounter = -1;
     public boolean isTarafxsBulkIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsBulkIdCounter != sharedCounter;
         localTarafxsBulkIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_BULK_ID_LEN = 4;
	/**
	 * 	serialize this TarafxsBulkId
	 */
   protected void serializeTarafxsBulkId(char[] tarafxsBulkId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsBulkId,0,getStringValue(),beginTarafxsBulkId,TARAFXS_BULK_ID_LEN);
       localTarafxsBulkIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsBulkIdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshTarafxsBulkId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsBulkId() {	 
   		return (substring(getStringValue(),beginTarafxsBulkId,beginTarafxsBulkId + TARAFXS_BULK_ID_LEN));
   	}
     int localTarafxsStatCdCounter = -1;
     public boolean isTarafxsStatCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsStatCdCounter != sharedCounter;
         localTarafxsStatCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_STAT_CD_LEN = 1;
	/**
	 * 	serialize this TarafxsStatCd
	 */
   protected void serializeTarafxsStatCd(char[] tarafxsStatCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsStatCd,0,getStringValue(),beginTarafxsStatCd,TARAFXS_STAT_CD_LEN);
       localTarafxsStatCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsStatCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTarafxsStatCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsStatCd() {	 
   		return (substring(getStringValue(),beginTarafxsStatCd,beginTarafxsStatCd + TARAFXS_STAT_CD_LEN));
   	}
     int localTarafxsSndRcvPrmsnCdCounter = -1;
     public boolean isTarafxsSndRcvPrmsnCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsSndRcvPrmsnCdCounter != sharedCounter;
         localTarafxsSndRcvPrmsnCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_SND_RCV_PRMSN_CD_LEN = 1;
	/**
	 * 	serialize this TarafxsSndRcvPrmsnCd
	 */
   protected void serializeTarafxsSndRcvPrmsnCd(char[] tarafxsSndRcvPrmsnCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsSndRcvPrmsnCd,0,getStringValue(),beginTarafxsSndRcvPrmsnCd,TARAFXS_SND_RCV_PRMSN_CD_LEN);
       localTarafxsSndRcvPrmsnCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsSndRcvPrmsnCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTarafxsSndRcvPrmsnCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsSndRcvPrmsnCd() {	 
   		return (substring(getStringValue(),beginTarafxsSndRcvPrmsnCd,beginTarafxsSndRcvPrmsnCd + TARAFXS_SND_RCV_PRMSN_CD_LEN));
   	}
     int localTarafxsMcibdioParmTxtCounter = -1;
     public boolean isTarafxsMcibdioParmTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsMcibdioParmTxtCounter != sharedCounter;
         localTarafxsMcibdioParmTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_MCIBDIO_PARM_TXT_LEN = 50;
	/**
	 * 	serialize this TarafxsMcibdioParmTxt
	 */
   protected void serializeTarafxsMcibdioParmTxt(char[] tarafxsMcibdioParmTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsMcibdioParmTxt,0,getStringValue(),beginTarafxsMcibdioParmTxt,TARAFXS_MCIBDIO_PARM_TXT_LEN);
       localTarafxsMcibdioParmTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsMcibdioParmTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
    /**
	 *	refreshTarafxsMcibdioParmTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsMcibdioParmTxt() {	 
   		return (substring(getStringValue(),beginTarafxsMcibdioParmTxt,beginTarafxsMcibdioParmTxt + TARAFXS_MCIBDIO_PARM_TXT_LEN));
   	}
        int localTarafxsPrtyNumCounter = -1;
        public boolean isTarafxsPrtyNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTarafxsPrtyNumCounter != sharedCounter;
           localTarafxsPrtyNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean tarafxsPrtyNumIsNumeric() {
	      return decimalIsNumeric(beginTarafxsPrtyNum,TARAFXS_PRTY_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAFXS_PRTY_NUM_LEN = 2;
  	/**
	 * 	serializeTarafxsPrtyNum
	 */
	protected void serializeTarafxsPrtyNum(short tarafxsPrtyNum) {
		   putDecimal(beginTarafxsPrtyNum,tarafxsPrtyNum,TARAFXS_PRTY_NUM_LEN,true);
   }
   

   protected short checkTarafxsPrtyNumMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshTarafxsPrtyNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsPrtyNum() throws CFException {	
   	try { 
		 return (getShortDecimal(beginTarafxsPrtyNum,TARAFXS_PRTY_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tarafxsPrtyNum", beginTarafxsPrtyNum,TARAFXS_PRTY_NUM_LEN);
     }
   	}
     int localTarafxsArchLocTxtCounter = -1;
     public boolean isTarafxsArchLocTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsArchLocTxtCounter != sharedCounter;
         localTarafxsArchLocTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_ARCH_LOC_TXT_LEN = 44;
	/**
	 * 	serialize this TarafxsArchLocTxt
	 */
   protected void serializeTarafxsArchLocTxt(char[] tarafxsArchLocTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsArchLocTxt,0,getStringValue(),beginTarafxsArchLocTxt,TARAFXS_ARCH_LOC_TXT_LEN);
       localTarafxsArchLocTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsArchLocTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshTarafxsArchLocTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsArchLocTxt() {	 
   		return (substring(getStringValue(),beginTarafxsArchLocTxt,beginTarafxsArchLocTxt + TARAFXS_ARCH_LOC_TXT_LEN));
   	}
     int localTarafxsSvrFileStatCdCounter = -1;
     public boolean isTarafxsSvrFileStatCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsSvrFileStatCdCounter != sharedCounter;
         localTarafxsSvrFileStatCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_SVR_FILE_STAT_CD_LEN = 1;
	/**
	 * 	serialize this TarafxsSvrFileStatCd
	 */
   protected void serializeTarafxsSvrFileStatCd(char[] tarafxsSvrFileStatCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsSvrFileStatCd,0,getStringValue(),beginTarafxsSvrFileStatCd,TARAFXS_SVR_FILE_STAT_CD_LEN);
       localTarafxsSvrFileStatCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsSvrFileStatCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTarafxsSvrFileStatCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsSvrFileStatCd() {	 
   		return (substring(getStringValue(),beginTarafxsSvrFileStatCd,beginTarafxsSvrFileStatCd + TARAFXS_SVR_FILE_STAT_CD_LEN));
   	}
     int localTarafxsLstStatTsCounter = -1;
     public boolean isTarafxsLstStatTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsLstStatTsCounter != sharedCounter;
         localTarafxsLstStatTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_LST_STAT_TS_LEN = 26;
	/**
	 * 	serialize this TarafxsLstStatTs
	 */
   protected void serializeTarafxsLstStatTs(char[] tarafxsLstStatTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsLstStatTs,0,getStringValue(),beginTarafxsLstStatTs,TARAFXS_LST_STAT_TS_LEN);
       localTarafxsLstStatTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsLstStatTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxsLstStatTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsLstStatTs() {	 
   		return (substring(getStringValue(),beginTarafxsLstStatTs,beginTarafxsLstStatTs + TARAFXS_LST_STAT_TS_LEN));
   	}
        int localTarafxsXferFileSzNumCounter = -1;
        public boolean isTarafxsXferFileSzNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTarafxsXferFileSzNumCounter != sharedCounter;
           localTarafxsXferFileSzNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean tarafxsXferFileSzNumIsNumeric() {
	      return decimalIsNumeric(beginTarafxsXferFileSzNum,TARAFXS_XFER_FILE_SZ_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAFXS_XFER_FILE_SZ_NUM_LEN = 7;
  	/**
	 * 	serializeTarafxsXferFileSzNum
	 */
	protected void serializeTarafxsXferFileSzNum(long tarafxsXferFileSzNum) {
		   putDecimal(beginTarafxsXferFileSzNum,tarafxsXferFileSzNum,TARAFXS_XFER_FILE_SZ_NUM_LEN,true);
   }
   

   protected long checkTarafxsXferFileSzNumMaxLimit(long number) {
        return checkMaxLimit(number , MAX_10T /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTarafxsXferFileSzNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTarafxsXferFileSzNum() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTarafxsXferFileSzNum,TARAFXS_XFER_FILE_SZ_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tarafxsXferFileSzNum", beginTarafxsXferFileSzNum,TARAFXS_XFER_FILE_SZ_NUM_LEN);
     }
   	}
        int localTarafxsTmsXferdCntCounter = -1;
        public boolean isTarafxsTmsXferdCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTarafxsTmsXferdCntCounter != sharedCounter;
           localTarafxsTmsXferdCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean tarafxsTmsXferdCntIsNumeric() {
	      return decimalIsNumeric(beginTarafxsTmsXferdCnt,TARAFXS_TMS_XFERD_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAFXS_TMS_XFERD_CNT_LEN = 3;
  	/**
	 * 	serializeTarafxsTmsXferdCnt
	 */
	protected void serializeTarafxsTmsXferdCnt(int tarafxsTmsXferdCnt) {
		   putDecimal(beginTarafxsTmsXferdCnt,tarafxsTmsXferdCnt,TARAFXS_TMS_XFERD_CNT_LEN,true);
   }
   

   protected int checkTarafxsTmsXferdCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100K /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTarafxsTmsXferdCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTarafxsTmsXferdCnt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTarafxsTmsXferdCnt,TARAFXS_TMS_XFERD_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tarafxsTmsXferdCnt", beginTarafxsTmsXferdCnt,TARAFXS_TMS_XFERD_CNT_LEN);
     }
   	}
        int localTarafxsXferRecCntCounter = -1;
        public boolean isTarafxsXferRecCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTarafxsXferRecCntCounter != sharedCounter;
           localTarafxsXferRecCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean tarafxsXferRecCntIsNumeric() {
	      return decimalIsNumeric(beginTarafxsXferRecCnt,TARAFXS_XFER_REC_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAFXS_XFER_REC_CNT_LEN = 7;
  	/**
	 * 	serializeTarafxsXferRecCnt
	 */
	protected void serializeTarafxsXferRecCnt(long tarafxsXferRecCnt) {
		   putDecimal(beginTarafxsXferRecCnt,tarafxsXferRecCnt,TARAFXS_XFER_REC_CNT_LEN,true);
   }
   

   protected long checkTarafxsXferRecCntMaxLimit(long number) {
        return checkMaxLimit(number , MAX_10T /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTarafxsXferRecCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTarafxsXferRecCnt() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTarafxsXferRecCnt,TARAFXS_XFER_REC_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tarafxsXferRecCnt", beginTarafxsXferRecCnt,TARAFXS_XFER_REC_CNT_LEN);
     }
   	}
     int localTarafxsXferRqstTsCounter = -1;
     public boolean isTarafxsXferRqstTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsXferRqstTsCounter != sharedCounter;
         localTarafxsXferRqstTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_XFER_RQST_TS_LEN = 26;
	/**
	 * 	serialize this TarafxsXferRqstTs
	 */
   protected void serializeTarafxsXferRqstTs(char[] tarafxsXferRqstTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsXferRqstTs,0,getStringValue(),beginTarafxsXferRqstTs,TARAFXS_XFER_RQST_TS_LEN);
       localTarafxsXferRqstTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsXferRqstTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxsXferRqstTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsXferRqstTs() {	 
   		return (substring(getStringValue(),beginTarafxsXferRqstTs,beginTarafxsXferRqstTs + TARAFXS_XFER_RQST_TS_LEN));
   	}
     int localTarafxsXferStrtTsCounter = -1;
     public boolean isTarafxsXferStrtTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsXferStrtTsCounter != sharedCounter;
         localTarafxsXferStrtTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_XFER_STRT_TS_LEN = 26;
	/**
	 * 	serialize this TarafxsXferStrtTs
	 */
   protected void serializeTarafxsXferStrtTs(char[] tarafxsXferStrtTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsXferStrtTs,0,getStringValue(),beginTarafxsXferStrtTs,TARAFXS_XFER_STRT_TS_LEN);
       localTarafxsXferStrtTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsXferStrtTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxsXferStrtTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsXferStrtTs() {	 
   		return (substring(getStringValue(),beginTarafxsXferStrtTs,beginTarafxsXferStrtTs + TARAFXS_XFER_STRT_TS_LEN));
   	}
     int localTarafxsXferStopTsCounter = -1;
     public boolean isTarafxsXferStopTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsXferStopTsCounter != sharedCounter;
         localTarafxsXferStopTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_XFER_STOP_TS_LEN = 26;
	/**
	 * 	serialize this TarafxsXferStopTs
	 */
   protected void serializeTarafxsXferStopTs(char[] tarafxsXferStopTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsXferStopTs,0,getStringValue(),beginTarafxsXferStopTs,TARAFXS_XFER_STOP_TS_LEN);
       localTarafxsXferStopTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsXferStopTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxsXferStopTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsXferStopTs() {	 
   		return (substring(getStringValue(),beginTarafxsXferStopTs,beginTarafxsXferStopTs + TARAFXS_XFER_STOP_TS_LEN));
   	}
     int localTarafxsXferRdyTsCounter = -1;
     public boolean isTarafxsXferRdyTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsXferRdyTsCounter != sharedCounter;
         localTarafxsXferRdyTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_XFER_RDY_TS_LEN = 26;
	/**
	 * 	serialize this TarafxsXferRdyTs
	 */
   protected void serializeTarafxsXferRdyTs(char[] tarafxsXferRdyTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsXferRdyTs,0,getStringValue(),beginTarafxsXferRdyTs,TARAFXS_XFER_RDY_TS_LEN);
       localTarafxsXferRdyTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsXferRdyTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxsXferRdyTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsXferRdyTs() {	 
   		return (substring(getStringValue(),beginTarafxsXferRdyTs,beginTarafxsXferRdyTs + TARAFXS_XFER_RDY_TS_LEN));
   	}
     int localTarafxsXferCondCdCounter = -1;
     public boolean isTarafxsXferCondCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsXferCondCdCounter != sharedCounter;
         localTarafxsXferCondCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_XFER_COND_CD_LEN = 9;
	/**
	 * 	serialize this TarafxsXferCondCd
	 */
   protected void serializeTarafxsXferCondCd(char[] tarafxsXferCondCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsXferCondCd,0,getStringValue(),beginTarafxsXferCondCd,TARAFXS_XFER_COND_CD_LEN);
       localTarafxsXferCondCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsXferCondCdConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshTarafxsXferCondCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsXferCondCd() {	 
   		return (substring(getStringValue(),beginTarafxsXferCondCd,beginTarafxsXferCondCd + TARAFXS_XFER_COND_CD_LEN));
   	}
     int localTarafxsXferStatTxtCounter = -1;
     public boolean isTarafxsXferStatTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsXferStatTxtCounter != sharedCounter;
         localTarafxsXferStatTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_XFER_STAT_TXT_LEN = 9;
	/**
	 * 	serialize this TarafxsXferStatTxt
	 */
   protected void serializeTarafxsXferStatTxt(char[] tarafxsXferStatTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsXferStatTxt,0,getStringValue(),beginTarafxsXferStatTxt,TARAFXS_XFER_STAT_TXT_LEN);
       localTarafxsXferStatTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsXferStatTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshTarafxsXferStatTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsXferStatTxt() {	 
   		return (substring(getStringValue(),beginTarafxsXferStatTxt,beginTarafxsXferStatTxt + TARAFXS_XFER_STAT_TXT_LEN));
   	}
        int localTarafxsXferPrcssIdCounter = -1;
        public boolean isTarafxsXferPrcssIdModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTarafxsXferPrcssIdCounter != sharedCounter;
           localTarafxsXferPrcssIdCounter = sharedCounter; return hasModified; 
        }
	    public boolean tarafxsXferPrcssIdIsNumeric() {
	      return decimalIsNumeric(beginTarafxsXferPrcssId,TARAFXS_XFER_PRCSS_ID_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAFXS_XFER_PRCSS_ID_LEN = 7;
  	/**
	 * 	serializeTarafxsXferPrcssId
	 */
	protected void serializeTarafxsXferPrcssId(long tarafxsXferPrcssId) {
		   putDecimal(beginTarafxsXferPrcssId,tarafxsXferPrcssId,TARAFXS_XFER_PRCSS_ID_LEN,true);
   }
   

   protected long checkTarafxsXferPrcssIdMaxLimit(long number) {
        return checkMaxLimit(number , MAX_10T /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTarafxsXferPrcssId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTarafxsXferPrcssId() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTarafxsXferPrcssId,TARAFXS_XFER_PRCSS_ID_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tarafxsXferPrcssId", beginTarafxsXferPrcssId,TARAFXS_XFER_PRCSS_ID_LEN);
     }
   	}
        int localTarafxsOrgXferPrcsIdCounter = -1;
        public boolean isTarafxsOrgXferPrcsIdModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTarafxsOrgXferPrcsIdCounter != sharedCounter;
           localTarafxsOrgXferPrcsIdCounter = sharedCounter; return hasModified; 
        }
	    public boolean tarafxsOrgXferPrcsIdIsNumeric() {
	      return decimalIsNumeric(beginTarafxsOrgXferPrcsId,TARAFXS_ORG_XFER_PRCS_ID_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAFXS_ORG_XFER_PRCS_ID_LEN = 7;
  	/**
	 * 	serializeTarafxsOrgXferPrcsId
	 */
	protected void serializeTarafxsOrgXferPrcsId(long tarafxsOrgXferPrcsId) {
		   putDecimal(beginTarafxsOrgXferPrcsId,tarafxsOrgXferPrcsId,TARAFXS_ORG_XFER_PRCS_ID_LEN,true);
   }
   

   protected long checkTarafxsOrgXferPrcsIdMaxLimit(long number) {
        return checkMaxLimit(number , MAX_10T /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTarafxsOrgXferPrcsId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTarafxsOrgXferPrcsId() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTarafxsOrgXferPrcsId,TARAFXS_ORG_XFER_PRCS_ID_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tarafxsOrgXferPrcsId", beginTarafxsOrgXferPrcsId,TARAFXS_ORG_XFER_PRCS_ID_LEN);
     }
   	}
     int localTarafxsTrgrCondCdCounter = -1;
     public boolean isTarafxsTrgrCondCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsTrgrCondCdCounter != sharedCounter;
         localTarafxsTrgrCondCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_TRGR_COND_CD_LEN = 1;
	/**
	 * 	serialize this TarafxsTrgrCondCd
	 */
   protected void serializeTarafxsTrgrCondCd(char[] tarafxsTrgrCondCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsTrgrCondCd,0,getStringValue(),beginTarafxsTrgrCondCd,TARAFXS_TRGR_COND_CD_LEN);
       localTarafxsTrgrCondCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsTrgrCondCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTarafxsTrgrCondCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsTrgrCondCd() {	 
   		return (substring(getStringValue(),beginTarafxsTrgrCondCd,beginTarafxsTrgrCondCd + TARAFXS_TRGR_COND_CD_LEN));
   	}
     int localTarafxsTrgrStatTxtCounter = -1;
     public boolean isTarafxsTrgrStatTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsTrgrStatTxtCounter != sharedCounter;
         localTarafxsTrgrStatTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_TRGR_STAT_TXT_LEN = 9;
	/**
	 * 	serialize this TarafxsTrgrStatTxt
	 */
   protected void serializeTarafxsTrgrStatTxt(char[] tarafxsTrgrStatTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsTrgrStatTxt,0,getStringValue(),beginTarafxsTrgrStatTxt,TARAFXS_TRGR_STAT_TXT_LEN);
       localTarafxsTrgrStatTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsTrgrStatTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshTarafxsTrgrStatTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsTrgrStatTxt() {	 
   		return (substring(getStringValue(),beginTarafxsTrgrStatTxt,beginTarafxsTrgrStatTxt + TARAFXS_TRGR_STAT_TXT_LEN));
   	}
     int localTarafxsOrgLocNamCounter = -1;
     public boolean isTarafxsOrgLocNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsOrgLocNamCounter != sharedCounter;
         localTarafxsOrgLocNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_ORG_LOC_NAM_LEN = 16;
	/**
	 * 	serialize this TarafxsOrgLocNam
	 */
   protected void serializeTarafxsOrgLocNam(char[] tarafxsOrgLocNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsOrgLocNam,0,getStringValue(),beginTarafxsOrgLocNam,TARAFXS_ORG_LOC_NAM_LEN);
       localTarafxsOrgLocNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsOrgLocNamConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshTarafxsOrgLocNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsOrgLocNam() {	 
   		return (substring(getStringValue(),beginTarafxsOrgLocNam,beginTarafxsOrgLocNam + TARAFXS_ORG_LOC_NAM_LEN));
   	}
     int localTarafxsLstUpdtUserIdCounter = -1;
     public boolean isTarafxsLstUpdtUserIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsLstUpdtUserIdCounter != sharedCounter;
         localTarafxsLstUpdtUserIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_LST_UPDT_USER_ID_LEN = 9;
	/**
	 * 	serialize this TarafxsLstUpdtUserId
	 */
   protected void serializeTarafxsLstUpdtUserId(char[] tarafxsLstUpdtUserId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsLstUpdtUserId,0,getStringValue(),beginTarafxsLstUpdtUserId,TARAFXS_LST_UPDT_USER_ID_LEN);
       localTarafxsLstUpdtUserIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsLstUpdtUserIdConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshTarafxsLstUpdtUserId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsLstUpdtUserId() {	 
   		return (substring(getStringValue(),beginTarafxsLstUpdtUserId,beginTarafxsLstUpdtUserId + TARAFXS_LST_UPDT_USER_ID_LEN));
   	}
     int localTarafxsLstUpdtTsCounter = -1;
     public boolean isTarafxsLstUpdtTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsLstUpdtTsCounter != sharedCounter;
         localTarafxsLstUpdtTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_LST_UPDT_TS_LEN = 26;
	/**
	 * 	serialize this TarafxsLstUpdtTs
	 */
   protected void serializeTarafxsLstUpdtTs(char[] tarafxsLstUpdtTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsLstUpdtTs,0,getStringValue(),beginTarafxsLstUpdtTs,TARAFXS_LST_UPDT_TS_LEN);
       localTarafxsLstUpdtTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsLstUpdtTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxsLstUpdtTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsLstUpdtTs() {	 
   		return (substring(getStringValue(),beginTarafxsLstUpdtTs,beginTarafxsLstUpdtTs + TARAFXS_LST_UPDT_TS_LEN));
   	}
     int localTarafxsTrgrActNamCounter = -1;
     public boolean isTarafxsTrgrActNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsTrgrActNamCounter != sharedCounter;
         localTarafxsTrgrActNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_TRGR_ACT_NAM_LEN = 8;
	/**
	 * 	serialize this TarafxsTrgrActNam
	 */
   protected void serializeTarafxsTrgrActNam(char[] tarafxsTrgrActNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsTrgrActNam,0,getStringValue(),beginTarafxsTrgrActNam,TARAFXS_TRGR_ACT_NAM_LEN);
       localTarafxsTrgrActNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsTrgrActNamConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshTarafxsTrgrActNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsTrgrActNam() {	 
   		return (substring(getStringValue(),beginTarafxsTrgrActNam,beginTarafxsTrgrActNam + TARAFXS_TRGR_ACT_NAM_LEN));
   	}
     int localTarafxsPrvMnfrmFileNamCounter = -1;
     public boolean isTarafxsPrvMnfrmFileNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsPrvMnfrmFileNamCounter != sharedCounter;
         localTarafxsPrvMnfrmFileNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_PRV_MNFRM_FILE_NAM_LEN = 44;
	/**
	 * 	serialize this TarafxsPrvMnfrmFileNam
	 */
   protected void serializeTarafxsPrvMnfrmFileNam(char[] tarafxsPrvMnfrmFileNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsPrvMnfrmFileNam,0,getStringValue(),beginTarafxsPrvMnfrmFileNam,TARAFXS_PRV_MNFRM_FILE_NAM_LEN);
       localTarafxsPrvMnfrmFileNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsPrvMnfrmFileNamConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshTarafxsPrvMnfrmFileNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsPrvMnfrmFileNam() {	 
   		return (substring(getStringValue(),beginTarafxsPrvMnfrmFileNam,beginTarafxsPrvMnfrmFileNam + TARAFXS_PRV_MNFRM_FILE_NAM_LEN));
   	}
        int localTarafxsPrvCyclNumCounter = -1;
        public boolean isTarafxsPrvCyclNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTarafxsPrvCyclNumCounter != sharedCounter;
           localTarafxsPrvCyclNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean tarafxsPrvCyclNumIsNumeric() {
	      return decimalIsNumeric(beginTarafxsPrvCyclNum,TARAFXS_PRV_CYCL_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAFXS_PRV_CYCL_NUM_LEN = 2;
  	/**
	 * 	serializeTarafxsPrvCyclNum
	 */
	protected void serializeTarafxsPrvCyclNum(short tarafxsPrvCyclNum) {
		   putDecimal(beginTarafxsPrvCyclNum,tarafxsPrvCyclNum,TARAFXS_PRV_CYCL_NUM_LEN,true);
   }
   

   protected short checkTarafxsPrvCyclNumMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshTarafxsPrvCyclNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsPrvCyclNum() throws CFException {	
   	try { 
		 return (getShortDecimal(beginTarafxsPrvCyclNum,TARAFXS_PRV_CYCL_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tarafxsPrvCyclNum", beginTarafxsPrvCyclNum,TARAFXS_PRV_CYCL_NUM_LEN);
     }
   	}
     int localTarafxsPrvBusPrtnrIdCounter = -1;
     public boolean isTarafxsPrvBusPrtnrIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsPrvBusPrtnrIdCounter != sharedCounter;
         localTarafxsPrvBusPrtnrIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_PRV_BUS_PRTNR_ID_LEN = 6;
	/**
	 * 	serialize this TarafxsPrvBusPrtnrId
	 */
   protected void serializeTarafxsPrvBusPrtnrId(char[] tarafxsPrvBusPrtnrId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsPrvBusPrtnrId,0,getStringValue(),beginTarafxsPrvBusPrtnrId,TARAFXS_PRV_BUS_PRTNR_ID_LEN);
       localTarafxsPrvBusPrtnrIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsPrvBusPrtnrIdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTarafxsPrvBusPrtnrId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsPrvBusPrtnrId() {	 
   		return (substring(getStringValue(),beginTarafxsPrvBusPrtnrId,beginTarafxsPrvBusPrtnrId + TARAFXS_PRV_BUS_PRTNR_ID_LEN));
   	}
     int localTarafxsPrvEndptIdCounter = -1;
     public boolean isTarafxsPrvEndptIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsPrvEndptIdCounter != sharedCounter;
         localTarafxsPrvEndptIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_PRV_ENDPT_ID_LEN = 7;
	/**
	 * 	serialize this TarafxsPrvEndptId
	 */
   protected void serializeTarafxsPrvEndptId(char[] tarafxsPrvEndptId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsPrvEndptId,0,getStringValue(),beginTarafxsPrvEndptId,TARAFXS_PRV_ENDPT_ID_LEN);
       localTarafxsPrvEndptIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsPrvEndptIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTarafxsPrvEndptId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsPrvEndptId() {	 
   		return (substring(getStringValue(),beginTarafxsPrvEndptId,beginTarafxsPrvEndptId + TARAFXS_PRV_ENDPT_ID_LEN));
   	}
     int localTarafxsPrvAvailTsCounter = -1;
     public boolean isTarafxsPrvAvailTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsPrvAvailTsCounter != sharedCounter;
         localTarafxsPrvAvailTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_PRV_AVAIL_TS_LEN = 26;
	/**
	 * 	serialize this TarafxsPrvAvailTs
	 */
   protected void serializeTarafxsPrvAvailTs(char[] tarafxsPrvAvailTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsPrvAvailTs,0,getStringValue(),beginTarafxsPrvAvailTs,TARAFXS_PRV_AVAIL_TS_LEN);
       localTarafxsPrvAvailTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsPrvAvailTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxsPrvAvailTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsPrvAvailTs() {	 
   		return (substring(getStringValue(),beginTarafxsPrvAvailTs,beginTarafxsPrvAvailTs + TARAFXS_PRV_AVAIL_TS_LEN));
   	}
     int localTarafxsNxtMnfrmFileNamCounter = -1;
     public boolean isTarafxsNxtMnfrmFileNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsNxtMnfrmFileNamCounter != sharedCounter;
         localTarafxsNxtMnfrmFileNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_NXT_MNFRM_FILE_NAM_LEN = 44;
	/**
	 * 	serialize this TarafxsNxtMnfrmFileNam
	 */
   protected void serializeTarafxsNxtMnfrmFileNam(char[] tarafxsNxtMnfrmFileNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsNxtMnfrmFileNam,0,getStringValue(),beginTarafxsNxtMnfrmFileNam,TARAFXS_NXT_MNFRM_FILE_NAM_LEN);
       localTarafxsNxtMnfrmFileNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsNxtMnfrmFileNamConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshTarafxsNxtMnfrmFileNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsNxtMnfrmFileNam() {	 
   		return (substring(getStringValue(),beginTarafxsNxtMnfrmFileNam,beginTarafxsNxtMnfrmFileNam + TARAFXS_NXT_MNFRM_FILE_NAM_LEN));
   	}
        int localTarafxsNxtCyclNumCounter = -1;
        public boolean isTarafxsNxtCyclNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTarafxsNxtCyclNumCounter != sharedCounter;
           localTarafxsNxtCyclNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean tarafxsNxtCyclNumIsNumeric() {
	      return decimalIsNumeric(beginTarafxsNxtCyclNum,TARAFXS_NXT_CYCL_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAFXS_NXT_CYCL_NUM_LEN = 2;
  	/**
	 * 	serializeTarafxsNxtCyclNum
	 */
	protected void serializeTarafxsNxtCyclNum(short tarafxsNxtCyclNum) {
		   putDecimal(beginTarafxsNxtCyclNum,tarafxsNxtCyclNum,TARAFXS_NXT_CYCL_NUM_LEN,true);
   }
   

   protected short checkTarafxsNxtCyclNumMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshTarafxsNxtCyclNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsNxtCyclNum() throws CFException {	
   	try { 
		 return (getShortDecimal(beginTarafxsNxtCyclNum,TARAFXS_NXT_CYCL_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tarafxsNxtCyclNum", beginTarafxsNxtCyclNum,TARAFXS_NXT_CYCL_NUM_LEN);
     }
   	}
     int localTarafxsNxtBusPrtnrIdCounter = -1;
     public boolean isTarafxsNxtBusPrtnrIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsNxtBusPrtnrIdCounter != sharedCounter;
         localTarafxsNxtBusPrtnrIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_NXT_BUS_PRTNR_ID_LEN = 6;
	/**
	 * 	serialize this TarafxsNxtBusPrtnrId
	 */
   protected void serializeTarafxsNxtBusPrtnrId(char[] tarafxsNxtBusPrtnrId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsNxtBusPrtnrId,0,getStringValue(),beginTarafxsNxtBusPrtnrId,TARAFXS_NXT_BUS_PRTNR_ID_LEN);
       localTarafxsNxtBusPrtnrIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsNxtBusPrtnrIdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTarafxsNxtBusPrtnrId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsNxtBusPrtnrId() {	 
   		return (substring(getStringValue(),beginTarafxsNxtBusPrtnrId,beginTarafxsNxtBusPrtnrId + TARAFXS_NXT_BUS_PRTNR_ID_LEN));
   	}
     int localTarafxsNxtEndptIdCounter = -1;
     public boolean isTarafxsNxtEndptIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsNxtEndptIdCounter != sharedCounter;
         localTarafxsNxtEndptIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_NXT_ENDPT_ID_LEN = 7;
	/**
	 * 	serialize this TarafxsNxtEndptId
	 */
   protected void serializeTarafxsNxtEndptId(char[] tarafxsNxtEndptId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsNxtEndptId,0,getStringValue(),beginTarafxsNxtEndptId,TARAFXS_NXT_ENDPT_ID_LEN);
       localTarafxsNxtEndptIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsNxtEndptIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTarafxsNxtEndptId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsNxtEndptId() {	 
   		return (substring(getStringValue(),beginTarafxsNxtEndptId,beginTarafxsNxtEndptId + TARAFXS_NXT_ENDPT_ID_LEN));
   	}
     int localTarafxsNxtAvailTsCounter = -1;
     public boolean isTarafxsNxtAvailTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsNxtAvailTsCounter != sharedCounter;
         localTarafxsNxtAvailTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_NXT_AVAIL_TS_LEN = 26;
	/**
	 * 	serialize this TarafxsNxtAvailTs
	 */
   protected void serializeTarafxsNxtAvailTs(char[] tarafxsNxtAvailTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsNxtAvailTs,0,getStringValue(),beginTarafxsNxtAvailTs,TARAFXS_NXT_AVAIL_TS_LEN);
       localTarafxsNxtAvailTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsNxtAvailTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxsNxtAvailTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsNxtAvailTs() {	 
   		return (substring(getStringValue(),beginTarafxsNxtAvailTs,beginTarafxsNxtAvailTs + TARAFXS_NXT_AVAIL_TS_LEN));
   	}
     int localTarafxsApplExitJobNamCounter = -1;
     public boolean isTarafxsApplExitJobNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsApplExitJobNamCounter != sharedCounter;
         localTarafxsApplExitJobNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_APPL_EXIT_JOB_NAM_LEN = 8;
	/**
	 * 	serialize this TarafxsApplExitJobNam
	 */
   protected void serializeTarafxsApplExitJobNam(char[] tarafxsApplExitJobNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsApplExitJobNam,0,getStringValue(),beginTarafxsApplExitJobNam,TARAFXS_APPL_EXIT_JOB_NAM_LEN);
       localTarafxsApplExitJobNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsApplExitJobNamConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshTarafxsApplExitJobNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsApplExitJobNam() {	 
   		return (substring(getStringValue(),beginTarafxsApplExitJobNam,beginTarafxsApplExitJobNam + TARAFXS_APPL_EXIT_JOB_NAM_LEN));
   	}
     int localTarafxsApplExitTsCounter = -1;
     public boolean isTarafxsApplExitTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsApplExitTsCounter != sharedCounter;
         localTarafxsApplExitTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_APPL_EXIT_TS_LEN = 26;
	/**
	 * 	serialize this TarafxsApplExitTs
	 */
   protected void serializeTarafxsApplExitTs(char[] tarafxsApplExitTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsApplExitTs,0,getStringValue(),beginTarafxsApplExitTs,TARAFXS_APPL_EXIT_TS_LEN);
       localTarafxsApplExitTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsApplExitTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxsApplExitTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsApplExitTs() {	 
   		return (substring(getStringValue(),beginTarafxsApplExitTs,beginTarafxsApplExitTs + TARAFXS_APPL_EXIT_TS_LEN));
   	}
     int localTarafxsCsMipIdCounter = -1;
     public boolean isTarafxsCsMipIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsCsMipIdCounter != sharedCounter;
         localTarafxsCsMipIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_CS_MIP_ID_LEN = 3;
	/**
	 * 	serialize this TarafxsCsMipId
	 */
   protected void serializeTarafxsCsMipId(char[] tarafxsCsMipId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsCsMipId,0,getStringValue(),beginTarafxsCsMipId,TARAFXS_CS_MIP_ID_LEN);
       localTarafxsCsMipIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsCsMipIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshTarafxsCsMipId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsCsMipId() {	 
   		return (substring(getStringValue(),beginTarafxsCsMipId,beginTarafxsCsMipId + TARAFXS_CS_MIP_ID_LEN));
   	}
     int localTarafxsRmMipIdCounter = -1;
     public boolean isTarafxsRmMipIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsRmMipIdCounter != sharedCounter;
         localTarafxsRmMipIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_RM_MIP_ID_LEN = 3;
	/**
	 * 	serialize this TarafxsRmMipId
	 */
   protected void serializeTarafxsRmMipId(char[] tarafxsRmMipId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsRmMipId,0,getStringValue(),beginTarafxsRmMipId,TARAFXS_RM_MIP_ID_LEN);
       localTarafxsRmMipIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsRmMipIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshTarafxsRmMipId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsRmMipId() {	 
   		return (substring(getStringValue(),beginTarafxsRmMipId,beginTarafxsRmMipId + TARAFXS_RM_MIP_ID_LEN));
   	}
     int localTarafxsApplExitNamCounter = -1;
     public boolean isTarafxsApplExitNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsApplExitNamCounter != sharedCounter;
         localTarafxsApplExitNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_APPL_EXIT_NAM_LEN = 8;
	/**
	 * 	serialize this TarafxsApplExitNam
	 */
   protected void serializeTarafxsApplExitNam(char[] tarafxsApplExitNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsApplExitNam,0,getStringValue(),beginTarafxsApplExitNam,TARAFXS_APPL_EXIT_NAM_LEN);
       localTarafxsApplExitNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsApplExitNamConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshTarafxsApplExitNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsApplExitNam() {	 
   		return (substring(getStringValue(),beginTarafxsApplExitNam,beginTarafxsApplExitNam + TARAFXS_APPL_EXIT_NAM_LEN));
   	}
     int localTarafxsTapeCmpltdSwCounter = -1;
     public boolean isTarafxsTapeCmpltdSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsTapeCmpltdSwCounter != sharedCounter;
         localTarafxsTapeCmpltdSwCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_TAPE_CMPLTD_SW_LEN = 1;
	/**
	 * 	serialize this TarafxsTapeCmpltdSw
	 */
   protected void serializeTarafxsTapeCmpltdSw(char[] tarafxsTapeCmpltdSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsTapeCmpltdSw,0,getStringValue(),beginTarafxsTapeCmpltdSw,TARAFXS_TAPE_CMPLTD_SW_LEN);
       localTarafxsTapeCmpltdSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsTapeCmpltdSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTarafxsTapeCmpltdSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsTapeCmpltdSw() {	 
   		return (substring(getStringValue(),beginTarafxsTapeCmpltdSw,beginTarafxsTapeCmpltdSw + TARAFXS_TAPE_CMPLTD_SW_LEN));
   	}
     int localTarafxsTapeMultVolSwCounter = -1;
     public boolean isTarafxsTapeMultVolSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsTapeMultVolSwCounter != sharedCounter;
         localTarafxsTapeMultVolSwCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_TAPE_MULT_VOL_SW_LEN = 1;
	/**
	 * 	serialize this TarafxsTapeMultVolSw
	 */
   protected void serializeTarafxsTapeMultVolSw(char[] tarafxsTapeMultVolSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsTapeMultVolSw,0,getStringValue(),beginTarafxsTapeMultVolSw,TARAFXS_TAPE_MULT_VOL_SW_LEN);
       localTarafxsTapeMultVolSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsTapeMultVolSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTarafxsTapeMultVolSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsTapeMultVolSw() {	 
   		return (substring(getStringValue(),beginTarafxsTapeMultVolSw,beginTarafxsTapeMultVolSw + TARAFXS_TAPE_MULT_VOL_SW_LEN));
   	}
     int localTarafxsApplPrcssngDtCounter = -1;
     public boolean isTarafxsApplPrcssngDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsApplPrcssngDtCounter != sharedCounter;
         localTarafxsApplPrcssngDtCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_APPL_PRCSSNG_DT_LEN = 10;
	/**
	 * 	serialize this TarafxsApplPrcssngDt
	 */
   protected void serializeTarafxsApplPrcssngDt(char[] tarafxsApplPrcssngDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsApplPrcssngDt,0,getStringValue(),beginTarafxsApplPrcssngDt,TARAFXS_APPL_PRCSSNG_DT_LEN);
       localTarafxsApplPrcssngDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsApplPrcssngDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTarafxsApplPrcssngDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsApplPrcssngDt() {	 
   		return (substring(getStringValue(),beginTarafxsApplPrcssngDt,beginTarafxsApplPrcssngDt + TARAFXS_APPL_PRCSSNG_DT_LEN));
   	}
     int localTarafxsTransitionalDsnCounter = -1;
     public boolean isTarafxsTransitionalDsnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsTransitionalDsnCounter != sharedCounter;
         localTarafxsTransitionalDsnCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_TRANSITIONAL_DSN_LEN = 44;
	/**
	 * 	serialize this TarafxsTransitionalDsn
	 */
   protected void serializeTarafxsTransitionalDsn(char[] tarafxsTransitionalDsn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsTransitionalDsn,0,getStringValue(),beginTarafxsTransitionalDsn,TARAFXS_TRANSITIONAL_DSN_LEN);
       localTarafxsTransitionalDsnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsTransitionalDsnConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshTarafxsTransitionalDsn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsTransitionalDsn() {	 
   		return (substring(getStringValue(),beginTarafxsTransitionalDsn,beginTarafxsTransitionalDsn + TARAFXS_TRANSITIONAL_DSN_LEN));
   	}
     int localTarafxsSourceHubIdCounter = -1;
     public boolean isTarafxsSourceHubIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsSourceHubIdCounter != sharedCounter;
         localTarafxsSourceHubIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_SOURCE_HUB_ID_LEN = 8;
	/**
	 * 	serialize this TarafxsSourceHubId
	 */
   protected void serializeTarafxsSourceHubId(char[] tarafxsSourceHubId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsSourceHubId,0,getStringValue(),beginTarafxsSourceHubId,TARAFXS_SOURCE_HUB_ID_LEN);
       localTarafxsSourceHubIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsSourceHubIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshTarafxsSourceHubId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsSourceHubId() {	 
   		return (substring(getStringValue(),beginTarafxsSourceHubId,beginTarafxsSourceHubId + TARAFXS_SOURCE_HUB_ID_LEN));
   	}
     int localTarafxsOwningHubIdCounter = -1;
     public boolean isTarafxsOwningHubIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsOwningHubIdCounter != sharedCounter;
         localTarafxsOwningHubIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_OWNING_HUB_ID_LEN = 8;
	/**
	 * 	serialize this TarafxsOwningHubId
	 */
   protected void serializeTarafxsOwningHubId(char[] tarafxsOwningHubId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsOwningHubId,0,getStringValue(),beginTarafxsOwningHubId,TARAFXS_OWNING_HUB_ID_LEN);
       localTarafxsOwningHubIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsOwningHubIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshTarafxsOwningHubId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsOwningHubId() {	 
   		return (substring(getStringValue(),beginTarafxsOwningHubId,beginTarafxsOwningHubId + TARAFXS_OWNING_HUB_ID_LEN));
   	}
     int localTarafxsStatRefIdCounter = -1;
     public boolean isTarafxsStatRefIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsStatRefIdCounter != sharedCounter;
         localTarafxsStatRefIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_STAT_REF_ID_LEN = 4;
	/**
	 * 	serialize this TarafxsStatRefId
	 */
   protected void serializeTarafxsStatRefId(char[] tarafxsStatRefId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsStatRefId,0,getStringValue(),beginTarafxsStatRefId,TARAFXS_STAT_REF_ID_LEN);
       localTarafxsStatRefIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsStatRefIdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshTarafxsStatRefId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsStatRefId() {	 
   		return (substring(getStringValue(),beginTarafxsStatRefId,beginTarafxsStatRefId + TARAFXS_STAT_REF_ID_LEN));
   	}
     int localTarafxsSrcLocEntNamCounter = -1;
     public boolean isTarafxsSrcLocEntNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsSrcLocEntNamCounter != sharedCounter;
         localTarafxsSrcLocEntNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_SRC_LOC_ENT_NAM_LEN = 10;
	/**
	 * 	serialize this TarafxsSrcLocEntNam
	 */
   protected void serializeTarafxsSrcLocEntNam(char[] tarafxsSrcLocEntNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsSrcLocEntNam,0,getStringValue(),beginTarafxsSrcLocEntNam,TARAFXS_SRC_LOC_ENT_NAM_LEN);
       localTarafxsSrcLocEntNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsSrcLocEntNamConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTarafxsSrcLocEntNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsSrcLocEntNam() {	 
   		return (substring(getStringValue(),beginTarafxsSrcLocEntNam,beginTarafxsSrcLocEntNam + TARAFXS_SRC_LOC_ENT_NAM_LEN));
   	}
     int localTarafxsSrcTaskNamCounter = -1;
     public boolean isTarafxsSrcTaskNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsSrcTaskNamCounter != sharedCounter;
         localTarafxsSrcTaskNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_SRC_TASK_NAM_LEN = 10;
	/**
	 * 	serialize this TarafxsSrcTaskNam
	 */
   protected void serializeTarafxsSrcTaskNam(char[] tarafxsSrcTaskNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsSrcTaskNam,0,getStringValue(),beginTarafxsSrcTaskNam,TARAFXS_SRC_TASK_NAM_LEN);
       localTarafxsSrcTaskNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsSrcTaskNamConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTarafxsSrcTaskNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsSrcTaskNam() {	 
   		return (substring(getStringValue(),beginTarafxsSrcTaskNam,beginTarafxsSrcTaskNam + TARAFXS_SRC_TASK_NAM_LEN));
   	}
     int localTarafxsSrcTaskIdCounter = -1;
     public boolean isTarafxsSrcTaskIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsSrcTaskIdCounter != sharedCounter;
         localTarafxsSrcTaskIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_SRC_TASK_ID_LEN = 13;
	/**
	 * 	serialize this TarafxsSrcTaskId
	 */
   protected void serializeTarafxsSrcTaskId(char[] tarafxsSrcTaskId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsSrcTaskId,0,getStringValue(),beginTarafxsSrcTaskId,TARAFXS_SRC_TASK_ID_LEN);
       localTarafxsSrcTaskIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsSrcTaskIdConstraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
    /**
	 *	refreshTarafxsSrcTaskId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsSrcTaskId() {	 
   		return (substring(getStringValue(),beginTarafxsSrcTaskId,beginTarafxsSrcTaskId + TARAFXS_SRC_TASK_ID_LEN));
   	}
     int localTarafxsSrcTaskStrtTsCounter = -1;
     public boolean isTarafxsSrcTaskStrtTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsSrcTaskStrtTsCounter != sharedCounter;
         localTarafxsSrcTaskStrtTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_SRC_TASK_STRT_TS_LEN = 26;
	/**
	 * 	serialize this TarafxsSrcTaskStrtTs
	 */
   protected void serializeTarafxsSrcTaskStrtTs(char[] tarafxsSrcTaskStrtTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsSrcTaskStrtTs,0,getStringValue(),beginTarafxsSrcTaskStrtTs,TARAFXS_SRC_TASK_STRT_TS_LEN);
       localTarafxsSrcTaskStrtTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsSrcTaskStrtTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxsSrcTaskStrtTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsSrcTaskStrtTs() {	 
   		return (substring(getStringValue(),beginTarafxsSrcTaskStrtTs,beginTarafxsSrcTaskStrtTs + TARAFXS_SRC_TASK_STRT_TS_LEN));
   	}
     int localTarafxsSrcTaskStopTsCounter = -1;
     public boolean isTarafxsSrcTaskStopTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsSrcTaskStopTsCounter != sharedCounter;
         localTarafxsSrcTaskStopTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_SRC_TASK_STOP_TS_LEN = 26;
	/**
	 * 	serialize this TarafxsSrcTaskStopTs
	 */
   protected void serializeTarafxsSrcTaskStopTs(char[] tarafxsSrcTaskStopTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsSrcTaskStopTs,0,getStringValue(),beginTarafxsSrcTaskStopTs,TARAFXS_SRC_TASK_STOP_TS_LEN);
       localTarafxsSrcTaskStopTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsSrcTaskStopTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxsSrcTaskStopTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsSrcTaskStopTs() {	 
   		return (substring(getStringValue(),beginTarafxsSrcTaskStopTs,beginTarafxsSrcTaskStopTs + TARAFXS_SRC_TASK_STOP_TS_LEN));
   	}
     int localTarafxsTrgtLocEntNamCounter = -1;
     public boolean isTarafxsTrgtLocEntNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsTrgtLocEntNamCounter != sharedCounter;
         localTarafxsTrgtLocEntNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_TRGT_LOC_ENT_NAM_LEN = 10;
	/**
	 * 	serialize this TarafxsTrgtLocEntNam
	 */
   protected void serializeTarafxsTrgtLocEntNam(char[] tarafxsTrgtLocEntNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsTrgtLocEntNam,0,getStringValue(),beginTarafxsTrgtLocEntNam,TARAFXS_TRGT_LOC_ENT_NAM_LEN);
       localTarafxsTrgtLocEntNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsTrgtLocEntNamConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTarafxsTrgtLocEntNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsTrgtLocEntNam() {	 
   		return (substring(getStringValue(),beginTarafxsTrgtLocEntNam,beginTarafxsTrgtLocEntNam + TARAFXS_TRGT_LOC_ENT_NAM_LEN));
   	}
     int localTarafxsTrgtTaskNamCounter = -1;
     public boolean isTarafxsTrgtTaskNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsTrgtTaskNamCounter != sharedCounter;
         localTarafxsTrgtTaskNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_TRGT_TASK_NAM_LEN = 10;
	/**
	 * 	serialize this TarafxsTrgtTaskNam
	 */
   protected void serializeTarafxsTrgtTaskNam(char[] tarafxsTrgtTaskNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsTrgtTaskNam,0,getStringValue(),beginTarafxsTrgtTaskNam,TARAFXS_TRGT_TASK_NAM_LEN);
       localTarafxsTrgtTaskNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsTrgtTaskNamConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTarafxsTrgtTaskNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsTrgtTaskNam() {	 
   		return (substring(getStringValue(),beginTarafxsTrgtTaskNam,beginTarafxsTrgtTaskNam + TARAFXS_TRGT_TASK_NAM_LEN));
   	}
     int localTarafxsTrgtTaskIdCounter = -1;
     public boolean isTarafxsTrgtTaskIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsTrgtTaskIdCounter != sharedCounter;
         localTarafxsTrgtTaskIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_TRGT_TASK_ID_LEN = 13;
	/**
	 * 	serialize this TarafxsTrgtTaskId
	 */
   protected void serializeTarafxsTrgtTaskId(char[] tarafxsTrgtTaskId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsTrgtTaskId,0,getStringValue(),beginTarafxsTrgtTaskId,TARAFXS_TRGT_TASK_ID_LEN);
       localTarafxsTrgtTaskIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsTrgtTaskIdConstraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
    /**
	 *	refreshTarafxsTrgtTaskId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsTrgtTaskId() {	 
   		return (substring(getStringValue(),beginTarafxsTrgtTaskId,beginTarafxsTrgtTaskId + TARAFXS_TRGT_TASK_ID_LEN));
   	}
     int localTarafxsTrgtTaskStrtTsCounter = -1;
     public boolean isTarafxsTrgtTaskStrtTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsTrgtTaskStrtTsCounter != sharedCounter;
         localTarafxsTrgtTaskStrtTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_TRGT_TASK_STRT_TS_LEN = 26;
	/**
	 * 	serialize this TarafxsTrgtTaskStrtTs
	 */
   protected void serializeTarafxsTrgtTaskStrtTs(char[] tarafxsTrgtTaskStrtTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsTrgtTaskStrtTs,0,getStringValue(),beginTarafxsTrgtTaskStrtTs,TARAFXS_TRGT_TASK_STRT_TS_LEN);
       localTarafxsTrgtTaskStrtTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsTrgtTaskStrtTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxsTrgtTaskStrtTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsTrgtTaskStrtTs() {	 
   		return (substring(getStringValue(),beginTarafxsTrgtTaskStrtTs,beginTarafxsTrgtTaskStrtTs + TARAFXS_TRGT_TASK_STRT_TS_LEN));
   	}
     int localTarafxsTrgtTaskStopTsCounter = -1;
     public boolean isTarafxsTrgtTaskStopTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsTrgtTaskStopTsCounter != sharedCounter;
         localTarafxsTrgtTaskStopTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_TRGT_TASK_STOP_TS_LEN = 26;
	/**
	 * 	serialize this TarafxsTrgtTaskStopTs
	 */
   protected void serializeTarafxsTrgtTaskStopTs(char[] tarafxsTrgtTaskStopTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsTrgtTaskStopTs,0,getStringValue(),beginTarafxsTrgtTaskStopTs,TARAFXS_TRGT_TASK_STOP_TS_LEN);
       localTarafxsTrgtTaskStopTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsTrgtTaskStopTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTarafxsTrgtTaskStopTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsTrgtTaskStopTs() {	 
   		return (substring(getStringValue(),beginTarafxsTrgtTaskStopTs,beginTarafxsTrgtTaskStopTs + TARAFXS_TRGT_TASK_STOP_TS_LEN));
   	}




}
  

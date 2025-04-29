package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class TaraeptSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class TaraeptSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TaraeptSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TARAEPT_LENGTH = 661;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTaraeptEndptId;
            protected  int beginTaraeptXferMthdCd;
            protected  int beginTaraeptBusPrtnrId;
            protected  int beginTaraeptXferLocNam;
            protected  int beginTaraeptUserSrvrId;
            protected  int beginTaraeptHostTypeCd;
            protected  int beginTaraeptUserNam;
            protected  int beginTaraeptUserPhnNum;
            protected  int beginTaraeptUserFaxNum;
            protected  int beginTaraeptUserEmailAddr;
            protected  int beginTaraeptBkupEndptId;
            protected  int beginTaraeptBkupActvSw;
            protected  int beginTaraeptEffFromTs;
            protected  int beginTaraeptEffToTs;
            protected  int beginTaraeptLstUpdtUserId;
            protected  int beginTaraeptLstUpdtTs;
            protected  int beginTaraeptGftSrvrNam;
            protected  int beginTaraeptCsMipId;
            protected  int beginTaraeptRmMipId;
            protected  int beginTaraeptBusPrtnrNam;
            protected  int beginTaraeptTapeMediaCd;
            protected  int beginTaraeptTapeTrckNum;
            protected  int beginTaraeptTapeLblFrmtCd;
            protected  int beginTaraeptTapeAddrIndxNum;
            protected  int beginTaraeptXferModeCd;
            protected  int beginTaraeptAltUserSrvrId;
            protected  int beginTaraeptRteToHubSw;
            protected  int beginTaraeptEndptTypCd;
            protected  int beginTaraeptHubId;
	
	/**
	* Constructor for TaraeptSerialized
	**/
    public TaraeptSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TaraeptSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TARAEPT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTaraeptEndptId = getStartOffset() + 0;	// set offset for serialization
  
             beginTaraeptXferMthdCd = getStartOffset() + 7;	// set offset for serialization
  
             beginTaraeptBusPrtnrId = getStartOffset() + 8;	// set offset for serialization
  
             beginTaraeptXferLocNam = getStartOffset() + 14;	// set offset for serialization
  
  
  
             beginTaraeptUserSrvrId = getStartOffset() + 166;	// set offset for serialization
  
             beginTaraeptHostTypeCd = getStartOffset() + 186;	// set offset for serialization
  
             beginTaraeptUserNam = getStartOffset() + 187;	// set offset for serialization
  
             beginTaraeptUserPhnNum = getStartOffset() + 217;	// set offset for serialization
  
             beginTaraeptUserFaxNum = getStartOffset() + 227;	// set offset for serialization
  
             beginTaraeptUserEmailAddr = getStartOffset() + 237;	// set offset for serialization
  
             beginTaraeptBkupEndptId = getStartOffset() + 307;	// set offset for serialization
  
             beginTaraeptBkupActvSw = getStartOffset() + 314;	// set offset for serialization
  
             beginTaraeptEffFromTs = getStartOffset() + 315;	// set offset for serialization
  
             beginTaraeptEffToTs = getStartOffset() + 341;	// set offset for serialization
  
             beginTaraeptLstUpdtUserId = getStartOffset() + 367;	// set offset for serialization
  
             beginTaraeptLstUpdtTs = getStartOffset() + 376;	// set offset for serialization
  
             beginTaraeptGftSrvrNam = getStartOffset() + 402;	// set offset for serialization
  
             beginTaraeptCsMipId = getStartOffset() + 412;	// set offset for serialization
  
             beginTaraeptRmMipId = getStartOffset() + 415;	// set offset for serialization
  
             beginTaraeptBusPrtnrNam = getStartOffset() + 418;	// set offset for serialization
  
             beginTaraeptTapeMediaCd = getStartOffset() + 488;	// set offset for serialization
  
             beginTaraeptTapeTrckNum = getStartOffset() + 489;	// set offset for serialization
  
             beginTaraeptTapeLblFrmtCd = getStartOffset() + 491;	// set offset for serialization
  
             beginTaraeptTapeAddrIndxNum = getStartOffset() + 492;	// set offset for serialization
  
             beginTaraeptXferModeCd = getStartOffset() + 494;	// set offset for serialization
  
             beginTaraeptAltUserSrvrId = getStartOffset() + 498;	// set offset for serialization
  
  
  
             beginTaraeptRteToHubSw = getStartOffset() + 650;	// set offset for serialization
  
             beginTaraeptEndptTypCd = getStartOffset() + 651;	// set offset for serialization
  
             beginTaraeptHubId = getStartOffset() + 653;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTaraeptEndptIdCounter = -1;
     public boolean isTaraeptEndptIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptEndptIdCounter != sharedCounter;
         localTaraeptEndptIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_ENDPT_ID_LEN = 7;
	/**
	 * 	serialize this TaraeptEndptId
	 */
   protected void serializeTaraeptEndptId(char[] taraeptEndptId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptEndptId,0,getStringValue(),beginTaraeptEndptId,TARAEPT_ENDPT_ID_LEN);
       localTaraeptEndptIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptEndptIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTaraeptEndptId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptEndptId() {	 
   		return (substring(getStringValue(),beginTaraeptEndptId,beginTaraeptEndptId + TARAEPT_ENDPT_ID_LEN));
   	}
     int localTaraeptXferMthdCdCounter = -1;
     public boolean isTaraeptXferMthdCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptXferMthdCdCounter != sharedCounter;
         localTaraeptXferMthdCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_XFER_MTHD_CD_LEN = 1;
	/**
	 * 	serialize this TaraeptXferMthdCd
	 */
   protected void serializeTaraeptXferMthdCd(char[] taraeptXferMthdCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptXferMthdCd,0,getStringValue(),beginTaraeptXferMthdCd,TARAEPT_XFER_MTHD_CD_LEN);
       localTaraeptXferMthdCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptXferMthdCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTaraeptXferMthdCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptXferMthdCd() {	 
   		return (substring(getStringValue(),beginTaraeptXferMthdCd,beginTaraeptXferMthdCd + TARAEPT_XFER_MTHD_CD_LEN));
   	}
     int localTaraeptBusPrtnrIdCounter = -1;
     public boolean isTaraeptBusPrtnrIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptBusPrtnrIdCounter != sharedCounter;
         localTaraeptBusPrtnrIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_BUS_PRTNR_ID_LEN = 6;
	/**
	 * 	serialize this TaraeptBusPrtnrId
	 */
   protected void serializeTaraeptBusPrtnrId(char[] taraeptBusPrtnrId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptBusPrtnrId,0,getStringValue(),beginTaraeptBusPrtnrId,TARAEPT_BUS_PRTNR_ID_LEN);
       localTaraeptBusPrtnrIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptBusPrtnrIdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTaraeptBusPrtnrId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptBusPrtnrId() {	 
   		return (substring(getStringValue(),beginTaraeptBusPrtnrId,beginTaraeptBusPrtnrId + TARAEPT_BUS_PRTNR_ID_LEN));
   	}
     int localTaraeptXferLocNamCounter = -1;
     public boolean isTaraeptXferLocNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptXferLocNamCounter != sharedCounter;
         localTaraeptXferLocNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_XFER_LOC_NAM_LEN = 20;
	/**
	 * 	serialize this TaraeptXferLocNam
	 */
   protected void serializeTaraeptXferLocNam(char[] taraeptXferLocNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptXferLocNam,0,getStringValue(),beginTaraeptXferLocNam,TARAEPT_XFER_LOC_NAM_LEN);
       localTaraeptXferLocNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptXferLocNamConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshTaraeptXferLocNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptXferLocNam() {	 
   		return (substring(getStringValue(),beginTaraeptXferLocNam,beginTaraeptXferLocNam + TARAEPT_XFER_LOC_NAM_LEN));
   	}
     int localTaraeptUserSrvrIdCounter = -1;
     public boolean isTaraeptUserSrvrIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptUserSrvrIdCounter != sharedCounter;
         localTaraeptUserSrvrIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_USER_SRVR_ID_LEN = 20;
	/**
	 * 	serialize this TaraeptUserSrvrId
	 */
   protected void serializeTaraeptUserSrvrId(char[] taraeptUserSrvrId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptUserSrvrId,0,getStringValue(),beginTaraeptUserSrvrId,TARAEPT_USER_SRVR_ID_LEN);
       localTaraeptUserSrvrIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptUserSrvrIdConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshTaraeptUserSrvrId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptUserSrvrId() {	 
   		return (substring(getStringValue(),beginTaraeptUserSrvrId,beginTaraeptUserSrvrId + TARAEPT_USER_SRVR_ID_LEN));
   	}
     int localTaraeptHostTypeCdCounter = -1;
     public boolean isTaraeptHostTypeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptHostTypeCdCounter != sharedCounter;
         localTaraeptHostTypeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_HOST_TYPE_CD_LEN = 1;
	/**
	 * 	serialize this TaraeptHostTypeCd
	 */
   protected void serializeTaraeptHostTypeCd(char[] taraeptHostTypeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptHostTypeCd,0,getStringValue(),beginTaraeptHostTypeCd,TARAEPT_HOST_TYPE_CD_LEN);
       localTaraeptHostTypeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptHostTypeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTaraeptHostTypeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptHostTypeCd() {	 
   		return (substring(getStringValue(),beginTaraeptHostTypeCd,beginTaraeptHostTypeCd + TARAEPT_HOST_TYPE_CD_LEN));
   	}
     int localTaraeptUserNamCounter = -1;
     public boolean isTaraeptUserNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptUserNamCounter != sharedCounter;
         localTaraeptUserNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_USER_NAM_LEN = 30;
	/**
	 * 	serialize this TaraeptUserNam
	 */
   protected void serializeTaraeptUserNam(char[] taraeptUserNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptUserNam,0,getStringValue(),beginTaraeptUserNam,TARAEPT_USER_NAM_LEN);
       localTaraeptUserNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptUserNamConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshTaraeptUserNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptUserNam() {	 
   		return (substring(getStringValue(),beginTaraeptUserNam,beginTaraeptUserNam + TARAEPT_USER_NAM_LEN));
   	}
     int localTaraeptUserPhnNumCounter = -1;
     public boolean isTaraeptUserPhnNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptUserPhnNumCounter != sharedCounter;
         localTaraeptUserPhnNumCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_USER_PHN_NUM_LEN = 10;
	/**
	 * 	serialize this TaraeptUserPhnNum
	 */
   protected void serializeTaraeptUserPhnNum(char[] taraeptUserPhnNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptUserPhnNum,0,getStringValue(),beginTaraeptUserPhnNum,TARAEPT_USER_PHN_NUM_LEN);
       localTaraeptUserPhnNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptUserPhnNumConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTaraeptUserPhnNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptUserPhnNum() {	 
   		return (substring(getStringValue(),beginTaraeptUserPhnNum,beginTaraeptUserPhnNum + TARAEPT_USER_PHN_NUM_LEN));
   	}
     int localTaraeptUserFaxNumCounter = -1;
     public boolean isTaraeptUserFaxNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptUserFaxNumCounter != sharedCounter;
         localTaraeptUserFaxNumCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_USER_FAX_NUM_LEN = 10;
	/**
	 * 	serialize this TaraeptUserFaxNum
	 */
   protected void serializeTaraeptUserFaxNum(char[] taraeptUserFaxNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptUserFaxNum,0,getStringValue(),beginTaraeptUserFaxNum,TARAEPT_USER_FAX_NUM_LEN);
       localTaraeptUserFaxNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptUserFaxNumConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTaraeptUserFaxNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptUserFaxNum() {	 
   		return (substring(getStringValue(),beginTaraeptUserFaxNum,beginTaraeptUserFaxNum + TARAEPT_USER_FAX_NUM_LEN));
   	}
     int localTaraeptUserEmailAddrCounter = -1;
     public boolean isTaraeptUserEmailAddrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptUserEmailAddrCounter != sharedCounter;
         localTaraeptUserEmailAddrCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_USER_EMAIL_ADDR_LEN = 70;
	/**
	 * 	serialize this TaraeptUserEmailAddr
	 */
   protected void serializeTaraeptUserEmailAddr(char[] taraeptUserEmailAddr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptUserEmailAddr,0,getStringValue(),beginTaraeptUserEmailAddr,TARAEPT_USER_EMAIL_ADDR_LEN);
       localTaraeptUserEmailAddrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptUserEmailAddrConstraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
    /**
	 *	refreshTaraeptUserEmailAddr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptUserEmailAddr() {	 
   		return (substring(getStringValue(),beginTaraeptUserEmailAddr,beginTaraeptUserEmailAddr + TARAEPT_USER_EMAIL_ADDR_LEN));
   	}
     int localTaraeptBkupEndptIdCounter = -1;
     public boolean isTaraeptBkupEndptIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptBkupEndptIdCounter != sharedCounter;
         localTaraeptBkupEndptIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_BKUP_ENDPT_ID_LEN = 7;
	/**
	 * 	serialize this TaraeptBkupEndptId
	 */
   protected void serializeTaraeptBkupEndptId(char[] taraeptBkupEndptId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptBkupEndptId,0,getStringValue(),beginTaraeptBkupEndptId,TARAEPT_BKUP_ENDPT_ID_LEN);
       localTaraeptBkupEndptIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptBkupEndptIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTaraeptBkupEndptId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptBkupEndptId() {	 
   		return (substring(getStringValue(),beginTaraeptBkupEndptId,beginTaraeptBkupEndptId + TARAEPT_BKUP_ENDPT_ID_LEN));
   	}
     int localTaraeptBkupActvSwCounter = -1;
     public boolean isTaraeptBkupActvSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptBkupActvSwCounter != sharedCounter;
         localTaraeptBkupActvSwCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_BKUP_ACTV_SW_LEN = 1;
	/**
	 * 	serialize this TaraeptBkupActvSw
	 */
   protected void serializeTaraeptBkupActvSw(char[] taraeptBkupActvSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptBkupActvSw,0,getStringValue(),beginTaraeptBkupActvSw,TARAEPT_BKUP_ACTV_SW_LEN);
       localTaraeptBkupActvSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptBkupActvSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTaraeptBkupActvSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptBkupActvSw() {	 
   		return (substring(getStringValue(),beginTaraeptBkupActvSw,beginTaraeptBkupActvSw + TARAEPT_BKUP_ACTV_SW_LEN));
   	}
     int localTaraeptEffFromTsCounter = -1;
     public boolean isTaraeptEffFromTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptEffFromTsCounter != sharedCounter;
         localTaraeptEffFromTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_EFF_FROM_TS_LEN = 26;
	/**
	 * 	serialize this TaraeptEffFromTs
	 */
   protected void serializeTaraeptEffFromTs(char[] taraeptEffFromTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptEffFromTs,0,getStringValue(),beginTaraeptEffFromTs,TARAEPT_EFF_FROM_TS_LEN);
       localTaraeptEffFromTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptEffFromTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTaraeptEffFromTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptEffFromTs() {	 
   		return (substring(getStringValue(),beginTaraeptEffFromTs,beginTaraeptEffFromTs + TARAEPT_EFF_FROM_TS_LEN));
   	}
     int localTaraeptEffToTsCounter = -1;
     public boolean isTaraeptEffToTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptEffToTsCounter != sharedCounter;
         localTaraeptEffToTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_EFF_TO_TS_LEN = 26;
	/**
	 * 	serialize this TaraeptEffToTs
	 */
   protected void serializeTaraeptEffToTs(char[] taraeptEffToTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptEffToTs,0,getStringValue(),beginTaraeptEffToTs,TARAEPT_EFF_TO_TS_LEN);
       localTaraeptEffToTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptEffToTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTaraeptEffToTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptEffToTs() {	 
   		return (substring(getStringValue(),beginTaraeptEffToTs,beginTaraeptEffToTs + TARAEPT_EFF_TO_TS_LEN));
   	}
     int localTaraeptLstUpdtUserIdCounter = -1;
     public boolean isTaraeptLstUpdtUserIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptLstUpdtUserIdCounter != sharedCounter;
         localTaraeptLstUpdtUserIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_LST_UPDT_USER_ID_LEN = 9;
	/**
	 * 	serialize this TaraeptLstUpdtUserId
	 */
   protected void serializeTaraeptLstUpdtUserId(char[] taraeptLstUpdtUserId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptLstUpdtUserId,0,getStringValue(),beginTaraeptLstUpdtUserId,TARAEPT_LST_UPDT_USER_ID_LEN);
       localTaraeptLstUpdtUserIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptLstUpdtUserIdConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshTaraeptLstUpdtUserId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptLstUpdtUserId() {	 
   		return (substring(getStringValue(),beginTaraeptLstUpdtUserId,beginTaraeptLstUpdtUserId + TARAEPT_LST_UPDT_USER_ID_LEN));
   	}
     int localTaraeptLstUpdtTsCounter = -1;
     public boolean isTaraeptLstUpdtTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptLstUpdtTsCounter != sharedCounter;
         localTaraeptLstUpdtTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_LST_UPDT_TS_LEN = 26;
	/**
	 * 	serialize this TaraeptLstUpdtTs
	 */
   protected void serializeTaraeptLstUpdtTs(char[] taraeptLstUpdtTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptLstUpdtTs,0,getStringValue(),beginTaraeptLstUpdtTs,TARAEPT_LST_UPDT_TS_LEN);
       localTaraeptLstUpdtTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptLstUpdtTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTaraeptLstUpdtTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptLstUpdtTs() {	 
   		return (substring(getStringValue(),beginTaraeptLstUpdtTs,beginTaraeptLstUpdtTs + TARAEPT_LST_UPDT_TS_LEN));
   	}
     int localTaraeptGftSrvrNamCounter = -1;
     public boolean isTaraeptGftSrvrNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptGftSrvrNamCounter != sharedCounter;
         localTaraeptGftSrvrNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_GFT_SRVR_NAM_LEN = 10;
	/**
	 * 	serialize this TaraeptGftSrvrNam
	 */
   protected void serializeTaraeptGftSrvrNam(char[] taraeptGftSrvrNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptGftSrvrNam,0,getStringValue(),beginTaraeptGftSrvrNam,TARAEPT_GFT_SRVR_NAM_LEN);
       localTaraeptGftSrvrNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptGftSrvrNamConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTaraeptGftSrvrNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptGftSrvrNam() {	 
   		return (substring(getStringValue(),beginTaraeptGftSrvrNam,beginTaraeptGftSrvrNam + TARAEPT_GFT_SRVR_NAM_LEN));
   	}
     int localTaraeptCsMipIdCounter = -1;
     public boolean isTaraeptCsMipIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptCsMipIdCounter != sharedCounter;
         localTaraeptCsMipIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_CS_MIP_ID_LEN = 3;
	/**
	 * 	serialize this TaraeptCsMipId
	 */
   protected void serializeTaraeptCsMipId(char[] taraeptCsMipId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptCsMipId,0,getStringValue(),beginTaraeptCsMipId,TARAEPT_CS_MIP_ID_LEN);
       localTaraeptCsMipIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptCsMipIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshTaraeptCsMipId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptCsMipId() {	 
   		return (substring(getStringValue(),beginTaraeptCsMipId,beginTaraeptCsMipId + TARAEPT_CS_MIP_ID_LEN));
   	}
     int localTaraeptRmMipIdCounter = -1;
     public boolean isTaraeptRmMipIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptRmMipIdCounter != sharedCounter;
         localTaraeptRmMipIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_RM_MIP_ID_LEN = 3;
	/**
	 * 	serialize this TaraeptRmMipId
	 */
   protected void serializeTaraeptRmMipId(char[] taraeptRmMipId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptRmMipId,0,getStringValue(),beginTaraeptRmMipId,TARAEPT_RM_MIP_ID_LEN);
       localTaraeptRmMipIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptRmMipIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshTaraeptRmMipId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptRmMipId() {	 
   		return (substring(getStringValue(),beginTaraeptRmMipId,beginTaraeptRmMipId + TARAEPT_RM_MIP_ID_LEN));
   	}
     int localTaraeptBusPrtnrNamCounter = -1;
     public boolean isTaraeptBusPrtnrNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptBusPrtnrNamCounter != sharedCounter;
         localTaraeptBusPrtnrNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_BUS_PRTNR_NAM_LEN = 70;
	/**
	 * 	serialize this TaraeptBusPrtnrNam
	 */
   protected void serializeTaraeptBusPrtnrNam(char[] taraeptBusPrtnrNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptBusPrtnrNam,0,getStringValue(),beginTaraeptBusPrtnrNam,TARAEPT_BUS_PRTNR_NAM_LEN);
       localTaraeptBusPrtnrNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptBusPrtnrNamConstraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
    /**
	 *	refreshTaraeptBusPrtnrNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptBusPrtnrNam() {	 
   		return (substring(getStringValue(),beginTaraeptBusPrtnrNam,beginTaraeptBusPrtnrNam + TARAEPT_BUS_PRTNR_NAM_LEN));
   	}
     int localTaraeptTapeMediaCdCounter = -1;
     public boolean isTaraeptTapeMediaCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptTapeMediaCdCounter != sharedCounter;
         localTaraeptTapeMediaCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_TAPE_MEDIA_CD_LEN = 1;
	/**
	 * 	serialize this TaraeptTapeMediaCd
	 */
   protected void serializeTaraeptTapeMediaCd(char[] taraeptTapeMediaCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptTapeMediaCd,0,getStringValue(),beginTaraeptTapeMediaCd,TARAEPT_TAPE_MEDIA_CD_LEN);
       localTaraeptTapeMediaCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptTapeMediaCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTaraeptTapeMediaCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptTapeMediaCd() {	 
   		return (substring(getStringValue(),beginTaraeptTapeMediaCd,beginTaraeptTapeMediaCd + TARAEPT_TAPE_MEDIA_CD_LEN));
   	}
        int localTaraeptTapeTrckNumCounter = -1;
        public boolean isTaraeptTapeTrckNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTaraeptTapeTrckNumCounter != sharedCounter;
           localTaraeptTapeTrckNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean taraeptTapeTrckNumIsNumeric() {
	      return decimalIsNumeric(beginTaraeptTapeTrckNum,TARAEPT_TAPE_TRCK_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAEPT_TAPE_TRCK_NUM_LEN = 2;
  	/**
	 * 	serializeTaraeptTapeTrckNum
	 */
	protected void serializeTaraeptTapeTrckNum(short taraeptTapeTrckNum) {
		   putDecimal(beginTaraeptTapeTrckNum,taraeptTapeTrckNum,TARAEPT_TAPE_TRCK_NUM_LEN,true);
   }
   

   protected short checkTaraeptTapeTrckNumMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshTaraeptTapeTrckNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraeptTapeTrckNum() throws CFException {	
   	try { 
		 return (getShortDecimal(beginTaraeptTapeTrckNum,TARAEPT_TAPE_TRCK_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("taraeptTapeTrckNum", beginTaraeptTapeTrckNum,TARAEPT_TAPE_TRCK_NUM_LEN);
     }
   	}
     int localTaraeptTapeLblFrmtCdCounter = -1;
     public boolean isTaraeptTapeLblFrmtCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptTapeLblFrmtCdCounter != sharedCounter;
         localTaraeptTapeLblFrmtCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_TAPE_LBL_FRMT_CD_LEN = 1;
	/**
	 * 	serialize this TaraeptTapeLblFrmtCd
	 */
   protected void serializeTaraeptTapeLblFrmtCd(char[] taraeptTapeLblFrmtCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptTapeLblFrmtCd,0,getStringValue(),beginTaraeptTapeLblFrmtCd,TARAEPT_TAPE_LBL_FRMT_CD_LEN);
       localTaraeptTapeLblFrmtCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptTapeLblFrmtCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTaraeptTapeLblFrmtCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptTapeLblFrmtCd() {	 
   		return (substring(getStringValue(),beginTaraeptTapeLblFrmtCd,beginTaraeptTapeLblFrmtCd + TARAEPT_TAPE_LBL_FRMT_CD_LEN));
   	}
        int localTaraeptTapeAddrIndxNumCounter = -1;
        public boolean isTaraeptTapeAddrIndxNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTaraeptTapeAddrIndxNumCounter != sharedCounter;
           localTaraeptTapeAddrIndxNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean taraeptTapeAddrIndxNumIsNumeric() {
	      return decimalIsNumeric(beginTaraeptTapeAddrIndxNum,TARAEPT_TAPE_ADDR_INDX_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAEPT_TAPE_ADDR_INDX_NUM_LEN = 2;
  	/**
	 * 	serializeTaraeptTapeAddrIndxNum
	 */
	protected void serializeTaraeptTapeAddrIndxNum(short taraeptTapeAddrIndxNum) {
		   putDecimal(beginTaraeptTapeAddrIndxNum,taraeptTapeAddrIndxNum,TARAEPT_TAPE_ADDR_INDX_NUM_LEN,true);
   }
   

   protected short checkTaraeptTapeAddrIndxNumMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshTaraeptTapeAddrIndxNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraeptTapeAddrIndxNum() throws CFException {	
   	try { 
		 return (getShortDecimal(beginTaraeptTapeAddrIndxNum,TARAEPT_TAPE_ADDR_INDX_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("taraeptTapeAddrIndxNum", beginTaraeptTapeAddrIndxNum,TARAEPT_TAPE_ADDR_INDX_NUM_LEN);
     }
   	}
     int localTaraeptXferModeCdCounter = -1;
     public boolean isTaraeptXferModeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptXferModeCdCounter != sharedCounter;
         localTaraeptXferModeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_XFER_MODE_CD_LEN = 4;
	/**
	 * 	serialize this TaraeptXferModeCd
	 */
   protected void serializeTaraeptXferModeCd(char[] taraeptXferModeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptXferModeCd,0,getStringValue(),beginTaraeptXferModeCd,TARAEPT_XFER_MODE_CD_LEN);
       localTaraeptXferModeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptXferModeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshTaraeptXferModeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptXferModeCd() {	 
   		return (substring(getStringValue(),beginTaraeptXferModeCd,beginTaraeptXferModeCd + TARAEPT_XFER_MODE_CD_LEN));
   	}
     int localTaraeptAltUserSrvrIdCounter = -1;
     public boolean isTaraeptAltUserSrvrIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptAltUserSrvrIdCounter != sharedCounter;
         localTaraeptAltUserSrvrIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_ALT_USER_SRVR_ID_LEN = 20;
	/**
	 * 	serialize this TaraeptAltUserSrvrId
	 */
   protected void serializeTaraeptAltUserSrvrId(char[] taraeptAltUserSrvrId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptAltUserSrvrId,0,getStringValue(),beginTaraeptAltUserSrvrId,TARAEPT_ALT_USER_SRVR_ID_LEN);
       localTaraeptAltUserSrvrIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptAltUserSrvrIdConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshTaraeptAltUserSrvrId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptAltUserSrvrId() {	 
   		return (substring(getStringValue(),beginTaraeptAltUserSrvrId,beginTaraeptAltUserSrvrId + TARAEPT_ALT_USER_SRVR_ID_LEN));
   	}
     int localTaraeptRteToHubSwCounter = -1;
     public boolean isTaraeptRteToHubSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptRteToHubSwCounter != sharedCounter;
         localTaraeptRteToHubSwCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_RTE_TO_HUB_SW_LEN = 1;
	/**
	 * 	serialize this TaraeptRteToHubSw
	 */
   protected void serializeTaraeptRteToHubSw(char[] taraeptRteToHubSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptRteToHubSw,0,getStringValue(),beginTaraeptRteToHubSw,TARAEPT_RTE_TO_HUB_SW_LEN);
       localTaraeptRteToHubSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptRteToHubSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTaraeptRteToHubSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptRteToHubSw() {	 
   		return (substring(getStringValue(),beginTaraeptRteToHubSw,beginTaraeptRteToHubSw + TARAEPT_RTE_TO_HUB_SW_LEN));
   	}
     int localTaraeptEndptTypCdCounter = -1;
     public boolean isTaraeptEndptTypCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptEndptTypCdCounter != sharedCounter;
         localTaraeptEndptTypCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_ENDPT_TYP_CD_LEN = 2;
	/**
	 * 	serialize this TaraeptEndptTypCd
	 */
   protected void serializeTaraeptEndptTypCd(char[] taraeptEndptTypCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptEndptTypCd,0,getStringValue(),beginTaraeptEndptTypCd,TARAEPT_ENDPT_TYP_CD_LEN);
       localTaraeptEndptTypCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptEndptTypCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTaraeptEndptTypCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptEndptTypCd() {	 
   		return (substring(getStringValue(),beginTaraeptEndptTypCd,beginTaraeptEndptTypCd + TARAEPT_ENDPT_TYP_CD_LEN));
   	}
     int localTaraeptHubIdCounter = -1;
     public boolean isTaraeptHubIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptHubIdCounter != sharedCounter;
         localTaraeptHubIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEPT_HUB_ID_LEN = 8;
	/**
	 * 	serialize this TaraeptHubId
	 */
   protected void serializeTaraeptHubId(char[] taraeptHubId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraeptHubId,0,getStringValue(),beginTaraeptHubId,TARAEPT_HUB_ID_LEN);
       localTaraeptHubIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraeptHubIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshTaraeptHubId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraeptHubId() {	 
   		return (substring(getStringValue(),beginTaraeptHubId,beginTaraeptHubId + TARAEPT_HUB_ID_LEN));
   	}




}
  

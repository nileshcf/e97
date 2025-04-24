package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class TaraxtkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class TaraxtkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TaraxtkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TARAXTK_LENGTH = 2017;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTaraxtkAppNam;
            protected  int beginTaraxtkXferPrcssNam;
            protected  int beginTaraxtkStatCd;
            protected  int beginTaraxtkDlyIntvlNum;
            protected  int beginTaraxtkHighLvlQlfrCd;
            protected  int beginTaraxtkLstRunTs;
            protected  int beginTaraxtkRunLmtNum;
            protected  int beginTaraxtkLclRawStatsNam;
            protected  int beginTaraxtkLclSrvrFileNam;
            protected  int beginTaraxtkLclFmtdStatsNam;
            protected  int beginTaraxtkLstUpdtUserId;
            protected  int beginTaraxtkLstUpdtTs;
            protected  int beginTaraxtkGftSrvr1Nam;
            protected  int beginTaraxtkGftSrvr1DsnNam;
            protected  int beginTaraxtkGftSrvr1Ts;
            protected  int beginTaraxtkGftSrvr2Nam;
            protected  int beginTaraxtkGftSrvr2DsnNam;
            protected  int beginTaraxtkGftSrvr2Ts;
            protected  int beginTaraxtkMfeSrvrNam;
            protected  int beginTaraxtkMfeBusPrtnrId;
            protected  int beginTaraxtkMfeEndptId;
            protected  int beginTaraxtkMfeBulkId;
            protected  int beginTaraxtkInbndSw;
            protected  int beginTaraxtkOutbndSw;
            protected  int beginTaraxtkBrdcstSw;
            protected  int beginTaraxtkLastRunKyvlTxt;
            protected  int beginTaraxtkSshBulkId;
            protected  int beginTaraxtkSshEndptId;
            protected  int beginTaraxtkSshBusPrtnrId;
            protected  int beginTaraxtkSshSrvrNam;
	
	/**
	* Constructor for TaraxtkSerialized
	**/
    public TaraxtkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TaraxtkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TARAXTK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTaraxtkAppNam = getStartOffset() + 0;	// set offset for serialization
  
             beginTaraxtkXferPrcssNam = getStartOffset() + 8;	// set offset for serialization
  
             beginTaraxtkStatCd = getStartOffset() + 16;	// set offset for serialization
  
             beginTaraxtkDlyIntvlNum = getStartOffset() + 17;	// set offset for serialization
  
             beginTaraxtkHighLvlQlfrCd = getStartOffset() + 21;	// set offset for serialization
  
  
             beginTaraxtkLstRunTs = getStartOffset() + 283;	// set offset for serialization
  
  
             beginTaraxtkRunLmtNum = getStartOffset() + 567;	// set offset for serialization
  
             beginTaraxtkLclRawStatsNam = getStartOffset() + 571;	// set offset for serialization
  
             beginTaraxtkLclSrvrFileNam = getStartOffset() + 615;	// set offset for serialization
  
             beginTaraxtkLclFmtdStatsNam = getStartOffset() + 659;	// set offset for serialization
  
             beginTaraxtkLstUpdtUserId = getStartOffset() + 703;	// set offset for serialization
  
             beginTaraxtkLstUpdtTs = getStartOffset() + 712;	// set offset for serialization
  
             beginTaraxtkGftSrvr1Nam = getStartOffset() + 738;	// set offset for serialization
  
             beginTaraxtkGftSrvr1DsnNam = getStartOffset() + 748;	// set offset for serialization
  
             beginTaraxtkGftSrvr1Ts = getStartOffset() + 792;	// set offset for serialization
  
             beginTaraxtkGftSrvr2Nam = getStartOffset() + 818;	// set offset for serialization
  
             beginTaraxtkGftSrvr2DsnNam = getStartOffset() + 828;	// set offset for serialization
  
             beginTaraxtkGftSrvr2Ts = getStartOffset() + 872;	// set offset for serialization
  
             beginTaraxtkMfeSrvrNam = getStartOffset() + 898;	// set offset for serialization
  
             beginTaraxtkMfeBusPrtnrId = getStartOffset() + 918;	// set offset for serialization
  
             beginTaraxtkMfeEndptId = getStartOffset() + 924;	// set offset for serialization
  
             beginTaraxtkMfeBulkId = getStartOffset() + 931;	// set offset for serialization
  
             beginTaraxtkInbndSw = getStartOffset() + 935;	// set offset for serialization
  
             beginTaraxtkOutbndSw = getStartOffset() + 936;	// set offset for serialization
  
             beginTaraxtkBrdcstSw = getStartOffset() + 937;	// set offset for serialization
  
             beginTaraxtkLastRunKyvlTxt = getStartOffset() + 938;	// set offset for serialization
  
             beginTaraxtkSshBulkId = getStartOffset() + 954;	// set offset for serialization
  
             beginTaraxtkSshEndptId = getStartOffset() + 958;	// set offset for serialization
  
             beginTaraxtkSshBusPrtnrId = getStartOffset() + 965;	// set offset for serialization
  
             beginTaraxtkSshSrvrNam = getStartOffset() + 971;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localTaraxtkAppNamCounter = -1;
     public boolean isTaraxtkAppNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkAppNamCounter != sharedCounter;
         localTaraxtkAppNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_APP_NAM_LEN = 8;
	/**
	 * 	serialize this TaraxtkAppNam
	 */
   protected void serializeTaraxtkAppNam(char[] taraxtkAppNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkAppNam,0,getStringValue(),beginTaraxtkAppNam,TARAXTK_APP_NAM_LEN);
       localTaraxtkAppNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkAppNamConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshTaraxtkAppNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkAppNam() {	 
   		return (substring(getStringValue(),beginTaraxtkAppNam,beginTaraxtkAppNam + TARAXTK_APP_NAM_LEN));
   	}
     int localTaraxtkXferPrcssNamCounter = -1;
     public boolean isTaraxtkXferPrcssNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkXferPrcssNamCounter != sharedCounter;
         localTaraxtkXferPrcssNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_XFER_PRCSS_NAM_LEN = 8;
	/**
	 * 	serialize this TaraxtkXferPrcssNam
	 */
   protected void serializeTaraxtkXferPrcssNam(char[] taraxtkXferPrcssNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkXferPrcssNam,0,getStringValue(),beginTaraxtkXferPrcssNam,TARAXTK_XFER_PRCSS_NAM_LEN);
       localTaraxtkXferPrcssNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkXferPrcssNamConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshTaraxtkXferPrcssNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkXferPrcssNam() {	 
   		return (substring(getStringValue(),beginTaraxtkXferPrcssNam,beginTaraxtkXferPrcssNam + TARAXTK_XFER_PRCSS_NAM_LEN));
   	}
     int localTaraxtkStatCdCounter = -1;
     public boolean isTaraxtkStatCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkStatCdCounter != sharedCounter;
         localTaraxtkStatCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_STAT_CD_LEN = 1;
	/**
	 * 	serialize this TaraxtkStatCd
	 */
   protected void serializeTaraxtkStatCd(char[] taraxtkStatCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkStatCd,0,getStringValue(),beginTaraxtkStatCd,TARAXTK_STAT_CD_LEN);
       localTaraxtkStatCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkStatCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTaraxtkStatCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkStatCd() {	 
   		return (substring(getStringValue(),beginTaraxtkStatCd,beginTaraxtkStatCd + TARAXTK_STAT_CD_LEN));
   	}
        int localTaraxtkDlyIntvlNumCounter = -1;
        public boolean isTaraxtkDlyIntvlNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTaraxtkDlyIntvlNumCounter != sharedCounter;
           localTaraxtkDlyIntvlNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean taraxtkDlyIntvlNumIsNumeric() {
	      return decimalIsNumeric(beginTaraxtkDlyIntvlNum,TARAXTK_DLY_INTVL_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAXTK_DLY_INTVL_NUM_LEN = 4;
  	/**
	 * 	serializeTaraxtkDlyIntvlNum
	 */
	protected void serializeTaraxtkDlyIntvlNum(int taraxtkDlyIntvlNum) {
		   putDecimal(beginTaraxtkDlyIntvlNum,taraxtkDlyIntvlNum,TARAXTK_DLY_INTVL_NUM_LEN,true);
   }
   

   protected int checkTaraxtkDlyIntvlNumMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTaraxtkDlyIntvlNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTaraxtkDlyIntvlNum() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTaraxtkDlyIntvlNum,TARAXTK_DLY_INTVL_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("taraxtkDlyIntvlNum", beginTaraxtkDlyIntvlNum,TARAXTK_DLY_INTVL_NUM_LEN);
     }
   	}
     int localTaraxtkHighLvlQlfrCdCounter = -1;
     public boolean isTaraxtkHighLvlQlfrCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkHighLvlQlfrCdCounter != sharedCounter;
         localTaraxtkHighLvlQlfrCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_HIGH_LVL_QLFR_CD_LEN = 4;
	/**
	 * 	serialize this TaraxtkHighLvlQlfrCd
	 */
   protected void serializeTaraxtkHighLvlQlfrCd(char[] taraxtkHighLvlQlfrCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkHighLvlQlfrCd,0,getStringValue(),beginTaraxtkHighLvlQlfrCd,TARAXTK_HIGH_LVL_QLFR_CD_LEN);
       localTaraxtkHighLvlQlfrCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkHighLvlQlfrCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshTaraxtkHighLvlQlfrCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkHighLvlQlfrCd() {	 
   		return (substring(getStringValue(),beginTaraxtkHighLvlQlfrCd,beginTaraxtkHighLvlQlfrCd + TARAXTK_HIGH_LVL_QLFR_CD_LEN));
   	}
     int localTaraxtkLstRunTsCounter = -1;
     public boolean isTaraxtkLstRunTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkLstRunTsCounter != sharedCounter;
         localTaraxtkLstRunTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_LST_RUN_TS_LEN = 26;
	/**
	 * 	serialize this TaraxtkLstRunTs
	 */
   protected void serializeTaraxtkLstRunTs(char[] taraxtkLstRunTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkLstRunTs,0,getStringValue(),beginTaraxtkLstRunTs,TARAXTK_LST_RUN_TS_LEN);
       localTaraxtkLstRunTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkLstRunTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTaraxtkLstRunTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkLstRunTs() {	 
   		return (substring(getStringValue(),beginTaraxtkLstRunTs,beginTaraxtkLstRunTs + TARAXTK_LST_RUN_TS_LEN));
   	}
        int localTaraxtkRunLmtNumCounter = -1;
        public boolean isTaraxtkRunLmtNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTaraxtkRunLmtNumCounter != sharedCounter;
           localTaraxtkRunLmtNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean taraxtkRunLmtNumIsNumeric() {
	      return decimalIsNumeric(beginTaraxtkRunLmtNum,TARAXTK_RUN_LMT_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAXTK_RUN_LMT_NUM_LEN = 4;
  	/**
	 * 	serializeTaraxtkRunLmtNum
	 */
	protected void serializeTaraxtkRunLmtNum(int taraxtkRunLmtNum) {
		   putDecimal(beginTaraxtkRunLmtNum,taraxtkRunLmtNum,TARAXTK_RUN_LMT_NUM_LEN,true);
   }
   

   protected int checkTaraxtkRunLmtNumMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTaraxtkRunLmtNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTaraxtkRunLmtNum() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTaraxtkRunLmtNum,TARAXTK_RUN_LMT_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("taraxtkRunLmtNum", beginTaraxtkRunLmtNum,TARAXTK_RUN_LMT_NUM_LEN);
     }
   	}
     int localTaraxtkLclRawStatsNamCounter = -1;
     public boolean isTaraxtkLclRawStatsNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkLclRawStatsNamCounter != sharedCounter;
         localTaraxtkLclRawStatsNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_LCL_RAW_STATS_NAM_LEN = 44;
	/**
	 * 	serialize this TaraxtkLclRawStatsNam
	 */
   protected void serializeTaraxtkLclRawStatsNam(char[] taraxtkLclRawStatsNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkLclRawStatsNam,0,getStringValue(),beginTaraxtkLclRawStatsNam,TARAXTK_LCL_RAW_STATS_NAM_LEN);
       localTaraxtkLclRawStatsNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkLclRawStatsNamConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshTaraxtkLclRawStatsNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkLclRawStatsNam() {	 
   		return (substring(getStringValue(),beginTaraxtkLclRawStatsNam,beginTaraxtkLclRawStatsNam + TARAXTK_LCL_RAW_STATS_NAM_LEN));
   	}
     int localTaraxtkLclSrvrFileNamCounter = -1;
     public boolean isTaraxtkLclSrvrFileNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkLclSrvrFileNamCounter != sharedCounter;
         localTaraxtkLclSrvrFileNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_LCL_SRVR_FILE_NAM_LEN = 44;
	/**
	 * 	serialize this TaraxtkLclSrvrFileNam
	 */
   protected void serializeTaraxtkLclSrvrFileNam(char[] taraxtkLclSrvrFileNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkLclSrvrFileNam,0,getStringValue(),beginTaraxtkLclSrvrFileNam,TARAXTK_LCL_SRVR_FILE_NAM_LEN);
       localTaraxtkLclSrvrFileNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkLclSrvrFileNamConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshTaraxtkLclSrvrFileNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkLclSrvrFileNam() {	 
   		return (substring(getStringValue(),beginTaraxtkLclSrvrFileNam,beginTaraxtkLclSrvrFileNam + TARAXTK_LCL_SRVR_FILE_NAM_LEN));
   	}
     int localTaraxtkLclFmtdStatsNamCounter = -1;
     public boolean isTaraxtkLclFmtdStatsNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkLclFmtdStatsNamCounter != sharedCounter;
         localTaraxtkLclFmtdStatsNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_LCL_FMTD_STATS_NAM_LEN = 44;
	/**
	 * 	serialize this TaraxtkLclFmtdStatsNam
	 */
   protected void serializeTaraxtkLclFmtdStatsNam(char[] taraxtkLclFmtdStatsNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkLclFmtdStatsNam,0,getStringValue(),beginTaraxtkLclFmtdStatsNam,TARAXTK_LCL_FMTD_STATS_NAM_LEN);
       localTaraxtkLclFmtdStatsNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkLclFmtdStatsNamConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshTaraxtkLclFmtdStatsNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkLclFmtdStatsNam() {	 
   		return (substring(getStringValue(),beginTaraxtkLclFmtdStatsNam,beginTaraxtkLclFmtdStatsNam + TARAXTK_LCL_FMTD_STATS_NAM_LEN));
   	}
     int localTaraxtkLstUpdtUserIdCounter = -1;
     public boolean isTaraxtkLstUpdtUserIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkLstUpdtUserIdCounter != sharedCounter;
         localTaraxtkLstUpdtUserIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_LST_UPDT_USER_ID_LEN = 9;
	/**
	 * 	serialize this TaraxtkLstUpdtUserId
	 */
   protected void serializeTaraxtkLstUpdtUserId(char[] taraxtkLstUpdtUserId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkLstUpdtUserId,0,getStringValue(),beginTaraxtkLstUpdtUserId,TARAXTK_LST_UPDT_USER_ID_LEN);
       localTaraxtkLstUpdtUserIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkLstUpdtUserIdConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshTaraxtkLstUpdtUserId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkLstUpdtUserId() {	 
   		return (substring(getStringValue(),beginTaraxtkLstUpdtUserId,beginTaraxtkLstUpdtUserId + TARAXTK_LST_UPDT_USER_ID_LEN));
   	}
     int localTaraxtkLstUpdtTsCounter = -1;
     public boolean isTaraxtkLstUpdtTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkLstUpdtTsCounter != sharedCounter;
         localTaraxtkLstUpdtTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_LST_UPDT_TS_LEN = 26;
	/**
	 * 	serialize this TaraxtkLstUpdtTs
	 */
   protected void serializeTaraxtkLstUpdtTs(char[] taraxtkLstUpdtTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkLstUpdtTs,0,getStringValue(),beginTaraxtkLstUpdtTs,TARAXTK_LST_UPDT_TS_LEN);
       localTaraxtkLstUpdtTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkLstUpdtTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTaraxtkLstUpdtTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkLstUpdtTs() {	 
   		return (substring(getStringValue(),beginTaraxtkLstUpdtTs,beginTaraxtkLstUpdtTs + TARAXTK_LST_UPDT_TS_LEN));
   	}
     int localTaraxtkGftSrvr1NamCounter = -1;
     public boolean isTaraxtkGftSrvr1NamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkGftSrvr1NamCounter != sharedCounter;
         localTaraxtkGftSrvr1NamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_GFT_SRVR_1_NAM_LEN = 10;
	/**
	 * 	serialize this TaraxtkGftSrvr1Nam
	 */
   protected void serializeTaraxtkGftSrvr1Nam(char[] taraxtkGftSrvr1Nam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkGftSrvr1Nam,0,getStringValue(),beginTaraxtkGftSrvr1Nam,TARAXTK_GFT_SRVR_1_NAM_LEN);
       localTaraxtkGftSrvr1NamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkGftSrvr1NamConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTaraxtkGftSrvr1Nam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkGftSrvr1Nam() {	 
   		return (substring(getStringValue(),beginTaraxtkGftSrvr1Nam,beginTaraxtkGftSrvr1Nam + TARAXTK_GFT_SRVR_1_NAM_LEN));
   	}
     int localTaraxtkGftSrvr1DsnNamCounter = -1;
     public boolean isTaraxtkGftSrvr1DsnNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkGftSrvr1DsnNamCounter != sharedCounter;
         localTaraxtkGftSrvr1DsnNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_GFT_SRVR_1_DSN_NAM_LEN = 44;
	/**
	 * 	serialize this TaraxtkGftSrvr1DsnNam
	 */
   protected void serializeTaraxtkGftSrvr1DsnNam(char[] taraxtkGftSrvr1DsnNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkGftSrvr1DsnNam,0,getStringValue(),beginTaraxtkGftSrvr1DsnNam,TARAXTK_GFT_SRVR_1_DSN_NAM_LEN);
       localTaraxtkGftSrvr1DsnNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkGftSrvr1DsnNamConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshTaraxtkGftSrvr1DsnNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkGftSrvr1DsnNam() {	 
   		return (substring(getStringValue(),beginTaraxtkGftSrvr1DsnNam,beginTaraxtkGftSrvr1DsnNam + TARAXTK_GFT_SRVR_1_DSN_NAM_LEN));
   	}
     int localTaraxtkGftSrvr1TsCounter = -1;
     public boolean isTaraxtkGftSrvr1TsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkGftSrvr1TsCounter != sharedCounter;
         localTaraxtkGftSrvr1TsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_GFT_SRVR_1_TS_LEN = 26;
	/**
	 * 	serialize this TaraxtkGftSrvr1Ts
	 */
   protected void serializeTaraxtkGftSrvr1Ts(char[] taraxtkGftSrvr1Ts) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkGftSrvr1Ts,0,getStringValue(),beginTaraxtkGftSrvr1Ts,TARAXTK_GFT_SRVR_1_TS_LEN);
       localTaraxtkGftSrvr1TsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkGftSrvr1TsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTaraxtkGftSrvr1Ts is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkGftSrvr1Ts() {	 
   		return (substring(getStringValue(),beginTaraxtkGftSrvr1Ts,beginTaraxtkGftSrvr1Ts + TARAXTK_GFT_SRVR_1_TS_LEN));
   	}
     int localTaraxtkGftSrvr2NamCounter = -1;
     public boolean isTaraxtkGftSrvr2NamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkGftSrvr2NamCounter != sharedCounter;
         localTaraxtkGftSrvr2NamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_GFT_SRVR_2_NAM_LEN = 10;
	/**
	 * 	serialize this TaraxtkGftSrvr2Nam
	 */
   protected void serializeTaraxtkGftSrvr2Nam(char[] taraxtkGftSrvr2Nam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkGftSrvr2Nam,0,getStringValue(),beginTaraxtkGftSrvr2Nam,TARAXTK_GFT_SRVR_2_NAM_LEN);
       localTaraxtkGftSrvr2NamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkGftSrvr2NamConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTaraxtkGftSrvr2Nam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkGftSrvr2Nam() {	 
   		return (substring(getStringValue(),beginTaraxtkGftSrvr2Nam,beginTaraxtkGftSrvr2Nam + TARAXTK_GFT_SRVR_2_NAM_LEN));
   	}
     int localTaraxtkGftSrvr2DsnNamCounter = -1;
     public boolean isTaraxtkGftSrvr2DsnNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkGftSrvr2DsnNamCounter != sharedCounter;
         localTaraxtkGftSrvr2DsnNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_GFT_SRVR_2_DSN_NAM_LEN = 44;
	/**
	 * 	serialize this TaraxtkGftSrvr2DsnNam
	 */
   protected void serializeTaraxtkGftSrvr2DsnNam(char[] taraxtkGftSrvr2DsnNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkGftSrvr2DsnNam,0,getStringValue(),beginTaraxtkGftSrvr2DsnNam,TARAXTK_GFT_SRVR_2_DSN_NAM_LEN);
       localTaraxtkGftSrvr2DsnNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkGftSrvr2DsnNamConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshTaraxtkGftSrvr2DsnNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkGftSrvr2DsnNam() {	 
   		return (substring(getStringValue(),beginTaraxtkGftSrvr2DsnNam,beginTaraxtkGftSrvr2DsnNam + TARAXTK_GFT_SRVR_2_DSN_NAM_LEN));
   	}
     int localTaraxtkGftSrvr2TsCounter = -1;
     public boolean isTaraxtkGftSrvr2TsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkGftSrvr2TsCounter != sharedCounter;
         localTaraxtkGftSrvr2TsCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_GFT_SRVR_2_TS_LEN = 26;
	/**
	 * 	serialize this TaraxtkGftSrvr2Ts
	 */
   protected void serializeTaraxtkGftSrvr2Ts(char[] taraxtkGftSrvr2Ts) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkGftSrvr2Ts,0,getStringValue(),beginTaraxtkGftSrvr2Ts,TARAXTK_GFT_SRVR_2_TS_LEN);
       localTaraxtkGftSrvr2TsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkGftSrvr2TsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTaraxtkGftSrvr2Ts is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkGftSrvr2Ts() {	 
   		return (substring(getStringValue(),beginTaraxtkGftSrvr2Ts,beginTaraxtkGftSrvr2Ts + TARAXTK_GFT_SRVR_2_TS_LEN));
   	}
     int localTaraxtkMfeSrvrNamCounter = -1;
     public boolean isTaraxtkMfeSrvrNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkMfeSrvrNamCounter != sharedCounter;
         localTaraxtkMfeSrvrNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_MFE_SRVR_NAM_LEN = 20;
	/**
	 * 	serialize this TaraxtkMfeSrvrNam
	 */
   protected void serializeTaraxtkMfeSrvrNam(char[] taraxtkMfeSrvrNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkMfeSrvrNam,0,getStringValue(),beginTaraxtkMfeSrvrNam,TARAXTK_MFE_SRVR_NAM_LEN);
       localTaraxtkMfeSrvrNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkMfeSrvrNamConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshTaraxtkMfeSrvrNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkMfeSrvrNam() {	 
   		return (substring(getStringValue(),beginTaraxtkMfeSrvrNam,beginTaraxtkMfeSrvrNam + TARAXTK_MFE_SRVR_NAM_LEN));
   	}
     int localTaraxtkMfeBusPrtnrIdCounter = -1;
     public boolean isTaraxtkMfeBusPrtnrIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkMfeBusPrtnrIdCounter != sharedCounter;
         localTaraxtkMfeBusPrtnrIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_MFE_BUS_PRTNR_ID_LEN = 6;
	/**
	 * 	serialize this TaraxtkMfeBusPrtnrId
	 */
   protected void serializeTaraxtkMfeBusPrtnrId(char[] taraxtkMfeBusPrtnrId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkMfeBusPrtnrId,0,getStringValue(),beginTaraxtkMfeBusPrtnrId,TARAXTK_MFE_BUS_PRTNR_ID_LEN);
       localTaraxtkMfeBusPrtnrIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkMfeBusPrtnrIdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTaraxtkMfeBusPrtnrId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkMfeBusPrtnrId() {	 
   		return (substring(getStringValue(),beginTaraxtkMfeBusPrtnrId,beginTaraxtkMfeBusPrtnrId + TARAXTK_MFE_BUS_PRTNR_ID_LEN));
   	}
     int localTaraxtkMfeEndptIdCounter = -1;
     public boolean isTaraxtkMfeEndptIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkMfeEndptIdCounter != sharedCounter;
         localTaraxtkMfeEndptIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_MFE_ENDPT_ID_LEN = 7;
	/**
	 * 	serialize this TaraxtkMfeEndptId
	 */
   protected void serializeTaraxtkMfeEndptId(char[] taraxtkMfeEndptId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkMfeEndptId,0,getStringValue(),beginTaraxtkMfeEndptId,TARAXTK_MFE_ENDPT_ID_LEN);
       localTaraxtkMfeEndptIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkMfeEndptIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTaraxtkMfeEndptId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkMfeEndptId() {	 
   		return (substring(getStringValue(),beginTaraxtkMfeEndptId,beginTaraxtkMfeEndptId + TARAXTK_MFE_ENDPT_ID_LEN));
   	}
     int localTaraxtkMfeBulkIdCounter = -1;
     public boolean isTaraxtkMfeBulkIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkMfeBulkIdCounter != sharedCounter;
         localTaraxtkMfeBulkIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_MFE_BULK_ID_LEN = 4;
	/**
	 * 	serialize this TaraxtkMfeBulkId
	 */
   protected void serializeTaraxtkMfeBulkId(char[] taraxtkMfeBulkId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkMfeBulkId,0,getStringValue(),beginTaraxtkMfeBulkId,TARAXTK_MFE_BULK_ID_LEN);
       localTaraxtkMfeBulkIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkMfeBulkIdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshTaraxtkMfeBulkId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkMfeBulkId() {	 
   		return (substring(getStringValue(),beginTaraxtkMfeBulkId,beginTaraxtkMfeBulkId + TARAXTK_MFE_BULK_ID_LEN));
   	}
     int localTaraxtkInbndSwCounter = -1;
     public boolean isTaraxtkInbndSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkInbndSwCounter != sharedCounter;
         localTaraxtkInbndSwCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_INBND_SW_LEN = 1;
	/**
	 * 	serialize this TaraxtkInbndSw
	 */
   protected void serializeTaraxtkInbndSw(char[] taraxtkInbndSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkInbndSw,0,getStringValue(),beginTaraxtkInbndSw,TARAXTK_INBND_SW_LEN);
       localTaraxtkInbndSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkInbndSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTaraxtkInbndSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkInbndSw() {	 
   		return (substring(getStringValue(),beginTaraxtkInbndSw,beginTaraxtkInbndSw + TARAXTK_INBND_SW_LEN));
   	}
     int localTaraxtkOutbndSwCounter = -1;
     public boolean isTaraxtkOutbndSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkOutbndSwCounter != sharedCounter;
         localTaraxtkOutbndSwCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_OUTBND_SW_LEN = 1;
	/**
	 * 	serialize this TaraxtkOutbndSw
	 */
   protected void serializeTaraxtkOutbndSw(char[] taraxtkOutbndSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkOutbndSw,0,getStringValue(),beginTaraxtkOutbndSw,TARAXTK_OUTBND_SW_LEN);
       localTaraxtkOutbndSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkOutbndSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTaraxtkOutbndSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkOutbndSw() {	 
   		return (substring(getStringValue(),beginTaraxtkOutbndSw,beginTaraxtkOutbndSw + TARAXTK_OUTBND_SW_LEN));
   	}
     int localTaraxtkBrdcstSwCounter = -1;
     public boolean isTaraxtkBrdcstSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkBrdcstSwCounter != sharedCounter;
         localTaraxtkBrdcstSwCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_BRDCST_SW_LEN = 1;
	/**
	 * 	serialize this TaraxtkBrdcstSw
	 */
   protected void serializeTaraxtkBrdcstSw(char[] taraxtkBrdcstSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkBrdcstSw,0,getStringValue(),beginTaraxtkBrdcstSw,TARAXTK_BRDCST_SW_LEN);
       localTaraxtkBrdcstSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkBrdcstSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTaraxtkBrdcstSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkBrdcstSw() {	 
   		return (substring(getStringValue(),beginTaraxtkBrdcstSw,beginTaraxtkBrdcstSw + TARAXTK_BRDCST_SW_LEN));
   	}
     int localTaraxtkLastRunKyvlTxtCounter = -1;
     public boolean isTaraxtkLastRunKyvlTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkLastRunKyvlTxtCounter != sharedCounter;
         localTaraxtkLastRunKyvlTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_LAST_RUN_KYVL_TXT_LEN = 16;
	/**
	 * 	serialize this TaraxtkLastRunKyvlTxt
	 */
   protected void serializeTaraxtkLastRunKyvlTxt(char[] taraxtkLastRunKyvlTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkLastRunKyvlTxt,0,getStringValue(),beginTaraxtkLastRunKyvlTxt,TARAXTK_LAST_RUN_KYVL_TXT_LEN);
       localTaraxtkLastRunKyvlTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkLastRunKyvlTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshTaraxtkLastRunKyvlTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkLastRunKyvlTxt() {	 
   		return (substring(getStringValue(),beginTaraxtkLastRunKyvlTxt,beginTaraxtkLastRunKyvlTxt + TARAXTK_LAST_RUN_KYVL_TXT_LEN));
   	}
     int localTaraxtkSshBulkIdCounter = -1;
     public boolean isTaraxtkSshBulkIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkSshBulkIdCounter != sharedCounter;
         localTaraxtkSshBulkIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_SSH_BULK_ID_LEN = 4;
	/**
	 * 	serialize this TaraxtkSshBulkId
	 */
   protected void serializeTaraxtkSshBulkId(char[] taraxtkSshBulkId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkSshBulkId,0,getStringValue(),beginTaraxtkSshBulkId,TARAXTK_SSH_BULK_ID_LEN);
       localTaraxtkSshBulkIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkSshBulkIdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshTaraxtkSshBulkId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkSshBulkId() {	 
   		return (substring(getStringValue(),beginTaraxtkSshBulkId,beginTaraxtkSshBulkId + TARAXTK_SSH_BULK_ID_LEN));
   	}
     int localTaraxtkSshEndptIdCounter = -1;
     public boolean isTaraxtkSshEndptIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkSshEndptIdCounter != sharedCounter;
         localTaraxtkSshEndptIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_SSH_ENDPT_ID_LEN = 7;
	/**
	 * 	serialize this TaraxtkSshEndptId
	 */
   protected void serializeTaraxtkSshEndptId(char[] taraxtkSshEndptId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkSshEndptId,0,getStringValue(),beginTaraxtkSshEndptId,TARAXTK_SSH_ENDPT_ID_LEN);
       localTaraxtkSshEndptIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkSshEndptIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTaraxtkSshEndptId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkSshEndptId() {	 
   		return (substring(getStringValue(),beginTaraxtkSshEndptId,beginTaraxtkSshEndptId + TARAXTK_SSH_ENDPT_ID_LEN));
   	}
     int localTaraxtkSshBusPrtnrIdCounter = -1;
     public boolean isTaraxtkSshBusPrtnrIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkSshBusPrtnrIdCounter != sharedCounter;
         localTaraxtkSshBusPrtnrIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_SSH_BUS_PRTNR_ID_LEN = 6;
	/**
	 * 	serialize this TaraxtkSshBusPrtnrId
	 */
   protected void serializeTaraxtkSshBusPrtnrId(char[] taraxtkSshBusPrtnrId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkSshBusPrtnrId,0,getStringValue(),beginTaraxtkSshBusPrtnrId,TARAXTK_SSH_BUS_PRTNR_ID_LEN);
       localTaraxtkSshBusPrtnrIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkSshBusPrtnrIdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTaraxtkSshBusPrtnrId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkSshBusPrtnrId() {	 
   		return (substring(getStringValue(),beginTaraxtkSshBusPrtnrId,beginTaraxtkSshBusPrtnrId + TARAXTK_SSH_BUS_PRTNR_ID_LEN));
   	}
     int localTaraxtkSshSrvrNamCounter = -1;
     public boolean isTaraxtkSshSrvrNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkSshSrvrNamCounter != sharedCounter;
         localTaraxtkSshSrvrNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAXTK_SSH_SRVR_NAM_LEN = 20;
	/**
	 * 	serialize this TaraxtkSshSrvrNam
	 */
   protected void serializeTaraxtkSshSrvrNam(char[] taraxtkSshSrvrNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraxtkSshSrvrNam,0,getStringValue(),beginTaraxtkSshSrvrNam,TARAXTK_SSH_SRVR_NAM_LEN);
       localTaraxtkSshSrvrNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraxtkSshSrvrNamConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshTaraxtkSshSrvrNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraxtkSshSrvrNam() {	 
   		return (substring(getStringValue(),beginTaraxtkSshSrvrNam,beginTaraxtkSshSrvrNam + TARAXTK_SSH_SRVR_NAM_LEN));
   	}




}
  

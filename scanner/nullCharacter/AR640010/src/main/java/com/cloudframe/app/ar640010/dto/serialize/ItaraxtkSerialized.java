package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ItaraxtkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ItaraxtkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ItaraxtkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ITARAXTK_LENGTH = 50;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTaraxtkDlyIntvlNumN;
            protected  int beginTaraxtkHighLvlQlfrCdN;
            protected  int beginTaraxtkDirNodeNamN;
            protected  int beginTaraxtkLstRunTsN;
            protected  int beginTaraxtkStatsFileNamN;
            protected  int beginTaraxtkRunLmtNumN;
            protected  int beginTaraxtkLclRawStatsNamN;
            protected  int beginTaraxtkLclSrvrFileNamN;
            protected  int beginTaraxtkLclFmtdStatsNamN;
            protected  int beginTaraxtkGftSrvr2NamN;
            protected  int beginTaraxtkGftSrvr2DsnNamN;
            protected  int beginTaraxtkGftSrvr2TsN;
            protected  int beginTaraxtkMfeSrvrNamN;
            protected  int beginTaraxtkMfeBusPrtnrIdN;
            protected  int beginTaraxtkMfeEndptIdN;
            protected  int beginTaraxtkMfeBulkIdN;
            protected  int beginTaraxtkInbndSwN;
            protected  int beginTaraxtkOutbndSwN;
            protected  int beginTaraxtkBrdcstSwN;
            protected  int beginTaraxtkLastRunKyvlTxtN;
            protected  int beginTaraxtkSshBulkIdN;
            protected  int beginTaraxtkSshEndptIdN;
            protected  int beginTaraxtkSshBusPrtnrIdN;
            protected  int beginTaraxtkSshSrvrNamN;
            protected  int beginTaraxtkTaskWorkParmTxtN;
	
	/**
	* Constructor for ItaraxtkSerialized
	**/
    public ItaraxtkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ItaraxtkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ITARAXTK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTaraxtkDlyIntvlNumN = getStartOffset() + 0;	// set offset for serialization
  
             beginTaraxtkHighLvlQlfrCdN = getStartOffset() + 2;	// set offset for serialization
  
             beginTaraxtkDirNodeNamN = getStartOffset() + 4;	// set offset for serialization
  
             beginTaraxtkLstRunTsN = getStartOffset() + 6;	// set offset for serialization
  
             beginTaraxtkStatsFileNamN = getStartOffset() + 8;	// set offset for serialization
  
             beginTaraxtkRunLmtNumN = getStartOffset() + 10;	// set offset for serialization
  
             beginTaraxtkLclRawStatsNamN = getStartOffset() + 12;	// set offset for serialization
  
             beginTaraxtkLclSrvrFileNamN = getStartOffset() + 14;	// set offset for serialization
  
             beginTaraxtkLclFmtdStatsNamN = getStartOffset() + 16;	// set offset for serialization
  
             beginTaraxtkGftSrvr2NamN = getStartOffset() + 18;	// set offset for serialization
  
             beginTaraxtkGftSrvr2DsnNamN = getStartOffset() + 20;	// set offset for serialization
  
             beginTaraxtkGftSrvr2TsN = getStartOffset() + 22;	// set offset for serialization
  
             beginTaraxtkMfeSrvrNamN = getStartOffset() + 24;	// set offset for serialization
  
             beginTaraxtkMfeBusPrtnrIdN = getStartOffset() + 26;	// set offset for serialization
  
             beginTaraxtkMfeEndptIdN = getStartOffset() + 28;	// set offset for serialization
  
             beginTaraxtkMfeBulkIdN = getStartOffset() + 30;	// set offset for serialization
  
             beginTaraxtkInbndSwN = getStartOffset() + 32;	// set offset for serialization
  
             beginTaraxtkOutbndSwN = getStartOffset() + 34;	// set offset for serialization
  
             beginTaraxtkBrdcstSwN = getStartOffset() + 36;	// set offset for serialization
  
             beginTaraxtkLastRunKyvlTxtN = getStartOffset() + 38;	// set offset for serialization
  
             beginTaraxtkSshBulkIdN = getStartOffset() + 40;	// set offset for serialization
  
             beginTaraxtkSshEndptIdN = getStartOffset() + 42;	// set offset for serialization
  
             beginTaraxtkSshBusPrtnrIdN = getStartOffset() + 44;	// set offset for serialization
  
             beginTaraxtkSshSrvrNamN = getStartOffset() + 46;	// set offset for serialization
  
             beginTaraxtkTaskWorkParmTxtN = getStartOffset() + 48;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localTaraxtkDlyIntvlNumNCounter = -1;
         public boolean isTaraxtkDlyIntvlNumNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkDlyIntvlNumNCounter != sharedCounter;
            localTaraxtkDlyIntvlNumNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_DLY_INTVL_NUM_N_LEN = 2;
  	/**
	 * serializeTaraxtkDlyIntvlNumN
	 */
	protected void serializeTaraxtkDlyIntvlNumN(short taraxtkDlyIntvlNumN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkDlyIntvlNumN,TARAXTK_DLY_INTVL_NUM_N_LEN)
                  ,beginTaraxtkDlyIntvlNumN
                  ,TARAXTK_DLY_INTVL_NUM_N_LEN
                 );
            localTaraxtkDlyIntvlNumNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkDlyIntvlNumNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkDlyIntvlNumN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkDlyIntvlNumN() {	 
			return (getShort(beginTaraxtkDlyIntvlNumN));
   	}
         int localTaraxtkHighLvlQlfrCdNCounter = -1;
         public boolean isTaraxtkHighLvlQlfrCdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkHighLvlQlfrCdNCounter != sharedCounter;
            localTaraxtkHighLvlQlfrCdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_HIGH_LVL_QLFR_CD_N_LEN = 2;
  	/**
	 * serializeTaraxtkHighLvlQlfrCdN
	 */
	protected void serializeTaraxtkHighLvlQlfrCdN(short taraxtkHighLvlQlfrCdN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkHighLvlQlfrCdN,TARAXTK_HIGH_LVL_QLFR_CD_N_LEN)
                  ,beginTaraxtkHighLvlQlfrCdN
                  ,TARAXTK_HIGH_LVL_QLFR_CD_N_LEN
                 );
            localTaraxtkHighLvlQlfrCdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkHighLvlQlfrCdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkHighLvlQlfrCdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkHighLvlQlfrCdN() {	 
			return (getShort(beginTaraxtkHighLvlQlfrCdN));
   	}
         int localTaraxtkDirNodeNamNCounter = -1;
         public boolean isTaraxtkDirNodeNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkDirNodeNamNCounter != sharedCounter;
            localTaraxtkDirNodeNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_DIR_NODE_NAM_N_LEN = 2;
  	/**
	 * serializeTaraxtkDirNodeNamN
	 */
	protected void serializeTaraxtkDirNodeNamN(short taraxtkDirNodeNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkDirNodeNamN,TARAXTK_DIR_NODE_NAM_N_LEN)
                  ,beginTaraxtkDirNodeNamN
                  ,TARAXTK_DIR_NODE_NAM_N_LEN
                 );
            localTaraxtkDirNodeNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkDirNodeNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkDirNodeNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkDirNodeNamN() {	 
			return (getShort(beginTaraxtkDirNodeNamN));
   	}
         int localTaraxtkLstRunTsNCounter = -1;
         public boolean isTaraxtkLstRunTsNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkLstRunTsNCounter != sharedCounter;
            localTaraxtkLstRunTsNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_LST_RUN_TS_N_LEN = 2;
  	/**
	 * serializeTaraxtkLstRunTsN
	 */
	protected void serializeTaraxtkLstRunTsN(short taraxtkLstRunTsN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkLstRunTsN,TARAXTK_LST_RUN_TS_N_LEN)
                  ,beginTaraxtkLstRunTsN
                  ,TARAXTK_LST_RUN_TS_N_LEN
                 );
            localTaraxtkLstRunTsNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkLstRunTsNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkLstRunTsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkLstRunTsN() {	 
			return (getShort(beginTaraxtkLstRunTsN));
   	}
         int localTaraxtkStatsFileNamNCounter = -1;
         public boolean isTaraxtkStatsFileNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkStatsFileNamNCounter != sharedCounter;
            localTaraxtkStatsFileNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_STATS_FILE_NAM_N_LEN = 2;
  	/**
	 * serializeTaraxtkStatsFileNamN
	 */
	protected void serializeTaraxtkStatsFileNamN(short taraxtkStatsFileNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkStatsFileNamN,TARAXTK_STATS_FILE_NAM_N_LEN)
                  ,beginTaraxtkStatsFileNamN
                  ,TARAXTK_STATS_FILE_NAM_N_LEN
                 );
            localTaraxtkStatsFileNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkStatsFileNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkStatsFileNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkStatsFileNamN() {	 
			return (getShort(beginTaraxtkStatsFileNamN));
   	}
         int localTaraxtkRunLmtNumNCounter = -1;
         public boolean isTaraxtkRunLmtNumNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkRunLmtNumNCounter != sharedCounter;
            localTaraxtkRunLmtNumNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_RUN_LMT_NUM_N_LEN = 2;
  	/**
	 * serializeTaraxtkRunLmtNumN
	 */
	protected void serializeTaraxtkRunLmtNumN(short taraxtkRunLmtNumN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkRunLmtNumN,TARAXTK_RUN_LMT_NUM_N_LEN)
                  ,beginTaraxtkRunLmtNumN
                  ,TARAXTK_RUN_LMT_NUM_N_LEN
                 );
            localTaraxtkRunLmtNumNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkRunLmtNumNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkRunLmtNumN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkRunLmtNumN() {	 
			return (getShort(beginTaraxtkRunLmtNumN));
   	}
         int localTaraxtkLclRawStatsNamNCounter = -1;
         public boolean isTaraxtkLclRawStatsNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkLclRawStatsNamNCounter != sharedCounter;
            localTaraxtkLclRawStatsNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_LCL_RAW_STATS_NAM_N_LEN = 2;
  	/**
	 * serializeTaraxtkLclRawStatsNamN
	 */
	protected void serializeTaraxtkLclRawStatsNamN(short taraxtkLclRawStatsNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkLclRawStatsNamN,TARAXTK_LCL_RAW_STATS_NAM_N_LEN)
                  ,beginTaraxtkLclRawStatsNamN
                  ,TARAXTK_LCL_RAW_STATS_NAM_N_LEN
                 );
            localTaraxtkLclRawStatsNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkLclRawStatsNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkLclRawStatsNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkLclRawStatsNamN() {	 
			return (getShort(beginTaraxtkLclRawStatsNamN));
   	}
         int localTaraxtkLclSrvrFileNamNCounter = -1;
         public boolean isTaraxtkLclSrvrFileNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkLclSrvrFileNamNCounter != sharedCounter;
            localTaraxtkLclSrvrFileNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_LCL_SRVR_FILE_NAM_N_LEN = 2;
  	/**
	 * serializeTaraxtkLclSrvrFileNamN
	 */
	protected void serializeTaraxtkLclSrvrFileNamN(short taraxtkLclSrvrFileNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkLclSrvrFileNamN,TARAXTK_LCL_SRVR_FILE_NAM_N_LEN)
                  ,beginTaraxtkLclSrvrFileNamN
                  ,TARAXTK_LCL_SRVR_FILE_NAM_N_LEN
                 );
            localTaraxtkLclSrvrFileNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkLclSrvrFileNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkLclSrvrFileNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkLclSrvrFileNamN() {	 
			return (getShort(beginTaraxtkLclSrvrFileNamN));
   	}
         int localTaraxtkLclFmtdStatsNamNCounter = -1;
         public boolean isTaraxtkLclFmtdStatsNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkLclFmtdStatsNamNCounter != sharedCounter;
            localTaraxtkLclFmtdStatsNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_LCL_FMTD_STATS_NAM_N_LEN = 2;
  	/**
	 * serializeTaraxtkLclFmtdStatsNamN
	 */
	protected void serializeTaraxtkLclFmtdStatsNamN(short taraxtkLclFmtdStatsNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkLclFmtdStatsNamN,TARAXTK_LCL_FMTD_STATS_NAM_N_LEN)
                  ,beginTaraxtkLclFmtdStatsNamN
                  ,TARAXTK_LCL_FMTD_STATS_NAM_N_LEN
                 );
            localTaraxtkLclFmtdStatsNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkLclFmtdStatsNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkLclFmtdStatsNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkLclFmtdStatsNamN() {	 
			return (getShort(beginTaraxtkLclFmtdStatsNamN));
   	}
         int localTaraxtkGftSrvr2NamNCounter = -1;
         public boolean isTaraxtkGftSrvr2NamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkGftSrvr2NamNCounter != sharedCounter;
            localTaraxtkGftSrvr2NamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_GFT_SRVR_2_NAM_N_LEN = 2;
  	/**
	 * serializeTaraxtkGftSrvr2NamN
	 */
	protected void serializeTaraxtkGftSrvr2NamN(short taraxtkGftSrvr2NamN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkGftSrvr2NamN,TARAXTK_GFT_SRVR_2_NAM_N_LEN)
                  ,beginTaraxtkGftSrvr2NamN
                  ,TARAXTK_GFT_SRVR_2_NAM_N_LEN
                 );
            localTaraxtkGftSrvr2NamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkGftSrvr2NamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkGftSrvr2NamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkGftSrvr2NamN() {	 
			return (getShort(beginTaraxtkGftSrvr2NamN));
   	}
         int localTaraxtkGftSrvr2DsnNamNCounter = -1;
         public boolean isTaraxtkGftSrvr2DsnNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkGftSrvr2DsnNamNCounter != sharedCounter;
            localTaraxtkGftSrvr2DsnNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_GFT_SRVR_2_DSN_NAM_N_LEN = 2;
  	/**
	 * serializeTaraxtkGftSrvr2DsnNamN
	 */
	protected void serializeTaraxtkGftSrvr2DsnNamN(short taraxtkGftSrvr2DsnNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkGftSrvr2DsnNamN,TARAXTK_GFT_SRVR_2_DSN_NAM_N_LEN)
                  ,beginTaraxtkGftSrvr2DsnNamN
                  ,TARAXTK_GFT_SRVR_2_DSN_NAM_N_LEN
                 );
            localTaraxtkGftSrvr2DsnNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkGftSrvr2DsnNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkGftSrvr2DsnNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkGftSrvr2DsnNamN() {	 
			return (getShort(beginTaraxtkGftSrvr2DsnNamN));
   	}
         int localTaraxtkGftSrvr2TsNCounter = -1;
         public boolean isTaraxtkGftSrvr2TsNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkGftSrvr2TsNCounter != sharedCounter;
            localTaraxtkGftSrvr2TsNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_GFT_SRVR_2_TS_N_LEN = 2;
  	/**
	 * serializeTaraxtkGftSrvr2TsN
	 */
	protected void serializeTaraxtkGftSrvr2TsN(short taraxtkGftSrvr2TsN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkGftSrvr2TsN,TARAXTK_GFT_SRVR_2_TS_N_LEN)
                  ,beginTaraxtkGftSrvr2TsN
                  ,TARAXTK_GFT_SRVR_2_TS_N_LEN
                 );
            localTaraxtkGftSrvr2TsNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkGftSrvr2TsNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkGftSrvr2TsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkGftSrvr2TsN() {	 
			return (getShort(beginTaraxtkGftSrvr2TsN));
   	}
         int localTaraxtkMfeSrvrNamNCounter = -1;
         public boolean isTaraxtkMfeSrvrNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkMfeSrvrNamNCounter != sharedCounter;
            localTaraxtkMfeSrvrNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_MFE_SRVR_NAM_N_LEN = 2;
  	/**
	 * serializeTaraxtkMfeSrvrNamN
	 */
	protected void serializeTaraxtkMfeSrvrNamN(short taraxtkMfeSrvrNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkMfeSrvrNamN,TARAXTK_MFE_SRVR_NAM_N_LEN)
                  ,beginTaraxtkMfeSrvrNamN
                  ,TARAXTK_MFE_SRVR_NAM_N_LEN
                 );
            localTaraxtkMfeSrvrNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkMfeSrvrNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkMfeSrvrNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkMfeSrvrNamN() {	 
			return (getShort(beginTaraxtkMfeSrvrNamN));
   	}
         int localTaraxtkMfeBusPrtnrIdNCounter = -1;
         public boolean isTaraxtkMfeBusPrtnrIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkMfeBusPrtnrIdNCounter != sharedCounter;
            localTaraxtkMfeBusPrtnrIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_MFE_BUS_PRTNR_ID_N_LEN = 2;
  	/**
	 * serializeTaraxtkMfeBusPrtnrIdN
	 */
	protected void serializeTaraxtkMfeBusPrtnrIdN(short taraxtkMfeBusPrtnrIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkMfeBusPrtnrIdN,TARAXTK_MFE_BUS_PRTNR_ID_N_LEN)
                  ,beginTaraxtkMfeBusPrtnrIdN
                  ,TARAXTK_MFE_BUS_PRTNR_ID_N_LEN
                 );
            localTaraxtkMfeBusPrtnrIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkMfeBusPrtnrIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkMfeBusPrtnrIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkMfeBusPrtnrIdN() {	 
			return (getShort(beginTaraxtkMfeBusPrtnrIdN));
   	}
         int localTaraxtkMfeEndptIdNCounter = -1;
         public boolean isTaraxtkMfeEndptIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkMfeEndptIdNCounter != sharedCounter;
            localTaraxtkMfeEndptIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_MFE_ENDPT_ID_N_LEN = 2;
  	/**
	 * serializeTaraxtkMfeEndptIdN
	 */
	protected void serializeTaraxtkMfeEndptIdN(short taraxtkMfeEndptIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkMfeEndptIdN,TARAXTK_MFE_ENDPT_ID_N_LEN)
                  ,beginTaraxtkMfeEndptIdN
                  ,TARAXTK_MFE_ENDPT_ID_N_LEN
                 );
            localTaraxtkMfeEndptIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkMfeEndptIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkMfeEndptIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkMfeEndptIdN() {	 
			return (getShort(beginTaraxtkMfeEndptIdN));
   	}
         int localTaraxtkMfeBulkIdNCounter = -1;
         public boolean isTaraxtkMfeBulkIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkMfeBulkIdNCounter != sharedCounter;
            localTaraxtkMfeBulkIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_MFE_BULK_ID_N_LEN = 2;
  	/**
	 * serializeTaraxtkMfeBulkIdN
	 */
	protected void serializeTaraxtkMfeBulkIdN(short taraxtkMfeBulkIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkMfeBulkIdN,TARAXTK_MFE_BULK_ID_N_LEN)
                  ,beginTaraxtkMfeBulkIdN
                  ,TARAXTK_MFE_BULK_ID_N_LEN
                 );
            localTaraxtkMfeBulkIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkMfeBulkIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkMfeBulkIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkMfeBulkIdN() {	 
			return (getShort(beginTaraxtkMfeBulkIdN));
   	}
         int localTaraxtkInbndSwNCounter = -1;
         public boolean isTaraxtkInbndSwNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkInbndSwNCounter != sharedCounter;
            localTaraxtkInbndSwNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_INBND_SW_N_LEN = 2;
  	/**
	 * serializeTaraxtkInbndSwN
	 */
	protected void serializeTaraxtkInbndSwN(short taraxtkInbndSwN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkInbndSwN,TARAXTK_INBND_SW_N_LEN)
                  ,beginTaraxtkInbndSwN
                  ,TARAXTK_INBND_SW_N_LEN
                 );
            localTaraxtkInbndSwNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkInbndSwNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkInbndSwN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkInbndSwN() {	 
			return (getShort(beginTaraxtkInbndSwN));
   	}
         int localTaraxtkOutbndSwNCounter = -1;
         public boolean isTaraxtkOutbndSwNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkOutbndSwNCounter != sharedCounter;
            localTaraxtkOutbndSwNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_OUTBND_SW_N_LEN = 2;
  	/**
	 * serializeTaraxtkOutbndSwN
	 */
	protected void serializeTaraxtkOutbndSwN(short taraxtkOutbndSwN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkOutbndSwN,TARAXTK_OUTBND_SW_N_LEN)
                  ,beginTaraxtkOutbndSwN
                  ,TARAXTK_OUTBND_SW_N_LEN
                 );
            localTaraxtkOutbndSwNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkOutbndSwNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkOutbndSwN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkOutbndSwN() {	 
			return (getShort(beginTaraxtkOutbndSwN));
   	}
         int localTaraxtkBrdcstSwNCounter = -1;
         public boolean isTaraxtkBrdcstSwNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkBrdcstSwNCounter != sharedCounter;
            localTaraxtkBrdcstSwNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_BRDCST_SW_N_LEN = 2;
  	/**
	 * serializeTaraxtkBrdcstSwN
	 */
	protected void serializeTaraxtkBrdcstSwN(short taraxtkBrdcstSwN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkBrdcstSwN,TARAXTK_BRDCST_SW_N_LEN)
                  ,beginTaraxtkBrdcstSwN
                  ,TARAXTK_BRDCST_SW_N_LEN
                 );
            localTaraxtkBrdcstSwNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkBrdcstSwNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkBrdcstSwN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkBrdcstSwN() {	 
			return (getShort(beginTaraxtkBrdcstSwN));
   	}
         int localTaraxtkLastRunKyvlTxtNCounter = -1;
         public boolean isTaraxtkLastRunKyvlTxtNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkLastRunKyvlTxtNCounter != sharedCounter;
            localTaraxtkLastRunKyvlTxtNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_LAST_RUN_KYVL_TXT_N_LEN = 2;
  	/**
	 * serializeTaraxtkLastRunKyvlTxtN
	 */
	protected void serializeTaraxtkLastRunKyvlTxtN(short taraxtkLastRunKyvlTxtN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkLastRunKyvlTxtN,TARAXTK_LAST_RUN_KYVL_TXT_N_LEN)
                  ,beginTaraxtkLastRunKyvlTxtN
                  ,TARAXTK_LAST_RUN_KYVL_TXT_N_LEN
                 );
            localTaraxtkLastRunKyvlTxtNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkLastRunKyvlTxtNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkLastRunKyvlTxtN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkLastRunKyvlTxtN() {	 
			return (getShort(beginTaraxtkLastRunKyvlTxtN));
   	}
         int localTaraxtkSshBulkIdNCounter = -1;
         public boolean isTaraxtkSshBulkIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkSshBulkIdNCounter != sharedCounter;
            localTaraxtkSshBulkIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_SSH_BULK_ID_N_LEN = 2;
  	/**
	 * serializeTaraxtkSshBulkIdN
	 */
	protected void serializeTaraxtkSshBulkIdN(short taraxtkSshBulkIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkSshBulkIdN,TARAXTK_SSH_BULK_ID_N_LEN)
                  ,beginTaraxtkSshBulkIdN
                  ,TARAXTK_SSH_BULK_ID_N_LEN
                 );
            localTaraxtkSshBulkIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkSshBulkIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkSshBulkIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkSshBulkIdN() {	 
			return (getShort(beginTaraxtkSshBulkIdN));
   	}
         int localTaraxtkSshEndptIdNCounter = -1;
         public boolean isTaraxtkSshEndptIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkSshEndptIdNCounter != sharedCounter;
            localTaraxtkSshEndptIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_SSH_ENDPT_ID_N_LEN = 2;
  	/**
	 * serializeTaraxtkSshEndptIdN
	 */
	protected void serializeTaraxtkSshEndptIdN(short taraxtkSshEndptIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkSshEndptIdN,TARAXTK_SSH_ENDPT_ID_N_LEN)
                  ,beginTaraxtkSshEndptIdN
                  ,TARAXTK_SSH_ENDPT_ID_N_LEN
                 );
            localTaraxtkSshEndptIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkSshEndptIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkSshEndptIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkSshEndptIdN() {	 
			return (getShort(beginTaraxtkSshEndptIdN));
   	}
         int localTaraxtkSshBusPrtnrIdNCounter = -1;
         public boolean isTaraxtkSshBusPrtnrIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkSshBusPrtnrIdNCounter != sharedCounter;
            localTaraxtkSshBusPrtnrIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_SSH_BUS_PRTNR_ID_N_LEN = 2;
  	/**
	 * serializeTaraxtkSshBusPrtnrIdN
	 */
	protected void serializeTaraxtkSshBusPrtnrIdN(short taraxtkSshBusPrtnrIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkSshBusPrtnrIdN,TARAXTK_SSH_BUS_PRTNR_ID_N_LEN)
                  ,beginTaraxtkSshBusPrtnrIdN
                  ,TARAXTK_SSH_BUS_PRTNR_ID_N_LEN
                 );
            localTaraxtkSshBusPrtnrIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkSshBusPrtnrIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkSshBusPrtnrIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkSshBusPrtnrIdN() {	 
			return (getShort(beginTaraxtkSshBusPrtnrIdN));
   	}
         int localTaraxtkSshSrvrNamNCounter = -1;
         public boolean isTaraxtkSshSrvrNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkSshSrvrNamNCounter != sharedCounter;
            localTaraxtkSshSrvrNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_SSH_SRVR_NAM_N_LEN = 2;
  	/**
	 * serializeTaraxtkSshSrvrNamN
	 */
	protected void serializeTaraxtkSshSrvrNamN(short taraxtkSshSrvrNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkSshSrvrNamN,TARAXTK_SSH_SRVR_NAM_N_LEN)
                  ,beginTaraxtkSshSrvrNamN
                  ,TARAXTK_SSH_SRVR_NAM_N_LEN
                 );
            localTaraxtkSshSrvrNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkSshSrvrNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkSshSrvrNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkSshSrvrNamN() {	 
			return (getShort(beginTaraxtkSshSrvrNamN));
   	}
         int localTaraxtkTaskWorkParmTxtNCounter = -1;
         public boolean isTaraxtkTaskWorkParmTxtNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraxtkTaskWorkParmTxtNCounter != sharedCounter;
            localTaraxtkTaskWorkParmTxtNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAXTK_TASK_WORK_PARM_TXT_N_LEN = 2;
  	/**
	 * serializeTaraxtkTaskWorkParmTxtN
	 */
	protected void serializeTaraxtkTaskWorkParmTxtN(short taraxtkTaskWorkParmTxtN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraxtkTaskWorkParmTxtN,TARAXTK_TASK_WORK_PARM_TXT_N_LEN)
                  ,beginTaraxtkTaskWorkParmTxtN
                  ,TARAXTK_TASK_WORK_PARM_TXT_N_LEN
                 );
            localTaraxtkTaskWorkParmTxtNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraxtkTaskWorkParmTxtNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraxtkTaskWorkParmTxtN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraxtkTaskWorkParmTxtN() {	 
			return (getShort(beginTaraxtkTaskWorkParmTxtN));
   	}




}
  

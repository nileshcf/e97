package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ItarafxsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ItarafxsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ItarafxsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ITARAFXS_LENGTH = 98;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTarafxsArchLocTxtN;
            protected  int beginTarafxsLstStatTsN;
            protected  int beginTarafxsXferRqstTsN;
            protected  int beginTarafxsXferStrtTsN;
            protected  int beginTarafxsXferStopTsN;
            protected  int beginTarafxsXferRdyTsN;
            protected  int beginTarafxsXferCondCdN;
            protected  int beginTarafxsXferStatTxtN;
            protected  int beginTarafxsXferPrcssIdN;
            protected  int beginTarafxsOrgXferPrcsIdN;
            protected  int beginTarafxsTrgrCondCdN;
            protected  int beginTarafxsTrgrStatTxtN;
            protected  int beginTarafxsOrgLocNamN;
            protected  int beginTarafxsTrgrActNamN;
            protected  int beginTarafxsPrvMnfrmFileNamN;
            protected  int beginTarafxsPrvCyclNumN;
            protected  int beginTarafxsPrvBusPrtnrIdN;
            protected  int beginTarafxsPrvEndptIdN;
            protected  int beginTarafxsPrvAvailTsN;
            protected  int beginTarafxsNxtMnfrmFileNamN;
            protected  int beginTarafxsNxtCyclNumN;
            protected  int beginTarafxsNxtBusPrtnrIdN;
            protected  int beginTarafxsNxtEndptIdN;
            protected  int beginTarafxsNxtAvailTsN;
            protected  int beginTarafxsApplExitJobNamN;
            protected  int beginTarafxsApplExitTsN;
            protected  int beginTarafxsCsMipIdN;
            protected  int beginTarafxsRmMipIdN;
            protected  int beginTarafxsApplExitNamN;
            protected  int beginTarafxsTapeCmpltdSwN;
            protected  int beginTarafxsTapeMultVolSwN;
            protected  int beginTarafxsApplPrcssngDtN;
            protected  int beginTarafxsTransitionalDsnN;
            protected  int beginTarafxsSourceHubIdN;
            protected  int beginTarafxsOwningHubIdN;
            protected  int beginTarafxsStatRefIdN;
            protected  int beginTarafxsSrcLocEntNamN;
            protected  int beginTarafxsSrcTaskNamN;
            protected  int beginTarafxsSrcTaskIdN;
            protected  int beginTarafxsSrcTaskUsrN;
            protected  int beginTarafxsSrcTaskStrtTsN;
            protected  int beginTarafxsSrcTaskStopTsN;
            protected  int beginTarafxsTrgtLocEntNamN;
            protected  int beginTarafxsTrgtTaskNamN;
            protected  int beginTarafxsTrgtTaskIdN;
            protected  int beginTarafxsTrgtTaskUsrN;
            protected  int beginTarafxsTrgtTaskStrtTsN;
            protected  int beginTarafxsTrgtTaskStopTsN;
            protected  int beginTarafxsApplTknNamN;
	
	/**
	* Constructor for ItarafxsSerialized
	**/
    public ItarafxsSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ItarafxsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ITARAFXS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTarafxsArchLocTxtN = getStartOffset() + 0;	// set offset for serialization
  
             beginTarafxsLstStatTsN = getStartOffset() + 2;	// set offset for serialization
  
             beginTarafxsXferRqstTsN = getStartOffset() + 4;	// set offset for serialization
  
             beginTarafxsXferStrtTsN = getStartOffset() + 6;	// set offset for serialization
  
             beginTarafxsXferStopTsN = getStartOffset() + 8;	// set offset for serialization
  
             beginTarafxsXferRdyTsN = getStartOffset() + 10;	// set offset for serialization
  
             beginTarafxsXferCondCdN = getStartOffset() + 12;	// set offset for serialization
  
             beginTarafxsXferStatTxtN = getStartOffset() + 14;	// set offset for serialization
  
             beginTarafxsXferPrcssIdN = getStartOffset() + 16;	// set offset for serialization
  
             beginTarafxsOrgXferPrcsIdN = getStartOffset() + 18;	// set offset for serialization
  
             beginTarafxsTrgrCondCdN = getStartOffset() + 20;	// set offset for serialization
  
             beginTarafxsTrgrStatTxtN = getStartOffset() + 22;	// set offset for serialization
  
             beginTarafxsOrgLocNamN = getStartOffset() + 24;	// set offset for serialization
  
             beginTarafxsTrgrActNamN = getStartOffset() + 26;	// set offset for serialization
  
             beginTarafxsPrvMnfrmFileNamN = getStartOffset() + 28;	// set offset for serialization
  
             beginTarafxsPrvCyclNumN = getStartOffset() + 30;	// set offset for serialization
  
             beginTarafxsPrvBusPrtnrIdN = getStartOffset() + 32;	// set offset for serialization
  
             beginTarafxsPrvEndptIdN = getStartOffset() + 34;	// set offset for serialization
  
             beginTarafxsPrvAvailTsN = getStartOffset() + 36;	// set offset for serialization
  
             beginTarafxsNxtMnfrmFileNamN = getStartOffset() + 38;	// set offset for serialization
  
             beginTarafxsNxtCyclNumN = getStartOffset() + 40;	// set offset for serialization
  
             beginTarafxsNxtBusPrtnrIdN = getStartOffset() + 42;	// set offset for serialization
  
             beginTarafxsNxtEndptIdN = getStartOffset() + 44;	// set offset for serialization
  
             beginTarafxsNxtAvailTsN = getStartOffset() + 46;	// set offset for serialization
  
             beginTarafxsApplExitJobNamN = getStartOffset() + 48;	// set offset for serialization
  
             beginTarafxsApplExitTsN = getStartOffset() + 50;	// set offset for serialization
  
             beginTarafxsCsMipIdN = getStartOffset() + 52;	// set offset for serialization
  
             beginTarafxsRmMipIdN = getStartOffset() + 54;	// set offset for serialization
  
             beginTarafxsApplExitNamN = getStartOffset() + 56;	// set offset for serialization
  
             beginTarafxsTapeCmpltdSwN = getStartOffset() + 58;	// set offset for serialization
  
             beginTarafxsTapeMultVolSwN = getStartOffset() + 60;	// set offset for serialization
  
             beginTarafxsApplPrcssngDtN = getStartOffset() + 62;	// set offset for serialization
  
             beginTarafxsTransitionalDsnN = getStartOffset() + 64;	// set offset for serialization
  
             beginTarafxsSourceHubIdN = getStartOffset() + 66;	// set offset for serialization
  
             beginTarafxsOwningHubIdN = getStartOffset() + 68;	// set offset for serialization
  
             beginTarafxsStatRefIdN = getStartOffset() + 70;	// set offset for serialization
  
             beginTarafxsSrcLocEntNamN = getStartOffset() + 72;	// set offset for serialization
  
             beginTarafxsSrcTaskNamN = getStartOffset() + 74;	// set offset for serialization
  
             beginTarafxsSrcTaskIdN = getStartOffset() + 76;	// set offset for serialization
  
             beginTarafxsSrcTaskUsrN = getStartOffset() + 78;	// set offset for serialization
  
             beginTarafxsSrcTaskStrtTsN = getStartOffset() + 80;	// set offset for serialization
  
             beginTarafxsSrcTaskStopTsN = getStartOffset() + 82;	// set offset for serialization
  
             beginTarafxsTrgtLocEntNamN = getStartOffset() + 84;	// set offset for serialization
  
             beginTarafxsTrgtTaskNamN = getStartOffset() + 86;	// set offset for serialization
  
             beginTarafxsTrgtTaskIdN = getStartOffset() + 88;	// set offset for serialization
  
             beginTarafxsTrgtTaskUsrN = getStartOffset() + 90;	// set offset for serialization
  
             beginTarafxsTrgtTaskStrtTsN = getStartOffset() + 92;	// set offset for serialization
  
             beginTarafxsTrgtTaskStopTsN = getStartOffset() + 94;	// set offset for serialization
  
             beginTarafxsApplTknNamN = getStartOffset() + 96;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localTarafxsArchLocTxtNCounter = -1;
         public boolean isTarafxsArchLocTxtNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsArchLocTxtNCounter != sharedCounter;
            localTarafxsArchLocTxtNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_ARCH_LOC_TXT_N_LEN = 2;
  	/**
	 * serializeTarafxsArchLocTxtN
	 */
	protected void serializeTarafxsArchLocTxtN(short tarafxsArchLocTxtN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsArchLocTxtN,TARAFXS_ARCH_LOC_TXT_N_LEN)
                  ,beginTarafxsArchLocTxtN
                  ,TARAFXS_ARCH_LOC_TXT_N_LEN
                 );
            localTarafxsArchLocTxtNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsArchLocTxtNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsArchLocTxtN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsArchLocTxtN() {	 
			return (getShort(beginTarafxsArchLocTxtN));
   	}
         int localTarafxsLstStatTsNCounter = -1;
         public boolean isTarafxsLstStatTsNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsLstStatTsNCounter != sharedCounter;
            localTarafxsLstStatTsNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_LST_STAT_TS_N_LEN = 2;
  	/**
	 * serializeTarafxsLstStatTsN
	 */
	protected void serializeTarafxsLstStatTsN(short tarafxsLstStatTsN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsLstStatTsN,TARAFXS_LST_STAT_TS_N_LEN)
                  ,beginTarafxsLstStatTsN
                  ,TARAFXS_LST_STAT_TS_N_LEN
                 );
            localTarafxsLstStatTsNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsLstStatTsNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsLstStatTsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsLstStatTsN() {	 
			return (getShort(beginTarafxsLstStatTsN));
   	}
         int localTarafxsXferRqstTsNCounter = -1;
         public boolean isTarafxsXferRqstTsNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsXferRqstTsNCounter != sharedCounter;
            localTarafxsXferRqstTsNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_XFER_RQST_TS_N_LEN = 2;
  	/**
	 * serializeTarafxsXferRqstTsN
	 */
	protected void serializeTarafxsXferRqstTsN(short tarafxsXferRqstTsN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsXferRqstTsN,TARAFXS_XFER_RQST_TS_N_LEN)
                  ,beginTarafxsXferRqstTsN
                  ,TARAFXS_XFER_RQST_TS_N_LEN
                 );
            localTarafxsXferRqstTsNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsXferRqstTsNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsXferRqstTsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsXferRqstTsN() {	 
			return (getShort(beginTarafxsXferRqstTsN));
   	}
         int localTarafxsXferStrtTsNCounter = -1;
         public boolean isTarafxsXferStrtTsNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsXferStrtTsNCounter != sharedCounter;
            localTarafxsXferStrtTsNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_XFER_STRT_TS_N_LEN = 2;
  	/**
	 * serializeTarafxsXferStrtTsN
	 */
	protected void serializeTarafxsXferStrtTsN(short tarafxsXferStrtTsN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsXferStrtTsN,TARAFXS_XFER_STRT_TS_N_LEN)
                  ,beginTarafxsXferStrtTsN
                  ,TARAFXS_XFER_STRT_TS_N_LEN
                 );
            localTarafxsXferStrtTsNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsXferStrtTsNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsXferStrtTsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsXferStrtTsN() {	 
			return (getShort(beginTarafxsXferStrtTsN));
   	}
         int localTarafxsXferStopTsNCounter = -1;
         public boolean isTarafxsXferStopTsNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsXferStopTsNCounter != sharedCounter;
            localTarafxsXferStopTsNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_XFER_STOP_TS_N_LEN = 2;
  	/**
	 * serializeTarafxsXferStopTsN
	 */
	protected void serializeTarafxsXferStopTsN(short tarafxsXferStopTsN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsXferStopTsN,TARAFXS_XFER_STOP_TS_N_LEN)
                  ,beginTarafxsXferStopTsN
                  ,TARAFXS_XFER_STOP_TS_N_LEN
                 );
            localTarafxsXferStopTsNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsXferStopTsNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsXferStopTsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsXferStopTsN() {	 
			return (getShort(beginTarafxsXferStopTsN));
   	}
         int localTarafxsXferRdyTsNCounter = -1;
         public boolean isTarafxsXferRdyTsNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsXferRdyTsNCounter != sharedCounter;
            localTarafxsXferRdyTsNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_XFER_RDY_TS_N_LEN = 2;
  	/**
	 * serializeTarafxsXferRdyTsN
	 */
	protected void serializeTarafxsXferRdyTsN(short tarafxsXferRdyTsN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsXferRdyTsN,TARAFXS_XFER_RDY_TS_N_LEN)
                  ,beginTarafxsXferRdyTsN
                  ,TARAFXS_XFER_RDY_TS_N_LEN
                 );
            localTarafxsXferRdyTsNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsXferRdyTsNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsXferRdyTsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsXferRdyTsN() {	 
			return (getShort(beginTarafxsXferRdyTsN));
   	}
         int localTarafxsXferCondCdNCounter = -1;
         public boolean isTarafxsXferCondCdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsXferCondCdNCounter != sharedCounter;
            localTarafxsXferCondCdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_XFER_COND_CD_N_LEN = 2;
  	/**
	 * serializeTarafxsXferCondCdN
	 */
	protected void serializeTarafxsXferCondCdN(short tarafxsXferCondCdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsXferCondCdN,TARAFXS_XFER_COND_CD_N_LEN)
                  ,beginTarafxsXferCondCdN
                  ,TARAFXS_XFER_COND_CD_N_LEN
                 );
            localTarafxsXferCondCdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsXferCondCdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsXferCondCdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsXferCondCdN() {	 
			return (getShort(beginTarafxsXferCondCdN));
   	}
         int localTarafxsXferStatTxtNCounter = -1;
         public boolean isTarafxsXferStatTxtNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsXferStatTxtNCounter != sharedCounter;
            localTarafxsXferStatTxtNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_XFER_STAT_TXT_N_LEN = 2;
  	/**
	 * serializeTarafxsXferStatTxtN
	 */
	protected void serializeTarafxsXferStatTxtN(short tarafxsXferStatTxtN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsXferStatTxtN,TARAFXS_XFER_STAT_TXT_N_LEN)
                  ,beginTarafxsXferStatTxtN
                  ,TARAFXS_XFER_STAT_TXT_N_LEN
                 );
            localTarafxsXferStatTxtNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsXferStatTxtNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsXferStatTxtN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsXferStatTxtN() {	 
			return (getShort(beginTarafxsXferStatTxtN));
   	}
         int localTarafxsXferPrcssIdNCounter = -1;
         public boolean isTarafxsXferPrcssIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsXferPrcssIdNCounter != sharedCounter;
            localTarafxsXferPrcssIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_XFER_PRCSS_ID_N_LEN = 2;
  	/**
	 * serializeTarafxsXferPrcssIdN
	 */
	protected void serializeTarafxsXferPrcssIdN(short tarafxsXferPrcssIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsXferPrcssIdN,TARAFXS_XFER_PRCSS_ID_N_LEN)
                  ,beginTarafxsXferPrcssIdN
                  ,TARAFXS_XFER_PRCSS_ID_N_LEN
                 );
            localTarafxsXferPrcssIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsXferPrcssIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsXferPrcssIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsXferPrcssIdN() {	 
			return (getShort(beginTarafxsXferPrcssIdN));
   	}
         int localTarafxsOrgXferPrcsIdNCounter = -1;
         public boolean isTarafxsOrgXferPrcsIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsOrgXferPrcsIdNCounter != sharedCounter;
            localTarafxsOrgXferPrcsIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_ORG_XFER_PRCS_ID_N_LEN = 2;
  	/**
	 * serializeTarafxsOrgXferPrcsIdN
	 */
	protected void serializeTarafxsOrgXferPrcsIdN(short tarafxsOrgXferPrcsIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsOrgXferPrcsIdN,TARAFXS_ORG_XFER_PRCS_ID_N_LEN)
                  ,beginTarafxsOrgXferPrcsIdN
                  ,TARAFXS_ORG_XFER_PRCS_ID_N_LEN
                 );
            localTarafxsOrgXferPrcsIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsOrgXferPrcsIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsOrgXferPrcsIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsOrgXferPrcsIdN() {	 
			return (getShort(beginTarafxsOrgXferPrcsIdN));
   	}
         int localTarafxsTrgrCondCdNCounter = -1;
         public boolean isTarafxsTrgrCondCdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsTrgrCondCdNCounter != sharedCounter;
            localTarafxsTrgrCondCdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_TRGR_COND_CD_N_LEN = 2;
  	/**
	 * serializeTarafxsTrgrCondCdN
	 */
	protected void serializeTarafxsTrgrCondCdN(short tarafxsTrgrCondCdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsTrgrCondCdN,TARAFXS_TRGR_COND_CD_N_LEN)
                  ,beginTarafxsTrgrCondCdN
                  ,TARAFXS_TRGR_COND_CD_N_LEN
                 );
            localTarafxsTrgrCondCdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsTrgrCondCdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsTrgrCondCdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsTrgrCondCdN() {	 
			return (getShort(beginTarafxsTrgrCondCdN));
   	}
         int localTarafxsTrgrStatTxtNCounter = -1;
         public boolean isTarafxsTrgrStatTxtNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsTrgrStatTxtNCounter != sharedCounter;
            localTarafxsTrgrStatTxtNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_TRGR_STAT_TXT_N_LEN = 2;
  	/**
	 * serializeTarafxsTrgrStatTxtN
	 */
	protected void serializeTarafxsTrgrStatTxtN(short tarafxsTrgrStatTxtN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsTrgrStatTxtN,TARAFXS_TRGR_STAT_TXT_N_LEN)
                  ,beginTarafxsTrgrStatTxtN
                  ,TARAFXS_TRGR_STAT_TXT_N_LEN
                 );
            localTarafxsTrgrStatTxtNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsTrgrStatTxtNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsTrgrStatTxtN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsTrgrStatTxtN() {	 
			return (getShort(beginTarafxsTrgrStatTxtN));
   	}
         int localTarafxsOrgLocNamNCounter = -1;
         public boolean isTarafxsOrgLocNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsOrgLocNamNCounter != sharedCounter;
            localTarafxsOrgLocNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_ORG_LOC_NAM_N_LEN = 2;
  	/**
	 * serializeTarafxsOrgLocNamN
	 */
	protected void serializeTarafxsOrgLocNamN(short tarafxsOrgLocNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsOrgLocNamN,TARAFXS_ORG_LOC_NAM_N_LEN)
                  ,beginTarafxsOrgLocNamN
                  ,TARAFXS_ORG_LOC_NAM_N_LEN
                 );
            localTarafxsOrgLocNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsOrgLocNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsOrgLocNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsOrgLocNamN() {	 
			return (getShort(beginTarafxsOrgLocNamN));
   	}
         int localTarafxsTrgrActNamNCounter = -1;
         public boolean isTarafxsTrgrActNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsTrgrActNamNCounter != sharedCounter;
            localTarafxsTrgrActNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_TRGR_ACT_NAM_N_LEN = 2;
  	/**
	 * serializeTarafxsTrgrActNamN
	 */
	protected void serializeTarafxsTrgrActNamN(short tarafxsTrgrActNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsTrgrActNamN,TARAFXS_TRGR_ACT_NAM_N_LEN)
                  ,beginTarafxsTrgrActNamN
                  ,TARAFXS_TRGR_ACT_NAM_N_LEN
                 );
            localTarafxsTrgrActNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsTrgrActNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsTrgrActNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsTrgrActNamN() {	 
			return (getShort(beginTarafxsTrgrActNamN));
   	}
         int localTarafxsPrvMnfrmFileNamNCounter = -1;
         public boolean isTarafxsPrvMnfrmFileNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsPrvMnfrmFileNamNCounter != sharedCounter;
            localTarafxsPrvMnfrmFileNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_PRV_MNFRM_FILE_NAM_N_LEN = 2;
  	/**
	 * serializeTarafxsPrvMnfrmFileNamN
	 */
	protected void serializeTarafxsPrvMnfrmFileNamN(short tarafxsPrvMnfrmFileNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsPrvMnfrmFileNamN,TARAFXS_PRV_MNFRM_FILE_NAM_N_LEN)
                  ,beginTarafxsPrvMnfrmFileNamN
                  ,TARAFXS_PRV_MNFRM_FILE_NAM_N_LEN
                 );
            localTarafxsPrvMnfrmFileNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsPrvMnfrmFileNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsPrvMnfrmFileNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsPrvMnfrmFileNamN() {	 
			return (getShort(beginTarafxsPrvMnfrmFileNamN));
   	}
         int localTarafxsPrvCyclNumNCounter = -1;
         public boolean isTarafxsPrvCyclNumNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsPrvCyclNumNCounter != sharedCounter;
            localTarafxsPrvCyclNumNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_PRV_CYCL_NUM_N_LEN = 2;
  	/**
	 * serializeTarafxsPrvCyclNumN
	 */
	protected void serializeTarafxsPrvCyclNumN(short tarafxsPrvCyclNumN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsPrvCyclNumN,TARAFXS_PRV_CYCL_NUM_N_LEN)
                  ,beginTarafxsPrvCyclNumN
                  ,TARAFXS_PRV_CYCL_NUM_N_LEN
                 );
            localTarafxsPrvCyclNumNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsPrvCyclNumNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsPrvCyclNumN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsPrvCyclNumN() {	 
			return (getShort(beginTarafxsPrvCyclNumN));
   	}
         int localTarafxsPrvBusPrtnrIdNCounter = -1;
         public boolean isTarafxsPrvBusPrtnrIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsPrvBusPrtnrIdNCounter != sharedCounter;
            localTarafxsPrvBusPrtnrIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_PRV_BUS_PRTNR_ID_N_LEN = 2;
  	/**
	 * serializeTarafxsPrvBusPrtnrIdN
	 */
	protected void serializeTarafxsPrvBusPrtnrIdN(short tarafxsPrvBusPrtnrIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsPrvBusPrtnrIdN,TARAFXS_PRV_BUS_PRTNR_ID_N_LEN)
                  ,beginTarafxsPrvBusPrtnrIdN
                  ,TARAFXS_PRV_BUS_PRTNR_ID_N_LEN
                 );
            localTarafxsPrvBusPrtnrIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsPrvBusPrtnrIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsPrvBusPrtnrIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsPrvBusPrtnrIdN() {	 
			return (getShort(beginTarafxsPrvBusPrtnrIdN));
   	}
         int localTarafxsPrvEndptIdNCounter = -1;
         public boolean isTarafxsPrvEndptIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsPrvEndptIdNCounter != sharedCounter;
            localTarafxsPrvEndptIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_PRV_ENDPT_ID_N_LEN = 2;
  	/**
	 * serializeTarafxsPrvEndptIdN
	 */
	protected void serializeTarafxsPrvEndptIdN(short tarafxsPrvEndptIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsPrvEndptIdN,TARAFXS_PRV_ENDPT_ID_N_LEN)
                  ,beginTarafxsPrvEndptIdN
                  ,TARAFXS_PRV_ENDPT_ID_N_LEN
                 );
            localTarafxsPrvEndptIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsPrvEndptIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsPrvEndptIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsPrvEndptIdN() {	 
			return (getShort(beginTarafxsPrvEndptIdN));
   	}
         int localTarafxsPrvAvailTsNCounter = -1;
         public boolean isTarafxsPrvAvailTsNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsPrvAvailTsNCounter != sharedCounter;
            localTarafxsPrvAvailTsNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_PRV_AVAIL_TS_N_LEN = 2;
  	/**
	 * serializeTarafxsPrvAvailTsN
	 */
	protected void serializeTarafxsPrvAvailTsN(short tarafxsPrvAvailTsN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsPrvAvailTsN,TARAFXS_PRV_AVAIL_TS_N_LEN)
                  ,beginTarafxsPrvAvailTsN
                  ,TARAFXS_PRV_AVAIL_TS_N_LEN
                 );
            localTarafxsPrvAvailTsNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsPrvAvailTsNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsPrvAvailTsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsPrvAvailTsN() {	 
			return (getShort(beginTarafxsPrvAvailTsN));
   	}
         int localTarafxsNxtMnfrmFileNamNCounter = -1;
         public boolean isTarafxsNxtMnfrmFileNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsNxtMnfrmFileNamNCounter != sharedCounter;
            localTarafxsNxtMnfrmFileNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_NXT_MNFRM_FILE_NAM_N_LEN = 2;
  	/**
	 * serializeTarafxsNxtMnfrmFileNamN
	 */
	protected void serializeTarafxsNxtMnfrmFileNamN(short tarafxsNxtMnfrmFileNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsNxtMnfrmFileNamN,TARAFXS_NXT_MNFRM_FILE_NAM_N_LEN)
                  ,beginTarafxsNxtMnfrmFileNamN
                  ,TARAFXS_NXT_MNFRM_FILE_NAM_N_LEN
                 );
            localTarafxsNxtMnfrmFileNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsNxtMnfrmFileNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsNxtMnfrmFileNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsNxtMnfrmFileNamN() {	 
			return (getShort(beginTarafxsNxtMnfrmFileNamN));
   	}
         int localTarafxsNxtCyclNumNCounter = -1;
         public boolean isTarafxsNxtCyclNumNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsNxtCyclNumNCounter != sharedCounter;
            localTarafxsNxtCyclNumNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_NXT_CYCL_NUM_N_LEN = 2;
  	/**
	 * serializeTarafxsNxtCyclNumN
	 */
	protected void serializeTarafxsNxtCyclNumN(short tarafxsNxtCyclNumN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsNxtCyclNumN,TARAFXS_NXT_CYCL_NUM_N_LEN)
                  ,beginTarafxsNxtCyclNumN
                  ,TARAFXS_NXT_CYCL_NUM_N_LEN
                 );
            localTarafxsNxtCyclNumNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsNxtCyclNumNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsNxtCyclNumN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsNxtCyclNumN() {	 
			return (getShort(beginTarafxsNxtCyclNumN));
   	}
         int localTarafxsNxtBusPrtnrIdNCounter = -1;
         public boolean isTarafxsNxtBusPrtnrIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsNxtBusPrtnrIdNCounter != sharedCounter;
            localTarafxsNxtBusPrtnrIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_NXT_BUS_PRTNR_ID_N_LEN = 2;
  	/**
	 * serializeTarafxsNxtBusPrtnrIdN
	 */
	protected void serializeTarafxsNxtBusPrtnrIdN(short tarafxsNxtBusPrtnrIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsNxtBusPrtnrIdN,TARAFXS_NXT_BUS_PRTNR_ID_N_LEN)
                  ,beginTarafxsNxtBusPrtnrIdN
                  ,TARAFXS_NXT_BUS_PRTNR_ID_N_LEN
                 );
            localTarafxsNxtBusPrtnrIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsNxtBusPrtnrIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsNxtBusPrtnrIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsNxtBusPrtnrIdN() {	 
			return (getShort(beginTarafxsNxtBusPrtnrIdN));
   	}
         int localTarafxsNxtEndptIdNCounter = -1;
         public boolean isTarafxsNxtEndptIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsNxtEndptIdNCounter != sharedCounter;
            localTarafxsNxtEndptIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_NXT_ENDPT_ID_N_LEN = 2;
  	/**
	 * serializeTarafxsNxtEndptIdN
	 */
	protected void serializeTarafxsNxtEndptIdN(short tarafxsNxtEndptIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsNxtEndptIdN,TARAFXS_NXT_ENDPT_ID_N_LEN)
                  ,beginTarafxsNxtEndptIdN
                  ,TARAFXS_NXT_ENDPT_ID_N_LEN
                 );
            localTarafxsNxtEndptIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsNxtEndptIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsNxtEndptIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsNxtEndptIdN() {	 
			return (getShort(beginTarafxsNxtEndptIdN));
   	}
         int localTarafxsNxtAvailTsNCounter = -1;
         public boolean isTarafxsNxtAvailTsNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsNxtAvailTsNCounter != sharedCounter;
            localTarafxsNxtAvailTsNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_NXT_AVAIL_TS_N_LEN = 2;
  	/**
	 * serializeTarafxsNxtAvailTsN
	 */
	protected void serializeTarafxsNxtAvailTsN(short tarafxsNxtAvailTsN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsNxtAvailTsN,TARAFXS_NXT_AVAIL_TS_N_LEN)
                  ,beginTarafxsNxtAvailTsN
                  ,TARAFXS_NXT_AVAIL_TS_N_LEN
                 );
            localTarafxsNxtAvailTsNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsNxtAvailTsNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsNxtAvailTsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsNxtAvailTsN() {	 
			return (getShort(beginTarafxsNxtAvailTsN));
   	}
         int localTarafxsApplExitJobNamNCounter = -1;
         public boolean isTarafxsApplExitJobNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsApplExitJobNamNCounter != sharedCounter;
            localTarafxsApplExitJobNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_APPL_EXIT_JOB_NAM_N_LEN = 2;
  	/**
	 * serializeTarafxsApplExitJobNamN
	 */
	protected void serializeTarafxsApplExitJobNamN(short tarafxsApplExitJobNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsApplExitJobNamN,TARAFXS_APPL_EXIT_JOB_NAM_N_LEN)
                  ,beginTarafxsApplExitJobNamN
                  ,TARAFXS_APPL_EXIT_JOB_NAM_N_LEN
                 );
            localTarafxsApplExitJobNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsApplExitJobNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsApplExitJobNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsApplExitJobNamN() {	 
			return (getShort(beginTarafxsApplExitJobNamN));
   	}
         int localTarafxsApplExitTsNCounter = -1;
         public boolean isTarafxsApplExitTsNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsApplExitTsNCounter != sharedCounter;
            localTarafxsApplExitTsNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_APPL_EXIT_TS_N_LEN = 2;
  	/**
	 * serializeTarafxsApplExitTsN
	 */
	protected void serializeTarafxsApplExitTsN(short tarafxsApplExitTsN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsApplExitTsN,TARAFXS_APPL_EXIT_TS_N_LEN)
                  ,beginTarafxsApplExitTsN
                  ,TARAFXS_APPL_EXIT_TS_N_LEN
                 );
            localTarafxsApplExitTsNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsApplExitTsNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsApplExitTsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsApplExitTsN() {	 
			return (getShort(beginTarafxsApplExitTsN));
   	}
         int localTarafxsCsMipIdNCounter = -1;
         public boolean isTarafxsCsMipIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsCsMipIdNCounter != sharedCounter;
            localTarafxsCsMipIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_CS_MIP_ID_N_LEN = 2;
  	/**
	 * serializeTarafxsCsMipIdN
	 */
	protected void serializeTarafxsCsMipIdN(short tarafxsCsMipIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsCsMipIdN,TARAFXS_CS_MIP_ID_N_LEN)
                  ,beginTarafxsCsMipIdN
                  ,TARAFXS_CS_MIP_ID_N_LEN
                 );
            localTarafxsCsMipIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsCsMipIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsCsMipIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsCsMipIdN() {	 
			return (getShort(beginTarafxsCsMipIdN));
   	}
         int localTarafxsRmMipIdNCounter = -1;
         public boolean isTarafxsRmMipIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsRmMipIdNCounter != sharedCounter;
            localTarafxsRmMipIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_RM_MIP_ID_N_LEN = 2;
  	/**
	 * serializeTarafxsRmMipIdN
	 */
	protected void serializeTarafxsRmMipIdN(short tarafxsRmMipIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsRmMipIdN,TARAFXS_RM_MIP_ID_N_LEN)
                  ,beginTarafxsRmMipIdN
                  ,TARAFXS_RM_MIP_ID_N_LEN
                 );
            localTarafxsRmMipIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsRmMipIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsRmMipIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsRmMipIdN() {	 
			return (getShort(beginTarafxsRmMipIdN));
   	}
         int localTarafxsApplExitNamNCounter = -1;
         public boolean isTarafxsApplExitNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsApplExitNamNCounter != sharedCounter;
            localTarafxsApplExitNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_APPL_EXIT_NAM_N_LEN = 2;
  	/**
	 * serializeTarafxsApplExitNamN
	 */
	protected void serializeTarafxsApplExitNamN(short tarafxsApplExitNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsApplExitNamN,TARAFXS_APPL_EXIT_NAM_N_LEN)
                  ,beginTarafxsApplExitNamN
                  ,TARAFXS_APPL_EXIT_NAM_N_LEN
                 );
            localTarafxsApplExitNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsApplExitNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsApplExitNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsApplExitNamN() {	 
			return (getShort(beginTarafxsApplExitNamN));
   	}
         int localTarafxsTapeCmpltdSwNCounter = -1;
         public boolean isTarafxsTapeCmpltdSwNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsTapeCmpltdSwNCounter != sharedCounter;
            localTarafxsTapeCmpltdSwNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_TAPE_CMPLTD_SW_N_LEN = 2;
  	/**
	 * serializeTarafxsTapeCmpltdSwN
	 */
	protected void serializeTarafxsTapeCmpltdSwN(short tarafxsTapeCmpltdSwN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsTapeCmpltdSwN,TARAFXS_TAPE_CMPLTD_SW_N_LEN)
                  ,beginTarafxsTapeCmpltdSwN
                  ,TARAFXS_TAPE_CMPLTD_SW_N_LEN
                 );
            localTarafxsTapeCmpltdSwNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsTapeCmpltdSwNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsTapeCmpltdSwN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsTapeCmpltdSwN() {	 
			return (getShort(beginTarafxsTapeCmpltdSwN));
   	}
         int localTarafxsTapeMultVolSwNCounter = -1;
         public boolean isTarafxsTapeMultVolSwNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsTapeMultVolSwNCounter != sharedCounter;
            localTarafxsTapeMultVolSwNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_TAPE_MULT_VOL_SW_N_LEN = 2;
  	/**
	 * serializeTarafxsTapeMultVolSwN
	 */
	protected void serializeTarafxsTapeMultVolSwN(short tarafxsTapeMultVolSwN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsTapeMultVolSwN,TARAFXS_TAPE_MULT_VOL_SW_N_LEN)
                  ,beginTarafxsTapeMultVolSwN
                  ,TARAFXS_TAPE_MULT_VOL_SW_N_LEN
                 );
            localTarafxsTapeMultVolSwNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsTapeMultVolSwNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsTapeMultVolSwN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsTapeMultVolSwN() {	 
			return (getShort(beginTarafxsTapeMultVolSwN));
   	}
         int localTarafxsApplPrcssngDtNCounter = -1;
         public boolean isTarafxsApplPrcssngDtNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsApplPrcssngDtNCounter != sharedCounter;
            localTarafxsApplPrcssngDtNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_APPL_PRCSSNG_DT_N_LEN = 2;
  	/**
	 * serializeTarafxsApplPrcssngDtN
	 */
	protected void serializeTarafxsApplPrcssngDtN(short tarafxsApplPrcssngDtN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsApplPrcssngDtN,TARAFXS_APPL_PRCSSNG_DT_N_LEN)
                  ,beginTarafxsApplPrcssngDtN
                  ,TARAFXS_APPL_PRCSSNG_DT_N_LEN
                 );
            localTarafxsApplPrcssngDtNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsApplPrcssngDtNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsApplPrcssngDtN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsApplPrcssngDtN() {	 
			return (getShort(beginTarafxsApplPrcssngDtN));
   	}
         int localTarafxsTransitionalDsnNCounter = -1;
         public boolean isTarafxsTransitionalDsnNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsTransitionalDsnNCounter != sharedCounter;
            localTarafxsTransitionalDsnNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_TRANSITIONAL_DSN_N_LEN = 2;
  	/**
	 * serializeTarafxsTransitionalDsnN
	 */
	protected void serializeTarafxsTransitionalDsnN(short tarafxsTransitionalDsnN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsTransitionalDsnN,TARAFXS_TRANSITIONAL_DSN_N_LEN)
                  ,beginTarafxsTransitionalDsnN
                  ,TARAFXS_TRANSITIONAL_DSN_N_LEN
                 );
            localTarafxsTransitionalDsnNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsTransitionalDsnNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsTransitionalDsnN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsTransitionalDsnN() {	 
			return (getShort(beginTarafxsTransitionalDsnN));
   	}
         int localTarafxsSourceHubIdNCounter = -1;
         public boolean isTarafxsSourceHubIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsSourceHubIdNCounter != sharedCounter;
            localTarafxsSourceHubIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_SOURCE_HUB_ID_N_LEN = 2;
  	/**
	 * serializeTarafxsSourceHubIdN
	 */
	protected void serializeTarafxsSourceHubIdN(short tarafxsSourceHubIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsSourceHubIdN,TARAFXS_SOURCE_HUB_ID_N_LEN)
                  ,beginTarafxsSourceHubIdN
                  ,TARAFXS_SOURCE_HUB_ID_N_LEN
                 );
            localTarafxsSourceHubIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsSourceHubIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsSourceHubIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsSourceHubIdN() {	 
			return (getShort(beginTarafxsSourceHubIdN));
   	}
         int localTarafxsOwningHubIdNCounter = -1;
         public boolean isTarafxsOwningHubIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsOwningHubIdNCounter != sharedCounter;
            localTarafxsOwningHubIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_OWNING_HUB_ID_N_LEN = 2;
  	/**
	 * serializeTarafxsOwningHubIdN
	 */
	protected void serializeTarafxsOwningHubIdN(short tarafxsOwningHubIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsOwningHubIdN,TARAFXS_OWNING_HUB_ID_N_LEN)
                  ,beginTarafxsOwningHubIdN
                  ,TARAFXS_OWNING_HUB_ID_N_LEN
                 );
            localTarafxsOwningHubIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsOwningHubIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsOwningHubIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsOwningHubIdN() {	 
			return (getShort(beginTarafxsOwningHubIdN));
   	}
         int localTarafxsStatRefIdNCounter = -1;
         public boolean isTarafxsStatRefIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsStatRefIdNCounter != sharedCounter;
            localTarafxsStatRefIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_STAT_REF_ID_N_LEN = 2;
  	/**
	 * serializeTarafxsStatRefIdN
	 */
	protected void serializeTarafxsStatRefIdN(short tarafxsStatRefIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsStatRefIdN,TARAFXS_STAT_REF_ID_N_LEN)
                  ,beginTarafxsStatRefIdN
                  ,TARAFXS_STAT_REF_ID_N_LEN
                 );
            localTarafxsStatRefIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsStatRefIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsStatRefIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsStatRefIdN() {	 
			return (getShort(beginTarafxsStatRefIdN));
   	}
         int localTarafxsSrcLocEntNamNCounter = -1;
         public boolean isTarafxsSrcLocEntNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsSrcLocEntNamNCounter != sharedCounter;
            localTarafxsSrcLocEntNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_SRC_LOC_ENT_NAM_N_LEN = 2;
  	/**
	 * serializeTarafxsSrcLocEntNamN
	 */
	protected void serializeTarafxsSrcLocEntNamN(short tarafxsSrcLocEntNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsSrcLocEntNamN,TARAFXS_SRC_LOC_ENT_NAM_N_LEN)
                  ,beginTarafxsSrcLocEntNamN
                  ,TARAFXS_SRC_LOC_ENT_NAM_N_LEN
                 );
            localTarafxsSrcLocEntNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsSrcLocEntNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsSrcLocEntNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsSrcLocEntNamN() {	 
			return (getShort(beginTarafxsSrcLocEntNamN));
   	}
         int localTarafxsSrcTaskNamNCounter = -1;
         public boolean isTarafxsSrcTaskNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsSrcTaskNamNCounter != sharedCounter;
            localTarafxsSrcTaskNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_SRC_TASK_NAM_N_LEN = 2;
  	/**
	 * serializeTarafxsSrcTaskNamN
	 */
	protected void serializeTarafxsSrcTaskNamN(short tarafxsSrcTaskNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsSrcTaskNamN,TARAFXS_SRC_TASK_NAM_N_LEN)
                  ,beginTarafxsSrcTaskNamN
                  ,TARAFXS_SRC_TASK_NAM_N_LEN
                 );
            localTarafxsSrcTaskNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsSrcTaskNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsSrcTaskNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsSrcTaskNamN() {	 
			return (getShort(beginTarafxsSrcTaskNamN));
   	}
         int localTarafxsSrcTaskIdNCounter = -1;
         public boolean isTarafxsSrcTaskIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsSrcTaskIdNCounter != sharedCounter;
            localTarafxsSrcTaskIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_SRC_TASK_ID_N_LEN = 2;
  	/**
	 * serializeTarafxsSrcTaskIdN
	 */
	protected void serializeTarafxsSrcTaskIdN(short tarafxsSrcTaskIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsSrcTaskIdN,TARAFXS_SRC_TASK_ID_N_LEN)
                  ,beginTarafxsSrcTaskIdN
                  ,TARAFXS_SRC_TASK_ID_N_LEN
                 );
            localTarafxsSrcTaskIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsSrcTaskIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsSrcTaskIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsSrcTaskIdN() {	 
			return (getShort(beginTarafxsSrcTaskIdN));
   	}
         int localTarafxsSrcTaskUsrNCounter = -1;
         public boolean isTarafxsSrcTaskUsrNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsSrcTaskUsrNCounter != sharedCounter;
            localTarafxsSrcTaskUsrNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_SRC_TASK_USR_N_LEN = 2;
  	/**
	 * serializeTarafxsSrcTaskUsrN
	 */
	protected void serializeTarafxsSrcTaskUsrN(short tarafxsSrcTaskUsrN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsSrcTaskUsrN,TARAFXS_SRC_TASK_USR_N_LEN)
                  ,beginTarafxsSrcTaskUsrN
                  ,TARAFXS_SRC_TASK_USR_N_LEN
                 );
            localTarafxsSrcTaskUsrNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsSrcTaskUsrNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsSrcTaskUsrN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsSrcTaskUsrN() {	 
			return (getShort(beginTarafxsSrcTaskUsrN));
   	}
         int localTarafxsSrcTaskStrtTsNCounter = -1;
         public boolean isTarafxsSrcTaskStrtTsNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsSrcTaskStrtTsNCounter != sharedCounter;
            localTarafxsSrcTaskStrtTsNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_SRC_TASK_STRT_TS_N_LEN = 2;
  	/**
	 * serializeTarafxsSrcTaskStrtTsN
	 */
	protected void serializeTarafxsSrcTaskStrtTsN(short tarafxsSrcTaskStrtTsN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsSrcTaskStrtTsN,TARAFXS_SRC_TASK_STRT_TS_N_LEN)
                  ,beginTarafxsSrcTaskStrtTsN
                  ,TARAFXS_SRC_TASK_STRT_TS_N_LEN
                 );
            localTarafxsSrcTaskStrtTsNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsSrcTaskStrtTsNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsSrcTaskStrtTsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsSrcTaskStrtTsN() {	 
			return (getShort(beginTarafxsSrcTaskStrtTsN));
   	}
         int localTarafxsSrcTaskStopTsNCounter = -1;
         public boolean isTarafxsSrcTaskStopTsNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsSrcTaskStopTsNCounter != sharedCounter;
            localTarafxsSrcTaskStopTsNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_SRC_TASK_STOP_TS_N_LEN = 2;
  	/**
	 * serializeTarafxsSrcTaskStopTsN
	 */
	protected void serializeTarafxsSrcTaskStopTsN(short tarafxsSrcTaskStopTsN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsSrcTaskStopTsN,TARAFXS_SRC_TASK_STOP_TS_N_LEN)
                  ,beginTarafxsSrcTaskStopTsN
                  ,TARAFXS_SRC_TASK_STOP_TS_N_LEN
                 );
            localTarafxsSrcTaskStopTsNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsSrcTaskStopTsNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsSrcTaskStopTsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsSrcTaskStopTsN() {	 
			return (getShort(beginTarafxsSrcTaskStopTsN));
   	}
         int localTarafxsTrgtLocEntNamNCounter = -1;
         public boolean isTarafxsTrgtLocEntNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsTrgtLocEntNamNCounter != sharedCounter;
            localTarafxsTrgtLocEntNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_TRGT_LOC_ENT_NAM_N_LEN = 2;
  	/**
	 * serializeTarafxsTrgtLocEntNamN
	 */
	protected void serializeTarafxsTrgtLocEntNamN(short tarafxsTrgtLocEntNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsTrgtLocEntNamN,TARAFXS_TRGT_LOC_ENT_NAM_N_LEN)
                  ,beginTarafxsTrgtLocEntNamN
                  ,TARAFXS_TRGT_LOC_ENT_NAM_N_LEN
                 );
            localTarafxsTrgtLocEntNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsTrgtLocEntNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsTrgtLocEntNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsTrgtLocEntNamN() {	 
			return (getShort(beginTarafxsTrgtLocEntNamN));
   	}
         int localTarafxsTrgtTaskNamNCounter = -1;
         public boolean isTarafxsTrgtTaskNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsTrgtTaskNamNCounter != sharedCounter;
            localTarafxsTrgtTaskNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_TRGT_TASK_NAM_N_LEN = 2;
  	/**
	 * serializeTarafxsTrgtTaskNamN
	 */
	protected void serializeTarafxsTrgtTaskNamN(short tarafxsTrgtTaskNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsTrgtTaskNamN,TARAFXS_TRGT_TASK_NAM_N_LEN)
                  ,beginTarafxsTrgtTaskNamN
                  ,TARAFXS_TRGT_TASK_NAM_N_LEN
                 );
            localTarafxsTrgtTaskNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsTrgtTaskNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsTrgtTaskNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsTrgtTaskNamN() {	 
			return (getShort(beginTarafxsTrgtTaskNamN));
   	}
         int localTarafxsTrgtTaskIdNCounter = -1;
         public boolean isTarafxsTrgtTaskIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsTrgtTaskIdNCounter != sharedCounter;
            localTarafxsTrgtTaskIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_TRGT_TASK_ID_N_LEN = 2;
  	/**
	 * serializeTarafxsTrgtTaskIdN
	 */
	protected void serializeTarafxsTrgtTaskIdN(short tarafxsTrgtTaskIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsTrgtTaskIdN,TARAFXS_TRGT_TASK_ID_N_LEN)
                  ,beginTarafxsTrgtTaskIdN
                  ,TARAFXS_TRGT_TASK_ID_N_LEN
                 );
            localTarafxsTrgtTaskIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsTrgtTaskIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsTrgtTaskIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsTrgtTaskIdN() {	 
			return (getShort(beginTarafxsTrgtTaskIdN));
   	}
         int localTarafxsTrgtTaskUsrNCounter = -1;
         public boolean isTarafxsTrgtTaskUsrNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsTrgtTaskUsrNCounter != sharedCounter;
            localTarafxsTrgtTaskUsrNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_TRGT_TASK_USR_N_LEN = 2;
  	/**
	 * serializeTarafxsTrgtTaskUsrN
	 */
	protected void serializeTarafxsTrgtTaskUsrN(short tarafxsTrgtTaskUsrN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsTrgtTaskUsrN,TARAFXS_TRGT_TASK_USR_N_LEN)
                  ,beginTarafxsTrgtTaskUsrN
                  ,TARAFXS_TRGT_TASK_USR_N_LEN
                 );
            localTarafxsTrgtTaskUsrNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsTrgtTaskUsrNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsTrgtTaskUsrN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsTrgtTaskUsrN() {	 
			return (getShort(beginTarafxsTrgtTaskUsrN));
   	}
         int localTarafxsTrgtTaskStrtTsNCounter = -1;
         public boolean isTarafxsTrgtTaskStrtTsNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsTrgtTaskStrtTsNCounter != sharedCounter;
            localTarafxsTrgtTaskStrtTsNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_TRGT_TASK_STRT_TS_N_LEN = 2;
  	/**
	 * serializeTarafxsTrgtTaskStrtTsN
	 */
	protected void serializeTarafxsTrgtTaskStrtTsN(short tarafxsTrgtTaskStrtTsN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsTrgtTaskStrtTsN,TARAFXS_TRGT_TASK_STRT_TS_N_LEN)
                  ,beginTarafxsTrgtTaskStrtTsN
                  ,TARAFXS_TRGT_TASK_STRT_TS_N_LEN
                 );
            localTarafxsTrgtTaskStrtTsNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsTrgtTaskStrtTsNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsTrgtTaskStrtTsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsTrgtTaskStrtTsN() {	 
			return (getShort(beginTarafxsTrgtTaskStrtTsN));
   	}
         int localTarafxsTrgtTaskStopTsNCounter = -1;
         public boolean isTarafxsTrgtTaskStopTsNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsTrgtTaskStopTsNCounter != sharedCounter;
            localTarafxsTrgtTaskStopTsNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_TRGT_TASK_STOP_TS_N_LEN = 2;
  	/**
	 * serializeTarafxsTrgtTaskStopTsN
	 */
	protected void serializeTarafxsTrgtTaskStopTsN(short tarafxsTrgtTaskStopTsN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsTrgtTaskStopTsN,TARAFXS_TRGT_TASK_STOP_TS_N_LEN)
                  ,beginTarafxsTrgtTaskStopTsN
                  ,TARAFXS_TRGT_TASK_STOP_TS_N_LEN
                 );
            localTarafxsTrgtTaskStopTsNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsTrgtTaskStopTsNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsTrgtTaskStopTsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsTrgtTaskStopTsN() {	 
			return (getShort(beginTarafxsTrgtTaskStopTsN));
   	}
         int localTarafxsApplTknNamNCounter = -1;
         public boolean isTarafxsApplTknNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsApplTknNamNCounter != sharedCounter;
            localTarafxsApplTknNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_APPL_TKN_NAM_N_LEN = 2;
  	/**
	 * serializeTarafxsApplTknNamN
	 */
	protected void serializeTarafxsApplTknNamN(short tarafxsApplTknNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsApplTknNamN,TARAFXS_APPL_TKN_NAM_N_LEN)
                  ,beginTarafxsApplTknNamN
                  ,TARAFXS_APPL_TKN_NAM_N_LEN
                 );
            localTarafxsApplTknNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsApplTknNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsApplTknNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsApplTknNamN() {	 
			return (getShort(beginTarafxsApplTknNamN));
   	}




}
  

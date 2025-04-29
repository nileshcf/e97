package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ItarafxaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ItarafxaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ItarafxaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ITARAFXA_LENGTH = 98;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTarafxaArchLocTxtN;
            protected  int beginTarafxaLstStatTsN;
            protected  int beginTarafxaXferRqstTsN;
            protected  int beginTarafxaXferStrtTsN;
            protected  int beginTarafxaXferStopTsN;
            protected  int beginTarafxaXferRdyTsN;
            protected  int beginTarafxaXferCondCdN;
            protected  int beginTarafxaXferStatTxtN;
            protected  int beginTarafxaXferPrcssIdN;
            protected  int beginTarafxaOrgXferPrcsIdN;
            protected  int beginTarafxaTrgrCondCdN;
            protected  int beginTarafxaTrgrStatTxtN;
            protected  int beginTarafxaOrgLocNamN;
            protected  int beginTarafxaTrgrActNamN;
            protected  int beginTarafxaPrvMnfrmFileNamN;
            protected  int beginTarafxaPrvCyclNumN;
            protected  int beginTarafxaPrvBusPrtnrIdN;
            protected  int beginTarafxaPrvEndptIdN;
            protected  int beginTarafxaPrvAvailTsN;
            protected  int beginTarafxaNxtMnfrmFileNamN;
            protected  int beginTarafxaNxtCyclNumN;
            protected  int beginTarafxaNxtBusPrtnrIdN;
            protected  int beginTarafxaNxtEndptIdN;
            protected  int beginTarafxaNxtAvailTsN;
            protected  int beginTarafxaApplExitJobNamN;
            protected  int beginTarafxaApplExitTsN;
            protected  int beginTarafxaCsMipIdN;
            protected  int beginTarafxaRmMipIdN;
            protected  int beginTarafxaApplExitNamN;
            protected  int beginTarafxaTapeCmpltdSwN;
            protected  int beginTarafxaTapeMultVolSwN;
            protected  int beginTarafxaApplPrcssngDtN;
            protected  int beginTarafxaTransitionalDsnN;
            protected  int beginTarafxaSourceHubIdN;
            protected  int beginTarafxaOwningHubIdN;
            protected  int beginTarafxaStatRefIdN;
            protected  int beginTarafxaSrcLocEntNamN;
            protected  int beginTarafxaSrcTaskNamN;
            protected  int beginTarafxaSrcTaskIdN;
            protected  int beginTarafxaSrcTaskUsrN;
            protected  int beginTarafxaSrcTaskStrtTsN;
            protected  int beginTarafxaSrcTaskStopTsN;
            protected  int beginTarafxaTrgtLocEntNamN;
            protected  int beginTarafxaTrgtTaskNamN;
            protected  int beginTarafxaTrgtTaskIdN;
            protected  int beginTarafxaTrgtTaskUsrN;
            protected  int beginTarafxaTrgtTaskStrtTsN;
            protected  int beginTarafxaTrgtTaskStopTsN;
            protected  int beginTarafxaApplTknNamN;
	
	/**
	* Constructor for ItarafxaSerialized
	**/
    public ItarafxaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ItarafxaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ITARAFXA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTarafxaArchLocTxtN = getStartOffset() + 0;	// set offset for serialization
  
             beginTarafxaLstStatTsN = getStartOffset() + 2;	// set offset for serialization
  
             beginTarafxaXferRqstTsN = getStartOffset() + 4;	// set offset for serialization
  
             beginTarafxaXferStrtTsN = getStartOffset() + 6;	// set offset for serialization
  
             beginTarafxaXferStopTsN = getStartOffset() + 8;	// set offset for serialization
  
             beginTarafxaXferRdyTsN = getStartOffset() + 10;	// set offset for serialization
  
             beginTarafxaXferCondCdN = getStartOffset() + 12;	// set offset for serialization
  
             beginTarafxaXferStatTxtN = getStartOffset() + 14;	// set offset for serialization
  
             beginTarafxaXferPrcssIdN = getStartOffset() + 16;	// set offset for serialization
  
             beginTarafxaOrgXferPrcsIdN = getStartOffset() + 18;	// set offset for serialization
  
             beginTarafxaTrgrCondCdN = getStartOffset() + 20;	// set offset for serialization
  
             beginTarafxaTrgrStatTxtN = getStartOffset() + 22;	// set offset for serialization
  
             beginTarafxaOrgLocNamN = getStartOffset() + 24;	// set offset for serialization
  
             beginTarafxaTrgrActNamN = getStartOffset() + 26;	// set offset for serialization
  
             beginTarafxaPrvMnfrmFileNamN = getStartOffset() + 28;	// set offset for serialization
  
             beginTarafxaPrvCyclNumN = getStartOffset() + 30;	// set offset for serialization
  
             beginTarafxaPrvBusPrtnrIdN = getStartOffset() + 32;	// set offset for serialization
  
             beginTarafxaPrvEndptIdN = getStartOffset() + 34;	// set offset for serialization
  
             beginTarafxaPrvAvailTsN = getStartOffset() + 36;	// set offset for serialization
  
             beginTarafxaNxtMnfrmFileNamN = getStartOffset() + 38;	// set offset for serialization
  
             beginTarafxaNxtCyclNumN = getStartOffset() + 40;	// set offset for serialization
  
             beginTarafxaNxtBusPrtnrIdN = getStartOffset() + 42;	// set offset for serialization
  
             beginTarafxaNxtEndptIdN = getStartOffset() + 44;	// set offset for serialization
  
             beginTarafxaNxtAvailTsN = getStartOffset() + 46;	// set offset for serialization
  
             beginTarafxaApplExitJobNamN = getStartOffset() + 48;	// set offset for serialization
  
             beginTarafxaApplExitTsN = getStartOffset() + 50;	// set offset for serialization
  
             beginTarafxaCsMipIdN = getStartOffset() + 52;	// set offset for serialization
  
             beginTarafxaRmMipIdN = getStartOffset() + 54;	// set offset for serialization
  
             beginTarafxaApplExitNamN = getStartOffset() + 56;	// set offset for serialization
  
             beginTarafxaTapeCmpltdSwN = getStartOffset() + 58;	// set offset for serialization
  
             beginTarafxaTapeMultVolSwN = getStartOffset() + 60;	// set offset for serialization
  
             beginTarafxaApplPrcssngDtN = getStartOffset() + 62;	// set offset for serialization
  
             beginTarafxaTransitionalDsnN = getStartOffset() + 64;	// set offset for serialization
  
             beginTarafxaSourceHubIdN = getStartOffset() + 66;	// set offset for serialization
  
             beginTarafxaOwningHubIdN = getStartOffset() + 68;	// set offset for serialization
  
             beginTarafxaStatRefIdN = getStartOffset() + 70;	// set offset for serialization
  
             beginTarafxaSrcLocEntNamN = getStartOffset() + 72;	// set offset for serialization
  
             beginTarafxaSrcTaskNamN = getStartOffset() + 74;	// set offset for serialization
  
             beginTarafxaSrcTaskIdN = getStartOffset() + 76;	// set offset for serialization
  
             beginTarafxaSrcTaskUsrN = getStartOffset() + 78;	// set offset for serialization
  
             beginTarafxaSrcTaskStrtTsN = getStartOffset() + 80;	// set offset for serialization
  
             beginTarafxaSrcTaskStopTsN = getStartOffset() + 82;	// set offset for serialization
  
             beginTarafxaTrgtLocEntNamN = getStartOffset() + 84;	// set offset for serialization
  
             beginTarafxaTrgtTaskNamN = getStartOffset() + 86;	// set offset for serialization
  
             beginTarafxaTrgtTaskIdN = getStartOffset() + 88;	// set offset for serialization
  
             beginTarafxaTrgtTaskUsrN = getStartOffset() + 90;	// set offset for serialization
  
             beginTarafxaTrgtTaskStrtTsN = getStartOffset() + 92;	// set offset for serialization
  
             beginTarafxaTrgtTaskStopTsN = getStartOffset() + 94;	// set offset for serialization
  
             beginTarafxaApplTknNamN = getStartOffset() + 96;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localTarafxaArchLocTxtNCounter = -1;
         public boolean isTarafxaArchLocTxtNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaArchLocTxtNCounter != sharedCounter;
            localTarafxaArchLocTxtNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_ARCH_LOC_TXT_N_LEN = 2;
  	/**
	 * serializeTarafxaArchLocTxtN
	 */
	protected void serializeTarafxaArchLocTxtN(short tarafxaArchLocTxtN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaArchLocTxtN,TARAFXA_ARCH_LOC_TXT_N_LEN)
                  ,beginTarafxaArchLocTxtN
                  ,TARAFXA_ARCH_LOC_TXT_N_LEN
                 );
            localTarafxaArchLocTxtNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaArchLocTxtNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaArchLocTxtN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaArchLocTxtN() {	 
			return (getShort(beginTarafxaArchLocTxtN));
   	}
         int localTarafxaLstStatTsNCounter = -1;
         public boolean isTarafxaLstStatTsNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaLstStatTsNCounter != sharedCounter;
            localTarafxaLstStatTsNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_LST_STAT_TS_N_LEN = 2;
  	/**
	 * serializeTarafxaLstStatTsN
	 */
	protected void serializeTarafxaLstStatTsN(short tarafxaLstStatTsN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaLstStatTsN,TARAFXA_LST_STAT_TS_N_LEN)
                  ,beginTarafxaLstStatTsN
                  ,TARAFXA_LST_STAT_TS_N_LEN
                 );
            localTarafxaLstStatTsNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaLstStatTsNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaLstStatTsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaLstStatTsN() {	 
			return (getShort(beginTarafxaLstStatTsN));
   	}
         int localTarafxaXferRqstTsNCounter = -1;
         public boolean isTarafxaXferRqstTsNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaXferRqstTsNCounter != sharedCounter;
            localTarafxaXferRqstTsNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_XFER_RQST_TS_N_LEN = 2;
  	/**
	 * serializeTarafxaXferRqstTsN
	 */
	protected void serializeTarafxaXferRqstTsN(short tarafxaXferRqstTsN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaXferRqstTsN,TARAFXA_XFER_RQST_TS_N_LEN)
                  ,beginTarafxaXferRqstTsN
                  ,TARAFXA_XFER_RQST_TS_N_LEN
                 );
            localTarafxaXferRqstTsNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaXferRqstTsNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaXferRqstTsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaXferRqstTsN() {	 
			return (getShort(beginTarafxaXferRqstTsN));
   	}
         int localTarafxaXferStrtTsNCounter = -1;
         public boolean isTarafxaXferStrtTsNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaXferStrtTsNCounter != sharedCounter;
            localTarafxaXferStrtTsNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_XFER_STRT_TS_N_LEN = 2;
  	/**
	 * serializeTarafxaXferStrtTsN
	 */
	protected void serializeTarafxaXferStrtTsN(short tarafxaXferStrtTsN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaXferStrtTsN,TARAFXA_XFER_STRT_TS_N_LEN)
                  ,beginTarafxaXferStrtTsN
                  ,TARAFXA_XFER_STRT_TS_N_LEN
                 );
            localTarafxaXferStrtTsNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaXferStrtTsNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaXferStrtTsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaXferStrtTsN() {	 
			return (getShort(beginTarafxaXferStrtTsN));
   	}
         int localTarafxaXferStopTsNCounter = -1;
         public boolean isTarafxaXferStopTsNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaXferStopTsNCounter != sharedCounter;
            localTarafxaXferStopTsNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_XFER_STOP_TS_N_LEN = 2;
  	/**
	 * serializeTarafxaXferStopTsN
	 */
	protected void serializeTarafxaXferStopTsN(short tarafxaXferStopTsN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaXferStopTsN,TARAFXA_XFER_STOP_TS_N_LEN)
                  ,beginTarafxaXferStopTsN
                  ,TARAFXA_XFER_STOP_TS_N_LEN
                 );
            localTarafxaXferStopTsNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaXferStopTsNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaXferStopTsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaXferStopTsN() {	 
			return (getShort(beginTarafxaXferStopTsN));
   	}
         int localTarafxaXferRdyTsNCounter = -1;
         public boolean isTarafxaXferRdyTsNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaXferRdyTsNCounter != sharedCounter;
            localTarafxaXferRdyTsNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_XFER_RDY_TS_N_LEN = 2;
  	/**
	 * serializeTarafxaXferRdyTsN
	 */
	protected void serializeTarafxaXferRdyTsN(short tarafxaXferRdyTsN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaXferRdyTsN,TARAFXA_XFER_RDY_TS_N_LEN)
                  ,beginTarafxaXferRdyTsN
                  ,TARAFXA_XFER_RDY_TS_N_LEN
                 );
            localTarafxaXferRdyTsNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaXferRdyTsNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaXferRdyTsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaXferRdyTsN() {	 
			return (getShort(beginTarafxaXferRdyTsN));
   	}
         int localTarafxaXferCondCdNCounter = -1;
         public boolean isTarafxaXferCondCdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaXferCondCdNCounter != sharedCounter;
            localTarafxaXferCondCdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_XFER_COND_CD_N_LEN = 2;
  	/**
	 * serializeTarafxaXferCondCdN
	 */
	protected void serializeTarafxaXferCondCdN(short tarafxaXferCondCdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaXferCondCdN,TARAFXA_XFER_COND_CD_N_LEN)
                  ,beginTarafxaXferCondCdN
                  ,TARAFXA_XFER_COND_CD_N_LEN
                 );
            localTarafxaXferCondCdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaXferCondCdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaXferCondCdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaXferCondCdN() {	 
			return (getShort(beginTarafxaXferCondCdN));
   	}
         int localTarafxaXferStatTxtNCounter = -1;
         public boolean isTarafxaXferStatTxtNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaXferStatTxtNCounter != sharedCounter;
            localTarafxaXferStatTxtNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_XFER_STAT_TXT_N_LEN = 2;
  	/**
	 * serializeTarafxaXferStatTxtN
	 */
	protected void serializeTarafxaXferStatTxtN(short tarafxaXferStatTxtN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaXferStatTxtN,TARAFXA_XFER_STAT_TXT_N_LEN)
                  ,beginTarafxaXferStatTxtN
                  ,TARAFXA_XFER_STAT_TXT_N_LEN
                 );
            localTarafxaXferStatTxtNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaXferStatTxtNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaXferStatTxtN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaXferStatTxtN() {	 
			return (getShort(beginTarafxaXferStatTxtN));
   	}
         int localTarafxaXferPrcssIdNCounter = -1;
         public boolean isTarafxaXferPrcssIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaXferPrcssIdNCounter != sharedCounter;
            localTarafxaXferPrcssIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_XFER_PRCSS_ID_N_LEN = 2;
  	/**
	 * serializeTarafxaXferPrcssIdN
	 */
	protected void serializeTarafxaXferPrcssIdN(short tarafxaXferPrcssIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaXferPrcssIdN,TARAFXA_XFER_PRCSS_ID_N_LEN)
                  ,beginTarafxaXferPrcssIdN
                  ,TARAFXA_XFER_PRCSS_ID_N_LEN
                 );
            localTarafxaXferPrcssIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaXferPrcssIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaXferPrcssIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaXferPrcssIdN() {	 
			return (getShort(beginTarafxaXferPrcssIdN));
   	}
         int localTarafxaOrgXferPrcsIdNCounter = -1;
         public boolean isTarafxaOrgXferPrcsIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaOrgXferPrcsIdNCounter != sharedCounter;
            localTarafxaOrgXferPrcsIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_ORG_XFER_PRCS_ID_N_LEN = 2;
  	/**
	 * serializeTarafxaOrgXferPrcsIdN
	 */
	protected void serializeTarafxaOrgXferPrcsIdN(short tarafxaOrgXferPrcsIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaOrgXferPrcsIdN,TARAFXA_ORG_XFER_PRCS_ID_N_LEN)
                  ,beginTarafxaOrgXferPrcsIdN
                  ,TARAFXA_ORG_XFER_PRCS_ID_N_LEN
                 );
            localTarafxaOrgXferPrcsIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaOrgXferPrcsIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaOrgXferPrcsIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaOrgXferPrcsIdN() {	 
			return (getShort(beginTarafxaOrgXferPrcsIdN));
   	}
         int localTarafxaTrgrCondCdNCounter = -1;
         public boolean isTarafxaTrgrCondCdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaTrgrCondCdNCounter != sharedCounter;
            localTarafxaTrgrCondCdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_TRGR_COND_CD_N_LEN = 2;
  	/**
	 * serializeTarafxaTrgrCondCdN
	 */
	protected void serializeTarafxaTrgrCondCdN(short tarafxaTrgrCondCdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaTrgrCondCdN,TARAFXA_TRGR_COND_CD_N_LEN)
                  ,beginTarafxaTrgrCondCdN
                  ,TARAFXA_TRGR_COND_CD_N_LEN
                 );
            localTarafxaTrgrCondCdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaTrgrCondCdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaTrgrCondCdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaTrgrCondCdN() {	 
			return (getShort(beginTarafxaTrgrCondCdN));
   	}
         int localTarafxaTrgrStatTxtNCounter = -1;
         public boolean isTarafxaTrgrStatTxtNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaTrgrStatTxtNCounter != sharedCounter;
            localTarafxaTrgrStatTxtNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_TRGR_STAT_TXT_N_LEN = 2;
  	/**
	 * serializeTarafxaTrgrStatTxtN
	 */
	protected void serializeTarafxaTrgrStatTxtN(short tarafxaTrgrStatTxtN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaTrgrStatTxtN,TARAFXA_TRGR_STAT_TXT_N_LEN)
                  ,beginTarafxaTrgrStatTxtN
                  ,TARAFXA_TRGR_STAT_TXT_N_LEN
                 );
            localTarafxaTrgrStatTxtNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaTrgrStatTxtNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaTrgrStatTxtN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaTrgrStatTxtN() {	 
			return (getShort(beginTarafxaTrgrStatTxtN));
   	}
         int localTarafxaOrgLocNamNCounter = -1;
         public boolean isTarafxaOrgLocNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaOrgLocNamNCounter != sharedCounter;
            localTarafxaOrgLocNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_ORG_LOC_NAM_N_LEN = 2;
  	/**
	 * serializeTarafxaOrgLocNamN
	 */
	protected void serializeTarafxaOrgLocNamN(short tarafxaOrgLocNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaOrgLocNamN,TARAFXA_ORG_LOC_NAM_N_LEN)
                  ,beginTarafxaOrgLocNamN
                  ,TARAFXA_ORG_LOC_NAM_N_LEN
                 );
            localTarafxaOrgLocNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaOrgLocNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaOrgLocNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaOrgLocNamN() {	 
			return (getShort(beginTarafxaOrgLocNamN));
   	}
         int localTarafxaTrgrActNamNCounter = -1;
         public boolean isTarafxaTrgrActNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaTrgrActNamNCounter != sharedCounter;
            localTarafxaTrgrActNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_TRGR_ACT_NAM_N_LEN = 2;
  	/**
	 * serializeTarafxaTrgrActNamN
	 */
	protected void serializeTarafxaTrgrActNamN(short tarafxaTrgrActNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaTrgrActNamN,TARAFXA_TRGR_ACT_NAM_N_LEN)
                  ,beginTarafxaTrgrActNamN
                  ,TARAFXA_TRGR_ACT_NAM_N_LEN
                 );
            localTarafxaTrgrActNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaTrgrActNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaTrgrActNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaTrgrActNamN() {	 
			return (getShort(beginTarafxaTrgrActNamN));
   	}
         int localTarafxaPrvMnfrmFileNamNCounter = -1;
         public boolean isTarafxaPrvMnfrmFileNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaPrvMnfrmFileNamNCounter != sharedCounter;
            localTarafxaPrvMnfrmFileNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_PRV_MNFRM_FILE_NAM_N_LEN = 2;
  	/**
	 * serializeTarafxaPrvMnfrmFileNamN
	 */
	protected void serializeTarafxaPrvMnfrmFileNamN(short tarafxaPrvMnfrmFileNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaPrvMnfrmFileNamN,TARAFXA_PRV_MNFRM_FILE_NAM_N_LEN)
                  ,beginTarafxaPrvMnfrmFileNamN
                  ,TARAFXA_PRV_MNFRM_FILE_NAM_N_LEN
                 );
            localTarafxaPrvMnfrmFileNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaPrvMnfrmFileNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaPrvMnfrmFileNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaPrvMnfrmFileNamN() {	 
			return (getShort(beginTarafxaPrvMnfrmFileNamN));
   	}
         int localTarafxaPrvCyclNumNCounter = -1;
         public boolean isTarafxaPrvCyclNumNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaPrvCyclNumNCounter != sharedCounter;
            localTarafxaPrvCyclNumNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_PRV_CYCL_NUM_N_LEN = 2;
  	/**
	 * serializeTarafxaPrvCyclNumN
	 */
	protected void serializeTarafxaPrvCyclNumN(short tarafxaPrvCyclNumN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaPrvCyclNumN,TARAFXA_PRV_CYCL_NUM_N_LEN)
                  ,beginTarafxaPrvCyclNumN
                  ,TARAFXA_PRV_CYCL_NUM_N_LEN
                 );
            localTarafxaPrvCyclNumNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaPrvCyclNumNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaPrvCyclNumN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaPrvCyclNumN() {	 
			return (getShort(beginTarafxaPrvCyclNumN));
   	}
         int localTarafxaPrvBusPrtnrIdNCounter = -1;
         public boolean isTarafxaPrvBusPrtnrIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaPrvBusPrtnrIdNCounter != sharedCounter;
            localTarafxaPrvBusPrtnrIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_PRV_BUS_PRTNR_ID_N_LEN = 2;
  	/**
	 * serializeTarafxaPrvBusPrtnrIdN
	 */
	protected void serializeTarafxaPrvBusPrtnrIdN(short tarafxaPrvBusPrtnrIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaPrvBusPrtnrIdN,TARAFXA_PRV_BUS_PRTNR_ID_N_LEN)
                  ,beginTarafxaPrvBusPrtnrIdN
                  ,TARAFXA_PRV_BUS_PRTNR_ID_N_LEN
                 );
            localTarafxaPrvBusPrtnrIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaPrvBusPrtnrIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaPrvBusPrtnrIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaPrvBusPrtnrIdN() {	 
			return (getShort(beginTarafxaPrvBusPrtnrIdN));
   	}
         int localTarafxaPrvEndptIdNCounter = -1;
         public boolean isTarafxaPrvEndptIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaPrvEndptIdNCounter != sharedCounter;
            localTarafxaPrvEndptIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_PRV_ENDPT_ID_N_LEN = 2;
  	/**
	 * serializeTarafxaPrvEndptIdN
	 */
	protected void serializeTarafxaPrvEndptIdN(short tarafxaPrvEndptIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaPrvEndptIdN,TARAFXA_PRV_ENDPT_ID_N_LEN)
                  ,beginTarafxaPrvEndptIdN
                  ,TARAFXA_PRV_ENDPT_ID_N_LEN
                 );
            localTarafxaPrvEndptIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaPrvEndptIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaPrvEndptIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaPrvEndptIdN() {	 
			return (getShort(beginTarafxaPrvEndptIdN));
   	}
         int localTarafxaPrvAvailTsNCounter = -1;
         public boolean isTarafxaPrvAvailTsNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaPrvAvailTsNCounter != sharedCounter;
            localTarafxaPrvAvailTsNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_PRV_AVAIL_TS_N_LEN = 2;
  	/**
	 * serializeTarafxaPrvAvailTsN
	 */
	protected void serializeTarafxaPrvAvailTsN(short tarafxaPrvAvailTsN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaPrvAvailTsN,TARAFXA_PRV_AVAIL_TS_N_LEN)
                  ,beginTarafxaPrvAvailTsN
                  ,TARAFXA_PRV_AVAIL_TS_N_LEN
                 );
            localTarafxaPrvAvailTsNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaPrvAvailTsNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaPrvAvailTsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaPrvAvailTsN() {	 
			return (getShort(beginTarafxaPrvAvailTsN));
   	}
         int localTarafxaNxtMnfrmFileNamNCounter = -1;
         public boolean isTarafxaNxtMnfrmFileNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaNxtMnfrmFileNamNCounter != sharedCounter;
            localTarafxaNxtMnfrmFileNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_NXT_MNFRM_FILE_NAM_N_LEN = 2;
  	/**
	 * serializeTarafxaNxtMnfrmFileNamN
	 */
	protected void serializeTarafxaNxtMnfrmFileNamN(short tarafxaNxtMnfrmFileNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaNxtMnfrmFileNamN,TARAFXA_NXT_MNFRM_FILE_NAM_N_LEN)
                  ,beginTarafxaNxtMnfrmFileNamN
                  ,TARAFXA_NXT_MNFRM_FILE_NAM_N_LEN
                 );
            localTarafxaNxtMnfrmFileNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaNxtMnfrmFileNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaNxtMnfrmFileNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaNxtMnfrmFileNamN() {	 
			return (getShort(beginTarafxaNxtMnfrmFileNamN));
   	}
         int localTarafxaNxtCyclNumNCounter = -1;
         public boolean isTarafxaNxtCyclNumNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaNxtCyclNumNCounter != sharedCounter;
            localTarafxaNxtCyclNumNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_NXT_CYCL_NUM_N_LEN = 2;
  	/**
	 * serializeTarafxaNxtCyclNumN
	 */
	protected void serializeTarafxaNxtCyclNumN(short tarafxaNxtCyclNumN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaNxtCyclNumN,TARAFXA_NXT_CYCL_NUM_N_LEN)
                  ,beginTarafxaNxtCyclNumN
                  ,TARAFXA_NXT_CYCL_NUM_N_LEN
                 );
            localTarafxaNxtCyclNumNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaNxtCyclNumNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaNxtCyclNumN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaNxtCyclNumN() {	 
			return (getShort(beginTarafxaNxtCyclNumN));
   	}
         int localTarafxaNxtBusPrtnrIdNCounter = -1;
         public boolean isTarafxaNxtBusPrtnrIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaNxtBusPrtnrIdNCounter != sharedCounter;
            localTarafxaNxtBusPrtnrIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_NXT_BUS_PRTNR_ID_N_LEN = 2;
  	/**
	 * serializeTarafxaNxtBusPrtnrIdN
	 */
	protected void serializeTarafxaNxtBusPrtnrIdN(short tarafxaNxtBusPrtnrIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaNxtBusPrtnrIdN,TARAFXA_NXT_BUS_PRTNR_ID_N_LEN)
                  ,beginTarafxaNxtBusPrtnrIdN
                  ,TARAFXA_NXT_BUS_PRTNR_ID_N_LEN
                 );
            localTarafxaNxtBusPrtnrIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaNxtBusPrtnrIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaNxtBusPrtnrIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaNxtBusPrtnrIdN() {	 
			return (getShort(beginTarafxaNxtBusPrtnrIdN));
   	}
         int localTarafxaNxtEndptIdNCounter = -1;
         public boolean isTarafxaNxtEndptIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaNxtEndptIdNCounter != sharedCounter;
            localTarafxaNxtEndptIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_NXT_ENDPT_ID_N_LEN = 2;
  	/**
	 * serializeTarafxaNxtEndptIdN
	 */
	protected void serializeTarafxaNxtEndptIdN(short tarafxaNxtEndptIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaNxtEndptIdN,TARAFXA_NXT_ENDPT_ID_N_LEN)
                  ,beginTarafxaNxtEndptIdN
                  ,TARAFXA_NXT_ENDPT_ID_N_LEN
                 );
            localTarafxaNxtEndptIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaNxtEndptIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaNxtEndptIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaNxtEndptIdN() {	 
			return (getShort(beginTarafxaNxtEndptIdN));
   	}
         int localTarafxaNxtAvailTsNCounter = -1;
         public boolean isTarafxaNxtAvailTsNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaNxtAvailTsNCounter != sharedCounter;
            localTarafxaNxtAvailTsNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_NXT_AVAIL_TS_N_LEN = 2;
  	/**
	 * serializeTarafxaNxtAvailTsN
	 */
	protected void serializeTarafxaNxtAvailTsN(short tarafxaNxtAvailTsN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaNxtAvailTsN,TARAFXA_NXT_AVAIL_TS_N_LEN)
                  ,beginTarafxaNxtAvailTsN
                  ,TARAFXA_NXT_AVAIL_TS_N_LEN
                 );
            localTarafxaNxtAvailTsNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaNxtAvailTsNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaNxtAvailTsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaNxtAvailTsN() {	 
			return (getShort(beginTarafxaNxtAvailTsN));
   	}
         int localTarafxaApplExitJobNamNCounter = -1;
         public boolean isTarafxaApplExitJobNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaApplExitJobNamNCounter != sharedCounter;
            localTarafxaApplExitJobNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_APPL_EXIT_JOB_NAM_N_LEN = 2;
  	/**
	 * serializeTarafxaApplExitJobNamN
	 */
	protected void serializeTarafxaApplExitJobNamN(short tarafxaApplExitJobNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaApplExitJobNamN,TARAFXA_APPL_EXIT_JOB_NAM_N_LEN)
                  ,beginTarafxaApplExitJobNamN
                  ,TARAFXA_APPL_EXIT_JOB_NAM_N_LEN
                 );
            localTarafxaApplExitJobNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaApplExitJobNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaApplExitJobNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaApplExitJobNamN() {	 
			return (getShort(beginTarafxaApplExitJobNamN));
   	}
         int localTarafxaApplExitTsNCounter = -1;
         public boolean isTarafxaApplExitTsNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaApplExitTsNCounter != sharedCounter;
            localTarafxaApplExitTsNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_APPL_EXIT_TS_N_LEN = 2;
  	/**
	 * serializeTarafxaApplExitTsN
	 */
	protected void serializeTarafxaApplExitTsN(short tarafxaApplExitTsN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaApplExitTsN,TARAFXA_APPL_EXIT_TS_N_LEN)
                  ,beginTarafxaApplExitTsN
                  ,TARAFXA_APPL_EXIT_TS_N_LEN
                 );
            localTarafxaApplExitTsNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaApplExitTsNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaApplExitTsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaApplExitTsN() {	 
			return (getShort(beginTarafxaApplExitTsN));
   	}
         int localTarafxaCsMipIdNCounter = -1;
         public boolean isTarafxaCsMipIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaCsMipIdNCounter != sharedCounter;
            localTarafxaCsMipIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_CS_MIP_ID_N_LEN = 2;
  	/**
	 * serializeTarafxaCsMipIdN
	 */
	protected void serializeTarafxaCsMipIdN(short tarafxaCsMipIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaCsMipIdN,TARAFXA_CS_MIP_ID_N_LEN)
                  ,beginTarafxaCsMipIdN
                  ,TARAFXA_CS_MIP_ID_N_LEN
                 );
            localTarafxaCsMipIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaCsMipIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaCsMipIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaCsMipIdN() {	 
			return (getShort(beginTarafxaCsMipIdN));
   	}
         int localTarafxaRmMipIdNCounter = -1;
         public boolean isTarafxaRmMipIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaRmMipIdNCounter != sharedCounter;
            localTarafxaRmMipIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_RM_MIP_ID_N_LEN = 2;
  	/**
	 * serializeTarafxaRmMipIdN
	 */
	protected void serializeTarafxaRmMipIdN(short tarafxaRmMipIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaRmMipIdN,TARAFXA_RM_MIP_ID_N_LEN)
                  ,beginTarafxaRmMipIdN
                  ,TARAFXA_RM_MIP_ID_N_LEN
                 );
            localTarafxaRmMipIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaRmMipIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaRmMipIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaRmMipIdN() {	 
			return (getShort(beginTarafxaRmMipIdN));
   	}
         int localTarafxaApplExitNamNCounter = -1;
         public boolean isTarafxaApplExitNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaApplExitNamNCounter != sharedCounter;
            localTarafxaApplExitNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_APPL_EXIT_NAM_N_LEN = 2;
  	/**
	 * serializeTarafxaApplExitNamN
	 */
	protected void serializeTarafxaApplExitNamN(short tarafxaApplExitNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaApplExitNamN,TARAFXA_APPL_EXIT_NAM_N_LEN)
                  ,beginTarafxaApplExitNamN
                  ,TARAFXA_APPL_EXIT_NAM_N_LEN
                 );
            localTarafxaApplExitNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaApplExitNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaApplExitNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaApplExitNamN() {	 
			return (getShort(beginTarafxaApplExitNamN));
   	}
         int localTarafxaTapeCmpltdSwNCounter = -1;
         public boolean isTarafxaTapeCmpltdSwNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaTapeCmpltdSwNCounter != sharedCounter;
            localTarafxaTapeCmpltdSwNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_TAPE_CMPLTD_SW_N_LEN = 2;
  	/**
	 * serializeTarafxaTapeCmpltdSwN
	 */
	protected void serializeTarafxaTapeCmpltdSwN(short tarafxaTapeCmpltdSwN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaTapeCmpltdSwN,TARAFXA_TAPE_CMPLTD_SW_N_LEN)
                  ,beginTarafxaTapeCmpltdSwN
                  ,TARAFXA_TAPE_CMPLTD_SW_N_LEN
                 );
            localTarafxaTapeCmpltdSwNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaTapeCmpltdSwNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaTapeCmpltdSwN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaTapeCmpltdSwN() {	 
			return (getShort(beginTarafxaTapeCmpltdSwN));
   	}
         int localTarafxaTapeMultVolSwNCounter = -1;
         public boolean isTarafxaTapeMultVolSwNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaTapeMultVolSwNCounter != sharedCounter;
            localTarafxaTapeMultVolSwNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_TAPE_MULT_VOL_SW_N_LEN = 2;
  	/**
	 * serializeTarafxaTapeMultVolSwN
	 */
	protected void serializeTarafxaTapeMultVolSwN(short tarafxaTapeMultVolSwN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaTapeMultVolSwN,TARAFXA_TAPE_MULT_VOL_SW_N_LEN)
                  ,beginTarafxaTapeMultVolSwN
                  ,TARAFXA_TAPE_MULT_VOL_SW_N_LEN
                 );
            localTarafxaTapeMultVolSwNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaTapeMultVolSwNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaTapeMultVolSwN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaTapeMultVolSwN() {	 
			return (getShort(beginTarafxaTapeMultVolSwN));
   	}
         int localTarafxaApplPrcssngDtNCounter = -1;
         public boolean isTarafxaApplPrcssngDtNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaApplPrcssngDtNCounter != sharedCounter;
            localTarafxaApplPrcssngDtNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_APPL_PRCSSNG_DT_N_LEN = 2;
  	/**
	 * serializeTarafxaApplPrcssngDtN
	 */
	protected void serializeTarafxaApplPrcssngDtN(short tarafxaApplPrcssngDtN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaApplPrcssngDtN,TARAFXA_APPL_PRCSSNG_DT_N_LEN)
                  ,beginTarafxaApplPrcssngDtN
                  ,TARAFXA_APPL_PRCSSNG_DT_N_LEN
                 );
            localTarafxaApplPrcssngDtNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaApplPrcssngDtNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaApplPrcssngDtN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaApplPrcssngDtN() {	 
			return (getShort(beginTarafxaApplPrcssngDtN));
   	}
         int localTarafxaTransitionalDsnNCounter = -1;
         public boolean isTarafxaTransitionalDsnNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaTransitionalDsnNCounter != sharedCounter;
            localTarafxaTransitionalDsnNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_TRANSITIONAL_DSN_N_LEN = 2;
  	/**
	 * serializeTarafxaTransitionalDsnN
	 */
	protected void serializeTarafxaTransitionalDsnN(short tarafxaTransitionalDsnN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaTransitionalDsnN,TARAFXA_TRANSITIONAL_DSN_N_LEN)
                  ,beginTarafxaTransitionalDsnN
                  ,TARAFXA_TRANSITIONAL_DSN_N_LEN
                 );
            localTarafxaTransitionalDsnNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaTransitionalDsnNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaTransitionalDsnN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaTransitionalDsnN() {	 
			return (getShort(beginTarafxaTransitionalDsnN));
   	}
         int localTarafxaSourceHubIdNCounter = -1;
         public boolean isTarafxaSourceHubIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaSourceHubIdNCounter != sharedCounter;
            localTarafxaSourceHubIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_SOURCE_HUB_ID_N_LEN = 2;
  	/**
	 * serializeTarafxaSourceHubIdN
	 */
	protected void serializeTarafxaSourceHubIdN(short tarafxaSourceHubIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaSourceHubIdN,TARAFXA_SOURCE_HUB_ID_N_LEN)
                  ,beginTarafxaSourceHubIdN
                  ,TARAFXA_SOURCE_HUB_ID_N_LEN
                 );
            localTarafxaSourceHubIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaSourceHubIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaSourceHubIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaSourceHubIdN() {	 
			return (getShort(beginTarafxaSourceHubIdN));
   	}
         int localTarafxaOwningHubIdNCounter = -1;
         public boolean isTarafxaOwningHubIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaOwningHubIdNCounter != sharedCounter;
            localTarafxaOwningHubIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_OWNING_HUB_ID_N_LEN = 2;
  	/**
	 * serializeTarafxaOwningHubIdN
	 */
	protected void serializeTarafxaOwningHubIdN(short tarafxaOwningHubIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaOwningHubIdN,TARAFXA_OWNING_HUB_ID_N_LEN)
                  ,beginTarafxaOwningHubIdN
                  ,TARAFXA_OWNING_HUB_ID_N_LEN
                 );
            localTarafxaOwningHubIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaOwningHubIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaOwningHubIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaOwningHubIdN() {	 
			return (getShort(beginTarafxaOwningHubIdN));
   	}
         int localTarafxaStatRefIdNCounter = -1;
         public boolean isTarafxaStatRefIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaStatRefIdNCounter != sharedCounter;
            localTarafxaStatRefIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_STAT_REF_ID_N_LEN = 2;
  	/**
	 * serializeTarafxaStatRefIdN
	 */
	protected void serializeTarafxaStatRefIdN(short tarafxaStatRefIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaStatRefIdN,TARAFXA_STAT_REF_ID_N_LEN)
                  ,beginTarafxaStatRefIdN
                  ,TARAFXA_STAT_REF_ID_N_LEN
                 );
            localTarafxaStatRefIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaStatRefIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaStatRefIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaStatRefIdN() {	 
			return (getShort(beginTarafxaStatRefIdN));
   	}
         int localTarafxaSrcLocEntNamNCounter = -1;
         public boolean isTarafxaSrcLocEntNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaSrcLocEntNamNCounter != sharedCounter;
            localTarafxaSrcLocEntNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_SRC_LOC_ENT_NAM_N_LEN = 2;
  	/**
	 * serializeTarafxaSrcLocEntNamN
	 */
	protected void serializeTarafxaSrcLocEntNamN(short tarafxaSrcLocEntNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaSrcLocEntNamN,TARAFXA_SRC_LOC_ENT_NAM_N_LEN)
                  ,beginTarafxaSrcLocEntNamN
                  ,TARAFXA_SRC_LOC_ENT_NAM_N_LEN
                 );
            localTarafxaSrcLocEntNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaSrcLocEntNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaSrcLocEntNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaSrcLocEntNamN() {	 
			return (getShort(beginTarafxaSrcLocEntNamN));
   	}
         int localTarafxaSrcTaskNamNCounter = -1;
         public boolean isTarafxaSrcTaskNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaSrcTaskNamNCounter != sharedCounter;
            localTarafxaSrcTaskNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_SRC_TASK_NAM_N_LEN = 2;
  	/**
	 * serializeTarafxaSrcTaskNamN
	 */
	protected void serializeTarafxaSrcTaskNamN(short tarafxaSrcTaskNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaSrcTaskNamN,TARAFXA_SRC_TASK_NAM_N_LEN)
                  ,beginTarafxaSrcTaskNamN
                  ,TARAFXA_SRC_TASK_NAM_N_LEN
                 );
            localTarafxaSrcTaskNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaSrcTaskNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaSrcTaskNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaSrcTaskNamN() {	 
			return (getShort(beginTarafxaSrcTaskNamN));
   	}
         int localTarafxaSrcTaskIdNCounter = -1;
         public boolean isTarafxaSrcTaskIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaSrcTaskIdNCounter != sharedCounter;
            localTarafxaSrcTaskIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_SRC_TASK_ID_N_LEN = 2;
  	/**
	 * serializeTarafxaSrcTaskIdN
	 */
	protected void serializeTarafxaSrcTaskIdN(short tarafxaSrcTaskIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaSrcTaskIdN,TARAFXA_SRC_TASK_ID_N_LEN)
                  ,beginTarafxaSrcTaskIdN
                  ,TARAFXA_SRC_TASK_ID_N_LEN
                 );
            localTarafxaSrcTaskIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaSrcTaskIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaSrcTaskIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaSrcTaskIdN() {	 
			return (getShort(beginTarafxaSrcTaskIdN));
   	}
         int localTarafxaSrcTaskUsrNCounter = -1;
         public boolean isTarafxaSrcTaskUsrNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaSrcTaskUsrNCounter != sharedCounter;
            localTarafxaSrcTaskUsrNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_SRC_TASK_USR_N_LEN = 2;
  	/**
	 * serializeTarafxaSrcTaskUsrN
	 */
	protected void serializeTarafxaSrcTaskUsrN(short tarafxaSrcTaskUsrN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaSrcTaskUsrN,TARAFXA_SRC_TASK_USR_N_LEN)
                  ,beginTarafxaSrcTaskUsrN
                  ,TARAFXA_SRC_TASK_USR_N_LEN
                 );
            localTarafxaSrcTaskUsrNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaSrcTaskUsrNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaSrcTaskUsrN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaSrcTaskUsrN() {	 
			return (getShort(beginTarafxaSrcTaskUsrN));
   	}
         int localTarafxaSrcTaskStrtTsNCounter = -1;
         public boolean isTarafxaSrcTaskStrtTsNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaSrcTaskStrtTsNCounter != sharedCounter;
            localTarafxaSrcTaskStrtTsNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_SRC_TASK_STRT_TS_N_LEN = 2;
  	/**
	 * serializeTarafxaSrcTaskStrtTsN
	 */
	protected void serializeTarafxaSrcTaskStrtTsN(short tarafxaSrcTaskStrtTsN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaSrcTaskStrtTsN,TARAFXA_SRC_TASK_STRT_TS_N_LEN)
                  ,beginTarafxaSrcTaskStrtTsN
                  ,TARAFXA_SRC_TASK_STRT_TS_N_LEN
                 );
            localTarafxaSrcTaskStrtTsNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaSrcTaskStrtTsNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaSrcTaskStrtTsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaSrcTaskStrtTsN() {	 
			return (getShort(beginTarafxaSrcTaskStrtTsN));
   	}
         int localTarafxaSrcTaskStopTsNCounter = -1;
         public boolean isTarafxaSrcTaskStopTsNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaSrcTaskStopTsNCounter != sharedCounter;
            localTarafxaSrcTaskStopTsNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_SRC_TASK_STOP_TS_N_LEN = 2;
  	/**
	 * serializeTarafxaSrcTaskStopTsN
	 */
	protected void serializeTarafxaSrcTaskStopTsN(short tarafxaSrcTaskStopTsN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaSrcTaskStopTsN,TARAFXA_SRC_TASK_STOP_TS_N_LEN)
                  ,beginTarafxaSrcTaskStopTsN
                  ,TARAFXA_SRC_TASK_STOP_TS_N_LEN
                 );
            localTarafxaSrcTaskStopTsNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaSrcTaskStopTsNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaSrcTaskStopTsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaSrcTaskStopTsN() {	 
			return (getShort(beginTarafxaSrcTaskStopTsN));
   	}
         int localTarafxaTrgtLocEntNamNCounter = -1;
         public boolean isTarafxaTrgtLocEntNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaTrgtLocEntNamNCounter != sharedCounter;
            localTarafxaTrgtLocEntNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_TRGT_LOC_ENT_NAM_N_LEN = 2;
  	/**
	 * serializeTarafxaTrgtLocEntNamN
	 */
	protected void serializeTarafxaTrgtLocEntNamN(short tarafxaTrgtLocEntNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaTrgtLocEntNamN,TARAFXA_TRGT_LOC_ENT_NAM_N_LEN)
                  ,beginTarafxaTrgtLocEntNamN
                  ,TARAFXA_TRGT_LOC_ENT_NAM_N_LEN
                 );
            localTarafxaTrgtLocEntNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaTrgtLocEntNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaTrgtLocEntNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaTrgtLocEntNamN() {	 
			return (getShort(beginTarafxaTrgtLocEntNamN));
   	}
         int localTarafxaTrgtTaskNamNCounter = -1;
         public boolean isTarafxaTrgtTaskNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaTrgtTaskNamNCounter != sharedCounter;
            localTarafxaTrgtTaskNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_TRGT_TASK_NAM_N_LEN = 2;
  	/**
	 * serializeTarafxaTrgtTaskNamN
	 */
	protected void serializeTarafxaTrgtTaskNamN(short tarafxaTrgtTaskNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaTrgtTaskNamN,TARAFXA_TRGT_TASK_NAM_N_LEN)
                  ,beginTarafxaTrgtTaskNamN
                  ,TARAFXA_TRGT_TASK_NAM_N_LEN
                 );
            localTarafxaTrgtTaskNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaTrgtTaskNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaTrgtTaskNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaTrgtTaskNamN() {	 
			return (getShort(beginTarafxaTrgtTaskNamN));
   	}
         int localTarafxaTrgtTaskIdNCounter = -1;
         public boolean isTarafxaTrgtTaskIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaTrgtTaskIdNCounter != sharedCounter;
            localTarafxaTrgtTaskIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_TRGT_TASK_ID_N_LEN = 2;
  	/**
	 * serializeTarafxaTrgtTaskIdN
	 */
	protected void serializeTarafxaTrgtTaskIdN(short tarafxaTrgtTaskIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaTrgtTaskIdN,TARAFXA_TRGT_TASK_ID_N_LEN)
                  ,beginTarafxaTrgtTaskIdN
                  ,TARAFXA_TRGT_TASK_ID_N_LEN
                 );
            localTarafxaTrgtTaskIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaTrgtTaskIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaTrgtTaskIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaTrgtTaskIdN() {	 
			return (getShort(beginTarafxaTrgtTaskIdN));
   	}
         int localTarafxaTrgtTaskUsrNCounter = -1;
         public boolean isTarafxaTrgtTaskUsrNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaTrgtTaskUsrNCounter != sharedCounter;
            localTarafxaTrgtTaskUsrNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_TRGT_TASK_USR_N_LEN = 2;
  	/**
	 * serializeTarafxaTrgtTaskUsrN
	 */
	protected void serializeTarafxaTrgtTaskUsrN(short tarafxaTrgtTaskUsrN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaTrgtTaskUsrN,TARAFXA_TRGT_TASK_USR_N_LEN)
                  ,beginTarafxaTrgtTaskUsrN
                  ,TARAFXA_TRGT_TASK_USR_N_LEN
                 );
            localTarafxaTrgtTaskUsrNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaTrgtTaskUsrNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaTrgtTaskUsrN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaTrgtTaskUsrN() {	 
			return (getShort(beginTarafxaTrgtTaskUsrN));
   	}
         int localTarafxaTrgtTaskStrtTsNCounter = -1;
         public boolean isTarafxaTrgtTaskStrtTsNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaTrgtTaskStrtTsNCounter != sharedCounter;
            localTarafxaTrgtTaskStrtTsNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_TRGT_TASK_STRT_TS_N_LEN = 2;
  	/**
	 * serializeTarafxaTrgtTaskStrtTsN
	 */
	protected void serializeTarafxaTrgtTaskStrtTsN(short tarafxaTrgtTaskStrtTsN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaTrgtTaskStrtTsN,TARAFXA_TRGT_TASK_STRT_TS_N_LEN)
                  ,beginTarafxaTrgtTaskStrtTsN
                  ,TARAFXA_TRGT_TASK_STRT_TS_N_LEN
                 );
            localTarafxaTrgtTaskStrtTsNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaTrgtTaskStrtTsNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaTrgtTaskStrtTsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaTrgtTaskStrtTsN() {	 
			return (getShort(beginTarafxaTrgtTaskStrtTsN));
   	}
         int localTarafxaTrgtTaskStopTsNCounter = -1;
         public boolean isTarafxaTrgtTaskStopTsNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaTrgtTaskStopTsNCounter != sharedCounter;
            localTarafxaTrgtTaskStopTsNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_TRGT_TASK_STOP_TS_N_LEN = 2;
  	/**
	 * serializeTarafxaTrgtTaskStopTsN
	 */
	protected void serializeTarafxaTrgtTaskStopTsN(short tarafxaTrgtTaskStopTsN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaTrgtTaskStopTsN,TARAFXA_TRGT_TASK_STOP_TS_N_LEN)
                  ,beginTarafxaTrgtTaskStopTsN
                  ,TARAFXA_TRGT_TASK_STOP_TS_N_LEN
                 );
            localTarafxaTrgtTaskStopTsNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaTrgtTaskStopTsNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaTrgtTaskStopTsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaTrgtTaskStopTsN() {	 
			return (getShort(beginTarafxaTrgtTaskStopTsN));
   	}
         int localTarafxaApplTknNamNCounter = -1;
         public boolean isTarafxaApplTknNamNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaApplTknNamNCounter != sharedCounter;
            localTarafxaApplTknNamNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_APPL_TKN_NAM_N_LEN = 2;
  	/**
	 * serializeTarafxaApplTknNamN
	 */
	protected void serializeTarafxaApplTknNamN(short tarafxaApplTknNamN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaApplTknNamN,TARAFXA_APPL_TKN_NAM_N_LEN)
                  ,beginTarafxaApplTknNamN
                  ,TARAFXA_APPL_TKN_NAM_N_LEN
                 );
            localTarafxaApplTknNamNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaApplTknNamNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaApplTknNamN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaApplTknNamN() {	 
			return (getShort(beginTarafxaApplTknNamN));
   	}




}
  

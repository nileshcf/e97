package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class TaraefpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class TaraefpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TaraefpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TARAEFP_LENGTH = 307;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTaraefpEndptId;
            protected  int beginTaraefpBulkId;
            protected  int beginTaraefpCyclNum;
            protected  int beginTaraefpAppFileRtnNum;
            protected  int beginTaraefpPrtyNum;
            protected  int beginTaraefpTrnsltnSw;
            protected  int beginTaraefpTrnsltnRtnNam;
            protected  int beginTaraefpXferTypeCd;
            protected  int beginTaraefpStatusCd;
	
	/**
	* Constructor for TaraefpSerialized
	**/
    public TaraefpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TaraefpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TARAEFP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTaraefpEndptId = getStartOffset() + 0;	// set offset for serialization
  
             beginTaraefpBulkId = getStartOffset() + 7;	// set offset for serialization
  
             beginTaraefpCyclNum = getStartOffset() + 11;	// set offset for serialization
  
             beginTaraefpAppFileRtnNum = getStartOffset() + 13;	// set offset for serialization
  
             beginTaraefpPrtyNum = getStartOffset() + 15;	// set offset for serialization
  
             beginTaraefpTrnsltnSw = getStartOffset() + 18;	// set offset for serialization
  
             beginTaraefpTrnsltnRtnNam = getStartOffset() + 19;	// set offset for serialization
  
             beginTaraefpXferTypeCd = getStartOffset() + 69;	// set offset for serialization
  
             beginTaraefpStatusCd = getStartOffset() + 226;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTaraefpEndptIdCounter = -1;
     public boolean isTaraefpEndptIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraefpEndptIdCounter != sharedCounter;
         localTaraefpEndptIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEFP_ENDPT_ID_LEN = 7;
	/**
	 * 	serialize this TaraefpEndptId
	 */
   protected void serializeTaraefpEndptId(char[] taraefpEndptId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraefpEndptId,0,getStringValue(),beginTaraefpEndptId,TARAEFP_ENDPT_ID_LEN);
       localTaraefpEndptIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraefpEndptIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTaraefpEndptId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraefpEndptId() {	 
   		return (substring(getStringValue(),beginTaraefpEndptId,beginTaraefpEndptId + TARAEFP_ENDPT_ID_LEN));
   	}
     int localTaraefpBulkIdCounter = -1;
     public boolean isTaraefpBulkIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraefpBulkIdCounter != sharedCounter;
         localTaraefpBulkIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEFP_BULK_ID_LEN = 4;
	/**
	 * 	serialize this TaraefpBulkId
	 */
   protected void serializeTaraefpBulkId(char[] taraefpBulkId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraefpBulkId,0,getStringValue(),beginTaraefpBulkId,TARAEFP_BULK_ID_LEN);
       localTaraefpBulkIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraefpBulkIdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshTaraefpBulkId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraefpBulkId() {	 
   		return (substring(getStringValue(),beginTaraefpBulkId,beginTaraefpBulkId + TARAEFP_BULK_ID_LEN));
   	}
        int localTaraefpCyclNumCounter = -1;
        public boolean isTaraefpCyclNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTaraefpCyclNumCounter != sharedCounter;
           localTaraefpCyclNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean taraefpCyclNumIsNumeric() {
	      return decimalIsNumeric(beginTaraefpCyclNum,TARAEFP_CYCL_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAEFP_CYCL_NUM_LEN = 2;
  	/**
	 * 	serializeTaraefpCyclNum
	 */
	protected void serializeTaraefpCyclNum(short taraefpCyclNum) {
		   putDecimal(beginTaraefpCyclNum,taraefpCyclNum,TARAEFP_CYCL_NUM_LEN,true);
   }
   

   protected short checkTaraefpCyclNumMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshTaraefpCyclNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraefpCyclNum() throws CFException {	
   	try { 
		 return (getShortDecimal(beginTaraefpCyclNum,TARAEFP_CYCL_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("taraefpCyclNum", beginTaraefpCyclNum,TARAEFP_CYCL_NUM_LEN);
     }
   	}
        int localTaraefpAppFileRtnNumCounter = -1;
        public boolean isTaraefpAppFileRtnNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTaraefpAppFileRtnNumCounter != sharedCounter;
           localTaraefpAppFileRtnNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean taraefpAppFileRtnNumIsNumeric() {
	      return decimalIsNumeric(beginTaraefpAppFileRtnNum,TARAEFP_APP_FILE_RTN_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAEFP_APP_FILE_RTN_NUM_LEN = 2;
  	/**
	 * 	serializeTaraefpAppFileRtnNum
	 */
	protected void serializeTaraefpAppFileRtnNum(short taraefpAppFileRtnNum) {
		   putDecimal(beginTaraefpAppFileRtnNum,taraefpAppFileRtnNum,TARAEFP_APP_FILE_RTN_NUM_LEN,true);
   }
   

   protected short checkTaraefpAppFileRtnNumMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshTaraefpAppFileRtnNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraefpAppFileRtnNum() throws CFException {	
   	try { 
		 return (getShortDecimal(beginTaraefpAppFileRtnNum,TARAEFP_APP_FILE_RTN_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("taraefpAppFileRtnNum", beginTaraefpAppFileRtnNum,TARAEFP_APP_FILE_RTN_NUM_LEN);
     }
   	}
        int localTaraefpPrtyNumCounter = -1;
        public boolean isTaraefpPrtyNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTaraefpPrtyNumCounter != sharedCounter;
           localTaraefpPrtyNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean taraefpPrtyNumIsNumeric() {
	      return decimalIsNumeric(beginTaraefpPrtyNum,TARAEFP_PRTY_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAEFP_PRTY_NUM_LEN = 2;
  	/**
	 * 	serializeTaraefpPrtyNum
	 */
	protected void serializeTaraefpPrtyNum(short taraefpPrtyNum) {
		   putDecimal(beginTaraefpPrtyNum,taraefpPrtyNum,TARAEFP_PRTY_NUM_LEN,true);
   }
   

   protected short checkTaraefpPrtyNumMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshTaraefpPrtyNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraefpPrtyNum() throws CFException {	
   	try { 
		 return (getShortDecimal(beginTaraefpPrtyNum,TARAEFP_PRTY_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("taraefpPrtyNum", beginTaraefpPrtyNum,TARAEFP_PRTY_NUM_LEN);
     }
   	}
     int localTaraefpTrnsltnSwCounter = -1;
     public boolean isTaraefpTrnsltnSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraefpTrnsltnSwCounter != sharedCounter;
         localTaraefpTrnsltnSwCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEFP_TRNSLTN_SW_LEN = 1;
	/**
	 * 	serialize this TaraefpTrnsltnSw
	 */
   protected void serializeTaraefpTrnsltnSw(char[] taraefpTrnsltnSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraefpTrnsltnSw,0,getStringValue(),beginTaraefpTrnsltnSw,TARAEFP_TRNSLTN_SW_LEN);
       localTaraefpTrnsltnSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraefpTrnsltnSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTaraefpTrnsltnSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraefpTrnsltnSw() {	 
   		return (substring(getStringValue(),beginTaraefpTrnsltnSw,beginTaraefpTrnsltnSw + TARAEFP_TRNSLTN_SW_LEN));
   	}
     int localTaraefpTrnsltnRtnNamCounter = -1;
     public boolean isTaraefpTrnsltnRtnNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraefpTrnsltnRtnNamCounter != sharedCounter;
         localTaraefpTrnsltnRtnNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEFP_TRNSLTN_RTN_NAM_LEN = 50;
	/**
	 * 	serialize this TaraefpTrnsltnRtnNam
	 */
   protected void serializeTaraefpTrnsltnRtnNam(char[] taraefpTrnsltnRtnNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraefpTrnsltnRtnNam,0,getStringValue(),beginTaraefpTrnsltnRtnNam,TARAEFP_TRNSLTN_RTN_NAM_LEN);
       localTaraefpTrnsltnRtnNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraefpTrnsltnRtnNamConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
    /**
	 *	refreshTaraefpTrnsltnRtnNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraefpTrnsltnRtnNam() {	 
   		return (substring(getStringValue(),beginTaraefpTrnsltnRtnNam,beginTaraefpTrnsltnRtnNam + TARAEFP_TRNSLTN_RTN_NAM_LEN));
   	}
     int localTaraefpXferTypeCdCounter = -1;
     public boolean isTaraefpXferTypeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraefpXferTypeCdCounter != sharedCounter;
         localTaraefpXferTypeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEFP_XFER_TYPE_CD_LEN = 1;
	/**
	 * 	serialize this TaraefpXferTypeCd
	 */
   protected void serializeTaraefpXferTypeCd(char[] taraefpXferTypeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraefpXferTypeCd,0,getStringValue(),beginTaraefpXferTypeCd,TARAEFP_XFER_TYPE_CD_LEN);
       localTaraefpXferTypeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraefpXferTypeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTaraefpXferTypeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraefpXferTypeCd() {	 
   		return (substring(getStringValue(),beginTaraefpXferTypeCd,beginTaraefpXferTypeCd + TARAEFP_XFER_TYPE_CD_LEN));
   	}
     int localTaraefpStatusCdCounter = -1;
     public boolean isTaraefpStatusCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraefpStatusCdCounter != sharedCounter;
         localTaraefpStatusCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAEFP_STATUS_CD_LEN = 1;
	/**
	 * 	serialize this TaraefpStatusCd
	 */
   protected void serializeTaraefpStatusCd(char[] taraefpStatusCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taraefpStatusCd,0,getStringValue(),beginTaraefpStatusCd,TARAEFP_STATUS_CD_LEN);
       localTaraefpStatusCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaraefpStatusCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTaraefpStatusCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaraefpStatusCd() {	 
   		return (substring(getStringValue(),beginTaraefpStatusCd,beginTaraefpStatusCd + TARAEFP_STATUS_CD_LEN));
   	}




}
  

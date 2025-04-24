package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class TarafplSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class TarafplSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TarafplSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TARAFPL_LENGTH = 182;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTarafplBulkId;
            protected  int beginTarafplTtlNam;
            protected  int beginTarafplPrtyNum;
            protected  int beginTarafplAlctnSpcTypeCd;
            protected  int beginTarafplAlctnSpcPrimNum;
            protected  int beginTarafplSndRcvPrmsnCd;
            protected  int beginTarafplRecLenNum;
            protected  int beginTarafplRecFrmtCd;
            protected  int beginTarafplBulkFileSzNum;
            protected  int beginTarafplSystemId;
            protected  int beginTarafplAppEndptId;
	
	/**
	* Constructor for TarafplSerialized
	**/
    public TarafplSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TarafplSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TARAFPL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTarafplBulkId = getStartOffset() + 0;	// set offset for serialization
  
             beginTarafplTtlNam = getStartOffset() + 4;	// set offset for serialization
  
             beginTarafplPrtyNum = getStartOffset() + 54;	// set offset for serialization
  
             beginTarafplAlctnSpcTypeCd = getStartOffset() + 56;	// set offset for serialization
  
             beginTarafplAlctnSpcPrimNum = getStartOffset() + 57;	// set offset for serialization
  
             beginTarafplSndRcvPrmsnCd = getStartOffset() + 65;	// set offset for serialization
  
             beginTarafplRecLenNum = getStartOffset() + 66;	// set offset for serialization
  
             beginTarafplRecFrmtCd = getStartOffset() + 71;	// set offset for serialization
  
             beginTarafplBulkFileSzNum = getStartOffset() + 73;	// set offset for serialization
  
             beginTarafplSystemId = getStartOffset() + 166;	// set offset for serialization
  
             beginTarafplAppEndptId = getStartOffset() + 174;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTarafplBulkIdCounter = -1;
     public boolean isTarafplBulkIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafplBulkIdCounter != sharedCounter;
         localTarafplBulkIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFPL_BULK_ID_LEN = 4;
	/**
	 * 	serialize this TarafplBulkId
	 */
   protected void serializeTarafplBulkId(char[] tarafplBulkId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafplBulkId,0,getStringValue(),beginTarafplBulkId,TARAFPL_BULK_ID_LEN);
       localTarafplBulkIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafplBulkIdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshTarafplBulkId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafplBulkId() {	 
   		return (substring(getStringValue(),beginTarafplBulkId,beginTarafplBulkId + TARAFPL_BULK_ID_LEN));
   	}
     int localTarafplTtlNamCounter = -1;
     public boolean isTarafplTtlNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafplTtlNamCounter != sharedCounter;
         localTarafplTtlNamCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFPL_TTL_NAM_LEN = 50;
	/**
	 * 	serialize this TarafplTtlNam
	 */
   protected void serializeTarafplTtlNam(char[] tarafplTtlNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafplTtlNam,0,getStringValue(),beginTarafplTtlNam,TARAFPL_TTL_NAM_LEN);
       localTarafplTtlNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafplTtlNamConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
    /**
	 *	refreshTarafplTtlNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafplTtlNam() {	 
   		return (substring(getStringValue(),beginTarafplTtlNam,beginTarafplTtlNam + TARAFPL_TTL_NAM_LEN));
   	}
        int localTarafplPrtyNumCounter = -1;
        public boolean isTarafplPrtyNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTarafplPrtyNumCounter != sharedCounter;
           localTarafplPrtyNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean tarafplPrtyNumIsNumeric() {
	      return decimalIsNumeric(beginTarafplPrtyNum,TARAFPL_PRTY_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAFPL_PRTY_NUM_LEN = 2;
  	/**
	 * 	serializeTarafplPrtyNum
	 */
	protected void serializeTarafplPrtyNum(short tarafplPrtyNum) {
		   putDecimal(beginTarafplPrtyNum,tarafplPrtyNum,TARAFPL_PRTY_NUM_LEN,true);
   }
   

   protected short checkTarafplPrtyNumMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshTarafplPrtyNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafplPrtyNum() throws CFException {	
   	try { 
		 return (getShortDecimal(beginTarafplPrtyNum,TARAFPL_PRTY_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tarafplPrtyNum", beginTarafplPrtyNum,TARAFPL_PRTY_NUM_LEN);
     }
   	}
     int localTarafplAlctnSpcTypeCdCounter = -1;
     public boolean isTarafplAlctnSpcTypeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafplAlctnSpcTypeCdCounter != sharedCounter;
         localTarafplAlctnSpcTypeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFPL_ALCTN_SPC_TYPE_CD_LEN = 1;
	/**
	 * 	serialize this TarafplAlctnSpcTypeCd
	 */
   protected void serializeTarafplAlctnSpcTypeCd(char[] tarafplAlctnSpcTypeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafplAlctnSpcTypeCd,0,getStringValue(),beginTarafplAlctnSpcTypeCd,TARAFPL_ALCTN_SPC_TYPE_CD_LEN);
       localTarafplAlctnSpcTypeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafplAlctnSpcTypeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTarafplAlctnSpcTypeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafplAlctnSpcTypeCd() {	 
   		return (substring(getStringValue(),beginTarafplAlctnSpcTypeCd,beginTarafplAlctnSpcTypeCd + TARAFPL_ALCTN_SPC_TYPE_CD_LEN));
   	}
        int localTarafplAlctnSpcPrimNumCounter = -1;
        public boolean isTarafplAlctnSpcPrimNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTarafplAlctnSpcPrimNumCounter != sharedCounter;
           localTarafplAlctnSpcPrimNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean tarafplAlctnSpcPrimNumIsNumeric() {
	      return decimalIsNumeric(beginTarafplAlctnSpcPrimNum,TARAFPL_ALCTN_SPC_PRIM_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAFPL_ALCTN_SPC_PRIM_NUM_LEN = 5;
  	/**
	 * 	serializeTarafplAlctnSpcPrimNum
	 */
	protected void serializeTarafplAlctnSpcPrimNum(int tarafplAlctnSpcPrimNum) {
		   putDecimal(beginTarafplAlctnSpcPrimNum,tarafplAlctnSpcPrimNum,TARAFPL_ALCTN_SPC_PRIM_NUM_LEN,true);
   }
   

   protected int checkTarafplAlctnSpcPrimNumMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTarafplAlctnSpcPrimNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTarafplAlctnSpcPrimNum() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTarafplAlctnSpcPrimNum,TARAFPL_ALCTN_SPC_PRIM_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tarafplAlctnSpcPrimNum", beginTarafplAlctnSpcPrimNum,TARAFPL_ALCTN_SPC_PRIM_NUM_LEN);
     }
   	}
     int localTarafplSndRcvPrmsnCdCounter = -1;
     public boolean isTarafplSndRcvPrmsnCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafplSndRcvPrmsnCdCounter != sharedCounter;
         localTarafplSndRcvPrmsnCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFPL_SND_RCV_PRMSN_CD_LEN = 1;
	/**
	 * 	serialize this TarafplSndRcvPrmsnCd
	 */
   protected void serializeTarafplSndRcvPrmsnCd(char[] tarafplSndRcvPrmsnCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafplSndRcvPrmsnCd,0,getStringValue(),beginTarafplSndRcvPrmsnCd,TARAFPL_SND_RCV_PRMSN_CD_LEN);
       localTarafplSndRcvPrmsnCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafplSndRcvPrmsnCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTarafplSndRcvPrmsnCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafplSndRcvPrmsnCd() {	 
   		return (substring(getStringValue(),beginTarafplSndRcvPrmsnCd,beginTarafplSndRcvPrmsnCd + TARAFPL_SND_RCV_PRMSN_CD_LEN));
   	}
        int localTarafplRecLenNumCounter = -1;
        public boolean isTarafplRecLenNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTarafplRecLenNumCounter != sharedCounter;
           localTarafplRecLenNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean tarafplRecLenNumIsNumeric() {
	      return decimalIsNumeric(beginTarafplRecLenNum,TARAFPL_REC_LEN_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAFPL_REC_LEN_NUM_LEN = 5;
  	/**
	 * 	serializeTarafplRecLenNum
	 */
	protected void serializeTarafplRecLenNum(int tarafplRecLenNum) {
		   putDecimal(beginTarafplRecLenNum,tarafplRecLenNum,TARAFPL_REC_LEN_NUM_LEN,true);
   }
   

   protected int checkTarafplRecLenNumMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTarafplRecLenNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTarafplRecLenNum() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTarafplRecLenNum,TARAFPL_REC_LEN_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tarafplRecLenNum", beginTarafplRecLenNum,TARAFPL_REC_LEN_NUM_LEN);
     }
   	}
     int localTarafplRecFrmtCdCounter = -1;
     public boolean isTarafplRecFrmtCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafplRecFrmtCdCounter != sharedCounter;
         localTarafplRecFrmtCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFPL_REC_FRMT_CD_LEN = 2;
	/**
	 * 	serialize this TarafplRecFrmtCd
	 */
   protected void serializeTarafplRecFrmtCd(char[] tarafplRecFrmtCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafplRecFrmtCd,0,getStringValue(),beginTarafplRecFrmtCd,TARAFPL_REC_FRMT_CD_LEN);
       localTarafplRecFrmtCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafplRecFrmtCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTarafplRecFrmtCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafplRecFrmtCd() {	 
   		return (substring(getStringValue(),beginTarafplRecFrmtCd,beginTarafplRecFrmtCd + TARAFPL_REC_FRMT_CD_LEN));
   	}
        int localTarafplBulkFileSzNumCounter = -1;
        public boolean isTarafplBulkFileSzNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTarafplBulkFileSzNumCounter != sharedCounter;
           localTarafplBulkFileSzNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean tarafplBulkFileSzNumIsNumeric() {
	      return decimalIsNumeric(beginTarafplBulkFileSzNum,TARAFPL_BULK_FILE_SZ_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TARAFPL_BULK_FILE_SZ_NUM_LEN = 5;
  	/**
	 * 	serializeTarafplBulkFileSzNum
	 */
	protected void serializeTarafplBulkFileSzNum(int tarafplBulkFileSzNum) {
		   putDecimal(beginTarafplBulkFileSzNum,tarafplBulkFileSzNum,TARAFPL_BULK_FILE_SZ_NUM_LEN,true);
   }
   

   protected int checkTarafplBulkFileSzNumMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTarafplBulkFileSzNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTarafplBulkFileSzNum() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTarafplBulkFileSzNum,TARAFPL_BULK_FILE_SZ_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tarafplBulkFileSzNum", beginTarafplBulkFileSzNum,TARAFPL_BULK_FILE_SZ_NUM_LEN);
     }
   	}
     int localTarafplSystemIdCounter = -1;
     public boolean isTarafplSystemIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafplSystemIdCounter != sharedCounter;
         localTarafplSystemIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFPL_SYSTEM_ID_LEN = 2;
	/**
	 * 	serialize this TarafplSystemId
	 */
   protected void serializeTarafplSystemId(char[] tarafplSystemId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafplSystemId,0,getStringValue(),beginTarafplSystemId,TARAFPL_SYSTEM_ID_LEN);
       localTarafplSystemIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafplSystemIdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTarafplSystemId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafplSystemId() {	 
   		return (substring(getStringValue(),beginTarafplSystemId,beginTarafplSystemId + TARAFPL_SYSTEM_ID_LEN));
   	}
     int localTarafplAppEndptIdCounter = -1;
     public boolean isTarafplAppEndptIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafplAppEndptIdCounter != sharedCounter;
         localTarafplAppEndptIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFPL_APP_ENDPT_ID_LEN = 7;
	/**
	 * 	serialize this TarafplAppEndptId
	 */
   protected void serializeTarafplAppEndptId(char[] tarafplAppEndptId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafplAppEndptId,0,getStringValue(),beginTarafplAppEndptId,TARAFPL_APP_ENDPT_ID_LEN);
       localTarafplAppEndptIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafplAppEndptIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTarafplAppEndptId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafplAppEndptId() {	 
   		return (substring(getStringValue(),beginTarafplAppEndptId,beginTarafplAppEndptId + TARAFPL_APP_ENDPT_ID_LEN));
   	}




}
  

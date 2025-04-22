package com.cloudframe.app.vsammon9.file.records.serialize;

/**
*  The class MonitorRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class MonitorRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MonitorRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MONITOR_RECORD_LENGTH = 281;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMonXctorSysId;
            protected  int beginMonXctorTranId;
            protected  int beginMonXcaorSysId;
            protected  int beginMonXcaorTskNo;
            protected  int beginMonXcdtPgmTyCd;
            protected  int beginMonXcdtReqrIpAd;
            protected  int beginMonXcdtTskAorTm;
            protected  int beginMonXcdtTskElpsTm;
            protected  int beginMonXcdtTskCmpCd;
            protected  int beginMonXcdtTskAbndCd;
            protected  int beginMonXcdtReqSz;
            protected  int beginMonXcdtRespSz;
            protected  int beginMonUsertoken;
	
	/**
	* Constructor for MonitorRecordSerialized
	**/
    public MonitorRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MonitorRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MONITOR_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginMonXctorSysId = getStartOffset() + 65;	// set offset for serialization
  
             beginMonXctorTranId = getStartOffset() + 69;	// set offset for serialization
  
             beginMonXcaorSysId = getStartOffset() + 73;	// set offset for serialization
  
             beginMonXcaorTskNo = getStartOffset() + 77;	// set offset for serialization
  
             beginMonXcdtPgmTyCd = getStartOffset() + 81;	// set offset for serialization
  
             beginMonXcdtReqrIpAd = getStartOffset() + 116;	// set offset for serialization
  
             beginMonXcdtTskAorTm = getStartOffset() + 131;	// set offset for serialization
  
             beginMonXcdtTskElpsTm = getStartOffset() + 135;	// set offset for serialization
  
             beginMonXcdtTskCmpCd = getStartOffset() + 139;	// set offset for serialization
  
             beginMonXcdtTskAbndCd = getStartOffset() + 141;	// set offset for serialization
  
             beginMonXcdtReqSz = getStartOffset() + 145;	// set offset for serialization
  
             beginMonXcdtRespSz = getStartOffset() + 149;	// set offset for serialization
  
             beginMonUsertoken = getStartOffset() + 153;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMonXctorSysIdCounter = -1;
     public boolean isMonXctorSysIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonXctorSysIdCounter != sharedCounter;
         localMonXctorSysIdCounter = sharedCounter; return hasModified;
     }
	protected static final int MON_XCTOR_SYS_ID_LEN = 4;
	/**
	 * 	serialize this MonXctorSysId
	 */
   protected void serializeMonXctorSysId(char[] monXctorSysId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(monXctorSysId,0,getStringValue(),beginMonXctorSysId,MON_XCTOR_SYS_ID_LEN);
       localMonXctorSysIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMonXctorSysIdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshMonXctorSysId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMonXctorSysId() {	 
   		return (substring(getStringValue(),beginMonXctorSysId,beginMonXctorSysId + MON_XCTOR_SYS_ID_LEN));
   	}
     int localMonXctorTranIdCounter = -1;
     public boolean isMonXctorTranIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonXctorTranIdCounter != sharedCounter;
         localMonXctorTranIdCounter = sharedCounter; return hasModified;
     }
	protected static final int MON_XCTOR_TRAN_ID_LEN = 4;
	/**
	 * 	serialize this MonXctorTranId
	 */
   protected void serializeMonXctorTranId(char[] monXctorTranId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(monXctorTranId,0,getStringValue(),beginMonXctorTranId,MON_XCTOR_TRAN_ID_LEN);
       localMonXctorTranIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMonXctorTranIdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshMonXctorTranId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMonXctorTranId() {	 
   		return (substring(getStringValue(),beginMonXctorTranId,beginMonXctorTranId + MON_XCTOR_TRAN_ID_LEN));
   	}
     int localMonXcaorSysIdCounter = -1;
     public boolean isMonXcaorSysIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonXcaorSysIdCounter != sharedCounter;
         localMonXcaorSysIdCounter = sharedCounter; return hasModified;
     }
	protected static final int MON_XCAOR_SYS_ID_LEN = 4;
	/**
	 * 	serialize this MonXcaorSysId
	 */
   protected void serializeMonXcaorSysId(char[] monXcaorSysId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(monXcaorSysId,0,getStringValue(),beginMonXcaorSysId,MON_XCAOR_SYS_ID_LEN);
       localMonXcaorSysIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMonXcaorSysIdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshMonXcaorSysId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMonXcaorSysId() {	 
   		return (substring(getStringValue(),beginMonXcaorSysId,beginMonXcaorSysId + MON_XCAOR_SYS_ID_LEN));
   	}
        int localMonXcaorTskNoCounter = -1;
        public boolean isMonXcaorTskNoModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localMonXcaorTskNoCounter != sharedCounter;
           localMonXcaorTskNoCounter = sharedCounter; return hasModified; 
        }
	    public boolean monXcaorTskNoIsNumeric() {
	      return decimalIsNumeric(beginMonXcaorTskNo,MON_XCAOR_TSK_NO_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int MON_XCAOR_TSK_NO_LEN = 4;
  	/**
	 * 	serializeMonXcaorTskNo
	 */
	protected void serializeMonXcaorTskNo(int monXcaorTskNo) {
		   putDecimal(beginMonXcaorTskNo,monXcaorTskNo,MON_XCAOR_TSK_NO_LEN,true);
   }
   

   protected int checkMonXcaorTskNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshMonXcaorTskNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMonXcaorTskNo() throws CFException {	
   	try { 
		 return (getIntDecimal(beginMonXcaorTskNo,MON_XCAOR_TSK_NO_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("monXcaorTskNo", beginMonXcaorTskNo,MON_XCAOR_TSK_NO_LEN);
     }
   	}
     int localMonXcdtPgmTyCdCounter = -1;
     public boolean isMonXcdtPgmTyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonXcdtPgmTyCdCounter != sharedCounter;
         localMonXcdtPgmTyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int MON_XCDT_PGM_TY_CD_LEN = 35;
	/**
	 * 	serialize this MonXcdtPgmTyCd
	 */
   protected void serializeMonXcdtPgmTyCd(char[] monXcdtPgmTyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(monXcdtPgmTyCd,0,getStringValue(),beginMonXcdtPgmTyCd,MON_XCDT_PGM_TY_CD_LEN);
       localMonXcdtPgmTyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMonXcdtPgmTyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
   }
    /**
	 *	refreshMonXcdtPgmTyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMonXcdtPgmTyCd() {	 
   		return (substring(getStringValue(),beginMonXcdtPgmTyCd,beginMonXcdtPgmTyCd + MON_XCDT_PGM_TY_CD_LEN));
   	}
     int localMonXcdtReqrIpAdCounter = -1;
     public boolean isMonXcdtReqrIpAdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonXcdtReqrIpAdCounter != sharedCounter;
         localMonXcdtReqrIpAdCounter = sharedCounter; return hasModified;
     }
	protected static final int MON_XCDT_REQR_IP_AD_LEN = 15;
	/**
	 * 	serialize this MonXcdtReqrIpAd
	 */
   protected void serializeMonXcdtReqrIpAd(char[] monXcdtReqrIpAd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(monXcdtReqrIpAd,0,getStringValue(),beginMonXcdtReqrIpAd,MON_XCDT_REQR_IP_AD_LEN);
       localMonXcdtReqrIpAdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMonXcdtReqrIpAdConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshMonXcdtReqrIpAd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMonXcdtReqrIpAd() {	 
   		return (substring(getStringValue(),beginMonXcdtReqrIpAd,beginMonXcdtReqrIpAd + MON_XCDT_REQR_IP_AD_LEN));
   	}
         int localMonXcdtTskAorTmCounter = -1;
         public boolean isMonXcdtTskAorTmModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMonXcdtTskAorTmCounter != sharedCounter;
            localMonXcdtTskAorTmCounter = sharedCounter; return hasModified; 
         }
   protected static final int MON_XCDT_TSK_AOR_TM_LEN = 4;
  	/**
	 * serializeMonXcdtTskAorTm
	 */
	protected void serializeMonXcdtTskAorTm(int monXcdtTskAorTm) {
           replaceValue( //  save the value as string
                   getBinaryString( monXcdtTskAorTm,MON_XCDT_TSK_AOR_TM_LEN)
                  ,beginMonXcdtTskAorTm
                  ,MON_XCDT_TSK_AOR_TM_LEN
                 );
            localMonXcdtTskAorTmCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMonXcdtTskAorTmMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMonXcdtTskAorTm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMonXcdtTskAorTm() {	 
			return (getInt(beginMonXcdtTskAorTm));
   	}
         int localMonXcdtTskElpsTmCounter = -1;
         public boolean isMonXcdtTskElpsTmModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMonXcdtTskElpsTmCounter != sharedCounter;
            localMonXcdtTskElpsTmCounter = sharedCounter; return hasModified; 
         }
   protected static final int MON_XCDT_TSK_ELPS_TM_LEN = 4;
  	/**
	 * serializeMonXcdtTskElpsTm
	 */
	protected void serializeMonXcdtTskElpsTm(int monXcdtTskElpsTm) {
           replaceValue( //  save the value as string
                   getBinaryString( monXcdtTskElpsTm,MON_XCDT_TSK_ELPS_TM_LEN)
                  ,beginMonXcdtTskElpsTm
                  ,MON_XCDT_TSK_ELPS_TM_LEN
                 );
            localMonXcdtTskElpsTmCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMonXcdtTskElpsTmMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMonXcdtTskElpsTm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMonXcdtTskElpsTm() {	 
			return (getInt(beginMonXcdtTskElpsTm));
   	}
         int localMonXcdtTskCmpCdCounter = -1;
         public boolean isMonXcdtTskCmpCdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMonXcdtTskCmpCdCounter != sharedCounter;
            localMonXcdtTskCmpCdCounter = sharedCounter; return hasModified; 
         }
   protected static final int MON_XCDT_TSK_CMP_CD_LEN = 2;
  	/**
	 * serializeMonXcdtTskCmpCd
	 */
	protected void serializeMonXcdtTskCmpCd(short monXcdtTskCmpCd) {
           replaceValue( //  save the value as string
                   getBinaryString( monXcdtTskCmpCd,MON_XCDT_TSK_CMP_CD_LEN)
                  ,beginMonXcdtTskCmpCd
                  ,MON_XCDT_TSK_CMP_CD_LEN
                 );
            localMonXcdtTskCmpCdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkMonXcdtTskCmpCdMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshMonXcdtTskCmpCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMonXcdtTskCmpCd() {	 
			return (getShort(beginMonXcdtTskCmpCd));
   	}
     int localMonXcdtTskAbndCdCounter = -1;
     public boolean isMonXcdtTskAbndCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonXcdtTskAbndCdCounter != sharedCounter;
         localMonXcdtTskAbndCdCounter = sharedCounter; return hasModified;
     }
	protected static final int MON_XCDT_TSK_ABND_CD_LEN = 4;
	/**
	 * 	serialize this MonXcdtTskAbndCd
	 */
   protected void serializeMonXcdtTskAbndCd(char[] monXcdtTskAbndCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(monXcdtTskAbndCd,0,getStringValue(),beginMonXcdtTskAbndCd,MON_XCDT_TSK_ABND_CD_LEN);
       localMonXcdtTskAbndCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMonXcdtTskAbndCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshMonXcdtTskAbndCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMonXcdtTskAbndCd() {	 
   		return (substring(getStringValue(),beginMonXcdtTskAbndCd,beginMonXcdtTskAbndCd + MON_XCDT_TSK_ABND_CD_LEN));
   	}
         int localMonXcdtReqSzCounter = -1;
         public boolean isMonXcdtReqSzModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMonXcdtReqSzCounter != sharedCounter;
            localMonXcdtReqSzCounter = sharedCounter; return hasModified; 
         }
   protected static final int MON_XCDT_REQ_SZ_LEN = 4;
  	/**
	 * serializeMonXcdtReqSz
	 */
	protected void serializeMonXcdtReqSz(int monXcdtReqSz) {
           replaceValue( //  save the value as string
                   getBinaryString( monXcdtReqSz,MON_XCDT_REQ_SZ_LEN)
                  ,beginMonXcdtReqSz
                  ,MON_XCDT_REQ_SZ_LEN
                 );
            localMonXcdtReqSzCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMonXcdtReqSzMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMonXcdtReqSz is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMonXcdtReqSz() {	 
			return (getInt(beginMonXcdtReqSz));
   	}
         int localMonXcdtRespSzCounter = -1;
         public boolean isMonXcdtRespSzModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMonXcdtRespSzCounter != sharedCounter;
            localMonXcdtRespSzCounter = sharedCounter; return hasModified; 
         }
   protected static final int MON_XCDT_RESP_SZ_LEN = 4;
  	/**
	 * serializeMonXcdtRespSz
	 */
	protected void serializeMonXcdtRespSz(int monXcdtRespSz) {
           replaceValue( //  save the value as string
                   getBinaryString( monXcdtRespSz,MON_XCDT_RESP_SZ_LEN)
                  ,beginMonXcdtRespSz
                  ,MON_XCDT_RESP_SZ_LEN
                 );
            localMonXcdtRespSzCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMonXcdtRespSzMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMonXcdtRespSz is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMonXcdtRespSz() {	 
			return (getInt(beginMonXcdtRespSz));
   	}
     int localMonUsertokenCounter = -1;
     public boolean isMonUsertokenModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonUsertokenCounter != sharedCounter;
         localMonUsertokenCounter = sharedCounter; return hasModified;
     }
	protected static final int MON_USERTOKEN_LEN = 128;
	/**
	 * 	serialize this MonUsertoken
	 */
   protected void serializeMonUsertoken(char[] monUsertoken) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(monUsertoken,0,getStringValue(),beginMonUsertoken,MON_USERTOKEN_LEN);
       localMonUsertokenCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMonUsertokenConstraints(char[] value) {
   			return super.checkConstraints(value , 128 ,false, false);
   }
    /**
	 *	refreshMonUsertoken is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMonUsertoken() {	 
   		return (substring(getStringValue(),beginMonUsertoken,beginMonUsertoken + MON_USERTOKEN_LEN));
   	}




}
  

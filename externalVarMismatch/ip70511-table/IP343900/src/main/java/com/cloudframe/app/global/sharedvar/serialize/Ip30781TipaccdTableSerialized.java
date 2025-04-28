package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip30781TipaccdTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Ip30781TipaccdTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip30781TipaccdTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_30781_TIPACCD_TABLE_LENGTH = 74;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp30781ClrCyclId;
            protected  int beginIp30781EffTs;
            protected  int beginIp30781ClrCyclDt;
            protected  int beginIp30781ClrCyclTm;
            protected  int beginIp30781RecStatCd;
            protected  int beginIp30781UtcDt;
            protected  int beginIp30781UtcTm;
            protected  int beginIp30781ClrCyclRpmSw;
            protected  int beginIp30781ClrCyclRpmNum;
            protected  int beginIp30781DfltDlvryCyclSw;
            protected  int beginIp30781MqRespCd;
            protected  int beginIp30781OvrdeTmoutSw;
	
	/**
	* Constructor for Ip30781TipaccdTableSerialized
	**/
    public Ip30781TipaccdTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip30781TipaccdTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_30781_TIPACCD_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp30781ClrCyclId = getStartOffset() + 0;	// set offset for serialization
  
             beginIp30781EffTs = getStartOffset() + 2;	// set offset for serialization
  
             beginIp30781ClrCyclDt = getStartOffset() + 28;	// set offset for serialization
  
             beginIp30781ClrCyclTm = getStartOffset() + 38;	// set offset for serialization
  
             beginIp30781RecStatCd = getStartOffset() + 46;	// set offset for serialization
  
             beginIp30781UtcDt = getStartOffset() + 47;	// set offset for serialization
  
             beginIp30781UtcTm = getStartOffset() + 57;	// set offset for serialization
  
             beginIp30781ClrCyclRpmSw = getStartOffset() + 65;	// set offset for serialization
  
             beginIp30781ClrCyclRpmNum = getStartOffset() + 66;	// set offset for serialization
  
             beginIp30781DfltDlvryCyclSw = getStartOffset() + 71;	// set offset for serialization
  
             beginIp30781MqRespCd = getStartOffset() + 72;	// set offset for serialization
  
             beginIp30781OvrdeTmoutSw = getStartOffset() + 73;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localIp30781ClrCyclIdCounter = -1;
        public boolean isIp30781ClrCyclIdModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localIp30781ClrCyclIdCounter != sharedCounter;
           localIp30781ClrCyclIdCounter = sharedCounter; return hasModified; 
        }
	    public boolean ip30781ClrCyclIdIsNumeric() {
	      return decimalIsNumeric(beginIp30781ClrCyclId,IP_30781_CLR_CYCL_ID_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int IP_30781_CLR_CYCL_ID_LEN = 2;
  	/**
	 * 	serializeIp30781ClrCyclId
	 */
	protected void serializeIp30781ClrCyclId(short ip30781ClrCyclId) {
		   putDecimal(beginIp30781ClrCyclId,ip30781ClrCyclId,IP_30781_CLR_CYCL_ID_LEN,true);
   }
   

   protected short checkIp30781ClrCyclIdMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshIp30781ClrCyclId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp30781ClrCyclId() throws CFException {	
   	try { 
		 return (getShortDecimal(beginIp30781ClrCyclId,IP_30781_CLR_CYCL_ID_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ip30781ClrCyclId", beginIp30781ClrCyclId,IP_30781_CLR_CYCL_ID_LEN);
     }
   	}
     int localIp30781EffTsCounter = -1;
     public boolean isIp30781EffTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp30781EffTsCounter != sharedCounter;
         localIp30781EffTsCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_30781_EFF_TS_LEN = 26;
	/**
	 * 	serialize this Ip30781EffTs
	 */
   protected void serializeIp30781EffTs(char[] ip30781EffTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip30781EffTs,0,getStringValue(),beginIp30781EffTs,IP_30781_EFF_TS_LEN);
       localIp30781EffTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp30781EffTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshIp30781EffTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp30781EffTs() {	 
   		return (substring(getStringValue(),beginIp30781EffTs,beginIp30781EffTs + IP_30781_EFF_TS_LEN));
   	}
     int localIp30781ClrCyclDtCounter = -1;
     public boolean isIp30781ClrCyclDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp30781ClrCyclDtCounter != sharedCounter;
         localIp30781ClrCyclDtCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_30781_CLR_CYCL_DT_LEN = 10;
	/**
	 * 	serialize this Ip30781ClrCyclDt
	 */
   protected void serializeIp30781ClrCyclDt(char[] ip30781ClrCyclDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip30781ClrCyclDt,0,getStringValue(),beginIp30781ClrCyclDt,IP_30781_CLR_CYCL_DT_LEN);
       localIp30781ClrCyclDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp30781ClrCyclDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshIp30781ClrCyclDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp30781ClrCyclDt() {	 
   		return (substring(getStringValue(),beginIp30781ClrCyclDt,beginIp30781ClrCyclDt + IP_30781_CLR_CYCL_DT_LEN));
   	}
     int localIp30781ClrCyclTmCounter = -1;
     public boolean isIp30781ClrCyclTmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp30781ClrCyclTmCounter != sharedCounter;
         localIp30781ClrCyclTmCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_30781_CLR_CYCL_TM_LEN = 8;
	/**
	 * 	serialize this Ip30781ClrCyclTm
	 */
   protected void serializeIp30781ClrCyclTm(char[] ip30781ClrCyclTm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip30781ClrCyclTm,0,getStringValue(),beginIp30781ClrCyclTm,IP_30781_CLR_CYCL_TM_LEN);
       localIp30781ClrCyclTmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp30781ClrCyclTmConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp30781ClrCyclTm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp30781ClrCyclTm() {	 
   		return (substring(getStringValue(),beginIp30781ClrCyclTm,beginIp30781ClrCyclTm + IP_30781_CLR_CYCL_TM_LEN));
   	}
     int localIp30781RecStatCdCounter = -1;
     public boolean isIp30781RecStatCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp30781RecStatCdCounter != sharedCounter;
         localIp30781RecStatCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_30781_REC_STAT_CD_LEN = 1;
	/**
	 * 	serialize this Ip30781RecStatCd
	 */
   protected void serializeIp30781RecStatCd(char[] ip30781RecStatCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip30781RecStatCd,0,getStringValue(),beginIp30781RecStatCd,IP_30781_REC_STAT_CD_LEN);
       localIp30781RecStatCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp30781RecStatCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp30781RecStatCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp30781RecStatCd() {	 
   		return (substring(getStringValue(),beginIp30781RecStatCd,beginIp30781RecStatCd + IP_30781_REC_STAT_CD_LEN));
   	}
     int localIp30781UtcDtCounter = -1;
     public boolean isIp30781UtcDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp30781UtcDtCounter != sharedCounter;
         localIp30781UtcDtCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_30781_UTC_DT_LEN = 10;
	/**
	 * 	serialize this Ip30781UtcDt
	 */
   protected void serializeIp30781UtcDt(char[] ip30781UtcDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip30781UtcDt,0,getStringValue(),beginIp30781UtcDt,IP_30781_UTC_DT_LEN);
       localIp30781UtcDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp30781UtcDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshIp30781UtcDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp30781UtcDt() {	 
   		return (substring(getStringValue(),beginIp30781UtcDt,beginIp30781UtcDt + IP_30781_UTC_DT_LEN));
   	}
     int localIp30781UtcTmCounter = -1;
     public boolean isIp30781UtcTmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp30781UtcTmCounter != sharedCounter;
         localIp30781UtcTmCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_30781_UTC_TM_LEN = 8;
	/**
	 * 	serialize this Ip30781UtcTm
	 */
   protected void serializeIp30781UtcTm(char[] ip30781UtcTm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip30781UtcTm,0,getStringValue(),beginIp30781UtcTm,IP_30781_UTC_TM_LEN);
       localIp30781UtcTmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp30781UtcTmConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp30781UtcTm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp30781UtcTm() {	 
   		return (substring(getStringValue(),beginIp30781UtcTm,beginIp30781UtcTm + IP_30781_UTC_TM_LEN));
   	}
     int localIp30781ClrCyclRpmSwCounter = -1;
     public boolean isIp30781ClrCyclRpmSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp30781ClrCyclRpmSwCounter != sharedCounter;
         localIp30781ClrCyclRpmSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_30781_CLR_CYCL_RPM_SW_LEN = 1;
	/**
	 * 	serialize this Ip30781ClrCyclRpmSw
	 */
   protected void serializeIp30781ClrCyclRpmSw(char[] ip30781ClrCyclRpmSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip30781ClrCyclRpmSw,0,getStringValue(),beginIp30781ClrCyclRpmSw,IP_30781_CLR_CYCL_RPM_SW_LEN);
       localIp30781ClrCyclRpmSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp30781ClrCyclRpmSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp30781ClrCyclRpmSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp30781ClrCyclRpmSw() {	 
   		return (substring(getStringValue(),beginIp30781ClrCyclRpmSw,beginIp30781ClrCyclRpmSw + IP_30781_CLR_CYCL_RPM_SW_LEN));
   	}
        int localIp30781ClrCyclRpmNumCounter = -1;
        public boolean isIp30781ClrCyclRpmNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localIp30781ClrCyclRpmNumCounter != sharedCounter;
           localIp30781ClrCyclRpmNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean ip30781ClrCyclRpmNumIsNumeric() {
	      return decimalIsNumeric(beginIp30781ClrCyclRpmNum,IP_30781_CLR_CYCL_RPM_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int IP_30781_CLR_CYCL_RPM_NUM_LEN = 5;
  	/**
	 * 	serializeIp30781ClrCyclRpmNum
	 */
	protected void serializeIp30781ClrCyclRpmNum(int ip30781ClrCyclRpmNum) {
		   putDecimal(beginIp30781ClrCyclRpmNum,ip30781ClrCyclRpmNum,IP_30781_CLR_CYCL_RPM_NUM_LEN,true);
   }
   

   protected int checkIp30781ClrCyclRpmNumMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshIp30781ClrCyclRpmNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp30781ClrCyclRpmNum() throws CFException {	
   	try { 
		 return (getIntDecimal(beginIp30781ClrCyclRpmNum,IP_30781_CLR_CYCL_RPM_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ip30781ClrCyclRpmNum", beginIp30781ClrCyclRpmNum,IP_30781_CLR_CYCL_RPM_NUM_LEN);
     }
   	}
     int localIp30781DfltDlvryCyclSwCounter = -1;
     public boolean isIp30781DfltDlvryCyclSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp30781DfltDlvryCyclSwCounter != sharedCounter;
         localIp30781DfltDlvryCyclSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_30781_DFLT_DLVRY_CYCL_SW_LEN = 1;
	/**
	 * 	serialize this Ip30781DfltDlvryCyclSw
	 */
   protected void serializeIp30781DfltDlvryCyclSw(char[] ip30781DfltDlvryCyclSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip30781DfltDlvryCyclSw,0,getStringValue(),beginIp30781DfltDlvryCyclSw,IP_30781_DFLT_DLVRY_CYCL_SW_LEN);
       localIp30781DfltDlvryCyclSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp30781DfltDlvryCyclSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp30781DfltDlvryCyclSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp30781DfltDlvryCyclSw() {	 
   		return (substring(getStringValue(),beginIp30781DfltDlvryCyclSw,beginIp30781DfltDlvryCyclSw + IP_30781_DFLT_DLVRY_CYCL_SW_LEN));
   	}
     int localIp30781MqRespCdCounter = -1;
     public boolean isIp30781MqRespCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp30781MqRespCdCounter != sharedCounter;
         localIp30781MqRespCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_30781_MQ_RESP_CD_LEN = 1;
	/**
	 * 	serialize this Ip30781MqRespCd
	 */
   protected void serializeIp30781MqRespCd(char[] ip30781MqRespCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip30781MqRespCd,0,getStringValue(),beginIp30781MqRespCd,IP_30781_MQ_RESP_CD_LEN);
       localIp30781MqRespCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp30781MqRespCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp30781MqRespCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp30781MqRespCd() {	 
   		return (substring(getStringValue(),beginIp30781MqRespCd,beginIp30781MqRespCd + IP_30781_MQ_RESP_CD_LEN));
   	}
     int localIp30781OvrdeTmoutSwCounter = -1;
     public boolean isIp30781OvrdeTmoutSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp30781OvrdeTmoutSwCounter != sharedCounter;
         localIp30781OvrdeTmoutSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_30781_OVRDE_TMOUT_SW_LEN = 1;
	/**
	 * 	serialize this Ip30781OvrdeTmoutSw
	 */
   protected void serializeIp30781OvrdeTmoutSw(char[] ip30781OvrdeTmoutSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip30781OvrdeTmoutSw,0,getStringValue(),beginIp30781OvrdeTmoutSw,IP_30781_OVRDE_TMOUT_SW_LEN);
       localIp30781OvrdeTmoutSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp30781OvrdeTmoutSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp30781OvrdeTmoutSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp30781OvrdeTmoutSw() {	 
   		return (substring(getStringValue(),beginIp30781OvrdeTmoutSw,beginIp30781OvrdeTmoutSw + IP_30781_OVRDE_TMOUT_SW_LEN));
   	}




}
  

package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip58041TipapmaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Ip58041TipapmaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip58041TipapmaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_58041_TIPAPMA_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp58041VirtualAccountNbr;
            protected  int beginIp58041PrimAccountNbr;
            protected  int beginIp58041ActionCode;
            protected  int beginIp58041ObsAccessTs;
            protected  int beginIp58041ObsAccessTsN;
            protected  int beginIp58041EntRsnCd;
            protected  int beginIp58041StatCd;
            protected  int beginIp58041TokenTypeCd;
            protected  int beginIp58041PartnId;
            protected  int beginIp58041Trid;
            protected  int beginIp58041TridN;
            protected  int beginIp58041TokenAsrLvlNum;
            protected  int beginIp58041TokenAsrLvlNumN;
            protected  int beginIp58041Wid;
            protected  int beginIp58041WidN;
            protected  int beginIp58041PrimAcctSeqNum;
            protected  int beginIp58041PrimAcctSeqNumN;
            protected  int beginIp58041PrcssngAgrmntId;
            protected  int beginIp58041MqSentSw;
	
	/**
	* Constructor for Ip58041TipapmaSerialized
	**/
    public Ip58041TipapmaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip58041TipapmaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_58041_TIPAPMA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp58041VirtualAccountNbr = getStartOffset() + 0;	// set offset for serialization
  
  
             beginIp58041PrimAccountNbr = getStartOffset() + 45;	// set offset for serialization
  
             beginIp58041ActionCode = getStartOffset() + 64;	// set offset for serialization
  
             beginIp58041ObsAccessTs = getStartOffset() + 65;	// set offset for serialization
  
             beginIp58041ObsAccessTsN = getStartOffset() + 91;	// set offset for serialization
  
             beginIp58041EntRsnCd = getStartOffset() + 93;	// set offset for serialization
  
             beginIp58041StatCd = getStartOffset() + 94;	// set offset for serialization
  
             beginIp58041TokenTypeCd = getStartOffset() + 95;	// set offset for serialization
  
             beginIp58041PartnId = getStartOffset() + 96;	// set offset for serialization
  
             beginIp58041Trid = getStartOffset() + 99;	// set offset for serialization
  
             beginIp58041TridN = getStartOffset() + 105;	// set offset for serialization
  
             beginIp58041TokenAsrLvlNum = getStartOffset() + 107;	// set offset for serialization
  
             beginIp58041TokenAsrLvlNumN = getStartOffset() + 109;	// set offset for serialization
  
             beginIp58041Wid = getStartOffset() + 111;	// set offset for serialization
  
             beginIp58041WidN = getStartOffset() + 114;	// set offset for serialization
  
             beginIp58041PrimAcctSeqNum = getStartOffset() + 116;	// set offset for serialization
  
             beginIp58041PrimAcctSeqNumN = getStartOffset() + 119;	// set offset for serialization
  
             beginIp58041PrcssngAgrmntId = getStartOffset() + 121;	// set offset for serialization
  
             beginIp58041MqSentSw = getStartOffset() + 132;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp58041VirtualAccountNbrCounter = -1;
     public boolean isIp58041VirtualAccountNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp58041VirtualAccountNbrCounter != sharedCounter;
         localIp58041VirtualAccountNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_58041_VIRTUAL_ACCOUNT_NBR_LEN = 19;
	/**
	 * 	serialize this Ip58041VirtualAccountNbr
	 */
   protected void serializeIp58041VirtualAccountNbr(char[] ip58041VirtualAccountNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip58041VirtualAccountNbr,0,getStringValue(),beginIp58041VirtualAccountNbr,IP_58041_VIRTUAL_ACCOUNT_NBR_LEN);
       localIp58041VirtualAccountNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp58041VirtualAccountNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshIp58041VirtualAccountNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp58041VirtualAccountNbr() {	 
   		return (substring(getStringValue(),beginIp58041VirtualAccountNbr,beginIp58041VirtualAccountNbr + IP_58041_VIRTUAL_ACCOUNT_NBR_LEN));
   	}
     int localIp58041PrimAccountNbrCounter = -1;
     public boolean isIp58041PrimAccountNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp58041PrimAccountNbrCounter != sharedCounter;
         localIp58041PrimAccountNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_58041_PRIM_ACCOUNT_NBR_LEN = 19;
	/**
	 * 	serialize this Ip58041PrimAccountNbr
	 */
   protected void serializeIp58041PrimAccountNbr(char[] ip58041PrimAccountNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip58041PrimAccountNbr,0,getStringValue(),beginIp58041PrimAccountNbr,IP_58041_PRIM_ACCOUNT_NBR_LEN);
       localIp58041PrimAccountNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp58041PrimAccountNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshIp58041PrimAccountNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp58041PrimAccountNbr() {	 
   		return (substring(getStringValue(),beginIp58041PrimAccountNbr,beginIp58041PrimAccountNbr + IP_58041_PRIM_ACCOUNT_NBR_LEN));
   	}
     int localIp58041ActionCodeCounter = -1;
     public boolean isIp58041ActionCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp58041ActionCodeCounter != sharedCounter;
         localIp58041ActionCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_58041_ACTION_CODE_LEN = 1;
	/**
	 * 	serialize this Ip58041ActionCode
	 */
   protected void serializeIp58041ActionCode(char[] ip58041ActionCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip58041ActionCode,0,getStringValue(),beginIp58041ActionCode,IP_58041_ACTION_CODE_LEN);
       localIp58041ActionCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp58041ActionCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp58041ActionCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp58041ActionCode() {	 
   		return (substring(getStringValue(),beginIp58041ActionCode,beginIp58041ActionCode + IP_58041_ACTION_CODE_LEN));
   	}
     int localIp58041ObsAccessTsCounter = -1;
     public boolean isIp58041ObsAccessTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp58041ObsAccessTsCounter != sharedCounter;
         localIp58041ObsAccessTsCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_58041_OBS_ACCESS_TS_LEN = 26;
	/**
	 * 	serialize this Ip58041ObsAccessTs
	 */
   protected void serializeIp58041ObsAccessTs(char[] ip58041ObsAccessTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip58041ObsAccessTs,0,getStringValue(),beginIp58041ObsAccessTs,IP_58041_OBS_ACCESS_TS_LEN);
       localIp58041ObsAccessTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp58041ObsAccessTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshIp58041ObsAccessTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp58041ObsAccessTs() {	 
   		return (substring(getStringValue(),beginIp58041ObsAccessTs,beginIp58041ObsAccessTs + IP_58041_OBS_ACCESS_TS_LEN));
   	}
         int localIp58041ObsAccessTsNCounter = -1;
         public boolean isIp58041ObsAccessTsNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp58041ObsAccessTsNCounter != sharedCounter;
            localIp58041ObsAccessTsNCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_58041_OBS_ACCESS_TS_N_LEN = 2;
  	/**
	 * serializeIp58041ObsAccessTsN
	 */
	protected void serializeIp58041ObsAccessTsN(short ip58041ObsAccessTsN) {
           replaceValue( //  save the value as string
                   getBinaryString( ip58041ObsAccessTsN,IP_58041_OBS_ACCESS_TS_N_LEN)
                  ,beginIp58041ObsAccessTsN
                  ,IP_58041_OBS_ACCESS_TS_N_LEN
                 );
            localIp58041ObsAccessTsNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp58041ObsAccessTsNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp58041ObsAccessTsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp58041ObsAccessTsN() {	 
			return (getShort(beginIp58041ObsAccessTsN));
   	}
     int localIp58041EntRsnCdCounter = -1;
     public boolean isIp58041EntRsnCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp58041EntRsnCdCounter != sharedCounter;
         localIp58041EntRsnCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_58041_ENT_RSN_CD_LEN = 1;
	/**
	 * 	serialize this Ip58041EntRsnCd
	 */
   protected void serializeIp58041EntRsnCd(char[] ip58041EntRsnCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip58041EntRsnCd,0,getStringValue(),beginIp58041EntRsnCd,IP_58041_ENT_RSN_CD_LEN);
       localIp58041EntRsnCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp58041EntRsnCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp58041EntRsnCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp58041EntRsnCd() {	 
   		return (substring(getStringValue(),beginIp58041EntRsnCd,beginIp58041EntRsnCd + IP_58041_ENT_RSN_CD_LEN));
   	}
     int localIp58041StatCdCounter = -1;
     public boolean isIp58041StatCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp58041StatCdCounter != sharedCounter;
         localIp58041StatCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_58041_STAT_CD_LEN = 1;
	/**
	 * 	serialize this Ip58041StatCd
	 */
   protected void serializeIp58041StatCd(char[] ip58041StatCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip58041StatCd,0,getStringValue(),beginIp58041StatCd,IP_58041_STAT_CD_LEN);
       localIp58041StatCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp58041StatCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp58041StatCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp58041StatCd() {	 
   		return (substring(getStringValue(),beginIp58041StatCd,beginIp58041StatCd + IP_58041_STAT_CD_LEN));
   	}
     int localIp58041TokenTypeCdCounter = -1;
     public boolean isIp58041TokenTypeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp58041TokenTypeCdCounter != sharedCounter;
         localIp58041TokenTypeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_58041_TOKEN_TYPE_CD_LEN = 1;
	/**
	 * 	serialize this Ip58041TokenTypeCd
	 */
   protected void serializeIp58041TokenTypeCd(char[] ip58041TokenTypeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip58041TokenTypeCd,0,getStringValue(),beginIp58041TokenTypeCd,IP_58041_TOKEN_TYPE_CD_LEN);
       localIp58041TokenTypeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp58041TokenTypeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp58041TokenTypeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp58041TokenTypeCd() {	 
   		return (substring(getStringValue(),beginIp58041TokenTypeCd,beginIp58041TokenTypeCd + IP_58041_TOKEN_TYPE_CD_LEN));
   	}
     int localIp58041PartnIdCounter = -1;
     public boolean isIp58041PartnIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp58041PartnIdCounter != sharedCounter;
         localIp58041PartnIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_58041_PARTN_ID_LEN = 3;
	/**
	 * 	serialize this Ip58041PartnId
	 */
   protected void serializeIp58041PartnId(char[] ip58041PartnId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip58041PartnId,0,getStringValue(),beginIp58041PartnId,IP_58041_PARTN_ID_LEN);
       localIp58041PartnIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp58041PartnIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp58041PartnId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp58041PartnId() {	 
   		return (substring(getStringValue(),beginIp58041PartnId,beginIp58041PartnId + IP_58041_PARTN_ID_LEN));
   	}
        int localIp58041TridCounter = -1;
        public boolean isIp58041TridModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localIp58041TridCounter != sharedCounter;
           localIp58041TridCounter = sharedCounter; return hasModified; 
        }
	    public boolean ip58041TridIsNumeric() {
	      return decimalIsNumeric(beginIp58041Trid,IP_58041_TRID_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int IP_58041_TRID_LEN = 6;
  	/**
	 * 	serializeIp58041Trid
	 */
	protected void serializeIp58041Trid(long ip58041Trid) {
		   putDecimal(beginIp58041Trid,ip58041Trid,IP_58041_TRID_LEN,true);
   }
   

   protected long checkIp58041TridMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshIp58041Trid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp58041Trid() throws CFException {	
   	try { 
		 return (getLongDecimal(beginIp58041Trid,IP_58041_TRID_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ip58041Trid", beginIp58041Trid,IP_58041_TRID_LEN);
     }
   	}
         int localIp58041TridNCounter = -1;
         public boolean isIp58041TridNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp58041TridNCounter != sharedCounter;
            localIp58041TridNCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_58041_TRID_N_LEN = 2;
  	/**
	 * serializeIp58041TridN
	 */
	protected void serializeIp58041TridN(short ip58041TridN) {
           replaceValue( //  save the value as string
                   getBinaryString( ip58041TridN,IP_58041_TRID_N_LEN)
                  ,beginIp58041TridN
                  ,IP_58041_TRID_N_LEN
                 );
            localIp58041TridNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp58041TridNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp58041TridN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp58041TridN() {	 
			return (getShort(beginIp58041TridN));
   	}
        int localIp58041TokenAsrLvlNumCounter = -1;
        public boolean isIp58041TokenAsrLvlNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localIp58041TokenAsrLvlNumCounter != sharedCounter;
           localIp58041TokenAsrLvlNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean ip58041TokenAsrLvlNumIsNumeric() {
	      return decimalIsNumeric(beginIp58041TokenAsrLvlNum,IP_58041_TOKEN_ASR_LVL_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int IP_58041_TOKEN_ASR_LVL_NUM_LEN = 2;
  	/**
	 * 	serializeIp58041TokenAsrLvlNum
	 */
	protected void serializeIp58041TokenAsrLvlNum(short ip58041TokenAsrLvlNum) {
		   putDecimal(beginIp58041TokenAsrLvlNum,ip58041TokenAsrLvlNum,IP_58041_TOKEN_ASR_LVL_NUM_LEN,true);
   }
   

   protected short checkIp58041TokenAsrLvlNumMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_100 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshIp58041TokenAsrLvlNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp58041TokenAsrLvlNum() throws CFException {	
   	try { 
		 return (getShortDecimal(beginIp58041TokenAsrLvlNum,IP_58041_TOKEN_ASR_LVL_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ip58041TokenAsrLvlNum", beginIp58041TokenAsrLvlNum,IP_58041_TOKEN_ASR_LVL_NUM_LEN);
     }
   	}
         int localIp58041TokenAsrLvlNumNCounter = -1;
         public boolean isIp58041TokenAsrLvlNumNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp58041TokenAsrLvlNumNCounter != sharedCounter;
            localIp58041TokenAsrLvlNumNCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_58041_TOKEN_ASR_LVL_NUM_N_LEN = 2;
  	/**
	 * serializeIp58041TokenAsrLvlNumN
	 */
	protected void serializeIp58041TokenAsrLvlNumN(short ip58041TokenAsrLvlNumN) {
           replaceValue( //  save the value as string
                   getBinaryString( ip58041TokenAsrLvlNumN,IP_58041_TOKEN_ASR_LVL_NUM_N_LEN)
                  ,beginIp58041TokenAsrLvlNumN
                  ,IP_58041_TOKEN_ASR_LVL_NUM_N_LEN
                 );
            localIp58041TokenAsrLvlNumNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp58041TokenAsrLvlNumNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp58041TokenAsrLvlNumN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp58041TokenAsrLvlNumN() {	 
			return (getShort(beginIp58041TokenAsrLvlNumN));
   	}
     int localIp58041WidCounter = -1;
     public boolean isIp58041WidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp58041WidCounter != sharedCounter;
         localIp58041WidCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_58041_WID_LEN = 3;
	/**
	 * 	serialize this Ip58041Wid
	 */
   protected void serializeIp58041Wid(char[] ip58041Wid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip58041Wid,0,getStringValue(),beginIp58041Wid,IP_58041_WID_LEN);
       localIp58041WidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp58041WidConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp58041Wid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp58041Wid() {	 
   		return (substring(getStringValue(),beginIp58041Wid,beginIp58041Wid + IP_58041_WID_LEN));
   	}
         int localIp58041WidNCounter = -1;
         public boolean isIp58041WidNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp58041WidNCounter != sharedCounter;
            localIp58041WidNCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_58041_WID_N_LEN = 2;
  	/**
	 * serializeIp58041WidN
	 */
	protected void serializeIp58041WidN(short ip58041WidN) {
           replaceValue( //  save the value as string
                   getBinaryString( ip58041WidN,IP_58041_WID_N_LEN)
                  ,beginIp58041WidN
                  ,IP_58041_WID_N_LEN
                 );
            localIp58041WidNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp58041WidNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp58041WidN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp58041WidN() {	 
			return (getShort(beginIp58041WidN));
   	}
     int localIp58041PrimAcctSeqNumCounter = -1;
     public boolean isIp58041PrimAcctSeqNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp58041PrimAcctSeqNumCounter != sharedCounter;
         localIp58041PrimAcctSeqNumCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_58041_PRIM_ACCT_SEQ_NUM_LEN = 3;
	/**
	 * 	serialize this Ip58041PrimAcctSeqNum
	 */
   protected void serializeIp58041PrimAcctSeqNum(char[] ip58041PrimAcctSeqNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip58041PrimAcctSeqNum,0,getStringValue(),beginIp58041PrimAcctSeqNum,IP_58041_PRIM_ACCT_SEQ_NUM_LEN);
       localIp58041PrimAcctSeqNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp58041PrimAcctSeqNumConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp58041PrimAcctSeqNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp58041PrimAcctSeqNum() {	 
   		return (substring(getStringValue(),beginIp58041PrimAcctSeqNum,beginIp58041PrimAcctSeqNum + IP_58041_PRIM_ACCT_SEQ_NUM_LEN));
   	}
         int localIp58041PrimAcctSeqNumNCounter = -1;
         public boolean isIp58041PrimAcctSeqNumNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp58041PrimAcctSeqNumNCounter != sharedCounter;
            localIp58041PrimAcctSeqNumNCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_58041_PRIM_ACCT_SEQ_NUM_N_LEN = 2;
  	/**
	 * serializeIp58041PrimAcctSeqNumN
	 */
	protected void serializeIp58041PrimAcctSeqNumN(short ip58041PrimAcctSeqNumN) {
           replaceValue( //  save the value as string
                   getBinaryString( ip58041PrimAcctSeqNumN,IP_58041_PRIM_ACCT_SEQ_NUM_N_LEN)
                  ,beginIp58041PrimAcctSeqNumN
                  ,IP_58041_PRIM_ACCT_SEQ_NUM_N_LEN
                 );
            localIp58041PrimAcctSeqNumNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp58041PrimAcctSeqNumNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp58041PrimAcctSeqNumN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp58041PrimAcctSeqNumN() {	 
			return (getShort(beginIp58041PrimAcctSeqNumN));
   	}
     int localIp58041PrcssngAgrmntIdCounter = -1;
     public boolean isIp58041PrcssngAgrmntIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp58041PrcssngAgrmntIdCounter != sharedCounter;
         localIp58041PrcssngAgrmntIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_58041_PRCSSNG_AGRMNT_ID_LEN = 11;
	/**
	 * 	serialize this Ip58041PrcssngAgrmntId
	 */
   protected void serializeIp58041PrcssngAgrmntId(char[] ip58041PrcssngAgrmntId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip58041PrcssngAgrmntId,0,getStringValue(),beginIp58041PrcssngAgrmntId,IP_58041_PRCSSNG_AGRMNT_ID_LEN);
       localIp58041PrcssngAgrmntIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp58041PrcssngAgrmntIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshIp58041PrcssngAgrmntId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp58041PrcssngAgrmntId() {	 
   		return (substring(getStringValue(),beginIp58041PrcssngAgrmntId,beginIp58041PrcssngAgrmntId + IP_58041_PRCSSNG_AGRMNT_ID_LEN));
   	}
     int localIp58041MqSentSwCounter = -1;
     public boolean isIp58041MqSentSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp58041MqSentSwCounter != sharedCounter;
         localIp58041MqSentSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_58041_MQ_SENT_SW_LEN = 1;
	/**
	 * 	serialize this Ip58041MqSentSw
	 */
   protected void serializeIp58041MqSentSw(char[] ip58041MqSentSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip58041MqSentSw,0,getStringValue(),beginIp58041MqSentSw,IP_58041_MQ_SENT_SW_LEN);
       localIp58041MqSentSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp58041MqSentSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp58041MqSentSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp58041MqSentSw() {	 
   		return (substring(getStringValue(),beginIp58041MqSentSw,beginIp58041MqSentSw + IP_58041_MQ_SENT_SW_LEN));
   	}




}
  

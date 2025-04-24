package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip34631TipapimSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip34631TipapimSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip34631TipapimSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_34631_TIPAPIM_LENGTH = 94;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp34631VirtualAccountNbr;
            protected  int beginIp34631PrimAccountNbr;
            protected  int beginIp34631ActionCode;
            protected  int beginIp34631ObsAccessTs;
            protected  int beginIp34631ObsAccessTsN;
            protected  int beginIp34631EntRsnCd;
            protected  int beginIp34631StatCd;
	
	/**
	* Constructor for Ip34631TipapimSerialized
	**/
    public Ip34631TipapimSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip34631TipapimSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_34631_TIPAPIM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp34631VirtualAccountNbr = getStartOffset() + 0;	// set offset for serialization
  
  
             beginIp34631PrimAccountNbr = getStartOffset() + 45;	// set offset for serialization
  
             beginIp34631ActionCode = getStartOffset() + 64;	// set offset for serialization
  
             beginIp34631ObsAccessTs = getStartOffset() + 65;	// set offset for serialization
  
             beginIp34631ObsAccessTsN = getStartOffset() + 91;	// set offset for serialization
  
             beginIp34631EntRsnCd = getStartOffset() + 92;	// set offset for serialization
  
             beginIp34631StatCd = getStartOffset() + 93;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp34631VirtualAccountNbrCounter = -1;
     public boolean isIp34631VirtualAccountNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp34631VirtualAccountNbrCounter != sharedCounter;
         localIp34631VirtualAccountNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_34631_VIRTUAL_ACCOUNT_NBR_LEN = 19;
	/**
	 * 	serialize this Ip34631VirtualAccountNbr
	 */
   protected void serializeIp34631VirtualAccountNbr(char[] ip34631VirtualAccountNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip34631VirtualAccountNbr,0,getStringValue(),beginIp34631VirtualAccountNbr,IP_34631_VIRTUAL_ACCOUNT_NBR_LEN);
       localIp34631VirtualAccountNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp34631VirtualAccountNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshIp34631VirtualAccountNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp34631VirtualAccountNbr() {	 
   		return (substring(getStringValue(),beginIp34631VirtualAccountNbr,beginIp34631VirtualAccountNbr + IP_34631_VIRTUAL_ACCOUNT_NBR_LEN));
   	}
     int localIp34631PrimAccountNbrCounter = -1;
     public boolean isIp34631PrimAccountNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp34631PrimAccountNbrCounter != sharedCounter;
         localIp34631PrimAccountNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_34631_PRIM_ACCOUNT_NBR_LEN = 19;
	/**
	 * 	serialize this Ip34631PrimAccountNbr
	 */
   protected void serializeIp34631PrimAccountNbr(char[] ip34631PrimAccountNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip34631PrimAccountNbr,0,getStringValue(),beginIp34631PrimAccountNbr,IP_34631_PRIM_ACCOUNT_NBR_LEN);
       localIp34631PrimAccountNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp34631PrimAccountNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshIp34631PrimAccountNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp34631PrimAccountNbr() {	 
   		return (substring(getStringValue(),beginIp34631PrimAccountNbr,beginIp34631PrimAccountNbr + IP_34631_PRIM_ACCOUNT_NBR_LEN));
   	}
     int localIp34631ActionCodeCounter = -1;
     public boolean isIp34631ActionCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp34631ActionCodeCounter != sharedCounter;
         localIp34631ActionCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_34631_ACTION_CODE_LEN = 1;
	/**
	 * 	serialize this Ip34631ActionCode
	 */
   protected void serializeIp34631ActionCode(char[] ip34631ActionCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip34631ActionCode,0,getStringValue(),beginIp34631ActionCode,IP_34631_ACTION_CODE_LEN);
       localIp34631ActionCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp34631ActionCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp34631ActionCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp34631ActionCode() {	 
   		return (substring(getStringValue(),beginIp34631ActionCode,beginIp34631ActionCode + IP_34631_ACTION_CODE_LEN));
   	}
     int localIp34631ObsAccessTsCounter = -1;
     public boolean isIp34631ObsAccessTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp34631ObsAccessTsCounter != sharedCounter;
         localIp34631ObsAccessTsCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_34631_OBS_ACCESS_TS_LEN = 26;
	/**
	 * 	serialize this Ip34631ObsAccessTs
	 */
   protected void serializeIp34631ObsAccessTs(char[] ip34631ObsAccessTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip34631ObsAccessTs,0,getStringValue(),beginIp34631ObsAccessTs,IP_34631_OBS_ACCESS_TS_LEN);
       localIp34631ObsAccessTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp34631ObsAccessTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshIp34631ObsAccessTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp34631ObsAccessTs() {	 
   		return (substring(getStringValue(),beginIp34631ObsAccessTs,beginIp34631ObsAccessTs + IP_34631_OBS_ACCESS_TS_LEN));
   	}
     int localIp34631ObsAccessTsNCounter = -1;
     public boolean isIp34631ObsAccessTsNModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp34631ObsAccessTsNCounter != sharedCounter;
         localIp34631ObsAccessTsNCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_34631_OBS_ACCESS_TS_N_LEN = 1;
	/**
	 * 	serialize this Ip34631ObsAccessTsN
	 */
   protected void serializeIp34631ObsAccessTsN(char[] ip34631ObsAccessTsN) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip34631ObsAccessTsN,0,getStringValue(),beginIp34631ObsAccessTsN,IP_34631_OBS_ACCESS_TS_N_LEN);
       localIp34631ObsAccessTsNCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp34631ObsAccessTsNConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp34631ObsAccessTsN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp34631ObsAccessTsN() {	 
   		return (substring(getStringValue(),beginIp34631ObsAccessTsN,beginIp34631ObsAccessTsN + IP_34631_OBS_ACCESS_TS_N_LEN));
   	}
     int localIp34631EntRsnCdCounter = -1;
     public boolean isIp34631EntRsnCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp34631EntRsnCdCounter != sharedCounter;
         localIp34631EntRsnCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_34631_ENT_RSN_CD_LEN = 1;
	/**
	 * 	serialize this Ip34631EntRsnCd
	 */
   protected void serializeIp34631EntRsnCd(char[] ip34631EntRsnCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip34631EntRsnCd,0,getStringValue(),beginIp34631EntRsnCd,IP_34631_ENT_RSN_CD_LEN);
       localIp34631EntRsnCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp34631EntRsnCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp34631EntRsnCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp34631EntRsnCd() {	 
   		return (substring(getStringValue(),beginIp34631EntRsnCd,beginIp34631EntRsnCd + IP_34631_ENT_RSN_CD_LEN));
   	}
     int localIp34631StatCdCounter = -1;
     public boolean isIp34631StatCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp34631StatCdCounter != sharedCounter;
         localIp34631StatCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_34631_STAT_CD_LEN = 1;
	/**
	 * 	serialize this Ip34631StatCd
	 */
   protected void serializeIp34631StatCd(char[] ip34631StatCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip34631StatCd,0,getStringValue(),beginIp34631StatCd,IP_34631_STAT_CD_LEN);
       localIp34631StatCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp34631StatCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp34631StatCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp34631StatCd() {	 
   		return (substring(getStringValue(),beginIp34631StatCd,beginIp34631StatCd + IP_34631_STAT_CD_LEN));
   	}




}
  

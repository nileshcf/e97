package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip02015PrcssAgrmtTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip02015PrcssAgrmtTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip02015PrcssAgrmtTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_02015_PRCSS_AGRMT_TABLE_LENGTH = 28620;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp02015PasFoundCount;
            protected  int beginIp02015HostPrcssAgrmtId;
            protected  int beginIp02015HostGeoScopeCode;
            protected  int beginIp02015HostClrPrcssCd;
	
	/**
	* Constructor for Ip02015PrcssAgrmtTableSerialized
	**/
    public Ip02015PrcssAgrmtTableSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip02015PrcssAgrmtTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_02015_PRCSS_AGRMT_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp02015PasFoundCount = getStartOffset() + 0;	// set offset for serialization
  
             beginIp02015HostPrcssAgrmtId = getStartOffset() + 4;	// set offset for serialization
  
             beginIp02015HostGeoScopeCode = getStartOffset() + 15;	// set offset for serialization
  
             beginIp02015HostClrPrcssCd = getStartOffset() + 16;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp02015PasFoundCountCounter = -1;
         public boolean isIp02015PasFoundCountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp02015PasFoundCountCounter != sharedCounter;
            localIp02015PasFoundCountCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_02015_PAS_FOUND_COUNT_LEN = 4;
  	/**
	 * serializeIp02015PasFoundCount
	 */
	protected void serializeIp02015PasFoundCount(int ip02015PasFoundCount) {
           replaceValue( //  save the value as string
                   getBinaryString( ip02015PasFoundCount,IP_02015_PAS_FOUND_COUNT_LEN)
                  ,beginIp02015PasFoundCount
                  ,IP_02015_PAS_FOUND_COUNT_LEN
                 );
            localIp02015PasFoundCountCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp02015PasFoundCountMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp02015PasFoundCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp02015PasFoundCount() {	 
			return (getInt(beginIp02015PasFoundCount));
   	}
     int localIp02015HostPrcssAgrmtIdCounter = -1;
     public boolean isIp02015HostPrcssAgrmtIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015HostPrcssAgrmtIdCounter != sharedCounter;
         localIp02015HostPrcssAgrmtIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_HOST_PRCSS_AGRMT_ID_LEN = 11;
	/**
	 * 	serialize this Ip02015HostPrcssAgrmtId
	 */
   protected void serializeIp02015HostPrcssAgrmtId(char[] ip02015HostPrcssAgrmtId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015HostPrcssAgrmtId,0,getStringValue(),beginIp02015HostPrcssAgrmtId,IP_02015_HOST_PRCSS_AGRMT_ID_LEN);
       localIp02015HostPrcssAgrmtIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015HostPrcssAgrmtIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshIp02015HostPrcssAgrmtId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015HostPrcssAgrmtId() {	 
   		return (substring(getStringValue(),beginIp02015HostPrcssAgrmtId,beginIp02015HostPrcssAgrmtId + IP_02015_HOST_PRCSS_AGRMT_ID_LEN));
   	}
     int localIp02015HostGeoScopeCodeCounter = -1;
     public boolean isIp02015HostGeoScopeCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015HostGeoScopeCodeCounter != sharedCounter;
         localIp02015HostGeoScopeCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_HOST_GEO_SCOPE_CODE_LEN = 1;
	/**
	 * 	serialize this Ip02015HostGeoScopeCode
	 */
   protected void serializeIp02015HostGeoScopeCode(char[] ip02015HostGeoScopeCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015HostGeoScopeCode,0,getStringValue(),beginIp02015HostGeoScopeCode,IP_02015_HOST_GEO_SCOPE_CODE_LEN);
       localIp02015HostGeoScopeCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015HostGeoScopeCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015HostGeoScopeCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015HostGeoScopeCode() {	 
   		return (substring(getStringValue(),beginIp02015HostGeoScopeCode,beginIp02015HostGeoScopeCode + IP_02015_HOST_GEO_SCOPE_CODE_LEN));
   	}
     int localIp02015HostClrPrcssCdCounter = -1;
     public boolean isIp02015HostClrPrcssCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015HostClrPrcssCdCounter != sharedCounter;
         localIp02015HostClrPrcssCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_HOST_CLR_PRCSS_CD_LEN = 4;
	/**
	 * 	serialize this Ip02015HostClrPrcssCd
	 */
   protected void serializeIp02015HostClrPrcssCd(char[] ip02015HostClrPrcssCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015HostClrPrcssCd,0,getStringValue(),beginIp02015HostClrPrcssCd,IP_02015_HOST_CLR_PRCSS_CD_LEN);
       localIp02015HostClrPrcssCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015HostClrPrcssCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp02015HostClrPrcssCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015HostClrPrcssCd() {	 
   		return (substring(getStringValue(),beginIp02015HostClrPrcssCd,beginIp02015HostClrPrcssCd + IP_02015_HOST_CLR_PRCSS_CD_LEN));
   	}




}
  

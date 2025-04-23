package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00754TableEntrySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00754TableEntrySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00754TableEntrySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00754_TABLE_ENTRY_LENGTH = 806;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00754MccValsInetGrpCd;
            protected  int beginIp00754MccStatus;
           protected int beginIp00754CabProgramTbl;
           protected static final int IP_00754_CAB_PROGRAM_TBL_SIZE = 160;
	
	/**
	* Constructor for Ip00754TableEntrySerialized
	**/
    public Ip00754TableEntrySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip00754TableEntrySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00754_TABLE_ENTRY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp00754MccValsInetGrpCd = getStartOffset() + 4;	// set offset for serialization
  
             beginIp00754MccStatus = getStartOffset() + 5;	// set offset for serialization
  
	        beginIp00754CabProgramTbl = getStartOffset() + 6; // set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00754MccValsInetGrpCdCounter = -1;
     public boolean isIp00754MccValsInetGrpCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00754MccValsInetGrpCdCounter != sharedCounter;
         localIp00754MccValsInetGrpCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00754_MCC_VALS_INET_GRP_CD_LEN = 1;
	/**
	 * 	serialize this Ip00754MccValsInetGrpCd
	 */
   protected void serializeIp00754MccValsInetGrpCd(char[] ip00754MccValsInetGrpCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00754MccValsInetGrpCd,0,getStringValue(),beginIp00754MccValsInetGrpCd,IP_00754_MCC_VALS_INET_GRP_CD_LEN);
       localIp00754MccValsInetGrpCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00754MccValsInetGrpCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00754MccValsInetGrpCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00754MccValsInetGrpCd() {	 
   		return (substring(getStringValue(),beginIp00754MccValsInetGrpCd,beginIp00754MccValsInetGrpCd + IP_00754_MCC_VALS_INET_GRP_CD_LEN));
   	}
     int localIp00754MccStatusCounter = -1;
     public boolean isIp00754MccStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00754MccStatusCounter != sharedCounter;
         localIp00754MccStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00754_MCC_STATUS_LEN = 1;
	/**
	 * 	serialize this Ip00754MccStatus
	 */
   protected void serializeIp00754MccStatus(char[] ip00754MccStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00754MccStatus,0,getStringValue(),beginIp00754MccStatus,IP_00754_MCC_STATUS_LEN);
       localIp00754MccStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00754MccStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00754MccStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00754MccStatus() {	 
   		return (substring(getStringValue(),beginIp00754MccStatus,beginIp00754MccStatus + IP_00754_MCC_STATUS_LEN));
   	}

		public int ip00754CabProgramTblSize() {
			return IP_00754_CAB_PROGRAM_TBL_SIZE;
		}



}
  

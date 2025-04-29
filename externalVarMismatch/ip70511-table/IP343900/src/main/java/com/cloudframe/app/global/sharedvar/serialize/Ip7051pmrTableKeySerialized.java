package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip7051pmrTableKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip7051pmrTableKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip7051pmrTableKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_7051PMR_TABLE_KEY_LENGTH = 32;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp7051pmrEnvCd;
            protected  int beginIp7051pmrCloneOwnerId;
            protected  int beginIp7051pmrCpu;
            protected  int beginIp7051pmrHostPrcssAgrmtId;
            protected  int beginIp7051pmrServCd;
            protected  int beginIp7051pmrFuncCd;
            protected  int beginIp7051pmrQueueNum;
	
	/**
	* Constructor for Ip7051pmrTableKeySerialized
	**/
    public Ip7051pmrTableKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip7051pmrTableKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7051pmrTableKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip7051pmrTableKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip7051pmrTableKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip7051pmrTableKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_7051PMR_TABLE_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp7051pmrEnvCd = getStartOffset() + 0;	// set offset for serialization
  
             beginIp7051pmrCloneOwnerId = getStartOffset() + 3;	// set offset for serialization
  
             beginIp7051pmrCpu = getStartOffset() + 6;	// set offset for serialization
  
             beginIp7051pmrHostPrcssAgrmtId = getStartOffset() + 10;	// set offset for serialization
  
             beginIp7051pmrServCd = getStartOffset() + 21;	// set offset for serialization
  
             beginIp7051pmrFuncCd = getStartOffset() + 25;	// set offset for serialization
  
             beginIp7051pmrQueueNum = getStartOffset() + 29;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp7051pmrEnvCdCounter = -1;
     public boolean isIp7051pmrEnvCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051pmrEnvCdCounter != sharedCounter;
         localIp7051pmrEnvCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051PMR_ENV_CD_LEN = 3;
	/**
	 * 	serialize this Ip7051pmrEnvCd
	 */
   protected void serializeIp7051pmrEnvCd(char[] ip7051pmrEnvCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051pmrEnvCd,0,getStringValue(),beginIp7051pmrEnvCd,IP_7051PMR_ENV_CD_LEN);
       localIp7051pmrEnvCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051pmrEnvCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp7051pmrEnvCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051pmrEnvCd() {	 
   		return (substring(getStringValue(),beginIp7051pmrEnvCd,beginIp7051pmrEnvCd + IP_7051PMR_ENV_CD_LEN));
   	}
     int localIp7051pmrCloneOwnerIdCounter = -1;
     public boolean isIp7051pmrCloneOwnerIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051pmrCloneOwnerIdCounter != sharedCounter;
         localIp7051pmrCloneOwnerIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051PMR_CLONE_OWNER_ID_LEN = 3;
	/**
	 * 	serialize this Ip7051pmrCloneOwnerId
	 */
   protected void serializeIp7051pmrCloneOwnerId(char[] ip7051pmrCloneOwnerId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051pmrCloneOwnerId,0,getStringValue(),beginIp7051pmrCloneOwnerId,IP_7051PMR_CLONE_OWNER_ID_LEN);
       localIp7051pmrCloneOwnerIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051pmrCloneOwnerIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp7051pmrCloneOwnerId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051pmrCloneOwnerId() {	 
   		return (substring(getStringValue(),beginIp7051pmrCloneOwnerId,beginIp7051pmrCloneOwnerId + IP_7051PMR_CLONE_OWNER_ID_LEN));
   	}
     int localIp7051pmrCpuCounter = -1;
     public boolean isIp7051pmrCpuModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051pmrCpuCounter != sharedCounter;
         localIp7051pmrCpuCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051PMR_CPU_LEN = 4;
	/**
	 * 	serialize this Ip7051pmrCpu
	 */
   protected void serializeIp7051pmrCpu(char[] ip7051pmrCpu) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051pmrCpu,0,getStringValue(),beginIp7051pmrCpu,IP_7051PMR_CPU_LEN);
       localIp7051pmrCpuCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051pmrCpuConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp7051pmrCpu is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051pmrCpu() {	 
   		return (substring(getStringValue(),beginIp7051pmrCpu,beginIp7051pmrCpu + IP_7051PMR_CPU_LEN));
   	}
     int localIp7051pmrHostPrcssAgrmtIdCounter = -1;
     public boolean isIp7051pmrHostPrcssAgrmtIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051pmrHostPrcssAgrmtIdCounter != sharedCounter;
         localIp7051pmrHostPrcssAgrmtIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051PMR_HOST_PRCSS_AGRMT_ID_LEN = 11;
	/**
	 * 	serialize this Ip7051pmrHostPrcssAgrmtId
	 */
   protected void serializeIp7051pmrHostPrcssAgrmtId(char[] ip7051pmrHostPrcssAgrmtId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051pmrHostPrcssAgrmtId,0,getStringValue(),beginIp7051pmrHostPrcssAgrmtId,IP_7051PMR_HOST_PRCSS_AGRMT_ID_LEN);
       localIp7051pmrHostPrcssAgrmtIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051pmrHostPrcssAgrmtIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshIp7051pmrHostPrcssAgrmtId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051pmrHostPrcssAgrmtId() {	 
   		return (substring(getStringValue(),beginIp7051pmrHostPrcssAgrmtId,beginIp7051pmrHostPrcssAgrmtId + IP_7051PMR_HOST_PRCSS_AGRMT_ID_LEN));
   	}
     int localIp7051pmrServCdCounter = -1;
     public boolean isIp7051pmrServCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051pmrServCdCounter != sharedCounter;
         localIp7051pmrServCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051PMR_SERV_CD_LEN = 4;
	/**
	 * 	serialize this Ip7051pmrServCd
	 */
   protected void serializeIp7051pmrServCd(char[] ip7051pmrServCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051pmrServCd,0,getStringValue(),beginIp7051pmrServCd,IP_7051PMR_SERV_CD_LEN);
       localIp7051pmrServCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051pmrServCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp7051pmrServCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051pmrServCd() {	 
   		return (substring(getStringValue(),beginIp7051pmrServCd,beginIp7051pmrServCd + IP_7051PMR_SERV_CD_LEN));
   	}
     int localIp7051pmrFuncCdCounter = -1;
     public boolean isIp7051pmrFuncCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051pmrFuncCdCounter != sharedCounter;
         localIp7051pmrFuncCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051PMR_FUNC_CD_LEN = 4;
	/**
	 * 	serialize this Ip7051pmrFuncCd
	 */
   protected void serializeIp7051pmrFuncCd(char[] ip7051pmrFuncCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051pmrFuncCd,0,getStringValue(),beginIp7051pmrFuncCd,IP_7051PMR_FUNC_CD_LEN);
       localIp7051pmrFuncCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051pmrFuncCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp7051pmrFuncCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051pmrFuncCd() {	 
   		return (substring(getStringValue(),beginIp7051pmrFuncCd,beginIp7051pmrFuncCd + IP_7051PMR_FUNC_CD_LEN));
   	}
     int localIp7051pmrQueueNumCounter = -1;
     public boolean isIp7051pmrQueueNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051pmrQueueNumCounter != sharedCounter;
         localIp7051pmrQueueNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip7051pmrQueueNum
	 *	@return ip7051pmrQueueNum
	 */
	public char[]  getIp7051pmrQueueNumString() {
	     return getCharArray(beginIp7051pmrQueueNum,IP_7051PMR_QUEUE_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip7051pmrQueueNumIsNumeric() {
	    return isNumeric(beginIp7051pmrQueueNum
	                    ,beginIp7051pmrQueueNum + IP_7051PMR_QUEUE_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_7051PMR_QUEUE_NUM_LEN = 3;
  	/**
	 * serializeIp7051pmrQueueNum
	 */
	protected void serializeIp7051pmrQueueNum(int ip7051pmrQueueNum) {
		 putNumber(beginIp7051pmrQueueNum,ip7051pmrQueueNum,IP_7051PMR_QUEUE_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp7051pmrQueueNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp7051pmrQueueNum
	 */
   	protected  int serializeIp7051pmrQueueNum(char[] value) {
	    int  ip7051pmrQueueNum;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip7051pmrQueueNum = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp7051pmrQueueNum
		       ,3
		      );
		 localIp7051pmrQueueNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip7051pmrQueueNum;
    }

   protected int checkIp7051pmrQueueNumMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp7051pmrQueueNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp7051pmrQueueNum() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp7051pmrQueueNum
			                 ,IP_7051PMR_QUEUE_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip7051pmrQueueNum", beginIp7051pmrQueueNum,IP_7051PMR_QUEUE_NUM_LEN);
    }
   	}




}
  

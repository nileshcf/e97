package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip7051pm2TableKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip7051pm2TableKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip7051pm2TableKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_7051PM_2_TABLE_KEY_LENGTH = 32;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp7051pm2EnvCd;
            protected  int beginIp7051pm2CloneOwnerId;
            protected  int beginIp7051pm2Cpu;
            protected  int beginIp7051pm2HostPrcssAgrmtId;
            protected  int beginIp7051pm2ServCd;
            protected  int beginIp7051pm2FuncCd;
            protected  int beginIp7051pm2QueueNum;
	
	/**
	* Constructor for Ip7051pm2TableKeySerialized
	**/
    public Ip7051pm2TableKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip7051pm2TableKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7051pm2TableKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip7051pm2TableKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip7051pm2TableKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip7051pm2TableKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_7051PM_2_TABLE_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp7051pm2EnvCd = getStartOffset() + 0;	// set offset for serialization
  
             beginIp7051pm2CloneOwnerId = getStartOffset() + 3;	// set offset for serialization
  
             beginIp7051pm2Cpu = getStartOffset() + 6;	// set offset for serialization
  
             beginIp7051pm2HostPrcssAgrmtId = getStartOffset() + 10;	// set offset for serialization
  
             beginIp7051pm2ServCd = getStartOffset() + 21;	// set offset for serialization
  
             beginIp7051pm2FuncCd = getStartOffset() + 25;	// set offset for serialization
  
             beginIp7051pm2QueueNum = getStartOffset() + 29;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp7051pm2EnvCdCounter = -1;
     public boolean isIp7051pm2EnvCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051pm2EnvCdCounter != sharedCounter;
         localIp7051pm2EnvCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051PM_2_ENV_CD_LEN = 3;
	/**
	 * 	serialize this Ip7051pm2EnvCd
	 */
   protected void serializeIp7051pm2EnvCd(char[] ip7051pm2EnvCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051pm2EnvCd,0,getStringValue(),beginIp7051pm2EnvCd,IP_7051PM_2_ENV_CD_LEN);
       localIp7051pm2EnvCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051pm2EnvCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp7051pm2EnvCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051pm2EnvCd() {	 
   		return (substring(getStringValue(),beginIp7051pm2EnvCd,beginIp7051pm2EnvCd + IP_7051PM_2_ENV_CD_LEN));
   	}
     int localIp7051pm2CloneOwnerIdCounter = -1;
     public boolean isIp7051pm2CloneOwnerIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051pm2CloneOwnerIdCounter != sharedCounter;
         localIp7051pm2CloneOwnerIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051PM_2_CLONE_OWNER_ID_LEN = 3;
	/**
	 * 	serialize this Ip7051pm2CloneOwnerId
	 */
   protected void serializeIp7051pm2CloneOwnerId(char[] ip7051pm2CloneOwnerId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051pm2CloneOwnerId,0,getStringValue(),beginIp7051pm2CloneOwnerId,IP_7051PM_2_CLONE_OWNER_ID_LEN);
       localIp7051pm2CloneOwnerIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051pm2CloneOwnerIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp7051pm2CloneOwnerId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051pm2CloneOwnerId() {	 
   		return (substring(getStringValue(),beginIp7051pm2CloneOwnerId,beginIp7051pm2CloneOwnerId + IP_7051PM_2_CLONE_OWNER_ID_LEN));
   	}
     int localIp7051pm2CpuCounter = -1;
     public boolean isIp7051pm2CpuModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051pm2CpuCounter != sharedCounter;
         localIp7051pm2CpuCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051PM_2_CPU_LEN = 4;
	/**
	 * 	serialize this Ip7051pm2Cpu
	 */
   protected void serializeIp7051pm2Cpu(char[] ip7051pm2Cpu) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051pm2Cpu,0,getStringValue(),beginIp7051pm2Cpu,IP_7051PM_2_CPU_LEN);
       localIp7051pm2CpuCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051pm2CpuConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp7051pm2Cpu is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051pm2Cpu() {	 
   		return (substring(getStringValue(),beginIp7051pm2Cpu,beginIp7051pm2Cpu + IP_7051PM_2_CPU_LEN));
   	}
     int localIp7051pm2HostPrcssAgrmtIdCounter = -1;
     public boolean isIp7051pm2HostPrcssAgrmtIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051pm2HostPrcssAgrmtIdCounter != sharedCounter;
         localIp7051pm2HostPrcssAgrmtIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051PM_2_HOST_PRCSS_AGRMT_ID_LEN = 11;
	/**
	 * 	serialize this Ip7051pm2HostPrcssAgrmtId
	 */
   protected void serializeIp7051pm2HostPrcssAgrmtId(char[] ip7051pm2HostPrcssAgrmtId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051pm2HostPrcssAgrmtId,0,getStringValue(),beginIp7051pm2HostPrcssAgrmtId,IP_7051PM_2_HOST_PRCSS_AGRMT_ID_LEN);
       localIp7051pm2HostPrcssAgrmtIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051pm2HostPrcssAgrmtIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshIp7051pm2HostPrcssAgrmtId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051pm2HostPrcssAgrmtId() {	 
   		return (substring(getStringValue(),beginIp7051pm2HostPrcssAgrmtId,beginIp7051pm2HostPrcssAgrmtId + IP_7051PM_2_HOST_PRCSS_AGRMT_ID_LEN));
   	}
     int localIp7051pm2ServCdCounter = -1;
     public boolean isIp7051pm2ServCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051pm2ServCdCounter != sharedCounter;
         localIp7051pm2ServCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051PM_2_SERV_CD_LEN = 4;
	/**
	 * 	serialize this Ip7051pm2ServCd
	 */
   protected void serializeIp7051pm2ServCd(char[] ip7051pm2ServCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051pm2ServCd,0,getStringValue(),beginIp7051pm2ServCd,IP_7051PM_2_SERV_CD_LEN);
       localIp7051pm2ServCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051pm2ServCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp7051pm2ServCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051pm2ServCd() {	 
   		return (substring(getStringValue(),beginIp7051pm2ServCd,beginIp7051pm2ServCd + IP_7051PM_2_SERV_CD_LEN));
   	}
     int localIp7051pm2FuncCdCounter = -1;
     public boolean isIp7051pm2FuncCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051pm2FuncCdCounter != sharedCounter;
         localIp7051pm2FuncCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051PM_2_FUNC_CD_LEN = 4;
	/**
	 * 	serialize this Ip7051pm2FuncCd
	 */
   protected void serializeIp7051pm2FuncCd(char[] ip7051pm2FuncCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051pm2FuncCd,0,getStringValue(),beginIp7051pm2FuncCd,IP_7051PM_2_FUNC_CD_LEN);
       localIp7051pm2FuncCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051pm2FuncCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp7051pm2FuncCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051pm2FuncCd() {	 
   		return (substring(getStringValue(),beginIp7051pm2FuncCd,beginIp7051pm2FuncCd + IP_7051PM_2_FUNC_CD_LEN));
   	}
     int localIp7051pm2QueueNumCounter = -1;
     public boolean isIp7051pm2QueueNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051pm2QueueNumCounter != sharedCounter;
         localIp7051pm2QueueNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip7051pm2QueueNum
	 *	@return ip7051pm2QueueNum
	 */
	public char[]  getIp7051pm2QueueNumString() {
	     return getCharArray(beginIp7051pm2QueueNum,IP_7051PM_2_QUEUE_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip7051pm2QueueNumIsNumeric() {
	    return isNumeric(beginIp7051pm2QueueNum
	                    ,beginIp7051pm2QueueNum + IP_7051PM_2_QUEUE_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_7051PM_2_QUEUE_NUM_LEN = 3;
  	/**
	 * serializeIp7051pm2QueueNum
	 */
	protected void serializeIp7051pm2QueueNum(int ip7051pm2QueueNum) {
		 putNumber(beginIp7051pm2QueueNum,ip7051pm2QueueNum,IP_7051PM_2_QUEUE_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp7051pm2QueueNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp7051pm2QueueNum
	 */
   	protected  int serializeIp7051pm2QueueNum(char[] value) {
	    int  ip7051pm2QueueNum;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip7051pm2QueueNum = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp7051pm2QueueNum
		       ,3
		      );
		 localIp7051pm2QueueNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip7051pm2QueueNum;
    }

   protected int checkIp7051pm2QueueNumMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp7051pm2QueueNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp7051pm2QueueNum() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp7051pm2QueueNum
			                 ,IP_7051PM_2_QUEUE_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip7051pm2QueueNum", beginIp7051pm2QueueNum,IP_7051PM_2_QUEUE_NUM_LEN);
    }
   	}




}
  

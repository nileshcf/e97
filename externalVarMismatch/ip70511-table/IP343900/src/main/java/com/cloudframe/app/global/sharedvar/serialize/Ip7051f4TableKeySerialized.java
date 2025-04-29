package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip7051f4TableKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip7051f4TableKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip7051f4TableKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_7051F_4_TABLE_KEY_LENGTH = 32;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp7051f4EnvCd;
            protected  int beginIp7051f4CloneOwnerId;
            protected  int beginIp7051f4Cpu;
            protected  int beginIp7051f4HostPrcssAgrmtId;
            protected  int beginIp7051f4ServCd;
            protected  int beginIp7051f4FuncCd;
            protected  int beginIp7051f4QueueNum;
	
	/**
	* Constructor for Ip7051f4TableKeySerialized
	**/
    public Ip7051f4TableKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip7051f4TableKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7051f4TableKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip7051f4TableKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip7051f4TableKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip7051f4TableKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_7051F_4_TABLE_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp7051f4EnvCd = getStartOffset() + 0;	// set offset for serialization
  
             beginIp7051f4CloneOwnerId = getStartOffset() + 3;	// set offset for serialization
  
             beginIp7051f4Cpu = getStartOffset() + 6;	// set offset for serialization
  
             beginIp7051f4HostPrcssAgrmtId = getStartOffset() + 10;	// set offset for serialization
  
             beginIp7051f4ServCd = getStartOffset() + 21;	// set offset for serialization
  
             beginIp7051f4FuncCd = getStartOffset() + 25;	// set offset for serialization
  
             beginIp7051f4QueueNum = getStartOffset() + 29;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp7051f4EnvCdCounter = -1;
     public boolean isIp7051f4EnvCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051f4EnvCdCounter != sharedCounter;
         localIp7051f4EnvCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051F_4_ENV_CD_LEN = 3;
	/**
	 * 	serialize this Ip7051f4EnvCd
	 */
   protected void serializeIp7051f4EnvCd(char[] ip7051f4EnvCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051f4EnvCd,0,getStringValue(),beginIp7051f4EnvCd,IP_7051F_4_ENV_CD_LEN);
       localIp7051f4EnvCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051f4EnvCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp7051f4EnvCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051f4EnvCd() {	 
   		return (substring(getStringValue(),beginIp7051f4EnvCd,beginIp7051f4EnvCd + IP_7051F_4_ENV_CD_LEN));
   	}
     int localIp7051f4CloneOwnerIdCounter = -1;
     public boolean isIp7051f4CloneOwnerIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051f4CloneOwnerIdCounter != sharedCounter;
         localIp7051f4CloneOwnerIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051F_4_CLONE_OWNER_ID_LEN = 3;
	/**
	 * 	serialize this Ip7051f4CloneOwnerId
	 */
   protected void serializeIp7051f4CloneOwnerId(char[] ip7051f4CloneOwnerId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051f4CloneOwnerId,0,getStringValue(),beginIp7051f4CloneOwnerId,IP_7051F_4_CLONE_OWNER_ID_LEN);
       localIp7051f4CloneOwnerIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051f4CloneOwnerIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp7051f4CloneOwnerId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051f4CloneOwnerId() {	 
   		return (substring(getStringValue(),beginIp7051f4CloneOwnerId,beginIp7051f4CloneOwnerId + IP_7051F_4_CLONE_OWNER_ID_LEN));
   	}
     int localIp7051f4CpuCounter = -1;
     public boolean isIp7051f4CpuModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051f4CpuCounter != sharedCounter;
         localIp7051f4CpuCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051F_4_CPU_LEN = 4;
	/**
	 * 	serialize this Ip7051f4Cpu
	 */
   protected void serializeIp7051f4Cpu(char[] ip7051f4Cpu) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051f4Cpu,0,getStringValue(),beginIp7051f4Cpu,IP_7051F_4_CPU_LEN);
       localIp7051f4CpuCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051f4CpuConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp7051f4Cpu is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051f4Cpu() {	 
   		return (substring(getStringValue(),beginIp7051f4Cpu,beginIp7051f4Cpu + IP_7051F_4_CPU_LEN));
   	}
     int localIp7051f4HostPrcssAgrmtIdCounter = -1;
     public boolean isIp7051f4HostPrcssAgrmtIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051f4HostPrcssAgrmtIdCounter != sharedCounter;
         localIp7051f4HostPrcssAgrmtIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051F_4_HOST_PRCSS_AGRMT_ID_LEN = 11;
	/**
	 * 	serialize this Ip7051f4HostPrcssAgrmtId
	 */
   protected void serializeIp7051f4HostPrcssAgrmtId(char[] ip7051f4HostPrcssAgrmtId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051f4HostPrcssAgrmtId,0,getStringValue(),beginIp7051f4HostPrcssAgrmtId,IP_7051F_4_HOST_PRCSS_AGRMT_ID_LEN);
       localIp7051f4HostPrcssAgrmtIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051f4HostPrcssAgrmtIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshIp7051f4HostPrcssAgrmtId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051f4HostPrcssAgrmtId() {	 
   		return (substring(getStringValue(),beginIp7051f4HostPrcssAgrmtId,beginIp7051f4HostPrcssAgrmtId + IP_7051F_4_HOST_PRCSS_AGRMT_ID_LEN));
   	}
     int localIp7051f4ServCdCounter = -1;
     public boolean isIp7051f4ServCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051f4ServCdCounter != sharedCounter;
         localIp7051f4ServCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051F_4_SERV_CD_LEN = 4;
	/**
	 * 	serialize this Ip7051f4ServCd
	 */
   protected void serializeIp7051f4ServCd(char[] ip7051f4ServCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051f4ServCd,0,getStringValue(),beginIp7051f4ServCd,IP_7051F_4_SERV_CD_LEN);
       localIp7051f4ServCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051f4ServCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp7051f4ServCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051f4ServCd() {	 
   		return (substring(getStringValue(),beginIp7051f4ServCd,beginIp7051f4ServCd + IP_7051F_4_SERV_CD_LEN));
   	}
     int localIp7051f4FuncCdCounter = -1;
     public boolean isIp7051f4FuncCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051f4FuncCdCounter != sharedCounter;
         localIp7051f4FuncCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051F_4_FUNC_CD_LEN = 4;
	/**
	 * 	serialize this Ip7051f4FuncCd
	 */
   protected void serializeIp7051f4FuncCd(char[] ip7051f4FuncCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051f4FuncCd,0,getStringValue(),beginIp7051f4FuncCd,IP_7051F_4_FUNC_CD_LEN);
       localIp7051f4FuncCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051f4FuncCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp7051f4FuncCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051f4FuncCd() {	 
   		return (substring(getStringValue(),beginIp7051f4FuncCd,beginIp7051f4FuncCd + IP_7051F_4_FUNC_CD_LEN));
   	}
     int localIp7051f4QueueNumCounter = -1;
     public boolean isIp7051f4QueueNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051f4QueueNumCounter != sharedCounter;
         localIp7051f4QueueNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip7051f4QueueNum
	 *	@return ip7051f4QueueNum
	 */
	public char[]  getIp7051f4QueueNumString() {
	     return getCharArray(beginIp7051f4QueueNum,IP_7051F_4_QUEUE_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip7051f4QueueNumIsNumeric() {
	    return isNumeric(beginIp7051f4QueueNum
	                    ,beginIp7051f4QueueNum + IP_7051F_4_QUEUE_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_7051F_4_QUEUE_NUM_LEN = 3;
  	/**
	 * serializeIp7051f4QueueNum
	 */
	protected void serializeIp7051f4QueueNum(int ip7051f4QueueNum) {
		 putNumber(beginIp7051f4QueueNum,ip7051f4QueueNum,IP_7051F_4_QUEUE_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp7051f4QueueNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp7051f4QueueNum
	 */
   	protected  int serializeIp7051f4QueueNum(char[] value) {
	    int  ip7051f4QueueNum;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip7051f4QueueNum = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp7051f4QueueNum
		       ,3
		      );
		 localIp7051f4QueueNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip7051f4QueueNum;
    }

   protected int checkIp7051f4QueueNumMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp7051f4QueueNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp7051f4QueueNum() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp7051f4QueueNum
			                 ,IP_7051F_4_QUEUE_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip7051f4QueueNum", beginIp7051f4QueueNum,IP_7051F_4_QUEUE_NUM_LEN);
    }
   	}




}
  

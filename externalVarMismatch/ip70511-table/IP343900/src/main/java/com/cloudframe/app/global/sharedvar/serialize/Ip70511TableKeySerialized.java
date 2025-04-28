package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70511TableKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70511TableKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70511TableKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70511_TABLE_KEY_LENGTH = 32;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70511EnvCd;
            protected  int beginIp70511CloneOwnerId;
            protected  int beginIp70511Cpu;
            protected  int beginIp70511HostPrcssAgrmtId;
            protected  int beginIp70511ServCd;
            protected  int beginIp70511FuncCd;
            protected  int beginIp70511QueueNum;
	
	/**
	* Constructor for Ip70511TableKeySerialized
	**/
    public Ip70511TableKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip70511TableKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip70511TableKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip70511TableKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip70511TableKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip70511TableKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70511_TABLE_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70511EnvCd = getStartOffset() + 0;	// set offset for serialization
  
             beginIp70511CloneOwnerId = getStartOffset() + 3;	// set offset for serialization
  
             beginIp70511Cpu = getStartOffset() + 6;	// set offset for serialization
  
             beginIp70511HostPrcssAgrmtId = getStartOffset() + 10;	// set offset for serialization
  
             beginIp70511ServCd = getStartOffset() + 21;	// set offset for serialization
  
             beginIp70511FuncCd = getStartOffset() + 25;	// set offset for serialization
  
             beginIp70511QueueNum = getStartOffset() + 29;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp70511EnvCdCounter = -1;
     public boolean isIp70511EnvCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70511EnvCdCounter != sharedCounter;
         localIp70511EnvCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70511_ENV_CD_LEN = 3;
	/**
	 * 	serialize this Ip70511EnvCd
	 */
   protected void serializeIp70511EnvCd(char[] ip70511EnvCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70511EnvCd,0,getStringValue(),beginIp70511EnvCd,IP_70511_ENV_CD_LEN);
       localIp70511EnvCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70511EnvCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp70511EnvCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70511EnvCd() {	 
   		return (substring(getStringValue(),beginIp70511EnvCd,beginIp70511EnvCd + IP_70511_ENV_CD_LEN));
   	}
     int localIp70511CloneOwnerIdCounter = -1;
     public boolean isIp70511CloneOwnerIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70511CloneOwnerIdCounter != sharedCounter;
         localIp70511CloneOwnerIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70511_CLONE_OWNER_ID_LEN = 3;
	/**
	 * 	serialize this Ip70511CloneOwnerId
	 */
   protected void serializeIp70511CloneOwnerId(char[] ip70511CloneOwnerId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70511CloneOwnerId,0,getStringValue(),beginIp70511CloneOwnerId,IP_70511_CLONE_OWNER_ID_LEN);
       localIp70511CloneOwnerIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70511CloneOwnerIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp70511CloneOwnerId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70511CloneOwnerId() {	 
   		return (substring(getStringValue(),beginIp70511CloneOwnerId,beginIp70511CloneOwnerId + IP_70511_CLONE_OWNER_ID_LEN));
   	}
     int localIp70511CpuCounter = -1;
     public boolean isIp70511CpuModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70511CpuCounter != sharedCounter;
         localIp70511CpuCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70511_CPU_LEN = 4;
	/**
	 * 	serialize this Ip70511Cpu
	 */
   protected void serializeIp70511Cpu(char[] ip70511Cpu) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70511Cpu,0,getStringValue(),beginIp70511Cpu,IP_70511_CPU_LEN);
       localIp70511CpuCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70511CpuConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp70511Cpu is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70511Cpu() {	 
   		return (substring(getStringValue(),beginIp70511Cpu,beginIp70511Cpu + IP_70511_CPU_LEN));
   	}
     int localIp70511HostPrcssAgrmtIdCounter = -1;
     public boolean isIp70511HostPrcssAgrmtIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70511HostPrcssAgrmtIdCounter != sharedCounter;
         localIp70511HostPrcssAgrmtIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70511_HOST_PRCSS_AGRMT_ID_LEN = 11;
	/**
	 * 	serialize this Ip70511HostPrcssAgrmtId
	 */
   protected void serializeIp70511HostPrcssAgrmtId(char[] ip70511HostPrcssAgrmtId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70511HostPrcssAgrmtId,0,getStringValue(),beginIp70511HostPrcssAgrmtId,IP_70511_HOST_PRCSS_AGRMT_ID_LEN);
       localIp70511HostPrcssAgrmtIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70511HostPrcssAgrmtIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshIp70511HostPrcssAgrmtId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70511HostPrcssAgrmtId() {	 
   		return (substring(getStringValue(),beginIp70511HostPrcssAgrmtId,beginIp70511HostPrcssAgrmtId + IP_70511_HOST_PRCSS_AGRMT_ID_LEN));
   	}
     int localIp70511ServCdCounter = -1;
     public boolean isIp70511ServCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70511ServCdCounter != sharedCounter;
         localIp70511ServCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70511_SERV_CD_LEN = 4;
	/**
	 * 	serialize this Ip70511ServCd
	 */
   protected void serializeIp70511ServCd(char[] ip70511ServCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70511ServCd,0,getStringValue(),beginIp70511ServCd,IP_70511_SERV_CD_LEN);
       localIp70511ServCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70511ServCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp70511ServCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70511ServCd() {	 
   		return (substring(getStringValue(),beginIp70511ServCd,beginIp70511ServCd + IP_70511_SERV_CD_LEN));
   	}
     int localIp70511FuncCdCounter = -1;
     public boolean isIp70511FuncCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70511FuncCdCounter != sharedCounter;
         localIp70511FuncCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70511_FUNC_CD_LEN = 4;
	/**
	 * 	serialize this Ip70511FuncCd
	 */
   protected void serializeIp70511FuncCd(char[] ip70511FuncCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70511FuncCd,0,getStringValue(),beginIp70511FuncCd,IP_70511_FUNC_CD_LEN);
       localIp70511FuncCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70511FuncCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp70511FuncCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70511FuncCd() {	 
   		return (substring(getStringValue(),beginIp70511FuncCd,beginIp70511FuncCd + IP_70511_FUNC_CD_LEN));
   	}
     int localIp70511QueueNumCounter = -1;
     public boolean isIp70511QueueNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70511QueueNumCounter != sharedCounter;
         localIp70511QueueNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip70511QueueNum
	 *	@return ip70511QueueNum
	 */
	public char[]  getIp70511QueueNumString() {
	     return getCharArray(beginIp70511QueueNum,IP_70511_QUEUE_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip70511QueueNumIsNumeric() {
	    return isNumeric(beginIp70511QueueNum
	                    ,beginIp70511QueueNum + IP_70511_QUEUE_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_70511_QUEUE_NUM_LEN = 3;
  	/**
	 * serializeIp70511QueueNum
	 */
	protected void serializeIp70511QueueNum(int ip70511QueueNum) {
		 putNumber(beginIp70511QueueNum,ip70511QueueNum,IP_70511_QUEUE_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp70511QueueNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp70511QueueNum
	 */
   	protected  int serializeIp70511QueueNum(char[] value) {
	    int  ip70511QueueNum;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip70511QueueNum = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp70511QueueNum
		       ,3
		      );
		 localIp70511QueueNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip70511QueueNum;
    }

   protected int checkIp70511QueueNumMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp70511QueueNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp70511QueueNum() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp70511QueueNum
			                 ,IP_70511_QUEUE_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip70511QueueNum", beginIp70511QueueNum,IP_70511_QUEUE_NUM_LEN);
    }
   	}




}
  

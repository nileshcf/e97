package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip34051MqProcessParametersSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip34051MqProcessParametersSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip34051MqProcessParametersSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_34051_MQ_PROCESS_PARAMETERS_LENGTH = 13;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp34051ProcessSwitch;
            protected  int beginIp34051QueueType;
            protected  int beginIp34051ServCd;
            protected  int beginIp34051FuncCd;
            protected  int beginIp34051TipacliSwitch;
            protected  int beginIp34051TipasvcSwitch;
            protected  int beginIp34051CallFromIp545110;
	
	/**
	* Constructor for Ip34051MqProcessParametersSerialized
	**/
    public Ip34051MqProcessParametersSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip34051MqProcessParametersSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_34051_MQ_PROCESS_PARAMETERS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp34051ProcessSwitch = getStartOffset() + 0;	// set offset for serialization
  
             beginIp34051QueueType = getStartOffset() + 1;	// set offset for serialization
  
             beginIp34051ServCd = getStartOffset() + 2;	// set offset for serialization
  
             beginIp34051FuncCd = getStartOffset() + 6;	// set offset for serialization
  
             beginIp34051TipacliSwitch = getStartOffset() + 10;	// set offset for serialization
  
             beginIp34051TipasvcSwitch = getStartOffset() + 11;	// set offset for serialization
  
             beginIp34051CallFromIp545110 = getStartOffset() + 12;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp34051ProcessSwitchCounter = -1;
     public boolean isIp34051ProcessSwitchModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp34051ProcessSwitchCounter != sharedCounter;
         localIp34051ProcessSwitchCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_34051_PROCESS_SWITCH_LEN = 1;
	/**
	 * 	serialize this Ip34051ProcessSwitch
	 */
   protected void serializeIp34051ProcessSwitch(char[] ip34051ProcessSwitch) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip34051ProcessSwitch,0,getStringValue(),beginIp34051ProcessSwitch,IP_34051_PROCESS_SWITCH_LEN);
       localIp34051ProcessSwitchCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp34051ProcessSwitchConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp34051ProcessSwitch is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp34051ProcessSwitch() {	 
   		return (substring(getStringValue(),beginIp34051ProcessSwitch,beginIp34051ProcessSwitch + IP_34051_PROCESS_SWITCH_LEN));
   	}
     int localIp34051QueueTypeCounter = -1;
     public boolean isIp34051QueueTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp34051QueueTypeCounter != sharedCounter;
         localIp34051QueueTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_34051_QUEUE_TYPE_LEN = 1;
	/**
	 * 	serialize this Ip34051QueueType
	 */
   protected void serializeIp34051QueueType(char[] ip34051QueueType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip34051QueueType,0,getStringValue(),beginIp34051QueueType,IP_34051_QUEUE_TYPE_LEN);
       localIp34051QueueTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp34051QueueTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp34051QueueType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp34051QueueType() {	 
   		return (substring(getStringValue(),beginIp34051QueueType,beginIp34051QueueType + IP_34051_QUEUE_TYPE_LEN));
   	}
     int localIp34051ServCdCounter = -1;
     public boolean isIp34051ServCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp34051ServCdCounter != sharedCounter;
         localIp34051ServCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_34051_SERV_CD_LEN = 4;
	/**
	 * 	serialize this Ip34051ServCd
	 */
   protected void serializeIp34051ServCd(char[] ip34051ServCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip34051ServCd,0,getStringValue(),beginIp34051ServCd,IP_34051_SERV_CD_LEN);
       localIp34051ServCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp34051ServCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp34051ServCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp34051ServCd() {	 
   		return (substring(getStringValue(),beginIp34051ServCd,beginIp34051ServCd + IP_34051_SERV_CD_LEN));
   	}
     int localIp34051FuncCdCounter = -1;
     public boolean isIp34051FuncCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp34051FuncCdCounter != sharedCounter;
         localIp34051FuncCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_34051_FUNC_CD_LEN = 4;
	/**
	 * 	serialize this Ip34051FuncCd
	 */
   protected void serializeIp34051FuncCd(char[] ip34051FuncCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip34051FuncCd,0,getStringValue(),beginIp34051FuncCd,IP_34051_FUNC_CD_LEN);
       localIp34051FuncCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp34051FuncCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp34051FuncCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp34051FuncCd() {	 
   		return (substring(getStringValue(),beginIp34051FuncCd,beginIp34051FuncCd + IP_34051_FUNC_CD_LEN));
   	}
     int localIp34051TipacliSwitchCounter = -1;
     public boolean isIp34051TipacliSwitchModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp34051TipacliSwitchCounter != sharedCounter;
         localIp34051TipacliSwitchCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_34051_TIPACLI_SWITCH_LEN = 1;
	/**
	 * 	serialize this Ip34051TipacliSwitch
	 */
   protected void serializeIp34051TipacliSwitch(char[] ip34051TipacliSwitch) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip34051TipacliSwitch,0,getStringValue(),beginIp34051TipacliSwitch,IP_34051_TIPACLI_SWITCH_LEN);
       localIp34051TipacliSwitchCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp34051TipacliSwitchConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp34051TipacliSwitch is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp34051TipacliSwitch() {	 
   		return (substring(getStringValue(),beginIp34051TipacliSwitch,beginIp34051TipacliSwitch + IP_34051_TIPACLI_SWITCH_LEN));
   	}
     int localIp34051TipasvcSwitchCounter = -1;
     public boolean isIp34051TipasvcSwitchModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp34051TipasvcSwitchCounter != sharedCounter;
         localIp34051TipasvcSwitchCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_34051_TIPASVC_SWITCH_LEN = 1;
	/**
	 * 	serialize this Ip34051TipasvcSwitch
	 */
   protected void serializeIp34051TipasvcSwitch(char[] ip34051TipasvcSwitch) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip34051TipasvcSwitch,0,getStringValue(),beginIp34051TipasvcSwitch,IP_34051_TIPASVC_SWITCH_LEN);
       localIp34051TipasvcSwitchCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp34051TipasvcSwitchConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp34051TipasvcSwitch is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp34051TipasvcSwitch() {	 
   		return (substring(getStringValue(),beginIp34051TipasvcSwitch,beginIp34051TipasvcSwitch + IP_34051_TIPASVC_SWITCH_LEN));
   	}
     int localIp34051CallFromIp545110Counter = -1;
     public boolean isIp34051CallFromIp545110Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp34051CallFromIp545110Counter != sharedCounter;
         localIp34051CallFromIp545110Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_34051_CALL_FROM_IP_545110_LEN = 1;
	/**
	 * 	serialize this Ip34051CallFromIp545110
	 */
   protected void serializeIp34051CallFromIp545110(char[] ip34051CallFromIp545110) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip34051CallFromIp545110,0,getStringValue(),beginIp34051CallFromIp545110,IP_34051_CALL_FROM_IP_545110_LEN);
       localIp34051CallFromIp545110Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp34051CallFromIp545110Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp34051CallFromIp545110 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp34051CallFromIp545110() {	 
   		return (substring(getStringValue(),beginIp34051CallFromIp545110,beginIp34051CallFromIp545110 + IP_34051_CALL_FROM_IP_545110_LEN));
   	}




}
  

package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70521MqApiLayoutSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70521MqApiLayoutSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70521MqApiLayoutSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70521_MQ_API_LAYOUT_LENGTH = 4000268;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70521RequestCd;
            protected  int beginIp70521MqBypassSw;
            protected  int beginIp70521MqReturnSw;
            protected  int beginIp70521MqTimestamp;
            protected  int beginIp70521QmgrName;
            protected  int beginIp70521QName;
            protected  int beginIp70521TargetQmgrName;
            protected  int beginIp70521TargetQName;
            protected  int beginIp70521Hconn;
            protected  int beginIp70521Hobj;
            protected  int beginIp70521CompCd;
            protected  int beginIp70521ResnCd;
            protected  int beginIp70521Options;
            protected  int beginIp70521DataLength;
            protected  int beginIp70521MsgBufferLen;
            protected  int beginIp70521MsgBuffer;
	
	/**
	* Constructor for Ip70521MqApiLayoutSerialized
	**/
    public Ip70521MqApiLayoutSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip70521MqApiLayoutSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70521_MQ_API_LAYOUT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70521RequestCd = getStartOffset() + 0;	// set offset for serialization
  
             beginIp70521MqBypassSw = getStartOffset() + 4;	// set offset for serialization
  
             beginIp70521MqReturnSw = getStartOffset() + 5;	// set offset for serialization
  
             beginIp70521MqTimestamp = getStartOffset() + 6;	// set offset for serialization
  
             beginIp70521QmgrName = getStartOffset() + 32;	// set offset for serialization
  
             beginIp70521QName = getStartOffset() + 80;	// set offset for serialization
  
             beginIp70521TargetQmgrName = getStartOffset() + 128;	// set offset for serialization
  
             beginIp70521TargetQName = getStartOffset() + 176;	// set offset for serialization
  
             beginIp70521Hconn = getStartOffset() + 224;	// set offset for serialization
  
             beginIp70521Hobj = getStartOffset() + 228;	// set offset for serialization
  
             beginIp70521CompCd = getStartOffset() + 232;	// set offset for serialization
  
             beginIp70521ResnCd = getStartOffset() + 236;	// set offset for serialization
  
             beginIp70521Options = getStartOffset() + 240;	// set offset for serialization
  
             beginIp70521DataLength = getStartOffset() + 244;	// set offset for serialization
  
             beginIp70521MsgBufferLen = getStartOffset() + 248;	// set offset for serialization
  
             beginIp70521MsgBuffer = getStartOffset() + 252;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp70521RequestCdCounter = -1;
     public boolean isIp70521RequestCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70521RequestCdCounter != sharedCounter;
         localIp70521RequestCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70521_REQUEST_CD_LEN = 4;
	/**
	 * 	serialize this Ip70521RequestCd
	 */
   protected void serializeIp70521RequestCd(char[] ip70521RequestCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70521RequestCd,0,getStringValue(),beginIp70521RequestCd,IP_70521_REQUEST_CD_LEN);
       localIp70521RequestCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70521RequestCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp70521RequestCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70521RequestCd() {	 
   		return (substring(getStringValue(),beginIp70521RequestCd,beginIp70521RequestCd + IP_70521_REQUEST_CD_LEN));
   	}
     int localIp70521MqBypassSwCounter = -1;
     public boolean isIp70521MqBypassSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70521MqBypassSwCounter != sharedCounter;
         localIp70521MqBypassSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70521_MQ_BYPASS_SW_LEN = 1;
	/**
	 * 	serialize this Ip70521MqBypassSw
	 */
   protected void serializeIp70521MqBypassSw(char[] ip70521MqBypassSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70521MqBypassSw,0,getStringValue(),beginIp70521MqBypassSw,IP_70521_MQ_BYPASS_SW_LEN);
       localIp70521MqBypassSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70521MqBypassSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp70521MqBypassSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70521MqBypassSw() {	 
   		return (substring(getStringValue(),beginIp70521MqBypassSw,beginIp70521MqBypassSw + IP_70521_MQ_BYPASS_SW_LEN));
   	}
     int localIp70521MqReturnSwCounter = -1;
     public boolean isIp70521MqReturnSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70521MqReturnSwCounter != sharedCounter;
         localIp70521MqReturnSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70521_MQ_RETURN_SW_LEN = 1;
	/**
	 * 	serialize this Ip70521MqReturnSw
	 */
   protected void serializeIp70521MqReturnSw(char[] ip70521MqReturnSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70521MqReturnSw,0,getStringValue(),beginIp70521MqReturnSw,IP_70521_MQ_RETURN_SW_LEN);
       localIp70521MqReturnSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70521MqReturnSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp70521MqReturnSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70521MqReturnSw() {	 
   		return (substring(getStringValue(),beginIp70521MqReturnSw,beginIp70521MqReturnSw + IP_70521_MQ_RETURN_SW_LEN));
   	}
     int localIp70521MqTimestampCounter = -1;
     public boolean isIp70521MqTimestampModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70521MqTimestampCounter != sharedCounter;
         localIp70521MqTimestampCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70521_MQ_TIMESTAMP_LEN = 26;
	/**
	 * 	serialize this Ip70521MqTimestamp
	 */
   protected void serializeIp70521MqTimestamp(char[] ip70521MqTimestamp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70521MqTimestamp,0,getStringValue(),beginIp70521MqTimestamp,IP_70521_MQ_TIMESTAMP_LEN);
       localIp70521MqTimestampCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70521MqTimestampConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshIp70521MqTimestamp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70521MqTimestamp() {	 
   		return (substring(getStringValue(),beginIp70521MqTimestamp,beginIp70521MqTimestamp + IP_70521_MQ_TIMESTAMP_LEN));
   	}
     int localIp70521QmgrNameCounter = -1;
     public boolean isIp70521QmgrNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70521QmgrNameCounter != sharedCounter;
         localIp70521QmgrNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70521_QMGR_NAME_LEN = 48;
	/**
	 * 	serialize this Ip70521QmgrName
	 */
   protected void serializeIp70521QmgrName(char[] ip70521QmgrName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70521QmgrName,0,getStringValue(),beginIp70521QmgrName,IP_70521_QMGR_NAME_LEN);
       localIp70521QmgrNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70521QmgrNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp70521QmgrName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70521QmgrName() {	 
   		return (substring(getStringValue(),beginIp70521QmgrName,beginIp70521QmgrName + IP_70521_QMGR_NAME_LEN));
   	}
     int localIp70521QNameCounter = -1;
     public boolean isIp70521QNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70521QNameCounter != sharedCounter;
         localIp70521QNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70521_QNAME_LEN = 48;
	/**
	 * 	serialize this Ip70521QName
	 */
   protected void serializeIp70521QName(char[] ip70521QName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70521QName,0,getStringValue(),beginIp70521QName,IP_70521_QNAME_LEN);
       localIp70521QNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70521QNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp70521QName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70521QName() {	 
   		return (substring(getStringValue(),beginIp70521QName,beginIp70521QName + IP_70521_QNAME_LEN));
   	}
     int localIp70521TargetQmgrNameCounter = -1;
     public boolean isIp70521TargetQmgrNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70521TargetQmgrNameCounter != sharedCounter;
         localIp70521TargetQmgrNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70521_TARGET_QMGR_NAME_LEN = 48;
	/**
	 * 	serialize this Ip70521TargetQmgrName
	 */
   protected void serializeIp70521TargetQmgrName(char[] ip70521TargetQmgrName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70521TargetQmgrName,0,getStringValue(),beginIp70521TargetQmgrName,IP_70521_TARGET_QMGR_NAME_LEN);
       localIp70521TargetQmgrNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70521TargetQmgrNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp70521TargetQmgrName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70521TargetQmgrName() {	 
   		return (substring(getStringValue(),beginIp70521TargetQmgrName,beginIp70521TargetQmgrName + IP_70521_TARGET_QMGR_NAME_LEN));
   	}
     int localIp70521TargetQNameCounter = -1;
     public boolean isIp70521TargetQNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70521TargetQNameCounter != sharedCounter;
         localIp70521TargetQNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70521_TARGET_QNAME_LEN = 48;
	/**
	 * 	serialize this Ip70521TargetQName
	 */
   protected void serializeIp70521TargetQName(char[] ip70521TargetQName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70521TargetQName,0,getStringValue(),beginIp70521TargetQName,IP_70521_TARGET_QNAME_LEN);
       localIp70521TargetQNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70521TargetQNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp70521TargetQName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70521TargetQName() {	 
   		return (substring(getStringValue(),beginIp70521TargetQName,beginIp70521TargetQName + IP_70521_TARGET_QNAME_LEN));
   	}
         int localIp70521HconnCounter = -1;
         public boolean isIp70521HconnModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp70521HconnCounter != sharedCounter;
            localIp70521HconnCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_70521_HCONN_LEN = 4;
  	/**
	 * serializeIp70521Hconn
	 */
	protected void serializeIp70521Hconn(int ip70521Hconn) {
           replaceValue( //  save the value as string
                   getBinaryString( ip70521Hconn,IP_70521_HCONN_LEN)
                  ,beginIp70521Hconn
                  ,IP_70521_HCONN_LEN
                 );
            localIp70521HconnCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp70521HconnMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp70521Hconn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp70521Hconn() {	 
			return (getInt(beginIp70521Hconn));
   	}
         int localIp70521HobjCounter = -1;
         public boolean isIp70521HobjModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp70521HobjCounter != sharedCounter;
            localIp70521HobjCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_70521_HOBJ_LEN = 4;
  	/**
	 * serializeIp70521Hobj
	 */
	protected void serializeIp70521Hobj(int ip70521Hobj) {
           replaceValue( //  save the value as string
                   getBinaryString( ip70521Hobj,IP_70521_HOBJ_LEN)
                  ,beginIp70521Hobj
                  ,IP_70521_HOBJ_LEN
                 );
            localIp70521HobjCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp70521HobjMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp70521Hobj is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp70521Hobj() {	 
			return (getInt(beginIp70521Hobj));
   	}
         int localIp70521CompCdCounter = -1;
         public boolean isIp70521CompCdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp70521CompCdCounter != sharedCounter;
            localIp70521CompCdCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_70521_COMP_CD_LEN = 4;
  	/**
	 * serializeIp70521CompCd
	 */
	protected void serializeIp70521CompCd(int ip70521CompCd) {
           replaceValue( //  save the value as string
                   getBinaryString( ip70521CompCd,IP_70521_COMP_CD_LEN)
                  ,beginIp70521CompCd
                  ,IP_70521_COMP_CD_LEN
                 );
            localIp70521CompCdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp70521CompCdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp70521CompCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp70521CompCd() {	 
			return (getInt(beginIp70521CompCd));
   	}
         int localIp70521ResnCdCounter = -1;
         public boolean isIp70521ResnCdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp70521ResnCdCounter != sharedCounter;
            localIp70521ResnCdCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_70521_RESN_CD_LEN = 4;
  	/**
	 * serializeIp70521ResnCd
	 */
	protected void serializeIp70521ResnCd(int ip70521ResnCd) {
           replaceValue( //  save the value as string
                   getBinaryString( ip70521ResnCd,IP_70521_RESN_CD_LEN)
                  ,beginIp70521ResnCd
                  ,IP_70521_RESN_CD_LEN
                 );
            localIp70521ResnCdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp70521ResnCdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp70521ResnCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp70521ResnCd() {	 
			return (getInt(beginIp70521ResnCd));
   	}
         int localIp70521OptionsCounter = -1;
         public boolean isIp70521OptionsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp70521OptionsCounter != sharedCounter;
            localIp70521OptionsCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_70521_OPTIONS_LEN = 4;
  	/**
	 * serializeIp70521Options
	 */
	protected void serializeIp70521Options(int ip70521Options) {
           replaceValue( //  save the value as string
                   getBinaryString( ip70521Options,IP_70521_OPTIONS_LEN)
                  ,beginIp70521Options
                  ,IP_70521_OPTIONS_LEN
                 );
            localIp70521OptionsCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp70521OptionsMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp70521Options is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp70521Options() {	 
			return (getInt(beginIp70521Options));
   	}
         int localIp70521DataLengthCounter = -1;
         public boolean isIp70521DataLengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp70521DataLengthCounter != sharedCounter;
            localIp70521DataLengthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_70521_DATA_LENGTH_LEN = 4;
  	/**
	 * serializeIp70521DataLength
	 */
	protected void serializeIp70521DataLength(int ip70521DataLength) {
           replaceValue( //  save the value as string
                   getBinaryString( ip70521DataLength,IP_70521_DATA_LENGTH_LEN)
                  ,beginIp70521DataLength
                  ,IP_70521_DATA_LENGTH_LEN
                 );
            localIp70521DataLengthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp70521DataLengthMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp70521DataLength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp70521DataLength() {	 
			return (getInt(beginIp70521DataLength));
   	}
         int localIp70521MsgBufferLenCounter = -1;
         public boolean isIp70521MsgBufferLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp70521MsgBufferLenCounter != sharedCounter;
            localIp70521MsgBufferLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_70521_MSG_BUFFER_LEN_LEN = 4;
  	/**
	 * serializeIp70521MsgBufferLen
	 */
	protected void serializeIp70521MsgBufferLen(int ip70521MsgBufferLen) {
           replaceValue( //  save the value as string
                   getBinaryString( ip70521MsgBufferLen,IP_70521_MSG_BUFFER_LEN_LEN)
                  ,beginIp70521MsgBufferLen
                  ,IP_70521_MSG_BUFFER_LEN_LEN
                 );
            localIp70521MsgBufferLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp70521MsgBufferLenMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp70521MsgBufferLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp70521MsgBufferLen() {	 
			return (getInt(beginIp70521MsgBufferLen));
   	}
     int localIp70521MsgBufferCounter = -1;
     public boolean isIp70521MsgBufferModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70521MsgBufferCounter != sharedCounter;
         localIp70521MsgBufferCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70521_MSG_BUFFER_LEN = 4000000;
	/**
	 * 	serialize this Ip70521MsgBuffer
	 */
   protected void serializeIp70521MsgBuffer(char[] ip70521MsgBuffer) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70521MsgBuffer,0,getStringValue(),beginIp70521MsgBuffer,IP_70521_MSG_BUFFER_LEN);
       localIp70521MsgBufferCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70521MsgBufferConstraints(char[] value) {
   			return super.checkConstraints(value , 4000000 ,false, false);
   }
    /**
	 *	refreshIp70521MsgBuffer is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70521MsgBuffer() {	 
   		return (substring(getStringValue(),beginIp70521MsgBuffer,beginIp70521MsgBuffer + IP_70521_MSG_BUFFER_LEN));
   	}




}
  

package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip7052pm2MqApiLayoutSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip7052pm2MqApiLayoutSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip7052pm2MqApiLayoutSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_7052PM_2_MQ_API_LAYOUT_LENGTH = 4000268;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp7052pm2RequestCd;
            protected  int beginIp7052pm2MqBypassSw;
            protected  int beginIp7052pm2MqReturnSw;
            protected  int beginIp7052pm2MqTimestamp;
            protected  int beginIp7052pm2QmgrName;
            protected  int beginIp7052pm2QName;
            protected  int beginIp7052pm2TargetQmgrName;
            protected  int beginIp7052pm2TargetQName;
            protected  int beginIp7052pm2Hconn;
            protected  int beginIp7052pm2Hobj;
            protected  int beginIp7052pm2CompCd;
            protected  int beginIp7052pm2ResnCd;
            protected  int beginIp7052pm2Options;
            protected  int beginIp7052pm2DataLength;
            protected  int beginIp7052pm2MsgBufferLen;
            protected  int beginIp7052pm2MsgBuffer;
	
	/**
	* Constructor for Ip7052pm2MqApiLayoutSerialized
	**/
    public Ip7052pm2MqApiLayoutSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip7052pm2MqApiLayoutSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_7052PM_2_MQ_API_LAYOUT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp7052pm2RequestCd = getStartOffset() + 0;	// set offset for serialization
  
             beginIp7052pm2MqBypassSw = getStartOffset() + 4;	// set offset for serialization
  
             beginIp7052pm2MqReturnSw = getStartOffset() + 5;	// set offset for serialization
  
             beginIp7052pm2MqTimestamp = getStartOffset() + 6;	// set offset for serialization
  
             beginIp7052pm2QmgrName = getStartOffset() + 32;	// set offset for serialization
  
             beginIp7052pm2QName = getStartOffset() + 80;	// set offset for serialization
  
             beginIp7052pm2TargetQmgrName = getStartOffset() + 128;	// set offset for serialization
  
             beginIp7052pm2TargetQName = getStartOffset() + 176;	// set offset for serialization
  
             beginIp7052pm2Hconn = getStartOffset() + 224;	// set offset for serialization
  
             beginIp7052pm2Hobj = getStartOffset() + 228;	// set offset for serialization
  
             beginIp7052pm2CompCd = getStartOffset() + 232;	// set offset for serialization
  
             beginIp7052pm2ResnCd = getStartOffset() + 236;	// set offset for serialization
  
             beginIp7052pm2Options = getStartOffset() + 240;	// set offset for serialization
  
             beginIp7052pm2DataLength = getStartOffset() + 244;	// set offset for serialization
  
             beginIp7052pm2MsgBufferLen = getStartOffset() + 248;	// set offset for serialization
  
             beginIp7052pm2MsgBuffer = getStartOffset() + 252;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp7052pm2RequestCdCounter = -1;
     public boolean isIp7052pm2RequestCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052pm2RequestCdCounter != sharedCounter;
         localIp7052pm2RequestCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052PM_2_REQUEST_CD_LEN = 4;
	/**
	 * 	serialize this Ip7052pm2RequestCd
	 */
   protected void serializeIp7052pm2RequestCd(char[] ip7052pm2RequestCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052pm2RequestCd,0,getStringValue(),beginIp7052pm2RequestCd,IP_7052PM_2_REQUEST_CD_LEN);
       localIp7052pm2RequestCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052pm2RequestCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp7052pm2RequestCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052pm2RequestCd() {	 
   		return (substring(getStringValue(),beginIp7052pm2RequestCd,beginIp7052pm2RequestCd + IP_7052PM_2_REQUEST_CD_LEN));
   	}
     int localIp7052pm2MqBypassSwCounter = -1;
     public boolean isIp7052pm2MqBypassSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052pm2MqBypassSwCounter != sharedCounter;
         localIp7052pm2MqBypassSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052PM_2_MQ_BYPASS_SW_LEN = 1;
	/**
	 * 	serialize this Ip7052pm2MqBypassSw
	 */
   protected void serializeIp7052pm2MqBypassSw(char[] ip7052pm2MqBypassSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052pm2MqBypassSw,0,getStringValue(),beginIp7052pm2MqBypassSw,IP_7052PM_2_MQ_BYPASS_SW_LEN);
       localIp7052pm2MqBypassSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052pm2MqBypassSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp7052pm2MqBypassSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052pm2MqBypassSw() {	 
   		return (substring(getStringValue(),beginIp7052pm2MqBypassSw,beginIp7052pm2MqBypassSw + IP_7052PM_2_MQ_BYPASS_SW_LEN));
   	}
     int localIp7052pm2MqReturnSwCounter = -1;
     public boolean isIp7052pm2MqReturnSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052pm2MqReturnSwCounter != sharedCounter;
         localIp7052pm2MqReturnSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052PM_2_MQ_RETURN_SW_LEN = 1;
	/**
	 * 	serialize this Ip7052pm2MqReturnSw
	 */
   protected void serializeIp7052pm2MqReturnSw(char[] ip7052pm2MqReturnSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052pm2MqReturnSw,0,getStringValue(),beginIp7052pm2MqReturnSw,IP_7052PM_2_MQ_RETURN_SW_LEN);
       localIp7052pm2MqReturnSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052pm2MqReturnSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp7052pm2MqReturnSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052pm2MqReturnSw() {	 
   		return (substring(getStringValue(),beginIp7052pm2MqReturnSw,beginIp7052pm2MqReturnSw + IP_7052PM_2_MQ_RETURN_SW_LEN));
   	}
     int localIp7052pm2MqTimestampCounter = -1;
     public boolean isIp7052pm2MqTimestampModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052pm2MqTimestampCounter != sharedCounter;
         localIp7052pm2MqTimestampCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052PM_2_MQ_TIMESTAMP_LEN = 26;
	/**
	 * 	serialize this Ip7052pm2MqTimestamp
	 */
   protected void serializeIp7052pm2MqTimestamp(char[] ip7052pm2MqTimestamp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052pm2MqTimestamp,0,getStringValue(),beginIp7052pm2MqTimestamp,IP_7052PM_2_MQ_TIMESTAMP_LEN);
       localIp7052pm2MqTimestampCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052pm2MqTimestampConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshIp7052pm2MqTimestamp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052pm2MqTimestamp() {	 
   		return (substring(getStringValue(),beginIp7052pm2MqTimestamp,beginIp7052pm2MqTimestamp + IP_7052PM_2_MQ_TIMESTAMP_LEN));
   	}
     int localIp7052pm2QmgrNameCounter = -1;
     public boolean isIp7052pm2QmgrNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052pm2QmgrNameCounter != sharedCounter;
         localIp7052pm2QmgrNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052PM_2_QMGR_NAME_LEN = 48;
	/**
	 * 	serialize this Ip7052pm2QmgrName
	 */
   protected void serializeIp7052pm2QmgrName(char[] ip7052pm2QmgrName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052pm2QmgrName,0,getStringValue(),beginIp7052pm2QmgrName,IP_7052PM_2_QMGR_NAME_LEN);
       localIp7052pm2QmgrNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052pm2QmgrNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp7052pm2QmgrName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052pm2QmgrName() {	 
   		return (substring(getStringValue(),beginIp7052pm2QmgrName,beginIp7052pm2QmgrName + IP_7052PM_2_QMGR_NAME_LEN));
   	}
     int localIp7052pm2QNameCounter = -1;
     public boolean isIp7052pm2QNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052pm2QNameCounter != sharedCounter;
         localIp7052pm2QNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052PM_2_QNAME_LEN = 48;
	/**
	 * 	serialize this Ip7052pm2QName
	 */
   protected void serializeIp7052pm2QName(char[] ip7052pm2QName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052pm2QName,0,getStringValue(),beginIp7052pm2QName,IP_7052PM_2_QNAME_LEN);
       localIp7052pm2QNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052pm2QNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp7052pm2QName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052pm2QName() {	 
   		return (substring(getStringValue(),beginIp7052pm2QName,beginIp7052pm2QName + IP_7052PM_2_QNAME_LEN));
   	}
     int localIp7052pm2TargetQmgrNameCounter = -1;
     public boolean isIp7052pm2TargetQmgrNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052pm2TargetQmgrNameCounter != sharedCounter;
         localIp7052pm2TargetQmgrNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052PM_2_TARGET_QMGR_NAME_LEN = 48;
	/**
	 * 	serialize this Ip7052pm2TargetQmgrName
	 */
   protected void serializeIp7052pm2TargetQmgrName(char[] ip7052pm2TargetQmgrName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052pm2TargetQmgrName,0,getStringValue(),beginIp7052pm2TargetQmgrName,IP_7052PM_2_TARGET_QMGR_NAME_LEN);
       localIp7052pm2TargetQmgrNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052pm2TargetQmgrNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp7052pm2TargetQmgrName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052pm2TargetQmgrName() {	 
   		return (substring(getStringValue(),beginIp7052pm2TargetQmgrName,beginIp7052pm2TargetQmgrName + IP_7052PM_2_TARGET_QMGR_NAME_LEN));
   	}
     int localIp7052pm2TargetQNameCounter = -1;
     public boolean isIp7052pm2TargetQNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052pm2TargetQNameCounter != sharedCounter;
         localIp7052pm2TargetQNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052PM_2_TARGET_QNAME_LEN = 48;
	/**
	 * 	serialize this Ip7052pm2TargetQName
	 */
   protected void serializeIp7052pm2TargetQName(char[] ip7052pm2TargetQName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052pm2TargetQName,0,getStringValue(),beginIp7052pm2TargetQName,IP_7052PM_2_TARGET_QNAME_LEN);
       localIp7052pm2TargetQNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052pm2TargetQNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp7052pm2TargetQName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052pm2TargetQName() {	 
   		return (substring(getStringValue(),beginIp7052pm2TargetQName,beginIp7052pm2TargetQName + IP_7052PM_2_TARGET_QNAME_LEN));
   	}
         int localIp7052pm2HconnCounter = -1;
         public boolean isIp7052pm2HconnModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp7052pm2HconnCounter != sharedCounter;
            localIp7052pm2HconnCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_7052PM_2_HCONN_LEN = 4;
  	/**
	 * serializeIp7052pm2Hconn
	 */
	protected void serializeIp7052pm2Hconn(int ip7052pm2Hconn) {
           replaceValue( //  save the value as string
                   getBinaryString( ip7052pm2Hconn,IP_7052PM_2_HCONN_LEN)
                  ,beginIp7052pm2Hconn
                  ,IP_7052PM_2_HCONN_LEN
                 );
            localIp7052pm2HconnCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp7052pm2HconnMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp7052pm2Hconn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp7052pm2Hconn() {	 
			return (getInt(beginIp7052pm2Hconn));
   	}
         int localIp7052pm2HobjCounter = -1;
         public boolean isIp7052pm2HobjModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp7052pm2HobjCounter != sharedCounter;
            localIp7052pm2HobjCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_7052PM_2_HOBJ_LEN = 4;
  	/**
	 * serializeIp7052pm2Hobj
	 */
	protected void serializeIp7052pm2Hobj(int ip7052pm2Hobj) {
           replaceValue( //  save the value as string
                   getBinaryString( ip7052pm2Hobj,IP_7052PM_2_HOBJ_LEN)
                  ,beginIp7052pm2Hobj
                  ,IP_7052PM_2_HOBJ_LEN
                 );
            localIp7052pm2HobjCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp7052pm2HobjMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp7052pm2Hobj is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp7052pm2Hobj() {	 
			return (getInt(beginIp7052pm2Hobj));
   	}
         int localIp7052pm2CompCdCounter = -1;
         public boolean isIp7052pm2CompCdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp7052pm2CompCdCounter != sharedCounter;
            localIp7052pm2CompCdCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_7052PM_2_COMP_CD_LEN = 4;
  	/**
	 * serializeIp7052pm2CompCd
	 */
	protected void serializeIp7052pm2CompCd(int ip7052pm2CompCd) {
           replaceValue( //  save the value as string
                   getBinaryString( ip7052pm2CompCd,IP_7052PM_2_COMP_CD_LEN)
                  ,beginIp7052pm2CompCd
                  ,IP_7052PM_2_COMP_CD_LEN
                 );
            localIp7052pm2CompCdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp7052pm2CompCdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp7052pm2CompCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp7052pm2CompCd() {	 
			return (getInt(beginIp7052pm2CompCd));
   	}
         int localIp7052pm2ResnCdCounter = -1;
         public boolean isIp7052pm2ResnCdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp7052pm2ResnCdCounter != sharedCounter;
            localIp7052pm2ResnCdCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_7052PM_2_RESN_CD_LEN = 4;
  	/**
	 * serializeIp7052pm2ResnCd
	 */
	protected void serializeIp7052pm2ResnCd(int ip7052pm2ResnCd) {
           replaceValue( //  save the value as string
                   getBinaryString( ip7052pm2ResnCd,IP_7052PM_2_RESN_CD_LEN)
                  ,beginIp7052pm2ResnCd
                  ,IP_7052PM_2_RESN_CD_LEN
                 );
            localIp7052pm2ResnCdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp7052pm2ResnCdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp7052pm2ResnCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp7052pm2ResnCd() {	 
			return (getInt(beginIp7052pm2ResnCd));
   	}
         int localIp7052pm2OptionsCounter = -1;
         public boolean isIp7052pm2OptionsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp7052pm2OptionsCounter != sharedCounter;
            localIp7052pm2OptionsCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_7052PM_2_OPTIONS_LEN = 4;
  	/**
	 * serializeIp7052pm2Options
	 */
	protected void serializeIp7052pm2Options(int ip7052pm2Options) {
           replaceValue( //  save the value as string
                   getBinaryString( ip7052pm2Options,IP_7052PM_2_OPTIONS_LEN)
                  ,beginIp7052pm2Options
                  ,IP_7052PM_2_OPTIONS_LEN
                 );
            localIp7052pm2OptionsCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp7052pm2OptionsMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp7052pm2Options is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp7052pm2Options() {	 
			return (getInt(beginIp7052pm2Options));
   	}
         int localIp7052pm2DataLengthCounter = -1;
         public boolean isIp7052pm2DataLengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp7052pm2DataLengthCounter != sharedCounter;
            localIp7052pm2DataLengthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_7052PM_2_DATA_LENGTH_LEN = 4;
  	/**
	 * serializeIp7052pm2DataLength
	 */
	protected void serializeIp7052pm2DataLength(int ip7052pm2DataLength) {
           replaceValue( //  save the value as string
                   getBinaryString( ip7052pm2DataLength,IP_7052PM_2_DATA_LENGTH_LEN)
                  ,beginIp7052pm2DataLength
                  ,IP_7052PM_2_DATA_LENGTH_LEN
                 );
            localIp7052pm2DataLengthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp7052pm2DataLengthMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp7052pm2DataLength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp7052pm2DataLength() {	 
			return (getInt(beginIp7052pm2DataLength));
   	}
         int localIp7052pm2MsgBufferLenCounter = -1;
         public boolean isIp7052pm2MsgBufferLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp7052pm2MsgBufferLenCounter != sharedCounter;
            localIp7052pm2MsgBufferLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_7052PM_2_MSG_BUFFER_LEN_LEN = 4;
  	/**
	 * serializeIp7052pm2MsgBufferLen
	 */
	protected void serializeIp7052pm2MsgBufferLen(int ip7052pm2MsgBufferLen) {
           replaceValue( //  save the value as string
                   getBinaryString( ip7052pm2MsgBufferLen,IP_7052PM_2_MSG_BUFFER_LEN_LEN)
                  ,beginIp7052pm2MsgBufferLen
                  ,IP_7052PM_2_MSG_BUFFER_LEN_LEN
                 );
            localIp7052pm2MsgBufferLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp7052pm2MsgBufferLenMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp7052pm2MsgBufferLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp7052pm2MsgBufferLen() {	 
			return (getInt(beginIp7052pm2MsgBufferLen));
   	}
     int localIp7052pm2MsgBufferCounter = -1;
     public boolean isIp7052pm2MsgBufferModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052pm2MsgBufferCounter != sharedCounter;
         localIp7052pm2MsgBufferCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052PM_2_MSG_BUFFER_LEN = 4000000;
	/**
	 * 	serialize this Ip7052pm2MsgBuffer
	 */
   protected void serializeIp7052pm2MsgBuffer(char[] ip7052pm2MsgBuffer) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052pm2MsgBuffer,0,getStringValue(),beginIp7052pm2MsgBuffer,IP_7052PM_2_MSG_BUFFER_LEN);
       localIp7052pm2MsgBufferCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052pm2MsgBufferConstraints(char[] value) {
   			return super.checkConstraints(value , 4000000 ,false, false);
   }
    /**
	 *	refreshIp7052pm2MsgBuffer is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052pm2MsgBuffer() {	 
   		return (substring(getStringValue(),beginIp7052pm2MsgBuffer,beginIp7052pm2MsgBuffer + IP_7052PM_2_MSG_BUFFER_LEN));
   	}




}
  

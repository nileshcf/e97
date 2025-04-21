package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip7052f4MqApiLayoutSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip7052f4MqApiLayoutSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip7052f4MqApiLayoutSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_7052F_4_MQ_API_LAYOUT_LENGTH = 4000268;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp7052f4RequestCd;
            protected  int beginIp7052f4MqBypassSw;
            protected  int beginIp7052f4MqReturnSw;
            protected  int beginIp7052f4MqTimestamp;
            protected  int beginIp7052f4QmgrName;
            protected  int beginIp7052f4QName;
            protected  int beginIp7052f4TargetQmgrName;
            protected  int beginIp7052f4TargetQName;
            protected  int beginIp7052f4Hconn;
            protected  int beginIp7052f4Hobj;
            protected  int beginIp7052f4CompCd;
            protected  int beginIp7052f4ResnCd;
            protected  int beginIp7052f4Options;
            protected  int beginIp7052f4DataLength;
            protected  int beginIp7052f4MsgBufferLen;
            protected  int beginIp7052f4MsgBuffer;
	
	/**
	* Constructor for Ip7052f4MqApiLayoutSerialized
	**/
    public Ip7052f4MqApiLayoutSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip7052f4MqApiLayoutSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_7052F_4_MQ_API_LAYOUT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp7052f4RequestCd = getStartOffset() + 0;	// set offset for serialization
  
             beginIp7052f4MqBypassSw = getStartOffset() + 4;	// set offset for serialization
  
             beginIp7052f4MqReturnSw = getStartOffset() + 5;	// set offset for serialization
  
             beginIp7052f4MqTimestamp = getStartOffset() + 6;	// set offset for serialization
  
             beginIp7052f4QmgrName = getStartOffset() + 32;	// set offset for serialization
  
             beginIp7052f4QName = getStartOffset() + 80;	// set offset for serialization
  
             beginIp7052f4TargetQmgrName = getStartOffset() + 128;	// set offset for serialization
  
             beginIp7052f4TargetQName = getStartOffset() + 176;	// set offset for serialization
  
             beginIp7052f4Hconn = getStartOffset() + 224;	// set offset for serialization
  
             beginIp7052f4Hobj = getStartOffset() + 228;	// set offset for serialization
  
             beginIp7052f4CompCd = getStartOffset() + 232;	// set offset for serialization
  
             beginIp7052f4ResnCd = getStartOffset() + 236;	// set offset for serialization
  
             beginIp7052f4Options = getStartOffset() + 240;	// set offset for serialization
  
             beginIp7052f4DataLength = getStartOffset() + 244;	// set offset for serialization
  
             beginIp7052f4MsgBufferLen = getStartOffset() + 248;	// set offset for serialization
  
             beginIp7052f4MsgBuffer = getStartOffset() + 252;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp7052f4RequestCdCounter = -1;
     public boolean isIp7052f4RequestCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052f4RequestCdCounter != sharedCounter;
         localIp7052f4RequestCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052F_4_REQUEST_CD_LEN = 4;
	/**
	 * 	serialize this Ip7052f4RequestCd
	 */
   protected void serializeIp7052f4RequestCd(char[] ip7052f4RequestCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052f4RequestCd,0,getStringValue(),beginIp7052f4RequestCd,IP_7052F_4_REQUEST_CD_LEN);
       localIp7052f4RequestCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052f4RequestCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp7052f4RequestCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052f4RequestCd() {	 
   		return (substring(getStringValue(),beginIp7052f4RequestCd,beginIp7052f4RequestCd + IP_7052F_4_REQUEST_CD_LEN));
   	}
     int localIp7052f4MqBypassSwCounter = -1;
     public boolean isIp7052f4MqBypassSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052f4MqBypassSwCounter != sharedCounter;
         localIp7052f4MqBypassSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052F_4_MQ_BYPASS_SW_LEN = 1;
	/**
	 * 	serialize this Ip7052f4MqBypassSw
	 */
   protected void serializeIp7052f4MqBypassSw(char[] ip7052f4MqBypassSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052f4MqBypassSw,0,getStringValue(),beginIp7052f4MqBypassSw,IP_7052F_4_MQ_BYPASS_SW_LEN);
       localIp7052f4MqBypassSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052f4MqBypassSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp7052f4MqBypassSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052f4MqBypassSw() {	 
   		return (substring(getStringValue(),beginIp7052f4MqBypassSw,beginIp7052f4MqBypassSw + IP_7052F_4_MQ_BYPASS_SW_LEN));
   	}
     int localIp7052f4MqReturnSwCounter = -1;
     public boolean isIp7052f4MqReturnSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052f4MqReturnSwCounter != sharedCounter;
         localIp7052f4MqReturnSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052F_4_MQ_RETURN_SW_LEN = 1;
	/**
	 * 	serialize this Ip7052f4MqReturnSw
	 */
   protected void serializeIp7052f4MqReturnSw(char[] ip7052f4MqReturnSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052f4MqReturnSw,0,getStringValue(),beginIp7052f4MqReturnSw,IP_7052F_4_MQ_RETURN_SW_LEN);
       localIp7052f4MqReturnSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052f4MqReturnSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp7052f4MqReturnSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052f4MqReturnSw() {	 
   		return (substring(getStringValue(),beginIp7052f4MqReturnSw,beginIp7052f4MqReturnSw + IP_7052F_4_MQ_RETURN_SW_LEN));
   	}
     int localIp7052f4MqTimestampCounter = -1;
     public boolean isIp7052f4MqTimestampModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052f4MqTimestampCounter != sharedCounter;
         localIp7052f4MqTimestampCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052F_4_MQ_TIMESTAMP_LEN = 26;
	/**
	 * 	serialize this Ip7052f4MqTimestamp
	 */
   protected void serializeIp7052f4MqTimestamp(char[] ip7052f4MqTimestamp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052f4MqTimestamp,0,getStringValue(),beginIp7052f4MqTimestamp,IP_7052F_4_MQ_TIMESTAMP_LEN);
       localIp7052f4MqTimestampCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052f4MqTimestampConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshIp7052f4MqTimestamp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052f4MqTimestamp() {	 
   		return (substring(getStringValue(),beginIp7052f4MqTimestamp,beginIp7052f4MqTimestamp + IP_7052F_4_MQ_TIMESTAMP_LEN));
   	}
     int localIp7052f4QmgrNameCounter = -1;
     public boolean isIp7052f4QmgrNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052f4QmgrNameCounter != sharedCounter;
         localIp7052f4QmgrNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052F_4_QMGR_NAME_LEN = 48;
	/**
	 * 	serialize this Ip7052f4QmgrName
	 */
   protected void serializeIp7052f4QmgrName(char[] ip7052f4QmgrName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052f4QmgrName,0,getStringValue(),beginIp7052f4QmgrName,IP_7052F_4_QMGR_NAME_LEN);
       localIp7052f4QmgrNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052f4QmgrNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp7052f4QmgrName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052f4QmgrName() {	 
   		return (substring(getStringValue(),beginIp7052f4QmgrName,beginIp7052f4QmgrName + IP_7052F_4_QMGR_NAME_LEN));
   	}
     int localIp7052f4QNameCounter = -1;
     public boolean isIp7052f4QNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052f4QNameCounter != sharedCounter;
         localIp7052f4QNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052F_4_QNAME_LEN = 48;
	/**
	 * 	serialize this Ip7052f4QName
	 */
   protected void serializeIp7052f4QName(char[] ip7052f4QName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052f4QName,0,getStringValue(),beginIp7052f4QName,IP_7052F_4_QNAME_LEN);
       localIp7052f4QNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052f4QNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp7052f4QName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052f4QName() {	 
   		return (substring(getStringValue(),beginIp7052f4QName,beginIp7052f4QName + IP_7052F_4_QNAME_LEN));
   	}
     int localIp7052f4TargetQmgrNameCounter = -1;
     public boolean isIp7052f4TargetQmgrNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052f4TargetQmgrNameCounter != sharedCounter;
         localIp7052f4TargetQmgrNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052F_4_TARGET_QMGR_NAME_LEN = 48;
	/**
	 * 	serialize this Ip7052f4TargetQmgrName
	 */
   protected void serializeIp7052f4TargetQmgrName(char[] ip7052f4TargetQmgrName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052f4TargetQmgrName,0,getStringValue(),beginIp7052f4TargetQmgrName,IP_7052F_4_TARGET_QMGR_NAME_LEN);
       localIp7052f4TargetQmgrNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052f4TargetQmgrNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp7052f4TargetQmgrName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052f4TargetQmgrName() {	 
   		return (substring(getStringValue(),beginIp7052f4TargetQmgrName,beginIp7052f4TargetQmgrName + IP_7052F_4_TARGET_QMGR_NAME_LEN));
   	}
     int localIp7052f4TargetQNameCounter = -1;
     public boolean isIp7052f4TargetQNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052f4TargetQNameCounter != sharedCounter;
         localIp7052f4TargetQNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052F_4_TARGET_QNAME_LEN = 48;
	/**
	 * 	serialize this Ip7052f4TargetQName
	 */
   protected void serializeIp7052f4TargetQName(char[] ip7052f4TargetQName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052f4TargetQName,0,getStringValue(),beginIp7052f4TargetQName,IP_7052F_4_TARGET_QNAME_LEN);
       localIp7052f4TargetQNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052f4TargetQNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp7052f4TargetQName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052f4TargetQName() {	 
   		return (substring(getStringValue(),beginIp7052f4TargetQName,beginIp7052f4TargetQName + IP_7052F_4_TARGET_QNAME_LEN));
   	}
         int localIp7052f4HconnCounter = -1;
         public boolean isIp7052f4HconnModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp7052f4HconnCounter != sharedCounter;
            localIp7052f4HconnCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_7052F_4_HCONN_LEN = 4;
  	/**
	 * serializeIp7052f4Hconn
	 */
	protected void serializeIp7052f4Hconn(int ip7052f4Hconn) {
           replaceValue( //  save the value as string
                   getBinaryString( ip7052f4Hconn,IP_7052F_4_HCONN_LEN)
                  ,beginIp7052f4Hconn
                  ,IP_7052F_4_HCONN_LEN
                 );
            localIp7052f4HconnCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp7052f4HconnMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp7052f4Hconn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp7052f4Hconn() {	 
			return (getInt(beginIp7052f4Hconn));
   	}
         int localIp7052f4HobjCounter = -1;
         public boolean isIp7052f4HobjModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp7052f4HobjCounter != sharedCounter;
            localIp7052f4HobjCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_7052F_4_HOBJ_LEN = 4;
  	/**
	 * serializeIp7052f4Hobj
	 */
	protected void serializeIp7052f4Hobj(int ip7052f4Hobj) {
           replaceValue( //  save the value as string
                   getBinaryString( ip7052f4Hobj,IP_7052F_4_HOBJ_LEN)
                  ,beginIp7052f4Hobj
                  ,IP_7052F_4_HOBJ_LEN
                 );
            localIp7052f4HobjCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp7052f4HobjMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp7052f4Hobj is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp7052f4Hobj() {	 
			return (getInt(beginIp7052f4Hobj));
   	}
         int localIp7052f4CompCdCounter = -1;
         public boolean isIp7052f4CompCdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp7052f4CompCdCounter != sharedCounter;
            localIp7052f4CompCdCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_7052F_4_COMP_CD_LEN = 4;
  	/**
	 * serializeIp7052f4CompCd
	 */
	protected void serializeIp7052f4CompCd(int ip7052f4CompCd) {
           replaceValue( //  save the value as string
                   getBinaryString( ip7052f4CompCd,IP_7052F_4_COMP_CD_LEN)
                  ,beginIp7052f4CompCd
                  ,IP_7052F_4_COMP_CD_LEN
                 );
            localIp7052f4CompCdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp7052f4CompCdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp7052f4CompCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp7052f4CompCd() {	 
			return (getInt(beginIp7052f4CompCd));
   	}
         int localIp7052f4ResnCdCounter = -1;
         public boolean isIp7052f4ResnCdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp7052f4ResnCdCounter != sharedCounter;
            localIp7052f4ResnCdCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_7052F_4_RESN_CD_LEN = 4;
  	/**
	 * serializeIp7052f4ResnCd
	 */
	protected void serializeIp7052f4ResnCd(int ip7052f4ResnCd) {
           replaceValue( //  save the value as string
                   getBinaryString( ip7052f4ResnCd,IP_7052F_4_RESN_CD_LEN)
                  ,beginIp7052f4ResnCd
                  ,IP_7052F_4_RESN_CD_LEN
                 );
            localIp7052f4ResnCdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp7052f4ResnCdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp7052f4ResnCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp7052f4ResnCd() {	 
			return (getInt(beginIp7052f4ResnCd));
   	}
         int localIp7052f4OptionsCounter = -1;
         public boolean isIp7052f4OptionsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp7052f4OptionsCounter != sharedCounter;
            localIp7052f4OptionsCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_7052F_4_OPTIONS_LEN = 4;
  	/**
	 * serializeIp7052f4Options
	 */
	protected void serializeIp7052f4Options(int ip7052f4Options) {
           replaceValue( //  save the value as string
                   getBinaryString( ip7052f4Options,IP_7052F_4_OPTIONS_LEN)
                  ,beginIp7052f4Options
                  ,IP_7052F_4_OPTIONS_LEN
                 );
            localIp7052f4OptionsCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp7052f4OptionsMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp7052f4Options is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp7052f4Options() {	 
			return (getInt(beginIp7052f4Options));
   	}
         int localIp7052f4DataLengthCounter = -1;
         public boolean isIp7052f4DataLengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp7052f4DataLengthCounter != sharedCounter;
            localIp7052f4DataLengthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_7052F_4_DATA_LENGTH_LEN = 4;
  	/**
	 * serializeIp7052f4DataLength
	 */
	protected void serializeIp7052f4DataLength(int ip7052f4DataLength) {
           replaceValue( //  save the value as string
                   getBinaryString( ip7052f4DataLength,IP_7052F_4_DATA_LENGTH_LEN)
                  ,beginIp7052f4DataLength
                  ,IP_7052F_4_DATA_LENGTH_LEN
                 );
            localIp7052f4DataLengthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp7052f4DataLengthMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp7052f4DataLength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp7052f4DataLength() {	 
			return (getInt(beginIp7052f4DataLength));
   	}
         int localIp7052f4MsgBufferLenCounter = -1;
         public boolean isIp7052f4MsgBufferLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp7052f4MsgBufferLenCounter != sharedCounter;
            localIp7052f4MsgBufferLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_7052F_4_MSG_BUFFER_LEN_LEN = 4;
  	/**
	 * serializeIp7052f4MsgBufferLen
	 */
	protected void serializeIp7052f4MsgBufferLen(int ip7052f4MsgBufferLen) {
           replaceValue( //  save the value as string
                   getBinaryString( ip7052f4MsgBufferLen,IP_7052F_4_MSG_BUFFER_LEN_LEN)
                  ,beginIp7052f4MsgBufferLen
                  ,IP_7052F_4_MSG_BUFFER_LEN_LEN
                 );
            localIp7052f4MsgBufferLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp7052f4MsgBufferLenMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp7052f4MsgBufferLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp7052f4MsgBufferLen() {	 
			return (getInt(beginIp7052f4MsgBufferLen));
   	}
     int localIp7052f4MsgBufferCounter = -1;
     public boolean isIp7052f4MsgBufferModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052f4MsgBufferCounter != sharedCounter;
         localIp7052f4MsgBufferCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052F_4_MSG_BUFFER_LEN = 4000000;
	/**
	 * 	serialize this Ip7052f4MsgBuffer
	 */
   protected void serializeIp7052f4MsgBuffer(char[] ip7052f4MsgBuffer) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052f4MsgBuffer,0,getStringValue(),beginIp7052f4MsgBuffer,IP_7052F_4_MSG_BUFFER_LEN);
       localIp7052f4MsgBufferCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052f4MsgBufferConstraints(char[] value) {
   			return super.checkConstraints(value , 4000000 ,false, false);
   }
    /**
	 *	refreshIp7052f4MsgBuffer is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052f4MsgBuffer() {	 
   		return (substring(getStringValue(),beginIp7052f4MsgBuffer,beginIp7052f4MsgBuffer + IP_7052F_4_MSG_BUFFER_LEN));
   	}




}
  

package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip7052pmrMqApiLayoutSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:15. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip7052pmrMqApiLayoutSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip7052pmrMqApiLayoutSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_7052PMR_MQ_API_LAYOUT_LENGTH = 4000268;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp7052pmrRequestCd;
            protected  int beginIp7052pmrMqBypassSw;
            protected  int beginIp7052pmrMqReturnSw;
            protected  int beginIp7052pmrMqTimestamp;
            protected  int beginIp7052pmrQmgrName;
            protected  int beginIp7052pmrQName;
            protected  int beginIp7052pmrTargetQmgrName;
            protected  int beginIp7052pmrTargetQName;
            protected  int beginIp7052pmrHconn;
            protected  int beginIp7052pmrHobj;
            protected  int beginIp7052pmrCompCd;
            protected  int beginIp7052pmrResnCd;
            protected  int beginIp7052pmrOptions;
            protected  int beginIp7052pmrDataLength;
            protected  int beginIp7052pmrMsgBufferLen;
            protected  int beginIp7052pmrMsgBuffer;
	
	/**
	* Constructor for Ip7052pmrMqApiLayoutSerialized
	**/
    public Ip7052pmrMqApiLayoutSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip7052pmrMqApiLayoutSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_7052PMR_MQ_API_LAYOUT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp7052pmrRequestCd = getStartOffset() + 0;	// set offset for serialization
  
             beginIp7052pmrMqBypassSw = getStartOffset() + 4;	// set offset for serialization
  
             beginIp7052pmrMqReturnSw = getStartOffset() + 5;	// set offset for serialization
  
             beginIp7052pmrMqTimestamp = getStartOffset() + 6;	// set offset for serialization
  
             beginIp7052pmrQmgrName = getStartOffset() + 32;	// set offset for serialization
  
             beginIp7052pmrQName = getStartOffset() + 80;	// set offset for serialization
  
             beginIp7052pmrTargetQmgrName = getStartOffset() + 128;	// set offset for serialization
  
             beginIp7052pmrTargetQName = getStartOffset() + 176;	// set offset for serialization
  
             beginIp7052pmrHconn = getStartOffset() + 224;	// set offset for serialization
  
             beginIp7052pmrHobj = getStartOffset() + 228;	// set offset for serialization
  
             beginIp7052pmrCompCd = getStartOffset() + 232;	// set offset for serialization
  
             beginIp7052pmrResnCd = getStartOffset() + 236;	// set offset for serialization
  
             beginIp7052pmrOptions = getStartOffset() + 240;	// set offset for serialization
  
             beginIp7052pmrDataLength = getStartOffset() + 244;	// set offset for serialization
  
             beginIp7052pmrMsgBufferLen = getStartOffset() + 248;	// set offset for serialization
  
             beginIp7052pmrMsgBuffer = getStartOffset() + 252;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp7052pmrRequestCdCounter = -1;
     public boolean isIp7052pmrRequestCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052pmrRequestCdCounter != sharedCounter;
         localIp7052pmrRequestCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052PMR_REQUEST_CD_LEN = 4;
	/**
	 * 	serialize this Ip7052pmrRequestCd
	 */
   protected void serializeIp7052pmrRequestCd(char[] ip7052pmrRequestCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052pmrRequestCd,0,getStringValue(),beginIp7052pmrRequestCd,IP_7052PMR_REQUEST_CD_LEN);
       localIp7052pmrRequestCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052pmrRequestCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp7052pmrRequestCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052pmrRequestCd() {	 
   		return (substring(getStringValue(),beginIp7052pmrRequestCd,beginIp7052pmrRequestCd + IP_7052PMR_REQUEST_CD_LEN));
   	}
     int localIp7052pmrMqBypassSwCounter = -1;
     public boolean isIp7052pmrMqBypassSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052pmrMqBypassSwCounter != sharedCounter;
         localIp7052pmrMqBypassSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052PMR_MQ_BYPASS_SW_LEN = 1;
	/**
	 * 	serialize this Ip7052pmrMqBypassSw
	 */
   protected void serializeIp7052pmrMqBypassSw(char[] ip7052pmrMqBypassSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052pmrMqBypassSw,0,getStringValue(),beginIp7052pmrMqBypassSw,IP_7052PMR_MQ_BYPASS_SW_LEN);
       localIp7052pmrMqBypassSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052pmrMqBypassSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp7052pmrMqBypassSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052pmrMqBypassSw() {	 
   		return (substring(getStringValue(),beginIp7052pmrMqBypassSw,beginIp7052pmrMqBypassSw + IP_7052PMR_MQ_BYPASS_SW_LEN));
   	}
     int localIp7052pmrMqReturnSwCounter = -1;
     public boolean isIp7052pmrMqReturnSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052pmrMqReturnSwCounter != sharedCounter;
         localIp7052pmrMqReturnSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052PMR_MQ_RETURN_SW_LEN = 1;
	/**
	 * 	serialize this Ip7052pmrMqReturnSw
	 */
   protected void serializeIp7052pmrMqReturnSw(char[] ip7052pmrMqReturnSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052pmrMqReturnSw,0,getStringValue(),beginIp7052pmrMqReturnSw,IP_7052PMR_MQ_RETURN_SW_LEN);
       localIp7052pmrMqReturnSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052pmrMqReturnSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp7052pmrMqReturnSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052pmrMqReturnSw() {	 
   		return (substring(getStringValue(),beginIp7052pmrMqReturnSw,beginIp7052pmrMqReturnSw + IP_7052PMR_MQ_RETURN_SW_LEN));
   	}
     int localIp7052pmrMqTimestampCounter = -1;
     public boolean isIp7052pmrMqTimestampModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052pmrMqTimestampCounter != sharedCounter;
         localIp7052pmrMqTimestampCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052PMR_MQ_TIMESTAMP_LEN = 26;
	/**
	 * 	serialize this Ip7052pmrMqTimestamp
	 */
   protected void serializeIp7052pmrMqTimestamp(char[] ip7052pmrMqTimestamp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052pmrMqTimestamp,0,getStringValue(),beginIp7052pmrMqTimestamp,IP_7052PMR_MQ_TIMESTAMP_LEN);
       localIp7052pmrMqTimestampCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052pmrMqTimestampConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshIp7052pmrMqTimestamp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052pmrMqTimestamp() {	 
   		return (substring(getStringValue(),beginIp7052pmrMqTimestamp,beginIp7052pmrMqTimestamp + IP_7052PMR_MQ_TIMESTAMP_LEN));
   	}
     int localIp7052pmrQmgrNameCounter = -1;
     public boolean isIp7052pmrQmgrNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052pmrQmgrNameCounter != sharedCounter;
         localIp7052pmrQmgrNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052PMR_QMGR_NAME_LEN = 48;
	/**
	 * 	serialize this Ip7052pmrQmgrName
	 */
   protected void serializeIp7052pmrQmgrName(char[] ip7052pmrQmgrName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052pmrQmgrName,0,getStringValue(),beginIp7052pmrQmgrName,IP_7052PMR_QMGR_NAME_LEN);
       localIp7052pmrQmgrNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052pmrQmgrNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp7052pmrQmgrName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052pmrQmgrName() {	 
   		return (substring(getStringValue(),beginIp7052pmrQmgrName,beginIp7052pmrQmgrName + IP_7052PMR_QMGR_NAME_LEN));
   	}
     int localIp7052pmrQNameCounter = -1;
     public boolean isIp7052pmrQNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052pmrQNameCounter != sharedCounter;
         localIp7052pmrQNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052PMR_QNAME_LEN = 48;
	/**
	 * 	serialize this Ip7052pmrQName
	 */
   protected void serializeIp7052pmrQName(char[] ip7052pmrQName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052pmrQName,0,getStringValue(),beginIp7052pmrQName,IP_7052PMR_QNAME_LEN);
       localIp7052pmrQNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052pmrQNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp7052pmrQName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052pmrQName() {	 
   		return (substring(getStringValue(),beginIp7052pmrQName,beginIp7052pmrQName + IP_7052PMR_QNAME_LEN));
   	}
     int localIp7052pmrTargetQmgrNameCounter = -1;
     public boolean isIp7052pmrTargetQmgrNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052pmrTargetQmgrNameCounter != sharedCounter;
         localIp7052pmrTargetQmgrNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052PMR_TARGET_QMGR_NAME_LEN = 48;
	/**
	 * 	serialize this Ip7052pmrTargetQmgrName
	 */
   protected void serializeIp7052pmrTargetQmgrName(char[] ip7052pmrTargetQmgrName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052pmrTargetQmgrName,0,getStringValue(),beginIp7052pmrTargetQmgrName,IP_7052PMR_TARGET_QMGR_NAME_LEN);
       localIp7052pmrTargetQmgrNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052pmrTargetQmgrNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp7052pmrTargetQmgrName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052pmrTargetQmgrName() {	 
   		return (substring(getStringValue(),beginIp7052pmrTargetQmgrName,beginIp7052pmrTargetQmgrName + IP_7052PMR_TARGET_QMGR_NAME_LEN));
   	}
     int localIp7052pmrTargetQNameCounter = -1;
     public boolean isIp7052pmrTargetQNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052pmrTargetQNameCounter != sharedCounter;
         localIp7052pmrTargetQNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052PMR_TARGET_QNAME_LEN = 48;
	/**
	 * 	serialize this Ip7052pmrTargetQName
	 */
   protected void serializeIp7052pmrTargetQName(char[] ip7052pmrTargetQName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052pmrTargetQName,0,getStringValue(),beginIp7052pmrTargetQName,IP_7052PMR_TARGET_QNAME_LEN);
       localIp7052pmrTargetQNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052pmrTargetQNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp7052pmrTargetQName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052pmrTargetQName() {	 
   		return (substring(getStringValue(),beginIp7052pmrTargetQName,beginIp7052pmrTargetQName + IP_7052PMR_TARGET_QNAME_LEN));
   	}
         int localIp7052pmrHconnCounter = -1;
         public boolean isIp7052pmrHconnModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp7052pmrHconnCounter != sharedCounter;
            localIp7052pmrHconnCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_7052PMR_HCONN_LEN = 4;
  	/**
	 * serializeIp7052pmrHconn
	 */
	protected void serializeIp7052pmrHconn(int ip7052pmrHconn) {
           replaceValue( //  save the value as string
                   getBinaryString( ip7052pmrHconn,IP_7052PMR_HCONN_LEN)
                  ,beginIp7052pmrHconn
                  ,IP_7052PMR_HCONN_LEN
                 );
            localIp7052pmrHconnCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp7052pmrHconnMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp7052pmrHconn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp7052pmrHconn() {	 
			return (getInt(beginIp7052pmrHconn));
   	}
         int localIp7052pmrHobjCounter = -1;
         public boolean isIp7052pmrHobjModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp7052pmrHobjCounter != sharedCounter;
            localIp7052pmrHobjCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_7052PMR_HOBJ_LEN = 4;
  	/**
	 * serializeIp7052pmrHobj
	 */
	protected void serializeIp7052pmrHobj(int ip7052pmrHobj) {
           replaceValue( //  save the value as string
                   getBinaryString( ip7052pmrHobj,IP_7052PMR_HOBJ_LEN)
                  ,beginIp7052pmrHobj
                  ,IP_7052PMR_HOBJ_LEN
                 );
            localIp7052pmrHobjCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp7052pmrHobjMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp7052pmrHobj is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp7052pmrHobj() {	 
			return (getInt(beginIp7052pmrHobj));
   	}
         int localIp7052pmrCompCdCounter = -1;
         public boolean isIp7052pmrCompCdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp7052pmrCompCdCounter != sharedCounter;
            localIp7052pmrCompCdCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_7052PMR_COMP_CD_LEN = 4;
  	/**
	 * serializeIp7052pmrCompCd
	 */
	protected void serializeIp7052pmrCompCd(int ip7052pmrCompCd) {
           replaceValue( //  save the value as string
                   getBinaryString( ip7052pmrCompCd,IP_7052PMR_COMP_CD_LEN)
                  ,beginIp7052pmrCompCd
                  ,IP_7052PMR_COMP_CD_LEN
                 );
            localIp7052pmrCompCdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp7052pmrCompCdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp7052pmrCompCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp7052pmrCompCd() {	 
			return (getInt(beginIp7052pmrCompCd));
   	}
         int localIp7052pmrResnCdCounter = -1;
         public boolean isIp7052pmrResnCdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp7052pmrResnCdCounter != sharedCounter;
            localIp7052pmrResnCdCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_7052PMR_RESN_CD_LEN = 4;
  	/**
	 * serializeIp7052pmrResnCd
	 */
	protected void serializeIp7052pmrResnCd(int ip7052pmrResnCd) {
           replaceValue( //  save the value as string
                   getBinaryString( ip7052pmrResnCd,IP_7052PMR_RESN_CD_LEN)
                  ,beginIp7052pmrResnCd
                  ,IP_7052PMR_RESN_CD_LEN
                 );
            localIp7052pmrResnCdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp7052pmrResnCdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp7052pmrResnCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp7052pmrResnCd() {	 
			return (getInt(beginIp7052pmrResnCd));
   	}
         int localIp7052pmrOptionsCounter = -1;
         public boolean isIp7052pmrOptionsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp7052pmrOptionsCounter != sharedCounter;
            localIp7052pmrOptionsCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_7052PMR_OPTIONS_LEN = 4;
  	/**
	 * serializeIp7052pmrOptions
	 */
	protected void serializeIp7052pmrOptions(int ip7052pmrOptions) {
           replaceValue( //  save the value as string
                   getBinaryString( ip7052pmrOptions,IP_7052PMR_OPTIONS_LEN)
                  ,beginIp7052pmrOptions
                  ,IP_7052PMR_OPTIONS_LEN
                 );
            localIp7052pmrOptionsCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp7052pmrOptionsMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp7052pmrOptions is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp7052pmrOptions() {	 
			return (getInt(beginIp7052pmrOptions));
   	}
         int localIp7052pmrDataLengthCounter = -1;
         public boolean isIp7052pmrDataLengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp7052pmrDataLengthCounter != sharedCounter;
            localIp7052pmrDataLengthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_7052PMR_DATA_LENGTH_LEN = 4;
  	/**
	 * serializeIp7052pmrDataLength
	 */
	protected void serializeIp7052pmrDataLength(int ip7052pmrDataLength) {
           replaceValue( //  save the value as string
                   getBinaryString( ip7052pmrDataLength,IP_7052PMR_DATA_LENGTH_LEN)
                  ,beginIp7052pmrDataLength
                  ,IP_7052PMR_DATA_LENGTH_LEN
                 );
            localIp7052pmrDataLengthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp7052pmrDataLengthMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp7052pmrDataLength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp7052pmrDataLength() {	 
			return (getInt(beginIp7052pmrDataLength));
   	}
         int localIp7052pmrMsgBufferLenCounter = -1;
         public boolean isIp7052pmrMsgBufferLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp7052pmrMsgBufferLenCounter != sharedCounter;
            localIp7052pmrMsgBufferLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_7052PMR_MSG_BUFFER_LEN_LEN = 4;
  	/**
	 * serializeIp7052pmrMsgBufferLen
	 */
	protected void serializeIp7052pmrMsgBufferLen(int ip7052pmrMsgBufferLen) {
           replaceValue( //  save the value as string
                   getBinaryString( ip7052pmrMsgBufferLen,IP_7052PMR_MSG_BUFFER_LEN_LEN)
                  ,beginIp7052pmrMsgBufferLen
                  ,IP_7052PMR_MSG_BUFFER_LEN_LEN
                 );
            localIp7052pmrMsgBufferLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp7052pmrMsgBufferLenMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp7052pmrMsgBufferLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp7052pmrMsgBufferLen() {	 
			return (getInt(beginIp7052pmrMsgBufferLen));
   	}
     int localIp7052pmrMsgBufferCounter = -1;
     public boolean isIp7052pmrMsgBufferModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052pmrMsgBufferCounter != sharedCounter;
         localIp7052pmrMsgBufferCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052PMR_MSG_BUFFER_LEN = 4000000;
	/**
	 * 	serialize this Ip7052pmrMsgBuffer
	 */
   protected void serializeIp7052pmrMsgBuffer(char[] ip7052pmrMsgBuffer) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052pmrMsgBuffer,0,getStringValue(),beginIp7052pmrMsgBuffer,IP_7052PMR_MSG_BUFFER_LEN);
       localIp7052pmrMsgBufferCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052pmrMsgBufferConstraints(char[] value) {
   			return super.checkConstraints(value , 4000000 ,false, false);
   }
    /**
	 *	refreshIp7052pmrMsgBuffer is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052pmrMsgBuffer() {	 
   		return (substring(getStringValue(),beginIp7052pmrMsgBuffer,beginIp7052pmrMsgBuffer + IP_7052PMR_MSG_BUFFER_LEN));
   	}




}
  

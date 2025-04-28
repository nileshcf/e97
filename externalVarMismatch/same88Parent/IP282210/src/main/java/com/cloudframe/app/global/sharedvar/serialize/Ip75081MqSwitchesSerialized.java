package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip75081MqSwitchesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip75081MqSwitchesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip75081MqSwitchesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_75081_MQ_SWITCHES_LENGTH = 35;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp75081MqOptions;
            protected  int beginIp75081IsFromPgm;
            protected  int beginIp75081IsForTable;
            protected  int beginIp75081PayloadPmtSentSw;
            protected  int beginIp75081IdnPyldPmaSentSw;
            protected  int beginIp75081IdnPyldPmiSentSw;
            protected  int beginIp75081RusPyldPmaSentSw;
            protected  int beginIp75081RusPyldPmiSentSw;
            protected  int beginIp75081PayloadPimSentSw;
            protected  int beginIp75081PayloadPmt1stTime;
            protected  int beginIp75081PyldPmaIdn1stTime;
            protected  int beginIp75081PyldPmiIdn1stTime;
            protected  int beginIp75081PyldPmaRus1stTime;
            protected  int beginIp75081PyldPmiRus1stTime;
            protected  int beginIp75081PayloadPim1stTime;
            protected  int beginIp75081AccntNum;
            protected  int beginIp75081IsItEndOfProcess;
	
	/**
	* Constructor for Ip75081MqSwitchesSerialized
	**/
    public Ip75081MqSwitchesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip75081MqSwitchesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_75081_MQ_SWITCHES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp75081MqOptions = getStartOffset() + 0;	// set offset for serialization
  
             beginIp75081IsFromPgm = getStartOffset() + 1;	// set offset for serialization
  
             beginIp75081IsForTable = getStartOffset() + 2;	// set offset for serialization
  
             beginIp75081PayloadPmtSentSw = getStartOffset() + 3;	// set offset for serialization
  
             beginIp75081IdnPyldPmaSentSw = getStartOffset() + 4;	// set offset for serialization
  
             beginIp75081IdnPyldPmiSentSw = getStartOffset() + 5;	// set offset for serialization
  
             beginIp75081RusPyldPmaSentSw = getStartOffset() + 6;	// set offset for serialization
  
             beginIp75081RusPyldPmiSentSw = getStartOffset() + 7;	// set offset for serialization
  
             beginIp75081PayloadPimSentSw = getStartOffset() + 8;	// set offset for serialization
  
             beginIp75081PayloadPmt1stTime = getStartOffset() + 9;	// set offset for serialization
  
             beginIp75081PyldPmaIdn1stTime = getStartOffset() + 10;	// set offset for serialization
  
             beginIp75081PyldPmiIdn1stTime = getStartOffset() + 11;	// set offset for serialization
  
             beginIp75081PyldPmaRus1stTime = getStartOffset() + 12;	// set offset for serialization
  
             beginIp75081PyldPmiRus1stTime = getStartOffset() + 13;	// set offset for serialization
  
             beginIp75081PayloadPim1stTime = getStartOffset() + 14;	// set offset for serialization
  
             beginIp75081AccntNum = getStartOffset() + 15;	// set offset for serialization
  
             beginIp75081IsItEndOfProcess = getStartOffset() + 34;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp75081MqOptionsCounter = -1;
     public boolean isIp75081MqOptionsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp75081MqOptionsCounter != sharedCounter;
         localIp75081MqOptionsCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_75081_MQ_OPTIONS_LEN = 1;
	/**
	 * 	serialize this Ip75081MqOptions
	 */
   protected void serializeIp75081MqOptions(char[] ip75081MqOptions) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip75081MqOptions,0,getStringValue(),beginIp75081MqOptions,IP_75081_MQ_OPTIONS_LEN);
       localIp75081MqOptionsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp75081MqOptionsConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp75081MqOptions is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp75081MqOptions() {	 
   		return (substring(getStringValue(),beginIp75081MqOptions,beginIp75081MqOptions + IP_75081_MQ_OPTIONS_LEN));
   	}
     int localIp75081IsFromPgmCounter = -1;
     public boolean isIp75081IsFromPgmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp75081IsFromPgmCounter != sharedCounter;
         localIp75081IsFromPgmCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_75081_IS_FROM_PGM_LEN = 1;
	/**
	 * 	serialize this Ip75081IsFromPgm
	 */
   protected void serializeIp75081IsFromPgm(char[] ip75081IsFromPgm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip75081IsFromPgm,0,getStringValue(),beginIp75081IsFromPgm,IP_75081_IS_FROM_PGM_LEN);
       localIp75081IsFromPgmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp75081IsFromPgmConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp75081IsFromPgm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp75081IsFromPgm() {	 
   		return (substring(getStringValue(),beginIp75081IsFromPgm,beginIp75081IsFromPgm + IP_75081_IS_FROM_PGM_LEN));
   	}
     int localIp75081IsForTableCounter = -1;
     public boolean isIp75081IsForTableModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp75081IsForTableCounter != sharedCounter;
         localIp75081IsForTableCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_75081_IS_FOR_TABLE_LEN = 1;
	/**
	 * 	serialize this Ip75081IsForTable
	 */
   protected void serializeIp75081IsForTable(char[] ip75081IsForTable) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip75081IsForTable,0,getStringValue(),beginIp75081IsForTable,IP_75081_IS_FOR_TABLE_LEN);
       localIp75081IsForTableCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp75081IsForTableConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp75081IsForTable is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp75081IsForTable() {	 
   		return (substring(getStringValue(),beginIp75081IsForTable,beginIp75081IsForTable + IP_75081_IS_FOR_TABLE_LEN));
   	}
     int localIp75081PayloadPmtSentSwCounter = -1;
     public boolean isIp75081PayloadPmtSentSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp75081PayloadPmtSentSwCounter != sharedCounter;
         localIp75081PayloadPmtSentSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_75081_PAYLOAD_PMT_SENT_SW_LEN = 1;
	/**
	 * 	serialize this Ip75081PayloadPmtSentSw
	 */
   protected void serializeIp75081PayloadPmtSentSw(char[] ip75081PayloadPmtSentSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip75081PayloadPmtSentSw,0,getStringValue(),beginIp75081PayloadPmtSentSw,IP_75081_PAYLOAD_PMT_SENT_SW_LEN);
       localIp75081PayloadPmtSentSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp75081PayloadPmtSentSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp75081PayloadPmtSentSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp75081PayloadPmtSentSw() {	 
   		return (substring(getStringValue(),beginIp75081PayloadPmtSentSw,beginIp75081PayloadPmtSentSw + IP_75081_PAYLOAD_PMT_SENT_SW_LEN));
   	}
     int localIp75081IdnPyldPmaSentSwCounter = -1;
     public boolean isIp75081IdnPyldPmaSentSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp75081IdnPyldPmaSentSwCounter != sharedCounter;
         localIp75081IdnPyldPmaSentSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_75081_IDN_PYLD_PMA_SENT_SW_LEN = 1;
	/**
	 * 	serialize this Ip75081IdnPyldPmaSentSw
	 */
   protected void serializeIp75081IdnPyldPmaSentSw(char[] ip75081IdnPyldPmaSentSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip75081IdnPyldPmaSentSw,0,getStringValue(),beginIp75081IdnPyldPmaSentSw,IP_75081_IDN_PYLD_PMA_SENT_SW_LEN);
       localIp75081IdnPyldPmaSentSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp75081IdnPyldPmaSentSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp75081IdnPyldPmaSentSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp75081IdnPyldPmaSentSw() {	 
   		return (substring(getStringValue(),beginIp75081IdnPyldPmaSentSw,beginIp75081IdnPyldPmaSentSw + IP_75081_IDN_PYLD_PMA_SENT_SW_LEN));
   	}
     int localIp75081IdnPyldPmiSentSwCounter = -1;
     public boolean isIp75081IdnPyldPmiSentSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp75081IdnPyldPmiSentSwCounter != sharedCounter;
         localIp75081IdnPyldPmiSentSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_75081_IDN_PYLD_PMI_SENT_SW_LEN = 1;
	/**
	 * 	serialize this Ip75081IdnPyldPmiSentSw
	 */
   protected void serializeIp75081IdnPyldPmiSentSw(char[] ip75081IdnPyldPmiSentSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip75081IdnPyldPmiSentSw,0,getStringValue(),beginIp75081IdnPyldPmiSentSw,IP_75081_IDN_PYLD_PMI_SENT_SW_LEN);
       localIp75081IdnPyldPmiSentSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp75081IdnPyldPmiSentSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp75081IdnPyldPmiSentSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp75081IdnPyldPmiSentSw() {	 
   		return (substring(getStringValue(),beginIp75081IdnPyldPmiSentSw,beginIp75081IdnPyldPmiSentSw + IP_75081_IDN_PYLD_PMI_SENT_SW_LEN));
   	}
     int localIp75081RusPyldPmaSentSwCounter = -1;
     public boolean isIp75081RusPyldPmaSentSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp75081RusPyldPmaSentSwCounter != sharedCounter;
         localIp75081RusPyldPmaSentSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_75081_RUS_PYLD_PMA_SENT_SW_LEN = 1;
	/**
	 * 	serialize this Ip75081RusPyldPmaSentSw
	 */
   protected void serializeIp75081RusPyldPmaSentSw(char[] ip75081RusPyldPmaSentSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip75081RusPyldPmaSentSw,0,getStringValue(),beginIp75081RusPyldPmaSentSw,IP_75081_RUS_PYLD_PMA_SENT_SW_LEN);
       localIp75081RusPyldPmaSentSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp75081RusPyldPmaSentSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp75081RusPyldPmaSentSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp75081RusPyldPmaSentSw() {	 
   		return (substring(getStringValue(),beginIp75081RusPyldPmaSentSw,beginIp75081RusPyldPmaSentSw + IP_75081_RUS_PYLD_PMA_SENT_SW_LEN));
   	}
     int localIp75081RusPyldPmiSentSwCounter = -1;
     public boolean isIp75081RusPyldPmiSentSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp75081RusPyldPmiSentSwCounter != sharedCounter;
         localIp75081RusPyldPmiSentSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_75081_RUS_PYLD_PMI_SENT_SW_LEN = 1;
	/**
	 * 	serialize this Ip75081RusPyldPmiSentSw
	 */
   protected void serializeIp75081RusPyldPmiSentSw(char[] ip75081RusPyldPmiSentSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip75081RusPyldPmiSentSw,0,getStringValue(),beginIp75081RusPyldPmiSentSw,IP_75081_RUS_PYLD_PMI_SENT_SW_LEN);
       localIp75081RusPyldPmiSentSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp75081RusPyldPmiSentSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp75081RusPyldPmiSentSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp75081RusPyldPmiSentSw() {	 
   		return (substring(getStringValue(),beginIp75081RusPyldPmiSentSw,beginIp75081RusPyldPmiSentSw + IP_75081_RUS_PYLD_PMI_SENT_SW_LEN));
   	}
     int localIp75081PayloadPimSentSwCounter = -1;
     public boolean isIp75081PayloadPimSentSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp75081PayloadPimSentSwCounter != sharedCounter;
         localIp75081PayloadPimSentSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_75081_PAYLOAD_PIM_SENT_SW_LEN = 1;
	/**
	 * 	serialize this Ip75081PayloadPimSentSw
	 */
   protected void serializeIp75081PayloadPimSentSw(char[] ip75081PayloadPimSentSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip75081PayloadPimSentSw,0,getStringValue(),beginIp75081PayloadPimSentSw,IP_75081_PAYLOAD_PIM_SENT_SW_LEN);
       localIp75081PayloadPimSentSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp75081PayloadPimSentSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp75081PayloadPimSentSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp75081PayloadPimSentSw() {	 
   		return (substring(getStringValue(),beginIp75081PayloadPimSentSw,beginIp75081PayloadPimSentSw + IP_75081_PAYLOAD_PIM_SENT_SW_LEN));
   	}
     int localIp75081PayloadPmt1stTimeCounter = -1;
     public boolean isIp75081PayloadPmt1stTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp75081PayloadPmt1stTimeCounter != sharedCounter;
         localIp75081PayloadPmt1stTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_75081_PAYLOAD_PMT_1ST_TIME_LEN = 1;
	/**
	 * 	serialize this Ip75081PayloadPmt1stTime
	 */
   protected void serializeIp75081PayloadPmt1stTime(char[] ip75081PayloadPmt1stTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip75081PayloadPmt1stTime,0,getStringValue(),beginIp75081PayloadPmt1stTime,IP_75081_PAYLOAD_PMT_1ST_TIME_LEN);
       localIp75081PayloadPmt1stTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp75081PayloadPmt1stTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp75081PayloadPmt1stTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp75081PayloadPmt1stTime() {	 
   		return (substring(getStringValue(),beginIp75081PayloadPmt1stTime,beginIp75081PayloadPmt1stTime + IP_75081_PAYLOAD_PMT_1ST_TIME_LEN));
   	}
     int localIp75081PyldPmaIdn1stTimeCounter = -1;
     public boolean isIp75081PyldPmaIdn1stTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp75081PyldPmaIdn1stTimeCounter != sharedCounter;
         localIp75081PyldPmaIdn1stTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_75081_PYLD_PMA_IDN_1ST_TIME_LEN = 1;
	/**
	 * 	serialize this Ip75081PyldPmaIdn1stTime
	 */
   protected void serializeIp75081PyldPmaIdn1stTime(char[] ip75081PyldPmaIdn1stTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip75081PyldPmaIdn1stTime,0,getStringValue(),beginIp75081PyldPmaIdn1stTime,IP_75081_PYLD_PMA_IDN_1ST_TIME_LEN);
       localIp75081PyldPmaIdn1stTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp75081PyldPmaIdn1stTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp75081PyldPmaIdn1stTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp75081PyldPmaIdn1stTime() {	 
   		return (substring(getStringValue(),beginIp75081PyldPmaIdn1stTime,beginIp75081PyldPmaIdn1stTime + IP_75081_PYLD_PMA_IDN_1ST_TIME_LEN));
   	}
     int localIp75081PyldPmiIdn1stTimeCounter = -1;
     public boolean isIp75081PyldPmiIdn1stTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp75081PyldPmiIdn1stTimeCounter != sharedCounter;
         localIp75081PyldPmiIdn1stTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_75081_PYLD_PMI_IDN_1ST_TIME_LEN = 1;
	/**
	 * 	serialize this Ip75081PyldPmiIdn1stTime
	 */
   protected void serializeIp75081PyldPmiIdn1stTime(char[] ip75081PyldPmiIdn1stTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip75081PyldPmiIdn1stTime,0,getStringValue(),beginIp75081PyldPmiIdn1stTime,IP_75081_PYLD_PMI_IDN_1ST_TIME_LEN);
       localIp75081PyldPmiIdn1stTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp75081PyldPmiIdn1stTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp75081PyldPmiIdn1stTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp75081PyldPmiIdn1stTime() {	 
   		return (substring(getStringValue(),beginIp75081PyldPmiIdn1stTime,beginIp75081PyldPmiIdn1stTime + IP_75081_PYLD_PMI_IDN_1ST_TIME_LEN));
   	}
     int localIp75081PyldPmaRus1stTimeCounter = -1;
     public boolean isIp75081PyldPmaRus1stTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp75081PyldPmaRus1stTimeCounter != sharedCounter;
         localIp75081PyldPmaRus1stTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_75081_PYLD_PMA_RUS_1ST_TIME_LEN = 1;
	/**
	 * 	serialize this Ip75081PyldPmaRus1stTime
	 */
   protected void serializeIp75081PyldPmaRus1stTime(char[] ip75081PyldPmaRus1stTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip75081PyldPmaRus1stTime,0,getStringValue(),beginIp75081PyldPmaRus1stTime,IP_75081_PYLD_PMA_RUS_1ST_TIME_LEN);
       localIp75081PyldPmaRus1stTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp75081PyldPmaRus1stTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp75081PyldPmaRus1stTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp75081PyldPmaRus1stTime() {	 
   		return (substring(getStringValue(),beginIp75081PyldPmaRus1stTime,beginIp75081PyldPmaRus1stTime + IP_75081_PYLD_PMA_RUS_1ST_TIME_LEN));
   	}
     int localIp75081PyldPmiRus1stTimeCounter = -1;
     public boolean isIp75081PyldPmiRus1stTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp75081PyldPmiRus1stTimeCounter != sharedCounter;
         localIp75081PyldPmiRus1stTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_75081_PYLD_PMI_RUS_1ST_TIME_LEN = 1;
	/**
	 * 	serialize this Ip75081PyldPmiRus1stTime
	 */
   protected void serializeIp75081PyldPmiRus1stTime(char[] ip75081PyldPmiRus1stTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip75081PyldPmiRus1stTime,0,getStringValue(),beginIp75081PyldPmiRus1stTime,IP_75081_PYLD_PMI_RUS_1ST_TIME_LEN);
       localIp75081PyldPmiRus1stTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp75081PyldPmiRus1stTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp75081PyldPmiRus1stTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp75081PyldPmiRus1stTime() {	 
   		return (substring(getStringValue(),beginIp75081PyldPmiRus1stTime,beginIp75081PyldPmiRus1stTime + IP_75081_PYLD_PMI_RUS_1ST_TIME_LEN));
   	}
     int localIp75081PayloadPim1stTimeCounter = -1;
     public boolean isIp75081PayloadPim1stTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp75081PayloadPim1stTimeCounter != sharedCounter;
         localIp75081PayloadPim1stTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_75081_PAYLOAD_PIM_1ST_TIME_LEN = 1;
	/**
	 * 	serialize this Ip75081PayloadPim1stTime
	 */
   protected void serializeIp75081PayloadPim1stTime(char[] ip75081PayloadPim1stTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip75081PayloadPim1stTime,0,getStringValue(),beginIp75081PayloadPim1stTime,IP_75081_PAYLOAD_PIM_1ST_TIME_LEN);
       localIp75081PayloadPim1stTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp75081PayloadPim1stTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp75081PayloadPim1stTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp75081PayloadPim1stTime() {	 
   		return (substring(getStringValue(),beginIp75081PayloadPim1stTime,beginIp75081PayloadPim1stTime + IP_75081_PAYLOAD_PIM_1ST_TIME_LEN));
   	}
     int localIp75081AccntNumCounter = -1;
     public boolean isIp75081AccntNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp75081AccntNumCounter != sharedCounter;
         localIp75081AccntNumCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_75081_ACCNT_NUM_LEN = 19;
	/**
	 * 	serialize this Ip75081AccntNum
	 */
   protected void serializeIp75081AccntNum(char[] ip75081AccntNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip75081AccntNum,0,getStringValue(),beginIp75081AccntNum,IP_75081_ACCNT_NUM_LEN);
       localIp75081AccntNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp75081AccntNumConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshIp75081AccntNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp75081AccntNum() {	 
   		return (substring(getStringValue(),beginIp75081AccntNum,beginIp75081AccntNum + IP_75081_ACCNT_NUM_LEN));
   	}
     int localIp75081IsItEndOfProcessCounter = -1;
     public boolean isIp75081IsItEndOfProcessModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp75081IsItEndOfProcessCounter != sharedCounter;
         localIp75081IsItEndOfProcessCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_75081_IS_IT_END_OF_PROCESS_LEN = 1;
	/**
	 * 	serialize this Ip75081IsItEndOfProcess
	 */
   protected void serializeIp75081IsItEndOfProcess(char[] ip75081IsItEndOfProcess) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip75081IsItEndOfProcess,0,getStringValue(),beginIp75081IsItEndOfProcess,IP_75081_IS_IT_END_OF_PROCESS_LEN);
       localIp75081IsItEndOfProcessCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp75081IsItEndOfProcessConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp75081IsItEndOfProcess is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp75081IsItEndOfProcess() {	 
   		return (substring(getStringValue(),beginIp75081IsItEndOfProcess,beginIp75081IsItEndOfProcess + IP_75081_IS_IT_END_OF_PROCESS_LEN));
   	}




}
  

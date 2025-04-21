package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip02015PrcssAgrmtEntrySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip02015PrcssAgrmtEntrySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip02015PrcssAgrmtEntrySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_02015_PRCSS_AGRMT_ENTRY_LENGTH = 572;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp02015PrcssAgrmtId;
            protected  int beginIp02015GeoScopeCode;
            protected  int beginIp02015HostInd;
            protected  int beginIp02015NumCurrCd;
            protected  int beginIp02015OfsoilDataTypCd;
            protected  int beginIp02015MrchntSplitSw;
            protected  int beginIp02015MrchntSplitCd;
            protected  int beginIp02015CurrSplitSw;
            protected  int beginIp02015CurrSplitCd;
            protected  int beginIp02015AcquirerSplitCd;
            protected  int beginIp02015DomCollOnlyCd;
            protected  int beginIp02015OnsoilDataShrSw;
            protected  int beginIp02015ClrCycleNum;
            protected  int beginIp02015DtaWrhsOnsoilSw;
            protected  int beginIp02015BllngOnsoilSw;
            protected  int beginIp02015SetlOnsoilSw;
            protected  int beginIp02015ClrOnsoilSw;
            protected  int beginIp02015AmsOnsoilSw;
            protected  int beginIp02015McomOnsoilSw;
            protected  int beginIp02015MdsOnsoilSw;
            protected  int beginIp02015StndInOnsoilSw;
            protected  int beginIp02015AuthOnsoilSw;
            protected  int beginIp02015RptHdrName;
            protected  int beginIp02015ClrPrcssCd;
            protected  int beginIp02015OnUsPrcssAgrmtId;
            protected  int beginIp02015PushOnsoilSw;
            protected  int beginIp02015IncontrolOnsoilSw;
            protected  int beginIp02015EsrvcOnsoilSw;
            protected  int beginIp02015GftOnsoilSw;
            protected  int beginIp02015BnknetOnsoilSw;
            protected  int beginIp02015MdesOnsoilSw;
            protected  int beginIp02015ZappOnsoilSw;
            protected  int beginIp02015CemOnsoilSw;
            protected  int beginIp02015OperSysId;
            protected  int beginIp02015DbId;
           protected int beginIp02015Db2Table;
           protected static final int IP_02015_DB_2_TABLE_SIZE = 10;
            protected  int beginIp02015Filler;
	
	/**
	* Constructor for Ip02015PrcssAgrmtEntrySerialized
	**/
    public Ip02015PrcssAgrmtEntrySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip02015PrcssAgrmtEntrySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02015PrcssAgrmtEntrySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip02015PrcssAgrmtEntrySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,20); // serialize this field at offset 20 by default 
    }
    
	/**
	* sets parent for this Ip02015PrcssAgrmtEntrySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 20 by default
    }    
	/**
	* initializes the field in Ip02015PrcssAgrmtEntrySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_02015_PRCSS_AGRMT_ENTRY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp02015PrcssAgrmtId = getStartOffset() + 0;	// set offset for serialization
  
             beginIp02015GeoScopeCode = getStartOffset() + 11;	// set offset for serialization
  
             beginIp02015HostInd = getStartOffset() + 12;	// set offset for serialization
  
  
             beginIp02015NumCurrCd = getStartOffset() + 17;	// set offset for serialization
  
             beginIp02015OfsoilDataTypCd = getStartOffset() + 20;	// set offset for serialization
  
             beginIp02015MrchntSplitSw = getStartOffset() + 23;	// set offset for serialization
  
             beginIp02015MrchntSplitCd = getStartOffset() + 23;	// set offset for serialization
  
             beginIp02015CurrSplitSw = getStartOffset() + 24;	// set offset for serialization
  
             beginIp02015CurrSplitCd = getStartOffset() + 24;	// set offset for serialization
  
             beginIp02015AcquirerSplitCd = getStartOffset() + 25;	// set offset for serialization
  
             beginIp02015DomCollOnlyCd = getStartOffset() + 26;	// set offset for serialization
  
             beginIp02015OnsoilDataShrSw = getStartOffset() + 27;	// set offset for serialization
  
             beginIp02015ClrCycleNum = getStartOffset() + 25;	// set offset for serialization
  
             beginIp02015DtaWrhsOnsoilSw = getStartOffset() + 27;	// set offset for serialization
  
             beginIp02015BllngOnsoilSw = getStartOffset() + 28;	// set offset for serialization
  
             beginIp02015SetlOnsoilSw = getStartOffset() + 29;	// set offset for serialization
  
             beginIp02015ClrOnsoilSw = getStartOffset() + 30;	// set offset for serialization
  
             beginIp02015AmsOnsoilSw = getStartOffset() + 31;	// set offset for serialization
  
             beginIp02015McomOnsoilSw = getStartOffset() + 32;	// set offset for serialization
  
             beginIp02015MdsOnsoilSw = getStartOffset() + 33;	// set offset for serialization
  
             beginIp02015StndInOnsoilSw = getStartOffset() + 34;	// set offset for serialization
  
             beginIp02015AuthOnsoilSw = getStartOffset() + 35;	// set offset for serialization
  
             beginIp02015RptHdrName = getStartOffset() + 36;	// set offset for serialization
  
             beginIp02015ClrPrcssCd = getStartOffset() + 116;	// set offset for serialization
  
             beginIp02015OnUsPrcssAgrmtId = getStartOffset() + 120;	// set offset for serialization
  
             beginIp02015PushOnsoilSw = getStartOffset() + 134;	// set offset for serialization
  
             beginIp02015IncontrolOnsoilSw = getStartOffset() + 135;	// set offset for serialization
  
             beginIp02015EsrvcOnsoilSw = getStartOffset() + 136;	// set offset for serialization
  
             beginIp02015GftOnsoilSw = getStartOffset() + 137;	// set offset for serialization
  
             beginIp02015BnknetOnsoilSw = getStartOffset() + 138;	// set offset for serialization
  
             beginIp02015MdesOnsoilSw = getStartOffset() + 139;	// set offset for serialization
  
             beginIp02015ZappOnsoilSw = getStartOffset() + 140;	// set offset for serialization
  
             beginIp02015CemOnsoilSw = getStartOffset() + 141;	// set offset for serialization
  
             beginIp02015OperSysId = getStartOffset() + 131;	// set offset for serialization
  
             beginIp02015DbId = getStartOffset() + 151;	// set offset for serialization
  
	        beginIp02015Db2Table = getStartOffset() + 171; // set offset for serialization
  
             beginIp02015Filler = getStartOffset() + 561;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp02015PrcssAgrmtIdCounter = -1;
     public boolean isIp02015PrcssAgrmtIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015PrcssAgrmtIdCounter != sharedCounter;
         localIp02015PrcssAgrmtIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_PRCSS_AGRMT_ID_LEN = 11;
	/**
	 * 	serialize this Ip02015PrcssAgrmtId
	 */
   protected void serializeIp02015PrcssAgrmtId(char[] ip02015PrcssAgrmtId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015PrcssAgrmtId,0,getStringValue(),beginIp02015PrcssAgrmtId,IP_02015_PRCSS_AGRMT_ID_LEN);
       localIp02015PrcssAgrmtIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015PrcssAgrmtIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshIp02015PrcssAgrmtId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015PrcssAgrmtId() {	 
   		return (substring(getStringValue(),beginIp02015PrcssAgrmtId,beginIp02015PrcssAgrmtId + IP_02015_PRCSS_AGRMT_ID_LEN));
   	}
     int localIp02015GeoScopeCodeCounter = -1;
     public boolean isIp02015GeoScopeCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015GeoScopeCodeCounter != sharedCounter;
         localIp02015GeoScopeCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_GEO_SCOPE_CODE_LEN = 1;
	/**
	 * 	serialize this Ip02015GeoScopeCode
	 */
   protected void serializeIp02015GeoScopeCode(char[] ip02015GeoScopeCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015GeoScopeCode,0,getStringValue(),beginIp02015GeoScopeCode,IP_02015_GEO_SCOPE_CODE_LEN);
       localIp02015GeoScopeCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015GeoScopeCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015GeoScopeCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015GeoScopeCode() {	 
   		return (substring(getStringValue(),beginIp02015GeoScopeCode,beginIp02015GeoScopeCode + IP_02015_GEO_SCOPE_CODE_LEN));
   	}
     int localIp02015HostIndCounter = -1;
     public boolean isIp02015HostIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015HostIndCounter != sharedCounter;
         localIp02015HostIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_HOST_IND_LEN = 1;
	/**
	 * 	serialize this Ip02015HostInd
	 */
   protected void serializeIp02015HostInd(char[] ip02015HostInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015HostInd,0,getStringValue(),beginIp02015HostInd,IP_02015_HOST_IND_LEN);
       localIp02015HostIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015HostIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015HostInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015HostInd() {	 
   		return (substring(getStringValue(),beginIp02015HostInd,beginIp02015HostInd + IP_02015_HOST_IND_LEN));
   	}
     int localIp02015NumCurrCdCounter = -1;
     public boolean isIp02015NumCurrCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015NumCurrCdCounter != sharedCounter;
         localIp02015NumCurrCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip02015NumCurrCd
	 *	@return ip02015NumCurrCd
	 */
	public char[]  getIp02015NumCurrCdString() {
	     return getCharArray(beginIp02015NumCurrCd,IP_02015_NUM_CURR_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip02015NumCurrCdIsNumeric() {
	    return isNumeric(beginIp02015NumCurrCd
	                    ,beginIp02015NumCurrCd + IP_02015_NUM_CURR_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_02015_NUM_CURR_CD_LEN = 3;
  	/**
	 * serializeIp02015NumCurrCd
	 */
	protected void serializeIp02015NumCurrCd(int ip02015NumCurrCd) {
		 putNumber(beginIp02015NumCurrCd,ip02015NumCurrCd,IP_02015_NUM_CURR_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp02015NumCurrCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp02015NumCurrCd
	 */
   	protected  int serializeIp02015NumCurrCd(char[] value) {
	    int  ip02015NumCurrCd;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip02015NumCurrCd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp02015NumCurrCd
		       ,3
		      );
		 localIp02015NumCurrCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip02015NumCurrCd;
    }

   protected int checkIp02015NumCurrCdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp02015NumCurrCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp02015NumCurrCd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp02015NumCurrCd
			                 ,IP_02015_NUM_CURR_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip02015NumCurrCd", beginIp02015NumCurrCd,IP_02015_NUM_CURR_CD_LEN);
    }
   	}
     int localIp02015OfsoilDataTypCdCounter = -1;
     public boolean isIp02015OfsoilDataTypCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015OfsoilDataTypCdCounter != sharedCounter;
         localIp02015OfsoilDataTypCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_OFSOIL_DATA_TYP_CD_LEN = 3;
	/**
	 * 	serialize this Ip02015OfsoilDataTypCd
	 */
   protected void serializeIp02015OfsoilDataTypCd(char[] ip02015OfsoilDataTypCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015OfsoilDataTypCd,0,getStringValue(),beginIp02015OfsoilDataTypCd,IP_02015_OFSOIL_DATA_TYP_CD_LEN);
       localIp02015OfsoilDataTypCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015OfsoilDataTypCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp02015OfsoilDataTypCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015OfsoilDataTypCd() {	 
   		return (substring(getStringValue(),beginIp02015OfsoilDataTypCd,beginIp02015OfsoilDataTypCd + IP_02015_OFSOIL_DATA_TYP_CD_LEN));
   	}
     int localIp02015MrchntSplitSwCounter = -1;
     public boolean isIp02015MrchntSplitSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015MrchntSplitSwCounter != sharedCounter;
         localIp02015MrchntSplitSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_MRCHNT_SPLIT_SW_LEN = 1;
	/**
	 * 	serialize this Ip02015MrchntSplitSw
	 */
   protected void serializeIp02015MrchntSplitSw(char[] ip02015MrchntSplitSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015MrchntSplitSw,0,getStringValue(),beginIp02015MrchntSplitSw,IP_02015_MRCHNT_SPLIT_SW_LEN);
       localIp02015MrchntSplitSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015MrchntSplitSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015MrchntSplitSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015MrchntSplitSw() {	 
   		return (substring(getStringValue(),beginIp02015MrchntSplitSw,beginIp02015MrchntSplitSw + IP_02015_MRCHNT_SPLIT_SW_LEN));
   	}
     int localIp02015MrchntSplitCdCounter = -1;
     public boolean isIp02015MrchntSplitCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015MrchntSplitCdCounter != sharedCounter;
         localIp02015MrchntSplitCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_MRCHNT_SPLIT_CD_LEN = 1;
	/**
	 * 	serialize this Ip02015MrchntSplitCd
	 */
   protected void serializeIp02015MrchntSplitCd(char[] ip02015MrchntSplitCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015MrchntSplitCd,0,getStringValue(),beginIp02015MrchntSplitCd,IP_02015_MRCHNT_SPLIT_CD_LEN);
       localIp02015MrchntSplitCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015MrchntSplitCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015MrchntSplitCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015MrchntSplitCd() {	 
   		return (substring(getStringValue(),beginIp02015MrchntSplitCd,beginIp02015MrchntSplitCd + IP_02015_MRCHNT_SPLIT_CD_LEN));
   	}
     int localIp02015CurrSplitSwCounter = -1;
     public boolean isIp02015CurrSplitSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015CurrSplitSwCounter != sharedCounter;
         localIp02015CurrSplitSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_CURR_SPLIT_SW_LEN = 1;
	/**
	 * 	serialize this Ip02015CurrSplitSw
	 */
   protected void serializeIp02015CurrSplitSw(char[] ip02015CurrSplitSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015CurrSplitSw,0,getStringValue(),beginIp02015CurrSplitSw,IP_02015_CURR_SPLIT_SW_LEN);
       localIp02015CurrSplitSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015CurrSplitSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015CurrSplitSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015CurrSplitSw() {	 
   		return (substring(getStringValue(),beginIp02015CurrSplitSw,beginIp02015CurrSplitSw + IP_02015_CURR_SPLIT_SW_LEN));
   	}
     int localIp02015CurrSplitCdCounter = -1;
     public boolean isIp02015CurrSplitCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015CurrSplitCdCounter != sharedCounter;
         localIp02015CurrSplitCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_CURR_SPLIT_CD_LEN = 1;
	/**
	 * 	serialize this Ip02015CurrSplitCd
	 */
   protected void serializeIp02015CurrSplitCd(char[] ip02015CurrSplitCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015CurrSplitCd,0,getStringValue(),beginIp02015CurrSplitCd,IP_02015_CURR_SPLIT_CD_LEN);
       localIp02015CurrSplitCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015CurrSplitCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015CurrSplitCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015CurrSplitCd() {	 
   		return (substring(getStringValue(),beginIp02015CurrSplitCd,beginIp02015CurrSplitCd + IP_02015_CURR_SPLIT_CD_LEN));
   	}
     int localIp02015AcquirerSplitCdCounter = -1;
     public boolean isIp02015AcquirerSplitCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015AcquirerSplitCdCounter != sharedCounter;
         localIp02015AcquirerSplitCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_ACQUIRER_SPLIT_CD_LEN = 1;
	/**
	 * 	serialize this Ip02015AcquirerSplitCd
	 */
   protected void serializeIp02015AcquirerSplitCd(char[] ip02015AcquirerSplitCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015AcquirerSplitCd,0,getStringValue(),beginIp02015AcquirerSplitCd,IP_02015_ACQUIRER_SPLIT_CD_LEN);
       localIp02015AcquirerSplitCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015AcquirerSplitCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015AcquirerSplitCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015AcquirerSplitCd() {	 
   		return (substring(getStringValue(),beginIp02015AcquirerSplitCd,beginIp02015AcquirerSplitCd + IP_02015_ACQUIRER_SPLIT_CD_LEN));
   	}
     int localIp02015DomCollOnlyCdCounter = -1;
     public boolean isIp02015DomCollOnlyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015DomCollOnlyCdCounter != sharedCounter;
         localIp02015DomCollOnlyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_DOM_COLL_ONLY_CD_LEN = 1;
	/**
	 * 	serialize this Ip02015DomCollOnlyCd
	 */
   protected void serializeIp02015DomCollOnlyCd(char[] ip02015DomCollOnlyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015DomCollOnlyCd,0,getStringValue(),beginIp02015DomCollOnlyCd,IP_02015_DOM_COLL_ONLY_CD_LEN);
       localIp02015DomCollOnlyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015DomCollOnlyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015DomCollOnlyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015DomCollOnlyCd() {	 
   		return (substring(getStringValue(),beginIp02015DomCollOnlyCd,beginIp02015DomCollOnlyCd + IP_02015_DOM_COLL_ONLY_CD_LEN));
   	}
     int localIp02015OnsoilDataShrSwCounter = -1;
     public boolean isIp02015OnsoilDataShrSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015OnsoilDataShrSwCounter != sharedCounter;
         localIp02015OnsoilDataShrSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_ONSOIL_DATA_SHR_SW_LEN = 1;
	/**
	 * 	serialize this Ip02015OnsoilDataShrSw
	 */
   protected void serializeIp02015OnsoilDataShrSw(char[] ip02015OnsoilDataShrSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015OnsoilDataShrSw,0,getStringValue(),beginIp02015OnsoilDataShrSw,IP_02015_ONSOIL_DATA_SHR_SW_LEN);
       localIp02015OnsoilDataShrSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015OnsoilDataShrSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015OnsoilDataShrSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015OnsoilDataShrSw() {	 
   		return (substring(getStringValue(),beginIp02015OnsoilDataShrSw,beginIp02015OnsoilDataShrSw + IP_02015_ONSOIL_DATA_SHR_SW_LEN));
   	}
     int localIp02015ClrCycleNumCounter = -1;
     public boolean isIp02015ClrCycleNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015ClrCycleNumCounter != sharedCounter;
         localIp02015ClrCycleNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip02015ClrCycleNum
	 *	@return ip02015ClrCycleNum
	 */
	public char[]  getIp02015ClrCycleNumString() {
	     return getCharArray(beginIp02015ClrCycleNum,IP_02015_CLR_CYCLE_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip02015ClrCycleNumIsNumeric() {
	    return isNumeric(beginIp02015ClrCycleNum
	                    ,beginIp02015ClrCycleNum + IP_02015_CLR_CYCLE_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_02015_CLR_CYCLE_NUM_LEN = 2;
  	/**
	 * serializeIp02015ClrCycleNum
	 */
	protected void serializeIp02015ClrCycleNum(int ip02015ClrCycleNum) {
		 putNumber(beginIp02015ClrCycleNum,ip02015ClrCycleNum,IP_02015_CLR_CYCLE_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp02015ClrCycleNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp02015ClrCycleNum
	 */
   	protected  int serializeIp02015ClrCycleNum(char[] value) {
	    int  ip02015ClrCycleNum;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip02015ClrCycleNum = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp02015ClrCycleNum
		       ,2
		      );
		 localIp02015ClrCycleNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip02015ClrCycleNum;
    }

   protected int checkIp02015ClrCycleNumMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp02015ClrCycleNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp02015ClrCycleNum() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp02015ClrCycleNum
			                 ,IP_02015_CLR_CYCLE_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip02015ClrCycleNum", beginIp02015ClrCycleNum,IP_02015_CLR_CYCLE_NUM_LEN);
    }
   	}
     int localIp02015DtaWrhsOnsoilSwCounter = -1;
     public boolean isIp02015DtaWrhsOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015DtaWrhsOnsoilSwCounter != sharedCounter;
         localIp02015DtaWrhsOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_DTA_WRHS_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02015DtaWrhsOnsoilSw
	 */
   protected void serializeIp02015DtaWrhsOnsoilSw(char[] ip02015DtaWrhsOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015DtaWrhsOnsoilSw,0,getStringValue(),beginIp02015DtaWrhsOnsoilSw,IP_02015_DTA_WRHS_ONSOIL_SW_LEN);
       localIp02015DtaWrhsOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015DtaWrhsOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015DtaWrhsOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015DtaWrhsOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02015DtaWrhsOnsoilSw,beginIp02015DtaWrhsOnsoilSw + IP_02015_DTA_WRHS_ONSOIL_SW_LEN));
   	}
     int localIp02015BllngOnsoilSwCounter = -1;
     public boolean isIp02015BllngOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015BllngOnsoilSwCounter != sharedCounter;
         localIp02015BllngOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_BLLNG_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02015BllngOnsoilSw
	 */
   protected void serializeIp02015BllngOnsoilSw(char[] ip02015BllngOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015BllngOnsoilSw,0,getStringValue(),beginIp02015BllngOnsoilSw,IP_02015_BLLNG_ONSOIL_SW_LEN);
       localIp02015BllngOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015BllngOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015BllngOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015BllngOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02015BllngOnsoilSw,beginIp02015BllngOnsoilSw + IP_02015_BLLNG_ONSOIL_SW_LEN));
   	}
     int localIp02015SetlOnsoilSwCounter = -1;
     public boolean isIp02015SetlOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015SetlOnsoilSwCounter != sharedCounter;
         localIp02015SetlOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_SETL_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02015SetlOnsoilSw
	 */
   protected void serializeIp02015SetlOnsoilSw(char[] ip02015SetlOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015SetlOnsoilSw,0,getStringValue(),beginIp02015SetlOnsoilSw,IP_02015_SETL_ONSOIL_SW_LEN);
       localIp02015SetlOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015SetlOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015SetlOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015SetlOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02015SetlOnsoilSw,beginIp02015SetlOnsoilSw + IP_02015_SETL_ONSOIL_SW_LEN));
   	}
     int localIp02015ClrOnsoilSwCounter = -1;
     public boolean isIp02015ClrOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015ClrOnsoilSwCounter != sharedCounter;
         localIp02015ClrOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_CLR_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02015ClrOnsoilSw
	 */
   protected void serializeIp02015ClrOnsoilSw(char[] ip02015ClrOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015ClrOnsoilSw,0,getStringValue(),beginIp02015ClrOnsoilSw,IP_02015_CLR_ONSOIL_SW_LEN);
       localIp02015ClrOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015ClrOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015ClrOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015ClrOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02015ClrOnsoilSw,beginIp02015ClrOnsoilSw + IP_02015_CLR_ONSOIL_SW_LEN));
   	}
     int localIp02015AmsOnsoilSwCounter = -1;
     public boolean isIp02015AmsOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015AmsOnsoilSwCounter != sharedCounter;
         localIp02015AmsOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_AMS_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02015AmsOnsoilSw
	 */
   protected void serializeIp02015AmsOnsoilSw(char[] ip02015AmsOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015AmsOnsoilSw,0,getStringValue(),beginIp02015AmsOnsoilSw,IP_02015_AMS_ONSOIL_SW_LEN);
       localIp02015AmsOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015AmsOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015AmsOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015AmsOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02015AmsOnsoilSw,beginIp02015AmsOnsoilSw + IP_02015_AMS_ONSOIL_SW_LEN));
   	}
     int localIp02015McomOnsoilSwCounter = -1;
     public boolean isIp02015McomOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015McomOnsoilSwCounter != sharedCounter;
         localIp02015McomOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_MCOM_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02015McomOnsoilSw
	 */
   protected void serializeIp02015McomOnsoilSw(char[] ip02015McomOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015McomOnsoilSw,0,getStringValue(),beginIp02015McomOnsoilSw,IP_02015_MCOM_ONSOIL_SW_LEN);
       localIp02015McomOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015McomOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015McomOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015McomOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02015McomOnsoilSw,beginIp02015McomOnsoilSw + IP_02015_MCOM_ONSOIL_SW_LEN));
   	}
     int localIp02015MdsOnsoilSwCounter = -1;
     public boolean isIp02015MdsOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015MdsOnsoilSwCounter != sharedCounter;
         localIp02015MdsOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_MDS_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02015MdsOnsoilSw
	 */
   protected void serializeIp02015MdsOnsoilSw(char[] ip02015MdsOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015MdsOnsoilSw,0,getStringValue(),beginIp02015MdsOnsoilSw,IP_02015_MDS_ONSOIL_SW_LEN);
       localIp02015MdsOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015MdsOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015MdsOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015MdsOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02015MdsOnsoilSw,beginIp02015MdsOnsoilSw + IP_02015_MDS_ONSOIL_SW_LEN));
   	}
     int localIp02015StndInOnsoilSwCounter = -1;
     public boolean isIp02015StndInOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015StndInOnsoilSwCounter != sharedCounter;
         localIp02015StndInOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_STND_IN_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02015StndInOnsoilSw
	 */
   protected void serializeIp02015StndInOnsoilSw(char[] ip02015StndInOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015StndInOnsoilSw,0,getStringValue(),beginIp02015StndInOnsoilSw,IP_02015_STND_IN_ONSOIL_SW_LEN);
       localIp02015StndInOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015StndInOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015StndInOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015StndInOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02015StndInOnsoilSw,beginIp02015StndInOnsoilSw + IP_02015_STND_IN_ONSOIL_SW_LEN));
   	}
     int localIp02015AuthOnsoilSwCounter = -1;
     public boolean isIp02015AuthOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015AuthOnsoilSwCounter != sharedCounter;
         localIp02015AuthOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_AUTH_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02015AuthOnsoilSw
	 */
   protected void serializeIp02015AuthOnsoilSw(char[] ip02015AuthOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015AuthOnsoilSw,0,getStringValue(),beginIp02015AuthOnsoilSw,IP_02015_AUTH_ONSOIL_SW_LEN);
       localIp02015AuthOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015AuthOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015AuthOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015AuthOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02015AuthOnsoilSw,beginIp02015AuthOnsoilSw + IP_02015_AUTH_ONSOIL_SW_LEN));
   	}
     int localIp02015RptHdrNameCounter = -1;
     public boolean isIp02015RptHdrNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015RptHdrNameCounter != sharedCounter;
         localIp02015RptHdrNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_RPT_HDR_NAME_LEN = 80;
	/**
	 * 	serialize this Ip02015RptHdrName
	 */
   protected void serializeIp02015RptHdrName(char[] ip02015RptHdrName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015RptHdrName,0,getStringValue(),beginIp02015RptHdrName,IP_02015_RPT_HDR_NAME_LEN);
       localIp02015RptHdrNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015RptHdrNameConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshIp02015RptHdrName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015RptHdrName() {	 
   		return (substring(getStringValue(),beginIp02015RptHdrName,beginIp02015RptHdrName + IP_02015_RPT_HDR_NAME_LEN));
   	}
     int localIp02015ClrPrcssCdCounter = -1;
     public boolean isIp02015ClrPrcssCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015ClrPrcssCdCounter != sharedCounter;
         localIp02015ClrPrcssCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_CLR_PRCSS_CD_LEN = 4;
	/**
	 * 	serialize this Ip02015ClrPrcssCd
	 */
   protected void serializeIp02015ClrPrcssCd(char[] ip02015ClrPrcssCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015ClrPrcssCd,0,getStringValue(),beginIp02015ClrPrcssCd,IP_02015_CLR_PRCSS_CD_LEN);
       localIp02015ClrPrcssCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015ClrPrcssCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp02015ClrPrcssCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015ClrPrcssCd() {	 
   		return (substring(getStringValue(),beginIp02015ClrPrcssCd,beginIp02015ClrPrcssCd + IP_02015_CLR_PRCSS_CD_LEN));
   	}
     int localIp02015OnUsPrcssAgrmtIdCounter = -1;
     public boolean isIp02015OnUsPrcssAgrmtIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015OnUsPrcssAgrmtIdCounter != sharedCounter;
         localIp02015OnUsPrcssAgrmtIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_ON_US_PRCSS_AGRMT_ID_LEN = 11;
	/**
	 * 	serialize this Ip02015OnUsPrcssAgrmtId
	 */
   protected void serializeIp02015OnUsPrcssAgrmtId(char[] ip02015OnUsPrcssAgrmtId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015OnUsPrcssAgrmtId,0,getStringValue(),beginIp02015OnUsPrcssAgrmtId,IP_02015_ON_US_PRCSS_AGRMT_ID_LEN);
       localIp02015OnUsPrcssAgrmtIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015OnUsPrcssAgrmtIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshIp02015OnUsPrcssAgrmtId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015OnUsPrcssAgrmtId() {	 
   		return (substring(getStringValue(),beginIp02015OnUsPrcssAgrmtId,beginIp02015OnUsPrcssAgrmtId + IP_02015_ON_US_PRCSS_AGRMT_ID_LEN));
   	}
     int localIp02015PushOnsoilSwCounter = -1;
     public boolean isIp02015PushOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015PushOnsoilSwCounter != sharedCounter;
         localIp02015PushOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_PUSH_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02015PushOnsoilSw
	 */
   protected void serializeIp02015PushOnsoilSw(char[] ip02015PushOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015PushOnsoilSw,0,getStringValue(),beginIp02015PushOnsoilSw,IP_02015_PUSH_ONSOIL_SW_LEN);
       localIp02015PushOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015PushOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015PushOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015PushOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02015PushOnsoilSw,beginIp02015PushOnsoilSw + IP_02015_PUSH_ONSOIL_SW_LEN));
   	}
     int localIp02015IncontrolOnsoilSwCounter = -1;
     public boolean isIp02015IncontrolOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015IncontrolOnsoilSwCounter != sharedCounter;
         localIp02015IncontrolOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_INCONTROL_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02015IncontrolOnsoilSw
	 */
   protected void serializeIp02015IncontrolOnsoilSw(char[] ip02015IncontrolOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015IncontrolOnsoilSw,0,getStringValue(),beginIp02015IncontrolOnsoilSw,IP_02015_INCONTROL_ONSOIL_SW_LEN);
       localIp02015IncontrolOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015IncontrolOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015IncontrolOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015IncontrolOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02015IncontrolOnsoilSw,beginIp02015IncontrolOnsoilSw + IP_02015_INCONTROL_ONSOIL_SW_LEN));
   	}
     int localIp02015EsrvcOnsoilSwCounter = -1;
     public boolean isIp02015EsrvcOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015EsrvcOnsoilSwCounter != sharedCounter;
         localIp02015EsrvcOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_ESRVC_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02015EsrvcOnsoilSw
	 */
   protected void serializeIp02015EsrvcOnsoilSw(char[] ip02015EsrvcOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015EsrvcOnsoilSw,0,getStringValue(),beginIp02015EsrvcOnsoilSw,IP_02015_ESRVC_ONSOIL_SW_LEN);
       localIp02015EsrvcOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015EsrvcOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015EsrvcOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015EsrvcOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02015EsrvcOnsoilSw,beginIp02015EsrvcOnsoilSw + IP_02015_ESRVC_ONSOIL_SW_LEN));
   	}
     int localIp02015GftOnsoilSwCounter = -1;
     public boolean isIp02015GftOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015GftOnsoilSwCounter != sharedCounter;
         localIp02015GftOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_GFT_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02015GftOnsoilSw
	 */
   protected void serializeIp02015GftOnsoilSw(char[] ip02015GftOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015GftOnsoilSw,0,getStringValue(),beginIp02015GftOnsoilSw,IP_02015_GFT_ONSOIL_SW_LEN);
       localIp02015GftOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015GftOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015GftOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015GftOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02015GftOnsoilSw,beginIp02015GftOnsoilSw + IP_02015_GFT_ONSOIL_SW_LEN));
   	}
     int localIp02015BnknetOnsoilSwCounter = -1;
     public boolean isIp02015BnknetOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015BnknetOnsoilSwCounter != sharedCounter;
         localIp02015BnknetOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_BNKNET_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02015BnknetOnsoilSw
	 */
   protected void serializeIp02015BnknetOnsoilSw(char[] ip02015BnknetOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015BnknetOnsoilSw,0,getStringValue(),beginIp02015BnknetOnsoilSw,IP_02015_BNKNET_ONSOIL_SW_LEN);
       localIp02015BnknetOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015BnknetOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015BnknetOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015BnknetOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02015BnknetOnsoilSw,beginIp02015BnknetOnsoilSw + IP_02015_BNKNET_ONSOIL_SW_LEN));
   	}
     int localIp02015MdesOnsoilSwCounter = -1;
     public boolean isIp02015MdesOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015MdesOnsoilSwCounter != sharedCounter;
         localIp02015MdesOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_MDES_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02015MdesOnsoilSw
	 */
   protected void serializeIp02015MdesOnsoilSw(char[] ip02015MdesOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015MdesOnsoilSw,0,getStringValue(),beginIp02015MdesOnsoilSw,IP_02015_MDES_ONSOIL_SW_LEN);
       localIp02015MdesOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015MdesOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015MdesOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015MdesOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02015MdesOnsoilSw,beginIp02015MdesOnsoilSw + IP_02015_MDES_ONSOIL_SW_LEN));
   	}
     int localIp02015ZappOnsoilSwCounter = -1;
     public boolean isIp02015ZappOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015ZappOnsoilSwCounter != sharedCounter;
         localIp02015ZappOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_ZAPP_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02015ZappOnsoilSw
	 */
   protected void serializeIp02015ZappOnsoilSw(char[] ip02015ZappOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015ZappOnsoilSw,0,getStringValue(),beginIp02015ZappOnsoilSw,IP_02015_ZAPP_ONSOIL_SW_LEN);
       localIp02015ZappOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015ZappOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015ZappOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015ZappOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02015ZappOnsoilSw,beginIp02015ZappOnsoilSw + IP_02015_ZAPP_ONSOIL_SW_LEN));
   	}
     int localIp02015CemOnsoilSwCounter = -1;
     public boolean isIp02015CemOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015CemOnsoilSwCounter != sharedCounter;
         localIp02015CemOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_CEM_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02015CemOnsoilSw
	 */
   protected void serializeIp02015CemOnsoilSw(char[] ip02015CemOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015CemOnsoilSw,0,getStringValue(),beginIp02015CemOnsoilSw,IP_02015_CEM_ONSOIL_SW_LEN);
       localIp02015CemOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015CemOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02015CemOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015CemOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02015CemOnsoilSw,beginIp02015CemOnsoilSw + IP_02015_CEM_ONSOIL_SW_LEN));
   	}
     int localIp02015OperSysIdCounter = -1;
     public boolean isIp02015OperSysIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015OperSysIdCounter != sharedCounter;
         localIp02015OperSysIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_OPER_SYS_ID_LEN = 20;
	/**
	 * 	serialize this Ip02015OperSysId
	 */
   protected void serializeIp02015OperSysId(char[] ip02015OperSysId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015OperSysId,0,getStringValue(),beginIp02015OperSysId,IP_02015_OPER_SYS_ID_LEN);
       localIp02015OperSysIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015OperSysIdConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshIp02015OperSysId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015OperSysId() {	 
   		return (substring(getStringValue(),beginIp02015OperSysId,beginIp02015OperSysId + IP_02015_OPER_SYS_ID_LEN));
   	}
     int localIp02015DbIdCounter = -1;
     public boolean isIp02015DbIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015DbIdCounter != sharedCounter;
         localIp02015DbIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_DB_ID_LEN = 20;
	/**
	 * 	serialize this Ip02015DbId
	 */
   protected void serializeIp02015DbId(char[] ip02015DbId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015DbId,0,getStringValue(),beginIp02015DbId,IP_02015_DB_ID_LEN);
       localIp02015DbIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015DbIdConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshIp02015DbId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015DbId() {	 
   		return (substring(getStringValue(),beginIp02015DbId,beginIp02015DbId + IP_02015_DB_ID_LEN));
   	}
     int localIp02015FillerCounter = -1;
     public boolean isIp02015FillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02015FillerCounter != sharedCounter;
         localIp02015FillerCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02015_FILLER_LEN = 390;
	/**
	 * 	serialize this Ip02015Filler
	 */
   protected void serializeIp02015Filler(char[] ip02015Filler) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02015Filler,0,getStringValue(),beginIp02015Filler,IP_02015_FILLER_LEN);
       localIp02015FillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02015FillerConstraints(char[] value) {
   			return super.checkConstraints(value , 390 ,false, false);
   }
    /**
	 *	refreshIp02015Filler is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02015Filler() {	 
   		return (substring(getStringValue(),beginIp02015Filler,beginIp02015Filler + IP_02015_FILLER_LEN));
   	}

		public int ip02015Db2TableSize() {
			return IP_02015_DB_2_TABLE_SIZE;
		}



}
  

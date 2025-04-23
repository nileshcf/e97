package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip02014TableDataFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip02014TableDataFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip02014TableDataFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_02014_TABLE_DATA_FIELDS_LENGTH = 921;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp02014GeoScopeCode;
            protected  int beginIp02014HostInd;
            protected  int beginIp02014NumCurrCd;
            protected  int beginIp02014OfsoilDataTypCd;
            protected  int beginIp02014MrchntSplitCd;
            protected  int beginIp02014MrchntSplitSw;
            protected  int beginIp02014CurrSplitCd;
            protected  int beginIp02014CurrSplitSw;
            protected  int beginIp02014AcquirerSplitCd;
            protected  int beginIp02014AcquirerSplitSw;
            protected  int beginIp02014DomCollOnlyCd;
            protected  int beginIp02014OnsoilDataShrSw;
            protected  int beginIp02014ClrCycleNum;
            protected  int beginIp02014DtaWrhsOnsoilSw;
            protected  int beginIp02014BllngOnsoilSw;
            protected  int beginIp02014SetlOnsoilSw;
            protected  int beginIp02014ClrOnsoilSw;
            protected  int beginIp02014AmsOnsoilSw;
            protected  int beginIp02014McomOnsoilSw;
            protected  int beginIp02014MdsOnsoilSw;
            protected  int beginIp02014StndInOnsoilSw;
            protected  int beginIp02014AuthOnsoilSw;
            protected  int beginIp02014PushOnsoilSw;
            protected  int beginIp02014IncontrolOnsoilSw;
            protected  int beginIp02014EsrvcOnsoilSw;
            protected  int beginIp02014GftOnsoilSw;
            protected  int beginIp02014BnknetOnsoilSw;
            protected  int beginIp02014MdesOnsoilSw;
            protected  int beginIp02014ZappOnsoilSw;
            protected  int beginIp02014CemOnsoilSw;
            protected  int beginIp02014RptHdrName;
            protected  int beginIp02014ClrPrcssCd;
            protected  int beginIp02014OnUsPrcssAgrmtId;
            protected  int beginIp02014OperSysId;
            protected  int beginIp02014DbId;
           protected int beginIp02014Db2Table;
           protected static final int IP_02014_DB_2_TABLE_SIZE = 10;
            protected  int beginIp02014Filler;
	
	/**
	* Constructor for Ip02014TableDataFieldsSerialized
	**/
    public Ip02014TableDataFieldsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip02014TableDataFieldsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014TableDataFieldsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip02014TableDataFieldsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,11); // serialize this field at offset 11 by default 
    }
    
	/**
	* sets parent for this Ip02014TableDataFieldsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 11 by default
    }    
	/**
	* initializes the field in Ip02014TableDataFieldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_02014_TABLE_DATA_FIELDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp02014GeoScopeCode = getStartOffset() + 0;	// set offset for serialization
  
             beginIp02014HostInd = getStartOffset() + 1;	// set offset for serialization
  
  
             beginIp02014NumCurrCd = getStartOffset() + 6;	// set offset for serialization
  
             beginIp02014OfsoilDataTypCd = getStartOffset() + 9;	// set offset for serialization
  
             beginIp02014MrchntSplitCd = getStartOffset() + 12;	// set offset for serialization
  
             beginIp02014MrchntSplitSw = getStartOffset() + 12;	// set offset for serialization
  
             beginIp02014CurrSplitCd = getStartOffset() + 13;	// set offset for serialization
  
             beginIp02014CurrSplitSw = getStartOffset() + 13;	// set offset for serialization
  
             beginIp02014AcquirerSplitCd = getStartOffset() + 14;	// set offset for serialization
  
             beginIp02014AcquirerSplitSw = getStartOffset() + 14;	// set offset for serialization
  
             beginIp02014DomCollOnlyCd = getStartOffset() + 15;	// set offset for serialization
  
             beginIp02014OnsoilDataShrSw = getStartOffset() + 16;	// set offset for serialization
  
             beginIp02014ClrCycleNum = getStartOffset() + 17;	// set offset for serialization
  
             beginIp02014DtaWrhsOnsoilSw = getStartOffset() + 19;	// set offset for serialization
  
             beginIp02014BllngOnsoilSw = getStartOffset() + 20;	// set offset for serialization
  
             beginIp02014SetlOnsoilSw = getStartOffset() + 21;	// set offset for serialization
  
             beginIp02014ClrOnsoilSw = getStartOffset() + 22;	// set offset for serialization
  
             beginIp02014AmsOnsoilSw = getStartOffset() + 23;	// set offset for serialization
  
             beginIp02014McomOnsoilSw = getStartOffset() + 24;	// set offset for serialization
  
             beginIp02014MdsOnsoilSw = getStartOffset() + 25;	// set offset for serialization
  
             beginIp02014StndInOnsoilSw = getStartOffset() + 26;	// set offset for serialization
  
             beginIp02014AuthOnsoilSw = getStartOffset() + 27;	// set offset for serialization
  
             beginIp02014PushOnsoilSw = getStartOffset() + 28;	// set offset for serialization
  
             beginIp02014IncontrolOnsoilSw = getStartOffset() + 29;	// set offset for serialization
  
             beginIp02014EsrvcOnsoilSw = getStartOffset() + 30;	// set offset for serialization
  
             beginIp02014GftOnsoilSw = getStartOffset() + 31;	// set offset for serialization
  
             beginIp02014BnknetOnsoilSw = getStartOffset() + 32;	// set offset for serialization
  
             beginIp02014MdesOnsoilSw = getStartOffset() + 33;	// set offset for serialization
  
             beginIp02014ZappOnsoilSw = getStartOffset() + 34;	// set offset for serialization
  
             beginIp02014CemOnsoilSw = getStartOffset() + 35;	// set offset for serialization
  
             beginIp02014RptHdrName = getStartOffset() + 36;	// set offset for serialization
  
             beginIp02014ClrPrcssCd = getStartOffset() + 116;	// set offset for serialization
  
             beginIp02014OnUsPrcssAgrmtId = getStartOffset() + 120;	// set offset for serialization
  
             beginIp02014OperSysId = getStartOffset() + 131;	// set offset for serialization
  
             beginIp02014DbId = getStartOffset() + 151;	// set offset for serialization
  
	        beginIp02014Db2Table = getStartOffset() + 163; // set offset for serialization
  
             beginIp02014Filler = getStartOffset() + 171;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp02014GeoScopeCodeCounter = -1;
     public boolean isIp02014GeoScopeCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014GeoScopeCodeCounter != sharedCounter;
         localIp02014GeoScopeCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_GEO_SCOPE_CODE_LEN = 1;
	/**
	 * 	serialize this Ip02014GeoScopeCode
	 */
   protected void serializeIp02014GeoScopeCode(char[] ip02014GeoScopeCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014GeoScopeCode,0,getStringValue(),beginIp02014GeoScopeCode,IP_02014_GEO_SCOPE_CODE_LEN);
       localIp02014GeoScopeCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014GeoScopeCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014GeoScopeCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014GeoScopeCode() {	 
   		return (substring(getStringValue(),beginIp02014GeoScopeCode,beginIp02014GeoScopeCode + IP_02014_GEO_SCOPE_CODE_LEN));
   	}
     int localIp02014HostIndCounter = -1;
     public boolean isIp02014HostIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014HostIndCounter != sharedCounter;
         localIp02014HostIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_HOST_IND_LEN = 1;
	/**
	 * 	serialize this Ip02014HostInd
	 */
   protected void serializeIp02014HostInd(char[] ip02014HostInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014HostInd,0,getStringValue(),beginIp02014HostInd,IP_02014_HOST_IND_LEN);
       localIp02014HostIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014HostIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014HostInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014HostInd() {	 
   		return (substring(getStringValue(),beginIp02014HostInd,beginIp02014HostInd + IP_02014_HOST_IND_LEN));
   	}
     int localIp02014NumCurrCdCounter = -1;
     public boolean isIp02014NumCurrCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014NumCurrCdCounter != sharedCounter;
         localIp02014NumCurrCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip02014NumCurrCd
	 *	@return ip02014NumCurrCd
	 */
	public char[]  getIp02014NumCurrCdString() {
	     return getCharArray(beginIp02014NumCurrCd,IP_02014_NUM_CURR_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip02014NumCurrCdIsNumeric() {
	    return isNumeric(beginIp02014NumCurrCd
	                    ,beginIp02014NumCurrCd + IP_02014_NUM_CURR_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_02014_NUM_CURR_CD_LEN = 3;
  	/**
	 * serializeIp02014NumCurrCd
	 */
	protected void serializeIp02014NumCurrCd(int ip02014NumCurrCd) {
		 putNumber(beginIp02014NumCurrCd,ip02014NumCurrCd,IP_02014_NUM_CURR_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp02014NumCurrCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp02014NumCurrCd
	 */
   	protected  int serializeIp02014NumCurrCd(char[] value) {
	    int  ip02014NumCurrCd;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip02014NumCurrCd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp02014NumCurrCd
		       ,3
		      );
		 localIp02014NumCurrCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip02014NumCurrCd;
    }

   protected int checkIp02014NumCurrCdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp02014NumCurrCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp02014NumCurrCd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp02014NumCurrCd
			                 ,IP_02014_NUM_CURR_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip02014NumCurrCd", beginIp02014NumCurrCd,IP_02014_NUM_CURR_CD_LEN);
    }
   	}
     int localIp02014OfsoilDataTypCdCounter = -1;
     public boolean isIp02014OfsoilDataTypCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014OfsoilDataTypCdCounter != sharedCounter;
         localIp02014OfsoilDataTypCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_OFSOIL_DATA_TYP_CD_LEN = 3;
	/**
	 * 	serialize this Ip02014OfsoilDataTypCd
	 */
   protected void serializeIp02014OfsoilDataTypCd(char[] ip02014OfsoilDataTypCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014OfsoilDataTypCd,0,getStringValue(),beginIp02014OfsoilDataTypCd,IP_02014_OFSOIL_DATA_TYP_CD_LEN);
       localIp02014OfsoilDataTypCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014OfsoilDataTypCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp02014OfsoilDataTypCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014OfsoilDataTypCd() {	 
   		return (substring(getStringValue(),beginIp02014OfsoilDataTypCd,beginIp02014OfsoilDataTypCd + IP_02014_OFSOIL_DATA_TYP_CD_LEN));
   	}
     int localIp02014MrchntSplitCdCounter = -1;
     public boolean isIp02014MrchntSplitCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014MrchntSplitCdCounter != sharedCounter;
         localIp02014MrchntSplitCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_MRCHNT_SPLIT_CD_LEN = 1;
	/**
	 * 	serialize this Ip02014MrchntSplitCd
	 */
   protected void serializeIp02014MrchntSplitCd(char[] ip02014MrchntSplitCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014MrchntSplitCd,0,getStringValue(),beginIp02014MrchntSplitCd,IP_02014_MRCHNT_SPLIT_CD_LEN);
       localIp02014MrchntSplitCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014MrchntSplitCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014MrchntSplitCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014MrchntSplitCd() {	 
   		return (substring(getStringValue(),beginIp02014MrchntSplitCd,beginIp02014MrchntSplitCd + IP_02014_MRCHNT_SPLIT_CD_LEN));
   	}
     int localIp02014MrchntSplitSwCounter = -1;
     public boolean isIp02014MrchntSplitSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014MrchntSplitSwCounter != sharedCounter;
         localIp02014MrchntSplitSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_MRCHNT_SPLIT_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014MrchntSplitSw
	 */
   protected void serializeIp02014MrchntSplitSw(char[] ip02014MrchntSplitSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014MrchntSplitSw,0,getStringValue(),beginIp02014MrchntSplitSw,IP_02014_MRCHNT_SPLIT_SW_LEN);
       localIp02014MrchntSplitSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014MrchntSplitSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014MrchntSplitSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014MrchntSplitSw() {	 
   		return (substring(getStringValue(),beginIp02014MrchntSplitSw,beginIp02014MrchntSplitSw + IP_02014_MRCHNT_SPLIT_SW_LEN));
   	}
     int localIp02014CurrSplitCdCounter = -1;
     public boolean isIp02014CurrSplitCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014CurrSplitCdCounter != sharedCounter;
         localIp02014CurrSplitCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_CURR_SPLIT_CD_LEN = 1;
	/**
	 * 	serialize this Ip02014CurrSplitCd
	 */
   protected void serializeIp02014CurrSplitCd(char[] ip02014CurrSplitCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014CurrSplitCd,0,getStringValue(),beginIp02014CurrSplitCd,IP_02014_CURR_SPLIT_CD_LEN);
       localIp02014CurrSplitCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014CurrSplitCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014CurrSplitCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014CurrSplitCd() {	 
   		return (substring(getStringValue(),beginIp02014CurrSplitCd,beginIp02014CurrSplitCd + IP_02014_CURR_SPLIT_CD_LEN));
   	}
     int localIp02014CurrSplitSwCounter = -1;
     public boolean isIp02014CurrSplitSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014CurrSplitSwCounter != sharedCounter;
         localIp02014CurrSplitSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_CURR_SPLIT_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014CurrSplitSw
	 */
   protected void serializeIp02014CurrSplitSw(char[] ip02014CurrSplitSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014CurrSplitSw,0,getStringValue(),beginIp02014CurrSplitSw,IP_02014_CURR_SPLIT_SW_LEN);
       localIp02014CurrSplitSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014CurrSplitSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014CurrSplitSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014CurrSplitSw() {	 
   		return (substring(getStringValue(),beginIp02014CurrSplitSw,beginIp02014CurrSplitSw + IP_02014_CURR_SPLIT_SW_LEN));
   	}
     int localIp02014AcquirerSplitCdCounter = -1;
     public boolean isIp02014AcquirerSplitCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014AcquirerSplitCdCounter != sharedCounter;
         localIp02014AcquirerSplitCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_ACQUIRER_SPLIT_CD_LEN = 1;
	/**
	 * 	serialize this Ip02014AcquirerSplitCd
	 */
   protected void serializeIp02014AcquirerSplitCd(char[] ip02014AcquirerSplitCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014AcquirerSplitCd,0,getStringValue(),beginIp02014AcquirerSplitCd,IP_02014_ACQUIRER_SPLIT_CD_LEN);
       localIp02014AcquirerSplitCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014AcquirerSplitCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014AcquirerSplitCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014AcquirerSplitCd() {	 
   		return (substring(getStringValue(),beginIp02014AcquirerSplitCd,beginIp02014AcquirerSplitCd + IP_02014_ACQUIRER_SPLIT_CD_LEN));
   	}
     int localIp02014AcquirerSplitSwCounter = -1;
     public boolean isIp02014AcquirerSplitSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014AcquirerSplitSwCounter != sharedCounter;
         localIp02014AcquirerSplitSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_ACQUIRER_SPLIT_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014AcquirerSplitSw
	 */
   protected void serializeIp02014AcquirerSplitSw(char[] ip02014AcquirerSplitSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014AcquirerSplitSw,0,getStringValue(),beginIp02014AcquirerSplitSw,IP_02014_ACQUIRER_SPLIT_SW_LEN);
       localIp02014AcquirerSplitSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014AcquirerSplitSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014AcquirerSplitSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014AcquirerSplitSw() {	 
   		return (substring(getStringValue(),beginIp02014AcquirerSplitSw,beginIp02014AcquirerSplitSw + IP_02014_ACQUIRER_SPLIT_SW_LEN));
   	}
     int localIp02014DomCollOnlyCdCounter = -1;
     public boolean isIp02014DomCollOnlyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014DomCollOnlyCdCounter != sharedCounter;
         localIp02014DomCollOnlyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_DOM_COLL_ONLY_CD_LEN = 1;
	/**
	 * 	serialize this Ip02014DomCollOnlyCd
	 */
   protected void serializeIp02014DomCollOnlyCd(char[] ip02014DomCollOnlyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014DomCollOnlyCd,0,getStringValue(),beginIp02014DomCollOnlyCd,IP_02014_DOM_COLL_ONLY_CD_LEN);
       localIp02014DomCollOnlyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014DomCollOnlyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014DomCollOnlyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014DomCollOnlyCd() {	 
   		return (substring(getStringValue(),beginIp02014DomCollOnlyCd,beginIp02014DomCollOnlyCd + IP_02014_DOM_COLL_ONLY_CD_LEN));
   	}
     int localIp02014OnsoilDataShrSwCounter = -1;
     public boolean isIp02014OnsoilDataShrSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014OnsoilDataShrSwCounter != sharedCounter;
         localIp02014OnsoilDataShrSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_ONSOIL_DATA_SHR_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014OnsoilDataShrSw
	 */
   protected void serializeIp02014OnsoilDataShrSw(char[] ip02014OnsoilDataShrSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014OnsoilDataShrSw,0,getStringValue(),beginIp02014OnsoilDataShrSw,IP_02014_ONSOIL_DATA_SHR_SW_LEN);
       localIp02014OnsoilDataShrSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014OnsoilDataShrSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014OnsoilDataShrSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014OnsoilDataShrSw() {	 
   		return (substring(getStringValue(),beginIp02014OnsoilDataShrSw,beginIp02014OnsoilDataShrSw + IP_02014_ONSOIL_DATA_SHR_SW_LEN));
   	}
     int localIp02014ClrCycleNumCounter = -1;
     public boolean isIp02014ClrCycleNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014ClrCycleNumCounter != sharedCounter;
         localIp02014ClrCycleNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip02014ClrCycleNum
	 *	@return ip02014ClrCycleNum
	 */
	public char[]  getIp02014ClrCycleNumString() {
	     return getCharArray(beginIp02014ClrCycleNum,IP_02014_CLR_CYCLE_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip02014ClrCycleNumIsNumeric() {
	    return isNumeric(beginIp02014ClrCycleNum
	                    ,beginIp02014ClrCycleNum + IP_02014_CLR_CYCLE_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_02014_CLR_CYCLE_NUM_LEN = 2;
  	/**
	 * serializeIp02014ClrCycleNum
	 */
	protected void serializeIp02014ClrCycleNum(int ip02014ClrCycleNum) {
		 putNumber(beginIp02014ClrCycleNum,ip02014ClrCycleNum,IP_02014_CLR_CYCLE_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp02014ClrCycleNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp02014ClrCycleNum
	 */
   	protected  int serializeIp02014ClrCycleNum(char[] value) {
	    int  ip02014ClrCycleNum;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip02014ClrCycleNum = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp02014ClrCycleNum
		       ,2
		      );
		 localIp02014ClrCycleNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip02014ClrCycleNum;
    }

   protected int checkIp02014ClrCycleNumMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp02014ClrCycleNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp02014ClrCycleNum() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp02014ClrCycleNum
			                 ,IP_02014_CLR_CYCLE_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip02014ClrCycleNum", beginIp02014ClrCycleNum,IP_02014_CLR_CYCLE_NUM_LEN);
    }
   	}
     int localIp02014DtaWrhsOnsoilSwCounter = -1;
     public boolean isIp02014DtaWrhsOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014DtaWrhsOnsoilSwCounter != sharedCounter;
         localIp02014DtaWrhsOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_DTA_WRHS_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014DtaWrhsOnsoilSw
	 */
   protected void serializeIp02014DtaWrhsOnsoilSw(char[] ip02014DtaWrhsOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014DtaWrhsOnsoilSw,0,getStringValue(),beginIp02014DtaWrhsOnsoilSw,IP_02014_DTA_WRHS_ONSOIL_SW_LEN);
       localIp02014DtaWrhsOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014DtaWrhsOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014DtaWrhsOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014DtaWrhsOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014DtaWrhsOnsoilSw,beginIp02014DtaWrhsOnsoilSw + IP_02014_DTA_WRHS_ONSOIL_SW_LEN));
   	}
     int localIp02014BllngOnsoilSwCounter = -1;
     public boolean isIp02014BllngOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014BllngOnsoilSwCounter != sharedCounter;
         localIp02014BllngOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_BLLNG_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014BllngOnsoilSw
	 */
   protected void serializeIp02014BllngOnsoilSw(char[] ip02014BllngOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014BllngOnsoilSw,0,getStringValue(),beginIp02014BllngOnsoilSw,IP_02014_BLLNG_ONSOIL_SW_LEN);
       localIp02014BllngOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014BllngOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014BllngOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014BllngOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014BllngOnsoilSw,beginIp02014BllngOnsoilSw + IP_02014_BLLNG_ONSOIL_SW_LEN));
   	}
     int localIp02014SetlOnsoilSwCounter = -1;
     public boolean isIp02014SetlOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014SetlOnsoilSwCounter != sharedCounter;
         localIp02014SetlOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_SETL_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014SetlOnsoilSw
	 */
   protected void serializeIp02014SetlOnsoilSw(char[] ip02014SetlOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014SetlOnsoilSw,0,getStringValue(),beginIp02014SetlOnsoilSw,IP_02014_SETL_ONSOIL_SW_LEN);
       localIp02014SetlOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014SetlOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014SetlOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014SetlOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014SetlOnsoilSw,beginIp02014SetlOnsoilSw + IP_02014_SETL_ONSOIL_SW_LEN));
   	}
     int localIp02014ClrOnsoilSwCounter = -1;
     public boolean isIp02014ClrOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014ClrOnsoilSwCounter != sharedCounter;
         localIp02014ClrOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_CLR_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014ClrOnsoilSw
	 */
   protected void serializeIp02014ClrOnsoilSw(char[] ip02014ClrOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014ClrOnsoilSw,0,getStringValue(),beginIp02014ClrOnsoilSw,IP_02014_CLR_ONSOIL_SW_LEN);
       localIp02014ClrOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014ClrOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014ClrOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014ClrOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014ClrOnsoilSw,beginIp02014ClrOnsoilSw + IP_02014_CLR_ONSOIL_SW_LEN));
   	}
     int localIp02014AmsOnsoilSwCounter = -1;
     public boolean isIp02014AmsOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014AmsOnsoilSwCounter != sharedCounter;
         localIp02014AmsOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_AMS_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014AmsOnsoilSw
	 */
   protected void serializeIp02014AmsOnsoilSw(char[] ip02014AmsOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014AmsOnsoilSw,0,getStringValue(),beginIp02014AmsOnsoilSw,IP_02014_AMS_ONSOIL_SW_LEN);
       localIp02014AmsOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014AmsOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014AmsOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014AmsOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014AmsOnsoilSw,beginIp02014AmsOnsoilSw + IP_02014_AMS_ONSOIL_SW_LEN));
   	}
     int localIp02014McomOnsoilSwCounter = -1;
     public boolean isIp02014McomOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014McomOnsoilSwCounter != sharedCounter;
         localIp02014McomOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_MCOM_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014McomOnsoilSw
	 */
   protected void serializeIp02014McomOnsoilSw(char[] ip02014McomOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014McomOnsoilSw,0,getStringValue(),beginIp02014McomOnsoilSw,IP_02014_MCOM_ONSOIL_SW_LEN);
       localIp02014McomOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014McomOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014McomOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014McomOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014McomOnsoilSw,beginIp02014McomOnsoilSw + IP_02014_MCOM_ONSOIL_SW_LEN));
   	}
     int localIp02014MdsOnsoilSwCounter = -1;
     public boolean isIp02014MdsOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014MdsOnsoilSwCounter != sharedCounter;
         localIp02014MdsOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_MDS_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014MdsOnsoilSw
	 */
   protected void serializeIp02014MdsOnsoilSw(char[] ip02014MdsOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014MdsOnsoilSw,0,getStringValue(),beginIp02014MdsOnsoilSw,IP_02014_MDS_ONSOIL_SW_LEN);
       localIp02014MdsOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014MdsOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014MdsOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014MdsOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014MdsOnsoilSw,beginIp02014MdsOnsoilSw + IP_02014_MDS_ONSOIL_SW_LEN));
   	}
     int localIp02014StndInOnsoilSwCounter = -1;
     public boolean isIp02014StndInOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014StndInOnsoilSwCounter != sharedCounter;
         localIp02014StndInOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_STND_IN_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014StndInOnsoilSw
	 */
   protected void serializeIp02014StndInOnsoilSw(char[] ip02014StndInOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014StndInOnsoilSw,0,getStringValue(),beginIp02014StndInOnsoilSw,IP_02014_STND_IN_ONSOIL_SW_LEN);
       localIp02014StndInOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014StndInOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014StndInOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014StndInOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014StndInOnsoilSw,beginIp02014StndInOnsoilSw + IP_02014_STND_IN_ONSOIL_SW_LEN));
   	}
     int localIp02014AuthOnsoilSwCounter = -1;
     public boolean isIp02014AuthOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014AuthOnsoilSwCounter != sharedCounter;
         localIp02014AuthOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_AUTH_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014AuthOnsoilSw
	 */
   protected void serializeIp02014AuthOnsoilSw(char[] ip02014AuthOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014AuthOnsoilSw,0,getStringValue(),beginIp02014AuthOnsoilSw,IP_02014_AUTH_ONSOIL_SW_LEN);
       localIp02014AuthOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014AuthOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014AuthOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014AuthOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014AuthOnsoilSw,beginIp02014AuthOnsoilSw + IP_02014_AUTH_ONSOIL_SW_LEN));
   	}
     int localIp02014PushOnsoilSwCounter = -1;
     public boolean isIp02014PushOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014PushOnsoilSwCounter != sharedCounter;
         localIp02014PushOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_PUSH_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014PushOnsoilSw
	 */
   protected void serializeIp02014PushOnsoilSw(char[] ip02014PushOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014PushOnsoilSw,0,getStringValue(),beginIp02014PushOnsoilSw,IP_02014_PUSH_ONSOIL_SW_LEN);
       localIp02014PushOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014PushOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014PushOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014PushOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014PushOnsoilSw,beginIp02014PushOnsoilSw + IP_02014_PUSH_ONSOIL_SW_LEN));
   	}
     int localIp02014IncontrolOnsoilSwCounter = -1;
     public boolean isIp02014IncontrolOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014IncontrolOnsoilSwCounter != sharedCounter;
         localIp02014IncontrolOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_INCONTROL_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014IncontrolOnsoilSw
	 */
   protected void serializeIp02014IncontrolOnsoilSw(char[] ip02014IncontrolOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014IncontrolOnsoilSw,0,getStringValue(),beginIp02014IncontrolOnsoilSw,IP_02014_INCONTROL_ONSOIL_SW_LEN);
       localIp02014IncontrolOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014IncontrolOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014IncontrolOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014IncontrolOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014IncontrolOnsoilSw,beginIp02014IncontrolOnsoilSw + IP_02014_INCONTROL_ONSOIL_SW_LEN));
   	}
     int localIp02014EsrvcOnsoilSwCounter = -1;
     public boolean isIp02014EsrvcOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014EsrvcOnsoilSwCounter != sharedCounter;
         localIp02014EsrvcOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_ESRVC_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014EsrvcOnsoilSw
	 */
   protected void serializeIp02014EsrvcOnsoilSw(char[] ip02014EsrvcOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014EsrvcOnsoilSw,0,getStringValue(),beginIp02014EsrvcOnsoilSw,IP_02014_ESRVC_ONSOIL_SW_LEN);
       localIp02014EsrvcOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014EsrvcOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014EsrvcOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014EsrvcOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014EsrvcOnsoilSw,beginIp02014EsrvcOnsoilSw + IP_02014_ESRVC_ONSOIL_SW_LEN));
   	}
     int localIp02014GftOnsoilSwCounter = -1;
     public boolean isIp02014GftOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014GftOnsoilSwCounter != sharedCounter;
         localIp02014GftOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_GFT_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014GftOnsoilSw
	 */
   protected void serializeIp02014GftOnsoilSw(char[] ip02014GftOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014GftOnsoilSw,0,getStringValue(),beginIp02014GftOnsoilSw,IP_02014_GFT_ONSOIL_SW_LEN);
       localIp02014GftOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014GftOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014GftOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014GftOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014GftOnsoilSw,beginIp02014GftOnsoilSw + IP_02014_GFT_ONSOIL_SW_LEN));
   	}
     int localIp02014BnknetOnsoilSwCounter = -1;
     public boolean isIp02014BnknetOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014BnknetOnsoilSwCounter != sharedCounter;
         localIp02014BnknetOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_BNKNET_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014BnknetOnsoilSw
	 */
   protected void serializeIp02014BnknetOnsoilSw(char[] ip02014BnknetOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014BnknetOnsoilSw,0,getStringValue(),beginIp02014BnknetOnsoilSw,IP_02014_BNKNET_ONSOIL_SW_LEN);
       localIp02014BnknetOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014BnknetOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014BnknetOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014BnknetOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014BnknetOnsoilSw,beginIp02014BnknetOnsoilSw + IP_02014_BNKNET_ONSOIL_SW_LEN));
   	}
     int localIp02014MdesOnsoilSwCounter = -1;
     public boolean isIp02014MdesOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014MdesOnsoilSwCounter != sharedCounter;
         localIp02014MdesOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_MDES_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014MdesOnsoilSw
	 */
   protected void serializeIp02014MdesOnsoilSw(char[] ip02014MdesOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014MdesOnsoilSw,0,getStringValue(),beginIp02014MdesOnsoilSw,IP_02014_MDES_ONSOIL_SW_LEN);
       localIp02014MdesOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014MdesOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014MdesOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014MdesOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014MdesOnsoilSw,beginIp02014MdesOnsoilSw + IP_02014_MDES_ONSOIL_SW_LEN));
   	}
     int localIp02014ZappOnsoilSwCounter = -1;
     public boolean isIp02014ZappOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014ZappOnsoilSwCounter != sharedCounter;
         localIp02014ZappOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_ZAPP_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014ZappOnsoilSw
	 */
   protected void serializeIp02014ZappOnsoilSw(char[] ip02014ZappOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014ZappOnsoilSw,0,getStringValue(),beginIp02014ZappOnsoilSw,IP_02014_ZAPP_ONSOIL_SW_LEN);
       localIp02014ZappOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014ZappOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014ZappOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014ZappOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014ZappOnsoilSw,beginIp02014ZappOnsoilSw + IP_02014_ZAPP_ONSOIL_SW_LEN));
   	}
     int localIp02014CemOnsoilSwCounter = -1;
     public boolean isIp02014CemOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014CemOnsoilSwCounter != sharedCounter;
         localIp02014CemOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_CEM_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014CemOnsoilSw
	 */
   protected void serializeIp02014CemOnsoilSw(char[] ip02014CemOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014CemOnsoilSw,0,getStringValue(),beginIp02014CemOnsoilSw,IP_02014_CEM_ONSOIL_SW_LEN);
       localIp02014CemOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014CemOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014CemOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014CemOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014CemOnsoilSw,beginIp02014CemOnsoilSw + IP_02014_CEM_ONSOIL_SW_LEN));
   	}
     int localIp02014RptHdrNameCounter = -1;
     public boolean isIp02014RptHdrNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014RptHdrNameCounter != sharedCounter;
         localIp02014RptHdrNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_RPT_HDR_NAME_LEN = 80;
	/**
	 * 	serialize this Ip02014RptHdrName
	 */
   protected void serializeIp02014RptHdrName(char[] ip02014RptHdrName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014RptHdrName,0,getStringValue(),beginIp02014RptHdrName,IP_02014_RPT_HDR_NAME_LEN);
       localIp02014RptHdrNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014RptHdrNameConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshIp02014RptHdrName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014RptHdrName() {	 
   		return (substring(getStringValue(),beginIp02014RptHdrName,beginIp02014RptHdrName + IP_02014_RPT_HDR_NAME_LEN));
   	}
     int localIp02014ClrPrcssCdCounter = -1;
     public boolean isIp02014ClrPrcssCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014ClrPrcssCdCounter != sharedCounter;
         localIp02014ClrPrcssCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_CLR_PRCSS_CD_LEN = 4;
	/**
	 * 	serialize this Ip02014ClrPrcssCd
	 */
   protected void serializeIp02014ClrPrcssCd(char[] ip02014ClrPrcssCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014ClrPrcssCd,0,getStringValue(),beginIp02014ClrPrcssCd,IP_02014_CLR_PRCSS_CD_LEN);
       localIp02014ClrPrcssCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014ClrPrcssCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp02014ClrPrcssCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014ClrPrcssCd() {	 
   		return (substring(getStringValue(),beginIp02014ClrPrcssCd,beginIp02014ClrPrcssCd + IP_02014_CLR_PRCSS_CD_LEN));
   	}
     int localIp02014OnUsPrcssAgrmtIdCounter = -1;
     public boolean isIp02014OnUsPrcssAgrmtIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014OnUsPrcssAgrmtIdCounter != sharedCounter;
         localIp02014OnUsPrcssAgrmtIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_ON_US_PRCSS_AGRMT_ID_LEN = 11;
	/**
	 * 	serialize this Ip02014OnUsPrcssAgrmtId
	 */
   protected void serializeIp02014OnUsPrcssAgrmtId(char[] ip02014OnUsPrcssAgrmtId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014OnUsPrcssAgrmtId,0,getStringValue(),beginIp02014OnUsPrcssAgrmtId,IP_02014_ON_US_PRCSS_AGRMT_ID_LEN);
       localIp02014OnUsPrcssAgrmtIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014OnUsPrcssAgrmtIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshIp02014OnUsPrcssAgrmtId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014OnUsPrcssAgrmtId() {	 
   		return (substring(getStringValue(),beginIp02014OnUsPrcssAgrmtId,beginIp02014OnUsPrcssAgrmtId + IP_02014_ON_US_PRCSS_AGRMT_ID_LEN));
   	}
     int localIp02014OperSysIdCounter = -1;
     public boolean isIp02014OperSysIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014OperSysIdCounter != sharedCounter;
         localIp02014OperSysIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_OPER_SYS_ID_LEN = 20;
	/**
	 * 	serialize this Ip02014OperSysId
	 */
   protected void serializeIp02014OperSysId(char[] ip02014OperSysId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014OperSysId,0,getStringValue(),beginIp02014OperSysId,IP_02014_OPER_SYS_ID_LEN);
       localIp02014OperSysIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014OperSysIdConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshIp02014OperSysId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014OperSysId() {	 
   		return (substring(getStringValue(),beginIp02014OperSysId,beginIp02014OperSysId + IP_02014_OPER_SYS_ID_LEN));
   	}
     int localIp02014DbIdCounter = -1;
     public boolean isIp02014DbIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014DbIdCounter != sharedCounter;
         localIp02014DbIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_DB_ID_LEN = 20;
	/**
	 * 	serialize this Ip02014DbId
	 */
   protected void serializeIp02014DbId(char[] ip02014DbId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014DbId,0,getStringValue(),beginIp02014DbId,IP_02014_DB_ID_LEN);
       localIp02014DbIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014DbIdConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshIp02014DbId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014DbId() {	 
   		return (substring(getStringValue(),beginIp02014DbId,beginIp02014DbId + IP_02014_DB_ID_LEN));
   	}
     int localIp02014FillerCounter = -1;
     public boolean isIp02014FillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014FillerCounter != sharedCounter;
         localIp02014FillerCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014_FILLER_LEN = 750;
	/**
	 * 	serialize this Ip02014Filler
	 */
   protected void serializeIp02014Filler(char[] ip02014Filler) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014Filler,0,getStringValue(),beginIp02014Filler,IP_02014_FILLER_LEN);
       localIp02014FillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014FillerConstraints(char[] value) {
   			return super.checkConstraints(value , 750 ,false, false);
   }
    /**
	 *	refreshIp02014Filler is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014Filler() {	 
   		return (substring(getStringValue(),beginIp02014Filler,beginIp02014Filler + IP_02014_FILLER_LEN));
   	}

		public int ip02014Db2TableSize() {
			return IP_02014_DB_2_TABLE_SIZE;
		}



}
  

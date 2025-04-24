package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip02014TableDataFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip02014TableDataFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip02014TableDataFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_02014_TABLE_DATA_FIELDS_LENGTH = 918;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp02014GeoScopeCode;
            protected  int beginIp02014HostInd;
            protected  int beginIp02014NumCurrCd;
            protected  int beginIp02014OfsoilDataTypCd;
            protected  int beginIp02014MrchntSplitSw;
            protected  int beginIp02014CurrSplitSw;
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
  
             beginIp02014MrchntSplitSw = getStartOffset() + 12;	// set offset for serialization
  
             beginIp02014CurrSplitSw = getStartOffset() + 13;	// set offset for serialization
  
             beginIp02014ClrCycleNum = getStartOffset() + 14;	// set offset for serialization
  
             beginIp02014DtaWrhsOnsoilSw = getStartOffset() + 16;	// set offset for serialization
  
             beginIp02014BllngOnsoilSw = getStartOffset() + 17;	// set offset for serialization
  
             beginIp02014SetlOnsoilSw = getStartOffset() + 18;	// set offset for serialization
  
             beginIp02014ClrOnsoilSw = getStartOffset() + 19;	// set offset for serialization
  
             beginIp02014AmsOnsoilSw = getStartOffset() + 20;	// set offset for serialization
  
             beginIp02014McomOnsoilSw = getStartOffset() + 21;	// set offset for serialization
  
             beginIp02014MdsOnsoilSw = getStartOffset() + 22;	// set offset for serialization
  
             beginIp02014StndInOnsoilSw = getStartOffset() + 23;	// set offset for serialization
  
             beginIp02014AuthOnsoilSw = getStartOffset() + 24;	// set offset for serialization
  
             beginIp02014RptHdrName = getStartOffset() + 25;	// set offset for serialization
  
             beginIp02014ClrPrcssCd = getStartOffset() + 105;	// set offset for serialization
  
             beginIp02014OnUsPrcssAgrmtId = getStartOffset() + 109;	// set offset for serialization
  
             beginIp02014OperSysId = getStartOffset() + 120;	// set offset for serialization
  
             beginIp02014DbId = getStartOffset() + 140;	// set offset for serialization
  
	        beginIp02014Db2Table = getStartOffset() + 160; // set offset for serialization
  
             beginIp02014Filler = getStartOffset() + 910;	// set offset for serialization
  
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
	protected static final int IP_02014_FILLER_LEN = 8;
	/**
	 * 	serialize this Ip02014Filler
	 */
   protected void serializeIp02014Filler(char[] ip02014Filler) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014Filler,0,getStringValue(),beginIp02014Filler,IP_02014_FILLER_LEN);
       localIp02014FillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014FillerConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
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
  

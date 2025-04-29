package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip02014lTableDataFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip02014lTableDataFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip02014lTableDataFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_02014L_TABLE_DATA_FIELDS_LENGTH = 921;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp02014lGeoScopeCode;
            protected  int beginIp02014lHostInd;
            protected  int beginIp02014lNumCurrCd;
            protected  int beginIp02014lOfsoilDataTypCd;
            protected  int beginIp02014lMrchntSplitCd;
            protected  int beginIp02014lCurrSplitCd;
            protected  int beginIp02014lAcquirerSplitCd;
            protected  int beginIp02014lDomCollOnlyCd;
            protected  int beginIp02014lOnsoilDataShrSw;
            protected  int beginIp02014lClrCycleNum;
            protected  int beginIp02014lDtaWrhsOnsoilSw;
            protected  int beginIp02014lBllngOnsoilSw;
            protected  int beginIp02014lSetlOnsoilSw;
            protected  int beginIp02014lClrOnsoilSw;
            protected  int beginIp02014lAmsOnsoilSw;
            protected  int beginIp02014lMcomOnsoilSw;
            protected  int beginIp02014lMdsOnsoilSw;
            protected  int beginIp02014lStndInOnsoilSw;
            protected  int beginIp02014lAuthOnsoilSw;
            protected  int beginIp02014lPushOnsoilSw;
            protected  int beginIp02014lIncontrolOnsoilSw;
            protected  int beginIp02014lEsrvcOnsoilSw;
            protected  int beginIp02014lGftOnsoilSw;
            protected  int beginIp02014lBnknetOnsoilSw;
            protected  int beginIp02014lMdesOnsoilSw;
            protected  int beginIp02014lZappOnsoilSw;
            protected  int beginIp02014lCemOnsoilSw;
            protected  int beginIp02014lRptHdrName;
            protected  int beginIp02014lClrPrcssCd;
            protected  int beginIp02014lOnUsPrcssAgrmtId;
            protected  int beginIp02014lOperSysId;
            protected  int beginIp02014lDbId;
            protected  int beginIp02014lFiller;
	
	/**
	* Constructor for Ip02014lTableDataFieldsSerialized
	**/
    public Ip02014lTableDataFieldsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip02014lTableDataFieldsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014lTableDataFieldsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip02014lTableDataFieldsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,11); // serialize this field at offset 11 by default 
    }
    
	/**
	* sets parent for this Ip02014lTableDataFieldsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 11 by default
    }    
	/**
	* initializes the field in Ip02014lTableDataFieldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_02014L_TABLE_DATA_FIELDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp02014lGeoScopeCode = getStartOffset() + 0;	// set offset for serialization
  
             beginIp02014lHostInd = getStartOffset() + 1;	// set offset for serialization
  
  
             beginIp02014lNumCurrCd = getStartOffset() + 6;	// set offset for serialization
  
             beginIp02014lOfsoilDataTypCd = getStartOffset() + 9;	// set offset for serialization
  
             beginIp02014lMrchntSplitCd = getStartOffset() + 12;	// set offset for serialization
  
             beginIp02014lCurrSplitCd = getStartOffset() + 13;	// set offset for serialization
  
             beginIp02014lAcquirerSplitCd = getStartOffset() + 14;	// set offset for serialization
  
             beginIp02014lDomCollOnlyCd = getStartOffset() + 15;	// set offset for serialization
  
             beginIp02014lOnsoilDataShrSw = getStartOffset() + 16;	// set offset for serialization
  
             beginIp02014lClrCycleNum = getStartOffset() + 17;	// set offset for serialization
  
             beginIp02014lDtaWrhsOnsoilSw = getStartOffset() + 19;	// set offset for serialization
  
             beginIp02014lBllngOnsoilSw = getStartOffset() + 20;	// set offset for serialization
  
             beginIp02014lSetlOnsoilSw = getStartOffset() + 21;	// set offset for serialization
  
             beginIp02014lClrOnsoilSw = getStartOffset() + 22;	// set offset for serialization
  
             beginIp02014lAmsOnsoilSw = getStartOffset() + 23;	// set offset for serialization
  
             beginIp02014lMcomOnsoilSw = getStartOffset() + 24;	// set offset for serialization
  
             beginIp02014lMdsOnsoilSw = getStartOffset() + 25;	// set offset for serialization
  
             beginIp02014lStndInOnsoilSw = getStartOffset() + 26;	// set offset for serialization
  
             beginIp02014lAuthOnsoilSw = getStartOffset() + 27;	// set offset for serialization
  
             beginIp02014lPushOnsoilSw = getStartOffset() + 28;	// set offset for serialization
  
             beginIp02014lIncontrolOnsoilSw = getStartOffset() + 29;	// set offset for serialization
  
             beginIp02014lEsrvcOnsoilSw = getStartOffset() + 30;	// set offset for serialization
  
             beginIp02014lGftOnsoilSw = getStartOffset() + 31;	// set offset for serialization
  
             beginIp02014lBnknetOnsoilSw = getStartOffset() + 32;	// set offset for serialization
  
             beginIp02014lMdesOnsoilSw = getStartOffset() + 33;	// set offset for serialization
  
             beginIp02014lZappOnsoilSw = getStartOffset() + 34;	// set offset for serialization
  
             beginIp02014lCemOnsoilSw = getStartOffset() + 35;	// set offset for serialization
  
             beginIp02014lRptHdrName = getStartOffset() + 36;	// set offset for serialization
  
             beginIp02014lClrPrcssCd = getStartOffset() + 116;	// set offset for serialization
  
             beginIp02014lOnUsPrcssAgrmtId = getStartOffset() + 120;	// set offset for serialization
  
             beginIp02014lOperSysId = getStartOffset() + 131;	// set offset for serialization
  
             beginIp02014lDbId = getStartOffset() + 151;	// set offset for serialization
  
             beginIp02014lFiller = getStartOffset() + 171;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp02014lGeoScopeCodeCounter = -1;
     public boolean isIp02014lGeoScopeCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lGeoScopeCodeCounter != sharedCounter;
         localIp02014lGeoScopeCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_GEO_SCOPE_CODE_LEN = 1;
	/**
	 * 	serialize this Ip02014lGeoScopeCode
	 */
   protected void serializeIp02014lGeoScopeCode(char[] ip02014lGeoScopeCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lGeoScopeCode,0,getStringValue(),beginIp02014lGeoScopeCode,IP_02014L_GEO_SCOPE_CODE_LEN);
       localIp02014lGeoScopeCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lGeoScopeCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014lGeoScopeCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lGeoScopeCode() {	 
   		return (substring(getStringValue(),beginIp02014lGeoScopeCode,beginIp02014lGeoScopeCode + IP_02014L_GEO_SCOPE_CODE_LEN));
   	}
     int localIp02014lHostIndCounter = -1;
     public boolean isIp02014lHostIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lHostIndCounter != sharedCounter;
         localIp02014lHostIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_HOST_IND_LEN = 1;
	/**
	 * 	serialize this Ip02014lHostInd
	 */
   protected void serializeIp02014lHostInd(char[] ip02014lHostInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lHostInd,0,getStringValue(),beginIp02014lHostInd,IP_02014L_HOST_IND_LEN);
       localIp02014lHostIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lHostIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014lHostInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lHostInd() {	 
   		return (substring(getStringValue(),beginIp02014lHostInd,beginIp02014lHostInd + IP_02014L_HOST_IND_LEN));
   	}
     int localIp02014lNumCurrCdCounter = -1;
     public boolean isIp02014lNumCurrCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lNumCurrCdCounter != sharedCounter;
         localIp02014lNumCurrCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip02014lNumCurrCd
	 *	@return ip02014lNumCurrCd
	 */
	public char[]  getIp02014lNumCurrCdString() {
	     return getCharArray(beginIp02014lNumCurrCd,IP_02014L_NUM_CURR_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip02014lNumCurrCdIsNumeric() {
	    return isNumeric(beginIp02014lNumCurrCd
	                    ,beginIp02014lNumCurrCd + IP_02014L_NUM_CURR_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_02014L_NUM_CURR_CD_LEN = 3;
  	/**
	 * serializeIp02014lNumCurrCd
	 */
	protected void serializeIp02014lNumCurrCd(int ip02014lNumCurrCd) {
		 putNumber(beginIp02014lNumCurrCd,ip02014lNumCurrCd,IP_02014L_NUM_CURR_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp02014lNumCurrCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp02014lNumCurrCd
	 */
   	protected  int serializeIp02014lNumCurrCd(char[] value) {
	    int  ip02014lNumCurrCd;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip02014lNumCurrCd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp02014lNumCurrCd
		       ,3
		      );
		 localIp02014lNumCurrCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip02014lNumCurrCd;
    }

   protected int checkIp02014lNumCurrCdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp02014lNumCurrCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp02014lNumCurrCd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp02014lNumCurrCd
			                 ,IP_02014L_NUM_CURR_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip02014lNumCurrCd", beginIp02014lNumCurrCd,IP_02014L_NUM_CURR_CD_LEN);
    }
   	}
     int localIp02014lOfsoilDataTypCdCounter = -1;
     public boolean isIp02014lOfsoilDataTypCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lOfsoilDataTypCdCounter != sharedCounter;
         localIp02014lOfsoilDataTypCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_OFSOIL_DATA_TYP_CD_LEN = 3;
	/**
	 * 	serialize this Ip02014lOfsoilDataTypCd
	 */
   protected void serializeIp02014lOfsoilDataTypCd(char[] ip02014lOfsoilDataTypCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lOfsoilDataTypCd,0,getStringValue(),beginIp02014lOfsoilDataTypCd,IP_02014L_OFSOIL_DATA_TYP_CD_LEN);
       localIp02014lOfsoilDataTypCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lOfsoilDataTypCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp02014lOfsoilDataTypCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lOfsoilDataTypCd() {	 
   		return (substring(getStringValue(),beginIp02014lOfsoilDataTypCd,beginIp02014lOfsoilDataTypCd + IP_02014L_OFSOIL_DATA_TYP_CD_LEN));
   	}
     int localIp02014lMrchntSplitCdCounter = -1;
     public boolean isIp02014lMrchntSplitCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lMrchntSplitCdCounter != sharedCounter;
         localIp02014lMrchntSplitCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_MRCHNT_SPLIT_CD_LEN = 1;
	/**
	 * 	serialize this Ip02014lMrchntSplitCd
	 */
   protected void serializeIp02014lMrchntSplitCd(char[] ip02014lMrchntSplitCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lMrchntSplitCd,0,getStringValue(),beginIp02014lMrchntSplitCd,IP_02014L_MRCHNT_SPLIT_CD_LEN);
       localIp02014lMrchntSplitCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lMrchntSplitCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014lMrchntSplitCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lMrchntSplitCd() {	 
   		return (substring(getStringValue(),beginIp02014lMrchntSplitCd,beginIp02014lMrchntSplitCd + IP_02014L_MRCHNT_SPLIT_CD_LEN));
   	}
     int localIp02014lCurrSplitCdCounter = -1;
     public boolean isIp02014lCurrSplitCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lCurrSplitCdCounter != sharedCounter;
         localIp02014lCurrSplitCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_CURR_SPLIT_CD_LEN = 1;
	/**
	 * 	serialize this Ip02014lCurrSplitCd
	 */
   protected void serializeIp02014lCurrSplitCd(char[] ip02014lCurrSplitCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lCurrSplitCd,0,getStringValue(),beginIp02014lCurrSplitCd,IP_02014L_CURR_SPLIT_CD_LEN);
       localIp02014lCurrSplitCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lCurrSplitCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014lCurrSplitCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lCurrSplitCd() {	 
   		return (substring(getStringValue(),beginIp02014lCurrSplitCd,beginIp02014lCurrSplitCd + IP_02014L_CURR_SPLIT_CD_LEN));
   	}
     int localIp02014lAcquirerSplitCdCounter = -1;
     public boolean isIp02014lAcquirerSplitCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lAcquirerSplitCdCounter != sharedCounter;
         localIp02014lAcquirerSplitCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_ACQUIRER_SPLIT_CD_LEN = 1;
	/**
	 * 	serialize this Ip02014lAcquirerSplitCd
	 */
   protected void serializeIp02014lAcquirerSplitCd(char[] ip02014lAcquirerSplitCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lAcquirerSplitCd,0,getStringValue(),beginIp02014lAcquirerSplitCd,IP_02014L_ACQUIRER_SPLIT_CD_LEN);
       localIp02014lAcquirerSplitCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lAcquirerSplitCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014lAcquirerSplitCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lAcquirerSplitCd() {	 
   		return (substring(getStringValue(),beginIp02014lAcquirerSplitCd,beginIp02014lAcquirerSplitCd + IP_02014L_ACQUIRER_SPLIT_CD_LEN));
   	}
     int localIp02014lDomCollOnlyCdCounter = -1;
     public boolean isIp02014lDomCollOnlyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lDomCollOnlyCdCounter != sharedCounter;
         localIp02014lDomCollOnlyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_DOM_COLL_ONLY_CD_LEN = 1;
	/**
	 * 	serialize this Ip02014lDomCollOnlyCd
	 */
   protected void serializeIp02014lDomCollOnlyCd(char[] ip02014lDomCollOnlyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lDomCollOnlyCd,0,getStringValue(),beginIp02014lDomCollOnlyCd,IP_02014L_DOM_COLL_ONLY_CD_LEN);
       localIp02014lDomCollOnlyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lDomCollOnlyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014lDomCollOnlyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lDomCollOnlyCd() {	 
   		return (substring(getStringValue(),beginIp02014lDomCollOnlyCd,beginIp02014lDomCollOnlyCd + IP_02014L_DOM_COLL_ONLY_CD_LEN));
   	}
     int localIp02014lOnsoilDataShrSwCounter = -1;
     public boolean isIp02014lOnsoilDataShrSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lOnsoilDataShrSwCounter != sharedCounter;
         localIp02014lOnsoilDataShrSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_ONSOIL_DATA_SHR_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014lOnsoilDataShrSw
	 */
   protected void serializeIp02014lOnsoilDataShrSw(char[] ip02014lOnsoilDataShrSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lOnsoilDataShrSw,0,getStringValue(),beginIp02014lOnsoilDataShrSw,IP_02014L_ONSOIL_DATA_SHR_SW_LEN);
       localIp02014lOnsoilDataShrSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lOnsoilDataShrSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014lOnsoilDataShrSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lOnsoilDataShrSw() {	 
   		return (substring(getStringValue(),beginIp02014lOnsoilDataShrSw,beginIp02014lOnsoilDataShrSw + IP_02014L_ONSOIL_DATA_SHR_SW_LEN));
   	}
     int localIp02014lClrCycleNumCounter = -1;
     public boolean isIp02014lClrCycleNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lClrCycleNumCounter != sharedCounter;
         localIp02014lClrCycleNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip02014lClrCycleNum
	 *	@return ip02014lClrCycleNum
	 */
	public char[]  getIp02014lClrCycleNumString() {
	     return getCharArray(beginIp02014lClrCycleNum,IP_02014L_CLR_CYCLE_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip02014lClrCycleNumIsNumeric() {
	    return isNumeric(beginIp02014lClrCycleNum
	                    ,beginIp02014lClrCycleNum + IP_02014L_CLR_CYCLE_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_02014L_CLR_CYCLE_NUM_LEN = 2;
  	/**
	 * serializeIp02014lClrCycleNum
	 */
	protected void serializeIp02014lClrCycleNum(int ip02014lClrCycleNum) {
		 putNumber(beginIp02014lClrCycleNum,ip02014lClrCycleNum,IP_02014L_CLR_CYCLE_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp02014lClrCycleNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp02014lClrCycleNum
	 */
   	protected  int serializeIp02014lClrCycleNum(char[] value) {
	    int  ip02014lClrCycleNum;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip02014lClrCycleNum = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp02014lClrCycleNum
		       ,2
		      );
		 localIp02014lClrCycleNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip02014lClrCycleNum;
    }

   protected int checkIp02014lClrCycleNumMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp02014lClrCycleNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp02014lClrCycleNum() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp02014lClrCycleNum
			                 ,IP_02014L_CLR_CYCLE_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip02014lClrCycleNum", beginIp02014lClrCycleNum,IP_02014L_CLR_CYCLE_NUM_LEN);
    }
   	}
     int localIp02014lDtaWrhsOnsoilSwCounter = -1;
     public boolean isIp02014lDtaWrhsOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lDtaWrhsOnsoilSwCounter != sharedCounter;
         localIp02014lDtaWrhsOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_DTA_WRHS_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014lDtaWrhsOnsoilSw
	 */
   protected void serializeIp02014lDtaWrhsOnsoilSw(char[] ip02014lDtaWrhsOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lDtaWrhsOnsoilSw,0,getStringValue(),beginIp02014lDtaWrhsOnsoilSw,IP_02014L_DTA_WRHS_ONSOIL_SW_LEN);
       localIp02014lDtaWrhsOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lDtaWrhsOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014lDtaWrhsOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lDtaWrhsOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014lDtaWrhsOnsoilSw,beginIp02014lDtaWrhsOnsoilSw + IP_02014L_DTA_WRHS_ONSOIL_SW_LEN));
   	}
     int localIp02014lBllngOnsoilSwCounter = -1;
     public boolean isIp02014lBllngOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lBllngOnsoilSwCounter != sharedCounter;
         localIp02014lBllngOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_BLLNG_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014lBllngOnsoilSw
	 */
   protected void serializeIp02014lBllngOnsoilSw(char[] ip02014lBllngOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lBllngOnsoilSw,0,getStringValue(),beginIp02014lBllngOnsoilSw,IP_02014L_BLLNG_ONSOIL_SW_LEN);
       localIp02014lBllngOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lBllngOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014lBllngOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lBllngOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014lBllngOnsoilSw,beginIp02014lBllngOnsoilSw + IP_02014L_BLLNG_ONSOIL_SW_LEN));
   	}
     int localIp02014lSetlOnsoilSwCounter = -1;
     public boolean isIp02014lSetlOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lSetlOnsoilSwCounter != sharedCounter;
         localIp02014lSetlOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_SETL_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014lSetlOnsoilSw
	 */
   protected void serializeIp02014lSetlOnsoilSw(char[] ip02014lSetlOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lSetlOnsoilSw,0,getStringValue(),beginIp02014lSetlOnsoilSw,IP_02014L_SETL_ONSOIL_SW_LEN);
       localIp02014lSetlOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lSetlOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014lSetlOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lSetlOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014lSetlOnsoilSw,beginIp02014lSetlOnsoilSw + IP_02014L_SETL_ONSOIL_SW_LEN));
   	}
     int localIp02014lClrOnsoilSwCounter = -1;
     public boolean isIp02014lClrOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lClrOnsoilSwCounter != sharedCounter;
         localIp02014lClrOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_CLR_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014lClrOnsoilSw
	 */
   protected void serializeIp02014lClrOnsoilSw(char[] ip02014lClrOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lClrOnsoilSw,0,getStringValue(),beginIp02014lClrOnsoilSw,IP_02014L_CLR_ONSOIL_SW_LEN);
       localIp02014lClrOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lClrOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014lClrOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lClrOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014lClrOnsoilSw,beginIp02014lClrOnsoilSw + IP_02014L_CLR_ONSOIL_SW_LEN));
   	}
     int localIp02014lAmsOnsoilSwCounter = -1;
     public boolean isIp02014lAmsOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lAmsOnsoilSwCounter != sharedCounter;
         localIp02014lAmsOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_AMS_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014lAmsOnsoilSw
	 */
   protected void serializeIp02014lAmsOnsoilSw(char[] ip02014lAmsOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lAmsOnsoilSw,0,getStringValue(),beginIp02014lAmsOnsoilSw,IP_02014L_AMS_ONSOIL_SW_LEN);
       localIp02014lAmsOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lAmsOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014lAmsOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lAmsOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014lAmsOnsoilSw,beginIp02014lAmsOnsoilSw + IP_02014L_AMS_ONSOIL_SW_LEN));
   	}
     int localIp02014lMcomOnsoilSwCounter = -1;
     public boolean isIp02014lMcomOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lMcomOnsoilSwCounter != sharedCounter;
         localIp02014lMcomOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_MCOM_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014lMcomOnsoilSw
	 */
   protected void serializeIp02014lMcomOnsoilSw(char[] ip02014lMcomOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lMcomOnsoilSw,0,getStringValue(),beginIp02014lMcomOnsoilSw,IP_02014L_MCOM_ONSOIL_SW_LEN);
       localIp02014lMcomOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lMcomOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014lMcomOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lMcomOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014lMcomOnsoilSw,beginIp02014lMcomOnsoilSw + IP_02014L_MCOM_ONSOIL_SW_LEN));
   	}
     int localIp02014lMdsOnsoilSwCounter = -1;
     public boolean isIp02014lMdsOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lMdsOnsoilSwCounter != sharedCounter;
         localIp02014lMdsOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_MDS_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014lMdsOnsoilSw
	 */
   protected void serializeIp02014lMdsOnsoilSw(char[] ip02014lMdsOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lMdsOnsoilSw,0,getStringValue(),beginIp02014lMdsOnsoilSw,IP_02014L_MDS_ONSOIL_SW_LEN);
       localIp02014lMdsOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lMdsOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014lMdsOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lMdsOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014lMdsOnsoilSw,beginIp02014lMdsOnsoilSw + IP_02014L_MDS_ONSOIL_SW_LEN));
   	}
     int localIp02014lStndInOnsoilSwCounter = -1;
     public boolean isIp02014lStndInOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lStndInOnsoilSwCounter != sharedCounter;
         localIp02014lStndInOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_STND_IN_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014lStndInOnsoilSw
	 */
   protected void serializeIp02014lStndInOnsoilSw(char[] ip02014lStndInOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lStndInOnsoilSw,0,getStringValue(),beginIp02014lStndInOnsoilSw,IP_02014L_STND_IN_ONSOIL_SW_LEN);
       localIp02014lStndInOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lStndInOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014lStndInOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lStndInOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014lStndInOnsoilSw,beginIp02014lStndInOnsoilSw + IP_02014L_STND_IN_ONSOIL_SW_LEN));
   	}
     int localIp02014lAuthOnsoilSwCounter = -1;
     public boolean isIp02014lAuthOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lAuthOnsoilSwCounter != sharedCounter;
         localIp02014lAuthOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_AUTH_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014lAuthOnsoilSw
	 */
   protected void serializeIp02014lAuthOnsoilSw(char[] ip02014lAuthOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lAuthOnsoilSw,0,getStringValue(),beginIp02014lAuthOnsoilSw,IP_02014L_AUTH_ONSOIL_SW_LEN);
       localIp02014lAuthOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lAuthOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014lAuthOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lAuthOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014lAuthOnsoilSw,beginIp02014lAuthOnsoilSw + IP_02014L_AUTH_ONSOIL_SW_LEN));
   	}
     int localIp02014lPushOnsoilSwCounter = -1;
     public boolean isIp02014lPushOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lPushOnsoilSwCounter != sharedCounter;
         localIp02014lPushOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_PUSH_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014lPushOnsoilSw
	 */
   protected void serializeIp02014lPushOnsoilSw(char[] ip02014lPushOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lPushOnsoilSw,0,getStringValue(),beginIp02014lPushOnsoilSw,IP_02014L_PUSH_ONSOIL_SW_LEN);
       localIp02014lPushOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lPushOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014lPushOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lPushOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014lPushOnsoilSw,beginIp02014lPushOnsoilSw + IP_02014L_PUSH_ONSOIL_SW_LEN));
   	}
     int localIp02014lIncontrolOnsoilSwCounter = -1;
     public boolean isIp02014lIncontrolOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lIncontrolOnsoilSwCounter != sharedCounter;
         localIp02014lIncontrolOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_INCONTROL_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014lIncontrolOnsoilSw
	 */
   protected void serializeIp02014lIncontrolOnsoilSw(char[] ip02014lIncontrolOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lIncontrolOnsoilSw,0,getStringValue(),beginIp02014lIncontrolOnsoilSw,IP_02014L_INCONTROL_ONSOIL_SW_LEN);
       localIp02014lIncontrolOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lIncontrolOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014lIncontrolOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lIncontrolOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014lIncontrolOnsoilSw,beginIp02014lIncontrolOnsoilSw + IP_02014L_INCONTROL_ONSOIL_SW_LEN));
   	}
     int localIp02014lEsrvcOnsoilSwCounter = -1;
     public boolean isIp02014lEsrvcOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lEsrvcOnsoilSwCounter != sharedCounter;
         localIp02014lEsrvcOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_ESRVC_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014lEsrvcOnsoilSw
	 */
   protected void serializeIp02014lEsrvcOnsoilSw(char[] ip02014lEsrvcOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lEsrvcOnsoilSw,0,getStringValue(),beginIp02014lEsrvcOnsoilSw,IP_02014L_ESRVC_ONSOIL_SW_LEN);
       localIp02014lEsrvcOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lEsrvcOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014lEsrvcOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lEsrvcOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014lEsrvcOnsoilSw,beginIp02014lEsrvcOnsoilSw + IP_02014L_ESRVC_ONSOIL_SW_LEN));
   	}
     int localIp02014lGftOnsoilSwCounter = -1;
     public boolean isIp02014lGftOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lGftOnsoilSwCounter != sharedCounter;
         localIp02014lGftOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_GFT_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014lGftOnsoilSw
	 */
   protected void serializeIp02014lGftOnsoilSw(char[] ip02014lGftOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lGftOnsoilSw,0,getStringValue(),beginIp02014lGftOnsoilSw,IP_02014L_GFT_ONSOIL_SW_LEN);
       localIp02014lGftOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lGftOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014lGftOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lGftOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014lGftOnsoilSw,beginIp02014lGftOnsoilSw + IP_02014L_GFT_ONSOIL_SW_LEN));
   	}
     int localIp02014lBnknetOnsoilSwCounter = -1;
     public boolean isIp02014lBnknetOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lBnknetOnsoilSwCounter != sharedCounter;
         localIp02014lBnknetOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_BNKNET_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014lBnknetOnsoilSw
	 */
   protected void serializeIp02014lBnknetOnsoilSw(char[] ip02014lBnknetOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lBnknetOnsoilSw,0,getStringValue(),beginIp02014lBnknetOnsoilSw,IP_02014L_BNKNET_ONSOIL_SW_LEN);
       localIp02014lBnknetOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lBnknetOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014lBnknetOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lBnknetOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014lBnknetOnsoilSw,beginIp02014lBnknetOnsoilSw + IP_02014L_BNKNET_ONSOIL_SW_LEN));
   	}
     int localIp02014lMdesOnsoilSwCounter = -1;
     public boolean isIp02014lMdesOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lMdesOnsoilSwCounter != sharedCounter;
         localIp02014lMdesOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_MDES_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014lMdesOnsoilSw
	 */
   protected void serializeIp02014lMdesOnsoilSw(char[] ip02014lMdesOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lMdesOnsoilSw,0,getStringValue(),beginIp02014lMdesOnsoilSw,IP_02014L_MDES_ONSOIL_SW_LEN);
       localIp02014lMdesOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lMdesOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014lMdesOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lMdesOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014lMdesOnsoilSw,beginIp02014lMdesOnsoilSw + IP_02014L_MDES_ONSOIL_SW_LEN));
   	}
     int localIp02014lZappOnsoilSwCounter = -1;
     public boolean isIp02014lZappOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lZappOnsoilSwCounter != sharedCounter;
         localIp02014lZappOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_ZAPP_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014lZappOnsoilSw
	 */
   protected void serializeIp02014lZappOnsoilSw(char[] ip02014lZappOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lZappOnsoilSw,0,getStringValue(),beginIp02014lZappOnsoilSw,IP_02014L_ZAPP_ONSOIL_SW_LEN);
       localIp02014lZappOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lZappOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014lZappOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lZappOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014lZappOnsoilSw,beginIp02014lZappOnsoilSw + IP_02014L_ZAPP_ONSOIL_SW_LEN));
   	}
     int localIp02014lCemOnsoilSwCounter = -1;
     public boolean isIp02014lCemOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lCemOnsoilSwCounter != sharedCounter;
         localIp02014lCemOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_CEM_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014lCemOnsoilSw
	 */
   protected void serializeIp02014lCemOnsoilSw(char[] ip02014lCemOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lCemOnsoilSw,0,getStringValue(),beginIp02014lCemOnsoilSw,IP_02014L_CEM_ONSOIL_SW_LEN);
       localIp02014lCemOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lCemOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014lCemOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lCemOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014lCemOnsoilSw,beginIp02014lCemOnsoilSw + IP_02014L_CEM_ONSOIL_SW_LEN));
   	}
     int localIp02014lRptHdrNameCounter = -1;
     public boolean isIp02014lRptHdrNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lRptHdrNameCounter != sharedCounter;
         localIp02014lRptHdrNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_RPT_HDR_NAME_LEN = 80;
	/**
	 * 	serialize this Ip02014lRptHdrName
	 */
   protected void serializeIp02014lRptHdrName(char[] ip02014lRptHdrName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lRptHdrName,0,getStringValue(),beginIp02014lRptHdrName,IP_02014L_RPT_HDR_NAME_LEN);
       localIp02014lRptHdrNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lRptHdrNameConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshIp02014lRptHdrName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lRptHdrName() {	 
   		return (substring(getStringValue(),beginIp02014lRptHdrName,beginIp02014lRptHdrName + IP_02014L_RPT_HDR_NAME_LEN));
   	}
     int localIp02014lClrPrcssCdCounter = -1;
     public boolean isIp02014lClrPrcssCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lClrPrcssCdCounter != sharedCounter;
         localIp02014lClrPrcssCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_CLR_PRCSS_CD_LEN = 4;
	/**
	 * 	serialize this Ip02014lClrPrcssCd
	 */
   protected void serializeIp02014lClrPrcssCd(char[] ip02014lClrPrcssCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lClrPrcssCd,0,getStringValue(),beginIp02014lClrPrcssCd,IP_02014L_CLR_PRCSS_CD_LEN);
       localIp02014lClrPrcssCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lClrPrcssCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp02014lClrPrcssCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lClrPrcssCd() {	 
   		return (substring(getStringValue(),beginIp02014lClrPrcssCd,beginIp02014lClrPrcssCd + IP_02014L_CLR_PRCSS_CD_LEN));
   	}
     int localIp02014lOnUsPrcssAgrmtIdCounter = -1;
     public boolean isIp02014lOnUsPrcssAgrmtIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lOnUsPrcssAgrmtIdCounter != sharedCounter;
         localIp02014lOnUsPrcssAgrmtIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_ON_US_PRCSS_AGRMT_ID_LEN = 11;
	/**
	 * 	serialize this Ip02014lOnUsPrcssAgrmtId
	 */
   protected void serializeIp02014lOnUsPrcssAgrmtId(char[] ip02014lOnUsPrcssAgrmtId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lOnUsPrcssAgrmtId,0,getStringValue(),beginIp02014lOnUsPrcssAgrmtId,IP_02014L_ON_US_PRCSS_AGRMT_ID_LEN);
       localIp02014lOnUsPrcssAgrmtIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lOnUsPrcssAgrmtIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshIp02014lOnUsPrcssAgrmtId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lOnUsPrcssAgrmtId() {	 
   		return (substring(getStringValue(),beginIp02014lOnUsPrcssAgrmtId,beginIp02014lOnUsPrcssAgrmtId + IP_02014L_ON_US_PRCSS_AGRMT_ID_LEN));
   	}
     int localIp02014lOperSysIdCounter = -1;
     public boolean isIp02014lOperSysIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lOperSysIdCounter != sharedCounter;
         localIp02014lOperSysIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_OPER_SYS_ID_LEN = 20;
	/**
	 * 	serialize this Ip02014lOperSysId
	 */
   protected void serializeIp02014lOperSysId(char[] ip02014lOperSysId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lOperSysId,0,getStringValue(),beginIp02014lOperSysId,IP_02014L_OPER_SYS_ID_LEN);
       localIp02014lOperSysIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lOperSysIdConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshIp02014lOperSysId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lOperSysId() {	 
   		return (substring(getStringValue(),beginIp02014lOperSysId,beginIp02014lOperSysId + IP_02014L_OPER_SYS_ID_LEN));
   	}
     int localIp02014lDbIdCounter = -1;
     public boolean isIp02014lDbIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lDbIdCounter != sharedCounter;
         localIp02014lDbIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_DB_ID_LEN = 20;
	/**
	 * 	serialize this Ip02014lDbId
	 */
   protected void serializeIp02014lDbId(char[] ip02014lDbId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lDbId,0,getStringValue(),beginIp02014lDbId,IP_02014L_DB_ID_LEN);
       localIp02014lDbIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lDbIdConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshIp02014lDbId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lDbId() {	 
   		return (substring(getStringValue(),beginIp02014lDbId,beginIp02014lDbId + IP_02014L_DB_ID_LEN));
   	}
     int localIp02014lFillerCounter = -1;
     public boolean isIp02014lFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014lFillerCounter != sharedCounter;
         localIp02014lFillerCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014L_FILLER_LEN = 750;
	/**
	 * 	serialize this Ip02014lFiller
	 */
   protected void serializeIp02014lFiller(char[] ip02014lFiller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014lFiller,0,getStringValue(),beginIp02014lFiller,IP_02014L_FILLER_LEN);
       localIp02014lFillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014lFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 750 ,false, false);
   }
    /**
	 *	refreshIp02014lFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014lFiller() {	 
   		return (substring(getStringValue(),beginIp02014lFiller,beginIp02014lFiller + IP_02014L_FILLER_LEN));
   	}




}
  

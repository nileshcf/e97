package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip02014wTableDataFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip02014wTableDataFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip02014wTableDataFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_02014W_TABLE_DATA_FIELDS_LENGTH = 921;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp02014wGeoScopeCode;
            protected  int beginIp02014wHostInd;
            protected  int beginIp02014wNumCurrCd;
            protected  int beginIp02014wOfsoilDataTypCd;
            protected  int beginIp02014wMrchntSplitCd;
            protected  int beginIp02014wCurrSplitCd;
            protected  int beginIp02014wAcquirerSplitCd;
            protected  int beginIp02014wDomCollOnlyCd;
            protected  int beginIp02014wOnsoilDataShrSw;
            protected  int beginIp02014wClrCycleNum;
            protected  int beginIp02014wDtaWrhsOnsoilSw;
            protected  int beginIp02014wBllngOnsoilSw;
            protected  int beginIp02014wSetlOnsoilSw;
            protected  int beginIp02014wClrOnsoilSw;
            protected  int beginIp02014wAmsOnsoilSw;
            protected  int beginIp02014wMcomOnsoilSw;
            protected  int beginIp02014wMdsOnsoilSw;
            protected  int beginIp02014wStndInOnsoilSw;
            protected  int beginIp02014wAuthOnsoilSw;
            protected  int beginIp02014wPushOnsoilSw;
            protected  int beginIp02014wIncontrolOnsoilSw;
            protected  int beginIp02014wEsrvcOnsoilSw;
            protected  int beginIp02014wGftOnsoilSw;
            protected  int beginIp02014wBnknetOnsoilSw;
            protected  int beginIp02014wMdesOnsoilSw;
            protected  int beginIp02014wZappOnsoilSw;
            protected  int beginIp02014wCemOnsoilSw;
            protected  int beginIp02014wRptHdrName;
            protected  int beginIp02014wClrPrcssCd;
            protected  int beginIp02014wOnUsPrcssAgrmtId;
            protected  int beginIp02014wOperSysId;
            protected  int beginIp02014wDbId;
            protected  int beginIp02014wFiller;
	
	/**
	* Constructor for Ip02014wTableDataFieldsSerialized
	**/
    public Ip02014wTableDataFieldsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip02014wTableDataFieldsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014wTableDataFieldsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip02014wTableDataFieldsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,11); // serialize this field at offset 11 by default 
    }
    
	/**
	* sets parent for this Ip02014wTableDataFieldsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 11 by default
    }    
	/**
	* initializes the field in Ip02014wTableDataFieldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_02014W_TABLE_DATA_FIELDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp02014wGeoScopeCode = getStartOffset() + 0;	// set offset for serialization
  
             beginIp02014wHostInd = getStartOffset() + 1;	// set offset for serialization
  
  
             beginIp02014wNumCurrCd = getStartOffset() + 6;	// set offset for serialization
  
             beginIp02014wOfsoilDataTypCd = getStartOffset() + 9;	// set offset for serialization
  
             beginIp02014wMrchntSplitCd = getStartOffset() + 12;	// set offset for serialization
  
             beginIp02014wCurrSplitCd = getStartOffset() + 13;	// set offset for serialization
  
             beginIp02014wAcquirerSplitCd = getStartOffset() + 14;	// set offset for serialization
  
             beginIp02014wDomCollOnlyCd = getStartOffset() + 15;	// set offset for serialization
  
             beginIp02014wOnsoilDataShrSw = getStartOffset() + 16;	// set offset for serialization
  
             beginIp02014wClrCycleNum = getStartOffset() + 17;	// set offset for serialization
  
             beginIp02014wDtaWrhsOnsoilSw = getStartOffset() + 19;	// set offset for serialization
  
             beginIp02014wBllngOnsoilSw = getStartOffset() + 20;	// set offset for serialization
  
             beginIp02014wSetlOnsoilSw = getStartOffset() + 21;	// set offset for serialization
  
             beginIp02014wClrOnsoilSw = getStartOffset() + 22;	// set offset for serialization
  
             beginIp02014wAmsOnsoilSw = getStartOffset() + 23;	// set offset for serialization
  
             beginIp02014wMcomOnsoilSw = getStartOffset() + 24;	// set offset for serialization
  
             beginIp02014wMdsOnsoilSw = getStartOffset() + 25;	// set offset for serialization
  
             beginIp02014wStndInOnsoilSw = getStartOffset() + 26;	// set offset for serialization
  
             beginIp02014wAuthOnsoilSw = getStartOffset() + 27;	// set offset for serialization
  
             beginIp02014wPushOnsoilSw = getStartOffset() + 28;	// set offset for serialization
  
             beginIp02014wIncontrolOnsoilSw = getStartOffset() + 29;	// set offset for serialization
  
             beginIp02014wEsrvcOnsoilSw = getStartOffset() + 30;	// set offset for serialization
  
             beginIp02014wGftOnsoilSw = getStartOffset() + 31;	// set offset for serialization
  
             beginIp02014wBnknetOnsoilSw = getStartOffset() + 32;	// set offset for serialization
  
             beginIp02014wMdesOnsoilSw = getStartOffset() + 33;	// set offset for serialization
  
             beginIp02014wZappOnsoilSw = getStartOffset() + 34;	// set offset for serialization
  
             beginIp02014wCemOnsoilSw = getStartOffset() + 35;	// set offset for serialization
  
             beginIp02014wRptHdrName = getStartOffset() + 36;	// set offset for serialization
  
             beginIp02014wClrPrcssCd = getStartOffset() + 116;	// set offset for serialization
  
             beginIp02014wOnUsPrcssAgrmtId = getStartOffset() + 120;	// set offset for serialization
  
             beginIp02014wOperSysId = getStartOffset() + 131;	// set offset for serialization
  
             beginIp02014wDbId = getStartOffset() + 151;	// set offset for serialization
  
             beginIp02014wFiller = getStartOffset() + 171;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp02014wGeoScopeCodeCounter = -1;
     public boolean isIp02014wGeoScopeCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wGeoScopeCodeCounter != sharedCounter;
         localIp02014wGeoScopeCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_GEO_SCOPE_CODE_LEN = 1;
	/**
	 * 	serialize this Ip02014wGeoScopeCode
	 */
   protected void serializeIp02014wGeoScopeCode(char[] ip02014wGeoScopeCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wGeoScopeCode,0,getStringValue(),beginIp02014wGeoScopeCode,IP_02014W_GEO_SCOPE_CODE_LEN);
       localIp02014wGeoScopeCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wGeoScopeCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014wGeoScopeCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wGeoScopeCode() {	 
   		return (substring(getStringValue(),beginIp02014wGeoScopeCode,beginIp02014wGeoScopeCode + IP_02014W_GEO_SCOPE_CODE_LEN));
   	}
     int localIp02014wHostIndCounter = -1;
     public boolean isIp02014wHostIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wHostIndCounter != sharedCounter;
         localIp02014wHostIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_HOST_IND_LEN = 1;
	/**
	 * 	serialize this Ip02014wHostInd
	 */
   protected void serializeIp02014wHostInd(char[] ip02014wHostInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wHostInd,0,getStringValue(),beginIp02014wHostInd,IP_02014W_HOST_IND_LEN);
       localIp02014wHostIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wHostIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014wHostInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wHostInd() {	 
   		return (substring(getStringValue(),beginIp02014wHostInd,beginIp02014wHostInd + IP_02014W_HOST_IND_LEN));
   	}
     int localIp02014wNumCurrCdCounter = -1;
     public boolean isIp02014wNumCurrCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wNumCurrCdCounter != sharedCounter;
         localIp02014wNumCurrCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip02014wNumCurrCd
	 *	@return ip02014wNumCurrCd
	 */
	public char[]  getIp02014wNumCurrCdString() {
	     return getCharArray(beginIp02014wNumCurrCd,IP_02014W_NUM_CURR_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip02014wNumCurrCdIsNumeric() {
	    return isNumeric(beginIp02014wNumCurrCd
	                    ,beginIp02014wNumCurrCd + IP_02014W_NUM_CURR_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_02014W_NUM_CURR_CD_LEN = 3;
  	/**
	 * serializeIp02014wNumCurrCd
	 */
	protected void serializeIp02014wNumCurrCd(int ip02014wNumCurrCd) {
		 putNumber(beginIp02014wNumCurrCd,ip02014wNumCurrCd,IP_02014W_NUM_CURR_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp02014wNumCurrCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp02014wNumCurrCd
	 */
   	protected  int serializeIp02014wNumCurrCd(char[] value) {
	    int  ip02014wNumCurrCd;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip02014wNumCurrCd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp02014wNumCurrCd
		       ,3
		      );
		 localIp02014wNumCurrCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip02014wNumCurrCd;
    }

   protected int checkIp02014wNumCurrCdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp02014wNumCurrCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp02014wNumCurrCd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp02014wNumCurrCd
			                 ,IP_02014W_NUM_CURR_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip02014wNumCurrCd", beginIp02014wNumCurrCd,IP_02014W_NUM_CURR_CD_LEN);
    }
   	}
     int localIp02014wOfsoilDataTypCdCounter = -1;
     public boolean isIp02014wOfsoilDataTypCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wOfsoilDataTypCdCounter != sharedCounter;
         localIp02014wOfsoilDataTypCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_OFSOIL_DATA_TYP_CD_LEN = 3;
	/**
	 * 	serialize this Ip02014wOfsoilDataTypCd
	 */
   protected void serializeIp02014wOfsoilDataTypCd(char[] ip02014wOfsoilDataTypCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wOfsoilDataTypCd,0,getStringValue(),beginIp02014wOfsoilDataTypCd,IP_02014W_OFSOIL_DATA_TYP_CD_LEN);
       localIp02014wOfsoilDataTypCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wOfsoilDataTypCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp02014wOfsoilDataTypCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wOfsoilDataTypCd() {	 
   		return (substring(getStringValue(),beginIp02014wOfsoilDataTypCd,beginIp02014wOfsoilDataTypCd + IP_02014W_OFSOIL_DATA_TYP_CD_LEN));
   	}
     int localIp02014wMrchntSplitCdCounter = -1;
     public boolean isIp02014wMrchntSplitCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wMrchntSplitCdCounter != sharedCounter;
         localIp02014wMrchntSplitCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_MRCHNT_SPLIT_CD_LEN = 1;
	/**
	 * 	serialize this Ip02014wMrchntSplitCd
	 */
   protected void serializeIp02014wMrchntSplitCd(char[] ip02014wMrchntSplitCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wMrchntSplitCd,0,getStringValue(),beginIp02014wMrchntSplitCd,IP_02014W_MRCHNT_SPLIT_CD_LEN);
       localIp02014wMrchntSplitCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wMrchntSplitCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014wMrchntSplitCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wMrchntSplitCd() {	 
   		return (substring(getStringValue(),beginIp02014wMrchntSplitCd,beginIp02014wMrchntSplitCd + IP_02014W_MRCHNT_SPLIT_CD_LEN));
   	}
     int localIp02014wCurrSplitCdCounter = -1;
     public boolean isIp02014wCurrSplitCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wCurrSplitCdCounter != sharedCounter;
         localIp02014wCurrSplitCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_CURR_SPLIT_CD_LEN = 1;
	/**
	 * 	serialize this Ip02014wCurrSplitCd
	 */
   protected void serializeIp02014wCurrSplitCd(char[] ip02014wCurrSplitCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wCurrSplitCd,0,getStringValue(),beginIp02014wCurrSplitCd,IP_02014W_CURR_SPLIT_CD_LEN);
       localIp02014wCurrSplitCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wCurrSplitCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014wCurrSplitCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wCurrSplitCd() {	 
   		return (substring(getStringValue(),beginIp02014wCurrSplitCd,beginIp02014wCurrSplitCd + IP_02014W_CURR_SPLIT_CD_LEN));
   	}
     int localIp02014wAcquirerSplitCdCounter = -1;
     public boolean isIp02014wAcquirerSplitCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wAcquirerSplitCdCounter != sharedCounter;
         localIp02014wAcquirerSplitCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_ACQUIRER_SPLIT_CD_LEN = 1;
	/**
	 * 	serialize this Ip02014wAcquirerSplitCd
	 */
   protected void serializeIp02014wAcquirerSplitCd(char[] ip02014wAcquirerSplitCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wAcquirerSplitCd,0,getStringValue(),beginIp02014wAcquirerSplitCd,IP_02014W_ACQUIRER_SPLIT_CD_LEN);
       localIp02014wAcquirerSplitCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wAcquirerSplitCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014wAcquirerSplitCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wAcquirerSplitCd() {	 
   		return (substring(getStringValue(),beginIp02014wAcquirerSplitCd,beginIp02014wAcquirerSplitCd + IP_02014W_ACQUIRER_SPLIT_CD_LEN));
   	}
     int localIp02014wDomCollOnlyCdCounter = -1;
     public boolean isIp02014wDomCollOnlyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wDomCollOnlyCdCounter != sharedCounter;
         localIp02014wDomCollOnlyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_DOM_COLL_ONLY_CD_LEN = 1;
	/**
	 * 	serialize this Ip02014wDomCollOnlyCd
	 */
   protected void serializeIp02014wDomCollOnlyCd(char[] ip02014wDomCollOnlyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wDomCollOnlyCd,0,getStringValue(),beginIp02014wDomCollOnlyCd,IP_02014W_DOM_COLL_ONLY_CD_LEN);
       localIp02014wDomCollOnlyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wDomCollOnlyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014wDomCollOnlyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wDomCollOnlyCd() {	 
   		return (substring(getStringValue(),beginIp02014wDomCollOnlyCd,beginIp02014wDomCollOnlyCd + IP_02014W_DOM_COLL_ONLY_CD_LEN));
   	}
     int localIp02014wOnsoilDataShrSwCounter = -1;
     public boolean isIp02014wOnsoilDataShrSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wOnsoilDataShrSwCounter != sharedCounter;
         localIp02014wOnsoilDataShrSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_ONSOIL_DATA_SHR_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014wOnsoilDataShrSw
	 */
   protected void serializeIp02014wOnsoilDataShrSw(char[] ip02014wOnsoilDataShrSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wOnsoilDataShrSw,0,getStringValue(),beginIp02014wOnsoilDataShrSw,IP_02014W_ONSOIL_DATA_SHR_SW_LEN);
       localIp02014wOnsoilDataShrSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wOnsoilDataShrSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014wOnsoilDataShrSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wOnsoilDataShrSw() {	 
   		return (substring(getStringValue(),beginIp02014wOnsoilDataShrSw,beginIp02014wOnsoilDataShrSw + IP_02014W_ONSOIL_DATA_SHR_SW_LEN));
   	}
     int localIp02014wClrCycleNumCounter = -1;
     public boolean isIp02014wClrCycleNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wClrCycleNumCounter != sharedCounter;
         localIp02014wClrCycleNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip02014wClrCycleNum
	 *	@return ip02014wClrCycleNum
	 */
	public char[]  getIp02014wClrCycleNumString() {
	     return getCharArray(beginIp02014wClrCycleNum,IP_02014W_CLR_CYCLE_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip02014wClrCycleNumIsNumeric() {
	    return isNumeric(beginIp02014wClrCycleNum
	                    ,beginIp02014wClrCycleNum + IP_02014W_CLR_CYCLE_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_02014W_CLR_CYCLE_NUM_LEN = 2;
  	/**
	 * serializeIp02014wClrCycleNum
	 */
	protected void serializeIp02014wClrCycleNum(int ip02014wClrCycleNum) {
		 putNumber(beginIp02014wClrCycleNum,ip02014wClrCycleNum,IP_02014W_CLR_CYCLE_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp02014wClrCycleNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp02014wClrCycleNum
	 */
   	protected  int serializeIp02014wClrCycleNum(char[] value) {
	    int  ip02014wClrCycleNum;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip02014wClrCycleNum = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp02014wClrCycleNum
		       ,2
		      );
		 localIp02014wClrCycleNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip02014wClrCycleNum;
    }

   protected int checkIp02014wClrCycleNumMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp02014wClrCycleNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp02014wClrCycleNum() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp02014wClrCycleNum
			                 ,IP_02014W_CLR_CYCLE_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip02014wClrCycleNum", beginIp02014wClrCycleNum,IP_02014W_CLR_CYCLE_NUM_LEN);
    }
   	}
     int localIp02014wDtaWrhsOnsoilSwCounter = -1;
     public boolean isIp02014wDtaWrhsOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wDtaWrhsOnsoilSwCounter != sharedCounter;
         localIp02014wDtaWrhsOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_DTA_WRHS_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014wDtaWrhsOnsoilSw
	 */
   protected void serializeIp02014wDtaWrhsOnsoilSw(char[] ip02014wDtaWrhsOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wDtaWrhsOnsoilSw,0,getStringValue(),beginIp02014wDtaWrhsOnsoilSw,IP_02014W_DTA_WRHS_ONSOIL_SW_LEN);
       localIp02014wDtaWrhsOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wDtaWrhsOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014wDtaWrhsOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wDtaWrhsOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014wDtaWrhsOnsoilSw,beginIp02014wDtaWrhsOnsoilSw + IP_02014W_DTA_WRHS_ONSOIL_SW_LEN));
   	}
     int localIp02014wBllngOnsoilSwCounter = -1;
     public boolean isIp02014wBllngOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wBllngOnsoilSwCounter != sharedCounter;
         localIp02014wBllngOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_BLLNG_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014wBllngOnsoilSw
	 */
   protected void serializeIp02014wBllngOnsoilSw(char[] ip02014wBllngOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wBllngOnsoilSw,0,getStringValue(),beginIp02014wBllngOnsoilSw,IP_02014W_BLLNG_ONSOIL_SW_LEN);
       localIp02014wBllngOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wBllngOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014wBllngOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wBllngOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014wBllngOnsoilSw,beginIp02014wBllngOnsoilSw + IP_02014W_BLLNG_ONSOIL_SW_LEN));
   	}
     int localIp02014wSetlOnsoilSwCounter = -1;
     public boolean isIp02014wSetlOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wSetlOnsoilSwCounter != sharedCounter;
         localIp02014wSetlOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_SETL_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014wSetlOnsoilSw
	 */
   protected void serializeIp02014wSetlOnsoilSw(char[] ip02014wSetlOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wSetlOnsoilSw,0,getStringValue(),beginIp02014wSetlOnsoilSw,IP_02014W_SETL_ONSOIL_SW_LEN);
       localIp02014wSetlOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wSetlOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014wSetlOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wSetlOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014wSetlOnsoilSw,beginIp02014wSetlOnsoilSw + IP_02014W_SETL_ONSOIL_SW_LEN));
   	}
     int localIp02014wClrOnsoilSwCounter = -1;
     public boolean isIp02014wClrOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wClrOnsoilSwCounter != sharedCounter;
         localIp02014wClrOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_CLR_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014wClrOnsoilSw
	 */
   protected void serializeIp02014wClrOnsoilSw(char[] ip02014wClrOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wClrOnsoilSw,0,getStringValue(),beginIp02014wClrOnsoilSw,IP_02014W_CLR_ONSOIL_SW_LEN);
       localIp02014wClrOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wClrOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014wClrOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wClrOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014wClrOnsoilSw,beginIp02014wClrOnsoilSw + IP_02014W_CLR_ONSOIL_SW_LEN));
   	}
     int localIp02014wAmsOnsoilSwCounter = -1;
     public boolean isIp02014wAmsOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wAmsOnsoilSwCounter != sharedCounter;
         localIp02014wAmsOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_AMS_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014wAmsOnsoilSw
	 */
   protected void serializeIp02014wAmsOnsoilSw(char[] ip02014wAmsOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wAmsOnsoilSw,0,getStringValue(),beginIp02014wAmsOnsoilSw,IP_02014W_AMS_ONSOIL_SW_LEN);
       localIp02014wAmsOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wAmsOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014wAmsOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wAmsOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014wAmsOnsoilSw,beginIp02014wAmsOnsoilSw + IP_02014W_AMS_ONSOIL_SW_LEN));
   	}
     int localIp02014wMcomOnsoilSwCounter = -1;
     public boolean isIp02014wMcomOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wMcomOnsoilSwCounter != sharedCounter;
         localIp02014wMcomOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_MCOM_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014wMcomOnsoilSw
	 */
   protected void serializeIp02014wMcomOnsoilSw(char[] ip02014wMcomOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wMcomOnsoilSw,0,getStringValue(),beginIp02014wMcomOnsoilSw,IP_02014W_MCOM_ONSOIL_SW_LEN);
       localIp02014wMcomOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wMcomOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014wMcomOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wMcomOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014wMcomOnsoilSw,beginIp02014wMcomOnsoilSw + IP_02014W_MCOM_ONSOIL_SW_LEN));
   	}
     int localIp02014wMdsOnsoilSwCounter = -1;
     public boolean isIp02014wMdsOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wMdsOnsoilSwCounter != sharedCounter;
         localIp02014wMdsOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_MDS_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014wMdsOnsoilSw
	 */
   protected void serializeIp02014wMdsOnsoilSw(char[] ip02014wMdsOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wMdsOnsoilSw,0,getStringValue(),beginIp02014wMdsOnsoilSw,IP_02014W_MDS_ONSOIL_SW_LEN);
       localIp02014wMdsOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wMdsOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014wMdsOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wMdsOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014wMdsOnsoilSw,beginIp02014wMdsOnsoilSw + IP_02014W_MDS_ONSOIL_SW_LEN));
   	}
     int localIp02014wStndInOnsoilSwCounter = -1;
     public boolean isIp02014wStndInOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wStndInOnsoilSwCounter != sharedCounter;
         localIp02014wStndInOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_STND_IN_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014wStndInOnsoilSw
	 */
   protected void serializeIp02014wStndInOnsoilSw(char[] ip02014wStndInOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wStndInOnsoilSw,0,getStringValue(),beginIp02014wStndInOnsoilSw,IP_02014W_STND_IN_ONSOIL_SW_LEN);
       localIp02014wStndInOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wStndInOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014wStndInOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wStndInOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014wStndInOnsoilSw,beginIp02014wStndInOnsoilSw + IP_02014W_STND_IN_ONSOIL_SW_LEN));
   	}
     int localIp02014wAuthOnsoilSwCounter = -1;
     public boolean isIp02014wAuthOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wAuthOnsoilSwCounter != sharedCounter;
         localIp02014wAuthOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_AUTH_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014wAuthOnsoilSw
	 */
   protected void serializeIp02014wAuthOnsoilSw(char[] ip02014wAuthOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wAuthOnsoilSw,0,getStringValue(),beginIp02014wAuthOnsoilSw,IP_02014W_AUTH_ONSOIL_SW_LEN);
       localIp02014wAuthOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wAuthOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014wAuthOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wAuthOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014wAuthOnsoilSw,beginIp02014wAuthOnsoilSw + IP_02014W_AUTH_ONSOIL_SW_LEN));
   	}
     int localIp02014wPushOnsoilSwCounter = -1;
     public boolean isIp02014wPushOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wPushOnsoilSwCounter != sharedCounter;
         localIp02014wPushOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_PUSH_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014wPushOnsoilSw
	 */
   protected void serializeIp02014wPushOnsoilSw(char[] ip02014wPushOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wPushOnsoilSw,0,getStringValue(),beginIp02014wPushOnsoilSw,IP_02014W_PUSH_ONSOIL_SW_LEN);
       localIp02014wPushOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wPushOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014wPushOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wPushOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014wPushOnsoilSw,beginIp02014wPushOnsoilSw + IP_02014W_PUSH_ONSOIL_SW_LEN));
   	}
     int localIp02014wIncontrolOnsoilSwCounter = -1;
     public boolean isIp02014wIncontrolOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wIncontrolOnsoilSwCounter != sharedCounter;
         localIp02014wIncontrolOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_INCONTROL_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014wIncontrolOnsoilSw
	 */
   protected void serializeIp02014wIncontrolOnsoilSw(char[] ip02014wIncontrolOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wIncontrolOnsoilSw,0,getStringValue(),beginIp02014wIncontrolOnsoilSw,IP_02014W_INCONTROL_ONSOIL_SW_LEN);
       localIp02014wIncontrolOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wIncontrolOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014wIncontrolOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wIncontrolOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014wIncontrolOnsoilSw,beginIp02014wIncontrolOnsoilSw + IP_02014W_INCONTROL_ONSOIL_SW_LEN));
   	}
     int localIp02014wEsrvcOnsoilSwCounter = -1;
     public boolean isIp02014wEsrvcOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wEsrvcOnsoilSwCounter != sharedCounter;
         localIp02014wEsrvcOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_ESRVC_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014wEsrvcOnsoilSw
	 */
   protected void serializeIp02014wEsrvcOnsoilSw(char[] ip02014wEsrvcOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wEsrvcOnsoilSw,0,getStringValue(),beginIp02014wEsrvcOnsoilSw,IP_02014W_ESRVC_ONSOIL_SW_LEN);
       localIp02014wEsrvcOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wEsrvcOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014wEsrvcOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wEsrvcOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014wEsrvcOnsoilSw,beginIp02014wEsrvcOnsoilSw + IP_02014W_ESRVC_ONSOIL_SW_LEN));
   	}
     int localIp02014wGftOnsoilSwCounter = -1;
     public boolean isIp02014wGftOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wGftOnsoilSwCounter != sharedCounter;
         localIp02014wGftOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_GFT_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014wGftOnsoilSw
	 */
   protected void serializeIp02014wGftOnsoilSw(char[] ip02014wGftOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wGftOnsoilSw,0,getStringValue(),beginIp02014wGftOnsoilSw,IP_02014W_GFT_ONSOIL_SW_LEN);
       localIp02014wGftOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wGftOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014wGftOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wGftOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014wGftOnsoilSw,beginIp02014wGftOnsoilSw + IP_02014W_GFT_ONSOIL_SW_LEN));
   	}
     int localIp02014wBnknetOnsoilSwCounter = -1;
     public boolean isIp02014wBnknetOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wBnknetOnsoilSwCounter != sharedCounter;
         localIp02014wBnknetOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_BNKNET_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014wBnknetOnsoilSw
	 */
   protected void serializeIp02014wBnknetOnsoilSw(char[] ip02014wBnknetOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wBnknetOnsoilSw,0,getStringValue(),beginIp02014wBnknetOnsoilSw,IP_02014W_BNKNET_ONSOIL_SW_LEN);
       localIp02014wBnknetOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wBnknetOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014wBnknetOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wBnknetOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014wBnknetOnsoilSw,beginIp02014wBnknetOnsoilSw + IP_02014W_BNKNET_ONSOIL_SW_LEN));
   	}
     int localIp02014wMdesOnsoilSwCounter = -1;
     public boolean isIp02014wMdesOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wMdesOnsoilSwCounter != sharedCounter;
         localIp02014wMdesOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_MDES_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014wMdesOnsoilSw
	 */
   protected void serializeIp02014wMdesOnsoilSw(char[] ip02014wMdesOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wMdesOnsoilSw,0,getStringValue(),beginIp02014wMdesOnsoilSw,IP_02014W_MDES_ONSOIL_SW_LEN);
       localIp02014wMdesOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wMdesOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014wMdesOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wMdesOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014wMdesOnsoilSw,beginIp02014wMdesOnsoilSw + IP_02014W_MDES_ONSOIL_SW_LEN));
   	}
     int localIp02014wZappOnsoilSwCounter = -1;
     public boolean isIp02014wZappOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wZappOnsoilSwCounter != sharedCounter;
         localIp02014wZappOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_ZAPP_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014wZappOnsoilSw
	 */
   protected void serializeIp02014wZappOnsoilSw(char[] ip02014wZappOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wZappOnsoilSw,0,getStringValue(),beginIp02014wZappOnsoilSw,IP_02014W_ZAPP_ONSOIL_SW_LEN);
       localIp02014wZappOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wZappOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014wZappOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wZappOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014wZappOnsoilSw,beginIp02014wZappOnsoilSw + IP_02014W_ZAPP_ONSOIL_SW_LEN));
   	}
     int localIp02014wCemOnsoilSwCounter = -1;
     public boolean isIp02014wCemOnsoilSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wCemOnsoilSwCounter != sharedCounter;
         localIp02014wCemOnsoilSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_CEM_ONSOIL_SW_LEN = 1;
	/**
	 * 	serialize this Ip02014wCemOnsoilSw
	 */
   protected void serializeIp02014wCemOnsoilSw(char[] ip02014wCemOnsoilSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wCemOnsoilSw,0,getStringValue(),beginIp02014wCemOnsoilSw,IP_02014W_CEM_ONSOIL_SW_LEN);
       localIp02014wCemOnsoilSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wCemOnsoilSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp02014wCemOnsoilSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wCemOnsoilSw() {	 
   		return (substring(getStringValue(),beginIp02014wCemOnsoilSw,beginIp02014wCemOnsoilSw + IP_02014W_CEM_ONSOIL_SW_LEN));
   	}
     int localIp02014wRptHdrNameCounter = -1;
     public boolean isIp02014wRptHdrNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wRptHdrNameCounter != sharedCounter;
         localIp02014wRptHdrNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_RPT_HDR_NAME_LEN = 80;
	/**
	 * 	serialize this Ip02014wRptHdrName
	 */
   protected void serializeIp02014wRptHdrName(char[] ip02014wRptHdrName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wRptHdrName,0,getStringValue(),beginIp02014wRptHdrName,IP_02014W_RPT_HDR_NAME_LEN);
       localIp02014wRptHdrNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wRptHdrNameConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshIp02014wRptHdrName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wRptHdrName() {	 
   		return (substring(getStringValue(),beginIp02014wRptHdrName,beginIp02014wRptHdrName + IP_02014W_RPT_HDR_NAME_LEN));
   	}
     int localIp02014wClrPrcssCdCounter = -1;
     public boolean isIp02014wClrPrcssCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wClrPrcssCdCounter != sharedCounter;
         localIp02014wClrPrcssCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_CLR_PRCSS_CD_LEN = 4;
	/**
	 * 	serialize this Ip02014wClrPrcssCd
	 */
   protected void serializeIp02014wClrPrcssCd(char[] ip02014wClrPrcssCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wClrPrcssCd,0,getStringValue(),beginIp02014wClrPrcssCd,IP_02014W_CLR_PRCSS_CD_LEN);
       localIp02014wClrPrcssCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wClrPrcssCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp02014wClrPrcssCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wClrPrcssCd() {	 
   		return (substring(getStringValue(),beginIp02014wClrPrcssCd,beginIp02014wClrPrcssCd + IP_02014W_CLR_PRCSS_CD_LEN));
   	}
     int localIp02014wOnUsPrcssAgrmtIdCounter = -1;
     public boolean isIp02014wOnUsPrcssAgrmtIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wOnUsPrcssAgrmtIdCounter != sharedCounter;
         localIp02014wOnUsPrcssAgrmtIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_ON_US_PRCSS_AGRMT_ID_LEN = 11;
	/**
	 * 	serialize this Ip02014wOnUsPrcssAgrmtId
	 */
   protected void serializeIp02014wOnUsPrcssAgrmtId(char[] ip02014wOnUsPrcssAgrmtId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wOnUsPrcssAgrmtId,0,getStringValue(),beginIp02014wOnUsPrcssAgrmtId,IP_02014W_ON_US_PRCSS_AGRMT_ID_LEN);
       localIp02014wOnUsPrcssAgrmtIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wOnUsPrcssAgrmtIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshIp02014wOnUsPrcssAgrmtId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wOnUsPrcssAgrmtId() {	 
   		return (substring(getStringValue(),beginIp02014wOnUsPrcssAgrmtId,beginIp02014wOnUsPrcssAgrmtId + IP_02014W_ON_US_PRCSS_AGRMT_ID_LEN));
   	}
     int localIp02014wOperSysIdCounter = -1;
     public boolean isIp02014wOperSysIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wOperSysIdCounter != sharedCounter;
         localIp02014wOperSysIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_OPER_SYS_ID_LEN = 20;
	/**
	 * 	serialize this Ip02014wOperSysId
	 */
   protected void serializeIp02014wOperSysId(char[] ip02014wOperSysId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wOperSysId,0,getStringValue(),beginIp02014wOperSysId,IP_02014W_OPER_SYS_ID_LEN);
       localIp02014wOperSysIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wOperSysIdConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshIp02014wOperSysId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wOperSysId() {	 
   		return (substring(getStringValue(),beginIp02014wOperSysId,beginIp02014wOperSysId + IP_02014W_OPER_SYS_ID_LEN));
   	}
     int localIp02014wDbIdCounter = -1;
     public boolean isIp02014wDbIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wDbIdCounter != sharedCounter;
         localIp02014wDbIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_DB_ID_LEN = 20;
	/**
	 * 	serialize this Ip02014wDbId
	 */
   protected void serializeIp02014wDbId(char[] ip02014wDbId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wDbId,0,getStringValue(),beginIp02014wDbId,IP_02014W_DB_ID_LEN);
       localIp02014wDbIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wDbIdConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshIp02014wDbId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wDbId() {	 
   		return (substring(getStringValue(),beginIp02014wDbId,beginIp02014wDbId + IP_02014W_DB_ID_LEN));
   	}
     int localIp02014wFillerCounter = -1;
     public boolean isIp02014wFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02014wFillerCounter != sharedCounter;
         localIp02014wFillerCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02014W_FILLER_LEN = 750;
	/**
	 * 	serialize this Ip02014wFiller
	 */
   protected void serializeIp02014wFiller(char[] ip02014wFiller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02014wFiller,0,getStringValue(),beginIp02014wFiller,IP_02014W_FILLER_LEN);
       localIp02014wFillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02014wFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 750 ,false, false);
   }
    /**
	 *	refreshIp02014wFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02014wFiller() {	 
   		return (substring(getStringValue(),beginIp02014wFiller,beginIp02014wFiller + IP_02014W_FILLER_LEN));
   	}




}
  

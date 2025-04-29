package com.cloudframe.app.sf326010.dto.serialize;

/**
*  The class Sf539ServiceTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf539ServiceTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf539ServiceTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_539_SERVICE_TABLE_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf539ServiceReqNo;
            protected  int beginSf539ServiceRefno;
            protected  int beginSf539ServiceCode;
            protected  int beginSf539ServiceStatus;
            protected  int beginSf539ServiceRc;
            protected  int beginSf539SrvDataLnth;
            protected  int beginSf539ServiceData;
	
	/**
	* Constructor for Sf539ServiceTableSerialized
	**/
    public Sf539ServiceTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf539ServiceTableSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf539ServiceTableSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf539ServiceTableSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,32); // serialize this field at offset 32 by default 
    }
    
	/**
	* sets parent for this Sf539ServiceTableSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 32 by default
    }    
	/**
	* initializes the field in Sf539ServiceTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_539_SERVICE_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf539ServiceReqNo = getStartOffset() + 0;	// set offset for serialization
  
             beginSf539ServiceRefno = getStartOffset() + 2;	// set offset for serialization
  
             beginSf539ServiceCode = getStartOffset() + 8;	// set offset for serialization
  
             beginSf539ServiceStatus = getStartOffset() + 12;	// set offset for serialization
  
             beginSf539ServiceRc = getStartOffset() + 13;	// set offset for serialization
  
             beginSf539SrvDataLnth = getStartOffset() + 14;	// set offset for serialization
  
             beginSf539ServiceData = getStartOffset() + 18;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localSf539ServiceReqNoCounter = -1;
     public boolean isSf539ServiceReqNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf539ServiceReqNoCounter != sharedCounter;
         localSf539ServiceReqNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sf539ServiceReqNo
	 *	@return sf539ServiceReqNo
	 */
	public char[]  getSf539ServiceReqNoString() {
	     return getCharArray(beginSf539ServiceReqNo,SF_539_SERVICE_REQ_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sf539ServiceReqNoIsNumeric() {
	    return isNumeric(beginSf539ServiceReqNo
	                    ,beginSf539ServiceReqNo + SF_539_SERVICE_REQ_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SF_539_SERVICE_REQ_NO_LEN = 2;
  	/**
	 * serializeSf539ServiceReqNo
	 */
	protected void serializeSf539ServiceReqNo(int sf539ServiceReqNo) {
		 putNumber(beginSf539ServiceReqNo,sf539ServiceReqNo,SF_539_SERVICE_REQ_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSf539ServiceReqNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSf539ServiceReqNo
	 */
   	protected  int serializeSf539ServiceReqNo(char[] value) {
	    int  sf539ServiceReqNo;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sf539ServiceReqNo = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginSf539ServiceReqNo
		       ,2
		      );
		 localSf539ServiceReqNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  sf539ServiceReqNo;
    }

   protected int checkSf539ServiceReqNoMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSf539ServiceReqNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSf539ServiceReqNo() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSf539ServiceReqNo
			                 ,SF_539_SERVICE_REQ_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sf539ServiceReqNo", beginSf539ServiceReqNo,SF_539_SERVICE_REQ_NO_LEN);
    }
   	}
     int localSf539ServiceRefnoCounter = -1;
     public boolean isSf539ServiceRefnoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf539ServiceRefnoCounter != sharedCounter;
         localSf539ServiceRefnoCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_539_SERVICE_REFNO_LEN = 6;
	/**
	 * 	serialize this Sf539ServiceRefno
	 */
   protected void serializeSf539ServiceRefno(char[] sf539ServiceRefno) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf539ServiceRefno,0,getStringValue(),beginSf539ServiceRefno,SF_539_SERVICE_REFNO_LEN);
       localSf539ServiceRefnoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf539ServiceRefnoConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSf539ServiceRefno is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf539ServiceRefno() {	 
   		return (substring(getStringValue(),beginSf539ServiceRefno,beginSf539ServiceRefno + SF_539_SERVICE_REFNO_LEN));
   	}
     int localSf539ServiceCodeCounter = -1;
     public boolean isSf539ServiceCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf539ServiceCodeCounter != sharedCounter;
         localSf539ServiceCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_539_SERVICE_CODE_LEN = 4;
	/**
	 * 	serialize this Sf539ServiceCode
	 */
   protected void serializeSf539ServiceCode(char[] sf539ServiceCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf539ServiceCode,0,getStringValue(),beginSf539ServiceCode,SF_539_SERVICE_CODE_LEN);
       localSf539ServiceCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf539ServiceCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSf539ServiceCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf539ServiceCode() {	 
   		return (substring(getStringValue(),beginSf539ServiceCode,beginSf539ServiceCode + SF_539_SERVICE_CODE_LEN));
   	}
     int localSf539ServiceStatusCounter = -1;
     public boolean isSf539ServiceStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf539ServiceStatusCounter != sharedCounter;
         localSf539ServiceStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_539_SERVICE_STATUS_LEN = 1;
	/**
	 * 	serialize this Sf539ServiceStatus
	 */
   protected void serializeSf539ServiceStatus(char[] sf539ServiceStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf539ServiceStatus,0,getStringValue(),beginSf539ServiceStatus,SF_539_SERVICE_STATUS_LEN);
       localSf539ServiceStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf539ServiceStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf539ServiceStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf539ServiceStatus() {	 
   		return (substring(getStringValue(),beginSf539ServiceStatus,beginSf539ServiceStatus + SF_539_SERVICE_STATUS_LEN));
   	}
     int localSf539ServiceRcCounter = -1;
     public boolean isSf539ServiceRcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf539ServiceRcCounter != sharedCounter;
         localSf539ServiceRcCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_539_SERVICE_RC_LEN = 1;
	/**
	 * 	serialize this Sf539ServiceRc
	 */
   protected void serializeSf539ServiceRc(char[] sf539ServiceRc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf539ServiceRc,0,getStringValue(),beginSf539ServiceRc,SF_539_SERVICE_RC_LEN);
       localSf539ServiceRcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf539ServiceRcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf539ServiceRc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf539ServiceRc() {	 
   		return (substring(getStringValue(),beginSf539ServiceRc,beginSf539ServiceRc + SF_539_SERVICE_RC_LEN));
   	}
     int localSf539SrvDataLnthCounter = -1;
     public boolean isSf539SrvDataLnthModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf539SrvDataLnthCounter != sharedCounter;
         localSf539SrvDataLnthCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sf539SrvDataLnth
	 *	@return sf539SrvDataLnth
	 */
	public char[]  getSf539SrvDataLnthString() {
	     return getCharArray(beginSf539SrvDataLnth,SF_539_SRV_DATA_LNTH_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sf539SrvDataLnthIsNumeric() {
	    return isNumeric(beginSf539SrvDataLnth
	                    ,beginSf539SrvDataLnth + SF_539_SRV_DATA_LNTH_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SF_539_SRV_DATA_LNTH_LEN = 4;
  	/**
	 * serializeSf539SrvDataLnth
	 */
	protected void serializeSf539SrvDataLnth(int sf539SrvDataLnth) {
		 putNumber(beginSf539SrvDataLnth,sf539SrvDataLnth,SF_539_SRV_DATA_LNTH_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSf539SrvDataLnthCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSf539SrvDataLnth
	 */
   	protected  int serializeSf539SrvDataLnth(char[] value) {
	    int  sf539SrvDataLnth;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sf539SrvDataLnth = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginSf539SrvDataLnth
		       ,4
		      );
		 localSf539SrvDataLnthCounter = shareString.getSerializedField().getModifiedCounter();
		return  sf539SrvDataLnth;
    }

   protected int checkSf539SrvDataLnthMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSf539SrvDataLnth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSf539SrvDataLnth() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSf539SrvDataLnth
			                 ,SF_539_SRV_DATA_LNTH_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sf539SrvDataLnth", beginSf539SrvDataLnth,SF_539_SRV_DATA_LNTH_LEN);
    }
   	}
     int localSf539ServiceDataCounter = -1;
     public boolean isSf539ServiceDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf539ServiceDataCounter != sharedCounter;
         localSf539ServiceDataCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_539_SERVICE_DATA_LEN = 50;
	/**
	 * 	serialize this Sf539ServiceData
	 */
   protected void serializeSf539ServiceData(char[] sf539ServiceData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf539ServiceData,0,getStringValue(),beginSf539ServiceData,SF_539_SERVICE_DATA_LEN);
       localSf539ServiceDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf539ServiceDataConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
    /**
	 *	refreshSf539ServiceData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf539ServiceData() {	 
   		return (substring(getStringValue(),beginSf539ServiceData,beginSf539ServiceData + SF_539_SERVICE_DATA_LEN));
   	}




}
  

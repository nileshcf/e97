package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip0041TableDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0041TableDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0041TableDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0041_TABLE_DATA_LENGTH = 111;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp0041Bin;
            protected  int beginIp0041Ab;
            protected  int beginIp0041Ica;
            protected  int beginIp0041FormatIndicator;
            protected  int beginIp0041Endpoint;
            protected  int beginIp0041PosMvInd;
            protected  int beginIp0041AtmMvInd;
            protected  int beginIp0041UcafInd;
            protected  int beginIp0041RePowerInd;
            protected  int beginIp0041DomDbtParticipSw;
            protected  int beginIp0041IchgAcqCd;
            protected  int beginIp0041MemberFiller;
	
	/**
	* Constructor for Ip0041TableDataSerialized
	**/
    public Ip0041TableDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip0041TableDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0041TableDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip0041TableDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,19); // serialize this field at offset 19 by default 
    }
    
	/**
	* sets parent for this Ip0041TableDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 19 by default
    }    
	/**
	* initializes the field in Ip0041TableDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0041_TABLE_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp0041Bin = getStartOffset() + 0;	// set offset for serialization
  
             beginIp0041Ab = getStartOffset() + 6;	// set offset for serialization
  
             beginIp0041Ica = getStartOffset() + 9;	// set offset for serialization
  
             beginIp0041FormatIndicator = getStartOffset() + 20;	// set offset for serialization
  
             beginIp0041Endpoint = getStartOffset() + 21;	// set offset for serialization
  
             beginIp0041PosMvInd = getStartOffset() + 28;	// set offset for serialization
  
             beginIp0041AtmMvInd = getStartOffset() + 29;	// set offset for serialization
  
             beginIp0041UcafInd = getStartOffset() + 30;	// set offset for serialization
  
  
  
             beginIp0041RePowerInd = getStartOffset() + 97;	// set offset for serialization
  
             beginIp0041DomDbtParticipSw = getStartOffset() + 98;	// set offset for serialization
  
             beginIp0041IchgAcqCd = getStartOffset() + 99;	// set offset for serialization
  
             beginIp0041MemberFiller = getStartOffset() + 100;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp0041BinCounter = -1;
     public boolean isIp0041BinModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0041BinCounter != sharedCounter;
         localIp0041BinCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0041Bin
	 *	@return ip0041Bin
	 */
	public char[]  getIp0041BinString() {
	     return getCharArray(beginIp0041Bin,IP_0041_BIN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0041BinIsNumeric() {
	    return isNumeric(beginIp0041Bin
	                    ,beginIp0041Bin + IP_0041_BIN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0041_BIN_LEN = 6;
  	/**
	 * serializeIp0041Bin
	 */
	protected void serializeIp0041Bin(long ip0041Bin) {
		 putNumber(beginIp0041Bin,ip0041Bin,IP_0041_BIN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0041BinCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0041Bin
	 */
   	protected  long serializeIp0041Bin(char[] value) {
	    long  ip0041Bin;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0041Bin = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp0041Bin
		       ,6
		      );
		 localIp0041BinCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0041Bin;
    }

   protected long checkIp0041BinMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0041Bin is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp0041Bin() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp0041Bin
			                 ,IP_0041_BIN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0041Bin", beginIp0041Bin,IP_0041_BIN_LEN);
    }
   	}
     int localIp0041AbCounter = -1;
     public boolean isIp0041AbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0041AbCounter != sharedCounter;
         localIp0041AbCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0041_AB_LEN = 3;
	/**
	 * 	serialize this Ip0041Ab
	 */
   protected void serializeIp0041Ab(char[] ip0041Ab) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0041Ab,0,getStringValue(),beginIp0041Ab,IP_0041_AB_LEN);
       localIp0041AbCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0041AbConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp0041Ab is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0041Ab() {	 
   		return (substring(getStringValue(),beginIp0041Ab,beginIp0041Ab + IP_0041_AB_LEN));
   	}
     int localIp0041IcaCounter = -1;
     public boolean isIp0041IcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0041IcaCounter != sharedCounter;
         localIp0041IcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0041Ica
	 *	@return ip0041Ica
	 */
	public char[]  getIp0041IcaString() {
	     return getCharArray(beginIp0041Ica,IP_0041_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0041IcaIsNumeric() {
	    return isNumeric(beginIp0041Ica
	                    ,beginIp0041Ica + IP_0041_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0041_ICA_LEN = 11;
  	/**
	 * serializeIp0041Ica
	 */
	protected void serializeIp0041Ica(long ip0041Ica) {
		 putNumber(beginIp0041Ica,ip0041Ica,IP_0041_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0041IcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0041Ica
	 */
   	protected  long serializeIp0041Ica(char[] value) {
	    long  ip0041Ica;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0041Ica = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginIp0041Ica
		       ,11
		      );
		 localIp0041IcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0041Ica;
    }

   protected long checkIp0041IcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0041Ica is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp0041Ica() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp0041Ica
			                 ,IP_0041_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0041Ica", beginIp0041Ica,IP_0041_ICA_LEN);
    }
   	}
     int localIp0041FormatIndicatorCounter = -1;
     public boolean isIp0041FormatIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0041FormatIndicatorCounter != sharedCounter;
         localIp0041FormatIndicatorCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0041_FORMAT_INDICATOR_LEN = 1;
	/**
	 * 	serialize this Ip0041FormatIndicator
	 */
   protected void serializeIp0041FormatIndicator(char[] ip0041FormatIndicator) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0041FormatIndicator,0,getStringValue(),beginIp0041FormatIndicator,IP_0041_FORMAT_INDICATOR_LEN);
       localIp0041FormatIndicatorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0041FormatIndicatorConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0041FormatIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0041FormatIndicator() {	 
   		return (substring(getStringValue(),beginIp0041FormatIndicator,beginIp0041FormatIndicator + IP_0041_FORMAT_INDICATOR_LEN));
   	}
     int localIp0041EndpointCounter = -1;
     public boolean isIp0041EndpointModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0041EndpointCounter != sharedCounter;
         localIp0041EndpointCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0041Endpoint
	 *	@return ip0041Endpoint
	 */
	public char[]  getIp0041EndpointString() {
	     return getCharArray(beginIp0041Endpoint,IP_0041_ENDPOINT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0041EndpointIsNumeric() {
	    return isNumeric(beginIp0041Endpoint
	                    ,beginIp0041Endpoint + IP_0041_ENDPOINT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0041_ENDPOINT_LEN = 7;
  	/**
	 * serializeIp0041Endpoint
	 */
	protected void serializeIp0041Endpoint(long ip0041Endpoint) {
		 putNumber(beginIp0041Endpoint,ip0041Endpoint,IP_0041_ENDPOINT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0041EndpointCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0041Endpoint
	 */
   	protected  long serializeIp0041Endpoint(char[] value) {
	    long  ip0041Endpoint;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0041Endpoint = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginIp0041Endpoint
		       ,7
		      );
		 localIp0041EndpointCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0041Endpoint;
    }

   protected long checkIp0041EndpointMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0041Endpoint is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp0041Endpoint() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp0041Endpoint
			                 ,IP_0041_ENDPOINT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0041Endpoint", beginIp0041Endpoint,IP_0041_ENDPOINT_LEN);
    }
   	}
     int localIp0041PosMvIndCounter = -1;
     public boolean isIp0041PosMvIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0041PosMvIndCounter != sharedCounter;
         localIp0041PosMvIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0041_POS_MV_IND_LEN = 1;
	/**
	 * 	serialize this Ip0041PosMvInd
	 */
   protected void serializeIp0041PosMvInd(char[] ip0041PosMvInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0041PosMvInd,0,getStringValue(),beginIp0041PosMvInd,IP_0041_POS_MV_IND_LEN);
       localIp0041PosMvIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0041PosMvIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0041PosMvInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0041PosMvInd() {	 
   		return (substring(getStringValue(),beginIp0041PosMvInd,beginIp0041PosMvInd + IP_0041_POS_MV_IND_LEN));
   	}
     int localIp0041AtmMvIndCounter = -1;
     public boolean isIp0041AtmMvIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0041AtmMvIndCounter != sharedCounter;
         localIp0041AtmMvIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0041_ATM_MV_IND_LEN = 1;
	/**
	 * 	serialize this Ip0041AtmMvInd
	 */
   protected void serializeIp0041AtmMvInd(char[] ip0041AtmMvInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0041AtmMvInd,0,getStringValue(),beginIp0041AtmMvInd,IP_0041_ATM_MV_IND_LEN);
       localIp0041AtmMvIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0041AtmMvIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0041AtmMvInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0041AtmMvInd() {	 
   		return (substring(getStringValue(),beginIp0041AtmMvInd,beginIp0041AtmMvInd + IP_0041_ATM_MV_IND_LEN));
   	}
     int localIp0041UcafIndCounter = -1;
     public boolean isIp0041UcafIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0041UcafIndCounter != sharedCounter;
         localIp0041UcafIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0041_UCAF_IND_LEN = 1;
	/**
	 * 	serialize this Ip0041UcafInd
	 */
   protected void serializeIp0041UcafInd(char[] ip0041UcafInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0041UcafInd,0,getStringValue(),beginIp0041UcafInd,IP_0041_UCAF_IND_LEN);
       localIp0041UcafIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0041UcafIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0041UcafInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0041UcafInd() {	 
   		return (substring(getStringValue(),beginIp0041UcafInd,beginIp0041UcafInd + IP_0041_UCAF_IND_LEN));
   	}
     int localIp0041RePowerIndCounter = -1;
     public boolean isIp0041RePowerIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0041RePowerIndCounter != sharedCounter;
         localIp0041RePowerIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0041_RE_POWER_IND_LEN = 1;
	/**
	 * 	serialize this Ip0041RePowerInd
	 */
   protected void serializeIp0041RePowerInd(char[] ip0041RePowerInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0041RePowerInd,0,getStringValue(),beginIp0041RePowerInd,IP_0041_RE_POWER_IND_LEN);
       localIp0041RePowerIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0041RePowerIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0041RePowerInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0041RePowerInd() {	 
   		return (substring(getStringValue(),beginIp0041RePowerInd,beginIp0041RePowerInd + IP_0041_RE_POWER_IND_LEN));
   	}
     int localIp0041DomDbtParticipSwCounter = -1;
     public boolean isIp0041DomDbtParticipSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0041DomDbtParticipSwCounter != sharedCounter;
         localIp0041DomDbtParticipSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0041_DOM_DBT_PARTICIP_SW_LEN = 1;
	/**
	 * 	serialize this Ip0041DomDbtParticipSw
	 */
   protected void serializeIp0041DomDbtParticipSw(char[] ip0041DomDbtParticipSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0041DomDbtParticipSw,0,getStringValue(),beginIp0041DomDbtParticipSw,IP_0041_DOM_DBT_PARTICIP_SW_LEN);
       localIp0041DomDbtParticipSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0041DomDbtParticipSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0041DomDbtParticipSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0041DomDbtParticipSw() {	 
   		return (substring(getStringValue(),beginIp0041DomDbtParticipSw,beginIp0041DomDbtParticipSw + IP_0041_DOM_DBT_PARTICIP_SW_LEN));
   	}
     int localIp0041IchgAcqCdCounter = -1;
     public boolean isIp0041IchgAcqCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0041IchgAcqCdCounter != sharedCounter;
         localIp0041IchgAcqCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0041_ICHG_ACQ_CD_LEN = 1;
	/**
	 * 	serialize this Ip0041IchgAcqCd
	 */
   protected void serializeIp0041IchgAcqCd(char[] ip0041IchgAcqCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0041IchgAcqCd,0,getStringValue(),beginIp0041IchgAcqCd,IP_0041_ICHG_ACQ_CD_LEN);
       localIp0041IchgAcqCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0041IchgAcqCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0041IchgAcqCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0041IchgAcqCd() {	 
   		return (substring(getStringValue(),beginIp0041IchgAcqCd,beginIp0041IchgAcqCd + IP_0041_ICHG_ACQ_CD_LEN));
   	}
     int localIp0041MemberFillerCounter = -1;
     public boolean isIp0041MemberFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0041MemberFillerCounter != sharedCounter;
         localIp0041MemberFillerCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0041_MEMBER_FILLER_LEN = 5;
	/**
	 * 	serialize this Ip0041MemberFiller
	 */
   protected void serializeIp0041MemberFiller(char[] ip0041MemberFiller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0041MemberFiller,0,getStringValue(),beginIp0041MemberFiller,IP_0041_MEMBER_FILLER_LEN);
       localIp0041MemberFillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0041MemberFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshIp0041MemberFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0041MemberFiller() {	 
   		return (substring(getStringValue(),beginIp0041MemberFiller,beginIp0041MemberFiller + IP_0041_MEMBER_FILLER_LEN));
   	}




}
  

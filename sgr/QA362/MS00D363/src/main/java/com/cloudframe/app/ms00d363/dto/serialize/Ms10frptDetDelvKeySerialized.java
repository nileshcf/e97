package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class Ms10frptDetDelvKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ms10frptDetDelvKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ms10frptDetDelvKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MS_10FRPT_DET_DELV_KEY_LENGTH = 64;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMs10frptDkeyRecType;
            protected  int beginMs10frptDkeyEndpt;
            protected  int beginMs10frptDkeyEntIca;
            protected  int beginMs10frptDkeyProc;
            protected  int beginMs10frptDkeyHier;
            protected  int beginMs10frptDkeyRptId;
            protected  int beginMs10frptDkeyWrkofYmd;
            protected  int beginMs10frptDkeyCutoffHhmm;
            protected  int beginMs10frptDkeyLnSeqno;
            protected  int beginMs10frptInhProcFlag;
	
	/**
	* Constructor for Ms10frptDetDelvKeySerialized
	**/
    public Ms10frptDetDelvKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ms10frptDetDelvKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ms10frptDetDelvKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ms10frptDetDelvKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ms10frptDetDelvKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ms10frptDetDelvKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MS_10FRPT_DET_DELV_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMs10frptDkeyRecType = getStartOffset() + 0;	// set offset for serialization
  
             beginMs10frptDkeyEndpt = getStartOffset() + 2;	// set offset for serialization
  
             beginMs10frptDkeyEntIca = getStartOffset() + 9;	// set offset for serialization
  
             beginMs10frptDkeyProc = getStartOffset() + 15;	// set offset for serialization
  
             beginMs10frptDkeyHier = getStartOffset() + 25;	// set offset for serialization
  
             beginMs10frptDkeyRptId = getStartOffset() + 29;	// set offset for serialization
  
             beginMs10frptDkeyWrkofYmd = getStartOffset() + 41;	// set offset for serialization
  
             beginMs10frptDkeyCutoffHhmm = getStartOffset() + 47;	// set offset for serialization
  
             beginMs10frptDkeyLnSeqno = getStartOffset() + 51;	// set offset for serialization
  
             beginMs10frptInhProcFlag = getStartOffset() + 63;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMs10frptDkeyRecTypeCounter = -1;
     public boolean isMs10frptDkeyRecTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptDkeyRecTypeCounter != sharedCounter;
         localMs10frptDkeyRecTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int MS_10FRPT_DKEY_REC_TYPE_LEN = 2;
	/**
	 * 	serialize this Ms10frptDkeyRecType
	 */
   protected void serializeMs10frptDkeyRecType(char[] ms10frptDkeyRecType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ms10frptDkeyRecType,0,getStringValue(),beginMs10frptDkeyRecType,MS_10FRPT_DKEY_REC_TYPE_LEN);
       localMs10frptDkeyRecTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMs10frptDkeyRecTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMs10frptDkeyRecType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMs10frptDkeyRecType() {	 
   		return (substring(getStringValue(),beginMs10frptDkeyRecType,beginMs10frptDkeyRecType + MS_10FRPT_DKEY_REC_TYPE_LEN));
   	}
     int localMs10frptDkeyEndptCounter = -1;
     public boolean isMs10frptDkeyEndptModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptDkeyEndptCounter != sharedCounter;
         localMs10frptDkeyEndptCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ms10frptDkeyEndpt
	 *	@return ms10frptDkeyEndpt
	 */
	public char[]  getMs10frptDkeyEndptString() {
	     return getCharArray(beginMs10frptDkeyEndpt,MS_10FRPT_DKEY_ENDPT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ms10frptDkeyEndptIsNumeric() {
	    return isNumeric(beginMs10frptDkeyEndpt
	                    ,beginMs10frptDkeyEndpt + MS_10FRPT_DKEY_ENDPT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MS_10FRPT_DKEY_ENDPT_LEN = 7;
  	/**
	 * serializeMs10frptDkeyEndpt
	 */
	protected void serializeMs10frptDkeyEndpt(long ms10frptDkeyEndpt) {
		 putNumber(beginMs10frptDkeyEndpt,ms10frptDkeyEndpt,MS_10FRPT_DKEY_ENDPT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMs10frptDkeyEndptCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMs10frptDkeyEndpt
	 */
   	protected  long serializeMs10frptDkeyEndpt(char[] value) {
	    long  ms10frptDkeyEndpt;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ms10frptDkeyEndpt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginMs10frptDkeyEndpt
		       ,7
		      );
		 localMs10frptDkeyEndptCounter = shareString.getSerializedField().getModifiedCounter();
		return  ms10frptDkeyEndpt;
    }

   protected long checkMs10frptDkeyEndptMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMs10frptDkeyEndpt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMs10frptDkeyEndpt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMs10frptDkeyEndpt
			                 ,MS_10FRPT_DKEY_ENDPT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ms10frptDkeyEndpt", beginMs10frptDkeyEndpt,MS_10FRPT_DKEY_ENDPT_LEN);
    }
   	}
     int localMs10frptDkeyEntIcaCounter = -1;
     public boolean isMs10frptDkeyEntIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptDkeyEntIcaCounter != sharedCounter;
         localMs10frptDkeyEntIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ms10frptDkeyEntIca
	 *	@return ms10frptDkeyEntIca
	 */
	public char[]  getMs10frptDkeyEntIcaString() {
	     return getCharArray(beginMs10frptDkeyEntIca,MS_10FRPT_DKEY_ENT_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ms10frptDkeyEntIcaIsNumeric() {
	    return isNumeric(beginMs10frptDkeyEntIca
	                    ,beginMs10frptDkeyEntIca + MS_10FRPT_DKEY_ENT_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MS_10FRPT_DKEY_ENT_ICA_LEN = 6;
  	/**
	 * serializeMs10frptDkeyEntIca
	 */
	protected void serializeMs10frptDkeyEntIca(long ms10frptDkeyEntIca) {
		 putNumber(beginMs10frptDkeyEntIca,ms10frptDkeyEntIca,MS_10FRPT_DKEY_ENT_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMs10frptDkeyEntIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMs10frptDkeyEntIca
	 */
   	protected  long serializeMs10frptDkeyEntIca(char[] value) {
	    long  ms10frptDkeyEntIca;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ms10frptDkeyEntIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMs10frptDkeyEntIca
		       ,6
		      );
		 localMs10frptDkeyEntIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  ms10frptDkeyEntIca;
    }

   protected long checkMs10frptDkeyEntIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMs10frptDkeyEntIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMs10frptDkeyEntIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMs10frptDkeyEntIca
			                 ,MS_10FRPT_DKEY_ENT_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ms10frptDkeyEntIca", beginMs10frptDkeyEntIca,MS_10FRPT_DKEY_ENT_ICA_LEN);
    }
   	}
     int localMs10frptDkeyProcCounter = -1;
     public boolean isMs10frptDkeyProcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptDkeyProcCounter != sharedCounter;
         localMs10frptDkeyProcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ms10frptDkeyProc
	 *	@return ms10frptDkeyProc
	 */
	public char[]  getMs10frptDkeyProcString() {
	     return getCharArray(beginMs10frptDkeyProc,MS_10FRPT_DKEY_PROC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ms10frptDkeyProcIsNumeric() {
	    return isNumeric(beginMs10frptDkeyProc
	                    ,beginMs10frptDkeyProc + MS_10FRPT_DKEY_PROC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MS_10FRPT_DKEY_PROC_LEN = 10;
  	/**
	 * serializeMs10frptDkeyProc
	 */
	protected void serializeMs10frptDkeyProc(long ms10frptDkeyProc) {
		 putNumber(beginMs10frptDkeyProc,ms10frptDkeyProc,MS_10FRPT_DKEY_PROC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMs10frptDkeyProcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMs10frptDkeyProc
	 */
   	protected  long serializeMs10frptDkeyProc(char[] value) {
	    long  ms10frptDkeyProc;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ms10frptDkeyProc = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginMs10frptDkeyProc
		       ,10
		      );
		 localMs10frptDkeyProcCounter = shareString.getSerializedField().getModifiedCounter();
		return  ms10frptDkeyProc;
    }

   protected long checkMs10frptDkeyProcMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMs10frptDkeyProc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMs10frptDkeyProc() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMs10frptDkeyProc
			                 ,MS_10FRPT_DKEY_PROC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ms10frptDkeyProc", beginMs10frptDkeyProc,MS_10FRPT_DKEY_PROC_LEN);
    }
   	}
     int localMs10frptDkeyHierCounter = -1;
     public boolean isMs10frptDkeyHierModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptDkeyHierCounter != sharedCounter;
         localMs10frptDkeyHierCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ms10frptDkeyHier
	 *	@return ms10frptDkeyHier
	 */
	public char[]  getMs10frptDkeyHierString() {
	     return getCharArray(beginMs10frptDkeyHier,MS_10FRPT_DKEY_HIER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ms10frptDkeyHierIsNumeric() {
	    return isNumeric(beginMs10frptDkeyHier
	                    ,beginMs10frptDkeyHier + MS_10FRPT_DKEY_HIER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MS_10FRPT_DKEY_HIER_LEN = 4;
  	/**
	 * serializeMs10frptDkeyHier
	 */
	protected void serializeMs10frptDkeyHier(int ms10frptDkeyHier) {
		 putNumber(beginMs10frptDkeyHier,ms10frptDkeyHier,MS_10FRPT_DKEY_HIER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMs10frptDkeyHierCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMs10frptDkeyHier
	 */
   	protected  int serializeMs10frptDkeyHier(char[] value) {
	    int  ms10frptDkeyHier;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ms10frptDkeyHier = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginMs10frptDkeyHier
		       ,4
		      );
		 localMs10frptDkeyHierCounter = shareString.getSerializedField().getModifiedCounter();
		return  ms10frptDkeyHier;
    }

   protected int checkMs10frptDkeyHierMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMs10frptDkeyHier is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMs10frptDkeyHier() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMs10frptDkeyHier
			                 ,MS_10FRPT_DKEY_HIER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ms10frptDkeyHier", beginMs10frptDkeyHier,MS_10FRPT_DKEY_HIER_LEN);
    }
   	}
     int localMs10frptDkeyRptIdCounter = -1;
     public boolean isMs10frptDkeyRptIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptDkeyRptIdCounter != sharedCounter;
         localMs10frptDkeyRptIdCounter = sharedCounter; return hasModified;
     }
	protected static final int MS_10FRPT_DKEY_RPT_ID_LEN = 12;
	/**
	 * 	serialize this Ms10frptDkeyRptId
	 */
   protected void serializeMs10frptDkeyRptId(char[] ms10frptDkeyRptId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ms10frptDkeyRptId,0,getStringValue(),beginMs10frptDkeyRptId,MS_10FRPT_DKEY_RPT_ID_LEN);
       localMs10frptDkeyRptIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMs10frptDkeyRptIdConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshMs10frptDkeyRptId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMs10frptDkeyRptId() {	 
   		return (substring(getStringValue(),beginMs10frptDkeyRptId,beginMs10frptDkeyRptId + MS_10FRPT_DKEY_RPT_ID_LEN));
   	}
     int localMs10frptDkeyWrkofYmdCounter = -1;
     public boolean isMs10frptDkeyWrkofYmdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptDkeyWrkofYmdCounter != sharedCounter;
         localMs10frptDkeyWrkofYmdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ms10frptDkeyWrkofYmd
	 *	@return ms10frptDkeyWrkofYmd
	 */
	public char[]  getMs10frptDkeyWrkofYmdString() {
	     return getCharArray(beginMs10frptDkeyWrkofYmd,MS_10FRPT_DKEY_WRKOF_YMD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ms10frptDkeyWrkofYmdIsNumeric() {
	    return isNumeric(beginMs10frptDkeyWrkofYmd
	                    ,beginMs10frptDkeyWrkofYmd + MS_10FRPT_DKEY_WRKOF_YMD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MS_10FRPT_DKEY_WRKOF_YMD_LEN = 6;
  	/**
	 * serializeMs10frptDkeyWrkofYmd
	 */
	protected void serializeMs10frptDkeyWrkofYmd(long ms10frptDkeyWrkofYmd) {
		 putNumber(beginMs10frptDkeyWrkofYmd,ms10frptDkeyWrkofYmd,MS_10FRPT_DKEY_WRKOF_YMD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMs10frptDkeyWrkofYmdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMs10frptDkeyWrkofYmd
	 */
   	protected  long serializeMs10frptDkeyWrkofYmd(char[] value) {
	    long  ms10frptDkeyWrkofYmd;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ms10frptDkeyWrkofYmd = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMs10frptDkeyWrkofYmd
		       ,6
		      );
		 localMs10frptDkeyWrkofYmdCounter = shareString.getSerializedField().getModifiedCounter();
		return  ms10frptDkeyWrkofYmd;
    }

   protected long checkMs10frptDkeyWrkofYmdMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMs10frptDkeyWrkofYmd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMs10frptDkeyWrkofYmd() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMs10frptDkeyWrkofYmd
			                 ,MS_10FRPT_DKEY_WRKOF_YMD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ms10frptDkeyWrkofYmd", beginMs10frptDkeyWrkofYmd,MS_10FRPT_DKEY_WRKOF_YMD_LEN);
    }
   	}
     int localMs10frptDkeyCutoffHhmmCounter = -1;
     public boolean isMs10frptDkeyCutoffHhmmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptDkeyCutoffHhmmCounter != sharedCounter;
         localMs10frptDkeyCutoffHhmmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ms10frptDkeyCutoffHhmm
	 *	@return ms10frptDkeyCutoffHhmm
	 */
	public char[]  getMs10frptDkeyCutoffHhmmString() {
	     return getCharArray(beginMs10frptDkeyCutoffHhmm,MS_10FRPT_DKEY_CUTOFF_HHMM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ms10frptDkeyCutoffHhmmIsNumeric() {
	    return isNumeric(beginMs10frptDkeyCutoffHhmm
	                    ,beginMs10frptDkeyCutoffHhmm + MS_10FRPT_DKEY_CUTOFF_HHMM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MS_10FRPT_DKEY_CUTOFF_HHMM_LEN = 4;
  	/**
	 * serializeMs10frptDkeyCutoffHhmm
	 */
	protected void serializeMs10frptDkeyCutoffHhmm(int ms10frptDkeyCutoffHhmm) {
		 putNumber(beginMs10frptDkeyCutoffHhmm,ms10frptDkeyCutoffHhmm,MS_10FRPT_DKEY_CUTOFF_HHMM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMs10frptDkeyCutoffHhmmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMs10frptDkeyCutoffHhmm
	 */
   	protected  int serializeMs10frptDkeyCutoffHhmm(char[] value) {
	    int  ms10frptDkeyCutoffHhmm;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ms10frptDkeyCutoffHhmm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginMs10frptDkeyCutoffHhmm
		       ,4
		      );
		 localMs10frptDkeyCutoffHhmmCounter = shareString.getSerializedField().getModifiedCounter();
		return  ms10frptDkeyCutoffHhmm;
    }

   protected int checkMs10frptDkeyCutoffHhmmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMs10frptDkeyCutoffHhmm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMs10frptDkeyCutoffHhmm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMs10frptDkeyCutoffHhmm
			                 ,MS_10FRPT_DKEY_CUTOFF_HHMM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ms10frptDkeyCutoffHhmm", beginMs10frptDkeyCutoffHhmm,MS_10FRPT_DKEY_CUTOFF_HHMM_LEN);
    }
   	}
     int localMs10frptDkeyLnSeqnoCounter = -1;
     public boolean isMs10frptDkeyLnSeqnoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptDkeyLnSeqnoCounter != sharedCounter;
         localMs10frptDkeyLnSeqnoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ms10frptDkeyLnSeqno
	 *	@return ms10frptDkeyLnSeqno
	 */
	public char[]  getMs10frptDkeyLnSeqnoString() {
	     return getCharArray(beginMs10frptDkeyLnSeqno,MS_10FRPT_DKEY_LN_SEQNO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ms10frptDkeyLnSeqnoIsNumeric() {
	    return isNumeric(beginMs10frptDkeyLnSeqno
	                    ,beginMs10frptDkeyLnSeqno + MS_10FRPT_DKEY_LN_SEQNO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MS_10FRPT_DKEY_LN_SEQNO_LEN = 12;
  	/**
	 * serializeMs10frptDkeyLnSeqno
	 */
	protected void serializeMs10frptDkeyLnSeqno(long ms10frptDkeyLnSeqno) {
		 putNumber(beginMs10frptDkeyLnSeqno,ms10frptDkeyLnSeqno,MS_10FRPT_DKEY_LN_SEQNO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMs10frptDkeyLnSeqnoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMs10frptDkeyLnSeqno
	 */
   	protected  long serializeMs10frptDkeyLnSeqno(char[] value) {
	    long  ms10frptDkeyLnSeqno;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ms10frptDkeyLnSeqno = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginMs10frptDkeyLnSeqno
		       ,12
		      );
		 localMs10frptDkeyLnSeqnoCounter = shareString.getSerializedField().getModifiedCounter();
		return  ms10frptDkeyLnSeqno;
    }

   protected long checkMs10frptDkeyLnSeqnoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMs10frptDkeyLnSeqno is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMs10frptDkeyLnSeqno() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMs10frptDkeyLnSeqno
			                 ,MS_10FRPT_DKEY_LN_SEQNO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ms10frptDkeyLnSeqno", beginMs10frptDkeyLnSeqno,MS_10FRPT_DKEY_LN_SEQNO_LEN);
    }
   	}
     int localMs10frptInhProcFlagCounter = -1;
     public boolean isMs10frptInhProcFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptInhProcFlagCounter != sharedCounter;
         localMs10frptInhProcFlagCounter = sharedCounter; return hasModified;
     }
	protected static final int MS_10FRPT_INH_PROC_FLAG_LEN = 1;
	/**
	 * 	serialize this Ms10frptInhProcFlag
	 */
   protected void serializeMs10frptInhProcFlag(char[] ms10frptInhProcFlag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ms10frptInhProcFlag,0,getStringValue(),beginMs10frptInhProcFlag,MS_10FRPT_INH_PROC_FLAG_LEN);
       localMs10frptInhProcFlagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMs10frptInhProcFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMs10frptInhProcFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMs10frptInhProcFlag() {	 
   		return (substring(getStringValue(),beginMs10frptInhProcFlag,beginMs10frptInhProcFlag + MS_10FRPT_INH_PROC_FLAG_LEN));
   	}




}
  

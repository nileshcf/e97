package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class Ms10frptHeaderRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ms10frptHeaderRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ms10frptHeaderRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MS_10FRPT_HEADER_REC_LENGTH = 270;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMs10frptHdrRecType;
            protected  int beginMs10frptHdrEndpt;
            protected  int beginMs10frptHdrEntIca;
            protected  int beginMs10frptHdrProc;
            protected  int beginMs10frptHdrHier;
            protected  int beginMs10frptHdrRptId;
            protected  int beginMs10frptHdrWrkofYmd;
            protected  int beginMs10frptHdrCutoffHhmm;
            protected  int beginMs10frptHdrLineSeqN0;
            protected  int beginMs10frptHdrProc2;
            protected  int beginMs10frptFill1;
            protected  int beginMs10frptHdrSysDte;
            protected  int beginMs10frptHdrSysTime;
            protected  int beginMs10frptFill2;
            protected  int beginMs10frptHdrMbrIca;
            protected  int beginMs10frptHdrEservFlag;
            protected  int beginMs10frptFill3;
	
	/**
	* Constructor for Ms10frptHeaderRecSerialized
	**/
    public Ms10frptHeaderRecSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ms10frptHeaderRecSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ms10frptHeaderRecSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ms10frptHeaderRecSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ms10frptHeaderRecSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ms10frptHeaderRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MS_10FRPT_HEADER_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMs10frptHdrRecType = getStartOffset() + 0;	// set offset for serialization
  
             beginMs10frptHdrEndpt = getStartOffset() + 2;	// set offset for serialization
  
             beginMs10frptHdrEntIca = getStartOffset() + 9;	// set offset for serialization
  
             beginMs10frptHdrProc = getStartOffset() + 15;	// set offset for serialization
  
             beginMs10frptHdrHier = getStartOffset() + 25;	// set offset for serialization
  
             beginMs10frptHdrRptId = getStartOffset() + 29;	// set offset for serialization
  
             beginMs10frptHdrWrkofYmd = getStartOffset() + 41;	// set offset for serialization
  
             beginMs10frptHdrCutoffHhmm = getStartOffset() + 47;	// set offset for serialization
  
             beginMs10frptHdrLineSeqN0 = getStartOffset() + 51;	// set offset for serialization
  
             beginMs10frptHdrProc2 = getStartOffset() + 63;	// set offset for serialization
  
             beginMs10frptFill1 = getStartOffset() + 73;	// set offset for serialization
  
             beginMs10frptHdrSysDte = getStartOffset() + 93;	// set offset for serialization
  
             beginMs10frptHdrSysTime = getStartOffset() + 99;	// set offset for serialization
  
             beginMs10frptFill2 = getStartOffset() + 105;	// set offset for serialization
  
             beginMs10frptHdrMbrIca = getStartOffset() + 119;	// set offset for serialization
  
             beginMs10frptHdrEservFlag = getStartOffset() + 125;	// set offset for serialization
  
             beginMs10frptFill3 = getStartOffset() + 126;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMs10frptHdrRecTypeCounter = -1;
     public boolean isMs10frptHdrRecTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptHdrRecTypeCounter != sharedCounter;
         localMs10frptHdrRecTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int MS_10FRPT_HDR_REC_TYPE_LEN = 2;
	/**
	 * 	serialize this Ms10frptHdrRecType
	 */
   protected void serializeMs10frptHdrRecType(char[] ms10frptHdrRecType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ms10frptHdrRecType,0,getStringValue(),beginMs10frptHdrRecType,MS_10FRPT_HDR_REC_TYPE_LEN);
       localMs10frptHdrRecTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMs10frptHdrRecTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMs10frptHdrRecType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMs10frptHdrRecType() {	 
   		return (substring(getStringValue(),beginMs10frptHdrRecType,beginMs10frptHdrRecType + MS_10FRPT_HDR_REC_TYPE_LEN));
   	}
     int localMs10frptHdrEndptCounter = -1;
     public boolean isMs10frptHdrEndptModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptHdrEndptCounter != sharedCounter;
         localMs10frptHdrEndptCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ms10frptHdrEndpt
	 *	@return ms10frptHdrEndpt
	 */
	public char[]  getMs10frptHdrEndptString() {
	     return getCharArray(beginMs10frptHdrEndpt,MS_10FRPT_HDR_ENDPT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ms10frptHdrEndptIsNumeric() {
	    return isNumeric(beginMs10frptHdrEndpt
	                    ,beginMs10frptHdrEndpt + MS_10FRPT_HDR_ENDPT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MS_10FRPT_HDR_ENDPT_LEN = 7;
  	/**
	 * serializeMs10frptHdrEndpt
	 */
	protected void serializeMs10frptHdrEndpt(long ms10frptHdrEndpt) {
		 putNumber(beginMs10frptHdrEndpt,ms10frptHdrEndpt,MS_10FRPT_HDR_ENDPT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMs10frptHdrEndptCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMs10frptHdrEndpt
	 */
   	protected  long serializeMs10frptHdrEndpt(char[] value) {
	    long  ms10frptHdrEndpt;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ms10frptHdrEndpt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginMs10frptHdrEndpt
		       ,7
		      );
		 localMs10frptHdrEndptCounter = shareString.getSerializedField().getModifiedCounter();
		return  ms10frptHdrEndpt;
    }

   protected long checkMs10frptHdrEndptMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMs10frptHdrEndpt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMs10frptHdrEndpt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMs10frptHdrEndpt
			                 ,MS_10FRPT_HDR_ENDPT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ms10frptHdrEndpt", beginMs10frptHdrEndpt,MS_10FRPT_HDR_ENDPT_LEN);
    }
   	}
     int localMs10frptHdrEntIcaCounter = -1;
     public boolean isMs10frptHdrEntIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptHdrEntIcaCounter != sharedCounter;
         localMs10frptHdrEntIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ms10frptHdrEntIca
	 *	@return ms10frptHdrEntIca
	 */
	public char[]  getMs10frptHdrEntIcaString() {
	     return getCharArray(beginMs10frptHdrEntIca,MS_10FRPT_HDR_ENT_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ms10frptHdrEntIcaIsNumeric() {
	    return isNumeric(beginMs10frptHdrEntIca
	                    ,beginMs10frptHdrEntIca + MS_10FRPT_HDR_ENT_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MS_10FRPT_HDR_ENT_ICA_LEN = 6;
  	/**
	 * serializeMs10frptHdrEntIca
	 */
	protected void serializeMs10frptHdrEntIca(long ms10frptHdrEntIca) {
		 putNumber(beginMs10frptHdrEntIca,ms10frptHdrEntIca,MS_10FRPT_HDR_ENT_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMs10frptHdrEntIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMs10frptHdrEntIca
	 */
   	protected  long serializeMs10frptHdrEntIca(char[] value) {
	    long  ms10frptHdrEntIca;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ms10frptHdrEntIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMs10frptHdrEntIca
		       ,6
		      );
		 localMs10frptHdrEntIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  ms10frptHdrEntIca;
    }

   protected long checkMs10frptHdrEntIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMs10frptHdrEntIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMs10frptHdrEntIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMs10frptHdrEntIca
			                 ,MS_10FRPT_HDR_ENT_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ms10frptHdrEntIca", beginMs10frptHdrEntIca,MS_10FRPT_HDR_ENT_ICA_LEN);
    }
   	}
     int localMs10frptHdrProcCounter = -1;
     public boolean isMs10frptHdrProcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptHdrProcCounter != sharedCounter;
         localMs10frptHdrProcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ms10frptHdrProc
	 *	@return ms10frptHdrProc
	 */
	public char[]  getMs10frptHdrProcString() {
	     return getCharArray(beginMs10frptHdrProc,MS_10FRPT_HDR_PROC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ms10frptHdrProcIsNumeric() {
	    return isNumeric(beginMs10frptHdrProc
	                    ,beginMs10frptHdrProc + MS_10FRPT_HDR_PROC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MS_10FRPT_HDR_PROC_LEN = 10;
  	/**
	 * serializeMs10frptHdrProc
	 */
	protected void serializeMs10frptHdrProc(long ms10frptHdrProc) {
		 putNumber(beginMs10frptHdrProc,ms10frptHdrProc,MS_10FRPT_HDR_PROC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMs10frptHdrProcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMs10frptHdrProc
	 */
   	protected  long serializeMs10frptHdrProc(char[] value) {
	    long  ms10frptHdrProc;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ms10frptHdrProc = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginMs10frptHdrProc
		       ,10
		      );
		 localMs10frptHdrProcCounter = shareString.getSerializedField().getModifiedCounter();
		return  ms10frptHdrProc;
    }

   protected long checkMs10frptHdrProcMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMs10frptHdrProc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMs10frptHdrProc() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMs10frptHdrProc
			                 ,MS_10FRPT_HDR_PROC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ms10frptHdrProc", beginMs10frptHdrProc,MS_10FRPT_HDR_PROC_LEN);
    }
   	}
     int localMs10frptHdrHierCounter = -1;
     public boolean isMs10frptHdrHierModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptHdrHierCounter != sharedCounter;
         localMs10frptHdrHierCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ms10frptHdrHier
	 *	@return ms10frptHdrHier
	 */
	public char[]  getMs10frptHdrHierString() {
	     return getCharArray(beginMs10frptHdrHier,MS_10FRPT_HDR_HIER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ms10frptHdrHierIsNumeric() {
	    return isNumeric(beginMs10frptHdrHier
	                    ,beginMs10frptHdrHier + MS_10FRPT_HDR_HIER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MS_10FRPT_HDR_HIER_LEN = 4;
  	/**
	 * serializeMs10frptHdrHier
	 */
	protected void serializeMs10frptHdrHier(int ms10frptHdrHier) {
		 putNumber(beginMs10frptHdrHier,ms10frptHdrHier,MS_10FRPT_HDR_HIER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMs10frptHdrHierCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMs10frptHdrHier
	 */
   	protected  int serializeMs10frptHdrHier(char[] value) {
	    int  ms10frptHdrHier;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ms10frptHdrHier = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginMs10frptHdrHier
		       ,4
		      );
		 localMs10frptHdrHierCounter = shareString.getSerializedField().getModifiedCounter();
		return  ms10frptHdrHier;
    }

   protected int checkMs10frptHdrHierMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMs10frptHdrHier is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMs10frptHdrHier() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMs10frptHdrHier
			                 ,MS_10FRPT_HDR_HIER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ms10frptHdrHier", beginMs10frptHdrHier,MS_10FRPT_HDR_HIER_LEN);
    }
   	}
     int localMs10frptHdrRptIdCounter = -1;
     public boolean isMs10frptHdrRptIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptHdrRptIdCounter != sharedCounter;
         localMs10frptHdrRptIdCounter = sharedCounter; return hasModified;
     }
	protected static final int MS_10FRPT_HDR_RPT_ID_LEN = 12;
	/**
	 * 	serialize this Ms10frptHdrRptId
	 */
   protected void serializeMs10frptHdrRptId(char[] ms10frptHdrRptId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ms10frptHdrRptId,0,getStringValue(),beginMs10frptHdrRptId,MS_10FRPT_HDR_RPT_ID_LEN);
       localMs10frptHdrRptIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMs10frptHdrRptIdConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshMs10frptHdrRptId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMs10frptHdrRptId() {	 
   		return (substring(getStringValue(),beginMs10frptHdrRptId,beginMs10frptHdrRptId + MS_10FRPT_HDR_RPT_ID_LEN));
   	}
     int localMs10frptHdrWrkofYmdCounter = -1;
     public boolean isMs10frptHdrWrkofYmdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptHdrWrkofYmdCounter != sharedCounter;
         localMs10frptHdrWrkofYmdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ms10frptHdrWrkofYmd
	 *	@return ms10frptHdrWrkofYmd
	 */
	public char[]  getMs10frptHdrWrkofYmdString() {
	     return getCharArray(beginMs10frptHdrWrkofYmd,MS_10FRPT_HDR_WRKOF_YMD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ms10frptHdrWrkofYmdIsNumeric() {
	    return isNumeric(beginMs10frptHdrWrkofYmd
	                    ,beginMs10frptHdrWrkofYmd + MS_10FRPT_HDR_WRKOF_YMD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MS_10FRPT_HDR_WRKOF_YMD_LEN = 6;
  	/**
	 * serializeMs10frptHdrWrkofYmd
	 */
	protected void serializeMs10frptHdrWrkofYmd(long ms10frptHdrWrkofYmd) {
		 putNumber(beginMs10frptHdrWrkofYmd,ms10frptHdrWrkofYmd,MS_10FRPT_HDR_WRKOF_YMD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMs10frptHdrWrkofYmdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMs10frptHdrWrkofYmd
	 */
   	protected  long serializeMs10frptHdrWrkofYmd(char[] value) {
	    long  ms10frptHdrWrkofYmd;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ms10frptHdrWrkofYmd = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMs10frptHdrWrkofYmd
		       ,6
		      );
		 localMs10frptHdrWrkofYmdCounter = shareString.getSerializedField().getModifiedCounter();
		return  ms10frptHdrWrkofYmd;
    }

   protected long checkMs10frptHdrWrkofYmdMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMs10frptHdrWrkofYmd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMs10frptHdrWrkofYmd() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMs10frptHdrWrkofYmd
			                 ,MS_10FRPT_HDR_WRKOF_YMD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ms10frptHdrWrkofYmd", beginMs10frptHdrWrkofYmd,MS_10FRPT_HDR_WRKOF_YMD_LEN);
    }
   	}
     int localMs10frptHdrCutoffHhmmCounter = -1;
     public boolean isMs10frptHdrCutoffHhmmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptHdrCutoffHhmmCounter != sharedCounter;
         localMs10frptHdrCutoffHhmmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ms10frptHdrCutoffHhmm
	 *	@return ms10frptHdrCutoffHhmm
	 */
	public char[]  getMs10frptHdrCutoffHhmmString() {
	     return getCharArray(beginMs10frptHdrCutoffHhmm,MS_10FRPT_HDR_CUTOFF_HHMM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ms10frptHdrCutoffHhmmIsNumeric() {
	    return isNumeric(beginMs10frptHdrCutoffHhmm
	                    ,beginMs10frptHdrCutoffHhmm + MS_10FRPT_HDR_CUTOFF_HHMM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MS_10FRPT_HDR_CUTOFF_HHMM_LEN = 4;
  	/**
	 * serializeMs10frptHdrCutoffHhmm
	 */
	protected void serializeMs10frptHdrCutoffHhmm(int ms10frptHdrCutoffHhmm) {
		 putNumber(beginMs10frptHdrCutoffHhmm,ms10frptHdrCutoffHhmm,MS_10FRPT_HDR_CUTOFF_HHMM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMs10frptHdrCutoffHhmmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMs10frptHdrCutoffHhmm
	 */
   	protected  int serializeMs10frptHdrCutoffHhmm(char[] value) {
	    int  ms10frptHdrCutoffHhmm;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ms10frptHdrCutoffHhmm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginMs10frptHdrCutoffHhmm
		       ,4
		      );
		 localMs10frptHdrCutoffHhmmCounter = shareString.getSerializedField().getModifiedCounter();
		return  ms10frptHdrCutoffHhmm;
    }

   protected int checkMs10frptHdrCutoffHhmmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMs10frptHdrCutoffHhmm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMs10frptHdrCutoffHhmm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMs10frptHdrCutoffHhmm
			                 ,MS_10FRPT_HDR_CUTOFF_HHMM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ms10frptHdrCutoffHhmm", beginMs10frptHdrCutoffHhmm,MS_10FRPT_HDR_CUTOFF_HHMM_LEN);
    }
   	}
     int localMs10frptHdrLineSeqN0Counter = -1;
     public boolean isMs10frptHdrLineSeqN0Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptHdrLineSeqN0Counter != sharedCounter;
         localMs10frptHdrLineSeqN0Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ms10frptHdrLineSeqN0
	 *	@return ms10frptHdrLineSeqN0
	 */
	public char[]  getMs10frptHdrLineSeqN0String() {
	     return getCharArray(beginMs10frptHdrLineSeqN0,MS_10FRPT_HDR_LINE_SEQ_N_0_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ms10frptHdrLineSeqN0IsNumeric() {
	    return isNumeric(beginMs10frptHdrLineSeqN0
	                    ,beginMs10frptHdrLineSeqN0 + MS_10FRPT_HDR_LINE_SEQ_N_0_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MS_10FRPT_HDR_LINE_SEQ_N_0_LEN = 12;
  	/**
	 * serializeMs10frptHdrLineSeqN0
	 */
	protected void serializeMs10frptHdrLineSeqN0(long ms10frptHdrLineSeqN0) {
		 putNumber(beginMs10frptHdrLineSeqN0,ms10frptHdrLineSeqN0,MS_10FRPT_HDR_LINE_SEQ_N_0_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMs10frptHdrLineSeqN0Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMs10frptHdrLineSeqN0
	 */
   	protected  long serializeMs10frptHdrLineSeqN0(char[] value) {
	    long  ms10frptHdrLineSeqN0;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ms10frptHdrLineSeqN0 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginMs10frptHdrLineSeqN0
		       ,12
		      );
		 localMs10frptHdrLineSeqN0Counter = shareString.getSerializedField().getModifiedCounter();
		return  ms10frptHdrLineSeqN0;
    }

   protected long checkMs10frptHdrLineSeqN0MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMs10frptHdrLineSeqN0 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMs10frptHdrLineSeqN0() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMs10frptHdrLineSeqN0
			                 ,MS_10FRPT_HDR_LINE_SEQ_N_0_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ms10frptHdrLineSeqN0", beginMs10frptHdrLineSeqN0,MS_10FRPT_HDR_LINE_SEQ_N_0_LEN);
    }
   	}
     int localMs10frptHdrProc2Counter = -1;
     public boolean isMs10frptHdrProc2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptHdrProc2Counter != sharedCounter;
         localMs10frptHdrProc2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ms10frptHdrProc2
	 *	@return ms10frptHdrProc2
	 */
	public char[]  getMs10frptHdrProc2String() {
	     return getCharArray(beginMs10frptHdrProc2,MS_10FRPT_HDR_PROC_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ms10frptHdrProc2IsNumeric() {
	    return isNumeric(beginMs10frptHdrProc2
	                    ,beginMs10frptHdrProc2 + MS_10FRPT_HDR_PROC_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MS_10FRPT_HDR_PROC_2_LEN = 10;
  	/**
	 * serializeMs10frptHdrProc2
	 */
	protected void serializeMs10frptHdrProc2(long ms10frptHdrProc2) {
		 putNumber(beginMs10frptHdrProc2,ms10frptHdrProc2,MS_10FRPT_HDR_PROC_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMs10frptHdrProc2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMs10frptHdrProc2
	 */
   	protected  long serializeMs10frptHdrProc2(char[] value) {
	    long  ms10frptHdrProc2;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ms10frptHdrProc2 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginMs10frptHdrProc2
		       ,10
		      );
		 localMs10frptHdrProc2Counter = shareString.getSerializedField().getModifiedCounter();
		return  ms10frptHdrProc2;
    }

   protected long checkMs10frptHdrProc2MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMs10frptHdrProc2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMs10frptHdrProc2() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMs10frptHdrProc2
			                 ,MS_10FRPT_HDR_PROC_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ms10frptHdrProc2", beginMs10frptHdrProc2,MS_10FRPT_HDR_PROC_2_LEN);
    }
   	}
     int localMs10frptFill1Counter = -1;
     public boolean isMs10frptFill1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptFill1Counter != sharedCounter;
         localMs10frptFill1Counter = sharedCounter; return hasModified;
     }
	protected static final int MS_10FRPT_FILL_1_LEN = 20;
	/**
	 * 	serialize this Ms10frptFill1
	 */
   protected void serializeMs10frptFill1(char[] ms10frptFill1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ms10frptFill1,0,getStringValue(),beginMs10frptFill1,MS_10FRPT_FILL_1_LEN);
       localMs10frptFill1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMs10frptFill1Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshMs10frptFill1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMs10frptFill1() {	 
   		return (substring(getStringValue(),beginMs10frptFill1,beginMs10frptFill1 + MS_10FRPT_FILL_1_LEN));
   	}
     int localMs10frptHdrSysDteCounter = -1;
     public boolean isMs10frptHdrSysDteModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptHdrSysDteCounter != sharedCounter;
         localMs10frptHdrSysDteCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ms10frptHdrSysDte
	 *	@return ms10frptHdrSysDte
	 */
	public char[]  getMs10frptHdrSysDteString() {
	     return getCharArray(beginMs10frptHdrSysDte,MS_10FRPT_HDR_SYS_DTE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ms10frptHdrSysDteIsNumeric() {
	    return isNumeric(beginMs10frptHdrSysDte
	                    ,beginMs10frptHdrSysDte + MS_10FRPT_HDR_SYS_DTE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MS_10FRPT_HDR_SYS_DTE_LEN = 6;
  	/**
	 * serializeMs10frptHdrSysDte
	 */
	protected void serializeMs10frptHdrSysDte(long ms10frptHdrSysDte) {
		 putNumber(beginMs10frptHdrSysDte,ms10frptHdrSysDte,MS_10FRPT_HDR_SYS_DTE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMs10frptHdrSysDteCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMs10frptHdrSysDte
	 */
   	protected  long serializeMs10frptHdrSysDte(char[] value) {
	    long  ms10frptHdrSysDte;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ms10frptHdrSysDte = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMs10frptHdrSysDte
		       ,6
		      );
		 localMs10frptHdrSysDteCounter = shareString.getSerializedField().getModifiedCounter();
		return  ms10frptHdrSysDte;
    }

   protected long checkMs10frptHdrSysDteMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMs10frptHdrSysDte is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMs10frptHdrSysDte() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMs10frptHdrSysDte
			                 ,MS_10FRPT_HDR_SYS_DTE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ms10frptHdrSysDte", beginMs10frptHdrSysDte,MS_10FRPT_HDR_SYS_DTE_LEN);
    }
   	}
     int localMs10frptHdrSysTimeCounter = -1;
     public boolean isMs10frptHdrSysTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptHdrSysTimeCounter != sharedCounter;
         localMs10frptHdrSysTimeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ms10frptHdrSysTime
	 *	@return ms10frptHdrSysTime
	 */
	public char[]  getMs10frptHdrSysTimeString() {
	     return getCharArray(beginMs10frptHdrSysTime,MS_10FRPT_HDR_SYS_TIME_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ms10frptHdrSysTimeIsNumeric() {
	    return isNumeric(beginMs10frptHdrSysTime
	                    ,beginMs10frptHdrSysTime + MS_10FRPT_HDR_SYS_TIME_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MS_10FRPT_HDR_SYS_TIME_LEN = 6;
  	/**
	 * serializeMs10frptHdrSysTime
	 */
	protected void serializeMs10frptHdrSysTime(long ms10frptHdrSysTime) {
		 putNumber(beginMs10frptHdrSysTime,ms10frptHdrSysTime,MS_10FRPT_HDR_SYS_TIME_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMs10frptHdrSysTimeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMs10frptHdrSysTime
	 */
   	protected  long serializeMs10frptHdrSysTime(char[] value) {
	    long  ms10frptHdrSysTime;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ms10frptHdrSysTime = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMs10frptHdrSysTime
		       ,6
		      );
		 localMs10frptHdrSysTimeCounter = shareString.getSerializedField().getModifiedCounter();
		return  ms10frptHdrSysTime;
    }

   protected long checkMs10frptHdrSysTimeMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMs10frptHdrSysTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMs10frptHdrSysTime() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMs10frptHdrSysTime
			                 ,MS_10FRPT_HDR_SYS_TIME_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ms10frptHdrSysTime", beginMs10frptHdrSysTime,MS_10FRPT_HDR_SYS_TIME_LEN);
    }
   	}
     int localMs10frptFill2Counter = -1;
     public boolean isMs10frptFill2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptFill2Counter != sharedCounter;
         localMs10frptFill2Counter = sharedCounter; return hasModified;
     }
	protected static final int MS_10FRPT_FILL_2_LEN = 14;
	/**
	 * 	serialize this Ms10frptFill2
	 */
   protected void serializeMs10frptFill2(char[] ms10frptFill2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ms10frptFill2,0,getStringValue(),beginMs10frptFill2,MS_10FRPT_FILL_2_LEN);
       localMs10frptFill2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMs10frptFill2Constraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshMs10frptFill2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMs10frptFill2() {	 
   		return (substring(getStringValue(),beginMs10frptFill2,beginMs10frptFill2 + MS_10FRPT_FILL_2_LEN));
   	}
     int localMs10frptHdrMbrIcaCounter = -1;
     public boolean isMs10frptHdrMbrIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptHdrMbrIcaCounter != sharedCounter;
         localMs10frptHdrMbrIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ms10frptHdrMbrIca
	 *	@return ms10frptHdrMbrIca
	 */
	public char[]  getMs10frptHdrMbrIcaString() {
	     return getCharArray(beginMs10frptHdrMbrIca,MS_10FRPT_HDR_MBR_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ms10frptHdrMbrIcaIsNumeric() {
	    return isNumeric(beginMs10frptHdrMbrIca
	                    ,beginMs10frptHdrMbrIca + MS_10FRPT_HDR_MBR_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MS_10FRPT_HDR_MBR_ICA_LEN = 6;
  	/**
	 * serializeMs10frptHdrMbrIca
	 */
	protected void serializeMs10frptHdrMbrIca(long ms10frptHdrMbrIca) {
		 putNumber(beginMs10frptHdrMbrIca,ms10frptHdrMbrIca,MS_10FRPT_HDR_MBR_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMs10frptHdrMbrIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMs10frptHdrMbrIca
	 */
   	protected  long serializeMs10frptHdrMbrIca(char[] value) {
	    long  ms10frptHdrMbrIca;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ms10frptHdrMbrIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMs10frptHdrMbrIca
		       ,6
		      );
		 localMs10frptHdrMbrIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  ms10frptHdrMbrIca;
    }

   protected long checkMs10frptHdrMbrIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMs10frptHdrMbrIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMs10frptHdrMbrIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMs10frptHdrMbrIca
			                 ,MS_10FRPT_HDR_MBR_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ms10frptHdrMbrIca", beginMs10frptHdrMbrIca,MS_10FRPT_HDR_MBR_ICA_LEN);
    }
   	}
     int localMs10frptHdrEservFlagCounter = -1;
     public boolean isMs10frptHdrEservFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptHdrEservFlagCounter != sharedCounter;
         localMs10frptHdrEservFlagCounter = sharedCounter; return hasModified;
     }
	protected static final int MS_10FRPT_HDR_ESERV_FLAG_LEN = 1;
	/**
	 * 	serialize this Ms10frptHdrEservFlag
	 */
   protected void serializeMs10frptHdrEservFlag(char[] ms10frptHdrEservFlag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ms10frptHdrEservFlag,0,getStringValue(),beginMs10frptHdrEservFlag,MS_10FRPT_HDR_ESERV_FLAG_LEN);
       localMs10frptHdrEservFlagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMs10frptHdrEservFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMs10frptHdrEservFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMs10frptHdrEservFlag() {	 
   		return (substring(getStringValue(),beginMs10frptHdrEservFlag,beginMs10frptHdrEservFlag + MS_10FRPT_HDR_ESERV_FLAG_LEN));
   	}
     int localMs10frptFill3Counter = -1;
     public boolean isMs10frptFill3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptFill3Counter != sharedCounter;
         localMs10frptFill3Counter = sharedCounter; return hasModified;
     }
	protected static final int MS_10FRPT_FILL_3_LEN = 144;
	/**
	 * 	serialize this Ms10frptFill3
	 */
   protected void serializeMs10frptFill3(char[] ms10frptFill3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ms10frptFill3,0,getStringValue(),beginMs10frptFill3,MS_10FRPT_FILL_3_LEN);
       localMs10frptFill3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMs10frptFill3Constraints(char[] value) {
   			return super.checkConstraints(value , 144 ,false, false);
   }
    /**
	 *	refreshMs10frptFill3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMs10frptFill3() {	 
   		return (substring(getStringValue(),beginMs10frptFill3,beginMs10frptFill3 + MS_10FRPT_FILL_3_LEN));
   	}




}
  

package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class Ms10frptMbrDetailRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ms10frptMbrDetailRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ms10frptMbrDetailRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MS_10FRPT_MBR_DETAIL_REC_LENGTH = 270;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMs10frptDetEsrvSarData;
            protected  int beginMs10frptFill4;
            protected  int beginMs10frptDetSysDte;
            protected  int beginMs10frptDetSysTime;
            protected  int beginMs10frptFill5;
            protected  int beginMs10frptDetMemberIca;
            protected  int beginMs10frptDetEservFlag;
            protected  int beginMs10frptFill6;
            protected  int beginMs10frptDetEarlyDlvry;
            protected  int beginMs10frptRptDetail;
	
	/**
	* Constructor for Ms10frptMbrDetailRecSerialized
	**/
    public Ms10frptMbrDetailRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ms10frptMbrDetailRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MS_10FRPT_MBR_DETAIL_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginMs10frptDetEsrvSarData = getStartOffset() + 0;	// set offset for serialization
  
             beginMs10frptFill4 = getStartOffset() + 74;	// set offset for serialization
  
             beginMs10frptDetSysDte = getStartOffset() + 93;	// set offset for serialization
  
             beginMs10frptDetSysTime = getStartOffset() + 99;	// set offset for serialization
  
             beginMs10frptFill5 = getStartOffset() + 105;	// set offset for serialization
  
             beginMs10frptDetMemberIca = getStartOffset() + 119;	// set offset for serialization
  
             beginMs10frptDetEservFlag = getStartOffset() + 125;	// set offset for serialization
  
             beginMs10frptFill6 = getStartOffset() + 126;	// set offset for serialization
  
             beginMs10frptDetEarlyDlvry = getStartOffset() + 136;	// set offset for serialization
  
             beginMs10frptRptDetail = getStartOffset() + 137;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMs10frptDetEsrvSarDataCounter = -1;
     public boolean isMs10frptDetEsrvSarDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptDetEsrvSarDataCounter != sharedCounter;
         localMs10frptDetEsrvSarDataCounter = sharedCounter; return hasModified;
     }
	protected static final int MS_10FRPT_DET_ESRV_SAR_DATA_LEN = 74;
	/**
	 * 	serialize this Ms10frptDetEsrvSarData
	 */
   protected void serializeMs10frptDetEsrvSarData(char[] ms10frptDetEsrvSarData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ms10frptDetEsrvSarData,0,getStringValue(),beginMs10frptDetEsrvSarData,MS_10FRPT_DET_ESRV_SAR_DATA_LEN);
       localMs10frptDetEsrvSarDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMs10frptDetEsrvSarDataConstraints(char[] value) {
   			return super.checkConstraints(value , 74 ,false, false);
   }
    /**
	 *	refreshMs10frptDetEsrvSarData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMs10frptDetEsrvSarData() {	 
   		return (substring(getStringValue(),beginMs10frptDetEsrvSarData,beginMs10frptDetEsrvSarData + MS_10FRPT_DET_ESRV_SAR_DATA_LEN));
   	}
     int localMs10frptFill4Counter = -1;
     public boolean isMs10frptFill4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptFill4Counter != sharedCounter;
         localMs10frptFill4Counter = sharedCounter; return hasModified;
     }
	protected static final int MS_10FRPT_FILL_4_LEN = 19;
	/**
	 * 	serialize this Ms10frptFill4
	 */
   protected void serializeMs10frptFill4(char[] ms10frptFill4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ms10frptFill4,0,getStringValue(),beginMs10frptFill4,MS_10FRPT_FILL_4_LEN);
       localMs10frptFill4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMs10frptFill4Constraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshMs10frptFill4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMs10frptFill4() {	 
   		return (substring(getStringValue(),beginMs10frptFill4,beginMs10frptFill4 + MS_10FRPT_FILL_4_LEN));
   	}
     int localMs10frptDetSysDteCounter = -1;
     public boolean isMs10frptDetSysDteModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptDetSysDteCounter != sharedCounter;
         localMs10frptDetSysDteCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ms10frptDetSysDte
	 *	@return ms10frptDetSysDte
	 */
	public char[]  getMs10frptDetSysDteString() {
	     return getCharArray(beginMs10frptDetSysDte,MS_10FRPT_DET_SYS_DTE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ms10frptDetSysDteIsNumeric() {
	    return isNumeric(beginMs10frptDetSysDte
	                    ,beginMs10frptDetSysDte + MS_10FRPT_DET_SYS_DTE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MS_10FRPT_DET_SYS_DTE_LEN = 6;
  	/**
	 * serializeMs10frptDetSysDte
	 */
	protected void serializeMs10frptDetSysDte(long ms10frptDetSysDte) {
		 putNumber(beginMs10frptDetSysDte,ms10frptDetSysDte,MS_10FRPT_DET_SYS_DTE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMs10frptDetSysDteCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMs10frptDetSysDte
	 */
   	protected  long serializeMs10frptDetSysDte(char[] value) {
	    long  ms10frptDetSysDte;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ms10frptDetSysDte = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMs10frptDetSysDte
		       ,6
		      );
		 localMs10frptDetSysDteCounter = shareString.getSerializedField().getModifiedCounter();
		return  ms10frptDetSysDte;
    }

   protected long checkMs10frptDetSysDteMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMs10frptDetSysDte is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMs10frptDetSysDte() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMs10frptDetSysDte
			                 ,MS_10FRPT_DET_SYS_DTE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ms10frptDetSysDte", beginMs10frptDetSysDte,MS_10FRPT_DET_SYS_DTE_LEN);
    }
   	}
     int localMs10frptDetSysTimeCounter = -1;
     public boolean isMs10frptDetSysTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptDetSysTimeCounter != sharedCounter;
         localMs10frptDetSysTimeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ms10frptDetSysTime
	 *	@return ms10frptDetSysTime
	 */
	public char[]  getMs10frptDetSysTimeString() {
	     return getCharArray(beginMs10frptDetSysTime,MS_10FRPT_DET_SYS_TIME_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ms10frptDetSysTimeIsNumeric() {
	    return isNumeric(beginMs10frptDetSysTime
	                    ,beginMs10frptDetSysTime + MS_10FRPT_DET_SYS_TIME_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MS_10FRPT_DET_SYS_TIME_LEN = 6;
  	/**
	 * serializeMs10frptDetSysTime
	 */
	protected void serializeMs10frptDetSysTime(long ms10frptDetSysTime) {
		 putNumber(beginMs10frptDetSysTime,ms10frptDetSysTime,MS_10FRPT_DET_SYS_TIME_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMs10frptDetSysTimeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMs10frptDetSysTime
	 */
   	protected  long serializeMs10frptDetSysTime(char[] value) {
	    long  ms10frptDetSysTime;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ms10frptDetSysTime = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMs10frptDetSysTime
		       ,6
		      );
		 localMs10frptDetSysTimeCounter = shareString.getSerializedField().getModifiedCounter();
		return  ms10frptDetSysTime;
    }

   protected long checkMs10frptDetSysTimeMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMs10frptDetSysTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMs10frptDetSysTime() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMs10frptDetSysTime
			                 ,MS_10FRPT_DET_SYS_TIME_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ms10frptDetSysTime", beginMs10frptDetSysTime,MS_10FRPT_DET_SYS_TIME_LEN);
    }
   	}
     int localMs10frptFill5Counter = -1;
     public boolean isMs10frptFill5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptFill5Counter != sharedCounter;
         localMs10frptFill5Counter = sharedCounter; return hasModified;
     }
	protected static final int MS_10FRPT_FILL_5_LEN = 14;
	/**
	 * 	serialize this Ms10frptFill5
	 */
   protected void serializeMs10frptFill5(char[] ms10frptFill5) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ms10frptFill5,0,getStringValue(),beginMs10frptFill5,MS_10FRPT_FILL_5_LEN);
       localMs10frptFill5Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMs10frptFill5Constraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshMs10frptFill5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMs10frptFill5() {	 
   		return (substring(getStringValue(),beginMs10frptFill5,beginMs10frptFill5 + MS_10FRPT_FILL_5_LEN));
   	}
     int localMs10frptDetMemberIcaCounter = -1;
     public boolean isMs10frptDetMemberIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptDetMemberIcaCounter != sharedCounter;
         localMs10frptDetMemberIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ms10frptDetMemberIca
	 *	@return ms10frptDetMemberIca
	 */
	public char[]  getMs10frptDetMemberIcaString() {
	     return getCharArray(beginMs10frptDetMemberIca,MS_10FRPT_DET_MEMBER_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ms10frptDetMemberIcaIsNumeric() {
	    return isNumeric(beginMs10frptDetMemberIca
	                    ,beginMs10frptDetMemberIca + MS_10FRPT_DET_MEMBER_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MS_10FRPT_DET_MEMBER_ICA_LEN = 6;
  	/**
	 * serializeMs10frptDetMemberIca
	 */
	protected void serializeMs10frptDetMemberIca(long ms10frptDetMemberIca) {
		 putNumber(beginMs10frptDetMemberIca,ms10frptDetMemberIca,MS_10FRPT_DET_MEMBER_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMs10frptDetMemberIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMs10frptDetMemberIca
	 */
   	protected  long serializeMs10frptDetMemberIca(char[] value) {
	    long  ms10frptDetMemberIca;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ms10frptDetMemberIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMs10frptDetMemberIca
		       ,6
		      );
		 localMs10frptDetMemberIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  ms10frptDetMemberIca;
    }

   protected long checkMs10frptDetMemberIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMs10frptDetMemberIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMs10frptDetMemberIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMs10frptDetMemberIca
			                 ,MS_10FRPT_DET_MEMBER_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ms10frptDetMemberIca", beginMs10frptDetMemberIca,MS_10FRPT_DET_MEMBER_ICA_LEN);
    }
   	}
     int localMs10frptDetEservFlagCounter = -1;
     public boolean isMs10frptDetEservFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptDetEservFlagCounter != sharedCounter;
         localMs10frptDetEservFlagCounter = sharedCounter; return hasModified;
     }
	protected static final int MS_10FRPT_DET_ESERV_FLAG_LEN = 1;
	/**
	 * 	serialize this Ms10frptDetEservFlag
	 */
   protected void serializeMs10frptDetEservFlag(char[] ms10frptDetEservFlag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ms10frptDetEservFlag,0,getStringValue(),beginMs10frptDetEservFlag,MS_10FRPT_DET_ESERV_FLAG_LEN);
       localMs10frptDetEservFlagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMs10frptDetEservFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMs10frptDetEservFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMs10frptDetEservFlag() {	 
   		return (substring(getStringValue(),beginMs10frptDetEservFlag,beginMs10frptDetEservFlag + MS_10FRPT_DET_ESERV_FLAG_LEN));
   	}
     int localMs10frptFill6Counter = -1;
     public boolean isMs10frptFill6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptFill6Counter != sharedCounter;
         localMs10frptFill6Counter = sharedCounter; return hasModified;
     }
	protected static final int MS_10FRPT_FILL_6_LEN = 10;
	/**
	 * 	serialize this Ms10frptFill6
	 */
   protected void serializeMs10frptFill6(char[] ms10frptFill6) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ms10frptFill6,0,getStringValue(),beginMs10frptFill6,MS_10FRPT_FILL_6_LEN);
       localMs10frptFill6Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMs10frptFill6Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshMs10frptFill6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMs10frptFill6() {	 
   		return (substring(getStringValue(),beginMs10frptFill6,beginMs10frptFill6 + MS_10FRPT_FILL_6_LEN));
   	}
     int localMs10frptDetEarlyDlvryCounter = -1;
     public boolean isMs10frptDetEarlyDlvryModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptDetEarlyDlvryCounter != sharedCounter;
         localMs10frptDetEarlyDlvryCounter = sharedCounter; return hasModified;
     }
	protected static final int MS_10FRPT_DET_EARLY_DLVRY_LEN = 1;
	/**
	 * 	serialize this Ms10frptDetEarlyDlvry
	 */
   protected void serializeMs10frptDetEarlyDlvry(char[] ms10frptDetEarlyDlvry) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ms10frptDetEarlyDlvry,0,getStringValue(),beginMs10frptDetEarlyDlvry,MS_10FRPT_DET_EARLY_DLVRY_LEN);
       localMs10frptDetEarlyDlvryCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMs10frptDetEarlyDlvryConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMs10frptDetEarlyDlvry is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMs10frptDetEarlyDlvry() {	 
   		return (substring(getStringValue(),beginMs10frptDetEarlyDlvry,beginMs10frptDetEarlyDlvry + MS_10FRPT_DET_EARLY_DLVRY_LEN));
   	}
     int localMs10frptRptDetailCounter = -1;
     public boolean isMs10frptRptDetailModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptRptDetailCounter != sharedCounter;
         localMs10frptRptDetailCounter = sharedCounter; return hasModified;
     }
	protected static final int MS_10FRPT_RPT_DETAIL_LEN = 133;
	/**
	 * 	serialize this Ms10frptRptDetail
	 */
   protected void serializeMs10frptRptDetail(char[] ms10frptRptDetail) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ms10frptRptDetail,0,getStringValue(),beginMs10frptRptDetail,MS_10FRPT_RPT_DETAIL_LEN);
       localMs10frptRptDetailCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMs10frptRptDetailConstraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
    /**
	 *	refreshMs10frptRptDetail is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMs10frptRptDetail() {	 
   		return (substring(getStringValue(),beginMs10frptRptDetail,beginMs10frptRptDetail + MS_10FRPT_RPT_DETAIL_LEN));
   	}




}
  

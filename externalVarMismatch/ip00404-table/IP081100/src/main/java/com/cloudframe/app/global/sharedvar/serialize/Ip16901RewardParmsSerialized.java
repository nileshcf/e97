package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip16901RewardParmsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip16901RewardParmsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip16901RewardParmsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_16901_REWARD_PARMS_LENGTH = 125;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp16901ProgramId;
            protected  int beginIp16901ProgramEffDate;
            protected  int beginIp16901ProgramDesc;
            protected  int beginIp16901ProgramType;
            protected  int beginIp16901McMbrId;
            protected  int beginIp16901McPercent;
            protected  int beginIp16901AcqMbrId;
            protected  int beginIp16901AcqPercent;
            protected  int beginIp16901IssMbrId;
            protected  int beginIp16901IssPercent;
            protected  int beginIp16901CabCode;
            protected  int beginIp16901MrchntPaymtPct;
            protected  int beginIp16901ReconMthdCd;
	
	/**
	* Constructor for Ip16901RewardParmsSerialized
	**/
    public Ip16901RewardParmsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip16901RewardParmsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip16901RewardParmsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip16901RewardParmsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip16901RewardParmsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip16901RewardParmsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_16901_REWARD_PARMS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp16901ProgramId = getStartOffset() + 0;	// set offset for serialization
  
             beginIp16901ProgramEffDate = getStartOffset() + 11;	// set offset for serialization
  
             beginIp16901ProgramDesc = getStartOffset() + 21;	// set offset for serialization
  
             beginIp16901ProgramType = getStartOffset() + 71;	// set offset for serialization
  
             beginIp16901McMbrId = getStartOffset() + 74;	// set offset for serialization
  
             beginIp16901McPercent = getStartOffset() + 85;	// set offset for serialization
  
             beginIp16901AcqMbrId = getStartOffset() + 88;	// set offset for serialization
  
             beginIp16901AcqPercent = getStartOffset() + 99;	// set offset for serialization
  
             beginIp16901IssMbrId = getStartOffset() + 102;	// set offset for serialization
  
             beginIp16901IssPercent = getStartOffset() + 113;	// set offset for serialization
  
             beginIp16901CabCode = getStartOffset() + 116;	// set offset for serialization
  
             beginIp16901MrchntPaymtPct = getStartOffset() + 121;	// set offset for serialization
  
             beginIp16901ReconMthdCd = getStartOffset() + 124;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp16901ProgramIdCounter = -1;
     public boolean isIp16901ProgramIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp16901ProgramIdCounter != sharedCounter;
         localIp16901ProgramIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_16901_PROGRAM_ID_LEN = 11;
	/**
	 * 	serialize this Ip16901ProgramId
	 */
   protected void serializeIp16901ProgramId(char[] ip16901ProgramId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip16901ProgramId,0,getStringValue(),beginIp16901ProgramId,IP_16901_PROGRAM_ID_LEN);
       localIp16901ProgramIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp16901ProgramIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshIp16901ProgramId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp16901ProgramId() {	 
   		return (substring(getStringValue(),beginIp16901ProgramId,beginIp16901ProgramId + IP_16901_PROGRAM_ID_LEN));
   	}
     int localIp16901ProgramEffDateCounter = -1;
     public boolean isIp16901ProgramEffDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp16901ProgramEffDateCounter != sharedCounter;
         localIp16901ProgramEffDateCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_16901_PROGRAM_EFF_DATE_LEN = 10;
	/**
	 * 	serialize this Ip16901ProgramEffDate
	 */
   protected void serializeIp16901ProgramEffDate(char[] ip16901ProgramEffDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip16901ProgramEffDate,0,getStringValue(),beginIp16901ProgramEffDate,IP_16901_PROGRAM_EFF_DATE_LEN);
       localIp16901ProgramEffDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp16901ProgramEffDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshIp16901ProgramEffDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp16901ProgramEffDate() {	 
   		return (substring(getStringValue(),beginIp16901ProgramEffDate,beginIp16901ProgramEffDate + IP_16901_PROGRAM_EFF_DATE_LEN));
   	}
     int localIp16901ProgramDescCounter = -1;
     public boolean isIp16901ProgramDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp16901ProgramDescCounter != sharedCounter;
         localIp16901ProgramDescCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_16901_PROGRAM_DESC_LEN = 50;
	/**
	 * 	serialize this Ip16901ProgramDesc
	 */
   protected void serializeIp16901ProgramDesc(char[] ip16901ProgramDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip16901ProgramDesc,0,getStringValue(),beginIp16901ProgramDesc,IP_16901_PROGRAM_DESC_LEN);
       localIp16901ProgramDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp16901ProgramDescConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
    /**
	 *	refreshIp16901ProgramDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp16901ProgramDesc() {	 
   		return (substring(getStringValue(),beginIp16901ProgramDesc,beginIp16901ProgramDesc + IP_16901_PROGRAM_DESC_LEN));
   	}
     int localIp16901ProgramTypeCounter = -1;
     public boolean isIp16901ProgramTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp16901ProgramTypeCounter != sharedCounter;
         localIp16901ProgramTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_16901_PROGRAM_TYPE_LEN = 3;
	/**
	 * 	serialize this Ip16901ProgramType
	 */
   protected void serializeIp16901ProgramType(char[] ip16901ProgramType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip16901ProgramType,0,getStringValue(),beginIp16901ProgramType,IP_16901_PROGRAM_TYPE_LEN);
       localIp16901ProgramTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp16901ProgramTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp16901ProgramType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp16901ProgramType() {	 
   		return (substring(getStringValue(),beginIp16901ProgramType,beginIp16901ProgramType + IP_16901_PROGRAM_TYPE_LEN));
   	}
     int localIp16901McMbrIdCounter = -1;
     public boolean isIp16901McMbrIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp16901McMbrIdCounter != sharedCounter;
         localIp16901McMbrIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_16901_MC_MBR_ID_LEN = 11;
	/**
	 * 	serialize this Ip16901McMbrId
	 */
   protected void serializeIp16901McMbrId(char[] ip16901McMbrId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip16901McMbrId,0,getStringValue(),beginIp16901McMbrId,IP_16901_MC_MBR_ID_LEN);
       localIp16901McMbrIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp16901McMbrIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshIp16901McMbrId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp16901McMbrId() {	 
   		return (substring(getStringValue(),beginIp16901McMbrId,beginIp16901McMbrId + IP_16901_MC_MBR_ID_LEN));
   	}
     int localIp16901McPercentCounter = -1;
     public boolean isIp16901McPercentModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp16901McPercentCounter != sharedCounter;
         localIp16901McPercentCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip16901McPercent
	 *	@return ip16901McPercent
	 */
	public char[]  getIp16901McPercentString() {
	     return getCharArray(beginIp16901McPercent,IP_16901_MC_PERCENT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip16901McPercentIsNumeric() {
	    return isNumeric(beginIp16901McPercent
	                    ,beginIp16901McPercent + IP_16901_MC_PERCENT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_16901_MC_PERCENT_LEN = 3;
  	/**
	 * serializeIp16901McPercent
	 */
	protected void serializeIp16901McPercent(int ip16901McPercent) {
		 putNumber(beginIp16901McPercent,ip16901McPercent,IP_16901_MC_PERCENT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp16901McPercentCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp16901McPercent
	 */
   	protected  int serializeIp16901McPercent(char[] value) {
	    int  ip16901McPercent;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip16901McPercent = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp16901McPercent
		       ,3
		      );
		 localIp16901McPercentCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip16901McPercent;
    }

   protected int checkIp16901McPercentMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp16901McPercent is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp16901McPercent() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp16901McPercent
			                 ,IP_16901_MC_PERCENT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip16901McPercent", beginIp16901McPercent,IP_16901_MC_PERCENT_LEN);
    }
   	}
     int localIp16901AcqMbrIdCounter = -1;
     public boolean isIp16901AcqMbrIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp16901AcqMbrIdCounter != sharedCounter;
         localIp16901AcqMbrIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_16901_ACQ_MBR_ID_LEN = 11;
	/**
	 * 	serialize this Ip16901AcqMbrId
	 */
   protected void serializeIp16901AcqMbrId(char[] ip16901AcqMbrId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip16901AcqMbrId,0,getStringValue(),beginIp16901AcqMbrId,IP_16901_ACQ_MBR_ID_LEN);
       localIp16901AcqMbrIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp16901AcqMbrIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshIp16901AcqMbrId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp16901AcqMbrId() {	 
   		return (substring(getStringValue(),beginIp16901AcqMbrId,beginIp16901AcqMbrId + IP_16901_ACQ_MBR_ID_LEN));
   	}
     int localIp16901AcqPercentCounter = -1;
     public boolean isIp16901AcqPercentModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp16901AcqPercentCounter != sharedCounter;
         localIp16901AcqPercentCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip16901AcqPercent
	 *	@return ip16901AcqPercent
	 */
	public char[]  getIp16901AcqPercentString() {
	     return getCharArray(beginIp16901AcqPercent,IP_16901_ACQ_PERCENT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip16901AcqPercentIsNumeric() {
	    return isNumeric(beginIp16901AcqPercent
	                    ,beginIp16901AcqPercent + IP_16901_ACQ_PERCENT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_16901_ACQ_PERCENT_LEN = 3;
  	/**
	 * serializeIp16901AcqPercent
	 */
	protected void serializeIp16901AcqPercent(int ip16901AcqPercent) {
		 putNumber(beginIp16901AcqPercent,ip16901AcqPercent,IP_16901_ACQ_PERCENT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp16901AcqPercentCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp16901AcqPercent
	 */
   	protected  int serializeIp16901AcqPercent(char[] value) {
	    int  ip16901AcqPercent;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip16901AcqPercent = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp16901AcqPercent
		       ,3
		      );
		 localIp16901AcqPercentCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip16901AcqPercent;
    }

   protected int checkIp16901AcqPercentMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp16901AcqPercent is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp16901AcqPercent() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp16901AcqPercent
			                 ,IP_16901_ACQ_PERCENT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip16901AcqPercent", beginIp16901AcqPercent,IP_16901_ACQ_PERCENT_LEN);
    }
   	}
     int localIp16901IssMbrIdCounter = -1;
     public boolean isIp16901IssMbrIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp16901IssMbrIdCounter != sharedCounter;
         localIp16901IssMbrIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_16901_ISS_MBR_ID_LEN = 11;
	/**
	 * 	serialize this Ip16901IssMbrId
	 */
   protected void serializeIp16901IssMbrId(char[] ip16901IssMbrId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip16901IssMbrId,0,getStringValue(),beginIp16901IssMbrId,IP_16901_ISS_MBR_ID_LEN);
       localIp16901IssMbrIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp16901IssMbrIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshIp16901IssMbrId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp16901IssMbrId() {	 
   		return (substring(getStringValue(),beginIp16901IssMbrId,beginIp16901IssMbrId + IP_16901_ISS_MBR_ID_LEN));
   	}
     int localIp16901IssPercentCounter = -1;
     public boolean isIp16901IssPercentModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp16901IssPercentCounter != sharedCounter;
         localIp16901IssPercentCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip16901IssPercent
	 *	@return ip16901IssPercent
	 */
	public char[]  getIp16901IssPercentString() {
	     return getCharArray(beginIp16901IssPercent,IP_16901_ISS_PERCENT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip16901IssPercentIsNumeric() {
	    return isNumeric(beginIp16901IssPercent
	                    ,beginIp16901IssPercent + IP_16901_ISS_PERCENT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_16901_ISS_PERCENT_LEN = 3;
  	/**
	 * serializeIp16901IssPercent
	 */
	protected void serializeIp16901IssPercent(int ip16901IssPercent) {
		 putNumber(beginIp16901IssPercent,ip16901IssPercent,IP_16901_ISS_PERCENT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp16901IssPercentCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp16901IssPercent
	 */
   	protected  int serializeIp16901IssPercent(char[] value) {
	    int  ip16901IssPercent;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip16901IssPercent = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp16901IssPercent
		       ,3
		      );
		 localIp16901IssPercentCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip16901IssPercent;
    }

   protected int checkIp16901IssPercentMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp16901IssPercent is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp16901IssPercent() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp16901IssPercent
			                 ,IP_16901_ISS_PERCENT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip16901IssPercent", beginIp16901IssPercent,IP_16901_ISS_PERCENT_LEN);
    }
   	}
     int localIp16901CabCodeCounter = -1;
     public boolean isIp16901CabCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp16901CabCodeCounter != sharedCounter;
         localIp16901CabCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_16901_CAB_CODE_LEN = 5;
	/**
	 * 	serialize this Ip16901CabCode
	 */
   protected void serializeIp16901CabCode(char[] ip16901CabCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip16901CabCode,0,getStringValue(),beginIp16901CabCode,IP_16901_CAB_CODE_LEN);
       localIp16901CabCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp16901CabCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshIp16901CabCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp16901CabCode() {	 
   		return (substring(getStringValue(),beginIp16901CabCode,beginIp16901CabCode + IP_16901_CAB_CODE_LEN));
   	}
     int localIp16901MrchntPaymtPctCounter = -1;
     public boolean isIp16901MrchntPaymtPctModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp16901MrchntPaymtPctCounter != sharedCounter;
         localIp16901MrchntPaymtPctCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip16901MrchntPaymtPct
	 *	@return ip16901MrchntPaymtPct
	 */
	public char[]  getIp16901MrchntPaymtPctString() {
	     return getCharArray(beginIp16901MrchntPaymtPct,IP_16901_MRCHNT_PAYMT_PCT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip16901MrchntPaymtPctIsNumeric() {
	    return isNumeric(beginIp16901MrchntPaymtPct
	                    ,beginIp16901MrchntPaymtPct + IP_16901_MRCHNT_PAYMT_PCT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_16901_MRCHNT_PAYMT_PCT_LEN = 3;
  	/**
	 * serializeIp16901MrchntPaymtPct
	 */
	protected void serializeIp16901MrchntPaymtPct(int ip16901MrchntPaymtPct) {
		 putNumber(beginIp16901MrchntPaymtPct,ip16901MrchntPaymtPct,IP_16901_MRCHNT_PAYMT_PCT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp16901MrchntPaymtPctCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp16901MrchntPaymtPct
	 */
   	protected  int serializeIp16901MrchntPaymtPct(char[] value) {
	    int  ip16901MrchntPaymtPct;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip16901MrchntPaymtPct = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp16901MrchntPaymtPct
		       ,3
		      );
		 localIp16901MrchntPaymtPctCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip16901MrchntPaymtPct;
    }

   protected int checkIp16901MrchntPaymtPctMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp16901MrchntPaymtPct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp16901MrchntPaymtPct() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp16901MrchntPaymtPct
			                 ,IP_16901_MRCHNT_PAYMT_PCT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip16901MrchntPaymtPct", beginIp16901MrchntPaymtPct,IP_16901_MRCHNT_PAYMT_PCT_LEN);
    }
   	}
     int localIp16901ReconMthdCdCounter = -1;
     public boolean isIp16901ReconMthdCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp16901ReconMthdCdCounter != sharedCounter;
         localIp16901ReconMthdCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_16901_RECON_MTHD_CD_LEN = 1;
	/**
	 * 	serialize this Ip16901ReconMthdCd
	 */
   protected void serializeIp16901ReconMthdCd(char[] ip16901ReconMthdCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip16901ReconMthdCd,0,getStringValue(),beginIp16901ReconMthdCd,IP_16901_RECON_MTHD_CD_LEN);
       localIp16901ReconMthdCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp16901ReconMthdCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp16901ReconMthdCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp16901ReconMthdCd() {	 
   		return (substring(getStringValue(),beginIp16901ReconMthdCd,beginIp16901ReconMthdCd + IP_16901_RECON_MTHD_CD_LEN));
   	}




}
  

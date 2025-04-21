package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class Ip90354TableDataKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip90354TableDataKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip90354TableDataKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_90354_TABLE_DATA_KEY_LENGTH = 83;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp90354L1CtlTableType;
            protected  int beginIp90354L1Ctldata;
            protected  int beginIp90354L1Ctlexclusionind;
	
	/**
	* Constructor for Ip90354TableDataKeySerialized
	**/
    public Ip90354TableDataKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip90354TableDataKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip90354TableDataKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip90354TableDataKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip90354TableDataKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip90354TableDataKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_90354_TABLE_DATA_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp90354L1CtlTableType = getStartOffset() + 0;	// set offset for serialization
  
  
  
             beginIp90354L1Ctldata = getStartOffset() + 56;	// set offset for serialization
  
             beginIp90354L1Ctlexclusionind = getStartOffset() + 82;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp90354L1CtlTableTypeCounter = -1;
     public boolean isIp90354L1CtlTableTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp90354L1CtlTableTypeCounter != sharedCounter;
         localIp90354L1CtlTableTypeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip90354L1CtlTableType
	 *	@return ip90354L1CtlTableType
	 */
	public char[]  getIp90354L1CtlTableTypeString() {
	     return getCharArray(beginIp90354L1CtlTableType,IP_90354_L_1_CTL_TABLE_TYPE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip90354L1CtlTableTypeIsNumeric() {
	    return isNumeric(beginIp90354L1CtlTableType
	                    ,beginIp90354L1CtlTableType + IP_90354_L_1_CTL_TABLE_TYPE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_90354_L_1_CTL_TABLE_TYPE_LEN = 1;
  	/**
	 * serializeIp90354L1CtlTableType
	 */
	protected void serializeIp90354L1CtlTableType(int ip90354L1CtlTableType) {
		 putNumber(beginIp90354L1CtlTableType,ip90354L1CtlTableType,IP_90354_L_1_CTL_TABLE_TYPE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp90354L1CtlTableTypeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp90354L1CtlTableType
	 */
   	protected  int serializeIp90354L1CtlTableType(char[] value) {
	    int  ip90354L1CtlTableType;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip90354L1CtlTableType = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIp90354L1CtlTableType
		       ,1
		      );
		 localIp90354L1CtlTableTypeCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip90354L1CtlTableType;
    }

   protected int checkIp90354L1CtlTableTypeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp90354L1CtlTableType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp90354L1CtlTableType() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp90354L1CtlTableType
			                 ,IP_90354_L_1_CTL_TABLE_TYPE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip90354L1CtlTableType", beginIp90354L1CtlTableType,IP_90354_L_1_CTL_TABLE_TYPE_LEN);
    }
   	}
     int localIp90354L1CtldataCounter = -1;
     public boolean isIp90354L1CtldataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp90354L1CtldataCounter != sharedCounter;
         localIp90354L1CtldataCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_90354_L_1_CTLDATA_LEN = 26;
	/**
	 * 	serialize this Ip90354L1Ctldata
	 */
   protected void serializeIp90354L1Ctldata(char[] ip90354L1Ctldata) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip90354L1Ctldata,0,getStringValue(),beginIp90354L1Ctldata,IP_90354_L_1_CTLDATA_LEN);
       localIp90354L1CtldataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp90354L1CtldataConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshIp90354L1Ctldata is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp90354L1Ctldata() {	 
   		return (substring(getStringValue(),beginIp90354L1Ctldata,beginIp90354L1Ctldata + IP_90354_L_1_CTLDATA_LEN));
   	}
     int localIp90354L1CtlexclusionindCounter = -1;
     public boolean isIp90354L1CtlexclusionindModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp90354L1CtlexclusionindCounter != sharedCounter;
         localIp90354L1CtlexclusionindCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_90354_L_1_CTLEXCLUSIONIND_LEN = 1;
	/**
	 * 	serialize this Ip90354L1Ctlexclusionind
	 */
   protected void serializeIp90354L1Ctlexclusionind(char[] ip90354L1Ctlexclusionind) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip90354L1Ctlexclusionind,0,getStringValue(),beginIp90354L1Ctlexclusionind,IP_90354_L_1_CTLEXCLUSIONIND_LEN);
       localIp90354L1CtlexclusionindCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp90354L1CtlexclusionindConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp90354L1Ctlexclusionind is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp90354L1Ctlexclusionind() {	 
   		return (substring(getStringValue(),beginIp90354L1Ctlexclusionind,beginIp90354L1Ctlexclusionind + IP_90354_L_1_CTLEXCLUSIONIND_LEN));
   	}




}
  

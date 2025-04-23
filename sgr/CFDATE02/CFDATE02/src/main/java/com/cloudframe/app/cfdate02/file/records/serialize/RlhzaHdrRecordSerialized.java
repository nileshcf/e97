package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class RlhzaHdrRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RlhzaHdrRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RlhzaHdrRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLHZA_HDR_RECORD_LENGTH = 1700;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlhzaRcBlAsOfDtIso;
	
	/**
	* Constructor for RlhzaHdrRecordSerialized
	**/
    public RlhzaHdrRecordSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RlhzaHdrRecordSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlhzaHdrRecordSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RlhzaHdrRecordSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this RlhzaHdrRecordSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in RlhzaHdrRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLHZA_HDR_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlhzaRcBlAsOfDtIso = getStartOffset() + 12;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRlhzaRcBlAsOfDtIsoCounter = -1;
     public boolean isRlhzaRcBlAsOfDtIsoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlhzaRcBlAsOfDtIsoCounter != sharedCounter;
         localRlhzaRcBlAsOfDtIsoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlhzaRcBlAsOfDtIso
	 *	@return rlhzaRcBlAsOfDtIso
	 */
	public char[]  getRlhzaRcBlAsOfDtIsoString() {
	     return getCharArray(beginRlhzaRcBlAsOfDtIso,RLHZA_RC_BL_AS_OF_DT_ISO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlhzaRcBlAsOfDtIsoIsNumeric() {
	    return isNumeric(beginRlhzaRcBlAsOfDtIso
	                    ,beginRlhzaRcBlAsOfDtIso + RLHZA_RC_BL_AS_OF_DT_ISO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLHZA_RC_BL_AS_OF_DT_ISO_LEN = 8;
  	/**
	 * serializeRlhzaRcBlAsOfDtIso
	 */
	protected void serializeRlhzaRcBlAsOfDtIso(long rlhzaRcBlAsOfDtIso) {
		 putNumber(beginRlhzaRcBlAsOfDtIso,rlhzaRcBlAsOfDtIso,RLHZA_RC_BL_AS_OF_DT_ISO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlhzaRcBlAsOfDtIsoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlhzaRcBlAsOfDtIso
	 */
   	protected  long serializeRlhzaRcBlAsOfDtIso(char[] value) {
	    long  rlhzaRcBlAsOfDtIso;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlhzaRcBlAsOfDtIso = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginRlhzaRcBlAsOfDtIso
		       ,8
		      );
		 localRlhzaRcBlAsOfDtIsoCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlhzaRcBlAsOfDtIso;
    }

   protected long checkRlhzaRcBlAsOfDtIsoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlhzaRcBlAsOfDtIso is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshRlhzaRcBlAsOfDtIso() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginRlhzaRcBlAsOfDtIso
			                 ,RLHZA_RC_BL_AS_OF_DT_ISO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlhzaRcBlAsOfDtIso", beginRlhzaRcBlAsOfDtIso,RLHZA_RC_BL_AS_OF_DT_ISO_LEN);
    }
   	}




}
  

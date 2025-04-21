package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class MsdOidDateCcyymmddSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdOidDateCcyymmddSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdOidDateCcyymmddSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_OID_DATE_CCYYMMDD_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdOidDateCc;
            protected  int beginMsdOidDate;
	
	/**
	* Constructor for MsdOidDateCcyymmddSerialized
	**/
    public MsdOidDateCcyymmddSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdOidDateCcyymmddSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdOidDateCcyymmddSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdOidDateCcyymmddSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3433); // serialize this field at offset 3433 by default 
    }
    
	/**
	* sets parent for this MsdOidDateCcyymmddSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3433 by default
    }    
	/**
	* initializes the field in MsdOidDateCcyymmddSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_OID_DATE_CCYYMMDD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdOidDateCc = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdOidDate = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdOidDateCcCounter = -1;
     public boolean isMsdOidDateCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdOidDateCcCounter != sharedCounter;
         localMsdOidDateCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdOidDateCc
	 *	@return msdOidDateCc
	 */
	public char[]  getMsdOidDateCcString() {
	     return getCharArray(beginMsdOidDateCc,MSD_OID_DATE_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdOidDateCcIsNumeric() {
	    return isNumeric(beginMsdOidDateCc
	                    ,beginMsdOidDateCc + MSD_OID_DATE_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_OID_DATE_CC_LEN = 2;
  	/**
	 * serializeMsdOidDateCc
	 */
	protected void serializeMsdOidDateCc(int msdOidDateCc) {
		 putNumber(beginMsdOidDateCc,msdOidDateCc,MSD_OID_DATE_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdOidDateCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdOidDateCc
	 */
   	protected  int serializeMsdOidDateCc(char[] value) {
	    int  msdOidDateCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdOidDateCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdOidDateCc
		       ,2
		      );
		 localMsdOidDateCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdOidDateCc;
    }

   protected int checkMsdOidDateCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdOidDateCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdOidDateCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdOidDateCc
			                 ,MSD_OID_DATE_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdOidDateCc", beginMsdOidDateCc,MSD_OID_DATE_CC_LEN);
    }
   	}
     int localMsdOidDateCounter = -1;
     public boolean isMsdOidDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdOidDateCounter != sharedCounter;
         localMsdOidDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdOidDate
	 *	@return msdOidDate
	 */
	public char[]  getMsdOidDateString() {
	     return getCharArray(beginMsdOidDate,MSD_OID_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdOidDateIsNumeric() {
	    return isNumeric(beginMsdOidDate
	                    ,beginMsdOidDate + MSD_OID_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_OID_DATE_LEN = 6;
  	/**
	 * serializeMsdOidDate
	 */
	protected void serializeMsdOidDate(long msdOidDate) {
		 putNumber(beginMsdOidDate,msdOidDate,MSD_OID_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdOidDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdOidDate
	 */
   	protected  long serializeMsdOidDate(char[] value) {
	    long  msdOidDate;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdOidDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMsdOidDate
		       ,6
		      );
		 localMsdOidDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdOidDate;
    }

   protected long checkMsdOidDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdOidDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdOidDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdOidDate
			                 ,MSD_OID_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdOidDate", beginMsdOidDate,MSD_OID_DATE_LEN);
    }
   	}




}
  

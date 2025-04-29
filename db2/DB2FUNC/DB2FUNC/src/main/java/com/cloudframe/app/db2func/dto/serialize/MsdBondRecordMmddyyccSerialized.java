package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class MsdBondRecordMmddyyccSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdBondRecordMmddyyccSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdBondRecordMmddyyccSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_BOND_RECORD_MMDDYYCC_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdBondRecordMmddyy;
            protected  int beginMsdBondRecordCc;
	
	/**
	* Constructor for MsdBondRecordMmddyyccSerialized
	**/
    public MsdBondRecordMmddyyccSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdBondRecordMmddyyccSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdBondRecordMmddyyccSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdBondRecordMmddyyccSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2573); // serialize this field at offset 2573 by default 
    }
    
	/**
	* sets parent for this MsdBondRecordMmddyyccSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2573 by default
    }    
	/**
	* initializes the field in MsdBondRecordMmddyyccSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_BOND_RECORD_MMDDYYCC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdBondRecordMmddyy = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdBondRecordCc = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdBondRecordMmddyyCounter = -1;
     public boolean isMsdBondRecordMmddyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondRecordMmddyyCounter != sharedCounter;
         localMsdBondRecordMmddyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdBondRecordMmddyy
	 *	@return msdBondRecordMmddyy
	 */
	public char[]  getMsdBondRecordMmddyyString() {
	     return getCharArray(beginMsdBondRecordMmddyy,MSD_BOND_RECORD_MMDDYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBondRecordMmddyyIsNumeric() {
	    return isNumeric(beginMsdBondRecordMmddyy
	                    ,beginMsdBondRecordMmddyy + MSD_BOND_RECORD_MMDDYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_BOND_RECORD_MMDDYY_LEN = 6;
  	/**
	 * serializeMsdBondRecordMmddyy
	 */
	protected void serializeMsdBondRecordMmddyy(long msdBondRecordMmddyy) {
		 putNumber(beginMsdBondRecordMmddyy,msdBondRecordMmddyy,MSD_BOND_RECORD_MMDDYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBondRecordMmddyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdBondRecordMmddyy
	 */
   	protected  long serializeMsdBondRecordMmddyy(char[] value) {
	    long  msdBondRecordMmddyy;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdBondRecordMmddyy = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMsdBondRecordMmddyy
		       ,6
		      );
		 localMsdBondRecordMmddyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdBondRecordMmddyy;
    }

   protected long checkMsdBondRecordMmddyyMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdBondRecordMmddyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdBondRecordMmddyy() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdBondRecordMmddyy
			                 ,MSD_BOND_RECORD_MMDDYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBondRecordMmddyy", beginMsdBondRecordMmddyy,MSD_BOND_RECORD_MMDDYY_LEN);
    }
   	}
     int localMsdBondRecordCcCounter = -1;
     public boolean isMsdBondRecordCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondRecordCcCounter != sharedCounter;
         localMsdBondRecordCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdBondRecordCc
	 *	@return msdBondRecordCc
	 */
	public char[]  getMsdBondRecordCcString() {
	     return getCharArray(beginMsdBondRecordCc,MSD_BOND_RECORD_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBondRecordCcIsNumeric() {
	    return isNumeric(beginMsdBondRecordCc
	                    ,beginMsdBondRecordCc + MSD_BOND_RECORD_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_BOND_RECORD_CC_LEN = 2;
  	/**
	 * serializeMsdBondRecordCc
	 */
	protected void serializeMsdBondRecordCc(int msdBondRecordCc) {
		 putNumber(beginMsdBondRecordCc,msdBondRecordCc,MSD_BOND_RECORD_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBondRecordCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdBondRecordCc
	 */
   	protected  int serializeMsdBondRecordCc(char[] value) {
	    int  msdBondRecordCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdBondRecordCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdBondRecordCc
		       ,2
		      );
		 localMsdBondRecordCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdBondRecordCc;
    }

   protected int checkMsdBondRecordCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdBondRecordCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdBondRecordCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdBondRecordCc
			                 ,MSD_BOND_RECORD_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBondRecordCc", beginMsdBondRecordCc,MSD_BOND_RECORD_CC_LEN);
    }
   	}




}
  

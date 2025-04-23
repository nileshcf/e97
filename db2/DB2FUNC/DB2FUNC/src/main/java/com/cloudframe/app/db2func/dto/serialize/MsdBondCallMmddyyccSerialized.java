package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class MsdBondCallMmddyyccSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdBondCallMmddyyccSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdBondCallMmddyyccSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_BOND_CALL_MMDDYYCC_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdBondCallCc;
	
	/**
	* Constructor for MsdBondCallMmddyyccSerialized
	**/
    public MsdBondCallMmddyyccSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdBondCallMmddyyccSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdBondCallMmddyyccSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdBondCallMmddyyccSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2791); // serialize this field at offset 2791 by default 
    }
    
	/**
	* sets parent for this MsdBondCallMmddyyccSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2791 by default
    }    
	/**
	* initializes the field in MsdBondCallMmddyyccSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_BOND_CALL_MMDDYYCC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginMsdBondCallCc = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdBondCallCcCounter = -1;
     public boolean isMsdBondCallCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondCallCcCounter != sharedCounter;
         localMsdBondCallCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdBondCallCc
	 *	@return msdBondCallCc
	 */
	public char[]  getMsdBondCallCcString() {
	     return getCharArray(beginMsdBondCallCc,MSD_BOND_CALL_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBondCallCcIsNumeric() {
	    return isNumeric(beginMsdBondCallCc
	                    ,beginMsdBondCallCc + MSD_BOND_CALL_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_BOND_CALL_CC_LEN = 2;
  	/**
	 * serializeMsdBondCallCc
	 */
	protected void serializeMsdBondCallCc(int msdBondCallCc) {
		 putNumber(beginMsdBondCallCc,msdBondCallCc,MSD_BOND_CALL_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBondCallCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdBondCallCc
	 */
   	protected  int serializeMsdBondCallCc(char[] value) {
	    int  msdBondCallCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdBondCallCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdBondCallCc
		       ,2
		      );
		 localMsdBondCallCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdBondCallCc;
    }

   protected int checkMsdBondCallCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdBondCallCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdBondCallCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdBondCallCc
			                 ,MSD_BOND_CALL_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBondCallCc", beginMsdBondCallCc,MSD_BOND_CALL_CC_LEN);
    }
   	}




}
  

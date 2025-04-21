package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class MsdBondDatedMmddyyccSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:56. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdBondDatedMmddyyccSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdBondDatedMmddyyccSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_BOND_DATED_MMDDYYCC_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdBondDatedCc;
	
	/**
	* Constructor for MsdBondDatedMmddyyccSerialized
	**/
    public MsdBondDatedMmddyyccSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdBondDatedMmddyyccSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdBondDatedMmddyyccSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdBondDatedMmddyyccSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2565); // serialize this field at offset 2565 by default 
    }
    
	/**
	* sets parent for this MsdBondDatedMmddyyccSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2565 by default
    }    
	/**
	* initializes the field in MsdBondDatedMmddyyccSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_BOND_DATED_MMDDYYCC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginMsdBondDatedCc = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdBondDatedCcCounter = -1;
     public boolean isMsdBondDatedCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondDatedCcCounter != sharedCounter;
         localMsdBondDatedCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdBondDatedCc
	 *	@return msdBondDatedCc
	 */
	public char[]  getMsdBondDatedCcString() {
	     return getCharArray(beginMsdBondDatedCc,MSD_BOND_DATED_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBondDatedCcIsNumeric() {
	    return isNumeric(beginMsdBondDatedCc
	                    ,beginMsdBondDatedCc + MSD_BOND_DATED_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_BOND_DATED_CC_LEN = 2;
  	/**
	 * serializeMsdBondDatedCc
	 */
	protected void serializeMsdBondDatedCc(int msdBondDatedCc) {
		 putNumber(beginMsdBondDatedCc,msdBondDatedCc,MSD_BOND_DATED_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBondDatedCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdBondDatedCc
	 */
   	protected  int serializeMsdBondDatedCc(char[] value) {
	    int  msdBondDatedCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdBondDatedCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdBondDatedCc
		       ,2
		      );
		 localMsdBondDatedCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdBondDatedCc;
    }

   protected int checkMsdBondDatedCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdBondDatedCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdBondDatedCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdBondDatedCc
			                 ,MSD_BOND_DATED_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBondDatedCc", beginMsdBondDatedCc,MSD_BOND_DATED_CC_LEN);
    }
   	}




}
  

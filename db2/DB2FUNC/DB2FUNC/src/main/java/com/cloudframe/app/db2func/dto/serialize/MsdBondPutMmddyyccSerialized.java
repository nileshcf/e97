package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class MsdBondPutMmddyyccSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdBondPutMmddyyccSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdBondPutMmddyyccSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_BOND_PUT_MMDDYYCC_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdBondPutMmddyy;
            protected  int beginMsdBondPutCc;
	
	/**
	* Constructor for MsdBondPutMmddyyccSerialized
	**/
    public MsdBondPutMmddyyccSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdBondPutMmddyyccSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdBondPutMmddyyccSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdBondPutMmddyyccSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2834); // serialize this field at offset 2834 by default 
    }
    
	/**
	* sets parent for this MsdBondPutMmddyyccSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2834 by default
    }    
	/**
	* initializes the field in MsdBondPutMmddyyccSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_BOND_PUT_MMDDYYCC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdBondPutMmddyy = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdBondPutCc = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdBondPutMmddyyCounter = -1;
     public boolean isMsdBondPutMmddyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondPutMmddyyCounter != sharedCounter;
         localMsdBondPutMmddyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdBondPutMmddyy
	 *	@return msdBondPutMmddyy
	 */
	public char[]  getMsdBondPutMmddyyString() {
	     return getCharArray(beginMsdBondPutMmddyy,MSD_BOND_PUT_MMDDYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBondPutMmddyyIsNumeric() {
	    return isNumeric(beginMsdBondPutMmddyy
	                    ,beginMsdBondPutMmddyy + MSD_BOND_PUT_MMDDYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_BOND_PUT_MMDDYY_LEN = 6;
  	/**
	 * serializeMsdBondPutMmddyy
	 */
	protected void serializeMsdBondPutMmddyy(long msdBondPutMmddyy) {
		 putNumber(beginMsdBondPutMmddyy,msdBondPutMmddyy,MSD_BOND_PUT_MMDDYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBondPutMmddyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdBondPutMmddyy
	 */
   	protected  long serializeMsdBondPutMmddyy(char[] value) {
	    long  msdBondPutMmddyy;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdBondPutMmddyy = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMsdBondPutMmddyy
		       ,6
		      );
		 localMsdBondPutMmddyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdBondPutMmddyy;
    }

   protected long checkMsdBondPutMmddyyMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdBondPutMmddyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdBondPutMmddyy() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdBondPutMmddyy
			                 ,MSD_BOND_PUT_MMDDYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBondPutMmddyy", beginMsdBondPutMmddyy,MSD_BOND_PUT_MMDDYY_LEN);
    }
   	}
     int localMsdBondPutCcCounter = -1;
     public boolean isMsdBondPutCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondPutCcCounter != sharedCounter;
         localMsdBondPutCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdBondPutCc
	 *	@return msdBondPutCc
	 */
	public char[]  getMsdBondPutCcString() {
	     return getCharArray(beginMsdBondPutCc,MSD_BOND_PUT_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBondPutCcIsNumeric() {
	    return isNumeric(beginMsdBondPutCc
	                    ,beginMsdBondPutCc + MSD_BOND_PUT_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_BOND_PUT_CC_LEN = 2;
  	/**
	 * serializeMsdBondPutCc
	 */
	protected void serializeMsdBondPutCc(int msdBondPutCc) {
		 putNumber(beginMsdBondPutCc,msdBondPutCc,MSD_BOND_PUT_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBondPutCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdBondPutCc
	 */
   	protected  int serializeMsdBondPutCc(char[] value) {
	    int  msdBondPutCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdBondPutCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdBondPutCc
		       ,2
		      );
		 localMsdBondPutCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdBondPutCc;
    }

   protected int checkMsdBondPutCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdBondPutCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdBondPutCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdBondPutCc
			                 ,MSD_BOND_PUT_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBondPutCc", beginMsdBondPutCc,MSD_BOND_PUT_CC_LEN);
    }
   	}




}
  

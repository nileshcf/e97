package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class MsdBondPayMmddyyccSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdBondPayMmddyyccSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdBondPayMmddyyccSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_BOND_PAY_MMDDYYCC_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdBondPayMmddyy;
            protected  int beginMsdBondPayCc;
	
	/**
	* Constructor for MsdBondPayMmddyyccSerialized
	**/
    public MsdBondPayMmddyyccSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdBondPayMmddyyccSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdBondPayMmddyyccSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdBondPayMmddyyccSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2588); // serialize this field at offset 2588 by default 
    }
    
	/**
	* sets parent for this MsdBondPayMmddyyccSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2588 by default
    }    
	/**
	* initializes the field in MsdBondPayMmddyyccSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_BOND_PAY_MMDDYYCC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdBondPayMmddyy = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdBondPayCc = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdBondPayMmddyyCounter = -1;
     public boolean isMsdBondPayMmddyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondPayMmddyyCounter != sharedCounter;
         localMsdBondPayMmddyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdBondPayMmddyy
	 *	@return msdBondPayMmddyy
	 */
	public char[]  getMsdBondPayMmddyyString() {
	     return getCharArray(beginMsdBondPayMmddyy,MSD_BOND_PAY_MMDDYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBondPayMmddyyIsNumeric() {
	    return isNumeric(beginMsdBondPayMmddyy
	                    ,beginMsdBondPayMmddyy + MSD_BOND_PAY_MMDDYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_BOND_PAY_MMDDYY_LEN = 6;
  	/**
	 * serializeMsdBondPayMmddyy
	 */
	protected void serializeMsdBondPayMmddyy(long msdBondPayMmddyy) {
		 putNumber(beginMsdBondPayMmddyy,msdBondPayMmddyy,MSD_BOND_PAY_MMDDYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBondPayMmddyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdBondPayMmddyy
	 */
   	protected  long serializeMsdBondPayMmddyy(char[] value) {
	    long  msdBondPayMmddyy;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdBondPayMmddyy = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMsdBondPayMmddyy
		       ,6
		      );
		 localMsdBondPayMmddyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdBondPayMmddyy;
    }

   protected long checkMsdBondPayMmddyyMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdBondPayMmddyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdBondPayMmddyy() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdBondPayMmddyy
			                 ,MSD_BOND_PAY_MMDDYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBondPayMmddyy", beginMsdBondPayMmddyy,MSD_BOND_PAY_MMDDYY_LEN);
    }
   	}
     int localMsdBondPayCcCounter = -1;
     public boolean isMsdBondPayCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondPayCcCounter != sharedCounter;
         localMsdBondPayCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdBondPayCc
	 *	@return msdBondPayCc
	 */
	public char[]  getMsdBondPayCcString() {
	     return getCharArray(beginMsdBondPayCc,MSD_BOND_PAY_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBondPayCcIsNumeric() {
	    return isNumeric(beginMsdBondPayCc
	                    ,beginMsdBondPayCc + MSD_BOND_PAY_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_BOND_PAY_CC_LEN = 2;
  	/**
	 * serializeMsdBondPayCc
	 */
	protected void serializeMsdBondPayCc(int msdBondPayCc) {
		 putNumber(beginMsdBondPayCc,msdBondPayCc,MSD_BOND_PAY_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBondPayCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdBondPayCc
	 */
   	protected  int serializeMsdBondPayCc(char[] value) {
	    int  msdBondPayCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdBondPayCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdBondPayCc
		       ,2
		      );
		 localMsdBondPayCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdBondPayCc;
    }

   protected int checkMsdBondPayCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdBondPayCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdBondPayCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdBondPayCc
			                 ,MSD_BOND_PAY_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBondPayCc", beginMsdBondPayCc,MSD_BOND_PAY_CC_LEN);
    }
   	}




}
  

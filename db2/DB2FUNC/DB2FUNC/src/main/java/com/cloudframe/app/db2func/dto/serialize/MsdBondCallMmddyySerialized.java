package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class MsdBondCallMmddyySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdBondCallMmddyySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdBondCallMmddyySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_BOND_CALL_MMDDYY_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdBondCallMm;
            protected  int beginMsdBondCallDd;
            protected  int beginMsdBondCallYy;
	
	/**
	* Constructor for MsdBondCallMmddyySerialized
	**/
    public MsdBondCallMmddyySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdBondCallMmddyySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdBondCallMmddyySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdBondCallMmddyySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2791); // serialize this field at offset 2791 by default 
    }
    
	/**
	* sets parent for this MsdBondCallMmddyySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2791 by default
    }    
	/**
	* initializes the field in MsdBondCallMmddyySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_BOND_CALL_MMDDYY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdBondCallMm = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdBondCallDd = getStartOffset() + 2;	// set offset for serialization
  
             beginMsdBondCallYy = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdBondCallMmCounter = -1;
     public boolean isMsdBondCallMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondCallMmCounter != sharedCounter;
         localMsdBondCallMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdBondCallMm
	 *	@return msdBondCallMm
	 */
	public char[]  getMsdBondCallMmString() {
	     return getCharArray(beginMsdBondCallMm,MSD_BOND_CALL_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBondCallMmIsNumeric() {
	    return isNumeric(beginMsdBondCallMm
	                    ,beginMsdBondCallMm + MSD_BOND_CALL_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_BOND_CALL_MM_LEN = 2;
  	/**
	 * serializeMsdBondCallMm
	 */
	protected void serializeMsdBondCallMm(int msdBondCallMm) {
		 putNumber(beginMsdBondCallMm,msdBondCallMm,MSD_BOND_CALL_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBondCallMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdBondCallMm
	 */
   	protected  int serializeMsdBondCallMm(char[] value) {
	    int  msdBondCallMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdBondCallMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdBondCallMm
		       ,2
		      );
		 localMsdBondCallMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdBondCallMm;
    }

   protected int checkMsdBondCallMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdBondCallMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdBondCallMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdBondCallMm
			                 ,MSD_BOND_CALL_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBondCallMm", beginMsdBondCallMm,MSD_BOND_CALL_MM_LEN);
    }
   	}
     int localMsdBondCallDdCounter = -1;
     public boolean isMsdBondCallDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondCallDdCounter != sharedCounter;
         localMsdBondCallDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdBondCallDd
	 *	@return msdBondCallDd
	 */
	public char[]  getMsdBondCallDdString() {
	     return getCharArray(beginMsdBondCallDd,MSD_BOND_CALL_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBondCallDdIsNumeric() {
	    return isNumeric(beginMsdBondCallDd
	                    ,beginMsdBondCallDd + MSD_BOND_CALL_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_BOND_CALL_DD_LEN = 2;
  	/**
	 * serializeMsdBondCallDd
	 */
	protected void serializeMsdBondCallDd(int msdBondCallDd) {
		 putNumber(beginMsdBondCallDd,msdBondCallDd,MSD_BOND_CALL_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBondCallDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdBondCallDd
	 */
   	protected  int serializeMsdBondCallDd(char[] value) {
	    int  msdBondCallDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdBondCallDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdBondCallDd
		       ,2
		      );
		 localMsdBondCallDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdBondCallDd;
    }

   protected int checkMsdBondCallDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdBondCallDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdBondCallDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdBondCallDd
			                 ,MSD_BOND_CALL_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBondCallDd", beginMsdBondCallDd,MSD_BOND_CALL_DD_LEN);
    }
   	}
     int localMsdBondCallYyCounter = -1;
     public boolean isMsdBondCallYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondCallYyCounter != sharedCounter;
         localMsdBondCallYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdBondCallYy
	 *	@return msdBondCallYy
	 */
	public char[]  getMsdBondCallYyString() {
	     return getCharArray(beginMsdBondCallYy,MSD_BOND_CALL_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBondCallYyIsNumeric() {
	    return isNumeric(beginMsdBondCallYy
	                    ,beginMsdBondCallYy + MSD_BOND_CALL_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_BOND_CALL_YY_LEN = 2;
  	/**
	 * serializeMsdBondCallYy
	 */
	protected void serializeMsdBondCallYy(int msdBondCallYy) {
		 putNumber(beginMsdBondCallYy,msdBondCallYy,MSD_BOND_CALL_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBondCallYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdBondCallYy
	 */
   	protected  int serializeMsdBondCallYy(char[] value) {
	    int  msdBondCallYy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdBondCallYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdBondCallYy
		       ,2
		      );
		 localMsdBondCallYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdBondCallYy;
    }

   protected int checkMsdBondCallYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdBondCallYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdBondCallYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdBondCallYy
			                 ,MSD_BOND_CALL_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBondCallYy", beginMsdBondCallYy,MSD_BOND_CALL_YY_LEN);
    }
   	}




}
  

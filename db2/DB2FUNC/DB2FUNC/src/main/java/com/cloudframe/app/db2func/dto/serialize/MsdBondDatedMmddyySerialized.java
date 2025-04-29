package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class MsdBondDatedMmddyySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdBondDatedMmddyySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdBondDatedMmddyySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_BOND_DATED_MMDDYY_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdBondDatedMm;
            protected  int beginMsdBondDatedDd;
            protected  int beginMsdBondDatedYy;
	
	/**
	* Constructor for MsdBondDatedMmddyySerialized
	**/
    public MsdBondDatedMmddyySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdBondDatedMmddyySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdBondDatedMmddyySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdBondDatedMmddyySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2565); // serialize this field at offset 2565 by default 
    }
    
	/**
	* sets parent for this MsdBondDatedMmddyySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2565 by default
    }    
	/**
	* initializes the field in MsdBondDatedMmddyySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_BOND_DATED_MMDDYY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdBondDatedMm = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdBondDatedDd = getStartOffset() + 2;	// set offset for serialization
  
             beginMsdBondDatedYy = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdBondDatedMmCounter = -1;
     public boolean isMsdBondDatedMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondDatedMmCounter != sharedCounter;
         localMsdBondDatedMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdBondDatedMm
	 *	@return msdBondDatedMm
	 */
	public char[]  getMsdBondDatedMmString() {
	     return getCharArray(beginMsdBondDatedMm,MSD_BOND_DATED_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBondDatedMmIsNumeric() {
	    return isNumeric(beginMsdBondDatedMm
	                    ,beginMsdBondDatedMm + MSD_BOND_DATED_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_BOND_DATED_MM_LEN = 2;
  	/**
	 * serializeMsdBondDatedMm
	 */
	protected void serializeMsdBondDatedMm(int msdBondDatedMm) {
		 putNumber(beginMsdBondDatedMm,msdBondDatedMm,MSD_BOND_DATED_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBondDatedMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdBondDatedMm
	 */
   	protected  int serializeMsdBondDatedMm(char[] value) {
	    int  msdBondDatedMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdBondDatedMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdBondDatedMm
		       ,2
		      );
		 localMsdBondDatedMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdBondDatedMm;
    }

   protected int checkMsdBondDatedMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdBondDatedMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdBondDatedMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdBondDatedMm
			                 ,MSD_BOND_DATED_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBondDatedMm", beginMsdBondDatedMm,MSD_BOND_DATED_MM_LEN);
    }
   	}
     int localMsdBondDatedDdCounter = -1;
     public boolean isMsdBondDatedDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondDatedDdCounter != sharedCounter;
         localMsdBondDatedDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdBondDatedDd
	 *	@return msdBondDatedDd
	 */
	public char[]  getMsdBondDatedDdString() {
	     return getCharArray(beginMsdBondDatedDd,MSD_BOND_DATED_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBondDatedDdIsNumeric() {
	    return isNumeric(beginMsdBondDatedDd
	                    ,beginMsdBondDatedDd + MSD_BOND_DATED_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_BOND_DATED_DD_LEN = 2;
  	/**
	 * serializeMsdBondDatedDd
	 */
	protected void serializeMsdBondDatedDd(int msdBondDatedDd) {
		 putNumber(beginMsdBondDatedDd,msdBondDatedDd,MSD_BOND_DATED_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBondDatedDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdBondDatedDd
	 */
   	protected  int serializeMsdBondDatedDd(char[] value) {
	    int  msdBondDatedDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdBondDatedDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdBondDatedDd
		       ,2
		      );
		 localMsdBondDatedDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdBondDatedDd;
    }

   protected int checkMsdBondDatedDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdBondDatedDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdBondDatedDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdBondDatedDd
			                 ,MSD_BOND_DATED_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBondDatedDd", beginMsdBondDatedDd,MSD_BOND_DATED_DD_LEN);
    }
   	}
     int localMsdBondDatedYyCounter = -1;
     public boolean isMsdBondDatedYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondDatedYyCounter != sharedCounter;
         localMsdBondDatedYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdBondDatedYy
	 *	@return msdBondDatedYy
	 */
	public char[]  getMsdBondDatedYyString() {
	     return getCharArray(beginMsdBondDatedYy,MSD_BOND_DATED_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBondDatedYyIsNumeric() {
	    return isNumeric(beginMsdBondDatedYy
	                    ,beginMsdBondDatedYy + MSD_BOND_DATED_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_BOND_DATED_YY_LEN = 2;
  	/**
	 * serializeMsdBondDatedYy
	 */
	protected void serializeMsdBondDatedYy(int msdBondDatedYy) {
		 putNumber(beginMsdBondDatedYy,msdBondDatedYy,MSD_BOND_DATED_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBondDatedYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdBondDatedYy
	 */
   	protected  int serializeMsdBondDatedYy(char[] value) {
	    int  msdBondDatedYy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdBondDatedYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdBondDatedYy
		       ,2
		      );
		 localMsdBondDatedYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdBondDatedYy;
    }

   protected int checkMsdBondDatedYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdBondDatedYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdBondDatedYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdBondDatedYy
			                 ,MSD_BOND_DATED_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBondDatedYy", beginMsdBondDatedYy,MSD_BOND_DATED_YY_LEN);
    }
   	}




}
  

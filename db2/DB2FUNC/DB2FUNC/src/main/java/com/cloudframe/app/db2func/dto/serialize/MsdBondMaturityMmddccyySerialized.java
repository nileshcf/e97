package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class MsdBondMaturityMmddccyySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdBondMaturityMmddccyySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdBondMaturityMmddccyySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_BOND_MATURITY_MMDDCCYY_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdBondMaturityMm;
            protected  int beginMsdBondMaturityDd;
            protected  int beginMsdBondMaturityCc;
            protected  int beginMsdBondMaturityYy;
	
	/**
	* Constructor for MsdBondMaturityMmddccyySerialized
	**/
    public MsdBondMaturityMmddccyySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdBondMaturityMmddccyySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdBondMaturityMmddccyySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdBondMaturityMmddccyySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2553); // serialize this field at offset 2553 by default 
    }
    
	/**
	* sets parent for this MsdBondMaturityMmddccyySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2553 by default
    }    
	/**
	* initializes the field in MsdBondMaturityMmddccyySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_BOND_MATURITY_MMDDCCYY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdBondMaturityMm = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdBondMaturityDd = getStartOffset() + 2;	// set offset for serialization
  
             beginMsdBondMaturityCc = getStartOffset() + 4;	// set offset for serialization
  
             beginMsdBondMaturityYy = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdBondMaturityMmCounter = -1;
     public boolean isMsdBondMaturityMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondMaturityMmCounter != sharedCounter;
         localMsdBondMaturityMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdBondMaturityMm
	 *	@return msdBondMaturityMm
	 */
	public char[]  getMsdBondMaturityMmString() {
	     return getCharArray(beginMsdBondMaturityMm,MSD_BOND_MATURITY_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBondMaturityMmIsNumeric() {
	    return isNumeric(beginMsdBondMaturityMm
	                    ,beginMsdBondMaturityMm + MSD_BOND_MATURITY_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_BOND_MATURITY_MM_LEN = 2;
  	/**
	 * serializeMsdBondMaturityMm
	 */
	protected void serializeMsdBondMaturityMm(int msdBondMaturityMm) {
		 putNumber(beginMsdBondMaturityMm,msdBondMaturityMm,MSD_BOND_MATURITY_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBondMaturityMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdBondMaturityMm
	 */
   	protected  int serializeMsdBondMaturityMm(char[] value) {
	    int  msdBondMaturityMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdBondMaturityMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdBondMaturityMm
		       ,2
		      );
		 localMsdBondMaturityMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdBondMaturityMm;
    }

   protected int checkMsdBondMaturityMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdBondMaturityMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdBondMaturityMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdBondMaturityMm
			                 ,MSD_BOND_MATURITY_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBondMaturityMm", beginMsdBondMaturityMm,MSD_BOND_MATURITY_MM_LEN);
    }
   	}
     int localMsdBondMaturityDdCounter = -1;
     public boolean isMsdBondMaturityDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondMaturityDdCounter != sharedCounter;
         localMsdBondMaturityDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdBondMaturityDd
	 *	@return msdBondMaturityDd
	 */
	public char[]  getMsdBondMaturityDdString() {
	     return getCharArray(beginMsdBondMaturityDd,MSD_BOND_MATURITY_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBondMaturityDdIsNumeric() {
	    return isNumeric(beginMsdBondMaturityDd
	                    ,beginMsdBondMaturityDd + MSD_BOND_MATURITY_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_BOND_MATURITY_DD_LEN = 2;
  	/**
	 * serializeMsdBondMaturityDd
	 */
	protected void serializeMsdBondMaturityDd(int msdBondMaturityDd) {
		 putNumber(beginMsdBondMaturityDd,msdBondMaturityDd,MSD_BOND_MATURITY_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBondMaturityDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdBondMaturityDd
	 */
   	protected  int serializeMsdBondMaturityDd(char[] value) {
	    int  msdBondMaturityDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdBondMaturityDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdBondMaturityDd
		       ,2
		      );
		 localMsdBondMaturityDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdBondMaturityDd;
    }

   protected int checkMsdBondMaturityDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdBondMaturityDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdBondMaturityDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdBondMaturityDd
			                 ,MSD_BOND_MATURITY_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBondMaturityDd", beginMsdBondMaturityDd,MSD_BOND_MATURITY_DD_LEN);
    }
   	}
     int localMsdBondMaturityCcCounter = -1;
     public boolean isMsdBondMaturityCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondMaturityCcCounter != sharedCounter;
         localMsdBondMaturityCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdBondMaturityCc
	 *	@return msdBondMaturityCc
	 */
	public char[]  getMsdBondMaturityCcString() {
	     return getCharArray(beginMsdBondMaturityCc,MSD_BOND_MATURITY_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBondMaturityCcIsNumeric() {
	    return isNumeric(beginMsdBondMaturityCc
	                    ,beginMsdBondMaturityCc + MSD_BOND_MATURITY_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_BOND_MATURITY_CC_LEN = 2;
  	/**
	 * serializeMsdBondMaturityCc
	 */
	protected void serializeMsdBondMaturityCc(int msdBondMaturityCc) {
		 putNumber(beginMsdBondMaturityCc,msdBondMaturityCc,MSD_BOND_MATURITY_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBondMaturityCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdBondMaturityCc
	 */
   	protected  int serializeMsdBondMaturityCc(char[] value) {
	    int  msdBondMaturityCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdBondMaturityCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdBondMaturityCc
		       ,2
		      );
		 localMsdBondMaturityCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdBondMaturityCc;
    }

   protected int checkMsdBondMaturityCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdBondMaturityCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdBondMaturityCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdBondMaturityCc
			                 ,MSD_BOND_MATURITY_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBondMaturityCc", beginMsdBondMaturityCc,MSD_BOND_MATURITY_CC_LEN);
    }
   	}
     int localMsdBondMaturityYyCounter = -1;
     public boolean isMsdBondMaturityYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondMaturityYyCounter != sharedCounter;
         localMsdBondMaturityYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdBondMaturityYy
	 *	@return msdBondMaturityYy
	 */
	public char[]  getMsdBondMaturityYyString() {
	     return getCharArray(beginMsdBondMaturityYy,MSD_BOND_MATURITY_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBondMaturityYyIsNumeric() {
	    return isNumeric(beginMsdBondMaturityYy
	                    ,beginMsdBondMaturityYy + MSD_BOND_MATURITY_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_BOND_MATURITY_YY_LEN = 2;
  	/**
	 * serializeMsdBondMaturityYy
	 */
	protected void serializeMsdBondMaturityYy(int msdBondMaturityYy) {
		 putNumber(beginMsdBondMaturityYy,msdBondMaturityYy,MSD_BOND_MATURITY_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBondMaturityYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdBondMaturityYy
	 */
   	protected  int serializeMsdBondMaturityYy(char[] value) {
	    int  msdBondMaturityYy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdBondMaturityYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdBondMaturityYy
		       ,2
		      );
		 localMsdBondMaturityYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdBondMaturityYy;
    }

   protected int checkMsdBondMaturityYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdBondMaturityYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdBondMaturityYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdBondMaturityYy
			                 ,MSD_BOND_MATURITY_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBondMaturityYy", beginMsdBondMaturityYy,MSD_BOND_MATURITY_YY_LEN);
    }
   	}




}
  

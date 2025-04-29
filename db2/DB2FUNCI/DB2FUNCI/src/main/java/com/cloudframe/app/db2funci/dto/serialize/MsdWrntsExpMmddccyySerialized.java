package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class MsdWrntsExpMmddccyySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:25. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdWrntsExpMmddccyySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdWrntsExpMmddccyySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_WRNTS_EXP_MMDDCCYY_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdWrntsExpMm;
            protected  int beginMsdWrntsExpDd;
            protected  int beginMsdWrntsExpCc;
            protected  int beginMsdWrntsExpYy;
	
	/**
	* Constructor for MsdWrntsExpMmddccyySerialized
	**/
    public MsdWrntsExpMmddccyySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdWrntsExpMmddccyySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdWrntsExpMmddccyySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdWrntsExpMmddccyySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2120); // serialize this field at offset 2120 by default 
    }
    
	/**
	* sets parent for this MsdWrntsExpMmddccyySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2120 by default
    }    
	/**
	* initializes the field in MsdWrntsExpMmddccyySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_WRNTS_EXP_MMDDCCYY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdWrntsExpMm = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdWrntsExpDd = getStartOffset() + 2;	// set offset for serialization
  
             beginMsdWrntsExpCc = getStartOffset() + 4;	// set offset for serialization
  
             beginMsdWrntsExpYy = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdWrntsExpMmCounter = -1;
     public boolean isMsdWrntsExpMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdWrntsExpMmCounter != sharedCounter;
         localMsdWrntsExpMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdWrntsExpMm
	 *	@return msdWrntsExpMm
	 */
	public char[]  getMsdWrntsExpMmString() {
	     return getCharArray(beginMsdWrntsExpMm,MSD_WRNTS_EXP_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdWrntsExpMmIsNumeric() {
	    return isNumeric(beginMsdWrntsExpMm
	                    ,beginMsdWrntsExpMm + MSD_WRNTS_EXP_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_WRNTS_EXP_MM_LEN = 2;
  	/**
	 * serializeMsdWrntsExpMm
	 */
	protected void serializeMsdWrntsExpMm(int msdWrntsExpMm) {
		 putNumber(beginMsdWrntsExpMm,msdWrntsExpMm,MSD_WRNTS_EXP_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdWrntsExpMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdWrntsExpMm
	 */
   	protected  int serializeMsdWrntsExpMm(char[] value) {
	    int  msdWrntsExpMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdWrntsExpMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdWrntsExpMm
		       ,2
		      );
		 localMsdWrntsExpMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdWrntsExpMm;
    }

   protected int checkMsdWrntsExpMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdWrntsExpMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdWrntsExpMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdWrntsExpMm
			                 ,MSD_WRNTS_EXP_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdWrntsExpMm", beginMsdWrntsExpMm,MSD_WRNTS_EXP_MM_LEN);
    }
   	}
     int localMsdWrntsExpDdCounter = -1;
     public boolean isMsdWrntsExpDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdWrntsExpDdCounter != sharedCounter;
         localMsdWrntsExpDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdWrntsExpDd
	 *	@return msdWrntsExpDd
	 */
	public char[]  getMsdWrntsExpDdString() {
	     return getCharArray(beginMsdWrntsExpDd,MSD_WRNTS_EXP_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdWrntsExpDdIsNumeric() {
	    return isNumeric(beginMsdWrntsExpDd
	                    ,beginMsdWrntsExpDd + MSD_WRNTS_EXP_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_WRNTS_EXP_DD_LEN = 2;
  	/**
	 * serializeMsdWrntsExpDd
	 */
	protected void serializeMsdWrntsExpDd(int msdWrntsExpDd) {
		 putNumber(beginMsdWrntsExpDd,msdWrntsExpDd,MSD_WRNTS_EXP_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdWrntsExpDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdWrntsExpDd
	 */
   	protected  int serializeMsdWrntsExpDd(char[] value) {
	    int  msdWrntsExpDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdWrntsExpDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdWrntsExpDd
		       ,2
		      );
		 localMsdWrntsExpDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdWrntsExpDd;
    }

   protected int checkMsdWrntsExpDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdWrntsExpDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdWrntsExpDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdWrntsExpDd
			                 ,MSD_WRNTS_EXP_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdWrntsExpDd", beginMsdWrntsExpDd,MSD_WRNTS_EXP_DD_LEN);
    }
   	}
     int localMsdWrntsExpCcCounter = -1;
     public boolean isMsdWrntsExpCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdWrntsExpCcCounter != sharedCounter;
         localMsdWrntsExpCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdWrntsExpCc
	 *	@return msdWrntsExpCc
	 */
	public char[]  getMsdWrntsExpCcString() {
	     return getCharArray(beginMsdWrntsExpCc,MSD_WRNTS_EXP_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdWrntsExpCcIsNumeric() {
	    return isNumeric(beginMsdWrntsExpCc
	                    ,beginMsdWrntsExpCc + MSD_WRNTS_EXP_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_WRNTS_EXP_CC_LEN = 2;
  	/**
	 * serializeMsdWrntsExpCc
	 */
	protected void serializeMsdWrntsExpCc(int msdWrntsExpCc) {
		 putNumber(beginMsdWrntsExpCc,msdWrntsExpCc,MSD_WRNTS_EXP_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdWrntsExpCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdWrntsExpCc
	 */
   	protected  int serializeMsdWrntsExpCc(char[] value) {
	    int  msdWrntsExpCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdWrntsExpCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdWrntsExpCc
		       ,2
		      );
		 localMsdWrntsExpCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdWrntsExpCc;
    }

   protected int checkMsdWrntsExpCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdWrntsExpCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdWrntsExpCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdWrntsExpCc
			                 ,MSD_WRNTS_EXP_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdWrntsExpCc", beginMsdWrntsExpCc,MSD_WRNTS_EXP_CC_LEN);
    }
   	}
     int localMsdWrntsExpYyCounter = -1;
     public boolean isMsdWrntsExpYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdWrntsExpYyCounter != sharedCounter;
         localMsdWrntsExpYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdWrntsExpYy
	 *	@return msdWrntsExpYy
	 */
	public char[]  getMsdWrntsExpYyString() {
	     return getCharArray(beginMsdWrntsExpYy,MSD_WRNTS_EXP_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdWrntsExpYyIsNumeric() {
	    return isNumeric(beginMsdWrntsExpYy
	                    ,beginMsdWrntsExpYy + MSD_WRNTS_EXP_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_WRNTS_EXP_YY_LEN = 2;
  	/**
	 * serializeMsdWrntsExpYy
	 */
	protected void serializeMsdWrntsExpYy(int msdWrntsExpYy) {
		 putNumber(beginMsdWrntsExpYy,msdWrntsExpYy,MSD_WRNTS_EXP_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdWrntsExpYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdWrntsExpYy
	 */
   	protected  int serializeMsdWrntsExpYy(char[] value) {
	    int  msdWrntsExpYy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdWrntsExpYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdWrntsExpYy
		       ,2
		      );
		 localMsdWrntsExpYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdWrntsExpYy;
    }

   protected int checkMsdWrntsExpYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdWrntsExpYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdWrntsExpYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdWrntsExpYy
			                 ,MSD_WRNTS_EXP_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdWrntsExpYy", beginMsdWrntsExpYy,MSD_WRNTS_EXP_YY_LEN);
    }
   	}




}
  

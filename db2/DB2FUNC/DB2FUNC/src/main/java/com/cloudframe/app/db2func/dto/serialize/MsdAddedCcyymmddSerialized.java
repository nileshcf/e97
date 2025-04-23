package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class MsdAddedCcyymmddSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdAddedCcyymmddSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdAddedCcyymmddSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_ADDED_CCYYMMDD_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdAddedCc;
            protected  int beginMsdAddedYymmdd;
	
	/**
	* Constructor for MsdAddedCcyymmddSerialized
	**/
    public MsdAddedCcyymmddSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdAddedCcyymmddSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdAddedCcyymmddSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdAddedCcyymmddSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,124); // serialize this field at offset 124 by default 
    }
    
	/**
	* sets parent for this MsdAddedCcyymmddSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 124 by default
    }    
	/**
	* initializes the field in MsdAddedCcyymmddSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_ADDED_CCYYMMDD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdAddedCc = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdAddedYymmdd = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdAddedCcCounter = -1;
     public boolean isMsdAddedCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdAddedCcCounter != sharedCounter;
         localMsdAddedCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdAddedCc
	 *	@return msdAddedCc
	 */
	public char[]  getMsdAddedCcString() {
	     return getCharArray(beginMsdAddedCc,MSD_ADDED_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdAddedCcIsNumeric() {
	    return isNumeric(beginMsdAddedCc
	                    ,beginMsdAddedCc + MSD_ADDED_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_ADDED_CC_LEN = 2;
  	/**
	 * serializeMsdAddedCc
	 */
	protected void serializeMsdAddedCc(int msdAddedCc) {
		 putNumber(beginMsdAddedCc,msdAddedCc,MSD_ADDED_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdAddedCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdAddedCc
	 */
   	protected  int serializeMsdAddedCc(char[] value) {
	    int  msdAddedCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdAddedCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdAddedCc
		       ,2
		      );
		 localMsdAddedCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdAddedCc;
    }

   protected int checkMsdAddedCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdAddedCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdAddedCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdAddedCc
			                 ,MSD_ADDED_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdAddedCc", beginMsdAddedCc,MSD_ADDED_CC_LEN);
    }
   	}
     int localMsdAddedYymmddCounter = -1;
     public boolean isMsdAddedYymmddModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdAddedYymmddCounter != sharedCounter;
         localMsdAddedYymmddCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdAddedYymmdd
	 *	@return msdAddedYymmdd
	 */
	public char[]  getMsdAddedYymmddString() {
	     return getCharArray(beginMsdAddedYymmdd,MSD_ADDED_YYMMDD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdAddedYymmddIsNumeric() {
	    return isNumeric(beginMsdAddedYymmdd
	                    ,beginMsdAddedYymmdd + MSD_ADDED_YYMMDD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_ADDED_YYMMDD_LEN = 6;
  	/**
	 * serializeMsdAddedYymmdd
	 */
	protected void serializeMsdAddedYymmdd(long msdAddedYymmdd) {
		 putNumber(beginMsdAddedYymmdd,msdAddedYymmdd,MSD_ADDED_YYMMDD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdAddedYymmddCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdAddedYymmdd
	 */
   	protected  long serializeMsdAddedYymmdd(char[] value) {
	    long  msdAddedYymmdd;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdAddedYymmdd = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMsdAddedYymmdd
		       ,6
		      );
		 localMsdAddedYymmddCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdAddedYymmdd;
    }

   protected long checkMsdAddedYymmddMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdAddedYymmdd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdAddedYymmdd() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdAddedYymmdd
			                 ,MSD_ADDED_YYMMDD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdAddedYymmdd", beginMsdAddedYymmdd,MSD_ADDED_YYMMDD_LEN);
    }
   	}




}
  

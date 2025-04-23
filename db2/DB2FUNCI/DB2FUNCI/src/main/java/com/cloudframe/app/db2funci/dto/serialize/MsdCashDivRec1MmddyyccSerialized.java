package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class MsdCashDivRec1MmddyyccSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdCashDivRec1MmddyyccSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdCashDivRec1MmddyyccSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_CASH_DIV_REC_1_MMDDYYCC_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdCashDivRec1Mmddyy;
            protected  int beginMsdCashDivRec1Cc;
	
	/**
	* Constructor for MsdCashDivRec1MmddyyccSerialized
	**/
    public MsdCashDivRec1MmddyyccSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdCashDivRec1MmddyyccSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdCashDivRec1MmddyyccSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdCashDivRec1MmddyyccSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1507); // serialize this field at offset 1507 by default 
    }
    
	/**
	* sets parent for this MsdCashDivRec1MmddyyccSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1507 by default
    }    
	/**
	* initializes the field in MsdCashDivRec1MmddyyccSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_CASH_DIV_REC_1_MMDDYYCC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdCashDivRec1Mmddyy = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdCashDivRec1Cc = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdCashDivRec1MmddyyCounter = -1;
     public boolean isMsdCashDivRec1MmddyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCashDivRec1MmddyyCounter != sharedCounter;
         localMsdCashDivRec1MmddyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdCashDivRec1Mmddyy
	 *	@return msdCashDivRec1Mmddyy
	 */
	public char[]  getMsdCashDivRec1MmddyyString() {
	     return getCharArray(beginMsdCashDivRec1Mmddyy,MSD_CASH_DIV_REC_1_MMDDYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdCashDivRec1MmddyyIsNumeric() {
	    return isNumeric(beginMsdCashDivRec1Mmddyy
	                    ,beginMsdCashDivRec1Mmddyy + MSD_CASH_DIV_REC_1_MMDDYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_CASH_DIV_REC_1_MMDDYY_LEN = 6;
  	/**
	 * serializeMsdCashDivRec1Mmddyy
	 */
	protected void serializeMsdCashDivRec1Mmddyy(long msdCashDivRec1Mmddyy) {
		 putNumber(beginMsdCashDivRec1Mmddyy,msdCashDivRec1Mmddyy,MSD_CASH_DIV_REC_1_MMDDYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdCashDivRec1MmddyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdCashDivRec1Mmddyy
	 */
   	protected  long serializeMsdCashDivRec1Mmddyy(char[] value) {
	    long  msdCashDivRec1Mmddyy;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdCashDivRec1Mmddyy = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMsdCashDivRec1Mmddyy
		       ,6
		      );
		 localMsdCashDivRec1MmddyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdCashDivRec1Mmddyy;
    }

   protected long checkMsdCashDivRec1MmddyyMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdCashDivRec1Mmddyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdCashDivRec1Mmddyy() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdCashDivRec1Mmddyy
			                 ,MSD_CASH_DIV_REC_1_MMDDYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdCashDivRec1Mmddyy", beginMsdCashDivRec1Mmddyy,MSD_CASH_DIV_REC_1_MMDDYY_LEN);
    }
   	}
     int localMsdCashDivRec1CcCounter = -1;
     public boolean isMsdCashDivRec1CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCashDivRec1CcCounter != sharedCounter;
         localMsdCashDivRec1CcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdCashDivRec1Cc
	 *	@return msdCashDivRec1Cc
	 */
	public char[]  getMsdCashDivRec1CcString() {
	     return getCharArray(beginMsdCashDivRec1Cc,MSD_CASH_DIV_REC_1_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdCashDivRec1CcIsNumeric() {
	    return isNumeric(beginMsdCashDivRec1Cc
	                    ,beginMsdCashDivRec1Cc + MSD_CASH_DIV_REC_1_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_CASH_DIV_REC_1_CC_LEN = 2;
  	/**
	 * serializeMsdCashDivRec1Cc
	 */
	protected void serializeMsdCashDivRec1Cc(int msdCashDivRec1Cc) {
		 putNumber(beginMsdCashDivRec1Cc,msdCashDivRec1Cc,MSD_CASH_DIV_REC_1_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdCashDivRec1CcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdCashDivRec1Cc
	 */
   	protected  int serializeMsdCashDivRec1Cc(char[] value) {
	    int  msdCashDivRec1Cc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdCashDivRec1Cc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdCashDivRec1Cc
		       ,2
		      );
		 localMsdCashDivRec1CcCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdCashDivRec1Cc;
    }

   protected int checkMsdCashDivRec1CcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdCashDivRec1Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdCashDivRec1Cc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdCashDivRec1Cc
			                 ,MSD_CASH_DIV_REC_1_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdCashDivRec1Cc", beginMsdCashDivRec1Cc,MSD_CASH_DIV_REC_1_CC_LEN);
    }
   	}




}
  

package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class MsdCashDivRec2MmddyyccSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdCashDivRec2MmddyyccSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdCashDivRec2MmddyyccSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_CASH_DIV_REC_2_MMDDYYCC_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdCashDivRec2Mmddyy;
            protected  int beginMsdCashDivRec2Cc;
	
	/**
	* Constructor for MsdCashDivRec2MmddyyccSerialized
	**/
    public MsdCashDivRec2MmddyyccSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdCashDivRec2MmddyyccSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdCashDivRec2MmddyyccSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdCashDivRec2MmddyyccSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1590); // serialize this field at offset 1590 by default 
    }
    
	/**
	* sets parent for this MsdCashDivRec2MmddyyccSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1590 by default
    }    
	/**
	* initializes the field in MsdCashDivRec2MmddyyccSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_CASH_DIV_REC_2_MMDDYYCC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdCashDivRec2Mmddyy = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdCashDivRec2Cc = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdCashDivRec2MmddyyCounter = -1;
     public boolean isMsdCashDivRec2MmddyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCashDivRec2MmddyyCounter != sharedCounter;
         localMsdCashDivRec2MmddyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdCashDivRec2Mmddyy
	 *	@return msdCashDivRec2Mmddyy
	 */
	public char[]  getMsdCashDivRec2MmddyyString() {
	     return getCharArray(beginMsdCashDivRec2Mmddyy,MSD_CASH_DIV_REC_2_MMDDYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdCashDivRec2MmddyyIsNumeric() {
	    return isNumeric(beginMsdCashDivRec2Mmddyy
	                    ,beginMsdCashDivRec2Mmddyy + MSD_CASH_DIV_REC_2_MMDDYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_CASH_DIV_REC_2_MMDDYY_LEN = 6;
  	/**
	 * serializeMsdCashDivRec2Mmddyy
	 */
	protected void serializeMsdCashDivRec2Mmddyy(long msdCashDivRec2Mmddyy) {
		 putNumber(beginMsdCashDivRec2Mmddyy,msdCashDivRec2Mmddyy,MSD_CASH_DIV_REC_2_MMDDYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdCashDivRec2MmddyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdCashDivRec2Mmddyy
	 */
   	protected  long serializeMsdCashDivRec2Mmddyy(char[] value) {
	    long  msdCashDivRec2Mmddyy;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdCashDivRec2Mmddyy = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMsdCashDivRec2Mmddyy
		       ,6
		      );
		 localMsdCashDivRec2MmddyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdCashDivRec2Mmddyy;
    }

   protected long checkMsdCashDivRec2MmddyyMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdCashDivRec2Mmddyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdCashDivRec2Mmddyy() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdCashDivRec2Mmddyy
			                 ,MSD_CASH_DIV_REC_2_MMDDYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdCashDivRec2Mmddyy", beginMsdCashDivRec2Mmddyy,MSD_CASH_DIV_REC_2_MMDDYY_LEN);
    }
   	}
     int localMsdCashDivRec2CcCounter = -1;
     public boolean isMsdCashDivRec2CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCashDivRec2CcCounter != sharedCounter;
         localMsdCashDivRec2CcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdCashDivRec2Cc
	 *	@return msdCashDivRec2Cc
	 */
	public char[]  getMsdCashDivRec2CcString() {
	     return getCharArray(beginMsdCashDivRec2Cc,MSD_CASH_DIV_REC_2_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdCashDivRec2CcIsNumeric() {
	    return isNumeric(beginMsdCashDivRec2Cc
	                    ,beginMsdCashDivRec2Cc + MSD_CASH_DIV_REC_2_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_CASH_DIV_REC_2_CC_LEN = 2;
  	/**
	 * serializeMsdCashDivRec2Cc
	 */
	protected void serializeMsdCashDivRec2Cc(int msdCashDivRec2Cc) {
		 putNumber(beginMsdCashDivRec2Cc,msdCashDivRec2Cc,MSD_CASH_DIV_REC_2_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdCashDivRec2CcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdCashDivRec2Cc
	 */
   	protected  int serializeMsdCashDivRec2Cc(char[] value) {
	    int  msdCashDivRec2Cc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdCashDivRec2Cc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdCashDivRec2Cc
		       ,2
		      );
		 localMsdCashDivRec2CcCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdCashDivRec2Cc;
    }

   protected int checkMsdCashDivRec2CcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdCashDivRec2Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdCashDivRec2Cc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdCashDivRec2Cc
			                 ,MSD_CASH_DIV_REC_2_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdCashDivRec2Cc", beginMsdCashDivRec2Cc,MSD_CASH_DIV_REC_2_CC_LEN);
    }
   	}




}
  

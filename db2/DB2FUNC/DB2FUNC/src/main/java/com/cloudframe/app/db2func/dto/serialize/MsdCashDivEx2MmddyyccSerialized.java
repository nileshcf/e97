package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class MsdCashDivEx2MmddyyccSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdCashDivEx2MmddyyccSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdCashDivEx2MmddyyccSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_CASH_DIV_EX_2_MMDDYYCC_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdCashDivEx2Mmddyy;
            protected  int beginMsdCashDivEx2Cc;
	
	/**
	* Constructor for MsdCashDivEx2MmddyyccSerialized
	**/
    public MsdCashDivEx2MmddyyccSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdCashDivEx2MmddyyccSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdCashDivEx2MmddyyccSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdCashDivEx2MmddyyccSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1613); // serialize this field at offset 1613 by default 
    }
    
	/**
	* sets parent for this MsdCashDivEx2MmddyyccSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1613 by default
    }    
	/**
	* initializes the field in MsdCashDivEx2MmddyyccSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_CASH_DIV_EX_2_MMDDYYCC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdCashDivEx2Mmddyy = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdCashDivEx2Cc = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdCashDivEx2MmddyyCounter = -1;
     public boolean isMsdCashDivEx2MmddyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCashDivEx2MmddyyCounter != sharedCounter;
         localMsdCashDivEx2MmddyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdCashDivEx2Mmddyy
	 *	@return msdCashDivEx2Mmddyy
	 */
	public char[]  getMsdCashDivEx2MmddyyString() {
	     return getCharArray(beginMsdCashDivEx2Mmddyy,MSD_CASH_DIV_EX_2_MMDDYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdCashDivEx2MmddyyIsNumeric() {
	    return isNumeric(beginMsdCashDivEx2Mmddyy
	                    ,beginMsdCashDivEx2Mmddyy + MSD_CASH_DIV_EX_2_MMDDYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_CASH_DIV_EX_2_MMDDYY_LEN = 6;
  	/**
	 * serializeMsdCashDivEx2Mmddyy
	 */
	protected void serializeMsdCashDivEx2Mmddyy(long msdCashDivEx2Mmddyy) {
		 putNumber(beginMsdCashDivEx2Mmddyy,msdCashDivEx2Mmddyy,MSD_CASH_DIV_EX_2_MMDDYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdCashDivEx2MmddyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdCashDivEx2Mmddyy
	 */
   	protected  long serializeMsdCashDivEx2Mmddyy(char[] value) {
	    long  msdCashDivEx2Mmddyy;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdCashDivEx2Mmddyy = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMsdCashDivEx2Mmddyy
		       ,6
		      );
		 localMsdCashDivEx2MmddyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdCashDivEx2Mmddyy;
    }

   protected long checkMsdCashDivEx2MmddyyMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdCashDivEx2Mmddyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdCashDivEx2Mmddyy() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdCashDivEx2Mmddyy
			                 ,MSD_CASH_DIV_EX_2_MMDDYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdCashDivEx2Mmddyy", beginMsdCashDivEx2Mmddyy,MSD_CASH_DIV_EX_2_MMDDYY_LEN);
    }
   	}
     int localMsdCashDivEx2CcCounter = -1;
     public boolean isMsdCashDivEx2CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCashDivEx2CcCounter != sharedCounter;
         localMsdCashDivEx2CcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdCashDivEx2Cc
	 *	@return msdCashDivEx2Cc
	 */
	public char[]  getMsdCashDivEx2CcString() {
	     return getCharArray(beginMsdCashDivEx2Cc,MSD_CASH_DIV_EX_2_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdCashDivEx2CcIsNumeric() {
	    return isNumeric(beginMsdCashDivEx2Cc
	                    ,beginMsdCashDivEx2Cc + MSD_CASH_DIV_EX_2_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_CASH_DIV_EX_2_CC_LEN = 2;
  	/**
	 * serializeMsdCashDivEx2Cc
	 */
	protected void serializeMsdCashDivEx2Cc(int msdCashDivEx2Cc) {
		 putNumber(beginMsdCashDivEx2Cc,msdCashDivEx2Cc,MSD_CASH_DIV_EX_2_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdCashDivEx2CcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdCashDivEx2Cc
	 */
   	protected  int serializeMsdCashDivEx2Cc(char[] value) {
	    int  msdCashDivEx2Cc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdCashDivEx2Cc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdCashDivEx2Cc
		       ,2
		      );
		 localMsdCashDivEx2CcCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdCashDivEx2Cc;
    }

   protected int checkMsdCashDivEx2CcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdCashDivEx2Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdCashDivEx2Cc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdCashDivEx2Cc
			                 ,MSD_CASH_DIV_EX_2_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdCashDivEx2Cc", beginMsdCashDivEx2Cc,MSD_CASH_DIV_EX_2_CC_LEN);
    }
   	}




}
  

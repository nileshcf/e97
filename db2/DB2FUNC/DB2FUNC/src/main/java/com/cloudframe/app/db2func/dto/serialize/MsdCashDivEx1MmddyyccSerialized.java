package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class MsdCashDivEx1MmddyyccSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdCashDivEx1MmddyyccSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdCashDivEx1MmddyyccSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_CASH_DIV_EX_1_MMDDYYCC_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdCashDivEx1Mmddyy;
            protected  int beginMsdCashDivEx1Cc;
	
	/**
	* Constructor for MsdCashDivEx1MmddyyccSerialized
	**/
    public MsdCashDivEx1MmddyyccSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdCashDivEx1MmddyyccSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdCashDivEx1MmddyyccSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdCashDivEx1MmddyyccSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1530); // serialize this field at offset 1530 by default 
    }
    
	/**
	* sets parent for this MsdCashDivEx1MmddyyccSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1530 by default
    }    
	/**
	* initializes the field in MsdCashDivEx1MmddyyccSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_CASH_DIV_EX_1_MMDDYYCC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdCashDivEx1Mmddyy = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdCashDivEx1Cc = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdCashDivEx1MmddyyCounter = -1;
     public boolean isMsdCashDivEx1MmddyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCashDivEx1MmddyyCounter != sharedCounter;
         localMsdCashDivEx1MmddyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdCashDivEx1Mmddyy
	 *	@return msdCashDivEx1Mmddyy
	 */
	public char[]  getMsdCashDivEx1MmddyyString() {
	     return getCharArray(beginMsdCashDivEx1Mmddyy,MSD_CASH_DIV_EX_1_MMDDYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdCashDivEx1MmddyyIsNumeric() {
	    return isNumeric(beginMsdCashDivEx1Mmddyy
	                    ,beginMsdCashDivEx1Mmddyy + MSD_CASH_DIV_EX_1_MMDDYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_CASH_DIV_EX_1_MMDDYY_LEN = 6;
  	/**
	 * serializeMsdCashDivEx1Mmddyy
	 */
	protected void serializeMsdCashDivEx1Mmddyy(long msdCashDivEx1Mmddyy) {
		 putNumber(beginMsdCashDivEx1Mmddyy,msdCashDivEx1Mmddyy,MSD_CASH_DIV_EX_1_MMDDYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdCashDivEx1MmddyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdCashDivEx1Mmddyy
	 */
   	protected  long serializeMsdCashDivEx1Mmddyy(char[] value) {
	    long  msdCashDivEx1Mmddyy;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdCashDivEx1Mmddyy = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMsdCashDivEx1Mmddyy
		       ,6
		      );
		 localMsdCashDivEx1MmddyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdCashDivEx1Mmddyy;
    }

   protected long checkMsdCashDivEx1MmddyyMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdCashDivEx1Mmddyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdCashDivEx1Mmddyy() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdCashDivEx1Mmddyy
			                 ,MSD_CASH_DIV_EX_1_MMDDYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdCashDivEx1Mmddyy", beginMsdCashDivEx1Mmddyy,MSD_CASH_DIV_EX_1_MMDDYY_LEN);
    }
   	}
     int localMsdCashDivEx1CcCounter = -1;
     public boolean isMsdCashDivEx1CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCashDivEx1CcCounter != sharedCounter;
         localMsdCashDivEx1CcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdCashDivEx1Cc
	 *	@return msdCashDivEx1Cc
	 */
	public char[]  getMsdCashDivEx1CcString() {
	     return getCharArray(beginMsdCashDivEx1Cc,MSD_CASH_DIV_EX_1_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdCashDivEx1CcIsNumeric() {
	    return isNumeric(beginMsdCashDivEx1Cc
	                    ,beginMsdCashDivEx1Cc + MSD_CASH_DIV_EX_1_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_CASH_DIV_EX_1_CC_LEN = 2;
  	/**
	 * serializeMsdCashDivEx1Cc
	 */
	protected void serializeMsdCashDivEx1Cc(int msdCashDivEx1Cc) {
		 putNumber(beginMsdCashDivEx1Cc,msdCashDivEx1Cc,MSD_CASH_DIV_EX_1_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdCashDivEx1CcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdCashDivEx1Cc
	 */
   	protected  int serializeMsdCashDivEx1Cc(char[] value) {
	    int  msdCashDivEx1Cc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdCashDivEx1Cc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdCashDivEx1Cc
		       ,2
		      );
		 localMsdCashDivEx1CcCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdCashDivEx1Cc;
    }

   protected int checkMsdCashDivEx1CcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdCashDivEx1Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdCashDivEx1Cc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdCashDivEx1Cc
			                 ,MSD_CASH_DIV_EX_1_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdCashDivEx1Cc", beginMsdCashDivEx1Cc,MSD_CASH_DIV_EX_1_CC_LEN);
    }
   	}




}
  

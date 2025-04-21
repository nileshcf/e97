package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class MsdCashDivPay1MmddyyccSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdCashDivPay1MmddyyccSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdCashDivPay1MmddyyccSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_CASH_DIV_PAY_1_MMDDYYCC_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdCashDivPay1Mmddyy;
            protected  int beginMsdCashDivPay1Cc;
	
	/**
	* Constructor for MsdCashDivPay1MmddyyccSerialized
	**/
    public MsdCashDivPay1MmddyyccSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdCashDivPay1MmddyyccSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdCashDivPay1MmddyyccSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdCashDivPay1MmddyyccSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1538); // serialize this field at offset 1538 by default 
    }
    
	/**
	* sets parent for this MsdCashDivPay1MmddyyccSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1538 by default
    }    
	/**
	* initializes the field in MsdCashDivPay1MmddyyccSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_CASH_DIV_PAY_1_MMDDYYCC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdCashDivPay1Mmddyy = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdCashDivPay1Cc = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdCashDivPay1MmddyyCounter = -1;
     public boolean isMsdCashDivPay1MmddyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCashDivPay1MmddyyCounter != sharedCounter;
         localMsdCashDivPay1MmddyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdCashDivPay1Mmddyy
	 *	@return msdCashDivPay1Mmddyy
	 */
	public char[]  getMsdCashDivPay1MmddyyString() {
	     return getCharArray(beginMsdCashDivPay1Mmddyy,MSD_CASH_DIV_PAY_1_MMDDYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdCashDivPay1MmddyyIsNumeric() {
	    return isNumeric(beginMsdCashDivPay1Mmddyy
	                    ,beginMsdCashDivPay1Mmddyy + MSD_CASH_DIV_PAY_1_MMDDYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_CASH_DIV_PAY_1_MMDDYY_LEN = 6;
  	/**
	 * serializeMsdCashDivPay1Mmddyy
	 */
	protected void serializeMsdCashDivPay1Mmddyy(long msdCashDivPay1Mmddyy) {
		 putNumber(beginMsdCashDivPay1Mmddyy,msdCashDivPay1Mmddyy,MSD_CASH_DIV_PAY_1_MMDDYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdCashDivPay1MmddyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdCashDivPay1Mmddyy
	 */
   	protected  long serializeMsdCashDivPay1Mmddyy(char[] value) {
	    long  msdCashDivPay1Mmddyy;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdCashDivPay1Mmddyy = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMsdCashDivPay1Mmddyy
		       ,6
		      );
		 localMsdCashDivPay1MmddyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdCashDivPay1Mmddyy;
    }

   protected long checkMsdCashDivPay1MmddyyMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdCashDivPay1Mmddyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdCashDivPay1Mmddyy() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdCashDivPay1Mmddyy
			                 ,MSD_CASH_DIV_PAY_1_MMDDYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdCashDivPay1Mmddyy", beginMsdCashDivPay1Mmddyy,MSD_CASH_DIV_PAY_1_MMDDYY_LEN);
    }
   	}
     int localMsdCashDivPay1CcCounter = -1;
     public boolean isMsdCashDivPay1CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCashDivPay1CcCounter != sharedCounter;
         localMsdCashDivPay1CcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdCashDivPay1Cc
	 *	@return msdCashDivPay1Cc
	 */
	public char[]  getMsdCashDivPay1CcString() {
	     return getCharArray(beginMsdCashDivPay1Cc,MSD_CASH_DIV_PAY_1_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdCashDivPay1CcIsNumeric() {
	    return isNumeric(beginMsdCashDivPay1Cc
	                    ,beginMsdCashDivPay1Cc + MSD_CASH_DIV_PAY_1_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_CASH_DIV_PAY_1_CC_LEN = 2;
  	/**
	 * serializeMsdCashDivPay1Cc
	 */
	protected void serializeMsdCashDivPay1Cc(int msdCashDivPay1Cc) {
		 putNumber(beginMsdCashDivPay1Cc,msdCashDivPay1Cc,MSD_CASH_DIV_PAY_1_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdCashDivPay1CcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdCashDivPay1Cc
	 */
   	protected  int serializeMsdCashDivPay1Cc(char[] value) {
	    int  msdCashDivPay1Cc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdCashDivPay1Cc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdCashDivPay1Cc
		       ,2
		      );
		 localMsdCashDivPay1CcCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdCashDivPay1Cc;
    }

   protected int checkMsdCashDivPay1CcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdCashDivPay1Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdCashDivPay1Cc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdCashDivPay1Cc
			                 ,MSD_CASH_DIV_PAY_1_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdCashDivPay1Cc", beginMsdCashDivPay1Cc,MSD_CASH_DIV_PAY_1_CC_LEN);
    }
   	}




}
  

package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class MsdCashDivPay2MmddyyccSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdCashDivPay2MmddyyccSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdCashDivPay2MmddyyccSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_CASH_DIV_PAY_2_MMDDYYCC_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdCashDivPay2Mmddyy;
            protected  int beginMsdCashDivPay2Cc;
	
	/**
	* Constructor for MsdCashDivPay2MmddyyccSerialized
	**/
    public MsdCashDivPay2MmddyyccSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdCashDivPay2MmddyyccSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdCashDivPay2MmddyyccSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdCashDivPay2MmddyyccSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1621); // serialize this field at offset 1621 by default 
    }
    
	/**
	* sets parent for this MsdCashDivPay2MmddyyccSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1621 by default
    }    
	/**
	* initializes the field in MsdCashDivPay2MmddyyccSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_CASH_DIV_PAY_2_MMDDYYCC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdCashDivPay2Mmddyy = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdCashDivPay2Cc = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdCashDivPay2MmddyyCounter = -1;
     public boolean isMsdCashDivPay2MmddyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCashDivPay2MmddyyCounter != sharedCounter;
         localMsdCashDivPay2MmddyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdCashDivPay2Mmddyy
	 *	@return msdCashDivPay2Mmddyy
	 */
	public char[]  getMsdCashDivPay2MmddyyString() {
	     return getCharArray(beginMsdCashDivPay2Mmddyy,MSD_CASH_DIV_PAY_2_MMDDYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdCashDivPay2MmddyyIsNumeric() {
	    return isNumeric(beginMsdCashDivPay2Mmddyy
	                    ,beginMsdCashDivPay2Mmddyy + MSD_CASH_DIV_PAY_2_MMDDYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_CASH_DIV_PAY_2_MMDDYY_LEN = 6;
  	/**
	 * serializeMsdCashDivPay2Mmddyy
	 */
	protected void serializeMsdCashDivPay2Mmddyy(long msdCashDivPay2Mmddyy) {
		 putNumber(beginMsdCashDivPay2Mmddyy,msdCashDivPay2Mmddyy,MSD_CASH_DIV_PAY_2_MMDDYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdCashDivPay2MmddyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdCashDivPay2Mmddyy
	 */
   	protected  long serializeMsdCashDivPay2Mmddyy(char[] value) {
	    long  msdCashDivPay2Mmddyy;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdCashDivPay2Mmddyy = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMsdCashDivPay2Mmddyy
		       ,6
		      );
		 localMsdCashDivPay2MmddyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdCashDivPay2Mmddyy;
    }

   protected long checkMsdCashDivPay2MmddyyMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdCashDivPay2Mmddyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdCashDivPay2Mmddyy() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdCashDivPay2Mmddyy
			                 ,MSD_CASH_DIV_PAY_2_MMDDYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdCashDivPay2Mmddyy", beginMsdCashDivPay2Mmddyy,MSD_CASH_DIV_PAY_2_MMDDYY_LEN);
    }
   	}
     int localMsdCashDivPay2CcCounter = -1;
     public boolean isMsdCashDivPay2CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCashDivPay2CcCounter != sharedCounter;
         localMsdCashDivPay2CcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdCashDivPay2Cc
	 *	@return msdCashDivPay2Cc
	 */
	public char[]  getMsdCashDivPay2CcString() {
	     return getCharArray(beginMsdCashDivPay2Cc,MSD_CASH_DIV_PAY_2_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdCashDivPay2CcIsNumeric() {
	    return isNumeric(beginMsdCashDivPay2Cc
	                    ,beginMsdCashDivPay2Cc + MSD_CASH_DIV_PAY_2_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_CASH_DIV_PAY_2_CC_LEN = 2;
  	/**
	 * serializeMsdCashDivPay2Cc
	 */
	protected void serializeMsdCashDivPay2Cc(int msdCashDivPay2Cc) {
		 putNumber(beginMsdCashDivPay2Cc,msdCashDivPay2Cc,MSD_CASH_DIV_PAY_2_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdCashDivPay2CcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdCashDivPay2Cc
	 */
   	protected  int serializeMsdCashDivPay2Cc(char[] value) {
	    int  msdCashDivPay2Cc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdCashDivPay2Cc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdCashDivPay2Cc
		       ,2
		      );
		 localMsdCashDivPay2CcCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdCashDivPay2Cc;
    }

   protected int checkMsdCashDivPay2CcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdCashDivPay2Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdCashDivPay2Cc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdCashDivPay2Cc
			                 ,MSD_CASH_DIV_PAY_2_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdCashDivPay2Cc", beginMsdCashDivPay2Cc,MSD_CASH_DIV_PAY_2_CC_LEN);
    }
   	}




}
  

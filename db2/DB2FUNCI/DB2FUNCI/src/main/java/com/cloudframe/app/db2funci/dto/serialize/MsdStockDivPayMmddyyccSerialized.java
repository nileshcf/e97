package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class MsdStockDivPayMmddyyccSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdStockDivPayMmddyyccSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdStockDivPayMmddyyccSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_STOCK_DIV_PAY_MMDDYYCC_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdStockDivPayMmddyy;
            protected  int beginMsdStockDivPayCc;
	
	/**
	* Constructor for MsdStockDivPayMmddyyccSerialized
	**/
    public MsdStockDivPayMmddyyccSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdStockDivPayMmddyyccSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdStockDivPayMmddyyccSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdStockDivPayMmddyyccSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1704); // serialize this field at offset 1704 by default 
    }
    
	/**
	* sets parent for this MsdStockDivPayMmddyyccSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1704 by default
    }    
	/**
	* initializes the field in MsdStockDivPayMmddyyccSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_STOCK_DIV_PAY_MMDDYYCC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdStockDivPayMmddyy = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdStockDivPayCc = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdStockDivPayMmddyyCounter = -1;
     public boolean isMsdStockDivPayMmddyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdStockDivPayMmddyyCounter != sharedCounter;
         localMsdStockDivPayMmddyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdStockDivPayMmddyy
	 *	@return msdStockDivPayMmddyy
	 */
	public char[]  getMsdStockDivPayMmddyyString() {
	     return getCharArray(beginMsdStockDivPayMmddyy,MSD_STOCK_DIV_PAY_MMDDYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdStockDivPayMmddyyIsNumeric() {
	    return isNumeric(beginMsdStockDivPayMmddyy
	                    ,beginMsdStockDivPayMmddyy + MSD_STOCK_DIV_PAY_MMDDYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_STOCK_DIV_PAY_MMDDYY_LEN = 6;
  	/**
	 * serializeMsdStockDivPayMmddyy
	 */
	protected void serializeMsdStockDivPayMmddyy(long msdStockDivPayMmddyy) {
		 putNumber(beginMsdStockDivPayMmddyy,msdStockDivPayMmddyy,MSD_STOCK_DIV_PAY_MMDDYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdStockDivPayMmddyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdStockDivPayMmddyy
	 */
   	protected  long serializeMsdStockDivPayMmddyy(char[] value) {
	    long  msdStockDivPayMmddyy;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdStockDivPayMmddyy = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMsdStockDivPayMmddyy
		       ,6
		      );
		 localMsdStockDivPayMmddyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdStockDivPayMmddyy;
    }

   protected long checkMsdStockDivPayMmddyyMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdStockDivPayMmddyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdStockDivPayMmddyy() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdStockDivPayMmddyy
			                 ,MSD_STOCK_DIV_PAY_MMDDYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdStockDivPayMmddyy", beginMsdStockDivPayMmddyy,MSD_STOCK_DIV_PAY_MMDDYY_LEN);
    }
   	}
     int localMsdStockDivPayCcCounter = -1;
     public boolean isMsdStockDivPayCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdStockDivPayCcCounter != sharedCounter;
         localMsdStockDivPayCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdStockDivPayCc
	 *	@return msdStockDivPayCc
	 */
	public char[]  getMsdStockDivPayCcString() {
	     return getCharArray(beginMsdStockDivPayCc,MSD_STOCK_DIV_PAY_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdStockDivPayCcIsNumeric() {
	    return isNumeric(beginMsdStockDivPayCc
	                    ,beginMsdStockDivPayCc + MSD_STOCK_DIV_PAY_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_STOCK_DIV_PAY_CC_LEN = 2;
  	/**
	 * serializeMsdStockDivPayCc
	 */
	protected void serializeMsdStockDivPayCc(int msdStockDivPayCc) {
		 putNumber(beginMsdStockDivPayCc,msdStockDivPayCc,MSD_STOCK_DIV_PAY_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdStockDivPayCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdStockDivPayCc
	 */
   	protected  int serializeMsdStockDivPayCc(char[] value) {
	    int  msdStockDivPayCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdStockDivPayCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdStockDivPayCc
		       ,2
		      );
		 localMsdStockDivPayCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdStockDivPayCc;
    }

   protected int checkMsdStockDivPayCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdStockDivPayCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdStockDivPayCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdStockDivPayCc
			                 ,MSD_STOCK_DIV_PAY_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdStockDivPayCc", beginMsdStockDivPayCc,MSD_STOCK_DIV_PAY_CC_LEN);
    }
   	}




}
  

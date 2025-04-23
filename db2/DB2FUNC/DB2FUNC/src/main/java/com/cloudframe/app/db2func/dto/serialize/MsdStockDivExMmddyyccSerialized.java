package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class MsdStockDivExMmddyyccSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdStockDivExMmddyyccSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdStockDivExMmddyyccSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_STOCK_DIV_EX_MMDDYYCC_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdStockDivExMmddyy;
            protected  int beginMsdStockDivExCc;
	
	/**
	* Constructor for MsdStockDivExMmddyyccSerialized
	**/
    public MsdStockDivExMmddyyccSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdStockDivExMmddyyccSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdStockDivExMmddyyccSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdStockDivExMmddyyccSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1696); // serialize this field at offset 1696 by default 
    }
    
	/**
	* sets parent for this MsdStockDivExMmddyyccSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1696 by default
    }    
	/**
	* initializes the field in MsdStockDivExMmddyyccSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_STOCK_DIV_EX_MMDDYYCC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdStockDivExMmddyy = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdStockDivExCc = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdStockDivExMmddyyCounter = -1;
     public boolean isMsdStockDivExMmddyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdStockDivExMmddyyCounter != sharedCounter;
         localMsdStockDivExMmddyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdStockDivExMmddyy
	 *	@return msdStockDivExMmddyy
	 */
	public char[]  getMsdStockDivExMmddyyString() {
	     return getCharArray(beginMsdStockDivExMmddyy,MSD_STOCK_DIV_EX_MMDDYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdStockDivExMmddyyIsNumeric() {
	    return isNumeric(beginMsdStockDivExMmddyy
	                    ,beginMsdStockDivExMmddyy + MSD_STOCK_DIV_EX_MMDDYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_STOCK_DIV_EX_MMDDYY_LEN = 6;
  	/**
	 * serializeMsdStockDivExMmddyy
	 */
	protected void serializeMsdStockDivExMmddyy(long msdStockDivExMmddyy) {
		 putNumber(beginMsdStockDivExMmddyy,msdStockDivExMmddyy,MSD_STOCK_DIV_EX_MMDDYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdStockDivExMmddyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdStockDivExMmddyy
	 */
   	protected  long serializeMsdStockDivExMmddyy(char[] value) {
	    long  msdStockDivExMmddyy;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdStockDivExMmddyy = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMsdStockDivExMmddyy
		       ,6
		      );
		 localMsdStockDivExMmddyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdStockDivExMmddyy;
    }

   protected long checkMsdStockDivExMmddyyMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdStockDivExMmddyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdStockDivExMmddyy() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdStockDivExMmddyy
			                 ,MSD_STOCK_DIV_EX_MMDDYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdStockDivExMmddyy", beginMsdStockDivExMmddyy,MSD_STOCK_DIV_EX_MMDDYY_LEN);
    }
   	}
     int localMsdStockDivExCcCounter = -1;
     public boolean isMsdStockDivExCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdStockDivExCcCounter != sharedCounter;
         localMsdStockDivExCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdStockDivExCc
	 *	@return msdStockDivExCc
	 */
	public char[]  getMsdStockDivExCcString() {
	     return getCharArray(beginMsdStockDivExCc,MSD_STOCK_DIV_EX_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdStockDivExCcIsNumeric() {
	    return isNumeric(beginMsdStockDivExCc
	                    ,beginMsdStockDivExCc + MSD_STOCK_DIV_EX_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_STOCK_DIV_EX_CC_LEN = 2;
  	/**
	 * serializeMsdStockDivExCc
	 */
	protected void serializeMsdStockDivExCc(int msdStockDivExCc) {
		 putNumber(beginMsdStockDivExCc,msdStockDivExCc,MSD_STOCK_DIV_EX_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdStockDivExCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdStockDivExCc
	 */
   	protected  int serializeMsdStockDivExCc(char[] value) {
	    int  msdStockDivExCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdStockDivExCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdStockDivExCc
		       ,2
		      );
		 localMsdStockDivExCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdStockDivExCc;
    }

   protected int checkMsdStockDivExCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdStockDivExCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdStockDivExCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdStockDivExCc
			                 ,MSD_STOCK_DIV_EX_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdStockDivExCc", beginMsdStockDivExCc,MSD_STOCK_DIV_EX_CC_LEN);
    }
   	}




}
  

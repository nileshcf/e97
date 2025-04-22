package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class MsdStockDivRecMmddyyccSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdStockDivRecMmddyyccSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdStockDivRecMmddyyccSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_STOCK_DIV_REC_MMDDYYCC_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdStockDivRecMmddyy;
            protected  int beginMsdStockDivRecCc;
	
	/**
	* Constructor for MsdStockDivRecMmddyyccSerialized
	**/
    public MsdStockDivRecMmddyyccSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdStockDivRecMmddyyccSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdStockDivRecMmddyyccSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdStockDivRecMmddyyccSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1673); // serialize this field at offset 1673 by default 
    }
    
	/**
	* sets parent for this MsdStockDivRecMmddyyccSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1673 by default
    }    
	/**
	* initializes the field in MsdStockDivRecMmddyyccSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_STOCK_DIV_REC_MMDDYYCC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdStockDivRecMmddyy = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdStockDivRecCc = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdStockDivRecMmddyyCounter = -1;
     public boolean isMsdStockDivRecMmddyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdStockDivRecMmddyyCounter != sharedCounter;
         localMsdStockDivRecMmddyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdStockDivRecMmddyy
	 *	@return msdStockDivRecMmddyy
	 */
	public char[]  getMsdStockDivRecMmddyyString() {
	     return getCharArray(beginMsdStockDivRecMmddyy,MSD_STOCK_DIV_REC_MMDDYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdStockDivRecMmddyyIsNumeric() {
	    return isNumeric(beginMsdStockDivRecMmddyy
	                    ,beginMsdStockDivRecMmddyy + MSD_STOCK_DIV_REC_MMDDYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_STOCK_DIV_REC_MMDDYY_LEN = 6;
  	/**
	 * serializeMsdStockDivRecMmddyy
	 */
	protected void serializeMsdStockDivRecMmddyy(long msdStockDivRecMmddyy) {
		 putNumber(beginMsdStockDivRecMmddyy,msdStockDivRecMmddyy,MSD_STOCK_DIV_REC_MMDDYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdStockDivRecMmddyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdStockDivRecMmddyy
	 */
   	protected  long serializeMsdStockDivRecMmddyy(char[] value) {
	    long  msdStockDivRecMmddyy;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdStockDivRecMmddyy = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMsdStockDivRecMmddyy
		       ,6
		      );
		 localMsdStockDivRecMmddyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdStockDivRecMmddyy;
    }

   protected long checkMsdStockDivRecMmddyyMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdStockDivRecMmddyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdStockDivRecMmddyy() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdStockDivRecMmddyy
			                 ,MSD_STOCK_DIV_REC_MMDDYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdStockDivRecMmddyy", beginMsdStockDivRecMmddyy,MSD_STOCK_DIV_REC_MMDDYY_LEN);
    }
   	}
     int localMsdStockDivRecCcCounter = -1;
     public boolean isMsdStockDivRecCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdStockDivRecCcCounter != sharedCounter;
         localMsdStockDivRecCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdStockDivRecCc
	 *	@return msdStockDivRecCc
	 */
	public char[]  getMsdStockDivRecCcString() {
	     return getCharArray(beginMsdStockDivRecCc,MSD_STOCK_DIV_REC_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdStockDivRecCcIsNumeric() {
	    return isNumeric(beginMsdStockDivRecCc
	                    ,beginMsdStockDivRecCc + MSD_STOCK_DIV_REC_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_STOCK_DIV_REC_CC_LEN = 2;
  	/**
	 * serializeMsdStockDivRecCc
	 */
	protected void serializeMsdStockDivRecCc(int msdStockDivRecCc) {
		 putNumber(beginMsdStockDivRecCc,msdStockDivRecCc,MSD_STOCK_DIV_REC_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdStockDivRecCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdStockDivRecCc
	 */
   	protected  int serializeMsdStockDivRecCc(char[] value) {
	    int  msdStockDivRecCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdStockDivRecCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdStockDivRecCc
		       ,2
		      );
		 localMsdStockDivRecCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdStockDivRecCc;
    }

   protected int checkMsdStockDivRecCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdStockDivRecCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdStockDivRecCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdStockDivRecCc
			                 ,MSD_STOCK_DIV_REC_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdStockDivRecCc", beginMsdStockDivRecCc,MSD_STOCK_DIV_REC_CC_LEN);
    }
   	}




}
  

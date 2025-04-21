package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class MsdPriceCcyymmddSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdPriceCcyymmddSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdPriceCcyymmddSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_PRICE_CCYYMMDD_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdPriceCc;
            protected  int beginMsdPriceYymmdd;
	
	/**
	* Constructor for MsdPriceCcyymmddSerialized
	**/
    public MsdPriceCcyymmddSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdPriceCcyymmddSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdPriceCcyymmddSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdPriceCcyymmddSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,504); // serialize this field at offset 504 by default 
    }
    
	/**
	* sets parent for this MsdPriceCcyymmddSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 504 by default
    }    
	/**
	* initializes the field in MsdPriceCcyymmddSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_PRICE_CCYYMMDD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdPriceCc = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdPriceYymmdd = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdPriceCcCounter = -1;
     public boolean isMsdPriceCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdPriceCcCounter != sharedCounter;
         localMsdPriceCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdPriceCc
	 *	@return msdPriceCc
	 */
	public char[]  getMsdPriceCcString() {
	     return getCharArray(beginMsdPriceCc,MSD_PRICE_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdPriceCcIsNumeric() {
	    return isNumeric(beginMsdPriceCc
	                    ,beginMsdPriceCc + MSD_PRICE_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_PRICE_CC_LEN = 2;
  	/**
	 * serializeMsdPriceCc
	 */
	protected void serializeMsdPriceCc(int msdPriceCc) {
		 putNumber(beginMsdPriceCc,msdPriceCc,MSD_PRICE_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdPriceCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdPriceCc
	 */
   	protected  int serializeMsdPriceCc(char[] value) {
	    int  msdPriceCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdPriceCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdPriceCc
		       ,2
		      );
		 localMsdPriceCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdPriceCc;
    }

   protected int checkMsdPriceCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdPriceCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdPriceCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdPriceCc
			                 ,MSD_PRICE_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdPriceCc", beginMsdPriceCc,MSD_PRICE_CC_LEN);
    }
   	}
     int localMsdPriceYymmddCounter = -1;
     public boolean isMsdPriceYymmddModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdPriceYymmddCounter != sharedCounter;
         localMsdPriceYymmddCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdPriceYymmdd
	 *	@return msdPriceYymmdd
	 */
	public char[]  getMsdPriceYymmddString() {
	     return getCharArray(beginMsdPriceYymmdd,MSD_PRICE_YYMMDD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdPriceYymmddIsNumeric() {
	    return isNumeric(beginMsdPriceYymmdd
	                    ,beginMsdPriceYymmdd + MSD_PRICE_YYMMDD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_PRICE_YYMMDD_LEN = 6;
  	/**
	 * serializeMsdPriceYymmdd
	 */
	protected void serializeMsdPriceYymmdd(long msdPriceYymmdd) {
		 putNumber(beginMsdPriceYymmdd,msdPriceYymmdd,MSD_PRICE_YYMMDD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdPriceYymmddCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdPriceYymmdd
	 */
   	protected  long serializeMsdPriceYymmdd(char[] value) {
	    long  msdPriceYymmdd;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdPriceYymmdd = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMsdPriceYymmdd
		       ,6
		      );
		 localMsdPriceYymmddCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdPriceYymmdd;
    }

   protected long checkMsdPriceYymmddMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdPriceYymmdd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdPriceYymmdd() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdPriceYymmdd
			                 ,MSD_PRICE_YYMMDD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdPriceYymmdd", beginMsdPriceYymmdd,MSD_PRICE_YYMMDD_LEN);
    }
   	}




}
  

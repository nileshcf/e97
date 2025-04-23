package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnDateConvertedFormatsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnDateConvertedFormatsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnDateConvertedFormatsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_DATE_CONVERTED_FORMATS_LENGTH = 47;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnDateConvJulian;
            protected  int beginCmnDateConvIbmUsaStd;
            protected  int beginCmnDateConvLitShort;
            protected  int beginCmnDateConvLitLong;
	
	/**
	* Constructor for CmnDateConvertedFormatsSerialized
	**/
    public CmnDateConvertedFormatsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnDateConvertedFormatsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateConvertedFormatsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnDateConvertedFormatsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1043); // serialize this field at offset 1043 by default 
    }
    
	/**
	* sets parent for this CmnDateConvertedFormatsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1043 by default
    }    
	/**
	* initializes the field in CmnDateConvertedFormatsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_DATE_CONVERTED_FORMATS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnDateConvJulian = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnDateConvIbmUsaStd = getStartOffset() + 7;	// set offset for serialization
  
             beginCmnDateConvLitShort = getStartOffset() + 17;	// set offset for serialization
  
             beginCmnDateConvLitLong = getStartOffset() + 29;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnDateConvJulianCounter = -1;
     public boolean isCmnDateConvJulianModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateConvJulianCounter != sharedCounter;
         localCmnDateConvJulianCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnDateConvJulian
	 *	@return cmnDateConvJulian
	 */
	public char[]  getCmnDateConvJulianString() {
	     return getCharArray(beginCmnDateConvJulian,CMN_DATE_CONV_JULIAN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnDateConvJulianIsNumeric() {
	    return isNumeric(beginCmnDateConvJulian
	                    ,beginCmnDateConvJulian + CMN_DATE_CONV_JULIAN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_DATE_CONV_JULIAN_LEN = 7;
  	/**
	 * serializeCmnDateConvJulian
	 */
	protected void serializeCmnDateConvJulian(long cmnDateConvJulian) {
		 putNumber(beginCmnDateConvJulian,cmnDateConvJulian,CMN_DATE_CONV_JULIAN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnDateConvJulianCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnDateConvJulian
	 */
   	protected  long serializeCmnDateConvJulian(char[] value) {
	    long  cmnDateConvJulian;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnDateConvJulian = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginCmnDateConvJulian
		       ,7
		      );
		 localCmnDateConvJulianCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnDateConvJulian;
    }

   protected long checkCmnDateConvJulianMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnDateConvJulian is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCmnDateConvJulian() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCmnDateConvJulian
			                 ,CMN_DATE_CONV_JULIAN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnDateConvJulian", beginCmnDateConvJulian,CMN_DATE_CONV_JULIAN_LEN);
    }
   	}
     int localCmnDateConvIbmUsaStdCounter = -1;
     public boolean isCmnDateConvIbmUsaStdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateConvIbmUsaStdCounter != sharedCounter;
         localCmnDateConvIbmUsaStdCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_CONV_IBM_USA_STD_LEN = 10;
	/**
	 * 	serialize this CmnDateConvIbmUsaStd
	 */
   protected void serializeCmnDateConvIbmUsaStd(char[] cmnDateConvIbmUsaStd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateConvIbmUsaStd,0,getStringValue(),beginCmnDateConvIbmUsaStd,CMN_DATE_CONV_IBM_USA_STD_LEN);
       localCmnDateConvIbmUsaStdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateConvIbmUsaStdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCmnDateConvIbmUsaStd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateConvIbmUsaStd() {	 
   		return (substring(getStringValue(),beginCmnDateConvIbmUsaStd,beginCmnDateConvIbmUsaStd + CMN_DATE_CONV_IBM_USA_STD_LEN));
   	}
     int localCmnDateConvLitShortCounter = -1;
     public boolean isCmnDateConvLitShortModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateConvLitShortCounter != sharedCounter;
         localCmnDateConvLitShortCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_CONV_LIT_SHORT_LEN = 12;
	/**
	 * 	serialize this CmnDateConvLitShort
	 */
   protected void serializeCmnDateConvLitShort(char[] cmnDateConvLitShort) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateConvLitShort,0,getStringValue(),beginCmnDateConvLitShort,CMN_DATE_CONV_LIT_SHORT_LEN);
       localCmnDateConvLitShortCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateConvLitShortConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshCmnDateConvLitShort is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateConvLitShort() {	 
   		return (substring(getStringValue(),beginCmnDateConvLitShort,beginCmnDateConvLitShort + CMN_DATE_CONV_LIT_SHORT_LEN));
   	}
     int localCmnDateConvLitLongCounter = -1;
     public boolean isCmnDateConvLitLongModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateConvLitLongCounter != sharedCounter;
         localCmnDateConvLitLongCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_CONV_LIT_LONG_LEN = 18;
	/**
	 * 	serialize this CmnDateConvLitLong
	 */
   protected void serializeCmnDateConvLitLong(char[] cmnDateConvLitLong) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateConvLitLong,0,getStringValue(),beginCmnDateConvLitLong,CMN_DATE_CONV_LIT_LONG_LEN);
       localCmnDateConvLitLongCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateConvLitLongConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshCmnDateConvLitLong is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateConvLitLong() {	 
   		return (substring(getStringValue(),beginCmnDateConvLitLong,beginCmnDateConvLitLong + CMN_DATE_CONV_LIT_LONG_LEN));
   	}




}
  

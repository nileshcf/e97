package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class WaCurrentDateRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WaCurrentDateRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WaCurrentDateRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WA_CURRENT_DATE_REDEFINED_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWaCurrYy;
            protected  int beginWaCurrMm;
            protected  int beginWaCurrDd;
	
	/**
	* Constructor for WaCurrentDateRedefinedSerialized
	**/
    public WaCurrentDateRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WaCurrentDateRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WaCurrentDateRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WaCurrentDateRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this WaCurrentDateRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in WaCurrentDateRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WA_CURRENT_DATE_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWaCurrYy = getStartOffset() + 0;	// set offset for serialization
  
             beginWaCurrMm = getStartOffset() + 2;	// set offset for serialization
  
             beginWaCurrDd = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWaCurrYyCounter = -1;
     public boolean isWaCurrYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaCurrYyCounter != sharedCounter;
         localWaCurrYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of waCurrYy
	 *	@return waCurrYy
	 */
	public char[]  getWaCurrYyString() {
	     return getCharArray(beginWaCurrYy,WA_CURR_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean waCurrYyIsNumeric() {
	    return isNumeric(beginWaCurrYy
	                    ,beginWaCurrYy + WA_CURR_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WA_CURR_YY_LEN = 2;
  	/**
	 * serializeWaCurrYy
	 */
	protected void serializeWaCurrYy(int waCurrYy) {
		 putNumber(beginWaCurrYy,waCurrYy,WA_CURR_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWaCurrYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWaCurrYy
	 */
   	protected  int serializeWaCurrYy(char[] value) {
	    int  waCurrYy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    waCurrYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWaCurrYy
		       ,2
		      );
		 localWaCurrYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  waCurrYy;
    }

   protected int checkWaCurrYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWaCurrYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWaCurrYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWaCurrYy
			                 ,WA_CURR_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("waCurrYy", beginWaCurrYy,WA_CURR_YY_LEN);
    }
   	}
     int localWaCurrMmCounter = -1;
     public boolean isWaCurrMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaCurrMmCounter != sharedCounter;
         localWaCurrMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of waCurrMm
	 *	@return waCurrMm
	 */
	public char[]  getWaCurrMmString() {
	     return getCharArray(beginWaCurrMm,WA_CURR_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean waCurrMmIsNumeric() {
	    return isNumeric(beginWaCurrMm
	                    ,beginWaCurrMm + WA_CURR_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WA_CURR_MM_LEN = 2;
  	/**
	 * serializeWaCurrMm
	 */
	protected void serializeWaCurrMm(int waCurrMm) {
		 putNumber(beginWaCurrMm,waCurrMm,WA_CURR_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWaCurrMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWaCurrMm
	 */
   	protected  int serializeWaCurrMm(char[] value) {
	    int  waCurrMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    waCurrMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWaCurrMm
		       ,2
		      );
		 localWaCurrMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  waCurrMm;
    }

   protected int checkWaCurrMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWaCurrMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWaCurrMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWaCurrMm
			                 ,WA_CURR_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("waCurrMm", beginWaCurrMm,WA_CURR_MM_LEN);
    }
   	}
     int localWaCurrDdCounter = -1;
     public boolean isWaCurrDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaCurrDdCounter != sharedCounter;
         localWaCurrDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of waCurrDd
	 *	@return waCurrDd
	 */
	public char[]  getWaCurrDdString() {
	     return getCharArray(beginWaCurrDd,WA_CURR_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean waCurrDdIsNumeric() {
	    return isNumeric(beginWaCurrDd
	                    ,beginWaCurrDd + WA_CURR_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WA_CURR_DD_LEN = 2;
  	/**
	 * serializeWaCurrDd
	 */
	protected void serializeWaCurrDd(int waCurrDd) {
		 putNumber(beginWaCurrDd,waCurrDd,WA_CURR_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWaCurrDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWaCurrDd
	 */
   	protected  int serializeWaCurrDd(char[] value) {
	    int  waCurrDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    waCurrDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWaCurrDd
		       ,2
		      );
		 localWaCurrDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  waCurrDd;
    }

   protected int checkWaCurrDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWaCurrDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWaCurrDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWaCurrDd
			                 ,WA_CURR_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("waCurrDd", beginWaCurrDd,WA_CURR_DD_LEN);
    }
   	}




}
  

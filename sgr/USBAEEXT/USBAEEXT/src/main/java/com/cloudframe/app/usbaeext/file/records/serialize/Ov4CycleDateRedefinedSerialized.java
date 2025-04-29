package com.cloudframe.app.usbaeext.file.records.serialize;

/**
*  The class Ov4CycleDateRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ov4CycleDateRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ov4CycleDateRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OV_4_CYCLE_DATE_REDEFINED_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOv4CycleDateMm;
            protected  int beginOv4CycleDateDd;
            protected  int beginOv4CycleDateYy;
	
	/**
	* Constructor for Ov4CycleDateRedefinedSerialized
	**/
    public Ov4CycleDateRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ov4CycleDateRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4CycleDateRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ov4CycleDateRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,73); // serialize this field at offset 73 by default 
    }
    
	/**
	* sets parent for this Ov4CycleDateRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 73 by default
    }    
	/**
	* initializes the field in Ov4CycleDateRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OV_4_CYCLE_DATE_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOv4CycleDateMm = getStartOffset() + 0;	// set offset for serialization
  
             beginOv4CycleDateDd = getStartOffset() + 2;	// set offset for serialization
  
             beginOv4CycleDateYy = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localOv4CycleDateMmCounter = -1;
     public boolean isOv4CycleDateMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4CycleDateMmCounter != sharedCounter;
         localOv4CycleDateMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ov4CycleDateMm
	 *	@return ov4CycleDateMm
	 */
	public char[]  getOv4CycleDateMmString() {
	     return getCharArray(beginOv4CycleDateMm,OV_4_CYCLE_DATE_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4CycleDateMmIsNumeric() {
	    return isNumeric(beginOv4CycleDateMm
	                    ,beginOv4CycleDateMm + OV_4_CYCLE_DATE_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OV_4_CYCLE_DATE_MM_LEN = 2;
  	/**
	 * serializeOv4CycleDateMm
	 */
	protected void serializeOv4CycleDateMm(int ov4CycleDateMm) {
		 putNumber(beginOv4CycleDateMm,ov4CycleDateMm,OV_4_CYCLE_DATE_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4CycleDateMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOv4CycleDateMm
	 */
   	protected  int serializeOv4CycleDateMm(char[] value) {
	    int  ov4CycleDateMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ov4CycleDateMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginOv4CycleDateMm
		       ,2
		      );
		 localOv4CycleDateMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  ov4CycleDateMm;
    }

   protected int checkOv4CycleDateMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOv4CycleDateMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOv4CycleDateMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginOv4CycleDateMm
			                 ,OV_4_CYCLE_DATE_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4CycleDateMm", beginOv4CycleDateMm,OV_4_CYCLE_DATE_MM_LEN);
    }
   	}
     int localOv4CycleDateDdCounter = -1;
     public boolean isOv4CycleDateDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4CycleDateDdCounter != sharedCounter;
         localOv4CycleDateDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ov4CycleDateDd
	 *	@return ov4CycleDateDd
	 */
	public char[]  getOv4CycleDateDdString() {
	     return getCharArray(beginOv4CycleDateDd,OV_4_CYCLE_DATE_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4CycleDateDdIsNumeric() {
	    return isNumeric(beginOv4CycleDateDd
	                    ,beginOv4CycleDateDd + OV_4_CYCLE_DATE_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OV_4_CYCLE_DATE_DD_LEN = 2;
  	/**
	 * serializeOv4CycleDateDd
	 */
	protected void serializeOv4CycleDateDd(int ov4CycleDateDd) {
		 putNumber(beginOv4CycleDateDd,ov4CycleDateDd,OV_4_CYCLE_DATE_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4CycleDateDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOv4CycleDateDd
	 */
   	protected  int serializeOv4CycleDateDd(char[] value) {
	    int  ov4CycleDateDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ov4CycleDateDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginOv4CycleDateDd
		       ,2
		      );
		 localOv4CycleDateDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  ov4CycleDateDd;
    }

   protected int checkOv4CycleDateDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOv4CycleDateDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOv4CycleDateDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginOv4CycleDateDd
			                 ,OV_4_CYCLE_DATE_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4CycleDateDd", beginOv4CycleDateDd,OV_4_CYCLE_DATE_DD_LEN);
    }
   	}
     int localOv4CycleDateYyCounter = -1;
     public boolean isOv4CycleDateYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4CycleDateYyCounter != sharedCounter;
         localOv4CycleDateYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ov4CycleDateYy
	 *	@return ov4CycleDateYy
	 */
	public char[]  getOv4CycleDateYyString() {
	     return getCharArray(beginOv4CycleDateYy,OV_4_CYCLE_DATE_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4CycleDateYyIsNumeric() {
	    return isNumeric(beginOv4CycleDateYy
	                    ,beginOv4CycleDateYy + OV_4_CYCLE_DATE_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OV_4_CYCLE_DATE_YY_LEN = 2;
  	/**
	 * serializeOv4CycleDateYy
	 */
	protected void serializeOv4CycleDateYy(int ov4CycleDateYy) {
		 putNumber(beginOv4CycleDateYy,ov4CycleDateYy,OV_4_CYCLE_DATE_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4CycleDateYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOv4CycleDateYy
	 */
   	protected  int serializeOv4CycleDateYy(char[] value) {
	    int  ov4CycleDateYy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ov4CycleDateYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginOv4CycleDateYy
		       ,2
		      );
		 localOv4CycleDateYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  ov4CycleDateYy;
    }

   protected int checkOv4CycleDateYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOv4CycleDateYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOv4CycleDateYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginOv4CycleDateYy
			                 ,OV_4_CYCLE_DATE_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4CycleDateYy", beginOv4CycleDateYy,OV_4_CYCLE_DATE_YY_LEN);
    }
   	}




}
  

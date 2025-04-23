package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360HeaderDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class X360HeaderDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360HeaderDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_HEADER_DATE_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360HeaderDateYy;
            protected  int beginX360HeaderDateMm;
            protected  int beginX360HeaderDateDd;
	
	/**
	* Constructor for X360HeaderDateSerialized
	**/
    public X360HeaderDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360HeaderDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360HeaderDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360HeaderDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,23); // serialize this field at offset 23 by default 
    }
    
	/**
	* sets parent for this X360HeaderDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 23 by default
    }    
	/**
	* initializes the field in X360HeaderDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_HEADER_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360HeaderDateYy = getStartOffset() + 0;	// set offset for serialization
  
             beginX360HeaderDateMm = getStartOffset() + 2;	// set offset for serialization
  
             beginX360HeaderDateDd = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localX360HeaderDateYyCounter = -1;
     public boolean isX360HeaderDateYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderDateYyCounter != sharedCounter;
         localX360HeaderDateYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360HeaderDateYy
	 *	@return x360HeaderDateYy
	 */
	public char[]  getX360HeaderDateYyString() {
	     return getCharArray(beginX360HeaderDateYy,X_360_HEADER_DATE_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360HeaderDateYyIsNumeric() {
	    return isNumeric(beginX360HeaderDateYy
	                    ,beginX360HeaderDateYy + X_360_HEADER_DATE_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_HEADER_DATE_YY_LEN = 2;
  	/**
	 * serializeX360HeaderDateYy
	 */
	protected void serializeX360HeaderDateYy(int x360HeaderDateYy) {
		 putNumber(beginX360HeaderDateYy,x360HeaderDateYy,X_360_HEADER_DATE_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360HeaderDateYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360HeaderDateYy
	 */
   	protected  int serializeX360HeaderDateYy(char[] value) {
	    int  x360HeaderDateYy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360HeaderDateYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginX360HeaderDateYy
		       ,2
		      );
		 localX360HeaderDateYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360HeaderDateYy;
    }

   protected int checkX360HeaderDateYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360HeaderDateYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360HeaderDateYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360HeaderDateYy
			                 ,X_360_HEADER_DATE_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360HeaderDateYy", beginX360HeaderDateYy,X_360_HEADER_DATE_YY_LEN);
    }
   	}
     int localX360HeaderDateMmCounter = -1;
     public boolean isX360HeaderDateMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderDateMmCounter != sharedCounter;
         localX360HeaderDateMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360HeaderDateMm
	 *	@return x360HeaderDateMm
	 */
	public char[]  getX360HeaderDateMmString() {
	     return getCharArray(beginX360HeaderDateMm,X_360_HEADER_DATE_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360HeaderDateMmIsNumeric() {
	    return isNumeric(beginX360HeaderDateMm
	                    ,beginX360HeaderDateMm + X_360_HEADER_DATE_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_HEADER_DATE_MM_LEN = 2;
  	/**
	 * serializeX360HeaderDateMm
	 */
	protected void serializeX360HeaderDateMm(int x360HeaderDateMm) {
		 putNumber(beginX360HeaderDateMm,x360HeaderDateMm,X_360_HEADER_DATE_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360HeaderDateMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360HeaderDateMm
	 */
   	protected  int serializeX360HeaderDateMm(char[] value) {
	    int  x360HeaderDateMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360HeaderDateMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginX360HeaderDateMm
		       ,2
		      );
		 localX360HeaderDateMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360HeaderDateMm;
    }

   protected int checkX360HeaderDateMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360HeaderDateMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360HeaderDateMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360HeaderDateMm
			                 ,X_360_HEADER_DATE_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360HeaderDateMm", beginX360HeaderDateMm,X_360_HEADER_DATE_MM_LEN);
    }
   	}
     int localX360HeaderDateDdCounter = -1;
     public boolean isX360HeaderDateDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderDateDdCounter != sharedCounter;
         localX360HeaderDateDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360HeaderDateDd
	 *	@return x360HeaderDateDd
	 */
	public char[]  getX360HeaderDateDdString() {
	     return getCharArray(beginX360HeaderDateDd,X_360_HEADER_DATE_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360HeaderDateDdIsNumeric() {
	    return isNumeric(beginX360HeaderDateDd
	                    ,beginX360HeaderDateDd + X_360_HEADER_DATE_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_HEADER_DATE_DD_LEN = 2;
  	/**
	 * serializeX360HeaderDateDd
	 */
	protected void serializeX360HeaderDateDd(int x360HeaderDateDd) {
		 putNumber(beginX360HeaderDateDd,x360HeaderDateDd,X_360_HEADER_DATE_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360HeaderDateDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360HeaderDateDd
	 */
   	protected  int serializeX360HeaderDateDd(char[] value) {
	    int  x360HeaderDateDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360HeaderDateDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginX360HeaderDateDd
		       ,2
		      );
		 localX360HeaderDateDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360HeaderDateDd;
    }

   protected int checkX360HeaderDateDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360HeaderDateDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360HeaderDateDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360HeaderDateDd
			                 ,X_360_HEADER_DATE_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360HeaderDateDd", beginX360HeaderDateDd,X_360_HEADER_DATE_DD_LEN);
    }
   	}




}
  

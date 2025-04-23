package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360FCurrentDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class X360FCurrentDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360FCurrentDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_FCURRENT_DATE_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360FCurYy;
            protected  int beginX360FCurMm;
            protected  int beginX360FCurDd;
	
	/**
	* Constructor for X360FCurrentDateSerialized
	**/
    public X360FCurrentDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360FCurrentDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FCurrentDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360FCurrentDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,537); // serialize this field at offset 537 by default 
    }
    
	/**
	* sets parent for this X360FCurrentDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 537 by default
    }    
	/**
	* initializes the field in X360FCurrentDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_FCURRENT_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360FCurYy = getStartOffset() + 0;	// set offset for serialization
  
             beginX360FCurMm = getStartOffset() + 2;	// set offset for serialization
  
             beginX360FCurDd = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localX360FCurYyCounter = -1;
     public boolean isX360FCurYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FCurYyCounter != sharedCounter;
         localX360FCurYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FCurYy
	 *	@return x360FCurYy
	 */
	public char[]  getX360FCurYyString() {
	     return getCharArray(beginX360FCurYy,X_360_FCUR_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FCurYyIsNumeric() {
	    return isNumeric(beginX360FCurYy
	                    ,beginX360FCurYy + X_360_FCUR_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FCUR_YY_LEN = 2;
  	/**
	 * serializeX360FCurYy
	 */
	protected void serializeX360FCurYy(int x360FCurYy) {
		 putNumber(beginX360FCurYy,x360FCurYy,X_360_FCUR_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FCurYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FCurYy
	 */
   	protected  int serializeX360FCurYy(char[] value) {
	    int  x360FCurYy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FCurYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginX360FCurYy
		       ,2
		      );
		 localX360FCurYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FCurYy;
    }

   protected int checkX360FCurYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360FCurYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FCurYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360FCurYy
			                 ,X_360_FCUR_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FCurYy", beginX360FCurYy,X_360_FCUR_YY_LEN);
    }
   	}
     int localX360FCurMmCounter = -1;
     public boolean isX360FCurMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FCurMmCounter != sharedCounter;
         localX360FCurMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FCurMm
	 *	@return x360FCurMm
	 */
	public char[]  getX360FCurMmString() {
	     return getCharArray(beginX360FCurMm,X_360_FCUR_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FCurMmIsNumeric() {
	    return isNumeric(beginX360FCurMm
	                    ,beginX360FCurMm + X_360_FCUR_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FCUR_MM_LEN = 2;
  	/**
	 * serializeX360FCurMm
	 */
	protected void serializeX360FCurMm(int x360FCurMm) {
		 putNumber(beginX360FCurMm,x360FCurMm,X_360_FCUR_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FCurMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FCurMm
	 */
   	protected  int serializeX360FCurMm(char[] value) {
	    int  x360FCurMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FCurMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginX360FCurMm
		       ,2
		      );
		 localX360FCurMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FCurMm;
    }

   protected int checkX360FCurMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360FCurMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FCurMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360FCurMm
			                 ,X_360_FCUR_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FCurMm", beginX360FCurMm,X_360_FCUR_MM_LEN);
    }
   	}
     int localX360FCurDdCounter = -1;
     public boolean isX360FCurDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FCurDdCounter != sharedCounter;
         localX360FCurDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FCurDd
	 *	@return x360FCurDd
	 */
	public char[]  getX360FCurDdString() {
	     return getCharArray(beginX360FCurDd,X_360_FCUR_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FCurDdIsNumeric() {
	    return isNumeric(beginX360FCurDd
	                    ,beginX360FCurDd + X_360_FCUR_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FCUR_DD_LEN = 2;
  	/**
	 * serializeX360FCurDd
	 */
	protected void serializeX360FCurDd(int x360FCurDd) {
		 putNumber(beginX360FCurDd,x360FCurDd,X_360_FCUR_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FCurDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FCurDd
	 */
   	protected  int serializeX360FCurDd(char[] value) {
	    int  x360FCurDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FCurDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginX360FCurDd
		       ,2
		      );
		 localX360FCurDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FCurDd;
    }

   protected int checkX360FCurDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360FCurDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FCurDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360FCurDd
			                 ,X_360_FCUR_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FCurDd", beginX360FCurDd,X_360_FCUR_DD_LEN);
    }
   	}




}
  

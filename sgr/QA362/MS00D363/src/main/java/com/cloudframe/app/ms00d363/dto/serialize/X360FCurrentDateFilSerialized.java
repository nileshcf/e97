package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360FCurrentDateFilSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class X360FCurrentDateFilSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360FCurrentDateFilSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_FCURRENT_DATE_FIL_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360FCurYyFil;
            protected  int beginX360FCurMmFil;
            protected  int beginX360FCurDdFil;
	
	/**
	* Constructor for X360FCurrentDateFilSerialized
	**/
    public X360FCurrentDateFilSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360FCurrentDateFilSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FCurrentDateFilSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360FCurrentDateFilSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,537); // serialize this field at offset 537 by default 
    }
    
	/**
	* sets parent for this X360FCurrentDateFilSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 537 by default
    }    
	/**
	* initializes the field in X360FCurrentDateFilSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_FCURRENT_DATE_FIL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360FCurYyFil = getStartOffset() + 0;	// set offset for serialization
  
             beginX360FCurMmFil = getStartOffset() + 2;	// set offset for serialization
  
             beginX360FCurDdFil = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localX360FCurYyFilCounter = -1;
     public boolean isX360FCurYyFilModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FCurYyFilCounter != sharedCounter;
         localX360FCurYyFilCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FCurYyFil
	 *	@return x360FCurYyFil
	 */
	public char[]  getX360FCurYyFilString() {
	     return getCharArray(beginX360FCurYyFil,X_360_FCUR_YY_FIL_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FCurYyFilIsNumeric() {
	    return isNumeric(beginX360FCurYyFil
	                    ,beginX360FCurYyFil + X_360_FCUR_YY_FIL_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FCUR_YY_FIL_LEN = 2;
  	/**
	 * serializeX360FCurYyFil
	 */
	protected void serializeX360FCurYyFil(int x360FCurYyFil) {
		 putNumber(beginX360FCurYyFil,x360FCurYyFil,X_360_FCUR_YY_FIL_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FCurYyFilCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FCurYyFil
	 */
   	protected  int serializeX360FCurYyFil(char[] value) {
	    int  x360FCurYyFil;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FCurYyFil = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginX360FCurYyFil
		       ,2
		      );
		 localX360FCurYyFilCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FCurYyFil;
    }

   protected int checkX360FCurYyFilMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360FCurYyFil is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FCurYyFil() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360FCurYyFil
			                 ,X_360_FCUR_YY_FIL_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FCurYyFil", beginX360FCurYyFil,X_360_FCUR_YY_FIL_LEN);
    }
   	}
     int localX360FCurMmFilCounter = -1;
     public boolean isX360FCurMmFilModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FCurMmFilCounter != sharedCounter;
         localX360FCurMmFilCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FCurMmFil
	 *	@return x360FCurMmFil
	 */
	public char[]  getX360FCurMmFilString() {
	     return getCharArray(beginX360FCurMmFil,X_360_FCUR_MM_FIL_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FCurMmFilIsNumeric() {
	    return isNumeric(beginX360FCurMmFil
	                    ,beginX360FCurMmFil + X_360_FCUR_MM_FIL_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FCUR_MM_FIL_LEN = 2;
  	/**
	 * serializeX360FCurMmFil
	 */
	protected void serializeX360FCurMmFil(int x360FCurMmFil) {
		 putNumber(beginX360FCurMmFil,x360FCurMmFil,X_360_FCUR_MM_FIL_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FCurMmFilCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FCurMmFil
	 */
   	protected  int serializeX360FCurMmFil(char[] value) {
	    int  x360FCurMmFil;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FCurMmFil = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginX360FCurMmFil
		       ,2
		      );
		 localX360FCurMmFilCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FCurMmFil;
    }

   protected int checkX360FCurMmFilMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360FCurMmFil is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FCurMmFil() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360FCurMmFil
			                 ,X_360_FCUR_MM_FIL_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FCurMmFil", beginX360FCurMmFil,X_360_FCUR_MM_FIL_LEN);
    }
   	}
     int localX360FCurDdFilCounter = -1;
     public boolean isX360FCurDdFilModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FCurDdFilCounter != sharedCounter;
         localX360FCurDdFilCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FCurDdFil
	 *	@return x360FCurDdFil
	 */
	public char[]  getX360FCurDdFilString() {
	     return getCharArray(beginX360FCurDdFil,X_360_FCUR_DD_FIL_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FCurDdFilIsNumeric() {
	    return isNumeric(beginX360FCurDdFil
	                    ,beginX360FCurDdFil + X_360_FCUR_DD_FIL_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FCUR_DD_FIL_LEN = 2;
  	/**
	 * serializeX360FCurDdFil
	 */
	protected void serializeX360FCurDdFil(int x360FCurDdFil) {
		 putNumber(beginX360FCurDdFil,x360FCurDdFil,X_360_FCUR_DD_FIL_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FCurDdFilCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FCurDdFil
	 */
   	protected  int serializeX360FCurDdFil(char[] value) {
	    int  x360FCurDdFil;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FCurDdFil = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginX360FCurDdFil
		       ,2
		      );
		 localX360FCurDdFilCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FCurDdFil;
    }

   protected int checkX360FCurDdFilMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360FCurDdFil is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FCurDdFil() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360FCurDdFil
			                 ,X_360_FCUR_DD_FIL_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FCurDdFil", beginX360FCurDdFil,X_360_FCUR_DD_FIL_LEN);
    }
   	}




}
  

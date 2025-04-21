package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360FWorkOfDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class X360FWorkOfDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360FWorkOfDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_FWORK_OF_DATE_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360FWoYy;
            protected  int beginX360FWoMm;
            protected  int beginX360FWoDd;
	
	/**
	* Constructor for X360FWorkOfDateSerialized
	**/
    public X360FWorkOfDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360FWorkOfDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FWorkOfDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360FWorkOfDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,531); // serialize this field at offset 531 by default 
    }
    
	/**
	* sets parent for this X360FWorkOfDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 531 by default
    }    
	/**
	* initializes the field in X360FWorkOfDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_FWORK_OF_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360FWoYy = getStartOffset() + 0;	// set offset for serialization
  
             beginX360FWoMm = getStartOffset() + 2;	// set offset for serialization
  
             beginX360FWoDd = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localX360FWoYyCounter = -1;
     public boolean isX360FWoYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FWoYyCounter != sharedCounter;
         localX360FWoYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FWoYy
	 *	@return x360FWoYy
	 */
	public char[]  getX360FWoYyString() {
	     return getCharArray(beginX360FWoYy,X_360_FWO_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FWoYyIsNumeric() {
	    return isNumeric(beginX360FWoYy
	                    ,beginX360FWoYy + X_360_FWO_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FWO_YY_LEN = 2;
  	/**
	 * serializeX360FWoYy
	 */
	protected void serializeX360FWoYy(int x360FWoYy) {
		 putNumber(beginX360FWoYy,x360FWoYy,X_360_FWO_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FWoYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FWoYy
	 */
   	protected  int serializeX360FWoYy(char[] value) {
	    int  x360FWoYy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FWoYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginX360FWoYy
		       ,2
		      );
		 localX360FWoYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FWoYy;
    }

   protected int checkX360FWoYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360FWoYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FWoYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360FWoYy
			                 ,X_360_FWO_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FWoYy", beginX360FWoYy,X_360_FWO_YY_LEN);
    }
   	}
     int localX360FWoMmCounter = -1;
     public boolean isX360FWoMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FWoMmCounter != sharedCounter;
         localX360FWoMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FWoMm
	 *	@return x360FWoMm
	 */
	public char[]  getX360FWoMmString() {
	     return getCharArray(beginX360FWoMm,X_360_FWO_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FWoMmIsNumeric() {
	    return isNumeric(beginX360FWoMm
	                    ,beginX360FWoMm + X_360_FWO_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FWO_MM_LEN = 2;
  	/**
	 * serializeX360FWoMm
	 */
	protected void serializeX360FWoMm(int x360FWoMm) {
		 putNumber(beginX360FWoMm,x360FWoMm,X_360_FWO_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FWoMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FWoMm
	 */
   	protected  int serializeX360FWoMm(char[] value) {
	    int  x360FWoMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FWoMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginX360FWoMm
		       ,2
		      );
		 localX360FWoMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FWoMm;
    }

   protected int checkX360FWoMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360FWoMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FWoMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360FWoMm
			                 ,X_360_FWO_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FWoMm", beginX360FWoMm,X_360_FWO_MM_LEN);
    }
   	}
     int localX360FWoDdCounter = -1;
     public boolean isX360FWoDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FWoDdCounter != sharedCounter;
         localX360FWoDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FWoDd
	 *	@return x360FWoDd
	 */
	public char[]  getX360FWoDdString() {
	     return getCharArray(beginX360FWoDd,X_360_FWO_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FWoDdIsNumeric() {
	    return isNumeric(beginX360FWoDd
	                    ,beginX360FWoDd + X_360_FWO_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FWO_DD_LEN = 2;
  	/**
	 * serializeX360FWoDd
	 */
	protected void serializeX360FWoDd(int x360FWoDd) {
		 putNumber(beginX360FWoDd,x360FWoDd,X_360_FWO_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FWoDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FWoDd
	 */
   	protected  int serializeX360FWoDd(char[] value) {
	    int  x360FWoDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FWoDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginX360FWoDd
		       ,2
		      );
		 localX360FWoDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FWoDd;
    }

   protected int checkX360FWoDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360FWoDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FWoDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360FWoDd
			                 ,X_360_FWO_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FWoDd", beginX360FWoDd,X_360_FWO_DD_LEN);
    }
   	}




}
  

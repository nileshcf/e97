package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360FWorkOfDateFilSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class X360FWorkOfDateFilSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360FWorkOfDateFilSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_FWORK_OF_DATE_FIL_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360FWoYyFil;
            protected  int beginX360FWoMmFil;
            protected  int beginX360FWoDdFil;
	
	/**
	* Constructor for X360FWorkOfDateFilSerialized
	**/
    public X360FWorkOfDateFilSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360FWorkOfDateFilSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FWorkOfDateFilSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360FWorkOfDateFilSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,531); // serialize this field at offset 531 by default 
    }
    
	/**
	* sets parent for this X360FWorkOfDateFilSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 531 by default
    }    
	/**
	* initializes the field in X360FWorkOfDateFilSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_FWORK_OF_DATE_FIL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360FWoYyFil = getStartOffset() + 0;	// set offset for serialization
  
             beginX360FWoMmFil = getStartOffset() + 2;	// set offset for serialization
  
             beginX360FWoDdFil = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localX360FWoYyFilCounter = -1;
     public boolean isX360FWoYyFilModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FWoYyFilCounter != sharedCounter;
         localX360FWoYyFilCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FWoYyFil
	 *	@return x360FWoYyFil
	 */
	public char[]  getX360FWoYyFilString() {
	     return getCharArray(beginX360FWoYyFil,X_360_FWO_YY_FIL_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FWoYyFilIsNumeric() {
	    return isNumeric(beginX360FWoYyFil
	                    ,beginX360FWoYyFil + X_360_FWO_YY_FIL_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FWO_YY_FIL_LEN = 2;
  	/**
	 * serializeX360FWoYyFil
	 */
	protected void serializeX360FWoYyFil(int x360FWoYyFil) {
		 putNumber(beginX360FWoYyFil,x360FWoYyFil,X_360_FWO_YY_FIL_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FWoYyFilCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FWoYyFil
	 */
   	protected  int serializeX360FWoYyFil(char[] value) {
	    int  x360FWoYyFil;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FWoYyFil = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginX360FWoYyFil
		       ,2
		      );
		 localX360FWoYyFilCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FWoYyFil;
    }

   protected int checkX360FWoYyFilMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360FWoYyFil is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FWoYyFil() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360FWoYyFil
			                 ,X_360_FWO_YY_FIL_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FWoYyFil", beginX360FWoYyFil,X_360_FWO_YY_FIL_LEN);
    }
   	}
     int localX360FWoMmFilCounter = -1;
     public boolean isX360FWoMmFilModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FWoMmFilCounter != sharedCounter;
         localX360FWoMmFilCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FWoMmFil
	 *	@return x360FWoMmFil
	 */
	public char[]  getX360FWoMmFilString() {
	     return getCharArray(beginX360FWoMmFil,X_360_FWO_MM_FIL_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FWoMmFilIsNumeric() {
	    return isNumeric(beginX360FWoMmFil
	                    ,beginX360FWoMmFil + X_360_FWO_MM_FIL_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FWO_MM_FIL_LEN = 2;
  	/**
	 * serializeX360FWoMmFil
	 */
	protected void serializeX360FWoMmFil(int x360FWoMmFil) {
		 putNumber(beginX360FWoMmFil,x360FWoMmFil,X_360_FWO_MM_FIL_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FWoMmFilCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FWoMmFil
	 */
   	protected  int serializeX360FWoMmFil(char[] value) {
	    int  x360FWoMmFil;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FWoMmFil = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginX360FWoMmFil
		       ,2
		      );
		 localX360FWoMmFilCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FWoMmFil;
    }

   protected int checkX360FWoMmFilMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360FWoMmFil is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FWoMmFil() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360FWoMmFil
			                 ,X_360_FWO_MM_FIL_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FWoMmFil", beginX360FWoMmFil,X_360_FWO_MM_FIL_LEN);
    }
   	}
     int localX360FWoDdFilCounter = -1;
     public boolean isX360FWoDdFilModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FWoDdFilCounter != sharedCounter;
         localX360FWoDdFilCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FWoDdFil
	 *	@return x360FWoDdFil
	 */
	public char[]  getX360FWoDdFilString() {
	     return getCharArray(beginX360FWoDdFil,X_360_FWO_DD_FIL_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FWoDdFilIsNumeric() {
	    return isNumeric(beginX360FWoDdFil
	                    ,beginX360FWoDdFil + X_360_FWO_DD_FIL_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FWO_DD_FIL_LEN = 2;
  	/**
	 * serializeX360FWoDdFil
	 */
	protected void serializeX360FWoDdFil(int x360FWoDdFil) {
		 putNumber(beginX360FWoDdFil,x360FWoDdFil,X_360_FWO_DD_FIL_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FWoDdFilCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FWoDdFil
	 */
   	protected  int serializeX360FWoDdFil(char[] value) {
	    int  x360FWoDdFil;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FWoDdFil = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginX360FWoDdFil
		       ,2
		      );
		 localX360FWoDdFilCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FWoDdFil;
    }

   protected int checkX360FWoDdFilMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360FWoDdFil is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FWoDdFil() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360FWoDdFil
			                 ,X_360_FWO_DD_FIL_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FWoDdFil", beginX360FWoDdFil,X_360_FWO_DD_FIL_LEN);
    }
   	}




}
  

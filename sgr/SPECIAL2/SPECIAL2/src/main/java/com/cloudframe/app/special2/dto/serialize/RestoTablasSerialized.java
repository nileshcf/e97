package com.cloudframe.app.special2.dto.serialize;

/**
*  The class RestoTablasSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RestoTablasSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RestoTablasSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RESTO_TABLAS_LENGTH = 1704;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTiNMax;
	
	/**
	* Constructor for RestoTablasSerialized
	**/
    public RestoTablasSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RestoTablasSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RESTO_TABLAS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTiNMax = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localTiNMaxCounter = -1;
     public boolean isTiNMaxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTiNMaxCounter != sharedCounter;
         localTiNMaxCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tiNMax
	 *	@return tiNMax
	 */
	public char[]  getTiNMaxString() {
	     return getCharArray(beginTiNMax,TI_NMAX_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tiNMaxIsNumeric() {
	    return isNumeric(beginTiNMax
	                    ,beginTiNMax + TI_NMAX_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TI_NMAX_LEN = 2;
  	/**
	 * serializeTiNMax
	 */
	protected void serializeTiNMax(int tiNMax) {
		 putNumber(beginTiNMax,tiNMax,TI_NMAX_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTiNMaxCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTiNMax
	 */
   	protected  int serializeTiNMax(char[] value) {
	    int  tiNMax;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tiNMax = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginTiNMax
		       ,2
		      );
		 localTiNMaxCounter = shareString.getSerializedField().getModifiedCounter();
		return  tiNMax;
    }

   protected int checkTiNMaxMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTiNMax is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTiNMax() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTiNMax
			                 ,TI_NMAX_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tiNMax", beginTiNMax,TI_NMAX_LEN);
    }
   	}




}
  

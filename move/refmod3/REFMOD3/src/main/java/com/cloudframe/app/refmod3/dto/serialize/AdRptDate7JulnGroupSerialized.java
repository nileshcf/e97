package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class AdRptDate7JulnGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AdRptDate7JulnGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AdRptDate7JulnGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AD_RPT_DATE_7_JULN_GROUP_LENGTH = 7;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAdRptDate7Juln;
	
	/**
	* Constructor for AdRptDate7JulnGroupSerialized
	**/
    public AdRptDate7JulnGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AdRptDate7JulnGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AD_RPT_DATE_7_JULN_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAdRptDate7Juln = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAdRptDate7JulnCounter = -1;
     public boolean isAdRptDate7JulnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAdRptDate7JulnCounter != sharedCounter;
         localAdRptDate7JulnCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of adRptDate7Juln
	 *	@return adRptDate7Juln
	 */
	public char[]  getAdRptDate7JulnString() {
	     return getCharArray(beginAdRptDate7Juln,AD_RPT_DATE_7_JULN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean adRptDate7JulnIsNumeric() {
	    return isNumeric(beginAdRptDate7Juln
	                    ,beginAdRptDate7Juln + AD_RPT_DATE_7_JULN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AD_RPT_DATE_7_JULN_LEN = 7;
  	/**
	 * serializeAdRptDate7Juln
	 */
	protected void serializeAdRptDate7Juln(long adRptDate7Juln) {
		 putNumber(beginAdRptDate7Juln,adRptDate7Juln,AD_RPT_DATE_7_JULN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAdRptDate7JulnCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAdRptDate7Juln
	 */
   	protected  long serializeAdRptDate7Juln(char[] value) {
	    long  adRptDate7Juln;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    adRptDate7Juln = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginAdRptDate7Juln
		       ,7
		      );
		 localAdRptDate7JulnCounter = shareString.getSerializedField().getModifiedCounter();
		return  adRptDate7Juln;
    }

   protected long checkAdRptDate7JulnMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAdRptDate7Juln is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAdRptDate7Juln() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAdRptDate7Juln
			                 ,AD_RPT_DATE_7_JULN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("adRptDate7Juln", beginAdRptDate7Juln,AD_RPT_DATE_7_JULN_LEN);
    }
   	}




}
  

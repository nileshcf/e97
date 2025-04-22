package com.cloudframe.app.cfdate02.dto.serialize;

/**
*  The class CmnDateValidRSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnDateValidRSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnDateValidRSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_DATE_VALID_R_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnDateValidDd;
	
	/**
	* Constructor for CmnDateValidRSerialized
	**/
    public CmnDateValidRSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnDateValidRSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateValidRSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnDateValidRSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1035); // serialize this field at offset 1035 by default 
    }
    
	/**
	* sets parent for this CmnDateValidRSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1035 by default
    }    
	/**
	* initializes the field in CmnDateValidRSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_DATE_VALID_R_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnDateValidDd = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnDateValidDdCounter = -1;
     public boolean isCmnDateValidDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateValidDdCounter != sharedCounter;
         localCmnDateValidDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnDateValidDd
	 *	@return cmnDateValidDd
	 */
	public char[]  getCmnDateValidDdString() {
	     return getCharArray(beginCmnDateValidDd,CMN_DATE_VALID_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnDateValidDdIsNumeric() {
	    return isNumeric(beginCmnDateValidDd
	                    ,beginCmnDateValidDd + CMN_DATE_VALID_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_DATE_VALID_DD_LEN = 2;
  	/**
	 * serializeCmnDateValidDd
	 */
	protected void serializeCmnDateValidDd(int cmnDateValidDd) {
		 putNumber(beginCmnDateValidDd,cmnDateValidDd,CMN_DATE_VALID_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnDateValidDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnDateValidDd
	 */
   	protected  int serializeCmnDateValidDd(char[] value) {
	    int  cmnDateValidDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnDateValidDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnDateValidDd
		       ,2
		      );
		 localCmnDateValidDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnDateValidDd;
    }

   protected int checkCmnDateValidDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnDateValidDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnDateValidDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnDateValidDd
			                 ,CMN_DATE_VALID_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnDateValidDd", beginCmnDateValidDd,CMN_DATE_VALID_DD_LEN);
    }
   	}




}
  

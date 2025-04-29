package com.cloudframe.app.cfif01.dto.serialize;

/**
*  The class Gp004300PinBlckFrmtCdGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Gp004300PinBlckFrmtCdGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Gp004300PinBlckFrmtCdGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GP_004300_PIN_BLCK_FRMT_CD_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginGp004300PinBlckFrmtCd;
            protected  int beginGp004300PinBlckFrmt;
	
	/**
	* Constructor for Gp004300PinBlckFrmtCdGroupSerialized
	**/
    public Gp004300PinBlckFrmtCdGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Gp004300PinBlckFrmtCdGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GP_004300_PIN_BLCK_FRMT_CD_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginGp004300PinBlckFrmtCd = getStartOffset() + 0;	// set offset for serialization
  
             beginGp004300PinBlckFrmt = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localGp004300PinBlckFrmtCdCounter = -1;
     public boolean isGp004300PinBlckFrmtCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGp004300PinBlckFrmtCdCounter != sharedCounter;
         localGp004300PinBlckFrmtCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of gp004300PinBlckFrmtCd
	 *	@return gp004300PinBlckFrmtCd
	 */
	public char[]  getGp004300PinBlckFrmtCdString() {
	     return getCharArray(beginGp004300PinBlckFrmtCd,GP_004300_PIN_BLCK_FRMT_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean gp004300PinBlckFrmtCdIsNumeric() {
	    return isNumeric(beginGp004300PinBlckFrmtCd
	                    ,beginGp004300PinBlckFrmtCd + GP_004300_PIN_BLCK_FRMT_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int GP_004300_PIN_BLCK_FRMT_CD_LEN = 2;
  	/**
	 * serializeGp004300PinBlckFrmtCd
	 */
	protected void serializeGp004300PinBlckFrmtCd(int gp004300PinBlckFrmtCd) {
		 putNumber(beginGp004300PinBlckFrmtCd,gp004300PinBlckFrmtCd,GP_004300_PIN_BLCK_FRMT_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localGp004300PinBlckFrmtCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeGp004300PinBlckFrmtCd
	 */
   	protected  int serializeGp004300PinBlckFrmtCd(char[] value) {
	    int  gp004300PinBlckFrmtCd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    gp004300PinBlckFrmtCd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginGp004300PinBlckFrmtCd
		       ,2
		      );
		 localGp004300PinBlckFrmtCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  gp004300PinBlckFrmtCd;
    }

   protected int checkGp004300PinBlckFrmtCdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshGp004300PinBlckFrmtCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshGp004300PinBlckFrmtCd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginGp004300PinBlckFrmtCd
			                 ,GP_004300_PIN_BLCK_FRMT_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("gp004300PinBlckFrmtCd", beginGp004300PinBlckFrmtCd,GP_004300_PIN_BLCK_FRMT_CD_LEN);
    }
   	}
     int localGp004300PinBlckFrmtCounter = -1;
     public boolean isGp004300PinBlckFrmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGp004300PinBlckFrmtCounter != sharedCounter;
         localGp004300PinBlckFrmtCounter = sharedCounter; return hasModified;
     }
	protected static final int GP_004300_PIN_BLCK_FRMT_LEN = 2;
	/**
	 * 	serialize this Gp004300PinBlckFrmt
	 */
   protected void serializeGp004300PinBlckFrmt(char[] gp004300PinBlckFrmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(gp004300PinBlckFrmt,0,getStringValue(),beginGp004300PinBlckFrmt,GP_004300_PIN_BLCK_FRMT_LEN);
       localGp004300PinBlckFrmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGp004300PinBlckFrmtConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshGp004300PinBlckFrmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGp004300PinBlckFrmt() {	 
   		return (substring(getStringValue(),beginGp004300PinBlckFrmt,beginGp004300PinBlckFrmt + GP_004300_PIN_BLCK_FRMT_LEN));
   	}




}
  

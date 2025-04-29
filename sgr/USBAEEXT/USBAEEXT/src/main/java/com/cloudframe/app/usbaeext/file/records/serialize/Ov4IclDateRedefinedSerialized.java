package com.cloudframe.app.usbaeext.file.records.serialize;

/**
*  The class Ov4IclDateRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ov4IclDateRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ov4IclDateRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OV_4_ICL_DATE_REDEFINED_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOv4IclYy;
	
	/**
	* Constructor for Ov4IclDateRedefinedSerialized
	**/
    public Ov4IclDateRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ov4IclDateRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4IclDateRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ov4IclDateRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,211); // serialize this field at offset 211 by default 
    }
    
	/**
	* sets parent for this Ov4IclDateRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 211 by default
    }    
	/**
	* initializes the field in Ov4IclDateRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OV_4_ICL_DATE_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOv4IclYy = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localOv4IclYyCounter = -1;
     public boolean isOv4IclYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4IclYyCounter != sharedCounter;
         localOv4IclYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ov4IclYy
	 *	@return ov4IclYy
	 */
	public char[]  getOv4IclYyString() {
	     return getCharArray(beginOv4IclYy,OV_4_ICL_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4IclYyIsNumeric() {
	    return isNumeric(beginOv4IclYy
	                    ,beginOv4IclYy + OV_4_ICL_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OV_4_ICL_YY_LEN = 2;
  	/**
	 * serializeOv4IclYy
	 */
	protected void serializeOv4IclYy(int ov4IclYy) {
		 putNumber(beginOv4IclYy,ov4IclYy,OV_4_ICL_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4IclYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOv4IclYy
	 */
   	protected  int serializeOv4IclYy(char[] value) {
	    int  ov4IclYy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ov4IclYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginOv4IclYy
		       ,2
		      );
		 localOv4IclYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  ov4IclYy;
    }

   protected int checkOv4IclYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOv4IclYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOv4IclYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginOv4IclYy
			                 ,OV_4_ICL_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4IclYy", beginOv4IclYy,OV_4_ICL_YY_LEN);
    }
   	}




}
  

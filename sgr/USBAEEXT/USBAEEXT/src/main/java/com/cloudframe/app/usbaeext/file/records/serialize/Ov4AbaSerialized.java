package com.cloudframe.app.usbaeext.file.records.serialize;

/**
*  The class Ov4AbaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ov4AbaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ov4AbaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OV_4_ABA_LENGTH = 9;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOv4AbaNo;
	
	/**
	* Constructor for Ov4AbaSerialized
	**/
    public Ov4AbaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ov4AbaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4AbaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ov4AbaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,125); // serialize this field at offset 125 by default 
    }
    
	/**
	* sets parent for this Ov4AbaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 125 by default
    }    
	/**
	* initializes the field in Ov4AbaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OV_4_ABA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOv4AbaNo = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localOv4AbaNoCounter = -1;
     public boolean isOv4AbaNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4AbaNoCounter != sharedCounter;
         localOv4AbaNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ov4AbaNo
	 *	@return ov4AbaNo
	 */
	public char[]  getOv4AbaNoString() {
	     return getCharArray(beginOv4AbaNo,OV_4_ABA_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4AbaNoIsNumeric() {
	    return isNumeric(beginOv4AbaNo
	                    ,beginOv4AbaNo + OV_4_ABA_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OV_4_ABA_NO_LEN = 8;
  	/**
	 * serializeOv4AbaNo
	 */
	protected void serializeOv4AbaNo(long ov4AbaNo) {
		 putNumber(beginOv4AbaNo,ov4AbaNo,OV_4_ABA_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4AbaNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOv4AbaNo
	 */
   	protected  long serializeOv4AbaNo(char[] value) {
	    long  ov4AbaNo;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ov4AbaNo = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginOv4AbaNo
		       ,8
		      );
		 localOv4AbaNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  ov4AbaNo;
    }

   protected long checkOv4AbaNoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOv4AbaNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshOv4AbaNo() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginOv4AbaNo
			                 ,OV_4_ABA_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4AbaNo", beginOv4AbaNo,OV_4_ABA_NO_LEN);
    }
   	}




}
  

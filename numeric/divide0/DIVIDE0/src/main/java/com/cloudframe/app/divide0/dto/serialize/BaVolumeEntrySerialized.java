package com.cloudframe.app.divide0.dto.serialize;

/**
*  The class BaVolumeEntrySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BaVolumeEntrySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BaVolumeEntrySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BA_VOLUME_ENTRY_LENGTH = 9;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBaVolEntry;
	
	/**
	* Constructor for BaVolumeEntrySerialized
	**/
    public BaVolumeEntrySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BaVolumeEntrySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BaVolumeEntrySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BaVolumeEntrySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this BaVolumeEntrySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in BaVolumeEntrySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BA_VOLUME_ENTRY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBaVolEntry = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBaVolEntryCounter = -1;
     public boolean isBaVolEntryModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBaVolEntryCounter != sharedCounter;
         localBaVolEntryCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of baVolEntry
	 *	@return baVolEntry
	 */
	public char[]  getBaVolEntryString() {
	     return getCharArray(beginBaVolEntry,BA_VOL_ENTRY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean baVolEntryIsNumeric() {
	    return isNumeric(beginBaVolEntry
	                    ,beginBaVolEntry + BA_VOL_ENTRY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BA_VOL_ENTRY_LEN = 9;
  	/**
	 * serializeBaVolEntry
	 */
	protected void serializeBaVolEntry(long baVolEntry) {
		 putNumber(beginBaVolEntry,baVolEntry,BA_VOL_ENTRY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBaVolEntryCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBaVolEntry
	 */
   	protected  long serializeBaVolEntry(char[] value) {
	    long  baVolEntry;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    baVolEntry = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginBaVolEntry
		       ,9
		      );
		 localBaVolEntryCounter = shareString.getSerializedField().getModifiedCounter();
		return  baVolEntry;
    }

   protected long checkBaVolEntryMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBaVolEntry is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBaVolEntry() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBaVolEntry
			                 ,BA_VOL_ENTRY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("baVolEntry", beginBaVolEntry,BA_VOL_ENTRY_LEN);
    }
   	}




}
  

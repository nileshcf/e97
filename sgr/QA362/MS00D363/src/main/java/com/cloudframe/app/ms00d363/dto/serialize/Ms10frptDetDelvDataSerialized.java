package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class Ms10frptDetDelvDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ms10frptDetDelvDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ms10frptDetDelvDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MS_10FRPT_DET_DELV_DATA_LENGTH = 74;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMs10frptDetProc2;
	
	/**
	* Constructor for Ms10frptDetDelvDataSerialized
	**/
    public Ms10frptDetDelvDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ms10frptDetDelvDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ms10frptDetDelvDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ms10frptDetDelvDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ms10frptDetDelvDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ms10frptDetDelvDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MS_10FRPT_DET_DELV_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginMs10frptDetProc2 = getStartOffset() + 64;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMs10frptDetProc2Counter = -1;
     public boolean isMs10frptDetProc2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMs10frptDetProc2Counter != sharedCounter;
         localMs10frptDetProc2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ms10frptDetProc2
	 *	@return ms10frptDetProc2
	 */
	public char[]  getMs10frptDetProc2String() {
	     return getCharArray(beginMs10frptDetProc2,MS_10FRPT_DET_PROC_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ms10frptDetProc2IsNumeric() {
	    return isNumeric(beginMs10frptDetProc2
	                    ,beginMs10frptDetProc2 + MS_10FRPT_DET_PROC_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MS_10FRPT_DET_PROC_2_LEN = 10;
  	/**
	 * serializeMs10frptDetProc2
	 */
	protected void serializeMs10frptDetProc2(long ms10frptDetProc2) {
		 putNumber(beginMs10frptDetProc2,ms10frptDetProc2,MS_10FRPT_DET_PROC_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMs10frptDetProc2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMs10frptDetProc2
	 */
   	protected  long serializeMs10frptDetProc2(char[] value) {
	    long  ms10frptDetProc2;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ms10frptDetProc2 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginMs10frptDetProc2
		       ,10
		      );
		 localMs10frptDetProc2Counter = shareString.getSerializedField().getModifiedCounter();
		return  ms10frptDetProc2;
    }

   protected long checkMs10frptDetProc2MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMs10frptDetProc2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMs10frptDetProc2() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMs10frptDetProc2
			                 ,MS_10FRPT_DET_PROC_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ms10frptDetProc2", beginMs10frptDetProc2,MS_10FRPT_DET_PROC_2_LEN);
    }
   	}




}
  

package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class De48Se66SfLen500RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class De48Se66SfLen500RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(De48Se66SfLen500RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DE_48_SE_66_SF_LEN_500_REDEFINED_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDe48Se66SfLen9500;
	
	/**
	* Constructor for De48Se66SfLen500RedefinedSerialized
	**/
    public De48Se66SfLen500RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for De48Se66SfLen500RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public De48Se66SfLen500RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this De48Se66SfLen500RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this De48Se66SfLen500RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in De48Se66SfLen500RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DE_48_SE_66_SF_LEN_500_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDe48Se66SfLen9500 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDe48Se66SfLen9500Counter = -1;
     public boolean isDe48Se66SfLen9500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe48Se66SfLen9500Counter != sharedCounter;
         localDe48Se66SfLen9500Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of de48Se66SfLen9500
	 *	@return de48Se66SfLen9500
	 */
	public char[]  getDe48Se66SfLen9500String() {
	     return getCharArray(beginDe48Se66SfLen9500,DE_48_SE_66_SF_LEN_9500_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean de48Se66SfLen9500IsNumeric() {
	    return isNumeric(beginDe48Se66SfLen9500
	                    ,beginDe48Se66SfLen9500 + DE_48_SE_66_SF_LEN_9500_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DE_48_SE_66_SF_LEN_9500_LEN = 2;
  	/**
	 * serializeDe48Se66SfLen9500
	 */
	protected void serializeDe48Se66SfLen9500(int de48Se66SfLen9500) {
		 putNumber(beginDe48Se66SfLen9500,de48Se66SfLen9500,DE_48_SE_66_SF_LEN_9500_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDe48Se66SfLen9500Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDe48Se66SfLen9500
	 */
   	protected  int serializeDe48Se66SfLen9500(char[] value) {
	    int  de48Se66SfLen9500;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    de48Se66SfLen9500 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginDe48Se66SfLen9500
		       ,2
		      );
		 localDe48Se66SfLen9500Counter = shareString.getSerializedField().getModifiedCounter();
		return  de48Se66SfLen9500;
    }

   protected int checkDe48Se66SfLen9500MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDe48Se66SfLen9500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDe48Se66SfLen9500() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDe48Se66SfLen9500
			                 ,DE_48_SE_66_SF_LEN_9500_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("de48Se66SfLen9500", beginDe48Se66SfLen9500,DE_48_SE_66_SF_LEN_9500_LEN);
    }
   	}




}
  

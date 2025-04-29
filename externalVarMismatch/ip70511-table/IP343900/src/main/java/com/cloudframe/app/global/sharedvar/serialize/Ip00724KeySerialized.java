package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00724KeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00724KeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00724KeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00724_KEY_LENGTH = 11;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00724Ica;
            protected  int beginIp00724IcaRedX;
	
	/**
	* Constructor for Ip00724KeySerialized
	**/
    public Ip00724KeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00724KeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00724KeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00724KeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip00724KeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip00724KeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00724_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00724Ica = getStartOffset() + 0;	// set offset for serialization
  
             beginIp00724IcaRedX = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00724IcaCounter = -1;
     public boolean isIp00724IcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724IcaCounter != sharedCounter;
         localIp00724IcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00724Ica
	 *	@return ip00724Ica
	 */
	public char[]  getIp00724IcaString() {
	     return getCharArray(beginIp00724Ica,IP_00724_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00724IcaIsNumeric() {
	    return isNumeric(beginIp00724Ica
	                    ,beginIp00724Ica + IP_00724_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00724_ICA_LEN = 11;
  	/**
	 * serializeIp00724Ica
	 */
	protected void serializeIp00724Ica(long ip00724Ica) {
		 putNumber(beginIp00724Ica,ip00724Ica,IP_00724_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00724IcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00724Ica
	 */
   	protected  long serializeIp00724Ica(char[] value) {
	    long  ip00724Ica;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00724Ica = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginIp00724Ica
		       ,11
		      );
		 localIp00724IcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00724Ica;
    }

   protected long checkIp00724IcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00724Ica is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp00724Ica() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp00724Ica
			                 ,IP_00724_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00724Ica", beginIp00724Ica,IP_00724_ICA_LEN);
    }
   	}
     int localIp00724IcaRedXCounter = -1;
     public boolean isIp00724IcaRedXModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724IcaRedXCounter != sharedCounter;
         localIp00724IcaRedXCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_ICA_RED_X_LEN = 11;
	/**
	 * 	serialize this Ip00724IcaRedX
	 */
   protected void serializeIp00724IcaRedX(char[] ip00724IcaRedX) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724IcaRedX,0,getStringValue(),beginIp00724IcaRedX,IP_00724_ICA_RED_X_LEN);
       localIp00724IcaRedXCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724IcaRedXConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshIp00724IcaRedX is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724IcaRedX() {	 
   		return (substring(getStringValue(),beginIp00724IcaRedX,beginIp00724IcaRedX + IP_00724_ICA_RED_X_LEN));
   	}




}
  

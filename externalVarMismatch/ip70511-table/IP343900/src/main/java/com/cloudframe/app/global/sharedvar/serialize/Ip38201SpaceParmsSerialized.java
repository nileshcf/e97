package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip38201SpaceParmsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip38201SpaceParmsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip38201SpaceParmsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_38201_SPACE_PARMS_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp38201TrackCylinderInd;
            protected  int beginIp38201PrimarySpace;
            protected  int beginIp38201SecondarySpace;
            protected  int beginIp38201ReleaseIndicator;
	
	/**
	* Constructor for Ip38201SpaceParmsSerialized
	**/
    public Ip38201SpaceParmsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip38201SpaceParmsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip38201SpaceParmsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip38201SpaceParmsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,67); // serialize this field at offset 67 by default 
    }
    
	/**
	* sets parent for this Ip38201SpaceParmsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 67 by default
    }    
	/**
	* initializes the field in Ip38201SpaceParmsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_38201_SPACE_PARMS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp38201TrackCylinderInd = getStartOffset() + 0;	// set offset for serialization
  
             beginIp38201PrimarySpace = getStartOffset() + 1;	// set offset for serialization
  
             beginIp38201SecondarySpace = getStartOffset() + 6;	// set offset for serialization
  
             beginIp38201ReleaseIndicator = getStartOffset() + 11;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp38201TrackCylinderIndCounter = -1;
     public boolean isIp38201TrackCylinderIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201TrackCylinderIndCounter != sharedCounter;
         localIp38201TrackCylinderIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_38201_TRACK_CYLINDER_IND_LEN = 1;
	/**
	 * 	serialize this Ip38201TrackCylinderInd
	 */
   protected void serializeIp38201TrackCylinderInd(char[] ip38201TrackCylinderInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip38201TrackCylinderInd,0,getStringValue(),beginIp38201TrackCylinderInd,IP_38201_TRACK_CYLINDER_IND_LEN);
       localIp38201TrackCylinderIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp38201TrackCylinderIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp38201TrackCylinderInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp38201TrackCylinderInd() {	 
   		return (substring(getStringValue(),beginIp38201TrackCylinderInd,beginIp38201TrackCylinderInd + IP_38201_TRACK_CYLINDER_IND_LEN));
   	}
     int localIp38201PrimarySpaceCounter = -1;
     public boolean isIp38201PrimarySpaceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201PrimarySpaceCounter != sharedCounter;
         localIp38201PrimarySpaceCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip38201PrimarySpace
	 *	@return ip38201PrimarySpace
	 */
	public char[]  getIp38201PrimarySpaceString() {
	     return getCharArray(beginIp38201PrimarySpace,IP_38201_PRIMARY_SPACE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip38201PrimarySpaceIsNumeric() {
	    return isNumeric(beginIp38201PrimarySpace
	                    ,beginIp38201PrimarySpace + IP_38201_PRIMARY_SPACE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_38201_PRIMARY_SPACE_LEN = 5;
  	/**
	 * serializeIp38201PrimarySpace
	 */
	protected void serializeIp38201PrimarySpace(long ip38201PrimarySpace) {
		 putNumber(beginIp38201PrimarySpace,ip38201PrimarySpace,IP_38201_PRIMARY_SPACE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp38201PrimarySpaceCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp38201PrimarySpace
	 */
   	protected  long serializeIp38201PrimarySpace(char[] value) {
	    long  ip38201PrimarySpace;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip38201PrimarySpace = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginIp38201PrimarySpace
		       ,5
		      );
		 localIp38201PrimarySpaceCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip38201PrimarySpace;
    }

   protected long checkIp38201PrimarySpaceMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp38201PrimarySpace is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp38201PrimarySpace() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp38201PrimarySpace
			                 ,IP_38201_PRIMARY_SPACE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip38201PrimarySpace", beginIp38201PrimarySpace,IP_38201_PRIMARY_SPACE_LEN);
    }
   	}
     int localIp38201SecondarySpaceCounter = -1;
     public boolean isIp38201SecondarySpaceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201SecondarySpaceCounter != sharedCounter;
         localIp38201SecondarySpaceCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip38201SecondarySpace
	 *	@return ip38201SecondarySpace
	 */
	public char[]  getIp38201SecondarySpaceString() {
	     return getCharArray(beginIp38201SecondarySpace,IP_38201_SECONDARY_SPACE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip38201SecondarySpaceIsNumeric() {
	    return isNumeric(beginIp38201SecondarySpace
	                    ,beginIp38201SecondarySpace + IP_38201_SECONDARY_SPACE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_38201_SECONDARY_SPACE_LEN = 5;
  	/**
	 * serializeIp38201SecondarySpace
	 */
	protected void serializeIp38201SecondarySpace(long ip38201SecondarySpace) {
		 putNumber(beginIp38201SecondarySpace,ip38201SecondarySpace,IP_38201_SECONDARY_SPACE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp38201SecondarySpaceCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp38201SecondarySpace
	 */
   	protected  long serializeIp38201SecondarySpace(char[] value) {
	    long  ip38201SecondarySpace;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip38201SecondarySpace = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginIp38201SecondarySpace
		       ,5
		      );
		 localIp38201SecondarySpaceCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip38201SecondarySpace;
    }

   protected long checkIp38201SecondarySpaceMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp38201SecondarySpace is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp38201SecondarySpace() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp38201SecondarySpace
			                 ,IP_38201_SECONDARY_SPACE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip38201SecondarySpace", beginIp38201SecondarySpace,IP_38201_SECONDARY_SPACE_LEN);
    }
   	}
     int localIp38201ReleaseIndicatorCounter = -1;
     public boolean isIp38201ReleaseIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201ReleaseIndicatorCounter != sharedCounter;
         localIp38201ReleaseIndicatorCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_38201_RELEASE_INDICATOR_LEN = 1;
	/**
	 * 	serialize this Ip38201ReleaseIndicator
	 */
   protected void serializeIp38201ReleaseIndicator(char[] ip38201ReleaseIndicator) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip38201ReleaseIndicator,0,getStringValue(),beginIp38201ReleaseIndicator,IP_38201_RELEASE_INDICATOR_LEN);
       localIp38201ReleaseIndicatorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp38201ReleaseIndicatorConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp38201ReleaseIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp38201ReleaseIndicator() {	 
   		return (substring(getStringValue(),beginIp38201ReleaseIndicator,beginIp38201ReleaseIndicator + IP_38201_RELEASE_INDICATOR_LEN));
   	}




}
  

package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360MbrRptKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class X360MbrRptKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360MbrRptKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_MBR_RPT_KEY_LENGTH = 72;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360MbrEndpoint;
            protected  int beginX360MbrEntIca;
            protected  int beginX360MbrMbrIca;
            protected  int beginX360MbrCutTime;
            protected  int beginX360MbrErlyDelFlag;
	
	/**
	* Constructor for X360MbrRptKeySerialized
	**/
    public X360MbrRptKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360MbrRptKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360MbrRptKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360MbrRptKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1000); // serialize this field at offset 1000 by default 
    }
    
	/**
	* sets parent for this X360MbrRptKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1000 by default
    }    
	/**
	* initializes the field in X360MbrRptKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_MBR_RPT_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360MbrEndpoint = getStartOffset() + 0;	// set offset for serialization
  
             beginX360MbrEntIca = getStartOffset() + 7;	// set offset for serialization
  
             beginX360MbrMbrIca = getStartOffset() + 13;	// set offset for serialization
  
             beginX360MbrCutTime = getStartOffset() + 19;	// set offset for serialization
  
             beginX360MbrErlyDelFlag = getStartOffset() + 23;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localX360MbrEndpointCounter = -1;
     public boolean isX360MbrEndpointModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360MbrEndpointCounter != sharedCounter;
         localX360MbrEndpointCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360MbrEndpoint
	 *	@return x360MbrEndpoint
	 */
	public char[]  getX360MbrEndpointString() {
	     return getCharArray(beginX360MbrEndpoint,X_360_MBR_ENDPOINT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360MbrEndpointIsNumeric() {
	    return isNumeric(beginX360MbrEndpoint
	                    ,beginX360MbrEndpoint + X_360_MBR_ENDPOINT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_MBR_ENDPOINT_LEN = 7;
  	/**
	 * serializeX360MbrEndpoint
	 */
	protected void serializeX360MbrEndpoint(long x360MbrEndpoint) {
		 putNumber(beginX360MbrEndpoint,x360MbrEndpoint,X_360_MBR_ENDPOINT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360MbrEndpointCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360MbrEndpoint
	 */
   	protected  long serializeX360MbrEndpoint(char[] value) {
	    long  x360MbrEndpoint;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360MbrEndpoint = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginX360MbrEndpoint
		       ,7
		      );
		 localX360MbrEndpointCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360MbrEndpoint;
    }

   protected long checkX360MbrEndpointMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360MbrEndpoint is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360MbrEndpoint() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360MbrEndpoint
			                 ,X_360_MBR_ENDPOINT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360MbrEndpoint", beginX360MbrEndpoint,X_360_MBR_ENDPOINT_LEN);
    }
   	}
     int localX360MbrEntIcaCounter = -1;
     public boolean isX360MbrEntIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360MbrEntIcaCounter != sharedCounter;
         localX360MbrEntIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360MbrEntIca
	 *	@return x360MbrEntIca
	 */
	public char[]  getX360MbrEntIcaString() {
	     return getCharArray(beginX360MbrEntIca,X_360_MBR_ENT_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360MbrEntIcaIsNumeric() {
	    return isNumeric(beginX360MbrEntIca
	                    ,beginX360MbrEntIca + X_360_MBR_ENT_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_MBR_ENT_ICA_LEN = 6;
  	/**
	 * serializeX360MbrEntIca
	 */
	protected void serializeX360MbrEntIca(long x360MbrEntIca) {
		 putNumber(beginX360MbrEntIca,x360MbrEntIca,X_360_MBR_ENT_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360MbrEntIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360MbrEntIca
	 */
   	protected  long serializeX360MbrEntIca(char[] value) {
	    long  x360MbrEntIca;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360MbrEntIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginX360MbrEntIca
		       ,6
		      );
		 localX360MbrEntIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360MbrEntIca;
    }

   protected long checkX360MbrEntIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360MbrEntIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360MbrEntIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360MbrEntIca
			                 ,X_360_MBR_ENT_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360MbrEntIca", beginX360MbrEntIca,X_360_MBR_ENT_ICA_LEN);
    }
   	}
     int localX360MbrMbrIcaCounter = -1;
     public boolean isX360MbrMbrIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360MbrMbrIcaCounter != sharedCounter;
         localX360MbrMbrIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360MbrMbrIca
	 *	@return x360MbrMbrIca
	 */
	public char[]  getX360MbrMbrIcaString() {
	     return getCharArray(beginX360MbrMbrIca,X_360_MBR_MBR_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360MbrMbrIcaIsNumeric() {
	    return isNumeric(beginX360MbrMbrIca
	                    ,beginX360MbrMbrIca + X_360_MBR_MBR_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_MBR_MBR_ICA_LEN = 6;
  	/**
	 * serializeX360MbrMbrIca
	 */
	protected void serializeX360MbrMbrIca(long x360MbrMbrIca) {
		 putNumber(beginX360MbrMbrIca,x360MbrMbrIca,X_360_MBR_MBR_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360MbrMbrIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360MbrMbrIca
	 */
   	protected  long serializeX360MbrMbrIca(char[] value) {
	    long  x360MbrMbrIca;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360MbrMbrIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginX360MbrMbrIca
		       ,6
		      );
		 localX360MbrMbrIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360MbrMbrIca;
    }

   protected long checkX360MbrMbrIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360MbrMbrIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360MbrMbrIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360MbrMbrIca
			                 ,X_360_MBR_MBR_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360MbrMbrIca", beginX360MbrMbrIca,X_360_MBR_MBR_ICA_LEN);
    }
   	}
     int localX360MbrCutTimeCounter = -1;
     public boolean isX360MbrCutTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360MbrCutTimeCounter != sharedCounter;
         localX360MbrCutTimeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360MbrCutTime
	 *	@return x360MbrCutTime
	 */
	public char[]  getX360MbrCutTimeString() {
	     return getCharArray(beginX360MbrCutTime,X_360_MBR_CUT_TIME_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360MbrCutTimeIsNumeric() {
	    return isNumeric(beginX360MbrCutTime
	                    ,beginX360MbrCutTime + X_360_MBR_CUT_TIME_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_MBR_CUT_TIME_LEN = 4;
  	/**
	 * serializeX360MbrCutTime
	 */
	protected void serializeX360MbrCutTime(int x360MbrCutTime) {
		 putNumber(beginX360MbrCutTime,x360MbrCutTime,X_360_MBR_CUT_TIME_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360MbrCutTimeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360MbrCutTime
	 */
   	protected  int serializeX360MbrCutTime(char[] value) {
	    int  x360MbrCutTime;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360MbrCutTime = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginX360MbrCutTime
		       ,4
		      );
		 localX360MbrCutTimeCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360MbrCutTime;
    }

   protected int checkX360MbrCutTimeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360MbrCutTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360MbrCutTime() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360MbrCutTime
			                 ,X_360_MBR_CUT_TIME_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360MbrCutTime", beginX360MbrCutTime,X_360_MBR_CUT_TIME_LEN);
    }
   	}
     int localX360MbrErlyDelFlagCounter = -1;
     public boolean isX360MbrErlyDelFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360MbrErlyDelFlagCounter != sharedCounter;
         localX360MbrErlyDelFlagCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_MBR_ERLY_DEL_FLAG_LEN = 1;
	/**
	 * 	serialize this X360MbrErlyDelFlag
	 */
   protected void serializeX360MbrErlyDelFlag(char[] x360MbrErlyDelFlag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360MbrErlyDelFlag,0,getStringValue(),beginX360MbrErlyDelFlag,X_360_MBR_ERLY_DEL_FLAG_LEN);
       localX360MbrErlyDelFlagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360MbrErlyDelFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshX360MbrErlyDelFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360MbrErlyDelFlag() {	 
   		return (substring(getStringValue(),beginX360MbrErlyDelFlag,beginX360MbrErlyDelFlag + X_360_MBR_ERLY_DEL_FLAG_LEN));
   	}




}
  

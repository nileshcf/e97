package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360HeaderRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class X360HeaderRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360HeaderRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_HEADER_RECORD_LENGTH = 1399;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360HeaderId;
            protected  int beginX360HeaderPgm;
            protected  int beginX360HeaderFileId;
            protected  int beginX360HeaderEndpoint;
            protected  int beginX360HeaderEntIca;
            protected  int beginX360HeaderMbrIca;
            protected  int beginX360HeaderCuttime;
	
	/**
	* Constructor for X360HeaderRecordSerialized
	**/
    public X360HeaderRecordSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360HeaderRecordSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360HeaderRecordSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360HeaderRecordSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1); // serialize this field at offset 1 by default 
    }
    
	/**
	* sets parent for this X360HeaderRecordSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1 by default
    }    
	/**
	* initializes the field in X360HeaderRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_HEADER_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360HeaderId = getStartOffset() + 0;	// set offset for serialization
  
  
             beginX360HeaderPgm = getStartOffset() + 9;	// set offset for serialization
  
  
  
  
             beginX360HeaderFileId = getStartOffset() + 29;	// set offset for serialization
  
             beginX360HeaderEndpoint = getStartOffset() + 32;	// set offset for serialization
  
             beginX360HeaderEntIca = getStartOffset() + 39;	// set offset for serialization
  
             beginX360HeaderMbrIca = getStartOffset() + 45;	// set offset for serialization
  
             beginX360HeaderCuttime = getStartOffset() + 51;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localX360HeaderIdCounter = -1;
     public boolean isX360HeaderIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderIdCounter != sharedCounter;
         localX360HeaderIdCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_ID_LEN = 8;
	/**
	 * 	serialize this X360HeaderId
	 */
   protected void serializeX360HeaderId(char[] x360HeaderId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderId,0,getStringValue(),beginX360HeaderId,X_360_HEADER_ID_LEN);
       localX360HeaderIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshX360HeaderId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderId() {	 
   		return (substring(getStringValue(),beginX360HeaderId,beginX360HeaderId + X_360_HEADER_ID_LEN));
   	}
     int localX360HeaderPgmCounter = -1;
     public boolean isX360HeaderPgmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderPgmCounter != sharedCounter;
         localX360HeaderPgmCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_PGM_LEN = 8;
	/**
	 * 	serialize this X360HeaderPgm
	 */
   protected void serializeX360HeaderPgm(char[] x360HeaderPgm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderPgm,0,getStringValue(),beginX360HeaderPgm,X_360_HEADER_PGM_LEN);
       localX360HeaderPgmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderPgmConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshX360HeaderPgm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderPgm() {	 
   		return (substring(getStringValue(),beginX360HeaderPgm,beginX360HeaderPgm + X_360_HEADER_PGM_LEN));
   	}
     int localX360HeaderFileIdCounter = -1;
     public boolean isX360HeaderFileIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderFileIdCounter != sharedCounter;
         localX360HeaderFileIdCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_FILE_ID_LEN = 3;
	/**
	 * 	serialize this X360HeaderFileId
	 */
   protected void serializeX360HeaderFileId(char[] x360HeaderFileId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderFileId,0,getStringValue(),beginX360HeaderFileId,X_360_HEADER_FILE_ID_LEN);
       localX360HeaderFileIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderFileIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360HeaderFileId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderFileId() {	 
   		return (substring(getStringValue(),beginX360HeaderFileId,beginX360HeaderFileId + X_360_HEADER_FILE_ID_LEN));
   	}
     int localX360HeaderEndpointCounter = -1;
     public boolean isX360HeaderEndpointModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderEndpointCounter != sharedCounter;
         localX360HeaderEndpointCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360HeaderEndpoint
	 *	@return x360HeaderEndpoint
	 */
	public char[]  getX360HeaderEndpointString() {
	     return getCharArray(beginX360HeaderEndpoint,X_360_HEADER_ENDPOINT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360HeaderEndpointIsNumeric() {
	    return isNumeric(beginX360HeaderEndpoint
	                    ,beginX360HeaderEndpoint + X_360_HEADER_ENDPOINT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_HEADER_ENDPOINT_LEN = 7;
  	/**
	 * serializeX360HeaderEndpoint
	 */
	protected void serializeX360HeaderEndpoint(long x360HeaderEndpoint) {
		 putNumber(beginX360HeaderEndpoint,x360HeaderEndpoint,X_360_HEADER_ENDPOINT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360HeaderEndpointCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360HeaderEndpoint
	 */
   	protected  long serializeX360HeaderEndpoint(char[] value) {
	    long  x360HeaderEndpoint;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360HeaderEndpoint = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginX360HeaderEndpoint
		       ,7
		      );
		 localX360HeaderEndpointCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360HeaderEndpoint;
    }

   protected long checkX360HeaderEndpointMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360HeaderEndpoint is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360HeaderEndpoint() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360HeaderEndpoint
			                 ,X_360_HEADER_ENDPOINT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360HeaderEndpoint", beginX360HeaderEndpoint,X_360_HEADER_ENDPOINT_LEN);
    }
   	}
     int localX360HeaderEntIcaCounter = -1;
     public boolean isX360HeaderEntIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderEntIcaCounter != sharedCounter;
         localX360HeaderEntIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360HeaderEntIca
	 *	@return x360HeaderEntIca
	 */
	public char[]  getX360HeaderEntIcaString() {
	     return getCharArray(beginX360HeaderEntIca,X_360_HEADER_ENT_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360HeaderEntIcaIsNumeric() {
	    return isNumeric(beginX360HeaderEntIca
	                    ,beginX360HeaderEntIca + X_360_HEADER_ENT_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_HEADER_ENT_ICA_LEN = 6;
  	/**
	 * serializeX360HeaderEntIca
	 */
	protected void serializeX360HeaderEntIca(long x360HeaderEntIca) {
		 putNumber(beginX360HeaderEntIca,x360HeaderEntIca,X_360_HEADER_ENT_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360HeaderEntIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360HeaderEntIca
	 */
   	protected  long serializeX360HeaderEntIca(char[] value) {
	    long  x360HeaderEntIca;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360HeaderEntIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginX360HeaderEntIca
		       ,6
		      );
		 localX360HeaderEntIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360HeaderEntIca;
    }

   protected long checkX360HeaderEntIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360HeaderEntIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360HeaderEntIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360HeaderEntIca
			                 ,X_360_HEADER_ENT_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360HeaderEntIca", beginX360HeaderEntIca,X_360_HEADER_ENT_ICA_LEN);
    }
   	}
     int localX360HeaderMbrIcaCounter = -1;
     public boolean isX360HeaderMbrIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderMbrIcaCounter != sharedCounter;
         localX360HeaderMbrIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360HeaderMbrIca
	 *	@return x360HeaderMbrIca
	 */
	public char[]  getX360HeaderMbrIcaString() {
	     return getCharArray(beginX360HeaderMbrIca,X_360_HEADER_MBR_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360HeaderMbrIcaIsNumeric() {
	    return isNumeric(beginX360HeaderMbrIca
	                    ,beginX360HeaderMbrIca + X_360_HEADER_MBR_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_HEADER_MBR_ICA_LEN = 6;
  	/**
	 * serializeX360HeaderMbrIca
	 */
	protected void serializeX360HeaderMbrIca(long x360HeaderMbrIca) {
		 putNumber(beginX360HeaderMbrIca,x360HeaderMbrIca,X_360_HEADER_MBR_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360HeaderMbrIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360HeaderMbrIca
	 */
   	protected  long serializeX360HeaderMbrIca(char[] value) {
	    long  x360HeaderMbrIca;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360HeaderMbrIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginX360HeaderMbrIca
		       ,6
		      );
		 localX360HeaderMbrIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360HeaderMbrIca;
    }

   protected long checkX360HeaderMbrIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360HeaderMbrIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360HeaderMbrIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360HeaderMbrIca
			                 ,X_360_HEADER_MBR_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360HeaderMbrIca", beginX360HeaderMbrIca,X_360_HEADER_MBR_ICA_LEN);
    }
   	}
     int localX360HeaderCuttimeCounter = -1;
     public boolean isX360HeaderCuttimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderCuttimeCounter != sharedCounter;
         localX360HeaderCuttimeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360HeaderCuttime
	 *	@return x360HeaderCuttime
	 */
	public char[]  getX360HeaderCuttimeString() {
	     return getCharArray(beginX360HeaderCuttime,X_360_HEADER_CUTTIME_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360HeaderCuttimeIsNumeric() {
	    return isNumeric(beginX360HeaderCuttime
	                    ,beginX360HeaderCuttime + X_360_HEADER_CUTTIME_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_HEADER_CUTTIME_LEN = 4;
  	/**
	 * serializeX360HeaderCuttime
	 */
	protected void serializeX360HeaderCuttime(int x360HeaderCuttime) {
		 putNumber(beginX360HeaderCuttime,x360HeaderCuttime,X_360_HEADER_CUTTIME_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360HeaderCuttimeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360HeaderCuttime
	 */
   	protected  int serializeX360HeaderCuttime(char[] value) {
	    int  x360HeaderCuttime;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360HeaderCuttime = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginX360HeaderCuttime
		       ,4
		      );
		 localX360HeaderCuttimeCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360HeaderCuttime;
    }

   protected int checkX360HeaderCuttimeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360HeaderCuttime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360HeaderCuttime() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360HeaderCuttime
			                 ,X_360_HEADER_CUTTIME_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360HeaderCuttime", beginX360HeaderCuttime,X_360_HEADER_CUTTIME_LEN);
    }
   	}




}
  

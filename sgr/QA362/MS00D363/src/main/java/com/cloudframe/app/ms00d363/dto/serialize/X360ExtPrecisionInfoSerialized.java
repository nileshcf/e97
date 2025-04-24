package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360ExtPrecisionInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class X360ExtPrecisionInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360ExtPrecisionInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_EXT_PRECISION_INFO_LENGTH = 62;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360FaAiEpImpDec;
            protected  int beginX360FaAiEpBaseImpDec;
            protected  int beginX360FPurchInterEp;
            protected  int beginX360FPurchInterIndEp;
            protected  int beginX360FCashbkInterEp;
            protected  int beginX360FCashbkInterIndEp;
            protected  int beginX360APurchInterEp;
            protected  int beginX360APurchInterIndEp;
            protected  int beginX360ACashbkInterEp;
            protected  int beginX360ACashbkInterIndEp;
	
	/**
	* Constructor for X360ExtPrecisionInfoSerialized
	**/
    public X360ExtPrecisionInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360ExtPrecisionInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360ExtPrecisionInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360ExtPrecisionInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1082); // serialize this field at offset 1082 by default 
    }
    
	/**
	* sets parent for this X360ExtPrecisionInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1082 by default
    }    
	/**
	* initializes the field in X360ExtPrecisionInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_EXT_PRECISION_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360FaAiEpImpDec = getStartOffset() + 0;	// set offset for serialization
  
             beginX360FaAiEpBaseImpDec = getStartOffset() + 1;	// set offset for serialization
  
             beginX360FPurchInterEp = getStartOffset() + 2;	// set offset for serialization
  
             beginX360FPurchInterIndEp = getStartOffset() + 16;	// set offset for serialization
  
             beginX360FCashbkInterEp = getStartOffset() + 17;	// set offset for serialization
  
             beginX360FCashbkInterIndEp = getStartOffset() + 31;	// set offset for serialization
  
             beginX360APurchInterEp = getStartOffset() + 32;	// set offset for serialization
  
             beginX360APurchInterIndEp = getStartOffset() + 46;	// set offset for serialization
  
             beginX360ACashbkInterEp = getStartOffset() + 47;	// set offset for serialization
  
             beginX360ACashbkInterIndEp = getStartOffset() + 61;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localX360FaAiEpImpDecCounter = -1;
     public boolean isX360FaAiEpImpDecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FaAiEpImpDecCounter != sharedCounter;
         localX360FaAiEpImpDecCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FaAiEpImpDec
	 *	@return x360FaAiEpImpDec
	 */
	public char[]  getX360FaAiEpImpDecString() {
	     return getCharArray(beginX360FaAiEpImpDec,X_360_FA_AI_EP_IMP_DEC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FaAiEpImpDecIsNumeric() {
	    return isNumeric(beginX360FaAiEpImpDec
	                    ,beginX360FaAiEpImpDec + X_360_FA_AI_EP_IMP_DEC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FA_AI_EP_IMP_DEC_LEN = 1;
  	/**
	 * serializeX360FaAiEpImpDec
	 */
	protected void serializeX360FaAiEpImpDec(int x360FaAiEpImpDec) {
		 putNumber(beginX360FaAiEpImpDec,x360FaAiEpImpDec,X_360_FA_AI_EP_IMP_DEC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FaAiEpImpDecCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FaAiEpImpDec
	 */
   	protected  int serializeX360FaAiEpImpDec(char[] value) {
	    int  x360FaAiEpImpDec;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FaAiEpImpDec = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginX360FaAiEpImpDec
		       ,1
		      );
		 localX360FaAiEpImpDecCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FaAiEpImpDec;
    }

   protected int checkX360FaAiEpImpDecMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360FaAiEpImpDec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FaAiEpImpDec() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360FaAiEpImpDec
			                 ,X_360_FA_AI_EP_IMP_DEC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FaAiEpImpDec", beginX360FaAiEpImpDec,X_360_FA_AI_EP_IMP_DEC_LEN);
    }
   	}
     int localX360FaAiEpBaseImpDecCounter = -1;
     public boolean isX360FaAiEpBaseImpDecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FaAiEpBaseImpDecCounter != sharedCounter;
         localX360FaAiEpBaseImpDecCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FaAiEpBaseImpDec
	 *	@return x360FaAiEpBaseImpDec
	 */
	public char[]  getX360FaAiEpBaseImpDecString() {
	     return getCharArray(beginX360FaAiEpBaseImpDec,X_360_FA_AI_EP_BASE_IMP_DEC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FaAiEpBaseImpDecIsNumeric() {
	    return isNumeric(beginX360FaAiEpBaseImpDec
	                    ,beginX360FaAiEpBaseImpDec + X_360_FA_AI_EP_BASE_IMP_DEC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FA_AI_EP_BASE_IMP_DEC_LEN = 1;
  	/**
	 * serializeX360FaAiEpBaseImpDec
	 */
	protected void serializeX360FaAiEpBaseImpDec(int x360FaAiEpBaseImpDec) {
		 putNumber(beginX360FaAiEpBaseImpDec,x360FaAiEpBaseImpDec,X_360_FA_AI_EP_BASE_IMP_DEC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FaAiEpBaseImpDecCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FaAiEpBaseImpDec
	 */
   	protected  int serializeX360FaAiEpBaseImpDec(char[] value) {
	    int  x360FaAiEpBaseImpDec;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FaAiEpBaseImpDec = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginX360FaAiEpBaseImpDec
		       ,1
		      );
		 localX360FaAiEpBaseImpDecCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FaAiEpBaseImpDec;
    }

   protected int checkX360FaAiEpBaseImpDecMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360FaAiEpBaseImpDec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FaAiEpBaseImpDec() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360FaAiEpBaseImpDec
			                 ,X_360_FA_AI_EP_BASE_IMP_DEC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FaAiEpBaseImpDec", beginX360FaAiEpBaseImpDec,X_360_FA_AI_EP_BASE_IMP_DEC_LEN);
    }
   	}
     int localX360FPurchInterEpCounter = -1;
     public boolean isX360FPurchInterEpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FPurchInterEpCounter != sharedCounter;
         localX360FPurchInterEpCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FPurchInterEp
	 *	@return x360FPurchInterEp
	 */
	public char[]  getX360FPurchInterEpString() {
	     return getCharArray(beginX360FPurchInterEp,X_360_FPURCH_INTER_EP_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FPurchInterEpIsNumeric() {
	    return isNumeric(beginX360FPurchInterEp
	                    ,beginX360FPurchInterEp + X_360_FPURCH_INTER_EP_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FPURCH_INTER_EP_LEN = 14;
  	/**
	 * serializeX360FPurchInterEp
	 */
	protected void serializeX360FPurchInterEp(long x360FPurchInterEp) {
		 putNumber(beginX360FPurchInterEp,x360FPurchInterEp,X_360_FPURCH_INTER_EP_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FPurchInterEpCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FPurchInterEp
	 */
   	protected  long serializeX360FPurchInterEp(char[] value) {
	    long  x360FPurchInterEp;
	    if(value.length >0 && value.length!= 14)
            value = new String(value).trim().toCharArray();
	    if (value.length < 14) value = pad(14, value, ' ', LEFT_PAD);
	    else if (value.length > 14) value = substring(value,0,14);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FPurchInterEp = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginX360FPurchInterEp
		       ,14
		      );
		 localX360FPurchInterEpCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FPurchInterEp;
    }

   protected long checkX360FPurchInterEpMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100T/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshX360FPurchInterEp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FPurchInterEp() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360FPurchInterEp
			                 ,X_360_FPURCH_INTER_EP_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FPurchInterEp", beginX360FPurchInterEp,X_360_FPURCH_INTER_EP_LEN);
    }
   	}
     int localX360FPurchInterIndEpCounter = -1;
     public boolean isX360FPurchInterIndEpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FPurchInterIndEpCounter != sharedCounter;
         localX360FPurchInterIndEpCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_FPURCH_INTER_IND_EP_LEN = 1;
	/**
	 * 	serialize this X360FPurchInterIndEp
	 */
   protected void serializeX360FPurchInterIndEp(char[] x360FPurchInterIndEp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360FPurchInterIndEp,0,getStringValue(),beginX360FPurchInterIndEp,X_360_FPURCH_INTER_IND_EP_LEN);
       localX360FPurchInterIndEpCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360FPurchInterIndEpConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshX360FPurchInterIndEp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360FPurchInterIndEp() {	 
   		return (substring(getStringValue(),beginX360FPurchInterIndEp,beginX360FPurchInterIndEp + X_360_FPURCH_INTER_IND_EP_LEN));
   	}
     int localX360FCashbkInterEpCounter = -1;
     public boolean isX360FCashbkInterEpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FCashbkInterEpCounter != sharedCounter;
         localX360FCashbkInterEpCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FCashbkInterEp
	 *	@return x360FCashbkInterEp
	 */
	public char[]  getX360FCashbkInterEpString() {
	     return getCharArray(beginX360FCashbkInterEp,X_360_FCASHBK_INTER_EP_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FCashbkInterEpIsNumeric() {
	    return isNumeric(beginX360FCashbkInterEp
	                    ,beginX360FCashbkInterEp + X_360_FCASHBK_INTER_EP_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FCASHBK_INTER_EP_LEN = 14;
  	/**
	 * serializeX360FCashbkInterEp
	 */
	protected void serializeX360FCashbkInterEp(long x360FCashbkInterEp) {
		 putNumber(beginX360FCashbkInterEp,x360FCashbkInterEp,X_360_FCASHBK_INTER_EP_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FCashbkInterEpCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FCashbkInterEp
	 */
   	protected  long serializeX360FCashbkInterEp(char[] value) {
	    long  x360FCashbkInterEp;
	    if(value.length >0 && value.length!= 14)
            value = new String(value).trim().toCharArray();
	    if (value.length < 14) value = pad(14, value, ' ', LEFT_PAD);
	    else if (value.length > 14) value = substring(value,0,14);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FCashbkInterEp = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginX360FCashbkInterEp
		       ,14
		      );
		 localX360FCashbkInterEpCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FCashbkInterEp;
    }

   protected long checkX360FCashbkInterEpMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100T/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshX360FCashbkInterEp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FCashbkInterEp() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360FCashbkInterEp
			                 ,X_360_FCASHBK_INTER_EP_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FCashbkInterEp", beginX360FCashbkInterEp,X_360_FCASHBK_INTER_EP_LEN);
    }
   	}
     int localX360FCashbkInterIndEpCounter = -1;
     public boolean isX360FCashbkInterIndEpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FCashbkInterIndEpCounter != sharedCounter;
         localX360FCashbkInterIndEpCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_FCASHBK_INTER_IND_EP_LEN = 1;
	/**
	 * 	serialize this X360FCashbkInterIndEp
	 */
   protected void serializeX360FCashbkInterIndEp(char[] x360FCashbkInterIndEp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360FCashbkInterIndEp,0,getStringValue(),beginX360FCashbkInterIndEp,X_360_FCASHBK_INTER_IND_EP_LEN);
       localX360FCashbkInterIndEpCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360FCashbkInterIndEpConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshX360FCashbkInterIndEp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360FCashbkInterIndEp() {	 
   		return (substring(getStringValue(),beginX360FCashbkInterIndEp,beginX360FCashbkInterIndEp + X_360_FCASHBK_INTER_IND_EP_LEN));
   	}
     int localX360APurchInterEpCounter = -1;
     public boolean isX360APurchInterEpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360APurchInterEpCounter != sharedCounter;
         localX360APurchInterEpCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360APurchInterEp
	 *	@return x360APurchInterEp
	 */
	public char[]  getX360APurchInterEpString() {
	     return getCharArray(beginX360APurchInterEp,X_360_APURCH_INTER_EP_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360APurchInterEpIsNumeric() {
	    return isNumeric(beginX360APurchInterEp
	                    ,beginX360APurchInterEp + X_360_APURCH_INTER_EP_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_APURCH_INTER_EP_LEN = 14;
  	/**
	 * serializeX360APurchInterEp
	 */
	protected void serializeX360APurchInterEp(long x360APurchInterEp) {
		 putNumber(beginX360APurchInterEp,x360APurchInterEp,X_360_APURCH_INTER_EP_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360APurchInterEpCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360APurchInterEp
	 */
   	protected  long serializeX360APurchInterEp(char[] value) {
	    long  x360APurchInterEp;
	    if(value.length >0 && value.length!= 14)
            value = new String(value).trim().toCharArray();
	    if (value.length < 14) value = pad(14, value, ' ', LEFT_PAD);
	    else if (value.length > 14) value = substring(value,0,14);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360APurchInterEp = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginX360APurchInterEp
		       ,14
		      );
		 localX360APurchInterEpCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360APurchInterEp;
    }

   protected long checkX360APurchInterEpMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100T/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshX360APurchInterEp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360APurchInterEp() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360APurchInterEp
			                 ,X_360_APURCH_INTER_EP_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360APurchInterEp", beginX360APurchInterEp,X_360_APURCH_INTER_EP_LEN);
    }
   	}
     int localX360APurchInterIndEpCounter = -1;
     public boolean isX360APurchInterIndEpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360APurchInterIndEpCounter != sharedCounter;
         localX360APurchInterIndEpCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_APURCH_INTER_IND_EP_LEN = 1;
	/**
	 * 	serialize this X360APurchInterIndEp
	 */
   protected void serializeX360APurchInterIndEp(char[] x360APurchInterIndEp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360APurchInterIndEp,0,getStringValue(),beginX360APurchInterIndEp,X_360_APURCH_INTER_IND_EP_LEN);
       localX360APurchInterIndEpCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360APurchInterIndEpConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshX360APurchInterIndEp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360APurchInterIndEp() {	 
   		return (substring(getStringValue(),beginX360APurchInterIndEp,beginX360APurchInterIndEp + X_360_APURCH_INTER_IND_EP_LEN));
   	}
     int localX360ACashbkInterEpCounter = -1;
     public boolean isX360ACashbkInterEpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360ACashbkInterEpCounter != sharedCounter;
         localX360ACashbkInterEpCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360ACashbkInterEp
	 *	@return x360ACashbkInterEp
	 */
	public char[]  getX360ACashbkInterEpString() {
	     return getCharArray(beginX360ACashbkInterEp,X_360_ACASHBK_INTER_EP_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360ACashbkInterEpIsNumeric() {
	    return isNumeric(beginX360ACashbkInterEp
	                    ,beginX360ACashbkInterEp + X_360_ACASHBK_INTER_EP_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_ACASHBK_INTER_EP_LEN = 14;
  	/**
	 * serializeX360ACashbkInterEp
	 */
	protected void serializeX360ACashbkInterEp(long x360ACashbkInterEp) {
		 putNumber(beginX360ACashbkInterEp,x360ACashbkInterEp,X_360_ACASHBK_INTER_EP_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360ACashbkInterEpCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360ACashbkInterEp
	 */
   	protected  long serializeX360ACashbkInterEp(char[] value) {
	    long  x360ACashbkInterEp;
	    if(value.length >0 && value.length!= 14)
            value = new String(value).trim().toCharArray();
	    if (value.length < 14) value = pad(14, value, ' ', LEFT_PAD);
	    else if (value.length > 14) value = substring(value,0,14);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360ACashbkInterEp = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginX360ACashbkInterEp
		       ,14
		      );
		 localX360ACashbkInterEpCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360ACashbkInterEp;
    }

   protected long checkX360ACashbkInterEpMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100T/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshX360ACashbkInterEp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360ACashbkInterEp() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360ACashbkInterEp
			                 ,X_360_ACASHBK_INTER_EP_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360ACashbkInterEp", beginX360ACashbkInterEp,X_360_ACASHBK_INTER_EP_LEN);
    }
   	}
     int localX360ACashbkInterIndEpCounter = -1;
     public boolean isX360ACashbkInterIndEpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360ACashbkInterIndEpCounter != sharedCounter;
         localX360ACashbkInterIndEpCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_ACASHBK_INTER_IND_EP_LEN = 1;
	/**
	 * 	serialize this X360ACashbkInterIndEp
	 */
   protected void serializeX360ACashbkInterIndEp(char[] x360ACashbkInterIndEp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360ACashbkInterIndEp,0,getStringValue(),beginX360ACashbkInterIndEp,X_360_ACASHBK_INTER_IND_EP_LEN);
       localX360ACashbkInterIndEpCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360ACashbkInterIndEpConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshX360ACashbkInterIndEp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360ACashbkInterIndEp() {	 
   		return (substring(getStringValue(),beginX360ACashbkInterIndEp,beginX360ACashbkInterIndEp + X_360_ACASHBK_INTER_IND_EP_LEN));
   	}




}
  

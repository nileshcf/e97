package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class De125WorkAreaA890Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class De125WorkAreaA890Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(De125WorkAreaA890Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DE_125_WORK_AREA_A_890_LENGTH = 78;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBytes12890;
            protected  int beginBytes516890;
            protected  int beginBytes1718890;
            protected  int beginBytes2132890;
            protected  int beginBytes3334890;
            protected  int beginBytes3744890;
            protected  int beginBytes4546890;
            protected  int beginBytes4956890;
            protected  int beginBytes5758890;
            protected  int beginBytes6164890;
            protected  int beginBytes6566890;
            protected  int beginBytes6971890;
            protected  int beginBytes7273890;
            protected  int beginBytes7678890;
	
	/**
	* Constructor for De125WorkAreaA890Serialized
	**/
    public De125WorkAreaA890Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for De125WorkAreaA890Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public De125WorkAreaA890Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this De125WorkAreaA890Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this De125WorkAreaA890Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in De125WorkAreaA890Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DE_125_WORK_AREA_A_890_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBytes12890 = getStartOffset() + 0;	// set offset for serialization
  
             beginBytes516890 = getStartOffset() + 4;	// set offset for serialization
  
             beginBytes1718890 = getStartOffset() + 16;	// set offset for serialization
  
             beginBytes2132890 = getStartOffset() + 20;	// set offset for serialization
  
             beginBytes3334890 = getStartOffset() + 32;	// set offset for serialization
  
             beginBytes3744890 = getStartOffset() + 36;	// set offset for serialization
  
             beginBytes4546890 = getStartOffset() + 44;	// set offset for serialization
  
             beginBytes4956890 = getStartOffset() + 48;	// set offset for serialization
  
             beginBytes5758890 = getStartOffset() + 56;	// set offset for serialization
  
             beginBytes6164890 = getStartOffset() + 60;	// set offset for serialization
  
             beginBytes6566890 = getStartOffset() + 64;	// set offset for serialization
  
             beginBytes6971890 = getStartOffset() + 68;	// set offset for serialization
  
             beginBytes7273890 = getStartOffset() + 71;	// set offset for serialization
  
             beginBytes7678890 = getStartOffset() + 75;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBytes12890Counter = -1;
     public boolean isBytes12890Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBytes12890Counter != sharedCounter;
         localBytes12890Counter = sharedCounter; return hasModified;
     }
	protected static final int BYTES_12890_LEN = 2;
	/**
	 * 	serialize this Bytes12890
	 */
   protected void serializeBytes12890(char[] bytes12890) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bytes12890,0,getStringValue(),beginBytes12890,BYTES_12890_LEN);
       localBytes12890Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBytes12890Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBytes12890 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBytes12890() {	 
   		return (substring(getStringValue(),beginBytes12890,beginBytes12890 + BYTES_12890_LEN));
   	}
     int localBytes516890Counter = -1;
     public boolean isBytes516890Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBytes516890Counter != sharedCounter;
         localBytes516890Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bytes516890
	 *	@return bytes516890
	 */
	public char[]  getBytes516890String() {
	     return getCharArray(beginBytes516890,BYTES_516890_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bytes516890IsNumeric() {
	    return isNumeric(beginBytes516890
	                    ,beginBytes516890 + BYTES_516890_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BYTES_516890_LEN = 12;
  	/**
	 * serializeBytes516890
	 */
	protected void serializeBytes516890(long bytes516890) {
		 putNumber(beginBytes516890,bytes516890,BYTES_516890_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBytes516890Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBytes516890
	 */
   	protected  long serializeBytes516890(char[] value) {
	    long  bytes516890;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bytes516890 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginBytes516890
		       ,12
		      );
		 localBytes516890Counter = shareString.getSerializedField().getModifiedCounter();
		return  bytes516890;
    }

   protected long checkBytes516890MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBytes516890 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBytes516890() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBytes516890
			                 ,BYTES_516890_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bytes516890", beginBytes516890,BYTES_516890_LEN);
    }
   	}
     int localBytes1718890Counter = -1;
     public boolean isBytes1718890Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBytes1718890Counter != sharedCounter;
         localBytes1718890Counter = sharedCounter; return hasModified;
     }
	protected static final int BYTES_1718890_LEN = 2;
	/**
	 * 	serialize this Bytes1718890
	 */
   protected void serializeBytes1718890(char[] bytes1718890) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bytes1718890,0,getStringValue(),beginBytes1718890,BYTES_1718890_LEN);
       localBytes1718890Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBytes1718890Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBytes1718890 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBytes1718890() {	 
   		return (substring(getStringValue(),beginBytes1718890,beginBytes1718890 + BYTES_1718890_LEN));
   	}
     int localBytes2132890Counter = -1;
     public boolean isBytes2132890Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBytes2132890Counter != sharedCounter;
         localBytes2132890Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bytes2132890
	 *	@return bytes2132890
	 */
	public char[]  getBytes2132890String() {
	     return getCharArray(beginBytes2132890,BYTES_2132890_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bytes2132890IsNumeric() {
	    return isNumeric(beginBytes2132890
	                    ,beginBytes2132890 + BYTES_2132890_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BYTES_2132890_LEN = 12;
  	/**
	 * serializeBytes2132890
	 */
	protected void serializeBytes2132890(long bytes2132890) {
		 putNumber(beginBytes2132890,bytes2132890,BYTES_2132890_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBytes2132890Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBytes2132890
	 */
   	protected  long serializeBytes2132890(char[] value) {
	    long  bytes2132890;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bytes2132890 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginBytes2132890
		       ,12
		      );
		 localBytes2132890Counter = shareString.getSerializedField().getModifiedCounter();
		return  bytes2132890;
    }

   protected long checkBytes2132890MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBytes2132890 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBytes2132890() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBytes2132890
			                 ,BYTES_2132890_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bytes2132890", beginBytes2132890,BYTES_2132890_LEN);
    }
   	}
     int localBytes3334890Counter = -1;
     public boolean isBytes3334890Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBytes3334890Counter != sharedCounter;
         localBytes3334890Counter = sharedCounter; return hasModified;
     }
	protected static final int BYTES_3334890_LEN = 2;
	/**
	 * 	serialize this Bytes3334890
	 */
   protected void serializeBytes3334890(char[] bytes3334890) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bytes3334890,0,getStringValue(),beginBytes3334890,BYTES_3334890_LEN);
       localBytes3334890Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBytes3334890Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBytes3334890 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBytes3334890() {	 
   		return (substring(getStringValue(),beginBytes3334890,beginBytes3334890 + BYTES_3334890_LEN));
   	}
     int localBytes3744890Counter = -1;
     public boolean isBytes3744890Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBytes3744890Counter != sharedCounter;
         localBytes3744890Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bytes3744890
	 *	@return bytes3744890
	 */
	public char[]  getBytes3744890String() {
	     return getCharArray(beginBytes3744890,BYTES_3744890_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bytes3744890IsNumeric() {
	    return isNumeric(beginBytes3744890
	                    ,beginBytes3744890 + BYTES_3744890_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BYTES_3744890_LEN = 8;
  	/**
	 * serializeBytes3744890
	 */
	protected void serializeBytes3744890(long bytes3744890) {
		 putNumber(beginBytes3744890,bytes3744890,BYTES_3744890_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBytes3744890Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBytes3744890
	 */
   	protected  long serializeBytes3744890(char[] value) {
	    long  bytes3744890;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bytes3744890 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginBytes3744890
		       ,8
		      );
		 localBytes3744890Counter = shareString.getSerializedField().getModifiedCounter();
		return  bytes3744890;
    }

   protected long checkBytes3744890MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBytes3744890 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBytes3744890() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBytes3744890
			                 ,BYTES_3744890_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bytes3744890", beginBytes3744890,BYTES_3744890_LEN);
    }
   	}
     int localBytes4546890Counter = -1;
     public boolean isBytes4546890Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBytes4546890Counter != sharedCounter;
         localBytes4546890Counter = sharedCounter; return hasModified;
     }
	protected static final int BYTES_4546890_LEN = 2;
	/**
	 * 	serialize this Bytes4546890
	 */
   protected void serializeBytes4546890(char[] bytes4546890) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bytes4546890,0,getStringValue(),beginBytes4546890,BYTES_4546890_LEN);
       localBytes4546890Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBytes4546890Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBytes4546890 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBytes4546890() {	 
   		return (substring(getStringValue(),beginBytes4546890,beginBytes4546890 + BYTES_4546890_LEN));
   	}
     int localBytes4956890Counter = -1;
     public boolean isBytes4956890Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBytes4956890Counter != sharedCounter;
         localBytes4956890Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bytes4956890
	 *	@return bytes4956890
	 */
	public char[]  getBytes4956890String() {
	     return getCharArray(beginBytes4956890,BYTES_4956890_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bytes4956890IsNumeric() {
	    return isNumeric(beginBytes4956890
	                    ,beginBytes4956890 + BYTES_4956890_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BYTES_4956890_LEN = 8;
  	/**
	 * serializeBytes4956890
	 */
	protected void serializeBytes4956890(long bytes4956890) {
		 putNumber(beginBytes4956890,bytes4956890,BYTES_4956890_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBytes4956890Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBytes4956890
	 */
   	protected  long serializeBytes4956890(char[] value) {
	    long  bytes4956890;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bytes4956890 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginBytes4956890
		       ,8
		      );
		 localBytes4956890Counter = shareString.getSerializedField().getModifiedCounter();
		return  bytes4956890;
    }

   protected long checkBytes4956890MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBytes4956890 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBytes4956890() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBytes4956890
			                 ,BYTES_4956890_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bytes4956890", beginBytes4956890,BYTES_4956890_LEN);
    }
   	}
     int localBytes5758890Counter = -1;
     public boolean isBytes5758890Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBytes5758890Counter != sharedCounter;
         localBytes5758890Counter = sharedCounter; return hasModified;
     }
	protected static final int BYTES_5758890_LEN = 2;
	/**
	 * 	serialize this Bytes5758890
	 */
   protected void serializeBytes5758890(char[] bytes5758890) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bytes5758890,0,getStringValue(),beginBytes5758890,BYTES_5758890_LEN);
       localBytes5758890Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBytes5758890Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBytes5758890 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBytes5758890() {	 
   		return (substring(getStringValue(),beginBytes5758890,beginBytes5758890 + BYTES_5758890_LEN));
   	}
     int localBytes6164890Counter = -1;
     public boolean isBytes6164890Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBytes6164890Counter != sharedCounter;
         localBytes6164890Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bytes6164890
	 *	@return bytes6164890
	 */
	public char[]  getBytes6164890String() {
	     return getCharArray(beginBytes6164890,BYTES_6164890_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bytes6164890IsNumeric() {
	    return isNumeric(beginBytes6164890
	                    ,beginBytes6164890 + BYTES_6164890_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BYTES_6164890_LEN = 4;
  	/**
	 * serializeBytes6164890
	 */
	protected void serializeBytes6164890(int bytes6164890) {
		 putNumber(beginBytes6164890,bytes6164890,BYTES_6164890_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBytes6164890Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBytes6164890
	 */
   	protected  int serializeBytes6164890(char[] value) {
	    int  bytes6164890;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bytes6164890 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBytes6164890
		       ,4
		      );
		 localBytes6164890Counter = shareString.getSerializedField().getModifiedCounter();
		return  bytes6164890;
    }

   protected int checkBytes6164890MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBytes6164890 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBytes6164890() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBytes6164890
			                 ,BYTES_6164890_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bytes6164890", beginBytes6164890,BYTES_6164890_LEN);
    }
   	}
     int localBytes6566890Counter = -1;
     public boolean isBytes6566890Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBytes6566890Counter != sharedCounter;
         localBytes6566890Counter = sharedCounter; return hasModified;
     }
	protected static final int BYTES_6566890_LEN = 2;
	/**
	 * 	serialize this Bytes6566890
	 */
   protected void serializeBytes6566890(char[] bytes6566890) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bytes6566890,0,getStringValue(),beginBytes6566890,BYTES_6566890_LEN);
       localBytes6566890Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBytes6566890Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBytes6566890 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBytes6566890() {	 
   		return (substring(getStringValue(),beginBytes6566890,beginBytes6566890 + BYTES_6566890_LEN));
   	}
     int localBytes6971890Counter = -1;
     public boolean isBytes6971890Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBytes6971890Counter != sharedCounter;
         localBytes6971890Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bytes6971890
	 *	@return bytes6971890
	 */
	public char[]  getBytes6971890String() {
	     return getCharArray(beginBytes6971890,BYTES_6971890_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bytes6971890IsNumeric() {
	    return isNumeric(beginBytes6971890
	                    ,beginBytes6971890 + BYTES_6971890_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BYTES_6971890_LEN = 3;
  	/**
	 * serializeBytes6971890
	 */
	protected void serializeBytes6971890(int bytes6971890) {
		 putNumber(beginBytes6971890,bytes6971890,BYTES_6971890_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBytes6971890Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBytes6971890
	 */
   	protected  int serializeBytes6971890(char[] value) {
	    int  bytes6971890;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bytes6971890 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginBytes6971890
		       ,3
		      );
		 localBytes6971890Counter = shareString.getSerializedField().getModifiedCounter();
		return  bytes6971890;
    }

   protected int checkBytes6971890MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBytes6971890 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBytes6971890() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBytes6971890
			                 ,BYTES_6971890_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bytes6971890", beginBytes6971890,BYTES_6971890_LEN);
    }
   	}
     int localBytes7273890Counter = -1;
     public boolean isBytes7273890Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBytes7273890Counter != sharedCounter;
         localBytes7273890Counter = sharedCounter; return hasModified;
     }
	protected static final int BYTES_7273890_LEN = 2;
	/**
	 * 	serialize this Bytes7273890
	 */
   protected void serializeBytes7273890(char[] bytes7273890) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bytes7273890,0,getStringValue(),beginBytes7273890,BYTES_7273890_LEN);
       localBytes7273890Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBytes7273890Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBytes7273890 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBytes7273890() {	 
   		return (substring(getStringValue(),beginBytes7273890,beginBytes7273890 + BYTES_7273890_LEN));
   	}
     int localBytes7678890Counter = -1;
     public boolean isBytes7678890Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBytes7678890Counter != sharedCounter;
         localBytes7678890Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bytes7678890
	 *	@return bytes7678890
	 */
	public char[]  getBytes7678890String() {
	     return getCharArray(beginBytes7678890,BYTES_7678890_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bytes7678890IsNumeric() {
	    return isNumeric(beginBytes7678890
	                    ,beginBytes7678890 + BYTES_7678890_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BYTES_7678890_LEN = 3;
  	/**
	 * serializeBytes7678890
	 */
	protected void serializeBytes7678890(int bytes7678890) {
		 putNumber(beginBytes7678890,bytes7678890,BYTES_7678890_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBytes7678890Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBytes7678890
	 */
   	protected  int serializeBytes7678890(char[] value) {
	    int  bytes7678890;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bytes7678890 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginBytes7678890
		       ,3
		      );
		 localBytes7678890Counter = shareString.getSerializedField().getModifiedCounter();
		return  bytes7678890;
    }

   protected int checkBytes7678890MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBytes7678890 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBytes7678890() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBytes7678890
			                 ,BYTES_7678890_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bytes7678890", beginBytes7678890,BYTES_7678890_LEN);
    }
   	}




}
  

package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip40004FileErrorInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip40004FileErrorInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip40004FileErrorInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_40004_FILE_ERROR_INFO_LENGTH = 19;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp40004ErrorMsgSevCdFil;
            protected  int beginIp40004ErrorNumberFil;
            protected  int beginIp40004ErrorMsgNumberFil;
            protected  int beginIp40004IpmFieldTypeFil;
            protected  int beginIp40004IpmFieldNumberFil;
            protected  int beginIp40004IpmSubfldNumberFil;
	
	/**
	* Constructor for Ip40004FileErrorInfoSerialized
	**/
    public Ip40004FileErrorInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip40004FileErrorInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004FileErrorInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip40004FileErrorInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,110); // serialize this field at offset 110 by default 
    }
    
	/**
	* sets parent for this Ip40004FileErrorInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 110 by default
    }    
	/**
	* initializes the field in Ip40004FileErrorInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_40004_FILE_ERROR_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp40004ErrorMsgSevCdFil = getStartOffset() + 0;	// set offset for serialization
  
             beginIp40004ErrorNumberFil = getStartOffset() + 2;	// set offset for serialization
  
             beginIp40004ErrorMsgNumberFil = getStartOffset() + 6;	// set offset for serialization
  
             beginIp40004IpmFieldTypeFil = getStartOffset() + 10;	// set offset for serialization
  
             beginIp40004IpmFieldNumberFil = getStartOffset() + 11;	// set offset for serialization
  
             beginIp40004IpmSubfldNumberFil = getStartOffset() + 15;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp40004ErrorMsgSevCdFilCounter = -1;
     public boolean isIp40004ErrorMsgSevCdFilModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004ErrorMsgSevCdFilCounter != sharedCounter;
         localIp40004ErrorMsgSevCdFilCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_40004_ERROR_MSG_SEV_CD_FIL_LEN = 2;
	/**
	 * 	serialize this Ip40004ErrorMsgSevCdFil
	 */
   protected void serializeIp40004ErrorMsgSevCdFil(char[] ip40004ErrorMsgSevCdFil) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip40004ErrorMsgSevCdFil,0,getStringValue(),beginIp40004ErrorMsgSevCdFil,IP_40004_ERROR_MSG_SEV_CD_FIL_LEN);
       localIp40004ErrorMsgSevCdFilCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp40004ErrorMsgSevCdFilConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp40004ErrorMsgSevCdFil is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp40004ErrorMsgSevCdFil() {	 
   		return (substring(getStringValue(),beginIp40004ErrorMsgSevCdFil,beginIp40004ErrorMsgSevCdFil + IP_40004_ERROR_MSG_SEV_CD_FIL_LEN));
   	}
     int localIp40004ErrorNumberFilCounter = -1;
     public boolean isIp40004ErrorNumberFilModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004ErrorNumberFilCounter != sharedCounter;
         localIp40004ErrorNumberFilCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip40004ErrorNumberFil
	 *	@return ip40004ErrorNumberFil
	 */
	public char[]  getIp40004ErrorNumberFilString() {
	     return getCharArray(beginIp40004ErrorNumberFil,IP_40004_ERROR_NUMBER_FIL_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip40004ErrorNumberFilIsNumeric() {
	    return isNumeric(beginIp40004ErrorNumberFil
	                    ,beginIp40004ErrorNumberFil + IP_40004_ERROR_NUMBER_FIL_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_40004_ERROR_NUMBER_FIL_LEN = 4;
  	/**
	 * serializeIp40004ErrorNumberFil
	 */
	protected void serializeIp40004ErrorNumberFil(int ip40004ErrorNumberFil) {
		 putNumber(beginIp40004ErrorNumberFil,ip40004ErrorNumberFil,IP_40004_ERROR_NUMBER_FIL_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp40004ErrorNumberFilCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp40004ErrorNumberFil
	 */
   	protected  int serializeIp40004ErrorNumberFil(char[] value) {
	    int  ip40004ErrorNumberFil;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip40004ErrorNumberFil = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginIp40004ErrorNumberFil
		       ,4
		      );
		 localIp40004ErrorNumberFilCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip40004ErrorNumberFil;
    }

   protected int checkIp40004ErrorNumberFilMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp40004ErrorNumberFil is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp40004ErrorNumberFil() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp40004ErrorNumberFil
			                 ,IP_40004_ERROR_NUMBER_FIL_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip40004ErrorNumberFil", beginIp40004ErrorNumberFil,IP_40004_ERROR_NUMBER_FIL_LEN);
    }
   	}
     int localIp40004ErrorMsgNumberFilCounter = -1;
     public boolean isIp40004ErrorMsgNumberFilModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004ErrorMsgNumberFilCounter != sharedCounter;
         localIp40004ErrorMsgNumberFilCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip40004ErrorMsgNumberFil
	 *	@return ip40004ErrorMsgNumberFil
	 */
	public char[]  getIp40004ErrorMsgNumberFilString() {
	     return getCharArray(beginIp40004ErrorMsgNumberFil,IP_40004_ERROR_MSG_NUMBER_FIL_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip40004ErrorMsgNumberFilIsNumeric() {
	    return isNumeric(beginIp40004ErrorMsgNumberFil
	                    ,beginIp40004ErrorMsgNumberFil + IP_40004_ERROR_MSG_NUMBER_FIL_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_40004_ERROR_MSG_NUMBER_FIL_LEN = 4;
  	/**
	 * serializeIp40004ErrorMsgNumberFil
	 */
	protected void serializeIp40004ErrorMsgNumberFil(int ip40004ErrorMsgNumberFil) {
		 putNumber(beginIp40004ErrorMsgNumberFil,ip40004ErrorMsgNumberFil,IP_40004_ERROR_MSG_NUMBER_FIL_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp40004ErrorMsgNumberFilCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp40004ErrorMsgNumberFil
	 */
   	protected  int serializeIp40004ErrorMsgNumberFil(char[] value) {
	    int  ip40004ErrorMsgNumberFil;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip40004ErrorMsgNumberFil = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginIp40004ErrorMsgNumberFil
		       ,4
		      );
		 localIp40004ErrorMsgNumberFilCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip40004ErrorMsgNumberFil;
    }

   protected int checkIp40004ErrorMsgNumberFilMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp40004ErrorMsgNumberFil is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp40004ErrorMsgNumberFil() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp40004ErrorMsgNumberFil
			                 ,IP_40004_ERROR_MSG_NUMBER_FIL_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip40004ErrorMsgNumberFil", beginIp40004ErrorMsgNumberFil,IP_40004_ERROR_MSG_NUMBER_FIL_LEN);
    }
   	}
     int localIp40004IpmFieldTypeFilCounter = -1;
     public boolean isIp40004IpmFieldTypeFilModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004IpmFieldTypeFilCounter != sharedCounter;
         localIp40004IpmFieldTypeFilCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_40004_IPM_FIELD_TYPE_FIL_LEN = 1;
	/**
	 * 	serialize this Ip40004IpmFieldTypeFil
	 */
   protected void serializeIp40004IpmFieldTypeFil(char[] ip40004IpmFieldTypeFil) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip40004IpmFieldTypeFil,0,getStringValue(),beginIp40004IpmFieldTypeFil,IP_40004_IPM_FIELD_TYPE_FIL_LEN);
       localIp40004IpmFieldTypeFilCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp40004IpmFieldTypeFilConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp40004IpmFieldTypeFil is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp40004IpmFieldTypeFil() {	 
   		return (substring(getStringValue(),beginIp40004IpmFieldTypeFil,beginIp40004IpmFieldTypeFil + IP_40004_IPM_FIELD_TYPE_FIL_LEN));
   	}
         int localIp40004IpmFieldNumberFilCounter = -1;
         public boolean isIp40004IpmFieldNumberFilModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp40004IpmFieldNumberFilCounter != sharedCounter;
            localIp40004IpmFieldNumberFilCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_40004_IPM_FIELD_NUMBER_FIL_LEN = 4;
  	/**
	 * serializeIp40004IpmFieldNumberFil
	 */
	protected void serializeIp40004IpmFieldNumberFil(long ip40004IpmFieldNumberFil) {
           replaceValue( //  save the value as string
                   getBinaryString( ip40004IpmFieldNumberFil,IP_40004_IPM_FIELD_NUMBER_FIL_LEN)
                  ,beginIp40004IpmFieldNumberFil
                  ,IP_40004_IPM_FIELD_NUMBER_FIL_LEN
                 );
            localIp40004IpmFieldNumberFilCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkIp40004IpmFieldNumberFilMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp40004IpmFieldNumberFil is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp40004IpmFieldNumberFil() {	 
			return (getUnsignedInt(beginIp40004IpmFieldNumberFil));
   	}
         int localIp40004IpmSubfldNumberFilCounter = -1;
         public boolean isIp40004IpmSubfldNumberFilModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp40004IpmSubfldNumberFilCounter != sharedCounter;
            localIp40004IpmSubfldNumberFilCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_40004_IPM_SUBFLD_NUMBER_FIL_LEN = 4;
  	/**
	 * serializeIp40004IpmSubfldNumberFil
	 */
	protected void serializeIp40004IpmSubfldNumberFil(long ip40004IpmSubfldNumberFil) {
           replaceValue( //  save the value as string
                   getBinaryString( ip40004IpmSubfldNumberFil,IP_40004_IPM_SUBFLD_NUMBER_FIL_LEN)
                  ,beginIp40004IpmSubfldNumberFil
                  ,IP_40004_IPM_SUBFLD_NUMBER_FIL_LEN
                 );
            localIp40004IpmSubfldNumberFilCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkIp40004IpmSubfldNumberFilMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp40004IpmSubfldNumberFil is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp40004IpmSubfldNumberFil() {	 
			return (getUnsignedInt(beginIp40004IpmSubfldNumberFil));
   	}




}
  

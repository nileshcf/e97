package com.cloudframe.app.search2.dto.serialize;

/**
*  The class CodeCtrlSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CodeCtrlSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CodeCtrlSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CODE_CTRL_LENGTH = 17;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCodeValue;
            protected  int beginCodeToggle;
            protected  int beginCodeMarker;
	
	/**
	* Constructor for CodeCtrlSerialized
	**/
    public CodeCtrlSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CodeCtrlSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CodeCtrlSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CodeCtrlSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this CodeCtrlSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in CodeCtrlSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CODE_CTRL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCodeValue = getStartOffset() + 0;	// set offset for serialization
  
             beginCodeToggle = getStartOffset() + 4;	// set offset for serialization
  
             beginCodeMarker = getStartOffset() + 9;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localCodeValueCounter = -1;
         public boolean isCodeValueModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCodeValueCounter != sharedCounter;
            localCodeValueCounter = sharedCounter; return hasModified; 
         }
   protected static final int CODE_VALUE_LEN = 4;
  	/**
	 * serializeCodeValue
	 */
	protected void serializeCodeValue(long codeValue) {
           replaceValue( //  save the value as string
                   getBinaryString( codeValue,CODE_VALUE_LEN)
                  ,beginCodeValue
                  ,CODE_VALUE_LEN
                 );
            localCodeValueCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkCodeValueMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshCodeValue is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCodeValue() {	 
			return (getUnsignedInt(beginCodeValue));
   	}
         int localCodeToggleCounter = -1;
         public boolean isCodeToggleModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCodeToggleCounter != sharedCounter;
            localCodeToggleCounter = sharedCounter; return hasModified; 
         }
   protected static final int CODE_TOGGLE_LEN = 2;
  	/**
	 * serializeCodeToggle
	 */
	protected void serializeCodeToggle(int codeToggle) {
           replaceValue( //  save the value as string
                   getBinaryString( codeToggle,CODE_TOGGLE_LEN)
                  ,beginCodeToggle
                  ,CODE_TOGGLE_LEN
                 );
            localCodeToggleCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkCodeToggleMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCodeToggle is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCodeToggle() {	 
			return (getUnsignedShort(beginCodeToggle));
   	}
     int localCodeMarkerCounter = -1;
     public boolean isCodeMarkerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCodeMarkerCounter != sharedCounter;
         localCodeMarkerCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of codeMarker
	 *	@return codeMarker
	 */
	public char[]  getCodeMarkerString() {
	     return getCharArray(beginCodeMarker,CODE_MARKER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean codeMarkerIsNumeric() {
	    return isNumeric(beginCodeMarker
	                    ,beginCodeMarker + CODE_MARKER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CODE_MARKER_LEN = 8;
  	/**
	 * serializeCodeMarker
	 */
	protected void serializeCodeMarker(long codeMarker) {
		 putNumber(beginCodeMarker,codeMarker,CODE_MARKER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCodeMarkerCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCodeMarker
	 */
   	protected  long serializeCodeMarker(char[] value) {
	    long  codeMarker;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    codeMarker = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginCodeMarker
		       ,8
		      );
		 localCodeMarkerCounter = shareString.getSerializedField().getModifiedCounter();
		return  codeMarker;
    }

   protected long checkCodeMarkerMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCodeMarker is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCodeMarker() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCodeMarker
			                 ,CODE_MARKER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("codeMarker", beginCodeMarker,CODE_MARKER_LEN);
    }
   	}




}
  

package com.cloudframe.app.cfif01.dto.serialize;

/**
*  The class InitSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class InitSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(InitSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int INIT_LENGTH = 14;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDispNum;
            protected  int beginCharWs;
            protected  int beginChar1;
            protected  int beginIntWs;
            protected  int beginChar2;
	
	/**
	* Constructor for InitSerialized
	**/
    public InitSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for InitSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public InitSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this InitSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this InitSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in InitSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(INIT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDispNum = getStartOffset() + 0;	// set offset for serialization
  
             beginCharWs = getStartOffset() + 3;	// set offset for serialization
  
             beginChar1 = getStartOffset() + 4;	// set offset for serialization
  
             beginIntWs = getStartOffset() + 5;	// set offset for serialization
  
             beginChar2 = getStartOffset() + 9;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDispNumCounter = -1;
     public boolean isDispNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDispNumCounter != sharedCounter;
         localDispNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dispNum
	 *	@return dispNum
	 */
	public char[]  getDispNumString() {
	     return getCharArray(beginDispNum,DISP_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dispNumIsNumeric() {
	    return isNumeric(beginDispNum
	                    ,beginDispNum + DISP_NUM_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DISP_NUM_LEN = 3;
  	/**
	 * serializeDispNum
	 */
	protected void serializeDispNum(short dispNum) {
		 putNumber(beginDispNum,dispNum,DISP_NUM_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDispNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDispNum
	 */
   	protected  short serializeDispNum(char[] value) {
	    short  dispNum;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dispNum = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,true/*isSigned?*/)
		       ,beginDispNum
		       ,3
		      );
		 localDispNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  dispNum;
    }

   protected short checkDispNumMaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_1000/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshDispNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshDispNum() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginDispNum
			                 ,DISP_NUM_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dispNum", beginDispNum,DISP_NUM_LEN);
    }
   	}
     int localCharWsCounter = -1;
     public boolean isCharWsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCharWsCounter != sharedCounter;
         localCharWsCounter = sharedCounter; return hasModified;
     }
	protected static final int CHAR_WS_LEN = 1;
	/**
	 * 	serialize this CharWs
	 */
   protected void serializeCharWs(char[] charWs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(charWs,0,getStringValue(),beginCharWs,CHAR_WS_LEN);
       localCharWsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCharWsConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCharWs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCharWs() {	 
   		return (substring(getStringValue(),beginCharWs,beginCharWs + CHAR_WS_LEN));
   	}
     int localChar1Counter = -1;
     public boolean isChar1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChar1Counter != sharedCounter;
         localChar1Counter = sharedCounter; return hasModified;
     }
	protected static final int CHAR_1_LEN = 1;
	/**
	 * 	serialize this Char1
	 */
   protected void serializeChar1(char[] char1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(char1,0,getStringValue(),beginChar1,CHAR_1_LEN);
       localChar1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkChar1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshChar1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshChar1() {	 
   		return (substring(getStringValue(),beginChar1,beginChar1 + CHAR_1_LEN));
   	}
         int localIntWsCounter = -1;
         public boolean isIntWsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIntWsCounter != sharedCounter;
            localIntWsCounter = sharedCounter; return hasModified; 
         }
   protected static final int INT_WS_LEN = 4;
  	/**
	 * serializeIntWs
	 */
	protected void serializeIntWs(int intWs) {
           replaceValue( //  save the value as string
                   getBinaryString( intWs,INT_WS_LEN)
                  ,beginIntWs
                  ,INT_WS_LEN
                 );
            localIntWsCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIntWsMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIntWs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIntWs() {	 
			return (getInt(beginIntWs));
   	}
     int localChar2Counter = -1;
     public boolean isChar2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChar2Counter != sharedCounter;
         localChar2Counter = sharedCounter; return hasModified;
     }
	protected static final int CHAR_2_LEN = 5;
	/**
	 * 	serialize this Char2
	 */
   protected void serializeChar2(char[] char2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(char2,0,getStringValue(),beginChar2,CHAR_2_LEN);
       localChar2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkChar2Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshChar2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshChar2() {	 
   		return (substring(getStringValue(),beginChar2,beginChar2 + CHAR_2_LEN));
   	}




}
  

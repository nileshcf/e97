package com.cloudframe.app.search3.dto.serialize;

/**
*  The class TableEntrySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TableEntrySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TableEntrySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TABLE_ENTRY_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginVar1;
            protected  int beginVar2;
	
	/**
	* Constructor for TableEntrySerialized
	**/
    public TableEntrySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TableEntrySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TableEntrySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TableEntrySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this TableEntrySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in TableEntrySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TABLE_ENTRY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginVar1 = getStartOffset() + 0;	// set offset for serialization
  
             beginVar2 = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localVar1Counter = -1;
     public boolean isVar1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVar1Counter != sharedCounter;
         localVar1Counter = sharedCounter; return hasModified;
     }
	protected static final int VAR_1_LEN = 2;
	/**
	 * 	serialize this Var1
	 */
   protected void serializeVar1(char[] var1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(var1,0,getStringValue(),beginVar1,VAR_1_LEN);
       localVar1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkVar1Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshVar1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshVar1() {	 
   		return (substring(getStringValue(),beginVar1,beginVar1 + VAR_1_LEN));
   	}
     int localVar2Counter = -1;
     public boolean isVar2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVar2Counter != sharedCounter;
         localVar2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of var2
	 *	@return var2
	 */
	public char[]  getVar2String() {
	     return getCharArray(beginVar2,VAR_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean var2IsNumeric() {
	    return isNumeric(beginVar2
	                    ,beginVar2 + VAR_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VAR_2_LEN = 4;
  	/**
	 * serializeVar2
	 */
	protected void serializeVar2(int var2) {
		 putNumber(beginVar2,var2,VAR_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localVar2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeVar2
	 */
   	protected  int serializeVar2(char[] value) {
	    int  var2;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    var2 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginVar2
		       ,4
		      );
		 localVar2Counter = shareString.getSerializedField().getModifiedCounter();
		return  var2;
    }

   protected int checkVar2MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshVar2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshVar2() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginVar2
			                 ,VAR_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("var2", beginVar2,VAR_2_LEN);
    }
   	}




}
  

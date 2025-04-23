package com.cloudframe.app.ip200090.dto.serialize;

/**
*  The class SyntaxEditInfoEntry500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SyntaxEditInfoEntry500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SyntaxEditInfoEntry500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYNTAX_EDIT_INFO_ENTRY_500_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIsFieldShouldPresent500;
            protected  int beginAdditionalSyntaxChkInd500;
            protected  int beginEditModuleIndex500;
	
	/**
	* Constructor for SyntaxEditInfoEntry500Serialized
	**/
    public SyntaxEditInfoEntry500Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SyntaxEditInfoEntry500Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SyntaxEditInfoEntry500Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SyntaxEditInfoEntry500Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SyntaxEditInfoEntry500Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SyntaxEditInfoEntry500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYNTAX_EDIT_INFO_ENTRY_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIsFieldShouldPresent500 = getStartOffset() + 5;	// set offset for serialization
  
             beginAdditionalSyntaxChkInd500 = getStartOffset() + 6;	// set offset for serialization
  
             beginEditModuleIndex500 = getStartOffset() + 7;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIsFieldShouldPresent500Counter = -1;
     public boolean isIsFieldShouldPresent500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsFieldShouldPresent500Counter != sharedCounter;
         localIsFieldShouldPresent500Counter = sharedCounter; return hasModified;
     }
	protected static final int IS_FIELD_SHOULD_PRESENT_500_LEN = 1;
	/**
	 * 	serialize this IsFieldShouldPresent500
	 */
   protected void serializeIsFieldShouldPresent500(char[] isFieldShouldPresent500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(isFieldShouldPresent500,0,getStringValue(),beginIsFieldShouldPresent500,IS_FIELD_SHOULD_PRESENT_500_LEN);
       localIsFieldShouldPresent500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIsFieldShouldPresent500Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIsFieldShouldPresent500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIsFieldShouldPresent500() {	 
   		return (substring(getStringValue(),beginIsFieldShouldPresent500,beginIsFieldShouldPresent500 + IS_FIELD_SHOULD_PRESENT_500_LEN));
   	}
     int localAdditionalSyntaxChkInd500Counter = -1;
     public boolean isAdditionalSyntaxChkInd500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAdditionalSyntaxChkInd500Counter != sharedCounter;
         localAdditionalSyntaxChkInd500Counter = sharedCounter; return hasModified;
     }
	protected static final int ADDITIONAL_SYNTAX_CHK_IND_500_LEN = 1;
	/**
	 * 	serialize this AdditionalSyntaxChkInd500
	 */
   protected void serializeAdditionalSyntaxChkInd500(char[] additionalSyntaxChkInd500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(additionalSyntaxChkInd500,0,getStringValue(),beginAdditionalSyntaxChkInd500,ADDITIONAL_SYNTAX_CHK_IND_500_LEN);
       localAdditionalSyntaxChkInd500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAdditionalSyntaxChkInd500Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshAdditionalSyntaxChkInd500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAdditionalSyntaxChkInd500() {	 
   		return (substring(getStringValue(),beginAdditionalSyntaxChkInd500,beginAdditionalSyntaxChkInd500 + ADDITIONAL_SYNTAX_CHK_IND_500_LEN));
   	}
     int localEditModuleIndex500Counter = -1;
     public boolean isEditModuleIndex500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEditModuleIndex500Counter != sharedCounter;
         localEditModuleIndex500Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of editModuleIndex500
	 *	@return editModuleIndex500
	 */
	public char[]  getEditModuleIndex500String() {
	     return getCharArray(beginEditModuleIndex500,EDIT_MODULE_INDEX_500_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean editModuleIndex500IsNumeric() {
	    return isNumeric(beginEditModuleIndex500
	                    ,beginEditModuleIndex500 + EDIT_MODULE_INDEX_500_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EDIT_MODULE_INDEX_500_LEN = 1;
  	/**
	 * serializeEditModuleIndex500
	 */
	protected void serializeEditModuleIndex500(int editModuleIndex500) {
		 putNumber(beginEditModuleIndex500,editModuleIndex500,EDIT_MODULE_INDEX_500_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localEditModuleIndex500Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeEditModuleIndex500
	 */
   	protected  int serializeEditModuleIndex500(char[] value) {
	    int  editModuleIndex500;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    editModuleIndex500 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginEditModuleIndex500
		       ,1
		      );
		 localEditModuleIndex500Counter = shareString.getSerializedField().getModifiedCounter();
		return  editModuleIndex500;
    }

   protected int checkEditModuleIndex500MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshEditModuleIndex500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshEditModuleIndex500() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginEditModuleIndex500
			                 ,EDIT_MODULE_INDEX_500_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("editModuleIndex500", beginEditModuleIndex500,EDIT_MODULE_INDEX_500_LEN);
    }
   	}




}
  

package com.cloudframe.app.cfstring.dto.serialize;

/**
*  The class ExtActEffDtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ExtActEffDtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ExtActEffDtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EXT_ACT_EFF_DT_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSlashAct1;
            protected  int beginSlashAct2;
	
	/**
	* Constructor for ExtActEffDtSerialized
	**/
    public ExtActEffDtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ExtActEffDtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExtActEffDtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ExtActEffDtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,55); // serialize this field at offset 55 by default 
    }
    
	/**
	* sets parent for this ExtActEffDtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 55 by default
    }    
	/**
	* initializes the field in ExtActEffDtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EXT_ACT_EFF_DT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSlashAct1 = getStartOffset() + 2;	// set offset for serialization
  
             beginSlashAct2 = getStartOffset() + 5;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSlashAct1Counter = -1;
     public boolean isSlashAct1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSlashAct1Counter != sharedCounter;
         localSlashAct1Counter = sharedCounter; return hasModified;
     }
	protected static final int SLASH_ACT_1_LEN = 1;
	/**
	 * 	serialize this SlashAct1
	 */
   protected void serializeSlashAct1(char[] slashAct1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(slashAct1,0,getStringValue(),beginSlashAct1,SLASH_ACT_1_LEN);
       localSlashAct1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSlashAct1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSlashAct1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSlashAct1() {	 
   		return (substring(getStringValue(),beginSlashAct1,beginSlashAct1 + SLASH_ACT_1_LEN));
   	}
     int localSlashAct2Counter = -1;
     public boolean isSlashAct2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSlashAct2Counter != sharedCounter;
         localSlashAct2Counter = sharedCounter; return hasModified;
     }
	protected static final int SLASH_ACT_2_LEN = 1;
	/**
	 * 	serialize this SlashAct2
	 */
   protected void serializeSlashAct2(char[] slashAct2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(slashAct2,0,getStringValue(),beginSlashAct2,SLASH_ACT_2_LEN);
       localSlashAct2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSlashAct2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSlashAct2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSlashAct2() {	 
   		return (substring(getStringValue(),beginSlashAct2,beginSlashAct2 + SLASH_ACT_2_LEN));
   	}




}
  

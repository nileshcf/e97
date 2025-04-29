package com.cloudframe.app.cfstring.dto.serialize;

/**
*  The class ExtAuthUsersSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ExtAuthUsersSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ExtAuthUsersSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EXT_AUTH_USERS_LENGTH = 45;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginExtAuthUsrLname;
            protected  int beginExtAuthUsrFname;
	
	/**
	* Constructor for ExtAuthUsersSerialized
	**/
    public ExtAuthUsersSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ExtAuthUsersSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExtAuthUsersSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ExtAuthUsersSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,345); // serialize this field at offset 345 by default 
    }
    
	/**
	* sets parent for this ExtAuthUsersSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 345 by default
    }    
	/**
	* initializes the field in ExtAuthUsersSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EXT_AUTH_USERS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginExtAuthUsrLname = getStartOffset() + 0;	// set offset for serialization
  
             beginExtAuthUsrFname = getStartOffset() + 25;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localExtAuthUsrLnameCounter = -1;
     public boolean isExtAuthUsrLnameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtAuthUsrLnameCounter != sharedCounter;
         localExtAuthUsrLnameCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_AUTH_USR_LNAME_LEN = 25;
	/**
	 * 	serialize this ExtAuthUsrLname
	 */
   protected void serializeExtAuthUsrLname(char[] extAuthUsrLname) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extAuthUsrLname,0,getStringValue(),beginExtAuthUsrLname,EXT_AUTH_USR_LNAME_LEN);
       localExtAuthUsrLnameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtAuthUsrLnameConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshExtAuthUsrLname is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtAuthUsrLname() {	 
   		return (substring(getStringValue(),beginExtAuthUsrLname,beginExtAuthUsrLname + EXT_AUTH_USR_LNAME_LEN));
   	}
     int localExtAuthUsrFnameCounter = -1;
     public boolean isExtAuthUsrFnameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtAuthUsrFnameCounter != sharedCounter;
         localExtAuthUsrFnameCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_AUTH_USR_FNAME_LEN = 20;
	/**
	 * 	serialize this ExtAuthUsrFname
	 */
   protected void serializeExtAuthUsrFname(char[] extAuthUsrFname) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extAuthUsrFname,0,getStringValue(),beginExtAuthUsrFname,EXT_AUTH_USR_FNAME_LEN);
       localExtAuthUsrFnameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtAuthUsrFnameConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshExtAuthUsrFname is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtAuthUsrFname() {	 
   		return (substring(getStringValue(),beginExtAuthUsrFname,beginExtAuthUsrFname + EXT_AUTH_USR_FNAME_LEN));
   	}




}
  

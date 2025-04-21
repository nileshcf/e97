package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360FSurchrgFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class X360FSurchrgFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360FSurchrgFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_FSURCHRG_FIELDS_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360FSurchrgFreeCnt;
	
	/**
	* Constructor for X360FSurchrgFieldsSerialized
	**/
    public X360FSurchrgFieldsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360FSurchrgFieldsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FSurchrgFieldsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360FSurchrgFieldsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,219); // serialize this field at offset 219 by default 
    }
    
	/**
	* sets parent for this X360FSurchrgFieldsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 219 by default
    }    
	/**
	* initializes the field in X360FSurchrgFieldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_FSURCHRG_FIELDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360FSurchrgFreeCnt = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localX360FSurchrgFreeCntCounter = -1;
        public boolean isX360FSurchrgFreeCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FSurchrgFreeCntCounter != sharedCounter;
           localX360FSurchrgFreeCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FSurchrgFreeCntIsNumeric() {
	      return decimalIsNumeric(beginX360FSurchrgFreeCnt,X_360_FSURCHRG_FREE_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FSURCHRG_FREE_CNT_LEN = 5;
  	/**
	 * 	serializeX360FSurchrgFreeCnt
	 */
	protected void serializeX360FSurchrgFreeCnt(int x360FSurchrgFreeCnt) {
		   putDecimal(beginX360FSurchrgFreeCnt,x360FSurchrgFreeCnt,X_360_FSURCHRG_FREE_CNT_LEN,true);
   }
   

   protected int checkX360FSurchrgFreeCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FSurchrgFreeCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FSurchrgFreeCnt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FSurchrgFreeCnt,X_360_FSURCHRG_FREE_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FSurchrgFreeCnt", beginX360FSurchrgFreeCnt,X_360_FSURCHRG_FREE_CNT_LEN);
     }
   	}




}
  

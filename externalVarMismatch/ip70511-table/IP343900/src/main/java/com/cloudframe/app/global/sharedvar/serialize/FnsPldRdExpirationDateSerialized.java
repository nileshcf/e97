package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class FnsPldRdExpirationDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FnsPldRdExpirationDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FnsPldRdExpirationDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FNS_PLD_RD_EXPIRATION_DATE_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFnsPldRdExprMonth;
	
	/**
	* Constructor for FnsPldRdExpirationDateSerialized
	**/
    public FnsPldRdExpirationDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FnsPldRdExpirationDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPldRdExpirationDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FnsPldRdExpirationDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,87); // serialize this field at offset 87 by default 
    }
    
	/**
	* sets parent for this FnsPldRdExpirationDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 87 by default
    }    
	/**
	* initializes the field in FnsPldRdExpirationDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FNS_PLD_RD_EXPIRATION_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFnsPldRdExprMonth = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFnsPldRdExprMonthCounter = -1;
     public boolean isFnsPldRdExprMonthModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdExprMonthCounter != sharedCounter;
         localFnsPldRdExprMonthCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PLD_RD_EXPR_MONTH_LEN = 2;
	/**
	 * 	serialize this FnsPldRdExprMonth
	 */
   protected void serializeFnsPldRdExprMonth(char[] fnsPldRdExprMonth) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPldRdExprMonth,0,getStringValue(),beginFnsPldRdExprMonth,FNS_PLD_RD_EXPR_MONTH_LEN);
       localFnsPldRdExprMonthCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPldRdExprMonthConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFnsPldRdExprMonth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPldRdExprMonth() {	 
   		return (substring(getStringValue(),beginFnsPldRdExprMonth,beginFnsPldRdExprMonth + FNS_PLD_RD_EXPR_MONTH_LEN));
   	}




}
  

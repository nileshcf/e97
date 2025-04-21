package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class FnsPldRdExprYearSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FnsPldRdExprYearSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FnsPldRdExprYearSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FNS_PLD_RD_EXPR_YEAR_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFnsPldRdExprCc;
            protected  int beginFnsPldRdExprYy;
	
	/**
	* Constructor for FnsPldRdExprYearSerialized
	**/
    public FnsPldRdExprYearSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FnsPldRdExprYearSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPldRdExprYearSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FnsPldRdExprYearSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,89); // serialize this field at offset 89 by default 
    }
    
	/**
	* sets parent for this FnsPldRdExprYearSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 89 by default
    }    
	/**
	* initializes the field in FnsPldRdExprYearSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FNS_PLD_RD_EXPR_YEAR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFnsPldRdExprCc = getStartOffset() + 0;	// set offset for serialization
  
             beginFnsPldRdExprYy = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFnsPldRdExprCcCounter = -1;
     public boolean isFnsPldRdExprCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdExprCcCounter != sharedCounter;
         localFnsPldRdExprCcCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PLD_RD_EXPR_CC_LEN = 2;
	/**
	 * 	serialize this FnsPldRdExprCc
	 */
   protected void serializeFnsPldRdExprCc(char[] fnsPldRdExprCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPldRdExprCc,0,getStringValue(),beginFnsPldRdExprCc,FNS_PLD_RD_EXPR_CC_LEN);
       localFnsPldRdExprCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPldRdExprCcConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFnsPldRdExprCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPldRdExprCc() {	 
   		return (substring(getStringValue(),beginFnsPldRdExprCc,beginFnsPldRdExprCc + FNS_PLD_RD_EXPR_CC_LEN));
   	}
     int localFnsPldRdExprYyCounter = -1;
     public boolean isFnsPldRdExprYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdExprYyCounter != sharedCounter;
         localFnsPldRdExprYyCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PLD_RD_EXPR_YY_LEN = 2;
	/**
	 * 	serialize this FnsPldRdExprYy
	 */
   protected void serializeFnsPldRdExprYy(char[] fnsPldRdExprYy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPldRdExprYy,0,getStringValue(),beginFnsPldRdExprYy,FNS_PLD_RD_EXPR_YY_LEN);
       localFnsPldRdExprYyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPldRdExprYyConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFnsPldRdExprYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPldRdExprYy() {	 
   		return (substring(getStringValue(),beginFnsPldRdExprYy,beginFnsPldRdExprYy + FNS_PLD_RD_EXPR_YY_LEN));
   	}




}
  

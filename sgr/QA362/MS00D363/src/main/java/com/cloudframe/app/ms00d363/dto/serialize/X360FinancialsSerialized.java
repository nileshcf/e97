package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360FinancialsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class X360FinancialsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360FinancialsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_FINANCIALS_LENGTH = 364;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for X360FinancialsSerialized
	**/
    public X360FinancialsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360FinancialsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FinancialsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360FinancialsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,219); // serialize this field at offset 219 by default 
    }
    
	/**
	* sets parent for this X360FinancialsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 219 by default
    }    
	/**
	* initializes the field in X360FinancialsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_FINANCIALS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
	   /*  end of offset */
	}




}
  

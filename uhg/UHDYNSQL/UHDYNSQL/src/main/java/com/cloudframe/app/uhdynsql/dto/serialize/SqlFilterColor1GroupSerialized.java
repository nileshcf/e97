package com.cloudframe.app.uhdynsql.dto.serialize;

/**
*  The class SqlFilterColor1GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:15. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SqlFilterColor1GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SqlFilterColor1GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SQL_FILTER_COLOR_1_GROUP_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSqlFilterColor1;
	
	/**
	* Constructor for SqlFilterColor1GroupSerialized
	**/
    public SqlFilterColor1GroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SqlFilterColor1GroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SqlFilterColor1GroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SqlFilterColor1GroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SqlFilterColor1GroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SqlFilterColor1GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SQL_FILTER_COLOR_1_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSqlFilterColor1 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSqlFilterColor1Counter = -1;
     public boolean isSqlFilterColor1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlFilterColor1Counter != sharedCounter;
         localSqlFilterColor1Counter = sharedCounter; return hasModified;
     }
	protected static final int SQL_FILTER_COLOR_1_LEN = 6;
	/**
	 * 	serialize this SqlFilterColor1
	 */
   protected void serializeSqlFilterColor1(char[] sqlFilterColor1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlFilterColor1,0,getStringValue(),beginSqlFilterColor1,SQL_FILTER_COLOR_1_LEN);
       localSqlFilterColor1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlFilterColor1Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSqlFilterColor1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlFilterColor1() {	 
   		return (substring(getStringValue(),beginSqlFilterColor1,beginSqlFilterColor1 + SQL_FILTER_COLOR_1_LEN));
   	}




}
  

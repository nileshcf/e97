package com.cloudframe.app.uhdynsql.dto.serialize;

/**
*  The class SqlFilterColor2GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:58. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SqlFilterColor2GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SqlFilterColor2GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SQL_FILTER_COLOR_2_GROUP_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSqlFilterColor2;
	
	/**
	* Constructor for SqlFilterColor2GroupSerialized
	**/
    public SqlFilterColor2GroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SqlFilterColor2GroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SqlFilterColor2GroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SqlFilterColor2GroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,7); // serialize this field at offset 7 by default 
    }
    
	/**
	* sets parent for this SqlFilterColor2GroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 7 by default
    }    
	/**
	* initializes the field in SqlFilterColor2GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SQL_FILTER_COLOR_2_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSqlFilterColor2 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSqlFilterColor2Counter = -1;
     public boolean isSqlFilterColor2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlFilterColor2Counter != sharedCounter;
         localSqlFilterColor2Counter = sharedCounter; return hasModified;
     }
	protected static final int SQL_FILTER_COLOR_2_LEN = 6;
	/**
	 * 	serialize this SqlFilterColor2
	 */
   protected void serializeSqlFilterColor2(char[] sqlFilterColor2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlFilterColor2,0,getStringValue(),beginSqlFilterColor2,SQL_FILTER_COLOR_2_LEN);
       localSqlFilterColor2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlFilterColor2Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSqlFilterColor2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlFilterColor2() {	 
   		return (substring(getStringValue(),beginSqlFilterColor2,beginSqlFilterColor2 + SQL_FILTER_COLOR_2_LEN));
   	}




}
  

package com.cloudframe.app.uhdynsql.dto.serialize;

/**
*  The class SqlFilterSupplierGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SqlFilterSupplierGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SqlFilterSupplierGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SQL_FILTER_SUPPLIER_GROUP_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSqlFilterSupplier;
	
	/**
	* Constructor for SqlFilterSupplierGroupSerialized
	**/
    public SqlFilterSupplierGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SqlFilterSupplierGroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SqlFilterSupplierGroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SqlFilterSupplierGroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,14); // serialize this field at offset 14 by default 
    }
    
	/**
	* sets parent for this SqlFilterSupplierGroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 14 by default
    }    
	/**
	* initializes the field in SqlFilterSupplierGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SQL_FILTER_SUPPLIER_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSqlFilterSupplier = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSqlFilterSupplierCounter = -1;
     public boolean isSqlFilterSupplierModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlFilterSupplierCounter != sharedCounter;
         localSqlFilterSupplierCounter = sharedCounter; return hasModified;
     }
	protected static final int SQL_FILTER_SUPPLIER_LEN = 8;
	/**
	 * 	serialize this SqlFilterSupplier
	 */
   protected void serializeSqlFilterSupplier(char[] sqlFilterSupplier) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlFilterSupplier,0,getStringValue(),beginSqlFilterSupplier,SQL_FILTER_SUPPLIER_LEN);
       localSqlFilterSupplierCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlFilterSupplierConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSqlFilterSupplier is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlFilterSupplier() {	 
   		return (substring(getStringValue(),beginSqlFilterSupplier,beginSqlFilterSupplier + SQL_FILTER_SUPPLIER_LEN));
   	}




}
  

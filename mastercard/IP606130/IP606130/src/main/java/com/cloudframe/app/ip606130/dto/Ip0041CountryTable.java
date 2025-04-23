package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0041CountryTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


public class Ip0041CountryTable extends Ip0041CountryTableSerialized { 
   
      private List<char[]> ip0041Country; 

	
	/**
	* Constructor for Ip0041CountryTable
	**/
    public Ip0041CountryTable() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0041CountryTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0041CountryTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

    /**
	 *	Returns the value of ip0041Country
	 *  Corresponding COBOL Variable is IP0041-COUNTRY
	 *	@return ip0041Country
	 */
	public List<char[]> getIp0041Country() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < IP_0041_COUNTRY_SIZE;index++) {
        	list.add( getIp0041Country( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return ip0041Country
	 */
	public char[] getIp0041Country(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getIp0041Country(), resetting it to 0",index);
		    index = 0;
        } else if (index >= IP_0041_COUNTRY_SIZE) {
             	index = IP_0041_COUNTRY_SIZE -1; // can't exceed max array size
             	logger.trace("ip0041Country - Array index exceeded max Size {}, resetting it to max allowed",IP_0041_COUNTRY_SIZE); 
	    }
   	      return getCharArray( (beginIp0041Country + index*IP_0041_COUNTRY_LEN) , IP_0041_COUNTRY_LEN );
    }
    
    
   public int  ip0041CountryFieldLength() {
   	return IP_0041_COUNTRY_LEN;
   }
   
	

  
  	/**
	 *	Update Ip0041Country with the passed value at a given index
	 *  Corresponding COBOL Variable is IP0041-COUNTRY
	 *  @param index
	 *	@param value
	 */
  public void setIp0041Country(int index,char[] value) {
   	setIp0041Country(index,value,true);
   }
   
   
   /**
	 *	Update Ip0041Country with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setIp0041Country(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setIp0041Country(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 3)  {     
		       value = substring(value,0,3);
           }  else if (value.length < 3) {
		       value = pad(3, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(3).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeIp0041Country(index,value);		
       }
   }
   

	
	
	
	/**
	 * 	initializes Ip0041CountryTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         for (int index =0; index < IP_0041_COUNTRY_SIZE;index++) {
             setIp0041Country(index, CONSTANTS.SPACE_3);
         }
   }

		public static int getIp0041CountryTableFieldLength() {
			return IP_0041_COUNTRY_TABLE_LENGTH;
		}

}
  

package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0041RegionTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


public class Ip0041RegionTable extends Ip0041RegionTableSerialized { 
   
      private List<char[]> ip0041Region; 

	
	/**
	* Constructor for Ip0041RegionTable
	**/
    public Ip0041RegionTable() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0041RegionTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0041RegionTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

    /**
	 *	Returns the value of ip0041Region
	 *  Corresponding COBOL Variable is IP0041-REGION
	 *	@return ip0041Region
	 */
	public List<char[]> getIp0041Region() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < IP_0041_REGION_SIZE;index++) {
        	list.add( getIp0041Region( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return ip0041Region
	 */
	public char[] getIp0041Region(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getIp0041Region(), resetting it to 0",index);
		    index = 0;
        } else if (index >= IP_0041_REGION_SIZE) {
             	index = IP_0041_REGION_SIZE -1; // can't exceed max array size
             	logger.trace("ip0041Region - Array index exceeded max Size {}, resetting it to max allowed",IP_0041_REGION_SIZE); 
	    }
   	      return getCharArray( (beginIp0041Region + index*IP_0041_REGION_LEN) , IP_0041_REGION_LEN );
    }
    
    
   public int  ip0041RegionFieldLength() {
   	return IP_0041_REGION_LEN;
   }
   
	

  
  	/**
	 *	Update Ip0041Region with the passed value at a given index
	 *  Corresponding COBOL Variable is IP0041-REGION
	 *  @param index
	 *	@param value
	 */
  public void setIp0041Region(int index,char[] value) {
   	setIp0041Region(index,value,true);
   }
   
   
   /**
	 *	Update Ip0041Region with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setIp0041Region(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setIp0041Region(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 1)  {     
		       value = substring(value,0,1);
           }  else if (value.length < 1) {
		       value = pad(1, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(1).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeIp0041Region(index,value);		
       }
   }
   

	
	
	
	/**
	 * 	initializes Ip0041RegionTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         for (int index =0; index < IP_0041_REGION_SIZE;index++) {
             setIp0041Region(index, CONSTANTS.SPACE);
         }
   }

		public static int getIp0041RegionTableFieldLength() {
			return IP_0041_REGION_TABLE_LENGTH;
		}

}
  

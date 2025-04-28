package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip002102RecreateConvTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:04. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

            @Component("global_ip002102RecreateConvTable")

public class Ip002102RecreateConvTable extends Ip002102RecreateConvTableSerialized  implements InitializingBean {
   

								private int ip002102RowCount;
			private List<Ip002102TableData> ip002102TableData = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip002102RecreateConvTable
	**/
    public Ip002102RecreateConvTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_002102_TABLE_DATA_SIZE;arrayIndex++) {
						ip002102TableData.add(new Ip002102TableData(this, beginIp002102TableData + 
						arrayIndex * Ip002102TableData.getIp002102TableDataFieldLength()));
				}
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip002102RowCount
	 *	@return ip002102RowCount
	 */
	public int getIp002102RowCount() throws CFException {
        if (isIp002102RowCountModified()) { 
           ip002102RowCount = refreshIp002102RowCount();
        }
   		return ip002102RowCount;
	}
	
	/**
	 * 	Update Ip002102RowCount with the passed value
	 *  Corresponding COBOL Variable is IP002102-ROW-COUNT
	 *	@param number
	 */
	public void setIp002102RowCount(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip002102RowCount = checkIp002102RowCountMaxLimit(number); 
		serializeIp002102RowCount(ip002102RowCount);
	}


	public void setIp002102RowCount(long number) {
	    number = checkIp002102RowCountMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp002102RowCount((int)number);
	}
	
	/**
	 *	Returns the  value of ip002102TableData
	 *  Corresponding COBOL Variable is IP002102-TABLE-DATA
	 *	@return ip002102TableData
	 */
   public List<Ip002102TableData> getIp002102TableData() {
       return ip002102TableData;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip002102TableData
	 */
	public Ip002102TableData getIp002102TableData(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp002102TableData(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_002102_TABLE_DATA_SIZE) {
             	index = IP_002102_TABLE_DATA_SIZE -1; // can't exceed max array size
             	logger.trace("ip002102TableData - Array index exceeded max Size {}, resetting it to max allowed",IP_002102_TABLE_DATA_SIZE); 
	    }
		if (index >= ip002102TableData.size()) {
       		for (int fillIndex =  ip002102TableData.size() -1; fillIndex < index;fillIndex++) {
		       ip002102TableData.add(null);
		    }
			ip002102TableData.set(index,
			   	   	new Ip002102TableData(this,beginIp002102TableData + index * Ip002102TableData.getIp002102TableDataFieldLength()) 
				                        ); 	
		} 
   	   Ip002102TableData value = ip002102TableData.get(index);
   	   if (value == null) {
   	      ip002102TableData.set(index,
			   	   	new Ip002102TableData(this,beginIp002102TableData + index * Ip002102TableData.getIp002102TableDataFieldLength()) 
				                        ); 
		  value = ip002102TableData.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip002102TableData at index with the passed value
	 *  Corresponding COBOL Variable is IP002102-TABLE-DATA
	 *  @param index
	 *	@param value
	 */
  public void setIp002102TableData(int index,char[] value) {
   	getIp002102TableData(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Ip002102RecreateConvTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp002102RowCount(0);
     if (ip002102TableData.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_002102_TABLE_DATA_SIZE;index++) {
              Ip002102TableData  newElement = new Ip002102TableData(this,beginIp002102TableData + index * Ip002102TableData.getIp002102TableDataFieldLength());
              newElement.initialize();
               ip002102TableData.add(newElement);
          }
     } else {
        if (ip002102TableData.size() < IP_002102_TABLE_DATA_SIZE) {
          // prefill it first
          for (int index = ip002102TableData.size();index <  IP_002102_TABLE_DATA_SIZE;index++) {
              Ip002102TableData  newElement = new Ip002102TableData(this,beginIp002102TableData + index * Ip002102TableData.getIp002102TableDataFieldLength());
               ip002102TableData.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_002102_TABLE_DATA_SIZE;index++) {
     		Ip002102TableData ip002102TableDataVar = ip002102TableData.get(index);
 			if (ip002102TableDataVar == null) {
                ip002102TableDataVar = new Ip002102TableData(this,beginIp002102TableData + index * Ip002102TableData.getIp002102TableDataFieldLength());
                  ip002102TableData.set(index, ip002102TableDataVar);
			} 
			ip002102TableDataVar.initialize();
		}
     }
   }

		public static int getIp002102RecreateConvTableFieldLength() {
			return IP_002102_RECREATE_CONV_TABLE_LENGTH;
		}

}
  

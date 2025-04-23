package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip30331FinAddndmEntries is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:55. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

            @Component("global_ip30331FinAddndmEntries")

public class Ip30331FinAddndmEntries extends Ip30331FinAddndmEntriesSerialized  implements InitializingBean {
   

								private int ip30331Subscript;
			private List<Ip30331FaFileIdStatusTbl> ip30331FaFileIdStatusTbl = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip30331FinAddndmEntries
	**/
    public Ip30331FinAddndmEntries() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_30331_FA_FILE_ID_STATUS_TBL_SIZE;arrayIndex++) {
						ip30331FaFileIdStatusTbl.add(new Ip30331FaFileIdStatusTbl(this, beginIp30331FaFileIdStatusTbl + 
						arrayIndex * Ip30331FaFileIdStatusTbl.getIp30331FaFileIdStatusTblFieldLength()));
				}
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip30331Subscript
	 *	@return ip30331Subscript
	 */
	public int getIp30331Subscript() throws CFException {
        if (isIp30331SubscriptModified()) { 
           ip30331Subscript = refreshIp30331Subscript();
        }
   		return ip30331Subscript;
	}
	
	/**
	 * 	Update Ip30331Subscript with the passed value
	 *  Corresponding COBOL Variable is IP30331-SUBSCRIPT
	 *	@param number
	 */
	public void setIp30331Subscript(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip30331Subscript = checkIp30331SubscriptMaxLimit(number); 
		serializeIp30331Subscript(ip30331Subscript);
	}


	public void setIp30331Subscript(long number) {
	    number = checkIp30331SubscriptMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp30331Subscript((int)number);
	}
	
	/**
	 *	Returns the  value of ip30331FaFileIdStatusTbl
	 *  Corresponding COBOL Variable is IP30331-FA-FILE-ID-STATUS-TBL
	 *	@return ip30331FaFileIdStatusTbl
	 */
   public List<Ip30331FaFileIdStatusTbl> getIp30331FaFileIdStatusTbl() {
       return ip30331FaFileIdStatusTbl;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip30331FaFileIdStatusTbl
	 */
	public Ip30331FaFileIdStatusTbl getIp30331FaFileIdStatusTbl(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp30331FaFileIdStatusTbl(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_30331_FA_FILE_ID_STATUS_TBL_SIZE) {
             	index = IP_30331_FA_FILE_ID_STATUS_TBL_SIZE -1; // can't exceed max array size
             	logger.trace("ip30331FaFileIdStatusTbl - Array index exceeded max Size {}, resetting it to max allowed",IP_30331_FA_FILE_ID_STATUS_TBL_SIZE); 
	    }
		if (index >= ip30331FaFileIdStatusTbl.size()) {
       		for (int fillIndex =  ip30331FaFileIdStatusTbl.size() -1; fillIndex < index;fillIndex++) {
		       ip30331FaFileIdStatusTbl.add(null);
		    }
			ip30331FaFileIdStatusTbl.set(index,
			   	   	new Ip30331FaFileIdStatusTbl(this,beginIp30331FaFileIdStatusTbl + index * Ip30331FaFileIdStatusTbl.getIp30331FaFileIdStatusTblFieldLength()) 
				                        ); 	
		} 
   	   Ip30331FaFileIdStatusTbl value = ip30331FaFileIdStatusTbl.get(index);
   	   if (value == null) {
   	      ip30331FaFileIdStatusTbl.set(index,
			   	   	new Ip30331FaFileIdStatusTbl(this,beginIp30331FaFileIdStatusTbl + index * Ip30331FaFileIdStatusTbl.getIp30331FaFileIdStatusTblFieldLength()) 
				                        ); 
		  value = ip30331FaFileIdStatusTbl.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip30331FaFileIdStatusTbl at index with the passed value
	 *  Corresponding COBOL Variable is IP30331-FA-FILE-ID-STATUS-TBL
	 *  @param index
	 *	@param value
	 */
  public void setIp30331FaFileIdStatusTbl(int index,char[] value) {
   	getIp30331FaFileIdStatusTbl(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Ip30331FinAddndmEntries
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp30331Subscript(0);
     if (ip30331FaFileIdStatusTbl.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_30331_FA_FILE_ID_STATUS_TBL_SIZE;index++) {
              Ip30331FaFileIdStatusTbl  newElement = new Ip30331FaFileIdStatusTbl(this,beginIp30331FaFileIdStatusTbl + index * Ip30331FaFileIdStatusTbl.getIp30331FaFileIdStatusTblFieldLength());
              newElement.initialize();
               ip30331FaFileIdStatusTbl.add(newElement);
          }
     } else {
        if (ip30331FaFileIdStatusTbl.size() < IP_30331_FA_FILE_ID_STATUS_TBL_SIZE) {
          // prefill it first
          for (int index = ip30331FaFileIdStatusTbl.size();index <  IP_30331_FA_FILE_ID_STATUS_TBL_SIZE;index++) {
              Ip30331FaFileIdStatusTbl  newElement = new Ip30331FaFileIdStatusTbl(this,beginIp30331FaFileIdStatusTbl + index * Ip30331FaFileIdStatusTbl.getIp30331FaFileIdStatusTblFieldLength());
               ip30331FaFileIdStatusTbl.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_30331_FA_FILE_ID_STATUS_TBL_SIZE;index++) {
     		Ip30331FaFileIdStatusTbl ip30331FaFileIdStatusTblVar = ip30331FaFileIdStatusTbl.get(index);
 			if (ip30331FaFileIdStatusTblVar == null) {
                ip30331FaFileIdStatusTblVar = new Ip30331FaFileIdStatusTbl(this,beginIp30331FaFileIdStatusTbl + index * Ip30331FaFileIdStatusTbl.getIp30331FaFileIdStatusTblFieldLength());
                  ip30331FaFileIdStatusTbl.set(index, ip30331FaFileIdStatusTblVar);
			} 
			ip30331FaFileIdStatusTblVar.initialize();
		}
     }
   }

		public static int getIp30331FinAddndmEntriesFieldLength() {
			return IP_30331_FIN_ADDNDM_ENTRIES_LENGTH;
		}

}
  

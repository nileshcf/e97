package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00321EditListRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;

            @Component("global_ip00321EditListRec")

public class Ip00321EditListRec extends Ip00321EditListRecSerialized  implements InitializingBean {
   
			private List<Ip00321EditListEntry> ip00321EditListEntry = new ArrayList<>();
    	

								private long ip00321EditNbr;
				private Ip00321CurrEditInfo ip00321CurrEditInfo = new Ip00321CurrEditInfo();
	
	/**
	* Constructor for Ip00321EditListRec
	**/
    public Ip00321EditListRec() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_00321_EDIT_LIST_ENTRY_SIZE;arrayIndex++) {
						ip00321EditListEntry.add(new Ip00321EditListEntry(this, beginIp00321EditListEntry + 
						arrayIndex * Ip00321EditListEntry.getIp00321EditListEntryFieldLength()));
				}
	       			ip00321CurrEditInfo.setParent(this,getStartOffset() + 176004);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the  value of ip00321EditListEntry
	 *  Corresponding COBOL Variable is IP00321-EDIT-LIST-ENTRY
	 *	@return ip00321EditListEntry
	 */
   public List<Ip00321EditListEntry> getIp00321EditListEntry() {
       return ip00321EditListEntry;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip00321EditListEntry
	 */
	public Ip00321EditListEntry getIp00321EditListEntry(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp00321EditListEntry(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_00321_EDIT_LIST_ENTRY_SIZE) {
             	index = IP_00321_EDIT_LIST_ENTRY_SIZE -1; // can't exceed max array size
             	logger.trace("ip00321EditListEntry - Array index exceeded max Size {}, resetting it to max allowed",IP_00321_EDIT_LIST_ENTRY_SIZE); 
	    }
		if (index >= ip00321EditListEntry.size()) {
       		for (int fillIndex =  ip00321EditListEntry.size() -1; fillIndex < index;fillIndex++) {
		       ip00321EditListEntry.add(null);
		    }
			ip00321EditListEntry.set(index,
			   	   	new Ip00321EditListEntry(this,beginIp00321EditListEntry + index * Ip00321EditListEntry.getIp00321EditListEntryFieldLength()) 
				                        ); 	
		} 
   	   Ip00321EditListEntry value = ip00321EditListEntry.get(index);
   	   if (value == null) {
   	      ip00321EditListEntry.set(index,
			   	   	new Ip00321EditListEntry(this,beginIp00321EditListEntry + index * Ip00321EditListEntry.getIp00321EditListEntryFieldLength()) 
				                        ); 
		  value = ip00321EditListEntry.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip00321EditListEntry at index with the passed value
	 *  Corresponding COBOL Variable is IP00321-EDIT-LIST-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setIp00321EditListEntry(int index,char[] value) {
   	getIp00321EditListEntry(index).setString(value);
   }
   
	
	/**
	 *	Returns the value of ip00321EditNbr
	 *	@return ip00321EditNbr
	 */
	public long getIp00321EditNbr() throws CFException {
        if (isIp00321EditNbrModified()) { 
           ip00321EditNbr = refreshIp00321EditNbr();
        }
   		return ip00321EditNbr;
	}
	
	/**
	 * 	Update Ip00321EditNbr with the passed value
	 *  Corresponding COBOL Variable is IP00321-EDIT-NBR
	 *	@param number
	 */
	public void setIp00321EditNbr(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip00321EditNbr = checkIp00321EditNbrMaxLimit(number); 
		serializeIp00321EditNbr(ip00321EditNbr);
	}


	/**
	 *	Returns the value of ip00321CurrEditInfo
	 *	@return ip00321CurrEditInfo
	 */   
	 public Ip00321CurrEditInfo getIp00321CurrEditInfo() {
   	return ip00321CurrEditInfo;
   }
   /**
	* 	Update Ip00321CurrEditInfo with the passed value
	*   Corresponding COBOL Variable is IP00321-CURR-EDIT-INFO
	*	@param value
	*/
   public void setIp00321CurrEditInfo(char[] value) {
      ip00321CurrEditInfo.setString(value); 
   }   
    
     /**
	 * 	Update Ip00321CurrEditInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00321CurrEditInfo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00321CurrEditInfo.begin,ip00321CurrEditInfo.length());
   }
   
     /**
	 * 	Update Ip00321CurrEditInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00321CurrEditInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00321CurrEditInfo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00321CurrEditInfo with another Field
	 *	@param value
	 */
   public void setIp00321CurrEditInfo(Field source) {
   	replace(source,0,source.length(),ip00321CurrEditInfo.begin,ip00321CurrEditInfo.length());
   }  
   
     /**
	 * 	Update Ip00321CurrEditInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00321CurrEditInfo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00321CurrEditInfo.begin,ip00321CurrEditInfo.length());
   }
   
     /**
	 * 	Update Ip00321CurrEditInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00321CurrEditInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00321CurrEditInfo.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip00321EditListRec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip00321EditListEntry.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_00321_EDIT_LIST_ENTRY_SIZE;index++) {
              Ip00321EditListEntry  newElement = new Ip00321EditListEntry(this,beginIp00321EditListEntry + index * Ip00321EditListEntry.getIp00321EditListEntryFieldLength());
              newElement.initialize();
               ip00321EditListEntry.add(newElement);
          }
     } else {
        if (ip00321EditListEntry.size() < IP_00321_EDIT_LIST_ENTRY_SIZE) {
          // prefill it first
          for (int index = ip00321EditListEntry.size();index <  IP_00321_EDIT_LIST_ENTRY_SIZE;index++) {
              Ip00321EditListEntry  newElement = new Ip00321EditListEntry(this,beginIp00321EditListEntry + index * Ip00321EditListEntry.getIp00321EditListEntryFieldLength());
               ip00321EditListEntry.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_00321_EDIT_LIST_ENTRY_SIZE;index++) {
     		Ip00321EditListEntry ip00321EditListEntryVar = ip00321EditListEntry.get(index);
 			if (ip00321EditListEntryVar == null) {
                ip00321EditListEntryVar = new Ip00321EditListEntry(this,beginIp00321EditListEntry + index * Ip00321EditListEntry.getIp00321EditListEntryFieldLength());
                  ip00321EditListEntry.set(index, ip00321EditListEntryVar);
			} 
			ip00321EditListEntryVar.initialize();
		}
     }
                     setIp00321EditNbr(0);
          ip00321CurrEditInfo.initialize();
     
   }

		public static int getIp00321EditListRecFieldLength() {
			return IP_00321_EDIT_LIST_REC_LENGTH;
		}

}
  
